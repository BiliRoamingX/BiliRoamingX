@file:Suppress("NOTHING_TO_INLINE")

package app.revanced.bilibili.http

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Build
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import app.revanced.bilibili.api.BrotliInputStream
import app.revanced.bilibili.utils.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.InetSocketAddress
import java.net.Proxy.Type
import java.net.URL
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.zip.DeflaterInputStream
import java.util.zip.DeflaterOutputStream
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream

enum class Method(val key: String) {
    GET("GET"), POST("POST"), PUT("PUT"), HEAD("HEAD"), OPTIONS("OPTIONS"),
}

@JvmInline
value class ContentType(val key: String) {
    companion object {
        val json = ContentType("application/json")
        val form = ContentType("application/x-www-form-urlencoded")
    }
}

enum class Encoding(val key: String) {
    NONE(""), DEFLATE("deflate"), GZIP("gzip")
}

class RequestBody(val contentType: ContentType, val encoding: Encoding, val body: ByteArray) {
    companion object {
        @JvmStatic
        fun form(params: List<Pair<Any, Any>>, encoding: Encoding = Encoding.NONE): RequestBody {
            val body = params.joinToString("&") { (k, v) ->
                "$k=${v.toString().urlencoded}"
            }.toByteArray()
            return RequestBody(ContentType.form, encoding, body)
        }

        @JvmStatic
        fun json(json: String, encoding: Encoding = Encoding.NONE): RequestBody {
            val body = json.toByteArray()
            return RequestBody(ContentType.json, encoding, body)
        }

        @JvmStatic
        inline fun json(json: JSONObject, encoding: Encoding = Encoding.NONE) =
            json(json.toString(), encoding)

        @JvmStatic
        inline fun json(json: JSONArray, encoding: Encoding = Encoding.NONE) =
            json(json.toString(), encoding)

        @JvmStatic
        inline fun json(params: Map<String, Any>, encoding: Encoding = Encoding.NONE) =
            json(params.toJsonObject().toString(), encoding)

        @JvmStatic
        @JvmName("create")
        inline fun String.toRequestBody(
            contentType: ContentType,
            encoding: Encoding = Encoding.NONE
        ) = RequestBody(contentType, encoding, toByteArray())
    }
}

@JvmInline
value class ResponseBody(val body: String) {
    inline fun plain() = body
    inline fun json() = JSONObject(body)
    inline fun jsonArray() = JSONArray(body)
}

class Proxy(
    val type: Type,
    val host: String,
    val port: Int,
    val username: String,
    val password: String
) {

    companion object {
        @JvmStatic
        val direct = Proxy(Type.DIRECT, "", 0, "", "")

        @JvmStatic
        @JvmName("fromUrl")
        fun String.toProxy(): Proxy {
            val uri = Uri.parse(this)
            val scheme = uri.scheme
            val host = uri.host ?: error("invalid proxy, empty host.")
            val port = uri.port.also { if (it == -1) error("invalid proxy port.") }
            val userInfo = uri.userInfo
            val type = when (scheme) {
                "http" -> Type.HTTP
                "socks4", "socks5" -> Type.SOCKS
                "direct" -> return direct
                else -> error("invalid proxy, scheme only can be http,socks4,socks5,direct.")
            }
            val split = userInfo.orEmpty().split(',', limit = 2)
            val username = split[0]
            val password = if (split.size > 1) split[1] else ""
            return Proxy(type, host, port, username, password)
        }
    }
}

object HttpClient {

    @JvmStatic
    fun get(
        url: String,
        headers: Map<String, String> = emptyMap(),
        ua: String = defaultUA,
        auth: String? = null,
        referer: String? = null,
        timeout: Int = 10_000,
        proxy: Proxy = Proxy.direct,
    ) = request(
        url,
        method = Method.GET,
        headers,
        body = null,
        ua, auth, referer, timeout, proxy
    )

    @JvmStatic
    fun post(
        url: String,
        body: RequestBody?,
        headers: Map<String, String> = emptyMap(),
        ua: String = defaultUA,
        auth: String? = null,
        referer: String? = null,
        timeout: Int = 10_000,
        proxy: Proxy = Proxy.direct,
    ) = request(
        url = url,
        method = Method.POST,
        headers, body, ua, auth, referer, timeout, proxy
    )

    @JvmStatic
    fun biliroaming(url: String): ResponseBody? {
        val verName = "1.7.0"
        val verCode = "1344"
        val headers = mapOf(
            "x-from-biliroaming" to verName,
            "platform-from-biliroaming" to Utils.getMobiApp(),
            "Build" to verCode,
        )
        return request(url, method = Method.GET, headers = headers)
    }

    @JvmStatic
    fun request(
        url: String,
        method: Method,
        headers: Map<String, String> = emptyMap(),
        body: RequestBody? = null,
        ua: String = defaultUA,
        auth: String? = null,
        referer: String? = null,
        timeout: Int = 10_000,
        proxy: Proxy = Proxy.direct,
    ): ResponseBody? = runCatching {
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N
            && method === Method.GET
            && url.startsWith("https")
            && !url.contains("bilibili.com")
        ) {
            LogHelper.debug { "Found Android 7, try to bypass ssl issue" }
            val listener = object : Any() {
                val latch = CountDownLatch(1)
                var result = ""

                @Suppress("UNUSED")
                @JavascriptInterface
                fun callback(r: String) {
                    result = r
                    latch.countDown()
                }
            }
            Utils.runOnMainThread {
                val webView = WebView(Utils.getContext())
                webView.addJavascriptInterface(listener, "listener")
                webView.webViewClient = object : WebViewClient() {
                    @SuppressLint("SetJavaScriptEnabled")
                    override fun onPageFinished(view: WebView, url: String) {
                        view.settings.javaScriptEnabled = true
                        view.loadUrl("javascript:listener.callback(document.documentElement.innerText)")
                    }
                }
                val finalHeaders = headers.toMutableMap()
                finalHeaders["User-Agent"] = ua
                if (auth != null)
                    finalHeaders["Authorization"] = auth
                if (referer != null)
                    finalHeaders["Referer"] = referer
                webView.loadUrl(url, finalHeaders)
            }
            try {
                if (!listener.latch.await((timeout * 2).toLong(), TimeUnit.MILLISECONDS)) {
                    throw IOException("Timeout connection to server")
                }
            } catch (e: InterruptedException) {
                throw IOException("Connection to server was interrupted")
            }
            ResponseBody(listener.result)
        } else {
            fun InputStream.readText(encoding: String?) = (when (encoding?.lowercase()) {
                "br" -> BrotliInputStream(this)
                "gzip" -> GZIPInputStream(this)
                "deflate" -> DeflaterInputStream(this)
                else -> this
            }).bufferedReader().use { it.readText() }

            val netProxy = if (proxy.type != Type.DIRECT) {
                java.net.Proxy(proxy.type, InetSocketAddress(proxy.host, proxy.port))
            } else null
            val connection = URL(url).let {
                if (netProxy == null) {
                    it.openConnection()
                } else {
                    it.openConnection(netProxy)
                }
            } as HttpURLConnection
            connection.requestMethod = method.key
            headers.forEach { (k, v) ->
                connection.setRequestProperty(k, v)
            }
            connection.setRequestProperty("User-Agent", ua)
            if (auth != null)
                connection.setRequestProperty("Authorization", auth)
            if (referer != null)
                connection.setRequestProperty("Referer", referer)
            if (proxy.username.isEmpty() && proxy.password.isNotEmpty()) {
                val proxyAuth = "${proxy.username}:${proxy.password}".toByteArray().base64
                connection.setRequestProperty("Proxy-Authorization", "Basic $proxyAuth")
            }
            connection.connectTimeout = timeout
            connection.readTimeout = timeout
            connection.setRequestProperty("Accept-Encoding", "br,gzip,deflate")
            if (body != null) {
                val encoding = body.encoding
                connection.setRequestProperty("Content-Type", body.contentType.key)
                if (encoding !== Encoding.NONE)
                    connection.setRequestProperty("Content-Encoding", encoding.key)
                connection.doOutput = true
                val outputStream = connection.outputStream
                (when (encoding) {
                    Encoding.GZIP -> GZIPOutputStream(outputStream)
                    Encoding.DEFLATE -> DeflaterOutputStream(outputStream)
                    Encoding.NONE -> outputStream
                }).use { it.write(body.body) }
            }
            val status = connection.responseCode
            if (status == HttpURLConnection.HTTP_OK) {
                connection.inputStream.readText(connection.contentEncoding).let {
                    ResponseBody(it)
                }
            } else {
                val error = connection.errorStream?.readText(connection.contentEncoding)
                LogHelper.error { "Request failed, url: $url, status: $status, error: $error" }
                null
            }
        }
    }.onFailure {
        LogHelper.error({ "Request failed, url: $url" }, it)
    }.getOrNull()?.also {
        LogHelper.debug { "Request success, url: $url" }
        LogHelper.debug { "Request success, result: ${it.plain()}" }
    }
}
