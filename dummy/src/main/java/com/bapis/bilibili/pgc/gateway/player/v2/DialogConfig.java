package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class DialogConfig extends GeneratedMessageLite<DialogConfig, DialogConfig.Builder> implements MessageLiteOrBuilder {
    private static final DialogConfig DEFAULT_INSTANCE;
    public static final int IS_BACKGROUND_TRANSLUCENT_ENABLE_FIELD_NUMBER = 5;
    public static final int IS_FORCE_HALFSCREEN_ENABLE_FIELD_NUMBER = 4;
    public static final int IS_NESTED_SCROLL_ENABLE_FIELD_NUMBER = 3;
    public static final int IS_ORIENTATION_ENABLE_FIELD_NUMBER = 2;
    public static final int IS_SHOW_COVER_FIELD_NUMBER = 1;
    private static volatile Parser<DialogConfig> PARSER;
    private boolean isBackgroundTranslucentEnable_;
    private boolean isForceHalfscreenEnable_;
    private boolean isNestedScrollEnable_;
    private boolean isOrientationEnable_;
    private boolean isShowCover_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.DialogConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78351 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17560xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17560xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17560xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17560xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17560xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17560xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17560xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17560xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DialogConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78351 c78351) {
            this();
        }

        public Builder clearIsBackgroundTranslucentEnable() {
            copyOnWrite();
            ((DialogConfig) this.instance).clearIsBackgroundTranslucentEnable();
            return this;
        }

        public Builder clearIsForceHalfscreenEnable() {
            copyOnWrite();
            ((DialogConfig) this.instance).clearIsForceHalfscreenEnable();
            return this;
        }

        public Builder clearIsNestedScrollEnable() {
            copyOnWrite();
            ((DialogConfig) this.instance).clearIsNestedScrollEnable();
            return this;
        }

        public Builder clearIsOrientationEnable() {
            copyOnWrite();
            ((DialogConfig) this.instance).clearIsOrientationEnable();
            return this;
        }

        public Builder clearIsShowCover() {
            copyOnWrite();
            ((DialogConfig) this.instance).clearIsShowCover();
            return this;
        }

        public boolean getIsBackgroundTranslucentEnable() {
            return ((DialogConfig) this.instance).getIsBackgroundTranslucentEnable();
        }

        public boolean getIsForceHalfscreenEnable() {
            return ((DialogConfig) this.instance).getIsForceHalfscreenEnable();
        }

        public boolean getIsNestedScrollEnable() {
            return ((DialogConfig) this.instance).getIsNestedScrollEnable();
        }

        public boolean getIsOrientationEnable() {
            return ((DialogConfig) this.instance).getIsOrientationEnable();
        }

        public boolean getIsShowCover() {
            return ((DialogConfig) this.instance).getIsShowCover();
        }

        public Builder setIsBackgroundTranslucentEnable(boolean z) {
            copyOnWrite();
            ((DialogConfig) this.instance).setIsBackgroundTranslucentEnable(z);
            return this;
        }

        public Builder setIsForceHalfscreenEnable(boolean z) {
            copyOnWrite();
            ((DialogConfig) this.instance).setIsForceHalfscreenEnable(z);
            return this;
        }

        public Builder setIsNestedScrollEnable(boolean z) {
            copyOnWrite();
            ((DialogConfig) this.instance).setIsNestedScrollEnable(z);
            return this;
        }

        public Builder setIsOrientationEnable(boolean z) {
            copyOnWrite();
            ((DialogConfig) this.instance).setIsOrientationEnable(z);
            return this;
        }

        public Builder setIsShowCover(boolean z) {
            copyOnWrite();
            ((DialogConfig) this.instance).setIsShowCover(z);
            return this;
        }

        private Builder() {
            super(DialogConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        DialogConfig dialogConfig = new DialogConfig();
        DEFAULT_INSTANCE = dialogConfig;
        GeneratedMessageLite.registerDefaultInstance(DialogConfig.class, dialogConfig);
    }

    private DialogConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBackgroundTranslucentEnable() {
        this.isBackgroundTranslucentEnable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsForceHalfscreenEnable() {
        this.isForceHalfscreenEnable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNestedScrollEnable() {
        this.isNestedScrollEnable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOrientationEnable() {
        this.isOrientationEnable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsShowCover() {
        this.isShowCover_ = false;
    }

    public static DialogConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DialogConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DialogConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DialogConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DialogConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBackgroundTranslucentEnable(boolean z) {
        this.isBackgroundTranslucentEnable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsForceHalfscreenEnable(boolean z) {
        this.isForceHalfscreenEnable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNestedScrollEnable(boolean z) {
        this.isNestedScrollEnable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOrientationEnable(boolean z) {
        this.isOrientationEnable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsShowCover(boolean z) {
        this.isShowCover_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78351.f17560xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DialogConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"isShowCover_", "isOrientationEnable_", "isNestedScrollEnable_", "isForceHalfscreenEnable_", "isBackgroundTranslucentEnable_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DialogConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DialogConfig.class) {
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

    public boolean getIsBackgroundTranslucentEnable() {
        return this.isBackgroundTranslucentEnable_;
    }

    public boolean getIsForceHalfscreenEnable() {
        return this.isForceHalfscreenEnable_;
    }

    public boolean getIsNestedScrollEnable() {
        return this.isNestedScrollEnable_;
    }

    public boolean getIsOrientationEnable() {
        return this.isOrientationEnable_;
    }

    public boolean getIsShowCover() {
        return this.isShowCover_;
    }

    public static Builder newBuilder(DialogConfig dialogConfig) {
        return DEFAULT_INSTANCE.createBuilder(dialogConfig);
    }

    public static DialogConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DialogConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DialogConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DialogConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DialogConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DialogConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DialogConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DialogConfig parseFrom(InputStream inputStream) throws IOException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DialogConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DialogConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DialogConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DialogConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
