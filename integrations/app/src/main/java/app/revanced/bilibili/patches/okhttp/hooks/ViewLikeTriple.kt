package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.toJSONObject

object ViewLikeTriple : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return Settings.BlockFanGuide() && url.contains("/x/v2/view/like/triple") && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        return response.toJSONObject().apply {
            optJSONObject("data")?.put("prompt", false)
        }.toString()
    }
}
