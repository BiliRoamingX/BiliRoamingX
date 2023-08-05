package com.bapis.bilibili.app.viewunite.v1;

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
public final class PlayToast extends GeneratedMessageLite<PlayToast, PlayToast.Builder> implements PlayToastOrBuilder {
    public static final int BUSINESS_FIELD_NUMBER = 1;
    private static final PlayToast DEFAULT_INSTANCE;
    public static final int ICON_URL_FIELD_NUMBER = 2;
    private static volatile Parser<PlayToast> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    private int business_;
    private String iconUrl_ = "";
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.PlayToast$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71471 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17116xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17116xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17116xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17116xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17116xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17116xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17116xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17116xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayToast, Builder> implements PlayToastOrBuilder {
        /* synthetic */ Builder(C71471 c71471) {
            this();
        }

        public Builder clearBusiness() {
            copyOnWrite();
            ((PlayToast) this.instance).clearBusiness();
            return this;
        }

        public Builder clearIconUrl() {
            copyOnWrite();
            ((PlayToast) this.instance).clearIconUrl();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((PlayToast) this.instance).clearText();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
        public PlayToastEnum getBusiness() {
            return ((PlayToast) this.instance).getBusiness();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
        public int getBusinessValue() {
            return ((PlayToast) this.instance).getBusinessValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
        public String getIconUrl() {
            return ((PlayToast) this.instance).getIconUrl();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
        public ByteString getIconUrlBytes() {
            return ((PlayToast) this.instance).getIconUrlBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
        public String getText() {
            return ((PlayToast) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
        public ByteString getTextBytes() {
            return ((PlayToast) this.instance).getTextBytes();
        }

        public Builder setBusiness(PlayToastEnum playToastEnum) {
            copyOnWrite();
            ((PlayToast) this.instance).setBusiness(playToastEnum);
            return this;
        }

        public Builder setBusinessValue(int i) {
            copyOnWrite();
            ((PlayToast) this.instance).setBusinessValue(i);
            return this;
        }

        public Builder setIconUrl(String str) {
            copyOnWrite();
            ((PlayToast) this.instance).setIconUrl(str);
            return this;
        }

        public Builder setIconUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayToast) this.instance).setIconUrlBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((PlayToast) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayToast) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(PlayToast.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayToast playToast = new PlayToast();
        DEFAULT_INSTANCE = playToast;
        GeneratedMessageLite.registerDefaultInstance(PlayToast.class, playToast);
    }

    private PlayToast() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusiness() {
        this.business_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconUrl() {
        this.iconUrl_ = getDefaultInstance().getIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static PlayToast getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayToast parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayToast parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayToast> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusiness(PlayToastEnum playToastEnum) {
        this.business_ = playToastEnum.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessValue(int i) {
        this.business_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrl(String str) {
        str.getClass();
        this.iconUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71471.f17116xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayToast();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0208", new Object[]{"business_", "iconUrl_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayToast> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayToast.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
    public PlayToastEnum getBusiness() {
        PlayToastEnum forNumber = PlayToastEnum.forNumber(this.business_);
        return forNumber == null ? PlayToastEnum.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
    public int getBusinessValue() {
        return this.business_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
    public String getIconUrl() {
        return this.iconUrl_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
    public ByteString getIconUrlBytes() {
        return ByteString.copyFromUtf8(this.iconUrl_);
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.PlayToastOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(PlayToast playToast) {
        return DEFAULT_INSTANCE.createBuilder(playToast);
    }

    public static PlayToast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayToast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayToast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayToast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayToast parseFrom(InputStream inputStream) throws IOException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayToast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayToast parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayToast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
