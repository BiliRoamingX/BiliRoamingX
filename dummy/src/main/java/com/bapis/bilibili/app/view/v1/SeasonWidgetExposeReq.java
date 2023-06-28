package com.bapis.bilibili.app.view.v1;

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
public final class SeasonWidgetExposeReq extends GeneratedMessageLite<SeasonWidgetExposeReq, SeasonWidgetExposeReq.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_ID_FIELD_NUMBER = 4;
    public static final int AID_FIELD_NUMBER = 5;
    public static final int CID_FIELD_NUMBER = 6;
    private static final SeasonWidgetExposeReq DEFAULT_INSTANCE;
    public static final int MID_FIELD_NUMBER = 1;
    private static volatile Parser<SeasonWidgetExposeReq> PARSER = null;
    public static final int SCENE_FIELD_NUMBER = 7;
    public static final int SEASON_ID_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private long activityId_;
    private long aid_;
    private long cid_;
    private long mid_;
    private long scene_;
    private long seasonId_;
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SeasonWidgetExposeReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16818xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16818xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16818xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16818xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16818xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16818xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16818xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16818xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonWidgetExposeReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68591 c68591) {
            this();
        }

        public Builder clearActivityId() {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).clearActivityId();
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).clearAid();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).clearCid();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).clearMid();
            return this;
        }

        public Builder clearScene() {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).clearScene();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).clearType();
            return this;
        }

        public long getActivityId() {
            return ((SeasonWidgetExposeReq) this.instance).getActivityId();
        }

        public long getAid() {
            return ((SeasonWidgetExposeReq) this.instance).getAid();
        }

        public long getCid() {
            return ((SeasonWidgetExposeReq) this.instance).getCid();
        }

        public long getMid() {
            return ((SeasonWidgetExposeReq) this.instance).getMid();
        }

        public long getScene() {
            return ((SeasonWidgetExposeReq) this.instance).getScene();
        }

        public long getSeasonId() {
            return ((SeasonWidgetExposeReq) this.instance).getSeasonId();
        }

        public int getType() {
            return ((SeasonWidgetExposeReq) this.instance).getType();
        }

        public Builder setActivityId(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).setActivityId(j);
            return this;
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).setAid(j);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).setCid(j);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).setMid(j);
            return this;
        }

        public Builder setScene(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).setScene(j);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((SeasonWidgetExposeReq) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(SeasonWidgetExposeReq.DEFAULT_INSTANCE);
        }
    }

    static {
        SeasonWidgetExposeReq seasonWidgetExposeReq = new SeasonWidgetExposeReq();
        DEFAULT_INSTANCE = seasonWidgetExposeReq;
        GeneratedMessageLite.registerDefaultInstance(SeasonWidgetExposeReq.class, seasonWidgetExposeReq);
    }

    private SeasonWidgetExposeReq() {
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
    public void clearMid() {
        this.mid_ = 0L;
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
    public void clearType() {
        this.type_ = 0;
    }

    public static SeasonWidgetExposeReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonWidgetExposeReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonWidgetExposeReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonWidgetExposeReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMid(long j) {
        this.mid_ = j;
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
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68591.f16818xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonWidgetExposeReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002", new Object[]{"mid_", "type_", "seasonId_", "activityId_", "aid_", "cid_", "scene_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonWidgetExposeReq> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonWidgetExposeReq.class) {
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

    public long getActivityId() {
        return this.activityId_;
    }

    public long getAid() {
        return this.aid_;
    }

    public long getCid() {
        return this.cid_;
    }

    public long getMid() {
        return this.mid_;
    }

    public long getScene() {
        return this.scene_;
    }

    public long getSeasonId() {
        return this.seasonId_;
    }

    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(SeasonWidgetExposeReq seasonWidgetExposeReq) {
        return DEFAULT_INSTANCE.createBuilder(seasonWidgetExposeReq);
    }

    public static SeasonWidgetExposeReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonWidgetExposeReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonWidgetExposeReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReq parseFrom(InputStream inputStream) throws IOException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonWidgetExposeReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonWidgetExposeReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonWidgetExposeReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
