package app.revanced.bilibili.patches.protobuf;

import android.text.TextUtils;
import android.util.Pair;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bapis.bilibili.app.dynamic.v1.DynRedReply;
import com.bapis.bilibili.app.dynamic.v1.DynRedReplyEx;
import com.bapis.bilibili.app.dynamic.v2.CardVideoDynList;
import com.bapis.bilibili.app.dynamic.v2.CardVideoDynListEx;
import com.bapis.bilibili.app.dynamic.v2.Description;
import com.bapis.bilibili.app.dynamic.v2.DynAllReply;
import com.bapis.bilibili.app.dynamic.v2.DynAllReplyEx;
import com.bapis.bilibili.app.dynamic.v2.DynTab;
import com.bapis.bilibili.app.dynamic.v2.DynTabReply;
import com.bapis.bilibili.app.dynamic.v2.DynTabReplyEx;
import com.bapis.bilibili.app.dynamic.v2.DynVideoReply;
import com.bapis.bilibili.app.dynamic.v2.DynVideoReplyEx;
import com.bapis.bilibili.app.dynamic.v2.DynamicItem;
import com.bapis.bilibili.app.dynamic.v2.DynamicList;
import com.bapis.bilibili.app.dynamic.v2.DynamicListEx;
import com.bapis.bilibili.app.dynamic.v2.Extend;
import com.bapis.bilibili.app.dynamic.v2.Module;
import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReq;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.app.playurl.v1.ConfValue;
import com.bapis.bilibili.app.playurl.v1.ConfValueEx;
import com.bapis.bilibili.app.playurl.v1.PlayAbilityConf;
import com.bapis.bilibili.app.playurl.v1.PlayConfEditReq;
import com.bapis.bilibili.app.playurl.v1.PlayConfReply;
import com.bapis.bilibili.app.playurl.v1.PlayConfReq;
import com.bapis.bilibili.app.playurl.v1.PlayViewReply;
import com.bapis.bilibili.app.view.v1.TFInfoReq;
import com.bapis.bilibili.app.view.v1.VideoGuide;
import com.bapis.bilibili.app.view.v1.ViewProgressReply;
import com.bapis.bilibili.app.view.v1.ViewReply;
import com.bapis.bilibili.app.viewunite.v1.VideoGuideEx;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.DmViewReplyEx;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UnknownFieldSetLite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import app.revanced.bilibili.api.MossResponseHandlerProxy;
import app.revanced.bilibili.meta.HookFlags;
import app.revanced.bilibili.patches.AutoLikePatch;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.ArrayUtils;

@SuppressWarnings("unused")
public class MossPatch {
    /**
     * @return {@link HookFlags#STOP_EXECUTION} to stop method execution and return null,
     * or null to not intercept method execution,
     * or custom response
     */
    @Nullable
    public static <ReqT extends GeneratedMessageLite<?, ?>>
    Object hookBlockingBefore(@NonNull ReqT req) {
        if (req instanceof DefaultWordsReq) {
            if (Settings.PURIFY_SEARCH.getBoolean())
                return HookFlags.STOP_EXECUTION;
        } else if (req instanceof TFInfoReq) {
            if (Settings.REMOVE_CMD_DMS.getBoolean())
                return HookFlags.STOP_EXECUTION;
        } else if (req instanceof PlayConfEditReq) {
            if (Settings.REMEMBER_LOSSLESS_SETTING.getBoolean()) {
                ((PlayConfEditReq) req).getPlayConfList().stream()
                        .filter(e -> e.getConfTypeValue() == 30/*LOSSLESS*/).findFirst()
                        .ifPresent(e -> Settings.LOSSLESS_ENABLED.saveValue(e.getConfValue().getSwitchVal()));
            }
        }
        return null;
    }

    /**
     * @return null or {@code reply}, or custom response
     */
    @Nullable
    public static <ReqT extends GeneratedMessageLite<?, ?>, RespT extends GeneratedMessageLite<?, ?>>
    RespT hookBlockingAfter(@NonNull ReqT req, @Nullable RespT reply) {
        if (reply instanceof com.bapis.bilibili.app.view.v1.ViewProgressReply) {
            if (Settings.REMOVE_CMD_DMS.getBoolean())
                com.bapis.bilibili.app.view.v1.ViewProgressReplyEx.setVideoGuide((ViewProgressReply) reply, VideoGuide.newBuilder().build());
        } else if (reply instanceof com.bapis.bilibili.app.viewunite.v1.ViewProgressReply) {
            if (Settings.REMOVE_CMD_DMS.getBoolean()) {
                com.bapis.bilibili.app.viewunite.v1.VideoGuide videoGuide = ((com.bapis.bilibili.app.viewunite.v1.ViewProgressReply) reply).getVideoGuide();
                VideoGuideEx.clearContractCard(videoGuide);
            }
        } else if (reply instanceof DmViewReply) {
            if (Settings.REMOVE_CMD_DMS.getBoolean()) {
                DmViewReply dmViewReply = (DmViewReply) reply;
                DmViewReplyEx.clearActivityMeta(dmViewReply);
                try {
                    DmViewReplyEx.clearCommand(dmViewReply);
                } catch (Throwable ignored) {
                }
                dmViewReply.unknownFields = UnknownFieldSetLite.getDefaultInstance();
            }
        } else if (reply instanceof DynAllReply) {
            DynAllReply dynAllReply = (DynAllReply) reply;
            if (Settings.DYNAMIC_RM_TOPIC_OF_ALL.getBoolean())
                DynAllReplyEx.clearTopicList(dynAllReply);
            if (Settings.DYNAMIC_RM_UP_OF_ALL.getBoolean())
                DynAllReplyEx.clearUpList(dynAllReply);
            filterDynamicForAll(dynAllReply.getDynamicList());
        } else if (reply instanceof DynVideoReply) {
            DynVideoReply dynVideoReply = (DynVideoReply) reply;
            if (Settings.DYNAMIC_RM_UP_OF_VIDEO.getBoolean())
                DynVideoReplyEx.clearVideoUpList(dynVideoReply);
            if (Settings.DYNAMIC_FILTER_APPLY_TO_VIDEO.getBoolean())
                filterDynamicForVideo(dynVideoReply.getDynamicList());
        } else if (reply instanceof DynRedReply) {
            if (Settings.DYNAMIC_PREFER_VIDEO_TAB.getBoolean())
                DynRedReplyEx.setDefaultTab((DynRedReply) reply, "video");
        } else if (reply instanceof DynTabReply) {
            DynTabReply dynTabReply = (DynTabReply) reply;
            purifyDynTabs(dynTabReply);
        } else if (reply instanceof PlayViewReply) {
            if (Settings.REMEMBER_LOSSLESS_SETTING.getBoolean()) {
                PlayAbilityConf playConf = ((PlayViewReply) reply).getPlayConf();
                if (playConf.hasLossLessConf()) {
                    ConfValue confValue = playConf.getLossLessConf().getConfValue();
                    ConfValueEx.setSwitchVal(confValue, Settings.LOSSLESS_ENABLED.getBoolean());
                }
            }
        } else if (reply instanceof PlayViewUniteReply) {
            PlayViewUniteReply playReply = (PlayViewUniteReply) reply;
            if (Settings.REMEMBER_LOSSLESS_SETTING.getBoolean()) {
                playReply.getPlayDeviceConf().getDeviceConfsMap().forEach((key, deviceConf) -> {
                    if (key == 30/*LOSSLESS*/) {
                        com.bapis.bilibili.playershared.ConfValue confValue = deviceConf.getConfValue();
                        com.bapis.bilibili.playershared.ConfValueEx.setSwitchVal(confValue, Settings.LOSSLESS_ENABLED.getBoolean());
                    }
                });
            }
        } else if (reply instanceof ViewReply) {
            ViewReply viewReply = (ViewReply) reply;
            long aid = viewReply.getArc().getAid();
            int like = viewReply.getReqUser().getLike();
            AutoLikePatch.detail = Pair.create(aid, like);
        }
        return reply;
    }

    /**
     * @return {@link HookFlags#STOP_EXECUTION} to stop method execution and return void,
     * or null to not intercept method execution,
     * or {@code handler}, or a proxy handler like {@link MossResponseHandlerProxy}
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    @Nullable
    public static <ReqT extends GeneratedMessageLite<?, ?>, RespT extends GeneratedMessageLite<?, ?>>
    Object hookAsyncBefore(@NonNull ReqT req, @Nullable MossResponseHandler handler) {
        if (handler != null && req instanceof PlayConfReq) {
            if (Settings.REMEMBER_LOSSLESS_SETTING.getBoolean()) {
                return MossResponseHandlerProxy.<PlayConfReply>get(handler, v -> {
                    if (v != null) {
                        ConfValue confValue = v.getPlayConf().getLossLessConf().getConfValue();
                        ConfValueEx.setSwitchVal(confValue, Settings.LOSSLESS_ENABLED.getBoolean());
                    }
                    return v;
                });
            }
        }
        return null;
    }

    private static void purifyDynTabs(DynTabReply dynTabReply) {
        List<DynTab> dynTabList = dynTabReply.getDynTabList();
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < dynTabList.size(); i++) {
            DynTab dynTab = dynTabList.get(i);
            if (Settings.DYNAMIC_PURIFY_CITY.getBoolean() && dynTab.getCityId() != 0L)
                idxList.add(i);
            else if (Settings.DYNAMIC_PURIFY_CAMPUS.getBoolean() && dynTab.getAnchor().equals("campus"))
                idxList.add(i);
        }
        for (int i = idxList.size() - 1; i >= 0; i--)
            DynTabReplyEx.removeDynTab(dynTabReply, idxList.get(i));
    }

    private static void filterDynamicForAll(DynamicList list) {
        List<Integer> idxList = getToRemoveDynamicIdxList(list.getListList());
        for (int i = idxList.size() - 1; i >= 0; i--)
            DynamicListEx.removeList(list, idxList.get(i));
    }

    private static void filterDynamicForVideo(CardVideoDynList list) {
        List<Integer> idxList = getToRemoveDynamicIdxList(list.getListList());
        for (int i = idxList.size() - 1; i >= 0; i--)
            CardVideoDynListEx.removeList(list, idxList.get(i));
    }

    private static Set<String> cachedContentSet = Collections.emptySet();
    private static List<Pattern> cachedContentRegexes = Collections.emptyList();

    private static List<Integer> getToRemoveDynamicIdxList(List<DynamicItem> items) {
        Set<String> contentSet = Settings.DYNAMIC_PURIFY_CONTENT.getStringSet();
        boolean contentRegexMode = Settings.DYNAMIC_PURIFY_CONTENT_REGEX_MODE.getBoolean();
        List<Pattern> contentRegexes;
        if (contentRegexMode && cachedContentSet.equals(contentSet)) {
            contentRegexes = cachedContentRegexes;
        } else if (contentRegexMode) {
            cachedContentSet = new HashSet<>(contentSet);
            contentRegexes = contentSet.stream().map(Pattern::compile).collect(Collectors.toList());
            cachedContentRegexes = contentRegexes;
        } else {
            contentRegexes = Collections.emptyList();
        }
        Set<String> typeSet = Settings.DYNAMIC_PURIFY_TYPE.getStringSet();
        Set<String> ups = Settings.DYNAMIC_PURIFY_UP.getStringSet();
        Set<String> uidSet = Settings.DYNAMIC_PURIFY_UID.getStringSet();
        Set<String> topics = Settings.DYNAMIC_PURIFY_TOPIC.getStringSet();
        boolean rmBlocked = Settings.DYNAMIC_RM_BLOCKED.getBoolean();
        int[] typeArray = ArrayUtils.toIntArray(typeSet);
        long[] uidArray = ArrayUtils.toLongArray(uidSet);
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            DynamicItem item = items.get(i);
            int cardType = item.getCardTypeValue();
            if (typeArray.length > 0 && ArrayUtils.contains(typeArray, cardType)) {
                idxList.add(i);
                continue;
            }

            Extend extend = item.getExtend();
            if (rmBlocked && extend.hasOnlyFansProperty()
                    && !extend.getOnlyFansProperty().getHasPrivilege()) {
                idxList.add(i);
                continue;
            }

            if (!contentSet.isEmpty()) {
                String text = item.getModulesList().stream()
                        .filter(Module::hasModuleDesc).findFirst()
                        .map(module -> module.getModuleDesc().getText()).orElse(null);
                if (isContentShouldBlock(text, contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(i);
                    continue;
                }
                String orig = extend.getOrigDescList().stream()
                        .map(Description::getOrigText)
                        .collect(Collectors.joining());
                if (isContentShouldBlock(orig, contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(i);
                    continue;
                }
                String desc = extend.getDescList().stream()
                        .map(Description::getOrigText)
                        .collect(Collectors.joining());
                if (isContentShouldBlock(desc, contentRegexMode, contentSet, contentRegexes)) {
                    idxList.add(i);
                    continue;
                }
            }

            if (!topics.isEmpty()) {
                String topic = item.getModulesList().stream()
                        .filter(Module::hasModuleTopic).findFirst()
                        .map(module -> module.getModuleTopic().getName()).orElse(null);
                if (!TextUtils.isEmpty(topic) && topics.stream().anyMatch(topic::contains)) {
                    idxList.add(i);
                    continue;
                }
            }

            if (!ups.isEmpty()) {
                String origName = extend.getOrigName();
                if (!TextUtils.isEmpty(origName) && ups.stream().anyMatch(origName::equals)) {
                    idxList.add(i);
                    continue;
                }
            }

            if (uidArray.length > 0) {
                long uid = extend.getUid();
                if (uid > 0 && ArrayUtils.contains(uidArray, uid)) {
                    idxList.add(i);
                    continue;
                }
            }
        }

        return idxList;
    }

    private static boolean isContentShouldBlock(String text, boolean regexMode, Set<String> contents, List<Pattern> regexes) {
        if (regexMode && !TextUtils.isEmpty(text)) {
            return regexes.stream().anyMatch(r -> r.matcher(text).find());
        } else if (!TextUtils.isEmpty(text)) {
            return contents.stream().anyMatch(text::contains);
        }
        return false;
    }
}
