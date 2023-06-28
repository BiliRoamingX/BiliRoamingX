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
public final class TFToast extends GeneratedMessageLite<TFToast, TFToast.Builder> implements MessageLiteOrBuilder {
    public static final int BTN_LINK_FIELD_NUMBER = 2;
    public static final int BTN_TEXT_FIELD_NUMBER = 1;
    private static final TFToast DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile Parser<TFToast> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    private String btnText_ = "";
    private String btnLink_ = "";
    private String title_ = "";
    private String description_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.TFToast$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16830xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16830xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16830xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16830xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16830xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16830xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16830xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16830xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TFToast, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68711 c68711) {
            this();
        }

        public Builder clearBtnLink() {
            copyOnWrite();
            ((TFToast) this.instance).clearBtnLink();
            return this;
        }

        public Builder clearBtnText() {
            copyOnWrite();
            ((TFToast) this.instance).clearBtnText();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((TFToast) this.instance).clearDescription();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((TFToast) this.instance).clearTitle();
            return this;
        }

        public String getBtnLink() {
            return ((TFToast) this.instance).getBtnLink();
        }

        public ByteString getBtnLinkBytes() {
            return ((TFToast) this.instance).getBtnLinkBytes();
        }

        public String getBtnText() {
            return ((TFToast) this.instance).getBtnText();
        }

        public ByteString getBtnTextBytes() {
            return ((TFToast) this.instance).getBtnTextBytes();
        }

        public String getDescription() {
            return ((TFToast) this.instance).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((TFToast) this.instance).getDescriptionBytes();
        }

        public String getTitle() {
            return ((TFToast) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((TFToast) this.instance).getTitleBytes();
        }

        public Builder setBtnLink(String str) {
            copyOnWrite();
            ((TFToast) this.instance).setBtnLink(str);
            return this;
        }

        public Builder setBtnLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((TFToast) this.instance).setBtnLinkBytes(byteString);
            return this;
        }

        public Builder setBtnText(String str) {
            copyOnWrite();
            ((TFToast) this.instance).setBtnText(str);
            return this;
        }

        public Builder setBtnTextBytes(ByteString byteString) {
            copyOnWrite();
            ((TFToast) this.instance).setBtnTextBytes(byteString);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((TFToast) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((TFToast) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((TFToast) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TFToast) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(TFToast.DEFAULT_INSTANCE);
        }
    }

    static {
        TFToast tFToast = new TFToast();
        DEFAULT_INSTANCE = tFToast;
        GeneratedMessageLite.registerDefaultInstance(TFToast.class, tFToast);
    }

    private TFToast() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtnLink() {
        this.btnLink_ = getDefaultInstance().getBtnLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBtnText() {
        this.btnText_ = getDefaultInstance().getBtnText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static TFToast getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TFToast parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TFToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TFToast parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TFToast> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnLink(String str) {
        str.getClass();
        this.btnLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btnLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnText(String str) {
        str.getClass();
        this.btnText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBtnTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.btnText_ = byteString.toStringUtf8();
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68711.f16830xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TFToast();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"btnText_", "btnLink_", "title_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TFToast> parser = PARSER;
                if (parser == null) {
                    synchronized (TFToast.class) {
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

    public String getBtnLink() {
        return this.btnLink_;
    }

    public ByteString getBtnLinkBytes() {
        return ByteString.copyFromUtf8(this.btnLink_);
    }

    public String getBtnText() {
        return this.btnText_;
    }

    public ByteString getBtnTextBytes() {
        return ByteString.copyFromUtf8(this.btnText_);
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(TFToast tFToast) {
        return DEFAULT_INSTANCE.createBuilder(tFToast);
    }

    public static TFToast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TFToast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TFToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TFToast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TFToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TFToast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TFToast parseFrom(InputStream inputStream) throws IOException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TFToast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TFToast parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TFToast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TFToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
