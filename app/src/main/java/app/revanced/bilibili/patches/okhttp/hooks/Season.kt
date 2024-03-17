package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook
import app.revanced.bilibili.settings.Settings

object Season : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return (Settings.UNLOCK_AREA_LIMIT.boolean || Settings.BLOCK_BANGUMI_PAGE_ADS.boolean)
                && (url.startsWith("https://api.bilibili.com/pgc/view/v2/app/season")
                || url.startsWith("https://api.bilibili.com/pgc/view/v2/app/fav/season"))
                && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return BangumiSeasonHook.unlockBangumi(url, response)
    }
}
