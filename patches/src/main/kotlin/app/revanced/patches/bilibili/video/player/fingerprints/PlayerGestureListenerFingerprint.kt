package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object PlayerGestureListenerFingerprint : MethodFingerprint(
    strings = listOf("player.player.gesture.rotate.player")
)
