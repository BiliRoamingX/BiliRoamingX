package app.revanced.patches.bilibili.misc.integrations.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object RecyclerViewHolderFingerprint : MethodFingerprint(
    strings = listOf("itemView may not be null"),
    parameters = listOf("Landroid/view/View;"),
    returnType = "V",
    customFingerprint = { methodDef, _ -> methodDef.name == "<init>" }
)
