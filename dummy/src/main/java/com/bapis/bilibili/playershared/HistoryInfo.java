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
public final class HistoryInfo extends GeneratedMessageLite<HistoryInfo, HistoryInfo.Builder> implements MessageLiteOrBuilder {
    private static final HistoryInfo DEFAULT_INSTANCE;
    public static final int LAST_PLAY_AID_FIELD_NUMBER = 5;
    public static final int LAST_PLAY_CID_FIELD_NUMBER = 2;
    private static volatile Parser<HistoryInfo> PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 1;
    public static final int TOAST_FIELD_NUMBER = 3;
    public static final int TOAST_WITHOUT_TIME_FIELD_NUMBER = 4;
    private long lastPlayAid_;
    private long lastPlayCid_;
    private long progress_;
    private Toast toastWithoutTime_;
    private Toast toast_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.HistoryInfo$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81831 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17904xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17904xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17904xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17904xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17904xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17904xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17904xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17904xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HistoryInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81831 c81831) {
            this();
        }

        public Builder clearLastPlayAid() {
            copyOnWrite();
            ((HistoryInfo) this.instance).clearLastPlayAid();
            return this;
        }

        public Builder clearLastPlayCid() {
            copyOnWrite();
            ((HistoryInfo) this.instance).clearLastPlayCid();
            return this;
        }

        public Builder clearProgress() {
            copyOnWrite();
            ((HistoryInfo) this.instance).clearProgress();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((HistoryInfo) this.instance).clearToast();
            return this;
        }

        public Builder clearToastWithoutTime() {
            copyOnWrite();
            ((HistoryInfo) this.instance).clearToastWithoutTime();
            return this;
        }

        public long getLastPlayAid() {
            return ((HistoryInfo) this.instance).getLastPlayAid();
        }

        public long getLastPlayCid() {
            return ((HistoryInfo) this.instance).getLastPlayCid();
        }

        public long getProgress() {
            return ((HistoryInfo) this.instance).getProgress();
        }

        public Toast getToast() {
            return ((HistoryInfo) this.instance).getToast();
        }

        public Toast getToastWithoutTime() {
            return ((HistoryInfo) this.instance).getToastWithoutTime();
        }

        public boolean hasToast() {
            return ((HistoryInfo) this.instance).hasToast();
        }

        public boolean hasToastWithoutTime() {
            return ((HistoryInfo) this.instance).hasToastWithoutTime();
        }

        public Builder mergeToast(Toast toast) {
            copyOnWrite();
            ((HistoryInfo) this.instance).mergeToast(toast);
            return this;
        }

        public Builder mergeToastWithoutTime(Toast toast) {
            copyOnWrite();
            ((HistoryInfo) this.instance).mergeToastWithoutTime(toast);
            return this;
        }

        public Builder setLastPlayAid(long j) {
            copyOnWrite();
            ((HistoryInfo) this.instance).setLastPlayAid(j);
            return this;
        }

        public Builder setLastPlayCid(long j) {
            copyOnWrite();
            ((HistoryInfo) this.instance).setLastPlayCid(j);
            return this;
        }

        public Builder setProgress(long j) {
            copyOnWrite();
            ((HistoryInfo) this.instance).setProgress(j);
            return this;
        }

        public Builder setToast(Toast toast) {
            copyOnWrite();
            ((HistoryInfo) this.instance).setToast(toast);
            return this;
        }

        public Builder setToastWithoutTime(Toast toast) {
            copyOnWrite();
            ((HistoryInfo) this.instance).setToastWithoutTime(toast);
            return this;
        }

        private Builder() {
            super(HistoryInfo.DEFAULT_INSTANCE);
        }

        public Builder setToast(Toast.Builder builder) {
            copyOnWrite();
            ((HistoryInfo) this.instance).setToast(builder.build());
            return this;
        }

        public Builder setToastWithoutTime(Toast.Builder builder) {
            copyOnWrite();
            ((HistoryInfo) this.instance).setToastWithoutTime(builder.build());
            return this;
        }
    }

    static {
        HistoryInfo historyInfo = new HistoryInfo();
        DEFAULT_INSTANCE = historyInfo;
        GeneratedMessageLite.registerDefaultInstance(HistoryInfo.class, historyInfo);
    }

    public HistoryInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPlayAid() {
        this.lastPlayAid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPlayCid() {
        this.lastPlayCid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProgress() {
        this.progress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToast() {
        this.toast_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastWithoutTime() {
        this.toastWithoutTime_ = null;
    }

    public static HistoryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToast(Toast toast) {
        toast.getClass();
        Toast toast2 = this.toast_;
        if (toast2 != null && toast2 != Toast.getDefaultInstance()) {
            this.toast_ = Toast.newBuilder(this.toast_).mergeFrom((Toast) toast).buildPartial();
        } else {
            this.toast_ = toast;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToastWithoutTime(Toast toast) {
        toast.getClass();
        Toast toast2 = this.toastWithoutTime_;
        if (toast2 != null && toast2 != Toast.getDefaultInstance()) {
            this.toastWithoutTime_ = Toast.newBuilder(this.toastWithoutTime_).mergeFrom((Toast) toast).buildPartial();
        } else {
            this.toastWithoutTime_ = toast;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HistoryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HistoryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HistoryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HistoryInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPlayAid(long j) {
        this.lastPlayAid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPlayCid(long j) {
        this.lastPlayCid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(long j) {
        this.progress_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(Toast toast) {
        toast.getClass();
        this.toast_ = toast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastWithoutTime(Toast toast) {
        toast.getClass();
        this.toastWithoutTime_ = toast;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81831.f17904xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HistoryInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\t\u0004\t\u0005\u0002", new Object[]{"progress_", "lastPlayCid_", "toast_", "toastWithoutTime_", "lastPlayAid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HistoryInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (HistoryInfo.class) {
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

    public long getLastPlayAid() {
        return this.lastPlayAid_;
    }

    public long getLastPlayCid() {
        return this.lastPlayCid_;
    }

    public long getProgress() {
        return this.progress_;
    }

    public Toast getToast() {
        Toast toast = this.toast_;
        return toast == null ? Toast.getDefaultInstance() : toast;
    }

    public Toast getToastWithoutTime() {
        Toast toast = this.toastWithoutTime_;
        return toast == null ? Toast.getDefaultInstance() : toast;
    }

    public boolean hasToast() {
        return this.toast_ != null;
    }

    public boolean hasToastWithoutTime() {
        return this.toastWithoutTime_ != null;
    }

    public static Builder newBuilder(HistoryInfo historyInfo) {
        return DEFAULT_INSTANCE.createBuilder(historyInfo);
    }

    public static HistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistoryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HistoryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HistoryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HistoryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HistoryInfo parseFrom(InputStream inputStream) throws IOException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HistoryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
