package app.revanced.bilibili.patches.json;

import android.text.TextUtils;

import androidx.annotation.Keep;

import com.bilibili.ad.adview.videodetail.danmakuv2.model.Dm;
import com.bilibili.ad.adview.videodetail.danmakuv2.model.DmAdvert;
import com.bilibili.app.authorspace.api.BiliSpace;
import com.bilibili.app.comm.list.widget.recommend.RecommendModeGuidanceConfig;
import com.bilibili.bililive.room.biz.reverse.bean.LiveRoomReserveInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveGoodsCardInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingGotoBuyInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingInfo;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingRecommendCardGoodsDetail;
import com.bilibili.bililive.videoliveplayer.net.beans.attentioncard.LiveRoomRecommendCard;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo.BiliLiveRoomInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.userinfo.BiliLiveRoomUserInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.userinfo.FunctionCard;
import com.bilibili.bililive.videoliveplayer.net.beans.giftpendant.LiveGiftPendantInfo;
import com.bilibili.lib.homepage.mine.MenuGroup;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.search.api.DefaultKeyword;
import com.bilibili.search.api.SearchRank;
import com.bilibili.search.api.SearchReferral;
import com.bilibili.video.story.StoryDetail;
import com.bilibili.video.story.api.StoryFeedResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import app.revanced.bilibili.meta.BottomItem;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.Constants;
import app.revanced.bilibili.utils.Utils;
import app.revanced.bilibili.utils.Versions;
import tv.danmaku.bili.ui.main.event.model.EventEntranceModel;
import tv.danmaku.bili.ui.main2.api.AccountMine;
import tv.danmaku.bili.ui.main2.resource.MainResourceManager;
import tv.danmaku.bili.ui.offline.api.EpPlayable;
import tv.danmaku.bili.ui.offline.api.OgvApiResponse;
import tv.danmaku.bili.ui.offline.api.OgvApiResponseV2;
import tv.danmaku.bili.ui.splash.ad.model.SplashData;
import tv.danmaku.bili.ui.splash.ad.model.SplashShowData;
import tv.danmaku.bili.ui.splash.brand.model.BrandSplashData;
import tv.danmaku.bili.ui.splash.event.EventSplashData;
import tv.danmaku.bili.ui.splash.event.EventSplashDataList;

public class JSONPatch {
    public static List<BottomItem> drawerItems = new ArrayList<>();
    public static List<BottomItem> bottomItems = new ArrayList<>();

    @Keep
    public static Object parseObjectHook(Object obj) {
        Object data = (obj instanceof GeneralResponse<?> resp) ? resp.data : obj;
        if (data instanceof SplashData splashData) {
            if (Settings.PURIFY_SPLASH.getBoolean()) {
                splashData.splashList.clear();
                splashData.strategyList.clear();
            }
        } else if (data instanceof SplashShowData showData) {
            if (Settings.PURIFY_SPLASH.getBoolean())
                showData.strategyList.clear();
        } else if (data instanceof EventEntranceModel) {
            if (Settings.PURIFY_GAME.getBoolean()) {
                // no problem, see com.bilibili.okretro.BiliApiDataCallback
                return null;
            }
        } else if (data instanceof DmAdvert dmAdvert) {
            if (Settings.BLOCK_UP_RCMD_ADS.getBoolean()) {
                List<Dm> ads = dmAdvert.getAds();
                if (ads != null)
                    ads.clear();
            }
        } else if (data instanceof LiveShoppingInfo info) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("shoppingCard")) {
                info.shoppingCardDetail = null;
                info.recommendCardDetail = null;
            }
        } else if (data instanceof LiveGoodsCardInfo || (!Utils.isHd() && data instanceof LiveShoppingRecommendCardGoodsDetail)) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("shoppingCard"))
                return null;
        } else if (data instanceof BiliLiveRoomInfo roomInfo) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("follow")) {
                BiliLiveRoomInfo.FunctionCard card = roomInfo.functionCard;
                if (card != null)
                    card.followCard = null;
            }
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("banner"))
                roomInfo.bannerInfo = null;
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("giftStar")) {
                LiveGiftPendantInfo pendantInfo = roomInfo.revenueGiftPendantInfo;
                if (pendantInfo != null)
                    pendantInfo.liveGiftStarPendantInfo = null;
            }
            if (Settings.REMOVE_LIVE_MASK.getBoolean()) try {
                roomInfo.areaMaskInfo = null;
            } catch (Throwable ignored) {
            }
        } else if (data instanceof LiveRoomRecommendCard) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("follow"))
                return null;
        } else if (!Utils.isHd() && data instanceof LiveRoomReserveInfo info) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("reserve"))
                info.showReserveDetail = false;
        } else if (data instanceof BiliLiveRoomUserInfo info) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("gift")) {
                FunctionCard card = info.functionCard;
                if (card != null)
                    card.sengGiftCard = null;
            }
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("task"))
                info.taskInfo = null;
        } else if (data instanceof LiveShoppingGotoBuyInfo) {
            if (Settings.PURIFY_LIVE_POPUPS.getStringSet().contains("gotoBuy"))
                return null;
        } else if (data instanceof AccountMine accountMine) {
            customizeMine(accountMine);
        } else if (data instanceof MainResourceManager.TabResponse tabResponse) {
            customizeHomeTab(tabResponse.tabData);
        } else if (data instanceof BiliSpace biliSpace) {
            customizeSpace(biliSpace);
        } else if (data instanceof OgvApiResponse<?> ogvApiResponse) {
            unlockOgvResponse(ogvApiResponse);
        } else if (!Utils.isHd() && data instanceof OgvApiResponseV2 ogvApiResponseV2) {
            unlockOgvResponseV2(ogvApiResponseV2);
        } else if (data instanceof StoryFeedResponse feedResponse) {
            filterStory(feedResponse);
        } else if ((!Versions.ge7_64_0() && (data instanceof SearchReferral || data instanceof DefaultKeyword)) || (Versions.ge7_39_0() && data instanceof com.bilibili.search2.api.SearchReferral)) {
            if (Settings.PURIFY_SEARCH.getBoolean())
                return null;
        } else if (data instanceof EventSplashDataList splashList) {
            if (Settings.PURIFY_SPLASH.getBoolean()) {
                List<EventSplashData> eventList = splashList.getEventList();
                if (eventList != null && !eventList.isEmpty())
                    eventList.removeIf(splash -> !splash.isBirthdayData());
            }
        } else if (data instanceof RecommendModeGuidanceConfig) {
            if (Settings.BLOCK_RECOMMEND_GUIDANCE.getBoolean())
                return null;
        } else if (data instanceof BrandSplashData brandSplashData) {
            if (Settings.PURIFY_SPLASH.getBoolean()) {
                brandSplashData.setBrandList(null);
                brandSplashData.setPreloadList(null);
                brandSplashData.setQueryList(null);
                brandSplashData.setShowList(null);
            }
        }
        return obj;
    }

    @Keep
    public static void parseArrayHook(Class<?> type, ArrayList<?> list) {
        if ((!Versions.ge7_64_0() && (type == SearchRank.class || type == SearchReferral.Guess.class))
                || (Versions.ge7_39_0() && (type == com.bilibili.search2.api.SearchRank.class || type == com.bilibili.search2.api.SearchReferral.Guess.class))) {
            if (Settings.PURIFY_SEARCH.getBoolean())
                list.clear();
        }
    }

    public static boolean shouldShowing(Set<String> items, String item) {
        if (items.contains(item)) return true;
        return items.size() == 1 && items.contains(Constants.ALL_VALUE);
    }

    private static void customizeMine(AccountMine mine) {
        drawerItems.clear();
        Set<String> items = Settings.SHOWING_DRAWER_ITEMS.getStringSet();
        boolean purifyRedDot = Settings.PURIFY_DRAWER_RED_DOT.getBoolean();
        int drawerStyle = Integer.parseInt(Settings.DRAWER_STYLE.getString());
        if (Utils.isHd()) {
            var menuGroups = Arrays.asList(mine.padSectionList, mine.recommendSectionList, mine.moreSectionList);
            for (int i = 0; i < menuGroups.size(); i++) {
                var menuItems = menuGroups.get(i);
                if (menuItems == null || menuItems.isEmpty()) continue;
                menuItems.removeIf(item -> {
                    String itemTitle = item.title;
                    if (TextUtils.isEmpty(itemTitle))
                        return false;
                    String uri = item.uri;
                    String id = String.valueOf(item.id);
                    boolean showing = shouldShowing(items, id);
                    drawerItems.add(new BottomItem(itemTitle, uri, id));
                    if (purifyRedDot) {
                        item.redDot = 0;
                        item.redDotRorNew = false;
                    }
                    return !showing;
                });
            }
        } else {
            List<MenuGroup> sectionListV2 = mine.sectionListV2;
            if (sectionListV2 == null || sectionListV2.isEmpty())
                return;
            for (int i = 0; i < sectionListV2.size(); i++) {
                MenuGroup section = sectionListV2.get(i);
                String title = section.title;
                if (!TextUtils.isEmpty(title))
                    drawerItems.add(new BottomItem("【标题项目】", null, title));
                List<MenuGroup.Item> itemList = section.itemList;
                if (itemList == null || itemList.isEmpty())
                    continue;
                section.itemList.removeIf(item -> {
                    String itemTitle = item.title;
                    if (TextUtils.isEmpty(itemTitle))
                        return false;
                    String uri = item.uri;
                    String id = String.valueOf(item.id);
                    boolean showing = shouldShowing(items, id);
                    if (!"设置".equals(itemTitle))
                        drawerItems.add(new BottomItem(itemTitle, uri, id));
                    if (purifyRedDot) {
                        item.redDot = 0;
                        item.redDotRorNew = false;
                    }
                    return !"设置".equals(itemTitle) && !showing;
                });
                MenuGroup.MineButton button = section.button;
                if (button != null) {
                    String buttonText = button.text;
                    if (!TextUtils.isEmpty(buttonText)) {
                        String uri = button.jumpUrl;
                        boolean showing = shouldShowing(items, buttonText);
                        drawerItems.add(new BottomItem("按钮：", uri, buttonText));
                        if (!showing)
                            section.button = null;
                    }
                }
                if (drawerStyle != 0)
                    section.style = drawerStyle;
            }
            sectionListV2.removeIf(section -> !TextUtils.isEmpty(section.title) && !shouldShowing(items, section.title));
        }
        if (Settings.CUSTOM_THEME.getBoolean()) {
            if (Versions.ge7_48_0()) {
                var garbEntrance = new AccountMine.GarbEntrance();
                garbEntrance.uri = "activity://navigation/theme/";
                mine.garbEntrance = garbEntrance;
            } else {
                mine.garbEntrance = null;
            }
        }
    }

    private static void customizeHomeTab(MainResourceManager.TabData data) {
        bottomItems.clear();
        Set<String> items = Settings.SHOWING_BOTTOM_ITEMS.getStringSet();
        data.bottom.removeIf(tab -> {
            var uri = tab.uri;
            var id = tab.tabId;
            var showing = shouldShowing(items, id);
            bottomItems.add(new BottomItem(tab.name, uri, id));
            return !showing;
        });

        if (Settings.DRAWER.getBoolean()) {
            data.bottom.removeIf(tab -> {
                String uri = tab.uri;
                return !TextUtils.isEmpty(uri) && uri.startsWith("bilibili://user_center/mine");
            });
        }

        if (Settings.ADD_CHANNEL.getBoolean())
            addChannelTab(data.bottom);

        if (Settings.PURIFY_GAME.getBoolean()) {
            data.top.removeIf(tab -> {
                String uri = tab.uri;
                return !TextUtils.isEmpty(uri) && uri.startsWith("bilibili://game_center/home");
            });
        }

        configTab(data.tab);
    }

    private static void addChannelTab(List<MainResourceManager.Tab> tabs) {
        var hasChannel = false;
        for (int i = 0; i < tabs.size(); i++) {
            var tabUri = tabs.get(i).uri;
            if (!TextUtils.isEmpty(tabUri) && tabUri.startsWith("bilibili://pegasus/channel")) {
                hasChannel = true;
                break;
            }
        }
        if (hasChannel) return;
        var newTab = new MainResourceManager.Tab();
        newTab.tabId = "123";
        newTab.reportId = "频道Bottom";
        newTab.name = "频道";
        newTab.uri = "bilibili://main/top_category";
        newTab.icon = "http://i0.hdslb.com/bfs/archive/e16c9303e9edbf23031f545fcafc44d1f60cd07b.png";
        newTab.iconSelected = "http://i0.hdslb.com/bfs/archive/f6739d905dee57d2c0429d9b66acb3f39b294aff.png";
        var pos = 2;
        newTab.pos = pos;
        for (int i = 0; i < tabs.size(); i++) {
            var tab = tabs.get(i);
            var tabPos = tab.pos;
            tab.pos = tabPos >= pos ? tabPos + 1 : tabPos;
        }
        tabs.add(0, newTab);
    }

    private static void configTab(List<MainResourceManager.Tab> tabs) {
        if (tabs == null || tabs.isEmpty())
            return;
        var hasBangumiCN = false;
        var hasBangumiTW = false;
        var hasMovieCN = false;
        var hasMovieTW = false;
        var hasKoreaHK = false;
        var hasKoreaTW = false;
        for (int i = 0; i < tabs.size(); i++) {
            var tab = tabs.get(i);
            switch (tab.uri) {
                case "bilibili://pgc/home" -> hasBangumiCN = true;
                case "bilibili://following/home_activity_tab/6544" -> hasBangumiTW = true;
                case "bilibili://pgc/home?home_flow_type=2", "bilibili://pgc/cinema-tab" ->
                        hasMovieCN = true;
                case "bilibili://following/home_activity_tab/168644" -> hasMovieTW = true;
                case "bilibili://following/home_activity_tab/163541" -> hasKoreaHK = true;
                case "bilibili://following/home_activity_tab/95636" -> hasKoreaTW = true;
            }
        }
        if (Settings.ADD_BANGUMI.getBoolean()) {
            if (!hasBangumiCN) {
                var tab = new MainResourceManager.Tab();
                tab.tabId = "50";
                tab.name = "追番（大陸）";
                tab.uri = "bilibili://pgc/home";
                tab.reportId = "bangumi";
                tab.pos = 50;
                tabs.add(tab);
            }
            if (!hasBangumiTW) {
                var tab = new MainResourceManager.Tab();
                tab.tabId = "60";
                tab.name = "追番（港澳台）";
                tab.uri = "bilibili://following/home_activity_tab/6544";
                tab.reportId = "bangumi";
                tab.pos = 60;
                tabs.add(tab);
            }
        }
        if (Settings.ADD_MOVIE.getBoolean()) {
            if (!hasMovieCN) {
                var tab = new MainResourceManager.Tab();
                tab.tabId = "70";
                tab.name = "影視（大陸）";
                tab.uri = "bilibili://pgc/home?home_flow_type=2";
                tab.reportId = "film";
                tab.pos = 70;
                tabs.add(tab);
            }
            if (!hasMovieTW) {
                var tab = new MainResourceManager.Tab();
                tab.tabId = "80";
                tab.name = "戏剧（港澳台）";
                tab.uri = "bilibili://following/home_activity_tab/168644";
                tab.reportId = "jptv";
                tab.pos = 80;
                tabs.add(tab);
            }
        }
        if (Settings.ADD_KOREA.getBoolean()) {
            if (!hasKoreaHK) {
                var tab = new MainResourceManager.Tab();
                tab.tabId = "803";
                tab.name = "韩综（港澳）";
                tab.uri = "bilibili://following/home_activity_tab/163541";
                tab.reportId = "koreavhk";
                tab.pos = 803;
                tabs.add(tab);
            }
            if (!hasKoreaTW) {
                var tab = new MainResourceManager.Tab();
                tab.tabId = "804";
                tab.name = "韩综（台湾）";
                tab.uri = "bilibili://following/home_activity_tab/95636";
                tab.reportId = "koreavtw";
                tab.pos = 804;
                tabs.add(tab);
            }
        }
        Set<String> tabSet = Settings.HIDED_HOME_TAB.getStringSet();
        if (tabSet.isEmpty()) return;
        tabs.removeIf(tab -> switch (tab.uri) {
            case "bilibili://live/home" -> tabSet.contains("live");
            case "bilibili://pegasus/promo" -> tabSet.contains("promo");
            case "bilibili://pegasus/hottopic" -> tabSet.contains("hottopic");
            case "bilibili://pgc/home", "bilibili://following/home_activity_tab/6544" ->
                    tabSet.contains("bangumi");
            case "bilibili://pgc/home?home_flow_type=2", "bilibili://pgc/cinema-tab", "bilibili://following/home_activity_tab/168644" ->
                    tabSet.contains("movie");
            case "bilibili://following/home_activity_tab/95636", "bilibili://following/home_activity_tab/163541" ->
                    tabSet.contains("korea");
            default -> tabSet.contains("other_tabs");
        });
    }

    private static void customizeSpace(BiliSpace space) {
        Set<String> values = Settings.CUSTOMIZE_SPACE.getStringSet();
        if (values.isEmpty()) return;
        if (space.tab != null && !space.tab.isEmpty())
            space.tab.removeIf(tab -> {
                String param = tab.param;
                if (TextUtils.isEmpty(param))
                    return false;
                String tabKey = "tab." + param;
                return values.contains(tabKey);
            });
        for (String value : values) {
            switch (value) {
                case "liveEntry" -> space.liveEntry = null;
                case "chargeResult" -> space.chargeResult = null;
                case "guard" -> space.guard = null;
                case "adV2" -> {
                    space.ad = null;
                    space.adV2 = null;
                }
                case "archiveVideo" -> space.archiveVideo = null;
                case "article" -> space.article = null;
                case "audio" -> space.audio = null;
                case "season" -> space.season = null;
                case "coinVideo" -> space.coinVideo = null;
                case "recommendVideo" -> space.recommendVideo = null;
                case "followComicList" -> space.followComicList = null;
                case "spaceGame" -> space.spaceGame = null;
                case "cheeseVideo" -> space.cheeseVideo = null;
                case "fansDress" -> space.fansDress = null;
                case "favoriteBox" -> space.favoriteBox = null;
                case "comicList" -> space.comicList = null;
                case "ugcSeasonList" -> space.ugcSeasonList = null;
                case "contractResource" -> space.contractResource = null;
                case "nftShowModule" -> space.nftShowModule = null;
            }
        }
    }

    private static void unlockOgvResponse(OgvApiResponse<?> response) {
        if (!Settings.ALLOW_DOWNLOAD.getBoolean()) return;
        if (!(response.result instanceof List<?> items)) return;
        for (int i = 0; i < items.size(); i++) {
            Object item = items.get(i);
            if (item instanceof EpPlayable epPlayable)
                epPlayable.isPlayable = 1;
        }
    }

    private static void unlockOgvResponseV2(OgvApiResponseV2 response) {
        if (!Settings.ALLOW_DOWNLOAD.getBoolean()) return;
        var data = response.getData();
        if (data == null) return;
        var params = data.getEpPlayableParams();
        if (params == null || params.isEmpty()) return;
        for (int i = 0; i < params.size(); i++)
            params.get(i).setPlayableType(0);
    }

    private static void filterStory(StoryFeedResponse storyFeedResponse) {
        Set<String> filters = Settings.FILTER_STORY.getStringSet();
        List<StoryDetail> items;
        if (!filters.isEmpty() && (items = storyFeedResponse.getItems()) != null) {
            Iterator<StoryDetail> it = items.iterator();
            while (it.hasNext()) {
                StoryDetail story = it.next();
                if (Settings.REMOVE_ELEC_BUTTON.getBoolean()) {
                    StoryDetail.Owner owner = story.getOwner();
                    if (owner != null) {
                        StoryDetail.Charge charge = owner.getCharge();
                        if (charge != null)
                            charge.setShow(false);
                    }
                }
                String aGoto = story.getGoto();
                if (!TextUtils.isEmpty(aGoto))
                    for (String filter : filters)
                        if (aGoto.contains(filter))
                            it.remove();
            }
        }
    }
}
