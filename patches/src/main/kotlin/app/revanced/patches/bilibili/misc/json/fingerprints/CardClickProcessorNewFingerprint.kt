package app.revanced.patches.bilibili.misc.json.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object CardClickProcessorNewFingerprint : MethodFingerprint(
    strings = listOf("tm.recommend.0.0"),
    returnType = "V",
    customFingerprint = { methodDef, _ ->
        methodDef.parameterTypes.let {
            it.size == 4 && it[1] == "Lcom/bilibili/pegasus/data/FeedbackType;"
                    && it[3] == "Lcom/bilibili/app/comm/list/common/data/DislikeReason;"
        }
    }
)
