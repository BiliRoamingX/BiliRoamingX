package app.revanced.bilibili.patches.okhttp.hooks

import android.util.Pair
import app.revanced.bilibili.patches.okhttp.ApiHook
import app.revanced.bilibili.patches.protobuf.MossPatch
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Utils
import app.revanced.bilibili.utils.pinkDeviceHeader
import app.revanced.bilibili.utils.pinkMetadataHeader

object PlayFakeToPinkGrpc : ApiHook() {
    override fun shouldHookBefore(url: String, headers: Array<String>): Boolean {
        return Settings.UNLOCK_AREA_LIMIT.boolean && Utils.isPlay()
                && MossPatch.fakeToPinkForUnlockAreaLimitApis.any { url.endsWith(it) }
                || Settings.TRIAL_VIP_QUALITY.boolean && (Utils.isHd() || Utils.isPlay())
                && url.endsWith(MossPatch.FAKE_TO_PINK_FOR_TRIAL_QUALITY_API)
    }

    override fun hookBefore(url: String, headers: Array<String>): Pair<String, Array<String>> {
        // maybe fallback to rest api
        val list = headers.toMutableList()
        var i = 0
        while (i < list.size) {
            val key = list[i]
            if (key == "x-bili-metadata-bin" || key == "x-bili-device-bin") {
                list.removeAt(i)
                list.removeAt(i)
                i -= 2
            }
            i += 2
        }
        list.add("x-bili-metadata-bin")
        list.add(pinkMetadataHeader)
        list.add("x-bili-device-bin")
        list.add(pinkDeviceHeader)
        return Pair.create(url, list.toTypedArray())
    }
}
