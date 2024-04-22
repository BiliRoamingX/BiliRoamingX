package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object PlayerGestureRotateFingerprint : MethodFingerprint(
    returnType = "Z",
    opcodes = listOf(
        Opcode.IGET_BOOLEAN,
        Opcode.CONST_4,
        Opcode.IF_NEZ,
        Opcode.RETURN,
        Opcode.IF_NEZ,
        Opcode.RETURN,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT,
        Opcode.CONST_4,
        Opcode.CMPL_FLOAT,
        Opcode.IF_LEZ
    ),
    customFingerprint = { methodDef, classDef ->
        methodDef.parameterTypes.size == 1
                && classDef.type == PlayerResizableGestureListenerFingerprint.result!!.classDef.type
    }
)
