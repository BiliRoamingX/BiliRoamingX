package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.RawResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.settings.patch.SettingsResourcePatch
import app.revanced.util.bundledResource
import java.io.File

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
        listOf("arm64-v8a", "armeabi-v7a", "x86", "x86_64").forEach { arch ->
            val soDir = context["lib/$arch/libc++_shared.so", true].takeIf { it.isFile }?.parentFile
            if (soDir != null) {
                val soName = "libbiliroamingx.so"
                File(soDir, soName).outputStream().use { output ->
                    bundledResource("bilibili/lib/$arch/$soName").use { input ->
                        input.copyTo(output)
                    }
                }
            }
        }
    }
}
