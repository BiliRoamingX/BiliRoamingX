package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object PlayerSpeedWidgetFingerprint : MultiMethodFingerprint(
    strings = listOf("player.player.speed.0.player")
)
