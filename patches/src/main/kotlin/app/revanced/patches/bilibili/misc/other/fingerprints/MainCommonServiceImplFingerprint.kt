package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object MainCommonServiceImplFingerprint : MethodFingerprint(
    strings = listOf("is_use_upload_image_api"),
    parameters = listOf(),
    returnType = "Z"
)
