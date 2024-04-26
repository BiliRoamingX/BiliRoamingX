package app.revanced.patches.bilibili.misc.copy.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object Comment3DialogCopyFingerprint : MethodFingerprint(
    parameters = listOf("Lcom/bilibili/app/comment3/data/model/CommentItem\$MenuItem\$Action;"),
    returnType = "V",
    customFingerprint = { _, classDef ->
        classDef.fields.map { it.type }.run {
            contains("Landroid/content/Context;") && contains("Ljava/lang/String;")
        }
    }
)
