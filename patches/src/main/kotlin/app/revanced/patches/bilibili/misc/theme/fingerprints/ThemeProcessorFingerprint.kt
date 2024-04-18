package app.revanced.patches.bilibili.misc.theme.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object ThemeProcessorFingerprint : MethodFingerprint(
    strings = listOf("theme2-account"),
    parameters = listOf("Ltv/danmaku/bili/ui/theme/api/BiliSkinList;")
)
