package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.AppendTrackingInfoFingerprint
import app.revanced.util.exception

@Patch(
    name = "Share",
    description = "分享处理相关补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object SharePatch : BytecodePatch(setOf(AppendTrackingInfoFingerprint)) {
    override fun execute(context: BytecodeContext) {
        AppendTrackingInfoFingerprint.result?.mutableMethod?.run {
            addInstructionsWithLabels(
                0, """
                invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->disableAppendTrackingInfo()Z
                move-result v0
                if-eqz v0, :jump
                return-object v${implementation!!.registerCount - 1}
                :jump
                nop
            """.trimIndent()
            )
        } ?: throw AppendTrackingInfoFingerprint.exception
    }
}
