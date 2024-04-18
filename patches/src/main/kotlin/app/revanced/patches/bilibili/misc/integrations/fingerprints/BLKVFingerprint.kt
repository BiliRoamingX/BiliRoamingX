package app.revanced.patches.bilibili.misc.integrations.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object BLKVFingerprint : MethodFingerprint(
    strings = listOf(".blkv"),
    parameters = listOf("Landroid/content/Context;", "Ljava/lang/String;", "Z", "I")
)
