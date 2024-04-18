package com.bilibili.bililive.videoliveplayer.net.beans.gateway.roominfo;

import androidx.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import kotlin.jvm.JvmField;

/* compiled from: BL */
@Keep
/* loaded from: classes4.dex */
public final class LiveRoomPlayTogetherCardInfo extends LiveRoomMatchCardBaseCard {

    @JvmField
    @JSONField(name = "card_expire_time")
    public int cardExpireTime;

    @JvmField
    @JSONField(name = "card_level")
    public int cardLevel;

    @JvmField
    @JSONField(name = "card_url_app")
    @Nullable
    public String cardUrlApp;

    @JvmField
    @JSONField(name = "room_id")
    public long roomId;

    @NotNull
    public String toString() {
        return "LiveRoomPlayTogetherCardInfo(cardLevel=" + this.cardLevel + ", cardExpireTime=" + this.cardExpireTime + ", cardUrlApp=" + this.cardUrlApp + ", roomId=" + this.roomId + ')';
    }
}
