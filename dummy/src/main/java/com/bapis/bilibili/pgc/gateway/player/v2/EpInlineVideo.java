package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class EpInlineVideo extends GeneratedMessageLite<EpInlineVideo, EpInlineVideo.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    public static final int CID_FIELD_NUMBER = 3;
    private static final EpInlineVideo DEFAULT_INSTANCE;
    public static final int MATERIAL_NO_FIELD_NUMBER = 1;
    private static volatile Parser<EpInlineVideo> PARSER;
    private long aid_;
    private long cid_;
    private long materialNo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.EpInlineVideo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78411 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17564xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17564xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17564xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17564xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17564xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17564xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17564xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17564xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EpInlineVideo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78411 c78411) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((EpInlineVideo) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((EpInlineVideo) this.instance).clearCid();
            return this;
        }

        public Builder clearMaterialNo() {
            copyOnWrite();
            ((EpInlineVideo) this.instance).clearMaterialNo();
            return this;
        }

        public long getAid() {
            return ((EpInlineVideo) this.instance).getAid();
        }

        public long getCid() {
            return ((EpInlineVideo) this.instance).getCid();
        }

        public long getMaterialNo() {
            return ((EpInlineVideo) this.instance).getMaterialNo();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((EpInlineVideo) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((EpInlineVideo) this.instance).setCid(j);
            return this;
        }

        public Builder setMaterialNo(long j) {
            copyOnWrite();
            ((EpInlineVideo) this.instance).setMaterialNo(j);
            return this;
        }

        private Builder() {
            super(EpInlineVideo.DEFAULT_INSTANCE);
        }
    }

    static {
        EpInlineVideo epInlineVideo = new EpInlineVideo();
        DEFAULT_INSTANCE = epInlineVideo;
        GeneratedMessageLite.registerDefaultInstance(EpInlineVideo.class, epInlineVideo);
    }

    private EpInlineVideo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialNo() {
        this.materialNo_ = 0L;
    }

    public static EpInlineVideo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpInlineVideo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EpInlineVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpInlineVideo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EpInlineVideo> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialNo(long j) {
        this.materialNo_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78411.f17564xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EpInlineVideo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"materialNo_", "aid_", "cid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EpInlineVideo> parser = PARSER;
                if (parser == null) {
                    synchronized (EpInlineVideo.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
    }

    public long getMaterialNo() {
        return this.materialNo_;
    }

    public static Builder newBuilder(EpInlineVideo epInlineVideo) {
        return DEFAULT_INSTANCE.createBuilder(epInlineVideo);
    }

    public static EpInlineVideo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpInlineVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpInlineVideo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EpInlineVideo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EpInlineVideo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EpInlineVideo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpInlineVideo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EpInlineVideo parseFrom(InputStream inputStream) throws IOException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpInlineVideo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpInlineVideo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EpInlineVideo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpInlineVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
