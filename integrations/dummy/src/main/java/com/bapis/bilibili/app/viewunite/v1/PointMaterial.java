package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class PointMaterial extends GeneratedMessageLite<PointMaterial, PointMaterial.C12350b> implements MessageLiteOrBuilder {
    private static final PointMaterial DEFAULT_INSTANCE;
    public static final int MATERIAL_SOURCE_FIELD_NUMBER = 2;
    private static volatile Parser<PointMaterial> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int materialSource_;
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.PointMaterial$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12349a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21285xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21285xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21285xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21285xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21285xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21285xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21285xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21285xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.PointMaterial$b */
    /* loaded from: classes20.dex */
    public static final class C12350b extends GeneratedMessageLite.Builder<PointMaterial, C12350b> implements MessageLiteOrBuilder {
        /* synthetic */ C12350b(C12349a c12349a) {
            this();
        }

        public C12350b clearMaterialSource() {
            copyOnWrite();
            ((PointMaterial) this.instance).clearMaterialSource();
            return this;
        }

        public C12350b clearUrl() {
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

        public C12350b setMaterialSource(MaterialSource materialSource) {
            copyOnWrite();
            ((PointMaterial) this.instance).setMaterialSource(materialSource);
            return this;
        }

        public C12350b setMaterialSourceValue(int i) {
            copyOnWrite();
            ((PointMaterial) this.instance).setMaterialSourceValue(i);
            return this;
        }

        public C12350b setUrl(String str) {
            copyOnWrite();
            ((PointMaterial) this.instance).setUrl(str);
            return this;
        }

        public C12350b setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PointMaterial) this.instance).setUrlBytes(byteString);
            return this;
        }

        private C12350b() {
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

    public static C12350b newBuilder() {
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12349a.f21285xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PointMaterial();
            case 2:
                return new C12350b(null);
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

    public static C12350b newBuilder(PointMaterial pointMaterial) {
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
