package com.bapis.bilibili.app.view.v1;

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
public final class History extends GeneratedMessageLite<History, History.Builder> implements MessageLiteOrBuilder {
    public static final int CID_FIELD_NUMBER = 1;
    private static final History DEFAULT_INSTANCE;
    private static volatile Parser<History> PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 2;
    private long cid_;
    private long progress_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.History$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16745xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16745xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16745xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16745xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16745xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16745xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16745xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16745xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<History, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67741 c67741) {
            this();
        }

        public Builder clearCid() {
            copyOnWrite();
            ((History) this.instance).clearCid();
            return this;
        }

        public Builder clearProgress() {
            copyOnWrite();
            ((History) this.instance).clearProgress();
            return this;
        }

        public long getCid() {
            return ((History) this.instance).getCid();
        }

        public long getProgress() {
            return ((History) this.instance).getProgress();
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((History) this.instance).setCid(j);
            return this;
        }

        public Builder setProgress(long j) {
            copyOnWrite();
            ((History) this.instance).setProgress(j);
            return this;
        }

        private Builder() {
            super(History.DEFAULT_INSTANCE);
        }
    }

    static {
        History history = new History();
        DEFAULT_INSTANCE = history;
        GeneratedMessageLite.registerDefaultInstance(History.class, history);
    }

    private History() {
    }

    public void clearCid() {
        this.cid_ = 0L;
    }

    public void clearProgress() {
        this.progress_ = 0L;
    }

    public static History getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static History parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (History) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static History parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<History> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCid(long j) {
        this.cid_ = j;
    }

    public void setProgress(long j) {
        this.progress_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67741.f16745xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new History();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"cid_", "progress_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<History> parser = PARSER;
                if (parser == null) {
                    synchronized (History.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public long getCid() {
        return this.cid_;
    }

    public long getProgress() {
        return this.progress_;
    }

    public static Builder newBuilder(History history) {
        return DEFAULT_INSTANCE.createBuilder(history);
    }

    public static History parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (History) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static History parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static History parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static History parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static History parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static History parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static History parseFrom(InputStream inputStream) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static History parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static History parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static History parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
