package app.revanced.patches.bilibili.misc.other.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructionsWithLabels
import app.revanced.patcher.extensions.InstructionExtensions.getInstruction
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patcher.util.proxy.mutableTypes.MutableMethod.Companion.toMutable
import app.revanced.patcher.util.smali.ExternalLabel
import app.revanced.patches.bilibili.misc.other.fingerprints.LiveRoomSetFloatWindowFingerprint
import app.revanced.patches.bilibili.utils.isAbstract
import app.revanced.patches.bilibili.utils.isNative
import app.revanced.util.exception
import app.revanced.util.findMutableMethodOf
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction11n
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c

@Patch(
    name = "Forbid live room auto float",
    description = "禁止直播间点小窗播放时自动开启“播放被中断时自动小窗播放”",
    compatiblePackages = [
        CompatiblePackage(name = "tv.danmaku.bili"),
        CompatiblePackage(name = "tv.danmaku.bilibilihd"),
        CompatiblePackage(name = "com.bilibili.app.in")
    ]
)
object ForbidLiveRoomAutoFloatPatch : BytecodePatch(setOf(LiveRoomSetFloatWindowFingerprint)) {
    override fun execute(context: BytecodeContext) {
        val (setClass, setMethod) = LiveRoomSetFloatWindowFingerprint.result?.let {
            it.classDef to it.method
        } ?: throw LiveRoomSetFloatWindowFingerprint.exception
        val iSetMethodSign = setMethod.toMutable().apply {
            definingClass = setClass.interfaces.first()
        }.toString()
        context.classes.asSequence().flatMap { it.methods }.filter { m ->
            m.accessFlags.let { !it.isAbstract() && !it.isNative() }
                    && m.parameterTypes.isEmpty() && m.returnType == "V"
        }.firstNotNullOfOrNull { m ->
            val instructions = m.implementation!!.instructions.toList()
            instructions.withIndex().firstNotNullOfOrNull { (index, inst) ->
                if (inst.opcode == Opcode.INVOKE_INTERFACE && (inst as Instruction35c).reference.toString() == iSetMethodSign) {
                    val ifInst = instructions[index - 2]
                    val constInst = instructions[index - 1]
                    if (ifInst.opcode == Opcode.IF_EQZ && constInst.opcode == Opcode.CONST_4 && constInst is Instruction11n) {
                        index to constInst.registerA
                    } else null
                } else null
            }?.let { (index, register) -> Triple(m, index, register) }
        }?.let { (method, index, register) ->
            context.findClass(method.definingClass)!!.mutableClass.findMutableMethodOf(method).run {
                addInstructionsWithLabels(
                    index - 1, """
                    invoke-static {}, Lapp/revanced/bilibili/patches/LiveRoomPatch;->disableAutoFloat()Z
                    move-result v$register
                    if-nez v$register, :next
                """.trimIndent(),
                    ExternalLabel("next", getInstruction(index + 1))
                )
            }
        } ?: throw PatchException("not found startMiniFloatPlay method")
    }
}
