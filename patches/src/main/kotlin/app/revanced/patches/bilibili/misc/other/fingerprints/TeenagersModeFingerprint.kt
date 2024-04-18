package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object TeenagersModeFingerprint : MethodFingerprint(
    strings = listOf("restrictedmode.teenagers_alert_api_config", "teenagers_mode_show_dialog_interval"),
    returnType = "Z"
)
