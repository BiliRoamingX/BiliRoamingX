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
public final class SeasonWidgetExposeReply extends GeneratedMessageLite<SeasonWidgetExposeReply, SeasonWidgetExposeReply.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_ID_FIELD_NUMBER = 2;
    private static final SeasonWidgetExposeReply DEFAULT_INSTANCE;
    private static volatile Parser<SeasonWidgetExposeReply> PARSER = null;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    private long activityId_;
    private long seasonId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SeasonWidgetExposeReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16817xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16817xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16817xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16817xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16817xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16817xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16817xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16817xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonWidgetExposeReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68581 c68581) {
            this();
        }

        public Builder clearActivityId() {
            copyOnWrite();
            ((SeasonWidgetExposeReply) this.instance).clearActivityId();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((SeasonWidgetExposeReply) this.instance).clearSeasonId();
            return this;
        }

        public long getActivityId() {
            return ((SeasonWidgetExposeReply) this.instance).getActivityId();
        }

        public long getSeasonId() {
            return ((SeasonWidgetExposeReply) this.instance).getSeasonId();
        }

        public Builder setActivityId(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReply) this.instance).setActivityId(j);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((SeasonWidgetExposeReply) this.instance).setSeasonId(j);
            return this;
        }

        private Builder() {
            super(SeasonWidgetExposeReply.DEFAULT_INSTANCE);
        }
    }

    static {
        SeasonWidgetExposeReply seasonWidgetExposeReply = new SeasonWidgetExposeReply();
        DEFAULT_INSTANCE = seasonWidgetExposeReply;
        GeneratedMessageLite.registerDefaultInstance(SeasonWidgetExposeReply.class, seasonWidgetExposeReply);
    }

    private SeasonWidgetExposeReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityId() {
        this.activityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    public static SeasonWidgetExposeReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonWidgetExposeReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonWidgetExposeReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonWidgetExposeReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityId(long j) {
        this.activityId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68581.f16817xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonWidgetExposeReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"seasonId_", "activityId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonWidgetExposeReply> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonWidgetExposeReply.class) {
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

    public long getSeasonId() {
        return this.seasonId_;
    }

    public static Builder newBuilder(SeasonWidgetExposeReply seasonWidgetExposeReply) {
        return DEFAULT_INSTANCE.createBuilder(seasonWidgetExposeReply);
    }

    public static SeasonWidgetExposeReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonWidgetExposeReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonWidgetExposeReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReply parseFrom(InputStream inputStream) throws IOException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonWidgetExposeReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonWidgetExposeReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonWidgetExposeReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonWidgetExposeReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
