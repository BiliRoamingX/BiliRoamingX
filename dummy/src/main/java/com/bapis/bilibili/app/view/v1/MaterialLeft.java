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
public final class MaterialLeft extends GeneratedMessageLite<MaterialLeft, MaterialLeft.Builder> implements MessageLiteOrBuilder {
    private static final MaterialLeft DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int LEFT_TYPE_FIELD_NUMBER = 4;
    public static final int OPERATIONAL_TYPE_FIELD_NUMBER = 6;
    public static final int PARAM_FIELD_NUMBER = 5;
    private static volatile Parser<MaterialLeft> PARSER = null;
    public static final int STATIC_ICON_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 3;
    private String icon_ = "";
    private String text_ = "";
    private String url_ = "";
    private String leftType_ = "";
    private String param_ = "";
    private String operationalType_ = "";
    private String staticIcon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.MaterialLeft$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16761xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16761xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16761xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16761xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16761xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16761xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16761xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16761xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<MaterialLeft, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67941 c67941) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((MaterialLeft) this.instance).clearIcon();
            return this;
        }

        public Builder clearLeftType() {
            copyOnWrite();
            ((MaterialLeft) this.instance).clearLeftType();
            return this;
        }

        public Builder clearOperationalType() {
            copyOnWrite();
            ((MaterialLeft) this.instance).clearOperationalType();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((MaterialLeft) this.instance).clearParam();
            return this;
        }

        public Builder clearStaticIcon() {
            copyOnWrite();
            ((MaterialLeft) this.instance).clearStaticIcon();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((MaterialLeft) this.instance).clearText();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((MaterialLeft) this.instance).clearUrl();
            return this;
        }

        public String getIcon() {
            return ((MaterialLeft) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((MaterialLeft) this.instance).getIconBytes();
        }

        public String getLeftType() {
            return ((MaterialLeft) this.instance).getLeftType();
        }

        public ByteString getLeftTypeBytes() {
            return ((MaterialLeft) this.instance).getLeftTypeBytes();
        }

        public String getOperationalType() {
            return ((MaterialLeft) this.instance).getOperationalType();
        }

        public ByteString getOperationalTypeBytes() {
            return ((MaterialLeft) this.instance).getOperationalTypeBytes();
        }

        public String getParam() {
            return ((MaterialLeft) this.instance).getParam();
        }

        public ByteString getParamBytes() {
            return ((MaterialLeft) this.instance).getParamBytes();
        }

        public String getStaticIcon() {
            return ((MaterialLeft) this.instance).getStaticIcon();
        }

        public ByteString getStaticIconBytes() {
            return ((MaterialLeft) this.instance).getStaticIconBytes();
        }

        public String getText() {
            return ((MaterialLeft) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((MaterialLeft) this.instance).getTextBytes();
        }

        public String getUrl() {
            return ((MaterialLeft) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((MaterialLeft) this.instance).getUrlBytes();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setLeftType(String str) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setLeftType(str);
            return this;
        }

        public Builder setLeftTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setLeftTypeBytes(byteString);
            return this;
        }

        public Builder setOperationalType(String str) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setOperationalType(str);
            return this;
        }

        public Builder setOperationalTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setOperationalTypeBytes(byteString);
            return this;
        }

        public Builder setParam(String str) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setParam(str);
            return this;
        }

        public Builder setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setParamBytes(byteString);
            return this;
        }

        public Builder setStaticIcon(String str) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setStaticIcon(str);
            return this;
        }

        public Builder setStaticIconBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setStaticIconBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((MaterialLeft) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(MaterialLeft.DEFAULT_INSTANCE);
        }
    }

    static {
        MaterialLeft materialLeft = new MaterialLeft();
        DEFAULT_INSTANCE = materialLeft;
        GeneratedMessageLite.registerDefaultInstance(MaterialLeft.class, materialLeft);
    }

    private MaterialLeft() {
    }

    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    public void clearLeftType() {
        this.leftType_ = getDefaultInstance().getLeftType();
    }

    public void clearOperationalType() {
        this.operationalType_ = getDefaultInstance().getOperationalType();
    }

    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    public void clearStaticIcon() {
        this.staticIcon_ = getDefaultInstance().getStaticIcon();
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static MaterialLeft getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MaterialLeft parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MaterialLeft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaterialLeft parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MaterialLeft> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    public void setLeftType(String str) {
        str.getClass();
        this.leftType_ = str;
    }

    public void setLeftTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.leftType_ = byteString.toStringUtf8();
    }

    public void setOperationalType(String str) {
        str.getClass();
        this.operationalType_ = str;
    }

    public void setOperationalTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.operationalType_ = byteString.toStringUtf8();
    }

    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    public void setStaticIcon(String str) {
        str.getClass();
        this.staticIcon_ = str;
    }

    public void setStaticIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.staticIcon_ = byteString.toStringUtf8();
    }

    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67941.f16761xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MaterialLeft();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"icon_", "text_", "url_", "leftType_", "param_", "operationalType_", "staticIcon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MaterialLeft> parser = PARSER;
                if (parser == null) {
                    synchronized (MaterialLeft.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public String getLeftType() {
        return this.leftType_;
    }

    public ByteString getLeftTypeBytes() {
        return ByteString.copyFromUtf8(this.leftType_);
    }

    public String getOperationalType() {
        return this.operationalType_;
    }

    public ByteString getOperationalTypeBytes() {
        return ByteString.copyFromUtf8(this.operationalType_);
    }

    public String getParam() {
        return this.param_;
    }

    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    public String getStaticIcon() {
        return this.staticIcon_;
    }

    public ByteString getStaticIconBytes() {
        return ByteString.copyFromUtf8(this.staticIcon_);
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

    public static Builder newBuilder(MaterialLeft materialLeft) {
        return DEFAULT_INSTANCE.createBuilder(materialLeft);
    }

    public static MaterialLeft parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialLeft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MaterialLeft parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MaterialLeft parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MaterialLeft parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MaterialLeft parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MaterialLeft parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MaterialLeft parseFrom(InputStream inputStream) throws IOException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaterialLeft parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MaterialLeft parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MaterialLeft parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MaterialLeft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
