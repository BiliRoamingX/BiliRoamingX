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
public final class BackgroundInfo extends GeneratedMessageLite<BackgroundInfo, BackgroundInfo.Builder> implements MessageLiteOrBuilder {
    private static final BackgroundInfo DEFAULT_INSTANCE;
    public static final int DRAWABLE_BITMAP_URL_FIELD_NUMBER = 2;
    public static final int DRAWABLE_COLOR_FIELD_NUMBER = 1;
    public static final int EFFECTS_FIELD_NUMBER = 3;
    private static volatile Parser<BackgroundInfo> PARSER;
    private int effects_;
    private String drawableColor_ = "";
    private String drawableBitmapUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.BackgroundInfo$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81561 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17886xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17886xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17886xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17886xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17886xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17886xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17886xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17886xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BackgroundInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81561 c81561) {
            this();
        }

        public Builder clearDrawableBitmapUrl() {
            copyOnWrite();
            ((BackgroundInfo) this.instance).clearDrawableBitmapUrl();
            return this;
        }

        public Builder clearDrawableColor() {
            copyOnWrite();
            ((BackgroundInfo) this.instance).clearDrawableColor();
            return this;
        }

        public Builder clearEffects() {
            copyOnWrite();
            ((BackgroundInfo) this.instance).clearEffects();
            return this;
        }

        public String getDrawableBitmapUrl() {
            return ((BackgroundInfo) this.instance).getDrawableBitmapUrl();
        }

        public ByteString getDrawableBitmapUrlBytes() {
            return ((BackgroundInfo) this.instance).getDrawableBitmapUrlBytes();
        }

        public String getDrawableColor() {
            return ((BackgroundInfo) this.instance).getDrawableColor();
        }

        public ByteString getDrawableColorBytes() {
            return ((BackgroundInfo) this.instance).getDrawableColorBytes();
        }

        public Effects getEffects() {
            return ((BackgroundInfo) this.instance).getEffects();
        }

        public int getEffectsValue() {
            return ((BackgroundInfo) this.instance).getEffectsValue();
        }

        public Builder setDrawableBitmapUrl(String str) {
            copyOnWrite();
            ((BackgroundInfo) this.instance).setDrawableBitmapUrl(str);
            return this;
        }

        public Builder setDrawableBitmapUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((BackgroundInfo) this.instance).setDrawableBitmapUrlBytes(byteString);
            return this;
        }

        public Builder setDrawableColor(String str) {
            copyOnWrite();
            ((BackgroundInfo) this.instance).setDrawableColor(str);
            return this;
        }

        public Builder setDrawableColorBytes(ByteString byteString) {
            copyOnWrite();
            ((BackgroundInfo) this.instance).setDrawableColorBytes(byteString);
            return this;
        }

        public Builder setEffects(Effects effects) {
            copyOnWrite();
            ((BackgroundInfo) this.instance).setEffects(effects);
            return this;
        }

        public Builder setEffectsValue(int i) {
            copyOnWrite();
            ((BackgroundInfo) this.instance).setEffectsValue(i);
            return this;
        }

        private Builder() {
            super(BackgroundInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        BackgroundInfo backgroundInfo = new BackgroundInfo();
        DEFAULT_INSTANCE = backgroundInfo;
        GeneratedMessageLite.registerDefaultInstance(BackgroundInfo.class, backgroundInfo);
    }

    public BackgroundInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrawableBitmapUrl() {
        this.drawableBitmapUrl_ = getDefaultInstance().getDrawableBitmapUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrawableColor() {
        this.drawableColor_ = getDefaultInstance().getDrawableColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEffects() {
        this.effects_ = 0;
    }

    public static BackgroundInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BackgroundInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BackgroundInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackgroundInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BackgroundInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawableBitmapUrl(String str) {
        str.getClass();
        this.drawableBitmapUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawableBitmapUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.drawableBitmapUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawableColor(String str) {
        str.getClass();
        this.drawableColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawableColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.drawableColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEffects(Effects effects) {
        this.effects_ = effects.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEffectsValue(int i) {
        this.effects_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81561.f17886xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BackgroundInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\f", new Object[]{"drawableColor_", "drawableBitmapUrl_", "effects_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BackgroundInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (BackgroundInfo.class) {
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

    public String getDrawableBitmapUrl() {
        return this.drawableBitmapUrl_;
    }

    public ByteString getDrawableBitmapUrlBytes() {
        return ByteString.copyFromUtf8(this.drawableBitmapUrl_);
    }

    public String getDrawableColor() {
        return this.drawableColor_;
    }

    public ByteString getDrawableColorBytes() {
        return ByteString.copyFromUtf8(this.drawableColor_);
    }

    public Effects getEffects() {
        Effects forNumber = Effects.forNumber(this.effects_);
        return forNumber == null ? Effects.UNRECOGNIZED : forNumber;
    }

    public int getEffectsValue() {
        return this.effects_;
    }

    public static Builder newBuilder(BackgroundInfo backgroundInfo) {
        return DEFAULT_INSTANCE.createBuilder(backgroundInfo);
    }

    public static BackgroundInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackgroundInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BackgroundInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BackgroundInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BackgroundInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BackgroundInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BackgroundInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BackgroundInfo parseFrom(InputStream inputStream) throws IOException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BackgroundInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BackgroundInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BackgroundInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackgroundInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
