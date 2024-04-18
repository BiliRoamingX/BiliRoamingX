package app.revanced.patches.bilibili.misc.integrations.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object BrotliFingerprint : MethodFingerprint(
    strings = listOf("Brotli decoder initialization failed")
)
