package app.revanced.patches.bilibili.video.subtitle.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object SetDmViewReplyFingerprint : MethodFingerprint(
    strings = listOf("danmaku_switch", "player.damaku.senior.mode"),
    parameters = listOf("Lcom/bapis/bilibili/community/service/dm/v1/DmViewReply;"),
    returnType = "V",
)
