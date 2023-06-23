package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface DashItemOrBuilder extends MessageLiteOrBuilder {
    String getBackupUrl(int i);

    ByteString getBackupUrlBytes(int i);

    int getBackupUrlCount();

    List<String> getBackupUrlList();

    int getBandwidth();

    String getBaseUrl();

    ByteString getBaseUrlBytes();

    int getCodecid();

    String getFrameRate();

    ByteString getFrameRateBytes();

    int getId();

    String getMd5();

    ByteString getMd5Bytes();

    long getSize();

    String getWidevinePssh();

    ByteString getWidevinePsshBytes();
}
