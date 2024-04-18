package com.bapis.bilibili.app.viewunite.pgcanymodel;

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
public final class Earphone extends GeneratedMessageLite<Earphone, Earphone.Builder> implements EarphoneOrBuilder {
    private static final Earphone DEFAULT_INSTANCE;
    public static final int LIKE_TOAST_TEXT_FIELD_NUMBER = 2;
    public static final int LIKE_TOAST_VOICE_FIELD_NUMBER = 4;
    private static volatile Parser<Earphone> PARSER = null;
    public static final int PRODUCT_MODEL_FIELD_NUMBER = 1;
    public static final int SWITCH_TOAST_TEXT_FIELD_NUMBER = 3;
    private String productModel_ = "";
    private String likeToastText_ = "";
    private String switchToastText_ = "";
    private String likeToastVoice_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.Earphone$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70871 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17064xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17064xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17064xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17064xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17064xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17064xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17064xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17064xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Earphone, Builder> implements EarphoneOrBuilder {
        /* synthetic */ Builder(C70871 c70871) {
            this();
        }

        public Builder clearLikeToastText() {
            copyOnWrite();
            ((Earphone) this.instance).clearLikeToastText();
            return this;
        }

        public Builder clearLikeToastVoice() {
            copyOnWrite();
            ((Earphone) this.instance).clearLikeToastVoice();
            return this;
        }

        public Builder clearProductModel() {
            copyOnWrite();
            ((Earphone) this.instance).clearProductModel();
            return this;
        }

        public Builder clearSwitchToastText() {
            copyOnWrite();
            ((Earphone) this.instance).clearSwitchToastText();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public String getLikeToastText() {
            return ((Earphone) this.instance).getLikeToastText();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public ByteString getLikeToastTextBytes() {
            return ((Earphone) this.instance).getLikeToastTextBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public String getLikeToastVoice() {
            return ((Earphone) this.instance).getLikeToastVoice();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public ByteString getLikeToastVoiceBytes() {
            return ((Earphone) this.instance).getLikeToastVoiceBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public String getProductModel() {
            return ((Earphone) this.instance).getProductModel();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public ByteString getProductModelBytes() {
            return ((Earphone) this.instance).getProductModelBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public String getSwitchToastText() {
            return ((Earphone) this.instance).getSwitchToastText();
        }

        @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
        public ByteString getSwitchToastTextBytes() {
            return ((Earphone) this.instance).getSwitchToastTextBytes();
        }

        public Builder setLikeToastText(String str) {
            copyOnWrite();
            ((Earphone) this.instance).setLikeToastText(str);
            return this;
        }

        public Builder setLikeToastTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Earphone) this.instance).setLikeToastTextBytes(byteString);
            return this;
        }

        public Builder setLikeToastVoice(String str) {
            copyOnWrite();
            ((Earphone) this.instance).setLikeToastVoice(str);
            return this;
        }

        public Builder setLikeToastVoiceBytes(ByteString byteString) {
            copyOnWrite();
            ((Earphone) this.instance).setLikeToastVoiceBytes(byteString);
            return this;
        }

        public Builder setProductModel(String str) {
            copyOnWrite();
            ((Earphone) this.instance).setProductModel(str);
            return this;
        }

        public Builder setProductModelBytes(ByteString byteString) {
            copyOnWrite();
            ((Earphone) this.instance).setProductModelBytes(byteString);
            return this;
        }

        public Builder setSwitchToastText(String str) {
            copyOnWrite();
            ((Earphone) this.instance).setSwitchToastText(str);
            return this;
        }

        public Builder setSwitchToastTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Earphone) this.instance).setSwitchToastTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(Earphone.DEFAULT_INSTANCE);
        }
    }

    static {
        Earphone earphone = new Earphone();
        DEFAULT_INSTANCE = earphone;
        GeneratedMessageLite.registerDefaultInstance(Earphone.class, earphone);
    }

    private Earphone() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeToastText() {
        this.likeToastText_ = getDefaultInstance().getLikeToastText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeToastVoice() {
        this.likeToastVoice_ = getDefaultInstance().getLikeToastVoice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductModel() {
        this.productModel_ = getDefaultInstance().getProductModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchToastText() {
        this.switchToastText_ = getDefaultInstance().getSwitchToastText();
    }

    public static Earphone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Earphone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Earphone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Earphone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Earphone> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeToastText(String str) {
        str.getClass();
        this.likeToastText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeToastTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.likeToastText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeToastVoice(String str) {
        str.getClass();
        this.likeToastVoice_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeToastVoiceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.likeToastVoice_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductModel(String str) {
        str.getClass();
        this.productModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.productModel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchToastText(String str) {
        str.getClass();
        this.switchToastText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchToastTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.switchToastText_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70871.f17064xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Earphone();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"productModel_", "likeToastText_", "switchToastText_", "likeToastVoice_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Earphone> parser = PARSER;
                if (parser == null) {
                    synchronized (Earphone.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public String getLikeToastText() {
        return this.likeToastText_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public ByteString getLikeToastTextBytes() {
        return ByteString.copyFromUtf8(this.likeToastText_);
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public String getLikeToastVoice() {
        return this.likeToastVoice_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public ByteString getLikeToastVoiceBytes() {
        return ByteString.copyFromUtf8(this.likeToastVoice_);
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public String getProductModel() {
        return this.productModel_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public ByteString getProductModelBytes() {
        return ByteString.copyFromUtf8(this.productModel_);
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public String getSwitchToastText() {
        return this.switchToastText_;
    }

    @Override // com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneOrBuilder
    public ByteString getSwitchToastTextBytes() {
        return ByteString.copyFromUtf8(this.switchToastText_);
    }

    public static Builder newBuilder(Earphone earphone) {
        return DEFAULT_INSTANCE.createBuilder(earphone);
    }

    public static Earphone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Earphone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Earphone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Earphone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Earphone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Earphone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Earphone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Earphone parseFrom(InputStream inputStream) throws IOException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Earphone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Earphone parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Earphone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Earphone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
