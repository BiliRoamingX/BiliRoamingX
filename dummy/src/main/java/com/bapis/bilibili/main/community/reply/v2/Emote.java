package com.bapis.bilibili.main.community.reply.v2;

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
/* loaded from: classes18.dex */
public final class Emote extends GeneratedMessageLite<Emote, Emote.Builder> implements EmoteOrBuilder {
    private static final Emote DEFAULT_INSTANCE;
    public static final int GIF_URL_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 5;
    public static final int JUMP_TITLE_FIELD_NUMBER = 4;
    public static final int JUMP_URL_FIELD_NUMBER = 3;
    public static final int PACKAGE_ID_FIELD_NUMBER = 6;
    private static volatile Parser<Emote> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 8;
    public static final int URL_FIELD_NUMBER = 2;
    private long id_;
    private long packageId_;
    private long size_;
    private String url_ = "";
    private String jumpUrl_ = "";
    private String jumpTitle_ = "";
    private String gifUrl_ = "";
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.Emote$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C79951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17759xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17759xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17759xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17759xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17759xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17759xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17759xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17759xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Emote, Builder> implements EmoteOrBuilder {
        /* synthetic */ Builder(C79951 c79951) {
            this();
        }

        public Builder clearGifUrl() {
            copyOnWrite();
            ((Emote) this.instance).clearGifUrl();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Emote) this.instance).clearId();
            return this;
        }

        public Builder clearJumpTitle() {
            copyOnWrite();
            ((Emote) this.instance).clearJumpTitle();
            return this;
        }

        public Builder clearJumpUrl() {
            copyOnWrite();
            ((Emote) this.instance).clearJumpUrl();
            return this;
        }

        public Builder clearPackageId() {
            copyOnWrite();
            ((Emote) this.instance).clearPackageId();
            return this;
        }

        public Builder clearSize() {
            copyOnWrite();
            ((Emote) this.instance).clearSize();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Emote) this.instance).clearText();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((Emote) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public String getGifUrl() {
            return ((Emote) this.instance).getGifUrl();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public ByteString getGifUrlBytes() {
            return ((Emote) this.instance).getGifUrlBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public long getId() {
            return ((Emote) this.instance).getId();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public String getJumpTitle() {
            return ((Emote) this.instance).getJumpTitle();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public ByteString getJumpTitleBytes() {
            return ((Emote) this.instance).getJumpTitleBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public String getJumpUrl() {
            return ((Emote) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public ByteString getJumpUrlBytes() {
            return ((Emote) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public long getPackageId() {
            return ((Emote) this.instance).getPackageId();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public long getSize() {
            return ((Emote) this.instance).getSize();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public String getText() {
            return ((Emote) this.instance).getText();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public ByteString getTextBytes() {
            return ((Emote) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public String getUrl() {
            return ((Emote) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
        public ByteString getUrlBytes() {
            return ((Emote) this.instance).getUrlBytes();
        }

        public Builder setGifUrl(String str) {
            copyOnWrite();
            ((Emote) this.instance).setGifUrl(str);
            return this;
        }

        public Builder setGifUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Emote) this.instance).setGifUrlBytes(byteString);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((Emote) this.instance).setId(j);
            return this;
        }

        public Builder setJumpTitle(String str) {
            copyOnWrite();
            ((Emote) this.instance).setJumpTitle(str);
            return this;
        }

        public Builder setJumpTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Emote) this.instance).setJumpTitleBytes(byteString);
            return this;
        }

        public Builder setJumpUrl(String str) {
            copyOnWrite();
            ((Emote) this.instance).setJumpUrl(str);
            return this;
        }

        public Builder setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Emote) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public Builder setPackageId(long j) {
            copyOnWrite();
            ((Emote) this.instance).setPackageId(j);
            return this;
        }

        public Builder setSize(long j) {
            copyOnWrite();
            ((Emote) this.instance).setSize(j);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Emote) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Emote) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((Emote) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Emote) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(Emote.DEFAULT_INSTANCE);
        }
    }

    static {
        Emote emote = new Emote();
        DEFAULT_INSTANCE = emote;
        GeneratedMessageLite.registerDefaultInstance(Emote.class, emote);
    }

    private Emote() {
    }

    public void clearGifUrl() {
        this.gifUrl_ = getDefaultInstance().getGifUrl();
    }

    public void clearId() {
        this.id_ = 0L;
    }

    public void clearJumpTitle() {
        this.jumpTitle_ = getDefaultInstance().getJumpTitle();
    }

    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    public void clearPackageId() {
        this.packageId_ = 0L;
    }

    public void clearSize() {
        this.size_ = 0L;
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static Emote getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Emote parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Emote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Emote parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Emote> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setGifUrl(String str) {
        str.getClass();
        this.gifUrl_ = str;
    }

    public void setGifUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gifUrl_ = byteString.toStringUtf8();
    }

    public void setId(long j) {
        this.id_ = j;
    }

    public void setJumpTitle(String str) {
        str.getClass();
        this.jumpTitle_ = str;
    }

    public void setJumpTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpTitle_ = byteString.toStringUtf8();
    }

    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    public void setPackageId(long j) {
        this.packageId_ = j;
    }

    public void setSize(long j) {
        this.size_ = j;
    }

    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79951.f17759xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Emote();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0002\u0007\u0208\b\u0208", new Object[]{"size_", "url_", "jumpUrl_", "jumpTitle_", "id_", "packageId_", "gifUrl_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Emote> parser = PARSER;
                if (parser == null) {
                    synchronized (Emote.class) {
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

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public String getGifUrl() {
        return this.gifUrl_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public ByteString getGifUrlBytes() {
        return ByteString.copyFromUtf8(this.gifUrl_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public String getJumpTitle() {
        return this.jumpTitle_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public ByteString getJumpTitleBytes() {
        return ByteString.copyFromUtf8(this.jumpTitle_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public long getPackageId() {
        return this.packageId_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public long getSize() {
        return this.size_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.EmoteOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(Emote emote) {
        return DEFAULT_INSTANCE.createBuilder(emote);
    }

    public static Emote parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Emote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Emote parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Emote parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Emote parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Emote parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Emote parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Emote parseFrom(InputStream inputStream) throws IOException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Emote parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Emote parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Emote parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Emote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
