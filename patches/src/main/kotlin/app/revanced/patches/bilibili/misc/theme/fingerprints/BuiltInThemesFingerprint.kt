package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction35c

object BuiltInThemesFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ ->
        methodDef.name == "<clinit>" && methodDef.implementation?.instructions?.count { inst ->
            inst.opcode == Opcode.INVOKE_VIRTUAL && inst is Instruction35c
                    && inst.reference.toString() == "Lcom/bilibili/lib/ui/garb/Garb;->setDarkMode(Z)V"
        } == 2
    }
)
