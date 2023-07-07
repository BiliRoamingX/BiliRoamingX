package app.revanced.bilibili.patches.okhttp;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;

import androidx.annotation.NonNull;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import app.revanced.bilibili.api.BiliRoamingApi;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Jsons;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.SubtitleHelper;
import app.revanced.bilibili.utils.Utils;

@SuppressWarnings("unused")
public class OkHttpPatch {
    private static final String RES_NO_UPDATE = "{\"code\":-304,\"message\":\"没有改动\"}";
    private static final String RES_MATERIAL_EMPTY = "{\"code\":0,\"data\":{\"container\":[]},\"message\":\"success\"}";
    private static final String RES_CARDS_EMPTY = "{\"code\":0,\"data\":[]}";

    @SuppressLint("DefaultLocale")
    public static boolean shouldHook(String url, int code) {
        LogHelper.debug(() -> String.format("OkHttpPatch.shouldHook, code: %d, url: %s", code, url));
        return shouldConvertSubtitle(url, code)
                || shouldUnlockBangumi(url, code)
                || shouldFixSpace(url, code)
                || shouldBlockUpdate(url, code)
                || shouldBlockBangumiMaterial(url, code)
                || shouldPurifySeasonRcmd(url, code)
                || shouldPurifyCards(url, code)
                /* for convenient to add a new line */;
    }

    @SuppressLint("DefaultLocale")
    @NonNull
    public static String hook(String url, int code, String response) {
        LogHelper.debug(() -> String.format("OkHttpPatch.hook, code: %d, url: %s", code, url));
        LogHelper.debug(() -> "OkHttpPatch.hook, response: " + response);
        if (shouldConvertSubtitle(url, code)) {
            return convertSubtitle(response);
        } else if (shouldUnlockBangumi(url, code)) {
            return BangumiSeasonHook.unlockBangumi(url, response);
        } else if (shouldFixSpace(url, code)) {
            return fixSpace(url, response);
        } else if (shouldBlockUpdate(url, code)) {
            return RES_NO_UPDATE;
        } else if (shouldBlockBangumiMaterial(url, code)) {
            return RES_MATERIAL_EMPTY;
        } else if (shouldPurifySeasonRcmd(url, code)) {
            return purifySeasonRcmd(response);
        } else if (shouldPurifyCards(url, code)) {
            return RES_CARDS_EMPTY;
        }
        return response;
    }

    private static boolean shouldConvertSubtitle(String url, int code) {
        return (url.contains("zh_converter=t2cn")
                || url.contains("zh_converter%3Dt2cn") // free flow, url starts with https://proxy-tf-all-ws.bilivideo.com
        ) && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldUnlockBangumi(String url, int code) {
        return (Settings.UNLOCK_AREA_LIMIT.getBoolean() || Settings.BLOCK_BANGUMI_PAGE_ADS.getBoolean())
                && url.startsWith("https://api.bilibili.com/pgc/view/v2/app/season")
                && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldFixSpace(String url, int code) {
        return Settings.FIX_SPACE.getBoolean()
                && url.startsWith("https://app.bilibili.com/x/v2/space?")
                && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldBlockUpdate(String url, int code) {
        return Settings.BLOCK_UPDATE.getBoolean()
                && url.startsWith("https://app.bilibili.com/x/v2/version/fawkes/upgrade")
                && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldBlockBangumiMaterial(String url, int code) {
        return Settings.BLOCK_BANGUMI_PAGE_ADS.getBoolean()
                && (url.startsWith("https://api.bilibili.com/pgc/activity/deliver/material/receive")
                || url.startsWith("https://api.bilibili.com/pgc/activity/deliver/material/receive-activity"))
                && code == HttpURLConnection.HTTP_OK;
    }

    public static boolean shouldPurifySeasonRcmd(String url, int code) {
        return Settings.REMOVE_RELATE_PROMOTE.getBoolean()
                && url.startsWith("https://api.bilibili.com/pgc/season/app/related/recommend")
                && code == HttpURLConnection.HTTP_OK;
    }

    public static boolean shouldPurifyCards(String url, int code) {
        return Settings.BLOCK_UP_RCMD_ADS.getBoolean()
                && (url.startsWith("https://api.bilibili.com/pgc/season/player/cards")
                || url.startsWith("https://api.bilibili.com/pgc/season/player/ogv/cards"))
                && code == HttpURLConnection.HTTP_OK;
    }

    static String convertSubtitle(String response) {
        boolean dictReady = false;
        if (!SubtitleHelper.getDictExist()) {
            try {
                dictReady = Utils.submitTask(SubtitleHelper::checkDictUpdate)
                        .get(60, TimeUnit.SECONDS);
            } catch (Throwable error) {
                LogHelper.error(() -> "check dict update failed", error);
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

    static String fixSpace(String url, String response) {
        if (response.contains("\"code\":0"))
            return response;
        var vmid = Uri.parse(url).getQueryParameter("vmid");
        if (TextUtils.isEmpty(vmid))
            return response;
        var mid = Long.parseLong(vmid);
        var data = BiliRoamingApi.getSpace(mid);
        if (data == null)
            return response;
        return "{\"code\":0,\"data\":" + data + "}";
    }

    static String purifySeasonRcmd(String response) {
        var json = Jsons.toJSONObject(response);
        var result = json.optJSONObject("result");
        if (result == null) return response;
        var cards = result.optJSONArray("cards");
        if (cards == null || cards.length() == 0) return response;
        var toRemoveIdxList = new ArrayList<Integer>();
        for (int i = 0; i < cards.length(); i++) {
            var card = cards.optJSONObject(i);
            if (card.optInt("type") == 2)
                toRemoveIdxList.add(i);
        }
        if (toRemoveIdxList.isEmpty())
            return response;
        for (int i = toRemoveIdxList.size() - 1; i >= 0; i--)
            cards.remove(toRemoveIdxList.get(i));
        return json.toString();
    }
}
