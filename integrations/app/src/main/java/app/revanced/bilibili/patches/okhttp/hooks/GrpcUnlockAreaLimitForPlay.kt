package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.patches.okhttp.BaseFakeClientGrpcHook
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

object GrpcUnlockAreaLimitForPlay : BaseFakeClientGrpcHook() {
    override val fakeToClient: Client
        get() = Client.Pink

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.UnlockAreaLimit() && Utils.isPlay()
                && MossPatch.fakeToPinkForUnlockAreaLimitApis.any { url.endsWith(it) }
    }
}
