package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object MusicPlayerPanelFingerprint : MethodFingerprint(
    strings = listOf("turn_left", "video")
)
