package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes20.dex */
public final class DanmakuAIFlag extends GeneratedMessageLite<DanmakuAIFlag, DanmakuAIFlag.C13132b> implements MessageLiteOrBuilder {
    private static final DanmakuAIFlag DEFAULT_INSTANCE;
    public static final int DM_FLAGS_FIELD_NUMBER = 1;
    private static volatile Parser<DanmakuAIFlag> PARSER;
    private Internal.ProtobufList<DanmakuFlag> dmFlags_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmakuAIFlag$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C13131a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21500xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21500xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21500xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21500xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21500xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21500xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21500xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21500xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmakuAIFlag$b */
    /* loaded from: classes20.dex */
    public static final class C13132b extends GeneratedMessageLite.Builder<DanmakuAIFlag, C13132b> implements MessageLiteOrBuilder {
        /* synthetic */ C13132b(C13131a c13131a) {
            this();
        }

        public C13132b addAllDmFlags(Iterable<? extends DanmakuFlag> iterable) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).addAllDmFlags(iterable);
            return this;
        }

        public C13132b addDmFlags(DanmakuFlag danmakuFlag) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).addDmFlags(danmakuFlag);
            return this;
        }

        public C13132b clearDmFlags() {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).clearDmFlags();
            return this;
        }

        public DanmakuFlag getDmFlags(int i) {
            return ((DanmakuAIFlag) this.instance).getDmFlags(i);
        }

        public int getDmFlagsCount() {
            return ((DanmakuAIFlag) this.instance).getDmFlagsCount();
        }

        public List<DanmakuFlag> getDmFlagsList() {
            return Collections.unmodifiableList(((DanmakuAIFlag) this.instance).getDmFlagsList());
        }

        public C13132b removeDmFlags(int i) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).removeDmFlags(i);
            return this;
        }

        public C13132b setDmFlags(int i, DanmakuFlag danmakuFlag) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).setDmFlags(i, danmakuFlag);
            return this;
        }

        private C13132b() {
            super(DanmakuAIFlag.DEFAULT_INSTANCE);
        }

        public C13132b addDmFlags(int i, DanmakuFlag danmakuFlag) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).addDmFlags(i, danmakuFlag);
            return this;
        }

        public C13132b setDmFlags(int i, DanmakuFlag.C13136b c13136b) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).setDmFlags(i, c13136b.build());
            return this;
        }

        public C13132b addDmFlags(DanmakuFlag.C13136b c13136b) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).addDmFlags(c13136b.build());
            return this;
        }

        public C13132b addDmFlags(int i, DanmakuFlag.C13136b c13136b) {
            copyOnWrite();
            ((DanmakuAIFlag) this.instance).addDmFlags(i, c13136b.build());
            return this;
        }
    }

    static {
        DanmakuAIFlag danmakuAIFlag = new DanmakuAIFlag();
        DEFAULT_INSTANCE = danmakuAIFlag;
        GeneratedMessageLite.registerDefaultInstance(DanmakuAIFlag.class, danmakuAIFlag);
    }

    private DanmakuAIFlag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDmFlags(Iterable<? extends DanmakuFlag> iterable) {
        ensureDmFlagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dmFlags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDmFlags(DanmakuFlag danmakuFlag) {
        danmakuFlag.getClass();
        ensureDmFlagsIsMutable();
        this.dmFlags_.add(danmakuFlag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDmFlags() {
        this.dmFlags_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDmFlagsIsMutable() {
        Internal.ProtobufList<DanmakuFlag> protobufList = this.dmFlags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dmFlags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DanmakuAIFlag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13132b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmakuAIFlag parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuAIFlag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmakuAIFlag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDmFlags(int i) {
        ensureDmFlagsIsMutable();
        this.dmFlags_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDmFlags(int i, DanmakuFlag danmakuFlag) {
        danmakuFlag.getClass();
        ensureDmFlagsIsMutable();
        this.dmFlags_.set(i, danmakuFlag);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13131a.f21500xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmakuAIFlag();
            case 2:
                return new C13132b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"dmFlags_", DanmakuFlag.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmakuAIFlag> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmakuAIFlag.class) {
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

    public DanmakuFlag getDmFlags(int i) {
        return this.dmFlags_.get(i);
    }

    public int getDmFlagsCount() {
        return this.dmFlags_.size();
    }

    public List<DanmakuFlag> getDmFlagsList() {
        return this.dmFlags_;
    }

    public InterfaceC13299f getDmFlagsOrBuilder(int i) {
        return this.dmFlags_.get(i);
    }

    public List<? extends InterfaceC13299f> getDmFlagsOrBuilderList() {
        return this.dmFlags_;
    }

    public static C13132b newBuilder(DanmakuAIFlag danmakuAIFlag) {
        return DEFAULT_INSTANCE.createBuilder(danmakuAIFlag);
    }

    public static DanmakuAIFlag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuAIFlag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmakuAIFlag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDmFlags(int i, DanmakuFlag danmakuFlag) {
        danmakuFlag.getClass();
        ensureDmFlagsIsMutable();
        this.dmFlags_.add(i, danmakuFlag);
    }

    public static DanmakuAIFlag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmakuAIFlag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmakuAIFlag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmakuAIFlag parseFrom(InputStream inputStream) throws IOException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuAIFlag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuAIFlag parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmakuAIFlag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuAIFlag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
