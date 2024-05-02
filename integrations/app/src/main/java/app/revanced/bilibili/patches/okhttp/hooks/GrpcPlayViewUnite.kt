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
import com.bapis.bilibili.metadata.network.Network
import com.bapis.bilibili.metadata.network.NetworkType

object GrpcPlayViewUnite : BaseFakeClientGrpcHook() {
    override val fakeToClient: Client
        get() = Client.PINK

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return url.endsWith(MossPatch.PLAY_VIEW_UNITE_API)
    }

    override fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        val newHeaders = if (Settings.UNLOCK_AREA_LIMIT.boolean && Utils.isPlay()) {
            super.hookBefore(url, headers).second
        } else headers
        if ((Utils.isPink() || Utils.isPlay()) && Settings.TRIAL_VIP_QUALITY.boolean && !Accounts.isEffectiveVip) {
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
