package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object HeadersFingerprint : MethodFingerprint(
    strings = listOf("Expected alternating header names and values")
)
