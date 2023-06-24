package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class EasterEgg extends GeneratedMessageLite<EasterEgg, EasterEgg.Builder> implements MessageLiteOrBuilder {
    public static final int CLOSE_COUNT_FIELD_NUMBER = 5;
    private static final EasterEgg DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MASK_COLOR_FIELD_NUMBER = 7;
    public static final int MASK_TRANSPARENCY_FIELD_NUMBER = 6;
    private static volatile Parser<EasterEgg> PARSER = null;
    public static final int PIC_TYPE_FIELD_NUMBER = 8;
    public static final int SHOW_COUNT_FIELD_NUMBER = 2;
    public static final int SHOW_TIME_FIELD_NUMBER = 9;
    public static final int SOURCE_MD5_FIELD_NUMBER = 11;
    public static final int SOURCE_SIZE_FIELD_NUMBER = 12;
    public static final int SOURCE_URL_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 4;
    private int closeCount_;
    private int id_;
    private int maskTransparency_;
    private int picType_;
    private int showCount_;
    private int showTime_;
    private int sourceSize_;
    private int type_;
    private String url_ = "";
    private String maskColor_ = "";
    private String sourceUrl_ = "";
    private String sourceMd5_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.EasterEgg$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17659xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17659xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17659xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17659xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17659xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17659xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17659xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17659xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EasterEgg, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79571 c79571) {
            this();
        }

        public Builder clearCloseCount() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearCloseCount();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearId();
            return this;
        }

        public Builder clearMaskColor() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearMaskColor();
            return this;
        }

        public Builder clearMaskTransparency() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearMaskTransparency();
            return this;
        }

        public Builder clearPicType() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearPicType();
            return this;
        }

        public Builder clearShowCount() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearShowCount();
            return this;
        }

        public Builder clearShowTime() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearShowTime();
            return this;
        }

        public Builder clearSourceMd5() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearSourceMd5();
            return this;
        }

        public Builder clearSourceSize() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearSourceSize();
            return this;
        }

        public Builder clearSourceUrl() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearSourceUrl();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearType();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((EasterEgg) this.instance).clearUrl();
            return this;
        }

        public int getCloseCount() {
            return ((EasterEgg) this.instance).getCloseCount();
        }

        public int getId() {
            return ((EasterEgg) this.instance).getId();
        }

        public String getMaskColor() {
            return ((EasterEgg) this.instance).getMaskColor();
        }

        public ByteString getMaskColorBytes() {
            return ((EasterEgg) this.instance).getMaskColorBytes();
        }

        public int getMaskTransparency() {
            return ((EasterEgg) this.instance).getMaskTransparency();
        }

        public int getPicType() {
            return ((EasterEgg) this.instance).getPicType();
        }

        public int getShowCount() {
            return ((EasterEgg) this.instance).getShowCount();
        }

        public int getShowTime() {
            return ((EasterEgg) this.instance).getShowTime();
        }

        public String getSourceMd5() {
            return ((EasterEgg) this.instance).getSourceMd5();
        }

        public ByteString getSourceMd5Bytes() {
            return ((EasterEgg) this.instance).getSourceMd5Bytes();
        }

        public int getSourceSize() {
            return ((EasterEgg) this.instance).getSourceSize();
        }

        public String getSourceUrl() {
            return ((EasterEgg) this.instance).getSourceUrl();
        }

        public ByteString getSourceUrlBytes() {
            return ((EasterEgg) this.instance).getSourceUrlBytes();
        }

        public int getType() {
            return ((EasterEgg) this.instance).getType();
        }

        public String getUrl() {
            return ((EasterEgg) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((EasterEgg) this.instance).getUrlBytes();
        }

        public Builder setCloseCount(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setCloseCount(i);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setId(i);
            return this;
        }

        public Builder setMaskColor(String str) {
            copyOnWrite();
            ((EasterEgg) this.instance).setMaskColor(str);
            return this;
        }

        public Builder setMaskColorBytes(ByteString byteString) {
            copyOnWrite();
            ((EasterEgg) this.instance).setMaskColorBytes(byteString);
            return this;
        }

        public Builder setMaskTransparency(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setMaskTransparency(i);
            return this;
        }

        public Builder setPicType(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setPicType(i);
            return this;
        }

        public Builder setShowCount(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setShowCount(i);
            return this;
        }

        public Builder setShowTime(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setShowTime(i);
            return this;
        }

        public Builder setSourceMd5(String str) {
            copyOnWrite();
            ((EasterEgg) this.instance).setSourceMd5(str);
            return this;
        }

        public Builder setSourceMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((EasterEgg) this.instance).setSourceMd5Bytes(byteString);
            return this;
        }

        public Builder setSourceSize(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setSourceSize(i);
            return this;
        }

        public Builder setSourceUrl(String str) {
            copyOnWrite();
            ((EasterEgg) this.instance).setSourceUrl(str);
            return this;
        }

        public Builder setSourceUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((EasterEgg) this.instance).setSourceUrlBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((EasterEgg) this.instance).setType(i);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((EasterEgg) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((EasterEgg) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(EasterEgg.DEFAULT_INSTANCE);
        }
    }

    static {
        EasterEgg easterEgg = new EasterEgg();
        DEFAULT_INSTANCE = easterEgg;
        GeneratedMessageLite.registerDefaultInstance(EasterEgg.class, easterEgg);
    }

    private EasterEgg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloseCount() {
        this.closeCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaskColor() {
        this.maskColor_ = getDefaultInstance().getMaskColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaskTransparency() {
        this.maskTransparency_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicType() {
        this.picType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowCount() {
        this.showCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTime() {
        this.showTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceMd5() {
        this.sourceMd5_ = getDefaultInstance().getSourceMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceSize() {
        this.sourceSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceUrl() {
        this.sourceUrl_ = getDefaultInstance().getSourceUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static EasterEgg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EasterEgg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EasterEgg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EasterEgg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EasterEgg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseCount(int i) {
        this.closeCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskColor(String str) {
        str.getClass();
        this.maskColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.maskColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaskTransparency(int i) {
        this.maskTransparency_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicType(int i) {
        this.picType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowCount(int i) {
        this.showCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTime(int i) {
        this.showTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceMd5(String str) {
        str.getClass();
        this.sourceMd5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sourceMd5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceSize(int i) {
        this.sourceSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceUrl(String str) {
        str.getClass();
        this.sourceUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sourceUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
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
        switch (C79571.f17659xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EasterEgg();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0208\u0005\u0004\u0006\u0004\u0007\u0208\b\u0004\t\u0004\n\u0208\u000b\u0208\f\u0004", new Object[]{"id_", "showCount_", "type_", "url_", "closeCount_", "maskTransparency_", "maskColor_", "picType_", "showTime_", "sourceUrl_", "sourceMd5_", "sourceSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EasterEgg> parser = PARSER;
                if (parser == null) {
                    synchronized (EasterEgg.class) {
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

    public int getCloseCount() {
        return this.closeCount_;
    }

    public int getId() {
        return this.id_;
    }

    public String getMaskColor() {
        return this.maskColor_;
    }

    public ByteString getMaskColorBytes() {
        return ByteString.copyFromUtf8(this.maskColor_);
    }

    public int getMaskTransparency() {
        return this.maskTransparency_;
    }

    public int getPicType() {
        return this.picType_;
    }

    public int getShowCount() {
        return this.showCount_;
    }

    public int getShowTime() {
        return this.showTime_;
    }

    public String getSourceMd5() {
        return this.sourceMd5_;
    }

    public ByteString getSourceMd5Bytes() {
        return ByteString.copyFromUtf8(this.sourceMd5_);
    }

    public int getSourceSize() {
        return this.sourceSize_;
    }

    public String getSourceUrl() {
        return this.sourceUrl_;
    }

    public ByteString getSourceUrlBytes() {
        return ByteString.copyFromUtf8(this.sourceUrl_);
    }

    public int getType() {
        return this.type_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(EasterEgg easterEgg) {
        return DEFAULT_INSTANCE.createBuilder(easterEgg);
    }

    public static EasterEgg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EasterEgg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EasterEgg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EasterEgg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EasterEgg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EasterEgg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EasterEgg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EasterEgg parseFrom(InputStream inputStream) throws IOException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EasterEgg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EasterEgg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EasterEgg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EasterEgg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
