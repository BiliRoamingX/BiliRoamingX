package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.LogHelper
import app.revanced.bilibili.utils.SubtitleHelper

object AssSubtitle : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.UNLOCK_AREA_LIMIT.boolean && code.isOk
                && url.substringBefore('?').endsWith(".ass")
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        return runCatching {
            SubtitleHelper.ass2BJson(response)
        }.onFailure {
            LogHelper.error({ "Ass subtitle convert failed" }, it)
        }.getOrNull() ?: response
    }
}
