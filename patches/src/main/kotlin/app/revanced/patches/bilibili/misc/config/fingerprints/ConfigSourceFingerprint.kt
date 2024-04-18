package app.revanced.patches.bilibili.misc.config.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ConfigSourceFingerprint : MethodFingerprint(
    strings = listOf("AES/CBC/PKCS7Padding"),
    customFingerprint = { methodDef, classDef ->
        methodDef.name == "<clinit>" && classDef.interfaces.isNotEmpty()
    }
)
