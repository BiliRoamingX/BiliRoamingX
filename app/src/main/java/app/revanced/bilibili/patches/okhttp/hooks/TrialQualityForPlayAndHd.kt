package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.patches.okhttp.BaseFakeClientGrpcHook
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

object TrialQualityForPlayAndHd : BaseFakeClientGrpcHook() {
    override val fakeToClient: Client
        get() = Client.PINK

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.TRIAL_VIP_QUALITY.boolean && (Utils.isHd() || Utils.isPlay())
                && url.endsWith(MossPatch.FAKE_TO_PINK_FOR_TRIAL_QUALITY_API)
    }
}
