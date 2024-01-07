package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.newAny
import com.bapis.bilibili.app.distribution.GetUserPreferenceReply
import com.bapis.bilibili.app.distribution.GetUserPreferenceReq
import com.bapis.bilibili.app.distribution.setting.play.SpecificPlayConfig
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DistributionGetUserPreference : MossHook<GetUserPreferenceReq, GetUserPreferenceReply>() {
    private const val CONFIG_TYPE_URL =
        "type.googleapis.com/bilibili.app.distribution.play.v1.SpecificPlayConfig"

    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is GetUserPreferenceReq && Settings.GLOBAL_SEGMENTED_SECTION.boolean
    }

    override fun hookAfter(
        req: GetUserPreferenceReq,
        reply: GetUserPreferenceReply?,
        error: MossException?
    ): GetUserPreferenceReply? {
        if (reply != null) {
            val (index, config) = reply.valueList.withIndex().find { (_, value) ->
                value.typeUrl == CONFIG_TYPE_URL
            } ?: return super.hookAfter(req, reply, error)
            val newAny = newAny(CONFIG_TYPE_URL, SpecificPlayConfig.parseFrom(config.value).apply {
                enableSegmentedSection.value = Settings.ENABLE_SEGMENTED_SECTION.boolean
            })
            reply.removeValue(index)
            reply.addValue(index, newAny)
        }
        return super.hookAfter(req, reply, error)
    }
}
