package app.revanced.patches.bilibili.misc.json.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object JSONFingerprint : MethodFingerprint(strings = listOf("toJSON error"))
