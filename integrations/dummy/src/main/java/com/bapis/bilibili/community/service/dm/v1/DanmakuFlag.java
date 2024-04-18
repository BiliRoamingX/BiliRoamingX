package com.bapis.bilibili.community.service.dm.v1;

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
public final class DanmakuFlag extends GeneratedMessageLite<DanmakuFlag, DanmakuFlag.C13136b> implements InterfaceC13299f {
    private static final DanmakuFlag DEFAULT_INSTANCE;
    public static final int DMID_FIELD_NUMBER = 1;
    public static final int FLAG_FIELD_NUMBER = 2;
    private static volatile Parser<DanmakuFlag> PARSER;
    private long dmid_;
    private int flag_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmakuFlag$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C13135a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21502xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21502xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21502xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21502xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21502xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21502xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21502xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21502xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmakuFlag$b */
    /* loaded from: classes20.dex */
    public static final class C13136b extends GeneratedMessageLite.Builder<DanmakuFlag, C13136b> implements InterfaceC13299f {
        /* synthetic */ C13136b(C13135a c13135a) {
            this();
        }

        public C13136b clearDmid() {
            copyOnWrite();
            ((DanmakuFlag) this.instance).clearDmid();
            return this;
        }

        public C13136b clearFlag() {
            copyOnWrite();
            ((DanmakuFlag) this.instance).clearFlag();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13299f
        public long getDmid() {
            return ((DanmakuFlag) this.instance).getDmid();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13299f
        public int getFlag() {
            return ((DanmakuFlag) this.instance).getFlag();
        }

        public C13136b setDmid(long j) {
            copyOnWrite();
            ((DanmakuFlag) this.instance).setDmid(j);
            return this;
        }

        public C13136b setFlag(int i) {
            copyOnWrite();
            ((DanmakuFlag) this.instance).setFlag(i);
            return this;
        }

        private C13136b() {
            super(DanmakuFlag.DEFAULT_INSTANCE);
        }
    }

    static {
        DanmakuFlag danmakuFlag = new DanmakuFlag();
        DEFAULT_INSTANCE = danmakuFlag;
        GeneratedMessageLite.registerDefaultInstance(DanmakuFlag.class, danmakuFlag);
    }

    private DanmakuFlag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDmid() {
        this.dmid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlag() {
        this.flag_ = 0;
    }

    public static DanmakuFlag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13136b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmakuFlag parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmakuFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuFlag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmakuFlag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDmid(long j) {
        this.dmid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlag(int i) {
        this.flag_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13135a.f21502xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmakuFlag();
            case 2:
                return new C13136b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u000b", new Object[]{"dmid_", "flag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmakuFlag> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmakuFlag.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13299f
    public long getDmid() {
        return this.dmid_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.InterfaceC13299f
    public int getFlag() {
        return this.flag_;
    }

    public static C13136b newBuilder(DanmakuFlag danmakuFlag) {
        return DEFAULT_INSTANCE.createBuilder(danmakuFlag);
    }

    public static DanmakuFlag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuFlag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmakuFlag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DanmakuFlag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmakuFlag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmakuFlag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmakuFlag parseFrom(InputStream inputStream) throws IOException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuFlag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuFlag parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmakuFlag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
