package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class UserActivity extends GeneratedMessageLite<UserActivity, UserActivity.Builder> implements MessageLiteOrBuilder {
    public static final int CHECKIN_TODAY_FIELD_NUMBER = 3;
    private static final UserActivity DEFAULT_INSTANCE;
    public static final int LAST_CHECKIN_DATE_FIELD_NUMBER = 2;
    private static volatile Parser<UserActivity> PARSER = null;
    public static final int PORTRAIT_FIELD_NUMBER = 6;
    public static final int USER_DAY_COUNT_FIELD_NUMBER = 4;
    public static final int USER_STATE_FIELD_NUMBER = 1;
    public static final int USER_VIEW_TIME_FIELD_NUMBER = 5;
    private int checkinToday_;
    private long lastCheckinDate_;
    private String portrait_ = "";
    private int userDayCount_;
    private int userState_;
    private int userViewTime_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UserActivity$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17056xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17056xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17056xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserActivity, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70791 c70791) {
            this();
        }

        public Builder clearCheckinToday() {
            copyOnWrite();
            ((UserActivity) this.instance).clearCheckinToday();
            return this;
        }

        public Builder clearLastCheckinDate() {
            copyOnWrite();
            ((UserActivity) this.instance).clearLastCheckinDate();
            return this;
        }

        public Builder clearPortrait() {
            copyOnWrite();
            ((UserActivity) this.instance).clearPortrait();
            return this;
        }

        public Builder clearUserDayCount() {
            copyOnWrite();
            ((UserActivity) this.instance).clearUserDayCount();
            return this;
        }

        public Builder clearUserState() {
            copyOnWrite();
            ((UserActivity) this.instance).clearUserState();
            return this;
        }

        public Builder clearUserViewTime() {
            copyOnWrite();
            ((UserActivity) this.instance).clearUserViewTime();
            return this;
        }

        public int getCheckinToday() {
            return ((UserActivity) this.instance).getCheckinToday();
        }

        public long getLastCheckinDate() {
            return ((UserActivity) this.instance).getLastCheckinDate();
        }

        public String getPortrait() {
            return ((UserActivity) this.instance).getPortrait();
        }

        public ByteString getPortraitBytes() {
            return ((UserActivity) this.instance).getPortraitBytes();
        }

        public int getUserDayCount() {
            return ((UserActivity) this.instance).getUserDayCount();
        }

        public int getUserState() {
            return ((UserActivity) this.instance).getUserState();
        }

        public int getUserViewTime() {
            return ((UserActivity) this.instance).getUserViewTime();
        }

        public Builder setCheckinToday(int i) {
            copyOnWrite();
            ((UserActivity) this.instance).setCheckinToday(i);
            return this;
        }

        public Builder setLastCheckinDate(long j) {
            copyOnWrite();
            ((UserActivity) this.instance).setLastCheckinDate(j);
            return this;
        }

        public Builder setPortrait(String str) {
            copyOnWrite();
            ((UserActivity) this.instance).setPortrait(str);
            return this;
        }

        public Builder setPortraitBytes(ByteString byteString) {
            copyOnWrite();
            ((UserActivity) this.instance).setPortraitBytes(byteString);
            return this;
        }

        public Builder setUserDayCount(int i) {
            copyOnWrite();
            ((UserActivity) this.instance).setUserDayCount(i);
            return this;
        }

        public Builder setUserState(int i) {
            copyOnWrite();
            ((UserActivity) this.instance).setUserState(i);
            return this;
        }

        public Builder setUserViewTime(int i) {
            copyOnWrite();
            ((UserActivity) this.instance).setUserViewTime(i);
            return this;
        }

        private Builder() {
            super(UserActivity.DEFAULT_INSTANCE);
        }
    }

    static {
        UserActivity userActivity = new UserActivity();
        DEFAULT_INSTANCE = userActivity;
        GeneratedMessageLite.registerDefaultInstance(UserActivity.class, userActivity);
    }

    private UserActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckinToday() {
        this.checkinToday_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastCheckinDate() {
        this.lastCheckinDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortrait() {
        this.portrait_ = getDefaultInstance().getPortrait();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserDayCount() {
        this.userDayCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserState() {
        this.userState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserViewTime() {
        this.userViewTime_ = 0;
    }

    public static UserActivity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserActivity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserActivity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserActivity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckinToday(int i) {
        this.checkinToday_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastCheckinDate(long j) {
        this.lastCheckinDate_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortrait(String str) {
        str.getClass();
        this.portrait_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.portrait_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserDayCount(int i) {
        this.userDayCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserState(int i) {
        this.userState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserViewTime(int i) {
        this.userViewTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70791.f17056xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserActivity();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0208", new Object[]{"userState_", "lastCheckinDate_", "checkinToday_", "userDayCount_", "userViewTime_", "portrait_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserActivity> parser = PARSER;
                if (parser == null) {
                    synchronized (UserActivity.class) {
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

    public int getCheckinToday() {
        return this.checkinToday_;
    }

    public long getLastCheckinDate() {
        return this.lastCheckinDate_;
    }

    public String getPortrait() {
        return this.portrait_;
    }

    public ByteString getPortraitBytes() {
        return ByteString.copyFromUtf8(this.portrait_);
    }

    public int getUserDayCount() {
        return this.userDayCount_;
    }

    public int getUserState() {
        return this.userState_;
    }

    public int getUserViewTime() {
        return this.userViewTime_;
    }

    public static Builder newBuilder(UserActivity userActivity) {
        return DEFAULT_INSTANCE.createBuilder(userActivity);
    }

    public static UserActivity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserActivity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserActivity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserActivity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserActivity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserActivity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserActivity parseFrom(InputStream inputStream) throws IOException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserActivity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserActivity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserActivity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
