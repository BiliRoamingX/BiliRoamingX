package app.revanced.bilibili.patches.okhttp

import app.revanced.bilibili.patches.okhttp.hooks.*
import app.revanced.bilibili.utils.LogHelper

@Suppress("unused")
object OkHttpPatch {
    @JvmStatic
    private val hooks = arrayOf(
        BangumiCards,
        BangumiMaterial,
        Eps,
        FeedIndex,
        Media,
        QoeShow,
        Season,
        SeasonRecommend,
        ShareChannels,
        Skin,
        Space,
        Subtitle,
        Upgrade
    )

    @JvmStatic
    fun shouldHook(url: String, code: Int): Boolean {
        LogHelper.debug { "OkHttpPatch.shouldHook, code: %d, url: %s".format(code, url) }
        return hooks.any { it.shouldHook(url, code) }
    }

    @JvmStatic
    fun hook(url: String, code: Int, response: String): String {
        LogHelper.debug { "OkHttpPatch.hook, code: %d, url: %s".format(code, url) }
        LogHelper.debug { "OkHttpPatch.hook, response: $response" }
        return hooks.firstOrNull { it.shouldHook(url, code) }
            ?.hook(url, code, response) ?: response
    }
}
