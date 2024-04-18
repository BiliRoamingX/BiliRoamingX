package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class ViewReq extends GeneratedMessageLite<ViewReq, ViewReq.Builder> implements MessageLiteOrBuilder {
    public static final int AD_EXTRA_FIELD_NUMBER = 13;
    public static final int AID_FIELD_NUMBER = 1;
    public static final int BIZ_EXTRA_FIELD_NUMBER = 12;
    public static final int BVID_FIELD_NUMBER = 2;
    private static final ViewReq DEFAULT_INSTANCE;
    public static final int EXTRA_CONTENT_FIELD_NUMBER = 9;
    public static final int FROM_FIELD_NUMBER = 3;
    public static final int FROM_SPMID_FIELD_NUMBER = 5;
    private static volatile Parser<ViewReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 7;
    public static final int PLAY_MODE_FIELD_NUMBER = 10;
    public static final int RELATE_FIELD_NUMBER = 11;
    public static final int SESSION_ID_FIELD_NUMBER = 6;
    public static final int SPMID_FIELD_NUMBER = 4;
    public static final int TRACK_ID_FIELD_NUMBER = 8;
    private long aid_;
    private PlayerArgs playerArgs_;
    private Relate relate_;
    private MapFieldLite<String, String> extraContent_ = MapFieldLite.emptyMapField();
    private String bvid_ = "";
    private String from_ = "";
    private String spmid_ = "";
    private String fromSpmid_ = "";
    private String sessionId_ = "";
    private String trackId_ = "";
    private String playMode_ = "";
    private String bizExtra_ = "";
    private String adExtra_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ViewReq$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17142xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17142xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17142xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17142xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17142xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17142xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17142xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17142xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71791 c71791) {
            this();
        }

        public Builder clearAdExtra() {
            copyOnWrite();
            ((ViewReq) this.instance).clearAdExtra();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearAid();
            return this;
        }

        public Builder clearBizExtra() {
            copyOnWrite();
            ((ViewReq) this.instance).clearBizExtra();
            return this;
        }

        public Builder clearBvid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearBvid();
            return this;
        }

        public Builder clearExtraContent() {
            copyOnWrite();
            ((ViewReq) this.instance).getMutableExtraContentMap().clear();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((ViewReq) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSpmid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearFromSpmid();
            return this;
        }

        public Builder clearPlayMode() {
            copyOnWrite();
            ((ViewReq) this.instance).clearPlayMode();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((ViewReq) this.instance).clearPlayerArgs();
            return this;
        }

        public Builder clearRelate() {
            copyOnWrite();
            ((ViewReq) this.instance).clearRelate();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((ViewReq) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((ViewReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearTrackId() {
            copyOnWrite();
            ((ViewReq) this.instance).clearTrackId();
            return this;
        }

        public boolean containsExtraContent(String str) {
            str.getClass();
            return ((ViewReq) this.instance).getExtraContentMap().containsKey(str);
        }

        public String getAdExtra() {
            return ((ViewReq) this.instance).getAdExtra();
        }

        public ByteString getAdExtraBytes() {
            return ((ViewReq) this.instance).getAdExtraBytes();
        }

        public long getAid() {
            return ((ViewReq) this.instance).getAid();
        }

        public String getBizExtra() {
            return ((ViewReq) this.instance).getBizExtra();
        }

        public ByteString getBizExtraBytes() {
            return ((ViewReq) this.instance).getBizExtraBytes();
        }

        public String getBvid() {
            return ((ViewReq) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((ViewReq) this.instance).getBvidBytes();
        }

        @Deprecated
        public Map<String, String> getExtraContent() {
            return getExtraContentMap();
        }

        public int getExtraContentCount() {
            return ((ViewReq) this.instance).getExtraContentMap().size();
        }

        public Map<String, String> getExtraContentMap() {
            return Collections.unmodifiableMap(((ViewReq) this.instance).getExtraContentMap());
        }

        public String getExtraContentOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> extraContentMap = ((ViewReq) this.instance).getExtraContentMap();
            return extraContentMap.containsKey(str) ? extraContentMap.get(str) : str2;
        }

        public String getExtraContentOrThrow(String str) {
            str.getClass();
            Map<String, String> extraContentMap = ((ViewReq) this.instance).getExtraContentMap();
            if (extraContentMap.containsKey(str)) {
                return extraContentMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getFrom() {
            return ((ViewReq) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((ViewReq) this.instance).getFromBytes();
        }

        public String getFromSpmid() {
            return ((ViewReq) this.instance).getFromSpmid();
        }

        public ByteString getFromSpmidBytes() {
            return ((ViewReq) this.instance).getFromSpmidBytes();
        }

        public String getPlayMode() {
            return ((ViewReq) this.instance).getPlayMode();
        }

        public ByteString getPlayModeBytes() {
            return ((ViewReq) this.instance).getPlayModeBytes();
        }

        public PlayerArgs getPlayerArgs() {
            return ((ViewReq) this.instance).getPlayerArgs();
        }

        public Relate getRelate() {
            return ((ViewReq) this.instance).getRelate();
        }

        public String getSessionId() {
            return ((ViewReq) this.instance).getSessionId();
        }

        public ByteString getSessionIdBytes() {
            return ((ViewReq) this.instance).getSessionIdBytes();
        }

        public String getSpmid() {
            return ((ViewReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((ViewReq) this.instance).getSpmidBytes();
        }

        public String getTrackId() {
            return ((ViewReq) this.instance).getTrackId();
        }

        public ByteString getTrackIdBytes() {
            return ((ViewReq) this.instance).getTrackIdBytes();
        }

        public boolean hasPlayerArgs() {
            return ((ViewReq) this.instance).hasPlayerArgs();
        }

        public boolean hasRelate() {
            return ((ViewReq) this.instance).hasRelate();
        }

        public Builder mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((ViewReq) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder mergeRelate(Relate relate) {
            copyOnWrite();
            ((ViewReq) this.instance).mergeRelate(relate);
            return this;
        }

        public Builder putAllExtraContent(Map<String, String> map) {
            copyOnWrite();
            ((ViewReq) this.instance).getMutableExtraContentMap().putAll(map);
            return this;
        }

        public Builder putExtraContent(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((ViewReq) this.instance).getMutableExtraContentMap().put(str, str2);
            return this;
        }

        public Builder removeExtraContent(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewReq) this.instance).getMutableExtraContentMap().remove(str);
            return this;
        }

        public Builder setAdExtra(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setAdExtra(str);
            return this;
        }

        public Builder setAdExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setAdExtraBytes(byteString);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ViewReq) this.instance).setAid(j);
            return this;
        }

        public Builder setBizExtra(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setBizExtra(str);
            return this;
        }

        public Builder setBizExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setBizExtraBytes(byteString);
            return this;
        }

        public Builder setBvid(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setBvid(str);
            return this;
        }

        public Builder setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setBvidBytes(byteString);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSpmid(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setFromSpmid(str);
            return this;
        }

        public Builder setFromSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setFromSpmidBytes(byteString);
            return this;
        }

        public Builder setPlayMode(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayMode(str);
            return this;
        }

        public Builder setPlayModeBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayModeBytes(byteString);
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        public Builder setRelate(Relate relate) {
            copyOnWrite();
            ((ViewReq) this.instance).setRelate(relate);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setTrackId(String str) {
            copyOnWrite();
            ((ViewReq) this.instance).setTrackId(str);
            return this;
        }

        public Builder setTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewReq) this.instance).setTrackIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(ViewReq.DEFAULT_INSTANCE);
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((ViewReq) this.instance).setPlayerArgs(builder.build());
            return this;
        }

        public Builder setRelate(Relate.Builder builder) {
            copyOnWrite();
            ((ViewReq) this.instance).setRelate(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class ExtraContentDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private ExtraContentDefaultEntryHolder() {
        }
    }

    static {
        ViewReq viewReq = new ViewReq();
        DEFAULT_INSTANCE = viewReq;
        GeneratedMessageLite.registerDefaultInstance(ViewReq.class, viewReq);
    }

    private ViewReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdExtra() {
        this.adExtra_ = getDefaultInstance().getAdExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizExtra() {
        this.bizExtra_ = getDefaultInstance().getBizExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSpmid() {
        this.fromSpmid_ = getDefaultInstance().getFromSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayMode() {
        this.playMode_ = getDefaultInstance().getPlayMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelate() {
        this.relate_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    public static ViewReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableExtraContentMap() {
        return internalGetMutableExtraContent();
    }

    private MapFieldLite<String, String> internalGetExtraContent() {
        return this.extraContent_;
    }

    private MapFieldLite<String, String> internalGetMutableExtraContent() {
        if (!this.extraContent_.isMutable()) {
            this.extraContent_ = this.extraContent_.mutableCopy();
        }
        return this.extraContent_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        PlayerArgs playerArgs2 = this.playerArgs_;
        if (playerArgs2 != null && playerArgs2 != PlayerArgs.getDefaultInstance()) {
            this.playerArgs_ = PlayerArgs.newBuilder(this.playerArgs_).mergeFrom((PlayerArgs) playerArgs).buildPartial();
        } else {
            this.playerArgs_ = playerArgs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRelate(Relate relate) {
        relate.getClass();
        Relate relate2 = this.relate_;
        if (relate2 != null && relate2 != Relate.getDefaultInstance()) {
            this.relate_ = Relate.newBuilder(this.relate_).mergeFrom((Relate) relate).buildPartial();
        } else {
            this.relate_ = relate;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtra(String str) {
        str.getClass();
        this.adExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizExtra(String str) {
        str.getClass();
        this.bizExtra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizExtra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
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
    public void setPlayMode(String str) {
        str.getClass();
        this.playMode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayModeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playMode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelate(Relate relate) {
        relate.getClass();
        this.relate_ = relate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
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
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackId_ = byteString.toStringUtf8();
    }

    public boolean containsExtraContent(String str) {
        str.getClass();
        return internalGetExtraContent().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71791.f17142xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0001\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\t\b\u0208\t2\n\u0208\u000b\t\f\u0208\r\u0208", new Object[]{"aid_", "bvid_", "from_", "spmid_", "fromSpmid_", "sessionId_", "playerArgs_", "trackId_", "extraContent_", ExtraContentDefaultEntryHolder.defaultEntry, "playMode_", "relate_", "bizExtra_", "adExtra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewReq> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewReq.class) {
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

    public String getAdExtra() {
        return this.adExtra_;
    }

    public ByteString getAdExtraBytes() {
        return ByteString.copyFromUtf8(this.adExtra_);
    }

    public long getAid() {
        return this.aid_;
    }

    public String getBizExtra() {
        return this.bizExtra_;
    }

    public ByteString getBizExtraBytes() {
        return ByteString.copyFromUtf8(this.bizExtra_);
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    @Deprecated
    public Map<String, String> getExtraContent() {
        return getExtraContentMap();
    }

    public int getExtraContentCount() {
        return internalGetExtraContent().size();
    }

    public Map<String, String> getExtraContentMap() {
        return Collections.unmodifiableMap(internalGetExtraContent());
    }

    public String getExtraContentOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetExtraContent = internalGetExtraContent();
        return internalGetExtraContent.containsKey(str) ? internalGetExtraContent.get(str) : str2;
    }

    public String getExtraContentOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetExtraContent = internalGetExtraContent();
        if (internalGetExtraContent.containsKey(str)) {
            return internalGetExtraContent.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public String getFromSpmid() {
        return this.fromSpmid_;
    }

    public ByteString getFromSpmidBytes() {
        return ByteString.copyFromUtf8(this.fromSpmid_);
    }

    public String getPlayMode() {
        return this.playMode_;
    }

    public ByteString getPlayModeBytes() {
        return ByteString.copyFromUtf8(this.playMode_);
    }

    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? PlayerArgs.getDefaultInstance() : playerArgs;
    }

    public Relate getRelate() {
        Relate relate = this.relate_;
        return relate == null ? Relate.getDefaultInstance() : relate;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public ByteString getTrackIdBytes() {
        return ByteString.copyFromUtf8(this.trackId_);
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public boolean hasRelate() {
        return this.relate_ != null;
    }

    public static Builder newBuilder(ViewReq viewReq) {
        return DEFAULT_INSTANCE.createBuilder(viewReq);
    }

    public static ViewReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewReq parseFrom(InputStream inputStream) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
