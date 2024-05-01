package com.bapis.bilibili.metadata.network;

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
/* loaded from: classes23.dex */
public final class Network extends GeneratedMessageLite<Network, Network.b> implements com.bapis.bilibili.metadata.network.a {
    private static final Network DEFAULT_INSTANCE;
    public static final int OID_FIELD_NUMBER = 3;
    private static volatile Parser<Network> PARSER = null;
    public static final int TF_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String oid_ = "";
    private int tf_;
    private int type_;

    /* compiled from: BL */
    /* loaded from: classes23.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes23.dex */
    public static final class b extends GeneratedMessageLite.Builder<Network, b> implements com.bapis.bilibili.metadata.network.a {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearOid() {
            copyOnWrite();
            ((Network) this.instance).clearOid();
            return this;
        }

        public b clearTf() {
            copyOnWrite();
            ((Network) this.instance).clearTf();
            return this;
        }

        public b clearType() {
            copyOnWrite();
            ((Network) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.metadata.network.a
        public String getOid() {
            return ((Network) this.instance).getOid();
        }

        @Override // com.bapis.bilibili.metadata.network.a
        public ByteString getOidBytes() {
            return ((Network) this.instance).getOidBytes();
        }

        @Override // com.bapis.bilibili.metadata.network.a
        public TFType getTf() {
            return ((Network) this.instance).getTf();
        }

        @Override // com.bapis.bilibili.metadata.network.a
        public int getTfValue() {
            return ((Network) this.instance).getTfValue();
        }

        @Override // com.bapis.bilibili.metadata.network.a
        public NetworkType getType() {
            return ((Network) this.instance).getType();
        }

        @Override // com.bapis.bilibili.metadata.network.a
        public int getTypeValue() {
            return ((Network) this.instance).getTypeValue();
        }

        public b setOid(String str) {
            copyOnWrite();
            ((Network) this.instance).setOid(str);
            return this;
        }

        public b setOidBytes(ByteString byteString) {
            copyOnWrite();
            ((Network) this.instance).setOidBytes(byteString);
            return this;
        }

        public b setTf(TFType tFType) {
            copyOnWrite();
            ((Network) this.instance).setTf(tFType);
            return this;
        }

        public b setTfValue(int i14) {
            copyOnWrite();
            ((Network) this.instance).setTfValue(i14);
            return this;
        }

        public b setType(NetworkType networkType) {
            copyOnWrite();
            ((Network) this.instance).setType(networkType);
            return this;
        }

        public b setTypeValue(int i14) {
            copyOnWrite();
            ((Network) this.instance).setTypeValue(i14);
            return this;
        }

        private b() {
            super(Network.DEFAULT_INSTANCE);
        }
    }

    static {
        Network network = new Network();
        DEFAULT_INSTANCE = network;
        GeneratedMessageLite.registerDefaultInstance(Network.class, network);
    }

    private Network() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = getDefaultInstance().getOid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTf() {
        this.tf_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static Network getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Network parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Network) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Network parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Network> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(String str) {
        str.getClass();
        this.oid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTf(TFType tFType) {
        this.tf_ = tFType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTfValue(int i14) {
        this.tf_ = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(NetworkType networkType) {
        this.type_ = networkType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i14) {
        this.type_ = i14;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Network();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0208", new Object[]{"type_", "tf_", "oid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Network> parser = PARSER;
                if (parser == null) {
                    synchronized (Network.class) {
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

    @Override // com.bapis.bilibili.metadata.network.a
    public String getOid() {
        return this.oid_;
    }

    @Override // com.bapis.bilibili.metadata.network.a
    public ByteString getOidBytes() {
        return ByteString.copyFromUtf8(this.oid_);
    }

    @Override // com.bapis.bilibili.metadata.network.a
    public TFType getTf() {
        TFType forNumber = TFType.forNumber(this.tf_);
        if (forNumber == null) {
            return TFType.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.bapis.bilibili.metadata.network.a
    public int getTfValue() {
        return this.tf_;
    }

    @Override // com.bapis.bilibili.metadata.network.a
    public NetworkType getType() {
        NetworkType forNumber = NetworkType.forNumber(this.type_);
        if (forNumber == null) {
            return NetworkType.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // com.bapis.bilibili.metadata.network.a
    public int getTypeValue() {
        return this.type_;
    }

    public static b newBuilder(Network network) {
        return DEFAULT_INSTANCE.createBuilder(network);
    }

    public static Network parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Network) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Network parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Network parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Network parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Network parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Network parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Network parseFrom(InputStream inputStream) throws IOException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Network parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Network parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Network parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Network) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
