package app.revanced.bilibili.patches.protobuf

import app.revanced.bilibili.api.MossResponseHandlerProxy
import app.revanced.bilibili.meta.HookFlags
import app.revanced.bilibili.patches.protobuf.hooks.*
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.MossDebugPrinter
import app.revanced.bilibili.utils.Utils
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.MossResponseHandler
import com.google.protobuf.GeneratedMessageLite

object MossPatch {
    private val hooks = arrayOf(
        DmView,
        DynAll,
        DynRed,
        DynTab,
        DynVideo,
        ListenPlayHistory,
        ListenPlaylist,
        ListenPlayURL,
        ListenRcmdPlaylist,
        ModuleList,
        PlayURLPlayConf,
        PlayURLPlayConfEdit,
        PlayURLPlayViewPGC,
        PlayURLPlayViewUGC,
        PlayURLPlayViewUnite,
        ReplyMainList,
        ReplySubjectDescription,
        ResourceTopActivity,
        SearchAll,
        SearchByType,
        SearchDefaultWords,
        View,
        ViewLike,
        ViewProgress,
        ViewProgressUnite,
        ViewRelatesFeed,
        ViewRelatesFeedUnite,
        ViewTFInfo,
        ViewUnite
    )

    /**
     * @return [HookFlags.STOP_EXECUTION] to stop method execution and return null,
     * or null to not intercept method execution,
     * or custom response,
     * or throw [MossException].
     */
    @JvmStatic
    fun hookBlockingBefore(req: GeneratedMessageLite<*, *>): Any? {
        return hooks.firstOrNull { it.shouldHook(req) }?.hookBefore(req)
    }

    /**
     * @return null or [reply], or custom response, or throw nonnull [error].
     *
     * **should never throw a custom exception**.
     */
    @JvmStatic
    fun hookBlockingAfter(
        req: GeneratedMessageLite<*, *>,
        reply: GeneratedMessageLite<*, *>?,
        error: MossException?
    ): GeneratedMessageLite<*, *>? {
        MossDebugPrinter.printBlocking(req, reply, error)
        return hooks.firstOrNull { it.shouldHook(req) }?.hookAfter(req, reply, error)
            ?: if (error != null) throw error else reply
    }

    /**
     * @return [HookFlags.STOP_EXECUTION] to stop method execution and return void,
     * or null to not intercept method execution,
     * or [handler], or a proxy handler like [MossResponseHandlerProxy].
     */
    @JvmStatic
    fun hookAsyncBefore(
        req: GeneratedMessageLite<*, *>,
        handler: MossResponseHandler<Any?>?
    ): Any? {
        if (handler == null) return null
        val finalHandler = MossDebugPrinter.printAsync(req, handler)
        val hook = hooks.firstOrNull { it.shouldHook(req) }
            ?: return if (Settings.DEBUG.boolean) finalHandler else null
        if (hook.async) {
            Utils.async {
                try {
                    val before = hook.hookBefore(req)
                    finalHandler.onNext(before)
                    finalHandler.onCompleted()
                } catch (e: MossException) {
                    finalHandler.onError(e)
                }
            }
            return HookFlags.STOP_EXECUTION
        } else try {
            val before = hook.hookBefore(req)
                ?: return MossResponseHandlerProxy.get(finalHandler, { reply ->
                    reply as GeneratedMessageLite<*, *>?
                    hook.hookAfter(req, reply, null)
                }, { delegate, error ->
                    try {
                        val after = hook.hookAfter(req, null, error)
                        delegate.onNext(after)
                        delegate.onCompleted()
                        true
                    } catch (e: MossException) {
                        false
                    }
                })
            return if (before === HookFlags.STOP_EXECUTION) {
                finalHandler.onNext(null)
                finalHandler.onCompleted()
                HookFlags.STOP_EXECUTION
            } else {
                finalHandler.onNext(before)
                finalHandler.onCompleted()
                HookFlags.STOP_EXECUTION
            }
        } catch (e: MossException) {
            finalHandler.onError(e)
            return HookFlags.STOP_EXECUTION
        }
    }
}
