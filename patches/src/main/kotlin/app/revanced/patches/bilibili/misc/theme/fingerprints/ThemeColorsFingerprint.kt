package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ThemeColorsFingerprint : MethodFingerprint(
    strings = listOf("GarbThemeColors(garb=")
)
