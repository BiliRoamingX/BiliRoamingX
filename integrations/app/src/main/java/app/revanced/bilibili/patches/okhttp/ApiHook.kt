package app.revanced.bilibili.patches.okhttp

import android.util.Pair
import java.net.HttpURLConnection

abstract class ApiHook {
    protected val Int.isOk: Boolean
        inline get() = this == HttpURLConnection.HTTP_OK

    open fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return false
    }

    open fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        return Pair.create(url, headers)
    }

    open fun shouldHook(url: String, status: Int): Boolean {
        return false
    }

    open fun hook(url: String, status: Int, request: String, response: String): String {
        return response
    }
}
