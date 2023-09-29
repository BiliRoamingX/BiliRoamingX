package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.playurl.v1.ConfType
import com.bapis.bilibili.app.playurl.v1.PlayConfEditReply
import com.bapis.bilibili.app.playurl.v1.PlayConfEditReq
import com.google.protobuf.GeneratedMessageLite

object PlayURLPlayConfEdit : MossHook<PlayConfEditReq, PlayConfEditReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is PlayConfEditReq
    }

    override fun hookBefore(req: PlayConfEditReq): Any? {
        if (Settings.REMEMBER_LOSSLESS_SETTING.boolean) {
            req.playConfList.firstOrNull {
                it.confTypeValue == ConfType.LOSSLESS.number
            }?.let {
                Settings.LOSSLESS_ENABLED.saveValue(it.confValue.switchVal)
            }
        }
        return null
    }
}
