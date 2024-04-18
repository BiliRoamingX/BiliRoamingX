package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.bv2av
import app.revanced.bilibili.utils.bvPattern
import app.revanced.bilibili.utils.runCatchingOrNull
import app.revanced.bilibili.utils.toJSONObject
import java.net.HttpURLConnection
import java.net.URL

object ShareClick : ApiHook() {
    private val contentRegex = Regex("(.*)(http\\S*)(.*)")

    override fun shouldHook(url: String, code: Int): Boolean {
        return code.isOk && url.contains("/x/share/click")
                && (Settings.PURIFY_SHARE.boolean || Settings.FUCK_MINI_PROGRAM.boolean)
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        if (json.optInt("code") != 0) return response
        json.optJSONObject("data")?.run {
            if (Settings.PURIFY_SHARE.boolean) {
                val link = optString("link")
                if (link.startsWith("http"))
                    put("link", purifyUrl(link))
                val content = optString("content")
                if (content.isNotEmpty())
                    put("content", content.replace(contentRegex) {
                        val (_, prefix, cUrl, postfix) = it.groupValues
                        prefix + purifyUrl(cUrl) + postfix
                    })
            }
            if (Settings.FUCK_MINI_PROGRAM.boolean) {
                // 7: mini_program, 3: web, 4: video
                if (optInt("share_mode") == 7)
                    put("share_mode", 3)
            }
        }
        return json.toString()
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
                        if (!p.isNullOrEmpty() && p != "1")
                            appendQueryParameter("p", p)
                    }.build().toString()
            }
        }
        newUrl
    } ?: url
}
