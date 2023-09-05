package app.revanced.bilibili.patches.json;

import android.text.TextUtils;

import com.bapis.bilibili.app.view.v1.Relate;
import com.bapis.bilibili.app.view.v1.RelatesFeedReply;
import com.bapis.bilibili.app.view.v1.RelatesFeedReplyEx;
import com.bapis.bilibili.app.view.v1.ViewReply;
import com.bapis.bilibili.app.view.v1.ViewReplyEx;
import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.ModuleEx;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bapis.bilibili.app.viewunite.common.RelateCardType;
import com.bapis.bilibili.app.viewunite.common.Relates;
import com.bapis.bilibili.app.viewunite.common.RelatesEx;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Args;
import com.bilibili.pegasus.api.modelv2.BannerItemV2;
import com.bilibili.pegasus.api.modelv2.Config;
import com.bilibili.pegasus.api.modelv2.LargeCoverSingleV7Item;
import com.bilibili.pegasus.api.modelv2.LargeCoverSingleV8Item;
import com.bilibili.pegasus.api.modelv2.LargeCoverSingleV9Item;
import com.bilibili.pegasus.api.modelv2.LargeCoverV1Item;
import com.bilibili.pegasus.api.modelv2.LargeCoverV7Item;
import com.bilibili.pegasus.api.modelv2.LargeCoverV8Item;
import com.bilibili.pegasus.api.modelv2.LargeCoverV9Item;
import com.bilibili.pegasus.api.modelv2.PegasusFeedResponse;
import com.bilibili.pegasus.api.modelv2.SmallCoverItem;
import com.bilibili.pegasus.api.modelv2.SmallCoverV10Item;
import com.bilibili.pegasus.api.modelv2.SmallCoverV2Item;
import com.bilibili.pegasus.api.modelv2.SmallCoverV9Item;
import com.bilibili.pegasus.api.modelv2.Tag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import app.revanced.bilibili.meta.pegasus.BannersItem;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.ArrayUtils;
import app.revanced.bilibili.utils.Toasts;
import app.revanced.bilibili.utils.Utils;

public class PegasusPatch {

    private static Set<String> cachedTitileSet = Collections.emptySet();
    private static List<Pattern> cachedTitleRegexes = Collections.emptyList();
    private static Set<String> cachedReasonSet = Collections.emptySet();
    private static List<Pattern> cachedReasonRegexes = Collections.emptyList();
    private static Set<String> cachedUpSet = Collections.emptySet();
    private static List<Pattern> cachedUpRegexes = Collections.emptyList();

    private static final long REASON_ID_TITLE = 1145140L;
    private static final long REASON_ID_RCMD_REASON = 1145141L;
    private static final long REASON_ID_UP_ID = 1145142L;
    private static final long REASON_ID_UP_NAME = 1145143L;
    private static final long REASON_ID_CATEGORY_NAME = 1145144L;
    private static final long REASON_ID_CHANNEL_NAME = 1145145L;
    private static final long[] blockReasonIds = new long[]{
            REASON_ID_TITLE,
            REASON_ID_RCMD_REASON,
            REASON_ID_UP_ID,
            REASON_ID_UP_NAME,
            REASON_ID_CATEGORY_NAME,
            REASON_ID_CHANNEL_NAME
    };

    private static final Map<String, List<String>> filterTypesMap = Map.ofEntries(
            Map.entry("advertisement", List.of("ad", "cm")),
            Map.entry("article", List.of("article")),
            Map.entry("bangumi", List.of("bangumi", "special", "pgc")),
            Map.entry("game", List.of("game")),
            Map.entry("picture", List.of("picture")),
            Map.entry("vertical", List.of("vertical", "story")),
            Map.entry("banner", List.of("banner")),
            Map.entry("live", List.of("live")),
            Map.entry("inline", List.of("inline")),
            Map.entry("notify", List.of("notify_tunnel")),
            Map.entry("large_cover", List.of("large_cover")),
            Map.entry("middle_cover", List.of("middle_cover")),
            Map.entry("small_cover", List.of("small_cover"))
    );

    private static List<String> getFilterTypes() {
        var filterSet = Settings.FILTER_HOME_RECOMMEND.getStringSet();
        return filterSet.stream().flatMap(s -> {
            var types = filterTypesMap.get(s);
            return types != null ? types.stream() : Stream.empty();
        }).collect(Collectors.toList());
    }

    private static boolean isNum(String str) {
        return !TextUtils.isEmpty(str) && str.chars().allMatch(Character::isDigit);
    }

    private static long toPlayCount(String str) {
        try {
            if (isNum(str))
                return Long.parseLong(str);
            if (str.contains("万"))
                return (long) (Double.parseDouble(str.replace("万", "")) * 10_000);
            if (str.contains("亿"))
                return (long) (Double.parseDouble(str.replace("亿", "")) * 100_000_000);
        } catch (Throwable ignored) {
        }
        return -1L;
    }

    private static String getCoverLeftText(BasicIndexItem item) {
        String coverLeftText = null;
        if (item instanceof SmallCoverItem) {
            coverLeftText = ((SmallCoverItem) item).coverLeftText1;
        } else if (item instanceof SmallCoverV2Item) {
            coverLeftText = ((SmallCoverV2Item) item).coverLeftText1;
        } else if (item instanceof SmallCoverV9Item) {
            coverLeftText = ((SmallCoverV9Item) item).coverLeftText1;
        } else if (item instanceof SmallCoverV10Item) {
            coverLeftText = ((SmallCoverV10Item) item).coverLeftText1;
        } else if (item instanceof LargeCoverV1Item) {
            coverLeftText = ((LargeCoverV1Item) item).coverLeftText1;
        } else if (item instanceof LargeCoverV7Item) {
            coverLeftText = ((LargeCoverV7Item) item).coverLeftText1;
        } else if (item instanceof LargeCoverV8Item) {
            coverLeftText = ((LargeCoverV8Item) item).coverLeftText1;
        } else if (item instanceof LargeCoverV9Item) {
            coverLeftText = ((LargeCoverV9Item) item).coverLeftText1;
        } else if (item instanceof LargeCoverSingleV7Item) {
            coverLeftText = ((LargeCoverSingleV7Item) item).coverLeftText1;
        } else if (item instanceof LargeCoverSingleV8Item) {
            coverLeftText = ((LargeCoverSingleV8Item) item).coverLeftText1;
        } else if (item instanceof LargeCoverSingleV9Item) {
            coverLeftText = ((LargeCoverSingleV9Item) item).coverLeftText1;
        }
        return coverLeftText;
    }

    private static boolean isLowPlayCountVideo(BasicIndexItem item, long playCountLimit) {
        if (playCountLimit == 0L) return false;
        var coverLeftText = getCoverLeftText(item);
        if (TextUtils.isEmpty(coverLeftText)) return false;
        var playCount = toPlayCount(coverLeftText);
        if (playCount == -1L) return false;
        return playCount < playCountLimit;
    }

    private static boolean isDurationInvalidVideo(BasicIndexItem item, int shortDuration, int longDuration) {
        if (shortDuration == 0 && longDuration == 0)
            return false;
        PlayerArgs playerArgs = item.playerArgs;
        long duration = playerArgs != null ? playerArgs.fakeDuration : 0;
        if (longDuration != 0 && duration > longDuration) return true;
        return shortDuration != 0 && duration < shortDuration;
    }

    private static boolean isContainsBlockKwdVideo(
            BasicIndexItem item,
            boolean titleRegexMode,
            Set<String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<String> upSet,
            List<Pattern> upRegexes,
            long[] uidArray,
            Set<String> categorySet,
            Set<String> channelSet
    ) {
        if (!titleSet.isEmpty()) {
            String title = item.title;
            if (titleRegexMode && !TextUtils.isEmpty(title)) {
                for (int i = 0; i < titleRegexes.size(); i++)
                    if (titleRegexes.get(i).matcher(title).find())
                        return true;
            } else if (!TextUtils.isEmpty(title))
                for (String s : titleSet)
                    if (title.contains(s))
                        return true;
        }

        if (uidArray.length > 0) {
            Args args = item.args;
            long upId = args != null ? args.upId : 0L;
            if (upId != 0L && ArrayUtils.contains(uidArray, upId))
                return true;
        }

        if (!upSet.isEmpty()) {
            String upName = getUpName(item);
            if (upRegexMode && !TextUtils.isEmpty(upName)) {
                for (int i = 0; i < upRegexes.size(); i++)
                    if (upRegexes.get(i).matcher(upName).find())
                        return true;
            } else if (!TextUtils.isEmpty(upName))
                for (String s : upSet)
                    if (upName.contains(s))
                        return true;
        }

        if (!categorySet.isEmpty()) {
            Args args = item.args;
            String category = args != null ? args.rname : null;
            if (!TextUtils.isEmpty(category))
                for (String s : categorySet)
                    if (category.contains(s))
                        return true;
        }

        if (!channelSet.isEmpty()) {
            Args args = item.args;
            String channel = args != null ? args.tname : null;
            if (!TextUtils.isEmpty(channel))
                for (String s : channelSet)
                    if (channel.contains(s))
                        return true;
        }

        if (!reasonSet.isEmpty()) {
            String reason = getRcmdReason(item);
            if (reasonRegexMode && !TextUtils.isEmpty(reason)) {
                for (int i = 0; i < reasonRegexes.size(); i++)
                    if (reasonRegexes.get(i).matcher(reason).find())
                        return true;
            } else if (!TextUtils.isEmpty(reason)) {
                for (String s : reasonSet)
                    if (reason.contains(s))
                        return true;
            }
        }

        return false;
    }

    private static boolean isPromoteRelate(Relate relate, boolean removeRelatePromote) {
        return removeRelatePromote && (relate.getFromSourceType()) == 2L || "cm".equals(relate.getGoto());
    }

    private static boolean isNotAvRelate(Relate relate, boolean removeRelatePromote, boolean removeRelateOnlyAv) {
        return removeRelatePromote && removeRelateOnlyAv && !"av".equals(relate.getGoto());
    }

    private static boolean isLowPlayCountRelate(Relate relate, long playCountLimit) {
        if (playCountLimit == 0L) return false;
        var text = relate.getStatV2().getViewVt().getText();
        if (TextUtils.isEmpty(text)) return false;
        var playCount = toPlayCount(text);
        if (playCount == -1L) return false;
        return playCount < playCountLimit;
    }

    private static boolean isDurationInvalidRelate(Relate relate, int shortDuration, int longDuration) {
        if (shortDuration == 0 && longDuration == 0)
            return false;
        long duration = relate.getDuration();
        if (longDuration != 0 && duration > longDuration) return true;
        return shortDuration != 0 && duration < shortDuration;
    }

    private static boolean isContainsBlockKwdRelate(
            Relate item,
            boolean titleRegexMode,
            Set<String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<String> upSet,
            List<Pattern> upRegexes,
            long[] uidArray
    ) {
        if (!titleSet.isEmpty()) {
            String title = item.getTitle();
            if (titleRegexMode && !TextUtils.isEmpty(title)) {
                for (int i = 0; i < titleRegexes.size(); i++)
                    if (titleRegexes.get(i).matcher(title).find())
                        return true;
            } else if (!TextUtils.isEmpty(title))
                for (String s : titleSet)
                    if (title.contains(s))
                        return true;
        }

        if (uidArray.length > 0) {
            long upId = item.getAuthor().getMid();
            if (upId != 0L && ArrayUtils.contains(uidArray, upId))
                return true;
        }

        if (!upSet.isEmpty()) {
            String upName = item.getAuthor().getName();
            if (upRegexMode && !TextUtils.isEmpty(upName)) {
                for (int i = 0; i < upRegexes.size(); i++)
                    if (upRegexes.get(i).matcher(upName).find())
                        return true;
            } else if (!TextUtils.isEmpty(upName))
                for (String s : upSet)
                    if (upName.contains(s))
                        return true;
        }

        if (!reasonSet.isEmpty()) {
            String reason = item.getRcmdReasonStyle().getText();
            if (reasonRegexMode && !TextUtils.isEmpty(reason)) {
                for (int i = 0; i < reasonRegexes.size(); i++)
                    if (reasonRegexes.get(i).matcher(reason).find())
                        return true;
            } else if (!TextUtils.isEmpty(reason)) {
                for (String s : reasonSet)
                    if (reason.contains(s))
                        return true;
            }
        }

        return false;
    }

    private static boolean isPromoteRelateUnite(RelateCard relate, boolean removeRelatePromote) {
        RelateCardType cardType = relate.getRelateCardType();
        return removeRelatePromote && (cardType == RelateCardType.RESOURCE || cardType == RelateCardType.CM || cardType == RelateCardType.GAME || cardType == RelateCardType.LIVE);
    }

    private static boolean isNotAvRelateUnite(RelateCard relate, boolean removeRelatePromote, boolean removeRelateOnlyAv, BizType bizType) {
        RelateCardType cardType = relate.getRelateCardType();
        return removeRelatePromote && removeRelateOnlyAv && (bizType == BizType.BIZ_TYPE_UGC && cardType != RelateCardType.AV);
    }

    private static boolean isWideAvCard(RelateCard relate) {
        RelateCardType cardType = relate.getRelateCardType();
        String aiGoToType = relate.getAiCard().getGotoType();
        return cardType == RelateCardType.AV || (cardType == RelateCardType.AI_RECOMMEND && "bangumi-av".equals(aiGoToType));
    }

    private static boolean isLowPlayCountRelateUnite(RelateCard relate, long playCountLimit) {
        if (playCountLimit == 0L) return false;
        if (!isWideAvCard(relate)) return false;
        RelateCardType cardType = relate.getRelateCardType();
        var text = cardType == RelateCardType.AV ? relate.getAv().getStat().getVt().getText()
                : relate.getAiCard().getStat().getVt().getText();
        if (TextUtils.isEmpty(text)) return false;
        var playCount = toPlayCount(text);
        if (playCount == -1L) return false;
        return playCount < playCountLimit;
    }

    private static boolean isDurationInvalidRelateUnite(RelateCard relate, int shortDuration, int longDuration) {
        if (shortDuration == 0 && longDuration == 0)
            return false;
        if (!isWideAvCard(relate)) return false;
        RelateCardType cardType = relate.getRelateCardType();
        long duration = cardType == RelateCardType.AV ? relate.getAv().getDuration()
                : relate.getAiCard().getDuration();
        if (longDuration != 0 && duration > longDuration) return true;
        return shortDuration != 0 && duration < shortDuration;
    }

    private static boolean isContainsBlockKwdRelateUnite(
            RelateCard item,
            boolean titleRegexMode,
            Set<String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<String> upSet,
            List<Pattern> upRegexes,
            long[] uidArray
    ) {
        if (!isWideAvCard(item)) return false;
        RelateCardType cardType = item.getRelateCardType();

        if (!titleSet.isEmpty()) {
            String title = item.getBasicInfo().getTitle();
            if (titleRegexMode && !TextUtils.isEmpty(title)) {
                for (int i = 0; i < titleRegexes.size(); i++)
                    if (titleRegexes.get(i).matcher(title).find())
                        return true;
            } else if (!TextUtils.isEmpty(title))
                for (String s : titleSet)
                    if (title.contains(s))
                        return true;
        }

        if (uidArray.length > 0) {
            long upId = item.getBasicInfo().getAuthor().getMid();
            if (upId != 0L && ArrayUtils.contains(uidArray, upId))
                return true;
        }

        if (!upSet.isEmpty()) {
            String upName = item.getBasicInfo().getAuthor().getTitle();
            if (upRegexMode && !TextUtils.isEmpty(upName)) {
                for (int i = 0; i < upRegexes.size(); i++)
                    if (upRegexes.get(i).matcher(upName).find())
                        return true;
            } else if (!TextUtils.isEmpty(upName))
                for (String s : upSet)
                    if (upName.contains(s))
                        return true;
        }

        if (!reasonSet.isEmpty() && cardType == RelateCardType.AV) {
            String reason = item.getAv().getRcmdReason().getText();
            if (reasonRegexMode && !TextUtils.isEmpty(reason)) {
                for (int i = 0; i < reasonRegexes.size(); i++)
                    if (reasonRegexes.get(i).matcher(reason).find())
                        return true;
            } else if (!TextUtils.isEmpty(reason)) {
                for (String s : reasonSet)
                    if (reason.contains(s))
                        return true;
            }
        }

        return false;
    }

    private static void removeAdBanner(BasicIndexItem item) {
        if (!(item instanceof BannersItem)) return;
        List<BannerItemV2> banners = ((BannersItem) item).getBanners();
        if (banners == null || banners.isEmpty()) return;
        banners.removeIf(banner -> "ad".equals(banner.type));
    }

    private static String getRcmdReason(BasicIndexItem item) {
        Tag reason = null;
        if (item instanceof SmallCoverItem) {
            reason = ((SmallCoverItem) item).rcmdReason;
        } else if (item instanceof SmallCoverV10Item) {
            reason = ((SmallCoverV10Item) item).rcmdReason;
        } else if (item instanceof SmallCoverV2Item) {
            SmallCoverV2Item coverItem = (SmallCoverV2Item) item;
            try {
                if (coverItem.rcmdReasonV2 != null) {
                    reason = coverItem.rcmdReasonV2;
                } else {
                    reason = coverItem.rcmdReason;
                }
            } catch (NoSuchFieldError ignored) {
                reason = coverItem.rcmdReason;
            }
        } else if (item instanceof SmallCoverV9Item) {
            reason = ((SmallCoverV9Item) item).rcmdReason;
        }
        if (reason != null)
            return reason.text;
        return null;
    }

    private static String getUpName(BasicIndexItem item) {
        Args args = item.args;
        if (args != null && !"picture".equals(item.goTo))
            return args.upName;
        if (!"picture".equals(item.goTo))
            return null;
        String desc = null;
        if (item instanceof SmallCoverItem) {
            desc = ((SmallCoverItem) item).desc;
        } else if (item instanceof SmallCoverV2Item) {
            desc = ((SmallCoverV2Item) item).desc;
        } else if (item instanceof SmallCoverV9Item) {
            desc = ((SmallCoverV9Item) item).desc;
        } else if (item instanceof LargeCoverV1Item) {
            desc = ((LargeCoverV1Item) item).desc;
        } else if (item instanceof LargeCoverSingleV7Item) {
            desc = ((LargeCoverSingleV7Item) item).desc;
        } else if (item instanceof LargeCoverSingleV8Item) {
            desc = ((LargeCoverSingleV8Item) item).desc;
        } else if (item instanceof LargeCoverSingleV9Item) {
            desc = ((LargeCoverSingleV9Item) item).desc;
        }
        return desc;
    }

    private static void appendReasons(BasicIndexItem item) {
        String title = item.title;
        String rcmdReason = getRcmdReason(item);
        Args args = item.args;
        long upId = args != null ? args.upId : 0L;
        String upName = getUpName(item);
        String categoryName = args != null ? args.rname : null;
        String channelName = args != null ? args.tname : null;
        List<DislikeReason> reasons = new ArrayList<>();
        if (!TextUtils.isEmpty(title)) {
            DislikeReason reason = new DislikeReason();
            reason.id = REASON_ID_TITLE;
            reason.name = "标题:" + title;
            reasons.add(reason);
        }
        if (!TextUtils.isEmpty(rcmdReason)) {
            DislikeReason reason = new DislikeReason();
            reason.id = REASON_ID_RCMD_REASON;
            reason.name = "推荐原因:" + rcmdReason;
            reasons.add(reason);
        }
        if (upId != 0L) {
            DislikeReason reason = new DislikeReason();
            reason.id = REASON_ID_UP_ID;
            reason.name = "UID:" + upId;
            reasons.add(reason);
        }
        if (!TextUtils.isEmpty(upName)) {
            DislikeReason reason = new DislikeReason();
            reason.id = REASON_ID_UP_NAME;
            reason.name = "UP主:" + upName;
            reasons.add(reason);
        }
        if (!TextUtils.isEmpty(categoryName)) {
            DislikeReason reason = new DislikeReason();
            reason.id = REASON_ID_CATEGORY_NAME;
            reason.name = "分区:" + categoryName;
            reasons.add(reason);
        }
        if (!TextUtils.isEmpty(channelName)) {
            DislikeReason reason = new DislikeReason();
            reason.id = REASON_ID_CHANNEL_NAME;
            reason.name = "频道:" + channelName;
            reasons.add(reason);
        }
        if (!reasons.isEmpty()) {
            List<ThreePointItem> threePoint = item.threePoint;
            if (threePoint == null)
                threePoint = new ArrayList<>();
            ThreePointItem threePointItem = new ThreePointItem();
            threePointItem.title = "漫游屏蔽";
            threePointItem.subtitle = "(本地屏蔽，刷新生效，可前往自定义首页查看)";
            threePointItem.type = "dislike";
            threePointItem.reasons = reasons;
            threePoint.add(threePointItem);
            item.threePoint = threePoint;
        }
    }

    private static void disableAutoRefresh(Config config) {
        if (config == null || !Settings.HOME_DISABLE_AUTO_REFRESH.getBoolean())
            return;
        if (Utils.isPink() || Utils.isBlue() || Utils.isPlay()) {
            // only exist on android and android_i now
            config.autoRefreshTimeByActive = -1L;
            config.autoRefreshTimeByAppear = -1L;
            config.autoRefreshTimeByBehavior = -1;
        }
        if (Utils.isPink() || Utils.isBlue()) {
            // only exist on android now
            config.autoRefreshByBehavior = -1;
        }
        if (Utils.isHd()) {
            // only exist on android_hd now
            config.auto_refresh_time = 0;
        }
    }

    public static void pegasusHook(GeneralResponse<PegasusFeedResponse> response) {
        var data = response.data;
        if (data == null) return;
        disableAutoRefresh(data.config);
        var items = data.items;
        if (items == null || items.isEmpty()) return;
        long playCountLimit = Settings.LOW_PLAY_COUNT_LIMIT.getLong();
        var shortDurationLimit = Settings.SHORT_DURATION_LIMIT.getInt();
        int longDurationLimit = Settings.LONG_DURATION_LIMIT.getInt();
        Set<String> titleSet = Settings.HOME_RCMD_FILTER_TITLE.getStringSet();
        boolean titleRegexMode = Settings.HOME_RCMD_FILTER_TITLE_REGEX_MODE.getBoolean();
        List<Pattern> titleRegexes;
        if (titleRegexMode && cachedTitileSet.equals(titleSet))
            titleRegexes = cachedTitleRegexes;
        else if (titleRegexMode) {
            cachedTitileSet = new HashSet<>(titleSet);
            titleRegexes = titleSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedTitleRegexes = titleRegexes;
        } else {
            titleRegexes = Collections.emptyList();
        }
        Set<String> reasonSet = Settings.HOME_RCMD_FILTER_REASON.getStringSet();
        boolean reasonRegexMode = Settings.HOME_RCMD_FILTER_REASON_REGEX_MODE.getBoolean();
        List<Pattern> reasonRegexes;
        if (reasonRegexMode && cachedReasonSet.equals(reasonSet))
            reasonRegexes = cachedReasonRegexes;
        else if (reasonRegexMode) {
            cachedReasonSet = new HashSet<>(reasonSet);
            reasonRegexes = reasonSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedReasonRegexes = reasonRegexes;
        } else {
            reasonRegexes = Collections.emptyList();
        }
        Set<String> upSet = Settings.HOME_RCMD_FILTER_UP.getStringSet();
        boolean upRegexMode = Settings.HOME_RCMD_FILTER_UP_REGEX_MODE.getBoolean();
        List<Pattern> upRegexes;
        if (upRegexMode && cachedUpSet.equals(upSet))
            upRegexes = cachedUpRegexes;
        else if (upRegexMode) {
            cachedUpSet = new HashSet<>(upSet);
            upRegexes = upSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedUpRegexes = upRegexes;
        } else {
            upRegexes = Collections.emptyList();
        }
        Set<String> uidSet = Settings.HOME_RCMD_FILTER_UID.getStringSet();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        Set<String> categorySet = Settings.HOME_RCMD_FILTER_CATEGORY.getStringSet();
        Set<String> channelSet = Settings.HOME_RCMD_FILTER_CHANNEL.getStringSet();
        items.removeIf(item -> {
            var cardGoto = item.cardGoto;
            var cardType = item.cardType;
            var goTo = item.goTo;
            var filterTypes = getFilterTypes();
            if (filterTypes.contains("ad"))
                removeAdBanner(item);
            var typeMatched = false;
            for (var i = 0; i < filterTypes.size(); i++) {
                String type = filterTypes.get(i);
                if ((!TextUtils.isEmpty(cardGoto) && cardGoto.contains(type))
                        || (!TextUtils.isEmpty(cardType) && cardType.contains(type))
                        || (!TextUtils.isEmpty(goTo) && goTo.contains(type))) {
                    typeMatched = true;
                    break;
                }
            }
            return typeMatched || isLowPlayCountVideo(item, playCountLimit)
                    || isDurationInvalidVideo(item, shortDurationLimit, longDurationLimit)
                    || isContainsBlockKwdVideo(item,
                    titleRegexMode, titleSet, titleRegexes,
                    reasonRegexMode, reasonSet, reasonRegexes,
                    upRegexMode, upSet, upRegexes,
                    uidArray, categorySet, channelSet
            );
        });
        items.forEach(PegasusPatch::appendReasons);
    }

    public static void filterViewRelates(ViewReply viewReply) {
        if (Settings.REMOVE_RELATE_PROMOTE.getBoolean()
                && Settings.REMOVE_RELATE_ONLY_AV.getBoolean()
                && Settings.REMOVE_RELATE_NOTHING.getBoolean()) {
            ViewReplyEx.clearRelates(viewReply);
            ViewReplyEx.clearPagination(viewReply);
            return;
        }
        List<Integer> indexes = getToRemoveRelateIndexes(viewReply.getRelatesList());
        for (int i = indexes.size() - 1; i >= 0; i--)
            ViewReplyEx.removeRelates(viewReply, indexes.get(i));
    }

    public static void filterViewUniteRelates(Module module, BizType bizType) {
        if (Settings.REMOVE_RELATE_PROMOTE.getBoolean()
                && Settings.REMOVE_RELATE_ONLY_AV.getBoolean()
                && Settings.REMOVE_RELATE_NOTHING.getBoolean()) {
            ModuleEx.clearRelates(module);
            return;
        }
        Relates relates = module.getRelates();
        List<Integer> indexes = getToRemoveRelateCardIndexes(relates.getCardsList(), bizType);
        for (int i = indexes.size() - 1; i >= 0; i--)
            RelatesEx.removeCards(relates, indexes.get(i));
    }

    public static void filterRelatesFeed(RelatesFeedReply feedReply) {
        List<Integer> indexes = getToRemoveRelateIndexes(feedReply.getListList());
        for (int i = indexes.size() - 1; i >= 0; i--)
            RelatesFeedReplyEx.removeList(feedReply, indexes.get(i));
    }

    public static void filterRelatesFeedUnite(com.bapis.bilibili.app.viewunite.v1.RelatesFeedReply feedReply) {
        List<Integer> indexes = getToRemoveRelateCardIndexes(feedReply.getRelatesList(), null);
        for (int i = indexes.size() - 1; i >= 0; i--)
            com.bapis.bilibili.app.viewunite.v1.RelatesFeedReplyEx.removeRelates(feedReply, indexes.get(i));
    }

    public static List<Integer> getToRemoveRelateIndexes(List<Relate> relates) {
        boolean removeRelatePromote = Settings.REMOVE_RELATE_PROMOTE.getBoolean();
        boolean removeRelateOnlyAv = Settings.REMOVE_RELATE_ONLY_AV.getBoolean();
        boolean applyToVideo = Settings.HOME_FILTER_APPLY_TO_VIDEO.getBoolean();
        long playCountLimit = Settings.LOW_PLAY_COUNT_LIMIT.getLong();
        var shortDurationLimit = Settings.SHORT_DURATION_LIMIT.getInt();
        int longDurationLimit = Settings.LONG_DURATION_LIMIT.getInt();
        Set<String> titleSet = Settings.HOME_RCMD_FILTER_TITLE.getStringSet();
        boolean titleRegexMode = Settings.HOME_RCMD_FILTER_TITLE_REGEX_MODE.getBoolean();
        List<Pattern> titleRegexes;
        if (titleRegexMode && cachedTitileSet.equals(titleSet))
            titleRegexes = cachedTitleRegexes;
        else if (titleRegexMode) {
            cachedTitileSet = new HashSet<>(titleSet);
            titleRegexes = titleSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedTitleRegexes = titleRegexes;
        } else {
            titleRegexes = Collections.emptyList();
        }
        Set<String> reasonSet = Settings.HOME_RCMD_FILTER_REASON.getStringSet();
        boolean reasonRegexMode = Settings.HOME_RCMD_FILTER_REASON_REGEX_MODE.getBoolean();
        List<Pattern> reasonRegexes;
        if (reasonRegexMode && cachedReasonSet.equals(reasonSet))
            reasonRegexes = cachedReasonRegexes;
        else if (reasonRegexMode) {
            cachedReasonSet = new HashSet<>(reasonSet);
            reasonRegexes = reasonSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedReasonRegexes = reasonRegexes;
        } else {
            reasonRegexes = Collections.emptyList();
        }
        Set<String> upSet = Settings.HOME_RCMD_FILTER_UP.getStringSet();
        boolean upRegexMode = Settings.HOME_RCMD_FILTER_UP_REGEX_MODE.getBoolean();
        List<Pattern> upRegexes;
        if (upRegexMode && cachedUpSet.equals(upSet))
            upRegexes = cachedUpRegexes;
        else if (upRegexMode) {
            cachedUpSet = new HashSet<>(upSet);
            upRegexes = upSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedUpRegexes = upRegexes;
        } else {
            upRegexes = Collections.emptyList();
        }
        Set<String> uidSet = Settings.HOME_RCMD_FILTER_UID.getStringSet();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < relates.size(); i++) {
            Relate relate = relates.get(i);
            if (isPromoteRelate(relate, removeRelatePromote)
                    || isNotAvRelate(relate, removeRelatePromote, removeRelateOnlyAv)
                    || (applyToVideo && (isLowPlayCountRelate(relate, playCountLimit)
                    || isDurationInvalidRelate(relate, shortDurationLimit, longDurationLimit)
                    || isContainsBlockKwdRelate(relate, titleRegexMode, titleSet, titleRegexes, reasonRegexMode, reasonSet, reasonRegexes, upRegexMode, upSet, upRegexes, uidArray))))
                idxList.add(i);
        }
        return idxList;
    }

    public static List<Integer> getToRemoveRelateCardIndexes(List<RelateCard> relateCards, BizType bizType) {
        boolean removeRelatePromote = Settings.REMOVE_RELATE_PROMOTE.getBoolean();
        boolean removeRelateOnlyAv = Settings.REMOVE_RELATE_ONLY_AV.getBoolean();
        boolean applyToVideo = Settings.HOME_FILTER_APPLY_TO_VIDEO.getBoolean();
        long playCountLimit = Settings.LOW_PLAY_COUNT_LIMIT.getLong();
        var shortDurationLimit = Settings.SHORT_DURATION_LIMIT.getInt();
        int longDurationLimit = Settings.LONG_DURATION_LIMIT.getInt();
        Set<String> titleSet = Settings.HOME_RCMD_FILTER_TITLE.getStringSet();
        boolean titleRegexMode = Settings.HOME_RCMD_FILTER_TITLE_REGEX_MODE.getBoolean();
        List<Pattern> titleRegexes;
        if (titleRegexMode && cachedTitileSet.equals(titleSet))
            titleRegexes = cachedTitleRegexes;
        else if (titleRegexMode) {
            cachedTitileSet = new HashSet<>(titleSet);
            titleRegexes = titleSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedTitleRegexes = titleRegexes;
        } else {
            titleRegexes = Collections.emptyList();
        }
        Set<String> reasonSet = Settings.HOME_RCMD_FILTER_REASON.getStringSet();
        boolean reasonRegexMode = Settings.HOME_RCMD_FILTER_REASON_REGEX_MODE.getBoolean();
        List<Pattern> reasonRegexes;
        if (reasonRegexMode && cachedReasonSet.equals(reasonSet))
            reasonRegexes = cachedReasonRegexes;
        else if (reasonRegexMode) {
            cachedReasonSet = new HashSet<>(reasonSet);
            reasonRegexes = reasonSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedReasonRegexes = reasonRegexes;
        } else {
            reasonRegexes = Collections.emptyList();
        }
        Set<String> upSet = Settings.HOME_RCMD_FILTER_UP.getStringSet();
        boolean upRegexMode = Settings.HOME_RCMD_FILTER_UP_REGEX_MODE.getBoolean();
        List<Pattern> upRegexes;
        if (upRegexMode && cachedUpSet.equals(upSet))
            upRegexes = cachedUpRegexes;
        else if (upRegexMode) {
            cachedUpSet = new HashSet<>(upSet);
            upRegexes = upSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedUpRegexes = upRegexes;
        } else {
            upRegexes = Collections.emptyList();
        }
        Set<String> uidSet = Settings.HOME_RCMD_FILTER_UID.getStringSet();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < relateCards.size(); i++) {
            RelateCard relate = relateCards.get(i);
            if (isPromoteRelateUnite(relate, removeRelatePromote)
                    || isNotAvRelateUnite(relate, removeRelatePromote, removeRelateOnlyAv, bizType)
                    || (applyToVideo && (isLowPlayCountRelateUnite(relate, playCountLimit)
                    || isDurationInvalidRelateUnite(relate, shortDurationLimit, longDurationLimit)
                    || isContainsBlockKwdRelateUnite(relate, titleRegexMode, titleSet, titleRegexes, reasonRegexMode, reasonSet, reasonRegexes, upRegexMode, upSet, upRegexes, uidArray))))
                idxList.add(i);
        }
        return idxList;
    }

    public static boolean onFeedClick(DislikeReason reason) {
        if (reason == null || !ArrayUtils.contains(blockReasonIds, reason.id))
            return false;
        long id = reason.id;
        String name = reason.name;
        if (TextUtils.isEmpty(name))
            return false;
        String value = name.split(":", 2)[1];
        String validValue;
        if (id == REASON_ID_TITLE) {
            validValue = Settings.HOME_RCMD_FILTER_TITLE_REGEX_MODE.getBoolean()
                    ? Pattern.quote(value) : value;
            Settings.HOME_RCMD_FILTER_TITLE.appendValue(validValue);
        } else if (id == REASON_ID_RCMD_REASON) {
            validValue = Settings.HOME_RCMD_FILTER_REASON_REGEX_MODE.getBoolean()
                    ? Pattern.quote(value) : value;
            Settings.HOME_RCMD_FILTER_REASON.appendValue(validValue);
        } else if (id == REASON_ID_UP_ID) {
            Settings.HOME_RCMD_FILTER_UID.appendValue(value);
        } else if (id == REASON_ID_UP_NAME) {
            validValue = Settings.HOME_RCMD_FILTER_UP_REGEX_MODE.getBoolean()
                    ? Pattern.quote(value) : value;
            Settings.HOME_RCMD_FILTER_UP.appendValue(validValue);
        } else if (id == REASON_ID_CATEGORY_NAME) {
            Settings.HOME_RCMD_FILTER_CATEGORY.appendValue(value);
        } else if (id == REASON_ID_CHANNEL_NAME) {
            Settings.HOME_RCMD_FILTER_CHANNEL.appendValue(value);
        }
        // 添加成功
        Toasts.showShortWithId("biliroaming_add_success");
        return true;
    }
}
