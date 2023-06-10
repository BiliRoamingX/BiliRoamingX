package com.bilibili.bililive.videoliveplayer.net.beans.giftpendant;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

public class LiveGiftPendantInfo {
    @JSONField(name = "gift_star_process")
    @Nullable
    public LiveGiftStarPendantInfo liveGiftStarPendantInfo;
    @JSONField(name = "wish_process")
    @Nullable
    public LiveWishListInfo liveWishListPendantInfo;
}
