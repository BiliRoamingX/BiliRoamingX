package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode

object PlayerGestureListenerFingerprint : MethodFingerprint(
    parameters = listOf("Landroid/view/MotionEvent;"),
    returnType = "V",
    opcodes = listOf(
        Opcode.IGET_OBJECT,
        Opcode.IF_EQZ,
        Opcode.IGET_BOOLEAN,
        Opcode.IF_EQZ,
        Opcode.INVOKE_INTERFACE,
        Opcode.CONST_4,
        Opcode.IPUT_BOOLEAN,
        Opcode.RETURN_VOID,
    ),
    customFingerprint = { methodDef, classDef ->
        methodDef.name == "onLongPress"
                && classDef.superclass == "Landroid/view/GestureDetector\$SimpleOnGestureListener;"
    }
)
