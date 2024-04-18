package app.revanced.patches.bilibili.video.subtitle.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object PlayerSubtitleFunctionWidgetFingerprint : MultiMethodFingerprint(
    strings = listOf("PlayerSubtitleFunctionWidget"),
    parameters = listOf(),
    returnType = "Ljava/lang/String;"
)
