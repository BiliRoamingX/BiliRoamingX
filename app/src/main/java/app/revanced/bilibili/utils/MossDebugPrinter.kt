package app.revanced.bilibili.utils

import app.revanced.bilibili.api.MossResponseHandlerProxy
import app.revanced.bilibili.settings.Settings
import com.bilibili.lib.moss.api.MossResponseHandler
import com.google.protobuf.GeneratedMessageLite

object MossDebugPrinter {
    private val replySkippedMossApis = arrayOf(
        "com.bapis.bilibili.main.community.reply.v1.ReplyMoss#mainList",
        "com.bapis.bilibili.community.service.dm.v1.DMMoss#dmView",
        "com.bapis.bilibili.community.service.dm.v1.DMMoss#dmSegMobile"
    )
    private val allSkippedMossApis = arrayOf(
        "com.bapis.bilibili.app.resource.v1.ModuleMoss#list"
    )

    private var skipEnabled = true

    @JvmStatic
    fun printBlocking(req: GeneratedMessageLite<*, *>, reply: GeneratedMessageLite<*, *>?) {
        if (!Settings.DEBUG.boolean) return
        var mossMethod = ""
        val stackTrace = Thread.currentThread().stackTrace
        stackTrace.forEachIndexed { index, element ->
            if (element.methodName.startsWith("blockingUnaryCall")) {
                stackTrace.getOrNull(index + 1)?.let {
                    mossMethod = "${it.className}#${it.methodName}"
                }
            }
        }
        if (skipEnabled && allSkippedMossApis.contains(mossMethod)) return
        LogHelper.debug { "call blocking moss method $mossMethod" }
        LogHelper.debug { "blocking moss method $mossMethod req:\n$req" }
        if (skipEnabled && replySkippedMossApis.contains(mossMethod)) return
        LogHelper.debug { "blocking moss method $mossMethod reply:\n$reply" }
    }

    @JvmStatic
    fun <V> printAsync(
        req: GeneratedMessageLite<*, *>,
        handler: MossResponseHandler<V>
    ): MossResponseHandler<V> {
        if (!Settings.DEBUG.boolean) return handler
        var mossMethod = ""
        val stackTrace = Thread.currentThread().stackTrace
        stackTrace.forEachIndexed { index, element ->
            if (element.methodName.let { it.startsWith("asyncUnaryCall") || it.startsWith("asyncServerStreamingCall") }) {
                stackTrace.getOrNull(index + 1)?.let {
                    mossMethod = "${it.className}#${it.methodName}"
                }
            }
        }
        if (skipEnabled && allSkippedMossApis.contains(mossMethod)) return handler
        LogHelper.debug { "call async moss method $mossMethod, handler type: ${handler.javaClass.name}" }
        LogHelper.debug { "async moss method $mossMethod req:\n$req" }
        if (skipEnabled && replySkippedMossApis.contains(mossMethod)) return handler
        return MossResponseHandlerProxy.get(handler) {
            LogHelper.debug { "async moss method $mossMethod reply:\n${it}" }
            it
        }
    }
}
