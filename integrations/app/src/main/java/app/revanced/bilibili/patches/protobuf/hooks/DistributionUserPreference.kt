package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.newAny
import com.bapis.bilibili.app.distribution.UserPreferenceReply
import com.bapis.bilibili.app.distribution.UserPreferenceReq
import com.bapis.bilibili.app.distribution.setting.experimental.MultipleTusConfig
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object DistributionUserPreference : MossHook<UserPreferenceReq, UserPreferenceReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return req is UserPreferenceReq
    }

    override fun hookAfter(
        req: UserPreferenceReq,
        reply: UserPreferenceReply?,
        error: MossException?
    ): UserPreferenceReply? {
        if (reply != null && Settings.DisableHomeStory()) {
            val typeUrl =
                "type.googleapis.com/bilibili.app.distribution.experimental.v1.MultipleTusConfig"
            val (index, config) = reply.preferenceList.withIndex().find { (_, config) ->
                config.typeUrl == typeUrl
            } ?: return super.hookAfter(req, reply, error)
            val tusConfig = MultipleTusConfig.parseFrom(config.value)
            val topLeft = tusConfig.topLeft
            topLeft.clearBadge()
            topLeft.clearListenBackgroundImage()
            topLeft.clearListenForegroundImage()
            topLeft.clearStoryBackgroundImage()
            topLeft.clearStoryForegroundImage()
            val tabUrl = "bilibili://root?tab_name=我的"
            topLeft.url.value = tabUrl
            topLeft.urlV2.value = tabUrl
            topLeft.goto.value = "1"
            topLeft.gotoV2.value = 1L
            reply.removePreference(index)
            reply.addPreference(index, newAny(typeUrl, tusConfig))
        }
        return super.hookAfter(req, reply, error)
    }
}
