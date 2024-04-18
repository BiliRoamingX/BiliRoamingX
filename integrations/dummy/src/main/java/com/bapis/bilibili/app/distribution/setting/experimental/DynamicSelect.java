package com.bapis.bilibili.app.distribution.setting.experimental;

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
public final class DynamicSelect extends GeneratedMessageLite<DynamicSelect, DynamicSelect.C8354b> implements MessageLiteOrBuilder {
    private static final DynamicSelect DEFAULT_INSTANCE;
    public static final int FOLD_FIELD_NUMBER = 1;
    private static volatile Parser<DynamicSelect> PARSER;
    private BoolValue fold_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.DynamicSelect$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8353a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19933xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19933xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19933xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19933xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19933xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19933xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19933xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19933xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.experimental.DynamicSelect$b */
    /* loaded from: classes13.dex */
    public static final class C8354b extends GeneratedMessageLite.Builder<DynamicSelect, C8354b> implements MessageLiteOrBuilder {
        /* synthetic */ C8354b(C8353a c8353a) {
            this();
        }

        public C8354b clearFold() {
            copyOnWrite();
            ((DynamicSelect) this.instance).clearFold();
            return this;
        }

        public BoolValue getFold() {
            return ((DynamicSelect) this.instance).getFold();
        }

        public boolean hasFold() {
            return ((DynamicSelect) this.instance).hasFold();
        }

        public C8354b mergeFold(BoolValue boolValue) {
            copyOnWrite();
            ((DynamicSelect) this.instance).mergeFold(boolValue);
            return this;
        }

        public C8354b setFold(BoolValue boolValue) {
            copyOnWrite();
            ((DynamicSelect) this.instance).setFold(boolValue);
            return this;
        }

        private C8354b() {
            super(DynamicSelect.DEFAULT_INSTANCE);
        }

        public C8354b setFold(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((DynamicSelect) this.instance).setFold(c8307b.build());
            return this;
        }
    }

    static {
        DynamicSelect dynamicSelect = new DynamicSelect();
        DEFAULT_INSTANCE = dynamicSelect;
        GeneratedMessageLite.registerDefaultInstance(DynamicSelect.class, dynamicSelect);
    }

    private DynamicSelect() {
    }

    public void clearFold() {
        this.fold_ = null;
    }

    public static DynamicSelect getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeFold(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.fold_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.fold_ = BoolValue.newBuilder(this.fold_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.fold_ = boolValue;
        }
    }

    public static C8354b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynamicSelect parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynamicSelect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicSelect parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynamicSelect> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setFold(BoolValue boolValue) {
        boolValue.getClass();
        this.fold_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8353a.f19933xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynamicSelect();
            case 2:
                return new C8354b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"fold_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynamicSelect> parser = PARSER;
                if (parser == null) {
                    synchronized (DynamicSelect.class) {
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

    public BoolValue getFold() {
        BoolValue boolValue = this.fold_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasFold() {
        return this.fold_ != null;
    }

    public static C8354b newBuilder(DynamicSelect dynamicSelect) {
        return DEFAULT_INSTANCE.createBuilder(dynamicSelect);
    }

    public static DynamicSelect parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicSelect) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicSelect parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynamicSelect parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynamicSelect parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynamicSelect parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynamicSelect parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynamicSelect parseFrom(InputStream inputStream) throws IOException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicSelect parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicSelect parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynamicSelect parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicSelect) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
