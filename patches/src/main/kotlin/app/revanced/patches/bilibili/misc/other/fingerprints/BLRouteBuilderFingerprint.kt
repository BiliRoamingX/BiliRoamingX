package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object BLRouteBuilderFingerprint : MethodFingerprint(
    strings = listOf("Builder(targetUri=")
)
