package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import app.revanced.patches.bilibili.patcher.fingerprint.MultiMethodFingerprint

object OnOgvDownloadFingerprint : MultiMethodFingerprint(
    strings = listOf("pgc.pgc-video-detail.downloadbutton.0"),
    returnType = "V",
    customFingerprint = { methodDef, _ ->
        methodDef.parameterTypes.let {
            it.size == 2 && it[0] == "Landroid/content/Context;" && it[1].endsWith("OGVCacheFromType;")
        }
    }
)

object TheseusOnOgvDownloadFingerprint : MethodFingerprint(
    strings = listOf("pgc.pgc-video-detail.downloadbutton.0"),
    returnType = "V",
    parameters = listOf("Landroid/content/Context;"),
)
