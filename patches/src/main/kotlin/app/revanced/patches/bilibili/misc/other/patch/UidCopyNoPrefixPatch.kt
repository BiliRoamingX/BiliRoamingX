package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.UidCopyFingerprint
import app.revanced.util.exception
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction

@Patch(
    name = "Uid copy no prefix",
    description = "用户空间页复制UID时去掉“UID:”前缀",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object UidCopyNoPrefixPatch : BytecodePatch(setOf(UidCopyFingerprint)) {
    override fun execute(context: BytecodeContext) {
        UidCopyFingerprint.result?.run {
            val index = scanResult.stringsScanResult!!.matches.first { it.string == "UID:%s" }.index
            val register = (mutableMethod.implementation!!.instructions[index] as OneRegisterInstruction).registerA
            mutableMethod.addInstructionsWithLabels(
                index + 1, """
                invoke-static {}, Lapp/revanced/bilibili/patches/SettingsTransfer;->uidCopyNoPrefix()Z
                move-result v$register
                if-eqz v$register, :has_prefix
                const-string v$register, "%s"
                goto :no_prefix
                :has_prefix
                const-string v$register, "UID:%s"
                :no_prefix
                nop
            """.trimIndent()
            )
        } ?: throw UidCopyFingerprint.exception
    }
}
