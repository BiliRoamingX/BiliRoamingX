package app.revanced.bilibili.patches.protobuf;

import android.util.Pair;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bapis.bilibili.app.dynamic.v1.DynRedReply;
import com.bapis.bilibili.app.dynamic.v1.DynRedReplyEx;
import com.bapis.bilibili.app.dynamic.v2.DynAllReply;
import com.bapis.bilibili.app.dynamic.v2.DynAllReplyEx;
import com.bapis.bilibili.app.dynamic.v2.DynTabReply;
import com.bapis.bilibili.app.dynamic.v2.DynTabReq;
import com.bapis.bilibili.app.dynamic.v2.DynVideoReply;
import com.bapis.bilibili.app.dynamic.v2.DynVideoReplyEx;
import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReq;
import com.bapis.bilibili.app.listener.v1.PlayHistoryReq;
import com.bapis.bilibili.app.listener.v1.PlayHistoryResp;
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
import com.bapis.bilibili.app.playurl.v1.ConfValue;
import com.bapis.bilibili.app.playurl.v1.ConfValueEx;
import com.bapis.bilibili.app.playurl.v1.PlayAbilityConf;
import com.bapis.bilibili.app.playurl.v1.PlayArcConf;
import com.bapis.bilibili.app.playurl.v1.PlayConfEditReq;
import com.bapis.bilibili.app.playurl.v1.PlayConfReply;
import com.bapis.bilibili.app.playurl.v1.PlayConfReq;
import com.bapis.bilibili.app.playurl.v1.PlayViewReply;
import com.bapis.bilibili.app.playurl.v1.PlayViewReq;
import com.bapis.bilibili.app.resource.v1.ListReply;
import com.bapis.bilibili.app.resource.v1.ListReq;
import com.bapis.bilibili.app.view.v1.ConfigEx;
import com.bapis.bilibili.app.view.v1.LikeCustomEx;
import com.bapis.bilibili.app.view.v1.RelatesFeedReply;
import com.bapis.bilibili.app.view.v1.ReplyStyleEx;
import com.bapis.bilibili.app.view.v1.TFInfoReq;
import com.bapis.bilibili.app.view.v1.VideoGuide;
import com.bapis.bilibili.app.view.v1.ViewProgressReply;
import com.bapis.bilibili.app.view.v1.ViewReply;
import com.bapis.bilibili.app.viewunite.v1.VideoGuideEx;
import com.bapis.bilibili.broadcast.message.main.TopActivityReply;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.DmViewReplyEx;
import com.bapis.bilibili.community.service.dm.v1.DmViewReq;
import com.bapis.bilibili.main.community.reply.v1.MainListReply;
import com.bapis.bilibili.main.community.reply.v1.MainListReq;
import com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply;
import com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReq;
import com.bapis.bilibili.polymer.app.search.v1.SearchAllRequest;
import com.bapis.bilibili.polymer.app.search.v1.SearchAllResponse;
import com.bapis.bilibili.polymer.app.search.v1.SearchByTypeRequest;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.moss.api.NetworkException;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLiteEx;
import com.google.protobuf.UnknownFieldSetLite;

import app.revanced.bilibili.api.MossResponseHandlerProxy;
import app.revanced.bilibili.meta.HookFlags;
import app.revanced.bilibili.patches.AutoLikePatch;
import app.revanced.bilibili.patches.TrialQualityPatch;
import app.revanced.bilibili.patches.VideoQualityPatch;
import app.revanced.bilibili.patches.json.PegasusPatch;
import app.revanced.bilibili.patches.okhttp.BangumiSeasonHook;
import app.revanced.bilibili.settings.Settings;
import app.revanced.bilibili.utils.LogHelper;
import app.revanced.bilibili.utils.MossDebugPrinter;
import app.revanced.bilibili.utils.Utils;
import app.revanced.bilibili.utils.Versions;

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
        } else if (!Utils.isHd() && req instanceof TFInfoReq) {
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
    GeneratedMessageLite<?, ?> hookBlockingAfter(@NonNull GeneratedMessageLite<?, ?> req, @Nullable GeneratedMessageLite<?, ?> reply, @Nullable MossException error) throws MossException {
        MossDebugPrinter.printBlocking(req, reply);
        if (req instanceof PlayViewUniteReq) {
            PlayViewUniteReq playReq = (PlayViewUniteReq) req;
            PlayViewUniteReply playReply = (PlayViewUniteReply) reply;
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
            DynamicHook.filterDynamicForAll(dynAllReply.getDynamicList());
        } else if (reply instanceof DynVideoReply) {
            DynVideoReply dynVideoReply = (DynVideoReply) reply;
            if (Settings.DYNAMIC_RM_UP_OF_VIDEO.getBoolean())
                DynVideoReplyEx.clearVideoUpList(dynVideoReply);
            if (Settings.DYNAMIC_FILTER_APPLY_TO_VIDEO.getBoolean())
                DynamicHook.filterDynamicForVideo(dynVideoReply.getDynamicList());
        } else if (reply instanceof DynRedReply) {
            if (Settings.DYNAMIC_PREFER_VIDEO_TAB.getBoolean())
                DynRedReplyEx.setDefaultTab((DynRedReply) reply, "video");
        } else if (reply instanceof PlayViewReply) {
            PlayViewReq playViewReq = (PlayViewReq) req;
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
            if (playViewReq.getDownload() < 1 && !Utils.isEffectiveVip()
                    && Settings.FORCE_OLD_PLAYER.getBoolean() && Settings.TRIAL_VIP_QUALITY.getBoolean())
                TrialQualityPatch.makeVipFree(playViewReply.getVideoInfo());
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
            PegasusPatch.filterViewRelates(viewReply);
        } else if (reply instanceof PlayURLResp) {
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean()) {
                PlayURLReq playURLReq = (PlayURLReq) req;
                PlayURLResp playURLResp = (PlayURLResp) reply;
                return ListenHook.reconstructPlayUrlResponse(playURLReq, playURLResp);
            }
        } else if (reply instanceof RelatesFeedReply) {
            RelatesFeedReply feedReply = (RelatesFeedReply) reply;
            PegasusPatch.filterRelatesFeed(feedReply);
        } else if (reply instanceof ListReply) {
            ListReq listReq = (ListReq) req;
            ListReply listReply = (ListReply) reply;
            ModuleListReplyHook.hook(listReq, listReply);
        } else if (Versions.ge7_39_0() && req instanceof com.bapis.bilibili.app.viewunite.v1.ViewReq) {
            var viewReq = (com.bapis.bilibili.app.viewunite.v1.ViewReq) req;
            var viewReply = (com.bapis.bilibili.app.viewunite.v1.ViewReply) reply;
            return ViewUniteReplyHook.hook(viewReq, viewReply, error);
        } else if (Versions.ge7_39_0() && reply instanceof com.bapis.bilibili.app.viewunite.v1.RelatesFeedReply) {
            com.bapis.bilibili.app.viewunite.v1.RelatesFeedReply feedReply = (com.bapis.bilibili.app.viewunite.v1.RelatesFeedReply) reply;
            PegasusPatch.filterRelatesFeedUnite(feedReply);
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
                        ListenHook.reconstructPlaylistResponse(v.getListList());
                    return v;
                });
        } else if (req instanceof RcmdPlaylistReq) {
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean())
                return MossResponseHandlerProxy.<RcmdPlaylistResp>get(handler, v -> {
                    if (v != null)
                        ListenHook.reconstructPlaylistResponse(v.getListList());
                    return v;
                });
        } else if (req instanceof PlayHistoryReq) {
            if (Settings.UNLOCK_PLAY_LIMIT.getBoolean())
                return MossResponseHandlerProxy.<PlayHistoryResp>get(handler, v -> {
                    if (v != null)
                        ListenHook.reconstructPlaylistResponse(v.getListList());
                    return v;
                });
        } else if (req instanceof MainListReq) {
            long type = ((MainListReq) req).getType();
            if (Settings.BLOCK_VIDEO_COMMENT.getBoolean() && type == 1L) {
                CommentHook.blockVideoComment(handler);
                return HookFlags.STOP_EXECUTION;
            } else if (Settings.BLOCK_COMMENT_GUIDE.getBoolean()) {
                return MossResponseHandlerProxy.<MainListReply>get(handler, v -> {
                    if (v != null)
                        CommentHook.blockCommentGuide(v);
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
                        DynamicHook.purifyDynTabs(v);
                    return v;
                });
            }
        } else if (req instanceof Empty) {
            if (Settings.BLOCK_TOP_ACTIVITY.getBoolean()) {
                return MossResponseHandlerProxy.get(handler, v -> {
                    if (v instanceof TopActivityReply) {
                        return null;
                    } else {
                        return v;
                    }
                });
            }
        } else if (Versions.ge7_39_0() && req instanceof SubjectDescriptionReq) {
            if (Settings.BLOCK_COMMENT_GUIDE.getBoolean())
                return MossResponseHandlerProxy.<SubjectDescriptionReply>get(handler, v -> {
                    if (v != null)
                        SubjectDescriptionHook.blockCommentGuide(v);
                    return v;
                });
        } else if (req instanceof PlayViewUniteReq) {
            PlayViewUniteReq playReq = (PlayViewUniteReq) req;
            VideoQualityPatch.unlockLimit(playReq);
            BangumiPlayUrlHook.hookPlayViewUniteBefore(playReq);
            return MossResponseHandlerProxy.<PlayViewUniteReply>get(handler, playReply -> {
                LogHelper.debug(() -> "plyViewUnite.onNext");
                return BangumiPlayUrlHook.hookPlayViewUniteAfter(playReq, playReply, null);
            }, (delegate, error) -> {
                LogHelper.debug(() -> "playViewUnite.onError, error: " + error);
                try {
                    var reply = BangumiPlayUrlHook.hookPlayViewUniteAfter(playReq, null, error);
                    delegate.onNext(reply);
                    return true;
                } catch (Throwable ignored) {
                    return false;
                }
            });
        }
        if (Settings.DEBUG.getBoolean())
            return handler;
        else
            return null;
    }
}
