package com.bapis.bilibili.app.resource.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes15.dex */
public final class ModuleReply extends GeneratedMessageLite<ModuleReply, ModuleReply.Builder> implements ModuleReplyOrBuilder {
    public static final int COMPRESS_FIELD_NUMBER = 12;
    private static final ModuleReply DEFAULT_INSTANCE;
    public static final int DOWNLOAD_STRATEGY_FIELD_NUMBER = 19;
    public static final int EXPERIMENT_STRATEGY_FIELD_NUMBER = 20;
    public static final int FILENAME_FIELD_NUMBER = 9;
    public static final int FILE_ID_FIELD_NUMBER = 17;
    public static final int FILE_SIZE_FIELD_NUMBER = 11;
    public static final int FILE_TYPE_FIELD_NUMBER = 10;
    public static final int INCREMENT_FIELD_NUMBER = 6;
    public static final int IS_WIFI_FIELD_NUMBER = 7;
    public static final int LEVEL_FIELD_NUMBER = 8;
    public static final int MD5_FIELD_NUMBER = 4;
    public static final int MODULE_ID_FIELD_NUMBER = 15;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<ModuleReply> PARSER = null;
    public static final int POOL_ID_FIELD_NUMBER = 14;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 13;
    public static final int TOTAL_MD5_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_ID_FIELD_NUMBER = 16;
    public static final int ZIP_CHECK_FIELD_NUMBER = 18;
    private int compress_;
    private long downloadStrategy_;
    private long experimentStrategy_;
    private long fileId_;
    private long fileSize_;
    private int increment_;
    private boolean isWifi_;
    private int level_;
    private long moduleId_;
    private long poolId_;
    private long publishTime_;
    private long versionId_;
    private long version_;
    private boolean zipCheck_;
    private String name_ = "";
    private String url_ = "";
    private String md5_ = "";
    private String totalMd5_ = "";
    private String filename_ = "";
    private String fileType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.resource.v1.ModuleReply$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C65731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16590xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16590xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16590xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16590xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16590xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16590xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16590xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16590xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ModuleReply, Builder> implements ModuleReplyOrBuilder {
        /* synthetic */ Builder(C65731 c65731) {
            this();
        }

        public Builder clearCompress() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearCompress();
            return this;
        }

        public Builder clearDownloadStrategy() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearDownloadStrategy();
            return this;
        }

        public Builder clearExperimentStrategy() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearExperimentStrategy();
            return this;
        }

        public Builder clearFileId() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearFileId();
            return this;
        }

        public Builder clearFileSize() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearFileSize();
            return this;
        }

        public Builder clearFileType() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearFileType();
            return this;
        }

        public Builder clearFilename() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearFilename();
            return this;
        }

        public Builder clearIncrement() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearIncrement();
            return this;
        }

        public Builder clearIsWifi() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearIsWifi();
            return this;
        }

        public Builder clearLevel() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearLevel();
            return this;
        }

        public Builder clearMd5() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearMd5();
            return this;
        }

        public Builder clearModuleId() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearModuleId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearName();
            return this;
        }

        public Builder clearPoolId() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearPoolId();
            return this;
        }

        public Builder clearPublishTime() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearPublishTime();
            return this;
        }

        public Builder clearTotalMd5() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearTotalMd5();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearUrl();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearVersion();
            return this;
        }

        public Builder clearVersionId() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearVersionId();
            return this;
        }

        public Builder clearZipCheck() {
            copyOnWrite();
            ((ModuleReply) this.instance).clearZipCheck();
            return this;
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public CompressType getCompress() {
            return ((ModuleReply) this.instance).getCompress();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public int getCompressValue() {
            return ((ModuleReply) this.instance).getCompressValue();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getDownloadStrategy() {
            return ((ModuleReply) this.instance).getDownloadStrategy();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getExperimentStrategy() {
            return ((ModuleReply) this.instance).getExperimentStrategy();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getFileId() {
            return ((ModuleReply) this.instance).getFileId();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getFileSize() {
            return ((ModuleReply) this.instance).getFileSize();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public String getFileType() {
            return ((ModuleReply) this.instance).getFileType();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public ByteString getFileTypeBytes() {
            return ((ModuleReply) this.instance).getFileTypeBytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public String getFilename() {
            return ((ModuleReply) this.instance).getFilename();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public ByteString getFilenameBytes() {
            return ((ModuleReply) this.instance).getFilenameBytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public IncrementType getIncrement() {
            return ((ModuleReply) this.instance).getIncrement();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public int getIncrementValue() {
            return ((ModuleReply) this.instance).getIncrementValue();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public boolean getIsWifi() {
            return ((ModuleReply) this.instance).getIsWifi();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public LevelType getLevel() {
            return ((ModuleReply) this.instance).getLevel();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public int getLevelValue() {
            return ((ModuleReply) this.instance).getLevelValue();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public String getMd5() {
            return ((ModuleReply) this.instance).getMd5();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public ByteString getMd5Bytes() {
            return ((ModuleReply) this.instance).getMd5Bytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getModuleId() {
            return ((ModuleReply) this.instance).getModuleId();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public String getName() {
            return ((ModuleReply) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public ByteString getNameBytes() {
            return ((ModuleReply) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getPoolId() {
            return ((ModuleReply) this.instance).getPoolId();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getPublishTime() {
            return ((ModuleReply) this.instance).getPublishTime();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public String getTotalMd5() {
            return ((ModuleReply) this.instance).getTotalMd5();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public ByteString getTotalMd5Bytes() {
            return ((ModuleReply) this.instance).getTotalMd5Bytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public String getUrl() {
            return ((ModuleReply) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public ByteString getUrlBytes() {
            return ((ModuleReply) this.instance).getUrlBytes();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getVersion() {
            return ((ModuleReply) this.instance).getVersion();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public long getVersionId() {
            return ((ModuleReply) this.instance).getVersionId();
        }

        @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
        public boolean getZipCheck() {
            return ((ModuleReply) this.instance).getZipCheck();
        }

        public Builder setCompress(CompressType compressType) {
            copyOnWrite();
            ((ModuleReply) this.instance).setCompress(compressType);
            return this;
        }

        public Builder setCompressValue(int i) {
            copyOnWrite();
            ((ModuleReply) this.instance).setCompressValue(i);
            return this;
        }

        public Builder setDownloadStrategy(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setDownloadStrategy(j);
            return this;
        }

        public Builder setExperimentStrategy(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setExperimentStrategy(j);
            return this;
        }

        public Builder setFileId(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setFileId(j);
            return this;
        }

        public Builder setFileSize(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setFileSize(j);
            return this;
        }

        public Builder setFileType(String str) {
            copyOnWrite();
            ((ModuleReply) this.instance).setFileType(str);
            return this;
        }

        public Builder setFileTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleReply) this.instance).setFileTypeBytes(byteString);
            return this;
        }

        public Builder setFilename(String str) {
            copyOnWrite();
            ((ModuleReply) this.instance).setFilename(str);
            return this;
        }

        public Builder setFilenameBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleReply) this.instance).setFilenameBytes(byteString);
            return this;
        }

        public Builder setIncrement(IncrementType incrementType) {
            copyOnWrite();
            ((ModuleReply) this.instance).setIncrement(incrementType);
            return this;
        }

        public Builder setIncrementValue(int i) {
            copyOnWrite();
            ((ModuleReply) this.instance).setIncrementValue(i);
            return this;
        }

        public Builder setIsWifi(boolean z) {
            copyOnWrite();
            ((ModuleReply) this.instance).setIsWifi(z);
            return this;
        }

        public Builder setLevel(LevelType levelType) {
            copyOnWrite();
            ((ModuleReply) this.instance).setLevel(levelType);
            return this;
        }

        public Builder setLevelValue(int i) {
            copyOnWrite();
            ((ModuleReply) this.instance).setLevelValue(i);
            return this;
        }

        public Builder setMd5(String str) {
            copyOnWrite();
            ((ModuleReply) this.instance).setMd5(str);
            return this;
        }

        public Builder setMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleReply) this.instance).setMd5Bytes(byteString);
            return this;
        }

        public Builder setModuleId(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setModuleId(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((ModuleReply) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleReply) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPoolId(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setPoolId(j);
            return this;
        }

        public Builder setPublishTime(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setPublishTime(j);
            return this;
        }

        public Builder setTotalMd5(String str) {
            copyOnWrite();
            ((ModuleReply) this.instance).setTotalMd5(str);
            return this;
        }

        public Builder setTotalMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleReply) this.instance).setTotalMd5Bytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((ModuleReply) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleReply) this.instance).setUrlBytes(byteString);
            return this;
        }

        public Builder setVersion(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setVersion(j);
            return this;
        }

        public Builder setVersionId(long j) {
            copyOnWrite();
            ((ModuleReply) this.instance).setVersionId(j);
            return this;
        }

        public Builder setZipCheck(boolean z) {
            copyOnWrite();
            ((ModuleReply) this.instance).setZipCheck(z);
            return this;
        }

        private Builder() {
            super(ModuleReply.DEFAULT_INSTANCE);
        }
    }

    static {
        ModuleReply moduleReply = new ModuleReply();
        DEFAULT_INSTANCE = moduleReply;
        GeneratedMessageLite.registerDefaultInstance(ModuleReply.class, moduleReply);
    }

    private ModuleReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCompress() {
        this.compress_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloadStrategy() {
        this.downloadStrategy_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentStrategy() {
        this.experimentStrategy_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileId() {
        this.fileId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileSize() {
        this.fileSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileType() {
        this.fileType_ = getDefaultInstance().getFileType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilename() {
        this.filename_ = getDefaultInstance().getFilename();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncrement() {
        this.increment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsWifi() {
        this.isWifi_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMd5() {
        this.md5_ = getDefaultInstance().getMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModuleId() {
        this.moduleId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoolId() {
        this.poolId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublishTime() {
        this.publishTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalMd5() {
        this.totalMd5_ = getDefaultInstance().getTotalMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionId() {
        this.versionId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZipCheck() {
        this.zipCheck_ = false;
    }

    public static ModuleReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ModuleReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ModuleReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModuleReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ModuleReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompress(CompressType compressType) {
        this.compress_ = compressType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompressValue(int i) {
        this.compress_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloadStrategy(long j) {
        this.downloadStrategy_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentStrategy(long j) {
        this.experimentStrategy_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileId(long j) {
        this.fileId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileSize(long j) {
        this.fileSize_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileType(String str) {
        str.getClass();
        this.fileType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilename(String str) {
        str.getClass();
        this.filename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.filename_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncrement(IncrementType incrementType) {
        this.increment_ = incrementType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncrementValue(int i) {
        this.increment_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsWifi(boolean z) {
        this.isWifi_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(LevelType levelType) {
        this.level_ = levelType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelValue(int i) {
        this.level_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5(String str) {
        str.getClass();
        this.md5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.md5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModuleId(long j) {
        this.moduleId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoolId(long j) {
        this.poolId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublishTime(long j) {
        this.publishTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalMd5(String str) {
        str.getClass();
        this.totalMd5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.totalMd5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(long j) {
        this.version_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionId(long j) {
        this.versionId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipCheck(boolean z) {
        this.zipCheck_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65731.f16590xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ModuleReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\f\u0007\u0007\b\f\t\u0208\n\u0208\u000b\u0002\f\f\r\u0002\u000e\u0002\u000f\u0002\u0010\u0002\u0011\u0002\u0012\u0007\u0013\u0002\u0014\u0002", new Object[]{"name_", "version_", "url_", "md5_", "totalMd5_", "increment_", "isWifi_", "level_", "filename_", "fileType_", "fileSize_", "compress_", "publishTime_", "poolId_", "moduleId_", "versionId_", "fileId_", "zipCheck_", "downloadStrategy_", "experimentStrategy_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ModuleReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ModuleReply.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public CompressType getCompress() {
        CompressType forNumber = CompressType.forNumber(this.compress_);
        return forNumber == null ? CompressType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public int getCompressValue() {
        return this.compress_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getDownloadStrategy() {
        return this.downloadStrategy_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getExperimentStrategy() {
        return this.experimentStrategy_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getFileId() {
        return this.fileId_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getFileSize() {
        return this.fileSize_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public String getFileType() {
        return this.fileType_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public ByteString getFileTypeBytes() {
        return ByteString.copyFromUtf8(this.fileType_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public String getFilename() {
        return this.filename_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public ByteString getFilenameBytes() {
        return ByteString.copyFromUtf8(this.filename_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public IncrementType getIncrement() {
        IncrementType forNumber = IncrementType.forNumber(this.increment_);
        return forNumber == null ? IncrementType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public int getIncrementValue() {
        return this.increment_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public boolean getIsWifi() {
        return this.isWifi_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public LevelType getLevel() {
        LevelType forNumber = LevelType.forNumber(this.level_);
        return forNumber == null ? LevelType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public int getLevelValue() {
        return this.level_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public String getMd5() {
        return this.md5_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public ByteString getMd5Bytes() {
        return ByteString.copyFromUtf8(this.md5_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getModuleId() {
        return this.moduleId_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getPoolId() {
        return this.poolId_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getPublishTime() {
        return this.publishTime_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public String getTotalMd5() {
        return this.totalMd5_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public ByteString getTotalMd5Bytes() {
        return ByteString.copyFromUtf8(this.totalMd5_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getVersion() {
        return this.version_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public long getVersionId() {
        return this.versionId_;
    }

    @Override // com.bapis.bilibili.app.resource.v1.ModuleReplyOrBuilder
    public boolean getZipCheck() {
        return this.zipCheck_;
    }

    public static Builder newBuilder(ModuleReply moduleReply) {
        return DEFAULT_INSTANCE.createBuilder(moduleReply);
    }

    public static ModuleReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModuleReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ModuleReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ModuleReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ModuleReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModuleReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ModuleReply parseFrom(InputStream inputStream) throws IOException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModuleReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModuleReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ModuleReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
