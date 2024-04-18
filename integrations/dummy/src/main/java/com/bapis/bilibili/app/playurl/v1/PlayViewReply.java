package com.bapis.bilibili.app.playurl.v1;

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
public final class PlayViewReply extends GeneratedMessageLite<PlayViewReply, PlayViewReply.Builder> implements MessageLiteOrBuilder {
    public static final int AB_FIELD_NUMBER = 7;
    public static final int CHRONOS_FIELD_NUMBER = 4;
    private static final PlayViewReply DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 6;
    private static volatile Parser<PlayViewReply> PARSER = null;
    public static final int PLAY_ARC_FIELD_NUMBER = 5;
    public static final int PLAY_CONF_FIELD_NUMBER = 2;
    public static final int PLAY_LIMIT_FIELD_NUMBER = 8;
    public static final int UPGRADE_LIMIT_FIELD_NUMBER = 3;
    public static final int VIDEO_INFO_FIELD_NUMBER = 1;
    private AB ab_;
    private Chronos chronos_;
    private Event event_;
    private PlayArcConf playArc_;
    private PlayAbilityConf playConf_;
    private PlayLimit playLimit_;
    private UpgradeLimit upgradeLimit_;
    private VideoInfo videoInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.PlayViewReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C65081 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16539xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16539xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16539xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16539xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16539xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16539xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16539xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16539xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayViewReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C65081 c65081) {
            this();
        }

        public Builder clearAb() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearAb();
            return this;
        }

        public Builder clearChronos() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearChronos();
            return this;
        }

        public Builder clearEvent() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearEvent();
            return this;
        }

        public Builder clearPlayArc() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearPlayArc();
            return this;
        }

        public Builder clearPlayConf() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearPlayConf();
            return this;
        }

        public Builder clearPlayLimit() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearPlayLimit();
            return this;
        }

        public Builder clearUpgradeLimit() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearUpgradeLimit();
            return this;
        }

        public Builder clearVideoInfo() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearVideoInfo();
            return this;
        }

        public AB getAb() {
            return ((PlayViewReply) this.instance).getAb();
        }

        public Chronos getChronos() {
            return ((PlayViewReply) this.instance).getChronos();
        }

        public Event getEvent() {
            return ((PlayViewReply) this.instance).getEvent();
        }

        public PlayArcConf getPlayArc() {
            return ((PlayViewReply) this.instance).getPlayArc();
        }

        public PlayAbilityConf getPlayConf() {
            return ((PlayViewReply) this.instance).getPlayConf();
        }

        public PlayLimit getPlayLimit() {
            return ((PlayViewReply) this.instance).getPlayLimit();
        }

        public UpgradeLimit getUpgradeLimit() {
            return ((PlayViewReply) this.instance).getUpgradeLimit();
        }

        public VideoInfo getVideoInfo() {
            return ((PlayViewReply) this.instance).getVideoInfo();
        }

        public boolean hasAb() {
            return ((PlayViewReply) this.instance).hasAb();
        }

        public boolean hasChronos() {
            return ((PlayViewReply) this.instance).hasChronos();
        }

        public boolean hasEvent() {
            return ((PlayViewReply) this.instance).hasEvent();
        }

        public boolean hasPlayArc() {
            return ((PlayViewReply) this.instance).hasPlayArc();
        }

        public boolean hasPlayConf() {
            return ((PlayViewReply) this.instance).hasPlayConf();
        }

        public boolean hasPlayLimit() {
            return ((PlayViewReply) this.instance).hasPlayLimit();
        }

        public boolean hasUpgradeLimit() {
            return ((PlayViewReply) this.instance).hasUpgradeLimit();
        }

        public boolean hasVideoInfo() {
            return ((PlayViewReply) this.instance).hasVideoInfo();
        }

        public Builder mergeAb(AB ab) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeAb(ab);
            return this;
        }

        public Builder mergeChronos(Chronos chronos) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeChronos(chronos);
            return this;
        }

        public Builder mergeEvent(Event event) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeEvent(event);
            return this;
        }

        public Builder mergePlayArc(PlayArcConf playArcConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergePlayArc(playArcConf);
            return this;
        }

        public Builder mergePlayConf(PlayAbilityConf playAbilityConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergePlayConf(playAbilityConf);
            return this;
        }

        public Builder mergePlayLimit(PlayLimit playLimit) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergePlayLimit(playLimit);
            return this;
        }

        public Builder mergeUpgradeLimit(UpgradeLimit upgradeLimit) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeUpgradeLimit(upgradeLimit);
            return this;
        }

        public Builder mergeVideoInfo(VideoInfo videoInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeVideoInfo(videoInfo);
            return this;
        }

        public Builder setAb(AB ab) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setAb(ab);
            return this;
        }

        public Builder setChronos(Chronos chronos) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setChronos(chronos);
            return this;
        }

        public Builder setEvent(Event event) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setEvent(event);
            return this;
        }

        public Builder setPlayArc(PlayArcConf playArcConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayArc(playArcConf);
            return this;
        }

        public Builder setPlayConf(PlayAbilityConf playAbilityConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayConf(playAbilityConf);
            return this;
        }

        public Builder setPlayLimit(PlayLimit playLimit) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayLimit(playLimit);
            return this;
        }

        public Builder setUpgradeLimit(UpgradeLimit upgradeLimit) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setUpgradeLimit(upgradeLimit);
            return this;
        }

        public Builder setVideoInfo(VideoInfo videoInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setVideoInfo(videoInfo);
            return this;
        }

        private Builder() {
            super(PlayViewReply.DEFAULT_INSTANCE);
        }

        public Builder setAb(AB.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setAb(builder.build());
            return this;
        }

        public Builder setChronos(Chronos.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setChronos(builder.build());
            return this;
        }

        public Builder setEvent(Event.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setEvent(builder.build());
            return this;
        }

        public Builder setPlayArc(PlayArcConf.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayArc(builder.build());
            return this;
        }

        public Builder setPlayConf(PlayAbilityConf.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayConf(builder.build());
            return this;
        }

        public Builder setPlayLimit(PlayLimit.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayLimit(builder.build());
            return this;
        }

        public Builder setUpgradeLimit(UpgradeLimit.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setUpgradeLimit(builder.build());
            return this;
        }

        public Builder setVideoInfo(VideoInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setVideoInfo(builder.build());
            return this;
        }
    }

    static {
        PlayViewReply playViewReply = new PlayViewReply();
        DEFAULT_INSTANCE = playViewReply;
        GeneratedMessageLite.registerDefaultInstance(PlayViewReply.class, playViewReply);
    }

    private PlayViewReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAb() {
        this.ab_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChronos() {
        this.chronos_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayArc() {
        this.playArc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayConf() {
        this.playConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayLimit() {
        this.playLimit_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpgradeLimit() {
        this.upgradeLimit_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoInfo() {
        this.videoInfo_ = null;
    }

    public static PlayViewReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAb(AB ab) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChronos(Chronos chronos) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(Event event) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayArc(PlayArcConf playArcConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayConf(PlayAbilityConf playAbilityConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayLimit(PlayLimit playLimit) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpgradeLimit(UpgradeLimit upgradeLimit) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideoInfo(VideoInfo videoInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayViewReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayViewReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAb(AB ab) {
        ab.getClass();
        this.ab_ = ab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChronos(Chronos chronos) {
        chronos.getClass();
        this.chronos_ = chronos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(Event event) {
        event.getClass();
        this.event_ = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayArc(PlayArcConf playArcConf) {
        playArcConf.getClass();
        this.playArc_ = playArcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayConf(PlayAbilityConf playAbilityConf) {
        playAbilityConf.getClass();
        this.playConf_ = playAbilityConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayLimit(PlayLimit playLimit) {
        playLimit.getClass();
        this.playLimit_ = playLimit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpgradeLimit(UpgradeLimit upgradeLimit) {
        upgradeLimit.getClass();
        this.upgradeLimit_ = upgradeLimit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoInfo(VideoInfo videoInfo) {
        videoInfo.getClass();
        this.videoInfo_ = videoInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C65081.f16539xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayViewReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t", new Object[]{"videoInfo_", "playConf_", "upgradeLimit_", "chronos_", "playArc_", "event_", "ab_", "playLimit_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayViewReply> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayViewReply.class) {
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

    public AB getAb() {
        AB ab = this.ab_;
        return ab == null ? AB.getDefaultInstance() : ab;
    }

    public Chronos getChronos() {
        Chronos chronos = this.chronos_;
        return chronos == null ? Chronos.getDefaultInstance() : chronos;
    }

    public Event getEvent() {
        Event event = this.event_;
        return event == null ? Event.getDefaultInstance() : event;
    }

    public PlayArcConf getPlayArc() {
        PlayArcConf playArcConf = this.playArc_;
        return playArcConf == null ? PlayArcConf.getDefaultInstance() : playArcConf;
    }

    public PlayAbilityConf getPlayConf() {
        PlayAbilityConf playAbilityConf = this.playConf_;
        return playAbilityConf == null ? PlayAbilityConf.getDefaultInstance() : playAbilityConf;
    }

    public PlayLimit getPlayLimit() {
        PlayLimit playLimit = this.playLimit_;
        return playLimit == null ? PlayLimit.getDefaultInstance() : playLimit;
    }

    public UpgradeLimit getUpgradeLimit() {
        UpgradeLimit upgradeLimit = this.upgradeLimit_;
        return upgradeLimit == null ? UpgradeLimit.getDefaultInstance() : upgradeLimit;
    }

    public VideoInfo getVideoInfo() {
        VideoInfo videoInfo = this.videoInfo_;
        return videoInfo == null ? VideoInfo.getDefaultInstance() : videoInfo;
    }

    public boolean hasAb() {
        return this.ab_ != null;
    }

    public boolean hasChronos() {
        return this.chronos_ != null;
    }

    public boolean hasEvent() {
        return this.event_ != null;
    }

    public boolean hasPlayArc() {
        return this.playArc_ != null;
    }

    public boolean hasPlayConf() {
        return this.playConf_ != null;
    }

    public boolean hasPlayLimit() {
        return this.playLimit_ != null;
    }

    public boolean hasUpgradeLimit() {
        return this.upgradeLimit_ != null;
    }

    public boolean hasVideoInfo() {
        return this.videoInfo_ != null;
    }

    public static Builder newBuilder(PlayViewReply playViewReply) {
        return DEFAULT_INSTANCE.createBuilder(playViewReply);
    }

    public static PlayViewReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayViewReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayViewReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayViewReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayViewReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayViewReply parseFrom(InputStream inputStream) throws IOException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayViewReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * clearAb
     */
    static void access$2100(PlayViewReply playViewReply) {
    }
}
