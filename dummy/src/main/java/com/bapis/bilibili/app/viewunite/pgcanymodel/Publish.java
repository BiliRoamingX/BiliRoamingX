package com.bapis.bilibili.app.viewunite.pgcanymodel;

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
public final class Publish extends GeneratedMessageLite<Publish, Publish.Builder> implements MessageLiteOrBuilder {
    private static final Publish DEFAULT_INSTANCE;
    public static final int IS_FINISH_FIELD_NUMBER = 4;
    public static final int IS_STARTED_FIELD_NUMBER = 3;
    private static volatile Parser<Publish> PARSER = null;
    public static final int PUB_TIME_FIELD_NUMBER = 1;
    public static final int PUB_TIME_SHOW_FIELD_NUMBER = 2;
    public static final int RELEASE_DATE_SHOW_FIELD_NUMBER = 6;
    public static final int TIME_LENGTH_SHOW_FIELD_NUMBER = 7;
    public static final int UNKNOW_PUB_DATE_FIELD_NUMBER = 8;
    public static final int UPDATE_INFO_DESC_FIELD_NUMBER = 9;
    public static final int WEEKDAY_FIELD_NUMBER = 5;
    private int isFinish_;
    private int isStarted_;
    private int unknowPubDate_;
    private int weekday_;
    private String pubTime_ = "";
    private String pubTimeShow_ = "";
    private String releaseDateShow_ = "";
    private String timeLengthShow_ = "";
    private String updateInfoDesc_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.Publish$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17071xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17071xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Publish, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70941 c70941) {
            this();
        }

        public Builder clearIsFinish() {
            copyOnWrite();
            ((Publish) this.instance).clearIsFinish();
            return this;
        }

        public Builder clearIsStarted() {
            copyOnWrite();
            ((Publish) this.instance).clearIsStarted();
            return this;
        }

        public Builder clearPubTime() {
            copyOnWrite();
            ((Publish) this.instance).clearPubTime();
            return this;
        }

        public Builder clearPubTimeShow() {
            copyOnWrite();
            ((Publish) this.instance).clearPubTimeShow();
            return this;
        }

        public Builder clearReleaseDateShow() {
            copyOnWrite();
            ((Publish) this.instance).clearReleaseDateShow();
            return this;
        }

        public Builder clearTimeLengthShow() {
            copyOnWrite();
            ((Publish) this.instance).clearTimeLengthShow();
            return this;
        }

        public Builder clearUnknowPubDate() {
            copyOnWrite();
            ((Publish) this.instance).clearUnknowPubDate();
            return this;
        }

        public Builder clearUpdateInfoDesc() {
            copyOnWrite();
            ((Publish) this.instance).clearUpdateInfoDesc();
            return this;
        }

        public Builder clearWeekday() {
            copyOnWrite();
            ((Publish) this.instance).clearWeekday();
            return this;
        }

        public int getIsFinish() {
            return ((Publish) this.instance).getIsFinish();
        }

        public int getIsStarted() {
            return ((Publish) this.instance).getIsStarted();
        }

        public String getPubTime() {
            return ((Publish) this.instance).getPubTime();
        }

        public ByteString getPubTimeBytes() {
            return ((Publish) this.instance).getPubTimeBytes();
        }

        public String getPubTimeShow() {
            return ((Publish) this.instance).getPubTimeShow();
        }

        public ByteString getPubTimeShowBytes() {
            return ((Publish) this.instance).getPubTimeShowBytes();
        }

        public String getReleaseDateShow() {
            return ((Publish) this.instance).getReleaseDateShow();
        }

        public ByteString getReleaseDateShowBytes() {
            return ((Publish) this.instance).getReleaseDateShowBytes();
        }

        public String getTimeLengthShow() {
            return ((Publish) this.instance).getTimeLengthShow();
        }

        public ByteString getTimeLengthShowBytes() {
            return ((Publish) this.instance).getTimeLengthShowBytes();
        }

        public int getUnknowPubDate() {
            return ((Publish) this.instance).getUnknowPubDate();
        }

        public String getUpdateInfoDesc() {
            return ((Publish) this.instance).getUpdateInfoDesc();
        }

        public ByteString getUpdateInfoDescBytes() {
            return ((Publish) this.instance).getUpdateInfoDescBytes();
        }

        public int getWeekday() {
            return ((Publish) this.instance).getWeekday();
        }

        public Builder setIsFinish(int i) {
            copyOnWrite();
            ((Publish) this.instance).setIsFinish(i);
            return this;
        }

        public Builder setIsStarted(int i) {
            copyOnWrite();
            ((Publish) this.instance).setIsStarted(i);
            return this;
        }

        public Builder setPubTime(String str) {
            copyOnWrite();
            ((Publish) this.instance).setPubTime(str);
            return this;
        }

        public Builder setPubTimeBytes(ByteString byteString) {
            copyOnWrite();
            ((Publish) this.instance).setPubTimeBytes(byteString);
            return this;
        }

        public Builder setPubTimeShow(String str) {
            copyOnWrite();
            ((Publish) this.instance).setPubTimeShow(str);
            return this;
        }

        public Builder setPubTimeShowBytes(ByteString byteString) {
            copyOnWrite();
            ((Publish) this.instance).setPubTimeShowBytes(byteString);
            return this;
        }

        public Builder setReleaseDateShow(String str) {
            copyOnWrite();
            ((Publish) this.instance).setReleaseDateShow(str);
            return this;
        }

        public Builder setReleaseDateShowBytes(ByteString byteString) {
            copyOnWrite();
            ((Publish) this.instance).setReleaseDateShowBytes(byteString);
            return this;
        }

        public Builder setTimeLengthShow(String str) {
            copyOnWrite();
            ((Publish) this.instance).setTimeLengthShow(str);
            return this;
        }

        public Builder setTimeLengthShowBytes(ByteString byteString) {
            copyOnWrite();
            ((Publish) this.instance).setTimeLengthShowBytes(byteString);
            return this;
        }

        public Builder setUnknowPubDate(int i) {
            copyOnWrite();
            ((Publish) this.instance).setUnknowPubDate(i);
            return this;
        }

        public Builder setUpdateInfoDesc(String str) {
            copyOnWrite();
            ((Publish) this.instance).setUpdateInfoDesc(str);
            return this;
        }

        public Builder setUpdateInfoDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Publish) this.instance).setUpdateInfoDescBytes(byteString);
            return this;
        }

        public Builder setWeekday(int i) {
            copyOnWrite();
            ((Publish) this.instance).setWeekday(i);
            return this;
        }

        private Builder() {
            super(Publish.DEFAULT_INSTANCE);
        }
    }

    static {
        Publish publish = new Publish();
        DEFAULT_INSTANCE = publish;
        GeneratedMessageLite.registerDefaultInstance(Publish.class, publish);
    }

    private Publish() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFinish() {
        this.isFinish_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsStarted() {
        this.isStarted_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPubTime() {
        this.pubTime_ = getDefaultInstance().getPubTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPubTimeShow() {
        this.pubTimeShow_ = getDefaultInstance().getPubTimeShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReleaseDateShow() {
        this.releaseDateShow_ = getDefaultInstance().getReleaseDateShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeLengthShow() {
        this.timeLengthShow_ = getDefaultInstance().getTimeLengthShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnknowPubDate() {
        this.unknowPubDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateInfoDesc() {
        this.updateInfoDesc_ = getDefaultInstance().getUpdateInfoDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeekday() {
        this.weekday_ = 0;
    }

    public static Publish getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Publish parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Publish) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Publish parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Publish> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFinish(int i) {
        this.isFinish_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsStarted(int i) {
        this.isStarted_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubTime(String str) {
        str.getClass();
        this.pubTime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubTimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pubTime_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubTimeShow(String str) {
        str.getClass();
        this.pubTimeShow_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubTimeShowBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pubTimeShow_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseDateShow(String str) {
        str.getClass();
        this.releaseDateShow_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReleaseDateShowBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.releaseDateShow_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeLengthShow(String str) {
        str.getClass();
        this.timeLengthShow_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeLengthShowBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timeLengthShow_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnknowPubDate(int i) {
        this.unknowPubDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateInfoDesc(String str) {
        str.getClass();
        this.updateInfoDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateInfoDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.updateInfoDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeekday(int i) {
        this.weekday_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70941.f17071xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Publish();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0208\u0007\u0208\b\u0004\t\u0208", new Object[]{"pubTime_", "pubTimeShow_", "isStarted_", "isFinish_", "weekday_", "releaseDateShow_", "timeLengthShow_", "unknowPubDate_", "updateInfoDesc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Publish> parser = PARSER;
                if (parser == null) {
                    synchronized (Publish.class) {
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

    public int getIsFinish() {
        return this.isFinish_;
    }

    public int getIsStarted() {
        return this.isStarted_;
    }

    public String getPubTime() {
        return this.pubTime_;
    }

    public ByteString getPubTimeBytes() {
        return ByteString.copyFromUtf8(this.pubTime_);
    }

    public String getPubTimeShow() {
        return this.pubTimeShow_;
    }

    public ByteString getPubTimeShowBytes() {
        return ByteString.copyFromUtf8(this.pubTimeShow_);
    }

    public String getReleaseDateShow() {
        return this.releaseDateShow_;
    }

    public ByteString getReleaseDateShowBytes() {
        return ByteString.copyFromUtf8(this.releaseDateShow_);
    }

    public String getTimeLengthShow() {
        return this.timeLengthShow_;
    }

    public ByteString getTimeLengthShowBytes() {
        return ByteString.copyFromUtf8(this.timeLengthShow_);
    }

    public int getUnknowPubDate() {
        return this.unknowPubDate_;
    }

    public String getUpdateInfoDesc() {
        return this.updateInfoDesc_;
    }

    public ByteString getUpdateInfoDescBytes() {
        return ByteString.copyFromUtf8(this.updateInfoDesc_);
    }

    public int getWeekday() {
        return this.weekday_;
    }

    public static Builder newBuilder(Publish publish) {
        return DEFAULT_INSTANCE.createBuilder(publish);
    }

    public static Publish parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Publish) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Publish parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Publish parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Publish parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Publish parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Publish parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Publish parseFrom(InputStream inputStream) throws IOException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Publish parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Publish parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Publish parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Publish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
