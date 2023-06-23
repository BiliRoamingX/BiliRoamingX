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
public final class PlayViewReply extends GeneratedMessageLite<PlayViewReply, PlayViewReply.Builder> implements MessageLiteOrBuilder {
    public static final int BUSINESS_FIELD_NUMBER = 3;
    private static final PlayViewReply DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 4;
    private static volatile Parser<PlayViewReply> PARSER = null;
    public static final int PLAY_CONF_FIELD_NUMBER = 2;
    public static final int PLAY_EXT_CONF_FIELD_NUMBER = 6;
    public static final int PLAY_EXT_INFO_FIELD_NUMBER = 7;
    public static final int VIDEO_INFO_FIELD_NUMBER = 1;
    public static final int VIEW_INFO_FIELD_NUMBER = 5;
    private PlayViewBusinessInfo business_;
    private Event event_;
    private PlayAbilityConf playConf_;
    private PlayAbilityExtConf playExtConf_;
    private PlayExtInfo playExtInfo_;
    private VideoInfo videoInfo_;
    private ViewInfo viewInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17583xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17583xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17583xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17583xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17583xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17583xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17583xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17583xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayViewReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78681 c78681) {
            this();
        }

        public Builder clearBusiness() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearBusiness();
            return this;
        }

        public Builder clearEvent() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearEvent();
            return this;
        }

        public Builder clearPlayConf() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearPlayConf();
            return this;
        }

        public Builder clearPlayExtConf() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearPlayExtConf();
            return this;
        }

        public Builder clearPlayExtInfo() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearPlayExtInfo();
            return this;
        }

        public Builder clearVideoInfo() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearVideoInfo();
            return this;
        }

        public Builder clearViewInfo() {
            copyOnWrite();
            ((PlayViewReply) this.instance).clearViewInfo();
            return this;
        }

        public PlayViewBusinessInfo getBusiness() {
            return ((PlayViewReply) this.instance).getBusiness();
        }

        public Event getEvent() {
            return ((PlayViewReply) this.instance).getEvent();
        }

        public PlayAbilityConf getPlayConf() {
            return ((PlayViewReply) this.instance).getPlayConf();
        }

        public PlayAbilityExtConf getPlayExtConf() {
            return ((PlayViewReply) this.instance).getPlayExtConf();
        }

        public PlayExtInfo getPlayExtInfo() {
            return ((PlayViewReply) this.instance).getPlayExtInfo();
        }

        public VideoInfo getVideoInfo() {
            return ((PlayViewReply) this.instance).getVideoInfo();
        }

        public ViewInfo getViewInfo() {
            return ((PlayViewReply) this.instance).getViewInfo();
        }

        public boolean hasBusiness() {
            return ((PlayViewReply) this.instance).hasBusiness();
        }

        public boolean hasEvent() {
            return ((PlayViewReply) this.instance).hasEvent();
        }

        public boolean hasPlayConf() {
            return ((PlayViewReply) this.instance).hasPlayConf();
        }

        public boolean hasPlayExtConf() {
            return ((PlayViewReply) this.instance).hasPlayExtConf();
        }

        public boolean hasPlayExtInfo() {
            return ((PlayViewReply) this.instance).hasPlayExtInfo();
        }

        public boolean hasVideoInfo() {
            return ((PlayViewReply) this.instance).hasVideoInfo();
        }

        public boolean hasViewInfo() {
            return ((PlayViewReply) this.instance).hasViewInfo();
        }

        public Builder mergeBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeBusiness(playViewBusinessInfo);
            return this;
        }

        public Builder mergeEvent(Event event) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeEvent(event);
            return this;
        }

        public Builder mergePlayConf(PlayAbilityConf playAbilityConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergePlayConf(playAbilityConf);
            return this;
        }

        public Builder mergePlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergePlayExtConf(playAbilityExtConf);
            return this;
        }

        public Builder mergePlayExtInfo(PlayExtInfo playExtInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergePlayExtInfo(playExtInfo);
            return this;
        }

        public Builder mergeVideoInfo(VideoInfo videoInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeVideoInfo(videoInfo);
            return this;
        }

        public Builder mergeViewInfo(ViewInfo viewInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).mergeViewInfo(viewInfo);
            return this;
        }

        public Builder setBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setBusiness(playViewBusinessInfo);
            return this;
        }

        public Builder setEvent(Event event) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setEvent(event);
            return this;
        }

        public Builder setPlayConf(PlayAbilityConf playAbilityConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayConf(playAbilityConf);
            return this;
        }

        public Builder setPlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayExtConf(playAbilityExtConf);
            return this;
        }

        public Builder setPlayExtInfo(PlayExtInfo playExtInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayExtInfo(playExtInfo);
            return this;
        }

        public Builder setVideoInfo(VideoInfo videoInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setVideoInfo(videoInfo);
            return this;
        }

        public Builder setViewInfo(ViewInfo viewInfo) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setViewInfo(viewInfo);
            return this;
        }

        private Builder() {
            super(PlayViewReply.DEFAULT_INSTANCE);
        }

        public Builder setBusiness(PlayViewBusinessInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setBusiness(builder.build());
            return this;
        }

        public Builder setEvent(Event.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setEvent(builder.build());
            return this;
        }

        public Builder setPlayConf(PlayAbilityConf.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayConf(builder.build());
            return this;
        }

        public Builder setPlayExtConf(PlayAbilityExtConf.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayExtConf(builder.build());
            return this;
        }

        public Builder setPlayExtInfo(PlayExtInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setPlayExtInfo(builder.build());
            return this;
        }

        public Builder setVideoInfo(VideoInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setVideoInfo(builder.build());
            return this;
        }

        public Builder setViewInfo(ViewInfo.Builder builder) {
            copyOnWrite();
            ((PlayViewReply) this.instance).setViewInfo(builder.build());
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
    public void clearBusiness() {
        this.business_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayConf() {
        this.playConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayExtConf() {
        this.playExtConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayExtInfo() {
        this.playExtInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoInfo() {
        this.videoInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewInfo() {
        this.viewInfo_ = null;
    }

    public static PlayViewReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(Event event) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayConf(PlayAbilityConf playAbilityConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayExtInfo(PlayExtInfo playExtInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideoInfo(VideoInfo videoInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewInfo(ViewInfo viewInfo) {
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
    public void setBusiness(PlayViewBusinessInfo playViewBusinessInfo) {
        playViewBusinessInfo.getClass();
        this.business_ = playViewBusinessInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(Event event) {
        event.getClass();
        this.event_ = event;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayConf(PlayAbilityConf playAbilityConf) {
        playAbilityConf.getClass();
        this.playConf_ = playAbilityConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayExtConf(PlayAbilityExtConf playAbilityExtConf) {
        playAbilityExtConf.getClass();
        this.playExtConf_ = playAbilityExtConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayExtInfo(PlayExtInfo playExtInfo) {
        playExtInfo.getClass();
        this.playExtInfo_ = playExtInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoInfo(VideoInfo videoInfo) {
        videoInfo.getClass();
        this.videoInfo_ = videoInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewInfo(ViewInfo viewInfo) {
        viewInfo.getClass();
        this.viewInfo_ = viewInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78681.f17583xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayViewReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"videoInfo_", "playConf_", "business_", "event_", "viewInfo_", "playExtConf_", "playExtInfo_"});
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

    public PlayViewBusinessInfo getBusiness() {
        PlayViewBusinessInfo playViewBusinessInfo = this.business_;
        return playViewBusinessInfo == null ? PlayViewBusinessInfo.getDefaultInstance() : playViewBusinessInfo;
    }

    public Event getEvent() {
        Event event = this.event_;
        return event == null ? Event.getDefaultInstance() : event;
    }

    public PlayAbilityConf getPlayConf() {
        PlayAbilityConf playAbilityConf = this.playConf_;
        return playAbilityConf == null ? PlayAbilityConf.getDefaultInstance() : playAbilityConf;
    }

    public PlayAbilityExtConf getPlayExtConf() {
        PlayAbilityExtConf playAbilityExtConf = this.playExtConf_;
        return playAbilityExtConf == null ? PlayAbilityExtConf.getDefaultInstance() : playAbilityExtConf;
    }

    public PlayExtInfo getPlayExtInfo() {
        PlayExtInfo playExtInfo = this.playExtInfo_;
        return playExtInfo == null ? PlayExtInfo.getDefaultInstance() : playExtInfo;
    }

    public VideoInfo getVideoInfo() {
        VideoInfo videoInfo = this.videoInfo_;
        return videoInfo == null ? VideoInfo.getDefaultInstance() : videoInfo;
    }

    public ViewInfo getViewInfo() {
        ViewInfo viewInfo = this.viewInfo_;
        return viewInfo == null ? ViewInfo.getDefaultInstance() : viewInfo;
    }

    public boolean hasBusiness() {
        return this.business_ != null;
    }

    public boolean hasEvent() {
        return this.event_ != null;
    }

    public boolean hasPlayConf() {
        return this.playConf_ != null;
    }

    public boolean hasPlayExtConf() {
        return this.playExtConf_ != null;
    }

    public boolean hasPlayExtInfo() {
        return this.playExtInfo_ != null;
    }

    public boolean hasVideoInfo() {
        return this.videoInfo_ != null;
    }

    public boolean hasViewInfo() {
        return this.viewInfo_ != null;
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
}
