package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object AppendTrackingInfoFingerprint : MethodFingerprint(
    strings = listOf("share_medium", "share_source", "bbid", "ts"),
    returnType = "Ljava/lang/String;",
    parameters = listOf("Ljava/lang/String;", "Ljava/lang/String;")
)
