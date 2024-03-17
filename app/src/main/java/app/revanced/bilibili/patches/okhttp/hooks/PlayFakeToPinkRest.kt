package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import android.util.Pair
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.signQuery

object PlayFakeToPinkRest : ApiHook() {
    private val fakeToPinkClientRestApis = arrayOf(
        "https://api.bilibili.com/pgc/view/v2/app/season",
        "https://api.bilibili.com/pgc/view/v2/app/fav/season",
        "https://api.bilibili.com/pgc/view/v2/app/eps",
    )

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.UNLOCK_AREA_LIMIT.boolean && Utils.isPlay()
                && fakeToPinkClientRestApis.any { url.startsWith(it) }
    }

    override fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
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
}
