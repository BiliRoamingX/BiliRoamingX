package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object TripleSpeedServiceUniteFingerprint : MethodFingerprint(
    strings = listOf("player.player.gesture.speedup.player"),
    returnType = "Ljava/lang/Object;",
    parameters = listOf("Ljava/lang/Object;")
)
