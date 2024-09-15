package app.revanced.patches.bilibili.misc.config.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object DDContractImplFingerprint : MethodFingerprint(
    strings = listOf("public.dd.result"),
)
