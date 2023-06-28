package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class PlayAv extends GeneratedMessageLite<PlayAv, PlayAv.Builder> implements PlayAvOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 2;
    private static final PlayAv DEFAULT_INSTANCE;
    private static volatile Parser<PlayAv> PARSER;
    private long aid_;
    private long cid_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PlayAv$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68131 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16777xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16777xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16777xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16777xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16777xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16777xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16777xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16777xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayAv, Builder> implements PlayAvOrBuilder {
        /* synthetic */ Builder(C68131 c68131) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((PlayAv) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((PlayAv) this.instance).clearCid();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.PlayAvOrBuilder
        public long getAid() {
            return ((PlayAv) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.view.v1.PlayAvOrBuilder
        public long getCid() {
            return ((PlayAv) this.instance).getCid();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((PlayAv) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((PlayAv) this.instance).setCid(j);
            return this;
        }

        private Builder() {
            super(PlayAv.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayAv playAv = new PlayAv();
        DEFAULT_INSTANCE = playAv;
        GeneratedMessageLite.registerDefaultInstance(PlayAv.class, playAv);
    }

    private PlayAv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    public static PlayAv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayAv parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayAv) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayAv parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayAv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68131.f16777xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayAv();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"aid_", "cid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayAv> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayAv.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.PlayAvOrBuilder
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.PlayAvOrBuilder
    public long getCid() {
        return this.cid_;
    }

    public static Builder newBuilder(PlayAv playAv) {
        return DEFAULT_INSTANCE.createBuilder(playAv);
    }

    public static PlayAv parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAv) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayAv parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayAv parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayAv parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayAv parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayAv parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayAv parseFrom(InputStream inputStream) throws IOException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayAv parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayAv parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayAv parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayAv) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
