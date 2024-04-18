package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

object FavFolderOnDataSuccessNewFingerprint : MethodFingerprint(
    returnType = "V",
    parameters = listOf("Lcom/bilibili/playerbizcommonv2/utils/PlaySetPageData;"),
    accessFlags = AccessFlags.PRIVATE.value or AccessFlags.FINAL.value,
    opcodes = listOf(
        Opcode.INVOKE_VIRTUAL,
        Opcode.IF_EQZ,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.IF_EQZ,
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT_OBJECT
    )
)
