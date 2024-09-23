package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ConfigV3PreloadFingerprint : MethodFingerprint(
    strings = listOf("modDownloadingStartTime"),
    parameters = listOf(),
    returnType = "V",
)
