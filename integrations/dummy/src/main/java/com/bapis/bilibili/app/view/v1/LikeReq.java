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
public final class LikeReq extends GeneratedMessageLite<LikeReq, LikeReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    private static final LikeReq DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int FROM_SPMID_FIELD_NUMBER = 5;
    public static final int GOTO_FIELD_NUMBER = 7;
    public static final int LIKE_FIELD_NUMBER = 8;
    public static final int OGV_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<LikeReq> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 9;
    public static final int SPMID_FIELD_NUMBER = 4;
    public static final int TOKEN_FIELD_NUMBER = 10;
    public static final int TRACK_ID_FIELD_NUMBER = 6;
    private long aid_;
    private int like_;
    private long ogvType_;
    private String from_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String trackId_ = "";
    private String goto_ = "";
    private String source_ = "";
    private String token_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.LikeReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16755xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16755xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16755xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16755xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16755xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16755xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16755xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16755xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LikeReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67881 c67881) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((LikeReq) this.instance).clearAid();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((LikeReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((LikeReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearGoto() {
            copyOnWrite();
            ((LikeReq) this.instance).clearGoto();
            return this;
        }

        public Builder clearLike() {
            copyOnWrite();
            ((LikeReq) this.instance).clearLike();
            return this;
        }

        public Builder clearOgvType() {
            copyOnWrite();
            ((LikeReq) this.instance).clearOgvType();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((LikeReq) this.instance).clearSource();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((LikeReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearToken() {
            copyOnWrite();
            ((LikeReq) this.instance).clearToken();
            return this;
        }

        public Builder clearTrackId() {
            copyOnWrite();
            ((LikeReq) this.instance).clearTrackId();
            return this;
        }

        public long getAid() {
            return ((LikeReq) this.instance).getAid();
        }

        public String getFrom() {
            return ((LikeReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((LikeReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((LikeReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((LikeReq) this.instance).getFromSpmidBytes();
        }

        public String getGoto() {
            return ((LikeReq) this.instance).getGoto();
        }

        public ByteString getGotoBytes() {
            return ((LikeReq) this.instance).getGotoBytes();
        }

        public int getLike() {
            return ((LikeReq) this.instance).getLike();
        }

        public long getOgvType() {
            return ((LikeReq) this.instance).getOgvType();
        }

        public String getSource() {
            return ((LikeReq) this.instance).getSource();
        }

        public ByteString getSourceBytes() {
            return ((LikeReq) this.instance).getSourceBytes();
        }

        public String getSpmid() {
            return ((LikeReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((LikeReq) this.instance).getSpmidBytes();
        }

        public String getToken() {
            return ((LikeReq) this.instance).getToken();
        }

        public ByteString getTokenBytes() {
            return ((LikeReq) this.instance).getTokenBytes();
        }

        public String getTrackId() {
            return ((LikeReq) this.instance).getTrackId();
        }

        public ByteString getTrackIdBytes() {
            return ((LikeReq) this.instance).getTrackIdBytes();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((LikeReq) this.instance).setAid(j);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((LikeReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((LikeReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setGoto(String str) {
            copyOnWrite();
            ((LikeReq) this.instance).setGoto(str);
            return this;
        }

        public Builder setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReq) this.instance).setGotoBytes(byteString);
            return this;
        }

        public Builder setLike(int i) {
            copyOnWrite();
            ((LikeReq) this.instance).setLike(i);
            return this;
        }

        public Builder setOgvType(long j) {
            copyOnWrite();
            ((LikeReq) this.instance).setOgvType(j);
            return this;
        }

        public Builder setSource(String str) {
            copyOnWrite();
            ((LikeReq) this.instance).setSource(str);
            return this;
        }

        public Builder setSourceBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReq) this.instance).setSourceBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((LikeReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setToken(String str) {
            copyOnWrite();
            ((LikeReq) this.instance).setToken(str);
            return this;
        }

        public Builder setTokenBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReq) this.instance).setTokenBytes(byteString);
            return this;
        }

        public Builder setTrackId(String str) {
            copyOnWrite();
            ((LikeReq) this.instance).setTrackId(str);
            return this;
        }

        public Builder setTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReq) this.instance).setTrackIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(LikeReq.DEFAULT_INSTANCE);
        }
    }

    static {
        LikeReq likeReq = new LikeReq();
        DEFAULT_INSTANCE = likeReq;
        GeneratedMessageLite.registerDefaultInstance(LikeReq.class, likeReq);
    }

    private LikeReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
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
    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLike() {
        this.like_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgvType() {
        this.ogvType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = getDefaultInstance().getSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    public static LikeReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
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
    public void setGoto(String str) {
        str.getClass();
        this.goto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goto_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLike(int i) {
        this.like_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgvType(long j) {
        this.ogvType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        str.getClass();
        this.source_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.source_ = byteString.toStringUtf8();
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
    public void setToken(String str) {
        str.getClass();
        this.token_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.token_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67881.f16755xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0004\t\u0208\n\u0208", new Object[]{"aid_", "ogvType_", "from_", "spmid_", "fromSpmid_", "trackId_", "goto_", "like_", "source_", "token_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeReq> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeReq.class) {
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

    public long getAid() {
        return this.aid_;
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

    public String getGoto() {
        return this.goto_;
    }

    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    public int getLike() {
        return this.like_;
    }

    public long getOgvType() {
        return this.ogvType_;
    }

    public String getSource() {
        return this.source_;
    }

    public ByteString getSourceBytes() {
        return ByteString.copyFromUtf8(this.source_);
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public String getToken() {
        return this.token_;
    }

    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.token_);
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public ByteString getTrackIdBytes() {
        return ByteString.copyFromUtf8(this.trackId_);
    }

    public static Builder newBuilder(LikeReq likeReq) {
        return DEFAULT_INSTANCE.createBuilder(likeReq);
    }

    public static LikeReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeReq parseFrom(InputStream inputStream) throws IOException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
