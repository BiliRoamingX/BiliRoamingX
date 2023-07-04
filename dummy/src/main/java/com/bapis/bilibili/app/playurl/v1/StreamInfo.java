package com.bapis.bilibili.app.playurl.v1;

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
/* loaded from: classes13.dex */
public final class StreamInfo extends GeneratedMessageLite<StreamInfo, StreamInfo.Builder> implements MessageLiteOrBuilder {
    public static final int ATTRIBUTE_FIELD_NUMBER = 10;
    private static final StreamInfo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_DESC_FIELD_NUMBER = 12;
    public static final int ERR_CODE_FIELD_NUMBER = 4;
    public static final int FORMAT_FIELD_NUMBER = 2;
    public static final int INTACT_FIELD_NUMBER = 8;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int NEED_LOGIN_FIELD_NUMBER = 7;
    public static final int NEED_VIP_FIELD_NUMBER = 6;
    public static final int NEW_DESCRIPTION_FIELD_NUMBER = 11;
    public static final int NO_REXCODE_FIELD_NUMBER = 9;
    private static volatile Parser<StreamInfo> PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 1;
    public static final int SCHEME_FIELD_NUMBER = 16;
    public static final int SUBTITLE_FIELD_NUMBER = 15;
    public static final int SUPERSCRIPT_FIELD_NUMBER = 13;
    public static final int SUPPORT_DRM_FIELD_NUMBER = 17;
    public static final int VIP_FREE_FIELD_NUMBER = 14;
    private long attribute_;
    private int errCode_;
    private boolean intact_;
    private StreamLimit limit_;
    private boolean needLogin_;
    private boolean needVip_;
    private boolean noRexcode_;
    private int quality_;
    private Scheme scheme_;
    private boolean supportDrm_;
    private boolean vipFree_;
    private String format_ = "";
    private String description_ = "";
    private String newDescription_ = "";
    private String displayDesc_ = "";
    private String superscript_ = "";
    private String subtitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.StreamInfo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65191 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16549xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16549xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16549xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16549xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16549xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16549xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16549xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16549xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StreamInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65191 c65191) {
            this();
        }

        public Builder clearAttribute() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearAttribute();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayDesc() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearDisplayDesc();
            return this;
        }

        public Builder clearErrCode() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearErrCode();
            return this;
        }

        public Builder clearFormat() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearFormat();
            return this;
        }

        public Builder clearIntact() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearIntact();
            return this;
        }

        public Builder clearLimit() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearLimit();
            return this;
        }

        public Builder clearNeedLogin() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearNeedLogin();
            return this;
        }

        public Builder clearNeedVip() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearNeedVip();
            return this;
        }

        public Builder clearNewDescription() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearNewDescription();
            return this;
        }

        public Builder clearNoRexcode() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearNoRexcode();
            return this;
        }

        public Builder clearQuality() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearQuality();
            return this;
        }

        public Builder clearScheme() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearScheme();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearSuperscript() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearSuperscript();
            return this;
        }

        public Builder clearSupportDrm() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearSupportDrm();
            return this;
        }

        public Builder clearVipFree() {
            copyOnWrite();
            ((StreamInfo) this.instance).clearVipFree();
            return this;
        }

        public long getAttribute() {
            return ((StreamInfo) this.instance).getAttribute();
        }

        public String getDescription() {
            return ((StreamInfo) this.instance).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((StreamInfo) this.instance).getDescriptionBytes();
        }

        public String getDisplayDesc() {
            return ((StreamInfo) this.instance).getDisplayDesc();
        }

        public ByteString getDisplayDescBytes() {
            return ((StreamInfo) this.instance).getDisplayDescBytes();
        }

        public PlayErr getErrCode() {
            return ((StreamInfo) this.instance).getErrCode();
        }

        public int getErrCodeValue() {
            return ((StreamInfo) this.instance).getErrCodeValue();
        }

        public String getFormat() {
            return ((StreamInfo) this.instance).getFormat();
        }

        public ByteString getFormatBytes() {
            return ((StreamInfo) this.instance).getFormatBytes();
        }

        public boolean getIntact() {
            return ((StreamInfo) this.instance).getIntact();
        }

        public StreamLimit getLimit() {
            return ((StreamInfo) this.instance).getLimit();
        }

        public boolean getNeedLogin() {
            return ((StreamInfo) this.instance).getNeedLogin();
        }

        public boolean getNeedVip() {
            return ((StreamInfo) this.instance).getNeedVip();
        }

        public String getNewDescription() {
            return ((StreamInfo) this.instance).getNewDescription();
        }

        public ByteString getNewDescriptionBytes() {
            return ((StreamInfo) this.instance).getNewDescriptionBytes();
        }

        public boolean getNoRexcode() {
            return ((StreamInfo) this.instance).getNoRexcode();
        }

        public int getQuality() {
            return ((StreamInfo) this.instance).getQuality();
        }

        public Scheme getScheme() {
            return ((StreamInfo) this.instance).getScheme();
        }

        public String getSubtitle() {
            return ((StreamInfo) this.instance).getSubtitle();
        }

        public ByteString getSubtitleBytes() {
            return ((StreamInfo) this.instance).getSubtitleBytes();
        }

        public String getSuperscript() {
            return ((StreamInfo) this.instance).getSuperscript();
        }

        public ByteString getSuperscriptBytes() {
            return ((StreamInfo) this.instance).getSuperscriptBytes();
        }

        public boolean getSupportDrm() {
            return ((StreamInfo) this.instance).getSupportDrm();
        }

        public boolean getVipFree() {
            return ((StreamInfo) this.instance).getVipFree();
        }

        public boolean hasLimit() {
            return ((StreamInfo) this.instance).hasLimit();
        }

        public boolean hasScheme() {
            return ((StreamInfo) this.instance).hasScheme();
        }

        public Builder mergeLimit(StreamLimit streamLimit) {
            copyOnWrite();
            ((StreamInfo) this.instance).mergeLimit(streamLimit);
            return this;
        }

        public Builder mergeScheme(Scheme scheme) {
            copyOnWrite();
            ((StreamInfo) this.instance).mergeScheme(scheme);
            return this;
        }

        public Builder setAttribute(long j) {
            copyOnWrite();
            ((StreamInfo) this.instance).setAttribute(j);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((StreamInfo) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamInfo) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setDisplayDesc(String str) {
            copyOnWrite();
            ((StreamInfo) this.instance).setDisplayDesc(str);
            return this;
        }

        public Builder setDisplayDescBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamInfo) this.instance).setDisplayDescBytes(byteString);
            return this;
        }

        public Builder setErrCode(PlayErr playErr) {
            copyOnWrite();
            ((StreamInfo) this.instance).setErrCode(playErr);
            return this;
        }

        public Builder setErrCodeValue(int i) {
            copyOnWrite();
            ((StreamInfo) this.instance).setErrCodeValue(i);
            return this;
        }

        public Builder setFormat(String str) {
            copyOnWrite();
            ((StreamInfo) this.instance).setFormat(str);
            return this;
        }

        public Builder setFormatBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamInfo) this.instance).setFormatBytes(byteString);
            return this;
        }

        public Builder setIntact(boolean z) {
            copyOnWrite();
            ((StreamInfo) this.instance).setIntact(z);
            return this;
        }

        public Builder setLimit(StreamLimit streamLimit) {
            copyOnWrite();
            ((StreamInfo) this.instance).setLimit(streamLimit);
            return this;
        }

        public Builder setNeedLogin(boolean z) {
            copyOnWrite();
            ((StreamInfo) this.instance).setNeedLogin(z);
            return this;
        }

        public Builder setNeedVip(boolean z) {
            copyOnWrite();
            ((StreamInfo) this.instance).setNeedVip(z);
            return this;
        }

        public Builder setNewDescription(String str) {
            copyOnWrite();
            ((StreamInfo) this.instance).setNewDescription(str);
            return this;
        }

        public Builder setNewDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamInfo) this.instance).setNewDescriptionBytes(byteString);
            return this;
        }

        public Builder setNoRexcode(boolean z) {
            copyOnWrite();
            ((StreamInfo) this.instance).setNoRexcode(z);
            return this;
        }

        public Builder setQuality(int i) {
            copyOnWrite();
            ((StreamInfo) this.instance).setQuality(i);
            return this;
        }

        public Builder setScheme(Scheme scheme) {
            copyOnWrite();
            ((StreamInfo) this.instance).setScheme(scheme);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((StreamInfo) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamInfo) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public Builder setSuperscript(String str) {
            copyOnWrite();
            ((StreamInfo) this.instance).setSuperscript(str);
            return this;
        }

        public Builder setSuperscriptBytes(ByteString byteString) {
            copyOnWrite();
            ((StreamInfo) this.instance).setSuperscriptBytes(byteString);
            return this;
        }

        public Builder setSupportDrm(boolean z) {
            copyOnWrite();
            ((StreamInfo) this.instance).setSupportDrm(z);
            return this;
        }

        public Builder setVipFree(boolean z) {
            copyOnWrite();
            ((StreamInfo) this.instance).setVipFree(z);
            return this;
        }

        private Builder() {
            super(StreamInfo.DEFAULT_INSTANCE);
        }

        public Builder setLimit(StreamLimit.Builder builder) {
            copyOnWrite();
            ((StreamInfo) this.instance).setLimit(builder.build());
            return this;
        }

        public Builder setScheme(Scheme.Builder builder) {
            copyOnWrite();
            ((StreamInfo) this.instance).setScheme(builder.build());
            return this;
        }
    }

    static {
        StreamInfo streamInfo = new StreamInfo();
        DEFAULT_INSTANCE = streamInfo;
        GeneratedMessageLite.registerDefaultInstance(StreamInfo.class, streamInfo);
    }

    private StreamInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttribute() {
        this.attribute_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayDesc() {
        this.displayDesc_ = getDefaultInstance().getDisplayDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrCode() {
        this.errCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormat() {
        this.format_ = getDefaultInstance().getFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntact() {
        this.intact_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.limit_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedLogin() {
        this.needLogin_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeedVip() {
        this.needVip_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewDescription() {
        this.newDescription_ = getDefaultInstance().getNewDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoRexcode() {
        this.noRexcode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScheme() {
        this.scheme_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuperscript() {
        this.superscript_ = getDefaultInstance().getSuperscript();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportDrm() {
        this.supportDrm_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipFree() {
        this.vipFree_ = false;
    }

    public static StreamInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLimit(StreamLimit streamLimit) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScheme(Scheme scheme) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StreamInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StreamInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StreamInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StreamInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttribute(long j) {
        this.attribute_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayDesc(String str) {
        str.getClass();
        this.displayDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.displayDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrCode(PlayErr playErr) {
        this.errCode_ = playErr.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrCodeValue(int i) {
        this.errCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormat(String str) {
        str.getClass();
        this.format_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormatBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.format_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntact(boolean z) {
        this.intact_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(StreamLimit streamLimit) {
        streamLimit.getClass();
        this.limit_ = streamLimit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedLogin(boolean z) {
        this.needLogin_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeedVip(boolean z) {
        this.needVip_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewDescription(String str) {
        str.getClass();
        this.newDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.newDescription_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoRexcode(boolean z) {
        this.noRexcode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(int i) {
        this.quality_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheme(Scheme scheme) {
        scheme.getClass();
        this.scheme_ = scheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuperscript(String str) {
        str.getClass();
        this.superscript_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuperscriptBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.superscript_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportDrm(boolean z) {
        this.supportDrm_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipFree(boolean z) {
        this.vipFree_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65191.f16549xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new StreamInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\u000b\u0002\u0208\u0003\u0208\u0004\f\u0005\t\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0002\u000b\u0208\f\u0208\r\u0208\u000e\u0007\u000f\u0208\u0010\t\u0011\u0007", new Object[]{"quality_", "format_", "description_", "errCode_", "limit_", "needVip_", "needLogin_", "intact_", "noRexcode_", "attribute_", "newDescription_", "displayDesc_", "superscript_", "vipFree_", "subtitle_", "scheme_", "supportDrm_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StreamInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (StreamInfo.class) {
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

    public long getAttribute() {
        return this.attribute_;
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getDisplayDesc() {
        return this.displayDesc_;
    }

    public ByteString getDisplayDescBytes() {
        return ByteString.copyFromUtf8(this.displayDesc_);
    }

    public PlayErr getErrCode() {
        PlayErr forNumber = PlayErr.forNumber(this.errCode_);
        return forNumber == null ? PlayErr.UNRECOGNIZED : forNumber;
    }

    public int getErrCodeValue() {
        return this.errCode_;
    }

    public String getFormat() {
        return this.format_;
    }

    public ByteString getFormatBytes() {
        return ByteString.copyFromUtf8(this.format_);
    }

    public boolean getIntact() {
        return this.intact_;
    }

    public StreamLimit getLimit() {
        StreamLimit streamLimit = this.limit_;
        return streamLimit == null ? StreamLimit.getDefaultInstance() : streamLimit;
    }

    public boolean getNeedLogin() {
        return this.needLogin_;
    }

    public boolean getNeedVip() {
        return this.needVip_;
    }

    public String getNewDescription() {
        return this.newDescription_;
    }

    public ByteString getNewDescriptionBytes() {
        return ByteString.copyFromUtf8(this.newDescription_);
    }

    public boolean getNoRexcode() {
        return this.noRexcode_;
    }

    public int getQuality() {
        return this.quality_;
    }

    public Scheme getScheme() {
        Scheme scheme = this.scheme_;
        return scheme == null ? Scheme.getDefaultInstance() : scheme;
    }

    public String getSubtitle() {
        return this.subtitle_;
    }

    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    public String getSuperscript() {
        return this.superscript_;
    }

    public ByteString getSuperscriptBytes() {
        return ByteString.copyFromUtf8(this.superscript_);
    }

    public boolean getSupportDrm() {
        return this.supportDrm_;
    }

    public boolean getVipFree() {
        return this.vipFree_;
    }

    public boolean hasLimit() {
        return this.limit_ != null;
    }

    public boolean hasScheme() {
        return this.scheme_ != null;
    }

    public static Builder newBuilder(StreamInfo streamInfo) {
        return DEFAULT_INSTANCE.createBuilder(streamInfo);
    }

    public static StreamInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StreamInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StreamInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StreamInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StreamInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StreamInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StreamInfo parseFrom(InputStream inputStream) throws IOException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StreamInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StreamInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StreamInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setNeedVip
     */
    static void access$1500(StreamInfo streamInfo, boolean needVip) {
    }

    /**
     * setVipFree
     */
    static void access$3400(StreamInfo streamInfo, boolean vipFree) {
    }
}
