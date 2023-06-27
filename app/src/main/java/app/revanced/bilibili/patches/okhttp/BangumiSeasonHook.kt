package app.revanced.bilibili.patches.okhttp

import android.net.Uri
import app.revanced.bilibili.api.BiliRoamingApi.getAreaSearchBangumi
import app.revanced.bilibili.api.BiliRoamingApi.getThaiSeason
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.pagination.PaginationReply
import com.bapis.bilibili.polymer.app.search.v1.*
import com.bilibili.lib.moss.api.MossResponseHandler
import com.bilibili.search.ogv.OgvSearchResultFragment
import com.bilibili.search.result.pages.BiliMainSearchResultPage.PageTypes
import org.json.JSONArray
import org.json.JSONObject
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

    private const val FAIL_CODE = -404
    private val originalPageTypes by lazy { PageTypes.`$VALUES` }

    private val searchTypes = mapOf(
        931 to SearchType(Area.CN, "陆(影)", "8", "movie"),
        364364 to SearchType(Area.HK, "港(影)", "8", "movie"),
        889464 to SearchType(Area.TW, "台(影)", "8", "movie"),
        114 to SearchType(Area.TH, "泰", "7", "bangumi"),
        514 to SearchType(Area.CN, "陆", "7", "bangumi"),
        1919 to SearchType(Area.HK, "港", "7", "bangumi"),
        810 to SearchType(Area.TW, "台", "7", "bangumi")
    )

    init {
        Settings.registerPreferenceChangeListener { _, key ->
            if (key == Settings.SEARCH_BANGUMI.key || key == Settings.SEARCH_MOVIE.key
                || key == Settings.CN_SERVER_ACCESS_KEY.key || key == Settings.HK_SERVER_ACCESS_KEY.key
                || key == Settings.TW_SERVER_ACCESS_KEY.key || key == Settings.TH_SERVER_ACCESS_KEY.key
            ) injectExtraSearchTypes()
        }
    }

    @JvmStatic
    fun unlockBangumi(url: String, response: String): String {
        if (!Settings.UNLOCK_AREA_LIMIT.boolean)
            return response
        val jo = response.toJSONObject()
        val code = jo.optInt("code")
        val data = jo.optJSONObject("data")
        if (code == FAIL_CODE || data == null) {
            return unlockThaiBangumi(url, response)
        } else if (code != 0) {
            return response
        }
        lastSeasonInfo.clear()
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
        if (episode.has("cid") && episode.has("id")) {
            val cid = episode.optInt("cid").toString()
            val epId = episode.optInt("id").toString()
            lastSeasonInfo[cid] = epId
            lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
        }
        Settings.CN_SERVER_ACCESS_KEY.string.ifEmpty { return }
        if (episode.optInt("status") == 13)
            episode.put("status", 2)
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
        val (newCode, newResult) = getThaiSeason(lastSeasonInfo)?.toJSONObject()?.let {
            it.optInt("code", FAIL_CODE) to it.optJSONObject("result")
        } ?: (FAIL_CODE to null)
        if (isBangumiWithWatchPermission(newResult, newCode)) {
            val seasonId = newResult.optString("season_id")
            lastSeasonInfo["title"] = newResult.optString("title")
            lastSeasonInfo["season_id"] = seasonId
            newResult.optJSONObject("rights")?.apply {
                if (has("allow_comment") && getInt("allow_comment") == 0) {
                    remove("allow_comment")
                    put("area_limit", 1)
                    lastSeasonInfo["allow_comment"] = "0"
                }
            }
            for (episode in newResult.optJSONArray("episodes").orEmpty()) {
                onEachThaiEpisode(episode)
                if (episode.has("cid") && episode.has("id")) {
                    val cid = episode.optInt("cid").toString()
                    val epId = episode.optInt("id").toString()
                    lastSeasonInfo[cid] = epId
                    lastSeasonInfo["ep_ids"] = lastSeasonInfo["ep_ids"]?.let { "$it;$epId" } ?: epId
                    episode.optJSONArray("subtitles")?.takeIf { it.length() > 0 }?.let {
                        subtitlesCache.compute(seasonId) { _, v ->
                            (v ?: hashMapOf()).apply { this[cid] = it }
                        }
                    }
                }
            }
            newResult.optJSONArray("modules").orEmpty().asSequence<JSONObject>().flatMap {
                it.optJSONObject("data")?.optJSONArray("episodes").orEmpty()
                    .asSequence<JSONObject>()
            }.forEach(::onEachThaiEpisode)
            newResult.optJSONArray("prevueSection").orEmpty().asSequence<JSONObject>().flatMap {
                it.optJSONArray("episodes").orEmpty().asSequence<JSONObject>()
            }.forEach(::onEachThaiEpisode)
            if (Settings.ALLOW_DOWNLOAD.boolean) {
                newResult.optJSONObject("rights")?.run {
                    put("allow_download", 1)
                    put("only_vip_download", 0)
                }
            }
            if (Settings.CN_SERVER_ACCESS_KEY.string.isNotEmpty())
                if (newResult.optInt("status") == 13)
                    newResult.put("status", 2)
        }
        return newResult?.let {
            JSONObject().apply {
                put("code", 0)
                put("data", it)
            }.toString()
        } ?: response
    }

    @OptIn(ExperimentalContracts::class)
    private fun isBangumiWithWatchPermission(newResult: JSONObject?, code: Int): Boolean {
        contract { returns(true) implies (newResult != null) }
        return newResult?.optJSONObject("rights")?.run {
            !optBoolean("area_limit", true) || optInt("area_limit", 1) == 0
        } ?: run { code != FAIL_CODE && newResult != null }
    }

    private fun onEachThaiEpisode(episode: JSONObject) {
        if (Settings.ALLOW_DOWNLOAD.boolean)
            episode.optJSONObject("rights")
                ?.put("allow_download", 1)
        Settings.CN_SERVER_ACCESS_KEY.string.ifEmpty { return }
        if (episode.optInt("status") == 13)
            episode.put("status", 2)
    }

    @JvmStatic
    fun searchAllResponseHook(reply: SearchAllResponse) {
        addAreaTags(reply)
        filterSearchResult(reply)
    }

    @JvmStatic
    fun injectExtraSearchTypes() {
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
    fun handleExtraSearch(
        request: SearchByTypeRequest,
        handler: MossResponseHandler<Any>
    ): Boolean {
        val searchType = searchTypes[request.type] ?: return false
        val area = searchType.area
        val type = searchType.type
        Utils.async {
            val result = retrieveExtraSearch(request, area, type)
            if (result != null) {
                handler.onNext(result)
                handler.onCompleted()
            } else {
                handler.onError(null)
            }
        }
        return true
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

        fun ReasonStyle.Builder.reconstructFrom(json: JSONObject) = json.run {
            text = optString("text")
            textColor = optString("text_color")
            textColorNight = optString("text_color_night")
            bgColor = optString("bg_color")
            bgColorNight = optString("bg_color_night")
            borderColor = optString("border_color")
            borderColorNight = optString("border_color_night")
            bgStyle = optInt("bg_style")
        }

        fun Episode.Builder.reconstructFrom(json: JSONObject) = json.run {
            uri = optString("uri")
            param = optString("param")
            index = optString("index")
            for (badge in optJSONArray("badges").orEmpty())
                addBadges(ReasonStyle.newBuilder().apply { reconstructFrom(badge) }.build())
            position = optInt("position")
        }

        fun EpisodeNew.Builder.reconstructFrom(json: JSONObject) = json.run {
            title = optString("title")
            uri = optString("uri")
            param = optString("param")
            isNew = optInt("is_new")
            for (badge in optJSONArray("badges").orEmpty())
                addBadges(ReasonStyle.newBuilder().apply { reconstructFrom(badge) }.build())
            this@reconstructFrom.type = optInt("type")
            position = optInt("position")
            cover = optString("cover")
            label = optString("label")
        }

        fun WatchButton.Builder.reconstructFrom(json: JSONObject) = json.run {
            title = optString("title")
            link = optString("link")
        }

        fun CheckMore.Builder.reconstructFrom(json: JSONObject) = json.run {
            content = optString("content")
            uri = optString("uri")
        }

        fun FollowButton.Builder.reconstructFrom(json: JSONObject) = json.run {
            icon = optString("icon")
            optJSONObject("texts")?.let { o ->
                o.keys().asSequence().associateWith { o.opt(it)?.toString() ?: "" }
            }?.let { putAllTexts(it) }
            statusReport = optString("status_report")
        }

        fun SearchBangumiCard.Builder.reconstructFrom(json: JSONObject) = json.run {
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
            seasonTypeName = optString("season_type_name")
            for (episode in optJSONArray("episodes").orEmpty())
                addEpisodes(Episode.newBuilder().apply { reconstructFrom(episode) }.build())
            isSelection = optInt("is_selection")
            isAtten = optInt("is_atten")
            label = optString("label")
            seasonId = optLong("season_id")
            outName = optString("out_name")
            outIcon = optString("out_icon")
            outUrl = optString("out_url")
            for (badge in optJSONArray("badges").orEmpty())
                addBadges(ReasonStyle.newBuilder().apply { reconstructFrom(badge) }.build())
            isOut = optInt("is_out")
            for (episodeNew in optJSONArray("episodes_new").orEmpty())
                addEpisodesNew(EpisodeNew.newBuilder().apply { reconstructFrom(episodeNew) }
                    .build())
            optJSONObject("watch_button")?.let {
                watchButton = WatchButton.newBuilder().apply { reconstructFrom(it) }.build()
            }
            selectionStyle = optString("selection_style")
            optJSONObject("check_more")?.let {
                checkMore = CheckMore.newBuilder().apply { reconstructFrom(it) }.build()
            }
            optJSONObject("follow_button")?.let {
                followButton = FollowButton.newBuilder().apply { reconstructFrom(it) }.build()
            }
            optJSONObject("style_label")?.let {
                styleLabel = ReasonStyle.newBuilder().apply { reconstructFrom(it) }.build()
            }
            for (badgeV2 in optJSONArray("badges_v2").orEmpty())
                addBadgesV2(ReasonStyle.newBuilder().apply { reconstructFrom(badgeV2) }.build())
            stylesV2 = optString("styles_v2")
        }

        fun Item.Builder.reconstructFrom(json: JSONObject) = json.run {
            uri = optString("uri")
            param = optString("param")
            goto = optString("goto")
            linktype = optString("link_type")
            position = optInt("position")
            trackid = optString("track_id")
            bangumi = SearchBangumiCard.newBuilder().apply { reconstructFrom(json) }.build()
        }

        val pages = newData.optInt("pages")
        var page = pn.toIntOrNull() ?: 1
        val response = SearchByTypeResponse.newBuilder().apply {
            this.pages = pages
            this.keyword = keyword
            for (json in newData.optJSONArray("items").orEmpty()) {
                if (json.optInt("Offset", -1) != -1)
                    json.remove("follow_button")
                addItems(Item.newBuilder().apply { reconstructFrom(json) }.build())
            }
            if (page < pages)
                pagination = PaginationReply.newBuilder()
                    .apply { next = (++page).toString() }.build()
        }.build()
        return response
    }

    @JvmStatic
    fun onOgvSearchResultFragmentVisible(fragment: OgvSearchResultFragment) {
        val from = fragment.arguments?.getString("from") ?: return
        for (type in searchTypes) {
            if (type.value.area.value == from && fragment.typeForBiliRoaming == type.value.type.toInt()) {
                fragment.typeForBiliRoaming = type.key
                break
            }
        }
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
                val nav = Nav.newBuilder()
                    .setName(searchType.value.text)
                    .setType(searchType.key)
                    .build()
                SearchAllResponseEx.addNav(reply, 1, nav)
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
        val toRemoveIndexes = mutableListOf<Int>()
        reply.itemList.forEachIndexed { index, item ->
            if (filterTypes.any { item.linktype.contains(it) })
                toRemoveIndexes.add(index)
        }
        toRemoveIndexes.asReversed().forEach {
            SearchAllResponseEx.removeItem(reply, it)
        }
    }
}
