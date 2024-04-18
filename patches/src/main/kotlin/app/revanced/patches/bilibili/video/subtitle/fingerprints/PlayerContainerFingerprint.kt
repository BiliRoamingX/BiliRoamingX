package app.revanced.patches.bilibili.video.subtitle.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object PlayerContainerFingerprint : MethodFingerprint(
    strings = listOf("class=%s is not core service"),
    parameters = listOf("Ljava/lang/Class;"),
)
