package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface ed extends MessageLiteOrBuilder {
    Colors getColor();

    double getFontSize();

    WordNode.WordNodeStyle getStyle();

    WordNode.UnderlineStyle getUnderlineStyle();

    String getWords();

    ByteString getWordsBytes();

    boolean hasColor();

    boolean hasStyle();

    boolean hasUnderlineStyle();
}
