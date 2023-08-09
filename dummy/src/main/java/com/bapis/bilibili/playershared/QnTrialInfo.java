package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class QnTrialInfo extends GeneratedMessageLite<QnTrialInfo, QnTrialInfo.Builder> implements MessageLiteOrBuilder {
    private static final QnTrialInfo DEFAULT_INSTANCE;
    public static final int END_TOAST_FIELD_NUMBER = 6;
    private static volatile Parser<QnTrialInfo> PARSER = null;
    public static final int QUALITY_OPEN_TIP_BTN_FIELD_NUMBER = 8;
    public static final int REMAINING_TIMES_FIELD_NUMBER = 2;
    public static final int START_FIELD_NUMBER = 3;
    public static final int START_TOAST_FIELD_NUMBER = 5;
    public static final int TIME_LENGTH_FIELD_NUMBER = 4;
    public static final int TRIAL_ABLE_FIELD_NUMBER = 1;
    private Toast endToast_;
    private Button qualityOpenTipBtn_;
    private int remainingTimes_;
    private Toast startToast_;
    private int start_;
    private int timeLength_;
    private boolean trialAble_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.QnTrialInfo$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17915xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17915xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17915xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17915xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17915xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17915xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17915xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17915xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<QnTrialInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81961 c81961) {
            this();
        }

        public Builder clearEndToast() {
            copyOnWrite();
            ((QnTrialInfo) this.instance).clearEndToast();
            return this;
        }

        public Builder clearQualityOpenTipBtn() {
            copyOnWrite();
            ((QnTrialInfo) this.instance).clearQualityOpenTipBtn();
            return this;
        }

        public Builder clearRemainingTimes() {
            copyOnWrite();
            ((QnTrialInfo) this.instance).clearRemainingTimes();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((QnTrialInfo) this.instance).clearStart();
            return this;
        }

        public Builder clearStartToast() {
            copyOnWrite();
            ((QnTrialInfo) this.instance).clearStartToast();
            return this;
        }

        public Builder clearTimeLength() {
            copyOnWrite();
            ((QnTrialInfo) this.instance).clearTimeLength();
            return this;
        }

        public Builder clearTrialAble() {
            copyOnWrite();
            ((QnTrialInfo) this.instance).clearTrialAble();
            return this;
        }

        public Toast getEndToast() {
            return ((QnTrialInfo) this.instance).getEndToast();
        }

        public Button getQualityOpenTipBtn() {
            return ((QnTrialInfo) this.instance).getQualityOpenTipBtn();
        }

        public int getRemainingTimes() {
            return ((QnTrialInfo) this.instance).getRemainingTimes();
        }

        public int getStart() {
            return ((QnTrialInfo) this.instance).getStart();
        }

        public Toast getStartToast() {
            return ((QnTrialInfo) this.instance).getStartToast();
        }

        public int getTimeLength() {
            return ((QnTrialInfo) this.instance).getTimeLength();
        }

        public boolean getTrialAble() {
            return ((QnTrialInfo) this.instance).getTrialAble();
        }

        public boolean hasEndToast() {
            return ((QnTrialInfo) this.instance).hasEndToast();
        }

        public boolean hasQualityOpenTipBtn() {
            return ((QnTrialInfo) this.instance).hasQualityOpenTipBtn();
        }

        public boolean hasStartToast() {
            return ((QnTrialInfo) this.instance).hasStartToast();
        }

        public Builder mergeEndToast(Toast toast) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).mergeEndToast(toast);
            return this;
        }

        public Builder mergeQualityOpenTipBtn(Button button) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).mergeQualityOpenTipBtn(button);
            return this;
        }

        public Builder mergeStartToast(Toast toast) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).mergeStartToast(toast);
            return this;
        }

        public Builder setEndToast(Toast toast) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setEndToast(toast);
            return this;
        }

        public Builder setQualityOpenTipBtn(Button button) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setQualityOpenTipBtn(button);
            return this;
        }

        public Builder setRemainingTimes(int i) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setRemainingTimes(i);
            return this;
        }

        public Builder setStart(int i) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setStart(i);
            return this;
        }

        public Builder setStartToast(Toast toast) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setStartToast(toast);
            return this;
        }

        public Builder setTimeLength(int i) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setTimeLength(i);
            return this;
        }

        public Builder setTrialAble(boolean z) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setTrialAble(z);
            return this;
        }

        private Builder() {
            super(QnTrialInfo.DEFAULT_INSTANCE);
        }

        public Builder setEndToast(Toast.Builder builder) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setEndToast(builder.build());
            return this;
        }

        public Builder setQualityOpenTipBtn(Button.Builder builder) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setQualityOpenTipBtn(builder.build());
            return this;
        }

        public Builder setStartToast(Toast.Builder builder) {
            copyOnWrite();
            ((QnTrialInfo) this.instance).setStartToast(builder.build());
            return this;
        }
    }

    static {
        QnTrialInfo qnTrialInfo = new QnTrialInfo();
        DEFAULT_INSTANCE = qnTrialInfo;
        GeneratedMessageLite.registerDefaultInstance(QnTrialInfo.class, qnTrialInfo);
    }

    private QnTrialInfo() {
    }

    public void clearEndToast() {
        this.endToast_ = null;
    }

    public void clearQualityOpenTipBtn() {
        this.qualityOpenTipBtn_ = null;
    }

    public void clearRemainingTimes() {
        this.remainingTimes_ = 0;
    }

    public void clearStart() {
        this.start_ = 0;
    }

    public void clearStartToast() {
        this.startToast_ = null;
    }

    public void clearTimeLength() {
        this.timeLength_ = 0;
    }

    public void clearTrialAble() {
        this.trialAble_ = false;
    }

    public static QnTrialInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeEndToast(Toast toast) {
        toast.getClass();
        Toast toast2 = this.endToast_;
        if (toast2 != null && toast2 != Toast.getDefaultInstance()) {
            this.endToast_ = Toast.newBuilder(this.endToast_).mergeFrom((Toast) toast).buildPartial();
        } else {
            this.endToast_ = toast;
        }
    }

    public void mergeQualityOpenTipBtn(Button button) {
        button.getClass();
        Button button2 = this.qualityOpenTipBtn_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.qualityOpenTipBtn_ = Button.newBuilder(this.qualityOpenTipBtn_).mergeFrom((Button) button).buildPartial();
        } else {
            this.qualityOpenTipBtn_ = button;
        }
    }

    public void mergeStartToast(Toast toast) {
        toast.getClass();
        Toast toast2 = this.startToast_;
        if (toast2 != null && toast2 != Toast.getDefaultInstance()) {
            this.startToast_ = Toast.newBuilder(this.startToast_).mergeFrom((Toast) toast).buildPartial();
        } else {
            this.startToast_ = toast;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QnTrialInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QnTrialInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QnTrialInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<QnTrialInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setEndToast(Toast toast) {
        toast.getClass();
        this.endToast_ = toast;
    }

    public void setQualityOpenTipBtn(Button button) {
        button.getClass();
        this.qualityOpenTipBtn_ = button;
    }

    public void setRemainingTimes(int i) {
        this.remainingTimes_ = i;
    }

    public void setStart(int i) {
        this.start_ = i;
    }

    public void setStartToast(Toast toast) {
        toast.getClass();
        this.startToast_ = toast;
    }

    public void setTimeLength(int i) {
        this.timeLength_ = i;
    }

    public void setTrialAble(boolean z) {
        this.trialAble_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81961.f17915xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new QnTrialInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0004\u0005\t\u0006\t\b\t", new Object[]{"trialAble_", "remainingTimes_", "start_", "timeLength_", "startToast_", "endToast_", "qualityOpenTipBtn_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QnTrialInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (QnTrialInfo.class) {
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
        Toast toast = this.endToast_;
        return toast == null ? Toast.getDefaultInstance() : toast;
    }

    public Button getQualityOpenTipBtn() {
        Button button = this.qualityOpenTipBtn_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public int getRemainingTimes() {
        return this.remainingTimes_;
    }

    public int getStart() {
        return this.start_;
    }

    public Toast getStartToast() {
        Toast toast = this.startToast_;
        return toast == null ? Toast.getDefaultInstance() : toast;
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

    public boolean hasQualityOpenTipBtn() {
        return this.qualityOpenTipBtn_ != null;
    }

    public boolean hasStartToast() {
        return this.startToast_ != null;
    }

    public static Builder newBuilder(QnTrialInfo qnTrialInfo) {
        return DEFAULT_INSTANCE.createBuilder(qnTrialInfo);
    }

    public static QnTrialInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QnTrialInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QnTrialInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QnTrialInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QnTrialInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QnTrialInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QnTrialInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QnTrialInfo parseFrom(InputStream inputStream) throws IOException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QnTrialInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QnTrialInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QnTrialInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QnTrialInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
