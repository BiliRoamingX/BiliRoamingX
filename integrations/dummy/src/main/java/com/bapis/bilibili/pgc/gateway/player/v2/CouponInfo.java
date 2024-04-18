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
public final class CouponInfo extends GeneratedMessageLite<CouponInfo, CouponInfo.Builder> implements MessageLiteOrBuilder {
    private static final CouponInfo DEFAULT_INSTANCE;
    private static volatile Parser<CouponInfo> PARSER = null;
    public static final int POP_WIN_FIELD_NUMBER = 2;
    public static final int TOAST_FIELD_NUMBER = 1;
    private PopWin popWin_;
    private CouponToast toast_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.CouponInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17553xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17553xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17553xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17553xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17553xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17553xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17553xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17553xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CouponInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78281 c78281) {
            this();
        }

        public Builder clearPopWin() {
            copyOnWrite();
            ((CouponInfo) this.instance).clearPopWin();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((CouponInfo) this.instance).clearToast();
            return this;
        }

        public PopWin getPopWin() {
            return ((CouponInfo) this.instance).getPopWin();
        }

        public CouponToast getToast() {
            return ((CouponInfo) this.instance).getToast();
        }

        public boolean hasPopWin() {
            return ((CouponInfo) this.instance).hasPopWin();
        }

        public boolean hasToast() {
            return ((CouponInfo) this.instance).hasToast();
        }

        public Builder mergePopWin(PopWin popWin) {
            copyOnWrite();
            ((CouponInfo) this.instance).mergePopWin(popWin);
            return this;
        }

        public Builder mergeToast(CouponToast couponToast) {
            copyOnWrite();
            ((CouponInfo) this.instance).mergeToast(couponToast);
            return this;
        }

        public Builder setPopWin(PopWin popWin) {
            copyOnWrite();
            ((CouponInfo) this.instance).setPopWin(popWin);
            return this;
        }

        public Builder setToast(CouponToast couponToast) {
            copyOnWrite();
            ((CouponInfo) this.instance).setToast(couponToast);
            return this;
        }

        private Builder() {
            super(CouponInfo.DEFAULT_INSTANCE);
        }

        public Builder setPopWin(PopWin.Builder builder) {
            copyOnWrite();
            ((CouponInfo) this.instance).setPopWin(builder.build());
            return this;
        }

        public Builder setToast(CouponToast.Builder builder) {
            copyOnWrite();
            ((CouponInfo) this.instance).setToast(builder.build());
            return this;
        }
    }

    static {
        CouponInfo couponInfo = new CouponInfo();
        DEFAULT_INSTANCE = couponInfo;
        GeneratedMessageLite.registerDefaultInstance(CouponInfo.class, couponInfo);
    }

    private CouponInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopWin() {
        this.popWin_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToast() {
        this.toast_ = null;
    }

    public static CouponInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePopWin(PopWin popWin) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToast(CouponToast couponToast) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CouponInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CouponInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CouponInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CouponInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopWin(PopWin popWin) {
        popWin.getClass();
        this.popWin_ = popWin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(CouponToast couponToast) {
        couponToast.getClass();
        this.toast_ = couponToast;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78281.f17553xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CouponInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"toast_", "popWin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CouponInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (CouponInfo.class) {
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

    public PopWin getPopWin() {
        PopWin popWin = this.popWin_;
        return popWin == null ? PopWin.getDefaultInstance() : popWin;
    }

    public CouponToast getToast() {
        CouponToast couponToast = this.toast_;
        return couponToast == null ? CouponToast.getDefaultInstance() : couponToast;
    }

    public boolean hasPopWin() {
        return this.popWin_ != null;
    }

    public boolean hasToast() {
        return this.toast_ != null;
    }

    public static Builder newBuilder(CouponInfo couponInfo) {
        return DEFAULT_INSTANCE.createBuilder(couponInfo);
    }

    public static CouponInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CouponInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CouponInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CouponInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CouponInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CouponInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CouponInfo parseFrom(InputStream inputStream) throws IOException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CouponInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CouponInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CouponInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
