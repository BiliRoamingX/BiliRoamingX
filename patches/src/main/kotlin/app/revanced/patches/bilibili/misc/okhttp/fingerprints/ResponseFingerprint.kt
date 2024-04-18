package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ResponseFingerprint : MethodFingerprint(strings = listOf("Response{protocol="))
