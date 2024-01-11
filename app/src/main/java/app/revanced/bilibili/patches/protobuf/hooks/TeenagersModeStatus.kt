package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.interfaces.v1.ModeStatusReply
import com.bapis.bilibili.app.interfaces.v1.ModeStatusReq
import com.bapis.bilibili.app.interfaces.v1.Policy
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object TeenagersModeStatus : MossHook<ModeStatusReq, ModeStatusReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is ModeStatusReq
    }

    override fun hookAfter(
        req: ModeStatusReq,
        reply: ModeStatusReply?,
        error: MossException?
    ): ModeStatusReply? {
        if (reply != null && Settings.TEENAGER_MODE_DIALOG.boolean) {
            val teenagersModel = reply.userModelsList.find { it.mode == "teenagers" }
                ?: return super.hookAfter(req, reply, error)
            teenagersModel.policy = Policy()
        }
        return super.hookAfter(req, reply, error)
    }
}
