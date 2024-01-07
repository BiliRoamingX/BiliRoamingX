package com.bapis.bilibili.app.distribution.setting.pegasus;

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
public final class PegasusMidConfig extends GeneratedMessageLite<PegasusMidConfig, PegasusMidConfig.C8383b> implements MessageLiteOrBuilder {
    public static final int COLUMN_FIELD_NUMBER = 1;
    private static final PegasusMidConfig DEFAULT_INSTANCE;
    private static volatile Parser<PegasusMidConfig> PARSER = null;
    public static final int PLAY_MODE_FIELD_NUMBER = 2;
    private Int64Value column_;
    private Int64Value playMode_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.pegasus.PegasusMidConfig$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8382a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19945xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19945xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19945xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19945xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19945xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19945xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.setting.pegasus.PegasusMidConfig$b */
    /* loaded from: classes13.dex */
    public static final class C8383b extends GeneratedMessageLite.Builder<PegasusMidConfig, C8383b> implements MessageLiteOrBuilder {
        /* synthetic */ C8383b(C8382a c8382a) {
            this();
        }

        public C8383b clearColumn() {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).clearColumn();
            return this;
        }

        public C8383b clearPlayMode() {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).clearPlayMode();
            return this;
        }

        public Int64Value getColumn() {
            return ((PegasusMidConfig) this.instance).getColumn();
        }

        public Int64Value getPlayMode() {
            return ((PegasusMidConfig) this.instance).getPlayMode();
        }

        public boolean hasColumn() {
            return ((PegasusMidConfig) this.instance).hasColumn();
        }

        public boolean hasPlayMode() {
            return ((PegasusMidConfig) this.instance).hasPlayMode();
        }

        public C8383b mergeColumn(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).mergeColumn(int64Value);
            return this;
        }

        public C8383b mergePlayMode(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).mergePlayMode(int64Value);
            return this;
        }

        public C8383b setColumn(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).setColumn(int64Value);
            return this;
        }

        public C8383b setPlayMode(Int64Value int64Value) {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).setPlayMode(int64Value);
            return this;
        }

        private C8383b() {
            super(PegasusMidConfig.DEFAULT_INSTANCE);
        }

        public C8383b setColumn(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).setColumn(c8322b.build());
            return this;
        }

        public C8383b setPlayMode(Int64Value.C8322b c8322b) {
            copyOnWrite();
            ((PegasusMidConfig) this.instance).setPlayMode(c8322b.build());
            return this;
        }
    }

    static {
        PegasusMidConfig pegasusMidConfig = new PegasusMidConfig();
        DEFAULT_INSTANCE = pegasusMidConfig;
        GeneratedMessageLite.registerDefaultInstance(PegasusMidConfig.class, pegasusMidConfig);
    }

    private PegasusMidConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColumn() {
        this.column_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayMode() {
        this.playMode_ = null;
    }

    public static PegasusMidConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColumn(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.column_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.column_ = Int64Value.newBuilder(this.column_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.column_ = int64Value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayMode(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.playMode_;
        if (int64Value2 != null && int64Value2 != Int64Value.getDefaultInstance()) {
            this.playMode_ = Int64Value.newBuilder(this.playMode_).mergeFrom((Int64Value) int64Value).buildPartial();
        } else {
            this.playMode_ = int64Value;
        }
    }

    public static C8383b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PegasusMidConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PegasusMidConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusMidConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PegasusMidConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColumn(Int64Value int64Value) {
        int64Value.getClass();
        this.column_ = int64Value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayMode(Int64Value int64Value) {
        int64Value.getClass();
        this.playMode_ = int64Value;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8382a.f19945xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PegasusMidConfig();
            case 2:
                return new C8383b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"column_", "playMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PegasusMidConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (PegasusMidConfig.class) {
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

    public Int64Value getColumn() {
        Int64Value int64Value = this.column_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public Int64Value getPlayMode() {
        Int64Value int64Value = this.playMode_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public boolean hasColumn() {
        return this.column_ != null;
    }

    public boolean hasPlayMode() {
        return this.playMode_ != null;
    }

    public static C8383b newBuilder(PegasusMidConfig pegasusMidConfig) {
        return DEFAULT_INSTANCE.createBuilder(pegasusMidConfig);
    }

    public static PegasusMidConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusMidConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusMidConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PegasusMidConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PegasusMidConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PegasusMidConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PegasusMidConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PegasusMidConfig parseFrom(InputStream inputStream) throws IOException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PegasusMidConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PegasusMidConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PegasusMidConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PegasusMidConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
