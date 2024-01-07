package com.bapis.bilibili.app.distribution.setting.experimental;

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
public final class MultipleTusConfig extends GeneratedMessageLite<MultipleTusConfig, MultipleTusConfig.C8360b> implements MessageLiteOrBuilder {
    private static final MultipleTusConfig DEFAULT_INSTANCE;
    public static final int DYNAMICSELECT_FIELD_NUMBER = 2;
    private static volatile Parser<MultipleTusConfig> PARSER = null;
    public static final int TOPLEFT_FIELD_NUMBER = 1;
    private DynamicSelect dynamicSelect_;
    private TopLeft topLeft_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.MultipleTusConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8359a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19936xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19936xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19936xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19936xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19936xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19936xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19936xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19936xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.MultipleTusConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8360b extends GeneratedMessageLite.Builder<MultipleTusConfig, C8360b> implements MessageLiteOrBuilder {
        /* synthetic */ C8360b(C8359a c8359a) {
            this();
        }

        public C8360b clearDynamicSelect() {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).clearDynamicSelect();
            return this;
        }

        public C8360b clearTopLeft() {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).clearTopLeft();
            return this;
        }

        public DynamicSelect getDynamicSelect() {
            return ((MultipleTusConfig) this.instance).getDynamicSelect();
        }

        public TopLeft getTopLeft() {
            return ((MultipleTusConfig) this.instance).getTopLeft();
        }

        public boolean hasDynamicSelect() {
            return ((MultipleTusConfig) this.instance).hasDynamicSelect();
        }

        public boolean hasTopLeft() {
            return ((MultipleTusConfig) this.instance).hasTopLeft();
        }

        public C8360b mergeDynamicSelect(DynamicSelect dynamicSelect) {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).mergeDynamicSelect(dynamicSelect);
            return this;
        }

        public C8360b mergeTopLeft(TopLeft topLeft) {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).mergeTopLeft(topLeft);
            return this;
        }

        public C8360b setDynamicSelect(DynamicSelect dynamicSelect) {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).setDynamicSelect(dynamicSelect);
            return this;
        }

        public C8360b setTopLeft(TopLeft topLeft) {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).setTopLeft(topLeft);
            return this;
        }

        private C8360b() {
            super(MultipleTusConfig.DEFAULT_INSTANCE);
        }

        public C8360b setDynamicSelect(DynamicSelect.C8354b c8354b) {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).setDynamicSelect(c8354b.build());
            return this;
        }

        public C8360b setTopLeft(TopLeft.C8362b c8362b) {
            copyOnWrite();
            ((MultipleTusConfig) this.instance).setTopLeft(c8362b.build());
            return this;
        }
    }

    static {
        MultipleTusConfig multipleTusConfig = new MultipleTusConfig();
        DEFAULT_INSTANCE = multipleTusConfig;
        GeneratedMessageLite.registerDefaultInstance(MultipleTusConfig.class, multipleTusConfig);
    }

    private MultipleTusConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDynamicSelect() {
        this.dynamicSelect_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopLeft() {
        this.topLeft_ = null;
    }

    public static MultipleTusConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDynamicSelect(DynamicSelect dynamicSelect) {
        dynamicSelect.getClass();
        DynamicSelect dynamicSelect2 = this.dynamicSelect_;
        if (dynamicSelect2 != null && dynamicSelect2 != DynamicSelect.getDefaultInstance()) {
            this.dynamicSelect_ = DynamicSelect.newBuilder(this.dynamicSelect_).mergeFrom((DynamicSelect) dynamicSelect).buildPartial();
        } else {
            this.dynamicSelect_ = dynamicSelect;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopLeft(TopLeft topLeft) {
        topLeft.getClass();
        TopLeft topLeft2 = this.topLeft_;
        if (topLeft2 != null && topLeft2 != TopLeft.getDefaultInstance()) {
            this.topLeft_ = TopLeft.newBuilder(this.topLeft_).mergeFrom((TopLeft) topLeft).buildPartial();
        } else {
            this.topLeft_ = topLeft;
        }
    }

    public static C8360b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MultipleTusConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MultipleTusConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultipleTusConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MultipleTusConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDynamicSelect(DynamicSelect dynamicSelect) {
        dynamicSelect.getClass();
        this.dynamicSelect_ = dynamicSelect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopLeft(TopLeft topLeft) {
        topLeft.getClass();
        this.topLeft_ = topLeft;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8359a.f19936xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MultipleTusConfig();
            case 2:
                return new C8360b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"topLeft_", "dynamicSelect_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MultipleTusConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (MultipleTusConfig.class) {
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

    public DynamicSelect getDynamicSelect() {
        DynamicSelect dynamicSelect = this.dynamicSelect_;
        return dynamicSelect == null ? DynamicSelect.getDefaultInstance() : dynamicSelect;
    }

    public TopLeft getTopLeft() {
        TopLeft topLeft = this.topLeft_;
        return topLeft == null ? TopLeft.getDefaultInstance() : topLeft;
    }

    public boolean hasDynamicSelect() {
        return this.dynamicSelect_ != null;
    }

    public boolean hasTopLeft() {
        return this.topLeft_ != null;
    }

    public static C8360b newBuilder(MultipleTusConfig multipleTusConfig) {
        return DEFAULT_INSTANCE.createBuilder(multipleTusConfig);
    }

    public static MultipleTusConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultipleTusConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultipleTusConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MultipleTusConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MultipleTusConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MultipleTusConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MultipleTusConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MultipleTusConfig parseFrom(InputStream inputStream) throws IOException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultipleTusConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultipleTusConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MultipleTusConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultipleTusConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
