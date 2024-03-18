package app.revanced.bilibili.patches.okhttp.hooks

import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.patches.okhttp.BaseFakeClientGrpcHook
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils

object UnlockPGCPlayViewForPlay : BaseFakeClientGrpcHook() {
    override val fakeToClient: Client
        get() = Client.PINK

    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.UNLOCK_AREA_LIMIT.boolean && Utils.isPlay()
                && MossPatch.fakeToPinkForUnlockAreaLimitApis.any { url.endsWith(it) }
    }
}
