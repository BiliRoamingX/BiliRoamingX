package app.revanced.bilibili.utils

import android.net.Uri
import app.revanced.bilibili.http.Encoding
import app.revanced.bilibili.http.HttpClient
import app.revanced.bilibili.http.RequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit
import kotlin.math.abs

abstract class Translator {
    open fun translate(text: String): String? {
        return translate(listOf(text)).firstOrNull()
    }

    abstract fun translate(texts: List<String>): List<String>
}

object GoogleTranslator : Translator() {
    private const val API_URL = "https://translate.googleapis.com/translate_a/t"
    private const val ELEMENT_URL = "https://translate.googleapis.com/translate_a/element.js"
    private const val REFERER = "https://translate.google.com/"

    override fun translate(texts: List<String>): List<String> {
        val url = Uri.parse(API_URL).buildUpon()
            .appendQueryParameter("sl", "auto")
            .appendQueryParameter("tl", "zh-CN")
            .appendQueryParameter("client", "te_lib")
            //.appendQueryParameter("format", "html") // '\n' will be ignored if indicated
            .appendQueryParameter("tk", texts.joinToString("").tk())
            .toString()
        return HttpClient.post(
            url,
            body = RequestBody.form(texts.map { "q" to it }, encoding = Encoding.Gzip),
            ua = browserUA,
            referer = REFERER,
        )?.jsonArray().orEmpty().asSequence<JSONArray>().map {
            it.optString(0)
        }.toList()
    }

    /**
     * 计算谷歌翻译的tkk值
     */
    private object TKK {
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
            val elementJS = HttpClient.get(ELEMENT_URL, ua = browserUA, referer = REFERER)
                ?.plain() ?: return null
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
}

object MicrosoftTranslator : Translator() {
    private const val API_URL = "https://api.cognitive.microsofttranslator.com/translate"
    private const val AUTH_URL = "https://edge.microsoft.com/translate/auth"

    override fun translate(texts: List<String>): List<String> {
        val token = Token.get() ?: return listOf()
        val url = Uri.parse(API_URL).buildUpon()
            .appendQueryParameter("api-version", "3.0")
            .appendQueryParameter("to", "zh-CHS")
            .toString()
        return HttpClient.post(
            url,
            ua = browserUA,
            auth = "Bearer $token",
            body = RequestBody.json(JSONArray().apply {
                texts.forEach { put(JSONObject().put("Text", it)) }
            }),
        )?.jsonArray().orEmpty().asSequence<JSONObject>().map {
            it.optJSONArray("translations")?.optJSONObject(0)
                ?.optString("text").orEmpty()
        }.toList()
    }

    private object Token {
        private var accessToken: String? = null
        private var expireAt = -1L

        private val validAccessToken: String?
            get() = accessToken?.takeIf { System.currentTimeMillis() < expireAt }

        private const val TIMEOUT = 60 * 1000L // 1 minute
        private const val DEFAULT_EXPIRATION = 10 * 60 * 1000 // 10 minutes

        private val jwtRegex = Regex("""^[a-zA-Z0-9\-_]+(\.[a-zA-Z0-9\-_]+){2}$""")

        @Synchronized
        fun get(): String? {
            validAccessToken?.let { return it }

            return runCatchingOrNull {
                Utils.submitTask {
                    HttpClient.get(AUTH_URL, ua = browserUA)?.plain()?.let {
                        if (it.matches(jwtRegex)) {
                            update(it); it
                        } else null
                    }
                }.get(TIMEOUT, TimeUnit.SECONDS)
            }
        }

        private fun update(token: String) {
            val expirationTime = getExpirationTime(token)
            accessToken = token
            expireAt = expirationTime - 2 * TIMEOUT
        }

        private fun getExpirationTime(token: String): Long {
            return try {
                val payloadChunk = token.split('.')[1]
                val payload = String(payloadChunk.base64Decode)
                JSONObject(payload).getLong("exp") * 1000
            } catch (e: Throwable) {
                System.currentTimeMillis() + DEFAULT_EXPIRATION
            }
        }
    }
}
