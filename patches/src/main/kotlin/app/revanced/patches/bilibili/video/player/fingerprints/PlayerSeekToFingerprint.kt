package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object PlayerSeekToFingerprint : MethodFingerprint(
    strings = listOf("[player]seek to"),
    parameters = listOf("I", "Z"),
    returnType = "V"
)
