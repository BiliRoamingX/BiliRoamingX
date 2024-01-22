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
public final class UserStatus extends GeneratedMessageLite<UserStatus, UserStatus.Builder> implements MessageLiteOrBuilder {
    public static final int AID_WATCH_PROGRESS_FIELD_NUMBER = 4;
    private static final UserStatus DEFAULT_INSTANCE;
    private static volatile Parser<UserStatus> PARSER = null;
    public static final int PAY_CHECK_FIELD_NUMBER = 1;
    public static final int SPONSOR_FIELD_NUMBER = 2;
    public static final int WATCH_PROGRESS_FIELD_NUMBER = 3;
    private WatchProgress aidWatchProgress_;
    private boolean payCheck_;
    private boolean sponsor_;
    private WatchProgress watchProgress_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.UserStatus$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78921 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17605xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17605xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17605xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17605xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17605xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17605xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17605xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17605xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserStatus, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78921 c78921) {
            this();
        }

        public Builder clearAidWatchProgress() {
            copyOnWrite();
            ((UserStatus) this.instance).clearAidWatchProgress();
            return this;
        }

        public Builder clearPayCheck() {
            copyOnWrite();
            ((UserStatus) this.instance).clearPayCheck();
            return this;
        }

        public Builder clearSponsor() {
            copyOnWrite();
            ((UserStatus) this.instance).clearSponsor();
            return this;
        }

        public Builder clearWatchProgress() {
            copyOnWrite();
            ((UserStatus) this.instance).clearWatchProgress();
            return this;
        }

        public WatchProgress getAidWatchProgress() {
            return ((UserStatus) this.instance).getAidWatchProgress();
        }

        public boolean getPayCheck() {
            return ((UserStatus) this.instance).getPayCheck();
        }

        public boolean getSponsor() {
            return ((UserStatus) this.instance).getSponsor();
        }

        public WatchProgress getWatchProgress() {
            return ((UserStatus) this.instance).getWatchProgress();
        }

        public boolean hasAidWatchProgress() {
            return ((UserStatus) this.instance).hasAidWatchProgress();
        }

        public boolean hasWatchProgress() {
            return ((UserStatus) this.instance).hasWatchProgress();
        }

        public Builder mergeAidWatchProgress(WatchProgress watchProgress) {
            copyOnWrite();
            ((UserStatus) this.instance).mergeAidWatchProgress(watchProgress);
            return this;
        }

        public Builder mergeWatchProgress(WatchProgress watchProgress) {
            copyOnWrite();
            ((UserStatus) this.instance).mergeWatchProgress(watchProgress);
            return this;
        }

        public Builder setAidWatchProgress(WatchProgress watchProgress) {
            copyOnWrite();
            ((UserStatus) this.instance).setAidWatchProgress(watchProgress);
            return this;
        }

        public Builder setPayCheck(boolean z) {
            copyOnWrite();
            ((UserStatus) this.instance).setPayCheck(z);
            return this;
        }

        public Builder setSponsor(boolean z) {
            copyOnWrite();
            ((UserStatus) this.instance).setSponsor(z);
            return this;
        }

        public Builder setWatchProgress(WatchProgress watchProgress) {
            copyOnWrite();
            ((UserStatus) this.instance).setWatchProgress(watchProgress);
            return this;
        }

        private Builder() {
            super(UserStatus.DEFAULT_INSTANCE);
        }

        public Builder setAidWatchProgress(WatchProgress.Builder builder) {
            copyOnWrite();
            ((UserStatus) this.instance).setAidWatchProgress(builder.build());
            return this;
        }

        public Builder setWatchProgress(WatchProgress.Builder builder) {
            copyOnWrite();
            ((UserStatus) this.instance).setWatchProgress(builder.build());
            return this;
        }
    }

    static {
        UserStatus userStatus = new UserStatus();
        DEFAULT_INSTANCE = userStatus;
        GeneratedMessageLite.registerDefaultInstance(UserStatus.class, userStatus);
    }

    public UserStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAidWatchProgress() {
        this.aidWatchProgress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayCheck() {
        this.payCheck_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSponsor() {
        this.sponsor_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchProgress() {
        this.watchProgress_ = null;
    }

    public static UserStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAidWatchProgress(WatchProgress watchProgress) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchProgress(WatchProgress watchProgress) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAidWatchProgress(WatchProgress watchProgress) {
        watchProgress.getClass();
        this.aidWatchProgress_ = watchProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayCheck(boolean z) {
        this.payCheck_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSponsor(boolean z) {
        this.sponsor_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchProgress(WatchProgress watchProgress) {
        watchProgress.getClass();
        this.watchProgress_ = watchProgress;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78921.f17605xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserStatus();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\t\u0004\t", new Object[]{"payCheck_", "sponsor_", "watchProgress_", "aidWatchProgress_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserStatus> parser = PARSER;
                if (parser == null) {
                    synchronized (UserStatus.class) {
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

    public WatchProgress getAidWatchProgress() {
        WatchProgress watchProgress = this.aidWatchProgress_;
        return watchProgress == null ? WatchProgress.getDefaultInstance() : watchProgress;
    }

    public boolean getPayCheck() {
        return this.payCheck_;
    }

    public boolean getSponsor() {
        return this.sponsor_;
    }

    public WatchProgress getWatchProgress() {
        WatchProgress watchProgress = this.watchProgress_;
        return watchProgress == null ? WatchProgress.getDefaultInstance() : watchProgress;
    }

    public boolean hasAidWatchProgress() {
        return this.aidWatchProgress_ != null;
    }

    public boolean hasWatchProgress() {
        return this.watchProgress_ != null;
    }

    public static Builder newBuilder(UserStatus userStatus) {
        return DEFAULT_INSTANCE.createBuilder(userStatus);
    }

    public static UserStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserStatus parseFrom(InputStream inputStream) throws IOException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
