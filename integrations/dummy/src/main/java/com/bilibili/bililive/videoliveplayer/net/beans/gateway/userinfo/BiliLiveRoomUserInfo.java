package com.bilibili.bililive.videoliveplayer.net.beans.gateway.userinfo;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo.LiveRoomPlayTogetherCardInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.playtogether.LivePlayTogetherInfoUser;

public class BiliLiveRoomUserInfo {
    @Nullable
    public FunctionCard functionCard;
    @Nullable
    public BiliLiveRoomUserTaskInfo taskInfo;

    @JSONField(name = "play_together_info")
    @Nullable
    public LivePlayTogetherInfoUser playTogetherInfo;

    @JSONField(name = "play_together_info_v2")
    @Nullable
    public LiveRoomPlayTogetherCardInfo playTogetherInfoV2;

    @JSONField(name = "qoe_show")
    @Nullable
    public LiveRoomUserResearch qoe;
}
