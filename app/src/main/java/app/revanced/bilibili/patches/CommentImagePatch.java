package app.revanced.bilibili.patches;

import android.content.ContentValues;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.HapticFeedbackConstants;

import com.bilibili.lib.imageviewer.fragment.ImageFragment;

import java.io.File;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Reflex;
import app.revanced.bilibili.utils.Toasts;
import app.revanced.bilibili.utils.Utils;

public class CommentImagePatch {
    public static void saveImage(String url) {
        try {
            try (var input = new URL(url).openStream()) {
                var relativePath = Environment.DIRECTORY_PICTURES + File.separator + "bilibili";
                var fullFilename = url.substring(url.lastIndexOf('/') + 1);
                var filename = fullFilename.substring(0, fullFilename.lastIndexOf('.'));

                var now = System.currentTimeMillis();
                var contentValues = new ContentValues();
                var mimeType = HttpURLConnection.guessContentTypeFromName(fullFilename);
                if (TextUtils.isEmpty(mimeType)) mimeType = "image/png";
                contentValues.put(MediaStore.MediaColumns.DISPLAY_NAME, filename);
                contentValues.put(MediaStore.MediaColumns.MIME_TYPE, mimeType);
                contentValues.put(MediaStore.MediaColumns.DATE_ADDED, now / 1000);
                contentValues.put(MediaStore.MediaColumns.DATE_MODIFIED, now / 1000);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    contentValues.put(MediaStore.MediaColumns.DATE_TAKEN, now);
                    contentValues.put(MediaStore.MediaColumns.RELATIVE_PATH, relativePath);
                } else {
                    var path = new File(Environment.getExternalStoragePublicDirectory(
                            Environment.DIRECTORY_PICTURES
                    ), "bilibili");
                    path.mkdirs();
                    contentValues.put(MediaStore.MediaColumns.DATA, new File(path, fullFilename).getAbsolutePath());
                }
                try {
                    var resolver = Utils.getContext().getContentResolver();
                    var uri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (uri == null) return;
                    try (var output = resolver.openOutputStream(uri)) {
                        Utils.copyStream(input, output);
                    }
                    Toasts.showShortWithId("biliroaming_toast_comment_image_save_success", relativePath + File.separator + fullFilename);
                } catch (Throwable th2) {
                    Toasts.showShortWithId("biliroaming_toast_comment_image_save_failed");
                }
            }
        } catch (Throwable th) {
            Toasts.showShortWithId("biliroaming_toast_comment_image_get_failed");
        }
    }

    private static final int imageViewId = Utils.getResId("image_view", "id");
    private static String cacheUrlFieldName = null;

    public static void bindClickListener(ImageFragment fragment) {
        if (!Settings.SAVE_COMMENT_IMAGE.getBoolean()) return;
        var arguments = fragment.getArguments();
        if (arguments == null || arguments.isEmpty()) return;
        var imageItem = arguments.getParcelable("image_item");
        if (imageItem == null) return;
        if (cacheUrlFieldName == null) {
            Field field = null;
            try {
                field = Reflex.findFirstFieldByExactType(imageItem.getClass().getSuperclass(), String.class);
            } catch (Throwable ignored) {
            }
            if (field != null)
                cacheUrlFieldName = field.getName();
        }
        if (cacheUrlFieldName == null) return;
        var imageUrl = (String) Reflex.getObjectField(imageItem, cacheUrlFieldName);
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
            Utils.async(() -> saveImage(finalImageUrl));
            return true;
        });
    }
}
