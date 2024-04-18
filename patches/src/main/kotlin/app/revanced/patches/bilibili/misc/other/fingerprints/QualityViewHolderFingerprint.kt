package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object QualityViewHolderFingerprint : MultiMethodFingerprint(
    strings = listOf("last_4k_hint_show_timestamp", "player.qn_4k_tip")
)
