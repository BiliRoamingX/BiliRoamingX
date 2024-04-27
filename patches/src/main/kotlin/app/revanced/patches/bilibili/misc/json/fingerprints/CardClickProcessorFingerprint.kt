package app.revanced.patches.bilibili.misc.json.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object CardClickProcessorFingerprint : MethodFingerprint(
    strings = listOf("action:feed:dislike_reason", "action:feed:dislike_toast"),
    returnType = "V",
    customFingerprint = { methodDef, _ ->
        methodDef.parameterTypes.count {
            it == "Lcom/bilibili/app/comm/list/common/data/DislikeReason;"
        } == 2
    }
)
