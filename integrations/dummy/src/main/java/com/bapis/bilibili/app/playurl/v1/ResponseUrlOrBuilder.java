package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface ResponseUrlOrBuilder extends MessageLiteOrBuilder {
    String getBackupUrl(int i);

    ByteString getBackupUrlBytes(int i);

    int getBackupUrlCount();

    List<String> getBackupUrlList();

    long getLength();

    String getMd5();

    ByteString getMd5Bytes();

    int getOrder();

    long getSize();

    String getUrl();

    ByteString getUrlBytes();
}
