package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.main.community.reply.v1.e */
/* loaded from: classes21.dex */
public interface InterfaceC14917e extends MessageLiteOrBuilder {
    String getDesc(int i);

    ByteString getDescBytes(int i);

    int getDescCount();

    List<String> getDescList();

    String getImgUrl();

    ByteString getImgUrlBytes();

    float getScore();

    String getTitle();

    ByteString getTitleBytes();
}
