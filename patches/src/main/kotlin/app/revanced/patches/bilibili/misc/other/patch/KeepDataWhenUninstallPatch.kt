package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.util.get
import app.revanced.util.set

@Patch(
    name = "Keep data when uninstall",
    description = "APP卸载时保留数据",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object KeepDataWhenUninstallPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        context.document["AndroidManifest.xml"].use {
            it["application"]["android:hasFragileUserData"] = "true"
        }
    }
}
