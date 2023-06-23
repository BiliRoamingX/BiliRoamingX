package app.revanced.bilibili.patches.okhttp;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

import java.net.HttpURLConnection;
import java.util.concurrent.TimeUnit;

import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.SubtitleHelper;
import app.revanced.bilibili.utils.Utils;

@SuppressWarnings("unused")
public class OkHttpPatch {
    public static boolean shouldHook(String url, int code) {
        if (shouldConvertSubtitle(url, code)) {
            return true;
        } else if (shouldUnlockBangumi(url, code)) {
            return true;
        }
        return false;
    }

    @SuppressLint("DefaultLocale")
    @NonNull
    public static String hook(String url, int code, String response) {
        LogHelper.debug(() -> String.format("OkHttpPatch.hook, code: %d, url: %s", code, url));
        LogHelper.debug(() -> "OkHttpPatch.hook, response: " + response);
        if (shouldConvertSubtitle(url, code)) {
            return convertSubtitle(response);
        } else if (shouldUnlockBangumi(url, code)) {
            return BangumiSeasonHook.unlockBangumi(response);
        }
        return response;
    }

    private static boolean shouldConvertSubtitle(String url, int code) {
        return url.contains("zh_converter=t2cn") && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldUnlockBangumi(String url, int code) {
        return Settings.UNLOCK_AREA_LIMIT.getBoolean()
                && url.startsWith("https://api.bilibili.com/pgc/view/v2/app/season")
                && code == HttpURLConnection.HTTP_OK;
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
