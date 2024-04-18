package app.revanced.patches.bilibili.misc.copy.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

open class BaseCommentCopyFingerprint(identityType: String) : MethodFingerprint(
    returnType = "Z",
    parameters = listOf("Landroid/view/View;"),
    opcodes = listOf(
        Opcode.IGET_OBJECT,
        Opcode.IGET_OBJECT,
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT,
        Opcode.RETURN
    ),
    customFingerprint = { methodDef, classDef ->
        methodDef.name == "onLongClick" && classDef.interfaces == listOf("Landroid/view/View\$OnLongClickListener;")
                && classDef.fields.toList().let { fields ->
            fields.count() == 2 && fields.all { AccessFlags.SYNTHETIC.isSet(it.accessFlags) }
                    && fields.any { it.type == identityType }
        }
    }
)
