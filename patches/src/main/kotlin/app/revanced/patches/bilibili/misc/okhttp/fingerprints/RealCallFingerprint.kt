package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object RealCallFingerprint : MethodFingerprint(
    strings = listOf("Canceled"),
    parameters = listOf(),
    opcodes = listOf(
        Opcode.NEW_INSTANCE,
        Opcode.INVOKE_DIRECT,
        Opcode.IGET_OBJECT,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_OBJECT,
    ),
    customFingerprint = { methodDef, _ ->
        methodDef.returnType == ResponseFingerprint.result!!.classDef.type
    }
)
