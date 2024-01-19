package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object BangumiMaterial : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.BLOCK_BANGUMI_PAGE_ADS.boolean
                && (url.startsWith("https://api.bilibili.com/pgc/activity/deliver/material/receive")
                || url.startsWith("https://api.bilibili.com/pgc/activity/deliver/material/receive-activity"))
                && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return """{"code":0,"data":{"container":[]},"message":"success"}"""
    }
}
