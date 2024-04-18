package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object WebActivityBuildUriFingerprint : MethodFingerprint(
    strings = listOf("native.theme", "night"),
    customFingerprint = { _, classDef ->
        classDef.type == "Ltv/danmaku/bili/ui/webview/MWebActivity;"
    }
)
