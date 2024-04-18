package com.bilibili.bplus.im.business.model;

import android.content.Context;

import com.alibaba.fastjson.JSON;
import com.bilibili.bplus.im.entity.ChatMessage;
import com.bilibili.bplus.im.entity.User;

import java.util.Date;

/* compiled from: BL */
/* loaded from: classes2.dex */
public abstract class BaseTypedMessage<T> extends BaseMessage {
    public String conversationId;
    protected T mContent;

    public BaseTypedMessage(ChatMessage chatMessage) {
        throw new UnsupportedOperationException("Stub");
    }

    public T getContent() {
        throw new UnsupportedOperationException("Stub");
    }

    public String getContentString() {
        return JSON.toJSONString(this.mContent);
    }

    public long getId() {
        throw new UnsupportedOperationException("Stub");
    }

    public User getSender() {
        throw new UnsupportedOperationException("Stub");
    }

    public long getSenderUid() {
        throw new UnsupportedOperationException("Stub");
    }

    public abstract String getSimpleText(Context context);

    public Date getTimestamp() {
        throw new UnsupportedOperationException("Stub");
    }

    protected abstract T parseContentString(String str);

    public void refreshContent(ChatMessage chatMessage) {
        throw new UnsupportedOperationException("Stub");
    }

    public void refreshDbContent() {
        throw new UnsupportedOperationException("Stub");
    }

    public void setSender(User user) {
        throw new UnsupportedOperationException("Stub");
    }

    public void refreshContent(String str) {
        throw new UnsupportedOperationException("Stub");
    }

    public BaseTypedMessage(ChatMessage chatMessage, T t) {
        throw new UnsupportedOperationException("Stub");
    }
}
