package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.ConfigV3PreloadFingerprint
import app.revanced.patches.bilibili.misc.other.fingerprints.WebConfigFingerprint
import app.revanced.util.exception

@Patch(
    name = "Prevent pre download module",
    description = "阻止模块预下载",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "com.bilibili.app.in"),
    ]
)
object ModulePreDownloadHookPatch : BytecodePatch(setOf(ConfigV3PreloadFingerprint, WebConfigFingerprint)) {
    override fun execute(context: BytecodeContext) {
        // prevent pre download upper related modules
        ConfigV3PreloadFingerprint.result?.mutableMethod?.addInstructionsWithLabels(
            0, """
            invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->delayDownloadModules()Z
            move-result v0
            if-eqz v0, :jump
            return-void
            :jump
            nop
        """.trimIndent()
        ) ?: throw ConfigV3PreloadFingerprint.exception
        // prevent pre download small app engine
        WebConfigFingerprint.result?.mutableMethod?.addInstructionsWithLabels(
            0, """
            invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->delayDownloadModules()Z
            move-result v0
            if-eqz v0, :jump
            const/4 v0, 0x1
            return v0
            :jump
            nop
        """.trimIndent()
        ) ?: throw WebConfigFingerprint.exception
    }
}
