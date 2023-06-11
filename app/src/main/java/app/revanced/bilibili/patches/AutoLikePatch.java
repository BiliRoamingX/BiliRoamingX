package app.revanced.bilibili.patches;

import android.util.Pair;
import android.view.View;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Reflex;
import app.revanced.bilibili.utils.Utils;

public class AutoLikePatch {
    public static Pair<Long, Integer> detail = null;
    public static Set<Long> likedVideos = new HashSet<>();
    private static String cachedFieldName = null;

    private static final int likeId = Utils.getResId("frame_recommend", "id");
    private static final int like2Id = Utils.getResId("frame1", "id");

    public static void autoLike(Object viewHolder) {
        if (!Settings.AUTO_LIKE.getBoolean()) return;
        if (detail == null) return;
        Long aid = detail.first;
        Integer like = detail.second;
        if (likedVideos.contains(aid)) return;
        likedVideos.add(aid);
        if (cachedFieldName == null) {
            for (Field field : viewHolder.getClass().getDeclaredFields()) {
                if (!View.class.isAssignableFrom(field.getType())) continue;
                View view = (View) Reflex.getObjectField(viewHolder, field.getName());
                if (view != null && (view.getId() == likeId || view.getId() == like2Id)) {
                    cachedFieldName = field.getName();
                    break;
                }
            }
        }
        if (cachedFieldName == null) return;
        if (like == 0) {
            View likeView = (View) Reflex.getObjectField(viewHolder, cachedFieldName);
            likeView.callOnClick();
        }
    }
}
