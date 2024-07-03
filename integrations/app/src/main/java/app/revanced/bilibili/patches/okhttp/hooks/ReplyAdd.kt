package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.CommentChecker
import app.revanced.bilibili.utils.forEach
import app.revanced.bilibili.utils.orEmpty
import app.revanced.bilibili.utils.toJSONObject

object ReplyAdd : ApiHook() {
    override fun shouldHook(url: String, status: Int): Boolean {
        return url.contains("/x/v2/reply/add") && status.isOk
    }

    override fun hook(url: String, status: Int, request: String, response: String): String {
        val json = response.toJSONObject()
        val data = json.optJSONObject("data")
        if (data?.optInt("success_action", -1) != 0)
            return response
        val reply = data.optJSONObject("reply")
            ?: return response
        val oid = reply.optLong("oid")
        val replyId = reply.optLong("rpid")
        val content = reply.optJSONObject("content")
            ?: return response
        val message = content.optString("message")
        val pictures = content.optJSONArray("pictures")
        val hasPicture = pictures.orEmpty().length() > 0
        val finalMessage = "$message ${if (hasPicture) " [带图]" else ""}".trim()
        CommentChecker.checkComment(oid, replyId, finalMessage, hasPicture)
        if (Settings.UnlockGif()) {
            content.put("picture_scale", 1.5)
            pictures?.forEach { p ->
                p.remove("top_right_icon")
                p.put("play_gif_thumbnail", true)
            }
            return json.toString()
        }
        return response
    }
}
