package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object RouteRequestFingerprint : MethodFingerprint(
    strings = listOf("RouteRequest(targetUri=")
)
