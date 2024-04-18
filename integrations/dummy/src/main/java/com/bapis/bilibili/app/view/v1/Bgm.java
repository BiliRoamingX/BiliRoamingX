package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class Bgm extends GeneratedMessageLite<Bgm, Bgm.Builder> implements BgmOrBuilder {
    public static final int AUTHOR_FIELD_NUMBER = 4;
    public static final int COVER_FIELD_NUMBER = 6;
    private static final Bgm DEFAULT_INSTANCE;
    public static final int JUMP_URL_FIELD_NUMBER = 5;
    public static final int MID_FIELD_NUMBER = 2;
    private static volatile Parser<Bgm> PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 3;
    private long mid_;
    private long sid_;
    private String title_ = "";
    private String author_ = "";
    private String jumpUrl_ = "";
    private String cover_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Bgm$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67171 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16693xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16693xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16693xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16693xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16693xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16693xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16693xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16693xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Bgm, Builder> implements BgmOrBuilder {
        /* synthetic */ Builder(C67171 c67171) {
            this();
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((Bgm) this.instance).clearAuthor();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Bgm) this.instance).clearCover();
            return this;
        }

        public Builder clearJumpUrl() {
            copyOnWrite();
            ((Bgm) this.instance).clearJumpUrl();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((Bgm) this.instance).clearMid();
            return this;
        }

        public Builder clearSid() {
            copyOnWrite();
            ((Bgm) this.instance).clearSid();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Bgm) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public String getAuthor() {
            return ((Bgm) this.instance).getAuthor();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public ByteString getAuthorBytes() {
            return ((Bgm) this.instance).getAuthorBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public String getCover() {
            return ((Bgm) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public ByteString getCoverBytes() {
            return ((Bgm) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public String getJumpUrl() {
            return ((Bgm) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public ByteString getJumpUrlBytes() {
            return ((Bgm) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public long getMid() {
            return ((Bgm) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public long getSid() {
            return ((Bgm) this.instance).getSid();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public String getTitle() {
            return ((Bgm) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
        public ByteString getTitleBytes() {
            return ((Bgm) this.instance).getTitleBytes();
        }

        public Builder setAuthor(String str) {
            copyOnWrite();
            ((Bgm) this.instance).setAuthor(str);
            return this;
        }

        public Builder setAuthorBytes(ByteString byteString) {
            copyOnWrite();
            ((Bgm) this.instance).setAuthorBytes(byteString);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Bgm) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Bgm) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setJumpUrl(String str) {
            copyOnWrite();
            ((Bgm) this.instance).setJumpUrl(str);
            return this;
        }

        public Builder setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Bgm) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((Bgm) this.instance).setMid(j);
            return this;
        }

        public Builder setSid(long j) {
            copyOnWrite();
            ((Bgm) this.instance).setSid(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Bgm) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Bgm) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Bgm.DEFAULT_INSTANCE);
        }
    }

    static {
        Bgm bgm = new Bgm();
        DEFAULT_INSTANCE = bgm;
        GeneratedMessageLite.registerDefaultInstance(Bgm.class, bgm);
    }

    private Bgm() {
    }

    public void clearAuthor() {
        this.author_ = getDefaultInstance().getAuthor();
    }

    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearSid() {
        this.sid_ = 0L;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Bgm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Bgm parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Bgm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Bgm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Bgm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAuthor(String str) {
        str.getClass();
        this.author_ = str;
    }

    public void setAuthorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.author_ = byteString.toStringUtf8();
    }

    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    public void setMid(long j) {
        this.mid_ = j;
    }

    public void setSid(long j) {
        this.sid_ = j;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67171.f16693xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Bgm();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"sid_", "mid_", "title_", "author_", "jumpUrl_", "cover_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Bgm> parser = PARSER;
                if (parser == null) {
                    synchronized (Bgm.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public String getAuthor() {
        return this.author_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public ByteString getAuthorBytes() {
        return ByteString.copyFromUtf8(this.author_);
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public long getSid() {
        return this.sid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BgmOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(Bgm bgm) {
        return DEFAULT_INSTANCE.createBuilder(bgm);
    }

    public static Bgm parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bgm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Bgm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Bgm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Bgm parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Bgm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Bgm parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Bgm parseFrom(InputStream inputStream) throws IOException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Bgm parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Bgm parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Bgm parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bgm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
