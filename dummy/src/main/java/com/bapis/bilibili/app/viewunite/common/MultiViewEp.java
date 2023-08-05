package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class MultiViewEp extends GeneratedMessageLite<MultiViewEp, MultiViewEp.Builder> implements MultiViewEpOrBuilder {
    private static final MultiViewEp DEFAULT_INSTANCE;
    public static final int EP_ID_FIELD_NUMBER = 1;
    private static volatile Parser<MultiViewEp> PARSER;
    private long epId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.MultiViewEp$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70171 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16999xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16999xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16999xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16999xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16999xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16999xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16999xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16999xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<MultiViewEp, Builder> implements MultiViewEpOrBuilder {
        /* synthetic */ Builder(C70171 c70171) {
            this();
        }

        public Builder clearEpId() {
            copyOnWrite();
            ((MultiViewEp) this.instance).clearEpId();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.MultiViewEpOrBuilder
        public long getEpId() {
            return ((MultiViewEp) this.instance).getEpId();
        }

        public Builder setEpId(long j) {
            copyOnWrite();
            ((MultiViewEp) this.instance).setEpId(j);
            return this;
        }

        private Builder() {
            super(MultiViewEp.DEFAULT_INSTANCE);
        }
    }

    static {
        MultiViewEp multiViewEp = new MultiViewEp();
        DEFAULT_INSTANCE = multiViewEp;
        GeneratedMessageLite.registerDefaultInstance(MultiViewEp.class, multiViewEp);
    }

    private MultiViewEp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpId() {
        this.epId_ = 0L;
    }

    public static MultiViewEp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MultiViewEp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MultiViewEp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiViewEp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MultiViewEp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpId(long j) {
        this.epId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70171.f16999xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MultiViewEp();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"epId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MultiViewEp> parser = PARSER;
                if (parser == null) {
                    synchronized (MultiViewEp.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.MultiViewEpOrBuilder
    public long getEpId() {
        return this.epId_;
    }

    public static Builder newBuilder(MultiViewEp multiViewEp) {
        return DEFAULT_INSTANCE.createBuilder(multiViewEp);
    }

    public static MultiViewEp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiViewEp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultiViewEp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MultiViewEp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MultiViewEp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MultiViewEp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MultiViewEp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MultiViewEp parseFrom(InputStream inputStream) throws IOException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiViewEp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultiViewEp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MultiViewEp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiViewEp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
