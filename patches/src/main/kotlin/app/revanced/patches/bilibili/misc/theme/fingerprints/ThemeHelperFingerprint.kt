package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ThemeHelperFingerprint : MethodFingerprint(
    strings = listOf("theme_entries_last_key"),
    returnType = "I",
    parameters = listOf("Landroid/content/Context;")
)
