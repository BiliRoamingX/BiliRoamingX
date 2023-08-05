package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

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
/* loaded from: classes17.dex */
public final class LiveTextConfig extends GeneratedMessageLite<LiveTextConfig, LiveTextConfig.Builder> implements MessageLiteOrBuilder {
    public static final int BORDER_WIDTH_FIELD_NUMBER = 4;
    private static final LiveTextConfig DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int OFFSET_Y_FIELD_NUMBER = 3;
    private static volatile Parser<LiveTextConfig> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private double borderWidth_;
    private double height_;
    private double offsetY_;
    private double width_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.LiveTextConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75471 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17389xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17389xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17389xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17389xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17389xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17389xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17389xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17389xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LiveTextConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75471 c75471) {
            this();
        }

        public Builder clearBorderWidth() {
            copyOnWrite();
            ((LiveTextConfig) this.instance).clearBorderWidth();
            return this;
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((LiveTextConfig) this.instance).clearHeight();
            return this;
        }

        public Builder clearOffsetY() {
            copyOnWrite();
            ((LiveTextConfig) this.instance).clearOffsetY();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((LiveTextConfig) this.instance).clearWidth();
            return this;
        }

        public double getBorderWidth() {
            return ((LiveTextConfig) this.instance).getBorderWidth();
        }

        public double getHeight() {
            return ((LiveTextConfig) this.instance).getHeight();
        }

        public double getOffsetY() {
            return ((LiveTextConfig) this.instance).getOffsetY();
        }

        public double getWidth() {
            return ((LiveTextConfig) this.instance).getWidth();
        }

        public Builder setBorderWidth(double d) {
            copyOnWrite();
            ((LiveTextConfig) this.instance).setBorderWidth(d);
            return this;
        }

        public Builder setHeight(double d) {
            copyOnWrite();
            ((LiveTextConfig) this.instance).setHeight(d);
            return this;
        }

        public Builder setOffsetY(double d) {
            copyOnWrite();
            ((LiveTextConfig) this.instance).setOffsetY(d);
            return this;
        }

        public Builder setWidth(double d) {
            copyOnWrite();
            ((LiveTextConfig) this.instance).setWidth(d);
            return this;
        }

        private Builder() {
            super(LiveTextConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        LiveTextConfig liveTextConfig = new LiveTextConfig();
        DEFAULT_INSTANCE = liveTextConfig;
        GeneratedMessageLite.registerDefaultInstance(LiveTextConfig.class, liveTextConfig);
    }

    private LiveTextConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderWidth() {
        this.borderWidth_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffsetY() {
        this.offsetY_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0.0d;
    }

    public static LiveTextConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LiveTextConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LiveTextConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveTextConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LiveTextConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderWidth(double d) {
        this.borderWidth_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(double d) {
        this.height_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffsetY(double d) {
        this.offsetY_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(double d) {
        this.width_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75471.f17389xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LiveTextConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"width_", "height_", "offsetY_", "borderWidth_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LiveTextConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (LiveTextConfig.class) {
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

    public double getBorderWidth() {
        return this.borderWidth_;
    }

    public double getHeight() {
        return this.height_;
    }

    public double getOffsetY() {
        return this.offsetY_;
    }

    public double getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(LiveTextConfig liveTextConfig) {
        return DEFAULT_INSTANCE.createBuilder(liveTextConfig);
    }

    public static LiveTextConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveTextConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveTextConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LiveTextConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LiveTextConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LiveTextConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LiveTextConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LiveTextConfig parseFrom(InputStream inputStream) throws IOException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveTextConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveTextConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LiveTextConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveTextConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
