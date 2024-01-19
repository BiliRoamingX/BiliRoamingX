package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object QoeShow : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.BLOCK_DM_FEEDBACK.boolean
                && url.startsWith("https://api.bilibili.com/x/v2/dm/qoe/show")
                && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return """{"code":0,"data":{"show":false,"info":null}}"""
    }
}
