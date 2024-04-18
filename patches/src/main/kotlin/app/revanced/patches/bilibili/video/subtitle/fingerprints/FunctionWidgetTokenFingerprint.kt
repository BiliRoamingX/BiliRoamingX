package app.revanced.patches.bilibili.video.subtitle.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object FunctionWidgetTokenFingerprint : MethodFingerprint(
    strings = listOf("id=", ";clazz="),
    parameters = listOf(),
    returnType = "Ljava/lang/String;"
)
