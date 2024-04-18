package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.AppendTrackingInfoFingerprint
import app.revanced.patches.bilibili.misc.other.fingerprints.ShareToFingerprint
import app.revanced.patches.bilibili.utils.cloneMutable
import app.revanced.util.exception
import app.revanced.util.findMutableMethodOf
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "Share",
    description = "分享处理相关补丁",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object SharePatch : BytecodePatch(setOf(ShareToFingerprint, AppendTrackingInfoFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val result = ShareToFingerprint.result
        val shareToMethodRef = result?.method?.implementation?.instructions
            ?.firstNotNullOfOrNull { inst ->
                if (inst.opcode == Opcode.INVOKE_VIRTUAL && inst is Instruction35c) {
                    (inst.reference as MethodReference).let {
                        if (it.parameterTypes == listOf("Ljava/lang/String;", "Landroid/os/Bundle;")) it else null
                    }
                } else null
            } ?: throw ShareToFingerprint.exception
        result.mutableClass.run {
            findMutableMethodOf(shareToMethodRef).let { method ->
                method.cloneMutable(registerCount = 4, clearImplementation = true).apply {
                    method.name += "_Origin"
                    addInstructionsWithLabels(
                        0, """
                        invoke-static {p1, p2}, Lapp/revanced/bilibili/patches/SharePatch;->onShareTo(Ljava/lang/String;Landroid/os/Bundle;)Z
                        move-result v0
                        if-nez v0, :return
                        invoke-virtual {p0, p1, p2}, $method
                        :return
                        return-void
                    """.trimIndent()
                    )
                }.also {
                    methods.add(it)
                }
            }
        }
        AppendTrackingInfoFingerprint.result?.mutableMethod?.addInstructionsWithLabels(
            0, """
                invoke-static {}, Lapp/revanced/bilibili/patches/SharePatch;->disableAppendTrackingInfo()Z
                move-result v0
                if-eqz v0, :jump
                return-object p1
                :jump
                nop
            """.trimIndent()
        ) ?: throw AppendTrackingInfoFingerprint.exception
    }
}
