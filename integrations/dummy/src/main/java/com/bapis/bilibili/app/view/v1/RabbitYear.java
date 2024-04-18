package com.bapis.bilibili.app.view.v1;

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
public final class RabbitYear extends GeneratedMessageLite<RabbitYear, RabbitYear.Builder> implements MessageLiteOrBuilder {
    private static final RabbitYear DEFAULT_INSTANCE;
    public static final int DM_SUMMON_FIELD_NUMBER = 2;
    public static final int HALF_SCREEN_FIELD_NUMBER = 3;
    private static volatile Parser<RabbitYear> PARSER = null;
    public static final int PLAYER_AUTOMATE_FIELD_NUMBER = 1;
    public static final int SPECIAL_DM_FIELD_NUMBER = 4;
    private DmSummon dmSummon_;
    private HalfScreen halfScreen_;
    private PlayerAutomate playerAutomate_;
    private SpecialDm specialDm_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RabbitYear$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68311 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16792xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16792xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16792xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16792xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16792xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16792xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16792xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16792xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RabbitYear, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68311 c68311) {
            this();
        }

        public Builder clearDmSummon() {
            copyOnWrite();
            ((RabbitYear) this.instance).clearDmSummon();
            return this;
        }

        public Builder clearHalfScreen() {
            copyOnWrite();
            ((RabbitYear) this.instance).clearHalfScreen();
            return this;
        }

        public Builder clearPlayerAutomate() {
            copyOnWrite();
            ((RabbitYear) this.instance).clearPlayerAutomate();
            return this;
        }

        public Builder clearSpecialDm() {
            copyOnWrite();
            ((RabbitYear) this.instance).clearSpecialDm();
            return this;
        }

        public DmSummon getDmSummon() {
            return ((RabbitYear) this.instance).getDmSummon();
        }

        public HalfScreen getHalfScreen() {
            return ((RabbitYear) this.instance).getHalfScreen();
        }

        public PlayerAutomate getPlayerAutomate() {
            return ((RabbitYear) this.instance).getPlayerAutomate();
        }

        public SpecialDm getSpecialDm() {
            return ((RabbitYear) this.instance).getSpecialDm();
        }

        public boolean hasDmSummon() {
            return ((RabbitYear) this.instance).hasDmSummon();
        }

        public boolean hasHalfScreen() {
            return ((RabbitYear) this.instance).hasHalfScreen();
        }

        public boolean hasPlayerAutomate() {
            return ((RabbitYear) this.instance).hasPlayerAutomate();
        }

        public boolean hasSpecialDm() {
            return ((RabbitYear) this.instance).hasSpecialDm();
        }

        public Builder mergeDmSummon(DmSummon dmSummon) {
            copyOnWrite();
            ((RabbitYear) this.instance).mergeDmSummon(dmSummon);
            return this;
        }

        public Builder mergeHalfScreen(HalfScreen halfScreen) {
            copyOnWrite();
            ((RabbitYear) this.instance).mergeHalfScreen(halfScreen);
            return this;
        }

        public Builder mergePlayerAutomate(PlayerAutomate playerAutomate) {
            copyOnWrite();
            ((RabbitYear) this.instance).mergePlayerAutomate(playerAutomate);
            return this;
        }

        public Builder mergeSpecialDm(SpecialDm specialDm) {
            copyOnWrite();
            ((RabbitYear) this.instance).mergeSpecialDm(specialDm);
            return this;
        }

        public Builder setDmSummon(DmSummon dmSummon) {
            copyOnWrite();
            ((RabbitYear) this.instance).setDmSummon(dmSummon);
            return this;
        }

        public Builder setHalfScreen(HalfScreen halfScreen) {
            copyOnWrite();
            ((RabbitYear) this.instance).setHalfScreen(halfScreen);
            return this;
        }

        public Builder setPlayerAutomate(PlayerAutomate playerAutomate) {
            copyOnWrite();
            ((RabbitYear) this.instance).setPlayerAutomate(playerAutomate);
            return this;
        }

        public Builder setSpecialDm(SpecialDm specialDm) {
            copyOnWrite();
            ((RabbitYear) this.instance).setSpecialDm(specialDm);
            return this;
        }

        private Builder() {
            super(RabbitYear.DEFAULT_INSTANCE);
        }

        public Builder setDmSummon(DmSummon.Builder builder) {
            copyOnWrite();
            ((RabbitYear) this.instance).setDmSummon(builder.build());
            return this;
        }

        public Builder setHalfScreen(HalfScreen.Builder builder) {
            copyOnWrite();
            ((RabbitYear) this.instance).setHalfScreen(builder.build());
            return this;
        }

        public Builder setPlayerAutomate(PlayerAutomate.Builder builder) {
            copyOnWrite();
            ((RabbitYear) this.instance).setPlayerAutomate(builder.build());
            return this;
        }

        public Builder setSpecialDm(SpecialDm.Builder builder) {
            copyOnWrite();
            ((RabbitYear) this.instance).setSpecialDm(builder.build());
            return this;
        }
    }

    static {
        RabbitYear rabbitYear = new RabbitYear();
        DEFAULT_INSTANCE = rabbitYear;
        GeneratedMessageLite.registerDefaultInstance(RabbitYear.class, rabbitYear);
    }

    private RabbitYear() {
    }

    public void clearDmSummon() {
        this.dmSummon_ = null;
    }

    public void clearHalfScreen() {
        this.halfScreen_ = null;
    }

    public void clearPlayerAutomate() {
        this.playerAutomate_ = null;
    }

    public void clearSpecialDm() {
        this.specialDm_ = null;
    }

    public static RabbitYear getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeDmSummon(DmSummon dmSummon) {
    }

    public void mergeHalfScreen(HalfScreen halfScreen) {
    }

    public void mergePlayerAutomate(PlayerAutomate playerAutomate) {
    }

    public void mergeSpecialDm(SpecialDm specialDm) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RabbitYear parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RabbitYear) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RabbitYear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RabbitYear> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDmSummon(DmSummon dmSummon) {
        dmSummon.getClass();
        this.dmSummon_ = dmSummon;
    }

    public void setHalfScreen(HalfScreen halfScreen) {
        halfScreen.getClass();
        this.halfScreen_ = halfScreen;
    }

    public void setPlayerAutomate(PlayerAutomate playerAutomate) {
        playerAutomate.getClass();
        this.playerAutomate_ = playerAutomate;
    }

    public void setSpecialDm(SpecialDm specialDm) {
        specialDm.getClass();
        this.specialDm_ = specialDm;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68311.f16792xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RabbitYear();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"playerAutomate_", "dmSummon_", "halfScreen_", "specialDm_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RabbitYear> parser = PARSER;
                if (parser == null) {
                    synchronized (RabbitYear.class) {
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

    public DmSummon getDmSummon() {
        DmSummon dmSummon = this.dmSummon_;
        return dmSummon == null ? DmSummon.getDefaultInstance() : dmSummon;
    }

    public HalfScreen getHalfScreen() {
        HalfScreen halfScreen = this.halfScreen_;
        return halfScreen == null ? HalfScreen.getDefaultInstance() : halfScreen;
    }

    public PlayerAutomate getPlayerAutomate() {
        PlayerAutomate playerAutomate = this.playerAutomate_;
        return playerAutomate == null ? PlayerAutomate.getDefaultInstance() : playerAutomate;
    }

    public SpecialDm getSpecialDm() {
        SpecialDm specialDm = this.specialDm_;
        return specialDm == null ? SpecialDm.getDefaultInstance() : specialDm;
    }

    public boolean hasDmSummon() {
        return this.dmSummon_ != null;
    }

    public boolean hasHalfScreen() {
        return this.halfScreen_ != null;
    }

    public boolean hasPlayerAutomate() {
        return this.playerAutomate_ != null;
    }

    public boolean hasSpecialDm() {
        return this.specialDm_ != null;
    }

    public static Builder newBuilder(RabbitYear rabbitYear) {
        return DEFAULT_INSTANCE.createBuilder(rabbitYear);
    }

    public static RabbitYear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RabbitYear) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RabbitYear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RabbitYear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RabbitYear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RabbitYear parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RabbitYear parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RabbitYear parseFrom(InputStream inputStream) throws IOException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RabbitYear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RabbitYear parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RabbitYear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RabbitYear) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
