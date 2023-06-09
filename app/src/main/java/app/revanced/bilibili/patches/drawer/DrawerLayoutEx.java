package app.revanced.bilibili.patches.drawer;

import android.content.Context;
import android.view.View;

import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;

public class DrawerLayoutEx extends DrawerLayout {
    public DrawerLayoutEx(Context context) {
        super(context);
    }

    // codes will filled by patcher
    public void closeDrawerEx(@NonNull View drawerView, boolean animate) {
    }

    // codes will filled by patcher
    public void openDrawerEx(@NonNull View drawerView, boolean animate) {
    }

    // codes will filled by patcher
    public boolean isDrawerOpenEx(@NonNull View drawer) {
        return false;
    }

    // superclass will replaced with obfuscated class by patcher
    public static class LayoutParamsEx extends DrawerLayout.LayoutParams {

        public LayoutParamsEx(int width, int height) {
            // will replaced with obfuscated class by patcher
            super(width, height);
        }

        // codes will filled by patcher
        public void setGravityEx(@GravityInt int gravity) {
        }
    }
}
