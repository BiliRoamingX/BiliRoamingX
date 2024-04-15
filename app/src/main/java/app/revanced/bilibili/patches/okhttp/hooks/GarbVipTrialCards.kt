package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object GarbVipTrialCards : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.SKIN.boolean && url.contains("/x/garb/v2/vip/trail_cards")
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return """{"code":0,"message":"0","ttl":1,"data":{"list":null,"current_trail_card_num":1,"can_use_trail":true}}"""
    }
}
