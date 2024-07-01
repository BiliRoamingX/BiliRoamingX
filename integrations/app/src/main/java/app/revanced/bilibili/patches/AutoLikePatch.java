package app.revanced.bilibili.patches;

import android.app.Activity;
import android.util.Pair;
import android.view.View;

import androidx.annotation.Keep;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import app.revanced.bilibili.patches.main.ApplicationDelegate;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Reflex;
import app.revanced.bilibili.utils.Utils;

public class AutoLikePatch {
    public static Pair<Long, Integer> detail = null;
    public static Set<Long> likedVideos = new HashSet<>();
    private static String cachedFieldName = null;

    private static final int likeId = Utils.getResId("frame_recommend", "id");
    private static final int like2Id = Utils.getResId("frame1", "id");
    private static final int uniteLikeId = Utils.getResId("frame_like", "id");

    @Keep
    public static void autoLike(Object viewHolder) {
        if (!Settings.AutoLike.get()) return;
        if (detail == null) return;
        Long aid = detail.first;
        Integer like = detail.second;
        if (likedVideos.contains(aid)) return;
        likedVideos.add(aid);
        if (cachedFieldName == null) {
            for (Field field : viewHolder.getClass().getDeclaredFields()) {
                if (!View.class.isAssignableFrom(field.getType())) continue;
                View view = Reflex.getObjectField(viewHolder, field.getName());
                if (view != null && (view.getId() == likeId || view.getId() == like2Id)) {
                    cachedFieldName = field.getName();
                    break;
                }
            }
        }
        if (cachedFieldName == null) return;
        if (like == 0) {
            View likeView = Reflex.getObjectField(viewHolder, cachedFieldName);
            likeView.callOnClick();
        }
    }

    public static void autoLikeUnite() {
        if (!Settings.AutoLike.get()) return;
        if (detail == null) return;
        Long aid = detail.first;
        Integer like = detail.second;
        if (likedVideos.contains(aid)) return;
        likedVideos.add(aid);
        if (like != 0) return;
        // delay 500 ms to make sure view standby
        Utils.async(500L, () -> {
            // async search like button, to improve performance
            Activity activity = ApplicationDelegate.getTopActivity();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                View view = activity.findViewById(uniteLikeId);
                if (view != null) {
                    // switch to main thread to perform click
                    Utils.runOnMainThread(view::callOnClick);
                }
            }
        });
    }
}
