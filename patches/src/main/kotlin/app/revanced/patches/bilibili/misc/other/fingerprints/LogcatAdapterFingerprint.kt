package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object LogcatAdapterFingerprint : MethodFingerprint(
    strings = listOf("BLOG-EVENT-"),
    returnType = "V",
    parameters = listOf("Ljava/lang/String;", "Ljava/lang/String;")
)
