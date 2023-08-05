package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class BizFavParam extends GeneratedMessageLite<BizFavParam, BizFavParam.Builder> implements MessageLiteOrBuilder {
    private static final BizFavParam DEFAULT_INSTANCE;
    private static volatile Parser<BizFavParam> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    private long seasonId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.BizFavParam$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16967xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16967xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16967xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16967xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16967xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16967xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16967xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16967xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BizFavParam, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69801 c69801) {
            this();
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((BizFavParam) this.instance).clearSeasonId();
            return this;
        }

        public long getSeasonId() {
            return ((BizFavParam) this.instance).getSeasonId();
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((BizFavParam) this.instance).setSeasonId(j);
            return this;
        }

        private Builder() {
            super(BizFavParam.DEFAULT_INSTANCE);
        }
    }

    static {
        BizFavParam bizFavParam = new BizFavParam();
        DEFAULT_INSTANCE = bizFavParam;
        GeneratedMessageLite.registerDefaultInstance(BizFavParam.class, bizFavParam);
    }

    private BizFavParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    public static BizFavParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BizFavParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizFavParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizFavParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BizFavParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69801.f16967xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizFavParam();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"seasonId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BizFavParam> parser = PARSER;
                if (parser == null) {
                    synchronized (BizFavParam.class) {
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

    public long getSeasonId() {
        return this.seasonId_;
    }

    public static Builder newBuilder(BizFavParam bizFavParam) {
        return DEFAULT_INSTANCE.createBuilder(bizFavParam);
    }

    public static BizFavParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFavParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizFavParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizFavParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizFavParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizFavParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizFavParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BizFavParam parseFrom(InputStream inputStream) throws IOException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizFavParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizFavParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizFavParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFavParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
