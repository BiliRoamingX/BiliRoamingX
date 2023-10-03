package app.revanced.bilibili.patches

import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import app.revanced.bilibili.utils.Toasts
import app.revanced.bilibili.utils.runCatchingOrNull
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

object SharePatch {

    private val contentRegex = Regex("(.*)(http\\S*)(.*)")

    @JvmStatic
    fun disableAppendTrackingInfo(): Boolean {
        return Settings.PURIFY_SHARE.boolean
    }

    @JvmStatic
    fun onShareTo(platform: String, params: Bundle): Boolean {
        LogHelper.debug {
            "shareTo, platform: $platform, params: ${
                JSONObject(params.keySet().associateWith { params.get(it) })
            }"
        }
        if (platform.startsWith("WEIXIN")) {
            Toasts.showWithId("biliroaming_can_not_share_to_wx", Toast.LENGTH_LONG)
            return true
        }
        if (Settings.PURIFY_SHARE.boolean) {
            val targetUrl = params.getString("params_target_url").orEmpty()
            if (targetUrl.startsWith("http"))
                params.putString("params_target_url", getRealUrl(targetUrl))
            val content = params.getString("params_content")
            if (!content.isNullOrEmpty())
                contentRegex.matchEntire(content)?.groupValues?.let {
                    val (_, prefix, url, postfix) = it
                    if (url.isNotEmpty())
                        params.putString("params_content", prefix + getRealUrl(url) + postfix)
                }
        }
        if (Settings.FUCK_MINI_PROGRAM.boolean) {
            if (params.getString("params_type") == "type_min_program")
                params.putString("params_type", "type_web")
        }
        return false
    }

    private fun getRealUrl(url: String) = runCatchingOrNull {
        val connection = URL(url).openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        connection.instanceFollowRedirects = false
        connection.connect()
        var newUrl = url
        if (connection.responseCode == HttpURLConnection.HTTP_MOVED_TEMP) {
            val realUrl = connection.getHeaderField("Location")
            if (!realUrl.isNullOrEmpty()) {
                val uri = Uri.parse(realUrl)
                val startProgress = uri.getQueryParameter("start_progress")
                newUrl = uri.buildUpon()
                    .clearQuery().encodedFragment(null).apply {
                        if (!startProgress.isNullOrEmpty())
                            appendQueryParameter("start_progress", startProgress)
                    }.build().toString()
            }
        }
        newUrl
    } ?: url
}
