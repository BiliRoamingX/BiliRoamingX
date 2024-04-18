package app.revanced.patches.bilibili.video.subtitle.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object FunctionWidgetServiceFingerprint : MethodFingerprint(
    strings = listOf("illegal function type"),
    parameters = listOf("I"),
    returnType = "I"
)
