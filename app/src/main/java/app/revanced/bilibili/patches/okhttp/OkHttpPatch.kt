package app.revanced.bilibili.patches.okhttp

import android.util.Pair
import androidx.annotation.Keep
import app.revanced.bilibili.api.BrotliInputStream
import app.revanced.bilibili.patches.okhttp.hooks.*
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import java.io.InputStream
import java.util.zip.DeflaterInputStream
import java.util.zip.GZIPInputStream

@Suppress("unused")
object OkHttpPatch {
    @JvmStatic
    private val hooks = arrayOf(
        AssSubtitle,
        BangumiCards,
        BangumiMaterial,
        Eps,
        HistoryReport,
        Media,
        QoeShow,
        RoomPlayInfo,
        SearchAll,
        SearchByType,
        Season,
        SeasonRecommend,
        ShareChannels,
        Skin,
        Space,
        Subtitle,
        UnlockPGCPlayViewForPlay,
        UnlockEpisodesForPlay,
        Upgrade,
    )

    @Keep
    @JvmStatic
    fun shouldHook(url: String, code: Int): Boolean {
        LogHelper.debug { "OkHttpPatch.shouldHook, code: %d, url: %s".format(code, url) }
        return (code == 200 && Settings.DEBUG.boolean) || hooks.any { it.shouldHook(url, code) }
    }

    @JvmStatic
    fun hook(url: String, code: Int, request: String, response: String): String {
        return hooks.firstOrNull { it.shouldHook(url, code) }
            ?.hook(url, code, request, response) ?: response
    }

    @Keep
    @JvmStatic
    fun hook(
        url: String,
        code: Int,
        reqEncoding: String?,
        reqStream: InputStream,
        respEncoding: String?,
        respStream: InputStream
    ): String {
        val request = if (reqStream.available() == 0) {
            ""
        } else (when (reqEncoding) {
            "gzip" -> GZIPInputStream(reqStream)
            "deflate" -> DeflaterInputStream(reqStream)
            "br" -> BrotliInputStream(reqStream)
            else -> reqStream
        }).bufferedReader().use { it.readText() }
        val response = (when (respEncoding) {
            "gzip" -> GZIPInputStream(respStream)
            "deflate" -> DeflaterInputStream(respStream)
            "br" -> BrotliInputStream(respStream)
            else -> respStream
        }).bufferedReader().use { it.readText() }
        LogHelper.debug { "OkHttpPatch.hook, code: %d, url: %s".format(code, url) }
        LogHelper.debug { "OkHttpPatch.hook, request, encoding: $reqEncoding, content: $request" }
        LogHelper.debug { "OkHttpPatch.hook, response, encoding: $respEncoding, content: $response" }
        return hook(url, code, request, response)
    }

    @Keep
    @JvmStatic
    fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        return hooks.find { it.shouldHookBefore(url, headers) }
            ?.hookBefore(url, headers) ?: Pair.create(url, headers)
    }
}
