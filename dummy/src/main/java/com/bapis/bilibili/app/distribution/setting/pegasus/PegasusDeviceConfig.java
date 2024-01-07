package com.bapis.bilibili.app.distribution.setting.pegasus;

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
public final class PegasusDeviceConfig extends GeneratedMessageLite<PegasusDeviceConfig, PegasusDeviceConfig.C8381b> implements MessageLiteOrBuilder {
    public static final int AUTO_PLAY_FIELD_NUMBER = 3;
    public static final int COLUMN_FIELD_NUMBER = 1;
    private static final PegasusDeviceConfig DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 2;
    private static volatile Parser<PegasusDeviceConfig> PARSER;
    private PegasusAutoPlay autoPlay_;
    private PegasusColumnValue column_;
    private FeedModeValue mode_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.pegasus.PegasusDeviceConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8380a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19944xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19944xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19944xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19944xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19944xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.pegasus.PegasusDeviceConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8381b extends GeneratedMessageLite.Builder<PegasusDeviceConfig, C8381b> implements MessageLiteOrBuilder {
        /* synthetic */ C8381b(C8380a c8380a) {
            this();
        }

        public C8381b clearAutoPlay() {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).clearAutoPlay();
            return this;
        }

        public C8381b clearColumn() {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).clearColumn();
            return this;
        }

        public C8381b clearMode() {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).clearMode();
            return this;
        }

        public PegasusAutoPlay getAutoPlay() {
            return ((PegasusDeviceConfig) this.instance).getAutoPlay();
        }

        public PegasusColumnValue getColumn() {
            return ((PegasusDeviceConfig) this.instance).getColumn();
        }

        public FeedModeValue getMode() {
            return ((PegasusDeviceConfig) this.instance).getMode();
        }

        public boolean hasAutoPlay() {
            return ((PegasusDeviceConfig) this.instance).hasAutoPlay();
        }

        public boolean hasColumn() {
            return ((PegasusDeviceConfig) this.instance).hasColumn();
        }

        public boolean hasMode() {
            return ((PegasusDeviceConfig) this.instance).hasMode();
        }

        public C8381b mergeAutoPlay(PegasusAutoPlay pegasusAutoPlay) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).mergeAutoPlay(pegasusAutoPlay);
            return this;
        }

        public C8381b mergeColumn(PegasusColumnValue pegasusColumnValue) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).mergeColumn(pegasusColumnValue);
            return this;
        }

        public C8381b mergeMode(FeedModeValue feedModeValue) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).mergeMode(feedModeValue);
            return this;
        }

        public C8381b setAutoPlay(PegasusAutoPlay pegasusAutoPlay) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).setAutoPlay(pegasusAutoPlay);
            return this;
        }

        public C8381b setColumn(PegasusColumnValue pegasusColumnValue) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).setColumn(pegasusColumnValue);
            return this;
        }

        public C8381b setMode(FeedModeValue feedModeValue) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).setMode(feedModeValue);
            return this;
        }

        private C8381b() {
            super(PegasusDeviceConfig.DEFAULT_INSTANCE);
        }

        public C8381b setAutoPlay(PegasusAutoPlay.C8377b c8377b) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).setAutoPlay(c8377b.build());
            return this;
        }

        public C8381b setColumn(PegasusColumnValue.C8379b c8379b) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).setColumn(c8379b.build());
            return this;
        }

        public C8381b setMode(FeedModeValue.C8375b c8375b) {
            copyOnWrite();
            ((PegasusDeviceConfig) this.instance).setMode(c8375b.build());
            return this;
        }
    }

    static {
        PegasusDeviceConfig pegasusDeviceConfig = new PegasusDeviceConfig();
        DEFAULT_INSTANCE = pegasusDeviceConfig;
        GeneratedMessageLite.registerDefaultInstance(PegasusDeviceConfig.class, pegasusDeviceConfig);
    }

    private PegasusDeviceConfig() {
    }

    public void clearAutoPlay() {
        this.autoPlay_ = null;
    }

    public void clearColumn() {
        this.column_ = null;
    }

    public void clearMode() {
        this.mode_ = null;
    }

    public static PegasusDeviceConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAutoPlay(PegasusAutoPlay pegasusAutoPlay) {
        pegasusAutoPlay.getClass();
        PegasusAutoPlay pegasusAutoPlay2 = this.autoPlay_;
        if (pegasusAutoPlay2 != null && pegasusAutoPlay2 != PegasusAutoPlay.getDefaultInstance()) {
            this.autoPlay_ = PegasusAutoPlay.newBuilder(this.autoPlay_).mergeFrom((PegasusAutoPlay) pegasusAutoPlay).buildPartial();
        } else {
            this.autoPlay_ = pegasusAutoPlay;
        }
    }

    public void mergeColumn(PegasusColumnValue pegasusColumnValue) {
        pegasusColumnValue.getClass();
        PegasusColumnValue pegasusColumnValue2 = this.column_;
        if (pegasusColumnValue2 != null && pegasusColumnValue2 != PegasusColumnValue.getDefaultInstance()) {
            this.column_ = PegasusColumnValue.newBuilder(this.column_).mergeFrom((PegasusColumnValue) pegasusColumnValue).buildPartial();
        } else {
            this.column_ = pegasusColumnValue;
        }
    }

    public void mergeMode(FeedModeValue feedModeValue) {
        feedModeValue.getClass();
        FeedModeValue feedModeValue2 = this.mode_;
        if (feedModeValue2 != null && feedModeValue2 != FeedModeValue.getDefaultInstance()) {
            this.mode_ = FeedModeValue.newBuilder(this.mode_).mergeFrom((FeedModeValue) feedModeValue).buildPartial();
        } else {
            this.mode_ = feedModeValue;
        }
    }

    public static C8381b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PegasusDeviceConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusDeviceConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PegasusDeviceConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAutoPlay(PegasusAutoPlay pegasusAutoPlay) {
        pegasusAutoPlay.getClass();
        this.autoPlay_ = pegasusAutoPlay;
    }

    public void setColumn(PegasusColumnValue pegasusColumnValue) {
        pegasusColumnValue.getClass();
        this.column_ = pegasusColumnValue;
    }

    public void setMode(FeedModeValue feedModeValue) {
        feedModeValue.getClass();
        this.mode_ = feedModeValue;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8380a.f19944xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PegasusDeviceConfig();
            case 2:
                return new C8381b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"column_", "mode_", "autoPlay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PegasusDeviceConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (PegasusDeviceConfig.class) {
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

    public PegasusAutoPlay getAutoPlay() {
        PegasusAutoPlay pegasusAutoPlay = this.autoPlay_;
        return pegasusAutoPlay == null ? PegasusAutoPlay.getDefaultInstance() : pegasusAutoPlay;
    }

    public PegasusColumnValue getColumn() {
        PegasusColumnValue pegasusColumnValue = this.column_;
        return pegasusColumnValue == null ? PegasusColumnValue.getDefaultInstance() : pegasusColumnValue;
    }

    public FeedModeValue getMode() {
        FeedModeValue feedModeValue = this.mode_;
        return feedModeValue == null ? FeedModeValue.getDefaultInstance() : feedModeValue;
    }

    public boolean hasAutoPlay() {
        return this.autoPlay_ != null;
    }

    public boolean hasColumn() {
        return this.column_ != null;
    }

    public boolean hasMode() {
        return this.mode_ != null;
    }

    public static C8381b newBuilder(PegasusDeviceConfig pegasusDeviceConfig) {
        return DEFAULT_INSTANCE.createBuilder(pegasusDeviceConfig);
    }

    public static PegasusDeviceConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusDeviceConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PegasusDeviceConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PegasusDeviceConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PegasusDeviceConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PegasusDeviceConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PegasusDeviceConfig parseFrom(InputStream inputStream) throws IOException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusDeviceConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusDeviceConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PegasusDeviceConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusDeviceConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
