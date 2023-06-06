package app.revanced.bilibili.patches.json;

import android.text.TextUtils;

import com.bilibili.ad.adview.videodetail.danmakuv2.model.Dm;
import com.bilibili.ad.adview.videodetail.danmakuv2.model.DmAdvert;
import com.bilibili.bililive.room.biz.reverse.bean.LiveRoomReserveInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveGoodsCardInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingGotoBuyInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingRecommendCardGoodsDetail;
import com.bilibili.bililive.videoliveplayer.net.beans.attentioncard.LiveRoomRecommendCard;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.userinfo.BiliLiveRoomUserInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.userinfo.FunctionCard;
import com.bilibili.lib.homepage.mine.MenuGroup;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.search.api.SearchRank;
import com.bilibili.search.api.SearchReferral;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import app.revanced.bilibili.meta.BottomItem;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Constants;
import tv.danmaku.bili.ui.main.event.model.EventEntranceModel;
import tv.danmaku.bili.ui.main2.api.AccountMine;
import tv.danmaku.bili.ui.splash.ad.model.SplashData;
import tv.danmaku.bili.ui.splash.ad.model.SplashShowData;

public class JSONPatch {
    public static List<BottomItem> drawerItems = new ArrayList<>();

    public static Object parseObjectHook(Object obj) {
        Object data = obj instanceof GeneralResponse ? ((GeneralResponse<?>) obj).data : obj;
        if (data instanceof SplashData) {
            if (Settings.PURIFY_SPLASH.getBoolean()) {
                SplashData splashData = (SplashData) data;
                splashData.splashList.clear();
                splashData.strategyList.clear();
            }
        } else if (data instanceof SplashShowData) {
            if (Settings.PURIFY_SEARCH.getBoolean())
                ((SplashShowData) data).strategyList.clear();
        } else if (data instanceof EventEntranceModel) {
            if (Settings.PURIFY_GAME.getBoolean()) {
                EventEntranceModel model = (EventEntranceModel) data;
                model.setHash("");
                model.setOnline(null);
            }
        } else if (data instanceof DmAdvert) {
            if (Settings.BLOCK_UP_RCMD_ADS.getBoolean()) {
                List<Dm> ads = ((DmAdvert) data).getAds();
                if (ads != null)
                    ads.clear();
            }
        } else if (data instanceof LiveShoppingInfo) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("shoppingCard")) {
                LiveShoppingInfo info = (LiveShoppingInfo) data;
                info.shoppingCardDetail = null;
                info.recommendCardDetail = null;
            }
        } else if (data instanceof LiveGoodsCardInfo || data instanceof LiveShoppingRecommendCardGoodsDetail) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("shoppingCard"))
                return null;
        } else if (data instanceof BiliLiveRoomInfo) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("follow")) {
                BiliLiveRoomInfo.FunctionCard card = ((BiliLiveRoomInfo) data).functionCard;
                if (card != null)
                    card.followCard = null;
            }
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("banner"))
                ((BiliLiveRoomInfo) data).bannerInfo = null;
        } else if (data instanceof LiveRoomRecommendCard) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("follow"))
                return null;
        } else if (data instanceof LiveRoomReserveInfo) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("reserve"))
                ((LiveRoomReserveInfo) data).showReserveDetail = false;
        } else if (data instanceof BiliLiveRoomUserInfo) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("gift")) {
                FunctionCard card = ((BiliLiveRoomUserInfo) data).functionCard;
                if (card != null)
                    card.sengGiftCard = null;
            }
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("task"))
                ((BiliLiveRoomUserInfo) data).taskInfo = null;
        } else if (data instanceof LiveShoppingGotoBuyInfo) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("gotoBuy"))
                return null;
        } else if (data instanceof AccountMine) {
            customizeMine((AccountMine) data);
        }
        return obj;
    }

    public static void parseArrayHook(Class<?> type, ArrayList<?> list) {
        if (type == SearchRank.class || type == SearchReferral.Guess.class) {
            if (Settings.PURIFY_SEARCH.getBoolean())
                list.clear();
        }
    }

    public static boolean drawerShowing(Set<String> items, String item) {
        if (items.contains(item)) return true;
        return items.size() == 1 && items.contains(Constants.ALL_VALUE);
    }

    private static void customizeMine(AccountMine mine) {
        drawerItems.clear();
        Set<String> items = Settings.SHOWING_DRAWER_ITEMS.getStringSet();
        boolean purifyRedDot = Settings.PURIFY_DRAWER_RED_DOT.getBoolean();
        int drawerStyle = Integer.parseInt(Settings.DRAWER_STYLE.getString());
        List<MenuGroup> sectionListV2 = mine.sectionListV2;
        if (sectionListV2 == null || sectionListV2.isEmpty())
            return;
        for (int i = 0; i < sectionListV2.size(); i++) {
            MenuGroup section = sectionListV2.get(i);
            String title = section.title;
            if (!TextUtils.isEmpty(title))
                drawerItems.add(new BottomItem("【标题项目】", null, title, drawerShowing(items, title)));
            List<MenuGroup.Item> itemList = section.itemList;
            if (itemList == null || itemList.isEmpty())
                continue;
            section.itemList.removeIf(item -> {
                String itemTitle = item.title;
                if (TextUtils.isEmpty(itemTitle))
                    return false;
                String uri = item.uri;
                String id = String.valueOf(item.id);
                boolean showing = drawerShowing(items, id);
                drawerItems.add(new BottomItem(itemTitle, uri, id, showing));
                if (purifyRedDot) {
                    item.redDot = 0;
                    item.redDotRorNew = false;
                }
                return !showing;
            });
            MenuGroup.MineButton button = section.button;
            if (button != null) {
                String buttonText = button.text;
                if (!TextUtils.isEmpty(buttonText)) {
                    String uri = button.jumpUrl;
                    boolean showing = drawerShowing(items, buttonText);
                    drawerItems.add(new BottomItem("按钮：", uri, buttonText, showing));
                    if (!showing)
                        section.button = null;
                }
            }
            if (drawerStyle != 0)
                section.style = drawerStyle;
        }
        sectionListV2.removeIf(section -> !TextUtils.isEmpty(section.title) && !drawerShowing(items, section.title));
    }
}
