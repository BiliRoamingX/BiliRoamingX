package com.bilibili.bplus.im.business.model;

import com.bilibili.bplus.im.entity.ChatMessage;

/* compiled from: BL */
/* loaded from: classes2.dex */
public abstract class BaseMessage {
    protected ChatMessage mDbMessage;

    public ChatMessage getDbMessage() {
        return this.mDbMessage;
    }
}
