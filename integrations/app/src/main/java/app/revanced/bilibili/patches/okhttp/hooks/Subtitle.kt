package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.utils.Logger
import app.revanced.bilibili.utils.SubtitleHelper
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.runCatchingOrNull
import java.util.concurrent.TimeUnit

object Subtitle : ApiHook() {
    var importedSubtitles = Pair<Long, MutableList<String>>(0L, mutableListOf())
    private val s2cnDict: Map<String, String>
        get() = mapOf(
            "妳" to "你",
            "掰掰" to "拜拜",
        )

    override fun shouldHook(url: String, status: Int): Boolean {
        return status.isOk && (url.contains("zh_converter")
                || url.substringBefore('?').endsWith(".ass"))
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        var uri = Uri.parse(url)
        if (!uri.getQueryParameter("url").isNullOrEmpty())
            uri = Uri.parse(uri.getQueryParameter("url"))
        val converter = uri.getQueryParameter("zh_converter")
        val ass = uri.lastPathSegment?.endsWith(".ass") ?: false
        var newResponse = response
        if (ass) {
            newResponse = runCatching {
                SubtitleHelper.ass2Bcc(response)
            }.onFailure {
                Logger.error(it) { "Ass subtitle convert failed" }
            }.getOrNull() ?: return response
        }
        if (converter == "t2cn") {
            val dictReady = if (!SubtitleHelper.dictExist) {
                runCatchingOrNull {
                    Utils.submitTask {
                        SubtitleHelper.checkDictUpdate()
                    }.get(60, TimeUnit.SECONDS)
                } == true || SubtitleHelper.dictExist
            } else true
            newResponse = if (!dictReady) {
                SubtitleHelper.errorResponse("转换字典下载失败，请重试")
            } else {
                runCatching {
                    SubtitleHelper.convert(newResponse)
                }.onFailure {
                    Logger.error(it) { "Subtitle convert from t to cn failed" }
                }.getOrDefault(SubtitleHelper.errorResponse("字幕转换失败，请重试"))
            }
            Utils.async {
                runCatchingOrNull {
                    if (SubtitleHelper.checkDictUpdate())
                        SubtitleHelper.reloadDict()
                }
            }
        } else if (converter == "en2cn") {
            newResponse = runCatching {
                SubtitleHelper.translate(newResponse)
            }.onFailure {
                Logger.error(it) { "Subtitle translate from en to cn failed" }
            }.getOrDefault(SubtitleHelper.errorResponse("字幕翻译失败，请重试"))
        } else if (converter == "s2cn") {
            s2cnDict.forEach { (l, r) ->
                newResponse = newResponse.replace(l, r)
            }
        } else if (converter == "import") {
            val index = uri.getQueryParameter("import_index")?.toInt() ?: -1
            if (index != -1)
                newResponse = importedSubtitles.second.getOrNull(index)
                    ?: SubtitleHelper.errorResponse("暂无导入字幕")
        }
        return newResponse
    }
}
