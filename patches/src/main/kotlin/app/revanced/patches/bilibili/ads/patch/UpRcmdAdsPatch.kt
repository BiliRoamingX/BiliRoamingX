package app.revanced.patches.bilibili.ads.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Block up recommend ads",
    description = "屏蔽UP主推荐广告",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object UpRcmdAdsPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        context.findClass("Lcom/bapis/bilibili/ad/v1/SourceContentDto;")?.let { c ->
            c.mutableClass.methods.find { it.name == "getAdContent" }?.addInstructionsWithLabels(
                0, """
                invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->blockUpRcmdAds()Z
                move-result v0
                if-eqz v0, :jump
                const/4 v0, 0x0
                return-object v0
                :jump
                nop
            """.trimIndent()
            )
        }
    }
}
