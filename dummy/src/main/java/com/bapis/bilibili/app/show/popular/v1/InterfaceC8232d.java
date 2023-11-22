package com.bapis.bilibili.app.show.popular.v1;

import com.bapis.bilibili.app.card.v1.Card;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.show.popular.v1.d */
/* loaded from: classes13.dex */
public interface InterfaceC8232d extends MessageLiteOrBuilder {
    Config getConfig();

    Card getItems(int i);

    int getItemsCount();

    List<Card> getItemsList();

    String getVer();

    ByteString getVerBytes();

    boolean hasConfig();
}
