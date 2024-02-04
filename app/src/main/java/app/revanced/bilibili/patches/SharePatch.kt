package app.revanced.bilibili.patches

import android.net.Uri
import android.os.Bundle
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import app.revanced.bilibili.utils.bv2av
import app.revanced.bilibili.utils.bvPattern
import app.revanced.bilibili.utils.runCatchingOrNull
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

object SharePatch {

    private val contentRegex = Regex("(.*)(http\\S*)(.*)")

    @Keep
    @JvmStatic
    fun disableAppendTrackingInfo(): Boolean {
        return Settings.PURIFY_SHARE.boolean
    }

    @Keep
    @JvmStatic
    fun onShareTo(platform: String, params: Bundle): Boolean {
        LogHelper.debug {
            "shareTo, platform: $platform, params: ${
                JSONObject(params.keySet().associateWith { params.get(it)?.toString() })
            }"
        }
        if (Settings.PURIFY_SHARE.boolean) {
            val targetUrl = params.getString("params_target_url").orEmpty()
            if (targetUrl.startsWith("http"))
                params.putString("params_target_url", purifyUrl(targetUrl))
            val content = params.getString("params_content")
            if (!content.isNullOrEmpty())
                params.putString("params_content", content.replace(contentRegex) {
                    val (_, prefix, url, postfix) = it.groupValues
                    prefix + purifyUrl(url) + postfix
                })
        }
        if (Settings.FUCK_MINI_PROGRAM.boolean) {
            if (params.getString("params_type") == "type_min_program")
                params.putString("params_type", "type_web")
        }
        return false
    }

    private fun purifyUrl(url: String) = replaceBv2Av(resolveUrl(url))

    private fun replaceBv2Av(url: String): String {
        if (!Settings.ENABLE_AV.boolean) return url
        return url.replace("(.*)($bvPattern)(.*)".toRegex()) {
            val (_, prefix, bv, postfix) = it.groupValues
            "${prefix}av${bv2av(bv)}$postfix"
        }
    }

    private fun resolveUrl(url: String) = runCatchingOrNull {
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
                val p = uri.getQueryParameter("p")
                newUrl = uri.buildUpon()
                    .clearQuery().encodedFragment(null).apply {
                        if (!startProgress.isNullOrEmpty())
                            appendQueryParameter("start_progress", startProgress)
                        if (!p.isNullOrEmpty())
                            appendQueryParameter("p", p)
                    }.build().toString()
            }
        }
        newUrl
    } ?: url
}
