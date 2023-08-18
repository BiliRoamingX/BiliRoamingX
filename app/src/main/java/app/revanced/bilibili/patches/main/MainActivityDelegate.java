package app.revanced.bilibili.patches.main;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;

import com.bilibili.app.preferences.BiliPreferencesActivity;

import app.revanced.bilibili.patches.drawer.DrawerPatch;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.settings.fragments.BiliRoamingSettingsFragment;
import app.revanced.bilibili.utils.Utils;
import tv.danmaku.bili.MainActivityV2;

public class MainActivityDelegate {

    public static void onCreate(MainActivityV2 activity) {
        DrawerPatch.onMainActivityCreate(activity);
        Utils.runOnMainThread(1000L, () -> showHintIfNeeded(activity));
    }

    public static void onStart(MainActivityV2 activity) {
        DrawerPatch.onMainActivityStart(activity);
    }

    public static boolean onBackPressed(MainActivityV2 activity) {
        return DrawerPatch.onMainActivityBackPressed(activity);
    }

    static void showHintIfNeeded(Context context) {
        if (Settings.SHOW_HINT.getBoolean()) return;
        new AlertDialog.Builder(context)
                .setTitle(Utils.getString("biliroaming_usage_hint_title"))
                .setMessage(Utils.getString("biliroaming_usage_hint_message"))
                .setPositiveButton(Utils.getString("biliroaming_jump_settings"), (dialog, which) -> {
                    Settings.SHOW_HINT.saveValue(true);
                    Intent intent = new Intent(context, BiliPreferencesActivity.class);
                    intent.putExtra("extra:key:fragment", BiliRoamingSettingsFragment.class.getName());
                    intent.putExtra("extra:key:title", Utils.getString("biliroaming_settings_title"));
                    context.startActivity(intent);
                })
                .setNegativeButton(Utils.getString("biliroaming_get_it"), (dialog, which) -> {
                    Settings.SHOW_HINT.saveValue(true);
                })
                .show();
    }
}
