package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class GradientColor extends GeneratedMessageLite<GradientColor, GradientColor.Builder> implements MessageLiteOrBuilder {
    private static final GradientColor DEFAULT_INSTANCE;
    public static final int END_COLOR_FIELD_NUMBER = 2;
    private static volatile Parser<GradientColor> PARSER = null;
    public static final int START_COLOR_FIELD_NUMBER = 1;
    private String startColor_ = "";
    private String endColor_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.GradientColor$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17902xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17902xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17902xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17902xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17902xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17902xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17902xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17902xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GradientColor, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81801 c81801) {
            this();
        }

        public Builder clearEndColor() {
            copyOnWrite();
            ((GradientColor) this.instance).clearEndColor();
            return this;
        }

        public Builder clearStartColor() {
            copyOnWrite();
            ((GradientColor) this.instance).clearStartColor();
            return this;
        }

        public String getEndColor() {
            return ((GradientColor) this.instance).getEndColor();
        }

        public ByteString getEndColorBytes() {
            return ((GradientColor) this.instance).getEndColorBytes();
        }

        public String getStartColor() {
            return ((GradientColor) this.instance).getStartColor();
        }

        public ByteString getStartColorBytes() {
            return ((GradientColor) this.instance).getStartColorBytes();
        }

        public Builder setEndColor(String str) {
            copyOnWrite();
            ((GradientColor) this.instance).setEndColor(str);
            return this;
        }

        public Builder setEndColorBytes(ByteString byteString) {
            copyOnWrite();
            ((GradientColor) this.instance).setEndColorBytes(byteString);
            return this;
        }

        public Builder setStartColor(String str) {
            copyOnWrite();
            ((GradientColor) this.instance).setStartColor(str);
            return this;
        }

        public Builder setStartColorBytes(ByteString byteString) {
            copyOnWrite();
            ((GradientColor) this.instance).setStartColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(GradientColor.DEFAULT_INSTANCE);
        }
    }

    static {
        GradientColor gradientColor = new GradientColor();
        DEFAULT_INSTANCE = gradientColor;
        GeneratedMessageLite.registerDefaultInstance(GradientColor.class, gradientColor);
    }

    private GradientColor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndColor() {
        this.endColor_ = getDefaultInstance().getEndColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartColor() {
        this.startColor_ = getDefaultInstance().getStartColor();
    }

    public static GradientColor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GradientColor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GradientColor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GradientColor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GradientColor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndColor(String str) {
        str.getClass();
        this.endColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.endColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartColor(String str) {
        str.getClass();
        this.startColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.startColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81801.f17902xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GradientColor();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"startColor_", "endColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GradientColor> parser = PARSER;
                if (parser == null) {
                    synchronized (GradientColor.class) {
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

    public String getEndColor() {
        return this.endColor_;
    }

    public ByteString getEndColorBytes() {
        return ByteString.copyFromUtf8(this.endColor_);
    }

    public String getStartColor() {
        return this.startColor_;
    }

    public ByteString getStartColorBytes() {
        return ByteString.copyFromUtf8(this.startColor_);
    }

    public static Builder newBuilder(GradientColor gradientColor) {
        return DEFAULT_INSTANCE.createBuilder(gradientColor);
    }

    public static GradientColor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GradientColor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GradientColor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GradientColor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GradientColor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GradientColor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GradientColor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GradientColor parseFrom(InputStream inputStream) throws IOException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GradientColor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GradientColor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GradientColor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GradientColor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
