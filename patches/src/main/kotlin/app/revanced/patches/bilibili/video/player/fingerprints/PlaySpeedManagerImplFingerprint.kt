package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction21ih

object PlaySpeedManagerImplFingerprint : MethodFingerprint(
    returnType = "V",
    parameters = listOf(),
    customFingerprint = { methodDef, classDef ->
        (methodDef.name == "<init>") && classDef.run {
            superclass == "Ljava/lang/Object;" && interfaces.size == 1
                    && methods.count { it.parameterTypes.isEmpty() && it.returnType == "F" } == 2
        } && run {
            val instructions = methodDef.implementation!!.instructions.toList()
            (instructions.take(4).map { it.opcode } == listOf(
                Opcode.INVOKE_DIRECT,
                Opcode.CONST_HIGH16,
                Opcode.INVOKE_STATIC,
                Opcode.MOVE_RESULT_OBJECT,
            )) && (instructions[1] as Instruction21ih).wideLiteral == 0x3f800000L
        }
    }
)
