package com.bapis.bilibili.pgc.gateway.player.v2;

import com.google.protobuf.AbstractMessageLite;
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
public final class WatchProgress extends GeneratedMessageLite<WatchProgress, WatchProgress.Builder> implements MessageLiteOrBuilder {
    private static final WatchProgress DEFAULT_INSTANCE;
    public static final int LAST_EP_ID_FIELD_NUMBER = 1;
    public static final int LAST_EP_INDEX_FIELD_NUMBER = 2;
    public static final int LAST_PLAY_AID_FIELD_NUMBER = 7;
    public static final int LAST_PLAY_CID_FIELD_NUMBER = 4;
    private static volatile Parser<WatchProgress> PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 3;
    public static final int TOAST_FIELD_NUMBER = 5;
    public static final int TOAST_WITHOUT_TIME_FIELD_NUMBER = 6;
    private int lastEpId_;
    private String lastEpIndex_ = "";
    private long lastPlayAid_;
    private long lastPlayCid_;
    private long progress_;
    private Toast toastWithoutTime_;
    private Toast toast_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.WatchProgress$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17608xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17608xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17608xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17608xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17608xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17608xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17608xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17608xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<WatchProgress, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78951 c78951) {
            this();
        }

        public Builder clearLastEpId() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearLastEpId();
            return this;
        }

        public Builder clearLastEpIndex() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearLastEpIndex();
            return this;
        }

        public Builder clearLastPlayAid() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearLastPlayAid();
            return this;
        }

        public Builder clearLastPlayCid() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearLastPlayCid();
            return this;
        }

        public Builder clearProgress() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearProgress();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearToast();
            return this;
        }

        public Builder clearToastWithoutTime() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearToastWithoutTime();
            return this;
        }

        public int getLastEpId() {
            return ((WatchProgress) this.instance).getLastEpId();
        }

        public String getLastEpIndex() {
            return ((WatchProgress) this.instance).getLastEpIndex();
        }

        public ByteString getLastEpIndexBytes() {
            return ((WatchProgress) this.instance).getLastEpIndexBytes();
        }

        public long getLastPlayAid() {
            return ((WatchProgress) this.instance).getLastPlayAid();
        }

        public long getLastPlayCid() {
            return ((WatchProgress) this.instance).getLastPlayCid();
        }

        public long getProgress() {
            return ((WatchProgress) this.instance).getProgress();
        }

        public Toast getToast() {
            return ((WatchProgress) this.instance).getToast();
        }

        public Toast getToastWithoutTime() {
            return ((WatchProgress) this.instance).getToastWithoutTime();
        }

        public boolean hasToast() {
            return ((WatchProgress) this.instance).hasToast();
        }

        public boolean hasToastWithoutTime() {
            return ((WatchProgress) this.instance).hasToastWithoutTime();
        }

        public Builder mergeToast(Toast toast) {
            copyOnWrite();
            ((WatchProgress) this.instance).mergeToast(toast);
            return this;
        }

        public Builder mergeToastWithoutTime(Toast toast) {
            copyOnWrite();
            ((WatchProgress) this.instance).mergeToastWithoutTime(toast);
            return this;
        }

        public Builder setLastEpId(int i) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastEpId(i);
            return this;
        }

        public Builder setLastEpIndex(String str) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastEpIndex(str);
            return this;
        }

        public Builder setLastEpIndexBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastEpIndexBytes(byteString);
            return this;
        }

        public Builder setLastPlayAid(long j) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastPlayAid(j);
            return this;
        }

        public Builder setLastPlayCid(long j) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastPlayCid(j);
            return this;
        }

        public Builder setProgress(long j) {
            copyOnWrite();
            ((WatchProgress) this.instance).setProgress(j);
            return this;
        }

        public Builder setToast(Toast toast) {
            copyOnWrite();
            ((WatchProgress) this.instance).setToast(toast);
            return this;
        }

        public Builder setToastWithoutTime(Toast toast) {
            copyOnWrite();
            ((WatchProgress) this.instance).setToastWithoutTime(toast);
            return this;
        }

        private Builder() {
            super(WatchProgress.DEFAULT_INSTANCE);
        }

        public Builder setToast(Toast.Builder builder) {
            throw new RuntimeException();
        }
    }

    static {
        WatchProgress watchProgress = new WatchProgress();
        DEFAULT_INSTANCE = watchProgress;
        GeneratedMessageLite.registerDefaultInstance(WatchProgress.class, watchProgress);
    }

    private WatchProgress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastEpId() {
        this.lastEpId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastEpIndex() {
        this.lastEpIndex_ = getDefaultInstance().getLastEpIndex();
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

    public static WatchProgress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToast(Toast toast) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToastWithoutTime(Toast toast) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchProgress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchProgress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchProgress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastEpId(int i) {
        this.lastEpId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastEpIndex(String str) {
        str.getClass();
        this.lastEpIndex_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastEpIndexBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastEpIndex_ = byteString.toStringUtf8();
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
        switch (C78951.f17608xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new WatchProgress();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0002\u0004\u0002\u0005\t\u0006\t\u0007\u0002", new Object[]{"lastEpId_", "lastEpIndex_", "progress_", "lastPlayCid_", "toast_", "toastWithoutTime_", "lastPlayAid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchProgress> parser = PARSER;
                if (parser == null) {
                    synchronized (WatchProgress.class) {
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

    public int getLastEpId() {
        return this.lastEpId_;
    }

    public String getLastEpIndex() {
        return this.lastEpIndex_;
    }

    public ByteString getLastEpIndexBytes() {
        return ByteString.copyFromUtf8(this.lastEpIndex_);
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
        throw new RuntimeException();
    }

    public Toast getToastWithoutTime() {
        throw new RuntimeException();
    }

    public boolean hasToast() {
        return this.toast_ != null;
    }

    public boolean hasToastWithoutTime() {
        return this.toastWithoutTime_ != null;
    }

    public static Builder newBuilder(WatchProgress watchProgress) {
        return DEFAULT_INSTANCE.createBuilder(watchProgress);
    }

    public static WatchProgress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchProgress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchProgress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(InputStream inputStream) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchProgress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchProgress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
