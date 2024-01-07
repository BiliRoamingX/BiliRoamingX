package com.bapis.bilibili.app.distribution.setting.story;

import com.bapis.bilibili.app.distribution.Int64Value;
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
public final class MidStoryConfig extends GeneratedMessageLite<MidStoryConfig, MidStoryConfig.C8399b> implements MessageLiteOrBuilder {
    private static final MidStoryConfig DEFAULT_INSTANCE;
    public static final int GESTURETYPE_FIELD_NUMBER = 1;
    private static volatile Parser<MidStoryConfig> PARSER;
    private Int64Value gestureType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.story.MidStoryConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8398a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19953xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19953xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19953xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19953xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19953xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19953xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19953xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19953xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.story.MidStoryConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8399b extends GeneratedMessageLite.Builder<MidStoryConfig, C8399b> implements MessageLiteOrBuilder {
        /* synthetic */ C8399b(C8398a c8398a) {
            this();
        }

        public C8399b clearGestureType() {
            copyOnWrite();
            ((MidStoryConfig) this.instance).clearGestureType();
            return this;
        }

        public Int64Value getGestureType() {
            return ((MidStoryConfig) this.instance).getGestureType();
        }

        public boolean hasGestureType() {
            return ((MidStoryConfig) this.instance).hasGestureType();
        }

        public C8399b mergeGestureType(Int64Value int64Value) {
            copyOnWrite();
            ((MidStoryConfig) this.instance).mergeGestureType(int64Value);
            return this;
        }

        public C8399b setGestureType(Int64Value int64Value) {
            copyOnWrite();
            ((MidStoryConfig) this.instance).setGestureType(int64Value);
            return this;
        }

        private C8399b() {
            super(MidStoryConfig.DEFAULT_INSTANCE);
        }

        public C8399b setGestureType(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((MidStoryConfig) this.instance).setGestureType(c8322b.build());
            return this;
        }
    }

    static {
        MidStoryConfig midStoryConfig = new MidStoryConfig();
        DEFAULT_INSTANCE = midStoryConfig;
        GeneratedMessageLite.registerDefaultInstance(MidStoryConfig.class, midStoryConfig);
    }

    private MidStoryConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGestureType() {
        this.gestureType_ = null;
    }

    public static MidStoryConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGestureType(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.gestureType_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.gestureType_ = Int64Value.newBuilder(this.gestureType_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.gestureType_ = int64Value;
        }
    }

    public static C8399b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MidStoryConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MidStoryConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MidStoryConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MidStoryConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGestureType(Int64Value int64Value) {
        int64Value.getClass();
        this.gestureType_ = int64Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8398a.f19953xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MidStoryConfig();
            case 2:
                return new C8399b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"gestureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MidStoryConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (MidStoryConfig.class) {
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

    public Int64Value getGestureType() {
        Int64Value int64Value = this.gestureType_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public boolean hasGestureType() {
        return this.gestureType_ != null;
    }

    public static C8399b newBuilder(MidStoryConfig midStoryConfig) {
        return DEFAULT_INSTANCE.createBuilder(midStoryConfig);
    }

    public static MidStoryConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidStoryConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MidStoryConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MidStoryConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MidStoryConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MidStoryConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MidStoryConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MidStoryConfig parseFrom(InputStream inputStream) throws IOException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MidStoryConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MidStoryConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MidStoryConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MidStoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
