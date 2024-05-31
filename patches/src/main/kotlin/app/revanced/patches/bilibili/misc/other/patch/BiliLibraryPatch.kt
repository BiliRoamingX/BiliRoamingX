package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.RawResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.settings.patch.SettingsResourcePatch
import app.revanced.util.bundledResource

@Patch(
    name = "Bili library patch",
    description = "so库修补（目前绕过了签名校验）",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    dependencies = [SettingsResourcePatch::class]
)
object BiliLibraryPatch : RawResourcePatch() {
    override fun execute(context: ResourceContext) {
        mapOf(
            "tv.danmaku.bili" to "libbili-pink.so",
            "com.bilibili.app.in" to "libbili-play.so",
            "tv.danmaku.bilibilihd" to "libbili-hd.so",
        ).asSequence().find { (k, _) -> k == SettingsResourcePatch.packageName }?.value?.let { soName ->
            val soFile = context["lib/arm64-v8a/libbili.so", true].takeIf { it.isFile }
            soFile?.delete()
            soFile?.outputStream()?.use { output ->
                bundledResource("bilibili/libs/arm64-v8a/$soName").use { input ->
                    input.copyTo(output)
                }
            }
        }
    }
}
