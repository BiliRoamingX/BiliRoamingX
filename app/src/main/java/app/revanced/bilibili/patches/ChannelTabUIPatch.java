package app.revanced.bilibili.patches;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.KtUtils;
import tv.danmaku.bili.MainActivityV2;

public class ChannelTabUIPatch {
    @Keep
    public static void onHomeCategoryFragmentViewCreated(Fragment fragment) {
        if (!Settings.ADD_CHANNEL.getBoolean()) return;
        var view = (ViewGroup) fragment.getView();
        if (view == null) return;
        if (view.getContext() instanceof MainActivityV2) {
            view.getChildAt(0).setVisibility(View.GONE);
            view.setClipToPadding(false);
            view.setPadding(0, 0, 0, KtUtils.dp2px(48));
        }
    }
}
