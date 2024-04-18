package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class VideoViewPoint extends GeneratedMessageLite<VideoViewPoint, VideoViewPoint.C12396b> implements MessageLiteOrBuilder {
    private static final VideoViewPoint DEFAULT_INSTANCE;
    private static volatile Parser<VideoViewPoint> PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 1;
    public static final int POINT_MATERIAL_FIELD_NUMBER = 2;
    public static final int POINT_PERMANENT_FIELD_NUMBER = 3;
    private PointMaterial pointMaterial_;
    private boolean pointPermanent_;
    private Internal.ProtobufList<VideoPoint> points_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.VideoViewPoint$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12395a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21306xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21306xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21306xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21306xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21306xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21306xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21306xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21306xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.VideoViewPoint$b */
    /* loaded from: classes20.dex */
    public static final class C12396b extends GeneratedMessageLite.Builder<VideoViewPoint, C12396b> implements MessageLiteOrBuilder {
        /* synthetic */ C12396b(C12395a c12395a) {
            this();
        }

        public C12396b addAllPoints(Iterable<? extends VideoPoint> iterable) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).addAllPoints(iterable);
            return this;
        }

        public C12396b addPoints(VideoPoint videoPoint) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).addPoints(videoPoint);
            return this;
        }

        public C12396b clearPointMaterial() {
            copyOnWrite();
            ((VideoViewPoint) this.instance).clearPointMaterial();
            return this;
        }

        public C12396b clearPointPermanent() {
            copyOnWrite();
            ((VideoViewPoint) this.instance).clearPointPermanent();
            return this;
        }

        public C12396b clearPoints() {
            copyOnWrite();
            ((VideoViewPoint) this.instance).clearPoints();
            return this;
        }

        public PointMaterial getPointMaterial() {
            return ((VideoViewPoint) this.instance).getPointMaterial();
        }

        public boolean getPointPermanent() {
            return ((VideoViewPoint) this.instance).getPointPermanent();
        }

        public VideoPoint getPoints(int i) {
            return ((VideoViewPoint) this.instance).getPoints(i);
        }

        public int getPointsCount() {
            return ((VideoViewPoint) this.instance).getPointsCount();
        }

        public List<VideoPoint> getPointsList() {
            return Collections.unmodifiableList(((VideoViewPoint) this.instance).getPointsList());
        }

        public boolean hasPointMaterial() {
            return ((VideoViewPoint) this.instance).hasPointMaterial();
        }

        public C12396b mergePointMaterial(PointMaterial pointMaterial) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).mergePointMaterial(pointMaterial);
            return this;
        }

        public C12396b removePoints(int i) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).removePoints(i);
            return this;
        }

        public C12396b setPointMaterial(PointMaterial pointMaterial) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).setPointMaterial(pointMaterial);
            return this;
        }

        public C12396b setPointPermanent(boolean z) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).setPointPermanent(z);
            return this;
        }

        public C12396b setPoints(int i, VideoPoint videoPoint) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).setPoints(i, videoPoint);
            return this;
        }

        private C12396b() {
            super(VideoViewPoint.DEFAULT_INSTANCE);
        }

        public C12396b addPoints(int i, VideoPoint videoPoint) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).addPoints(i, videoPoint);
            return this;
        }

        public C12396b setPointMaterial(PointMaterial.C12350b c12350b) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).setPointMaterial(c12350b.build());
            return this;
        }

        public C12396b setPoints(int i, VideoPoint.C12392b c12392b) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).setPoints(i, c12392b.build());
            return this;
        }

        public C12396b addPoints(VideoPoint.C12392b c12392b) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).addPoints(c12392b.build());
            return this;
        }

        public C12396b addPoints(int i, VideoPoint.C12392b c12392b) {
            copyOnWrite();
            ((VideoViewPoint) this.instance).addPoints(i, c12392b.build());
            return this;
        }
    }

    static {
        VideoViewPoint videoViewPoint = new VideoViewPoint();
        DEFAULT_INSTANCE = videoViewPoint;
        GeneratedMessageLite.registerDefaultInstance(VideoViewPoint.class, videoViewPoint);
    }

    private VideoViewPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPoints(Iterable<? extends VideoPoint> iterable) {
        ensurePointsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.points_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(VideoPoint videoPoint) {
        videoPoint.getClass();
        ensurePointsIsMutable();
        this.points_.add(videoPoint);
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

    private void ensurePointsIsMutable() {
        Internal.ProtobufList<VideoPoint> protobufList = this.points_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.points_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static VideoViewPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointMaterial(PointMaterial pointMaterial) {
        pointMaterial.getClass();
        PointMaterial pointMaterial2 = this.pointMaterial_;
        if (pointMaterial2 != null && pointMaterial2 != PointMaterial.getDefaultInstance()) {
            this.pointMaterial_ = PointMaterial.newBuilder(this.pointMaterial_).mergeFrom((PointMaterial) pointMaterial).buildPartial();
        } else {
            this.pointMaterial_ = pointMaterial;
        }
    }

    public static C12396b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VideoViewPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VideoViewPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoViewPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VideoViewPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePoints(int i) {
        ensurePointsIsMutable();
        this.points_.remove(i);
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12395a.f21306xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VideoViewPoint();
            case 2:
                return new C12396b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\u0007", new Object[]{"points_", VideoPoint.class, "pointMaterial_", "pointPermanent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VideoViewPoint> parser = PARSER;
                if (parser == null) {
                    synchronized (VideoViewPoint.class) {
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

    public InterfaceC12416h getPointsOrBuilder(int i) {
        return this.points_.get(i);
    }

    public List<? extends InterfaceC12416h> getPointsOrBuilderList() {
        return this.points_;
    }

    public boolean hasPointMaterial() {
        return this.pointMaterial_ != null;
    }

    public static C12396b newBuilder(VideoViewPoint videoViewPoint) {
        return DEFAULT_INSTANCE.createBuilder(videoViewPoint);
    }

    public static VideoViewPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoViewPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoViewPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VideoViewPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(int i, VideoPoint videoPoint) {
        videoPoint.getClass();
        ensurePointsIsMutable();
        this.points_.add(i, videoPoint);
    }

    public static VideoViewPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VideoViewPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VideoViewPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VideoViewPoint parseFrom(InputStream inputStream) throws IOException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VideoViewPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VideoViewPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VideoViewPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VideoViewPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
