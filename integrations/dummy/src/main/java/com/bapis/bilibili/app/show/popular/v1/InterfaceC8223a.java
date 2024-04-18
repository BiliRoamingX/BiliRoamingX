package com.bapis.bilibili.app.show.popular.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* renamed from: com.bapis.bilibili.app.show.popular.v1.a */
/* loaded from: classes13.dex */
public interface InterfaceC8223a extends MessageLiteOrBuilder {
    String getBottomText();

    ByteString getBottomTextBytes();

    String getBottomTextCover();

    ByteString getBottomTextCoverBytes();

    String getBottomTextUrl();

    ByteString getBottomTextUrlBytes();

    String getHeadImage();

    ByteString getHeadImageBytes();

    long getHit();

    String getItemTitle();

    ByteString getItemTitleBytes();

    EntranceShow getPageItems(int i);

    int getPageItemsCount();

    List<EntranceShow> getPageItemsList();

    String getToast();

    ByteString getToastBytes();

    EntranceShow getTopItems(int i);

    int getTopItemsCount();

    List<EntranceShow> getTopItemsList();
}
