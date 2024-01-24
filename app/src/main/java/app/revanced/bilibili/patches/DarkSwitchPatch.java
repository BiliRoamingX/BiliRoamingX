package app.revanced.bilibili.patches;

import android.app.AlertDialog;

import androidx.annotation.Keep;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Utils;
import tv.danmaku.bili.ui.main2.mine.HomeUserCenterFragment;
import tv.danmaku.bilibilihd.ui.main.mine.HdHomeUserCenterFragment;

@Keep
public class DarkSwitchPatch {
    public static void switchDarkMode(HomeUserCenterFragment fragment, boolean report) {
        if (!Settings.SWITCH_DARK_DIALOG.getBoolean()) {
            fragment.switchDarkMode_Origin(report);
            return;
        }
        if (Utils.isNightFollowSystem()) {
            new AlertDialog.Builder(fragment.getContext())
                    .setMessage(Utils.getString("biliroaming_switch_dark_tips"))
                    .setPositiveButton(android.R.string.ok, (dialog, which) -> fragment.switchDarkMode_Origin(report))
                    .setNegativeButton(android.R.string.cancel, null)
                    .show();
        } else {
            fragment.switchDarkMode_Origin(report);
        }
    }

    public static void switchDarkMode(HdHomeUserCenterFragment fragment, boolean report) {
        if (!Settings.SWITCH_DARK_DIALOG.getBoolean()) {
            fragment.switchDarkMode_Origin(report);
            return;
        }
        if (Utils.isNightFollowSystem()) {
            new AlertDialog.Builder(fragment.getContext())
                    .setMessage(Utils.getString("biliroaming_switch_dark_tips"))
                    .setPositiveButton(android.R.string.ok, (dialog, which) -> fragment.switchDarkMode_Origin(report))
                    .setNegativeButton(android.R.string.cancel, null)
                    .show();
        } else {
            fragment.switchDarkMode_Origin(report);
        }
    }
}
