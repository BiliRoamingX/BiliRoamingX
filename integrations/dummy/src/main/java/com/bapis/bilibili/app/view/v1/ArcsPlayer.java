package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ArcsPlayer extends GeneratedMessageLite<ArcsPlayer, ArcsPlayer.Builder> implements ArcsPlayerOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    private static final ArcsPlayer DEFAULT_INSTANCE;
    private static volatile Parser<ArcsPlayer> PARSER = null;
    public static final int PLAYER_INFO_FIELD_NUMBER = 2;
    private long aid_;
    private MapFieldLite<Long, String> playerInfo_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ArcsPlayer$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16686xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16686xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16686xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16686xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16686xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16686xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16686xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16686xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ArcsPlayer, Builder> implements ArcsPlayerOrBuilder {
        /* synthetic */ Builder(C67101 c67101) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((ArcsPlayer) this.instance).clearAid();
            return this;
        }

        public Builder clearPlayerInfo() {
            copyOnWrite();
            ((ArcsPlayer) this.instance).getMutablePlayerInfoMap().clear();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
        public boolean containsPlayerInfo(long j) {
            return ((ArcsPlayer) this.instance).getPlayerInfoMap().containsKey(Long.valueOf(j));
        }

        @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
        public long getAid() {
            return ((ArcsPlayer) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
        @Deprecated
        public Map<Long, String> getPlayerInfo() {
            return getPlayerInfoMap();
        }

        @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
        public int getPlayerInfoCount() {
            return ((ArcsPlayer) this.instance).getPlayerInfoMap().size();
        }

        @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
        public Map<Long, String> getPlayerInfoMap() {
            return Collections.unmodifiableMap(((ArcsPlayer) this.instance).getPlayerInfoMap());
        }

        @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
        public String getPlayerInfoOrDefault(long j, String str) {
            Map<Long, String> playerInfoMap = ((ArcsPlayer) this.instance).getPlayerInfoMap();
            return playerInfoMap.containsKey(Long.valueOf(j)) ? playerInfoMap.get(Long.valueOf(j)) : str;
        }

        @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
        public String getPlayerInfoOrThrow(long j) {
            Map<Long, String> playerInfoMap = ((ArcsPlayer) this.instance).getPlayerInfoMap();
            if (playerInfoMap.containsKey(Long.valueOf(j))) {
                return playerInfoMap.get(Long.valueOf(j));
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllPlayerInfo(Map<Long, String> map) {
            copyOnWrite();
            ((ArcsPlayer) this.instance).getMutablePlayerInfoMap().putAll(map);
            return this;
        }

        public Builder putPlayerInfo(long j, String str) {
            str.getClass();
            copyOnWrite();
            ((ArcsPlayer) this.instance).getMutablePlayerInfoMap().put(Long.valueOf(j), str);
            return this;
        }

        public Builder removePlayerInfo(long j) {
            copyOnWrite();
            ((ArcsPlayer) this.instance).getMutablePlayerInfoMap().remove(Long.valueOf(j));
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((ArcsPlayer) this.instance).setAid(j);
            return this;
        }

        private Builder() {
            super(ArcsPlayer.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class PlayerInfoDefaultEntryHolder {
        static final MapEntryLite<Long, String> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT64, 0L, WireFormat.FieldType.STRING, "");

        private PlayerInfoDefaultEntryHolder() {
        }
    }

    static {
        ArcsPlayer arcsPlayer = new ArcsPlayer();
        DEFAULT_INSTANCE = arcsPlayer;
        GeneratedMessageLite.registerDefaultInstance(ArcsPlayer.class, arcsPlayer);
    }

    private ArcsPlayer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    public static ArcsPlayer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, String> getMutablePlayerInfoMap() {
        return internalGetMutablePlayerInfo();
    }

    private MapFieldLite<Long, String> internalGetMutablePlayerInfo() {
        if (!this.playerInfo_.isMutable()) {
            this.playerInfo_ = this.playerInfo_.mutableCopy();
        }
        return this.playerInfo_;
    }

    private MapFieldLite<Long, String> internalGetPlayerInfo() {
        return this.playerInfo_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArcsPlayer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArcsPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcsPlayer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArcsPlayer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
    public boolean containsPlayerInfo(long j) {
        return internalGetPlayerInfo().containsKey(Long.valueOf(j));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67101.f16686xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArcsPlayer();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u00022", new Object[]{"aid_", "playerInfo_", PlayerInfoDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArcsPlayer> parser = PARSER;
                if (parser == null) {
                    synchronized (ArcsPlayer.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
    @Deprecated
    public Map<Long, String> getPlayerInfo() {
        return getPlayerInfoMap();
    }

    @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
    public int getPlayerInfoCount() {
        return internalGetPlayerInfo().size();
    }

    @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
    public Map<Long, String> getPlayerInfoMap() {
        return Collections.unmodifiableMap(internalGetPlayerInfo());
    }

    @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
    public String getPlayerInfoOrDefault(long j, String str) {
        MapFieldLite<Long, String> internalGetPlayerInfo = internalGetPlayerInfo();
        return internalGetPlayerInfo.containsKey(Long.valueOf(j)) ? internalGetPlayerInfo.get(Long.valueOf(j)) : str;
    }

    @Override // com.bapis.bilibili.app.view.v1.ArcsPlayerOrBuilder
    public String getPlayerInfoOrThrow(long j) {
        MapFieldLite<Long, String> internalGetPlayerInfo = internalGetPlayerInfo();
        if (internalGetPlayerInfo.containsKey(Long.valueOf(j))) {
            return internalGetPlayerInfo.get(Long.valueOf(j));
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(ArcsPlayer arcsPlayer) {
        return DEFAULT_INSTANCE.createBuilder(arcsPlayer);
    }

    public static ArcsPlayer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcsPlayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcsPlayer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArcsPlayer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArcsPlayer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArcsPlayer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArcsPlayer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArcsPlayer parseFrom(InputStream inputStream) throws IOException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcsPlayer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcsPlayer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArcsPlayer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcsPlayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
