package app.revanced.bilibili.patches.main;

import app.revanced.bilibili.patches.PlaybackSpeedPatch;
import app.revanced.bilibili.patches.drawer.DrawerPatch;
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.SubtitleParamsCache;
import app.revanced.bilibili.utils.UposReplacer;
import app.revanced.bilibili.utils.Utils;
import tv.danmaku.bili.MainActivityV2;

public class MainActivityDelegate {
    public static void onCreate(MainActivityV2 activity) {
        DrawerPatch.onMainActivityCreate(activity);
        Utils.async(PlaybackSpeedPatch::refreshOverrideSpeedList);
        SubtitleParamsCache.updateFont();
        KtUtils.getCountryTask();
        UposReplacer.getBaseUposList();
        Utils.runOnMainThread(500L, () -> Utils.async(BangumiSeasonHook::injectExtraSearchTypes));
    }

    public static void onStart(MainActivityV2 activity) {
        DrawerPatch.onMainActivityStart(activity);
    }

    public static boolean onBackPressed(MainActivityV2 activity) {
        return DrawerPatch.onMainActivityBackPressed(activity);
    }
}
