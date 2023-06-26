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
public final class DanmuPlayerConfig extends GeneratedMessageLite<DanmuPlayerConfig, DanmuPlayerConfig.Builder> implements MessageLiteOrBuilder {
    private static final DanmuPlayerConfig DEFAULT_INSTANCE;
    public static final int INLINE_PLAYER_DANMAKU_CONFIG_FIELD_NUMBER = 18;
    public static final int INLINE_PLAYER_DANMAKU_SWITCH_FIELD_NUMBER = 17;
    private static volatile Parser<DanmuPlayerConfig> PARSER = null;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_LEVEL_FIELD_NUMBER = 5;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_LEVEL_V2_FIELD_NUMBER = 21;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_LEVEL_V2_MAP_FIELD_NUMBER = 22;
    public static final int PLAYER_DANMAKU_AI_RECOMMENDED_SWITCH_FIELD_NUMBER = 4;
    public static final int PLAYER_DANMAKU_BLOCKBOTTOM_FIELD_NUMBER = 8;
    public static final int PLAYER_DANMAKU_BLOCKCOLORFUL_FIELD_NUMBER = 9;
    public static final int PLAYER_DANMAKU_BLOCKREPEAT_FIELD_NUMBER = 10;
    public static final int PLAYER_DANMAKU_BLOCKSCROLL_FIELD_NUMBER = 7;
    public static final int PLAYER_DANMAKU_BLOCKSPECIAL_FIELD_NUMBER = 11;
    public static final int PLAYER_DANMAKU_BLOCKTOP_FIELD_NUMBER = 6;
    public static final int PLAYER_DANMAKU_DOMAIN_FIELD_NUMBER = 14;
    public static final int PLAYER_DANMAKU_ENABLEBLOCKLIST_FIELD_NUMBER = 16;
    public static final int PLAYER_DANMAKU_ENABLE_HERD_DM_FIELD_NUMBER = 23;
    public static final int PLAYER_DANMAKU_IOS_SWITCH_SAVE_FIELD_NUMBER = 19;
    public static final int PLAYER_DANMAKU_OPACITY_FIELD_NUMBER = 12;
    public static final int PLAYER_DANMAKU_SCALINGFACTOR_FIELD_NUMBER = 13;
    public static final int PLAYER_DANMAKU_SENIOR_MODE_SWITCH_FIELD_NUMBER = 20;
    public static final int PLAYER_DANMAKU_SPEED_FIELD_NUMBER = 15;
    public static final int PLAYER_DANMAKU_SWITCH_FIELD_NUMBER = 1;
    public static final int PLAYER_DANMAKU_SWITCH_SAVE_FIELD_NUMBER = 2;
    public static final int PLAYER_DANMAKU_USE_DEFAULT_CONFIG_FIELD_NUMBER = 3;
    private int inlinePlayerDanmakuConfig_;
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
    private boolean playerDanmakuEnableblocklist_;
    private int playerDanmakuIosSwitchSave_;
    private float playerDanmakuOpacity_;
    private float playerDanmakuScalingfactor_;
    private int playerDanmakuSeniorModeSwitch_;
    private int playerDanmakuSpeed_;
    private boolean playerDanmakuSwitchSave_;
    private boolean playerDanmakuSwitch_;
    private boolean playerDanmakuUseDefaultConfig_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmuPlayerConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72051 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17048xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17048xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17048xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DanmuPlayerConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72051 c72051) {
            this();
        }

        public Builder clearInlinePlayerDanmakuConfig() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearInlinePlayerDanmakuConfig();
            return this;
        }

        public Builder clearInlinePlayerDanmakuSwitch() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearInlinePlayerDanmakuSwitch();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedLevel() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuAiRecommendedLevel();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedLevelV2() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuAiRecommendedLevelV2();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedLevelV2Map() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().clear();
            return this;
        }

        public Builder clearPlayerDanmakuAiRecommendedSwitch() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuAiRecommendedSwitch();
            return this;
        }

        public Builder clearPlayerDanmakuBlockbottom() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuBlockbottom();
            return this;
        }

        public Builder clearPlayerDanmakuBlockcolorful() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuBlockcolorful();
            return this;
        }

        public Builder clearPlayerDanmakuBlockrepeat() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuBlockrepeat();
            return this;
        }

        public Builder clearPlayerDanmakuBlockscroll() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuBlockscroll();
            return this;
        }

        public Builder clearPlayerDanmakuBlockspecial() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuBlockspecial();
            return this;
        }

        public Builder clearPlayerDanmakuBlocktop() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuBlocktop();
            return this;
        }

        public Builder clearPlayerDanmakuDomain() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuDomain();
            return this;
        }

        public Builder clearPlayerDanmakuEnableHerdDm() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuEnableHerdDm();
            return this;
        }

        public Builder clearPlayerDanmakuEnableblocklist() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuEnableblocklist();
            return this;
        }

        public Builder clearPlayerDanmakuIosSwitchSave() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuIosSwitchSave();
            return this;
        }

        public Builder clearPlayerDanmakuOpacity() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuOpacity();
            return this;
        }

        public Builder clearPlayerDanmakuScalingfactor() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuScalingfactor();
            return this;
        }

        public Builder clearPlayerDanmakuSeniorModeSwitch() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuSeniorModeSwitch();
            return this;
        }

        public Builder clearPlayerDanmakuSpeed() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuSpeed();
            return this;
        }

        public Builder clearPlayerDanmakuSwitch() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuSwitch();
            return this;
        }

        public Builder clearPlayerDanmakuSwitchSave() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuSwitchSave();
            return this;
        }

        public Builder clearPlayerDanmakuUseDefaultConfig() {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).clearPlayerDanmakuUseDefaultConfig();
            return this;
        }

        public boolean containsPlayerDanmakuAiRecommendedLevelV2Map(int i) {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap().containsKey(Integer.valueOf(i));
        }

        public int getInlinePlayerDanmakuConfig() {
            return ((DanmuPlayerConfig) this.instance).getInlinePlayerDanmakuConfig();
        }

        public boolean getInlinePlayerDanmakuSwitch() {
            return ((DanmuPlayerConfig) this.instance).getInlinePlayerDanmakuSwitch();
        }

        public int getPlayerDanmakuAiRecommendedLevel() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevel();
        }

        public int getPlayerDanmakuAiRecommendedLevelV2() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2();
        }

        @Deprecated
        public Map<Integer, Integer> getPlayerDanmakuAiRecommendedLevelV2Map() {
            return getPlayerDanmakuAiRecommendedLevelV2MapMap();
        }

        public int getPlayerDanmakuAiRecommendedLevelV2MapCount() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap().size();
        }

        public Map<Integer, Integer> getPlayerDanmakuAiRecommendedLevelV2MapMap() {
            return Collections.unmodifiableMap(((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap());
        }

        public int getPlayerDanmakuAiRecommendedLevelV2MapOrDefault(int i, int i2) {
            Map<Integer, Integer> playerDanmakuAiRecommendedLevelV2MapMap = ((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap();
            return playerDanmakuAiRecommendedLevelV2MapMap.containsKey(Integer.valueOf(i)) ? playerDanmakuAiRecommendedLevelV2MapMap.get(Integer.valueOf(i)).intValue() : i2;
        }

        public int getPlayerDanmakuAiRecommendedLevelV2MapOrThrow(int i) {
            Map<Integer, Integer> playerDanmakuAiRecommendedLevelV2MapMap = ((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedLevelV2MapMap();
            if (playerDanmakuAiRecommendedLevelV2MapMap.containsKey(Integer.valueOf(i))) {
                return playerDanmakuAiRecommendedLevelV2MapMap.get(Integer.valueOf(i)).intValue();
            }
            throw new IllegalArgumentException();
        }

        public boolean getPlayerDanmakuAiRecommendedSwitch() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuAiRecommendedSwitch();
        }

        public boolean getPlayerDanmakuBlockbottom() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuBlockbottom();
        }

        public boolean getPlayerDanmakuBlockcolorful() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuBlockcolorful();
        }

        public boolean getPlayerDanmakuBlockrepeat() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuBlockrepeat();
        }

        public boolean getPlayerDanmakuBlockscroll() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuBlockscroll();
        }

        public boolean getPlayerDanmakuBlockspecial() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuBlockspecial();
        }

        public boolean getPlayerDanmakuBlocktop() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuBlocktop();
        }

        public float getPlayerDanmakuDomain() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuDomain();
        }

        public boolean getPlayerDanmakuEnableHerdDm() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuEnableHerdDm();
        }

        public boolean getPlayerDanmakuEnableblocklist() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuEnableblocklist();
        }

        public int getPlayerDanmakuIosSwitchSave() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuIosSwitchSave();
        }

        public float getPlayerDanmakuOpacity() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuOpacity();
        }

        public float getPlayerDanmakuScalingfactor() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuScalingfactor();
        }

        public int getPlayerDanmakuSeniorModeSwitch() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuSeniorModeSwitch();
        }

        public int getPlayerDanmakuSpeed() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuSpeed();
        }

        public boolean getPlayerDanmakuSwitch() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuSwitch();
        }

        public boolean getPlayerDanmakuSwitchSave() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuSwitchSave();
        }

        public boolean getPlayerDanmakuUseDefaultConfig() {
            return ((DanmuPlayerConfig) this.instance).getPlayerDanmakuUseDefaultConfig();
        }

        public Builder putAllPlayerDanmakuAiRecommendedLevelV2Map(Map<Integer, Integer> map) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().putAll(map);
            return this;
        }

        public Builder putPlayerDanmakuAiRecommendedLevelV2Map(int i, int i2) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().put(Integer.valueOf(i), Integer.valueOf(i2));
            return this;
        }

        public Builder removePlayerDanmakuAiRecommendedLevelV2Map(int i) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).getMutablePlayerDanmakuAiRecommendedLevelV2MapMap().remove(Integer.valueOf(i));
            return this;
        }

        public Builder setInlinePlayerDanmakuConfig(int i) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setInlinePlayerDanmakuConfig(i);
            return this;
        }

        public Builder setInlinePlayerDanmakuSwitch(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setInlinePlayerDanmakuSwitch(z);
            return this;
        }

        public Builder setPlayerDanmakuAiRecommendedLevel(int i) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuAiRecommendedLevel(i);
            return this;
        }

        public Builder setPlayerDanmakuAiRecommendedLevelV2(int i) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuAiRecommendedLevelV2(i);
            return this;
        }

        public Builder setPlayerDanmakuAiRecommendedSwitch(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuAiRecommendedSwitch(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockbottom(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuBlockbottom(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockcolorful(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuBlockcolorful(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockrepeat(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuBlockrepeat(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockscroll(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuBlockscroll(z);
            return this;
        }

        public Builder setPlayerDanmakuBlockspecial(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuBlockspecial(z);
            return this;
        }

        public Builder setPlayerDanmakuBlocktop(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuBlocktop(z);
            return this;
        }

        public Builder setPlayerDanmakuDomain(float f) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuDomain(f);
            return this;
        }

        public Builder setPlayerDanmakuEnableHerdDm(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuEnableHerdDm(z);
            return this;
        }

        public Builder setPlayerDanmakuEnableblocklist(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuEnableblocklist(z);
            return this;
        }

        public Builder setPlayerDanmakuIosSwitchSave(int i) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuIosSwitchSave(i);
            return this;
        }

        public Builder setPlayerDanmakuOpacity(float f) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuOpacity(f);
            return this;
        }

        public Builder setPlayerDanmakuScalingfactor(float f) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuScalingfactor(f);
            return this;
        }

        public Builder setPlayerDanmakuSeniorModeSwitch(int i) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuSeniorModeSwitch(i);
            return this;
        }

        public Builder setPlayerDanmakuSpeed(int i) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuSpeed(i);
            return this;
        }

        public Builder setPlayerDanmakuSwitch(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuSwitch(z);
            return this;
        }

        public Builder setPlayerDanmakuSwitchSave(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuSwitchSave(z);
            return this;
        }

        public Builder setPlayerDanmakuUseDefaultConfig(boolean z) {
            copyOnWrite();
            ((DanmuPlayerConfig) this.instance).setPlayerDanmakuUseDefaultConfig(z);
            return this;
        }

        private Builder() {
            super(DanmuPlayerConfig.DEFAULT_INSTANCE);
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
        DanmuPlayerConfig danmuPlayerConfig = new DanmuPlayerConfig();
        DEFAULT_INSTANCE = danmuPlayerConfig;
        GeneratedMessageLite.registerDefaultInstance(DanmuPlayerConfig.class, danmuPlayerConfig);
    }

    private DanmuPlayerConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInlinePlayerDanmakuConfig() {
        this.inlinePlayerDanmakuConfig_ = 0;
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
    public void clearPlayerDanmakuEnableblocklist() {
        this.playerDanmakuEnableblocklist_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuIosSwitchSave() {
        this.playerDanmakuIosSwitchSave_ = 0;
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
    public void clearPlayerDanmakuSwitch() {
        this.playerDanmakuSwitch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuSwitchSave() {
        this.playerDanmakuSwitchSave_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerDanmakuUseDefaultConfig() {
        this.playerDanmakuUseDefaultConfig_ = false;
    }

    public static DanmuPlayerConfig getDefaultInstance() {
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

    public static DanmuPlayerConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmuPlayerConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInlinePlayerDanmakuConfig(int i) {
        this.inlinePlayerDanmakuConfig_ = i;
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
    public void setPlayerDanmakuEnableblocklist(boolean z) {
        this.playerDanmakuEnableblocklist_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuIosSwitchSave(int i) {
        this.playerDanmakuIosSwitchSave_ = i;
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
    public void setPlayerDanmakuSwitch(boolean z) {
        this.playerDanmakuSwitch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerDanmakuSwitchSave(boolean z) {
        this.playerDanmakuSwitchSave_ = z;
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
        switch (C72051.f17048xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmuPlayerConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0000\u0001\u0017\u0017\u0001\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0004\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0001\r\u0001\u000e\u0001\u000f\u0004\u0010\u0007\u0011\u0007\u0012\u0004\u0013\u0004\u0014\u0004\u0015\u0004\u00162\u0017\u0007", new Object[]{"playerDanmakuSwitch_", "playerDanmakuSwitchSave_", "playerDanmakuUseDefaultConfig_", "playerDanmakuAiRecommendedSwitch_", "playerDanmakuAiRecommendedLevel_", "playerDanmakuBlocktop_", "playerDanmakuBlockscroll_", "playerDanmakuBlockbottom_", "playerDanmakuBlockcolorful_", "playerDanmakuBlockrepeat_", "playerDanmakuBlockspecial_", "playerDanmakuOpacity_", "playerDanmakuScalingfactor_", "playerDanmakuDomain_", "playerDanmakuSpeed_", "playerDanmakuEnableblocklist_", "inlinePlayerDanmakuSwitch_", "inlinePlayerDanmakuConfig_", "playerDanmakuIosSwitchSave_", "playerDanmakuSeniorModeSwitch_", "playerDanmakuAiRecommendedLevelV2_", "playerDanmakuAiRecommendedLevelV2Map_", PlayerDanmakuAiRecommendedLevelV2MapDefaultEntryHolder.defaultEntry, "playerDanmakuEnableHerdDm_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmuPlayerConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmuPlayerConfig.class) {
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

    public int getInlinePlayerDanmakuConfig() {
        return this.inlinePlayerDanmakuConfig_;
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

    public boolean getPlayerDanmakuEnableblocklist() {
        return this.playerDanmakuEnableblocklist_;
    }

    public int getPlayerDanmakuIosSwitchSave() {
        return this.playerDanmakuIosSwitchSave_;
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

    public boolean getPlayerDanmakuSwitch() {
        return this.playerDanmakuSwitch_;
    }

    public boolean getPlayerDanmakuSwitchSave() {
        return this.playerDanmakuSwitchSave_;
    }

    public boolean getPlayerDanmakuUseDefaultConfig() {
        return this.playerDanmakuUseDefaultConfig_;
    }

    public static Builder newBuilder(DanmuPlayerConfig danmuPlayerConfig) {
        return DEFAULT_INSTANCE.createBuilder(danmuPlayerConfig);
    }

    public static DanmuPlayerConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmuPlayerConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DanmuPlayerConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmuPlayerConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmuPlayerConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmuPlayerConfig parseFrom(InputStream inputStream) throws IOException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmuPlayerConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmuPlayerConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmuPlayerConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmuPlayerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
