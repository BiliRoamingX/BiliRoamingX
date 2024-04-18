package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface g9 extends MessageLiteOrBuilder {
    long getId();

    boolean getIsArticleCover();

    boolean getIsBigCover();

    boolean getIsDrawFirst();

    MdlDynDrawItem getItems(int i2);

    int getItemsCount();

    List<MdlDynDrawItem> getItemsList();

    String getUri();

    ByteString getUriBytes();
}
