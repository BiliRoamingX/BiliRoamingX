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
public final class BizFollowVideoParam extends GeneratedMessageLite<BizFollowVideoParam, BizFollowVideoParam.Builder> implements MessageLiteOrBuilder {
    private static final BizFollowVideoParam DEFAULT_INSTANCE;
    private static volatile Parser<BizFollowVideoParam> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    private long seasonId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.BizFollowVideoParam$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67191 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16695xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16695xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16695xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16695xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16695xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16695xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16695xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16695xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BizFollowVideoParam, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67191 c67191) {
            this();
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((BizFollowVideoParam) this.instance).clearSeasonId();
            return this;
        }

        public long getSeasonId() {
            return ((BizFollowVideoParam) this.instance).getSeasonId();
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((BizFollowVideoParam) this.instance).setSeasonId(j);
            return this;
        }

        private Builder() {
            super(BizFollowVideoParam.DEFAULT_INSTANCE);
        }
    }

    static {
        BizFollowVideoParam bizFollowVideoParam = new BizFollowVideoParam();
        DEFAULT_INSTANCE = bizFollowVideoParam;
        GeneratedMessageLite.registerDefaultInstance(BizFollowVideoParam.class, bizFollowVideoParam);
    }

    private BizFollowVideoParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    public static BizFollowVideoParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BizFollowVideoParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizFollowVideoParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BizFollowVideoParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67191.f16695xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizFollowVideoParam();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"seasonId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BizFollowVideoParam> parser = PARSER;
                if (parser == null) {
                    synchronized (BizFollowVideoParam.class) {
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

    public static Builder newBuilder(BizFollowVideoParam bizFollowVideoParam) {
        return DEFAULT_INSTANCE.createBuilder(bizFollowVideoParam);
    }

    public static BizFollowVideoParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizFollowVideoParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizFollowVideoParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizFollowVideoParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizFollowVideoParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizFollowVideoParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BizFollowVideoParam parseFrom(InputStream inputStream) throws IOException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizFollowVideoParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizFollowVideoParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizFollowVideoParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizFollowVideoParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
