package app.revanced.patches.bilibili.misc.settings.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object PreferenceManagerFingerprint : MethodFingerprint(
    strings = listOf("_has_set_default_values"),
    parameters = listOf("Landroid/content/Context;", "Ljava/lang/String;", "I", "I", "Z"),
    returnType = "V"
)
