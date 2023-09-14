package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.utils.SubtitleHelper
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.runCatchingOrNull
import java.util.concurrent.TimeUnit

object Subtitle : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return code.isOk && (url.contains("zh_converter=t2cn")
                || url.contains("zh_converter%3Dt2cn")) // free flow, url starts with https://proxy-tf-all-ws.bilivideo.com
    }

    override fun hook(url: String, code: Int, response: String): String {
        val dictReady = if (!SubtitleHelper.dictExist) {
            runCatchingOrNull {
                Utils.submitTask {
                    SubtitleHelper.checkDictUpdate()
                }.get(60, TimeUnit.SECONDS)
            } == true || SubtitleHelper.dictExist
        } else true
        val newResponse = if (!dictReady) {
            SubtitleHelper.errorResponse("转换字典下载失败，请重试")
        } else {
            runCatchingOrNull {
                SubtitleHelper.convert(response)
            } ?: SubtitleHelper.errorResponse("字幕转换失败，请重试")
        }
        Utils.async {
            runCatchingOrNull {
                if (SubtitleHelper.checkDictUpdate())
                    SubtitleHelper.reloadDict()
            }
        }
        return newResponse
    }
}
