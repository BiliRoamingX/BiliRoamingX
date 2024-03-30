package com.bilibili.bililive.videoliveplayer.net.beans.gateway.userinfo;

import androidx.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo.LiveRoomPlayTogetherCardInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.playtogether.LivePlayTogetherInfoUser;

import kotlin.jvm.JvmField;

public class BiliLiveRoomUserInfo {
    @Nullable
    public FunctionCard functionCard;
    @Nullable
    public BiliLiveRoomUserTaskInfo taskInfo;

    @JvmField
    @JSONField(name = "play_together_info")
    @Nullable
    public LivePlayTogetherInfoUser playTogetherInfo;

    @JvmField
    @JSONField(name = "play_together_info_v2")
    @Nullable
    public LiveRoomPlayTogetherCardInfo playTogetherInfoV2;
}
