package com.bapis.bilibili.pagination;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.pagination.a */
/* loaded from: classes22.dex */
public interface InterfaceC15561a extends MessageLiteOrBuilder {
    String getLastReadOffset();

    ByteString getLastReadOffsetBytes();

    String getNextOffset();

    ByteString getNextOffsetBytes();

    String getPrevOffset();

    ByteString getPrevOffsetBytes();
}
