package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object Upgrade : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.BLOCK_UPDATE.boolean
                && url.startsWith("https://app.bilibili.com/x/v2/version/fawkes/upgrade")
                && code.isOk
    }

    override fun hook(url: String, code: Int, response: String): String {
        return """{"code":-1,"message":"哼，休想要我更新！<(￣︶￣)>"}"""
    }
}
