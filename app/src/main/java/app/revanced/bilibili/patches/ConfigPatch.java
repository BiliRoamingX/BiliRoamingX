package app.revanced.bilibili.patches;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import app.revanced.bilibili.settings.Settings;

@Keep
public class ConfigPatch {
    @Nullable
    public static Boolean getAb(String key, @Nullable Boolean defValue, @Nullable Boolean origin) {
        //LogHelper.debug(() -> String.format("ConfigPatch, ab of %s: %s, default: %s", key, origin, defValue));
        if ("ff_switch_account_enable".equals(key))
            return Boolean.TRUE;
        else if ("ff_player_fav_new".equals(key) && Settings.OLD_FAV.getBoolean())
            return Boolean.FALSE;
        else if ("ff_unite_detail2".equals(key)/*>=7.39.0*/ || "ff_unite_player".equals(key)/*<7.39.0*/) {
            int playerVersion = Integer.parseInt(Settings.PLAYER_VERSION.getString());
            var result = origin != null ? origin : (defValue != null ? defValue : Boolean.FALSE);
            if (playerVersion == 1)
                result = Boolean.FALSE;
            else if (playerVersion == 2)
                result = Boolean.TRUE;
            return result;
        }
        return origin;
    }

    @Nullable
    public static String getConfig(String key, @Nullable String defValue, @Nullable String origin) {
        //LogHelper.debug(() -> String.format("ConfigPatch, config of %s: %s, default: %s", key, origin, defValue));
        return origin;
    }
}
