package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.v1.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface ViewPageOrBuilder extends MessageLiteOrBuilder {
    Audio getAudio();

    DM getDm();

    String getDownloadSubtitle();

    ByteString getDownloadSubtitleBytes();

    String getDownloadTitle();

    ByteString getDownloadTitleBytes();

    Page getPage();

    boolean hasAudio();

    boolean hasDm();

    boolean hasPage();
}
