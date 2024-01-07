package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import com.bapis.bilibili.app.distribution.SetUserPreferenceReply
import com.bapis.bilibili.app.distribution.SetUserPreferenceReq
import com.bapis.bilibili.app.distribution.setting.play.SpecificPlayConfig
import com.google.protobuf.GeneratedMessageLite

object DistributionSetUserPreference : MossHook<SetUserPreferenceReq, SetUserPreferenceReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is SetUserPreferenceReq && Settings.GLOBAL_SEGMENTED_SECTION.boolean
    }

    override fun hookBefore(req: SetUserPreferenceReq): Any? {
        for (preference in req.preferenceList) {
            if (preference.typeUrl == "type.googleapis.com/bilibili.app.distribution.play.v1.SpecificPlayConfig") {
                val config = SpecificPlayConfig.parseFrom(preference.value)
                Settings.ENABLE_SEGMENTED_SECTION.saveValue(config.enableSegmentedSection.value)
            }
        }
        return null
    }
}
