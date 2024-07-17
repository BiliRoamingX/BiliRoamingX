package app.revanced.bilibili.patches.json;

import android.text.TextUtils;

import androidx.annotation.Keep;

import com.bapis.bilibili.app.card.v1.Card;
import com.bapis.bilibili.app.card.v1.SmallCoverV5;
import com.bapis.bilibili.app.distribution.setting.pegasus.PegasusDeviceWithoutFplocalConfig;
import com.bapis.bilibili.app.show.popular.v1.PopularReply;
import com.bapis.bilibili.app.view.v1.Relate;
import com.bapis.bilibili.app.view.v1.RelatesFeedReply;
import com.bapis.bilibili.app.view.v1.ViewReply;
import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bapis.bilibili.app.viewunite.common.RelateCardType;
import com.bapis.bilibili.app.viewunite.common.Relates;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.Args;
import com.bilibili.pegasus.api.modelv2.BannerItemV2;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import app.revanced.bilibili.meta.pegasus.BannersItem;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.ArrayUtils;
import app.revanced.bilibili.utils.Jsons;
import app.revanced.bilibili.utils.KtUtils;
import app.revanced.bilibili.utils.Toasts;
import app.revanced.bilibili.utils.Utils;
import app.revanced.bilibili.utils.Versions;
import kotlin.Unit;

public class PegasusPatch {

    private static Set<String> cachedTitileSet = Collections.emptySet();
    private static List<Pattern> cachedTitleRegexes = Collections.emptyList();
    private static Set<String> cachedReasonSet = Collections.emptySet();
    private static List<Pattern> cachedReasonRegexes = Collections.emptyList();
    private static Set<String> cachedUpSet = Collections.emptySet();
    private static List<Pattern> cachedUpRegexes = Collections.emptyList();

    private static final Pattern playCountRegex = Pattern.compile(".*?([\\d.]+)([万亿])?观看.*");
    private static final Pattern durationRegex = Pattern.compile("^((\\d{1,2}):)?(\\d{1,2}):(\\d{1,2})$");

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
            Map.entry("course", List.of("ketang")),
            Map.entry("comic", List.of("comic")),
            Map.entry("cannot_play", List.of("cannot_play")),
            Map.entry("large_cover", List.of("large_cover")),
            Map.entry("middle_cover", List.of("middle_cover")),
            Map.entry("small_cover", List.of("small_cover"))
    );

    private static List<String> getFilterTypes() {
        var filterSet = Settings.FilterHomeRecommend.get();
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

    private static long toPlayCount2(String str) {
        var matcher = playCountRegex.matcher(str);
        if (matcher.matches()) {
            var value = Double.parseDouble(Objects.requireNonNull(matcher.group(1)));
            var unit = matcher.group(2);
            return (long) value * ("万".equals(unit) ? 10_000 : ("亿".equals(unit) ? 100_000_000 : 1));
        }
        return -1L;
    }

    private static int toDuration(String str) {
        var matcher = durationRegex.matcher(str);
        if (matcher.matches()) {
            String hour = matcher.group(2);
            String minute = matcher.group(3);
            String second = matcher.group(4);
            var h = hour != null ? Integer.parseInt(hour) : 0;
            var m = minute != null ? Integer.parseInt(minute) : 0;
            var s = second != null ? Integer.parseInt(second) : 0;
            return h * 60 * 60 + m * 60 + s;
        }
        return -1;
    }

    private static String getCoverLeftText(BasicIndexItem item) {
        String coverLeftText = null;
        if (item instanceof SmallCoverItem coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof SmallCoverV2Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof SmallCoverV9Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof SmallCoverV10Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof LargeCoverV1Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof LargeCoverV7Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof LargeCoverV8Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof LargeCoverV9Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof LargeCoverSingleV7Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof LargeCoverSingleV8Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
        } else if (item instanceof LargeCoverSingleV9Item coverItem) {
            coverLeftText = coverItem.coverLeftText1;
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

    private static boolean isLowPlayCountVideo(JSONObject item, long playCountLimit) {
        if (playCountLimit == 0L) return false;
        var coverLeftText = item.optString("cover_left_text_1");
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

    private static boolean isDurationInvalidVideo(JSONObject item, int shortDuration, int longDuration) {
        if (shortDuration == 0 && longDuration == 0)
            return false;
        JSONObject playerArgs = item.optJSONObject("player_args");
        long duration = playerArgs != null ? playerArgs.optLong("duration") : 0;
        if (longDuration != 0 && duration > longDuration) return true;
        return shortDuration != 0 && duration < shortDuration;
    }

    private static boolean isContainsBlockKwdVideo(
            BasicIndexItem item,
            boolean titleRegexMode,
            Set<? extends String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<? extends String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<? extends String> upSet,
            List<Pattern> upRegexes,
            long[] uidArray,
            Set<? extends String> categorySet,
            Set<? extends String> channelSet
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

    private static boolean isContainsBlockKwdVideo(
            JSONObject item,
            boolean titleRegexMode,
            Set<? extends String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<? extends String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<? extends String> upSet,
            List<Pattern> upRegexes,
            long[] uidArray,
            Set<? extends String> categorySet,
            Set<? extends String> channelSet
    ) {
        if (!titleSet.isEmpty()) {
            String title = item.optString("title");
            if (titleRegexMode && !TextUtils.isEmpty(title)) {
                for (int i = 0; i < titleRegexes.size(); i++)
                    if (titleRegexes.get(i).matcher(title).find())
                        return true;
            } else if (!TextUtils.isEmpty(title))
                for (String s : titleSet)
                    if (title.contains(s))
                        return true;
        }

        var args = item.optJSONObject("args");
        if (uidArray.length > 0) {
            long upId = args != null ? args.optLong("up_id") : 0L;
            if (upId != 0L && ArrayUtils.contains(uidArray, upId))
                return true;
        }

        if (!upSet.isEmpty()) {
            String upName = args != null ? args.optString("up_name") : null;
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
            String category = args != null ? args.optString("rname") : null;
            if (!TextUtils.isEmpty(category))
                for (String s : categorySet)
                    if (category.contains(s))
                        return true;
        }

        if (!channelSet.isEmpty()) {
            String channel = args != null ? args.optString("tname") : null;
            if (!TextUtils.isEmpty(channel))
                for (String s : channelSet)
                    if (channel.contains(s))
                        return true;
        }

        if (!reasonSet.isEmpty()) {
            String reason = item.optString("rcmd_reason");
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

    private static boolean isNotAvRelate(Relate relate, boolean removeRelateOnlyAv) {
        return removeRelateOnlyAv && !"av".equals(relate.getGoto());
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
            Set<? extends String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<? extends String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<? extends String> upSet,
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

    private static boolean isNotAvRelateUnite(RelateCard relate, boolean removeRelateOnlyAv, BizType bizType) {
        RelateCardType cardType = relate.getRelateCardType();
        return removeRelateOnlyAv && (bizType == BizType.BIZ_TYPE_UGC && cardType != RelateCardType.AV);
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
            Set<? extends String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<? extends String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<? extends String> upSet,
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
        if (!(item instanceof BannersItem bannersItem)) return;
        List<BannerItemV2> banners = bannersItem.getBanners();
        if (banners == null || banners.isEmpty()) return;
        banners.removeIf(banner -> "ad".equals(banner.type));
    }

    private static String getRcmdReason(BasicIndexItem item) {
        Tag reason = null;
        if (item instanceof SmallCoverItem coverItem) {
            reason = coverItem.rcmdReason;
        } else if (item instanceof SmallCoverV10Item coverItem) {
            reason = coverItem.rcmdReason;
        } else if (item instanceof SmallCoverV2Item coverItem) {
            try {
                if (coverItem.rcmdReasonV2 != null) {
                    reason = coverItem.rcmdReasonV2;
                } else {
                    reason = coverItem.rcmdReason;
                }
            } catch (NoSuchFieldError ignored) {
                reason = coverItem.rcmdReason;
            }
        } else if (item instanceof SmallCoverV9Item coverItem) {
            reason = coverItem.rcmdReason;
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
        if (item instanceof SmallCoverItem coverItem) {
            desc = coverItem.desc;
        } else if (item instanceof SmallCoverV2Item coverItem) {
            desc = coverItem.desc;
        } else if (item instanceof SmallCoverV9Item coverItem) {
            desc = coverItem.desc;
        } else if (item instanceof LargeCoverV1Item coverItem) {
            desc = coverItem.desc;
        } else if (item instanceof LargeCoverSingleV7Item coverItem) {
            desc = coverItem.desc;
        } else if (item instanceof LargeCoverSingleV8Item coverItem) {
            desc = coverItem.desc;
        } else if (item instanceof LargeCoverSingleV9Item coverItem) {
            desc = coverItem.desc;
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

    /**
     * @noinspection SameReturnValue
     */
    private static Unit appendReasons(JSONObject item) {
        String title = item.optString("title");
        String rcmdReason = item.optString("rcmd_reason");
        JSONObject args = item.optJSONObject("args");
        long upId = args != null ? args.optLong("up_id") : 0L;
        String upName = args != null ? args.optString("up_name") : null;
        String categoryName = args != null ? args.optString("rname") : null;
        String channelName = args != null ? args.optString("tname") : null;
        var reasons = new JSONArray();
        if (!TextUtils.isEmpty(title)) {
            var reason = new JSONObject();
            Jsons.putX(reason, "id", REASON_ID_TITLE);
            Jsons.putX(reason, "name", "标题:" + title);
            reasons.put(reason);
        }
        if (!TextUtils.isEmpty(rcmdReason)) {
            var reason = new JSONObject();
            Jsons.putX(reason, "id", REASON_ID_RCMD_REASON);
            Jsons.putX(reason, "name", "推荐原因:" + rcmdReason);
            reasons.put(reason);
        }
        if (upId != 0L) {
            var reason = new JSONObject();
            Jsons.putX(reason, "id", REASON_ID_UP_ID);
            Jsons.putX(reason, "name", "UID:" + upId);
            reasons.put(reason);
        }
        if (!TextUtils.isEmpty(upName)) {
            var reason = new JSONObject();
            Jsons.putX(reason, "id", REASON_ID_UP_NAME);
            Jsons.putX(reason, "name", "UP主:" + upName);
            reasons.put(reason);
        }
        if (!TextUtils.isEmpty(categoryName)) {
            var reason = new JSONObject();
            Jsons.putX(reason, "id", REASON_ID_CATEGORY_NAME);
            Jsons.putX(reason, "name", "分区:" + categoryName);
            reasons.put(reason);
        }
        if (!TextUtils.isEmpty(channelName)) {
            var reason = new JSONObject();
            Jsons.putX(reason, "id", REASON_ID_CHANNEL_NAME);
            Jsons.putX(reason, "name", "频道:" + channelName);
            reasons.put(reason);
        }
        if (reasons.length() > 0) {
            var threePoint = item.optJSONArray("three_point_v2");
            if (threePoint == null) return Unit.INSTANCE;
            var threePointItem = new JSONObject();
            Jsons.putX(threePointItem, "title", "漫游屏蔽");
            Jsons.putX(threePointItem, "subtitle", "(本地屏蔽，刷新生效，可前往自定义首页查看)");
            Jsons.putX(threePointItem, "type", "dislike");
            Jsons.putX(threePointItem, "reasons", reasons);
            threePoint.put(threePointItem);
        }
        return Unit.INSTANCE;
    }

    private static boolean shouldDisableAutoRefresh() {
        if (Settings.HomeDisableAutoRefresh.get())
            return true;
        if (!Versions.ge7_76_0())
            return false;
        var setting = KtUtils.getDeviceSetting(PegasusDeviceWithoutFplocalConfig.class);
        if (setting != null) {
            long value = setting.getAutoRefreshState().getValue();
            return value == 2L || value == 4L;
        }
        return false;
    }

    private static void disableAutoRefresh(Config config) {
        if (config == null || !shouldDisableAutoRefresh())
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

    // Only called when ab test `ff_key_use_new_pegasus` not hit
    @Keep
    public static void pegasusHook(GeneralResponse<PegasusFeedResponse> response) {
        var data = response.data;
        if (data == null) return;
        disableAutoRefresh(data.config);
        var items = data.items;
        if (items == null || items.isEmpty()) return;
        long playCountLimit = Settings.LowPlayCountLimit.get();
        var shortDurationLimit = Settings.ShortDurationLimit.get();
        int longDurationLimit = Settings.LongDurationLimit.get();
        Set<? extends String> titleSet = Settings.HomeRcmdFilterTitle.get();
        boolean titleRegexMode = Settings.HomeRcmdFilterTitleRegexMode.get();
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
        Set<? extends String> reasonSet = Settings.HomeRcmdFilterReason.get();
        boolean reasonRegexMode = Settings.HomeRcmdFilterReasonRegexMode.get();
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
        Set<? extends String> upSet = Settings.HomeRcmdFilterUp.get();
        boolean upRegexMode = Settings.HomeRcmdFilterUpRegexMode.get();
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
        Set<? extends String> uidSet = Settings.HomeRcmdFilterUid.get();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        Set<? extends String> categorySet = Settings.HomeRcmdFilterCategory.get();
        Set<? extends String> channelSet = Settings.HomeRcmdFilterChannel.get();
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
                } else if ("av".equals(cardGoto) && "cannot_play".equals(type)
                        && (item instanceof BasePlayerItem playerItem) && playerItem.canPlay != 1) {
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

    public static void pegasusHook(JSONObject data) throws JSONException {
        JSONObject config = data.optJSONObject("config");
        if (config != null && shouldDisableAutoRefresh()) {
            config.put("auto_refresh_time", 0);
            config.put("auto_refresh_time_by_appear", -1L);
            config.put("auto_refresh_time_by_active", -1L);
            config.put("auto_refresh_time_by_behavior", -1);
            config.put("auto_refresh_by_behavior", -1);
        }
        JSONArray items = data.optJSONArray("items");
        if (items == null || items.length() == 0) return;
        long playCountLimit = Settings.LowPlayCountLimit.get();
        var shortDurationLimit = Settings.ShortDurationLimit.get();
        int longDurationLimit = Settings.LongDurationLimit.get();
        Set<? extends String> titleSet = Settings.HomeRcmdFilterTitle.get();
        boolean titleRegexMode = Settings.HomeRcmdFilterTitleRegexMode.get();
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
        Set<? extends String> reasonSet = Settings.HomeRcmdFilterReason.get();
        boolean reasonRegexMode = Settings.HomeRcmdFilterReasonRegexMode.get();
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
        Set<? extends String> upSet = Settings.HomeRcmdFilterUp.get();
        boolean upRegexMode = Settings.HomeRcmdFilterUpRegexMode.get();
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
        Set<? extends String> uidSet = Settings.HomeRcmdFilterUid.get();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        Set<? extends String> categorySet = Settings.HomeRcmdFilterCategory.get();
        Set<? extends String> channelSet = Settings.HomeRcmdFilterChannel.get();
        Jsons.removeIf(items, (item) -> {
            var cardType = item.optString("card_type");
            var cardGoto = item.optString("card_goto");
            var goTo = item.optString("goto");
            var filterTypes = getFilterTypes();
            if ("banner".equals(cardGoto) && filterTypes.contains("ad")) {
                JSONArray bannerItems = item.optJSONArray("banner_item");
                if (bannerItems != null && bannerItems.length() > 0)
                    Jsons.removeIf(bannerItems, (b) -> "ad".equals(b.optString("type")));
            }
            var typeMatched = false;
            for (var i = 0; i < filterTypes.size(); i++) {
                String type = filterTypes.get(i);
                if ((!TextUtils.isEmpty(cardGoto) && cardGoto.contains(type))
                        || (!TextUtils.isEmpty(cardType) && cardType.contains(type))
                        || (!TextUtils.isEmpty(goTo) && goTo.contains(type))) {
                    typeMatched = true;
                    break;
                } else if ("av".equals(cardGoto) && "cannot_play".equals(type) && item.optInt("can_play") != 1) {
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
        Jsons.forEach(items, PegasusPatch::appendReasons);
    }

    public static void filterViewRelates(ViewReply viewReply) {
        if (Settings.RemoveRelateNothing.get()) {
            viewReply.clearRelates();
            viewReply.clearPagination();
            return;
        }
        List<Integer> indexes = getToRemoveRelateIndexes(viewReply.getRelatesList());
        for (int i = indexes.size() - 1; i >= 0; i--)
            viewReply.removeRelates(indexes.get(i));
    }

    public static void filterViewUniteRelates(Module module, BizType bizType) {
        if (Settings.RemoveRelateNothing.get()) {
            module.clearRelates();
            return;
        }
        Relates relates = module.getRelates();
        List<Integer> indexes = getToRemoveRelateCardIndexes(relates.getCardsList(), bizType);
        for (int i = indexes.size() - 1; i >= 0; i--)
            relates.removeCards(indexes.get(i));
    }

    public static void filterRelatesFeed(RelatesFeedReply feedReply) {
        List<Integer> indexes = getToRemoveRelateIndexes(feedReply.getListList());
        for (int i = indexes.size() - 1; i >= 0; i--)
            feedReply.removeList(indexes.get(i));
    }

    public static void filterRelatesFeedUnite(com.bapis.bilibili.app.viewunite.v1.RelatesFeedReply feedReply) {
        List<Integer> indexes = getToRemoveRelateCardIndexes(feedReply.getRelatesList(), null);
        for (int i = indexes.size() - 1; i >= 0; i--)
            feedReply.removeRelates(indexes.get(i));
    }

    public static void filterPopular(PopularReply reply) {
        List<Integer> indexes = getToRemovePopularIndexes(reply.getItemsList());
        for (int i = indexes.size() - 1; i >= 0; i--)
            reply.removeItems(indexes.get(i));
    }

    public static List<Integer> getToRemoveRelateIndexes(List<Relate> relates) {
        boolean removeRelatePromote = Settings.RemoveRelatePromote.get();
        boolean removeRelateOnlyAv = Settings.RemoveRelateOnlyAv.get();
        boolean applyToVideo = Settings.HomeFilterApplyToVideo.get();
        long playCountLimit = Settings.LowPlayCountLimit.get();
        int shortDurationLimit = Settings.ShortDurationLimit.get();
        int longDurationLimit = Settings.LongDurationLimit.get();
        Set<? extends String> titleSet = Settings.HomeRcmdFilterTitle.get();
        boolean titleRegexMode = Settings.HomeRcmdFilterTitleRegexMode.get();
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
        Set<? extends String> reasonSet = Settings.HomeRcmdFilterReason.get();
        boolean reasonRegexMode = Settings.HomeRcmdFilterReasonRegexMode.get();
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
        Set<? extends String> upSet = Settings.HomeRcmdFilterUp.get();
        boolean upRegexMode = Settings.HomeRcmdFilterUpRegexMode.get();
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
        Set<? extends String> uidSet = Settings.HomeRcmdFilterUid.get();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < relates.size(); i++) {
            Relate relate = relates.get(i);
            if (isPromoteRelate(relate, removeRelatePromote)
                    || isNotAvRelate(relate, removeRelateOnlyAv)
                    || (applyToVideo && (isLowPlayCountRelate(relate, playCountLimit)
                    || isDurationInvalidRelate(relate, shortDurationLimit, longDurationLimit)
                    || isContainsBlockKwdRelate(relate, titleRegexMode, titleSet, titleRegexes, reasonRegexMode, reasonSet, reasonRegexes, upRegexMode, upSet, upRegexes, uidArray))))
                idxList.add(i);
        }
        return idxList;
    }

    public static List<Integer> getToRemoveRelateCardIndexes(List<RelateCard> relateCards, BizType bizType) {
        boolean removeRelatePromote = Settings.RemoveRelatePromote.get();
        boolean removeRelateOnlyAv = Settings.RemoveRelateOnlyAv.get();
        boolean applyToVideo = Settings.HomeFilterApplyToVideo.get();
        long playCountLimit = Settings.LowPlayCountLimit.get();
        int shortDurationLimit = Settings.ShortDurationLimit.get();
        int longDurationLimit = Settings.LongDurationLimit.get();
        Set<? extends String> titleSet = Settings.HomeRcmdFilterTitle.get();
        boolean titleRegexMode = Settings.HomeRcmdFilterTitleRegexMode.get();
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
        Set<? extends String> reasonSet = Settings.HomeRcmdFilterReason.get();
        boolean reasonRegexMode = Settings.HomeRcmdFilterReasonRegexMode.get();
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
        Set<? extends String> upSet = Settings.HomeRcmdFilterUp.get();
        boolean upRegexMode = Settings.HomeRcmdFilterUpRegexMode.get();
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
        Set<? extends String> uidSet = Settings.HomeRcmdFilterUid.get();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < relateCards.size(); i++) {
            RelateCard relate = relateCards.get(i);
            if (isPromoteRelateUnite(relate, removeRelatePromote)
                    || isNotAvRelateUnite(relate, removeRelateOnlyAv, bizType)
                    || (applyToVideo && (isLowPlayCountRelateUnite(relate, playCountLimit)
                    || isDurationInvalidRelateUnite(relate, shortDurationLimit, longDurationLimit)
                    || isContainsBlockKwdRelateUnite(relate, titleRegexMode, titleSet, titleRegexes, reasonRegexMode, reasonSet, reasonRegexes, upRegexMode, upSet, upRegexes, uidArray))))
                idxList.add(i);
        }
        return idxList;
    }

    public static List<Integer> getToRemovePopularIndexes(List<Card> cards) {
        boolean blockTopEntrance = Settings.BlockPopularTopEntrance.get();
        boolean blockTopicList = Settings.BlockPopularTopicList.get();
        boolean blockRcmdUp = Settings.BlockPopularRcmdUp.get();
        boolean blockLive = Settings.BlockPopularLive.get();
        boolean filterApplyToPopular = Settings.HomeFilterApplyToPopular.get();
        long playCountLimit = Settings.LowPlayCountLimit.get();
        int shortDurationLimit = Settings.ShortDurationLimit.get();
        int longDurationLimit = Settings.LongDurationLimit.get();
        Set<? extends String> titleSet = Settings.HomeRcmdFilterTitle.get();
        boolean titleRegexMode = Settings.HomeRcmdFilterTitleRegexMode.get();
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
        Set<? extends String> reasonSet = Settings.HomeRcmdFilterReason.get();
        boolean reasonRegexMode = Settings.HomeRcmdFilterReasonRegexMode.get();
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
        Set<? extends String> upSet = Settings.HomeRcmdFilterUp.get();
        boolean upRegexMode = Settings.HomeRcmdFilterUpRegexMode.get();
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
        Set<? extends String> uidSet = Settings.HomeRcmdFilterUid.get();
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            if (blockTopEntrance && card.hasPopularTopEntrance()) {
                idxList.add(i);
                continue;
            }
            if (blockTopicList) {
                var hasTopicList = false;
                try {
                    hasTopicList = card.hasTopicList();
                } catch (Throwable ignored) {
                }
                if (hasTopicList) {
                    idxList.add(i);
                    continue;
                }
            }
            if (blockRcmdUp && card.hasRcmdOneItem() && card.getRcmdOneItem().getBase().getCardGoto().startsWith("up_rcmd")) {
                idxList.add(i);
                continue;
            }
            if (blockLive && card.hasSmallCoverV5() && card.getSmallCoverV5().getBase().getCardGoto().startsWith("live")) {
                idxList.add(i);
                continue;
            }
            if (!filterApplyToPopular) continue;
            if (card.hasSmallCoverV5()) {
                SmallCoverV5 cover = card.getSmallCoverV5();
                if (isLowPlayCountPopular(cover, playCountLimit)
                        || isDurationInvalidPopular(cover, shortDurationLimit, longDurationLimit)
                        || isContainsBlockKwdPopular(cover, titleRegexMode, titleSet, titleRegexes, reasonRegexMode, reasonSet, reasonRegexes, upRegexMode, upSet, upRegexes, uidArray))
                    idxList.add(i);
            }
        }
        return idxList;
    }

    public static boolean isLowPlayCountPopular(SmallCoverV5 cover, long playCountLimit) {
        if (playCountLimit == 0) return false;
        String rightDesc2 = cover.getRightDesc2();
        if (TextUtils.isEmpty(rightDesc2)) return false;
        long playCount = toPlayCount2(rightDesc2);
        if (playCount == -1L) return false;
        return playCount < playCountLimit;
    }

    public static boolean isDurationInvalidPopular(SmallCoverV5 cover, long shortDuration, long longDuration) {
        if (shortDuration == 0 && longDuration == 0)
            return false;
        String coverRightText1 = cover.getCoverRightText1();
        int duration = toDuration(coverRightText1);
        if (duration == -1L) return false;
        if (longDuration != 0 && duration > longDuration) return true;
        return shortDuration != 0 && duration < shortDuration;
    }

    public static boolean isContainsBlockKwdPopular(
            SmallCoverV5 cover,
            boolean titleRegexMode,
            Set<? extends String> titleSet,
            List<Pattern> titleRegexes,
            boolean reasonRegexMode,
            Set<? extends String> reasonSet,
            List<Pattern> reasonRegexes,
            boolean upRegexMode,
            Set<? extends String> upSet,
            List<Pattern> upRegexes,
            long[] uidArray) {
        if (!titleSet.isEmpty()) {
            String title = cover.getBase().getTitle();
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
            long upId = cover.getBase().getThreePointV4().getSharePlane().getAuthorId();
            if (upId != 0L && ArrayUtils.contains(uidArray, upId))
                return true;
        }

        if (!upSet.isEmpty()) {
            String upName = cover.getBase().getThreePointV4().getSharePlane().getAuthor();
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
            String reason = cover.getRcmdReasonStyle().getText();
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

    @Keep
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
            validValue = Settings.HomeRcmdFilterTitleRegexMode.get()
                    ? Pattern.quote(value) : value;
            Settings.HomeRcmdFilterTitle.append(validValue);
        } else if (id == REASON_ID_RCMD_REASON) {
            validValue = Settings.HomeRcmdFilterReasonRegexMode.get()
                    ? Pattern.quote(value) : value;
            Settings.HomeRcmdFilterReason.append(validValue);
        } else if (id == REASON_ID_UP_ID) {
            Settings.HomeRcmdFilterUid.append(value);
        } else if (id == REASON_ID_UP_NAME) {
            validValue = Settings.HomeRcmdFilterUpRegexMode.get()
                    ? Pattern.quote(value) : value;
            Settings.HomeRcmdFilterUp.append(validValue);
        } else if (id == REASON_ID_CATEGORY_NAME) {
            Settings.HomeRcmdFilterCategory.append(value);
        } else if (id == REASON_ID_CHANNEL_NAME) {
            Settings.HomeRcmdFilterChannel.append(value);
        }
        // 添加成功
        Toasts.showShortWithId("biliroaming_add_success");
        return true;
    }
}
