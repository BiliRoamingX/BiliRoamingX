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
public final class UgcSeasonActivity extends GeneratedMessageLite<UgcSeasonActivity, UgcSeasonActivity.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_DEADLINE_FIELD_NUMBER = 9;
    public static final int ACTIVITY_ID_FIELD_NUMBER = 3;
    public static final int CHECKIN_VIEW_TIME_FIELD_NUMBER = 10;
    public static final int DAY_COUNT_FIELD_NUMBER = 6;
    private static final UgcSeasonActivity DEFAULT_INSTANCE;
    public static final int INTRO_FIELD_NUMBER = 5;
    public static final int JOIN_DEADLINE_FIELD_NUMBER = 8;
    public static final int NEW_ACTIVITY_FIELD_NUMBER = 11;
    public static final int OID_FIELD_NUMBER = 2;
    private static volatile Parser<UgcSeasonActivity> PARSER = null;
    public static final int SEASON_SHOW_FIELD_NUMBER = 13;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int USER_ACTIVITY_FIELD_NUMBER = 12;
    public static final int USER_COUNT_FIELD_NUMBER = 7;
    private long activityDeadline_;
    private long activityId_;
    private int checkinViewTime_;
    private int dayCount_;
    private long joinDeadline_;
    private boolean newActivity_;
    private long oid_;
    private SeasonShow seasonShow_;
    private int type_;
    private UserActivity userActivity_;
    private int userCount_;
    private String title_ = "";
    private String intro_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UgcSeasonActivity$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70741 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17051xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17051xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17051xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcSeasonActivity, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70741 c70741) {
            this();
        }

        public Builder clearActivityDeadline() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearActivityDeadline();
            return this;
        }

        public Builder clearActivityId() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearActivityId();
            return this;
        }

        public Builder clearCheckinViewTime() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearCheckinViewTime();
            return this;
        }

        public Builder clearDayCount() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearDayCount();
            return this;
        }

        public Builder clearIntro() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearIntro();
            return this;
        }

        public Builder clearJoinDeadline() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearJoinDeadline();
            return this;
        }

        public Builder clearNewActivity() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearNewActivity();
            return this;
        }

        public Builder clearOid() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearOid();
            return this;
        }

        public Builder clearSeasonShow() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearSeasonShow();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearType();
            return this;
        }

        public Builder clearUserActivity() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearUserActivity();
            return this;
        }

        public Builder clearUserCount() {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).clearUserCount();
            return this;
        }

        public long getActivityDeadline() {
            return ((UgcSeasonActivity) this.instance).getActivityDeadline();
        }

        public long getActivityId() {
            return ((UgcSeasonActivity) this.instance).getActivityId();
        }

        public int getCheckinViewTime() {
            return ((UgcSeasonActivity) this.instance).getCheckinViewTime();
        }

        public int getDayCount() {
            return ((UgcSeasonActivity) this.instance).getDayCount();
        }

        public String getIntro() {
            return ((UgcSeasonActivity) this.instance).getIntro();
        }

        public ByteString getIntroBytes() {
            return ((UgcSeasonActivity) this.instance).getIntroBytes();
        }

        public long getJoinDeadline() {
            return ((UgcSeasonActivity) this.instance).getJoinDeadline();
        }

        public boolean getNewActivity() {
            return ((UgcSeasonActivity) this.instance).getNewActivity();
        }

        public long getOid() {
            return ((UgcSeasonActivity) this.instance).getOid();
        }

        public SeasonShow getSeasonShow() {
            return ((UgcSeasonActivity) this.instance).getSeasonShow();
        }

        public String getTitle() {
            return ((UgcSeasonActivity) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((UgcSeasonActivity) this.instance).getTitleBytes();
        }

        public int getType() {
            return ((UgcSeasonActivity) this.instance).getType();
        }

        public UserActivity getUserActivity() {
            return ((UgcSeasonActivity) this.instance).getUserActivity();
        }

        public int getUserCount() {
            return ((UgcSeasonActivity) this.instance).getUserCount();
        }

        public boolean hasSeasonShow() {
            return ((UgcSeasonActivity) this.instance).hasSeasonShow();
        }

        public boolean hasUserActivity() {
            return ((UgcSeasonActivity) this.instance).hasUserActivity();
        }

        public Builder mergeSeasonShow(SeasonShow seasonShow) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).mergeSeasonShow(seasonShow);
            return this;
        }

        public Builder mergeUserActivity(UserActivity userActivity) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).mergeUserActivity(userActivity);
            return this;
        }

        public Builder setActivityDeadline(long j) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setActivityDeadline(j);
            return this;
        }

        public Builder setActivityId(long j) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setActivityId(j);
            return this;
        }

        public Builder setCheckinViewTime(int i) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setCheckinViewTime(i);
            return this;
        }

        public Builder setDayCount(int i) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setDayCount(i);
            return this;
        }

        public Builder setIntro(String str) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setIntro(str);
            return this;
        }

        public Builder setIntroBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setIntroBytes(byteString);
            return this;
        }

        public Builder setJoinDeadline(long j) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setJoinDeadline(j);
            return this;
        }

        public Builder setNewActivity(boolean z) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setNewActivity(z);
            return this;
        }

        public Builder setOid(long j) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setOid(j);
            return this;
        }

        public Builder setSeasonShow(SeasonShow seasonShow) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setSeasonShow(seasonShow);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setType(i);
            return this;
        }

        public Builder setUserActivity(UserActivity userActivity) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setUserActivity(userActivity);
            return this;
        }

        public Builder setUserCount(int i) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setUserCount(i);
            return this;
        }

        private Builder() {
            super(UgcSeasonActivity.DEFAULT_INSTANCE);
        }

        public Builder setSeasonShow(SeasonShow.Builder builder) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setSeasonShow(builder.build());
            return this;
        }

        public Builder setUserActivity(UserActivity.Builder builder) {
            copyOnWrite();
            ((UgcSeasonActivity) this.instance).setUserActivity(builder.build());
            return this;
        }
    }

    static {
        UgcSeasonActivity ugcSeasonActivity = new UgcSeasonActivity();
        DEFAULT_INSTANCE = ugcSeasonActivity;
        GeneratedMessageLite.registerDefaultInstance(UgcSeasonActivity.class, ugcSeasonActivity);
    }

    private UgcSeasonActivity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityDeadline() {
        this.activityDeadline_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityId() {
        this.activityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckinViewTime() {
        this.checkinViewTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDayCount() {
        this.dayCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntro() {
        this.intro_ = getDefaultInstance().getIntro();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinDeadline() {
        this.joinDeadline_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewActivity() {
        this.newActivity_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonShow() {
        this.seasonShow_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserActivity() {
        this.userActivity_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCount() {
        this.userCount_ = 0;
    }

    public static UgcSeasonActivity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeasonShow(SeasonShow seasonShow) {
        seasonShow.getClass();
        SeasonShow seasonShow2 = this.seasonShow_;
        if (seasonShow2 != null && seasonShow2 != SeasonShow.getDefaultInstance()) {
            this.seasonShow_ = SeasonShow.newBuilder(this.seasonShow_).mergeFrom((SeasonShow) seasonShow).buildPartial();
        } else {
            this.seasonShow_ = seasonShow;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserActivity(UserActivity userActivity) {
        userActivity.getClass();
        UserActivity userActivity2 = this.userActivity_;
        if (userActivity2 != null && userActivity2 != UserActivity.getDefaultInstance()) {
            this.userActivity_ = UserActivity.newBuilder(this.userActivity_).mergeFrom((UserActivity) userActivity).buildPartial();
        } else {
            this.userActivity_ = userActivity;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcSeasonActivity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonActivity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcSeasonActivity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityDeadline(long j) {
        this.activityDeadline_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityId(long j) {
        this.activityId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckinViewTime(int i) {
        this.checkinViewTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDayCount(int i) {
        this.dayCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntro(String str) {
        str.getClass();
        this.intro_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.intro_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinDeadline(long j) {
        this.joinDeadline_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewActivity(boolean z) {
        this.newActivity_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonShow(SeasonShow seasonShow) {
        seasonShow.getClass();
        this.seasonShow_ = seasonShow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserActivity(UserActivity userActivity) {
        userActivity.getClass();
        this.userActivity_ = userActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCount(int i) {
        this.userCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70741.f17051xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcSeasonActivity();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0004\b\u0002\t\u0002\n\u0004\u000b\u0007\f\t\r\t", new Object[]{"type_", "oid_", "activityId_", "title_", "intro_", "dayCount_", "userCount_", "joinDeadline_", "activityDeadline_", "checkinViewTime_", "newActivity_", "userActivity_", "seasonShow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcSeasonActivity> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcSeasonActivity.class) {
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

    public long getActivityDeadline() {
        return this.activityDeadline_;
    }

    public long getActivityId() {
        return this.activityId_;
    }

    public int getCheckinViewTime() {
        return this.checkinViewTime_;
    }

    public int getDayCount() {
        return this.dayCount_;
    }

    public String getIntro() {
        return this.intro_;
    }

    public ByteString getIntroBytes() {
        return ByteString.copyFromUtf8(this.intro_);
    }

    public long getJoinDeadline() {
        return this.joinDeadline_;
    }

    public boolean getNewActivity() {
        return this.newActivity_;
    }

    public long getOid() {
        return this.oid_;
    }

    public SeasonShow getSeasonShow() {
        SeasonShow seasonShow = this.seasonShow_;
        return seasonShow == null ? SeasonShow.getDefaultInstance() : seasonShow;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public int getType() {
        return this.type_;
    }

    public UserActivity getUserActivity() {
        UserActivity userActivity = this.userActivity_;
        return userActivity == null ? UserActivity.getDefaultInstance() : userActivity;
    }

    public int getUserCount() {
        return this.userCount_;
    }

    public boolean hasSeasonShow() {
        return this.seasonShow_ != null;
    }

    public boolean hasUserActivity() {
        return this.userActivity_ != null;
    }

    public static Builder newBuilder(UgcSeasonActivity ugcSeasonActivity) {
        return DEFAULT_INSTANCE.createBuilder(ugcSeasonActivity);
    }

    public static UgcSeasonActivity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonActivity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcSeasonActivity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UgcSeasonActivity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcSeasonActivity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcSeasonActivity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcSeasonActivity parseFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonActivity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonActivity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcSeasonActivity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
