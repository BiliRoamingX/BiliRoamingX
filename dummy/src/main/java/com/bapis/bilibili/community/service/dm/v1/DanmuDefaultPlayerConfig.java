package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class DanmuDefaultPlayerConfig extends GeneratedMessageLite<DanmuDefaultPlayerConfig, DanmuDefaultPlayerConfig.Builder> implements MessageLiteOrBuilder {
    private static final DanmuDefaultPlayerConfig DEFAULT_INSTANCE;
    public static final int INLINE_PLAYER_DANMAKU_SWITCH_FIELD_NUMBER = 16;
    private static volatile Parser<DanmuDefaultPlayerConfig> PARSER = null;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_LEVEL_FIELD_NUMBER = 5;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_LEVEL_V2_FIELD_NUMBER = 18;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_LEVEL_V2_MAP_FIELD_NUMBER = 19;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_SWITCH_FIELD_NUMBER = 4;
    public static final int PLAYER_DANMAKU_BLOCKBOTTOM_FIELD_NUMBER = 8;
    public static final int PLAYER_DANMAKU_BLOCKCOLORFUL_FIELD_NUMBER = 9;
    public static final int PLAYER_DANMAKU_BLOCKREPEAT_FIELD_NUMBER = 10;
    public static final int PLAYER_DANMAKU_BLOCKSCROLL_FIELD_NUMBER = 7;
    public static final int PLAYER_DANMAKU_BLOCKSPECIAL_FIELD_NUMBER = 11;
    public static final int PLAYER_DANMAKU_BLOCKTOP_FIELD_NUMBER = 6;
    public static final int PLAYER_DANMAKU_DOMAIN_FIELD_NUMBER = 14;
    public static final int PLAYER_DANMAKU_ENABLE_HERD_DM_FIELD_NUMBER = 20;
    public static final int PLAYER_DANMAKU_OPACITY_FIELD_NUMBER = 12;
    public static final int PLAYER_DANMAKU_SCALINGFACTOR_FIELD_NUMBER = 13;
    public static final int PLAYER_DANMAKU_SENIOR_MODE_SWITCH_FIELD_NUMBER = 17;
    public static final int PLAYER_DANMAKU_SPEED_FIELD_NUMBER = 15;
    public static final int PLAYER_DANMAKU_USE_DEFAULT_CONFIG_FIELD_NUMBER = 1;
    private boolean inlinePlayerDanmakuSwitch_;
    private MapFieldLite<Integer, Integer> playerDanmakuAiRecommendedLevelV2Map_ = MapFieldLite.emptyMapField();
    private int playerDanmakuAiRecommendedLevelV2_;
    private int playerDanmakuAiRecommendedLevel_;
    private boolean playerDanmakuAiRecommendedSwitch_;
    private boolean playerDanmakuBlockbottom_;
    private boolean playerDanmakuBlockcolorful_;
    private boolean playerDanmakuBlockrepeat_;
    private boolean playerDanmakuBlockscroll_;
    private boolean playerDanmakuBlockspecial_;
    private boolean playerDanmakuBlocktop_;
    private float playerDanmakuDomain_;
    private boolean playerDanmakuEnableHerdDm_;
    private float playerDanmakuOpacity_;
    private float playerDanmakuScalingfactor_;
    private int playerDanmakuSeniorModeSwitch_;
    private int playerDanmakuSpeed_;
    private boolean playerDanmakuUseDefaultConfig_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmuDefaultPlayerConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72041 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17047xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17047xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DanmuDefaultPlayerConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72041 c72041) {
            this();
        }

        public Builder clearInlinePlayerDanmakuSwitch() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearInlinePlayerDanmakuSwitch();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedLevel() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuAiRecommendedLevel();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedLevelV2() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuAiRecommendedLevelV2();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedLevelV2Map() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().clear();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedSwitch() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuAiRecommendedSwitch();
            return this;
        }

        public Builder clearPlayerDanmakuBlockbottom() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuBlockbottom();
            return this;
        }

        public Builder clearPlayerDanmakuBlockcolorful() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuBlockcolorful();
            return this;
        }

        public Builder clearPlayerDanmakuBlockrepeat() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuBlockrepeat();
            return this;
        }

        public Builder clearPlayerDanmakuBlockscroll() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuBlockscroll();
            return this;
        }

        public Builder clearPlayerDanmakuBlockspecial() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuBlockspecial();
            return this;
        }

        public Builder clearPlayerDanmakuBlocktop() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuBlocktop();
            return this;
        }

        public Builder clearPlayerDanmakuDomain() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuDomain();
            return this;
        }

        public Builder clearPlayerDanmakuEnableHerdDm() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuEnableHerdDm();
            return this;
        }

        public Builder clearPlayerDanmakuOpacity() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuOpacity();
            return this;
        }

        public Builder clearPlayerDanmakuScalingfactor() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuScalingfactor();
            return this;
        }

        public Builder clearPlayerDanmakuSeniorModeSwitch() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuSeniorModeSwitch();
            return this;
        }

        public Builder clearPlayerDanmakuSpeed() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuSpeed();
            return this;
        }

        public Builder clearPlayerDanmakuUseDefaultConfig() {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).clearPlayerDanmakuUseDefaultConfig();
            return this;
        }

        public boolean containsPlayerDanmakuAiRecommendedLevelV2Map(int i) {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap().containsKey(Integer.valueOf(i));
        }

        public boolean getInlinePlayerDanmakuSwitch() {
            return ((DanmuDefaultPlayerConfig) this.instance).getInlinePlayerDanmakuSwitch();
        }

        public int getPlayerDanmakuAiRecommendedLevel() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevel();
        }

        public int getPlayerDanmakuAiRecommendedLevelV2() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2();
        }

        @Deprecated
        public Map<Integer, Integer> getPlayerDanmakuAiRecommendedLevelV2Map() {
            return getPlayerDanmakuAiRecommendedLevelV2MapMap();
        }

        public int getPlayerDanmakuAiRecommendedLevelV2MapCount() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap().size();
        }

        public Map<Integer, Integer> getPlayerDanmakuAiRecommendedLevelV2MapMap() {
            return Collections.unmodifiableMap(((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap());
        }

        public int getPlayerDanmakuAiRecommendedLevelV2MapOrDefault(int i, int i2) {
            Map<Integer, Integer> playerDanmakuAiRecommendedLevelV2MapMap = ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap();
            return playerDanmakuAiRecommendedLevelV2MapMap.containsKey(Integer.valueOf(i)) ? playerDanmakuAiRecommendedLevelV2MapMap.get(Integer.valueOf(i)).intValue() : i2;
        }

        public int getPlayerDanmakuAiRecommendedLevelV2MapOrThrow(int i) {
            Map<Integer, Integer> playerDanmakuAiRecommendedLevelV2MapMap = ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap();
            if (playerDanmakuAiRecommendedLevelV2MapMap.containsKey(Integer.valueOf(i))) {
                return playerDanmakuAiRecommendedLevelV2MapMap.get(Integer.valueOf(i)).intValue();
            }
            throw new IllegalArgumentException();
        }

        public boolean getPlayerDanmakuAiRecommendedSwitch() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedSwitch();
        }

        public boolean getPlayerDanmakuBlockbottom() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuBlockbottom();
        }

        public boolean getPlayerDanmakuBlockcolorful() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuBlockcolorful();
        }

        public boolean getPlayerDanmakuBlockrepeat() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuBlockrepeat();
        }

        public boolean getPlayerDanmakuBlockscroll() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuBlockscroll();
        }

        public boolean getPlayerDanmakuBlockspecial() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuBlockspecial();
        }

        public boolean getPlayerDanmakuBlocktop() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuBlocktop();
        }

        public float getPlayerDanmakuDomain() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuDomain();
        }

        public boolean getPlayerDanmakuEnableHerdDm() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuEnableHerdDm();
        }

        public float getPlayerDanmakuOpacity() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuOpacity();
        }

        public float getPlayerDanmakuScalingfactor() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuScalingfactor();
        }

        public int getPlayerDanmakuSeniorModeSwitch() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuSeniorModeSwitch();
        }

        public int getPlayerDanmakuSpeed() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuSpeed();
        }

        public boolean getPlayerDanmakuUseDefaultConfig() {
            return ((DanmuDefaultPlayerConfig) this.instance).getPlayerDanmakuUseDefaultConfig();
        }

        public Builder putAllPlayerDanmakuAiRecommendedLevelV2Map(Map<Integer, Integer> map) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().putAll(map);
            return this;
        }

        public Builder putPlayerDanmakuAiRecommendedLevelV2Map(int i, int i2) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().put(Integer.valueOf(i), Integer.valueOf(i2));
            return this;
        }

        public Builder removePlayerDanmakuAiRecommendedLevelV2Map(int i) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().remove(Integer.valueOf(i));
            return this;
        }

        public Builder setInlinePlayerDanmakuSwitch(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setInlinePlayerDanmakuSwitch(z);
            return this;
        }

        public Builder setPlayerDanmakuAiRecommendedLevel(int i) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuAiRecommendedLevel(i);
            return this;
        }

        public Builder setPlayerDanmakuAiRecommendedLevelV2(int i) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuAiRecommendedLevelV2(i);
            return this;
        }

        public Builder setPlayerDanmakuAiRecommendedSwitch(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuAiRecommendedSwitch(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockbottom(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuBlockbottom(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockcolorful(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuBlockcolorful(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockrepeat(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuBlockrepeat(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockscroll(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuBlockscroll(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockspecial(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuBlockspecial(z);
            return this;
        }

        public Builder setPlayerDanmakuBlocktop(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuBlocktop(z);
            return this;
        }

        public Builder setPlayerDanmakuDomain(float f) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuDomain(f);
            return this;
        }

        public Builder setPlayerDanmakuEnableHerdDm(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuEnableHerdDm(z);
            return this;
        }

        public Builder setPlayerDanmakuOpacity(float f) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuOpacity(f);
            return this;
        }

        public Builder setPlayerDanmakuScalingfactor(float f) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuScalingfactor(f);
            return this;
        }

        public Builder setPlayerDanmakuSeniorModeSwitch(int i) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuSeniorModeSwitch(i);
            return this;
        }

        public Builder setPlayerDanmakuSpeed(int i) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuSpeed(i);
            return this;
        }

        public Builder setPlayerDanmakuUseDefaultConfig(boolean z) {
            copyOnWrite();
            ((DanmuDefaultPlayerConfig) this.instance).setPlayerDanmakuUseDefaultConfig(z);
            return this;
        }

        private Builder() {
            super(DanmuDefaultPlayerConfig.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class PlayerDanmakuAiRecommendedLevelV2MapDefaultEntryHolder {
        static final MapEntryLite<Integer, Integer> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.INT32;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, 0, fieldType, 0);
        }

        private PlayerDanmakuAiRecommendedLevelV2MapDefaultEntryHolder() {
        }
    }

    static {
        DanmuDefaultPlayerConfig danmuDefaultPlayerConfig = new DanmuDefaultPlayerConfig();
        DEFAULT_INSTANCE = danmuDefaultPlayerConfig;
        GeneratedMessageLite.registerDefaultInstance(DanmuDefaultPlayerConfig.class, danmuDefaultPlayerConfig);
    }

    private DanmuDefaultPlayerConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInlinePlayerDanmakuSwitch() {
        this.inlinePlayerDanmakuSwitch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuAiRecommendedLevel() {
        this.playerDanmakuAiRecommendedLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuAiRecommendedLevelV2() {
        this.playerDanmakuAiRecommendedLevelV2_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuAiRecommendedSwitch() {
        this.playerDanmakuAiRecommendedSwitch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuBlockbottom() {
        this.playerDanmakuBlockbottom_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuBlockcolorful() {
        this.playerDanmakuBlockcolorful_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuBlockrepeat() {
        this.playerDanmakuBlockrepeat_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuBlockscroll() {
        this.playerDanmakuBlockscroll_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuBlockspecial() {
        this.playerDanmakuBlockspecial_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuBlocktop() {
        this.playerDanmakuBlocktop_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuDomain() {
        this.playerDanmakuDomain_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuEnableHerdDm() {
        this.playerDanmakuEnableHerdDm_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuOpacity() {
        this.playerDanmakuOpacity_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuScalingfactor() {
        this.playerDanmakuScalingfactor_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuSeniorModeSwitch() {
        this.playerDanmakuSeniorModeSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuSpeed() {
        this.playerDanmakuSpeed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuUseDefaultConfig() {
        this.playerDanmakuUseDefaultConfig_ = false;
    }

    public static DanmuDefaultPlayerConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, Integer> getMutablePlayerDanmakuAiRecommendedLevelV2MapMap() {
        return internalGetMutablePlayerDanmakuAiRecommendedLevelV2Map();
    }

    private MapFieldLite<Integer, Integer> internalGetMutablePlayerDanmakuAiRecommendedLevelV2Map() {
        if (!this.playerDanmakuAiRecommendedLevelV2Map_.isMutable()) {
            this.playerDanmakuAiRecommendedLevelV2Map_ = this.playerDanmakuAiRecommendedLevelV2Map_.mutableCopy();
        }
        return this.playerDanmakuAiRecommendedLevelV2Map_;
    }

    private MapFieldLite<Integer, Integer> internalGetPlayerDanmakuAiRecommendedLevelV2Map() {
        return this.playerDanmakuAiRecommendedLevelV2Map_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmuDefaultPlayerConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuDefaultPlayerConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmuDefaultPlayerConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInlinePlayerDanmakuSwitch(boolean z) {
        this.inlinePlayerDanmakuSwitch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuAiRecommendedLevel(int i) {
        this.playerDanmakuAiRecommendedLevel_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuAiRecommendedLevelV2(int i) {
        this.playerDanmakuAiRecommendedLevelV2_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuAiRecommendedSwitch(boolean z) {
        this.playerDanmakuAiRecommendedSwitch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuBlockbottom(boolean z) {
        this.playerDanmakuBlockbottom_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuBlockcolorful(boolean z) {
        this.playerDanmakuBlockcolorful_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuBlockrepeat(boolean z) {
        this.playerDanmakuBlockrepeat_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuBlockscroll(boolean z) {
        this.playerDanmakuBlockscroll_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuBlockspecial(boolean z) {
        this.playerDanmakuBlockspecial_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuBlocktop(boolean z) {
        this.playerDanmakuBlocktop_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuDomain(float f) {
        this.playerDanmakuDomain_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuEnableHerdDm(boolean z) {
        this.playerDanmakuEnableHerdDm_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuOpacity(float f) {
        this.playerDanmakuOpacity_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuScalingfactor(float f) {
        this.playerDanmakuScalingfactor_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuSeniorModeSwitch(int i) {
        this.playerDanmakuSeniorModeSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuSpeed(int i) {
        this.playerDanmakuSpeed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuUseDefaultConfig(boolean z) {
        this.playerDanmakuUseDefaultConfig_ = z;
    }

    public boolean containsPlayerDanmakuAiRecommendedLevelV2Map(int i) {
        return internalGetPlayerDanmakuAiRecommendedLevelV2Map().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72041.f17047xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmuDefaultPlayerConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0014\u0012\u0001\u0000\u0000\u0001\u0007\u0004\u0007\u0005\u0004\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0001\r\u0001\u000e\u0001\u000f\u0004\u0010\u0007\u0011\u0004\u0012\u0004\u00132\u0014\u0007", new Object[]{"playerDanmakuUseDefaultConfig_", "playerDanmakuAiRecommendedSwitch_", "playerDanmakuAiRecommendedLevel_", "playerDanmakuBlocktop_", "playerDanmakuBlockscroll_", "playerDanmakuBlockbottom_", "playerDanmakuBlockcolorful_", "playerDanmakuBlockrepeat_", "playerDanmakuBlockspecial_", "playerDanmakuOpacity_", "playerDanmakuScalingfactor_", "playerDanmakuDomain_", "playerDanmakuSpeed_", "inlinePlayerDanmakuSwitch_", "playerDanmakuSeniorModeSwitch_", "playerDanmakuAiRecommendedLevelV2_", "playerDanmakuAiRecommendedLevelV2Map_", PlayerDanmakuAiRecommendedLevelV2MapDefaultEntryHolder.defaultEntry, "playerDanmakuEnableHerdDm_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmuDefaultPlayerConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmuDefaultPlayerConfig.class) {
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

    public boolean getInlinePlayerDanmakuSwitch() {
        return this.inlinePlayerDanmakuSwitch_;
    }

    public int getPlayerDanmakuAiRecommendedLevel() {
        return this.playerDanmakuAiRecommendedLevel_;
    }

    public int getPlayerDanmakuAiRecommendedLevelV2() {
        return this.playerDanmakuAiRecommendedLevelV2_;
    }

    @Deprecated
    public Map<Integer, Integer> getPlayerDanmakuAiRecommendedLevelV2Map() {
        return getPlayerDanmakuAiRecommendedLevelV2MapMap();
    }

    public int getPlayerDanmakuAiRecommendedLevelV2MapCount() {
        return internalGetPlayerDanmakuAiRecommendedLevelV2Map().size();
    }

    public Map<Integer, Integer> getPlayerDanmakuAiRecommendedLevelV2MapMap() {
        return Collections.unmodifiableMap(internalGetPlayerDanmakuAiRecommendedLevelV2Map());
    }

    public int getPlayerDanmakuAiRecommendedLevelV2MapOrDefault(int i, int i2) {
        MapFieldLite<Integer, Integer> internalGetPlayerDanmakuAiRecommendedLevelV2Map = internalGetPlayerDanmakuAiRecommendedLevelV2Map();
        return internalGetPlayerDanmakuAiRecommendedLevelV2Map.containsKey(Integer.valueOf(i)) ? internalGetPlayerDanmakuAiRecommendedLevelV2Map.get(Integer.valueOf(i)).intValue() : i2;
    }

    public int getPlayerDanmakuAiRecommendedLevelV2MapOrThrow(int i) {
        MapFieldLite<Integer, Integer> internalGetPlayerDanmakuAiRecommendedLevelV2Map = internalGetPlayerDanmakuAiRecommendedLevelV2Map();
        if (internalGetPlayerDanmakuAiRecommendedLevelV2Map.containsKey(Integer.valueOf(i))) {
            return internalGetPlayerDanmakuAiRecommendedLevelV2Map.get(Integer.valueOf(i)).intValue();
        }
        throw new IllegalArgumentException();
    }

    public boolean getPlayerDanmakuAiRecommendedSwitch() {
        return this.playerDanmakuAiRecommendedSwitch_;
    }

    public boolean getPlayerDanmakuBlockbottom() {
        return this.playerDanmakuBlockbottom_;
    }

    public boolean getPlayerDanmakuBlockcolorful() {
        return this.playerDanmakuBlockcolorful_;
    }

    public boolean getPlayerDanmakuBlockrepeat() {
        return this.playerDanmakuBlockrepeat_;
    }

    public boolean getPlayerDanmakuBlockscroll() {
        return this.playerDanmakuBlockscroll_;
    }

    public boolean getPlayerDanmakuBlockspecial() {
        return this.playerDanmakuBlockspecial_;
    }

    public boolean getPlayerDanmakuBlocktop() {
        return this.playerDanmakuBlocktop_;
    }

    public float getPlayerDanmakuDomain() {
        return this.playerDanmakuDomain_;
    }

    public boolean getPlayerDanmakuEnableHerdDm() {
        return this.playerDanmakuEnableHerdDm_;
    }

    public float getPlayerDanmakuOpacity() {
        return this.playerDanmakuOpacity_;
    }

    public float getPlayerDanmakuScalingfactor() {
        return this.playerDanmakuScalingfactor_;
    }

    public int getPlayerDanmakuSeniorModeSwitch() {
        return this.playerDanmakuSeniorModeSwitch_;
    }

    public int getPlayerDanmakuSpeed() {
        return this.playerDanmakuSpeed_;
    }

    public boolean getPlayerDanmakuUseDefaultConfig() {
        return this.playerDanmakuUseDefaultConfig_;
    }

    public static Builder newBuilder(DanmuDefaultPlayerConfig danmuDefaultPlayerConfig) {
        return DEFAULT_INSTANCE.createBuilder(danmuDefaultPlayerConfig);
    }

    public static DanmuDefaultPlayerConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuDefaultPlayerConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmuDefaultPlayerConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DanmuDefaultPlayerConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmuDefaultPlayerConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmuDefaultPlayerConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmuDefaultPlayerConfig parseFrom(InputStream inputStream) throws IOException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuDefaultPlayerConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuDefaultPlayerConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmuDefaultPlayerConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuDefaultPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
