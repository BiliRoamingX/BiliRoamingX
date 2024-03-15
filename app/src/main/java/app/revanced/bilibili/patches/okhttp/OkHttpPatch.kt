package app.revanced.bilibili.patches.okhttp

import android.net.Uri
import android.util.Pair
import androidx.annotation.Keep
import app.revanced.bilibili.api.BrotliInputStream
import app.revanced.bilibili.patches.okhttp.hooks.*
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
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
        HistoryReport,
        Media,
        QoeShow,
        SearchAll,
        SearchByType,
        Season,
        SeasonRecommend,
        ShareChannels,
        Skin,
        Space,
        Subtitle,
        Upgrade
    )

    private val fakeToPinkClientRestApis = arrayOf(
        "https://api.bilibili.com/pgc/view/v2/app/season",
        "https://api.bilibili.com/pgc/view/v2/app/eps",
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
        if (Utils.isPlay() && MossPatch.fakeToPinkClientGrpcApis.any { url.endsWith(it) }) {
            // maybe fallback to rest api
            val list = headers.toMutableList()
            var i = 0
            while (i < list.size) {
                val key = list[i]
                if (key == "x-bili-metadata-bin" || key == "x-bili-device-bin") {
                    list.removeAt(i)
                    list.removeAt(i)
                    i -= 2
                }
                i += 2
            }
            list.add("x-bili-metadata-bin")
            list.add(pinkMetadataHeader)
            list.add("x-bili-device-bin")
            list.add(pinkDeviceHeader)
            return Pair.create(url, list.toTypedArray())
        } else if (Utils.isPlay() && fakeToPinkClientRestApis.any { url.startsWith(it) }) {
            val uri = Uri.parse(url)
            val queryMap = uri.run {
                queryParameterNames.associateWith { getQueryParameter(it).orEmpty() }
            }
            val extraMap = mapOf(
                "appkey" to "1d8b6e7d45233436",
                "mobi_app" to "android",
                "build" to "7700200"
            )
            val newUrl = uri.buildUpon().encodedQuery(signQuery(queryMap, extraMap)).toString()
            return Pair.create(newUrl, headers)
        }
        return Pair.create(url, headers)
    }
}
