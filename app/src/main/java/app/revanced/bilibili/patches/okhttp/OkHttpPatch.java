package app.revanced.bilibili.patches.okhttp;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import java.net.HttpURLConnection;
import java.util.concurrent.TimeUnit;

import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.SubtitleHelper;
import app.revanced.bilibili.utils.Utils;

@Keep
@SuppressWarnings("unused")
public class OkHttpPatch {
    public static boolean shouldHook(String url, int code) {
        if (url.contains("zh_converter=t2cn") && code == HttpURLConnection.HTTP_OK) {
            LogHelper.error(() -> "found subtitle url which need convert: " + url);
            return true;
        }
        return false;
    }

    @NonNull
    public static String hook(String url, int code, String response) {
        if (url.contains("zh_converter=t2cn") && code == HttpURLConnection.HTTP_OK) {
            return convertSubtitle(response);
        }
        return response;
    }

    static String convertSubtitle(String response) {
        boolean dictReady = false;
        if (!SubtitleHelper.getDictExist()) {
            try {
                dictReady = Utils.submitTask(SubtitleHelper::checkDictUpdate)
                        .get(60, TimeUnit.SECONDS);
            } catch (Throwable ignored) {
            }
            if (!dictReady)
                dictReady = SubtitleHelper.getDictExist();
        } else {
            dictReady = true;
        }
        var newResponse = response;
        if (!dictReady) {
            newResponse = SubtitleHelper.errorResponse("转换字典下载失败，请重试");
        } else {
            try {
                newResponse = SubtitleHelper.convert(response);
            } catch (Throwable error) {
                LogHelper.error(() -> "字幕转换失败", error);
                newResponse = SubtitleHelper.errorResponse("字幕转换失败，请重试");
            }
        }
        try {
            Utils.async(() -> {
                if (SubtitleHelper.checkDictUpdate())
                    SubtitleHelper.reloadDict();
            });
        } catch (Throwable ignored) {
        }
        return newResponse;
    }
}
