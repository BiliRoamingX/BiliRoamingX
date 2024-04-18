package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object NewShareServiceFingerprint : MethodFingerprint(
    strings = listOf("pgc.pgc-video-detail.half-player-more-option.0.click")
)
