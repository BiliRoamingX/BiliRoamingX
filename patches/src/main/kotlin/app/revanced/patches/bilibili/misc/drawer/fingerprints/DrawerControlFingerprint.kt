package app.revanced.patches.bilibili.misc.drawer.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.iface.instruction.formats.Instruction11n

open class DrawerControlFingerprint(open: Boolean) : MethodFingerprint(
    returnType = "V",
    strings = listOf("is not a sliding drawer"),
    parameters = listOf("Landroid/view/View;", "Z"),
    customFingerprint = { methodRef, _ ->
        methodRef.definingClass == "Landroidx/drawerlayout/widget/DrawerLayout;"
                && methodRef.implementation?.instructions?.any {
            it is Instruction11n && it.registerA == 1
                    && it.wideLiteral == if (open) 0x0L else 0x4L
        } ?: false
    }
)

object OpenDrawerControlFingerprint : DrawerControlFingerprint(true)
object CloseDrawerControlFingerprint : DrawerControlFingerprint(false)
