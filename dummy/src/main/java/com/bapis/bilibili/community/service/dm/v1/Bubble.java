package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class Bubble extends GeneratedMessageLite<Bubble, Bubble.Builder> implements MessageLiteOrBuilder {
    private static final Bubble DEFAULT_INSTANCE;
    private static volatile Parser<Bubble> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private String text_ = "";
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Bubble$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71841 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17032xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17032xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17032xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Bubble, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71841 c71841) {
            this();
        }

        public Builder clearText() {
            copyOnWrite();
            ((Bubble) this.instance).clearText();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((Bubble) this.instance).clearUrl();
            return this;
        }

        public String getText() {
            return ((Bubble) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((Bubble) this.instance).getTextBytes();
        }

        public String getUrl() {
            return ((Bubble) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((Bubble) this.instance).getUrlBytes();
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((Bubble) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Bubble) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((Bubble) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Bubble) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(Bubble.DEFAULT_INSTANCE);
        }
    }

    static {
        Bubble bubble = new Bubble();
        DEFAULT_INSTANCE = bubble;
        GeneratedMessageLite.registerDefaultInstance(Bubble.class, bubble);
    }

    private Bubble() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static Bubble getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Bubble parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Bubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Bubble parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Bubble> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71841.f17032xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Bubble();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"text_", "url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Bubble> parser = PARSER;
                if (parser == null) {
                    synchronized (Bubble.class) {
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

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(Bubble bubble) {
        return DEFAULT_INSTANCE.createBuilder(bubble);
    }

    public static Bubble parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bubble) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Bubble parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Bubble parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Bubble parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Bubble parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Bubble parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Bubble parseFrom(InputStream inputStream) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Bubble parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Bubble parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Bubble parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Bubble) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
