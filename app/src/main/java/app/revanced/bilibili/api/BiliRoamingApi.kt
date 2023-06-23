package app.revanced.bilibili.api

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Build
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.lastSeasonInfo
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference
import java.util.zip.GZIPInputStream
import java.util.zip.InflaterInputStream

class CustomServerException(val errors: Map<String, String>) : Throwable() {
    override val message: String
        get() = errors.asSequence().joinToString("\n") { "${it.key}: ${it.value}" }.trim()
}

object BiliRoamingApi {
    private val seasonCache: AtomicReference<Triple<Int, AtomicReference<String>, CountDownLatch>?> =
        AtomicReference(null)

    private const val BILI_HIDDEN_SEASON_URL = "bangumi.bilibili.com/view/web_api/season"
    private const val BILI_SEASON_URL = "api.bilibili.com/pgc/view/web/season"
    private const val PATH_PLAYURL = "/pgc/player/api/playurl"
    private const val THAILAND_PATH_PLAYURL = "/intl/gateway/v2/ogv/playurl"

    private val twRegex = Regex("僅.*台")
    private val hkRegex = Regex("僅.*港")
    private val thRegex = Regex("[仅|僅].*[东南亚|其他]")

    private fun getCustomizeAccessKey(area: Area): String = when (area) {
        Area.TW -> Settings.TW_SERVER_ACCESS_KEY.string
        Area.HK -> Settings.HK_SERVER_ACCESS_KEY.string
        Area.TH -> Settings.TH_SERVER_ACCESS_KEY.string
        Area.CN -> Settings.CN_SERVER_ACCESS_KEY.string
        else -> ""
    }

    @JvmStatic
    fun getPlayUrl(queryString: String?, priorityArea: Array<Area>? = null): String? {
        queryString ?: return null
        val twUrl = Settings.TW_SERVER.string
        val hkUrl = Settings.HK_SERVER.string
        val cnUrl = Settings.CN_SERVER.string
        val thUrl = Settings.TH_SERVER.string

        val hostList = LinkedHashMap<Area, String>(4, 1f, true)

        if (hostList.isEmpty())
        // reversely
            mapOf(
                Area.TW to twUrl,
                Area.HK to hkUrl,
                Area.TH to thUrl,
                Area.CN to cnUrl
            ).filter { (k, v) ->
                (getCustomizeAccessKey(k).isNotEmpty() || k != country) && v.isNotEmpty()
            }.let { hostList.putAll(it) }

        val epIdStartIdx = queryString.indexOf("ep_id=")
        val epIdEndIdx = queryString.indexOf("&", epIdStartIdx)
        val epId = queryString.substring(epIdStartIdx + 6, epIdEndIdx)

        if (!lastSeasonInfo.containsKey("ep_ids") || lastSeasonInfo["ep_ids"]?.contains(epId) != true)
            lastSeasonInfo.clear()

        lastSeasonInfo["title"]?.run {
            if (contains(twRegex) && twUrl.isNotEmpty()) hostList[Area.TW]
            if (contains(hkRegex) && hkUrl.isNotEmpty()) hostList[Area.HK]
            if (contains(thRegex) && thUrl.isNotEmpty()) hostList[Area.TH]
        }

        priorityArea?.forEach { area ->
            if (hostList.containsKey(area)) hostList[area]
        }

        if (hostList.isEmpty()) return null

        val seasonId = lastSeasonInfo["season_id"] ?: if (epId.isEmpty()) null else "ep$epId"

        if (seasonId != null && Settings.cachePrefs.contains(seasonId)) {
            val cachedArea = Area.of(Settings.cachePrefs.getString(seasonId, null))
            if (hostList.containsKey(cachedArea)) {
                LogHelper.debug { "use cached area $cachedArea for $seasonId" }
                hostList[cachedArea]
            }
        }

        val errors = mutableMapOf<String, String>()

        for ((area, host) in hostList.toList().asReversed()) {
            val accessKey = getCustomizeAccessKey(area).ifEmpty { Utils.getAccessKey() }
            val extraMap = if (area == Area.TH) mapOf(
                "area" to area.value,
                "appkey" to "7d089525d3611b1c",
                "build" to "1001310",
                "mobi_app" to "bstar_a",
                "platform" to "android",
                "access_key" to accessKey,
            ) else mapOf(
                "area" to area.value,
                "access_key" to accessKey,
            )
            val path = if (area == Area.TH) THAILAND_PATH_PLAYURL else PATH_PLAYURL
            val uri = Uri.Builder()
                .scheme("https")
                .encodedAuthority(host + path)
                .encodedQuery(signQuery(queryString, extraMap))
                .toString()
            getContent(uri)?.let {
                LogHelper.debug { "use server $area $host for playurl" }
                if (it.contains("\"code\":0")) {
                    lastSeasonInfo["area"] = area.value
                    lastSeasonInfo["epid"] = epId
                    if (seasonId != null && !Settings.cachePrefs.contains(seasonId)
                        || Area.of(Settings.cachePrefs.getString(seasonId, null)) != area
                    ) {
                        Settings.cachePrefs.edit {
                            putString(seasonId, area.value)
                            lastSeasonInfo["ep_ids"]?.split(";")
                                ?.forEach { epId -> putString("ep$epId", area.value) }
                        }
                    }
                    return if (area == Area.TH) fixThailandPlayurl(it) else it
                }
                errors.put(area.value, JSONObject(it).optString("message"))
            } ?: errors.putIfAbsent(area.value, "服务器不可用")
        }
        throw CustomServerException(errors)
    }

    fun fixThailandPlayurl(result: String): String {
        val input = JSONObject(result)
        val videoInfo = result.toJSONObject().optJSONObject("data")?.optJSONObject("video_info")
        val streamList = videoInfo?.optJSONArray("stream_list")
        val dashAudio = videoInfo?.optJSONArray("dash_audio")

        val output = JSONObject().apply {
            put("format", "flv720")
            put("type", "DASH")
            put("result", "suee")
            put("video_codecid", 7)
            put("no_rexcode", 0)

            put("code", input.optInt("code"))
            put("message", input.optInt("message"))
            put("timelength", videoInfo?.optInt("timelength"))
            put("quality", videoInfo?.optInt("quality"))
            put("accept_format", "hdflv2_4k,hdflv2_hdr,hdflv2_dolby,hdflv2,flv,flv720,flv480,mp4")
        }

        val acceptQuality = JSONArray()
        val acceptDescription = JSONArray()

        val dash = JSONObject().apply {
            put("duration", 0)
            put("minBufferTime", 0.0)
            put("min_buffer_time", 0.0)
        }
        val fixedAudio = JSONArray().apply {
            for (audio in dashAudio.orEmpty())
                put(audio)
        }
        dash.put("audio", fixedAudio)

        val supportFormats = JSONArray()
        val dashVideo = JSONArray()
        for (stream in streamList.orEmpty()) {
            if (stream.optJSONObject("dash_video")?.optString("base_url").isNullOrBlank())
                continue
            stream.optJSONObject("stream_info")?.let {
                supportFormats.put(it)
            }
            stream.optJSONObject("stream_info")?.let {
                acceptQuality.put(it.optInt("quality"))
            }
            stream.optJSONObject("stream_info")?.let {
                acceptDescription.put(it.optString("new_description"))
            }
            stream.optJSONObject("dash_video")?.let {
                it.put("id", stream.optJSONObject("stream_info")?.optInt("quality"))
                dashVideo.put(it)
            }
        }
        dash.put("video", dashVideo)

        output.put("accept_quality", acceptQuality)
        output.put("accept_description", acceptDescription)
        output.put("support_formats", supportFormats)
        output.put("dash", dash)

        return output.toString()
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun getContent(url: String): String? = try {
        val timeout = 10000
        // Work around for android 7
        val mobiApp = Utils.getMobiApp()
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N
            && url.startsWith("https")
            && !url.contains("bilibili.com")
        ) {
            LogHelper.debug { "Found Android 7, try to bypass ssl issue" }
            val listener = object : Any() {
                val latch = CountDownLatch(1)
                var result = ""

                @Suppress("UNUSED")
                @JavascriptInterface
                fun callback(r: String) {
                    result = r
                    latch.countDown()
                }
            }
            Utils.mainHandler.post {
                val webView = WebView(Utils.getContext(), null)
                webView.addJavascriptInterface(listener, "listener")
                webView.webViewClient = object : WebViewClient() {
                    override fun onPageFinished(view: WebView, url: String) {
                        view.settings.javaScriptEnabled = true
                        view.loadUrl("javascript:listener.callback(document.documentElement.innerText)")
                    }
                }
                webView.loadUrl(
                    url, mapOf(
                        "x-from-biliroaming" to "1.6.12",
                        "platform-from-biliroaming" to mobiApp,
                        "Build" to "1344"
                    )
                )
            }
            try {
                if (!listener.latch.await((timeout * 2).toLong(), TimeUnit.MILLISECONDS)) {
                    Toasts.showShort("连接超时，请重试")
                    throw IOException("Timeout connection to server")
                }
            } catch (e: InterruptedException) {
                throw IOException("Connection to server was interrupted")
            }
            listener.result
        } else {
            val connection = URL(url).openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            connection.connectTimeout = timeout
            connection.readTimeout = timeout
            connection.setRequestProperty("x-from-biliroaming", "1.6.12")
            connection.setRequestProperty("platform-from-biliroaming", mobiApp)
            connection.setRequestProperty("Build", "1344")
            connection.setRequestProperty("Accept-Encoding", "br,gzip,deflate")
            connection.connect()
            if (connection.responseCode == HttpURLConnection.HTTP_OK) {
                val inputStream = connection.inputStream
                getStreamContent(
                    when (connection.contentEncoding?.lowercase()) {
                        "br" -> BrotliInputStream(inputStream)
                        "gzip" -> GZIPInputStream(inputStream)
                        "deflate" -> InflaterInputStream(inputStream)
                        else -> inputStream
                    }
                )
            } else null
        }
    } catch (e: Throwable) {
        LogHelper.error({ "getContent error: ${e.message} with url $url" }, e)
        null
    }?.also {
        LogHelper.debug { "getContent url: $url" }
        LogHelper.debug { "getContent result: $it" }
    }
}
