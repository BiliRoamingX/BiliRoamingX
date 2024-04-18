package app.revanced.patches.bilibili.misc.darkswitch.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object SwitchDarkModeFingerprint : MethodFingerprint(
    strings = listOf("default"),
    returnType = "V",
    parameters = listOf("Z"),
    customFingerprint = { _, classDef ->
        classDef.type.endsWith("HomeUserCenterFragment;")
    }
)

object HdNewSwitchDarkModeFingerprint : MethodFingerprint(
    strings = listOf("default"),
    returnType = "V",
    parameters = listOf("Z"),
    customFingerprint = { _, classDef ->
        classDef.type == "Ltv/danmaku/bilibilihd/ui/main/mine/common/HdCommonBaseFragment;"
    }
)
