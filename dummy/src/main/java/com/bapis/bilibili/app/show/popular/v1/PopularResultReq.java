package com.bapis.bilibili.app.show.popular.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.google.protobuf.AbstractMessageLite;
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
public final class PopularResultReq extends GeneratedMessageLite<PopularResultReq, PopularResultReq.C8222b> implements MessageLiteOrBuilder {
    private static final PopularResultReq DEFAULT_INSTANCE;
    public static final int ENTRANCE_ID_FIELD_NUMBER = 11;
    public static final int FLUSH_FIELD_NUMBER = 14;
    public static final int FNVAL_FIELD_NUMBER = 5;
    public static final int FNVER_FIELD_NUMBER = 4;
    public static final int FORCE_HOST_FIELD_NUMBER = 6;
    public static final int FOURK_FIELD_NUMBER = 7;
    public static final int IDX_FIELD_NUMBER = 1;
    public static final int LAST_PARAM_FIELD_NUMBER = 9;
    public static final int LOCATION_IDS_FIELD_NUMBER = 12;
    public static final int LOGIN_EVENT_FIELD_NUMBER = 2;
    private static volatile Parser<PopularResultReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 15;
    public static final int POPULAR_AD_FIELD_NUMBER = 16;
    public static final int QN_FIELD_NUMBER = 3;
    public static final int SOURCE_ID_FIELD_NUMBER = 13;
    public static final int SPMID_FIELD_NUMBER = 8;
    public static final int VER_FIELD_NUMBER = 10;
    private long entranceId_;
    private int flush_;
    private int fnval_;
    private int fnver_;
    private int forceHost_;
    private int fourk_;
    private long idx_;
    private int loginEvent_;
    private PlayerArgs playerArgs_;
    private PopularAd popularAd_;
    private int qn_;
    private int sourceId_;
    private String spmid_ = "";
    private String lastParam_ = "";
    private String ver_ = "";
    private String locationIds_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.PopularResultReq$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8221a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16852xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16852xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16852xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16852xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16852xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16852xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16852xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16852xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.PopularResultReq$b */
    /* loaded from: classes13.dex */
    public static final class C8222b extends GeneratedMessageLite.Builder<PopularResultReq, C8222b> implements MessageLiteOrBuilder {
        /* synthetic */ C8222b(C8221a c8221a) {
            this();
        }

        public C8222b clearEntranceId() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearEntranceId();
            return this;
        }

        public C8222b clearFlush() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearFlush();
            return this;
        }

        public C8222b clearFnval() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearFnval();
            return this;
        }

        public C8222b clearFnver() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearFnver();
            return this;
        }

        public C8222b clearForceHost() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearForceHost();
            return this;
        }

        public C8222b clearFourk() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearFourk();
            return this;
        }

        public C8222b clearIdx() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearIdx();
            return this;
        }

        public C8222b clearLastParam() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearLastParam();
            return this;
        }

        public C8222b clearLocationIds() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearLocationIds();
            return this;
        }

        public C8222b clearLoginEvent() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearLoginEvent();
            return this;
        }

        public C8222b clearPlayerArgs() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearPlayerArgs();
            return this;
        }

        public C8222b clearPopularAd() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearPopularAd();
            return this;
        }

        public C8222b clearQn() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearQn();
            return this;
        }

        public C8222b clearSourceId() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearSourceId();
            return this;
        }

        public C8222b clearSpmid() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearSpmid();
            return this;
        }

        public C8222b clearVer() {
            copyOnWrite();
            ((PopularResultReq) this.instance).clearVer();
            return this;
        }

        public long getEntranceId() {
            return ((PopularResultReq) this.instance).getEntranceId();
        }

        public int getFlush() {
            return ((PopularResultReq) this.instance).getFlush();
        }

        public int getFnval() {
            return ((PopularResultReq) this.instance).getFnval();
        }

        public int getFnver() {
            return ((PopularResultReq) this.instance).getFnver();
        }

        public int getForceHost() {
            return ((PopularResultReq) this.instance).getForceHost();
        }

        public int getFourk() {
            return ((PopularResultReq) this.instance).getFourk();
        }

        public long getIdx() {
            return ((PopularResultReq) this.instance).getIdx();
        }

        public String getLastParam() {
            return ((PopularResultReq) this.instance).getLastParam();
        }

        public ByteString getLastParamBytes() {
            return ((PopularResultReq) this.instance).getLastParamBytes();
        }

        public String getLocationIds() {
            return ((PopularResultReq) this.instance).getLocationIds();
        }

        public ByteString getLocationIdsBytes() {
            return ((PopularResultReq) this.instance).getLocationIdsBytes();
        }

        public int getLoginEvent() {
            return ((PopularResultReq) this.instance).getLoginEvent();
        }

        public PlayerArgs getPlayerArgs() {
            return ((PopularResultReq) this.instance).getPlayerArgs();
        }

        public PopularAd getPopularAd() {
            return ((PopularResultReq) this.instance).getPopularAd();
        }

        public int getQn() {
            return ((PopularResultReq) this.instance).getQn();
        }

        public int getSourceId() {
            return ((PopularResultReq) this.instance).getSourceId();
        }

        public String getSpmid() {
            return ((PopularResultReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((PopularResultReq) this.instance).getSpmidBytes();
        }

        public String getVer() {
            return ((PopularResultReq) this.instance).getVer();
        }

        public ByteString getVerBytes() {
            return ((PopularResultReq) this.instance).getVerBytes();
        }

        public boolean hasPlayerArgs() {
            return ((PopularResultReq) this.instance).hasPlayerArgs();
        }

        public boolean hasPopularAd() {
            return ((PopularResultReq) this.instance).hasPopularAd();
        }

        public C8222b setEntranceId(long j) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setEntranceId(j);
            return this;
        }

        public C8222b setFlush(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setFlush(i);
            return this;
        }

        public C8222b setFnval(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setFnval(i);
            return this;
        }

        public C8222b setFnver(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setFnver(i);
            return this;
        }

        public C8222b setForceHost(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setForceHost(i);
            return this;
        }

        public C8222b setFourk(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setFourk(i);
            return this;
        }

        public C8222b setIdx(long j) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setIdx(j);
            return this;
        }

        public C8222b setLastParam(String str) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setLastParam(str);
            return this;
        }

        public C8222b setLastParamBytes(ByteString byteString) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setLastParamBytes(byteString);
            return this;
        }

        public C8222b setLocationIds(String str) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setLocationIds(str);
            return this;
        }

        public C8222b setLocationIdsBytes(ByteString byteString) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setLocationIdsBytes(byteString);
            return this;
        }

        public C8222b setLoginEvent(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setLoginEvent(i);
            return this;
        }

        public C8222b setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public C8222b setPopularAd(PopularAd popularAd) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setPopularAd(popularAd);
            return this;
        }

        public C8222b setQn(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setQn(i);
            return this;
        }

        public C8222b setSourceId(int i) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setSourceId(i);
            return this;
        }

        public C8222b setSpmid(String str) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setSpmid(str);
            return this;
        }

        public C8222b setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public C8222b setVer(String str) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setVer(str);
            return this;
        }

        public C8222b setVerBytes(ByteString byteString) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setVerBytes(byteString);
            return this;
        }

        private C8222b() {
            super(PopularResultReq.DEFAULT_INSTANCE);
        }

        public C8222b setPopularAd(PopularAd.C8218b c8218b) {
            copyOnWrite();
            ((PopularResultReq) this.instance).setPopularAd(c8218b.build());
            return this;
        }
    }

    static {
        PopularResultReq popularResultReq = new PopularResultReq();
        DEFAULT_INSTANCE = popularResultReq;
        GeneratedMessageLite.registerDefaultInstance(PopularResultReq.class, popularResultReq);
    }

    private PopularResultReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntranceId() {
        this.entranceId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlush() {
        this.flush_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnval() {
        this.fnval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFnver() {
        this.fnver_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceHost() {
        this.forceHost_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFourk() {
        this.fourk_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdx() {
        this.idx_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastParam() {
        this.lastParam_ = getDefaultInstance().getLastParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationIds() {
        this.locationIds_ = getDefaultInstance().getLocationIds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoginEvent() {
        this.loginEvent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularAd() {
        this.popularAd_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQn() {
        this.qn_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceId() {
        this.sourceId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVer() {
        this.ver_ = getDefaultInstance().getVer();
    }

    public static PopularResultReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8222b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PopularResultReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PopularResultReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularResultReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PopularResultReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntranceId(long j) {
        this.entranceId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlush(int i) {
        this.flush_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnval(int i) {
        this.fnval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFnver(int i) {
        this.fnver_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceHost(int i) {
        this.forceHost_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFourk(int i) {
        this.fourk_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdx(long j) {
        this.idx_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastParam(String str) {
        str.getClass();
        this.lastParam_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastParam_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationIds(String str) {
        str.getClass();
        this.locationIds_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationIdsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.locationIds_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoginEvent(int i) {
        this.loginEvent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularAd(PopularAd popularAd) {
        popularAd.getClass();
        this.popularAd_ = popularAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQn(int i) {
        this.qn_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceId(int i) {
        this.sourceId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVer(String str) {
        str.getClass();
        this.ver_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ver_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8221a.f16852xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PopularResultReq();
            case 2:
                return new C8222b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0208\t\u0208\n\u0208\u000b\u0002\f\u0208\r\u0004\u000e\u0004\u000f\t\u0010\t", new Object[]{"idx_", "loginEvent_", "qn_", "fnver_", "fnval_", "forceHost_", "fourk_", "spmid_", "lastParam_", "ver_", "entranceId_", "locationIds_", "sourceId_", "flush_", "playerArgs_", "popularAd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PopularResultReq> parser = PARSER;
                if (parser == null) {
                    synchronized (PopularResultReq.class) {
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

    public long getEntranceId() {
        return this.entranceId_;
    }

    public int getFlush() {
        return this.flush_;
    }

    public int getFnval() {
        return this.fnval_;
    }

    public int getFnver() {
        return this.fnver_;
    }

    public int getForceHost() {
        return this.forceHost_;
    }

    public int getFourk() {
        return this.fourk_;
    }

    public long getIdx() {
        return this.idx_;
    }

    public String getLastParam() {
        return this.lastParam_;
    }

    public ByteString getLastParamBytes() {
        return ByteString.copyFromUtf8(this.lastParam_);
    }

    public String getLocationIds() {
        return this.locationIds_;
    }

    public ByteString getLocationIdsBytes() {
        return ByteString.copyFromUtf8(this.locationIds_);
    }

    public int getLoginEvent() {
        return this.loginEvent_;
    }

    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? PlayerArgs.getDefaultInstance() : playerArgs;
    }

    public PopularAd getPopularAd() {
        PopularAd popularAd = this.popularAd_;
        return popularAd == null ? PopularAd.getDefaultInstance() : popularAd;
    }

    public int getQn() {
        return this.qn_;
    }

    public int getSourceId() {
        return this.sourceId_;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public String getVer() {
        return this.ver_;
    }

    public ByteString getVerBytes() {
        return ByteString.copyFromUtf8(this.ver_);
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public boolean hasPopularAd() {
        return this.popularAd_ != null;
    }

    public static C8222b newBuilder(PopularResultReq popularResultReq) {
        return DEFAULT_INSTANCE.createBuilder(popularResultReq);
    }

    public static PopularResultReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularResultReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularResultReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PopularResultReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PopularResultReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PopularResultReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PopularResultReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PopularResultReq parseFrom(InputStream inputStream) throws IOException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PopularResultReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PopularResultReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PopularResultReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PopularResultReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
