package app.revanced.patches.bilibili.layout.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.patches.bilibili.utils.toClassDefOrNull
import app.revanced.util.findMutableMethodOf

@Patch(
    name = "Remove vip section",
    description = "移除我的页面大会员横幅",
    compatiblePackages = [CompatiblePackage(name = "tv.danmaku.bili"), CompatiblePackage(name = "com.bilibili.app.in")]
)
object RemoveVipSectionPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val userCenterFragmentType = "Ltv/danmaku/bili/ui/main2/mine/HomeUserCenterFragment;"
        val homeUserCenterFragmentClass = context.findClass(userCenterFragmentType)
            ?: throw PatchException("not found HomeUserCenterFragment")
        homeUserCenterFragmentClass.mutableClass.run {
            val method = methods.first { it.name == "onResume" }
            method.cloneMutable(registerCount = 1, clearImplementation = true).apply {
                method.name += "_Origin"
                addInstructions(
                    """
                    invoke-virtual {p0}, $method
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/RemoveVipSectionPatch;->onUserCenterFragmentResume($userCenterFragmentType)V
                    return-void
                """.trimIndent()
                )
            }.also { methods.add(it) }
            val iOnSkinChangeMethod = interfaces.firstNotNullOf { c ->
                c.toClassDefOrNull(context)?.methods?.singleOrNull()?.takeIf {
                    it.parameterTypes == listOf("Lcom/bilibili/lib/ui/garb/Garb;") && it.returnType == "V"
                }
            }
            val onSkinChangeMethod = findMutableMethodOf(iOnSkinChangeMethod)
            onSkinChangeMethod.cloneMutable(registerCount = 2, clearImplementation = true).apply {
                onSkinChangeMethod.name += "_Origin"
                addInstructions(
                    """
                    invoke-virtual {p0, p1}, $onSkinChangeMethod    
                    invoke-static {p0}, Lapp/revanced/bilibili/patches/RemoveVipSectionPatch;->onUserCenterFragmentSkinChanged($userCenterFragmentType)V
                    return-void
                """.trimIndent()
                )
            }.also { methods.add(it) }
        }
    }
}
