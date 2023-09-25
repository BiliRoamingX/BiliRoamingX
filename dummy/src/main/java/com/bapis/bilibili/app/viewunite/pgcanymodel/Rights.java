package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class Rights extends GeneratedMessageLite<Rights, Rights.Builder> implements MessageLiteOrBuilder {
    public static final int ALLOW_BP_FIELD_NUMBER = 7;
    public static final int ALLOW_BP_RANK_FIELD_NUMBER = 12;
    public static final int ALLOW_DOWNLOAD_FIELD_NUMBER = 1;
    public static final int ALLOW_REVIEW_FIELD_NUMBER = 2;
    public static final int AREA_LIMIT_FIELD_NUMBER = 8;
    public static final int BAN_AREA_SHOW_FIELD_NUMBER = 10;
    public static final int CAN_WATCH_FIELD_NUMBER = 3;
    public static final int COPYRIGHT_FIELD_NUMBER = 5;
    public static final int COPYRIGHT_NAME_FIELD_NUMBER = 6;
    private static final Rights DEFAULT_INSTANCE;
    public static final int FORBID_PRE_FIELD_NUMBER = 14;
    public static final int IS_COVER_SHOW_FIELD_NUMBER = 4;
    public static final int IS_PREVIEW_FIELD_NUMBER = 9;
    public static final int NEW_ALLOW_DOWNLOAD_FIELD_NUMBER = 16;
    public static final int ONLY_VIP_DOWNLOAD_FIELD_NUMBER = 15;
    private static volatile Parser<Rights> PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 13;
    public static final int WATCH_PLATFORM_FIELD_NUMBER = 11;
    private int allowBpRank_;
    private int allowBp_;
    private int allowDownload_;
    private int allowReview_;
    private int areaLimit_;
    private int banAreaShow_;
    private int canWatch_;
    private int forbidPre_;
    private int isCoverShow_;
    private int isPreview_;
    private int newAllowDownload_;
    private int onlyVipDownload_;
    private int watchPlatform_;
    private String copyright_ = "";
    private String copyrightName_ = "";
    private String resource_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.Rights$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17073xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17073xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17073xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Rights, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70961 c70961) {
            this();
        }

        public Builder clearAllowBp() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowBp();
            return this;
        }

        public Builder clearAllowBpRank() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowBpRank();
            return this;
        }

        public Builder clearAllowDownload() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowDownload();
            return this;
        }

        public Builder clearAllowReview() {
            copyOnWrite();
            ((Rights) this.instance).clearAllowReview();
            return this;
        }

        public Builder clearAreaLimit() {
            copyOnWrite();
            ((Rights) this.instance).clearAreaLimit();
            return this;
        }

        public Builder clearBanAreaShow() {
            copyOnWrite();
            ((Rights) this.instance).clearBanAreaShow();
            return this;
        }

        public Builder clearCanWatch() {
            copyOnWrite();
            ((Rights) this.instance).clearCanWatch();
            return this;
        }

        public Builder clearCopyright() {
            copyOnWrite();
            ((Rights) this.instance).clearCopyright();
            return this;
        }

        public Builder clearCopyrightName() {
            copyOnWrite();
            ((Rights) this.instance).clearCopyrightName();
            return this;
        }

        public Builder clearForbidPre() {
            copyOnWrite();
            ((Rights) this.instance).clearForbidPre();
            return this;
        }

        public Builder clearIsCoverShow() {
            copyOnWrite();
            ((Rights) this.instance).clearIsCoverShow();
            return this;
        }

        public Builder clearIsPreview() {
            copyOnWrite();
            ((Rights) this.instance).clearIsPreview();
            return this;
        }

        public Builder clearNewAllowDownload() {
            copyOnWrite();
            ((Rights) this.instance).clearNewAllowDownload();
            return this;
        }

        public Builder clearOnlyVipDownload() {
            copyOnWrite();
            ((Rights) this.instance).clearOnlyVipDownload();
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((Rights) this.instance).clearResource();
            return this;
        }

        public Builder clearWatchPlatform() {
            copyOnWrite();
            ((Rights) this.instance).clearWatchPlatform();
            return this;
        }

        public int getAllowBp() {
            return ((Rights) this.instance).getAllowBp();
        }

        public int getAllowBpRank() {
            return ((Rights) this.instance).getAllowBpRank();
        }

        public int getAllowDownload() {
            return ((Rights) this.instance).getAllowDownload();
        }

        public int getAllowReview() {
            return ((Rights) this.instance).getAllowReview();
        }

        public int getAreaLimit() {
            return ((Rights) this.instance).getAreaLimit();
        }

        public int getBanAreaShow() {
            return ((Rights) this.instance).getBanAreaShow();
        }

        public int getCanWatch() {
            return ((Rights) this.instance).getCanWatch();
        }

        public String getCopyright() {
            return ((Rights) this.instance).getCopyright();
        }

        public ByteString getCopyrightBytes() {
            return ((Rights) this.instance).getCopyrightBytes();
        }

        public String getCopyrightName() {
            return ((Rights) this.instance).getCopyrightName();
        }

        public ByteString getCopyrightNameBytes() {
            return ((Rights) this.instance).getCopyrightNameBytes();
        }

        public int getForbidPre() {
            return ((Rights) this.instance).getForbidPre();
        }

        public int getIsCoverShow() {
            return ((Rights) this.instance).getIsCoverShow();
        }

        public int getIsPreview() {
            return ((Rights) this.instance).getIsPreview();
        }

        public int getNewAllowDownload() {
            return ((Rights) this.instance).getNewAllowDownload();
        }

        public int getOnlyVipDownload() {
            return ((Rights) this.instance).getOnlyVipDownload();
        }

        public String getResource() {
            return ((Rights) this.instance).getResource();
        }

        public ByteString getResourceBytes() {
            return ((Rights) this.instance).getResourceBytes();
        }

        public int getWatchPlatform() {
            return ((Rights) this.instance).getWatchPlatform();
        }

        public Builder setAllowBp(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowBp(i);
            return this;
        }

        public Builder setAllowBpRank(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowBpRank(i);
            return this;
        }

        public Builder setAllowDownload(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowDownload(i);
            return this;
        }

        public Builder setAllowReview(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAllowReview(i);
            return this;
        }

        public Builder setAreaLimit(int i) {
            copyOnWrite();
            ((Rights) this.instance).setAreaLimit(i);
            return this;
        }

        public Builder setBanAreaShow(int i) {
            copyOnWrite();
            ((Rights) this.instance).setBanAreaShow(i);
            return this;
        }

        public Builder setCanWatch(int i) {
            copyOnWrite();
            ((Rights) this.instance).setCanWatch(i);
            return this;
        }

        public Builder setCopyright(String str) {
            copyOnWrite();
            ((Rights) this.instance).setCopyright(str);
            return this;
        }

        public Builder setCopyrightBytes(ByteString byteString) {
            copyOnWrite();
            ((Rights) this.instance).setCopyrightBytes(byteString);
            return this;
        }

        public Builder setCopyrightName(String str) {
            copyOnWrite();
            ((Rights) this.instance).setCopyrightName(str);
            return this;
        }

        public Builder setCopyrightNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Rights) this.instance).setCopyrightNameBytes(byteString);
            return this;
        }

        public Builder setForbidPre(int i) {
            copyOnWrite();
            ((Rights) this.instance).setForbidPre(i);
            return this;
        }

        public Builder setIsCoverShow(int i) {
            copyOnWrite();
            ((Rights) this.instance).setIsCoverShow(i);
            return this;
        }

        public Builder setIsPreview(int i) {
            copyOnWrite();
            ((Rights) this.instance).setIsPreview(i);
            return this;
        }

        public Builder setNewAllowDownload(int i) {
            copyOnWrite();
            ((Rights) this.instance).setNewAllowDownload(i);
            return this;
        }

        public Builder setOnlyVipDownload(int i) {
            copyOnWrite();
            ((Rights) this.instance).setOnlyVipDownload(i);
            return this;
        }

        public Builder setResource(String str) {
            copyOnWrite();
            ((Rights) this.instance).setResource(str);
            return this;
        }

        public Builder setResourceBytes(ByteString byteString) {
            copyOnWrite();
            ((Rights) this.instance).setResourceBytes(byteString);
            return this;
        }

        public Builder setWatchPlatform(int i) {
            copyOnWrite();
            ((Rights) this.instance).setWatchPlatform(i);
            return this;
        }

        private Builder() {
            super(Rights.DEFAULT_INSTANCE);
        }
    }

    static {
        Rights rights = new Rights();
        DEFAULT_INSTANCE = rights;
        GeneratedMessageLite.registerDefaultInstance(Rights.class, rights);
    }

    public Rights() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowBp() {
        this.allowBp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowBpRank() {
        this.allowBpRank_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowDownload() {
        this.allowDownload_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowReview() {
        this.allowReview_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreaLimit() {
        this.areaLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBanAreaShow() {
        this.banAreaShow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanWatch() {
        this.canWatch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyright() {
        this.copyright_ = getDefaultInstance().getCopyright();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyrightName() {
        this.copyrightName_ = getDefaultInstance().getCopyrightName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForbidPre() {
        this.forbidPre_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCoverShow() {
        this.isCoverShow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPreview() {
        this.isPreview_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAllowDownload() {
        this.newAllowDownload_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlyVipDownload() {
        this.onlyVipDownload_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = getDefaultInstance().getResource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchPlatform() {
        this.watchPlatform_ = 0;
    }

    public static Rights getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Rights parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rights parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Rights> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowBp(int i) {
        this.allowBp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowBpRank(int i) {
        this.allowBpRank_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowDownload(int i) {
        this.allowDownload_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowReview(int i) {
        this.allowReview_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaLimit(int i) {
        this.areaLimit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBanAreaShow(int i) {
        this.banAreaShow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanWatch(int i) {
        this.canWatch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyright(String str) {
        str.getClass();
        this.copyright_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.copyright_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrightName(String str) {
        str.getClass();
        this.copyrightName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrightNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.copyrightName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForbidPre(int i) {
        this.forbidPre_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCoverShow(int i) {
        this.isCoverShow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreview(int i) {
        this.isPreview_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAllowDownload(int i) {
        this.newAllowDownload_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlyVipDownload(int i) {
        this.onlyVipDownload_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(String str) {
        str.getClass();
        this.resource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resource_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchPlatform(int i) {
        this.watchPlatform_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70961.f17073xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Rights();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0004\f\u0004\r\u0208\u000e\u0004\u000f\u0004\u0010\u0004", new Object[]{"allowDownload_", "allowReview_", "canWatch_", "isCoverShow_", "copyright_", "copyrightName_", "allowBp_", "areaLimit_", "isPreview_", "banAreaShow_", "watchPlatform_", "allowBpRank_", "resource_", "forbidPre_", "onlyVipDownload_", "newAllowDownload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Rights> parser = PARSER;
                if (parser == null) {
                    synchronized (Rights.class) {
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

    public int getAllowBp() {
        return this.allowBp_;
    }

    public int getAllowBpRank() {
        return this.allowBpRank_;
    }

    public int getAllowDownload() {
        return this.allowDownload_;
    }

    public int getAllowReview() {
        return this.allowReview_;
    }

    public int getAreaLimit() {
        return this.areaLimit_;
    }

    public int getBanAreaShow() {
        return this.banAreaShow_;
    }

    public int getCanWatch() {
        return this.canWatch_;
    }

    public String getCopyright() {
        return this.copyright_;
    }

    public ByteString getCopyrightBytes() {
        return ByteString.copyFromUtf8(this.copyright_);
    }

    public String getCopyrightName() {
        return this.copyrightName_;
    }

    public ByteString getCopyrightNameBytes() {
        return ByteString.copyFromUtf8(this.copyrightName_);
    }

    public int getForbidPre() {
        return this.forbidPre_;
    }

    public int getIsCoverShow() {
        return this.isCoverShow_;
    }

    public int getIsPreview() {
        return this.isPreview_;
    }

    public int getNewAllowDownload() {
        return this.newAllowDownload_;
    }

    public int getOnlyVipDownload() {
        return this.onlyVipDownload_;
    }

    public String getResource() {
        return this.resource_;
    }

    public ByteString getResourceBytes() {
        return ByteString.copyFromUtf8(this.resource_);
    }

    public int getWatchPlatform() {
        return this.watchPlatform_;
    }

    public static Builder newBuilder(Rights rights) {
        return DEFAULT_INSTANCE.createBuilder(rights);
    }

    public static Rights parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rights parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Rights parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Rights parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Rights parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Rights parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Rights parseFrom(InputStream inputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rights parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rights parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Rights parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rights) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
