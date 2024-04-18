package app.revanced.patches.bilibili.misc.drawer.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction11n

object DrawerIsOpenFingerprint : MethodFingerprint(
    returnType = "Z",
    strings = listOf("is not a drawer"),
    parameters = listOf("Landroid/view/View;"),
    customFingerprint = { methodDef, _ ->
        methodDef.definingClass == "Landroidx/drawerlayout/widget/DrawerLayout;"
                && methodDef.implementation?.instructions?.find {
            it is Instruction11n
        }?.let {
            it as Instruction11n
            it.registerA == 0 && it.wideLiteral == 0x1L
        } ?: false
    }
)
