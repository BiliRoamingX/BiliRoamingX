package com.bapis.bilibili.app.card.v1;

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
public final class DislikeReason extends GeneratedMessageLite<DislikeReason, DislikeReason.C5803b> implements InterfaceC5926f {
    private static final DislikeReason DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<DislikeReason> PARSER;
    private long id_;
    private String name_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.DislikeReason$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5802a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15950xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15950xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15950xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.DislikeReason$b */
    /* loaded from: classes13.dex */
    public static final class C5803b extends GeneratedMessageLite.Builder<DislikeReason, C5803b> implements InterfaceC5926f {
        /* synthetic */ C5803b(C5802a c5802a) {
            this();
        }

        public C5803b clearId() {
            copyOnWrite();
            ((DislikeReason) this.instance).clearId();
            return this;
        }

        public C5803b clearName() {
            copyOnWrite();
            ((DislikeReason) this.instance).clearName();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5926f
        public long getId() {
            return ((DislikeReason) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5926f
        public String getName() {
            return ((DislikeReason) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5926f
        public ByteString getNameBytes() {
            return ((DislikeReason) this.instance).getNameBytes();
        }

        public C5803b setId(long j) {
            copyOnWrite();
            ((DislikeReason) this.instance).setId(j);
            return this;
        }

        public C5803b setName(String str) {
            copyOnWrite();
            ((DislikeReason) this.instance).setName(str);
            return this;
        }

        public C5803b setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DislikeReason) this.instance).setNameBytes(byteString);
            return this;
        }

        private C5803b() {
            super(DislikeReason.DEFAULT_INSTANCE);
        }
    }

    static {
        DislikeReason dislikeReason = new DislikeReason();
        DEFAULT_INSTANCE = dislikeReason;
        GeneratedMessageLite.registerDefaultInstance(DislikeReason.class, dislikeReason);
    }

    private DislikeReason() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static DislikeReason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5803b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DislikeReason parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DislikeReason parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DislikeReason> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5802a.f15950xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DislikeReason();
            case 2:
                return new C5803b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0208", new Object[]{"id_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DislikeReason> parser = PARSER;
                if (parser == null) {
                    synchronized (DislikeReason.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5926f
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5926f
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5926f
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static C5803b newBuilder(DislikeReason dislikeReason) {
        return DEFAULT_INSTANCE.createBuilder(dislikeReason);
    }

    public static DislikeReason parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DislikeReason parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DislikeReason parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(InputStream inputStream) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DislikeReason parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DislikeReason parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DislikeReason parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DislikeReason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
