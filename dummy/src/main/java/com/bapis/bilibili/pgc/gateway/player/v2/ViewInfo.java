package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
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
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class ViewInfo extends GeneratedMessageLite<ViewInfo, ViewInfo.Builder> implements MessageLiteOrBuilder {
    public static final int ANIMATION_FIELD_NUMBER = 12;
    public static final int COUPON_INFO_FIELD_NUMBER = 3;
    private static final ViewInfo DEFAULT_INSTANCE;
    public static final int DEMAND_NO_PAY_EPIDS_FIELD_NUMBER = 4;
    public static final int DIALOG_FIELD_NUMBER = 1;
    public static final int END_PAGE_FIELD_NUMBER = 5;
    public static final int EXP_CONFIG_FIELD_NUMBER = 6;
    public static final int EXT_DIALOG_FIELD_NUMBER = 11;
    public static final int EXT_TOAST_FIELD_NUMBER = 13;
    public static final int HIGH_DEFINITION_TRIAL_INFO_FIELD_NUMBER = 10;
    private static volatile Parser<ViewInfo> PARSER = null;
    public static final int PAY_TIP_FIELD_NUMBER = 9;
    public static final int POP_WIN_FIELD_NUMBER = 7;
    public static final int TOAST_FIELD_NUMBER = 2;
    public static final int TRY_WATCH_PROMPT_BAR_FIELD_NUMBER = 8;
    private Animation animation_;
    private CouponInfo couponInfo_;
    private Dialog dialog_;
    private EndPage endPage_;
    private HighDefinitionTrialInfo highDefinitionTrialInfo_;
    private PayTip payTip_;
    private PopWin popWin_;
    private Toast toast_;
    private PromptBar tryWatchPromptBar_;
    private int demandNoPayEpidsMemoizedSerializedSize = -1;
    private MapFieldLite<String, Boolean> expConfig_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Dialog> extDialog_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Toast> extToast_ = MapFieldLite.emptyMapField();
    private Internal.LongList demandNoPayEpids_ = GeneratedMessageLite.emptyLongList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.ViewInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17607xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17607xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17607xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17607xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17607xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17607xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17607xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17607xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78941 c78941) {
            this();
        }

        public Builder addAllDemandNoPayEpids(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((ViewInfo) this.instance).addAllDemandNoPayEpids(iterable);
            return this;
        }

        public Builder addDemandNoPayEpids(long j) {
            copyOnWrite();
            ((ViewInfo) this.instance).addDemandNoPayEpids(j);
            return this;
        }

        public Builder clearAnimation() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearAnimation();
            return this;
        }

        @Deprecated
        public Builder clearCouponInfo() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearCouponInfo();
            return this;
        }

        public Builder clearDemandNoPayEpids() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearDemandNoPayEpids();
            return this;
        }

        public Builder clearDialog() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearDialog();
            return this;
        }

        public Builder clearEndPage() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearEndPage();
            return this;
        }

        public Builder clearExpConfig() {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExpConfigMap().clear();
            return this;
        }

        public Builder clearExtDialog() {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtDialogMap().clear();
            return this;
        }

        public Builder clearExtToast() {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtToastMap().clear();
            return this;
        }

        public Builder clearHighDefinitionTrialInfo() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearHighDefinitionTrialInfo();
            return this;
        }

        public Builder clearPayTip() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearPayTip();
            return this;
        }

        public Builder clearPopWin() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearPopWin();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearToast();
            return this;
        }

        public Builder clearTryWatchPromptBar() {
            copyOnWrite();
            ((ViewInfo) this.instance).clearTryWatchPromptBar();
            return this;
        }

        public boolean containsExpConfig(String str) {
            str.getClass();
            return ((ViewInfo) this.instance).getExpConfigMap().containsKey(str);
        }

        public boolean containsExtDialog(String str) {
            str.getClass();
            return ((ViewInfo) this.instance).getExtDialogMap().containsKey(str);
        }

        public boolean containsExtToast(String str) {
            str.getClass();
            return ((ViewInfo) this.instance).getExtToastMap().containsKey(str);
        }

        public Animation getAnimation() {
            return ((ViewInfo) this.instance).getAnimation();
        }

        @Deprecated
        public CouponInfo getCouponInfo() {
            return ((ViewInfo) this.instance).getCouponInfo();
        }

        public long getDemandNoPayEpids(int i) {
            return ((ViewInfo) this.instance).getDemandNoPayEpids(i);
        }

        public int getDemandNoPayEpidsCount() {
            return ((ViewInfo) this.instance).getDemandNoPayEpidsCount();
        }

        public List<Long> getDemandNoPayEpidsList() {
            return Collections.unmodifiableList(((ViewInfo) this.instance).getDemandNoPayEpidsList());
        }

        public Dialog getDialog() {
            return ((ViewInfo) this.instance).getDialog();
        }

        public EndPage getEndPage() {
            return ((ViewInfo) this.instance).getEndPage();
        }

        @Deprecated
        public Map<String, Boolean> getExpConfig() {
            return getExpConfigMap();
        }

        public int getExpConfigCount() {
            return ((ViewInfo) this.instance).getExpConfigMap().size();
        }

        public Map<String, Boolean> getExpConfigMap() {
            return Collections.unmodifiableMap(((ViewInfo) this.instance).getExpConfigMap());
        }

        public boolean getExpConfigOrDefault(String str, boolean z) {
            str.getClass();
            Map<String, Boolean> expConfigMap = ((ViewInfo) this.instance).getExpConfigMap();
            return expConfigMap.containsKey(str) ? expConfigMap.get(str).booleanValue() : z;
        }

        public boolean getExpConfigOrThrow(String str) {
            str.getClass();
            Map<String, Boolean> expConfigMap = ((ViewInfo) this.instance).getExpConfigMap();
            if (expConfigMap.containsKey(str)) {
                return expConfigMap.get(str).booleanValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Dialog> getExtDialog() {
            return getExtDialogMap();
        }

        public int getExtDialogCount() {
            return ((ViewInfo) this.instance).getExtDialogMap().size();
        }

        public Map<String, Dialog> getExtDialogMap() {
            return Collections.unmodifiableMap(((ViewInfo) this.instance).getExtDialogMap());
        }

        public Dialog getExtDialogOrDefault(String str, Dialog dialog) {
            str.getClass();
            Map<String, Dialog> extDialogMap = ((ViewInfo) this.instance).getExtDialogMap();
            return extDialogMap.containsKey(str) ? extDialogMap.get(str) : dialog;
        }

        public Dialog getExtDialogOrThrow(String str) {
            str.getClass();
            Map<String, Dialog> extDialogMap = ((ViewInfo) this.instance).getExtDialogMap();
            if (extDialogMap.containsKey(str)) {
                return extDialogMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Toast> getExtToast() {
            return getExtToastMap();
        }

        public int getExtToastCount() {
            return ((ViewInfo) this.instance).getExtToastMap().size();
        }

        public Map<String, Toast> getExtToastMap() {
            return Collections.unmodifiableMap(((ViewInfo) this.instance).getExtToastMap());
        }

        public Toast getExtToastOrDefault(String str, Toast toast) {
            str.getClass();
            Map<String, Toast> extToastMap = ((ViewInfo) this.instance).getExtToastMap();
            return extToastMap.containsKey(str) ? extToastMap.get(str) : toast;
        }

        public Toast getExtToastOrThrow(String str) {
            str.getClass();
            Map<String, Toast> extToastMap = ((ViewInfo) this.instance).getExtToastMap();
            if (extToastMap.containsKey(str)) {
                return extToastMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public HighDefinitionTrialInfo getHighDefinitionTrialInfo() {
            return ((ViewInfo) this.instance).getHighDefinitionTrialInfo();
        }

        public PayTip getPayTip() {
            return ((ViewInfo) this.instance).getPayTip();
        }

        public PopWin getPopWin() {
            return ((ViewInfo) this.instance).getPopWin();
        }

        public Toast getToast() {
            return ((ViewInfo) this.instance).getToast();
        }

        public PromptBar getTryWatchPromptBar() {
            return ((ViewInfo) this.instance).getTryWatchPromptBar();
        }

        public boolean hasAnimation() {
            return ((ViewInfo) this.instance).hasAnimation();
        }

        @Deprecated
        public boolean hasCouponInfo() {
            return ((ViewInfo) this.instance).hasCouponInfo();
        }

        public boolean hasDialog() {
            return ((ViewInfo) this.instance).hasDialog();
        }

        public boolean hasEndPage() {
            return ((ViewInfo) this.instance).hasEndPage();
        }

        public boolean hasHighDefinitionTrialInfo() {
            return ((ViewInfo) this.instance).hasHighDefinitionTrialInfo();
        }

        public boolean hasPayTip() {
            return ((ViewInfo) this.instance).hasPayTip();
        }

        public boolean hasPopWin() {
            return ((ViewInfo) this.instance).hasPopWin();
        }

        public boolean hasToast() {
            return ((ViewInfo) this.instance).hasToast();
        }

        public boolean hasTryWatchPromptBar() {
            return ((ViewInfo) this.instance).hasTryWatchPromptBar();
        }

        public Builder mergeAnimation(Animation animation) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergeAnimation(animation);
            return this;
        }

        @Deprecated
        public Builder mergeCouponInfo(CouponInfo couponInfo) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergeCouponInfo(couponInfo);
            return this;
        }

        public Builder mergeDialog(Dialog dialog) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergeDialog(dialog);
            return this;
        }

        public Builder mergeEndPage(EndPage endPage) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergeEndPage(endPage);
            return this;
        }

        public Builder mergeHighDefinitionTrialInfo(HighDefinitionTrialInfo highDefinitionTrialInfo) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergeHighDefinitionTrialInfo(highDefinitionTrialInfo);
            return this;
        }

        public Builder mergePayTip(PayTip payTip) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergePayTip(payTip);
            return this;
        }

        public Builder mergePopWin(PopWin popWin) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergePopWin(popWin);
            return this;
        }

        public Builder mergeToast(Toast toast) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergeToast(toast);
            return this;
        }

        public Builder mergeTryWatchPromptBar(PromptBar promptBar) {
            copyOnWrite();
            ((ViewInfo) this.instance).mergeTryWatchPromptBar(promptBar);
            return this;
        }

        public Builder putAllExpConfig(Map<String, Boolean> map) {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExpConfigMap().putAll(map);
            return this;
        }

        public Builder putAllExtDialog(Map<String, Dialog> map) {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtDialogMap().putAll(map);
            return this;
        }

        public Builder putAllExtToast(Map<String, Toast> map) {
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtToastMap().putAll(map);
            return this;
        }

        public Builder putExpConfig(String str, boolean z) {
            str.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExpConfigMap().put(str, Boolean.valueOf(z));
            return this;
        }

        public Builder putExtDialog(String str, Dialog dialog) {
            str.getClass();
            dialog.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtDialogMap().put(str, dialog);
            return this;
        }

        public Builder putExtToast(String str, Toast toast) {
            str.getClass();
            toast.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtToastMap().put(str, toast);
            return this;
        }

        public Builder removeExpConfig(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExpConfigMap().remove(str);
            return this;
        }

        public Builder removeExtDialog(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtDialogMap().remove(str);
            return this;
        }

        public Builder removeExtToast(String str) {
            str.getClass();
            copyOnWrite();
            ((ViewInfo) this.instance).getMutableExtToastMap().remove(str);
            return this;
        }

        public Builder setAnimation(Animation animation) {
            copyOnWrite();
            ((ViewInfo) this.instance).setAnimation(animation);
            return this;
        }

        @Deprecated
        public Builder setCouponInfo(CouponInfo couponInfo) {
            copyOnWrite();
            ((ViewInfo) this.instance).setCouponInfo(couponInfo);
            return this;
        }

        public Builder setDemandNoPayEpids(int i, long j) {
            copyOnWrite();
            ((ViewInfo) this.instance).setDemandNoPayEpids(i, j);
            return this;
        }

        public Builder setDialog(Dialog dialog) {
            copyOnWrite();
            ((ViewInfo) this.instance).setDialog(dialog);
            return this;
        }

        public Builder setEndPage(EndPage endPage) {
            copyOnWrite();
            ((ViewInfo) this.instance).setEndPage(endPage);
            return this;
        }

        public Builder setHighDefinitionTrialInfo(HighDefinitionTrialInfo highDefinitionTrialInfo) {
            copyOnWrite();
            ((ViewInfo) this.instance).setHighDefinitionTrialInfo(highDefinitionTrialInfo);
            return this;
        }

        public Builder setPayTip(PayTip payTip) {
            copyOnWrite();
            ((ViewInfo) this.instance).setPayTip(payTip);
            return this;
        }

        public Builder setPopWin(PopWin popWin) {
            copyOnWrite();
            ((ViewInfo) this.instance).setPopWin(popWin);
            return this;
        }

        public Builder setToast(Toast toast) {
            copyOnWrite();
            ((ViewInfo) this.instance).setToast(toast);
            return this;
        }

        public Builder setTryWatchPromptBar(PromptBar promptBar) {
            copyOnWrite();
            ((ViewInfo) this.instance).setTryWatchPromptBar(promptBar);
            return this;
        }

        private Builder() {
            super(ViewInfo.DEFAULT_INSTANCE);
        }

        public Builder setAnimation(Animation.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setAnimation(builder.build());
            return this;
        }

        @Deprecated
        public Builder setCouponInfo(CouponInfo.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setCouponInfo(builder.build());
            return this;
        }

        public Builder setDialog(Dialog.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setDialog(builder.build());
            return this;
        }

        public Builder setEndPage(EndPage.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setEndPage(builder.build());
            return this;
        }

        public Builder setHighDefinitionTrialInfo(HighDefinitionTrialInfo.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setHighDefinitionTrialInfo(builder.build());
            return this;
        }

        public Builder setPayTip(PayTip.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setPayTip(builder.build());
            return this;
        }

        public Builder setPopWin(PopWin.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setPopWin(builder.build());
            return this;
        }

        public Builder setTryWatchPromptBar(PromptBar.Builder builder) {
            copyOnWrite();
            ((ViewInfo) this.instance).setTryWatchPromptBar(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ExpConfigDefaultEntryHolder {
        static final MapEntryLite<String, Boolean> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BOOL, Boolean.FALSE);

        private ExpConfigDefaultEntryHolder() {
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ExtDialogDefaultEntryHolder {
        static final MapEntryLite<String, Dialog> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Dialog.getDefaultInstance());

        private ExtDialogDefaultEntryHolder() {
        }
    }

    static {
        ViewInfo viewInfo = new ViewInfo();
        DEFAULT_INSTANCE = viewInfo;
        GeneratedMessageLite.registerDefaultInstance(ViewInfo.class, viewInfo);
    }

    private ViewInfo() {
    }

    public void addAllDemandNoPayEpids(Iterable<? extends Long> iterable) {
        ensureDemandNoPayEpidsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.demandNoPayEpids_);
    }

    public void addDemandNoPayEpids(long j) {
        ensureDemandNoPayEpidsIsMutable();
        this.demandNoPayEpids_.addLong(j);
    }

    public void clearAnimation() {
        this.animation_ = null;
    }

    public void clearCouponInfo() {
        this.couponInfo_ = null;
    }

    public void clearDemandNoPayEpids() {
        this.demandNoPayEpids_ = GeneratedMessageLite.emptyLongList();
    }

    public void clearDialog() {
        this.dialog_ = null;
    }

    public void clearEndPage() {
        this.endPage_ = null;
    }

    public void clearHighDefinitionTrialInfo() {
        this.highDefinitionTrialInfo_ = null;
    }

    public void clearPayTip() {
        this.payTip_ = null;
    }

    public void clearPopWin() {
        this.popWin_ = null;
    }

    public void clearToast() {
        this.toast_ = null;
    }

    public void clearTryWatchPromptBar() {
        this.tryWatchPromptBar_ = null;
    }

    private void ensureDemandNoPayEpidsIsMutable() {
        Internal.LongList longList = this.demandNoPayEpids_;
        if (longList.isModifiable()) {
            return;
        }
        this.demandNoPayEpids_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static ViewInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, Boolean> getMutableExpConfigMap() {
        return internalGetMutableExpConfig();
    }

    public Map<String, Dialog> getMutableExtDialogMap() {
        return internalGetMutableExtDialog();
    }

    public Map<String, Toast> getMutableExtToastMap() {
        return internalGetMutableExtToast();
    }

    private MapFieldLite<String, Boolean> internalGetExpConfig() {
        return this.expConfig_;
    }

    private MapFieldLite<String, Dialog> internalGetExtDialog() {
        return this.extDialog_;
    }

    private MapFieldLite<String, Toast> internalGetExtToast() {
        return this.extToast_;
    }

    private MapFieldLite<String, Boolean> internalGetMutableExpConfig() {
        if (!this.expConfig_.isMutable()) {
            this.expConfig_ = this.expConfig_.mutableCopy();
        }
        return this.expConfig_;
    }

    private MapFieldLite<String, Dialog> internalGetMutableExtDialog() {
        if (!this.extDialog_.isMutable()) {
            this.extDialog_ = this.extDialog_.mutableCopy();
        }
        return this.extDialog_;
    }

    private MapFieldLite<String, Toast> internalGetMutableExtToast() {
        if (!this.extToast_.isMutable()) {
            this.extToast_ = this.extToast_.mutableCopy();
        }
        return this.extToast_;
    }

    public void mergeAnimation(Animation animation) {
    }

    public void mergeCouponInfo(CouponInfo couponInfo) {
    }

    public void mergeDialog(Dialog dialog) {
    }

    public void mergeEndPage(EndPage endPage) {
    }

    public void mergeHighDefinitionTrialInfo(HighDefinitionTrialInfo highDefinitionTrialInfo) {
    }

    public void mergePayTip(PayTip payTip) {
    }

    public void mergePopWin(PopWin popWin) {
    }

    public void mergeToast(Toast toast) {
    }

    public void mergeTryWatchPromptBar(PromptBar promptBar) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAnimation(Animation animation) {
        animation.getClass();
        this.animation_ = animation;
    }

    public void setCouponInfo(CouponInfo couponInfo) {
        couponInfo.getClass();
        this.couponInfo_ = couponInfo;
    }

    public void setDemandNoPayEpids(int i, long j) {
        ensureDemandNoPayEpidsIsMutable();
        this.demandNoPayEpids_.setLong(i, j);
    }

    public void setDialog(Dialog dialog) {
        dialog.getClass();
        this.dialog_ = dialog;
    }

    public void setEndPage(EndPage endPage) {
        endPage.getClass();
        this.endPage_ = endPage;
    }

    public void setHighDefinitionTrialInfo(HighDefinitionTrialInfo highDefinitionTrialInfo) {
        highDefinitionTrialInfo.getClass();
        this.highDefinitionTrialInfo_ = highDefinitionTrialInfo;
    }

    public void setPayTip(PayTip payTip) {
        payTip.getClass();
        this.payTip_ = payTip;
    }

    public void setPopWin(PopWin popWin) {
        popWin.getClass();
        this.popWin_ = popWin;
    }

    public void setToast(Toast toast) {
        toast.getClass();
        this.toast_ = toast;
    }

    public void setTryWatchPromptBar(PromptBar promptBar) {
        promptBar.getClass();
        this.tryWatchPromptBar_ = promptBar;
    }

    public boolean containsExpConfig(String str) {
        str.getClass();
        return internalGetExpConfig().containsKey(str);
    }

    public boolean containsExtDialog(String str) {
        str.getClass();
        return internalGetExtDialog().containsKey(str);
    }

    public boolean containsExtToast(String str) {
        str.getClass();
        return internalGetExtToast().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        return null;
    }

    public Animation getAnimation() {
        Animation animation = this.animation_;
        return animation == null ? Animation.getDefaultInstance() : animation;
    }

    @Deprecated
    public CouponInfo getCouponInfo() {
        CouponInfo couponInfo = this.couponInfo_;
        return couponInfo == null ? CouponInfo.getDefaultInstance() : couponInfo;
    }

    public long getDemandNoPayEpids(int i) {
        return this.demandNoPayEpids_.getLong(i);
    }

    public int getDemandNoPayEpidsCount() {
        return this.demandNoPayEpids_.size();
    }

    public List<Long> getDemandNoPayEpidsList() {
        return this.demandNoPayEpids_;
    }

    public Dialog getDialog() {
        Dialog dialog = this.dialog_;
        return dialog == null ? Dialog.getDefaultInstance() : dialog;
    }

    public EndPage getEndPage() {
        EndPage endPage = this.endPage_;
        return endPage == null ? EndPage.getDefaultInstance() : endPage;
    }

    @Deprecated
    public Map<String, Boolean> getExpConfig() {
        return getExpConfigMap();
    }

    public int getExpConfigCount() {
        return internalGetExpConfig().size();
    }

    public Map<String, Boolean> getExpConfigMap() {
        return Collections.unmodifiableMap(internalGetExpConfig());
    }

    public boolean getExpConfigOrDefault(String str, boolean z) {
        str.getClass();
        MapFieldLite<String, Boolean> internalGetExpConfig = internalGetExpConfig();
        return internalGetExpConfig.containsKey(str) ? internalGetExpConfig.get(str).booleanValue() : z;
    }

    public boolean getExpConfigOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Boolean> internalGetExpConfig = internalGetExpConfig();
        if (internalGetExpConfig.containsKey(str)) {
            return internalGetExpConfig.get(str).booleanValue();
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, Dialog> getExtDialog() {
        return getExtDialogMap();
    }

    public int getExtDialogCount() {
        return internalGetExtDialog().size();
    }

    public Map<String, Dialog> getExtDialogMap() {
        return Collections.unmodifiableMap(internalGetExtDialog());
    }

    public Dialog getExtDialogOrDefault(String str, Dialog dialog) {
        str.getClass();
        MapFieldLite<String, Dialog> internalGetExtDialog = internalGetExtDialog();
        return internalGetExtDialog.containsKey(str) ? internalGetExtDialog.get(str) : dialog;
    }

    public Dialog getExtDialogOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Dialog> internalGetExtDialog = internalGetExtDialog();
        if (internalGetExtDialog.containsKey(str)) {
            return internalGetExtDialog.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, Toast> getExtToast() {
        return getExtToastMap();
    }

    public int getExtToastCount() {
        return internalGetExtToast().size();
    }

    public Map<String, Toast> getExtToastMap() {
        return Collections.unmodifiableMap(internalGetExtToast());
    }

    public Toast getExtToastOrDefault(String str, Toast toast) {
        str.getClass();
        MapFieldLite<String, Toast> internalGetExtToast = internalGetExtToast();
        return internalGetExtToast.containsKey(str) ? internalGetExtToast.get(str) : toast;
    }

    public Toast getExtToastOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Toast> internalGetExtToast = internalGetExtToast();
        if (internalGetExtToast.containsKey(str)) {
            return internalGetExtToast.get(str);
        }
        throw new IllegalArgumentException();
    }

    public HighDefinitionTrialInfo getHighDefinitionTrialInfo() {
        HighDefinitionTrialInfo highDefinitionTrialInfo = this.highDefinitionTrialInfo_;
        return highDefinitionTrialInfo == null ? HighDefinitionTrialInfo.getDefaultInstance() : highDefinitionTrialInfo;
    }

    public PayTip getPayTip() {
        PayTip payTip = this.payTip_;
        return payTip == null ? PayTip.getDefaultInstance() : payTip;
    }

    public PopWin getPopWin() {
        PopWin popWin = this.popWin_;
        return popWin == null ? PopWin.getDefaultInstance() : popWin;
    }

    public Toast getToast() {
        throw new RuntimeException();
    }

    public PromptBar getTryWatchPromptBar() {
        PromptBar promptBar = this.tryWatchPromptBar_;
        return promptBar == null ? PromptBar.getDefaultInstance() : promptBar;
    }

    public boolean hasAnimation() {
        return this.animation_ != null;
    }

    @Deprecated
    public boolean hasCouponInfo() {
        return this.couponInfo_ != null;
    }

    public boolean hasDialog() {
        return this.dialog_ != null;
    }

    public boolean hasEndPage() {
        return this.endPage_ != null;
    }

    public boolean hasHighDefinitionTrialInfo() {
        return this.highDefinitionTrialInfo_ != null;
    }

    public boolean hasPayTip() {
        return this.payTip_ != null;
    }

    public boolean hasPopWin() {
        return this.popWin_ != null;
    }

    public boolean hasToast() {
        return this.toast_ != null;
    }

    public boolean hasTryWatchPromptBar() {
        return this.tryWatchPromptBar_ != null;
    }

    public static Builder newBuilder(ViewInfo viewInfo) {
        return DEFAULT_INSTANCE.createBuilder(viewInfo);
    }

    public static ViewInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(InputStream inputStream) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
