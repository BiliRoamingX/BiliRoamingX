package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class BizFollowVideoParam extends GeneratedMessageLite<BizFollowVideoParam, BizFollowVideoParam.C12274b> implements MessageLiteOrBuilder {
    private static final BizFollowVideoParam DEFAULT_INSTANCE;
    private static volatile Parser<BizFollowVideoParam> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    private long seasonId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.BizFollowVideoParam$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12273a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21256xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21256xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21256xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21256xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21256xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21256xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21256xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21256xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.BizFollowVideoParam$b */
    /* loaded from: classes20.dex */
    public static final class C12274b extends GeneratedMessageLite.Builder<BizFollowVideoParam, C12274b> implements MessageLiteOrBuilder {
        /* synthetic */ C12274b(C12273a c12273a) {
            this();
        }

        public C12274b clearSeasonId() {
            copyOnWrite();
            ((BizFollowVideoParam) this.instance).clearSeasonId();
            return this;
        }

        public long getSeasonId() {
            return ((BizFollowVideoParam) this.instance).getSeasonId();
        }

        public C12274b setSeasonId(long j) {
            copyOnWrite();
            ((BizFollowVideoParam) this.instance).setSeasonId(j);
            return this;
        }

        private C12274b() {
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

    public static C12274b newBuilder() {
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12273a.f21256xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizFollowVideoParam();
            case 2:
                return new C12274b(null);
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

    public static C12274b newBuilder(BizFollowVideoParam bizFollowVideoParam) {
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
