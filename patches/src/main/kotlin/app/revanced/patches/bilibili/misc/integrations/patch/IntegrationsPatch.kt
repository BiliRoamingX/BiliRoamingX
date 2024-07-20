package app.revanced.patches.bilibili.misc.integrations.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Integrations",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ],
    requiresIntegrations = true
)
object IntegrationsPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val biliAppClass = context.findClass("Lcom/bilibili/gripper/BiliApp;")?.mutableClass
            ?: throw PatchException("BiliApp class not found")
        val appDelegateClass =
            context.findClass("Lapp/revanced/bilibili/patches/main/ApplicationDelegate;")!!.mutableClass
        appDelegateClass.setSuperClass(biliAppClass.superclass)
        biliAppClass.setSuperClass(appDelegateClass.type)
    }
}
