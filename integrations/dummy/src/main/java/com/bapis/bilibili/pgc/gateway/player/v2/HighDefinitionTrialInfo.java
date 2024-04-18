package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class HighDefinitionTrialInfo extends GeneratedMessageLite<HighDefinitionTrialInfo, HighDefinitionTrialInfo.Builder> implements MessageLiteOrBuilder {
    private static final HighDefinitionTrialInfo DEFAULT_INSTANCE;
    public static final int END_TOAST_FIELD_NUMBER = 6;
    public static final int NO_LONGER_TRIAL_BTN_FIELD_NUMBER = 9;
    private static volatile Parser<HighDefinitionTrialInfo> PARSER = null;
    public static final int QUALITY_OPEN_TIP_BTN_FIELD_NUMBER = 8;
    public static final int REMAINING_TIMES_FIELD_NUMBER = 2;
    public static final int REPORT_FIELD_NUMBER = 7;
    public static final int START_FIELD_NUMBER = 3;
    public static final int START_TOAST_FIELD_NUMBER = 5;
    public static final int TIME_LENGTH_FIELD_NUMBER = 4;
    public static final int TRIAL_ABLE_FIELD_NUMBER = 1;
    private Toast endToast_;
    private ButtonInfo noLongerTrialBtn_;
    private ButtonInfo qualityOpenTipBtn_;
    private int remainingTimes_;
    private Report report_;
    private Toast startToast_;
    private int start_;
    private int timeLength_;
    private boolean trialAble_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.HighDefinitionTrialInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78501 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17572xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17572xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17572xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17572xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17572xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17572xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17572xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17572xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HighDefinitionTrialInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78501 c78501) {
            this();
        }

        public Builder clearEndToast() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearEndToast();
            return this;
        }

        public Builder clearNoLongerTrialBtn() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearNoLongerTrialBtn();
            return this;
        }

        public Builder clearQualityOpenTipBtn() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearQualityOpenTipBtn();
            return this;
        }

        public Builder clearRemainingTimes() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearRemainingTimes();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearReport();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearStart();
            return this;
        }

        public Builder clearStartToast() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearStartToast();
            return this;
        }

        public Builder clearTimeLength() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearTimeLength();
            return this;
        }

        public Builder clearTrialAble() {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).clearTrialAble();
            return this;
        }

        public Toast getEndToast() {
            return ((HighDefinitionTrialInfo) this.instance).getEndToast();
        }

        public ButtonInfo getNoLongerTrialBtn() {
            return ((HighDefinitionTrialInfo) this.instance).getNoLongerTrialBtn();
        }

        public ButtonInfo getQualityOpenTipBtn() {
            return ((HighDefinitionTrialInfo) this.instance).getQualityOpenTipBtn();
        }

        public int getRemainingTimes() {
            return ((HighDefinitionTrialInfo) this.instance).getRemainingTimes();
        }

        public Report getReport() {
            return ((HighDefinitionTrialInfo) this.instance).getReport();
        }

        public int getStart() {
            return ((HighDefinitionTrialInfo) this.instance).getStart();
        }

        public Toast getStartToast() {
            return ((HighDefinitionTrialInfo) this.instance).getStartToast();
        }

        public int getTimeLength() {
            return ((HighDefinitionTrialInfo) this.instance).getTimeLength();
        }

        public boolean getTrialAble() {
            return ((HighDefinitionTrialInfo) this.instance).getTrialAble();
        }

        public boolean hasEndToast() {
            return ((HighDefinitionTrialInfo) this.instance).hasEndToast();
        }

        public boolean hasNoLongerTrialBtn() {
            return ((HighDefinitionTrialInfo) this.instance).hasNoLongerTrialBtn();
        }

        public boolean hasQualityOpenTipBtn() {
            return ((HighDefinitionTrialInfo) this.instance).hasQualityOpenTipBtn();
        }

        public boolean hasReport() {
            return ((HighDefinitionTrialInfo) this.instance).hasReport();
        }

        public boolean hasStartToast() {
            return ((HighDefinitionTrialInfo) this.instance).hasStartToast();
        }

        public Builder mergeEndToast(Toast toast) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).mergeEndToast(toast);
            return this;
        }

        public Builder mergeNoLongerTrialBtn(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).mergeNoLongerTrialBtn(buttonInfo);
            return this;
        }

        public Builder mergeQualityOpenTipBtn(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).mergeQualityOpenTipBtn(buttonInfo);
            return this;
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).mergeReport(report);
            return this;
        }

        public Builder mergeStartToast(Toast toast) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).mergeStartToast(toast);
            return this;
        }

        public Builder setEndToast(Toast toast) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setEndToast(toast);
            return this;
        }

        public Builder setNoLongerTrialBtn(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setNoLongerTrialBtn(buttonInfo);
            return this;
        }

        public Builder setQualityOpenTipBtn(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setQualityOpenTipBtn(buttonInfo);
            return this;
        }

        public Builder setRemainingTimes(int i) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setRemainingTimes(i);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setReport(report);
            return this;
        }

        public Builder setStart(int i) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setStart(i);
            return this;
        }

        public Builder setStartToast(Toast toast) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setStartToast(toast);
            return this;
        }

        public Builder setTimeLength(int i) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setTimeLength(i);
            return this;
        }

        public Builder setTrialAble(boolean z) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setTrialAble(z);
            return this;
        }

        private Builder() {
            super(HighDefinitionTrialInfo.DEFAULT_INSTANCE);
        }

        public Builder setNoLongerTrialBtn(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setNoLongerTrialBtn(builder.build());
            return this;
        }

        public Builder setQualityOpenTipBtn(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setQualityOpenTipBtn(builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((HighDefinitionTrialInfo) this.instance).setReport(builder.build());
            return this;
        }
    }

    static {
        HighDefinitionTrialInfo highDefinitionTrialInfo = new HighDefinitionTrialInfo();
        DEFAULT_INSTANCE = highDefinitionTrialInfo;
        GeneratedMessageLite.registerDefaultInstance(HighDefinitionTrialInfo.class, highDefinitionTrialInfo);
    }

    private HighDefinitionTrialInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndToast() {
        this.endToast_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoLongerTrialBtn() {
        this.noLongerTrialBtn_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQualityOpenTipBtn() {
        this.qualityOpenTipBtn_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemainingTimes() {
        this.remainingTimes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartToast() {
        this.startToast_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeLength() {
        this.timeLength_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrialAble() {
        this.trialAble_ = false;
    }

    public static HighDefinitionTrialInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndToast(Toast toast) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoLongerTrialBtn(ButtonInfo buttonInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQualityOpenTipBtn(ButtonInfo buttonInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(Report report) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartToast(Toast toast) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HighDefinitionTrialInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HighDefinitionTrialInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HighDefinitionTrialInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndToast(Toast toast) {
        toast.getClass();
        this.endToast_ = toast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoLongerTrialBtn(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        this.noLongerTrialBtn_ = buttonInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityOpenTipBtn(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        this.qualityOpenTipBtn_ = buttonInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemainingTimes(int i) {
        this.remainingTimes_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(Report report) {
        report.getClass();
        this.report_ = report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(int i) {
        this.start_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartToast(Toast toast) {
        toast.getClass();
        this.startToast_ = toast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeLength(int i) {
        this.timeLength_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrialAble(boolean z) {
        this.trialAble_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78501.f17572xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HighDefinitionTrialInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0004\u0005\t\u0006\t\u0007\t\b\t\t\t", new Object[]{"trialAble_", "remainingTimes_", "start_", "timeLength_", "startToast_", "endToast_", "report_", "qualityOpenTipBtn_", "noLongerTrialBtn_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HighDefinitionTrialInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (HighDefinitionTrialInfo.class) {
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

    public Toast getEndToast() {
        throw new RuntimeException();
    }

    public ButtonInfo getNoLongerTrialBtn() {
        ButtonInfo buttonInfo = this.noLongerTrialBtn_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    public ButtonInfo getQualityOpenTipBtn() {
        ButtonInfo buttonInfo = this.qualityOpenTipBtn_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    public int getRemainingTimes() {
        return this.remainingTimes_;
    }

    public Report getReport() {
        Report report = this.report_;
        return report == null ? Report.getDefaultInstance() : report;
    }

    public int getStart() {
        return this.start_;
    }

    public Toast getStartToast() {
        throw new RuntimeException();
    }

    public int getTimeLength() {
        return this.timeLength_;
    }

    public boolean getTrialAble() {
        return this.trialAble_;
    }

    public boolean hasEndToast() {
        return this.endToast_ != null;
    }

    public boolean hasNoLongerTrialBtn() {
        return this.noLongerTrialBtn_ != null;
    }

    public boolean hasQualityOpenTipBtn() {
        return this.qualityOpenTipBtn_ != null;
    }

    public boolean hasReport() {
        return this.report_ != null;
    }

    public boolean hasStartToast() {
        return this.startToast_ != null;
    }

    public static Builder newBuilder(HighDefinitionTrialInfo highDefinitionTrialInfo) {
        return DEFAULT_INSTANCE.createBuilder(highDefinitionTrialInfo);
    }

    public static HighDefinitionTrialInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HighDefinitionTrialInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HighDefinitionTrialInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HighDefinitionTrialInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HighDefinitionTrialInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HighDefinitionTrialInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HighDefinitionTrialInfo parseFrom(InputStream inputStream) throws IOException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HighDefinitionTrialInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HighDefinitionTrialInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HighDefinitionTrialInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HighDefinitionTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
