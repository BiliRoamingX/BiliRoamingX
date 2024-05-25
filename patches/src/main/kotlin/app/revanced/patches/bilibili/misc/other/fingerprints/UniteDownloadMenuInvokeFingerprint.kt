package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object UniteDownloadMenuInvokeFingerprint : MethodFingerprint(
    strings = listOf("click download"),
    parameters = listOf(),
    returnType = "V",
)
