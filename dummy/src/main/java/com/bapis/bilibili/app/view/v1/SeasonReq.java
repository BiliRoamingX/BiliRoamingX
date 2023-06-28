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
public final class SeasonReq extends GeneratedMessageLite<SeasonReq, SeasonReq.Builder> implements MessageLiteOrBuilder {
    private static final SeasonReq DEFAULT_INSTANCE;
    private static volatile Parser<SeasonReq> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    private long seasonId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SeasonReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16815xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16815xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16815xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16815xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16815xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16815xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16815xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16815xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68551 c68551) {
            this();
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((SeasonReq) this.instance).clearSeasonId();
            return this;
        }

        public long getSeasonId() {
            return ((SeasonReq) this.instance).getSeasonId();
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((SeasonReq) this.instance).setSeasonId(j);
            return this;
        }

        private Builder() {
            super(SeasonReq.DEFAULT_INSTANCE);
        }
    }

    static {
        SeasonReq seasonReq = new SeasonReq();
        DEFAULT_INSTANCE = seasonReq;
        GeneratedMessageLite.registerDefaultInstance(SeasonReq.class, seasonReq);
    }

    private SeasonReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    public static SeasonReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68551.f16815xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"seasonId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonReq> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonReq.class) {
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

    public static Builder newBuilder(SeasonReq seasonReq) {
        return DEFAULT_INSTANCE.createBuilder(seasonReq);
    }

    public static SeasonReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonReq parseFrom(InputStream inputStream) throws IOException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
