package app.revanced.patches.bilibili.misc.integrations.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object DanmakuFontSwitchPreferenceFingerprint : MethodFingerprint(
    strings = listOf("danmaku_setting_use_recommend_font", "chronos_enable_dfm_v3"),
    parameters = listOf("Landroid/content/Context;"),
    customFingerprint = { methodDef, _ ->
        methodDef.name == "<init>"
    }
)
