package app.revanced.bilibili.patches.okhttp

import app.revanced.bilibili.api.BrotliInputStream
import app.revanced.bilibili.patches.okhttp.hooks.*
import app.revanced.bilibili.utils.LogHelper
import app.revanced.bilibili.utils.readTextX
import java.io.InputStream
import java.util.zip.DeflaterInputStream
import java.util.zip.GZIPInputStream

@Suppress("unused")
object OkHttpPatch {
    @JvmStatic
    private val hooks = arrayOf(
        BangumiCards,
        BangumiMaterial,
        Eps,
        Media,
        QoeShow,
        Season,
        SeasonRecommend,
        ShareChannels,
        Skin,
        Space,
        Subtitle,
        Upgrade
    )

    @JvmStatic
    fun shouldHook(url: String, code: Int): Boolean {
        LogHelper.debug { "OkHttpPatch.shouldHook, code: %d, url: %s".format(code, url) }
        return hooks.any { it.shouldHook(url, code) }
    }

    @JvmStatic
    fun hook(url: String, code: Int, request: String, response: String): String {
        return hooks.firstOrNull { it.shouldHook(url, code) }
            ?.hook(url, code, request, response) ?: response
    }

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
        }).bufferedReader().use { it.readTextX() }
        val response = (when (respEncoding) {
            "gzip" -> GZIPInputStream(respStream)
            "deflate" -> DeflaterInputStream(respStream)
            "br" -> BrotliInputStream(respStream)
            else -> respStream
        }).bufferedReader().use { it.readTextX() }
        LogHelper.debug { "OkHttpPatch.hook, code: %d, url: %s".format(code, url) }
        LogHelper.debug { "OkHttpPatch.hook, request, encoding: $reqEncoding, content: $request" }
        LogHelper.debug { "OkHttpPatch.hook, response, encoding: $respEncoding, content: $response" }
        return hook(url, code, request, response)
    }
}
