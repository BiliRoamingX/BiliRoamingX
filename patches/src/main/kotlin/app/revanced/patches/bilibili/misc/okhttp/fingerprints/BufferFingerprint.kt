package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object BufferFingerprint : MethodFingerprint(
    strings = listOf("already attached to a buffer"),
)
