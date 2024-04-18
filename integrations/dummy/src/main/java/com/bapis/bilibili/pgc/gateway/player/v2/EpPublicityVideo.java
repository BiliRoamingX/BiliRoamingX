package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class EpPublicityVideo extends GeneratedMessageLite<EpPublicityVideo, EpPublicityVideo.Builder> implements EpPublicityVideoOrBuilder {
    private static final EpPublicityVideo DEFAULT_INSTANCE;
    public static final int EP_INLINE_FIELD_NUMBER = 3;
    public static final int EP_PRE_VIDEO_FIELD_NUMBER = 2;
    private static volatile Parser<EpPublicityVideo> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int dataCase_ = 0;
    private Object data_;
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78431 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17566xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17566xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17566xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17566xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17566xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17566xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17566xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17566xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EpPublicityVideo, Builder> implements EpPublicityVideoOrBuilder {
        /* synthetic */ Builder(C78431 c78431) {
            this();
        }

        public Builder clearData() {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).clearData();
            return this;
        }

        public Builder clearEpInline() {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).clearEpInline();
            return this;
        }

        public Builder clearEpPreVideo() {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).clearEpPreVideo();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
        public DataCase getDataCase() {
            return ((EpPublicityVideo) this.instance).getDataCase();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
        public EpInlineVideo getEpInline() {
            return ((EpPublicityVideo) this.instance).getEpInline();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
        public EpPreVideo getEpPreVideo() {
            return ((EpPublicityVideo) this.instance).getEpPreVideo();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
        public EpPublicityVideoType getType() {
            return ((EpPublicityVideo) this.instance).getType();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
        public int getTypeValue() {
            return ((EpPublicityVideo) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
        public boolean hasEpInline() {
            return ((EpPublicityVideo) this.instance).hasEpInline();
        }

        @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
        public boolean hasEpPreVideo() {
            return ((EpPublicityVideo) this.instance).hasEpPreVideo();
        }

        public Builder mergeEpInline(EpInlineVideo epInlineVideo) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).mergeEpInline(epInlineVideo);
            return this;
        }

        public Builder mergeEpPreVideo(EpPreVideo epPreVideo) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).mergeEpPreVideo(epPreVideo);
            return this;
        }

        public Builder setEpInline(EpInlineVideo epInlineVideo) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).setEpInline(epInlineVideo);
            return this;
        }

        public Builder setEpPreVideo(EpPreVideo epPreVideo) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).setEpPreVideo(epPreVideo);
            return this;
        }

        public Builder setType(EpPublicityVideoType epPublicityVideoType) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).setType(epPublicityVideoType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(EpPublicityVideo.DEFAULT_INSTANCE);
        }

        public Builder setEpInline(EpInlineVideo.Builder builder) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).setEpInline(builder.build());
            return this;
        }

        public Builder setEpPreVideo(EpPreVideo.Builder builder) {
            copyOnWrite();
            ((EpPublicityVideo) this.instance).setEpPreVideo(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public enum DataCase {
        EP_PRE_VIDEO(2),
        EP_INLINE(3),
        DATA_NOT_SET(0);
        
        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return EP_INLINE;
                }
                return EP_PRE_VIDEO;
            }
            return DATA_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        EpPublicityVideo epPublicityVideo = new EpPublicityVideo();
        DEFAULT_INSTANCE = epPublicityVideo;
        GeneratedMessageLite.registerDefaultInstance(EpPublicityVideo.class, epPublicityVideo);
    }

    private EpPublicityVideo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpInline() {
        if (this.dataCase_ == 3) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpPreVideo() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static EpPublicityVideo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEpInline(EpInlineVideo epInlineVideo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEpPreVideo(EpPreVideo epPreVideo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpPublicityVideo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EpPublicityVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpPublicityVideo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EpPublicityVideo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpInline(EpInlineVideo epInlineVideo) {
        epInlineVideo.getClass();
        this.data_ = epInlineVideo;
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpPreVideo(EpPreVideo epPreVideo) {
        epPreVideo.getClass();
        this.data_ = epPreVideo;
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EpPublicityVideoType epPublicityVideoType) {
        this.type_ = epPublicityVideoType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78431.f17566xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EpPublicityVideo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"data_", "dataCase_", "type_", EpPreVideo.class, EpInlineVideo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EpPublicityVideo> parser = PARSER;
                if (parser == null) {
                    synchronized (EpPublicityVideo.class) {
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

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
    public EpInlineVideo getEpInline() {
        if (this.dataCase_ == 3) {
            return (EpInlineVideo) this.data_;
        }
        return EpInlineVideo.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
    public EpPreVideo getEpPreVideo() {
        if (this.dataCase_ == 2) {
            return (EpPreVideo) this.data_;
        }
        return EpPreVideo.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
    public EpPublicityVideoType getType() {
        EpPublicityVideoType forNumber = EpPublicityVideoType.forNumber(this.type_);
        return forNumber == null ? EpPublicityVideoType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
    public boolean hasEpInline() {
        return this.dataCase_ == 3;
    }

    @Override // com.bapis.bilibili.pgc.gateway.player.v2.EpPublicityVideoOrBuilder
    public boolean hasEpPreVideo() {
        return this.dataCase_ == 2;
    }

    public static Builder newBuilder(EpPublicityVideo epPublicityVideo) {
        return DEFAULT_INSTANCE.createBuilder(epPublicityVideo);
    }

    public static EpPublicityVideo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpPublicityVideo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpPublicityVideo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EpPublicityVideo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EpPublicityVideo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EpPublicityVideo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpPublicityVideo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EpPublicityVideo parseFrom(InputStream inputStream) throws IOException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpPublicityVideo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpPublicityVideo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EpPublicityVideo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpPublicityVideo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
