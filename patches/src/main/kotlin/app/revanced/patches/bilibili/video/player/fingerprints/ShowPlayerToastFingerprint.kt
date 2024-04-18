package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ShowPlayerToastFingerprint : MethodFingerprint(
    strings = listOf("extra_title", "player show toast:"),
    parameters = listOf("Ltv/danmaku/biliplayerv2/widget/toast/PlayerToast;"),
    returnType = "V"
)
