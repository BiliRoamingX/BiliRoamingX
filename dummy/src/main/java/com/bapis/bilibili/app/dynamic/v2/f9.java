package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface f9 extends MessageLiteOrBuilder {
    long getHeight();

    float getSize();

    String getSrc();

    ByteString getSrcBytes();

    String getSrcDark();

    ByteString getSrcDarkBytes();

    MdlDynDrawTag getTags(int i2);

    int getTagsCount();

    List<MdlDynDrawTag> getTagsList();

    long getWidth();
}
