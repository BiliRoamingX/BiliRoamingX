package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object SpeedFunctionWidgetFingerprint : MultiMethodFingerprint(
    strings = listOf("player.player.choose-speed.0.player")
)
