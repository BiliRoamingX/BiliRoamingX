package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object BufferFingerprint : MethodFingerprint(
    strings = listOf("(to read code point prefixed 0x"),
    parameters = listOf(),
    returnType = "I",
)
