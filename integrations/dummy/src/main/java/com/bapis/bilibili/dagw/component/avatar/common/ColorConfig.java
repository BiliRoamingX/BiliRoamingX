package com.bapis.bilibili.dagw.component.avatar.common;

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
public final class ColorConfig extends GeneratedMessageLite<ColorConfig, ColorConfig.Builder> implements ColorConfigOrBuilder {
    public static final int DAY_FIELD_NUMBER = 2;
    private static final ColorConfig DEFAULT_INSTANCE;
    public static final int IS_DARK_MODE_AWARE_FIELD_NUMBER = 1;
    public static final int NIGHT_FIELD_NUMBER = 3;
    private static volatile Parser<ColorConfig> PARSER;
    private ColorSpec day_;
    private boolean isDarkModeAware_;
    private ColorSpec night_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.common.ColorConfig$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75131 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17362xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17362xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17362xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17362xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17362xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17362xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17362xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17362xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ColorConfig, Builder> implements ColorConfigOrBuilder {
        /* synthetic */ Builder(C75131 c75131) {
            this();
        }

        public Builder clearDay() {
            copyOnWrite();
            ((ColorConfig) this.instance).clearDay();
            return this;
        }

        public Builder clearIsDarkModeAware() {
            copyOnWrite();
            ((ColorConfig) this.instance).clearIsDarkModeAware();
            return this;
        }

        public Builder clearNight() {
            copyOnWrite();
            ((ColorConfig) this.instance).clearNight();
            return this;
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
        public ColorSpec getDay() {
            return ((ColorConfig) this.instance).getDay();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
        public boolean getIsDarkModeAware() {
            return ((ColorConfig) this.instance).getIsDarkModeAware();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
        public ColorSpec getNight() {
            return ((ColorConfig) this.instance).getNight();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
        public boolean hasDay() {
            return ((ColorConfig) this.instance).hasDay();
        }

        @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
        public boolean hasNight() {
            return ((ColorConfig) this.instance).hasNight();
        }

        public Builder mergeDay(ColorSpec colorSpec) {
            copyOnWrite();
            ((ColorConfig) this.instance).mergeDay(colorSpec);
            return this;
        }

        public Builder mergeNight(ColorSpec colorSpec) {
            copyOnWrite();
            ((ColorConfig) this.instance).mergeNight(colorSpec);
            return this;
        }

        public Builder setDay(ColorSpec colorSpec) {
            copyOnWrite();
            ((ColorConfig) this.instance).setDay(colorSpec);
            return this;
        }

        public Builder setIsDarkModeAware(boolean z) {
            copyOnWrite();
            ((ColorConfig) this.instance).setIsDarkModeAware(z);
            return this;
        }

        public Builder setNight(ColorSpec colorSpec) {
            copyOnWrite();
            ((ColorConfig) this.instance).setNight(colorSpec);
            return this;
        }

        private Builder() {
            super(ColorConfig.DEFAULT_INSTANCE);
        }

        public Builder setDay(ColorSpec.Builder builder) {
            copyOnWrite();
            ((ColorConfig) this.instance).setDay(builder.build());
            return this;
        }

        public Builder setNight(ColorSpec.Builder builder) {
            copyOnWrite();
            ((ColorConfig) this.instance).setNight(builder.build());
            return this;
        }
    }

    static {
        ColorConfig colorConfig = new ColorConfig();
        DEFAULT_INSTANCE = colorConfig;
        GeneratedMessageLite.registerDefaultInstance(ColorConfig.class, colorConfig);
    }

    private ColorConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.day_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDarkModeAware() {
        this.isDarkModeAware_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNight() {
        this.night_ = null;
    }

    public static ColorConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDay(ColorSpec colorSpec) {
        colorSpec.getClass();
        ColorSpec colorSpec2 = this.day_;
        if (colorSpec2 != null && colorSpec2 != ColorSpec.getDefaultInstance()) {
            this.day_ = ColorSpec.newBuilder(this.day_).mergeFrom((ColorSpec) colorSpec).buildPartial();
        } else {
            this.day_ = colorSpec;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNight(ColorSpec colorSpec) {
        colorSpec.getClass();
        ColorSpec colorSpec2 = this.night_;
        if (colorSpec2 != null && colorSpec2 != ColorSpec.getDefaultInstance()) {
            this.night_ = ColorSpec.newBuilder(this.night_).mergeFrom((ColorSpec) colorSpec).buildPartial();
        } else {
            this.night_ = colorSpec;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ColorConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ColorConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ColorConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ColorConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(ColorSpec colorSpec) {
        colorSpec.getClass();
        this.day_ = colorSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDarkModeAware(boolean z) {
        this.isDarkModeAware_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNight(ColorSpec colorSpec) {
        colorSpec.getClass();
        this.night_ = colorSpec;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75131.f17362xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ColorConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\t\u0003\t", new Object[]{"isDarkModeAware_", "day_", "night_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ColorConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (ColorConfig.class) {
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

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
    public ColorSpec getDay() {
        ColorSpec colorSpec = this.day_;
        return colorSpec == null ? ColorSpec.getDefaultInstance() : colorSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
    public boolean getIsDarkModeAware() {
        return this.isDarkModeAware_;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
    public ColorSpec getNight() {
        ColorSpec colorSpec = this.night_;
        return colorSpec == null ? ColorSpec.getDefaultInstance() : colorSpec;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
    public boolean hasDay() {
        return this.day_ != null;
    }

    @Override // com.bapis.bilibili.dagw.component.avatar.common.ColorConfigOrBuilder
    public boolean hasNight() {
        return this.night_ != null;
    }

    public static Builder newBuilder(ColorConfig colorConfig) {
        return DEFAULT_INSTANCE.createBuilder(colorConfig);
    }

    public static ColorConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ColorConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ColorConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ColorConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ColorConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ColorConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ColorConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ColorConfig parseFrom(InputStream inputStream) throws IOException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ColorConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ColorConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ColorConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ColorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
