package app.revanced.bilibili.patches.okhttp

import java.net.HttpURLConnection

abstract class ApiHook {
    protected val Int.isOk: Boolean
        inline get() = this == HttpURLConnection.HTTP_OK

    abstract fun shouldHook(url: String, code: Int): Boolean

    abstract fun hook(url: String, code: Int, request: String, response: String): String
}
