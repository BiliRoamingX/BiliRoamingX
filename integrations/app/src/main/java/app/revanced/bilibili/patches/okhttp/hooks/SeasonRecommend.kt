package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.isNullOrEmpty
import app.revanced.bilibili.utils.iterator
import app.revanced.bilibili.utils.toJSONObject

object SeasonRecommend : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.RemoveRelatePromote()
                && url.contains("/pgc/season/app/related/recommend")
                && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        val result = json.optJSONObject("result")
            ?: return response
        val cards = result.optJSONArray("cards")
        if (cards.isNullOrEmpty()) return response
        val it = cards.iterator()
        while (it.hasNext())
            if (it.next().optInt("type") == 2)
                it.remove()
        return json.toString()
    }
}
