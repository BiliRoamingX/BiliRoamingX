package app.revanced.bilibili.patches;

import android.text.TextUtils;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.Utils;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

public class PlayerToastPatch {
    @Keep
    public static boolean onShow(PlayerToast playerToast) {
        String title = playerToast.getExtraString("extra_title");
        LogHelper.debug(() -> "PlayerToast.onShow: " + title);
        return Settings.REMOVE_CMD_DMS.getBoolean()
                && !TextUtils.isEmpty(title)
                && title.equals(Utils.getString("dialog_warning_data_flow_ugc"));
    }
}
