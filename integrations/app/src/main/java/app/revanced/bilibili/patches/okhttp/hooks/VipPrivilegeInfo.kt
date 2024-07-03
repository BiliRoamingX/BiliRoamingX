package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.toJSONObject

object VipPrivilegeInfo : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.UnlockGif()
                && url.contains("/x/vip/vip_privilege/info")
                && url.contains("privilege_key=vip_pick_up_animated_image_in_reply")
                && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        return response.toJSONObject().apply {
            optJSONObject("data")?.run {
                put("allow", true)
                put("is_vip", true)
            }
        }.toString()
    }
}
