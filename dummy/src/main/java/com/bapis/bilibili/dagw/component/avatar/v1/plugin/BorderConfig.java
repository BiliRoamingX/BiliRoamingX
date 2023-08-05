package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.bapis.bilibili.dagw.component.avatar.common.ColorConfig;
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
public final class BorderConfig extends GeneratedMessageLite<BorderConfig, BorderConfig.Builder> implements BorderConfigOrBuilder {
    public static final int BORDER_WIDTH_FIELD_NUMBER = 2;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final BorderConfig DEFAULT_INSTANCE;
    private static volatile Parser<BorderConfig> PARSER = null;
    public static final int RATIO_FIELD_NUMBER = 3;
    private double borderWidth_;
    private ColorConfig color_;
    private double ratio_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75391 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17381xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17381xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17381xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17381xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17381xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17381xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17381xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17381xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BorderConfig, Builder> implements BorderConfigOrBuilder {
        /* synthetic */ Builder(C75391 c75391) {
            this();
        }

        public Builder clearBorderWidth() {
            copyOnWrite();
            ((BorderConfig) this.instance).clearBorderWidth();
            return this;
        }

        public Builder clearColor() {
            copyOnWrite();
            ((BorderConfig) this.instance).clearColor();
            return this;
        }

        public Builder clearRatio() {
            copyOnWrite();
            ((BorderConfig) this.instance).clearRatio();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
        public double getBorderWidth() {
            return ((BorderConfig) this.instance).getBorderWidth();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
        public ColorConfig getColor() {
            return ((BorderConfig) this.instance).getColor();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
        public double getRatio() {
            return ((BorderConfig) this.instance).getRatio();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
        public boolean hasColor() {
            return ((BorderConfig) this.instance).hasColor();
        }

        public Builder mergeColor(ColorConfig colorConfig) {
            copyOnWrite();
            ((BorderConfig) this.instance).mergeColor(colorConfig);
            return this;
        }

        public Builder setBorderWidth(double d) {
            copyOnWrite();
            ((BorderConfig) this.instance).setBorderWidth(d);
            return this;
        }

        public Builder setColor(ColorConfig colorConfig) {
            copyOnWrite();
            ((BorderConfig) this.instance).setColor(colorConfig);
            return this;
        }

        public Builder setRatio(double d) {
            copyOnWrite();
            ((BorderConfig) this.instance).setRatio(d);
            return this;
        }

        private Builder() {
            super(BorderConfig.DEFAULT_INSTANCE);
        }

        public Builder setColor(ColorConfig.Builder builder) {
            copyOnWrite();
            ((BorderConfig) this.instance).setColor(builder.build());
            return this;
        }
    }

    static {
        BorderConfig borderConfig = new BorderConfig();
        DEFAULT_INSTANCE = borderConfig;
        GeneratedMessageLite.registerDefaultInstance(BorderConfig.class, borderConfig);
    }

    private BorderConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderWidth() {
        this.borderWidth_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRatio() {
        this.ratio_ = 0.0d;
    }

    public static BorderConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColor(ColorConfig colorConfig) {
        colorConfig.getClass();
        ColorConfig colorConfig2 = this.color_;
        if (colorConfig2 != null && colorConfig2 != ColorConfig.getDefaultInstance()) {
            this.color_ = ColorConfig.newBuilder(this.color_).mergeFrom((ColorConfig) colorConfig).buildPartial();
        } else {
            this.color_ = colorConfig;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BorderConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BorderConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BorderConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BorderConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderWidth(double d) {
        this.borderWidth_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(ColorConfig colorConfig) {
        colorConfig.getClass();
        this.color_ = colorConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRatio(double d) {
        this.ratio_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75391.f17381xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BorderConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0000\u0003\u0000", new Object[]{"color_", "borderWidth_", "ratio_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BorderConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (BorderConfig.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
    public double getBorderWidth() {
        return this.borderWidth_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
    public ColorConfig getColor() {
        ColorConfig colorConfig = this.color_;
        return colorConfig == null ? ColorConfig.getDefaultInstance() : colorConfig;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
    public double getRatio() {
        return this.ratio_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.v1.plugin.BorderConfigOrBuilder
    public boolean hasColor() {
        return this.color_ != null;
    }

    public static Builder newBuilder(BorderConfig borderConfig) {
        return DEFAULT_INSTANCE.createBuilder(borderConfig);
    }

    public static BorderConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BorderConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BorderConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BorderConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BorderConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BorderConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BorderConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BorderConfig parseFrom(InputStream inputStream) throws IOException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BorderConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BorderConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BorderConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BorderConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
