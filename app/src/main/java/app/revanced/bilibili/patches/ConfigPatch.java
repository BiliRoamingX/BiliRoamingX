package app.revanced.bilibili.patches;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.Utils;

public class ConfigPatch {
    @Nullable
    public static Boolean getAb(String key, @NonNull Boolean defValue, @Nullable Boolean origin) {
        LogHelper.debug(() -> String.format("ConfigPatch, ab of %s: %s, default: %s", key, origin, defValue));
        if ("ff_switch_account_enable".equals(key))
            return Boolean.TRUE;
        else if ("ff_player_fav_new".equals(key) && Settings.OLD_FAV.getBoolean())
            return Boolean.FALSE;
        else if ("ff_unite_detail2".equals(key)/*>=7.39.0*/ || "ff_unite_player".equals(key)/*<7.39.0*/) {
            int playerVersion = Integer.parseInt(Settings.PLAYER_VERSION.getString());
            var result = origin != null ? origin : defValue;
            if (playerVersion == 1)
                result = Boolean.FALSE;
            else if (playerVersion == 2)
                result = Boolean.TRUE;
            Utils.newPlayerEnabled = result;
            return result;
        }
        return origin;
    }
}
