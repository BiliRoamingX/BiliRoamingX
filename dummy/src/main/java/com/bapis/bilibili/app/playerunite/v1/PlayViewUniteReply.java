package com.bapis.bilibili.app.playerunite.v1;

import com.bapis.bilibili.playershared.Event;
import com.bapis.bilibili.playershared.FragmentVideo;
import com.bapis.bilibili.playershared.History;
import com.bapis.bilibili.playershared.PlayArc;
import com.bapis.bilibili.playershared.PlayArcConf;
import com.bapis.bilibili.playershared.PlayDeviceConf;
import com.bapis.bilibili.playershared.QnTrialInfo;
import com.bapis.bilibili.playershared.VideoCtrl;
import com.bapis.bilibili.playershared.ViewInfo;
import com.bapis.bilibili.playershared.VodInfo;
import com.google.protobuf.Any;
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
public final class PlayViewUniteReply extends GeneratedMessageLite<PlayViewUniteReply, PlayViewUniteReply.C6745b> implements MessageLiteOrBuilder {
    private static final PlayViewUniteReply DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 4;
    public static final int FRAGMENT_VIDEO_FIELD_NUMBER = 10;
    public static final int HISTORY_FIELD_NUMBER = 8;
    private static volatile Parser<PlayViewUniteReply> PARSER = null;
    public static final int PLAY_ARC_CONF_FIELD_NUMBER = 2;
    public static final int PLAY_ARC_FIELD_NUMBER = 6;
    public static final int PLAY_DEVICE_CONF_FIELD_NUMBER = 3;
    public static final int QN_TRIAL_INFO_FIELD_NUMBER = 7;
    public static final int SUPPLEMENT_FIELD_NUMBER = 5;
    public static final int VIDEO_CTRL_FIELD_NUMBER = 11;
    public static final int VIEW_INFO_FIELD_NUMBER = 9;
    public static final int VOD_INFO_FIELD_NUMBER = 1;
    private Event event_;
    private FragmentVideo fragmentVideo_;
    private History history_;
    private PlayArcConf playArcConf_;
    private PlayArc playArc_;
    private PlayDeviceConf playDeviceConf_;
    private QnTrialInfo qnTrialInfo_;
    private Any supplement_;
    private VideoCtrl videoCtrl_;
    private ViewInfo viewInfo_;
    private VodInfo vodInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C6744a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17741xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17741xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17741xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17741xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17741xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17741xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17741xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17741xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply$b */
    /* loaded from: classes13.dex */
    public static final class C6745b extends GeneratedMessageLite.Builder<PlayViewUniteReply, C6745b> implements MessageLiteOrBuilder {
        /* synthetic */ C6745b(C6744a c6744a) {
            this();
        }

        public C6745b clearEvent() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearEvent();
            return this;
        }

        public C6745b clearFragmentVideo() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearFragmentVideo();
            return this;
        }

        public C6745b clearHistory() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearHistory();
            return this;
        }

        public C6745b clearPlayArc() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearPlayArc();
            return this;
        }

        public C6745b clearPlayArcConf() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearPlayArcConf();
            return this;
        }

        public C6745b clearPlayDeviceConf() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearPlayDeviceConf();
            return this;
        }

        public C6745b clearQnTrialInfo() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearQnTrialInfo();
            return this;
        }

        public C6745b clearSupplement() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearSupplement();
            return this;
        }

        public C6745b clearVideoCtrl() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearVideoCtrl();
            return this;
        }

        public C6745b clearViewInfo() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearViewInfo();
            return this;
        }

        public C6745b clearVodInfo() {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).clearVodInfo();
            return this;
        }

        public Event getEvent() {
            return ((PlayViewUniteReply) this.instance).getEvent();
        }

        public FragmentVideo getFragmentVideo() {
            return ((PlayViewUniteReply) this.instance).getFragmentVideo();
        }

        public History getHistory() {
            return ((PlayViewUniteReply) this.instance).getHistory();
        }

        public PlayArc getPlayArc() {
            return ((PlayViewUniteReply) this.instance).getPlayArc();
        }

        public PlayArcConf getPlayArcConf() {
            return ((PlayViewUniteReply) this.instance).getPlayArcConf();
        }

        public PlayDeviceConf getPlayDeviceConf() {
            return ((PlayViewUniteReply) this.instance).getPlayDeviceConf();
        }

        public QnTrialInfo getQnTrialInfo() {
            return ((PlayViewUniteReply) this.instance).getQnTrialInfo();
        }

        public Any getSupplement() {
            return ((PlayViewUniteReply) this.instance).getSupplement();
        }

        public VideoCtrl getVideoCtrl() {
            return ((PlayViewUniteReply) this.instance).getVideoCtrl();
        }

        public ViewInfo getViewInfo() {
            return ((PlayViewUniteReply) this.instance).getViewInfo();
        }

        public VodInfo getVodInfo() {
            return ((PlayViewUniteReply) this.instance).getVodInfo();
        }

        public boolean hasEvent() {
            return ((PlayViewUniteReply) this.instance).hasEvent();
        }

        public boolean hasFragmentVideo() {
            return ((PlayViewUniteReply) this.instance).hasFragmentVideo();
        }

        public boolean hasHistory() {
            return ((PlayViewUniteReply) this.instance).hasHistory();
        }

        public boolean hasPlayArc() {
            return ((PlayViewUniteReply) this.instance).hasPlayArc();
        }

        public boolean hasPlayArcConf() {
            return ((PlayViewUniteReply) this.instance).hasPlayArcConf();
        }

        public boolean hasPlayDeviceConf() {
            return ((PlayViewUniteReply) this.instance).hasPlayDeviceConf();
        }

        public boolean hasQnTrialInfo() {
            return ((PlayViewUniteReply) this.instance).hasQnTrialInfo();
        }

        public boolean hasSupplement() {
            return ((PlayViewUniteReply) this.instance).hasSupplement();
        }

        public boolean hasVideoCtrl() {
            return ((PlayViewUniteReply) this.instance).hasVideoCtrl();
        }

        public boolean hasViewInfo() {
            return ((PlayViewUniteReply) this.instance).hasViewInfo();
        }

        public boolean hasVodInfo() {
            return ((PlayViewUniteReply) this.instance).hasVodInfo();
        }

        public C6745b mergeEvent(Event event) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeEvent(event);
            return this;
        }

        public C6745b mergeFragmentVideo(FragmentVideo fragmentVideo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeFragmentVideo(fragmentVideo);
            return this;
        }

        public C6745b mergeHistory(History history) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeHistory(history);
            return this;
        }

        public C6745b mergePlayArc(PlayArc playArc) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergePlayArc(playArc);
            return this;
        }

        public C6745b mergePlayArcConf(PlayArcConf playArcConf) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergePlayArcConf(playArcConf);
            return this;
        }

        public C6745b mergePlayDeviceConf(PlayDeviceConf playDeviceConf) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergePlayDeviceConf(playDeviceConf);
            return this;
        }

        public C6745b mergeQnTrialInfo(QnTrialInfo qnTrialInfo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeQnTrialInfo(qnTrialInfo);
            return this;
        }

        public C6745b mergeSupplement(Any any) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeSupplement(any);
            return this;
        }

        public C6745b mergeVideoCtrl(VideoCtrl videoCtrl) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeVideoCtrl(videoCtrl);
            return this;
        }

        public C6745b mergeViewInfo(ViewInfo viewInfo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeViewInfo(viewInfo);
            return this;
        }

        public C6745b mergeVodInfo(VodInfo vodInfo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).mergeVodInfo(vodInfo);
            return this;
        }

        public C6745b setEvent(Event event) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setEvent(event);
            return this;
        }

        public C6745b setFragmentVideo(FragmentVideo fragmentVideo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setFragmentVideo(fragmentVideo);
            return this;
        }

        public C6745b setHistory(History history) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setHistory(history);
            return this;
        }

        public C6745b setPlayArc(PlayArc playArc) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayArc(playArc);
            return this;
        }

        public C6745b setPlayArcConf(PlayArcConf playArcConf) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayArcConf(playArcConf);
            return this;
        }

        public C6745b setPlayDeviceConf(PlayDeviceConf playDeviceConf) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayDeviceConf(playDeviceConf);
            return this;
        }

        public C6745b setQnTrialInfo(QnTrialInfo qnTrialInfo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setQnTrialInfo(qnTrialInfo);
            return this;
        }

        public C6745b setSupplement(Any any) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setSupplement(any);
            return this;
        }

        public C6745b setVideoCtrl(VideoCtrl videoCtrl) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setVideoCtrl(videoCtrl);
            return this;
        }

        public C6745b setViewInfo(ViewInfo viewInfo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setViewInfo(viewInfo);
            return this;
        }

        public C6745b setVodInfo(VodInfo vodInfo) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setVodInfo(vodInfo);
            return this;
        }

        private C6745b() {
            super(PlayViewUniteReply.DEFAULT_INSTANCE);
        }

        public C6745b setEvent(Event.Builder c11630b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setEvent(c11630b.build());
            return this;
        }

        public C6745b setFragmentVideo(FragmentVideo.C16010b c16010b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setFragmentVideo(c16010b.build());
            return this;
        }

        public C6745b setHistory(History.Builder c11656b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setHistory(c11656b.build());
            return this;
        }

        public C6745b setPlayArc(PlayArc.C13342b c11673b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayArc(c11673b.build());
            return this;
        }

        public C6745b setPlayArcConf(PlayArcConf.Builder c11676c) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayArcConf(c11676c.build());
            return this;
        }

        public C6745b setPlayDeviceConf(PlayDeviceConf.Builder c11680b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setPlayDeviceConf(c11680b.build());
            return this;
        }

        public C6745b setQnTrialInfo(QnTrialInfo.Builder c11697b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setQnTrialInfo(c11697b.build());
            return this;
        }

        public C6745b setSupplement(Any.Builder builder) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setSupplement(builder.build());
            return this;
        }

        public C6745b setVideoCtrl(VideoCtrl.C11731b c11731b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setVideoCtrl(c11731b.build());
            return this;
        }

        public C6745b setViewInfo(ViewInfo.Builder c11735b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setViewInfo(c11735b.build());
            return this;
        }

        public C6745b setVodInfo(VodInfo.Builder c11738b) {
            copyOnWrite();
            ((PlayViewUniteReply) this.instance).setVodInfo(c11738b.build());
            return this;
        }
    }

    static {
        PlayViewUniteReply playViewUniteReply = new PlayViewUniteReply();
        DEFAULT_INSTANCE = playViewUniteReply;
        GeneratedMessageLite.registerDefaultInstance(PlayViewUniteReply.class, playViewUniteReply);
    }

    public PlayViewUniteReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFragmentVideo() {
        this.fragmentVideo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayArc() {
        this.playArc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayArcConf() {
        this.playArcConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayDeviceConf() {
        this.playDeviceConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQnTrialInfo() {
        this.qnTrialInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupplement() {
        this.supplement_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoCtrl() {
        this.videoCtrl_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewInfo() {
        this.viewInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVodInfo() {
        this.vodInfo_ = null;
    }

    public static PlayViewUniteReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(Event event) {
        event.getClass();
        Event event2 = this.event_;
        if (event2 != null && event2 != Event.getDefaultInstance()) {
            this.event_ = Event.newBuilder(this.event_).mergeFrom((Event) event).buildPartial();
        } else {
            this.event_ = event;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFragmentVideo(FragmentVideo fragmentVideo) {
        fragmentVideo.getClass();
        FragmentVideo fragmentVideo2 = this.fragmentVideo_;
        if (fragmentVideo2 != null && fragmentVideo2 != FragmentVideo.getDefaultInstance()) {
            this.fragmentVideo_ = FragmentVideo.newBuilder(this.fragmentVideo_).mergeFrom((FragmentVideo) fragmentVideo).buildPartial();
        } else {
            this.fragmentVideo_ = fragmentVideo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHistory(History history) {
        history.getClass();
        History history2 = this.history_;
        if (history2 != null && history2 != History.getDefaultInstance()) {
            this.history_ = History.newBuilder(this.history_).mergeFrom((History) history).buildPartial();
        } else {
            this.history_ = history;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayArc(PlayArc playArc) {
        playArc.getClass();
        PlayArc playArc2 = this.playArc_;
        if (playArc2 != null && playArc2 != PlayArc.getDefaultInstance()) {
            this.playArc_ = PlayArc.newBuilder(this.playArc_).mergeFrom((PlayArc) playArc).buildPartial();
        } else {
            this.playArc_ = playArc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayArcConf(PlayArcConf playArcConf) {
        playArcConf.getClass();
        PlayArcConf playArcConf2 = this.playArcConf_;
        if (playArcConf2 != null && playArcConf2 != PlayArcConf.getDefaultInstance()) {
            this.playArcConf_ = PlayArcConf.newBuilder(this.playArcConf_).mergeFrom((PlayArcConf) playArcConf).buildPartial();
        } else {
            this.playArcConf_ = playArcConf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayDeviceConf(PlayDeviceConf playDeviceConf) {
        playDeviceConf.getClass();
        PlayDeviceConf playDeviceConf2 = this.playDeviceConf_;
        if (playDeviceConf2 != null && playDeviceConf2 != PlayDeviceConf.getDefaultInstance()) {
            this.playDeviceConf_ = PlayDeviceConf.newBuilder(this.playDeviceConf_).mergeFrom((PlayDeviceConf) playDeviceConf).buildPartial();
        } else {
            this.playDeviceConf_ = playDeviceConf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQnTrialInfo(QnTrialInfo qnTrialInfo) {
        qnTrialInfo.getClass();
        QnTrialInfo qnTrialInfo2 = this.qnTrialInfo_;
        if (qnTrialInfo2 != null && qnTrialInfo2 != QnTrialInfo.getDefaultInstance()) {
            this.qnTrialInfo_ = QnTrialInfo.newBuilder(this.qnTrialInfo_).mergeFrom((QnTrialInfo) qnTrialInfo).buildPartial();
        } else {
            this.qnTrialInfo_ = qnTrialInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSupplement(Any any) {
        any.getClass();
        Any any2 = this.supplement_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.supplement_ = Any.newBuilder(this.supplement_).mergeFrom((Any) any).buildPartial();
        } else {
            this.supplement_ = any;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideoCtrl(VideoCtrl videoCtrl) {
        videoCtrl.getClass();
        VideoCtrl videoCtrl2 = this.videoCtrl_;
        if (videoCtrl2 != null && videoCtrl2 != VideoCtrl.getDefaultInstance()) {
            this.videoCtrl_ = VideoCtrl.newBuilder(this.videoCtrl_).mergeFrom((VideoCtrl) videoCtrl).buildPartial();
        } else {
            this.videoCtrl_ = videoCtrl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewInfo(ViewInfo viewInfo) {
        viewInfo.getClass();
        ViewInfo viewInfo2 = this.viewInfo_;
        if (viewInfo2 != null && viewInfo2 != ViewInfo.getDefaultInstance()) {
            this.viewInfo_ = ViewInfo.newBuilder(this.viewInfo_).mergeFrom((ViewInfo) viewInfo).buildPartial();
        } else {
            this.viewInfo_ = viewInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVodInfo(VodInfo vodInfo) {
        vodInfo.getClass();
        VodInfo vodInfo2 = this.vodInfo_;
        if (vodInfo2 != null && vodInfo2 != VodInfo.getDefaultInstance()) {
            this.vodInfo_ = VodInfo.newBuilder(this.vodInfo_).mergeFrom((VodInfo) vodInfo).buildPartial();
        } else {
            this.vodInfo_ = vodInfo;
        }
    }

    public static C6745b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayViewUniteReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewUniteReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayViewUniteReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(Event event) {
        event.getClass();
        this.event_ = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFragmentVideo(FragmentVideo fragmentVideo) {
        fragmentVideo.getClass();
        this.fragmentVideo_ = fragmentVideo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(History history) {
        history.getClass();
        this.history_ = history;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayArc(PlayArc playArc) {
        playArc.getClass();
        this.playArc_ = playArc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayArcConf(PlayArcConf playArcConf) {
        playArcConf.getClass();
        this.playArcConf_ = playArcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayDeviceConf(PlayDeviceConf playDeviceConf) {
        playDeviceConf.getClass();
        this.playDeviceConf_ = playDeviceConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQnTrialInfo(QnTrialInfo qnTrialInfo) {
        qnTrialInfo.getClass();
        this.qnTrialInfo_ = qnTrialInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupplement(Any any) {
        any.getClass();
        this.supplement_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCtrl(VideoCtrl videoCtrl) {
        videoCtrl.getClass();
        this.videoCtrl_ = videoCtrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewInfo(ViewInfo viewInfo) {
        viewInfo.getClass();
        this.viewInfo_ = viewInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVodInfo(VodInfo vodInfo) {
        vodInfo.getClass();
        this.vodInfo_ = vodInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6744a c6744a = null;
        switch (C6744a.f17741xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayViewUniteReply();
            case 2:
                return new C6745b(c6744a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t", new Object[]{"vodInfo_", "playArcConf_", "playDeviceConf_", "event_", "supplement_", "playArc_", "qnTrialInfo_", "history_", "viewInfo_", "fragmentVideo_", "videoCtrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayViewUniteReply> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayViewUniteReply.class) {
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

    public Event getEvent() {
        Event event = this.event_;
        return event == null ? Event.getDefaultInstance() : event;
    }

    public FragmentVideo getFragmentVideo() {
        FragmentVideo fragmentVideo = this.fragmentVideo_;
        return fragmentVideo == null ? FragmentVideo.getDefaultInstance() : fragmentVideo;
    }

    public History getHistory() {
        History history = this.history_;
        return history == null ? History.getDefaultInstance() : history;
    }

    public PlayArc getPlayArc() {
        PlayArc playArc = this.playArc_;
        return playArc == null ? PlayArc.getDefaultInstance() : playArc;
    }

    public PlayArcConf getPlayArcConf() {
        PlayArcConf playArcConf = this.playArcConf_;
        return playArcConf == null ? PlayArcConf.getDefaultInstance() : playArcConf;
    }

    public PlayDeviceConf getPlayDeviceConf() {
        PlayDeviceConf playDeviceConf = this.playDeviceConf_;
        return playDeviceConf == null ? PlayDeviceConf.getDefaultInstance() : playDeviceConf;
    }

    public QnTrialInfo getQnTrialInfo() {
        QnTrialInfo qnTrialInfo = this.qnTrialInfo_;
        return qnTrialInfo == null ? QnTrialInfo.getDefaultInstance() : qnTrialInfo;
    }

    public Any getSupplement() {
        Any any = this.supplement_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public VideoCtrl getVideoCtrl() {
        VideoCtrl videoCtrl = this.videoCtrl_;
        return videoCtrl == null ? VideoCtrl.getDefaultInstance() : videoCtrl;
    }

    public ViewInfo getViewInfo() {
        ViewInfo viewInfo = this.viewInfo_;
        return viewInfo == null ? ViewInfo.getDefaultInstance() : viewInfo;
    }

    public VodInfo getVodInfo() {
        VodInfo vodInfo = this.vodInfo_;
        return vodInfo == null ? VodInfo.getDefaultInstance() : vodInfo;
    }

    public boolean hasEvent() {
        return this.event_ != null;
    }

    public boolean hasFragmentVideo() {
        return this.fragmentVideo_ != null;
    }

    public boolean hasHistory() {
        return this.history_ != null;
    }

    public boolean hasPlayArc() {
        return this.playArc_ != null;
    }

    public boolean hasPlayArcConf() {
        return this.playArcConf_ != null;
    }

    public boolean hasPlayDeviceConf() {
        return this.playDeviceConf_ != null;
    }

    public boolean hasQnTrialInfo() {
        return this.qnTrialInfo_ != null;
    }

    public boolean hasSupplement() {
        return this.supplement_ != null;
    }

    public boolean hasVideoCtrl() {
        return this.videoCtrl_ != null;
    }

    public boolean hasViewInfo() {
        return this.viewInfo_ != null;
    }

    public boolean hasVodInfo() {
        return this.vodInfo_ != null;
    }

    public static C6745b newBuilder(PlayViewUniteReply playViewUniteReply) {
        return DEFAULT_INSTANCE.createBuilder(playViewUniteReply);
    }

    public static PlayViewUniteReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayViewUniteReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayViewUniteReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(InputStream inputStream) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewUniteReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewUniteReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayViewUniteReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewUniteReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
