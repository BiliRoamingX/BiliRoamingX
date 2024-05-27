package app.revanced.bilibili.patches.drawer;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.lang.ref.WeakReference;

import app.revanced.bilibili.patches.DpiPatch;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Utils;
import tv.danmaku.bili.MainActivityV2;
import tv.danmaku.bili.ui.main2.mine.HomeUserCenterFragment;
import tv.danmaku.bilibilihd.ui.main.mine.HdHomeUserCenterFragment;

public class DrawerPatch {
    private static WeakReference<DrawerLayoutEx> drawerLayoutRef = new WeakReference<>(null);
    private static WeakReference<View> navViewRef = new WeakReference<>(null);

    public static void onMainActivityCreate(MainActivityV2 activity) {
        if (Utils.isHd() || !Settings.Drawer.get()) return;
        ViewGroup contentView = activity.findViewById(Window.ID_ANDROID_CONTENT);
        View view = contentView.getChildAt(0);
        contentView.removeViewInLayout(view);
        var drawerLayout = new DrawerLayoutEx(activity);
        drawerLayoutRef = new WeakReference<>(drawerLayout);
        drawerLayout.addView(view, 0, view.getLayoutParams());
        Fragment mineFragment = Utils.isHd() ? new HdHomeUserCenterFragment() : new HomeUserCenterFragment();
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(mineFragment, "mine")
                .commit();
        fragmentManager.executePendingTransactions();
        activity.setContentView(drawerLayout);
    }

    public static void onMainActivityStart(MainActivityV2 activity) {
        if (Utils.isHd() || !Settings.Drawer.get()) return;
        DrawerLayoutEx drawerLayout = drawerLayoutRef.get();
        if (drawerLayout == null) return;
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        Fragment mineFragment = fragmentManager.findFragmentByTag("mine");
        if (mineFragment == null) return;
        var navView = mineFragment.getView();
        if (navView == null) return;
        navViewRef = new WeakReference<>(navView);
        if (navView.getParent() != null) return; // attached
        var displayScale = DpiPatch.displayScale;
        var ratio = displayScale > 0.5f ? 1.0f : (displayScale > 0f ? 0.9f : 0f);
        var availableWidth = activity.getResources().getDisplayMetrics().widthPixels;
        var navViewWidth = ratio != 0f ? (int) (availableWidth * ratio) : ViewGroup.LayoutParams.MATCH_PARENT;
        var layoutParams = new DrawerLayoutEx.LayoutParamsEx(
                navViewWidth, ViewGroup.LayoutParams.MATCH_PARENT
        );
        layoutParams.setGravityEx(Gravity.START);
        drawerLayout.addView(navView, 1, layoutParams);
    }

    public static boolean onMainActivityBackPressed(MainActivityV2 activity) {
        if (Utils.isHd() || !Settings.Drawer.get()) return false;
        DrawerLayoutEx drawerLayout = drawerLayoutRef.get();
        View navView = navViewRef.get();
        if (drawerLayout == null || navView == null) return false;
        int openState = ((DrawerLayoutEx.LayoutParamsEx) navView.getLayoutParams()).getOpenStateEx();
        if ((openState & 0x1/*FLAG_IS_OPENED*/) == 1 || (openState & 0x2)/*FLAG_IS_OPENING*/ == 2) {
            drawerLayout.closeDrawerEx(navView, true);
            return true;
        }
        return false;
    }

    @Keep
    public static void onMainFrameFragmentViewCreated(View view) {
        if (Utils.isHd() || !Settings.Drawer.get()) return;
        int id = Utils.getResId("avatar_layout", "id");
        View avatarView = view.findViewById(id);
        if (avatarView == null) return;
        avatarView.setOnClickListener(v -> {
            DrawerLayoutEx drawerLayout = drawerLayoutRef.get();
            View navView = navViewRef.get();
            if (drawerLayout != null && navView != null)
                drawerLayout.openDrawerEx(navView, true);
        });
    }
}
