package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object WebConfigFingerprint : MethodFingerprint(
    strings = listOf("force_webview"),
    parameters = listOf(),
    returnType = "Z",
)
