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
public final class Label extends GeneratedMessageLite<Label, Label.Builder> implements MessageLiteOrBuilder {
    private static final Label DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int ICON_HEIGHT_FIELD_NUMBER = 6;
    public static final int ICON_NIGHT_FIELD_NUMBER = 4;
    public static final int ICON_WIDTH_FIELD_NUMBER = 5;
    public static final int LOTTIE_FIELD_NUMBER = 7;
    public static final int LOTTIE_NIGHT_FIELD_NUMBER = 8;
    private static volatile Parser<Label> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private long iconHeight_;
    private long iconWidth_;
    private int type_;
    private String uri_ = "";
    private String icon_ = "";
    private String iconNight_ = "";
    private String lottie_ = "";
    private String lottieNight_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Label$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16750xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16750xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16750xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16750xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16750xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16750xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16750xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16750xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Label, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67801 c67801) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((Label) this.instance).clearIcon();
            return this;
        }

        public Builder clearIconHeight() {
            copyOnWrite();
            ((Label) this.instance).clearIconHeight();
            return this;
        }

        public Builder clearIconNight() {
            copyOnWrite();
            ((Label) this.instance).clearIconNight();
            return this;
        }

        public Builder clearIconWidth() {
            copyOnWrite();
            ((Label) this.instance).clearIconWidth();
            return this;
        }

        public Builder clearLottie() {
            copyOnWrite();
            ((Label) this.instance).clearLottie();
            return this;
        }

        public Builder clearLottieNight() {
            copyOnWrite();
            ((Label) this.instance).clearLottieNight();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Label) this.instance).clearType();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((Label) this.instance).clearUri();
            return this;
        }

        public String getIcon() {
            return ((Label) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((Label) this.instance).getIconBytes();
        }

        public long getIconHeight() {
            return ((Label) this.instance).getIconHeight();
        }

        public String getIconNight() {
            return ((Label) this.instance).getIconNight();
        }

        public ByteString getIconNightBytes() {
            return ((Label) this.instance).getIconNightBytes();
        }

        public long getIconWidth() {
            return ((Label) this.instance).getIconWidth();
        }

        public String getLottie() {
            return ((Label) this.instance).getLottie();
        }

        public ByteString getLottieBytes() {
            return ((Label) this.instance).getLottieBytes();
        }

        public String getLottieNight() {
            return ((Label) this.instance).getLottieNight();
        }

        public ByteString getLottieNightBytes() {
            return ((Label) this.instance).getLottieNightBytes();
        }

        public int getType() {
            return ((Label) this.instance).getType();
        }

        public String getUri() {
            return ((Label) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((Label) this.instance).getUriBytes();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((Label) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Label) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setIconHeight(long j) {
            copyOnWrite();
            ((Label) this.instance).setIconHeight(j);
            return this;
        }

        public Builder setIconNight(String str) {
            copyOnWrite();
            ((Label) this.instance).setIconNight(str);
            return this;
        }

        public Builder setIconNightBytes(ByteString byteString) {
            copyOnWrite();
            ((Label) this.instance).setIconNightBytes(byteString);
            return this;
        }

        public Builder setIconWidth(long j) {
            copyOnWrite();
            ((Label) this.instance).setIconWidth(j);
            return this;
        }

        public Builder setLottie(String str) {
            copyOnWrite();
            ((Label) this.instance).setLottie(str);
            return this;
        }

        public Builder setLottieBytes(ByteString byteString) {
            copyOnWrite();
            ((Label) this.instance).setLottieBytes(byteString);
            return this;
        }

        public Builder setLottieNight(String str) {
            copyOnWrite();
            ((Label) this.instance).setLottieNight(str);
            return this;
        }

        public Builder setLottieNightBytes(ByteString byteString) {
            copyOnWrite();
            ((Label) this.instance).setLottieNightBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((Label) this.instance).setType(i);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Label) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Label) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(Label.DEFAULT_INSTANCE);
        }
    }

    static {
        Label label = new Label();
        DEFAULT_INSTANCE = label;
        GeneratedMessageLite.registerDefaultInstance(Label.class, label);
    }

    private Label() {
    }

    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    public void clearIconHeight() {
        this.iconHeight_ = 0L;
    }

    public void clearIconNight() {
        this.iconNight_ = getDefaultInstance().getIconNight();
    }

    public void clearIconWidth() {
        this.iconWidth_ = 0L;
    }

    public void clearLottie() {
        this.lottie_ = getDefaultInstance().getLottie();
    }

    public void clearLottieNight() {
        this.lottieNight_ = getDefaultInstance().getLottieNight();
    }

    public void clearType() {
        this.type_ = 0;
    }

    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Label getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Label parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Label) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Label parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Label> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    public void setIconHeight(long j) {
        this.iconHeight_ = j;
    }

    public void setIconNight(String str) {
        str.getClass();
        this.iconNight_ = str;
    }

    public void setIconNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconNight_ = byteString.toStringUtf8();
    }

    public void setIconWidth(long j) {
        this.iconWidth_ = j;
    }

    public void setLottie(String str) {
        str.getClass();
        this.lottie_ = str;
    }

    public void setLottieBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lottie_ = byteString.toStringUtf8();
    }

    public void setLottieNight(String str) {
        str.getClass();
        this.lottieNight_ = str;
    }

    public void setLottieNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lottieNight_ = byteString.toStringUtf8();
    }

    public void setType(int i) {
        this.type_ = i;
    }

    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67801.f16750xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Label();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0002\u0007\u0208\b\u0208", new Object[]{"type_", "uri_", "icon_", "iconNight_", "iconWidth_", "iconHeight_", "lottie_", "lottieNight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Label> parser = PARSER;
                if (parser == null) {
                    synchronized (Label.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public long getIconHeight() {
        return this.iconHeight_;
    }

    public String getIconNight() {
        return this.iconNight_;
    }

    public ByteString getIconNightBytes() {
        return ByteString.copyFromUtf8(this.iconNight_);
    }

    public long getIconWidth() {
        return this.iconWidth_;
    }

    public String getLottie() {
        return this.lottie_;
    }

    public ByteString getLottieBytes() {
        return ByteString.copyFromUtf8(this.lottie_);
    }

    public String getLottieNight() {
        return this.lottieNight_;
    }

    public ByteString getLottieNightBytes() {
        return ByteString.copyFromUtf8(this.lottieNight_);
    }

    public int getType() {
        return this.type_;
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(Label label) {
        return DEFAULT_INSTANCE.createBuilder(label);
    }

    public static Label parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Label) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Label parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Label parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Label parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Label parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Label parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Label parseFrom(InputStream inputStream) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Label parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Label parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Label parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Label) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
