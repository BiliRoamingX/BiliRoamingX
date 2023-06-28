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
public final class PowerIconStyle extends GeneratedMessageLite<PowerIconStyle, PowerIconStyle.Builder> implements MessageLiteOrBuilder {
    private static final PowerIconStyle DEFAULT_INSTANCE;
    public static final int ICON_HEIGHT_FIELD_NUMBER = 4;
    public static final int ICON_NIGHT_URL_FIELD_NUMBER = 2;
    public static final int ICON_URL_FIELD_NUMBER = 1;
    public static final int ICON_WIDTH_FIELD_NUMBER = 3;
    private static volatile Parser<PowerIconStyle> PARSER;
    private long iconHeight_;
    private long iconWidth_;
    private String iconUrl_ = "";
    private String iconNightUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PowerIconStyle$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16784xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16784xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16784xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16784xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16784xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16784xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16784xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16784xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PowerIconStyle, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68221 c68221) {
            this();
        }

        public Builder clearIconHeight() {
            copyOnWrite();
            ((PowerIconStyle) this.instance).clearIconHeight();
            return this;
        }

        public Builder clearIconNightUrl() {
            copyOnWrite();
            ((PowerIconStyle) this.instance).clearIconNightUrl();
            return this;
        }

        public Builder clearIconUrl() {
            copyOnWrite();
            ((PowerIconStyle) this.instance).clearIconUrl();
            return this;
        }

        public Builder clearIconWidth() {
            copyOnWrite();
            ((PowerIconStyle) this.instance).clearIconWidth();
            return this;
        }

        public long getIconHeight() {
            return ((PowerIconStyle) this.instance).getIconHeight();
        }

        public String getIconNightUrl() {
            return ((PowerIconStyle) this.instance).getIconNightUrl();
        }

        public ByteString getIconNightUrlBytes() {
            return ((PowerIconStyle) this.instance).getIconNightUrlBytes();
        }

        public String getIconUrl() {
            return ((PowerIconStyle) this.instance).getIconUrl();
        }

        public ByteString getIconUrlBytes() {
            return ((PowerIconStyle) this.instance).getIconUrlBytes();
        }

        public long getIconWidth() {
            return ((PowerIconStyle) this.instance).getIconWidth();
        }

        public Builder setIconHeight(long j) {
            copyOnWrite();
            ((PowerIconStyle) this.instance).setIconHeight(j);
            return this;
        }

        public Builder setIconNightUrl(String str) {
            copyOnWrite();
            ((PowerIconStyle) this.instance).setIconNightUrl(str);
            return this;
        }

        public Builder setIconNightUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PowerIconStyle) this.instance).setIconNightUrlBytes(byteString);
            return this;
        }

        public Builder setIconUrl(String str) {
            copyOnWrite();
            ((PowerIconStyle) this.instance).setIconUrl(str);
            return this;
        }

        public Builder setIconUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PowerIconStyle) this.instance).setIconUrlBytes(byteString);
            return this;
        }

        public Builder setIconWidth(long j) {
            copyOnWrite();
            ((PowerIconStyle) this.instance).setIconWidth(j);
            return this;
        }

        private Builder() {
            super(PowerIconStyle.DEFAULT_INSTANCE);
        }
    }

    static {
        PowerIconStyle powerIconStyle = new PowerIconStyle();
        DEFAULT_INSTANCE = powerIconStyle;
        GeneratedMessageLite.registerDefaultInstance(PowerIconStyle.class, powerIconStyle);
    }

    private PowerIconStyle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconHeight() {
        this.iconHeight_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconNightUrl() {
        this.iconNightUrl_ = getDefaultInstance().getIconNightUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconUrl() {
        this.iconUrl_ = getDefaultInstance().getIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconWidth() {
        this.iconWidth_ = 0L;
    }

    public static PowerIconStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PowerIconStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PowerIconStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PowerIconStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PowerIconStyle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconHeight(long j) {
        this.iconHeight_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNightUrl(String str) {
        str.getClass();
        this.iconNightUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconNightUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconNightUrl_ = byteString.toStringUtf8();
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
    public void setIconWidth(long j) {
        this.iconWidth_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68221.f16784xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PowerIconStyle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0002", new Object[]{"iconUrl_", "iconNightUrl_", "iconWidth_", "iconHeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PowerIconStyle> parser = PARSER;
                if (parser == null) {
                    synchronized (PowerIconStyle.class) {
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

    public long getIconHeight() {
        return this.iconHeight_;
    }

    public String getIconNightUrl() {
        return this.iconNightUrl_;
    }

    public ByteString getIconNightUrlBytes() {
        return ByteString.copyFromUtf8(this.iconNightUrl_);
    }

    public String getIconUrl() {
        return this.iconUrl_;
    }

    public ByteString getIconUrlBytes() {
        return ByteString.copyFromUtf8(this.iconUrl_);
    }

    public long getIconWidth() {
        return this.iconWidth_;
    }

    public static Builder newBuilder(PowerIconStyle powerIconStyle) {
        return DEFAULT_INSTANCE.createBuilder(powerIconStyle);
    }

    public static PowerIconStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PowerIconStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PowerIconStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PowerIconStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PowerIconStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PowerIconStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PowerIconStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PowerIconStyle parseFrom(InputStream inputStream) throws IOException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PowerIconStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PowerIconStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PowerIconStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PowerIconStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
