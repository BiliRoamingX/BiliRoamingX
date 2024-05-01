package app.revanced.bilibili.patches.okhttp.hooks

import android.util.Pair
import app.revanced.bilibili.account.Accounts
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.base64
import app.revanced.bilibili.utils.base64Decode
import com.bapis.bilibili.metadata.network.Network
import com.bapis.bilibili.metadata.network.NetworkType

object PinNetworkTypeForTrialQuality : ApiHook() {
    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Utils.isPink() && Settings.TRIAL_VIP_QUALITY.boolean
                && !Accounts.isEffectiveVip && url.endsWith(MossPatch.PLAY_VIEW_UNITE_API)
    }

    override fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        val keyIndex = headers.indexOfFirst { it == "x-bili-network-bin" }
        if (keyIndex == -1)
            return Pair.create(url, headers)
        val networkBin = headers.getOrNull(keyIndex + 1)
        if (!networkBin.isNullOrEmpty()) {
            val newNetworkBin = Network.parseFrom(networkBin.base64Decode).apply {
                type = NetworkType.WIFI
            }.toByteArray().base64
            headers[keyIndex + 1] = newNetworkBin
        }
        return Pair.create(url, headers)
    }
}
