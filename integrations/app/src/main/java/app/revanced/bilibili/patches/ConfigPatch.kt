package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.settings.Settings
import app.revanced.bilibili.utils.Constants
import app.revanced.bilibili.utils.avOrBvPattern

object ConfigPatch {
    @JvmStatic
    private val alwaysEnabledAbKeys = arrayOf(
        "ff_switch_account_enable",                   // 切换账号
        "ff_player_use_remote_auto_threshold_qn",     // 画质接口控制
        "ff_pegasus_setting_auto_refresh_display",    // 首页自动刷新设置
        "player.volume.balance",                      // 音量均衡设置
        "ff_side_center_setting_entrance_visibility", // 首页头像入口设置
        "ff_united_video_setting",                    // 新版三点菜单
    )

    @JvmStatic
    private val alwaysDisabledAbKeys = arrayOf(
        "security_defend_enabled",                    // 禁用安全防御，LibBili#d(long,com.bilibili.nativelibrary.Rt)V 定期检查，会通过 java API 获取签名等信息
    )

    @JvmStatic
    private val privacyInfoKeys = arrayOf(
        "ff_open_privacy.applist.info",
        "ff_open_bssid",
        "ff_open_imei_all",
        "ff_open_applist.info_all",
        "ff_open_applist.pk_all",
        "ff_open_privacy.pkglist",
        "ff_open_mac",
        "ff_open_meid_all",
        "ff_open_ssid",
        "ff_open_device_id_all",
    )

    @Keep
    @JvmStatic
    fun getAb(key: String, defValue: Boolean?, origin: Boolean?): Boolean? {
        //Logger.debug { "ConfigPatch, ab of $key: $origin, default: $defValue" }
        if (alwaysDisabledAbKeys.contains(key))
            return false
        if (alwaysEnabledAbKeys.contains(key))
            return true
        if (Settings.DisallowCollectPrivacyInfo() && privacyInfoKeys.contains(key))
            return false
        if ("ff_player_fav_new" == key && Settings.ForceOldFav())
            return false
        else if ("ff_unite_detail2" == key || "ff_unite_player" == key /*<7.39.0*/) {
            val playerVersion = Settings.PlayerVersion()
            if ("1" == playerVersion)
                return false
            else if ("2" == playerVersion)
                return true
            return origin
        } else if ("ff_channel_redirect_to_search" == key && Settings.AddChannel())
            return false
        else if (("ff.image.avif_degrade" == key || "ff_noavif_enable" == key) && Settings.DisableAvif())
            return true
        else if ("ff_live_room_player_close_p2p" == key && Settings.DisableP2PUpload())
            return true
        else if (("ijkplayer.p2p_hot_push" == key || "ijkplayer.p2p_upload" == key) && Settings.DisableP2PUpload())
            return false
        else if ("ijkplayer.p2p_download" == key && Settings.PreferStableCdn())
            return false
        else if ("ff.webview.controller.switch_tips_whitelist" == key && Settings.DisableWebViewNonOfficialAlert())
            return false
        return origin
    }

    @Keep
    @JvmStatic
    fun getConfig(key: String, defValue: String?, origin: String?): String? {
        //Logger.debug { "ConfigPatch, config of $key: $origin, default: $defValue" }
        if ("ijkplayer.autoswitch_max_qn" == key)
            return Constants.MAX_QN.toString()
        if (Settings.EnableAv() && "bv.enable_bv" == key)
            return "0"
        else if (Settings.EnableAv() && "bv.pattern_rule_av_only" == key)
            return avOrBvPattern
        else if ("player.unite_login_qn" == key || "player.unite_unlogin_qn" == key) {
            val halfScreenQuality = VideoQualityPatch.getMatchedHalfScreenQuality()
            if (halfScreenQuality != 0)
                return halfScreenQuality.toString()
        } else if (Settings.DisableWebViewNonOfficialAlert() && "base.h5_alert_whitelist" == key)
            return ".*"
        return origin
    }
}
