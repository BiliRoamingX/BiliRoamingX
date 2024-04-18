package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object PublishToFollowingConfigFingerprint : MethodFingerprint(
    strings = listOf("PublishToFollowingConfig(visible=")
)
