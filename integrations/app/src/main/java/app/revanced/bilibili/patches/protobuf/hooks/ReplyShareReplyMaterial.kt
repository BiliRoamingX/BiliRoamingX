package app.revanced.bilibili.patches.protobuf.hooks

import android.net.Uri
import app.revanced.bilibili.patches.okhttp.hooks.ShareClick
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Toasts
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.setClipboardContent
import com.bapis.bilibili.main.community.reply.v1.ShareReplyMaterialReq
import com.bapis.bilibili.main.community.reply.v1.ShareReplyMaterialResp
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ReplyShareReplyMaterial : MossHook<ShareReplyMaterialReq, ShareReplyMaterialResp>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return !Utils.isHd() && req is ShareReplyMaterialReq
    }

    override fun hookAfter(
        req: ShareReplyMaterialReq,
        reply: ShareReplyMaterialResp?,
        error: MossException?
    ): ShareReplyMaterialResp? {
        if (reply != null && Settings.PurifyShare()) {
            val purifyUrl = ShareClick.purifyUrl(reply.qrcodeUrl)
            val uri = Uri.parse(purifyUrl)
            reply.qrcodeUrl = uri.buildUpon().apply {
                encodedFragment(null)
                if (!uri.queryParameterNames.contains("comment_on"))
                    appendQueryParameter("comment_on", "1")
                if (!uri.queryParameterNames.contains("comment_root_id"))
                    appendQueryParameter("comment_root_id", req.rpid.toString())
            }.toString()
        }
        if (reply != null) {
            setClipboardContent(content = reply.qrcodeUrl)
            Toasts.showShort("评论链接已复制到剪贴板")
        }
        return super.hookAfter(req, reply, error)
    }
}
