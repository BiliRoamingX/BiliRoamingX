package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface l1 extends MessageLiteOrBuilder {
    String getEmoteUrl();

    ByteString getEmoteUrlBytes();

    EmoteSize getEmoteWidth();

    ImgInlineCfg getInlineImgCfg();

    boolean getIsInlineImg();

    WordNode getRawText();

    boolean hasEmoteWidth();

    boolean hasInlineImgCfg();

    boolean hasRawText();
}
