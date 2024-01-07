package com.bapis.bilibili.app.distribution.setting.play;

import com.bapis.bilibili.app.distribution.BoolValue;
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
public final class SpecificPlayConfig extends GeneratedMessageLite<SpecificPlayConfig, SpecificPlayConfig.C8389b> implements MessageLiteOrBuilder {
    private static final SpecificPlayConfig DEFAULT_INSTANCE;
    public static final int ENABLESEGMENTEDSECTION_FIELD_NUMBER = 1;
    private static volatile Parser<SpecificPlayConfig> PARSER;
    private BoolValue enableSegmentedSection_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.play.SpecificPlayConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8388a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19948xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19948xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19948xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19948xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19948xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19948xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.play.SpecificPlayConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8389b extends GeneratedMessageLite.Builder<SpecificPlayConfig, C8389b> implements MessageLiteOrBuilder {
        /* synthetic */ C8389b(C8388a c8388a) {
            this();
        }

        public C8389b clearEnableSegmentedSection() {
            copyOnWrite();
            ((SpecificPlayConfig) this.instance).clearEnableSegmentedSection();
            return this;
        }

        public BoolValue getEnableSegmentedSection() {
            return ((SpecificPlayConfig) this.instance).getEnableSegmentedSection();
        }

        public boolean hasEnableSegmentedSection() {
            return ((SpecificPlayConfig) this.instance).hasEnableSegmentedSection();
        }

        public C8389b mergeEnableSegmentedSection(BoolValue boolValue) {
            copyOnWrite();
            ((SpecificPlayConfig) this.instance).mergeEnableSegmentedSection(boolValue);
            return this;
        }

        public C8389b setEnableSegmentedSection(BoolValue boolValue) {
            copyOnWrite();
            ((SpecificPlayConfig) this.instance).setEnableSegmentedSection(boolValue);
            return this;
        }

        private C8389b() {
            super(SpecificPlayConfig.DEFAULT_INSTANCE);
        }

        public C8389b setEnableSegmentedSection(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((SpecificPlayConfig) this.instance).setEnableSegmentedSection(c8307b.build());
            return this;
        }
    }

    static {
        SpecificPlayConfig specificPlayConfig = new SpecificPlayConfig();
        DEFAULT_INSTANCE = specificPlayConfig;
        GeneratedMessageLite.registerDefaultInstance(SpecificPlayConfig.class, specificPlayConfig);
    }

    private SpecificPlayConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableSegmentedSection() {
        this.enableSegmentedSection_ = null;
    }

    public static SpecificPlayConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnableSegmentedSection(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.enableSegmentedSection_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.enableSegmentedSection_ = BoolValue.newBuilder(this.enableSegmentedSection_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.enableSegmentedSection_ = boolValue;
        }
    }

    public static C8389b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SpecificPlayConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpecificPlayConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SpecificPlayConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableSegmentedSection(BoolValue boolValue) {
        boolValue.getClass();
        this.enableSegmentedSection_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8388a.f19948xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SpecificPlayConfig();
            case 2:
                return new C8389b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"enableSegmentedSection_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SpecificPlayConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (SpecificPlayConfig.class) {
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

    public BoolValue getEnableSegmentedSection() {
        BoolValue boolValue = this.enableSegmentedSection_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasEnableSegmentedSection() {
        return this.enableSegmentedSection_ != null;
    }

    public static C8389b newBuilder(SpecificPlayConfig specificPlayConfig) {
        return DEFAULT_INSTANCE.createBuilder(specificPlayConfig);
    }

    public static SpecificPlayConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SpecificPlayConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SpecificPlayConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SpecificPlayConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SpecificPlayConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SpecificPlayConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SpecificPlayConfig parseFrom(InputStream inputStream) throws IOException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpecificPlayConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SpecificPlayConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SpecificPlayConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpecificPlayConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
