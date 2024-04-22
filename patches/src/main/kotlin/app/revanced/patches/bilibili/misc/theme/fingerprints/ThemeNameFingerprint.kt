package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

object ThemeNameFingerprint : MethodFingerprint(
    strings = listOf("purple"),
    customFingerprint = { methodDef, _ ->
        methodDef.name == "<clinit>"
                && methodDef.implementation!!.instructions.toList().let { instructions ->
            val idInstIndex = instructions.indexOfFirst {
                it.opcode == Opcode.CONST_4 && (it as WideLiteralInstruction).wideLiteral == 0x7L
            }
            idInstIndex != -1 && instructions[idInstIndex + 1].let {
                it.opcode == Opcode.INVOKE_STATIC && it.getReference<MethodReference>()
                    .toString() == "Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;"
            }
        }
    }
)
