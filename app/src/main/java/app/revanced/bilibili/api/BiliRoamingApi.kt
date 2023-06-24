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

class CustomServerException(private val errors: Map<String, String>) : Throwable() {
    override val message: String
        get() = errors.asSequence().joinToString("\n") { "${it.key}: ${it.value}" }.trim()
}

object BiliRoamingApi {
    private val seasonCache: AtomicReference<Triple<Int, AtomicReference<String>, CountDownLatch>?> =
        AtomicReference(null)

    private const val BILI_HIDDEN_SEASON_URL = "bangumi.bilibili.com/view/web_api/season"
    private const val BILI_SEASON_URL = "api.bilibili.com/pgc/view/web/season"
    private const val BILI_CARD_URL = "https://account.bilibili.com/api/member/getCardByMid"
    private const val PATH_PLAYURL = "/pgc/player/api/playurl"
    private const val BILI_SEARCH_URL = "/x/v2/search/type"

    private const val THAILAND_PATH_PLAYURL = "/intl/gateway/v2/ogv/playurl"
    private const val THAILAND_PATH_SEARCH = "/intl/gateway/v2/app/search/type"

    private val twRegex = Regex("僅.*台")
    private val hkRegex = Regex("僅.*港")
    private val thRegex = Regex("[仅|僅].*[东南亚|其他]")

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
                (Settings.getAccessKeyByArea(k.value)
                    .isNotEmpty() || k != country) && v.isNotEmpty()
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
            val accessKey = Settings.getAccessKeyByArea(area.value)
                .ifEmpty { Utils.getAccessKey() }
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

    @JvmStatic
    fun getAreaSearchBangumi(query: Map<String, String>, area: String, type: String): String? {
        if (area == "th")
            return getThailandSearchBangumi(query, type)
        val hostUrl = Settings.getServerByArea(area).ifEmpty { return null }
        val uri = Uri.Builder()
            .scheme("https")
            .encodedAuthority(hostUrl + BILI_SEARCH_URL)
            .encodedQuery(
                signQuery(
                    query, mapOf(
                        "type" to type,
                        "build" to "6400000",
                        "area" to area,
                    )
                )
            )
            .toString()
        return getContent(uri)
    }

    @JvmStatic
    fun getThailandSearchBangumi(query: Map<String, String>, type: String): String? {
        val thUrl = Settings.TH_SERVER.string.ifEmpty { return null }
        val uri = Uri.Builder()
            .scheme("https")
            .encodedAuthority(thUrl + THAILAND_PATH_SEARCH)
            .encodedQuery(
                signQuery(
                    query, mapOf(
                        "type" to type,
                        "appkey" to "7d089525d3611b1c",
                        "build" to "1001310",
                        "mobi_app" to "bstar_a",
                        "platform" to "android",
                        "s_locale" to "zh_SG",
                        "c_locale" to "zh_SG",
                        "sim_code" to "52004",
                        "lang" to "hans",
                    )
                )
            )
            .toString()
        return getContent(uri)?.replace(
            "bstar://bangumi/season/",
            "https://bangumi.bilibili.com/anime/"
        )
    }

    @JvmStatic
    fun getSpace(mid: Long): String? {
        val content = getContent("$BILI_CARD_URL?mid=$mid")
            ?.toJSONObject() ?: return null
        if (content.optInt("code") != 0) return null
        val card = content.optJSONObject("card") ?: return null
        val levelInfo = card.optJSONObject("level_info") ?: return null
        val officialVerify = card.optJSONObject("official_verify") ?: return null
        return """{"relation":-999,"guest_relation":-999,"default_tab":"video","is_params":true,"setting":{"fav_video":0,"coins_video":0,"likes_video":0,"bangumi":0,"played_game":0,"groups":0,"comic":0,"bbq":0,"dress_up":0,"disable_following":0,"live_playback":1,"close_space_medal":0,"only_show_wearing":0},"tab":{"archive":true,"article":true,"clip":true,"album":true,"favorite":false,"bangumi":false,"coin":false,"like":false,"community":false,"dynamic":true,"audios":true,"shop":false,"mall":false,"ugc_season":false,"comic":false,"cheese":false,"sub_comic":false,"activity":false,"series":false},"card":{"mid":"$mid","name":"${
            card.optString("name")
        }","approve":false,"sex":"${card.optString("sex")}","rank":"${card.optString("rank")}","face":"${
            card.optString("face")
        }","DisplayRank":"","regtime":0,"spacesta":0,"birthday":"","place":"","description":"该页面由哔哩漫游修复","article":0,"attentions":null,"fans":${
            card.optInt("fans", 114)
        },"friend":${card.optInt("friend", 514)},"attention":${
            card.optInt("attention", 233)
        },"sign":"【该页面由哔哩漫游修复】${card.optString("sign")}","level_info":{"current_level":${
            levelInfo.optInt("current_level")
        },"current_min":${levelInfo.optInt("current_min")},"current_exp":${levelInfo.optInt("current_exp")},"next_exp":"${
            levelInfo.optInt("next_exp")
        }"},"pendant":{"pid":0,"name":"","image":"","expire":0,"image_enhance":"","image_enhance_frame":""},"nameplate":{"nid":0,"name":"","image":"","image_small":"","level":"","condition":""},"official_verify":{"type":${
            officialVerify.optInt("type")
        },"desc":"${officialVerify.optString("desc")}","role":3,"title":"${
            officialVerify.optString("desc")
        }"},"vip":{"vipType":0,"vipDueDate":0,"dueRemark":"","accessStatus":0,"vipStatus":0,"vipStatusWarn":"","themeType":0,"label":{"path":"","text":"","label_theme":"","text_color":"","bg_style":0,"bg_color":"","border_color":""}},"silence":0,"end_time":0,"silence_url":"","likes":{"like_num":0,"skr_tip":"该页面由哔哩漫游修复"},"pr_info":{},"relation":{"status":1},"is_deleted":0,"honours":{"colour":{"dark":"#CE8620","normal":"#F0900B"},"tags":null},"profession":{}},"images":{"imgUrl":"https://i0.hdslb.com/bfs/album/16b6731618d911060e26f8fc95684c26bddc897c.jpg","night_imgurl":"https://i0.hdslb.com/bfs/album/ca79ebb2ebeee86c5634234c688b410661ea9623.png","has_garb":true,"goods_available":true},"live":{"roomStatus":0,"roundStatus":0,"liveStatus":0,"url":"","title":"","cover":"","online":0,"roomid":0,"broadcast_type":0,"online_hidden":0,"link":""},"archive":{"order":[{"title":"最新发布","value":"pubdate"},{"title":"最多播放","value":"click"}],"count":9999,"item":[]},"series":{"item":[]},"play_game":{"count":0,"item":[]},"article":{"count":0,"item":[],"lists_count":0,"lists":[]},"season":{"count":0,"item":[]},"coin_archive":{"count":0,"item":[]},"like_archive":{"count":0,"item":[]},"audios":{"count":0,"item":[]},"favourite2":{"count":0,"item":[]},"comic":{"count":0,"item":[]},"ugc_season":{"count":0,"item":[]},"cheese":{"count":0,"item":[]},"fans_effect":{},"tab2":[{"title":"动态","param":"dynamic"},{"title":"投稿","param":"contribute","items":[{"title":"视频","param":"video"}]}]}"""
    }

    private fun fixThailandPlayurl(result: String): String {
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
