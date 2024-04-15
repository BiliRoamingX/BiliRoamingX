package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object GarbTrialSuit : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.SKIN.boolean && url.contains("/x/garb/user/trial/suit/equity/use")
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        GarbTrialSuitAsset.shouldHandle = true
        return """{"code":0,"message":"0","ttl":1}"""
    }
}
