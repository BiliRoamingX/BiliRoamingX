package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object RemoteServiceHandlerOnStartFingerprint : MethodFingerprint(
    strings = listOf("DanmakuMask", "pref_key_player_enable_keywords_block", "danmaku_fold"),
    parameters = listOf("Z"),
    returnType = "V",
)
