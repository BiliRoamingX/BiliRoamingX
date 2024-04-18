package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object MineBindAccountStateFingerprint : MethodFingerprint(
    strings = listOf("-", "0"),
    parameters = listOf("Ltv/danmaku/bili/ui/main2/api/AccountMine;", "Z"),
    returnType = "V",
    customFingerprint = { _, classDef ->
        classDef.type == "Ltv/danmaku/bili/ui/main2/mine/HomeUserCenterFragment;" || classDef.type == "Ltv/danmaku/bilibilihd/ui/main/mine/HdHomeUserCenterFragment;"
    }
)
