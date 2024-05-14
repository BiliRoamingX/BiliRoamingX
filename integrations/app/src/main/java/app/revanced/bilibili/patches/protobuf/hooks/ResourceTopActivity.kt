package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.broadcast.message.main.TopActivityReply
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.Empty
import com.google.protobuf.GeneratedMessageLite

object ResourceTopActivity : MossHook<Empty, GeneratedMessageLite<*, *>>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is Empty
    }

    override fun hookAfter(
        req: Empty,
        reply: GeneratedMessageLite<*, *>?,
        error: MossException?
    ): GeneratedMessageLite<*, *>? {
        if (Settings.BlockTopActivity() && reply is TopActivityReply)
            return null
        return super.hookAfter(req, reply, error)
    }
}
