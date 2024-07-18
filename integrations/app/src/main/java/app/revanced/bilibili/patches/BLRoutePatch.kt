package app.revanced.bilibili.patches

import android.net.Uri
import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Logger
import app.revanced.bilibili.utils.Versions
import com.bapis.bilibili.app.view.v1.Relate
import com.bapis.bilibili.app.viewunite.common.RelateCard
import com.bapis.bilibili.app.viewunite.common.RelateCardType

object BLRoutePatch {
    private const val STORY_ROUTER_QUERY = "&-Arouter=story"
    private const val STORY_TYPE_QUERY = "&-Atype=story"
    private val playerPreloadRegex = Regex("&player_preload=[^&]*")

    private fun needRemovePayload(): Boolean {
        return VideoQualityPatch.halfScreenQuality() != 0 || VideoQualityPatch.getMatchedFullScreenQuality() != 0 || Settings.DefaultPlaybackSpeed() != 0f
    }

    @Keep
    @JvmStatic
    fun intercept(uri: Uri?): Uri? {
        if (uri == null) return null
        Logger.debug { "Route uri: $uri" }
        val scheme = uri.scheme
        val url = uri.toString()
        if (Versions.ge8_5_0() && (url.startsWith("https://www.bilibili.com/read")
                    || (url.startsWith("bilibili://article") && uri.pathSegments.size == 1))
        ) {
            val id = uri.lastPathSegment.orEmpty().removePrefix("cv")
            if (id.isNotEmpty() && id.all { it.isDigit() })
                return Uri.Builder().scheme("https")
                    .encodedAuthority("www.bilibili.com")
                    .encodedPath("/opus/$id")
                    .appendQueryParameter("opus_type", "article")
                    .apply {
                        for (name in uri.queryParameterNames)
                            appendQueryParameter(name, uri.getQueryParameter(name))
                        val commentId = uri.fragment.orEmpty().removePrefix("reply")
                        if (commentId.isNotEmpty() && commentId.all { it.isDigit() }) {
                            if (!uri.queryParameterNames.contains("comment_on"))
                                appendQueryParameter("comment_on", "1")
                            if (!uri.queryParameterNames.contains("comment_root_id"))
                                appendQueryParameter("comment_root_id", commentId)
                        }
                    }.build()
        }
        if (scheme == "bilibili") {
            val needRemovePayload = needRemovePayload()
            val authority = uri.encodedAuthority
            if (authority.let { it == "story" || it == "video" }) {
                val newUri = uri.buildUpon()
                if (authority == "story" && Settings.ReplaceStoryVideo())
                    newUri.authority("video")
                var newQuery = uri.encodedQuery
                if (!newQuery.isNullOrEmpty()) {
                    if (Settings.ReplaceStoryVideo())
                        newQuery = newQuery.replace(STORY_ROUTER_QUERY, "")
                            .replace(STORY_TYPE_QUERY, "")
                    if (needRemovePayload)
                        newQuery = newQuery.replace(playerPreloadRegex, "")
                }
                newUri.encodedQuery(newQuery)
                return newUri.build()
            } else if (url.startsWith("bilibili://music/playlist/playpage") && url != "bilibili://music/playlist/playpage/0") {
                val aid = uri.getQueryParameter("aid")
                val pageType = uri.getQueryParameter("page_type")
                val newUri = uri.buildUpon()
                if (needRemovePayload) {
                    val newQuery = uri.encodedQuery.orEmpty().replace(playerPreloadRegex, "")
                    newUri.encodedQuery(newQuery)
                }
                if (Settings.PlayerVersion() == "1") {
                    newUri.appendQueryParameter("force_old_playlist", "1")
                    if (pageType == "10" && !aid.isNullOrEmpty())
                        newUri.encodedAuthority("video").encodedPath(aid)
                }
                return newUri.build()
            } else if (Settings.AddChannel() && url.startsWith("bilibili://pegasus/channel/v2")) {
                // for hd, consistent with the default behavior of selecting "select" tab before deleting the "topic" tab
                if (uri.getQueryParameter("tab").isNullOrEmpty())
                    return uri.buildUpon().appendQueryParameter("tab", "select").build()
            }
        } else if (scheme == "https") {
            if (url.startsWith("https://www.bilibili.com/bangumi/play")) {
                if (needRemovePayload())
                    return Uri.parse(url.replace(playerPreloadRegex, ""))
            } else if (Settings.ReplaceStoryVideo() && url.startsWith("https://www.bilibili.com/video")) {
                return Uri.parse(url.replace(STORY_ROUTER_QUERY, "").replace(STORY_TYPE_QUERY, ""))
            } else if (Settings.DefaultMaxQn() && url.startsWith("https://live.bilibili.com")) {
                val lastPathSegment = uri.pathSegments.singleOrNull()
                if (!lastPathSegment.isNullOrEmpty() && lastPathSegment.all { it.isDigit() }) {
                    val builder = uri.buildUpon().clearQuery()
                    for (name in uri.queryParameterNames) {
                        if (name != "current_quality" && !name.contains("current_qn") && !name.contains("playurl")) {
                            val value = uri.getQueryParameter(name)
                            builder.appendQueryParameter(name, value)
                        }
                    }
                    return builder.build()
                }
            }
        }
        return uri
    }

    fun removePayloadIfNeeded(cards: List<Relate>) {
        if (!needRemovePayload()) return
        for (card in cards) {
            if (card.goto == "av") {
                card.uri = card.uri.replace(playerPreloadRegex, "")
            }
        }
    }

    fun removePayloadUniteIfNeeded(cards: List<RelateCard>) {
        if (!needRemovePayload()) return
        for (card in cards) {
            if (card.relateCardType == RelateCardType.AV) {
                val basicInfo = card.basicInfo
                basicInfo.uri = basicInfo.uri.replace(playerPreloadRegex, "")
            }
        }
    }
}
