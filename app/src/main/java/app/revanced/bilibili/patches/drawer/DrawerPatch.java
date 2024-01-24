package app.revanced.bilibili.patches.drawer;

import android.annotation.SuppressLint;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Utils;
import tv.danmaku.bili.MainActivityV2;
import tv.danmaku.bili.ui.main2.mine.HomeUserCenterFragment;
import tv.danmaku.bilibilihd.ui.main.mine.HdHomeUserCenterFragment;

public class DrawerPatch {
    private static DrawerLayoutEx drawerLayout;
    @SuppressLint("StaticFieldLeak")
    private static View navView;

    public static void onMainActivityCreate(MainActivityV2 activity) {
        if (!Settings.DRAWER.getBoolean()) return;
        ViewGroup contentView = activity.findViewById(Window.ID_ANDROID_CONTENT);
        View view = contentView.getChildAt(0);
        contentView.removeViewInLayout(view);
        drawerLayout = new DrawerLayoutEx(activity);
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
        if (!Settings.DRAWER.getBoolean()) return;
        if (drawerLayout == null) return;
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        Fragment mineFragment = fragmentManager.findFragmentByTag("mine");
        if (mineFragment == null) return;
        navView = mineFragment.getView();
        if (navView == null) return;
        if (navView.getParent() != null) return; // attached
        var layoutParams = new DrawerLayoutEx.LayoutParamsEx(
                ViewGroup.MarginLayoutParams.MATCH_PARENT,
                ViewGroup.MarginLayoutParams.MATCH_PARENT
        );
        layoutParams.setGravityEx(Gravity.START);
        drawerLayout.addView(navView, 1, layoutParams);
    }

    public static boolean onMainActivityBackPressed(MainActivityV2 activity) {
        if (!Settings.DRAWER.getBoolean()) return false;
        if (drawerLayout == null || navView == null) return false;
        if (drawerLayout.isDrawerOpenEx(navView)) {
            drawerLayout.closeDrawerEx(navView, true);
            return true;
        }
        return false;
    }

    @Keep
    public static void onMainFrameFragmentViewCreated(View view) {
        if (!Settings.DRAWER.getBoolean()) return;
        int id = Utils.getResId("avatar_layout", "id");
        View avatarView = view.findViewById(id);
        if (avatarView == null) return;
        avatarView.setOnClickListener(v -> {
            if (drawerLayout != null && navView != null)
                drawerLayout.openDrawerEx(navView, true);
        });
    }
}
