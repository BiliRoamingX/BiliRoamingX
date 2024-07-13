package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

object ShareClick : ApiHook() {
    private val contentRegex = Regex("(.*)(http\\S*)(.*)")

    private val whitelistQueryNames
        get() = arrayOf(
            "start_progress",
            "p",
            "topic_id",
            "comment_on",
            "comment_root_id",
            "comment_secondary_id",
            "type",
        )

    override fun shouldHook(url: String, status: Int): Boolean {
        return status.isOk && url.contains("/x/share/click")
                && (Settings.UnlockAreaLimit() || Settings.PurifyShare() || Settings.FuckMiniProgram())
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        val code = json.optInt("code", -1)
        if (Settings.UnlockAreaLimit() && code != 0) {
            val formBody = decodeFormBody(request)
            val shareOrigin = formBody["share_origin"]
            val shareChannel = formBody["share_channel"]
            if (shareOrigin != "new_ogv")
                return response
            val newData = JSONObject()
            val newJson = JSONObject().apply {
                put("code", 0)
                put("data", newData)
            }
            if (shareChannel == "COPY") {
                val videoUrl = VideoInfoHolder.currentVideoUrl()
                if (videoUrl.isNullOrEmpty())
                    return response
                newData.put("content", videoUrl)
                newData.put("count", 0)
                return newJson.toString()
            } else if (shareChannel == "GENERIC") {
                val (mainTitle, _) = VideoInfoHolder.currentTitle()
                    ?: return response
                val videoUrl = VideoInfoHolder.currentVideoUrl()
                if (videoUrl.isNullOrEmpty())
                    return response
                newData.apply {
                    put("title", mainTitle)
                    put("content", "$mainTitle $videoUrl")
                    put("link", videoUrl)
                    put("share_mode", 4)
                    put("header", "哔哩哔哩")
                    put("count", 0)
                }
                return newJson.toString()
            }
        }
        if (code != 0 || (!Settings.PurifyShare() && !Settings.FuckMiniProgram()))
            return response
        json.optJSONObject("data")?.run {
            if (Settings.PurifyShare()) {
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
            if (Settings.FuckMiniProgram()) {
                // 7: mini_program, 3: web, 4: video
                if (optInt("share_mode") == 7)
                    put("share_mode", 3)
            }
        }
        return json.toString()
    }

    fun purifyUrl(url: String) = replaceBv2Av(resolveUrl(url))

    private fun replaceBv2Av(url: String): String {
        if (!Settings.EnableAv()) return url
        return url.replace("(.*)($bvPattern)(.*)".toRegex()) {
            val (_, prefix, bv, postfix) = it.groupValues
            "${prefix}av${bv2av(bv)}$postfix"
        }
    }

    private fun resolveUrl(url: String) = runCatchingOrNull {
        val connection = URL(url).openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        connection.instanceFollowRedirects = false
        connection.connectTimeout = 3000
        connection.readTimeout = 3000
        connection.connect()
        var newUrl = url
        if (connection.responseCode == HttpURLConnection.HTTP_MOVED_TEMP) {
            val realUrl = connection.getHeaderField("Location")
            if (!realUrl.isNullOrEmpty()) {
                val uri = Uri.parse(realUrl)
                val whitelistQueries = whitelistQueryNames.associateWith {
                    uri.getQueryParameter(it)
                }
                newUrl = uri.buildUpon()
                    .clearQuery().encodedFragment(null).apply {
                        for ((k, v) in whitelistQueries) {
                            if (v.isNullOrEmpty())
                                continue
                            if (k == "p") {
                                if (v != "1")
                                    appendQueryParameter(k, v)
                            } else {
                                appendQueryParameter(k, v)
                            }
                        }
                    }.build().toString()
            }
        }
        newUrl
    } ?: url
}
