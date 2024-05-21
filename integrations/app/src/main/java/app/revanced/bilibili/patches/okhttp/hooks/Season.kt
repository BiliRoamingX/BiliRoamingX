package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.meta.VideoInfo
import app.revanced.bilibili.patches.main.VideoInfoHolder
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook

object Season : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return (url.contains("/pgc/view/v2/app/season")
                || url.contains("/pgc/view/v2/app/fav/season"))
                && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val newResponse = BangumiSeasonHook.unlockBangumi(url, response)
        VideoInfoHolder.updateCurrent { videoInfo ->
            videoInfo?.apply { view = newResponse } ?: VideoInfo(0, newResponse)
        }
        return newResponse
    }
}
