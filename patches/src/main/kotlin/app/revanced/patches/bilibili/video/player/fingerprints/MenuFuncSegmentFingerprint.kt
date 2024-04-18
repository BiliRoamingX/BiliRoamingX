package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object MenuFuncSegmentFingerprint : MethodFingerprint(
    strings = listOf("pref_key_share_listen_show_new"),
    customFingerprint = { _, classDef -> '$' !in classDef.type }
)
