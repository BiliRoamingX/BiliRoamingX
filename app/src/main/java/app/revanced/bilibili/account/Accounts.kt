package app.revanced.bilibili.account

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Process
import android.util.Base64
import app.revanced.bilibili.account.model.*
import app.revanced.bilibili.utils.*
import org.json.JSONObject
import java.io.File
import java.io.RandomAccessFile
import java.nio.channels.FileChannel

object Accounts {

    @JvmStatic
    private val accountPrefs by lazy {
        val accountDir = Utils.getContext().getDir("account", Context.MODE_PRIVATE)
        Utils.blkvPrefsByFile(File(accountDir, "controller.blkv"), true)
    }

    @JvmStatic
    private val accountMigrated get() = accountPrefs.getInt("account_migrate", 0) == 1

    @JvmStatic
    @Volatile
    private var accountCache: Account? = null

    @JvmStatic
    @Volatile
    private var accountInfoCache: AccountInfo? = null

    @JvmStatic
    val cookieSESSDATA get() = get()?.cookie?.cookies?.find { it.name == "SESSDATA" }?.value.orEmpty()

    @JvmStatic
    val cookieBiliJct get() = get()?.cookie?.cookies?.find { it.name == "bili_jct" }?.value.orEmpty()

    @JvmStatic
    val accessKey get() = get()?.token?.accessKey.orEmpty()

    @JvmStatic
    val mid get() = get()?.token?.mid ?: 0L

    @JvmStatic
    val isLogin get() = get() != null

    @JvmStatic
    val isEffectiveVip get() = getInfo()?.vipInfo?.isEffectiveVip ?: false

    @JvmStatic
    fun get(): Account? {
        if (accountCache == null) {
            synchronized(this) {
                if (accountCache == null) {
                    accountCache = readAccount()
                }
            }
        }
        return accountCache
    }

    @JvmStatic
    fun getInfo(): AccountInfo? {
        val mid = mid
        if (mid == 0L) return null
        if (accountInfoCache == null) {
            synchronized(this) {
                if (accountInfoCache == null) {
                    accountInfoCache = readAccountInfo(mid)
                }
            }
        }
        return accountInfoCache
    }

    @JvmStatic
    private fun readAccount(): Account? {
        val passportFile = File(Utils.getContext().filesDir, "bili.passport.storage")
        val cookieFile = File(Utils.getContext().filesDir, "bili.account.storage")
        val currentAccount = accountPrefs.getString("current_account", "").orEmpty()
        return runCatching {
            val accountJson = currentAccount.ifEmpty { null }?.toJSONObject()
            val account = if (accountMigrated) {
                accountJson?.optString("token")
            } else if (passportFile.isFile) {
                passportFile.fastReadToString()
            } else null
            val cookie = if (accountMigrated) {
                accountJson?.optString("cookie")
            } else if (cookieFile.isFile) {
                cookieFile.fastReadToString()
            } else null
            if (!account.isNullOrEmpty() && !cookie.isNullOrEmpty()) {
                val accountInfo = biliAesDecrypt(Base64.decode(account, Base64.NO_WRAP))
                    .toString(Charsets.UTF_8).toJSONObject().run {
                        AccessToken(
                            optString("access_token"),
                            optLong("expires"),
                            optLong("expires_in"),
                            optString("fast_login_token"),
                            optLong("mid"),
                            optString("refresh_token")
                        )
                    }
                val cookieInfo = Base64.decode(cookie, Base64.NO_WRAP).toString(Charsets.UTF_8)
                    .toJSONObject().optJSONArray("cookies")?.asSequence<JSONObject>().orEmpty()
                    .map { CookieInfo.CookieBean(it.optString("name"), it.optString("value")) }
                    .toList().let { CookieInfo(it) }
                Account(accountInfo, cookieInfo)
            } else null
        }.onFailure {
            LogHelper.error({ "Accounts, failed to read account" }, it)
        }.getOrNull()
    }

    @JvmStatic
    private fun File.fastReadToString(): String {
        return RandomAccessFile(this, "r").use { file ->
            val channel = file.channel
            val length = file.length()
            channel.lock(0L, length, true).use {
                val buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, length)
                ByteArray(length.toInt()).apply { buffer.get(this) }.toString(Charsets.UTF_8)
            }
        }
    }

    @JvmStatic
    private fun readAccountInfo(mid: Long) = runCatching {
        val infoKey = "info$mid"
        val context = Utils.getContext()
        (runCatchingOrNull {
            val resolver = context.contentResolver
            val uri = Uri.parse("content://${context.packageName}.provider.auth")
            val cursor = resolver.query(uri, null, null, arrayOf(infoKey), null)
            if (cursor != null && cursor.moveToFirst())
                cursor.use { it.getString(0) }
            else null
        } ?: context.getSharedPreferences("bili.passport.auth", Context.MODE_PRIVATE)
            .getString(infoKey, "")).toJSONObject().run {
            AccountInfo().apply {
                vipInfo = VipUserInfo().apply {
                    optJSONObject("vip")?.run {
                        vipStatus = optInt("status")
                        vipType = optInt("type")
                    }
                }
            }
        }
    }.onFailure {
        LogHelper.error({ "Accounts, failed to read account info" }, it)
    }.getOrNull()

    @JvmStatic
    fun refresh(action: Int) {
        val isSignOut = action == PassportChangeReceiver.ACTION_SIGN_OUT
        val isUpdateAccount = action == PassportChangeReceiver.ACTION_UPDATE_ACCOUNT
        if (isSignOut) {
            accountCache = null
            accountInfoCache = null
        } else if (!isUpdateAccount) {
            accountCache = null
            Utils.async { get() }
        } else {
            accountInfoCache = null
            Utils.async { getInfo() }
        }
    }
}

class PassportChangeReceiver : BroadcastReceiver() {

    companion object {
        const val ACTION = "com.bilibili.passport.ACTION_MSG"
        const val ACTION_SIGN_OUT = 2
        const val ACTION_UPDATE_ACCOUNT = 5
        private const val EXTRA_WHAT = "com.bilibili.passport.what"
        private const val EXTRA_PID = "com.bilibili.passport.pid"
        private const val EXTRA_UID = "com.bilibili.passport.uid"
    }

    override fun onReceive(context: Context, intent: Intent) {
        // 1 SignIn, 2 SignOut, 4 RefreshToken, 5 UpdateAccount, 6 SwitchAccount
        val what = intent.getIntExtra(EXTRA_WHAT, 0)
        val pid = intent.getIntExtra(EXTRA_PID, 0)
        val uid = intent.getIntExtra(EXTRA_UID, 0)
        LogHelper.debug { "Accounts, passport changed, what: $what, pid: $pid, receiver pname: ${Utils.currentProcessName()}" }
        if (uid == Process.myUid())
            Accounts.refresh(what)
    }
}
