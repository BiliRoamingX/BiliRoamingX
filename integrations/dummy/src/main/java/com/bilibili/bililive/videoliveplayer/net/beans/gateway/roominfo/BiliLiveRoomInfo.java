package com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bililive.videoliveplayer.net.beans.giftpendant.LiveGiftPendantInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.mask.LiveAreaMaskInfo;

import java.util.Map;

public class BiliLiveRoomInfo {
    @Nullable
    public BiliLiveRoomBanner bannerInfo;
    @Nullable
    public FunctionCard functionCard;
    @JSONField(name = "progress_for_widget")
    @Nullable
    public LiveGiftPendantInfo revenueGiftPendantInfo;
    @JSONField(name = "area_mask_info")
    @Nullable
    public LiveAreaMaskInfo areaMaskInfo;
    @JSONField(name = "new_switch_info")
    @Nullable
    public Map<String, Object> newSwitchInfo;
    @JSONField(name = "dm_combo")
    @Nullable
    public DmComboInfo dmComboInfo;
    @JSONField(name = "block_info")
    @Nullable
    public BlockInfo blockInfo;

    public static class FunctionCard {
        @Nullable
        public LiveRoomFollowCardInfo followCard;
        @JSONField(name = "wish_list_card")
        @Nullable
        public LiveRoomWishlistCardInfo wishlistCard;
    }

    public static class DmComboInfo {
    }

    @Keep
    public static final class BlockInfo {

        @JSONField(name = "desc")
        @Nullable
        public String desc;

        @JSONField(name = "block")
        public boolean needBlock;
    }
}
