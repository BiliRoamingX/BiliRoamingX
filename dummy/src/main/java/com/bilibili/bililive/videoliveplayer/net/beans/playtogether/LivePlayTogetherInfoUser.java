package com.bilibili.bililive.videoliveplayer.net.beans.playtogether;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;

import kotlin.jvm.JvmField;

/* compiled from: BL */
@Keep
/* loaded from: classes4.dex */
public final class LivePlayTogetherInfoUser {

    @JvmField
    @JSONField(name = "notice_count")
    public int noticeCount;

    @JvmField
    @JSONField(name = "user_status")
    public int userStatus = 1;

    @JvmField
    @JSONField(name = "notice_str")
    @NotNull
    public String noticeStr = "";
}
