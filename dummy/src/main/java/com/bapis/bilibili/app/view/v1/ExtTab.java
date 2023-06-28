package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes13.dex */
public final class ExtTab extends GeneratedMessageLite<ExtTab, ExtTab.Builder> implements ExtTabOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final ExtTab DEFAULT_INSTANCE;
    public static final int EXT_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<ExtTab> PARSER;
    private String data_ = "";
    private int extType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ExtTab$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16735xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16735xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16735xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16735xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16735xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16735xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16735xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16735xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ExtTab, Builder> implements ExtTabOrBuilder {
        /* synthetic */ Builder(C67631 c67631) {
            this();
        }

        public Builder clearData() {
            copyOnWrite();
            ((ExtTab) this.instance).clearData();
            return this;
        }

        public Builder clearExtType() {
            copyOnWrite();
            ((ExtTab) this.instance).clearExtType();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
        public String getData() {
            return ((ExtTab) this.instance).getData();
        }

        @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
        public ByteString getDataBytes() {
            return ((ExtTab) this.instance).getDataBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
        public ExtType getExtType() {
            return ((ExtTab) this.instance).getExtType();
        }

        @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
        public int getExtTypeValue() {
            return ((ExtTab) this.instance).getExtTypeValue();
        }

        public Builder setData(String str) {
            copyOnWrite();
            ((ExtTab) this.instance).setData(str);
            return this;
        }

        public Builder setDataBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtTab) this.instance).setDataBytes(byteString);
            return this;
        }

        public Builder setExtType(ExtType extType) {
            copyOnWrite();
            ((ExtTab) this.instance).setExtType(extType);
            return this;
        }

        public Builder setExtTypeValue(int i) {
            copyOnWrite();
            ((ExtTab) this.instance).setExtTypeValue(i);
            return this;
        }

        private Builder() {
            super(ExtTab.DEFAULT_INSTANCE);
        }
    }

    static {
        ExtTab extTab = new ExtTab();
        DEFAULT_INSTANCE = extTab;
        GeneratedMessageLite.registerDefaultInstance(ExtTab.class, extTab);
    }

    private ExtTab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtType() {
        this.extType_ = 0;
    }

    public static ExtTab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtTab parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtTab parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtTab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(String str) {
        str.getClass();
        this.data_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.data_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtType(ExtType extType) {
        this.extType_ = extType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtTypeValue(int i) {
        this.extType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67631.f16735xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExtTab();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[]{"extType_", "data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtTab> parser = PARSER;
                if (parser == null) {
                    synchronized (ExtTab.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
    public String getData() {
        return this.data_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
    public ByteString getDataBytes() {
        return ByteString.copyFromUtf8(this.data_);
    }

    @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
    public ExtType getExtType() {
        ExtType forNumber = ExtType.forNumber(this.extType_);
        return forNumber == null ? ExtType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.view.v1.ExtTabOrBuilder
    public int getExtTypeValue() {
        return this.extType_;
    }

    public static Builder newBuilder(ExtTab extTab) {
        return DEFAULT_INSTANCE.createBuilder(extTab);
    }

    public static ExtTab parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtTab) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtTab parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtTab parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtTab parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtTab parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtTab parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtTab parseFrom(InputStream inputStream) throws IOException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtTab parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtTab parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtTab parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtTab) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
