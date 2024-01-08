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
public final class ViewProgressReply extends GeneratedMessageLite<ViewProgressReply, ViewProgressReply.C12400b> implements MessageLiteOrBuilder {
    public static final int ARC_SHOT_FIELD_NUMBER = 3;
    public static final int CHRONOS_FIELD_NUMBER = 2;
    private static final ViewProgressReply DEFAULT_INSTANCE;
    public static final int DM_FIELD_NUMBER = 4;
    public static final int FRAGMENT_RES_FIELD_NUMBER = 5;
    private static volatile Parser<ViewProgressReply> PARSER = null;
    public static final int VIDEO_GUIDE_FIELD_NUMBER = 1;
    private VideoShot arcShot_;
    private Chronos chronos_;
    private DmResource dm_;
    private FragmentRes fragmentRes_;
    private VideoGuide videoGuide_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ViewProgressReply$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12399a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21308xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21308xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21308xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21308xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21308xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21308xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21308xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21308xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ViewProgressReply$b */
    /* loaded from: classes20.dex */
    public static final class C12400b extends GeneratedMessageLite.Builder<ViewProgressReply, C12400b> implements MessageLiteOrBuilder {
        /* synthetic */ C12400b(C12399a c12399a) {
            this();
        }

        public C12400b clearArcShot() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearArcShot();
            return this;
        }

        public C12400b clearChronos() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearChronos();
            return this;
        }

        public C12400b clearDm() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearDm();
            return this;
        }

        public C12400b clearFragmentRes() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearFragmentRes();
            return this;
        }

        public C12400b clearVideoGuide() {
            copyOnWrite();
            ((ViewProgressReply) this.instance).clearVideoGuide();
            return this;
        }

        public VideoShot getArcShot() {
            return ((ViewProgressReply) this.instance).getArcShot();
        }

        public Chronos getChronos() {
            return ((ViewProgressReply) this.instance).getChronos();
        }

        public DmResource getDm() {
            return ((ViewProgressReply) this.instance).getDm();
        }

        public FragmentRes getFragmentRes() {
            return ((ViewProgressReply) this.instance).getFragmentRes();
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

        public boolean hasDm() {
            return ((ViewProgressReply) this.instance).hasDm();
        }

        public boolean hasFragmentRes() {
            return ((ViewProgressReply) this.instance).hasFragmentRes();
        }

        public boolean hasVideoGuide() {
            return ((ViewProgressReply) this.instance).hasVideoGuide();
        }

        public C12400b mergeArcShot(VideoShot videoShot) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeArcShot(videoShot);
            return this;
        }

        public C12400b mergeChronos(Chronos chronos) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeChronos(chronos);
            return this;
        }

        public C12400b mergeDm(DmResource dmResource) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeDm(dmResource);
            return this;
        }

        public C12400b mergeFragmentRes(FragmentRes fragmentRes) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeFragmentRes(fragmentRes);
            return this;
        }

        public C12400b mergeVideoGuide(VideoGuide videoGuide) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).mergeVideoGuide(videoGuide);
            return this;
        }

        public C12400b setArcShot(VideoShot videoShot) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setArcShot(videoShot);
            return this;
        }

        public C12400b setChronos(Chronos chronos) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setChronos(chronos);
            return this;
        }

        public C12400b setDm(DmResource dmResource) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setDm(dmResource);
            return this;
        }

        public C12400b setFragmentRes(FragmentRes fragmentRes) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setFragmentRes(fragmentRes);
            return this;
        }

        public C12400b setVideoGuide(VideoGuide videoGuide) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setVideoGuide(videoGuide);
            return this;
        }

        private C12400b() {
            super(ViewProgressReply.DEFAULT_INSTANCE);
        }

        public C12400b setArcShot(VideoShot.C12394b c12394b) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setArcShot(c12394b.build());
            return this;
        }

        public C12400b setChronos(Chronos.C12290b c12290b) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setChronos(c12290b.build());
            return this;
        }

        public C12400b setDm(DmResource.C12304b c12304b) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setDm(c12304b.build());
            return this;
        }

        public C12400b setFragmentRes(FragmentRes.C12314b c12314b) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setFragmentRes(c12314b.build());
            return this;
        }

        public C12400b setVideoGuide(VideoGuide.C12390b c12390b) {
            copyOnWrite();
            ((ViewProgressReply) this.instance).setVideoGuide(c12390b.build());
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
    public void clearArcShot() {
        this.arcShot_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChronos() {
        this.chronos_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDm() {
        this.dm_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFragmentRes() {
        this.fragmentRes_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoGuide() {
        this.videoGuide_ = null;
    }

    public static ViewProgressReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArcShot(VideoShot videoShot) {
        videoShot.getClass();
        VideoShot videoShot2 = this.arcShot_;
        if (videoShot2 != null && videoShot2 != VideoShot.getDefaultInstance()) {
            this.arcShot_ = VideoShot.newBuilder(this.arcShot_).mergeFrom((VideoShot) videoShot).buildPartial();
        } else {
            this.arcShot_ = videoShot;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChronos(Chronos chronos) {
        chronos.getClass();
        Chronos chronos2 = this.chronos_;
        if (chronos2 != null && chronos2 != Chronos.getDefaultInstance()) {
            this.chronos_ = Chronos.newBuilder(this.chronos_).mergeFrom((Chronos) chronos).buildPartial();
        } else {
            this.chronos_ = chronos;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDm(DmResource dmResource) {
        dmResource.getClass();
        DmResource dmResource2 = this.dm_;
        if (dmResource2 != null && dmResource2 != DmResource.getDefaultInstance()) {
            this.dm_ = DmResource.newBuilder(this.dm_).mergeFrom((DmResource) dmResource).buildPartial();
        } else {
            this.dm_ = dmResource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFragmentRes(FragmentRes fragmentRes) {
        fragmentRes.getClass();
        FragmentRes fragmentRes2 = this.fragmentRes_;
        if (fragmentRes2 != null && fragmentRes2 != FragmentRes.getDefaultInstance()) {
            this.fragmentRes_ = FragmentRes.newBuilder(this.fragmentRes_).mergeFrom((FragmentRes) fragmentRes).buildPartial();
        } else {
            this.fragmentRes_ = fragmentRes;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideoGuide(VideoGuide videoGuide) {
        videoGuide.getClass();
        VideoGuide videoGuide2 = this.videoGuide_;
        if (videoGuide2 != null && videoGuide2 != VideoGuide.getDefaultInstance()) {
            this.videoGuide_ = VideoGuide.newBuilder(this.videoGuide_).mergeFrom((VideoGuide) videoGuide).buildPartial();
        } else {
            this.videoGuide_ = videoGuide;
        }
    }

    public static C12400b newBuilder() {
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
    public void setArcShot(VideoShot videoShot) {
        videoShot.getClass();
        this.arcShot_ = videoShot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChronos(Chronos chronos) {
        chronos.getClass();
        this.chronos_ = chronos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDm(DmResource dmResource) {
        dmResource.getClass();
        this.dm_ = dmResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFragmentRes(FragmentRes fragmentRes) {
        fragmentRes.getClass();
        this.fragmentRes_ = fragmentRes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoGuide(VideoGuide videoGuide) {
        videoGuide.getClass();
        this.videoGuide_ = videoGuide;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12399a.f21308xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewProgressReply();
            case 2:
                return new C12400b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"videoGuide_", "chronos_", "arcShot_", "dm_", "fragmentRes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewProgressReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewProgressReply.class) {
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

    public VideoShot getArcShot() {
        VideoShot videoShot = this.arcShot_;
        return videoShot == null ? VideoShot.getDefaultInstance() : videoShot;
    }

    public Chronos getChronos() {
        Chronos chronos = this.chronos_;
        return chronos == null ? Chronos.getDefaultInstance() : chronos;
    }

    public DmResource getDm() {
        DmResource dmResource = this.dm_;
        return dmResource == null ? DmResource.getDefaultInstance() : dmResource;
    }

    public FragmentRes getFragmentRes() {
        FragmentRes fragmentRes = this.fragmentRes_;
        return fragmentRes == null ? FragmentRes.getDefaultInstance() : fragmentRes;
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

    public boolean hasDm() {
        return this.dm_ != null;
    }

    public boolean hasFragmentRes() {
        return this.fragmentRes_ != null;
    }

    public boolean hasVideoGuide() {
        return this.videoGuide_ != null;
    }

    public static C12400b newBuilder(ViewProgressReply viewProgressReply) {
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
}
