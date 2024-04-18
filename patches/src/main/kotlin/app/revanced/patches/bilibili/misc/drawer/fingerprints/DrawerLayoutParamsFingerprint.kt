package app.revanced.patches.bilibili.misc.drawer.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object DrawerLayoutParamsFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, classDef ->
        methodDef.definingClass.startsWith("Landroidx/drawerlayout/widget/DrawerLayout")
                && classDef.superclass == "Landroid/view/ViewGroup\$MarginLayoutParams;"
    }
)
