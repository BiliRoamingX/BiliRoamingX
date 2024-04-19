package app.revanced.bilibili.patches;

import android.text.TextUtils;
import android.view.HapticFeedbackConstants;

import androidx.annotation.Keep;

import com.bilibili.lib.imageviewer.fragment.ImageFragment;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.Reflex;
import app.revanced.bilibili.utils.Utils;

public class CommentImagePatch {

    private static final int imageViewId = Utils.getResId("image_view", "id");

    @Keep
    public static void bindClickListener(ImageFragment fragment) {
        if (!Settings.SAVE_COMMENT_IMAGE.getBoolean()) return;
        var arguments = fragment.getArguments();
        if (arguments == null || arguments.isEmpty()) return;
        var imageItem = arguments.getParcelable("image_item");
        if (imageItem == null) return;
        var field = Reflex.findFirstFieldByExactTypeOrNull(imageItem.getClass().getSuperclass(), String.class);
        if (field == null) return;
        var imageUrl = (String) Reflex.getFieldValue(imageItem, field);
        if (TextUtils.isEmpty(imageUrl) || !imageUrl.startsWith("http"))
            return;
        var atIndex = imageUrl.indexOf('@');
        if (atIndex != -1)
            imageUrl = imageUrl.substring(0, atIndex);
        var view = fragment.getView();
        if (view == null) return;
        var imageView = view.findViewById(imageViewId);
        if (imageView == null) return;
        final var finalImageUrl = imageUrl;
        imageView.setOnLongClickListener(v -> {
            v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
            KtUtils.saveImage(finalImageUrl);
            return true;
        });
    }
}
