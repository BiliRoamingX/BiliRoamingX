package app.revanced.bilibili.patches.protobuf;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
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
import com.bapis.bilibili.app.dynamic.v2.DynTabReq;
import com.bapis.bilibili.app.dynamic.v2.DynVideoReply;
import com.bapis.bilibili.app.dynamic.v2.DynVideoReplyEx;
import com.bapis.bilibili.app.dynamic.v2.DynamicItem;
import com.bapis.bilibili.app.dynamic.v2.DynamicList;
import com.bapis.bilibili.app.dynamic.v2.DynamicListEx;
import com.bapis.bilibili.app.dynamic.v2.Extend;
import com.bapis.bilibili.app.dynamic.v2.Module;
import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReq;
import com.bapis.bilibili.app.listener.v1.BKArcPart;
import com.bapis.bilibili.app.listener.v1.DashItem;
import com.bapis.bilibili.app.listener.v1.DetailItem;
import com.bapis.bilibili.app.listener.v1.DetailItemEx;
import com.bapis.bilibili.app.listener.v1.FormatDescription;
import com.bapis.bilibili.app.listener.v1.PlayDASH;
import com.bapis.bilibili.app.listener.v1.PlayHistoryReq;
import com.bapis.bilibili.app.listener.v1.PlayHistoryResp;
import com.bapis.bilibili.app.listener.v1.PlayInfo;
import com.bapis.bilibili.app.listener.v1.PlayURLReq;
import com.bapis.bilibili.app.listener.v1.PlayURLResp;
import com.bapis.bilibili.app.listener.v1.PlaylistReq;
import com.bapis.bilibili.app.listener.v1.PlaylistResp;
import com.bapis.bilibili.app.listener.v1.RcmdPlaylistReq;
import com.bapis.bilibili.app.listener.v1.RcmdPlaylistResp;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReq;
import com.bapis.bilibili.app.playurl.v1.ArcConf;
import com.bapis.bilibili.app.playurl.v1.ArcConfEx;
import com.bapis.bilibili.app.playurl.v1.CodeType;
import com.bapis.bilibili.app.playurl.v1.ConfValue;
import com.bapis.bilibili.app.playurl.v1.ConfValueEx;
import com.bapis.bilibili.app.playurl.v1.PlayAbilityConf;
import com.bapis.bilibili.app.playurl.v1.PlayArcConf;
import com.bapis.bilibili.app.playurl.v1.PlayConfEditReq;
import com.bapis.bilibili.app.playurl.v1.PlayConfReply;
import com.bapis.bilibili.app.playurl.v1.PlayConfReq;
import com.bapis.bilibili.app.playurl.v1.PlayURLMoss;
import com.bapis.bilibili.app.playurl.v1.PlayViewReply;
import com.bapis.bilibili.app.playurl.v1.PlayViewReq;
import com.bapis.bilibili.app.view.v1.ConfigEx;
import com.bapis.bilibili.app.view.v1.LikeCustomEx;
import com.bapis.bilibili.app.view.v1.ReplyStyleEx;
import com.bapis.bilibili.app.view.v1.TFInfoReq;
import com.bapis.bilibili.app.view.v1.VideoGuide;
import com.bapis.bilibili.app.view.v1.ViewMoss;
import com.bapis.bilibili.app.view.v1.ViewProgressReply;
import com.bapis.bilibili.app.view.v1.ViewReply;
import com.bapis.bilibili.app.view.v1.ViewReq;
import com.bapis.bilibili.app.viewunite.v1.VideoGuideEx;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.DmViewReplyEx;
import com.bapis.bilibili.community.service.dm.v1.DmViewReq;
import com.bapis.bilibili.main.community.reply.v1.EmptyPage;
import com.bapis.bilibili.main.community.reply.v1.EmptyPageEx;
import com.bapis.bilibili.main.community.reply.v1.MainListReply;
import com.bapis.bilibili.main.community.reply.v1.MainListReq;
import com.bapis.bilibili.main.community.reply.v1.SubjectControl;
import com.bapis.bilibili.main.community.reply.v1.SubjectControlEx;
import com.bapis.bilibili.main.community.reply.v1.TextStyle;
import com.bapis.bilibili.playershared.PlayArcConfEx;
import com.bapis.bilibili.polymer.app.search.v1.SearchAllRequest;
import com.bapis.bilibili.polymer.app.search.v1.SearchAllResponse;
import com.bapis.bilibili.polymer.app.search.v1.SearchByTypeRequest;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.moss.api.NetworkException;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLiteEx;
import com.google.protobuf.UnknownFieldSetLite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import app.revanced.bilibili.api.MossResponseHandlerProxy;
import app.revanced.bilibili.meta.HookFlags;
import app.revanced.bilibili.patches.AutoLikePatch;
import app.revanced.bilibili.patches.VideoQualityPatch;
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.ArrayUtils;
import app.revanced.bilibili.utils.Constants;
import app.revanced.bilibili.utils.MossDebugPrinter;

@SuppressWarnings({"unused", "unchecked", "rawtypes"})
public class MossPatch {
    /**
     * @return {@link HookFlags#STOP_EXECUTION} to stop method execution and return null,
     * or null to not intercept method execution,
     * or custom response
     */
    @Nullable
    public static <ReqT extends GeneratedMessageLite<?, ?>>
    Object hookBlockingBefore(@NonNull GeneratedMessageLite<?, ?> req) {
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
        } else if (req instanceof com.bapis.bilibili.pgc.gateway.player.v1.PlayViewReq) {
            VideoQualityPatch.unlockLimit((com.bapis.bilibili.pgc.gateway.player.v1.PlayViewReq) req);
        } else if (req instanceof com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq) {
            com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq playViewReq = (com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq) req;
            VideoQualityPatch.unlockLimit((com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq) req);
            BangumiPlayUrlHook.hookPlayViewPGCBefore(playViewReq);
        } else if (req instanceof com.bapis.bilibili.app.playurl.v1.PlayViewReq) {
            VideoQualityPatch.unlockLimit((com.bapis.bilibili.app.playurl.v1.PlayViewReq) req);
        } else if (req instanceof PlayViewUniteReq) {
            PlayViewUniteReq playViewUniteReq = (PlayViewUniteReq) req;
            VideoQualityPatch.unlockLimit(playViewUniteReq);
            BangumiPlayUrlHook.hookPlayViewUniteBefore(playViewUniteReq);
        }
        return null;
    }

    /**
     * @return null or {@code reply}, or custom response
     */
    @Nullable
    public static <ReqT extends GeneratedMessageLite<?, ?>, RespT extends GeneratedMessageLite<?, ?>>
    GeneratedMessageLite<?, ?> hookBlockingAfter(@NonNull GeneratedMessageLite<?, ?> req, @Nullable GeneratedMessageLite<?, ?> reply, MossException error) throws MossException {
        MossDebugPrinter.printBlocking(req, reply);
        if (req instanceof PlayViewUniteReq) {
            PlayViewUniteReq playReq = (PlayViewUniteReq) req;
            PlayViewUniteReply playReply = (PlayViewUniteReply) reply;
            if (Settings.REMEMBER_LOSSLESS_SETTING.getBoolean() && playReply != null) {
                playReply.getPlayDeviceConf().getDeviceConfsMap().forEach((key, deviceConf) -> {
                    if (key == 30/*LOSSLESS*/) {
                        com.bapis.bilibili.playershared.ConfValue confValue = deviceConf.getConfValue();
                        com.bapis.bilibili.playershared.ConfValueEx.setSwitchVal(confValue, Settings.LOSSLESS_ENABLED.getBoolean());
                    }
                });
            }
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean() && playReply != null) {
                var supportedConf = com.bapis.bilibili.playershared.ArcConf.newBuilder()
                        .setIsSupport(true).setDisabled(false).build();
                var arcConfs = PlayArcConfEx.getMutableArcConfsMap(playReply.getPlayArcConf());
                // CASTCONF,BACKGROUNDPLAY,SMALLWINDOW,LISTEN
                for (int key : new int[]{2, 9, 23, 36})
                    arcConfs.put(key, supportedConf);
            }
            return BangumiPlayUrlHook.hookPlayViewUniteAfter(playReq, playReply, error);
        } else if (req instanceof com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq) {
            com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq playReq = (com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq) req;
            com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply playReply = (com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply) reply;
            return BangumiPlayUrlHook.hookPlayViewPGCAfter(playReq, playReply, error);
        } else if (req instanceof DmViewReq) {
            DmViewReq dmViewReq = (DmViewReq) req;
            DmViewReply dmViewReply = (DmViewReply) reply;
            if (Settings.REMOVE_CMD_DMS.getBoolean() && dmViewReply != null) {
                DmViewReplyEx.clearActivityMeta(dmViewReply);
                try {
                    DmViewReplyEx.clearCommand(dmViewReply);
                } catch (Throwable ignored) {
                }
                GeneratedMessageLiteEx.setUnknownFields(dmViewReply, UnknownFieldSetLite.getDefaultInstance());
            }
            if (!(error instanceof NetworkException))
                return SubtitleReplyHook.addSubtitles(dmViewReq, dmViewReply);
        } else if (reply instanceof com.bapis.bilibili.app.view.v1.ViewProgressReply) {
            if (Settings.REMOVE_CMD_DMS.getBoolean())
                com.bapis.bilibili.app.view.v1.ViewProgressReplyEx.setVideoGuide((ViewProgressReply) reply, VideoGuide.newBuilder().build());
        } else if (reply instanceof com.bapis.bilibili.app.viewunite.v1.ViewProgressReply) {
            if (Settings.REMOVE_CMD_DMS.getBoolean()) {
                com.bapis.bilibili.app.viewunite.v1.VideoGuide videoGuide = ((com.bapis.bilibili.app.viewunite.v1.ViewProgressReply) reply).getVideoGuide();
                VideoGuideEx.clearContractCard(videoGuide);
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
        } else if (reply instanceof PlayViewReply) {
            PlayViewReply playViewReply = (PlayViewReply) reply;
            if (Settings.REMEMBER_LOSSLESS_SETTING.getBoolean()) {
                PlayAbilityConf playConf = playViewReply.getPlayConf();
                if (playConf.hasLossLessConf()) {
                    ConfValue confValue = playConf.getLossLessConf().getConfValue();
                    ConfValueEx.setSwitchVal(confValue, Settings.LOSSLESS_ENABLED.getBoolean());
                }
            }
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean()) {
                PlayArcConf playArc = playViewReply.getPlayArc();
                for (ArcConf arcConf : new ArcConf[]{playArc.getCastConf(), playArc.getBackgroundPlayConf(), playArc.getSmallWindowConf()}) {
                    ArcConfEx.setIsSupport(arcConf, true);
                    ArcConfEx.setDisabled(arcConf, false);
                }
            }
        } else if (reply instanceof ViewReply) {
            ViewReply viewReply = (ViewReply) reply;
            long aid = viewReply.getArc().getAid();
            int like = viewReply.getReqUser().getLike();
            AutoLikePatch.detail = Pair.create(aid, like);
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean())
                ConfigEx.setShowListenButton(viewReply.getConfig(), true);
            if (Settings.BLOCK_COMMENT_GUIDE.getBoolean()) {
                LikeCustomEx.clearLikeComment(viewReply.getLikeCustom());
                ReplyStyleEx.clearBadgeType(viewReply.getReplyPreface());
            }
        } else if (reply instanceof PlayURLResp) {
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean()) {
                PlayURLReq playURLReq = (PlayURLReq) req;
                PlayURLResp playURLResp = (PlayURLResp) reply;
                return reconstructPlayUrlResponse(playURLReq, playURLResp);
            }
        }
        if (error != null) {
            throw error;
        } else {
            return reply;
        }
    }

    /**
     * @return {@link HookFlags#STOP_EXECUTION} to stop method execution and return void,
     * or null to not intercept method execution,
     * or {@code handler}, or a proxy handler like {@link MossResponseHandlerProxy}
     */
    @Nullable
    public static <ReqT extends GeneratedMessageLite<?, ?>, RespT extends GeneratedMessageLite<?, ?>>
    Object hookAsyncBefore(@NonNull GeneratedMessageLite<?, ?> req, @Nullable MossResponseHandler handler) {
        if (handler == null) return null;
        handler = MossDebugPrinter.printAsync(req, handler);
        if (req instanceof PlayConfReq) {
            if (Settings.REMEMBER_LOSSLESS_SETTING.getBoolean())
                return MossResponseHandlerProxy.<PlayConfReply>get(handler, v -> {
                    if (v != null) {
                        ConfValue confValue = v.getPlayConf().getLossLessConf().getConfValue();
                        ConfValueEx.setSwitchVal(confValue, Settings.LOSSLESS_ENABLED.getBoolean());
                    }
                    return v;
                });
        } else if (req instanceof PlaylistReq) {
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean())
                return MossResponseHandlerProxy.<PlaylistResp>get(handler, v -> {
                    if (v != null)
                        reconstructListenPlaylistResponse(v.getListList());
                    return v;
                });
        } else if (req instanceof RcmdPlaylistReq) {
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean())
                return MossResponseHandlerProxy.<RcmdPlaylistResp>get(handler, v -> {
                    if (v != null)
                        reconstructListenPlaylistResponse(v.getListList());
                    return v;
                });
        } else if (req instanceof PlayHistoryReq) {
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean())
                return MossResponseHandlerProxy.<PlayHistoryResp>get(handler, v -> {
                    if (v != null)
                        reconstructListenPlaylistResponse(v.getListList());
                    return v;
                });
        } else if (req instanceof MainListReq) {
            long type = ((MainListReq) req).getType();
            if (Settings.BLOCK_VIDEO_COMMENT.getBoolean() && type == 1L) {
                blockVideoComment(handler);
                return HookFlags.STOP_EXECUTION;
            } else if (Settings.BLOCK_COMMENT_GUIDE.getBoolean()) {
                return MossResponseHandlerProxy.<MainListReply>get(handler, v -> {
                    if (v != null)
                        blockCommentGuide(v);
                    return v;
                });
            }
        } else if (req instanceof SearchAllRequest) {
            if (Settings.SEARCH_BANGUMI.getBoolean()
                    || Settings.SEARCH_MOVIE.getBoolean()
                    || !Settings.FILTER_SEARCH_TYPE.getStringSet().isEmpty()) {
                return MossResponseHandlerProxy.<SearchAllResponse>get(handler, v -> {
                    if (v != null)
                        BangumiSeasonHook.searchAllResponseHook(v);
                    return v;
                });
            }
        } else if (req instanceof SearchByTypeRequest) {
            SearchByTypeRequest searchByTypeRequest = (SearchByTypeRequest) req;
            if (BangumiSeasonHook.handleExtraSearch(searchByTypeRequest, handler))
                return HookFlags.STOP_EXECUTION;
        } else if (req instanceof DynTabReq) {
            if (Settings.DYNAMIC_PURIFY_CITY.getBoolean()
                    || Settings.DYNAMIC_PURIFY_CAMPUS.getBoolean()) {
                return MossResponseHandlerProxy.<DynTabReply>get(handler, v -> {
                    if (v != null)
                        purifyDynTabs(v);
                    return v;
                });
            }
        }
        if (Settings.DEBUG.getBoolean())
            return handler;
        else
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

    static void reconstructListenPlaylistResponse(List<DetailItem> items) {
        var needPartItems = items.stream()
                .filter(e -> e.getPlayable() != 0)
                .peek(e -> DetailItemEx.setPlayable(e, 0))
                .filter(e -> e.getPartsCount() <= 0)
                .collect(Collectors.toList());
        if (needPartItems.isEmpty())
            return;
        var playerArgs = PlayerArgs.newBuilder()
                .setFnval(Constants.MAX_FNVAL)
                .setForceHost(2)
                .setQn(64)
                .build();
        var commViewReq = ViewReq.newBuilder()
                .setFnval(Constants.MAX_FNVAL)
                .setForceHost(2)
                .setFourk(1)
                .setPlayerArgs(playerArgs)
                .setQn(64);
        var viewMoss = new ViewMoss();
        for (var item : needPartItems) {
            var oid = item.getArc().getOid();
            var viewReq = commViewReq.setAid(oid).build();
            ViewReply viewReply = null;
            try {
                viewReply = viewMoss.view(viewReq);
            } catch (MossException ignored) {
            }
            if (viewReply == null)
                continue;
            var parts = viewReply.getPagesList().stream().map(p ->
                    BKArcPart.newBuilder()
                            .setDuration(p.getPage().getDuration())
                            .setOid(oid)
                            .setPage(p.getPage().getPage())
                            .setSubId(p.getPage().getCid())
                            .setTitle(p.getPage().getPart())
                            .build()
            ).collect(Collectors.toList());
            DetailItemEx.addAllParts(item, parts);
        }
    }

    private static PlayURLResp reconstructPlayUrlResponse(PlayURLReq playURLReq, PlayURLResp playURLResp) {
        var playable = playURLResp.getPlayable();
        var playerInfo = playURLResp.getPlayerInfoMap();
        if (playable == 0 && !playerInfo.isEmpty())
            return playURLResp;
        var commPlayViewReq = PlayViewReq.newBuilder()
                .setAid(playURLReq.getItem().getOid())
                .setQn(playURLReq.getPlayerArgs().getQn())
                .setFnval((int) playURLReq.getPlayerArgs().getFnval())
                .setForceHost((int) playURLReq.getPlayerArgs().getForceHost())
                .setFourk(true)
                .setPreferCodecType(CodeType.CODE265);
        var newPlayerInfo = new LinkedHashMap<Long, PlayInfo>();
        var playURLMoss = new PlayURLMoss();
        for (var subId : playURLReq.getItem().getSubIdList()) {
            var playViewReq = commPlayViewReq.setCid(subId).build();
            PlayViewReply playViewReply = null;
            try {
                playViewReply = playURLMoss.playView(playViewReq);
            } catch (MossException ignored) {
            }
            if (playViewReply == null)
                continue;
            var videoInfo = playViewReply.getVideoInfo();
            var deadline = new long[]{0L};
            var audios = videoInfo.getDashAudioList().stream().map(a -> {
                if (deadline[0] == 0L) {
                    var query = Uri.parse(a.getBaseUrl()).getQueryParameter("deadline");
                    if (!TextUtils.isEmpty(query)) try {
                        deadline[0] = Long.parseLong(query);
                    } catch (NumberFormatException ignored) {
                    }
                }
                return DashItem.newBuilder()
                        .setId(a.getId())
                        .setSize(a.getSize())
                        .setBandwidth(a.getBandwidth())
                        .setBaseUrl(a.getBaseUrl())
                        .addAllBackupUrl(a.getBackupUrlList())
                        .build();
            }).collect(Collectors.toList());
            var playDASH = PlayDASH.newBuilder()
                    .addAllAudio(audios)
                    .setDuration((int) Math.ceil(videoInfo.getTimelength() / 1000.0))
                    .setMinBufferTime(0.0F)
                    .build();
            var formats = videoInfo.getStreamListList().stream().map(s -> {
                var si = s.getStreamInfo();
                return FormatDescription.newBuilder()
                        .setDescription(si.getDescription())
                        .setDisplayDesc(si.getDisplayDesc())
                        .setFormat(si.getFormat())
                        .setQuality(si.getQuality())
                        .setSuperscript(si.getSuperscript())
                        .build();
            }).collect(Collectors.toList());
            var playInfo = PlayInfo.newBuilder()
                    .setFnval((int) playURLReq.getPlayerArgs().getFnval())
                    .setFormat(videoInfo.getFormat())
                    .setLength(videoInfo.getTimelength())
                    .setQn(videoInfo.getQuality())
                    .setVideoCodecid(videoInfo.getVideoCodecid())
                    .setPlayDash(playDASH)
                    .addAllFormats(formats)
                    .setExpireTime(deadline[0])
                    .build();
            newPlayerInfo.put(subId, playInfo);
        }
        return PlayURLResp.newBuilder()
                .setItem(playURLReq.getItem())
                .setPlayable(0)
                .putAllPlayerInfo(newPlayerInfo)
                .build();
    }

    static void blockVideoComment(MossResponseHandler handler) {
        var textStyle = TextStyle.newBuilder()
                .setFontSize(14)
                .setTextDayColor("#FF61666D")
                .setTextNightColor("#FFA2A7AE")
                .build();
        var text = EmptyPage.Text.newBuilder()
                .setRaw("评论区已由漫游屏蔽")
                .setStyle(textStyle)
                .build();
        var emptyPage = EmptyPage.newBuilder()
                .setImageUrl("https://i0.hdslb.com/bfs/app-res/android/img_holder_forbid_style1.webp")
                .addTexts(text)
                .build();
        var subjectControl = SubjectControl.newBuilder()
                .setEmptyPage(emptyPage)
                .build();
        var reply = MainListReply.newBuilder()
                .setSubjectControl(subjectControl)
                .build();
        handler.onNext(reply);
    }

    static void blockCommentGuide(MainListReply reply) {
        var subjectControl = reply.getSubjectControl();
        SubjectControlEx.clearEmptyBackgroundTextPlain(subjectControl);
        SubjectControlEx.clearEmptyBackgroundTextHighlight(subjectControl);
        SubjectControlEx.clearEmptyBackgroundUri(subjectControl);
        var emptyPage = subjectControl.getEmptyPage();
        EmptyPageEx.clearLeftButton(emptyPage);
        EmptyPageEx.clearRightButton(emptyPage);
        var textsList = emptyPage.getTextsList();
        if (textsList.size() > 1) {
            EmptyPageEx.clearTexts(emptyPage);
            var textStyle = TextStyle.newBuilder()
                    .setFontSize(14)
                    .setTextDayColor("#FF61666D")
                    .setTextNightColor("#FFA2A7AE")
                    .build();
            var text = EmptyPage.Text.newBuilder()
                    .setRaw("还没有评论哦")
                    .setStyle(textStyle)
                    .build();
            EmptyPageEx.addTexts(emptyPage, text);
        }
    }
}
