package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object DmQoeShow : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.BlockDmFeedback()
                && url.contains("/x/v2/dm/qoe/show")
                && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        return """{"code":0,"data":{"show":false,"info":null}}"""
    }
}
