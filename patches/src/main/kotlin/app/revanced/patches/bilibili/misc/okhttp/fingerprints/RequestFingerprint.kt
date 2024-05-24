package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object RequestFingerprint : MethodFingerprint(
    strings = listOf("Request{method=", "tags=", "callTimeout=")
)
