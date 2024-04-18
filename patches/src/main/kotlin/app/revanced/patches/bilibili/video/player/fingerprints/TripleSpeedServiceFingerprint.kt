package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object TripleSpeedServiceFingerprint : MultiMethodFingerprint(
    strings = listOf("player.player.gesture.speedup.player"),
    returnType = "V",
    parameters = listOf()
)
