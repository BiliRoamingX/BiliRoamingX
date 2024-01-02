package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.main.community.reply.v1.i */
/* loaded from: classes21.dex */
public interface InterfaceC14927i extends MessageLiteOrBuilder {
    Content getContent();

    long getCount();

    long getCtime();

    long getDialog();

    long getId();

    long getLike();

    Member getMember();

    MemberV2 getMemberV2();

    long getMid();

    long getOid();

    long getParent();

    ReplyInfo getReplies(int i);

    int getRepliesCount();

    List<ReplyInfo> getRepliesList();

    ReplyControl getReplyControl();

    long getRoot();

    String getTrackInfo();

    ByteString getTrackInfoBytes();

    long getType();

    boolean hasContent();

    boolean hasMember();

    boolean hasMemberV2();

    boolean hasReplyControl();
}
