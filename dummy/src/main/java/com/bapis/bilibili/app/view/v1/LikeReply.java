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
public final class LikeReply extends GeneratedMessageLite<LikeReply, LikeReply.Builder> implements MessageLiteOrBuilder {
    private static final LikeReply DEFAULT_INSTANCE;
    private static volatile Parser<LikeReply> PARSER = null;
    public static final int TOAST_FIELD_NUMBER = 1;
    public static final int V_VOUCHER_FIELD_NUMBER = 2;
    private String toast_ = "";
    private String vVoucher_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.LikeReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67871 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16754xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16754xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16754xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16754xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16754xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16754xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16754xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16754xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LikeReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67871 c67871) {
            this();
        }

        public Builder clearToast() {
            copyOnWrite();
            ((LikeReply) this.instance).clearToast();
            return this;
        }

        public Builder clearVVoucher() {
            copyOnWrite();
            ((LikeReply) this.instance).clearVVoucher();
            return this;
        }

        public String getToast() {
            return ((LikeReply) this.instance).getToast();
        }

        public ByteString getToastBytes() {
            return ((LikeReply) this.instance).getToastBytes();
        }

        public String getVVoucher() {
            return ((LikeReply) this.instance).getVVoucher();
        }

        public ByteString getVVoucherBytes() {
            return ((LikeReply) this.instance).getVVoucherBytes();
        }

        public Builder setToast(String str) {
            copyOnWrite();
            ((LikeReply) this.instance).setToast(str);
            return this;
        }

        public Builder setToastBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReply) this.instance).setToastBytes(byteString);
            return this;
        }

        public Builder setVVoucher(String str) {
            copyOnWrite();
            ((LikeReply) this.instance).setVVoucher(str);
            return this;
        }

        public Builder setVVoucherBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeReply) this.instance).setVVoucherBytes(byteString);
            return this;
        }

        private Builder() {
            super(LikeReply.DEFAULT_INSTANCE);
        }
    }

    static {
        LikeReply likeReply = new LikeReply();
        DEFAULT_INSTANCE = likeReply;
        GeneratedMessageLite.registerDefaultInstance(LikeReply.class, likeReply);
    }

    private LikeReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToast() {
        this.toast_ = getDefaultInstance().getToast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVVoucher() {
        this.vVoucher_ = getDefaultInstance().getVVoucher();
    }

    public static LikeReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(String str) {
        str.getClass();
        this.toast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toast_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVVoucher(String str) {
        str.getClass();
        this.vVoucher_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVVoucherBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vVoucher_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67871.f16754xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"toast_", "vVoucher_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeReply> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeReply.class) {
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

    public String getToast() {
        return this.toast_;
    }

    public ByteString getToastBytes() {
        return ByteString.copyFromUtf8(this.toast_);
    }

    public String getVVoucher() {
        return this.vVoucher_;
    }

    public ByteString getVVoucherBytes() {
        return ByteString.copyFromUtf8(this.vVoucher_);
    }

    public static Builder newBuilder(LikeReply likeReply) {
        return DEFAULT_INSTANCE.createBuilder(likeReply);
    }

    public static LikeReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeReply parseFrom(InputStream inputStream) throws IOException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
