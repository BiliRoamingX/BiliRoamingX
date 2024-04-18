package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface v1 extends MessageLiteOrBuilder {
    ImgInlineCfg getImageSpec();

    String getImgUrl();

    ByteString getImgUrlBytes();

    WordNode getLatexContent();

    boolean hasImageSpec();

    boolean hasLatexContent();
}
