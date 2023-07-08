package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface ModuleReplyOrBuilder extends MessageLiteOrBuilder {
    CompressType getCompress();

    int getCompressValue();

    long getDownloadStrategy();

    long getExperimentStrategy();

    long getFileId();

    long getFileSize();

    String getFileType();

    ByteString getFileTypeBytes();

    String getFilename();

    ByteString getFilenameBytes();

    IncrementType getIncrement();

    int getIncrementValue();

    boolean getIsWifi();

    LevelType getLevel();

    int getLevelValue();

    String getMd5();

    ByteString getMd5Bytes();

    long getModuleId();

    String getName();

    ByteString getNameBytes();

    long getPoolId();

    long getPublishTime();

    String getTotalMd5();

    ByteString getTotalMd5Bytes();

    String getUrl();

    ByteString getUrlBytes();

    long getVersion();

    long getVersionId();

    boolean getZipCheck();
}
