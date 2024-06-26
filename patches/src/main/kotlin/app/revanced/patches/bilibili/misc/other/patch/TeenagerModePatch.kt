package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.TeenagersModeFingerprint
import app.revanced.util.exception

@Patch(
    name = "Teenager mode",
    description = "禁用青少年模式弹窗",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object TeenagerModePatch : BytecodePatch(setOf(TeenagersModeFingerprint)) {
    override fun execute(context: BytecodeContext) {
        TeenagersModeFingerprint.result?.mutableMethod?.addInstructionsWithLabels(
            0, """
            invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->disableTeenagerDialog()Z
            move-result v0
            if-eqz v0, :jump
            const/4 v0, 0x0
            return v0
            :jump
            nop
        """.trimIndent()
        ) ?: throw TeenagersModeFingerprint.exception
    }
}
