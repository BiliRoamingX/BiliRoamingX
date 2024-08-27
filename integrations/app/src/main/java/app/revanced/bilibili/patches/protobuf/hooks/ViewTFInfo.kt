package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.meta.HookFlags
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import com.bapis.bilibili.app.view.v1.TFInfoReply
import com.bapis.bilibili.app.view.v1.TFInfoReq
import com.google.protobuf.GeneratedMessageLite

object ViewTFInfo : MossHook<TFInfoReq, TFInfoReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return !Utils.isHd() && req is TFInfoReq
    }

    override fun hookBefore(req: TFInfoReq): Any? {
        if (Settings.RemoveVideoPopups().contains("other")) // 免流引导
            return HookFlags.STOP_EXECUTION
        return null
    }
}
