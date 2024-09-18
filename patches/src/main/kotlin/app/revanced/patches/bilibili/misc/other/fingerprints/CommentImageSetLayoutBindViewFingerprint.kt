package app.revanced.patches.bilibili.misc.other.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object CommentImageSetLayoutBindViewFingerprint : MethodFingerprint(
    strings = listOf("pic_scale"),
    parameters = listOf("Ljava/util/List;", "I"),
    returnType = "V",
)
