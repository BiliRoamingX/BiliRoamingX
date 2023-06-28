package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ViewProgressReply extends GeneratedMessageLite<ViewProgressReply, ViewProgressReply.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_SHOT_FIELD_NUMBER = 3;
    public static final int BUZZWORD_PERIODS_FIELD_NUMBER = 7;
    public static final int CHRONOS_FIELD_NUMBER = 2;
    private static final ViewProgressReply DEFAULT_INSTANCE;
    private static volatile Parser<ViewProgressReply> PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 4;
    public static final int POINT_MATERIAL_FIELD_NUMBER = 5;
    public static final int POINT_PERMANENT_FIELD_NUMBER = 6;
    public static final int VIDEO_GUIDE_FIELD_NUMBER = 1;
    private VideoShot arcShot_;
    private Chronos chronos_;
    private PointMaterial pointMaterial_;
    private boolean pointPermanent_;
    private VideoGuide videoGuide_;
    private Internal.ProtobufList<VideoPoint> points_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<BuzzwordConfig> buzzwordPeriods_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewProgressReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16855xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16855xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16855xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16855xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16855xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16855xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16855xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16855xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewProgressReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69021 c69021) {
            this();
        }

        public Builder addAllBuzzwordPeriods(Iterable<? extends BuzzwordConfig> iterable) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addAllBuzzwordPeriods(iterable);
            return this;
        }

        public Builder addAllPoints(Iterable<? extends VideoPoint> iterable) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addAllPoints(iterable);
            return this;
        }

        public Builder addBuzzwordPeriods(BuzzwordConfig buzzwordConfig) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addBuzzwordPeriods(buzzwordConfig);
            return this;
        }

        public Builder addPoints(VideoPoint videoPoint) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addPoints(videoPoint);
            return this;
        }

        public Builder clearArcShot() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearArcShot();
            return this;
        }

        public Builder clearBuzzwordPeriods() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearBuzzwordPeriods();
            return this;
        }

        public Builder clearChronos() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearChronos();
            return this;
        }

        public Builder clearPointMaterial() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearPointMaterial();
            return this;
        }

        public Builder clearPointPermanent() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearPointPermanent();
            return this;
        }

        public Builder clearPoints() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearPoints();
            return this;
        }

        public Builder clearVideoGuide() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearVideoGuide();
            return this;
        }

        public VideoShot getArcShot() {
            return ((ViewProgressReply) this.instance).getArcShot();
        }

        public BuzzwordConfig getBuzzwordPeriods(int i) {
            return ((ViewProgressReply) this.instance).getBuzzwordPeriods(i);
        }

        public int getBuzzwordPeriodsCount() {
            return ((ViewProgressReply) this.instance).getBuzzwordPeriodsCount();
        }

        public List<BuzzwordConfig> getBuzzwordPeriodsList() {
            return Collections.unmodifiableList(((ViewProgressReply) this.instance).getBuzzwordPeriodsList());
        }

        public Chronos getChronos() {
            return ((ViewProgressReply) this.instance).getChronos();
        }

        public PointMaterial getPointMaterial() {
            return ((ViewProgressReply) this.instance).getPointMaterial();
        }

        public boolean getPointPermanent() {
            return ((ViewProgressReply) this.instance).getPointPermanent();
        }

        public VideoPoint getPoints(int i) {
            return ((ViewProgressReply) this.instance).getPoints(i);
        }

        public int getPointsCount() {
            return ((ViewProgressReply) this.instance).getPointsCount();
        }

        public List<VideoPoint> getPointsList() {
            return Collections.unmodifiableList(((ViewProgressReply) this.instance).getPointsList());
        }

        public VideoGuide getVideoGuide() {
            return ((ViewProgressReply) this.instance).getVideoGuide();
        }

        public boolean hasArcShot() {
            return ((ViewProgressReply) this.instance).hasArcShot();
        }

        public boolean hasChronos() {
            return ((ViewProgressReply) this.instance).hasChronos();
        }

        public boolean hasPointMaterial() {
            return ((ViewProgressReply) this.instance).hasPointMaterial();
        }

        public boolean hasVideoGuide() {
            return ((ViewProgressReply) this.instance).hasVideoGuide();
        }

        public Builder mergeArcShot(VideoShot videoShot) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeArcShot(videoShot);
            return this;
        }

        public Builder mergeChronos(Chronos chronos) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeChronos(chronos);
            return this;
        }

        public Builder mergePointMaterial(PointMaterial pointMaterial) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergePointMaterial(pointMaterial);
            return this;
        }

        public Builder mergeVideoGuide(VideoGuide videoGuide) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeVideoGuide(videoGuide);
            return this;
        }

        public Builder removeBuzzwordPeriods(int i) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).removeBuzzwordPeriods(i);
            return this;
        }

        public Builder removePoints(int i) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).removePoints(i);
            return this;
        }

        public Builder setArcShot(VideoShot videoShot) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setArcShot(videoShot);
            return this;
        }

        public Builder setBuzzwordPeriods(int i, BuzzwordConfig buzzwordConfig) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setBuzzwordPeriods(i, buzzwordConfig);
            return this;
        }

        public Builder setChronos(Chronos chronos) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setChronos(chronos);
            return this;
        }

        public Builder setPointMaterial(PointMaterial pointMaterial) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setPointMaterial(pointMaterial);
            return this;
        }

        public Builder setPointPermanent(boolean z) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setPointPermanent(z);
            return this;
        }

        public Builder setPoints(int i, VideoPoint videoPoint) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setPoints(i, videoPoint);
            return this;
        }

        public Builder setVideoGuide(VideoGuide videoGuide) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setVideoGuide(videoGuide);
            return this;
        }

        private Builder() {
            super(ViewProgressReply.DEFAULT_INSTANCE);
        }

        public Builder addBuzzwordPeriods(int i, BuzzwordConfig buzzwordConfig) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addBuzzwordPeriods(i, buzzwordConfig);
            return this;
        }

        public Builder addPoints(int i, VideoPoint videoPoint) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addPoints(i, videoPoint);
            return this;
        }

        public Builder setArcShot(VideoShot.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setArcShot(builder.build());
            return this;
        }

        public Builder setBuzzwordPeriods(int i, BuzzwordConfig.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setBuzzwordPeriods(i, builder.build());
            return this;
        }

        public Builder setChronos(Chronos.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setChronos(builder.build());
            return this;
        }

        public Builder setPointMaterial(PointMaterial.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setPointMaterial(builder.build());
            return this;
        }

        public Builder setPoints(int i, VideoPoint.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setPoints(i, builder.build());
            return this;
        }

        public Builder setVideoGuide(VideoGuide.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setVideoGuide(builder.build());
            return this;
        }

        public Builder addBuzzwordPeriods(BuzzwordConfig.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addBuzzwordPeriods(builder.build());
            return this;
        }

        public Builder addPoints(VideoPoint.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addPoints(builder.build());
            return this;
        }

        public Builder addBuzzwordPeriods(int i, BuzzwordConfig.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addBuzzwordPeriods(i, builder.build());
            return this;
        }

        public Builder addPoints(int i, VideoPoint.Builder builder) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).addPoints(i, builder.build());
            return this;
        }
    }

    static {
        ViewProgressReply viewProgressReply = new ViewProgressReply();
        DEFAULT_INSTANCE = viewProgressReply;
        GeneratedMessageLite.registerDefaultInstance(ViewProgressReply.class, viewProgressReply);
    }

    private ViewProgressReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBuzzwordPeriods(Iterable<? extends BuzzwordConfig> iterable) {
        ensureBuzzwordPeriodsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.buzzwordPeriods_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPoints(Iterable<? extends VideoPoint> iterable) {
        ensurePointsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.points_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBuzzwordPeriods(BuzzwordConfig buzzwordConfig) {
        buzzwordConfig.getClass();
        ensureBuzzwordPeriodsIsMutable();
        this.buzzwordPeriods_.add(buzzwordConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(VideoPoint videoPoint) {
        videoPoint.getClass();
        ensurePointsIsMutable();
        this.points_.add(videoPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcShot() {
        this.arcShot_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuzzwordPeriods() {
        this.buzzwordPeriods_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChronos() {
        this.chronos_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointMaterial() {
        this.pointMaterial_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointPermanent() {
        this.pointPermanent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.points_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoGuide() {
        this.videoGuide_ = null;
    }

    private void ensureBuzzwordPeriodsIsMutable() {
        Internal.ProtobufList<BuzzwordConfig> protobufList = this.buzzwordPeriods_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.buzzwordPeriods_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePointsIsMutable() {
        Internal.ProtobufList<VideoPoint> protobufList = this.points_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.points_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ViewProgressReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArcShot(VideoShot videoShot) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChronos(Chronos chronos) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointMaterial(PointMaterial pointMaterial) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideoGuide(VideoGuide videoGuide) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewProgressReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewProgressReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewProgressReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewProgressReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBuzzwordPeriods(int i) {
        ensureBuzzwordPeriodsIsMutable();
        this.buzzwordPeriods_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePoints(int i) {
        ensurePointsIsMutable();
        this.points_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcShot(VideoShot videoShot) {
        videoShot.getClass();
        this.arcShot_ = videoShot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuzzwordPeriods(int i, BuzzwordConfig buzzwordConfig) {
        buzzwordConfig.getClass();
        ensureBuzzwordPeriodsIsMutable();
        this.buzzwordPeriods_.set(i, buzzwordConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChronos(Chronos chronos) {
        chronos.getClass();
        this.chronos_ = chronos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointMaterial(PointMaterial pointMaterial) {
        pointMaterial.getClass();
        this.pointMaterial_ = pointMaterial;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointPermanent(boolean z) {
        this.pointPermanent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(int i, VideoPoint videoPoint) {
        videoPoint.getClass();
        ensurePointsIsMutable();
        this.points_.set(i, videoPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoGuide(VideoGuide videoGuide) {
        videoGuide.getClass();
        this.videoGuide_ = videoGuide;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69021.f16855xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewProgressReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\u001b\u0005\t\u0006\u0007\u0007\u001b", new Object[]{"videoGuide_", "chronos_", "arcShot_", "points_", VideoPoint.class, "pointMaterial_", "pointPermanent_", "buzzwordPeriods_", BuzzwordConfig.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewProgressReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewProgressReply.class) {
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

    public VideoShot getArcShot() {
        VideoShot videoShot = this.arcShot_;
        return videoShot == null ? VideoShot.getDefaultInstance() : videoShot;
    }

    public BuzzwordConfig getBuzzwordPeriods(int i) {
        return this.buzzwordPeriods_.get(i);
    }

    public int getBuzzwordPeriodsCount() {
        return this.buzzwordPeriods_.size();
    }

    public List<BuzzwordConfig> getBuzzwordPeriodsList() {
        return this.buzzwordPeriods_;
    }

    public BuzzwordConfigOrBuilder getBuzzwordPeriodsOrBuilder(int i) {
        return this.buzzwordPeriods_.get(i);
    }

    public List<? extends BuzzwordConfigOrBuilder> getBuzzwordPeriodsOrBuilderList() {
        return this.buzzwordPeriods_;
    }

    public Chronos getChronos() {
        Chronos chronos = this.chronos_;
        return chronos == null ? Chronos.getDefaultInstance() : chronos;
    }

    public PointMaterial getPointMaterial() {
        PointMaterial pointMaterial = this.pointMaterial_;
        return pointMaterial == null ? PointMaterial.getDefaultInstance() : pointMaterial;
    }

    public boolean getPointPermanent() {
        return this.pointPermanent_;
    }

    public VideoPoint getPoints(int i) {
        return this.points_.get(i);
    }

    public int getPointsCount() {
        return this.points_.size();
    }

    public List<VideoPoint> getPointsList() {
        return this.points_;
    }

    public VideoPointOrBuilder getPointsOrBuilder(int i) {
        return this.points_.get(i);
    }

    public List<? extends VideoPointOrBuilder> getPointsOrBuilderList() {
        return this.points_;
    }

    public VideoGuide getVideoGuide() {
        VideoGuide videoGuide = this.videoGuide_;
        return videoGuide == null ? VideoGuide.getDefaultInstance() : videoGuide;
    }

    public boolean hasArcShot() {
        return this.arcShot_ != null;
    }

    public boolean hasChronos() {
        return this.chronos_ != null;
    }

    public boolean hasPointMaterial() {
        return this.pointMaterial_ != null;
    }

    public boolean hasVideoGuide() {
        return this.videoGuide_ != null;
    }

    public static Builder newBuilder(ViewProgressReply viewProgressReply) {
        return DEFAULT_INSTANCE.createBuilder(viewProgressReply);
    }

    public static ViewProgressReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewProgressReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewProgressReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewProgressReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBuzzwordPeriods(int i, BuzzwordConfig buzzwordConfig) {
        buzzwordConfig.getClass();
        ensureBuzzwordPeriodsIsMutable();
        this.buzzwordPeriods_.add(i, buzzwordConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(int i, VideoPoint videoPoint) {
        videoPoint.getClass();
        ensurePointsIsMutable();
        this.points_.add(i, videoPoint);
    }

    public static ViewProgressReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewProgressReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewProgressReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewProgressReply parseFrom(InputStream inputStream) throws IOException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewProgressReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewProgressReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewProgressReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewProgressReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setVideoGuide
     */
    static void access$100(ViewProgressReply reply, VideoGuide videoGuide) {
    }
}
