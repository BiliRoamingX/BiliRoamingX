package app.revanced.bilibili.patches.okhttp

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.net.Uri
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.Keep
import androidx.fragment.app.Fragment
import app.revanced.bilibili.api.BiliRoamingApi.getAreaSearchBangumi
import app.revanced.bilibili.api.BiliRoamingApi.getSeason
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.pagination.PaginationReply
import com.bapis.bilibili.polymer.app.search.v1.*
import com.bilibili.lib.moss.api.BusinessException
import com.bilibili.search.ogv.OgvSearchResultFragment
import com.bilibili.search.result.bangumi.ogv.BangumiSearchResultFragment
import com.bilibili.search.result.pages.BiliMainSearchResultPage.PageTypes
import com.bilibili.search2.result.pages.BiliMainSearchResultPage
import org.json.JSONArray
import org.json.JSONObject
import java.lang.ref.WeakReference
import java.net.URL
import java.util.Locale
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

data class SearchType(val area: Area, val text: String, val type: String, val typeStr: String)

object BangumiSeasonHook {
    @JvmStatic
    val lastSeasonInfo = hashMapOf<String, String?>()

    @JvmStatic
    val seasonAreasCache = object : LinkedHashMap<String, Area>(8, 1.0F, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<String, Area>): Boolean {
            return size > 6
        }
    }

    @JvmStatic
    val subtitlesCache = object : LinkedHashMap<String, HashMap<String, JSONArray>>(8, 1.0F, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<String, HashMap<String, JSONArray>>): Boolean {
            return size > 6
        }
    }

    @JvmStatic
    val clipInfoCache = object : LinkedHashMap<String, HashMap<String, JSONObject>>(8, 1.0F, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<String, HashMap<String, JSONObject>>): Boolean {
            return size > 6
        }
    }

    const val FAIL_CODE = -404
    private val originalPageTypes by lazy { PageTypes.`$VALUES` }
    private val originalPageTypesV2 by lazy { BiliMainSearchResultPage.PageTypes.`$VALUES` }

    private var invalidFragmentRef = WeakReference<Fragment>(null)

    private val searchTypes = mapOf(
        931 to SearchType(Area.CN, "陆(影)", "8", "movie"),
        364364 to SearchType(Area.HK, "港(影)", "8", "movie"),
        889464 to SearchType(Area.TW, "台(影)", "8", "movie"),
        114 to SearchType(Area.TH, "泰", "7", "bangumi"),
        514 to SearchType(Area.CN, "陆", "7", "bangumi"),
        1919 to SearchType(Area.HK, "港", "7", "bangumi"),
        810 to SearchType(Area.TW, "台", "7", "bangumi")
    )

    const val overseaTestParams =
        "cid=120453316&ep_id=285145&otype=json&fnval=16&module=pgc&platform=android&test=true"
    const val mainlandTestParams =
        "cid=13073143&ep_id=100615&otype=json&fnval=16&module=pgc&platform=android&test=true"

    init {
        Settings.registerPreferenceChangeListener { _, key ->
            if (key == Settings.SEARCH_BANGUMI.key || key == Settings.SEARCH_MOVIE.key
                || key == Settings.CN_SERVER.key || key == Settings.HK_SERVER.key
                || key == Settings.TW_SERVER.key || key == Settings.TH_SERVER.key
            ) {
                injectExtraSearchTypes()
                injectExtraSearchTypesV2()
            }
        }
    }

    @JvmStatic
    fun unlockBangumi(url: String, response: String): String {
        val jo = response.toJSONObject()
        val code = jo.optInt("code")
        val data = jo.optJSONObject("data")
        if (Settings.UNLOCK_AREA_LIMIT.boolean && (code == FAIL_CODE || data == null)) {
            return unlockThaiBangumi(url, response)
        } else if (data == null || code != 0) {
            return response
        }
        lastSeasonInfo.clear()
        if (Settings.BLOCK_BANGUMI_PAGE_ADS.boolean)
            data.put("activity_entrance", JSONArray())
        if (Settings.BLOCK_ACTIVITY_TAB.boolean)
            data.remove("activity_tab")
        if (!Settings.UNLOCK_AREA_LIMIT.boolean)
            return jo.toString()
        lastSeasonInfo["title"] = data.optString("title")
        lastSeasonInfo["season_id"] = data.optString("season_id")
        data.optJSONObject("rights")?.run {
            put("area_limit", 0)
            if (Settings.ALLOW_DOWNLOAD.boolean) {
                put("allow_download", 1)
                put("only_vip_download", 0)
            }
        }
        data.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
            it.optJSONObject("data")?.optJSONArray("episodes").orEmpty().asSequence<JSONObject>()
        }.forEach(::onEachEpisode)
        return jo.toString()
    }

    private fun onEachEpisode(episode: JSONObject) {
        val badge = episode.optString("badge")
        val badgeInfo = episode.optJSONObject("badge_info")
        val badgeInfoText = badgeInfo?.optString("text")
        if (badge != badgeInfoText) {
            badgeInfo?.run {
                put("bg_color", "#FB7299")
                put("bg_color_night", "#BB5B76")
                put("text", badge)
            }
        }
        episode.optJSONObject("rights")?.run {
            put("area_limit", 0)
            put("allow_dm", 1)
            if (Settings.ALLOW_DOWNLOAD.boolean)
                put("allow_download", 1)
        }
        if (episode.has("ep_id")) {
            val epId = episode.optString("ep_id")
            lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
        }
    }

    private fun unlockThaiBangumi(url: String, response: String): String {
        Uri.parse(url)?.run {
            getQueryParameter("ep_id")?.let {
                lastSeasonInfo.clear()
                lastSeasonInfo["ep_id"] = it
            }
            getQueryParameter("season_id")?.let {
                lastSeasonInfo.clear()
                lastSeasonInfo["season_id"] = it
            }
        }
        LogHelper.info { "Info: $lastSeasonInfo" }
        val (newCode, newResult) = getSeason(lastSeasonInfo)?.toJSONObject()?.let {
            it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
        } ?: (FAIL_CODE to null)
        LogHelper.debug { "unlockThaiBangumi, old, newCode: $newCode, newResult: $newResult" }
        if (isBangumiWithWatchPermission(newResult, newCode)) {
            val seasonId = newResult.optString("season_id")
            lastSeasonInfo["title"] = newResult.optString("title")
            lastSeasonInfo["season_id"] = seasonId
            newResult.optJSONObject("rights")?.apply {
                if (has("allow_comment") && getInt("allow_comment") == 0) {
                    remove("allow_comment")
                    put("area_limit", 1)
                    lastSeasonInfo["allow_comment"] = "0"
                    setCommentInvalidFragmentContent()
                }
            }
            newResult.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
                it.optJSONObject("data")?.optJSONArray("episodes").orEmpty()
                    .asSequence<JSONObject>()
            }.forEach { onEachThaiEpisode(it, seasonId) }
            if (Settings.ALLOW_DOWNLOAD.boolean) {
                newResult.optJSONObject("rights")?.run {
                    put("allow_download", 1)
                    put("only_vip_download", 0)
                }
            }
        }
        return newResult?.let {
            JSONObject().apply {
                put("code", 0)
                put("data", it)
            }.toString()
        } ?: response
    }

    @OptIn(ExperimentalContracts::class)
    fun isBangumiWithWatchPermission(newResult: JSONObject?, code: Int): Boolean {
        contract { returns(true) implies (newResult != null) }
        return newResult?.optJSONObject("rights")?.run {
            !optBoolean("area_limit", true) || optInt("area_limit", 1) == 0
        } ?: run { code != FAIL_CODE && newResult != null }
    }

    private fun onEachThaiEpisode(episode: JSONObject, seasonId: String) {
        if (Settings.ALLOW_DOWNLOAD.boolean)
            episode.optJSONObject("rights")
                ?.put("allow_download", 1)
        if (episode.has("ep_id")) {
            val epId = episode.optString("ep_id")
            lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
            episode.optJSONArray("subtitles")?.takeIf { it.length() > 0 }?.let {
                subtitlesCache.compute(seasonId) { _, v ->
                    (v ?: hashMapOf()).apply { this[epId] = it }
                }
            }
            episode.optJSONObject("jump")?.let {
                clipInfoCache.compute(seasonId) { _, v ->
                    (v ?: hashMapOf()).apply { this[epId] = it }
                }
            }
        }
    }

    @JvmStatic
    fun searchAllResponseHook(reply: SearchAllResponse) {
        addAreaTags(reply)
        filterSearchResult(reply)
    }

    @JvmStatic
    fun injectExtraSearchTypes() {
        if (Versions.ge7_64_0()) return
        if (!Settings.SEARCH_BANGUMI.boolean && !Settings.SEARCH_MOVIE.boolean) {
            PageTypes.`$VALUES` = originalPageTypes
            return
        }
        val originalPageType = originalPageTypes
        val extraTypes = searchTypes.mapNotNull { type ->
            val area = type.value.area
            val typeStr = type.value.typeStr
            if (Settings.getServerByArea(area).isNotEmpty()
                && Settings.getExtraSearchByType(typeStr)
            ) PageTypes(
                "PAGE_" + typeStr.uppercase(Locale.getDefault()), 4,
                "bilibili://search-result/new-$typeStr?from=$area",
                type.key, typeStr
            ) else null
        }
        val newPageTypes = originalPageType + extraTypes
        PageTypes.`$VALUES` = newPageTypes
    }

    @JvmStatic
    fun injectExtraSearchTypesV2() {
        if (!Versions.ge7_39_0()) return
        if (!Settings.SEARCH_BANGUMI.boolean && !Settings.SEARCH_MOVIE.boolean) {
            BiliMainSearchResultPage.PageTypes.`$VALUES` = originalPageTypesV2
            return
        }
        val originalPageType = originalPageTypesV2
        val extraTypes = searchTypes.mapNotNull { type ->
            val area = type.value.area
            val typeStr = type.value.typeStr
            if (Settings.getServerByArea(area).isNotEmpty()
                && Settings.getExtraSearchByType(typeStr)
            ) BiliMainSearchResultPage.PageTypes(
                "PAGE_" + typeStr.uppercase(Locale.getDefault()), 4,
                "bilibili://search-result/new-$typeStr?from=$area",
                type.key, typeStr
            ) else null
        }
        val newPageTypes = originalPageType + extraTypes
        BiliMainSearchResultPage.PageTypes.`$VALUES` = newPageTypes
    }

    fun extraSearchHandleable(request: SearchByTypeRequest): Boolean {
        return searchTypes.containsKey(request.type)
    }

    @JvmStatic
    fun handleExtraSearch(
        request: SearchByTypeRequest,
    ): SearchByTypeResponse {
        val searchType = searchTypes[request.type]!!
        val area = searchType.area
        val type = searchType.type
        return retrieveExtraSearch(request, area, type)
            ?: throw BusinessException(-1, "搜索失败，请重试", null, null, null)
    }

    private fun retrieveExtraSearch(
        request: SearchByTypeRequest,
        area: Area,
        type: String
    ): SearchByTypeResponse? {
        val pn = request.pagination.next.ifEmpty { "1" }
        val ps = request.pagination.pageSize
        val keyword = request.keyword
        val query = mapOf(
            "access_key" to Utils.getAccessKey(),
            "fnval" to request.playerArgs.fnval.toString(),
            "fnver" to request.playerArgs.fnver.toString(),
            "qn" to request.playerArgs.qn.toString(),
            "pn" to pn,
            "ps" to ps.toString(),
            "keyword" to keyword,
        )
        val jsonContent = getAreaSearchBangumi(query, area, type)?.toJSONObject()
            ?: return null
        checkErrorToast(jsonContent, true)
        val newData = jsonContent.optJSONObject("data") ?: return null

        fun ReasonStyle.reconstructFrom(json: JSONObject) = json.run {
            text = optString("text")
            textColor = optString("text_color")
            textColorNight = optString("text_color_night")
            bgColor = optString("bg_color")
            bgColorNight = optString("bg_color_night")
            borderColor = optString("border_color")
            borderColorNight = optString("border_color_night")
            bgStyle = optInt("bg_style")
        }

        fun Episode.reconstructFrom(json: JSONObject, seasonId: Long) = json.run {
            uri = Uri.parse(optString("uri")).buildUpon()
                .appendQueryParameter("season_id", seasonId.toString()).toString()
            param = optString("param")
            index = optString("index")
            for (badge in optJSONArray("badges").orEmpty())
                addBadges(ReasonStyle().apply { reconstructFrom(badge) })
            position = optInt("position")
        }

        fun EpisodeNew.reconstructFrom(json: JSONObject, seasonId: Long) = json.run {
            title = optString("title")
            uri = Uri.parse(optString("uri")).buildUpon()
                .appendQueryParameter("season_id", seasonId.toString()).toString()
            param = optString("param")
            isNew = optInt("is_new")
            for (badge in optJSONArray("badges").orEmpty())
                addBadges(ReasonStyle().apply { reconstructFrom(badge) })
            this@reconstructFrom.type = optInt("type")
            position = optInt("position")
            cover = optString("cover")
            label = optString("label")
        }

        fun WatchButton.reconstructFrom(json: JSONObject) = json.run {
            title = optString("title")
            link = optString("link")
        }

        fun CheckMore.reconstructFrom(json: JSONObject) = json.run {
            content = optString("content")
            uri = optString("uri")
        }

        fun FollowButton.reconstructFrom(json: JSONObject) = json.run {
            icon = optString("icon")
            optJSONObject("texts")?.let { o ->
                o.keys().asSequence().associateWith { o.opt(it)?.toString() ?: "" }
            }?.let { mutableTextsMap.putAll(it) }
            statusReport = optString("status_report")
        }

        fun SearchBangumiCard.reconstructFrom(json: JSONObject) = json.run {
            title = optString("title")
            cover = optString("cover")
            mediaType = optInt("media_type")
            playState = optInt("play_state")
            this@reconstructFrom.area = optString("area")
            style = optString("style")
            styles = optString("styles")
            cv = optString("cv")
            rating = optDouble("rating")
            vote = optInt("vote")
            target = optString("target")
            staff = optString("staff")
            prompt = optString("prompt")
            ptime = optLong("ptime")
            val seasonId = optLong("season_id")
            seasonTypeName = optString("season_type_name")
            for (episode in optJSONArray("episodes").orEmpty())
                addEpisodes(Episode().apply { reconstructFrom(episode, seasonId) })
            isSelection = optInt("is_selection")
            isAtten = optInt("is_atten")
            label = optString("label")
            this@reconstructFrom.seasonId = seasonId
            outName = optString("out_name")
            outIcon = optString("out_icon")
            outUrl = optString("out_url")
            for (badge in optJSONArray("badges").orEmpty())
                addBadges(ReasonStyle().apply { reconstructFrom(badge) })
            isOut = optInt("is_out")
            for (episodeNew in optJSONArray("episodes_new").orEmpty())
                addEpisodesNew(EpisodeNew().apply { reconstructFrom(episodeNew, seasonId) })
            optJSONObject("watch_button")?.let {
                watchButton = WatchButton().apply { reconstructFrom(it) }
            }
            selectionStyle = optString("selection_style")
            optJSONObject("check_more")?.let {
                checkMore = CheckMore().apply { reconstructFrom(it) }
            }
            optJSONObject("follow_button")?.let {
                followButton = FollowButton().apply { reconstructFrom(it) }
            }
            optJSONObject("style_label")?.let {
                styleLabel = ReasonStyle().apply { reconstructFrom(it) }
            }
            for (badgeV2 in optJSONArray("badges_v2").orEmpty())
                addBadgesV2(ReasonStyle().apply { reconstructFrom(badgeV2) })
            stylesV2 = optString("styles_v2")
        }

        fun Item.reconstructFrom(json: JSONObject) = json.run {
            uri = optString("uri")
            param = optString("param")
            goto = optString("goto")
            linktype = optString("link_type")
            position = optInt("position")
            trackid = optString("track_id")
            bangumi = SearchBangumiCard().apply { reconstructFrom(json) }
        }

        val pages = newData.optInt("pages")
        var page = pn.toIntOrNull() ?: 1
        val response = SearchByTypeResponse().apply {
            this.pages = pages
            this.keyword = keyword
            for (json in newData.optJSONArray("items").orEmpty()) {
                if (json.optInt("Offset", -1) != -1)
                    json.remove("follow_button")
                addItems(Item().apply { reconstructFrom(json) })
            }
            if (page < pages)
                pagination = PaginationReply().apply { next = (++page).toString() }
        }
        return response
    }

    @Keep
    @JvmStatic
    fun onSearchResultFragmentVisible(fragment: OgvSearchResultFragment) {
        val from = fragment.arguments?.getString("from") ?: return
        for (type in searchTypes) {
            if (type.value.area.value == from && fragment.typeForBiliRoaming == type.value.type.toInt()) {
                fragment.typeForBiliRoaming = type.key
                break
            }
        }
    }

    @Keep
    @JvmStatic
    fun onSearchResultFragmentVisible(fragment: com.bilibili.search2.ogv.OgvSearchResultFragment) {
        val from = fragment.arguments?.getString("from") ?: return
        for (type in searchTypes) {
            if (type.value.area.value == from && fragment.typeForBiliRoaming == type.value.type.toInt()) {
                fragment.typeForBiliRoaming = type.key
                break
            }
        }
    }

    @Keep
    @JvmStatic
    fun onSearchResultFragmentVisible(fragment: BangumiSearchResultFragment) {
        val from = fragment.arguments?.getString("from") ?: return
        for (type in searchTypes) {
            if (type.value.area.value == from && fragment.typeForBiliRoaming == type.value.type.toInt()) {
                fragment.typeForBiliRoaming = type.key
                break
            }
        }
    }

    @JvmStatic
    fun setCommentInvalidFragmentContent() {
        Utils.runOnMainThread {
            invalidFragmentRef.get()?.let {
                onCommentInvalidFragmentViewCreated(it)
            }
        }
    }

    @Keep
    @SuppressLint("SetTextI18n")
    @JvmStatic
    fun onCommentInvalidFragmentViewCreated(fragment: Fragment): Boolean {
        invalidFragmentRef = WeakReference(fragment)
        val view = fragment.view ?: return false
        if (lastSeasonInfo["allow_comment"] != "0") return false
        view.findView<TextView>("info").run {
            gravity = Gravity.CENTER
            text = "由于泰区番剧评论会串到其他正常视频中\n因而禁止泰区评论"
        }
        val forbidIcon = view.findView<ImageView>("forbid_icon")
        Utils.async {
            runCatchingOrNull {
                URL("https://i0.hdslb.com/bfs/app-res/android/img_holder_forbid_style1.webp")
                    .openStream().let { BitmapFactory.decodeStream(it) }
            }?.let {
                Utils.runOnMainThread { forbidIcon.setImageBitmap(it) }
            }
        }
        return true
    }

    private fun addAreaTags(reply: SearchAllResponse) {
        if (!Settings.SEARCH_BANGUMI.boolean && !Settings.SEARCH_MOVIE.boolean) return
        val currentArea = country
        for (searchType in searchTypes) {
            val area = searchType.value.area
            val typeStr = searchType.value.typeStr
            if (area == currentArea)
                continue
            if (Settings.getServerByArea(area).isNotEmpty()
                && Settings.getExtraSearchByType(typeStr)
            ) {
                val nav = Nav().apply {
                    name = searchType.value.text
                    type = searchType.key
                }
                reply.addNav(1, nav)
            }
        }
    }

    private fun filterSearchResult(reply: SearchAllResponse) {
        val set = Settings.FILTER_SEARCH_TYPE.stringSet
            .takeUnless { it.isEmpty() } ?: return
        val filterTypes = set.toMutableList()
        if (filterTypes.contains("bangumi")) {
            filterTypes.remove("bangumi")
            filterTypes.add("ogv_pgc")
            filterTypes.add("bgm_media")
        }
        if (filterTypes.contains("ad"))
            filterTypes.add("product")
        val toRemoveIndexes = mutableListOf<Int>()
        reply.itemList.forEachIndexed { index, item ->
            if (filterTypes.any { item.linktype.contains(it) })
                toRemoveIndexes.add(index)
        }
        toRemoveIndexes.asReversed().forEach {
            reply.removeItem(it)
        }
    }
}
