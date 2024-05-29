package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.WideLiteralInstruction

object SetUnitedTabLayoutFingerprint : MethodFingerprint(
    parameters = listOf("Ljava/lang/Object;"),
    returnType = "Ljava/lang/Object;",
    customFingerprint = { methodDef, _ ->
        val instructions = methodDef.implementation?.instructions?.toList().orEmpty()
        instructions.any { it.opcode == Opcode.CONST_16 && (it as WideLiteralInstruction).wideLiteral == 0x19L }
                && instructions.any { it.opcode == Opcode.CONST_16 && (it as WideLiteralInstruction).wideLiteral == 0xcL }
    }
)
