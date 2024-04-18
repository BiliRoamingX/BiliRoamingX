package com.bapis.bilibili.polymer.app.search.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes15.dex */
public interface ItemOrBuilder extends MessageLiteOrBuilder {
    SearchBangumiCard getBangumi();

    Item.CardItemCase getCardItemCase();

    String getGoto();

    ByteString getGotoBytes();

    String getLinktype();

    ByteString getLinktypeBytes();

    String getParam();

    ByteString getParamBytes();

    int getPosition();

    String getTrackid();

    ByteString getTrackidBytes();

    String getUri();

    ByteString getUriBytes();

    boolean hasBangumi();
}
