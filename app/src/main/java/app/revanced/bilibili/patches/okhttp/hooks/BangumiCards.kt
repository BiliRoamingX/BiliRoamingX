package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object BangumiCards : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.BLOCK_UP_RCMD_ADS.boolean
                && (url.startsWith("https://api.bilibili.com/pgc/season/player/cards")
                || url.startsWith("https://api.bilibili.com/pgc/season/player/ogv/cards"))
                && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return """{"code":0,"data":[]}"""
    }
}
