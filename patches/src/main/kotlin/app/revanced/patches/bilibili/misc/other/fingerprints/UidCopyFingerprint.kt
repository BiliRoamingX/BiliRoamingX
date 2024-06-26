package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object UidCopyFingerprint : MethodFingerprint(
    strings = listOf("UID:%s", "main.space-total.uid.0.click")
)
