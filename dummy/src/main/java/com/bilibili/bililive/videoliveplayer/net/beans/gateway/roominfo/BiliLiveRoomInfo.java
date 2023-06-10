package com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bililive.videoliveplayer.net.beans.giftpendant.LiveGiftPendantInfo;

public class BiliLiveRoomInfo {
    @Nullable
    public BiliLiveRoomBanner bannerInfo;
    @Nullable
    public FunctionCard functionCard;
    @JSONField(name = "progress_for_widget")
    @Nullable
    public LiveGiftPendantInfo revenueGiftPendantInfo;

    public static class FunctionCard {
        @Nullable
        public LiveRoomFollowCardInfo followCard;
    }
}
