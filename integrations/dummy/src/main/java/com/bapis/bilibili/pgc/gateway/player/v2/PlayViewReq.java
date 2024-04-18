package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class PlayViewReq extends GeneratedMessageLite<PlayViewReq, PlayViewReq.Builder> implements MessageLiteOrBuilder {
    public static final int CID_FIELD_NUMBER = 2;
    public static final int DATA_CONTROL_FIELD_NUMBER = 21;
    private static final PlayViewReq DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 6;
    public static final int EP_ID_FIELD_NUMBER = 1;
    public static final int FNVAL_FIELD_NUMBER = 5;
    public static final int FNVER_FIELD_NUMBER = 4;
    public static final int FORCE_HOST_FIELD_NUMBER = 7;
    public static final int FOURK_FIELD_NUMBER = 8;
    public static final int FROM_SPMID_FIELD_NUMBER = 10;
    public static final int INLINE_SCENE_FIELD_NUMBER = 17;
    public static final int IS_NEED_VIEW_INFO_FIELD_NUMBER = 15;
    public static final int IS_PREVIEW_FIELD_NUMBER = 13;
    public static final int MATERIAL_NO_FIELD_NUMBER = 18;
    private static volatile Parser<PlayViewReq> PARSER = null;
    public static final int PREFER_CODEC_TYPE_FIELD_NUMBER = 12;
    public static final int QN_FIELD_NUMBER = 3;
    public static final int ROOM_ID_FIELD_NUMBER = 14;
    public static final int SCENE_CONTROL_FIELD_NUMBER = 16;
    public static final int SEASON_ID_FIELD_NUMBER = 20;
    public static final int SECURITY_LEVEL_FIELD_NUMBER = 19;
    public static final int SPMID_FIELD_NUMBER = 9;
    public static final int TEENAGERS_MODE_FIELD_NUMBER = 11;
    private long cid_;
    private DataControl dataControl_;
    private int download_;
    private long epId_;
    private int fnval_;
    private int fnver_;
    private int forceHost_;
    private boolean fourk_;
    private int inlineScene_;
    private boolean isNeedViewInfo_;
    private boolean isPreview_;
    private long materialNo_;
    private int preferCodecType_;
    private long qn_;
    private long roomId_;
    private SceneControl sceneControl_;
    private long seasonId_;
    private int securityLevel_;
    private int teenagersMode_;
    private String spmid_ = "";
    private String fromSpmid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReq$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17584xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17584xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17584xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17584xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17584xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17584xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17584xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17584xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayViewReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78691 c78691) {
            this();
        }

        public Builder clearCid() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearCid();
            return this;
        }

        public Builder clearDataControl() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearDataControl();
            return this;
        }

        public Builder clearDownload() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearDownload();
            return this;
        }

        public Builder clearEpId() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearEpId();
            return this;
        }

        public Builder clearFnval() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearFnval();
            return this;
        }

        public Builder clearFnver() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearFnver();
            return this;
        }

        public Builder clearForceHost() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearForceHost();
            return this;
        }

        public Builder clearFourk() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearFourk();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearInlineScene() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearInlineScene();
            return this;
        }

        public Builder clearIsNeedViewInfo() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearIsNeedViewInfo();
            return this;
        }

        public Builder clearIsPreview() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearIsPreview();
            return this;
        }

        public Builder clearMaterialNo() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearMaterialNo();
            return this;
        }

        public Builder clearPreferCodecType() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearPreferCodecType();
            return this;
        }

        public Builder clearQn() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearQn();
            return this;
        }

        public Builder clearRoomId() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearRoomId();
            return this;
        }

        public Builder clearSceneControl() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearSceneControl();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSecurityLevel() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearSecurityLevel();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearTeenagersMode() {
            copyOnWrite();
            ((PlayViewReq) this.instance).clearTeenagersMode();
            return this;
        }

        public long getCid() {
            return ((PlayViewReq) this.instance).getCid();
        }

        public DataControl getDataControl() {
            return ((PlayViewReq) this.instance).getDataControl();
        }

        public int getDownload() {
            return ((PlayViewReq) this.instance).getDownload();
        }

        public long getEpId() {
            return ((PlayViewReq) this.instance).getEpId();
        }

        public int getFnval() {
            return ((PlayViewReq) this.instance).getFnval();
        }

        public int getFnver() {
            return ((PlayViewReq) this.instance).getFnver();
        }

        public int getForceHost() {
            return ((PlayViewReq) this.instance).getForceHost();
        }

        public boolean getFourk() {
            return ((PlayViewReq) this.instance).getFourk();
        }

        public String getFromSpmid() {
            return ((PlayViewReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((PlayViewReq) this.instance).getFromSpmidBytes();
        }

        public InlineScene getInlineScene() {
            return ((PlayViewReq) this.instance).getInlineScene();
        }

        public int getInlineSceneValue() {
            return ((PlayViewReq) this.instance).getInlineSceneValue();
        }

        public boolean getIsNeedViewInfo() {
            return ((PlayViewReq) this.instance).getIsNeedViewInfo();
        }

        public boolean getIsPreview() {
            return ((PlayViewReq) this.instance).getIsPreview();
        }

        public long getMaterialNo() {
            return ((PlayViewReq) this.instance).getMaterialNo();
        }

        public CodeType getPreferCodecType() {
            return ((PlayViewReq) this.instance).getPreferCodecType();
        }

        public int getPreferCodecTypeValue() {
            return ((PlayViewReq) this.instance).getPreferCodecTypeValue();
        }

        public long getQn() {
            return ((PlayViewReq) this.instance).getQn();
        }

        public long getRoomId() {
            return ((PlayViewReq) this.instance).getRoomId();
        }

        public SceneControl getSceneControl() {
            return ((PlayViewReq) this.instance).getSceneControl();
        }

        public long getSeasonId() {
            return ((PlayViewReq) this.instance).getSeasonId();
        }

        public SecurityLevel getSecurityLevel() {
            return ((PlayViewReq) this.instance).getSecurityLevel();
        }

        public int getSecurityLevelValue() {
            return ((PlayViewReq) this.instance).getSecurityLevelValue();
        }

        public String getSpmid() {
            return ((PlayViewReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((PlayViewReq) this.instance).getSpmidBytes();
        }

        public int getTeenagersMode() {
            return ((PlayViewReq) this.instance).getTeenagersMode();
        }

        public boolean hasDataControl() {
            return ((PlayViewReq) this.instance).hasDataControl();
        }

        public boolean hasSceneControl() {
            return ((PlayViewReq) this.instance).hasSceneControl();
        }

        public Builder mergeDataControl(DataControl dataControl) {
            copyOnWrite();
            ((PlayViewReq) this.instance).mergeDataControl(dataControl);
            return this;
        }

        public Builder mergeSceneControl(SceneControl sceneControl) {
            copyOnWrite();
            ((PlayViewReq) this.instance).mergeSceneControl(sceneControl);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setCid(j);
            return this;
        }

        public Builder setDataControl(DataControl dataControl) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setDataControl(dataControl);
            return this;
        }

        public Builder setDownload(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setDownload(i);
            return this;
        }

        public Builder setEpId(long j) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setEpId(j);
            return this;
        }

        public Builder setFnval(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setFnval(i);
            return this;
        }

        public Builder setFnver(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setFnver(i);
            return this;
        }

        public Builder setForceHost(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setForceHost(i);
            return this;
        }

        public Builder setFourk(boolean z) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setFourk(z);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setInlineScene(InlineScene inlineScene) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setInlineScene(inlineScene);
            return this;
        }

        public Builder setInlineSceneValue(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setInlineSceneValue(i);
            return this;
        }

        public Builder setIsNeedViewInfo(boolean z) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setIsNeedViewInfo(z);
            return this;
        }

        public Builder setIsPreview(boolean z) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setIsPreview(z);
            return this;
        }

        public Builder setMaterialNo(long j) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setMaterialNo(j);
            return this;
        }

        public Builder setPreferCodecType(CodeType codeType) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setPreferCodecType(codeType);
            return this;
        }

        public Builder setPreferCodecTypeValue(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setPreferCodecTypeValue(i);
            return this;
        }

        public Builder setQn(long j) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setQn(j);
            return this;
        }

        public Builder setRoomId(long j) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setRoomId(j);
            return this;
        }

        public Builder setSceneControl(SceneControl sceneControl) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setSceneControl(sceneControl);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setSecurityLevel(SecurityLevel securityLevel) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setSecurityLevel(securityLevel);
            return this;
        }

        public Builder setSecurityLevelValue(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setSecurityLevelValue(i);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setTeenagersMode(int i) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setTeenagersMode(i);
            return this;
        }

        private Builder() {
            super(PlayViewReq.DEFAULT_INSTANCE);
        }

        public Builder setDataControl(DataControl.Builder builder) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setDataControl(builder.build());
            return this;
        }

        public Builder setSceneControl(SceneControl.Builder builder) {
            copyOnWrite();
            ((PlayViewReq) this.instance).setSceneControl(builder.build());
            return this;
        }
    }

    static {
        PlayViewReq playViewReq = new PlayViewReq();
        DEFAULT_INSTANCE = playViewReq;
        GeneratedMessageLite.registerDefaultInstance(PlayViewReq.class, playViewReq);
    }

    private PlayViewReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataControl() {
        this.dataControl_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownload() {
        this.download_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpId() {
        this.epId_ = 0L;
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
        this.fourk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmid() {
        this.fromSpmid_ = getDefaultInstance().getFromSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInlineScene() {
        this.inlineScene_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNeedViewInfo() {
        this.isNeedViewInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPreview() {
        this.isPreview_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaterialNo() {
        this.materialNo_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferCodecType() {
        this.preferCodecType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQn() {
        this.qn_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSceneControl() {
        this.sceneControl_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecurityLevel() {
        this.securityLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTeenagersMode() {
        this.teenagersMode_ = 0;
    }

    public static PlayViewReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDataControl(DataControl dataControl) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSceneControl(SceneControl sceneControl) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayViewReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayViewReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataControl(DataControl dataControl) {
        dataControl.getClass();
        this.dataControl_ = dataControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownload(int i) {
        this.download_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpId(long j) {
        this.epId_ = j;
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
    public void setFourk(boolean z) {
        this.fourk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmid(String str) {
        str.getClass();
        this.fromSpmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSpmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInlineScene(InlineScene inlineScene) {
        this.inlineScene_ = inlineScene.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInlineSceneValue(int i) {
        this.inlineScene_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNeedViewInfo(boolean z) {
        this.isNeedViewInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreview(boolean z) {
        this.isPreview_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaterialNo(long j) {
        this.materialNo_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferCodecType(CodeType codeType) {
        this.preferCodecType_ = codeType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferCodecTypeValue(int i) {
        this.preferCodecType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQn(long j) {
        this.qn_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomId(long j) {
        this.roomId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSceneControl(SceneControl sceneControl) {
        sceneControl.getClass();
        this.sceneControl_ = sceneControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityLevel(SecurityLevel securityLevel) {
        this.securityLevel_ = securityLevel.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecurityLevelValue(int i) {
        this.securityLevel_ = i;
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
    public void setTeenagersMode(int i) {
        this.teenagersMode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78691.f17584xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayViewReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u000b\u0007\u0004\b\u0007\t\u0208\n\u0208\u000b\u0004\f\f\r\u0007\u000e\u0002\u000f\u0007\u0010\t\u0011\f\u0012\u0002\u0013\f\u0014\u0002\u0015\t", new Object[]{"epId_", "cid_", "qn_", "fnver_", "fnval_", "download_", "forceHost_", "fourk_", "spmid_", "fromSpmid_", "teenagersMode_", "preferCodecType_", "isPreview_", "roomId_", "isNeedViewInfo_", "sceneControl_", "inlineScene_", "materialNo_", "securityLevel_", "seasonId_", "dataControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayViewReq> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayViewReq.class) {
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

    public long getCid() {
        return this.cid_;
    }

    public DataControl getDataControl() {
        DataControl dataControl = this.dataControl_;
        return dataControl == null ? DataControl.getDefaultInstance() : dataControl;
    }

    public int getDownload() {
        return this.download_;
    }

    public long getEpId() {
        return this.epId_;
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

    public boolean getFourk() {
        return this.fourk_;
    }

    public String getFromSpmid() {
        return this.fromSpmid_;
    }

    public ByteString getFromSpmidBytes() {
        return ByteString.copyFromUtf8(this.fromSpmid_);
    }

    public InlineScene getInlineScene() {
        InlineScene forNumber = InlineScene.forNumber(this.inlineScene_);
        return forNumber == null ? InlineScene.UNRECOGNIZED : forNumber;
    }

    public int getInlineSceneValue() {
        return this.inlineScene_;
    }

    public boolean getIsNeedViewInfo() {
        return this.isNeedViewInfo_;
    }

    public boolean getIsPreview() {
        return this.isPreview_;
    }

    public long getMaterialNo() {
        return this.materialNo_;
    }

    public CodeType getPreferCodecType() {
        CodeType forNumber = CodeType.forNumber(this.preferCodecType_);
        return forNumber == null ? CodeType.UNRECOGNIZED : forNumber;
    }

    public int getPreferCodecTypeValue() {
        return this.preferCodecType_;
    }

    public long getQn() {
        return this.qn_;
    }

    public long getRoomId() {
        return this.roomId_;
    }

    public SceneControl getSceneControl() {
        SceneControl sceneControl = this.sceneControl_;
        return sceneControl == null ? SceneControl.getDefaultInstance() : sceneControl;
    }

    public long getSeasonId() {
        return this.seasonId_;
    }

    public SecurityLevel getSecurityLevel() {
        SecurityLevel forNumber = SecurityLevel.forNumber(this.securityLevel_);
        return forNumber == null ? SecurityLevel.UNRECOGNIZED : forNumber;
    }

    public int getSecurityLevelValue() {
        return this.securityLevel_;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public int getTeenagersMode() {
        return this.teenagersMode_;
    }

    public boolean hasDataControl() {
        return this.dataControl_ != null;
    }

    public boolean hasSceneControl() {
        return this.sceneControl_ != null;
    }

    public static Builder newBuilder(PlayViewReq playViewReq) {
        return DEFAULT_INSTANCE.createBuilder(playViewReq);
    }

    public static PlayViewReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayViewReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayViewReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayViewReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayViewReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayViewReq parseFrom(InputStream inputStream) throws IOException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayViewReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayViewReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayViewReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setQn(long)
     */
    static void access$500(PlayViewReq playViewReq, long qn) {
    }

    /**
     * setFnval(int)
     */
    static void access$900(PlayViewReq playViewReq, int fnval) {
    }

    /**
     * setDownload(int)
     */
    static void access$1100(PlayViewReq playViewReq, int download) {
    }

    /**
     * setFourk(boolean)
     */
    static void access$1500(PlayViewReq playViewReq, boolean fourk) {
    }
}
