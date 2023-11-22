package app.revanced.bilibili.patches.protobuf

import app.revanced.bilibili.meta.HookFlags
import app.revanced.bilibili.patches.protobuf.hooks.SearchByType
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

/**
 * You don’t have to care whether it’s a synchronous call or an asynchronous call,
 * [MossPatch] will handle it.
 */
abstract class MossHook<out Req : GeneratedMessageLite<*, *>, out Resp : GeneratedMessageLite<*, *>> {

    /**
     * for some rare case, see [MossPatch.hookAsyncBefore] & [SearchByType].
     */
    open val async: Boolean = false

    abstract fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean

    /**
     * @return [HookFlags.STOP_EXECUTION] to stop method execution and return null,
     * or null to not intercept method execution,
     * or custom response,
     * or throw [MossException].
     *
     * default return null.
     */
    open fun hookBefore(req: @UnsafeVariance Req): Any? = null

    /**
     * @return null or [reply], or custom response, or throw nonnull [error].
     *
     * **should never throw a custom exception**.
     *
     * default throw [error] if [error] is not null, else return [reply].
     */
    open fun hookAfter(
        req: @UnsafeVariance Req,
        reply: @UnsafeVariance Resp?,
        error: MossException?
    ) = if (error != null) throw error else reply
}
