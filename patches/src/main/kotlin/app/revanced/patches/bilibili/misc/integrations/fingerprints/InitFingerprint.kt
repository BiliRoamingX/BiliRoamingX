package app.revanced.patches.bilibili.misc.integrations.fingerprints

import app.revanced.patches.shared.misc.integrations.BaseIntegrationsPatch

object InitFingerprint : BaseIntegrationsPatch.IntegrationsFingerprint(
    customFingerprint = { methodDef, _ ->
        methodDef.definingClass == "Lcom/bilibili/gripper/BiliApp;" && methodDef.name == "onCreate"
    }
)
