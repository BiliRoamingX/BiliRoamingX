package app.revanced.patches.bilibili.misc.settings.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.removeInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

@Patch(
    name = "Hd preference fragment",
    description = "HD版本设置辅助补丁",
    compatiblePackages = [CompatiblePackage(name = "tv.danmaku.bilibilihd")]
)
object HdPreferenceFragmentPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        val clearInst = context.findClass("Ltv/danmaku/bilibilihd/ui/main/preference/HdPreferenceFragment;")
            ?.immutableClass?.methods?.find { it.name == "onDestroyView" }?.implementation?.instructions?.findLast {
                it.opcode == Opcode.INVOKE_VIRTUAL && it is Instruction35c
            } ?: throw PatchException("not found clear instruction")
        ((clearInst as Instruction35c).reference as MethodReference).let { m ->
            context.findClass(m.definingClass)!!.mutableClass.methods.first { it.name == m.name && it.parameterTypes == m.parameterTypes }
        }.run {
            val deleteIndex = implementation!!.instructions.indexOfLast { it.opcode == Opcode.SPUT_OBJECT }
            removeInstruction(deleteIndex)
        }
    }
}
