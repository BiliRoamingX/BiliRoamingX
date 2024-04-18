package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object IjkMediaPlayerOptionsFingerprint : MethodFingerprint(
    strings = listOf("enable-decoder-switch", "enable-use-https-when-forbidden"),
    parameters = listOf(),
    returnType = "V"
)
