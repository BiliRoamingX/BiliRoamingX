package app.revanced.bilibili.patches.okhttp

import android.net.Uri
import android.util.Pair
import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.utils.signQuery

abstract class BaseFakeClientRestHook : ApiHook() {
    abstract val fakeToClient: Client

    final override fun hookBefore(
        url: String,
        headers: Array<String>
    ): Pair<String, Array<String>> {
        val uri = Uri.parse(url)
        val queryMap = uri.run {
            queryParameterNames.associateWith { getQueryParameter(it).orEmpty() }
        }
        val extraMap = mapOf(
            "appkey" to fakeToClient.appKey,
            "mobi_app" to fakeToClient.mobiApp,
            "build" to fakeToClient.verCode.toString()
        )
        val newUrl = uri.buildUpon().encodedQuery(signQuery(queryMap, extraMap)).toString()
        return Pair.create(newUrl, headers)
    }
}
