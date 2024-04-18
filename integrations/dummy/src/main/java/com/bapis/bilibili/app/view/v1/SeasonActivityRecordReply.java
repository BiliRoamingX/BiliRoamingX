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
public final class SeasonActivityRecordReply extends GeneratedMessageLite<SeasonActivityRecordReply, SeasonActivityRecordReply.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_FIELD_NUMBER = 1;
    private static final SeasonActivityRecordReply DEFAULT_INSTANCE;
    private static volatile Parser<SeasonActivityRecordReply> PARSER;
    private UgcSeasonActivity activity_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.SeasonActivityRecordReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68511 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16811xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16811xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16811xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16811xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16811xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16811xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16811xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16811xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonActivityRecordReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68511 c68511) {
            this();
        }

        public Builder clearActivity() {
            copyOnWrite();
            ((SeasonActivityRecordReply) this.instance).clearActivity();
            return this;
        }

        public UgcSeasonActivity getActivity() {
            return ((SeasonActivityRecordReply) this.instance).getActivity();
        }

        public boolean hasActivity() {
            return ((SeasonActivityRecordReply) this.instance).hasActivity();
        }

        public Builder mergeActivity(UgcSeasonActivity ugcSeasonActivity) {
            copyOnWrite();
            ((SeasonActivityRecordReply) this.instance).mergeActivity(ugcSeasonActivity);
            return this;
        }

        public Builder setActivity(UgcSeasonActivity ugcSeasonActivity) {
            copyOnWrite();
            ((SeasonActivityRecordReply) this.instance).setActivity(ugcSeasonActivity);
            return this;
        }

        private Builder() {
            super(SeasonActivityRecordReply.DEFAULT_INSTANCE);
        }

        public Builder setActivity(UgcSeasonActivity.Builder builder) {
            copyOnWrite();
            ((SeasonActivityRecordReply) this.instance).setActivity(builder.build());
            return this;
        }
    }

    static {
        SeasonActivityRecordReply seasonActivityRecordReply = new SeasonActivityRecordReply();
        DEFAULT_INSTANCE = seasonActivityRecordReply;
        GeneratedMessageLite.registerDefaultInstance(SeasonActivityRecordReply.class, seasonActivityRecordReply);
    }

    private SeasonActivityRecordReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivity() {
        this.activity_ = null;
    }

    public static SeasonActivityRecordReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivity(UgcSeasonActivity ugcSeasonActivity) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonActivityRecordReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonActivityRecordReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonActivityRecordReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivity(UgcSeasonActivity ugcSeasonActivity) {
        ugcSeasonActivity.getClass();
        this.activity_ = ugcSeasonActivity;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68511.f16811xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonActivityRecordReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"activity_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonActivityRecordReply> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonActivityRecordReply.class) {
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

    public UgcSeasonActivity getActivity() {
        UgcSeasonActivity ugcSeasonActivity = this.activity_;
        return ugcSeasonActivity == null ? UgcSeasonActivity.getDefaultInstance() : ugcSeasonActivity;
    }

    public boolean hasActivity() {
        return this.activity_ != null;
    }

    public static Builder newBuilder(SeasonActivityRecordReply seasonActivityRecordReply) {
        return DEFAULT_INSTANCE.createBuilder(seasonActivityRecordReply);
    }

    public static SeasonActivityRecordReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonActivityRecordReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonActivityRecordReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonActivityRecordReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonActivityRecordReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonActivityRecordReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonActivityRecordReply parseFrom(InputStream inputStream) throws IOException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonActivityRecordReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonActivityRecordReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonActivityRecordReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonActivityRecordReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
