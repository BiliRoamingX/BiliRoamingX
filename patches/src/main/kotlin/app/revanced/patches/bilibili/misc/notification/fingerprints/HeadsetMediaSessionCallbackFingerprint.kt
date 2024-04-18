package app.revanced.patches.bilibili.misc.notification.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object HeadsetMediaSessionCallbackFingerprint : MethodFingerprint(
    strings = listOf("onMediaButtonEvent has a exception keyEventMessage:"),
    parameters = listOf("Landroid/content/Intent;"),
    returnType = "Z"
)
