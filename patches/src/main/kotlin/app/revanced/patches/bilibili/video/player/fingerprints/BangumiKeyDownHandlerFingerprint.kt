package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object BangumiKeyDownHandlerFingerprint : MethodFingerprint(
    returnType = "Z",
    opcodes = listOf(
        Opcode.INVOKE_DIRECT,
        Opcode.MOVE_RESULT,
        Opcode.CONST_4,
        Opcode.IF_EQZ,
        Opcode.RETURN,
        Opcode.CONST_4,
        Opcode.CONST_4,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.CONST_16,
        Opcode.IF_EQ,
        Opcode.RETURN,
    ),
    customFingerprint = { methodDef, _ ->
        methodDef.parameterTypes.let {
            it.size == 3 && it[0] == "I" && it[1] == it[2]
        }
    }
)
