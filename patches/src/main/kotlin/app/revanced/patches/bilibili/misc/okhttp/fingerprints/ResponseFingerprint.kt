package app.revanced.patches.bilibili.misc.okhttp.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import app.revanced.patches.bilibili.utils.isNative

object ResponseFingerprint : MethodFingerprint(
    strings = listOf("Response{protocol="),
    customFingerprint = { _, classDef ->
        classDef.interfaces == listOf("Ljava/io/Closeable;") && classDef.methods.none { it.accessFlags.isNative() }
    }
)
