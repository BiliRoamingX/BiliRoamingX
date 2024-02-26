package com.bapis.bilibili.app.dynamic.v2;

import com.bapis.bilibili.app.dynamic.v2.TextNode;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface ic extends MessageLiteOrBuilder {
    EmoteNode getEmote();

    FormulaNode getFormula();

    LinkNode getLink();

    TextNode.TextNodeType getNodeType();

    int getNodeTypeValue();

    String getRawText();

    ByteString getRawTextBytes();

    TextNode.TextCase getTextCase();

    WordNode getWord();

    boolean hasEmote();

    boolean hasFormula();

    boolean hasLink();

    boolean hasWord();
}
