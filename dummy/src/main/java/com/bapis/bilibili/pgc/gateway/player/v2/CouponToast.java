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
public final class CouponToast extends GeneratedMessageLite<CouponToast, CouponToast.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 2;
    private static final CouponToast DEFAULT_INSTANCE;
    private static volatile Parser<CouponToast> PARSER = null;
    public static final int TEXT_INFO_FIELD_NUMBER = 1;
    private ButtonInfo button_;
    private CouponTextInfo textInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.CouponToast$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17555xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17555xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17555xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17555xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17555xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17555xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17555xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17555xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CouponToast, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78301 c78301) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((CouponToast) this.instance).clearButton();
            return this;
        }

        public Builder clearTextInfo() {
            copyOnWrite();
            ((CouponToast) this.instance).clearTextInfo();
            return this;
        }

        public ButtonInfo getButton() {
            return ((CouponToast) this.instance).getButton();
        }

        public CouponTextInfo getTextInfo() {
            return ((CouponToast) this.instance).getTextInfo();
        }

        public boolean hasButton() {
            return ((CouponToast) this.instance).hasButton();
        }

        public boolean hasTextInfo() {
            return ((CouponToast) this.instance).hasTextInfo();
        }

        public Builder mergeButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((CouponToast) this.instance).mergeButton(buttonInfo);
            return this;
        }

        public Builder mergeTextInfo(CouponTextInfo couponTextInfo) {
            copyOnWrite();
            ((CouponToast) this.instance).mergeTextInfo(couponTextInfo);
            return this;
        }

        public Builder setButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((CouponToast) this.instance).setButton(buttonInfo);
            return this;
        }

        public Builder setTextInfo(CouponTextInfo couponTextInfo) {
            copyOnWrite();
            ((CouponToast) this.instance).setTextInfo(couponTextInfo);
            return this;
        }

        private Builder() {
            super(CouponToast.DEFAULT_INSTANCE);
        }

        public Builder setButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((CouponToast) this.instance).setButton(builder.build());
            return this;
        }

        public Builder setTextInfo(CouponTextInfo.Builder builder) {
            copyOnWrite();
            ((CouponToast) this.instance).setTextInfo(builder.build());
            return this;
        }
    }

    static {
        CouponToast couponToast = new CouponToast();
        DEFAULT_INSTANCE = couponToast;
        GeneratedMessageLite.registerDefaultInstance(CouponToast.class, couponToast);
    }

    private CouponToast() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextInfo() {
        this.textInfo_ = null;
    }

    public static CouponToast getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(ButtonInfo buttonInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTextInfo(CouponTextInfo couponTextInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CouponToast parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CouponToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CouponToast parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CouponToast> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        this.button_ = buttonInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextInfo(CouponTextInfo couponTextInfo) {
        couponTextInfo.getClass();
        this.textInfo_ = couponTextInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78301.f17555xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CouponToast();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"textInfo_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CouponToast> parser = PARSER;
                if (parser == null) {
                    synchronized (CouponToast.class) {
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

    public ButtonInfo getButton() {
        ButtonInfo buttonInfo = this.button_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    public CouponTextInfo getTextInfo() {
        CouponTextInfo couponTextInfo = this.textInfo_;
        return couponTextInfo == null ? CouponTextInfo.getDefaultInstance() : couponTextInfo;
    }

    public boolean hasButton() {
        return this.button_ != null;
    }

    public boolean hasTextInfo() {
        return this.textInfo_ != null;
    }

    public static Builder newBuilder(CouponToast couponToast) {
        return DEFAULT_INSTANCE.createBuilder(couponToast);
    }

    public static CouponToast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponToast) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CouponToast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CouponToast parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CouponToast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CouponToast parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CouponToast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CouponToast parseFrom(InputStream inputStream) throws IOException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CouponToast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CouponToast parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CouponToast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponToast) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
