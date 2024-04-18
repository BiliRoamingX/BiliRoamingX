package com.bapis.bilibili.app.distribution.setting.pegasus;

import com.bapis.bilibili.app.distribution.BoolValue;
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
public final class PegasusAutoPlay extends GeneratedMessageLite<PegasusAutoPlay, PegasusAutoPlay.C8377b> implements MessageLiteOrBuilder {
    private static final PegasusAutoPlay DEFAULT_INSTANCE;
    public static final int DOUBLE_AFFECTED_BY_SERVER_SIDE_FIELD_NUMBER = 4;
    public static final int DOUBLE_FIELD_NUMBER = 2;
    private static volatile Parser<PegasusAutoPlay> PARSER = null;
    public static final int SINGLE_AFFECTED_BY_SERVER_SIDE_FIELD_NUMBER = 3;
    public static final int SINGLE_FIELD_NUMBER = 1;
    private BoolValue doubleAffectedByServerSide_;
    private Int64Value double_;
    private BoolValue singleAffectedByServerSide_;
    private Int64Value single_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.pegasus.PegasusAutoPlay$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8376a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19942xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19942xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19942xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19942xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19942xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19942xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19942xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19942xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.pegasus.PegasusAutoPlay$b */
    /* loaded from: classes13.dex */
    public static final class C8377b extends GeneratedMessageLite.Builder<PegasusAutoPlay, C8377b> implements MessageLiteOrBuilder {
        /* synthetic */ C8377b(C8376a c8376a) {
            this();
        }

        public C8377b clearDouble() {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).clearDouble();
            return this;
        }

        public C8377b clearDoubleAffectedByServerSide() {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).clearDoubleAffectedByServerSide();
            return this;
        }

        public C8377b clearSingle() {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).clearSingle();
            return this;
        }

        public C8377b clearSingleAffectedByServerSide() {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).clearSingleAffectedByServerSide();
            return this;
        }

        public Int64Value getDouble() {
            return ((PegasusAutoPlay) this.instance).getDouble();
        }

        public BoolValue getDoubleAffectedByServerSide() {
            return ((PegasusAutoPlay) this.instance).getDoubleAffectedByServerSide();
        }

        public Int64Value getSingle() {
            return ((PegasusAutoPlay) this.instance).getSingle();
        }

        public BoolValue getSingleAffectedByServerSide() {
            return ((PegasusAutoPlay) this.instance).getSingleAffectedByServerSide();
        }

        public boolean hasDouble() {
            return ((PegasusAutoPlay) this.instance).hasDouble();
        }

        public boolean hasDoubleAffectedByServerSide() {
            return ((PegasusAutoPlay) this.instance).hasDoubleAffectedByServerSide();
        }

        public boolean hasSingle() {
            return ((PegasusAutoPlay) this.instance).hasSingle();
        }

        public boolean hasSingleAffectedByServerSide() {
            return ((PegasusAutoPlay) this.instance).hasSingleAffectedByServerSide();
        }

        public C8377b mergeDouble(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).mergeDouble(int64Value);
            return this;
        }

        public C8377b mergeDoubleAffectedByServerSide(BoolValue boolValue) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).mergeDoubleAffectedByServerSide(boolValue);
            return this;
        }

        public C8377b mergeSingle(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).mergeSingle(int64Value);
            return this;
        }

        public C8377b mergeSingleAffectedByServerSide(BoolValue boolValue) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).mergeSingleAffectedByServerSide(boolValue);
            return this;
        }

        public C8377b setDouble(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setDouble(int64Value);
            return this;
        }

        public C8377b setDoubleAffectedByServerSide(BoolValue boolValue) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setDoubleAffectedByServerSide(boolValue);
            return this;
        }

        public C8377b setSingle(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setSingle(int64Value);
            return this;
        }

        public C8377b setSingleAffectedByServerSide(BoolValue boolValue) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setSingleAffectedByServerSide(boolValue);
            return this;
        }

        private C8377b() {
            super(PegasusAutoPlay.DEFAULT_INSTANCE);
        }

        public C8377b setDouble(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setDouble(c8322b.build());
            return this;
        }

        public C8377b setDoubleAffectedByServerSide(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setDoubleAffectedByServerSide(c8307b.build());
            return this;
        }

        public C8377b setSingle(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setSingle(c8322b.build());
            return this;
        }

        public C8377b setSingleAffectedByServerSide(BoolValue.C8307b c8307b) {
            copyOnWrite();
            ((PegasusAutoPlay) this.instance).setSingleAffectedByServerSide(c8307b.build());
            return this;
        }
    }

    static {
        PegasusAutoPlay pegasusAutoPlay = new PegasusAutoPlay();
        DEFAULT_INSTANCE = pegasusAutoPlay;
        GeneratedMessageLite.registerDefaultInstance(PegasusAutoPlay.class, pegasusAutoPlay);
    }

    private PegasusAutoPlay() {
    }

    public void clearDouble() {
        this.double_ = null;
    }

    public void clearDoubleAffectedByServerSide() {
        this.doubleAffectedByServerSide_ = null;
    }

    public void clearSingle() {
        this.single_ = null;
    }

    public void clearSingleAffectedByServerSide() {
        this.singleAffectedByServerSide_ = null;
    }

    public static PegasusAutoPlay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeDouble(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.double_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.double_ = Int64Value.newBuilder(this.double_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.double_ = int64Value;
        }
    }

    public void mergeDoubleAffectedByServerSide(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.doubleAffectedByServerSide_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.doubleAffectedByServerSide_ = BoolValue.newBuilder(this.doubleAffectedByServerSide_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.doubleAffectedByServerSide_ = boolValue;
        }
    }

    public void mergeSingle(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.single_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.single_ = Int64Value.newBuilder(this.single_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.single_ = int64Value;
        }
    }

    public void mergeSingleAffectedByServerSide(BoolValue boolValue) {
        boolValue.getClass();
        BoolValue boolValue2 = this.singleAffectedByServerSide_;
        if (boolValue2 != null && boolValue2 != BoolValue.getDefaultInstance()) {
            this.singleAffectedByServerSide_ = BoolValue.newBuilder(this.singleAffectedByServerSide_).mergeFrom((BoolValue) boolValue).buildPartial();
        } else {
            this.singleAffectedByServerSide_ = boolValue;
        }
    }

    public static C8377b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PegasusAutoPlay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusAutoPlay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PegasusAutoPlay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDouble(Int64Value int64Value) {
        int64Value.getClass();
        this.double_ = int64Value;
    }

    public void setDoubleAffectedByServerSide(BoolValue boolValue) {
        boolValue.getClass();
        this.doubleAffectedByServerSide_ = boolValue;
    }

    public void setSingle(Int64Value int64Value) {
        int64Value.getClass();
        this.single_ = int64Value;
    }

    public void setSingleAffectedByServerSide(BoolValue boolValue) {
        boolValue.getClass();
        this.singleAffectedByServerSide_ = boolValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8376a.f19942xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PegasusAutoPlay();
            case 2:
                return new C8377b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"single_", "double_", "singleAffectedByServerSide_", "doubleAffectedByServerSide_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PegasusAutoPlay> parser = PARSER;
                if (parser == null) {
                    synchronized (PegasusAutoPlay.class) {
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

    public Int64Value getDouble() {
        Int64Value int64Value = this.double_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public BoolValue getDoubleAffectedByServerSide() {
        BoolValue boolValue = this.doubleAffectedByServerSide_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public Int64Value getSingle() {
        Int64Value int64Value = this.single_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public BoolValue getSingleAffectedByServerSide() {
        BoolValue boolValue = this.singleAffectedByServerSide_;
        return boolValue == null ? BoolValue.getDefaultInstance() : boolValue;
    }

    public boolean hasDouble() {
        return this.double_ != null;
    }

    public boolean hasDoubleAffectedByServerSide() {
        return this.doubleAffectedByServerSide_ != null;
    }

    public boolean hasSingle() {
        return this.single_ != null;
    }

    public boolean hasSingleAffectedByServerSide() {
        return this.singleAffectedByServerSide_ != null;
    }

    public static C8377b newBuilder(PegasusAutoPlay pegasusAutoPlay) {
        return DEFAULT_INSTANCE.createBuilder(pegasusAutoPlay);
    }

    public static PegasusAutoPlay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusAutoPlay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PegasusAutoPlay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PegasusAutoPlay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PegasusAutoPlay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PegasusAutoPlay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PegasusAutoPlay parseFrom(InputStream inputStream) throws IOException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusAutoPlay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusAutoPlay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PegasusAutoPlay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusAutoPlay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
