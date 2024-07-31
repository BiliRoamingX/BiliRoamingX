package app.revanced.bilibili.api

import android.net.Uri
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.http.HttpClient
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook.seasonAreasCache
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.CountDownLatch
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicReference

class CustomServerException(private val errors: Map<String, String>) : Throwable() {
    override val message: String
        get() = errors.asSequence().joinToString("\n") { "${it.key}: ${it.value}" }.trim()
}

class SeasonCache(
    var seasonId: Long,
    var seasonJson: AtomicReference<String>,
    var latch: CountDownLatch,
    var valid: AtomicBoolean = AtomicBoolean(true)
)

object BiliRoamingApi {
    private val seasonCache = AtomicReference<SeasonCache?>(null)

    private const val BILI_SEARCH_URL = "/x/v2/search/type"
    private const val BILI_CARD_URL = "https://account.bilibili.com/api/member/getCardByMid"
    private const val BILI_MEDIA_URL = "https://www.bilibili.com/bangumi/media/md"
    private const val BILI_APP_MEDIA_URL = "api.bilibili.com/pgc/view/v2/app/media"
    private const val BILI_SECTION_URL = "api.bilibili.com/pgc/web/season/section"
    private const val BILI_USER_STATUS_URL = "api.bilibili.com/pgc/view/web/season/user/status"
    private const val BILI_REVIEW_URL = "api.bilibili.com/pgc/review/user"

    private const val PATH_PLAYURL = "/pgc/player/api/playurl"
    private const val THAILAND_PATH_PLAYURL = "/intl/gateway/v2/ogv/playurl"
    private const val THAILAND_PATH_SUBTITLES = "/intl/gateway/v2/app/subtitle"
    private const val THAILAND_PATH_SEARCH = "/intl/gateway/v2/app/search/type"
    private const val THAILAND_PATH_SEASON = "/intl/gateway/v2/ogv/view/app/season"

    private val twRegex = Regex("僅.*台")
    private val hkRegex = Regex("僅.*港")
    private val thRegex = Regex("[仅|僅].*[东南亚|其他]")
    private val mediaSeasonRegex =
        Regex("""[\w\W]*window\.__INITIAL_STATE__=(.*);\(function\(\)[\w\W]*""")

    @JvmStatic
    fun getPlayUrl(
        query: Map<String, String>,
        priorityArea: Array<Area>? = null,
        seasonId: Long = 0L,
        seasonTitle: String = "",
    ): String? {
        val twUrl = Settings.TaiWanServer()
        val hkUrl = Settings.HongKongServer()
        val cnUrl = Settings.ChinaServer()
        val thUrl = Settings.ThailandServer()

        val hostList = LinkedHashMap<Area, String>(4, 1f, true)

        // reversely
        mapOf(
            Area.TaiWan to twUrl,
            Area.HongKong to hkUrl,
            Area.Thailand to thUrl,
            Area.China to cnUrl
        ).filter { (k, v) -> k != area && v.isNotEmpty() }.let { hostList.putAll(it) }
        if (hostList.isEmpty()) return null

        val epId = query["ep_id"] ?: return null
        Logger.debug { "unlockBangumi, getPlayUrl, epId: $epId, seasonId: $seasonId, seasonTitle: $seasonTitle" }

        seasonTitle.run {
            if (contains(hkRegex) && hkUrl.isNotEmpty()) hostList[Area.HongKong]
            if (contains(twRegex) && twUrl.isNotEmpty()) hostList[Area.TaiWan]
            if (contains(thRegex) && thUrl.isNotEmpty()) hostList[Area.Thailand]
        }

        priorityArea?.forEach { area ->
            if (hostList.containsKey(area)) hostList[area]
        }

        val cacheId = seasonId.takeIf { it != 0L }?.toString() ?: "ep$epId"

        if (cachePrefs.contains(cacheId)) {
            val cachedArea = Area.of(cachePrefs.getString(cacheId, null))
            if (cachedArea != null && hostList.containsKey(cachedArea)) {
                Logger.debug { "use cached area $cachedArea for $cacheId" }
                hostList[cachedArea]
            }
        }

        val errors = mutableMapOf<String, String>()

        for ((area, host) in hostList.toList().asReversed()) {
            val extraMap = if (area == Area.Thailand) mapOf(
                "area" to area.value,
                "appkey" to "7d089525d3611b1c",
                "build" to "1001310",
                "mobi_app" to "bstar_a",
                "platform" to "android",
                "access_key" to getFinalAccessKey(true),
            ) else mapOf(
                "area" to area.value,
                "access_key" to getFinalAccessKey(false),
            )
            val path = if (area == Area.Thailand) THAILAND_PATH_PLAYURL else PATH_PLAYURL
            val uri = Uri.Builder()
                .scheme("https")
                .encodedAuthority(host + path)
                .encodedQuery(signQuery(query, extraMap))
                .toString()
            HttpClient.biliroaming(uri)?.plain()?.let {
                Logger.debug { "use server $area $host for playurl" }
                if (it.contains("\"code\":0")) {
                    seasonAreasCache[cacheId] = area
                    if (!cachePrefs.contains(cacheId)
                        || cachePrefs.getString(cacheId, null) != area.value
                    ) cachePrefs.edit { putString(cacheId, area.value) }
                    return if (area == Area.Thailand) fixThailandPlayurl(it) else it
                }
                val message = runCatchingOrNull { JSONObject(it) }?.optString("message")
                    .orEmpty().ifEmpty { "服务器不可用" }
                errors.put(area.value, message)
            } ?: errors.putIfAbsent(area.value, "服务器不可用")
        }
        throw CustomServerException(errors)
    }

    @JvmStatic
    fun getAreaSearchBangumi(query: Map<String, String>, area: Area, type: String): String? {
        if (area == Area.Thailand)
            return getThailandSearchBangumi(query, type)
        val hostUrl = getServerByArea(area).ifEmpty { return null }
        val uri = Uri.Builder()
            .scheme("https")
            .encodedAuthority(hostUrl + BILI_SEARCH_URL)
            .encodedQuery(
                signQuery(
                    query, mapOf(
                        "type" to type,
                        "build" to "6400000",
                        "area" to area.value,
                    )
                )
            )
            .toString()
        return HttpClient.biliroaming(uri)?.plain()
    }

    @JvmStatic
    fun getThailandSearchBangumi(query: Map<String, String>, type: String): String? {
        val thUrl = Settings.ThailandServer().ifEmpty { return null }
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
        return HttpClient.biliroaming(uri)?.plain()?.replace(
            "bstar://bangumi/season/",
            "https://bangumi.bilibili.com/anime/"
        )
    }

    @JvmStatic
    fun getSeason(seasonId: Long = 0L, epId: Long = 0L): String? {
        val thUrl = Settings.ThailandServer()
        if (thUrl.isEmpty()) {
            Toasts.showShortWithId("biliroaming_pls_configure_th_server")
            return null
        }
        val cache = seasonCache.get()
        val seasonCache = if (seasonId != 0L) {
            if (cache?.seasonId == seasonId && cache.valid.get()) {
                cache.latch.await()
                return cache.seasonJson.get()
            } else {
                SeasonCache(seasonId, AtomicReference<String>(), CountDownLatch(1)).also {
                    seasonCache.compareAndSet(cache, it)
                }
            }
        } else null
        Logger.debug { "unlockBangumi, getSeason, seasonId: $seasonId, epId: $epId" }
        val builder = Uri.Builder().scheme("https")
            .encodedAuthority(thUrl + THAILAND_PATH_SEASON)
            .appendQueryParameter("s_locale", "zh_SG")
            .appendQueryParameter("access_key", Accounts.accessKey)
            .appendQueryParameter("mobi_app", "bstar_a")
            .appendQueryParameter("build", "1080003")
        if (seasonId != 0L)
            builder.appendQueryParameter("season_id", seasonId.toString())
        if (epId != 0L)
            builder.appendQueryParameter("ep_id", epId.toString())
        var thSeason: JSONObject? = null
        var hidden = false
        val seasonJson = HttpClient.biliroaming(builder.toString())?.json()?.also {
            thSeason = it
            it.optJSONObject("result")?.run {
                fixThailandSeason(this)
            }
        }?.takeIf { it.optInt("code", -1) == 0 }
            ?: getHiddenSeason(seasonId)?.also { hidden = true } ?: run {
                thSeason?.let { checkErrorToast(it, true) }
                seasonCache?.valid?.set(false)
                seasonCache?.latch?.countDown()
                return null
            }
        return seasonJson.toString().also {
            if (seasonJson.optInt("code", -1) == 0) {
                if (hidden) {
                    // not cache hidden cn bangumi to make sure follow status is synced
                    seasonCache?.valid?.set(false)
                }
                seasonCache?.seasonJson?.set(it)
            } else {
                seasonCache?.valid?.set(false)
            }
            seasonCache?.latch?.countDown()
        }
    }

    @JvmStatic
    private fun getHiddenSeason(seasonId: Long): JSONObject? {
        // few cn bangumi maybe hidden for oversea ip, eg. 6423(品酒要在成为夫妻后)
        if (seasonId == 0L) return null
        val result = getMediaInfo(seasonId)?.toJSONObject()
            ?.optJSONObject("mediaInfo") ?: return null
        val sectionResult = getSection(seasonId)?.takeIf {
            it.contains("\"code\":0")
        }?.toJSONObject()?.optJSONObject("result") ?: return null
        val statusResult = getUserStatus(seasonId)?.takeIf {
            it.contains("\"code\":0")
        }?.toJSONObject()?.optJSONObject("result") ?: return null
        val reviewResult = getReviewInfo(seasonId)?.takeIf {
            it.contains("\"code\":0")
        }?.toJSONObject()?.optJSONObject("result") ?: return null
        result.remove("activity")
        result.remove("long_review")
        result.remove("short_review")
        result.remove("seasons")
        if (!Utils.newPlayerEnabled()) {
            getAppMediaInfo(seasonId)?.takeIf {
                it.contains("\"code\":0")
            }?.toJSONObject()?.optJSONObject("data")?.run {
                optJSONObject("media_badge_info")?.let {
                    result.put("media_badge_info", it)
                }
                optJSONArray("celebrity")?.let {
                    result.put("celebrity", it)
                }
            }
        }
        val actors = result.optString("actors")
        if (actors.isNotEmpty()) result.put("actor", JSONObject().apply {
            put("title", "角色声优")
            put("info", actors.trimEnd())
        })
        val staff = result.optString("staff")
        if (staff.isNotEmpty()) result.put("staff", JSONObject().apply {
            put("title", "制作信息")
            put("info", staff.trimEnd())
        }) else result.remove("staff")
        val mediaId = result.optString("media_id")
        val seasonTitle = result.optString("title")
        val status = result.optInt("season_status")
        result.put("link", "http://www.bilibili.com/bangumi/media/md$mediaId")
        result.put("season_title", seasonTitle)
        result.put("share_copy", seasonTitle)
        result.put("share_url", "https://www.bilibili.com/bangumi/play/ss$seasonId")
        result.put("short_link", "https://b23.tv/ss$seasonId")
        result.put("status", status)
        result.put("new_ep", result.optJSONObject("episode_index")?.apply {
            put("desc", result.optJSONObject("publish")?.optString("time_length_show").orEmpty())
        })
        val modules = JSONArray()
        val module = { sectionIndex: Int, episodes: JSONArray, style: String, title: String ->
            episodes.forEachIndexed { index, ep ->
                val epId = ep.optInt("id")
                ep.put("duration", 1436000)
                ep.put("ep_id", epId)
                ep.put("ep_index", index + 1)
                ep.put("link", "https://www.bilibili.com/bangumi/play/ep$epId")
                ep.put("rights", JSONObject().apply {
                    put("allow_demand", 0)
                    put("allow_dm", 1)
                    put("allow_download", 1)
                    put("area_limit", 0)
                })
                ep.put("section_index", sectionIndex)
                val epTitle = ep.optString("title")
                val longTitle = ep.optString("long_title")
                ep.put("share_copy", "《$seasonTitle》第${epTitle}话 $longTitle".trim())
                ep.put("share_url", "https://www.bilibili.com/bangumi/play/ep$epId")
                ep.put("short_link", "https://b23.tv/ep$epId")
            }
            JSONObject().apply {
                put("data", JSONObject().put("episodes", episodes))
                put("id", sectionIndex)
                put("style", style)
                put("title", title)
                put("module_style", JSONObject().apply {
                    put("hidden", 0)
                    put("line", 1)
                })
            }
        }
        var sectionIndex = 1
        sectionResult.optJSONObject("main_section")?.run {
            val episodes = optJSONArray("episodes").orEmpty()
            result.put("total", episodes.length())
            modules.put(module(sectionIndex, episodes, "positive", "选集"))
            sectionIndex++
        }
        sectionResult.optJSONArray("section").orEmpty().forEach { section ->
            val episodes = section.optJSONArray("episodes").orEmpty()
            val title = section.optString("title")
            modules.put(module(sectionIndex, episodes, "section", title))
            sectionIndex++
        }
        result.put("modules", modules)
        result.put("user_status", statusResult.apply {
            if (status == 13 && Accounts.isEffectiveVip)
                put("pay", 1)
            if (optJSONObject("vip_info")?.optInt("status") == 1)
                put("vip", 1)
            put("review", reviewResult.optJSONObject("review")?.apply {
                put(
                    "article_url",
                    "https://member.bilibili.com/article-text/mobile?media_id=$mediaId"
                )
            })
        })
        val play = result.optJSONObject("icon_font")?.optString("text").orEmpty()
        result.optJSONObject("stat")?.run {
            put("play", play)
            put("followers", optLong("favorites").cnCountFormat())
        }
        result.optJSONObject("rights")?.put("area_limit", 0)
        val areaId = result.optJSONArray("areas")?.optJSONObject(0)?.optInt("id")
        if (areaId != null) result.optJSONArray("styles")?.forEach { style ->
            val styleId = style.optInt("id")
            style.put("url", "bilibili://pgc/common/index?style_id=$styleId&area=$areaId")
        }
        result.optJSONObject("publish")?.run {
            optString("update_info_desc").ifEmpty {
                put("update_info_desc", optString("time_length_show"))
            }
        }
        if (status == 13) {
            result.put("badge", "会员专享")
            result.put("badge_info", JSONObject().apply {
                put("bg_color", "#FB7299")
                put("bg_color_night", "#BB5B76")
                val img =
                    "https://i0.hdslb.com/bfs/bangumi/image/620a40f8e7004eb881916846e760981b7509d22f.png"
                put("img", img)
                put("text", "会员专享")
            })
        } else if (result.optJSONObject("rights")?.optString("copyright") == "dujia") {
            result.put("badge", "独家")
            result.put("badge_info", JSONObject().apply {
                put("bg_color", "#00C0FF")
                put("bg_color_night", "#0B91BE")
                val img =
                    "https://i0.hdslb.com/bfs/bangumi/image/f8812eb31c22db41fb4608353b83a3fc49d2da3c.png"
                put("img", img)
                put("text", "独家")
            })
        }
        return JSONObject().apply {
            put("code", 0)
            put("result", result)
        }
    }

    @JvmStatic
    private fun getMediaInfo(mediaId: Long): String? {
        val content = HttpClient.get(BILI_MEDIA_URL + mediaId)?.plain() ?: return null
        return mediaSeasonRegex.matchEntire(content)?.groupValues?.get(1)
    }

    @JvmStatic
    private fun getSection(seasonId: Long): String? {
        val url = Uri.Builder()
            .scheme("https")
            .encodedAuthority(BILI_SECTION_URL)
            .appendQueryParameter("season_id", seasonId.toString())
            .toString()
        return HttpClient.get(url)?.plain()
    }

    @JvmStatic
    private fun getUserStatus(seasonId: Long): String? {
        val url = Uri.Builder()
            .scheme("https")
            .encodedAuthority(BILI_USER_STATUS_URL)
            .appendQueryParameter("season_id", seasonId.toString())
            .appendQueryParameter("access_key", Accounts.accessKey)
            .toString()
        return HttpClient.get(url)?.plain()
    }

    @JvmStatic
    private fun getReviewInfo(mediaId: Long): String? {
        val url = Uri.Builder()
            .scheme("https")
            .encodedAuthority(BILI_REVIEW_URL)
            .appendQueryParameter("media_id", mediaId.toString())
            .appendQueryParameter("access_key", Accounts.accessKey)
            .toString()
        return HttpClient.get(url)?.plain()
    }

    @JvmStatic
    private fun getAppMediaInfo(mediaId: Long): String? {
        val query = mapOf("media_id" to mediaId.toString(), "access_key" to Accounts.accessKey)
        val url = Uri.Builder()
            .scheme("https")
            .encodedAuthority(BILI_APP_MEDIA_URL)
            .encodedQuery(signQuery(query))
            .toString()
        return HttpClient.get(url)?.plain()
    }

    @JvmStatic
    fun getThailandSubtitles(epId: Long): String? {
        Logger.debug { "Getting subtitle $epId form thailand" }
        epId.takeIf { it != 0L } ?: return null
        val thUrl = Settings.ThailandServer().ifEmpty { return null }
        val uri = Uri.Builder()
            .scheme("https")
            .encodedAuthority(thUrl + THAILAND_PATH_SUBTITLES)
            .appendQueryParameter("ep_id", epId.toString())
            .toString()
        return HttpClient.biliroaming(uri)?.plain()
    }

    @JvmStatic
    fun fixThailandSeason(result: JSONObject) {
        // 强制已追番
        result.optJSONObject("user_status")?.run {
            put("follow", 1)
            put("pay", 1)
        }
        var total = 0

        val seasons = result.optJSONObject("series")?.optJSONArray("seasons")
        val seasonId = result.optInt("season_id")
        for ((mid, module) in result.optJSONArray("modules").orEmpty().iterator().withIndex()) {
            val positive = module.optString("style") == "positive"
            val data = module.optJSONObject("data") ?: continue
            val sid = if (seasons.isNullOrEmpty()) mid + 1 else mid + 2
            for ((eid, ep) in data.optJSONArray("episodes").orEmpty().iterator().withIndex()) {
                if (positive) total++
                val epId = ep.optInt("id")
                val badge = if (ep.optInt("status") == 13) "泰区会员" else ""
                ep.put("badge", badge)
                ep.put("badge_info", JSONObject().apply {
                    put("bg_color", "#FB7299")
                    put("bg_color_night", "#BB5B76")
                    put("text", badge)
                })
                ep.put("status", 2)
                ep.put("ep_id", epId)
                ep.put("link", "https://www.bilibili.tv/en/play/$seasonId/$epId")
                ep.put("ep_index", eid + 1)
                ep.put("section_index", sid)
                ep.put("cid", epId)
                ep.put("aid", seasonId)
                // We need duration to make sure "GetWorkInfo" works as expected,
                // and make subtitle showing too, but we can't get it from season api,
                // so we fake it.
                ep.put("duration", 1436000)
                ep.optJSONObject("jump")?.let { ep.put("skip", it) }
                ep.optJSONObject("rights")?.run {
                    put("allow_dm", 0)
                    put("area_limit", 1)
                } ?: ep.put("rights", JSONObject().apply {
                    put("allow_demand", 0)
                    put("allow_dm", 0)
                    put("allow_download", 0)
                    put("area_limit", 1)
                })
            }
            module.put("id", sid)
        }
        if (!seasons.isNullOrEmpty()) {
            val newModules = JSONArray()
            JSONObject().apply {
                put("data", JSONObject().apply {
                    put("seasons", seasons.apply {
                        forEach { it.put("season_title", it.optString("quarter_title")) }
                    })
                })
                put("id", 1)
                put("style", "season")
                put("module_style", JSONObject().apply {
                    put("hidden", 0)
                    put("line", 1)
                })
            }.let { newModules.put(it) }
            result.optJSONArray("modules")?.forEach { newModules.put(it) }
            result.put("modules", newModules)
        }
        result.optJSONObject("rights")?.run {
            put("allow_comment", 0)
            put("forbid_pre", optInt("forbidPre"))
            put("only_vip_download", optInt("onlyVipDownload"))
        }
        result.optJSONObject("actor")?.run {
            put("title", optString("title").ifEmpty { "角色声优" })
            put("info", optString("info").trimEnd())
        }
        result.optJSONObject("staff")?.run {
            put("title", optString("title").ifEmpty { "制作信息" })
            put("info", optString("info").trimEnd())
        }
        val views = result.optJSONObject("stat")?.optLong("views") ?: 0
        val play = views.cnCountFormat()
        // fake likes to followers
        val likes = result.optJSONObject("stat")?.optLong("likes") ?: 0
        val followers = likes.cnCountFormat()
        result.put("icon_font", JSONObject().apply {
            put("name", "playdata-square-line@500")
            put("text", play)
        })
        result.optJSONObject("stat")?.run {
            put("followers", followers)
            put("play", play)
        }
        result.optJSONObject("publish")?.run {
            optString("update_info_desc").ifEmpty {
                put("update_info_desc", optString("time_length_show"))
            }
        }
        result.apply {
            remove("stat_format")
            remove("series")
            remove("new_ep")
            put("season_title", result.optString("title"))
            put("show_season_type", result.optInt("type"))
            put("link", "https://www.bilibili.tv/en/play$seasonId")
            put("media_id", seasonId)
            put("total", total)
            put("mode", 2)
        }
    }

    @JvmStatic
    fun getSpace(mid: Long): String? {
        val content = HttpClient.get("$BILI_CARD_URL?mid=$mid")?.json()
            ?: return null
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
}
