package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object BangumiCards : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.BlockUpRcmdAds()
                && (url.contains("/pgc/season/player/cards")
                || url.contains("/pgc/season/player/ogv/cards"))
                && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return """{"code":0,"data":[]}"""
    }
}
