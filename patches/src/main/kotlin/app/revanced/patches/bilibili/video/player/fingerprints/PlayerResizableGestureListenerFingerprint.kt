package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object PlayerResizableGestureListenerFingerprint : MethodFingerprint(
    strings = listOf("player.player.gesture.rotate.player")
)
