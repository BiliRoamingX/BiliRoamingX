package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object UnitePlayerSetSpeedMenuFingerprint : MultiMethodFingerprint(
    strings = listOf("0.5", "0.75", "1.0", "1.25", "1.5", "2.0")
)
