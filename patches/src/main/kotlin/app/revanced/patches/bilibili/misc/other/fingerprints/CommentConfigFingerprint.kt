package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object CommentConfigFingerprint : MethodFingerprint(
    strings = listOf("CommentConfig(themeMode=", "seekEnabled="),
)
