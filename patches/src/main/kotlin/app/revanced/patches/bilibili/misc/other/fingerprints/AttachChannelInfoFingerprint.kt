package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object AttachChannelInfoFingerprint : MethodFingerprint(
    strings = listOf("Channel info has already exist."),
    returnType = "V"
)
