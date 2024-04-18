package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.playurl.v1.PlayConfReply
import com.bapis.bilibili.app.playurl.v1.PlayConfReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object PlayURLPlayConf : MossHook<PlayConfReq, PlayConfReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayConfReq
    }

    override fun hookAfter(
        req: PlayConfReq,
        reply: PlayConfReply?,
        error: MossException?
    ): PlayConfReply? {
        if (Settings.REMEMBER_LOSSLESS_SETTING.boolean && reply != null)
            reply.playConf.lossLessConf.confValue.switchVal = Settings.LOSSLESS_ENABLED.boolean
        return super.hookAfter(req, reply, error)
    }
}
