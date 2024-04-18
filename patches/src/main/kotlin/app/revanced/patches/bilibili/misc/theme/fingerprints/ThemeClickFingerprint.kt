package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ThemeClickFingerprint : MethodFingerprint(
    strings = listOf("activity://main/login/"),
    returnType = "V",
    parameters = listOf("Landroid/view/View;"),
    customFingerprint = { methodDef, classDef ->
        methodDef.name == "onClick"
                && classDef.type.startsWith("Ltv/danmaku/bili/ui/theme/ThemeStoreActivity$")
    }
)
