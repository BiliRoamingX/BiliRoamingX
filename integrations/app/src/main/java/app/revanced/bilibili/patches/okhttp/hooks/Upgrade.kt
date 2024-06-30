package app.revanced.bilibili.patches.okhttp.hooks

import android.content.pm.PackageManager
import app.revanced.bilibili.integrations.BuildConfig
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONArray
import org.json.JSONObject
import java.net.URL

/**
 * versionSum format: "$version $versionCode $patchVersion $patchVersionCode $sn $size $md5 publishTime"
 *
 * eg. "7.66.0 7660300 1.17 10170 14056308 135819602 2c2e2008ecb46c927981078811402151 1709975253"
 */
class BUpgradeInfo(
    versionSum: String,
    val url: String,
    val changelog: String,
) {
    private val versionInfo = versionSum.split(' ')
    val version get() = versionInfo[0]
    val versionCode get() = versionInfo[1].toLong()
    val patchVersion get() = versionInfo[2]
    val patchVersionCode get() = versionInfo[3].toInt()
    val sn get() = versionInfo[4].toLong()
    val size get() = versionInfo[5].toLong()
    val md5 get() = versionInfo[6]
    val publishTime get() = versionInfo[7].toLong()
}

object Upgrade : ApiHook() {
    private const val UPGRADE_CHECK_API = "https://api.github.com/repos/BiliRoamingX/BiliRoamingX-PreBuilds/releases"
    private val changelogRegex = Regex("""版本信息：(.*?)\n(.*)""", RegexOption.DOT_MATCHES_ALL)
    var fromSelf = false

    fun customUpdate(fromSelf: Boolean = false): Boolean {
        return (fromSelf || Settings.CustomUpdate()) && isOsArchArm64 && isPrebuilt
    }

    override fun shouldHook(url: String, status: Int): Boolean {
        return (Settings.BlockUpdate() || customUpdate(fromSelf = fromSelf))
                && url.contains("/x/v2/version/fawkes/upgrade")
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        return if (customUpdate(fromSelf = fromSelf))
            (runCatchingOrNull { checkUpgrade().toString() }
                ?: """{"code":-1,"message":"检查更新失败，请稍后再试/(ㄒoㄒ)/~~""")
                .also { fromSelf = false }
        else if (Settings.BlockUpdate())
            """{"code":-1,"message":"哼，休想要我更新！<(￣︶￣)>"}"""
        else response
    }

    private fun checkUpgrade(): JSONObject {
        var page = 1
        var result: JSONObject?
        do {
            result = pagingCheck(page++)
        } while (result == null)
        return result
    }

    private fun pagingCheck(page: Int): JSONObject? {
        val context = Utils.getContext()
        val sn = context.packageManager.getApplicationInfo(
            context.packageName, PackageManager.GET_META_DATA
        ).metaData.getInt("BUILD_SN").toLong()
        val patchVersion = BuildConfig.VERSION_NAME
        val patchVersionCode = BuildConfig.VERSION_CODE
        val pageUrl = "$UPGRADE_CHECK_API?page=$page&per_page=100"
        val response = JSONArray(URL(pageUrl).readText())
        val mobiApp = Utils.getMobiApp()
        for (data in response) {
            if (!data.optString("tag_name").startsWith("$mobiApp-"))
                continue
            val body = data.optString("body").replace("\r\n", "\n")
            val values = changelogRegex.matchEntire(body)?.groupValues ?: break
            val versionSum = values[1]
            val changelog = values[2].trim()
            val url = data.optJSONArray("assets")
                ?.optJSONObject(0)?.optString("browser_download_url") ?: break
            Logger.debug { "Upgrade, versionSum: $versionSum, changelog: $changelog, url: $url" }
            val info = BUpgradeInfo(versionSum, url, changelog)
            if (sn < info.sn || (sn == info.sn && patchVersionCode < info.patchVersionCode)) {
                val sameApp = sn == info.sn
                val samePatch = patchVersion == info.patchVersion
                val newChangelog = StringBuilder(info.changelog)
                val appVersionChange =
                    if (sameApp) "" else "APP版本：$versionName($versionCode) --> ${info.version}(${info.versionCode})"
                val patchVersionChange =
                    if (samePatch) "" else "漫游X版本：$patchVersion --> ${info.patchVersion}"
                val changeSum = arrayOf(appVersionChange, patchVersionChange)
                    .filterNot { it.isEmpty() }.joinToString(separator = "\n")
                if (changeSum.isNotEmpty()) {
                    newChangelog.append("\n\n")
                    newChangelog.append(changeSum)
                }
                return mapOf(
                    "code" to 0,
                    "message" to "0",
                    "ttl" to 1,
                    "data" to mapOf(
                        "title" to "新版漫游X集成包",
                        "content" to newChangelog.toString(),
                        "version" to info.version,
                        "version_code" to if (sameApp) info.versionCode + 1 else info.versionCode,
                        "url" to speedupGhUrl(info.url),
                        "size" to info.size,
                        "md5" to info.md5,
                        "silent" to 0,
                        "upgrade_type" to 1,
                        "cycle" to 1,
                        "policy" to 0,
                        "policy_url" to "",
                        "ptime" to info.publishTime,
                    )
                ).toJSONObject().also {
                    Logger.debug { "Upgrade check result: $it" }
                }
            } else {
                return mapOf("code" to -1, "message" to "未发现新版漫游X集成包！").toJSONObject()
            }
        }
        return null
    }
}
