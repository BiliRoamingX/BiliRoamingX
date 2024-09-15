package app.revanced.bilibili.utils

import app.revanced.bilibili.api.MossResponseHandlerProxy
import app.revanced.bilibili.settings.Settings
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.MossResponseHandler
import com.google.protobuf.GeneratedMessageLite

object MossDebugPrinter {
    private val replySkippedMossApis = arrayOf(
        //"com.bapis.bilibili.main.community.reply.v1.ReplyMoss#mainList",
        //"com.bapis.bilibili.community.service.dm.v1.DMMoss#dmView",
        "com.bapis.bilibili.community.service.dm.v1.DMMoss#dmSegMobile",
    )
    private val allSkippedMossApis = arrayOf(
        "com.bapis.bilibili.app.resource.v1.ModuleMoss#list",
        "com.bapis.bilibili.app.resource.v1.ModuleMoss#executeList",
    )

    private var skipEnabled = true

    @JvmStatic
    fun printBlocking(
        req: GeneratedMessageLite<*, *>,
        reply: GeneratedMessageLite<*, *>?,
        error: MossException?
    ) {
        if (!Settings.Debug()) return
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
        Logger.debug { "call blocking moss method $mossMethod" }
        Logger.debug { "blocking moss method $mossMethod req:\n$req" }
        if (skipEnabled && replySkippedMossApis.contains(mossMethod)) return
        Logger.debug { "blocking moss method $mossMethod reply:\n$reply" }
        if (error != null)
            Logger.debug { "blocking moss method $mossMethod error: ${error.toPrintString()}" }
    }

    @JvmStatic
    fun <V> printAsync(
        req: GeneratedMessageLite<*, *>,
        handler: MossResponseHandler<V>
    ): MossResponseHandler<V> {
        if (!Settings.Debug()) return handler
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
        Logger.debug { "call async moss method $mossMethod, handler type: ${handler.javaClass.name}" }
        Logger.debug { "async moss method $mossMethod req:\n$req" }
        if (skipEnabled && replySkippedMossApis.contains(mossMethod)) return handler
        return MossResponseHandlerProxy.get(handler, {
            Logger.debug { "async moss method $mossMethod reply:\n${it}" }; it
        }, { _, error ->
            Logger.debug { "async moss method $mossMethod error: ${error?.toPrintString()}" }
            false
        })
    }
}
