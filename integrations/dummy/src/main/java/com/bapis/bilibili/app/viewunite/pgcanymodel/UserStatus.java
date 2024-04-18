package com.bapis.bilibili.app.viewunite.pgcanymodel;

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
/* loaded from: classes17.dex */
public final class UserStatus extends GeneratedMessageLite<UserStatus, UserStatus.Builder> implements MessageLiteOrBuilder {
    private static final UserStatus DEFAULT_INSTANCE;
    public static final int FOLLOW_FIELD_NUMBER = 2;
    public static final int FOLLOW_STATUS_FIELD_NUMBER = 3;
    private static volatile Parser<UserStatus> PARSER = null;
    public static final int PAY_FIELD_NUMBER = 4;
    public static final int SHOW_FIELD_NUMBER = 1;
    public static final int SPONSOR_FIELD_NUMBER = 5;
    public static final int VIP_FIELD_NUMBER = 6;
    public static final int VIP_FROZEN_FIELD_NUMBER = 7;
    public static final int WATCH_PROGRESS_FIELD_NUMBER = 8;
    private int followStatus_;
    private int follow_;
    private int pay_;
    private int show_;
    private int sponsor_;
    private int vipFrozen_;
    private int vip_;
    private WatchProgress watchProgress_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.UserStatus$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17075xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17075xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserStatus, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70981 c70981) {
            this();
        }

        public Builder clearFollow() {
            copyOnWrite();
            ((UserStatus) this.instance).clearFollow();
            return this;
        }

        public Builder clearFollowStatus() {
            copyOnWrite();
            ((UserStatus) this.instance).clearFollowStatus();
            return this;
        }

        public Builder clearPay() {
            copyOnWrite();
            ((UserStatus) this.instance).clearPay();
            return this;
        }

        public Builder clearShow() {
            copyOnWrite();
            ((UserStatus) this.instance).clearShow();
            return this;
        }

        public Builder clearSponsor() {
            copyOnWrite();
            ((UserStatus) this.instance).clearSponsor();
            return this;
        }

        public Builder clearVip() {
            copyOnWrite();
            ((UserStatus) this.instance).clearVip();
            return this;
        }

        public Builder clearVipFrozen() {
            copyOnWrite();
            ((UserStatus) this.instance).clearVipFrozen();
            return this;
        }

        public Builder clearWatchProgress() {
            copyOnWrite();
            ((UserStatus) this.instance).clearWatchProgress();
            return this;
        }

        public int getFollow() {
            return ((UserStatus) this.instance).getFollow();
        }

        public int getFollowStatus() {
            return ((UserStatus) this.instance).getFollowStatus();
        }

        public int getPay() {
            return ((UserStatus) this.instance).getPay();
        }

        public int getShow() {
            return ((UserStatus) this.instance).getShow();
        }

        public int getSponsor() {
            return ((UserStatus) this.instance).getSponsor();
        }

        public int getVip() {
            return ((UserStatus) this.instance).getVip();
        }

        public int getVipFrozen() {
            return ((UserStatus) this.instance).getVipFrozen();
        }

        public WatchProgress getWatchProgress() {
            return ((UserStatus) this.instance).getWatchProgress();
        }

        public boolean hasWatchProgress() {
            return ((UserStatus) this.instance).hasWatchProgress();
        }

        public Builder mergeWatchProgress(WatchProgress watchProgress) {
            copyOnWrite();
            ((UserStatus) this.instance).mergeWatchProgress(watchProgress);
            return this;
        }

        public Builder setFollow(int i) {
            copyOnWrite();
            ((UserStatus) this.instance).setFollow(i);
            return this;
        }

        public Builder setFollowStatus(int i) {
            copyOnWrite();
            ((UserStatus) this.instance).setFollowStatus(i);
            return this;
        }

        public Builder setPay(int i) {
            copyOnWrite();
            ((UserStatus) this.instance).setPay(i);
            return this;
        }

        public Builder setShow(int i) {
            copyOnWrite();
            ((UserStatus) this.instance).setShow(i);
            return this;
        }

        public Builder setSponsor(int i) {
            copyOnWrite();
            ((UserStatus) this.instance).setSponsor(i);
            return this;
        }

        public Builder setVip(int i) {
            copyOnWrite();
            ((UserStatus) this.instance).setVip(i);
            return this;
        }

        public Builder setVipFrozen(int i) {
            copyOnWrite();
            ((UserStatus) this.instance).setVipFrozen(i);
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
    public void clearFollow() {
        this.follow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowStatus() {
        this.followStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPay() {
        this.pay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShow() {
        this.show_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSponsor() {
        this.sponsor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVip() {
        this.vip_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipFrozen() {
        this.vipFrozen_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchProgress() {
        this.watchProgress_ = null;
    }

    public static UserStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWatchProgress(WatchProgress watchProgress) {
        watchProgress.getClass();
        WatchProgress watchProgress2 = this.watchProgress_;
        if (watchProgress2 != null && watchProgress2 != WatchProgress.getDefaultInstance()) {
            this.watchProgress_ = WatchProgress.newBuilder(this.watchProgress_).mergeFrom((WatchProgress) watchProgress).buildPartial();
        } else {
            this.watchProgress_ = watchProgress;
        }
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
    public void setFollow(int i) {
        this.follow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowStatus(int i) {
        this.followStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPay(int i) {
        this.pay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShow(int i) {
        this.show_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSponsor(int i) {
        this.sponsor_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVip(int i) {
        this.vip_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipFrozen(int i) {
        this.vipFrozen_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchProgress(WatchProgress watchProgress) {
        watchProgress.getClass();
        this.watchProgress_ = watchProgress;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70981.f17075xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserStatus();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\t", new Object[]{"show_", "follow_", "followStatus_", "pay_", "sponsor_", "vip_", "vipFrozen_", "watchProgress_"});
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

    public int getFollow() {
        return this.follow_;
    }

    public int getFollowStatus() {
        return this.followStatus_;
    }

    public int getPay() {
        return this.pay_;
    }

    public int getShow() {
        return this.show_;
    }

    public int getSponsor() {
        return this.sponsor_;
    }

    public int getVip() {
        return this.vip_;
    }

    public int getVipFrozen() {
        return this.vipFrozen_;
    }

    public WatchProgress getWatchProgress() {
        WatchProgress watchProgress = this.watchProgress_;
        return watchProgress == null ? WatchProgress.getDefaultInstance() : watchProgress;
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
