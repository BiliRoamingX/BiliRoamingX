package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes13.dex */
public final class PlayerArgs extends GeneratedMessageLite<PlayerArgs, PlayerArgs.C5847b> implements InterfaceC5936p {
    public static final int AID_FIELD_NUMBER = 2;
    public static final int CID_FIELD_NUMBER = 3;
    private static final PlayerArgs DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 10;
    public static final int EP_ID_FIELD_NUMBER = 7;
    public static final int IS_LIVE_FIELD_NUMBER = 1;
    public static final int IS_PREVIEW_FIELD_NUMBER = 8;
    private static volatile Parser<PlayerArgs> PARSER = null;
    public static final int ROOM_ID_FIELD_NUMBER = 5;
    public static final int SEASON_ID_FIELD_NUMBER = 11;
    public static final int SUB_TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 9;
    private long aid_;
    private long cid_;
    private long duration_;
    private long epId_;
    private int isLive_;
    private int isPreview_;
    private long roomId_;
    private long seasonId_;
    private int subType_;
    private String type_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.PlayerArgs$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5846a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15972xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15972xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15972xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15972xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15972xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15972xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15972xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15972xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.PlayerArgs$b */
    /* loaded from: classes13.dex */
    public static final class C5847b extends GeneratedMessageLite.Builder<PlayerArgs, C5847b> implements InterfaceC5936p {
        /* synthetic */ C5847b(C5846a c5846a) {
            this();
        }

        public C5847b clearAid() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearAid();
            return this;
        }

        public C5847b clearCid() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearCid();
            return this;
        }

        public C5847b clearDuration() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearDuration();
            return this;
        }

        public C5847b clearEpId() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearEpId();
            return this;
        }

        public C5847b clearIsLive() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearIsLive();
            return this;
        }

        public C5847b clearIsPreview() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearIsPreview();
            return this;
        }

        public C5847b clearRoomId() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearRoomId();
            return this;
        }

        public C5847b clearSeasonId() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearSeasonId();
            return this;
        }

        public C5847b clearSubType() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearSubType();
            return this;
        }

        public C5847b clearType() {
            copyOnWrite();
            ((PlayerArgs) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public long getAid() {
            return ((PlayerArgs) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public long getCid() {
            return ((PlayerArgs) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public long getDuration() {
            return ((PlayerArgs) this.instance).getDuration();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public long getEpId() {
            return ((PlayerArgs) this.instance).getEpId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public int getIsLive() {
            return ((PlayerArgs) this.instance).getIsLive();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public int getIsPreview() {
            return ((PlayerArgs) this.instance).getIsPreview();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public long getRoomId() {
            return ((PlayerArgs) this.instance).getRoomId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public long getSeasonId() {
            return ((PlayerArgs) this.instance).getSeasonId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public int getSubType() {
            return ((PlayerArgs) this.instance).getSubType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public String getType() {
            return ((PlayerArgs) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
        public ByteString getTypeBytes() {
            return ((PlayerArgs) this.instance).getTypeBytes();
        }

        public C5847b setAid(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setAid(j);
            return this;
        }

        public C5847b setCid(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setCid(j);
            return this;
        }

        public C5847b setDuration(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setDuration(j);
            return this;
        }

        public C5847b setEpId(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setEpId(j);
            return this;
        }

        public C5847b setIsLive(int i) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setIsLive(i);
            return this;
        }

        public C5847b setIsPreview(int i) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setIsPreview(i);
            return this;
        }

        public C5847b setRoomId(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setRoomId(j);
            return this;
        }

        public C5847b setSeasonId(long j) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setSeasonId(j);
            return this;
        }

        public C5847b setSubType(int i) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setSubType(i);
            return this;
        }

        public C5847b setType(String str) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setType(str);
            return this;
        }

        public C5847b setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerArgs) this.instance).setTypeBytes(byteString);
            return this;
        }

        private C5847b() {
            super(PlayerArgs.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayerArgs playerArgs = new PlayerArgs();
        DEFAULT_INSTANCE = playerArgs;
        GeneratedMessageLite.registerDefaultInstance(PlayerArgs.class, playerArgs);
    }

    private PlayerArgs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpId() {
        this.epId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLive() {
        this.isLive_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPreview() {
        this.isPreview_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubType() {
        this.subType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static PlayerArgs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5847b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerArgs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerArgs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerArgs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j) {
        this.duration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpId(long j) {
        this.epId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLive(int i) {
        this.isLive_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreview(int i) {
        this.isPreview_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomId(long j) {
        this.roomId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubType(int i) {
        this.subType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5846a.f15972xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerArgs();
            case 2:
                return new C5847b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\u0004\u0005\u0002\u0007\u0002\b\u0004\t\u0208\n\u0002\u000b\u0002", new Object[]{"isLive_", "aid_", "cid_", "subType_", "roomId_", "epId_", "isPreview_", "type_", "duration_", "seasonId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerArgs> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerArgs.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public long getDuration() {
        return this.duration_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public long getEpId() {
        return this.epId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public int getIsLive() {
        return this.isLive_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public int getIsPreview() {
        return this.isPreview_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public long getRoomId() {
        return this.roomId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public long getSeasonId() {
        return this.seasonId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public int getSubType() {
        return this.subType_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public String getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5936p
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public static C5847b newBuilder(PlayerArgs playerArgs) {
        return DEFAULT_INSTANCE.createBuilder(playerArgs);
    }

    public static PlayerArgs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayerArgs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerArgs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(InputStream inputStream) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerArgs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerArgs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerArgs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerArgs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
