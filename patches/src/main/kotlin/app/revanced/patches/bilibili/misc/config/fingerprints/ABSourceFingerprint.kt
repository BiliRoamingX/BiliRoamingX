package app.revanced.patches.bilibili.misc.config.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ABSourceFingerprint : MethodFingerprint(
    strings = listOf("getMBean()Lcom/bilibili/lib/blconfig/internal/ABBean;"),
    customFingerprint = { methodDef, _ ->
        methodDef.name == "<clinit>"
    }
)
