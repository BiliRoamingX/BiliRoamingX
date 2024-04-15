package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings

object GarbAssetStat : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.SKIN.boolean && url.contains("/x/garb/user/item/asset/stat")
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return """{"code":0,"message":"0","ttl":1,"data":{"vip_trial":{"trial_show":1,"is_vip":1,"has_trial_asset":1,"remain_times":1}}}"""
    }
}
