package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.utils.cloneMutable
import com.android.tools.smali.dexlib2.Opcode

@Patch(
    name = "Custom splash",
    description = "自定义启动图",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object CustomSplashPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Ltv/danmaku/bili/ui/splash/brand/model/BrandShowInfo;")
            ?.mutableClass?.methods?.first { it.name == "getMode" }?.run {
                val returnIdx = implementation!!.instructions.indexOfLast { it.opcode == Opcode.RETURN_OBJECT }
                addInstructions(
                    returnIdx, """
                    invoke-static {v0}, Lapp/revanced/bilibili/patches/SplashPatch;->getMode(Ljava/lang/String;)Ljava/lang/String;
                    move-result-object v0
                """.trimIndent()
                )
            } ?: throw PatchException("not found BrandShowInfo#getMode method")
        context.findClass("Ltv/danmaku/bili/ui/splash/brand/ui/BaseBrandSplashFragment;")
            ?.mutableClass?.run {
                val method = methods.first { it.name == "onViewCreated" }
                method.cloneMutable(registerCount = 3, clearImplementation = true).apply {
                    method.name += "_Origin"
                    addInstructions(
                        """
                        invoke-virtual {p0, p1, p2}, $method
                        invoke-static {p1}, Lapp/revanced/bilibili/patches/SplashPatch;->onBrandSplashFragmentViewCreated(Landroid/view/View;)V
                        return-void
                    """.trimIndent()
                    )
                }.also { methods.add(it) }
            } ?: throw PatchException("not found BaseBrandSplashFragment class")
    }
}
