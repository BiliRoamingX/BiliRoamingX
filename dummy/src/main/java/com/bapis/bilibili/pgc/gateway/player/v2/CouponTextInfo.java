package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class CouponTextInfo extends GeneratedMessageLite<CouponTextInfo, CouponTextInfo.Builder> implements MessageLiteOrBuilder {
    private static final CouponTextInfo DEFAULT_INSTANCE;
    private static volatile Parser<CouponTextInfo> PARSER = null;
    public static final int POSITIVE_PREVIEW_FIELD_NUMBER = 1;
    public static final int SECTION_FIELD_NUMBER = 2;
    private String positivePreview_ = "";
    private String section_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.CouponTextInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78291 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17554xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17554xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17554xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17554xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17554xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17554xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17554xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17554xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CouponTextInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78291 c78291) {
            this();
        }

        public Builder clearPositivePreview() {
            copyOnWrite();
            ((CouponTextInfo) this.instance).clearPositivePreview();
            return this;
        }

        public Builder clearSection() {
            copyOnWrite();
            ((CouponTextInfo) this.instance).clearSection();
            return this;
        }

        public String getPositivePreview() {
            return ((CouponTextInfo) this.instance).getPositivePreview();
        }

        public ByteString getPositivePreviewBytes() {
            return ((CouponTextInfo) this.instance).getPositivePreviewBytes();
        }

        public String getSection() {
            return ((CouponTextInfo) this.instance).getSection();
        }

        public ByteString getSectionBytes() {
            return ((CouponTextInfo) this.instance).getSectionBytes();
        }

        public Builder setPositivePreview(String str) {
            copyOnWrite();
            ((CouponTextInfo) this.instance).setPositivePreview(str);
            return this;
        }

        public Builder setPositivePreviewBytes(ByteString byteString) {
            copyOnWrite();
            ((CouponTextInfo) this.instance).setPositivePreviewBytes(byteString);
            return this;
        }

        public Builder setSection(String str) {
            copyOnWrite();
            ((CouponTextInfo) this.instance).setSection(str);
            return this;
        }

        public Builder setSectionBytes(ByteString byteString) {
            copyOnWrite();
            ((CouponTextInfo) this.instance).setSectionBytes(byteString);
            return this;
        }

        private Builder() {
            super(CouponTextInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        CouponTextInfo couponTextInfo = new CouponTextInfo();
        DEFAULT_INSTANCE = couponTextInfo;
        GeneratedMessageLite.registerDefaultInstance(CouponTextInfo.class, couponTextInfo);
    }

    private CouponTextInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositivePreview() {
        this.positivePreview_ = getDefaultInstance().getPositivePreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSection() {
        this.section_ = getDefaultInstance().getSection();
    }

    public static CouponTextInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CouponTextInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CouponTextInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CouponTextInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CouponTextInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositivePreview(String str) {
        str.getClass();
        this.positivePreview_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositivePreviewBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.positivePreview_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSection(String str) {
        str.getClass();
        this.section_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSectionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.section_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78291.f17554xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CouponTextInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"positivePreview_", "section_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CouponTextInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (CouponTextInfo.class) {
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

    public String getPositivePreview() {
        return this.positivePreview_;
    }

    public ByteString getPositivePreviewBytes() {
        return ByteString.copyFromUtf8(this.positivePreview_);
    }

    public String getSection() {
        return this.section_;
    }

    public ByteString getSectionBytes() {
        return ByteString.copyFromUtf8(this.section_);
    }

    public static Builder newBuilder(CouponTextInfo couponTextInfo) {
        return DEFAULT_INSTANCE.createBuilder(couponTextInfo);
    }

    public static CouponTextInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponTextInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CouponTextInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CouponTextInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CouponTextInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CouponTextInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CouponTextInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CouponTextInfo parseFrom(InputStream inputStream) throws IOException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CouponTextInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CouponTextInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CouponTextInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CouponTextInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
