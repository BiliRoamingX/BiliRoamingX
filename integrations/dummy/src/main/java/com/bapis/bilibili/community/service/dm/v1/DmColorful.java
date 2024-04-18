package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes20.dex */
public final class DmColorful extends GeneratedMessageLite<DmColorful, DmColorful.C13155b> implements InterfaceC13301h {
    private static final DmColorful DEFAULT_INSTANCE;
    private static volatile Parser<DmColorful> PARSER = null;
    public static final int SRC_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String src_ = "";
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmColorful$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C13154a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21510xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21510xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21510xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21510xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21510xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21510xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21510xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21510xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmColorful$b */
    /* loaded from: classes20.dex */
    public static final class C13155b extends GeneratedMessageLite.Builder<DmColorful, C13155b> implements InterfaceC13301h {
        /* synthetic */ C13155b(C13154a c13154a) {
            this();
        }

        public C13155b clearSrc() {
            copyOnWrite();
            ((DmColorful) this.instance).clearSrc();
            return this;
        }

        public C13155b clearType() {
            copyOnWrite();
            ((DmColorful) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
        public String getSrc() {
            return ((DmColorful) this.instance).getSrc();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
        public ByteString getSrcBytes() {
            return ((DmColorful) this.instance).getSrcBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
        public DmColorfulType getType() {
            return ((DmColorful) this.instance).getType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
        public int getTypeValue() {
            return ((DmColorful) this.instance).getTypeValue();
        }

        public C13155b setSrc(String str) {
            copyOnWrite();
            ((DmColorful) this.instance).setSrc(str);
            return this;
        }

        public C13155b setSrcBytes(ByteString byteString) {
            copyOnWrite();
            ((DmColorful) this.instance).setSrcBytes(byteString);
            return this;
        }

        public C13155b setType(DmColorfulType dmColorfulType) {
            copyOnWrite();
            ((DmColorful) this.instance).setType(dmColorfulType);
            return this;
        }

        public C13155b setTypeValue(int i) {
            copyOnWrite();
            ((DmColorful) this.instance).setTypeValue(i);
            return this;
        }

        private C13155b() {
            super(DmColorful.DEFAULT_INSTANCE);
        }
    }

    static {
        DmColorful dmColorful = new DmColorful();
        DEFAULT_INSTANCE = dmColorful;
        GeneratedMessageLite.registerDefaultInstance(DmColorful.class, dmColorful);
    }

    private DmColorful() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSrc() {
        this.src_ = getDefaultInstance().getSrc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static DmColorful getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13155b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmColorful parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmColorful) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmColorful parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmColorful> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrc(String str) {
        str.getClass();
        this.src_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrcBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.src_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(DmColorfulType dmColorfulType) {
        this.type_ = dmColorfulType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13154a.f21510xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmColorful();
            case 2:
                return new C13155b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[]{"type_", "src_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmColorful> parser = PARSER;
                if (parser == null) {
                    synchronized (DmColorful.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
    public String getSrc() {
        return this.src_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
    public ByteString getSrcBytes() {
        return ByteString.copyFromUtf8(this.src_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
    public DmColorfulType getType() {
        DmColorfulType forNumber = DmColorfulType.forNumber(this.type_);
        return forNumber == null ? DmColorfulType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13301h
    public int getTypeValue() {
        return this.type_;
    }

    public static C13155b newBuilder(DmColorful dmColorful) {
        return DEFAULT_INSTANCE.createBuilder(dmColorful);
    }

    public static DmColorful parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmColorful) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmColorful parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmColorful parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DmColorful parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmColorful parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmColorful parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmColorful parseFrom(InputStream inputStream) throws IOException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmColorful parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmColorful parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmColorful parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmColorful) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
