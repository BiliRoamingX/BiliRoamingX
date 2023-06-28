package com.bapis.bilibili.app.view.v1;

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
public final class CacheViewReq extends GeneratedMessageLite<CacheViewReq, CacheViewReq.Builder> implements MessageLiteOrBuilder {
    public static final int AD_EXTRA_FIELD_NUMBER = 5;
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final CacheViewReq DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int FROM_SPMID_FIELD_NUMBER = 7;
    private static volatile Parser<CacheViewReq> PARSER = null;
    public static final int SPMID_FIELD_NUMBER = 6;
    public static final int TRACKID_FIELD_NUMBER = 4;
    private long aid_;
    private String bvid_ = "";
    private String from_ = "";
    private String trackid_ = "";
    private String adExtra_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CacheViewReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16705xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16705xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16705xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16705xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16705xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16705xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16705xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16705xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CacheViewReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67301 c67301) {
            this();
        }

        public Builder clearAdExtra() {
            copyOnWrite();
            ((CacheViewReq) this.instance).clearAdExtra();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((CacheViewReq) this.instance).clearAid();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((CacheViewReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((CacheViewReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((CacheViewReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((CacheViewReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearTrackid() {
            copyOnWrite();
            ((CacheViewReq) this.instance).clearTrackid();
            return this;
        }

        public String getAdExtra() {
            return ((CacheViewReq) this.instance).getAdExtra();
        }

        public ByteString getAdExtraBytes() {
            return ((CacheViewReq) this.instance).getAdExtraBytes();
        }

        public long getAid() {
            return ((CacheViewReq) this.instance).getAid();
        }

        public String getBvid() {
            return ((CacheViewReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((CacheViewReq) this.instance).getBvidBytes();
        }

        public String getFrom() {
            return ((CacheViewReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((CacheViewReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((CacheViewReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((CacheViewReq) this.instance).getFromSpmidBytes();
        }

        public String getSpmid() {
            return ((CacheViewReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((CacheViewReq) this.instance).getSpmidBytes();
        }

        public String getTrackid() {
            return ((CacheViewReq) this.instance).getTrackid();
        }

        public ByteString getTrackidBytes() {
            return ((CacheViewReq) this.instance).getTrackidBytes();
        }

        public Builder setAdExtra(String str) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setAdExtra(str);
            return this;
        }

        public Builder setAdExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setAdExtraBytes(byteString);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setAid(j);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setTrackid(String str) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setTrackid(str);
            return this;
        }

        public Builder setTrackidBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheViewReq) this.instance).setTrackidBytes(byteString);
            return this;
        }

        private Builder() {
            super(CacheViewReq.DEFAULT_INSTANCE);
        }
    }

    static {
        CacheViewReq cacheViewReq = new CacheViewReq();
        DEFAULT_INSTANCE = cacheViewReq;
        GeneratedMessageLite.registerDefaultInstance(CacheViewReq.class, cacheViewReq);
    }

    private CacheViewReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdExtra() {
        this.adExtra_ = getDefaultInstance().getAdExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmid() {
        this.fromSpmid_ = getDefaultInstance().getFromSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackid() {
        this.trackid_ = getDefaultInstance().getTrackid();
    }

    public static CacheViewReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CacheViewReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CacheViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CacheViewReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CacheViewReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtra(String str) {
        str.getClass();
        this.adExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmid(String str) {
        str.getClass();
        this.fromSpmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSpmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackid(String str) {
        str.getClass();
        this.trackid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67301.f16705xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CacheViewReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"aid_", "bvid_", "from_", "trackid_", "adExtra_", "spmid_", "fromSpmid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CacheViewReq> parser = PARSER;
                if (parser == null) {
                    synchronized (CacheViewReq.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public String getAdExtra() {
        return this.adExtra_;
    }

    public ByteString getAdExtraBytes() {
        return ByteString.copyFromUtf8(this.adExtra_);
    }

    public long getAid() {
        return this.aid_;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public String getFromSpmid() {
        return this.fromSpmid_;
    }

    public ByteString getFromSpmidBytes() {
        return ByteString.copyFromUtf8(this.fromSpmid_);
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public String getTrackid() {
        return this.trackid_;
    }

    public ByteString getTrackidBytes() {
        return ByteString.copyFromUtf8(this.trackid_);
    }

    public static Builder newBuilder(CacheViewReq cacheViewReq) {
        return DEFAULT_INSTANCE.createBuilder(cacheViewReq);
    }

    public static CacheViewReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CacheViewReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CacheViewReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CacheViewReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CacheViewReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CacheViewReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CacheViewReq parseFrom(InputStream inputStream) throws IOException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CacheViewReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CacheViewReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CacheViewReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
