package app.revanced.patches.bilibili.misc.copy.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object DescCopyFingerprint : MultiMethodFingerprint(
    returnType = "V",
    parameters = listOf("Z", "Ljava/lang/String;"),
    strings = listOf("clipboard", "text")
)
