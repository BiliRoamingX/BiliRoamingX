package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes19.dex */
public interface b1 extends MessageLiteOrBuilder {
    @Deprecated
    int getEmojiSize();

    EmojiSizeSpec getEmojiSizeSpec();

    @Deprecated
    EmojiType getEmojiType();

    @Deprecated
    int getEmojiTypeValue();

    ModuleDescGoods getGoods();

    String getGoodsType();

    ByteString getGoodsTypeBytes();

    String getIconName();

    ByteString getIconNameBytes();

    String getIconUrl();

    ByteString getIconUrlBytes();

    String getOrigText();

    ByteString getOrigTextBytes();

    String getRid();

    ByteString getRidBytes();

    String getText();

    ByteString getTextBytes();

    DescType getType();

    int getTypeValue();

    String getUri();

    ByteString getUriBytes();

    boolean hasEmojiSizeSpec();

    boolean hasGoods();
}
