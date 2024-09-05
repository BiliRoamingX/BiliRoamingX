package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.meta.HookFlags
import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReq
import com.google.protobuf.GeneratedMessageLite

object SearchDefaultWords : MossHook<DefaultWordsReq, DefaultWordsReq>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is DefaultWordsReq
    }

    override fun hookBefore(req: DefaultWordsReq): Any? {
        if (Settings.PurifySearchTypes().contains("words"))
            return HookFlags.STOP_EXECUTION
        return null
    }
}
