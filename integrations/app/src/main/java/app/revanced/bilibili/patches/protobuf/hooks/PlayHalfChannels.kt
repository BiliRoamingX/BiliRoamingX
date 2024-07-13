package app.revanced.bilibili.patches.protobuf.hooks

import app.revanced.bilibili.patches.protobuf.MossHook
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Versions
import app.revanced.bilibili.utils.maybeThailand
import com.bapis.bilibili.app.playerunite.v1.PlayHalfChannelsReply
import com.bapis.bilibili.app.playerunite.v1.PlayHalfChannelsReq
import com.bapis.bilibili.playershared.*
import com.bilibili.lib.moss.api.MossException
import com.google.protobuf.GeneratedMessageLite

object PlayHalfChannels : MossHook<PlayHalfChannelsReq, PlayHalfChannelsReply>() {
    override fun shouldHook(req: GeneratedMessageLite<*, *>): Boolean {
        return Versions.ge7_80_0() && req is PlayHalfChannelsReq
    }

    private fun shouldReconstruct(req: PlayHalfChannelsReq, reply: PlayHalfChannelsReply?): Pair<Boolean, Boolean> {
        if (!Settings.UnlockAreaLimit())
            return false to false
        val epId = req.extraContentMap["epid"]
            ?: return false to false
        val seasonId = req.aid.toString()
        if (maybeThailand(seasonId, epId))
            return true to true
        else if (reply == null || reply == PlayHalfChannelsReply.getDefaultInstance())
            return true to false
        return false to false
    }

    override fun hookAfter(
        req: PlayHalfChannelsReq,
        reply: PlayHalfChannelsReply?,
        error: MossException?
    ): PlayHalfChannelsReply? {
        val (reconstruct, thailand) = shouldReconstruct(req, reply)
        if (!reconstruct) {
            if (reply != null && (Settings.UnlockPlayLimit() || Settings.AllowDownload())) {
                reply.groupsList.asSequence().flatMap { it.itemsList }.forEach {
                    val type = it.base.type
                    if (Settings.UnlockPlayLimit()) {
                        if (type == SettingItemType.SETTING_SMALL_WINDOW
                            || type == SettingItemType.SETTING_BACKGROUND_PLAY
                            || type == SettingItemType.SETTING_LISTEN
                            || type == SettingItemType.SETTING_PROJECT
                        ) {
                            it.base.control = SettingControl()
                            it.clearMore()
                            if (type == SettingItemType.SETTING_BACKGROUND_PLAY)
                                it.style = SettingItemStyle.SETTING_STYLE_SWITCH
                        }
                    }
                    if (Settings.AllowDownload() && type == SettingItemType.SETTING_DOWNlOAD) {
                        it.base.control = SettingControl()
                        it.clearMore()
                    }
                }
            }
            return super.hookAfter(req, reply, error)
        }

        fun newSettingItem(
            icon: String,
            title: String,
            type: SettingItemType,
            style: SettingItemStyle,
            rightIcon: String = "",
            option: String,
        ) = SettingItem().apply {
            base = SettingBase().apply {
                control = SettingControl()
                leftIcon = icon
                leftTitle = title
                mutableReportMap["option"] = option
                this.type = type
            }
            if (rightIcon.isNotEmpty()) {
                more = SettingMore().apply {
                    this.rightIcon = rightIcon
                }
            }
            this.style = style
        }

        return PlayHalfChannelsReply().apply {
            val group1 = SettingGroup()
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/Yyavf8OcsM.png",
                title = "倍速",
                type = SettingItemType.SETTING_PLAYBACK_RATE,
                style = SettingItemStyle.SETTING_STYLE_SELECT,
                option = "speed",
            ).let { group1.addItems(it) }
            if (!thailand) newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/XDn1WQjM1C.png",
                title = "稍后再看",
                type = SettingItemType.SETTING_WATCH_LATER,
                style = SettingItemStyle.SETTING_STYLE_MORE,
                option = "watchLater",
            ).let { group1.addItems(it) }
            if (thailand) newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/OLeBa7V1IA.png",
                title = "缓存",
                type = SettingItemType.SETTING_DOWNlOAD,
                style = SettingItemStyle.SETTING_STYLE_MORE,
                rightIcon = "arrow-forward-right-line@900",
                option = "cache",
            ).let { group1.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/wloOyHjlTQ.png",
                title = "小窗播放",
                type = SettingItemType.SETTING_SMALL_WINDOW,
                style = SettingItemStyle.SETTING_STYLE_MORE,
                option = "miniPlayer",
            ).let { group1.addItems(it) }
            addGroups(group1)

            val group2 = SettingGroup()
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240513/82ac2611e49c304c91fb79cc76b9b762/nDFhjB59FM.png",
                title = "跳过头尾",
                type = SettingItemType.SETTING_SKIP_OPED,
                style = SettingItemStyle.SETTING_STYLE_SWITCH,
                option = "jumpHeadTail",
            ).let { group2.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/lUncFRtBt9.png",
                title = "自动连播",
                type = SettingItemType.SETTING_PLAYBACK_MODE,
                style = SettingItemStyle.SETTING_STYLE_SWITCH,
                option = "autoPlayer",
            ).let { group2.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/aKJw1xfGDd.png",
                title = "循环播放",
                type = SettingItemType.SETTING_LOOP_PLAYBACK,
                style = SettingItemStyle.SETTING_STYLE_SELECT,
                option = "circle",
            ).let { group2.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/OMwp6PPrgB.png",
                title = "定时关闭",
                type = SettingItemType.SETTING_TIMING_SWITCH,
                style = SettingItemStyle.SETTING_STYLE_MORE,
                rightIcon = "arrow-forward-right-line@900",
                option = "sleepTimer",
            ).let { group2.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/o9XPuaKoha.png",
                title = "后台听视频",
                type = SettingItemType.SETTING_BACKGROUND_PLAY,
                style = SettingItemStyle.SETTING_STYLE_SWITCH,
                option = "listen",
            ).let { group2.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/854qmhfTaJ.png",
                title = "字幕切换",
                type = SettingItemType.SETTING_SUBTITLE_EXCHANGE,
                style = SettingItemStyle.SETTING_STYLE_MORE,
                option = "subtitleSwitch",
            ).let { group2.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/arv11nFGr6.png",
                title = "镜像翻转",
                type = SettingItemType.SETTING_FLIP_CONF,
                style = SettingItemStyle.SETTING_STYLE_SWITCH,
                option = "mirror",
            ).let { group2.addItems(it) }
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/TzgNkDfqkC.png",
                title = "更多播放设置",
                type = SettingItemType.SETTING_MORE_PLAY,
                style = SettingItemStyle.SETTING_STYLE_MORE,
                option = "settingMore",
            ).let { group2.addItems(it) }
            addGroups(group2)

            val group3 = SettingGroup()
            newSettingItem(
                icon = "https://i0.hdslb.com/bfs/activity-plat/static/20240422/82ac2611e49c304c91fb79cc76b9b762/N8bOibjT1O.png",
                title = "反馈建议",
                type = SettingItemType.SETTING_FEEDBACK,
                style = SettingItemStyle.SETTING_STYLE_MORE,
                option = "feedback",
            ).let { group3.addItems(it) }
            addGroups(group3)
        }
    }
}
