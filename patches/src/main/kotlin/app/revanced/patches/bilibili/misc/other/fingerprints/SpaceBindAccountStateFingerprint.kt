package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object SpaceBindAccountStateFingerprint : MethodFingerprint(
    strings = listOf("-", "0"),
    parameters = listOf("Lcom/bilibili/app/authorspace/api/BiliMemberCard;"),
    returnType = "V",
    customFingerprint = { _, classDef ->
        classDef.type == "Lcom/bilibili/app/authorspace/ui/SpaceHeaderFragment2;"
    }
)
