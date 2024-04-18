package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class DynFeatureGate extends GeneratedMessageLite<DynFeatureGate, DynFeatureGate.C5366b> implements d1 {
    private static final DynFeatureGate DEFAULT_INSTANCE;
    public static final int ENHANCED_INTERACTION_FIELD_NUMBER = 1;
    private static volatile Parser<DynFeatureGate> PARSER;
    private boolean enhancedInteraction_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynFeatureGate$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5365a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17253xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17253xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17253xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17253xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17253xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17253xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17253xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17253xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynFeatureGate$b */
    /* loaded from: classes19.dex */
    public static final class C5366b extends GeneratedMessageLite.Builder<DynFeatureGate, C5366b> implements d1 {
        /* synthetic */ C5366b(C5365a c5365a) {
            this();
        }

        public C5366b clearEnhancedInteraction() {
            copyOnWrite();
            ((DynFeatureGate) this.instance).clearEnhancedInteraction();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.d1
        public boolean getEnhancedInteraction() {
            return ((DynFeatureGate) this.instance).getEnhancedInteraction();
        }

        public C5366b setEnhancedInteraction(boolean z) {
            copyOnWrite();
            ((DynFeatureGate) this.instance).setEnhancedInteraction(z);
            return this;
        }

        private C5366b() {
            super(DynFeatureGate.DEFAULT_INSTANCE);
        }
    }

    static {
        DynFeatureGate dynFeatureGate = new DynFeatureGate();
        DEFAULT_INSTANCE = dynFeatureGate;
        GeneratedMessageLite.registerDefaultInstance(DynFeatureGate.class, dynFeatureGate);
    }

    private DynFeatureGate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnhancedInteraction() {
        this.enhancedInteraction_ = false;
    }

    public static DynFeatureGate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5366b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynFeatureGate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynFeatureGate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynFeatureGate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynFeatureGate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnhancedInteraction(boolean z) {
        this.enhancedInteraction_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5365a c5365a = null;
        switch (C5365a.f17253xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynFeatureGate();
            case 2:
                return new C5366b(c5365a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"enhancedInteraction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynFeatureGate> parser = PARSER;
                if (parser == null) {
                    synchronized (DynFeatureGate.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.d1
    public boolean getEnhancedInteraction() {
        return this.enhancedInteraction_;
    }

    public static C5366b newBuilder(DynFeatureGate dynFeatureGate) {
        return DEFAULT_INSTANCE.createBuilder(dynFeatureGate);
    }

    public static DynFeatureGate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynFeatureGate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynFeatureGate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynFeatureGate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynFeatureGate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynFeatureGate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynFeatureGate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynFeatureGate parseFrom(InputStream inputStream) throws IOException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynFeatureGate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynFeatureGate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynFeatureGate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynFeatureGate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
