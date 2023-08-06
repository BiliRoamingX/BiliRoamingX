package app.revanced.bilibili.patches.okhttp;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;

import androidx.annotation.NonNull;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import app.revanced.bilibili.api.BiliRoamingApi;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Jsons;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.SubtitleHelper;
import app.revanced.bilibili.utils.Utils;
import app.revanced.bilibili.utils.Versions;

@SuppressWarnings("unused")
public class OkHttpPatch {
    private static final String RES_NO_UPDATE = "{\"code\":-1,\"message\":\"哼，休想要我更新！<(￣︶￣)>\"}";
    private static final String RES_MATERIAL_EMPTY = "{\"code\":0,\"data\":{\"container\":[]},\"message\":\"success\"}";
    private static final String RES_CARDS_EMPTY = "{\"code\":0,\"data\":[]}";
    private static final String RES_TH_BANGUMI_SHARE_CHANNELS = "{\"code\":0,\"message\":\"0\",\"ttl\":1,\"data\":{\"above_channels\":[{\"name\":\"微信\",\"picture\":\"https://i0.hdslb.com/bfs/share/658af3c22431cd78bb7c50be3394f7c032eba12c.png\",\"share_channel\":\"WEIXIN\"},{\"name\":\"朋友圈\",\"picture\":\"https://i0.hdslb.com/bfs/share/c1ebcec8c5302f29f792d15f04e0d6dcef53ec27.png\",\"share_channel\":\"WEIXIN_MONMENT\"},{\"name\":\"QQ\",\"picture\":\"https://i0.hdslb.com/bfs/share/114ccfb3a999df9c4d11f274c8c61a804c8f8803.png\",\"share_channel\":\"QQ\"},{\"name\":\"QQ空间\",\"picture\":\"https://i0.hdslb.com/bfs/share/30e9608bbce725bca45b5910866f60ab4d5e18b3.png\",\"share_channel\":\"QZONE\"},{\"name\":\"动态\",\"picture\":\"https://i0.hdslb.com/bfs/share/80f8068a2c7388e69d8aee278fa906027988c049.png\",\"share_channel\":\"biliDynamic\"},{\"name\":\"消息\",\"picture\":\"https://i0.hdslb.com/bfs/share/d4f0cc59313083fee8a759b76b193c87ab7bba80.png\",\"share_channel\":\"biliIm\"},{\"name\":\"微博\",\"picture\":\"https://i0.hdslb.com/bfs/share/3707fc23f7d3e24022712320284b0de9aa78c87d.png\",\"share_channel\":\"SINA\"},{\"name\":\"图片分享\",\"picture\":\"https://i0.hdslb.com/bfs/share/f40ff0f6c56fd23d3d5e688b79458e6bddb6081a.png\",\"share_channel\":\"PIC\"},{\"name\":\"复制链接\",\"picture\":\"https://i0.hdslb.com/bfs/share/9f7ce8985eff2927c265d1b7b02221170b74106f.png\",\"share_channel\":\"COPY\"},{\"name\":\"更多\",\"picture\":\"https://i0.hdslb.com/bfs/share/1273b5b39c7d12f8960ace566f2db90a34ad3c19.png\",\"share_channel\":\"GENERIC\"}],\"below_channels\":[{\"name\":\"缓存\",\"picture\":\"https://i0.hdslb.com/bfs/share/bdb9996ea9f7030ab2bd72777e7e8c2f717f4af1.png\",\"share_channel\":\"VIDEO_DOWNLOAD\",\"category\":\"VIDEO_DOWNLOAD\",\"level\":\"1\"},{\"name\":\"版权受限\",\"picture\":\"https://i0.hdslb.com/bfs/share/e4cbcc33f0052c0aa88b3f89a34a3510f520e613.png\",\"share_channel\":\"VIDEO_DOWNLOAD_UNABLE\",\"category\":\"VIDEO_DOWNLOAD\",\"level\":\"2\"},{\"name\":\"倍速播放\",\"picture\":\"https://i0.hdslb.com/bfs/share/f6630e6f91e6b0b6062f516fc22960dc7f7f21c0.png\",\"share_channel\":\"PLAY_RATE_0.5\",\"category\":\"PLAY_RATE\",\"level\":\"1\"},{\"name\":\"倍速播放\",\"picture\":\"https://i0.hdslb.com/bfs/share/b09fc9f3483870b2433394f50ad7caa938ed49a6.png\",\"share_channel\":\"PLAY_RATE_0.75\",\"category\":\"PLAY_RATE\",\"level\":\"2\"},{\"name\":\"倍速播放\",\"picture\":\"https://i0.hdslb.com/bfs/share/4428da5f26cbd981b3d6f2e0bbd31d2428c1c367.png\",\"share_channel\":\"PLAY_RATE_1.0\",\"category\":\"PLAY_RATE\",\"level\":\"3\"},{\"name\":\"倍速播放\",\"picture\":\"https://i0.hdslb.com/bfs/share/55dabc39dbef52b35f000af603192ff334c81654.png\",\"share_channel\":\"PLAY_RATE_1.25\",\"category\":\"PLAY_RATE\",\"level\":\"4\"},{\"name\":\"倍速播放\",\"picture\":\"https://i0.hdslb.com/bfs/share/071c52b41f8657f65e22874a1623273db7505eab.png\",\"share_channel\":\"PLAY_RATE_1.5\",\"category\":\"PLAY_RATE\",\"level\":\"5\"},{\"name\":\"倍速播放\",\"picture\":\"https://i0.hdslb.com/bfs/share/05f1761b4bf7b67c2bd75c45c9f873bdf9cee26d.png\",\"share_channel\":\"PLAY_RATE_2\",\"category\":\"PLAY_RATE\",\"level\":\"6\"},{\"name\":\"自动连播\",\"picture\":\"https://i0.hdslb.com/bfs/share/04c552ab8470d8c15246a1f1a431092c012dd38d.png\",\"share_channel\":\"PLAY_MODE_AUTO_PLAY\",\"category\":\"PLAY_MODE\",\"level\":\"1\"},{\"name\":\"播完暂停\",\"picture\":\"https://i0.hdslb.com/bfs/share/d48cbd6507b7dac6950a8db3d5eed39cdde5b52c.png\",\"share_channel\":\"PLAY_MODE_END_STOP\",\"category\":\"PLAY_MODE\",\"level\":\"2\"},{\"name\":\"单集循环\",\"picture\":\"https://i0.hdslb.com/bfs/share/661e4b6961fa9c75df16ce6ec33b52bd4ac35f29.png\",\"share_channel\":\"PLAY_MODE_SINGLE_LOOP\",\"category\":\"PLAY_MODE\",\"level\":\"3\"},{\"name\":\"列表循环\",\"picture\":\"https://i0.hdslb.com/bfs/share/ec2ce2cc189b9e40acf950dac48f0fbe92057469.png\",\"share_channel\":\"PLAY_MODE_LIST_LOOP\",\"category\":\"PLAY_MODE\",\"level\":\"4\"},{\"name\":\"播放设置\",\"picture\":\"https://i0.hdslb.com/bfs/share/4ad589538b34ca7af77f72eb816585e6af2ef58c.png\",\"share_channel\":\"PLAY_SETTING\"},{\"name\":\"反馈建议\",\"picture\":\"https://i0.hdslb.com/bfs/share/b3769d816140e205825f473b5574845211d9b986.png\",\"share_channel\":\"SUGGESTION\"}],\"text\":\"分享\"}}";

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
                || shouldImportSkin(url, code)
                || shouldHookShareChannels(url, code)
                || shouldAddMediaInfo(url, code)
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
        } else if (shouldImportSkin(url, code)) {
            return importSkin(response);
        } else if (shouldHookShareChannels(url, code)) {
            return hookShareChannels(response);
        } else if (shouldAddMediaInfo(url, code)) {
            return AddMediaInfoHook.hook(url, response);
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

    private static boolean shouldPurifySeasonRcmd(String url, int code) {
        return Settings.REMOVE_RELATE_PROMOTE.getBoolean()
                && url.startsWith("https://api.bilibili.com/pgc/season/app/related/recommend")
                && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldPurifyCards(String url, int code) {
        return Settings.BLOCK_UP_RCMD_ADS.getBoolean()
                && (url.startsWith("https://api.bilibili.com/pgc/season/player/cards")
                || url.startsWith("https://api.bilibili.com/pgc/season/player/ogv/cards"))
                && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldImportSkin(String url, int code) {
        return Settings.SKIN.getBoolean()
                && !Settings.SKIN_JSON.getString().isEmpty()
                && url.startsWith("https://app.bilibili.com/x/resource/show/skin")
                && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldHookShareChannels(String url, int code) {
        // start from 7.38.0, switched to bson and gson type adapter, so hook response directly
        return (Settings.UNLOCK_PLAY_LIMIT.getBoolean() || Settings.UNLOCK_AREA_LIMIT.getBoolean())
                && url.startsWith("https://api.bilibili.com/x/share/channels")
                && code == HttpURLConnection.HTTP_OK;
    }

    private static boolean shouldAddMediaInfo(String url, int code) {
        return Settings.UNLOCK_AREA_LIMIT.getBoolean()
                && Versions.ge7_39_0()
                && url.startsWith("https://api.bilibili.com/pgc/view/v2/app/media")
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

    static String importSkin(String response) {
        JSONObject skin;
        try {
            skin = new JSONObject(Settings.SKIN_JSON.getString());
        } catch (Exception e) {
            return response;
        }
        skin.remove("package_md5");
        JSONObject jo = Jsons.toJSONObject(response);
        JSONObject data = jo.optJSONObject("data");
        if (data == null) return response;
        try {
            data.put("user_equip", skin);
        } catch (JSONException ignored) {
        }
        return jo.toString();
    }

    static String hookShareChannels(String response) {
        var json = Jsons.toJSONObject(response);
        if (json.optInt("code") != 0)
            return RES_TH_BANGUMI_SHARE_CHANNELS;
        var data = json.optJSONObject("data");
        if (data == null) return response;
        var belowChannels = data.optJSONArray("below_channels");
        if (belowChannels == null || belowChannels.length() == 0) return response;
        var alreadyHas = false;
        var toInsertIdx = -1;
        for (int i = 0; i < belowChannels.length(); i++) {
            var channelItem = belowChannels.optJSONObject(i);
            if (channelItem == null) continue;
            var shareChannel = channelItem.optString("share_channel");
            if ("PLAY_BACKGROUND_OFF".equals(shareChannel))
                toInsertIdx = i;
            if ("LISTEN".equals(shareChannel))
                alreadyHas = true;
        }
        if (alreadyHas || toInsertIdx == -1) return response;
        var listenChannel = new JSONObject();
        try {
            listenChannel.put("name", "听视频");
            listenChannel.put("share_channel", "LISTEN");
            listenChannel.put("picture", "https://i0.hdslb.com/bfs/share/f88d8c420a59ff1ca5975b38722408056e7337b7.png");
            belowChannels.put(toInsertIdx, listenChannel);
        } catch (JSONException ignored) {
        }
        return json.toString();
    }
}
