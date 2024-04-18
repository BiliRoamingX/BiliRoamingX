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
public final class AggEpCard extends GeneratedMessageLite<AggEpCard, AggEpCard.Builder> implements AggEpCardOrBuilder {
    public static final int COVER_FIELD_NUMBER = 2;
    private static final AggEpCard DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int JUMP_URL_FIELD_NUMBER = 5;
    public static final int NUM_FIELD_NUMBER = 4;
    private static volatile Parser<AggEpCard> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int num_;
    private String title_ = "";
    private String cover_ = "";
    private String icon_ = "";
    private String jumpUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.AggEpCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16960xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16960xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16960xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16960xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16960xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16960xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16960xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16960xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AggEpCard, Builder> implements AggEpCardOrBuilder {
        /* synthetic */ Builder(C69721 c69721) {
            this();
        }

        public Builder clearCover() {
            copyOnWrite();
            ((AggEpCard) this.instance).clearCover();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((AggEpCard) this.instance).clearIcon();
            return this;
        }

        public Builder clearJumpUrl() {
            copyOnWrite();
            ((AggEpCard) this.instance).clearJumpUrl();
            return this;
        }

        public Builder clearNum() {
            copyOnWrite();
            ((AggEpCard) this.instance).clearNum();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((AggEpCard) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public String getCover() {
            return ((AggEpCard) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public ByteString getCoverBytes() {
            return ((AggEpCard) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public String getIcon() {
            return ((AggEpCard) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public ByteString getIconBytes() {
            return ((AggEpCard) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public String getJumpUrl() {
            return ((AggEpCard) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public ByteString getJumpUrlBytes() {
            return ((AggEpCard) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public int getNum() {
            return ((AggEpCard) this.instance).getNum();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public String getTitle() {
            return ((AggEpCard) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
        public ByteString getTitleBytes() {
            return ((AggEpCard) this.instance).getTitleBytes();
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((AggEpCard) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((AggEpCard) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((AggEpCard) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((AggEpCard) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setJumpUrl(String str) {
            copyOnWrite();
            ((AggEpCard) this.instance).setJumpUrl(str);
            return this;
        }

        public Builder setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((AggEpCard) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public Builder setNum(int i) {
            copyOnWrite();
            ((AggEpCard) this.instance).setNum(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((AggEpCard) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((AggEpCard) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(AggEpCard.DEFAULT_INSTANCE);
        }
    }

    static {
        AggEpCard aggEpCard = new AggEpCard();
        DEFAULT_INSTANCE = aggEpCard;
        GeneratedMessageLite.registerDefaultInstance(AggEpCard.class, aggEpCard);
    }

    private AggEpCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNum() {
        this.num_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static AggEpCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AggEpCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AggEpCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggEpCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AggEpCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNum(int i) {
        this.num_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69721.f16960xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AggEpCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208", new Object[]{"title_", "cover_", "icon_", "num_", "jumpUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AggEpCard> parser = PARSER;
                if (parser == null) {
                    synchronized (AggEpCard.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public int getNum() {
        return this.num_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.AggEpCardOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(AggEpCard aggEpCard) {
        return DEFAULT_INSTANCE.createBuilder(aggEpCard);
    }

    public static AggEpCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggEpCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AggEpCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AggEpCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AggEpCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AggEpCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AggEpCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AggEpCard parseFrom(InputStream inputStream) throws IOException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggEpCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AggEpCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AggEpCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AggEpCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
