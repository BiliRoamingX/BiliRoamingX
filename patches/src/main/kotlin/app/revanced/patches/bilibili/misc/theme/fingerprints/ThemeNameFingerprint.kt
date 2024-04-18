package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object ThemeNameFingerprint : MethodFingerprint(
    strings = listOf("purple"),
    opcodes = listOf(
        Opcode.CONST_16,
        Opcode.NEW_ARRAY,
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.CONST_STRING,
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT_OBJECT,
    ),
    customFingerprint = { methodDef, _ ->
        methodDef.name == "<clinit>"
    }
)
