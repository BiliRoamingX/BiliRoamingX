package app.revanced.bilibili.utils

import android.net.Uri
import android.os.Build
import app.revanced.bilibili.api.BrotliInputStream
import org.json.JSONArray
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.ThreadLocalRandom
import java.util.zip.DeflaterInputStream
import java.util.zip.DeflaterOutputStream
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream
import javax.net.ssl.HttpsURLConnection
import kotlin.math.abs

private const val GOOGLE_TRANSLATE_API_URL = "https://translate.googleapis.com/translate_a/t"
private const val GOOGLE_ELEMENT_URL = "https://translate.googleapis.com/translate_a/element.js"
private const val GOOGLE_REFERER = "https://translate.google.com/"
private val UA =
    "Mozilla/5.0 (Linux; Android ${Build.VERSION.RELEASE}; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36"

private fun request(
    url: String,
    method: String = "GET",
    contentType: String? = null,
    data: String? = null,
    encoding: String? = null,
): String? = runCatching {
    fun InputStream.readText(encoding: String?) = (when (encoding?.lowercase()) {
        "gzip" -> GZIPInputStream(this)
        "deflate" -> DeflaterInputStream(this)
        "br" -> BrotliInputStream(this)
        else -> this
    }).bufferedReader().use { it.readText() }

    val connection = URL(url).openConnection() as HttpsURLConnection
    connection.requestMethod = method
    connection.connectTimeout = 5000
    connection.readTimeout = 5000
    connection.setRequestProperty("User-Agent", UA)
    connection.setRequestProperty("Referer", GOOGLE_REFERER)
    connection.setRequestProperty("Accept-Encoding", "gzip,deflate,br")
    if (data != null) {
        connection.setRequestProperty("Content-Type", contentType)
        connection.setRequestProperty("Content-Encoding", "gzip")
        connection.doOutput = true
        val outputStream = connection.outputStream
        (when (encoding) {
            "gzip" -> GZIPOutputStream(outputStream)
            "deflate" -> DeflaterOutputStream(outputStream)
            else -> outputStream
        }).use { it.write(data.toByteArray()) }
    }
    val status = connection.responseCode
    if (status == HttpURLConnection.HTTP_OK) {
        connection.inputStream.readText(connection.contentEncoding)
    } else {
        val error = connection.errorStream?.readText(connection.contentEncoding)
        LogHelper.error { "Google translate request execute failed, url: $url, status: $status, error: $error" }
        null
    }
}.onFailure {
    LogHelper.error({ "Google translate request execute failed, url: $url" }, it)
}.getOrNull()?.also {
    LogHelper.debug { "Google translate request execute success, url: $url, result: $it" }
}

object GoogleTranslator {
    fun translateHtml(html: String, targetLan: String = "zh-CN"): String? {
        val url = Uri.parse(GOOGLE_TRANSLATE_API_URL).buildUpon()
            .appendQueryParameter("sl", "auto")
            .appendQueryParameter("tl", targetLan)
            .appendQueryParameter("client", "te_lib")
            .appendQueryParameter("format", "html")
            .appendQueryParameter("tk", html.tk())
            .toString()
        val response = request(
            url,
            method = "POST",
            contentType = "application/x-www-form-urlencoded",
            data = "q=${html.urlencoded}",
            encoding = "gzip"
        ) ?: return null
        return JSONArray(response).optJSONArray(0).let {
            it.opt(0) as? String
        }
    }
}

/**
 * 计算谷歌翻译的tkk值
 */
object TKK {
    private const val MIM = 60 * 60 * 1000

    private val tkkRegex = Regex("tkk='(\\d+).(-?\\d+)'")

    private var innerValue: Pair<Long, Long>? = null

    val value: Pair<Long, Long>
        get() = update() ?: generate()

    private fun update(): Pair<Long, Long>? {
        synchronized(this) {
            innerValue?.let { tkk ->
                val now = System.currentTimeMillis() / MIM
                if (tkk.first == now) {
                    return tkk
                }
            }
        }

        val newTKK = fetchTKK()

        synchronized(this) {
            val oldTKK = innerValue
            if (oldTKK == null || (newTKK != null && newTKK.first >= oldTKK.first)) {
                innerValue = newTKK
            }
            return innerValue
        }
    }

    /**
     * 本地生成一个TKK值，该值对普通翻译有效，而对文档翻译是无效
     */
    private fun generate(): Pair<Long, Long> {
        val now = System.currentTimeMillis() / MIM
        val generator = ThreadLocalRandom.current()
        return now to (abs(generator.nextInt().toLong()) + generator.nextInt().toLong())
    }

    /**
     * 从谷歌翻译的网页中获取TKK值
     */
    private fun fetchTKK(): Pair<Long, Long>? {
        val elementJS = request(GOOGLE_ELEMENT_URL)
            ?: return null
        val (_, value1, value2) = tkkRegex.find(elementJS)?.groupValues
            ?: return null
        return value1.toLong() to value2.toLong()
    }
}

/**
 * 计算tk值
 */
private fun String.tk(tkk: Pair<Long, Long> = TKK.value): String {
    val a = mutableListOf<Long>()
    var b = 0
    while (b < length) {
        var c = this[b].code
        if (128 > c) {
            a += c.toLong()
        } else {
            if (2048 > c) {
                a += (c shr 6 or 192).toLong()
            } else {
                if (55296 == (c and 64512) && b + 1 < length && 56320 == (this[b + 1].code and 64512)) {
                    c = 65536 + ((c and 1023) shl 10) + (this[++b].code and 1023)
                    a += (c shr 18 or 240).toLong()
                    a += (c shr 12 and 63 or 128).toLong()
                } else {
                    a += (c shr 12 or 224).toLong()
                }
                a += (c shr 6 and 63 or 128).toLong()
            }
            a += (c and 63 or 128).toLong()
        }

        b++
    }

    val (d, e) = tkk
    var f = d
    for (h in a) {
        f += h
        f = calculate(f, "+-a^+6")
    }
    f = calculate(f, "+-3^+b+-f")
    f = f xor e
    if (0 > f) {
        f = (f and Int.MAX_VALUE.toLong()) + Int.MAX_VALUE.toLong() + 1
    }
    f = (f % 1E6).toLong()

    return "$f.${f xor d}"
}

private fun calculate(a: Long, b: String): Long {
    var g = a
    for (c in 0..b.length - 2 step 3) {
        val d = b[c + 2]
        val e = if ('a' <= d) d.code - 87 else d.toString().toInt()
        val f = if ('+' == b[c + 1]) g.ushr(e) else g shl e
        g = if ('+' == b[c]) g + f and (Int.MAX_VALUE.toLong() * 2 + 1) else g xor f
    }

    return g
}
