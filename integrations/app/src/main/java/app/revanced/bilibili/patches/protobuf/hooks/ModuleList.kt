package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.resource.v1.ListReply
import com.bapis.bilibili.app.resource.v1.ListReq
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object ModuleList : MossHook<ListReq, ListReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is ListReq
    }

    override fun hookAfter(req: ListReq, reply: ListReply?, error: MossException?): ListReply? {
        if (Settings.DelayDownloadModules() && (req.lite > 0
                    || (req.poolName == "feOffline" && req.moduleName.isEmpty()))
        ) reply?.clearPools()
        return super.hookAfter(req, reply, error)
    }
}
