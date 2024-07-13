package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.decodeFormBody
import app.revanced.bilibili.utils.maybeThailand
import app.revanced.bilibili.utils.saveVideoHistory

object HistoryReport : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return status.isOk && Settings.SaveThailandHistory()
                && url.contains("/x/v2/history/report")
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val form = decodeFormBody(request)
        val sid = form["sid"] ?: return response
        val epId = form["epid"] ?: return response
        val progress = form["progress"] ?: return response
        if (maybeThailand(sid, epId))
            saveVideoHistory(sid.toInt(), epId.toInt(), progress.toLong())
        return response
    }
}
