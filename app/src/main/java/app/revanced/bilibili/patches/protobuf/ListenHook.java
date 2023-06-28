package app.revanced.bilibili.patches.protobuf;

import android.net.Uri;
import android.text.TextUtils;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.app.listener.v1.BKArcPart;
import com.bapis.bilibili.app.listener.v1.DashItem;
import com.bapis.bilibili.app.listener.v1.DetailItem;
import com.bapis.bilibili.app.listener.v1.DetailItemEx;
import com.bapis.bilibili.app.listener.v1.FormatDescription;
import com.bapis.bilibili.app.listener.v1.PlayDASH;
import com.bapis.bilibili.app.listener.v1.PlayInfo;
import com.bapis.bilibili.app.listener.v1.PlayURLReq;
import com.bapis.bilibili.app.listener.v1.PlayURLResp;
import com.bapis.bilibili.app.playurl.v1.CodeType;
import com.bapis.bilibili.app.playurl.v1.PlayURLMoss;
import com.bapis.bilibili.app.playurl.v1.PlayViewReply;
import com.bapis.bilibili.app.playurl.v1.PlayViewReq;
import com.bapis.bilibili.app.view.v1.ViewMoss;
import com.bapis.bilibili.app.view.v1.ViewReply;
import com.bapis.bilibili.app.view.v1.ViewReq;
import com.bilibili.lib.moss.api.MossException;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import app.revanced.bilibili.utils.Constants;

public class ListenHook {
    public static void reconstructPlaylistResponse(List<DetailItem> items) {
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

    public static PlayURLResp reconstructPlayUrlResponse(PlayURLReq playURLReq, PlayURLResp playURLResp) {
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
}
