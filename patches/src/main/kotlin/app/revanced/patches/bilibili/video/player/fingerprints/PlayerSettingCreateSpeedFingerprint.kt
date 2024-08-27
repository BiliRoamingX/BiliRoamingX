package app.revanced.patches.bilibili.video.player.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object PlayerSettingCreateSpeedFingerprint : MethodFingerprint(
    strings = listOf("option", "speed", "value"),
    parameters = listOf(),
    returnType = "V",
    customFingerprint = { methodDef, _ ->
        methodDef.name != "<clinit>"
    }
)
