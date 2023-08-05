package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class SponsorRank extends GeneratedMessageLite<SponsorRank, SponsorRank.Builder> implements SponsorRankOrBuilder {
    private static final SponsorRank DEFAULT_INSTANCE;
    public static final int FACE_FIELD_NUMBER = 4;
    public static final int MSG_FIELD_NUMBER = 2;
    private static volatile Parser<SponsorRank> PARSER = null;
    public static final int UID_FIELD_NUMBER = 1;
    public static final int UNAME_FIELD_NUMBER = 3;
    public static final int VIP_FIELD_NUMBER = 5;
    private long uid_;
    private Vip vip_;
    private String msg_ = "";
    private String uname_ = "";
    private String face_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.SponsorRank$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17039xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17039xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17039xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17039xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17039xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17039xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17039xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17039xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SponsorRank, Builder> implements SponsorRankOrBuilder {
        /* synthetic */ Builder(C70621 c70621) {
            this();
        }

        public Builder clearFace() {
            copyOnWrite();
            ((SponsorRank) this.instance).clearFace();
            return this;
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((SponsorRank) this.instance).clearMsg();
            return this;
        }

        public Builder clearUid() {
            copyOnWrite();
            ((SponsorRank) this.instance).clearUid();
            return this;
        }

        public Builder clearUname() {
            copyOnWrite();
            ((SponsorRank) this.instance).clearUname();
            return this;
        }

        public Builder clearVip() {
            copyOnWrite();
            ((SponsorRank) this.instance).clearVip();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public String getFace() {
            return ((SponsorRank) this.instance).getFace();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public ByteString getFaceBytes() {
            return ((SponsorRank) this.instance).getFaceBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public String getMsg() {
            return ((SponsorRank) this.instance).getMsg();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public ByteString getMsgBytes() {
            return ((SponsorRank) this.instance).getMsgBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public long getUid() {
            return ((SponsorRank) this.instance).getUid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public String getUname() {
            return ((SponsorRank) this.instance).getUname();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public ByteString getUnameBytes() {
            return ((SponsorRank) this.instance).getUnameBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public Vip getVip() {
            return ((SponsorRank) this.instance).getVip();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
        public boolean hasVip() {
            return ((SponsorRank) this.instance).hasVip();
        }

        public Builder mergeVip(Vip vip) {
            copyOnWrite();
            ((SponsorRank) this.instance).mergeVip(vip);
            return this;
        }

        public Builder setFace(String str) {
            copyOnWrite();
            ((SponsorRank) this.instance).setFace(str);
            return this;
        }

        public Builder setFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((SponsorRank) this.instance).setFaceBytes(byteString);
            return this;
        }

        public Builder setMsg(String str) {
            copyOnWrite();
            ((SponsorRank) this.instance).setMsg(str);
            return this;
        }

        public Builder setMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((SponsorRank) this.instance).setMsgBytes(byteString);
            return this;
        }

        public Builder setUid(long j) {
            copyOnWrite();
            ((SponsorRank) this.instance).setUid(j);
            return this;
        }

        public Builder setUname(String str) {
            copyOnWrite();
            ((SponsorRank) this.instance).setUname(str);
            return this;
        }

        public Builder setUnameBytes(ByteString byteString) {
            copyOnWrite();
            ((SponsorRank) this.instance).setUnameBytes(byteString);
            return this;
        }

        public Builder setVip(Vip vip) {
            copyOnWrite();
            ((SponsorRank) this.instance).setVip(vip);
            return this;
        }

        private Builder() {
            super(SponsorRank.DEFAULT_INSTANCE);
        }

        public Builder setVip(Vip.Builder builder) {
            copyOnWrite();
            ((SponsorRank) this.instance).setVip(builder.build());
            return this;
        }
    }

    static {
        SponsorRank sponsorRank = new SponsorRank();
        DEFAULT_INSTANCE = sponsorRank;
        GeneratedMessageLite.registerDefaultInstance(SponsorRank.class, sponsorRank);
    }

    private SponsorRank() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFace() {
        this.face_ = getDefaultInstance().getFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUname() {
        this.uname_ = getDefaultInstance().getUname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVip() {
        this.vip_ = null;
    }

    public static SponsorRank getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVip(Vip vip) {
        vip.getClass();
        Vip vip2 = this.vip_;
        if (vip2 != null && vip2 != Vip.getDefaultInstance()) {
            this.vip_ = Vip.newBuilder(this.vip_).mergeFrom((Vip) vip).buildPartial();
        } else {
            this.vip_ = vip;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SponsorRank parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SponsorRank) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SponsorRank parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SponsorRank> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFace(String str) {
        str.getClass();
        this.face_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.face_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(long j) {
        this.uid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUname(String str) {
        str.getClass();
        this.uname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uname_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVip(Vip vip) {
        vip.getClass();
        this.vip_ = vip;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70621.f17039xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SponsorRank();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t", new Object[]{"uid_", "msg_", "uname_", "face_", "vip_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SponsorRank> parser = PARSER;
                if (parser == null) {
                    synchronized (SponsorRank.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public String getFace() {
        return this.face_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public ByteString getFaceBytes() {
        return ByteString.copyFromUtf8(this.face_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public String getMsg() {
        return this.msg_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public ByteString getMsgBytes() {
        return ByteString.copyFromUtf8(this.msg_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public long getUid() {
        return this.uid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public String getUname() {
        return this.uname_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public ByteString getUnameBytes() {
        return ByteString.copyFromUtf8(this.uname_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public Vip getVip() {
        Vip vip = this.vip_;
        return vip == null ? Vip.getDefaultInstance() : vip;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.SponsorRankOrBuilder
    public boolean hasVip() {
        return this.vip_ != null;
    }

    public static Builder newBuilder(SponsorRank sponsorRank) {
        return DEFAULT_INSTANCE.createBuilder(sponsorRank);
    }

    public static SponsorRank parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SponsorRank) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SponsorRank parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SponsorRank parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SponsorRank parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SponsorRank parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SponsorRank parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SponsorRank parseFrom(InputStream inputStream) throws IOException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SponsorRank parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SponsorRank parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SponsorRank parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SponsorRank) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
