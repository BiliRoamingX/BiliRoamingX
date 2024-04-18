package app.revanced.patches.bilibili.misc.integrations.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object BaseMainFrameFragmentFingerprint : MethodFingerprint(
    strings = listOf("home.menu_update_enable"),
    parameters = listOf("Ljava/util/List;"),
    returnType = "V"
)
