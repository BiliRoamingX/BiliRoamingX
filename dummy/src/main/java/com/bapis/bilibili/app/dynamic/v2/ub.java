package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface ub extends MessageLiteOrBuilder {
    CodeParagraph getCode();

    Paragraph.ContentCase getContentCase();

    LineParagraph getLine();

    CardParagraph getLinkCard();

    Paragraph.ParagraphFormat getParaFormat();

    Paragraph.ParagraphType getParaType();

    int getParaTypeValue();

    PicParagraph getPic();

    TextParagraph getText();

    boolean hasCode();

    boolean hasLine();

    boolean hasLinkCard();

    boolean hasParaFormat();

    boolean hasPic();

    boolean hasText();
}
