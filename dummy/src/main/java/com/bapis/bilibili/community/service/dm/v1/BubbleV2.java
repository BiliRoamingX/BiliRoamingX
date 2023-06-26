package com.bapis.bilibili.community.service.dm.v1;

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
public final class BubbleV2 extends GeneratedMessageLite<BubbleV2, BubbleV2.Builder> implements MessageLiteOrBuilder {
    public static final int BUBBLE_TYPE_FIELD_NUMBER = 3;
    private static final BubbleV2 DEFAULT_INSTANCE;
    public static final int EXPOSURE_ONCE_FIELD_NUMBER = 4;
    public static final int EXPOSURE_TYPE_FIELD_NUMBER = 5;
    private static volatile Parser<BubbleV2> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private int bubbleType_;
    private boolean exposureOnce_;
    private int exposureType_;
    private String text_ = "";
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.BubbleV2$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71861 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17033xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17033xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BubbleV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71861 c71861) {
            this();
        }

        public Builder clearBubbleType() {
            copyOnWrite();
            ((BubbleV2) this.instance).clearBubbleType();
            return this;
        }

        public Builder clearExposureOnce() {
            copyOnWrite();
            ((BubbleV2) this.instance).clearExposureOnce();
            return this;
        }

        public Builder clearExposureType() {
            copyOnWrite();
            ((BubbleV2) this.instance).clearExposureType();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((BubbleV2) this.instance).clearText();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((BubbleV2) this.instance).clearUrl();
            return this;
        }

        public BubbleType getBubbleType() {
            return ((BubbleV2) this.instance).getBubbleType();
        }

        public int getBubbleTypeValue() {
            return ((BubbleV2) this.instance).getBubbleTypeValue();
        }

        public boolean getExposureOnce() {
            return ((BubbleV2) this.instance).getExposureOnce();
        }

        public ExposureType getExposureType() {
            return ((BubbleV2) this.instance).getExposureType();
        }

        public int getExposureTypeValue() {
            return ((BubbleV2) this.instance).getExposureTypeValue();
        }

        public String getText() {
            return ((BubbleV2) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((BubbleV2) this.instance).getTextBytes();
        }

        public String getUrl() {
            return ((BubbleV2) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((BubbleV2) this.instance).getUrlBytes();
        }

        public Builder setBubbleType(BubbleType bubbleType) {
            copyOnWrite();
            ((BubbleV2) this.instance).setBubbleType(bubbleType);
            return this;
        }

        public Builder setBubbleTypeValue(int i) {
            copyOnWrite();
            ((BubbleV2) this.instance).setBubbleTypeValue(i);
            return this;
        }

        public Builder setExposureOnce(boolean z) {
            copyOnWrite();
            ((BubbleV2) this.instance).setExposureOnce(z);
            return this;
        }

        public Builder setExposureType(ExposureType exposureType) {
            copyOnWrite();
            ((BubbleV2) this.instance).setExposureType(exposureType);
            return this;
        }

        public Builder setExposureTypeValue(int i) {
            copyOnWrite();
            ((BubbleV2) this.instance).setExposureTypeValue(i);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((BubbleV2) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((BubbleV2) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((BubbleV2) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((BubbleV2) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(BubbleV2.DEFAULT_INSTANCE);
        }
    }

    static {
        BubbleV2 bubbleV2 = new BubbleV2();
        DEFAULT_INSTANCE = bubbleV2;
        GeneratedMessageLite.registerDefaultInstance(BubbleV2.class, bubbleV2);
    }

    private BubbleV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBubbleType() {
        this.bubbleType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExposureOnce() {
        this.exposureOnce_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExposureType() {
        this.exposureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static BubbleV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BubbleV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BubbleV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BubbleV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BubbleV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubbleType(BubbleType bubbleType) {
        this.bubbleType_ = bubbleType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubbleTypeValue(int i) {
        this.bubbleType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureOnce(boolean z) {
        this.exposureOnce_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureType(ExposureType exposureType) {
        this.exposureType_ = exposureType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExposureTypeValue(int i) {
        this.exposureType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71861.f17033xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BubbleV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\f\u0004\u0007\u0005\f", new Object[]{"text_", "url_", "bubbleType_", "exposureOnce_", "exposureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BubbleV2> parser = PARSER;
                if (parser == null) {
                    synchronized (BubbleV2.class) {
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

    public BubbleType getBubbleType() {
        BubbleType forNumber = BubbleType.forNumber(this.bubbleType_);
        return forNumber == null ? BubbleType.UNRECOGNIZED : forNumber;
    }

    public int getBubbleTypeValue() {
        return this.bubbleType_;
    }

    public boolean getExposureOnce() {
        return this.exposureOnce_;
    }

    public ExposureType getExposureType() {
        ExposureType forNumber = ExposureType.forNumber(this.exposureType_);
        return forNumber == null ? ExposureType.UNRECOGNIZED : forNumber;
    }

    public int getExposureTypeValue() {
        return this.exposureType_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(BubbleV2 bubbleV2) {
        return DEFAULT_INSTANCE.createBuilder(bubbleV2);
    }

    public static BubbleV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BubbleV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BubbleV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BubbleV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BubbleV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BubbleV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BubbleV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BubbleV2 parseFrom(InputStream inputStream) throws IOException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BubbleV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BubbleV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BubbleV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BubbleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
