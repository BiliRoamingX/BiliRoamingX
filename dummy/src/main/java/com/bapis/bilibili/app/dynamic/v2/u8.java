package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface u8 extends MessageLiteOrBuilder {
    Any getBizData();

    String getBizId();

    ByteString getBizIdBytes();

    GoodsItem getGoodsItem();

    String getIcon();

    ByteString getIconBytes();

    String getIconSuffix();

    ByteString getIconSuffixBytes();

    String getLink();

    ByteString getLinkBytes();

    MdlDynDraw getLinkPics();

    String getLinkType();

    ByteString getLinkTypeBytes();

    LinkNodeType getLinkTypeEnum();

    int getLinkTypeEnumValue();

    NoteVideoTS getNoteVideoTs();

    WordNode getShowText();

    @Deprecated
    long getTimestamp();

    boolean hasBizData();

    boolean hasGoodsItem();

    boolean hasLinkPics();

    boolean hasNoteVideoTs();

    boolean hasShowText();
}
