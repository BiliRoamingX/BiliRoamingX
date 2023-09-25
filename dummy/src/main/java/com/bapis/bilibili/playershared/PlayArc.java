package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class PlayArc extends GeneratedMessageLite<PlayArc, PlayArc.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    public static final int ARC_TYPE_FIELD_NUMBER = 5;
    public static final int CID_FIELD_NUMBER = 3;
    private static final PlayArc DEFAULT_INSTANCE;
    public static final int DIMENSION_FIELD_NUMBER = 7;
    public static final int DRM_TECH_TYPE_FIELD_NUMBER = 4;
    public static final int DURATION_FIELD_NUMBER = 8;
    public static final int INTERACTION_FIELD_NUMBER = 6;
    public static final int IS_PREVIEW_FIELD_NUMBER = 9;
    private static volatile Parser<PlayArc> PARSER = null;
    public static final int VIDEO_TYPE_FIELD_NUMBER = 1;
    private long aid_;
    private int arcType_;
    private long cid_;
    private Dimension dimension_;
    private int drmTechType_;
    private long duration_;
    private Interaction interaction_;
    private boolean isPreview_;
    private int videoType_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.PlayArc$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C82101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17940xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17940xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17940xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17940xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17940xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17940xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17940xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17940xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayArc, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C82101 c82101) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((PlayArc) this.instance).clearAid();
            return this;
        }

        public Builder clearArcType() {
            copyOnWrite();
            ((PlayArc) this.instance).clearArcType();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((PlayArc) this.instance).clearCid();
            return this;
        }

        public Builder clearDimension() {
            copyOnWrite();
            ((PlayArc) this.instance).clearDimension();
            return this;
        }

        public Builder clearDrmTechType() {
            copyOnWrite();
            ((PlayArc) this.instance).clearDrmTechType();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((PlayArc) this.instance).clearDuration();
            return this;
        }

        public Builder clearInteraction() {
            copyOnWrite();
            ((PlayArc) this.instance).clearInteraction();
            return this;
        }

        public Builder clearIsPreview() {
            copyOnWrite();
            ((PlayArc) this.instance).clearIsPreview();
            return this;
        }

        public Builder clearVideoType() {
            copyOnWrite();
            ((PlayArc) this.instance).clearVideoType();
            return this;
        }

        public long getAid() {
            return ((PlayArc) this.instance).getAid();
        }

        public ArcType getArcType() {
            return ((PlayArc) this.instance).getArcType();
        }

        public int getArcTypeValue() {
            return ((PlayArc) this.instance).getArcTypeValue();
        }

        public long getCid() {
            return ((PlayArc) this.instance).getCid();
        }

        public Dimension getDimension() {
            return ((PlayArc) this.instance).getDimension();
        }

        public DrmTechType getDrmTechType() {
            return ((PlayArc) this.instance).getDrmTechType();
        }

        public int getDrmTechTypeValue() {
            return ((PlayArc) this.instance).getDrmTechTypeValue();
        }

        public long getDuration() {
            return ((PlayArc) this.instance).getDuration();
        }

        public Interaction getInteraction() {
            return ((PlayArc) this.instance).getInteraction();
        }

        public boolean getIsPreview() {
            return ((PlayArc) this.instance).getIsPreview();
        }

        public BizType getVideoType() {
            return ((PlayArc) this.instance).getVideoType();
        }

        public int getVideoTypeValue() {
            return ((PlayArc) this.instance).getVideoTypeValue();
        }

        public boolean hasDimension() {
            return ((PlayArc) this.instance).hasDimension();
        }

        public boolean hasInteraction() {
            return ((PlayArc) this.instance).hasInteraction();
        }

        public Builder mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((PlayArc) this.instance).mergeDimension(dimension);
            return this;
        }

        public Builder mergeInteraction(Interaction interaction) {
            copyOnWrite();
            ((PlayArc) this.instance).mergeInteraction(interaction);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((PlayArc) this.instance).setAid(j);
            return this;
        }

        public Builder setArcType(ArcType arcType) {
            copyOnWrite();
            ((PlayArc) this.instance).setArcType(arcType);
            return this;
        }

        public Builder setArcTypeValue(int i) {
            copyOnWrite();
            ((PlayArc) this.instance).setArcTypeValue(i);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((PlayArc) this.instance).setCid(j);
            return this;
        }

        public Builder setDimension(Dimension dimension) {
            copyOnWrite();
            ((PlayArc) this.instance).setDimension(dimension);
            return this;
        }

        public Builder setDrmTechType(DrmTechType drmTechType) {
            copyOnWrite();
            ((PlayArc) this.instance).setDrmTechType(drmTechType);
            return this;
        }

        public Builder setDrmTechTypeValue(int i) {
            copyOnWrite();
            ((PlayArc) this.instance).setDrmTechTypeValue(i);
            return this;
        }

        public Builder setDuration(long j) {
            copyOnWrite();
            ((PlayArc) this.instance).setDuration(j);
            return this;
        }

        public Builder setInteraction(Interaction interaction) {
            copyOnWrite();
            ((PlayArc) this.instance).setInteraction(interaction);
            return this;
        }

        public Builder setIsPreview(boolean z) {
            copyOnWrite();
            ((PlayArc) this.instance).setIsPreview(z);
            return this;
        }

        public Builder setVideoType(BizType bizType) {
            copyOnWrite();
            ((PlayArc) this.instance).setVideoType(bizType);
            return this;
        }

        public Builder setVideoTypeValue(int i) {
            copyOnWrite();
            ((PlayArc) this.instance).setVideoTypeValue(i);
            return this;
        }

        private Builder() {
            super(PlayArc.DEFAULT_INSTANCE);
        }

        public Builder setDimension(Dimension.Builder builder) {
            copyOnWrite();
            ((PlayArc) this.instance).setDimension(builder.build());
            return this;
        }

        public Builder setInteraction(Interaction.Builder builder) {
            copyOnWrite();
            ((PlayArc) this.instance).setInteraction(builder.build());
            return this;
        }
    }

    static {
        PlayArc playArc = new PlayArc();
        DEFAULT_INSTANCE = playArc;
        GeneratedMessageLite.registerDefaultInstance(PlayArc.class, playArc);
    }

    public PlayArc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcType() {
        this.arcType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimension() {
        this.dimension_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrmTechType() {
        this.drmTechType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteraction() {
        this.interaction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPreview() {
        this.isPreview_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoType() {
        this.videoType_ = 0;
    }

    public static PlayArc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDimension(Dimension dimension) {
        dimension.getClass();
        Dimension dimension2 = this.dimension_;
        if (dimension2 != null && dimension2 != Dimension.getDefaultInstance()) {
            this.dimension_ = Dimension.newBuilder(this.dimension_).mergeFrom((Dimension) dimension).buildPartial();
        } else {
            this.dimension_ = dimension;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInteraction(Interaction interaction) {
        interaction.getClass();
        Interaction interaction2 = this.interaction_;
        if (interaction2 != null && interaction2 != Interaction.getDefaultInstance()) {
            this.interaction_ = Interaction.newBuilder(this.interaction_).mergeFrom((Interaction) interaction).buildPartial();
        } else {
            this.interaction_ = interaction;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayArc parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArc parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayArc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcType(ArcType arcType) {
        this.arcType_ = arcType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcTypeValue(int i) {
        this.arcType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrmTechType(DrmTechType drmTechType) {
        this.drmTechType_ = drmTechType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrmTechTypeValue(int i) {
        this.drmTechType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteraction(Interaction interaction) {
        interaction.getClass();
        this.interaction_ = interaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreview(boolean z) {
        this.isPreview_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoType(BizType bizType) {
        this.videoType_ = bizType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoTypeValue(int i) {
        this.videoType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C82101.f17940xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayArc();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002\u0004\f\u0005\f\u0006\t\u0007\t\b\u0002\t\u0007", new Object[]{"videoType_", "aid_", "cid_", "drmTechType_", "arcType_", "interaction_", "dimension_", "duration_", "isPreview_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayArc> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayArc.class) {
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

    public ArcType getArcType() {
        ArcType forNumber = ArcType.forNumber(this.arcType_);
        return forNumber == null ? ArcType.UNRECOGNIZED : forNumber;
    }

    public int getArcTypeValue() {
        return this.arcType_;
    }

    public long getCid() {
        return this.cid_;
    }

    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    public DrmTechType getDrmTechType() {
        DrmTechType forNumber = DrmTechType.forNumber(this.drmTechType_);
        return forNumber == null ? DrmTechType.UNRECOGNIZED : forNumber;
    }

    public int getDrmTechTypeValue() {
        return this.drmTechType_;
    }

    public long getDuration() {
        return this.duration_;
    }

    public Interaction getInteraction() {
        Interaction interaction = this.interaction_;
        return interaction == null ? Interaction.getDefaultInstance() : interaction;
    }

    public boolean getIsPreview() {
        return this.isPreview_;
    }

    public BizType getVideoType() {
        BizType forNumber = BizType.forNumber(this.videoType_);
        return forNumber == null ? BizType.UNRECOGNIZED : forNumber;
    }

    public int getVideoTypeValue() {
        return this.videoType_;
    }

    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    public boolean hasInteraction() {
        return this.interaction_ != null;
    }

    public static Builder newBuilder(PlayArc playArc) {
        return DEFAULT_INSTANCE.createBuilder(playArc);
    }

    public static PlayArc parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArc parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayArc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayArc parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayArc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayArc parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayArc parseFrom(InputStream inputStream) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArc parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArc parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayArc parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArc) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
