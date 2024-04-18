package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object PlaybackSpeedSettingFingerprint : MultiMethodFingerprint(
    strings = listOf("player.player.full-more.speed.player")
)
