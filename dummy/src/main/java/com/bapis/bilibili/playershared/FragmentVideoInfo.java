package com.bapis.bilibili.playershared;

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
/* loaded from: classes22.dex */
public final class FragmentVideoInfo extends GeneratedMessageLite<FragmentVideoInfo, FragmentVideoInfo.C16012b> implements InterfaceC16108h {
    private static final FragmentVideoInfo DEFAULT_INSTANCE;
    public static final int DIMENSION_FIELD_NUMBER = 4;
    public static final int FRAGMENT_INFO_FIELD_NUMBER = 1;
    private static volatile Parser<FragmentVideoInfo> PARSER = null;
    public static final int PLAYABLE_STATUS_FIELD_NUMBER = 7;
    public static final int PLAY_ARC_CONF_FIELD_NUMBER = 3;
    public static final int TIMELENGTH_FIELD_NUMBER = 5;
    public static final int VIDEO_TYPE_FIELD_NUMBER = 6;
    public static final int VOD_INFO_FIELD_NUMBER = 2;
    private Dimension dimension_;
    private FragmentInfo fragmentInfo_;
    private PlayArcConf playArcConf_;
    private boolean playableStatus_;
    private long timelength_;
    private int videoType_;
    private VodInfo vodInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentVideoInfo$a */
    /* loaded from: classes22.dex */
    static /* synthetic */ class C16011a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22416xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22416xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22416xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22416xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22416xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22416xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22416xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22416xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentVideoInfo$b */
    /* loaded from: classes22.dex */
    public static final class C16012b extends GeneratedMessageLite.Builder<FragmentVideoInfo, C16012b> implements InterfaceC16108h {
        /* synthetic */ C16012b(C16011a c16011a) {
            this();
        }

        public C16012b clearDimension() {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).clearDimension();
            return this;
        }

        public C16012b clearFragmentInfo() {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).clearFragmentInfo();
            return this;
        }

        public C16012b clearPlayArcConf() {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).clearPlayArcConf();
            return this;
        }

        public C16012b clearPlayableStatus() {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).clearPlayableStatus();
            return this;
        }

        public C16012b clearTimelength() {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).clearTimelength();
            return this;
        }

        public C16012b clearVideoType() {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).clearVideoType();
            return this;
        }

        public C16012b clearVodInfo() {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).clearVodInfo();
            return this;
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public Dimension getDimension() {
            return ((FragmentVideoInfo) this.instance).getDimension();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public FragmentInfo getFragmentInfo() {
            return ((FragmentVideoInfo) this.instance).getFragmentInfo();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public PlayArcConf getPlayArcConf() {
            return ((FragmentVideoInfo) this.instance).getPlayArcConf();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public boolean getPlayableStatus() {
            return ((FragmentVideoInfo) this.instance).getPlayableStatus();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public long getTimelength() {
            return ((FragmentVideoInfo) this.instance).getTimelength();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public BizType getVideoType() {
            return ((FragmentVideoInfo) this.instance).getVideoType();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public int getVideoTypeValue() {
            return ((FragmentVideoInfo) this.instance).getVideoTypeValue();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public VodInfo getVodInfo() {
            return ((FragmentVideoInfo) this.instance).getVodInfo();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public boolean hasDimension() {
            return ((FragmentVideoInfo) this.instance).hasDimension();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public boolean hasFragmentInfo() {
            return ((FragmentVideoInfo) this.instance).hasFragmentInfo();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public boolean hasPlayArcConf() {
            return ((FragmentVideoInfo) this.instance).hasPlayArcConf();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16108h
        public boolean hasVodInfo() {
            return ((FragmentVideoInfo) this.instance).hasVodInfo();
        }

        public C16012b mergeDimension(Dimension dimension) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).mergeDimension(dimension);
            return this;
        }

        public C16012b mergeFragmentInfo(FragmentInfo fragmentInfo) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).mergeFragmentInfo(fragmentInfo);
            return this;
        }

        public C16012b mergePlayArcConf(PlayArcConf playArcConf) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).mergePlayArcConf(playArcConf);
            return this;
        }

        public C16012b mergeVodInfo(VodInfo vodInfo) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).mergeVodInfo(vodInfo);
            return this;
        }

        public C16012b setDimension(Dimension dimension) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setDimension(dimension);
            return this;
        }

        public C16012b setFragmentInfo(FragmentInfo fragmentInfo) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setFragmentInfo(fragmentInfo);
            return this;
        }

        public C16012b setPlayArcConf(PlayArcConf playArcConf) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setPlayArcConf(playArcConf);
            return this;
        }

        public C16012b setPlayableStatus(boolean z) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setPlayableStatus(z);
            return this;
        }

        public C16012b setTimelength(long j) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setTimelength(j);
            return this;
        }

        public C16012b setVideoType(BizType bizType) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setVideoType(bizType);
            return this;
        }

        public C16012b setVideoTypeValue(int i) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setVideoTypeValue(i);
            return this;
        }

        public C16012b setVodInfo(VodInfo vodInfo) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setVodInfo(vodInfo);
            return this;
        }

        private C16012b() {
            super(FragmentVideoInfo.DEFAULT_INSTANCE);
        }

        public C16012b setFragmentInfo(FragmentInfo.C16004b c16004b) {
            copyOnWrite();
            ((FragmentVideoInfo) this.instance).setFragmentInfo(c16004b.build());
            return this;
        }
    }

    static {
        FragmentVideoInfo fragmentVideoInfo = new FragmentVideoInfo();
        DEFAULT_INSTANCE = fragmentVideoInfo;
        GeneratedMessageLite.registerDefaultInstance(FragmentVideoInfo.class, fragmentVideoInfo);
    }

    private FragmentVideoInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimension() {
        this.dimension_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFragmentInfo() {
        this.fragmentInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayArcConf() {
        this.playArcConf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayableStatus() {
        this.playableStatus_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelength() {
        this.timelength_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoType() {
        this.videoType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVodInfo() {
        this.vodInfo_ = null;
    }

    public static FragmentVideoInfo getDefaultInstance() {
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
    public void mergeFragmentInfo(FragmentInfo fragmentInfo) {
        fragmentInfo.getClass();
        FragmentInfo fragmentInfo2 = this.fragmentInfo_;
        if (fragmentInfo2 != null && fragmentInfo2 != FragmentInfo.getDefaultInstance()) {
            this.fragmentInfo_ = FragmentInfo.newBuilder(this.fragmentInfo_).mergeFrom((FragmentInfo) fragmentInfo).buildPartial();
        } else {
            this.fragmentInfo_ = fragmentInfo;
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
    public void mergeVodInfo(VodInfo vodInfo) {
        vodInfo.getClass();
        VodInfo vodInfo2 = this.vodInfo_;
        if (vodInfo2 != null && vodInfo2 != VodInfo.getDefaultInstance()) {
            this.vodInfo_ = VodInfo.newBuilder(this.vodInfo_).mergeFrom((VodInfo) vodInfo).buildPartial();
        } else {
            this.vodInfo_ = vodInfo;
        }
    }

    public static C16012b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FragmentVideoInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentVideoInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FragmentVideoInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension_ = dimension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFragmentInfo(FragmentInfo fragmentInfo) {
        fragmentInfo.getClass();
        this.fragmentInfo_ = fragmentInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayArcConf(PlayArcConf playArcConf) {
        playArcConf.getClass();
        this.playArcConf_ = playArcConf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableStatus(boolean z) {
        this.playableStatus_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelength(long j) {
        this.timelength_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoType(BizType bizType) {
        this.videoType_ = bizType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoTypeValue(int i) {
        this.videoType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVodInfo(VodInfo vodInfo) {
        vodInfo.getClass();
        this.vodInfo_ = vodInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C16011a.f22416xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FragmentVideoInfo();
            case 2:
                return new C16012b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u0003\u0006\f\u0007\u0007", new Object[]{"fragmentInfo_", "vodInfo_", "playArcConf_", "dimension_", "timelength_", "videoType_", "playableStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FragmentVideoInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (FragmentVideoInfo.class) {
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

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public Dimension getDimension() {
        Dimension dimension = this.dimension_;
        return dimension == null ? Dimension.getDefaultInstance() : dimension;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public FragmentInfo getFragmentInfo() {
        FragmentInfo fragmentInfo = this.fragmentInfo_;
        return fragmentInfo == null ? FragmentInfo.getDefaultInstance() : fragmentInfo;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public PlayArcConf getPlayArcConf() {
        PlayArcConf playArcConf = this.playArcConf_;
        return playArcConf == null ? PlayArcConf.getDefaultInstance() : playArcConf;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public boolean getPlayableStatus() {
        return this.playableStatus_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public long getTimelength() {
        return this.timelength_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public BizType getVideoType() {
        BizType forNumber = BizType.forNumber(this.videoType_);
        return forNumber == null ? BizType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public int getVideoTypeValue() {
        return this.videoType_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public VodInfo getVodInfo() {
        VodInfo vodInfo = this.vodInfo_;
        return vodInfo == null ? VodInfo.getDefaultInstance() : vodInfo;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public boolean hasDimension() {
        return this.dimension_ != null;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public boolean hasFragmentInfo() {
        return this.fragmentInfo_ != null;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public boolean hasPlayArcConf() {
        return this.playArcConf_ != null;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16108h
    public boolean hasVodInfo() {
        return this.vodInfo_ != null;
    }

    public static C16012b newBuilder(FragmentVideoInfo fragmentVideoInfo) {
        return DEFAULT_INSTANCE.createBuilder(fragmentVideoInfo);
    }

    public static FragmentVideoInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentVideoInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FragmentVideoInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FragmentVideoInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FragmentVideoInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FragmentVideoInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FragmentVideoInfo parseFrom(InputStream inputStream) throws IOException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentVideoInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentVideoInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FragmentVideoInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentVideoInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
