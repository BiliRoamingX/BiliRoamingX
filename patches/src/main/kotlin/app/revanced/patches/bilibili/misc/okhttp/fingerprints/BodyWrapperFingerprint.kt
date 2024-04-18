package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object BodyWrapperFingerprint : MultiMethodFingerprint(
    strings = listOf("Cannot read raw response body of a converted body."),
)
