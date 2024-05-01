package app.revanced.bilibili.patches.protobuf

import androidx.annotation.Keep
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.api.MossResponseHandlerProxy
import app.revanced.bilibili.meta.HookFlags
import app.revanced.bilibili.patches.protobuf.hooks.*
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.*
import com.bapis.bilibili.metadata.network.Network
import com.bapis.bilibili.metadata.network.NetworkType
import com.bilibili.lib.moss.api.MossException
import com.bilibili.lib.moss.api.MossResponseHandler
import com.google.protobuf.GeneratedMessageLite
import java.util.AbstractMap

object MossPatch {
    private val hooks = arrayOf(
        DistributionUserPreference,
        DmSegMobile,
        DmView,
        DynAll,
        DynRed,
        DynTab,
        DynVideo,
        ListenPlayHistory,
        ListenPlaylist,
        ListenPlayURL,
        ListenRcmdPlaylist,
        ListFavoriteTab,
        ModuleList,
        PlayURLPlayConf,
        PlayURLPlayConfEdit,
        PlayURLPlayViewPGC,
        PlayURLPlayViewUGC,
        PlayURLPlayViewUnite,
        Popular,
        ReplyDetailList,
        ReplyMainList,
        ReplySubjectDescription,
        ResourceTopActivity,
        SearchAll,
        SearchByType,
        SearchDefaultWords,
        View,
        ViewContinuousPlay,
        ViewLike,
        ViewProgress,
        ViewProgressUnite,
        ViewRelatesFeed,
        ViewRelatesFeedUnite,
        ViewTFInfo,
        ViewUnite
    )

    const val PLAY_VIEW_UNITE_API = "bilibili.app.playerunite.v1.Player/PlayViewUnite"

    val fakeToPinkForUnlockAreaLimitApis = arrayOf(
        "bilibili.pgc.gateway.player.v2.PlayURL/PlayView",
        "bilibili.app.viewunite.v1.View/View",
        PLAY_VIEW_UNITE_API,
    )

    val fakeToPinkForIPApis = arrayOf(
        "bilibili.main.community.reply.v1.Reply/MainList",
        "bilibili.main.community.reply.v1.Reply/DetailList",
    )

    /**
     * @return [HookFlags.STOP_EXECUTION] to stop method execution and return null,
     * or null to not intercept method execution,
     * or custom response,
     * or throw [MossException].
     */
    @Keep
    @JvmStatic
    fun hookBlockingBefore(req: GeneratedMessageLite<*, *>): Any? {
        return hooks.firstOrNull { it.shouldHook(req) }?.hookBefore(req)
    }

    /**
     * @return null or [reply], or custom response, or throw nonnull [error].
     *
     * **should never throw a custom exception**.
     */
    @Keep
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
    @Keep
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

    @Keep
    @JvmStatic
    fun hookBeforeRequest(url: String, headers: ArrayList<Map.Entry<String, String>>): String {
        if (Settings.UNLOCK_AREA_LIMIT.boolean && Utils.isPlay()
            && fakeToPinkForUnlockAreaLimitApis.any { url.endsWith(it) }
            || Settings.FORCE_SHOW_IP.boolean && Utils.isPlay()
            && fakeToPinkForIPApis.any { url.endsWith(it) }
        ) {
            headers.removeIf { (k, _) -> k == "x-bili-metadata-bin" || k == "x-bili-device-bin" }
            headers.add(AbstractMap.SimpleImmutableEntry("x-bili-metadata-bin", pinkMetadataHeader))
            headers.add(AbstractMap.SimpleImmutableEntry("x-bili-device-bin", pinkDeviceHeader))
        } else if (Utils.isPink() && Settings.TRIAL_VIP_QUALITY.boolean
            && !Accounts.isEffectiveVip && url.endsWith(PLAY_VIEW_UNITE_API)
        ) {
            val networkBinKey = "x-bili-network-bin"
            val networkBinValue = headers.find { it.key == networkBinKey }?.value
            if (!networkBinValue.isNullOrEmpty()) {
                val newNetworkBin = Network.parseFrom(networkBinValue.base64Decode).apply {
                    type = NetworkType.WIFI
                }.toByteArray().base64
                headers.removeIf { (k, _) -> k == networkBinKey }
                headers.add(AbstractMap.SimpleImmutableEntry(networkBinKey, newNetworkBin))
            }
        }
        return url
    }
}
