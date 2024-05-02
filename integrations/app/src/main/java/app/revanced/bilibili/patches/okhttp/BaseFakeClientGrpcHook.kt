package app.revanced.bilibili.patches.okhttp

import android.util.Pair
import app.revanced.bilibili.meta.Client
import app.revanced.bilibili.utils.grpcDeviceHeader
import app.revanced.bilibili.utils.grpcMetadataHeader

abstract class BaseFakeClientGrpcHook : ApiHook() {
    abstract val fakeToClient: Client

    override fun hookBefore(
        url: String,
        headers: Array<String>
    ): Pair<String, Array<String>> {
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
        list.add(grpcMetadataHeader(fakeToClient))
        list.add("x-bili-device-bin")
        list.add(grpcDeviceHeader(fakeToClient))
        return Pair.create(url, list.toTypedArray())
    }
}
