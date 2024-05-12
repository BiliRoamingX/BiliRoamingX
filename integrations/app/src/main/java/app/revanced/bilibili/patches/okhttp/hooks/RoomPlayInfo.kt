package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import android.util.Pair
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONObject
import kotlin.math.abs

object RoomPlayInfo : ApiHook() {
    private const val API = "https://api.live.bilibili.com/xlive/app-room/v2/index/getRoomPlayInfo"

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.DEFAULT_MAX_QN.boolean && url.startsWith(API)
    }

    override fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        val uri = Uri.parse(url)
        if (uri.getQueryParameter("qn").let { it.isNullOrEmpty() || it == "0" }) {
            val queryMap = uri.run {
                queryParameterNames.associateWith { getQueryParameter(it).orEmpty() }
            }
            val extraMap = mapOf("qn" to "10000")
            val newUrl = uri.buildUpon().encodedQuery(signQuery(queryMap, extraMap)).toString()
            return Pair.create(newUrl, headers)
        } else {
            return Pair.create(url, headers)
        }
    }

    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.DEFAULT_MAX_QN.boolean && code.isOk && url.startsWith(API)
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val jo = JSONObject(response)
        if (jo.optInt("code") != 0)
            return response
        val requestQn = Uri.parse(url).getQueryParameter("qn")
            ?.toInt() ?: return response
        jo.optJSONObject("data")?.optJSONObject("playurl_info")
            ?.optJSONObject("playurl")?.optJSONArray("stream")?.forEach { s ->
                s.optJSONArray("format")?.forEach { f ->
                    val codecList = f.optJSONArray("codec")
                    codecList.orEmpty().asSequence<JSONObject>()
                        .sortedWith(compareByDescending<JSONObject> {
                            it.optJSONArray("accept_qn").orEmpty().length()
                        }.thenBy {
                            abs(requestQn - it.optInt("current_qn"))
                        }.thenComparator { a, b ->
                            val aCodec = a.optString("codec_name")
                            val bCodec = b.optString("codec_name")
                            if (aCodec == "hevc") -1 else if (bCodec == "hevc") 1 else 0
                        }).firstOrNull()?.let { best ->
                            Logger.debug { "RoomPlayInfo, best codec: $best" }
                            codecList?.removeIf { it != best }
                        }
                }
            }
        Logger.debug { "RoomPlayInfo, new room play info: $jo" }
        return jo.toString()
    }
}
