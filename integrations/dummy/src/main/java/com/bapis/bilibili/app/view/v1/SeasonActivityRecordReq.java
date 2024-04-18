package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class SeasonActivityRecordReq extends GeneratedMessageLite<SeasonActivityRecordReq, SeasonActivityRecordReq.Builder> implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int ACTIVITY_ID_FIELD_NUMBER = 2;
    public static final int AID_FIELD_NUMBER = 4;
    public static final int CID_FIELD_NUMBER = 5;
    private static final SeasonActivityRecordReq DEFAULT_INSTANCE;
    private static volatile Parser<SeasonActivityRecordReq> PARSER = null;
    public static final int SCENE_FIELD_NUMBER = 6;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    public static final int SPMID_FIELD_NUMBER = 7;
    private int action_;
    private long activityId_;
    private long aid_;
    private long cid_;
    private long scene_;
    private long seasonId_;
    private String spmid_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SeasonActivityRecordReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16812xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16812xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16812xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16812xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16812xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16812xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16812xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16812xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonActivityRecordReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68521 c68521) {
            this();
        }

        public Builder clearAction() {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).clearAction();
            return this;
        }

        public Builder clearActivityId() {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).clearActivityId();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).clearCid();
            return this;
        }

        public Builder clearScene() {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).clearScene();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).clearSpmid();
            return this;
        }

        public int getAction() {
            return ((SeasonActivityRecordReq) this.instance).getAction();
        }

        public long getActivityId() {
            return ((SeasonActivityRecordReq) this.instance).getActivityId();
        }

        public long getAid() {
            return ((SeasonActivityRecordReq) this.instance).getAid();
        }

        public long getCid() {
            return ((SeasonActivityRecordReq) this.instance).getCid();
        }

        public long getScene() {
            return ((SeasonActivityRecordReq) this.instance).getScene();
        }

        public long getSeasonId() {
            return ((SeasonActivityRecordReq) this.instance).getSeasonId();
        }

        public String getSpmid() {
            return ((SeasonActivityRecordReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((SeasonActivityRecordReq) this.instance).getSpmidBytes();
        }

        public Builder setAction(int i) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setAction(i);
            return this;
        }

        public Builder setActivityId(long j) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setActivityId(j);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setCid(j);
            return this;
        }

        public Builder setScene(long j) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setScene(j);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonActivityRecordReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        private Builder() {
            super(SeasonActivityRecordReq.DEFAULT_INSTANCE);
        }
    }

    static {
        SeasonActivityRecordReq seasonActivityRecordReq = new SeasonActivityRecordReq();
        DEFAULT_INSTANCE = seasonActivityRecordReq;
        GeneratedMessageLite.registerDefaultInstance(SeasonActivityRecordReq.class, seasonActivityRecordReq);
    }

    private SeasonActivityRecordReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityId() {
        this.activityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScene() {
        this.scene_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    public static SeasonActivityRecordReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonActivityRecordReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonActivityRecordReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonActivityRecordReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(int i) {
        this.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityId(long j) {
        this.activityId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScene(long j) {
        this.scene_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68521.f16812xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonActivityRecordReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0004\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0208", new Object[]{"seasonId_", "activityId_", "action_", "aid_", "cid_", "scene_", "spmid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonActivityRecordReq> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonActivityRecordReq.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public int getAction() {
        return this.action_;
    }

    public long getActivityId() {
        return this.activityId_;
    }

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
    }

    public long getScene() {
        return this.scene_;
    }

    public long getSeasonId() {
        return this.seasonId_;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public static Builder newBuilder(SeasonActivityRecordReq seasonActivityRecordReq) {
        return DEFAULT_INSTANCE.createBuilder(seasonActivityRecordReq);
    }

    public static SeasonActivityRecordReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonActivityRecordReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonActivityRecordReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonActivityRecordReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonActivityRecordReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonActivityRecordReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonActivityRecordReq parseFrom(InputStream inputStream) throws IOException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonActivityRecordReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonActivityRecordReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonActivityRecordReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonActivityRecordReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
