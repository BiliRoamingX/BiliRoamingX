@file:JvmName("KtUtils")
@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.utils

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.graphics.Color
import android.util.Base64
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.preference.Preference
import androidx.preference.PreferenceManager
import app.revanced.bilibili.meta.CookieInfo
import com.google.protobuf.GeneratedMessageLite
import com.google.protobuf.GeneratedMessageLiteEx
import com.google.protobuf.UnknownFieldSetLite
import org.json.JSONObject
import java.io.File
import java.io.InputStream
import java.io.Reader
import java.io.StringWriter
import java.lang.reflect.Field
import java.lang.reflect.Proxy
import java.net.URL
import java.util.TreeMap
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import kotlin.math.roundToInt

@get:JvmName("sp2px")
val Int.sp: Int
    inline get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        toFloat(),
        Utils.getContext().resources.displayMetrics
    ).roundToInt()

@get:JvmName("dp2px")
val Int.dp: Int
    inline get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        toFloat(),
        Utils.getContext().resources.displayMetrics
    ).roundToInt()

operator fun ViewGroup.iterator(): MutableIterator<View> = object : MutableIterator<View> {
    private var index = 0
    override fun hasNext() = index < childCount
    override fun next() = getChildAt(index++) ?: throw IndexOutOfBoundsException()
    override fun remove() = removeViewAt(--index)
}

val ViewGroup.children: Sequence<View>
    get() = object : Sequence<View> {
        override fun iterator() = this@children.iterator()
    }

inline fun View.setRippleBackground() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    setBackgroundResource(resourceId)
}

@SuppressLint("UseCompatLoadingForDrawables")
inline fun View.setRippleForeground() = with(TypedValue()) {
    context.theme.resolveAttribute(android.R.attr.selectableItemBackground, this, true)
    foreground = context.getDrawable(resourceId)
}

@JvmOverloads
inline fun Context.inflateLayout(
    resIdName: String,
    root: ViewGroup? = null,
    attachToRoot: Boolean = root != null
): View {
    val resource = Utils.getResId(resIdName, "layout")
    return LayoutInflater.from(this).inflate(resource, root, attachToRoot)
}

inline fun <T : View> View.findViewByIdName(idName: String): T =
    findViewById(Utils.getResId(idName, "id"))

@JvmOverloads
inline fun Int.toHexColor(alpha: Boolean = true) = if (alpha)
    "%08X".format(0xFFFFFFFF.toInt() and this)
else "%06X".format(0xFFFFFF and this)

@ColorInt
@JvmOverloads
inline fun String.toIntColor(error: Int = Color.BLACK): Int = try {
    Color.parseColor(if (startsWith('#')) this else "#$this")
} catch (_: IllegalArgumentException) {
    error
}

@SuppressLint("ApplySharedPref")
inline fun SharedPreferences.edit(
    commit: Boolean = false,
    action: SharedPreferences.Editor.() -> Unit
) = edit().apply(action).run { if (commit) commit() else apply() }

fun Reader.readTextX(): String = use {
    val buffer = StringWriter()
    val charBuffer = CharArray(DEFAULT_BUFFER_SIZE)
    var chars = it.read(charBuffer)
    while (chars >= 0) {
        buffer.write(charBuffer, 0, chars)
        chars = it.read(charBuffer)
    }
    buffer.toString()
}

fun getStreamContent(input: InputStream) = try {
    input.bufferedReader().readTextX()
} catch (e: Throwable) {
    LogHelper.error({ "get stream content failed" }, e)
    null
}

fun fetchJson(url: String) = try {
    JSONObject(URL(url).readText())
} catch (_: Throwable) {
    null
}

enum class Area(@JvmField val value: String) {
    CN("cn"), HK("hk"), TW("tw"), TH("th"), GLOBAL("global");

    override fun toString() = value

    companion object {
        @JvmStatic
        fun of(value: String?) = when (value) {
            CN.value -> CN
            HK.value -> HK
            TW.value -> TW
            TH.value -> TH
            GLOBAL.value -> GLOBAL
            else -> error("invalid area value: $value")
        }
    }
}

val countryTask: Future<Area> by lazy {
    Utils.submitTask {
        when (fetchJson(Constants.ZONE_URL)?.optJSONObject("data")?.optInt("country_code") ?: 0) {
            86 -> Area.CN
            852, 853 -> Area.HK
            886 -> Area.TW
            else -> Area.GLOBAL
        }.also { LogHelper.debug { "当前地区: $it" } }
    }
}

val country: Area?
    get() = try {
        countryTask.get(5L, TimeUnit.SECONDS)
    } catch (_: Throwable) {
        null
    }

@Suppress("DEPRECATION")
val versionName: String by lazy {
    Utils.getContext().packageManager.getPackageInfo(Utils.getContext().packageName, 0).versionName
}

@Suppress("DEPRECATION")
val versionCode by lazy {
    Utils.getContext().packageManager.getPackageInfo(Utils.getContext().packageName, 0).versionCode
}

inline fun <T, R> T.runCatchingOrNull(block: T.() -> R?) = try {
    block()
} catch (e: Throwable) {
    null
}

fun Preference.onClick(onClick: (Preference) -> Boolean) {
    val clickListenerField = Reflex.findFieldIfExists(Preference::class.java, "mOnClickListener")
        ?: return
    val proxy = Proxy.newProxyInstance(
        javaClass.classLoader,
        arrayOf(clickListenerField.type)
    ) { _, _, args ->
        val preference = args[0] as Preference
        onClick(preference)
    }
    clickListenerField.set(this, proxy)
}

fun Preference.onChange(onChange: (preference: Preference, newValue: Any?) -> Boolean) {
    val changeListenerField = Reflex.findFieldIfExists(Preference::class.java, "mOnChangeListener")
        ?: return
    val proxy = Proxy.newProxyInstance(
        javaClass.classLoader,
        arrayOf(changeListenerField.type)
    ) { _, _, args ->
        val preference = args[0] as Preference
        val newValue = args[1]
        onChange(preference, newValue)
    }
    changeListenerField.set(this, proxy)
}

private val onPreferenceTreeClickListenerField by lazy { retrieveOnPreferenceTreeClickListenerField() }

private fun retrieveOnPreferenceTreeClickListenerField(): Field? {
    return PreferenceManager::class.java.declaredFields.find { f ->
        f.type.isInterface && f.type.declaredMethods.let {
            it.size == 1 && it[0].returnType == Boolean::class.javaPrimitiveType && it[0].parameterTypes.let { ts ->
                ts.size == 1 && ts[0] == Preference::class.java
            }
        }
    }.also { it?.isAccessible = true }
}

fun PreferenceManager.onPreferenceTreeClick(action: ((Preference) -> Boolean)?) {
    val field = onPreferenceTreeClickListenerField ?: return
    if (action == null) {
        field.set(this, null)
        return
    }
    val proxy = Proxy.newProxyInstance(
        javaClass.classLoader,
        arrayOf(field.type)
    ) { _, _, args ->
        val preference = args[0] as Preference
        action(preference)
    }
    field.set(this, proxy)
}

fun signQuery(query: String?, extraMap: Map<String, String> = emptyMap()): String? {
    query ?: return null
    val queryMap = query.split('&')
        .map { it.split('=', limit = 2) }
        .filter { it.size == 2 }
        .associate { Pair(it[0], it[1]) }
    return signQuery(queryMap, extraMap)
}

fun signQuery(query: Map<String, String>, extraMap: Map<String, String> = emptyMap()): String {
    val queryMap = TreeMap<String, String>()
    queryMap.putAll(query)
    queryMap["appkey"] = Utils.getAppKey()
    queryMap["build"] = versionCode.toString()
    queryMap["device"] = "android"
    queryMap["mobi_app"] = Utils.getMobiApp()
    queryMap["platform"] = "android"
    queryMap.putAll(extraMap)
    queryMap.remove("ts")
    queryMap.remove("sign")
    return Utils.signQuery(queryMap)
}

val logFile by lazy { File(Utils.getContext().externalCacheDir, "log.txt") }

val oldLogFile by lazy { File(Utils.getContext().externalCacheDir, "old_log.txt") }

fun checkErrorToast(json: JSONObject, isCustomServer: Boolean = false) {
    if (json.optInt("code", -1) != 0) {
        Toasts.showShort(
            (if (isCustomServer) "请求解析服务器发生错误: " else "请求发生错误: ")
                    + json.optString("message", "未知错误")
        )
    }
}

val cachePrefs: SharedPreferences by lazy {
    Utils.getContext().getSharedPreferences("biliroaming_cache", Context.MODE_PRIVATE)
}

val abPrefs by lazy {
    val abPath = "prod/blconfig/ab.sp"
    val file = File(Utils.getContext().getDir("foundation", Context.MODE_PRIVATE), abPath)
    Utils.blkvPrefsByFile(file, true)
}

val blkvPrefs by lazy {
    Utils.blkvPrefsByName("instance.bili_preference", true)
}

val accountPrefs by lazy {
    val accountDir = Utils.getContext().getDir("account", Context.MODE_PRIVATE)
    Utils.blkvPrefsByFile(File(accountDir, "controller.blkv"), true)
}

@JvmOverloads
fun setClipboardContent(label: String = "", content: CharSequence) {
    val clipboardManager = Utils.getContext().getSystemService(ClipboardManager::class.java)
    val clipData = ClipData.newPlainText(label, content)
    clipboardManager.setPrimaryClip(clipData)
}

fun newAny(typeUrl: String, message: GeneratedMessageLite<*, *>): com.google.protobuf.Any =
    com.google.protobuf.Any.newBuilder()
        .setTypeUrl(typeUrl)
        .setValue(message.toByteString())
        .build()

inline fun GeneratedMessageLite<*, *>.setUnknownFields(unknownFields: UnknownFieldSetLite) {
    GeneratedMessageLiteEx.setUnknownFields(this, unknownFields)
}

val cookieInfo get() = if (Utils.isLogin()) cookieInfoCache else null

val cookieSESSDATA get() = cookieInfo?.cookies?.find { it.name == "SESSDATA" }?.value.orEmpty()
val cookieBiliJct get() = cookieInfo?.cookies?.find { it.name == "bili_jct" }?.value.orEmpty()

private val cookieInfoCache by lazy {
    val cookieFile = File(Utils.getContext().filesDir, "bili.account.storage")
    val currentAccount = accountPrefs.getString("current_account", "").orEmpty()
    runCatching {
        val cookie = if (currentAccount.isNotEmpty()) {
            currentAccount.toJSONObject().optString("cookie")
        } else if (cookieFile.isFile) {
            cookieFile.bufferedReader().readTextX()
        } else null
        if (cookie != null) {
            Base64.decode(cookie, Base64.NO_WRAP).toString(Charsets.UTF_8).toJSONObject()
                .optJSONArray("cookies")?.asSequence<JSONObject>().orEmpty()
                .map { CookieInfo.CookieBean(it.optString("name"), it.optString("value")) }
                .toList().let { CookieInfo(it) }
        } else null
    }.getOrNull()
}

val defaultUA = "Mozilla/5.0 BiliDroid/$versionName (bbcallen@gmail.com)"

@JvmOverloads
@Suppress("DEPRECATION")
fun sigMd5(packageName: String = Utils.getContext().packageName): String {
    return Utils.getContext().packageManager
        .getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
        .signatures.first().toByteArray().md5Hex
}

fun Long.cnCountFormat(invalid: String = "-"): String {
    if (this >= 100000000) {
        val count = toFloat() / 100000000
        val oneMod = count % 1
        if (oneMod < 0.95 && oneMod > 0.049)
            return "%.1f亿".format(count)
        return "%.0f亿".format(count)
    } else if (this >= 99999500) {
        return "1亿"
    } else if (this < 10000) {
        return if (this > 0) toString() else invalid
    } else {
        val count = toFloat() / 10000
        val oneMod = count % 1
        if (count > 1000)
            return "%d万".format(count.toInt())
        if (oneMod < 0.95 && oneMod > 0.049)
            return "%.1f万".format(count)
        return "%.0f万".format(count)
    }
}
