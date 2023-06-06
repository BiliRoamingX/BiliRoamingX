package app.revanced.bilibili.patches.protobuf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bapis.bilibili.app.interfaces.v1.DefaultWordsReq;
import com.bapis.bilibili.app.view.v1.TFInfoReq;
import com.bapis.bilibili.app.view.v1.VideoGuide;
import com.bapis.bilibili.app.view.v1.ViewProgressReply;
import com.bapis.bilibili.app.viewunite.v1.VideoGuideEx;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.community.service.dm.v1.DmViewReplyEx;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UnknownFieldSetLite;

import app.revanced.bilibili.api.MossResponseHandlerProxy;
import app.revanced.bilibili.meta.HookFlags;
import app.revanced.bilibili.settings.Settings;

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
        }
        return reply;
    }

    /**
     * @return {@link HookFlags#STOP_EXECUTION} to stop method execution and return void,
     * or null to not intercept method execution,
     * or {@code handler}, or a proxy handler like {@link MossResponseHandlerProxy}
     */
    @Nullable
    public static <ReqT extends GeneratedMessageLite<?, ?>, RespT extends GeneratedMessageLite<?, ?>>
    Object hookAsyncBefore(@NonNull ReqT req, @Nullable MossResponseHandler<RespT> handler) {
        return null;
    }
}
