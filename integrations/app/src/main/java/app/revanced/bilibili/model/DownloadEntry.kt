package app.revanced.bilibili.model


import app.revanced.bilibili.model.serializer.MillisecondsAsDate
import app.revanced.bilibili.utils.toValidFatFilename
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.Date

@Serializable
data class DownloadEntry(
    @SerialName("media_type")
    val mediaType: Int = 0, // 2
    @SerialName("has_dash_audio")
    val hasDashAudio: Boolean = false, // true
    @SerialName("is_completed")
    val isCompleted: Boolean = false, // true
    @SerialName("total_bytes")
    val totalBytes: Long = 0, // 148271424
    @SerialName("downloaded_bytes")
    val downloadedBytes: Long = 0, // 148271424
    @SerialName("title")
    val title: String = "", // 一口气【利兹与青鸟】
    @SerialName("type_tag")
    val typeTag: String = "", // 112
    @SerialName("cover")
    val cover: String = "", // http://i1.hdslb.com/bfs/archive/0165e91074e95276dcd5f5b785b7be647c80ed88.png
    @SerialName("video_quality")
    val videoQuality: Int = 0, // 112
    @SerialName("prefered_video_quality")
    val preferedVideoQuality: Int = 0, // 112
    @SerialName("guessed_total_bytes")
    val guessedTotalBytes: Long = 0, // 0
    @SerialName("total_time_milli")
    val totalTimeMilli: Int = 0, // 919722
    @SerialName("danmaku_count")
    val danmakuCount: Long = 0, // 537
    @SerialName("time_update_stamp")
    val timeUpdateStamp: MillisecondsAsDate = Date(), // 1722588626101
    @SerialName("time_create_stamp")
    val timeCreateStamp: MillisecondsAsDate = Date(), // 1722588586932
    @SerialName("can_play_in_advance")
    val canPlayInAdvance: Boolean = false, // true
    @SerialName("interrupt_transform_temp_file")
    val interruptTransformTempFile: Boolean = false, // false
    @SerialName("quality_pithy_description")
    val qualityPithyDescription: String = "", // 1080P
    @SerialName("quality_superscript")
    val qualitySuperscript: String = "", // 高码率
    @SerialName("cache_version_code")
    val cacheVersionCode: Int = 0, // 8080002
    @SerialName("preferred_audio_quality")
    val preferredAudioQuality: Int = 0, // 0
    @SerialName("audio_quality")
    val audioQuality: Int = 0, // 0
    @SerialName("avid")
    val avid: Long = 0, // 112647815039054
    @SerialName("spid")
    val spid: Int = 0, // 0
    @SerialName("seasion_id")
    val seasionId: Long = 0, // 0
    @SerialName("bvid")
    val bvid: String = "", // BV12rg5eqE5R
    @SerialName("owner_id")
    val ownerId: Long = 0, // 3546702438992694
    @SerialName("owner_name")
    val ownerName: String = "", // 前天喝面条
    @SerialName("owner_avatar")
    val ownerAvatar: String = "", // https://i0.hdslb.com/bfs/face/fe88250ec637a30a5485e7ed6e4f0626dd8ffa03.jpg
    @SerialName("is_charge_video")
    val isChargeVideo: Boolean = false, // false
    @SerialName("verification_code")
    val verificationCode: Int = 0, // 0
    @SerialName("page_data")
    val pageData: PageData = PageData(),
    @SerialName("season_id")
    val seasonId: Long = 0,
    @SerialName("ep")
    val ep: Ep = Ep()
) {
    @Serializable
    data class PageData(
        @SerialName("cid")
        val cid: Long = 0, // 500001588945587
        @SerialName("page")
        val page: Int = 0, // 1
        @SerialName("from")
        val from: String = "", // vupload
        @SerialName("part")
        val part: String = "", // 1
        @SerialName("link")
        val link: String = "",
        @SerialName("rich_vid")
        val richVid: String = "",
        @SerialName("vid")
        val vid: String = "",
        @SerialName("has_alias")
        val hasAlias: Boolean = false, // false
        @SerialName("tid")
        val tid: Int = 0, // 27
        @SerialName("width")
        val width: Int = 0, // 1920
        @SerialName("height")
        val height: Int = 0, // 1080
        @SerialName("rotate")
        val rotate: Int = 0, // 0
        @SerialName("download_title")
        val downloadTitle: String = "", // 视频已缓存完成
        @SerialName("download_subtitle")
        val downloadSubtitle: String = "" // 一口气【利兹与青鸟】 1
    )

    @Serializable
    data class Ep(
        @SerialName("av_id")
        val avId: Long = 0, // 1656495009
        @SerialName("page")
        val page: Int = 0, // 3
        @SerialName("danmaku")
        val danmaku: Long = 0, // 1625775168
        @SerialName("cover")
        val cover: String = "", // http://i0.hdslb.com/bfs/archive/d19db569ec80d37f44c0c5762710f77565014c0c.jpg
        @SerialName("episode_id")
        val episodeId: Long = 0, // 829607
        @SerialName("index")
        val index: String = "", // 4
        @SerialName("index_title")
        val indexTitle: String = "", // 满溢而出真情
        @SerialName("from")
        val from: String = "", // bangumi
        @SerialName("season_type")
        val seasonType: Int = 0, // 1
        @SerialName("width")
        val width: Int = 0, // 1920
        @SerialName("height")
        val height: Int = 0, // 1080
        @SerialName("rotate")
        val rotate: Int = 0, // 0
        @SerialName("link")
        val link: String = "", // https://www.bilibili.com/bangumi/play/ep829607
        @SerialName("bvid")
        val bvid: String = "", // BV1qE421F7nv
        @SerialName("sort_index")
        val sortIndex: Long = 0 // 1000004
    )
}

val DownloadEntry.isBangumi get() = seasonId > 0

val DownloadEntry.showName: String
    get() = if (isBangumi) {
        val index = ep.index.let { if (it.toLongOrNull() != null) "第${it}话" else it }
        arrayOf(title, index, ep.indexTitle).filterNot { it.isEmpty() }.joinToString("-")
    } else {
        val part = pageData.part
        val isPart = part.isNotEmpty() && title != part && (part.length != 13 || part.toULongOrNull() == null)
        val name = if (isPart) "$title-$part" else title
        name
    }

val DownloadEntry.saveFilename: String
    get() = if (isBangumi) {
        "$showName-${qualityPithyDescription}${qualitySuperscript}-ep${ep.episodeId}".toValidFatFilename()
    } else {
        "$showName-${qualityPithyDescription}${qualitySuperscript}-${bvid.ifEmpty { "av$avid" }}".toValidFatFilename()
    }
