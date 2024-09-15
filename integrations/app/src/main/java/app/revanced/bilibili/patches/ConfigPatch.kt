package app.revanced.bilibili.patches

import androidx.annotation.Keep
import app.revanced.bilibili.settings.BooleanSetting
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
        "ff_mod_opt_init_delay",                      // 延迟初始化模块
        "story_new_three_point",                      // 新版竖屏模式三点菜单
        "downloader.p2p_disabled",                    // 禁用P2P下载
    )

    @JvmStatic
    private val alwaysDisabledAbKeys = arrayOf(
        "security_defend_enabled",                    // 禁用安全防御，LibBili#d(long,com.bilibili.nativelibrary.Rt)V 定期检查，会通过 java API 获取签名等信息
        "upper.auto_download_tag_mod",                // 禁止自动下载tag模块
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

    private open class Hook<T>(val enabled: () -> Boolean, val value: T, vararg val keys: String) {
        constructor(value: T, vararg keys: String) : this({ true }, value, *keys)
    }

    private class AbHook(setting: BooleanSetting, value: Boolean, vararg keys: String) :
        Hook<Boolean>({ setting() }, value, *keys)

    private class ConfigHook(setting: BooleanSetting, value: String, vararg keys: String) :
        Hook<String>({ setting() }, value, *keys)

    @JvmStatic
    private val abHooks = listOf(
        Hook(false, *alwaysDisabledAbKeys),
        Hook(true, *alwaysEnabledAbKeys),
        AbHook(Settings.DisallowCollectPrivacyInfo, false, *privacyInfoKeys),
        AbHook(Settings.ForceOldFav, false, "ff_player_fav_new"),
        AbHook(Settings.AddChannel, false, "ff_channel_redirect_to_search"),
        AbHook(Settings.DisableAvif, true, "ff.image.avif_degrade", "ff_noavif_enable"),
        AbHook(Settings.DisableP2PUpload, true, "ff_live_room_player_close_p2p"),
        AbHook(Settings.DisableP2PUpload, false, "ijkplayer.p2p_hot_push", "ijkplayer.p2p_upload"),
        AbHook(Settings.PreferStableCdn, false, "ijkplayer.p2p_download"),
        AbHook(Settings.DisableWebViewNonOfficialAlert, false, "ff.webview.controller.switch_tips_whitelist"),
    )

    @JvmStatic
    private val configHooks = listOf(
        Hook(Constants.MAX_QN.toString(), "ijkplayer.autoswitch_max_qn"),
        Hook("5000", "modmanager.mod_opt_init_delay_time"), // 延迟5s初始化模块
        Hook("1;600", "modmanager.mod_api_retry_config"), // 重试1次，间隔600ms
        ConfigHook(Settings.EnableAv, "0", "bv.enable_bv"),
        ConfigHook(Settings.EnableAv, avOrBvPattern, "bv.pattern_rule_av_only"),
        ConfigHook(Settings.DisableWebViewNonOfficialAlert, ".*", "base.h5_alert_whitelist"),
    )

    @Keep
    @JvmStatic
    fun getAb(key: String, defValue: Boolean?, origin: Boolean?): Boolean? {
        //Logger.debug { "ConfigPatch, ab of $key: $origin, default: $defValue" }
        val abHook = abHooks.find { it.keys.contains(key) }
        if (abHook != null && abHook.enabled())
            return abHook.value
        if ("ff_unite_detail2" == key || "ff_unite_player" == key /*<7.39.0*/) {
            val playerVersion = Settings.PlayerVersion()
            if ("1" == playerVersion)
                return false
            else if ("2" == playerVersion)
                return true
            return origin
        }
        return origin
    }

    @Keep
    @JvmStatic
    fun getConfig(key: String, defValue: String?, origin: String?): String? {
        //Logger.debug { "ConfigPatch, config of $key: $origin, default: $defValue" }
        val configHook = configHooks.find { it.keys.contains(key) }
        if (configHook != null && configHook.enabled())
            return configHook.value
        if ("player.unite_login_qn" == key || "player.unite_unlogin_qn" == key) {
            val halfScreenQuality = VideoQualityPatch.getMatchedHalfScreenQuality()
            if (halfScreenQuality != 0)
                return halfScreenQuality.toString()
            return origin
        }
        return origin
    }
}
