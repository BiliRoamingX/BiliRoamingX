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
public final class PointMaterial extends GeneratedMessageLite<PointMaterial, PointMaterial.Builder> implements MessageLiteOrBuilder {
    private static final PointMaterial DEFAULT_INSTANCE;
    public static final int MATERIAL_SOURCE_FIELD_NUMBER = 2;
    private static volatile Parser<PointMaterial> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int materialSource_;
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PointMaterial$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68211 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16783xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16783xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16783xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16783xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16783xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16783xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16783xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16783xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PointMaterial, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68211 c68211) {
            this();
        }

        public Builder clearMaterialSource() {
            copyOnWrite();
            ((PointMaterial) this.instance).clearMaterialSource();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((PointMaterial) this.instance).clearUrl();
            return this;
        }

        public MaterialSource getMaterialSource() {
            return ((PointMaterial) this.instance).getMaterialSource();
        }

        public int getMaterialSourceValue() {
            return ((PointMaterial) this.instance).getMaterialSourceValue();
        }

        public String getUrl() {
            return ((PointMaterial) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((PointMaterial) this.instance).getUrlBytes();
        }

        public Builder setMaterialSource(MaterialSource materialSource) {
            copyOnWrite();
            ((PointMaterial) this.instance).setMaterialSource(materialSource);
            return this;
        }

        public Builder setMaterialSourceValue(int i) {
            copyOnWrite();
            ((PointMaterial) this.instance).setMaterialSourceValue(i);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((PointMaterial) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PointMaterial) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(PointMaterial.DEFAULT_INSTANCE);
        }
    }

    static {
        PointMaterial pointMaterial = new PointMaterial();
        DEFAULT_INSTANCE = pointMaterial;
        GeneratedMessageLite.registerDefaultInstance(PointMaterial.class, pointMaterial);
    }

    private PointMaterial() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialSource() {
        this.materialSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static PointMaterial getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PointMaterial parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PointMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PointMaterial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PointMaterial> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialSource(MaterialSource materialSource) {
        this.materialSource_ = materialSource.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialSourceValue(int i) {
        this.materialSource_ = i;
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68211.f16783xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PointMaterial();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f", new Object[]{"url_", "materialSource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PointMaterial> parser = PARSER;
                if (parser == null) {
                    synchronized (PointMaterial.class) {
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

    public MaterialSource getMaterialSource() {
        MaterialSource forNumber = MaterialSource.forNumber(this.materialSource_);
        return forNumber == null ? MaterialSource.UNRECOGNIZED : forNumber;
    }

    public int getMaterialSourceValue() {
        return this.materialSource_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(PointMaterial pointMaterial) {
        return DEFAULT_INSTANCE.createBuilder(pointMaterial);
    }

    public static PointMaterial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PointMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PointMaterial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PointMaterial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PointMaterial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PointMaterial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PointMaterial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PointMaterial parseFrom(InputStream inputStream) throws IOException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PointMaterial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PointMaterial parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PointMaterial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PointMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
