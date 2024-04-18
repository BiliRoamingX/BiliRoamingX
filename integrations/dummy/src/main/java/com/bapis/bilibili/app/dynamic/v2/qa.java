package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface qa extends MessageLiteOrBuilder {
    MdlDynDrawItem getCovers(int i2);

    int getCoversCount();

    List<MdlDynDrawItem> getCoversList();

    Paragraph getSummary();

    String getSummaryJumpBtnText();

    ByteString getSummaryJumpBtnTextBytes();

    Paragraph getTitle();

    boolean hasSummary();

    boolean hasTitle();
}
