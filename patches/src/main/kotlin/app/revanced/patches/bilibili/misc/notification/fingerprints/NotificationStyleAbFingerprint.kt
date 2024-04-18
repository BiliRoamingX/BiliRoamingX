package app.revanced.patches.bilibili.misc.notification.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object NotificationStyleAbFingerprint : MethodFingerprint(
    strings = listOf("ff_background_use_system_media_controls"),
    returnType = "Z",
    parameters = listOf()
)
