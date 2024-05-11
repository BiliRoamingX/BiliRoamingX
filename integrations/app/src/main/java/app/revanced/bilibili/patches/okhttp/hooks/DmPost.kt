package app.revanced.bilibili.patches.okhttp.hooks

import android.net.Uri
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.CommentChecker
import app.revanced.bilibili.utils.decodeFormBody
import app.revanced.bilibili.utils.toJSONObject

object DmPost : ApiHook() {
    override fun shouldHook(url: String, code: Int): Boolean {
        return Settings.CHECK_COMMENT.boolean && url.contains("/x/v2/dm/post?") && code.isOk
    }

    override fun hook(url: String, code: Int, request: String, response: String): String {
        val formBody = decodeFormBody(request)
        if (formBody["type"] != "1")
            return response
        val uri = Uri.parse(url)
        val oid = uri.getQueryParameter("oid")?.toLongOrNull()
        val aid = uri.getQueryParameter("aid")?.toLongOrNull()
        if (oid == null || aid == null)
            return response
        val message = formBody["msg"].orEmpty()
            .ifEmpty { return response }
        val progress = formBody["progress"]?.toLongOrNull()
            ?: return response
        val dmId = response.toJSONObject()
            .optJSONObject("data")?.optLong("dmid")
            ?: return response
        CommentChecker.checkDanmaku(oid, aid, progress, dmId, message)
        return response
    }
}
