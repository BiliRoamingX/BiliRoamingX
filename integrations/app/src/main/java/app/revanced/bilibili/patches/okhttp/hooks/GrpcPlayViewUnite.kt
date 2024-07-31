package app.revanced.bilibili.patches.okhttp.hooks

import android.util.Pair
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.patches.okhttp.BaseFakeClientGrpcHook
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.base64
import app.revanced.bilibili.utils.base64Decode
import app.revanced.bilibili.utils.getFinalAccessKey
import com.bapis.bilibili.metadata.network.Network
import com.bapis.bilibili.metadata.network.NetworkType

object GrpcPlayViewUnite : BaseFakeClientGrpcHook() {
    override val fakeToClient: Client
        get() = Client.Pink

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return url.endsWith(MossPatch.PLAY_VIEW_UNITE_API)
    }

    override fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        val newHeaders = if (Settings.UnlockAreaLimit() && Utils.isPlay()) {
            super.hookBefore(url, headers).second
        } else headers
        val authIndex = newHeaders.indexOfFirst { it == "authorization" }
        if (authIndex != -1)
            newHeaders[authIndex + 1] = "identify_v1 ${getFinalAccessKey(false)}"
        if ((Utils.isPink() || Utils.isPlay()) && Settings.TrialVipQuality() && !Accounts.isEffectiveVip) {
            val keyIndex = newHeaders.indexOfFirst { it == "x-bili-network-bin" }
            if (keyIndex == -1)
                return Pair.create(url, newHeaders)
            val networkBin = newHeaders.getOrNull(keyIndex + 1)
            if (!networkBin.isNullOrEmpty()) {
                val newNetworkBin = Network.parseFrom(networkBin.base64Decode).apply {
                    type = NetworkType.WIFI
                }.toByteArray().base64
                newHeaders[keyIndex + 1] = newNetworkBin
            }
        }
        return Pair.create(url, newHeaders)
    }
}
