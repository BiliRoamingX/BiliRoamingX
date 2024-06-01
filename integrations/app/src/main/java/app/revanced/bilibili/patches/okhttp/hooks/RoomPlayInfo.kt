package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import android.util.Pair
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import app.revanced.bilibili.utils.UposReplacer.isGotchaLiveCdn
import org.json.JSONObject
import kotlin.math.abs

object RoomPlayInfo : ApiHook() {
    private const val API = "https://api.live.bilibili.com/xlive/app-room/v2/index/getRoomPlayInfo"

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.DefaultMaxQn() && url.startsWith(API)
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

    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.DefaultMaxQn() && status.isOk && url.startsWith(API)
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val jo = JSONObject(response)
        if (jo.optInt("code") != 0)
            return response
        if (Settings.DefaultMaxQn()) {
            val requestQn = Uri.parse(url).getQueryParameter("qn")?.toInt()
            if (requestQn != null)
                preferBestCodec(jo, requestQn)
        }
        Logger.debug { "RoomPlayInfo, new room play info: $jo" }
        return jo.toString()
    }

    private fun preferBestCodec(json: JSONObject, requestQn: Int) {
        json.optJSONObject("data")?.optJSONObject("playurl_info")
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
    }

    private fun preferStableCdn(json: JSONObject) {
        json.optJSONObject("data")?.optJSONObject("playurl_info")
            ?.optJSONObject("playurl")?.optJSONArray("stream")
            .orEmpty().asSequence<JSONObject>().flatMap { s ->
                s.optJSONArray("format").orEmpty().asSequence<JSONObject>().flatMap { f ->
                    f.optJSONArray("codec").orEmpty().asSequence<JSONObject>()
                }
            }.forEach { codec ->
                val urlInfoList = codec.optJSONArray("url_info")
                if (!urlInfoList.isNullOrEmpty() && urlInfoList.length() > 1) {
                    val first = urlInfoList.optJSONObject(0)
                    val firstHost = first?.optString("host").orEmpty()
                    if (!firstHost.isGotchaLiveCdn()) {
                        urlInfoList.asSequence<JSONObject>().firstNotNullOfOrNull { info ->
                            val host = info.optString("host")
                            if (host.isGotchaLiveCdn()) {
                                info to host
                            } else null
                        }?.let { (gotchaInfo, gotchaHost) ->
                            first.put("host", gotchaHost)
                            gotchaInfo.put("host", firstHost)
                            Logger.debug { "RoomPlayInfo, prefer gotcha cdn: $gotchaHost" }
                        }
                    }
                }
            }
    }
}
