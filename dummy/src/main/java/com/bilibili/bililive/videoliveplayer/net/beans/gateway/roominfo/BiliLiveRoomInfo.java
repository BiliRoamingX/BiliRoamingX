package com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo;

import androidx.annotation.Nullable;

public class BiliLiveRoomInfo {
    @Nullable
    public BiliLiveRoomBanner bannerInfo;
    @Nullable
    public FunctionCard functionCard;

    public static class FunctionCard {
        @Nullable
        public LiveRoomFollowCardInfo followCard;
    }
}
