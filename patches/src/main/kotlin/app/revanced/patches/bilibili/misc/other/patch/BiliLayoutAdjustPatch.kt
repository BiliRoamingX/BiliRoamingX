package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.replaceInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.bilibili.misc.other.fingerprints.SetUnitedTabLayoutFingerprint
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction21s

@Patch(
    name = "Bili adjust layout (codes)",
    description = "调整部分布局UI",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object BiliLayoutAdjustPatch : BytecodePatch(setOf(SetUnitedTabLayoutFingerprint)) {
    override fun execute(context: BytecodeContext) {
        SetUnitedTabLayoutFingerprint.result?.mutableMethod?.run {
            val (index1, register1) = implementation!!.instructions.withIndex().firstNotNullOf { (index, inst) ->
                if (inst.opcode == Opcode.CONST_16 && inst is Instruction21s && inst.wideLiteral == 0x19L) {
                    index to inst.registerA
                } else null
            }
            val (index2, register2) = implementation!!.instructions.withIndex().firstNotNullOf { (index, inst) ->
                if (inst.opcode == Opcode.CONST_16 && inst is Instruction21s && inst.wideLiteral == 0xcL) {
                    index to inst.registerA
                } else null
            }
            // change tab horizontal padding
            replaceInstruction(index1, "const/16 v$register1, 0x10") // tab size <= 2
            replaceInstruction(index2, "const/16 v$register2, 0xc")  // tab size > 2
        }
    }
}
