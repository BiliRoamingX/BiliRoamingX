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
public final class BizFavSeasonParam extends GeneratedMessageLite<BizFavSeasonParam, BizFavSeasonParam.Builder> implements MessageLiteOrBuilder {
    private static final BizFavSeasonParam DEFAULT_INSTANCE;
    private static volatile Parser<BizFavSeasonParam> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    private long seasonId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.BizFavSeasonParam$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16694xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16694xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16694xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16694xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16694xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16694xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16694xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16694xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BizFavSeasonParam, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67181 c67181) {
            this();
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((BizFavSeasonParam) this.instance).clearSeasonId();
            return this;
        }

        public long getSeasonId() {
            return ((BizFavSeasonParam) this.instance).getSeasonId();
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((BizFavSeasonParam) this.instance).setSeasonId(j);
            return this;
        }

        private Builder() {
            super(BizFavSeasonParam.DEFAULT_INSTANCE);
        }
    }

    static {
        BizFavSeasonParam bizFavSeasonParam = new BizFavSeasonParam();
        DEFAULT_INSTANCE = bizFavSeasonParam;
        GeneratedMessageLite.registerDefaultInstance(BizFavSeasonParam.class, bizFavSeasonParam);
    }

    private BizFavSeasonParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    public static BizFavSeasonParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BizFavSeasonParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizFavSeasonParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BizFavSeasonParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67181.f16694xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizFavSeasonParam();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"seasonId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BizFavSeasonParam> parser = PARSER;
                if (parser == null) {
                    synchronized (BizFavSeasonParam.class) {
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

    public long getSeasonId() {
        return this.seasonId_;
    }

    public static Builder newBuilder(BizFavSeasonParam bizFavSeasonParam) {
        return DEFAULT_INSTANCE.createBuilder(bizFavSeasonParam);
    }

    public static BizFavSeasonParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizFavSeasonParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizFavSeasonParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizFavSeasonParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizFavSeasonParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizFavSeasonParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BizFavSeasonParam parseFrom(InputStream inputStream) throws IOException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizFavSeasonParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizFavSeasonParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizFavSeasonParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFavSeasonParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
