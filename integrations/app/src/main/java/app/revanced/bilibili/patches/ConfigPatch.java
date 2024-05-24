package app.revanced.bilibili.patches;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.List;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.BVUtils;

@Keep
public class ConfigPatch {
    private static final List<String> alwaysEnabledAbKeys = Arrays.asList(
            "ff_switch_account_enable",                     // 切换账号
            "ff_player_use_remote_auto_threshold_qn",       // 画质接口控制
            "ff_pegasus_setting_auto_refresh_display",      // 首页自动刷新设置
            "player.volume.balance",                        // 音量均衡设置
            "ff_side_center_setting_entrance_visibility",   // 首页头像入口设置
            "ff_united_video_setting"                       // 新版三点菜单
    );

    @Nullable
    public static Boolean getAb(String key, @Nullable Boolean defValue, @Nullable Boolean origin) {
        //LogHelper.debug(() -> String.format("ConfigPatch, ab of %s: %s, default: %s", key, origin, defValue));
        if (alwaysEnabledAbKeys.contains(key))
            return Boolean.TRUE;
        else if ("ff_player_fav_new".equals(key) && Settings.ForceOldFav.get())
            return Boolean.FALSE;
        else if ("ff_unite_detail2".equals(key)/*>=7.39.0*/ || "ff_unite_player".equals(key)/*<7.39.0*/) {
            String playerVersion = Settings.PlayerVersion.get();
            if ("1".equals(playerVersion))
                return Boolean.FALSE;
            else if ("2".equals(playerVersion))
                return Boolean.TRUE;
            return origin;
        } else if ("ff_channel_redirect_to_search".equals(key) && Settings.AddChannel.get())
            return Boolean.FALSE;
        else if (("ff.image.avif_degrade".equals(key) || "ff_noavif_enable".equals(key)) && Settings.DisableAvif.get())
            return Boolean.TRUE;
        else if ("ff_live_room_player_close_p2p".equals(key) && Settings.DisableP2PUpload.get())
            return Boolean.TRUE;
        else if (("ijkplayer.p2p_hot_push".equals(key)
                || "ijkplayer.p2p_upload".equals(key)
        ) && Settings.DisableP2PUpload.get())
            return Boolean.FALSE;
        else if ("ijkplayer.p2p_download".equals(key) && Settings.PreferStableCdn.get())
            return Boolean.FALSE;
        return origin;
    }

    @Nullable
    public static String getConfig(String key, @Nullable String defValue, @Nullable String origin) {
        //LogHelper.debug(() -> String.format("ConfigPatch, config of %s: %s, default: %s", key, origin, defValue));
        if (Settings.EnableAv.get() && "bv.enable_bv".equals(key))
            return "0";
        else if (Settings.EnableAv.get() && "bv.pattern_rule_av_only".equals(key))
            return BVUtils.avOrBvPattern;
        else if ("player.unite_login_qn".equals(key) || "player.unite_unlogin_qn".equals(key)) {
            int halfScreenQuality = VideoQualityPatch.getMatchedHalfScreenQuality();
            if (halfScreenQuality != 0)
                return String.valueOf(halfScreenQuality);
        }
        return origin;
    }
}
