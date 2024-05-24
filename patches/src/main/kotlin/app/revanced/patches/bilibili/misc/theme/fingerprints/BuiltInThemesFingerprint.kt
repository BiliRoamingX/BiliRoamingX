package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import app.revanced.util.getReference
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
import com.android.tools.smali.dexlib2.iface.reference.MethodReference

object BuiltInThemesFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ ->
        methodDef.name == "<clinit>" && methodDef.implementation?.instructions?.count { inst ->
            inst.opcode == Opcode.INVOKE_VIRTUAL && inst.getReference<MethodReference>().toString() ==
                    "Lcom/bilibili/lib/ui/garb/Garb;->setDarkMode(Z)V"
        } == 2
    }
)

// start from 7.80.0
object BuiltInThemesFingerprint2 : MethodFingerprint(
    customFingerprint = { methodDef, _ ->
        methodDef.name == "<clinit>" && methodDef.implementation?.instructions?.count { inst ->
            val embeddedGarbType = "Lcom/bilibili/compose/theme/EmbeddedGarb;"
            inst.opcode == Opcode.SGET_OBJECT && inst.getReference<FieldReference>()
                .let { it.definingClass == embeddedGarbType && it.type == embeddedGarbType }
        } == 8
    }
)
