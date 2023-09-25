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
public final class OgvIntroduction extends GeneratedMessageLite<OgvIntroduction, OgvIntroduction.Builder> implements MessageLiteOrBuilder {
    private static final OgvIntroduction DEFAULT_INSTANCE;
    public static final int FOLLOWERS_FIELD_NUMBER = 1;
    private static volatile Parser<OgvIntroduction> PARSER = null;
    public static final int PLAY_DATA_FIELD_NUMBER = 3;
    public static final int SCORE_FIELD_NUMBER = 2;
    private StatInfo playData_;
    private String followers_ = "";
    private String score_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.OgvIntroduction$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70211 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17002xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17002xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17002xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17002xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17002xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17002xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OgvIntroduction, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70211 c70211) {
            this();
        }

        public Builder clearFollowers() {
            copyOnWrite();
            ((OgvIntroduction) this.instance).clearFollowers();
            return this;
        }

        public Builder clearPlayData() {
            copyOnWrite();
            ((OgvIntroduction) this.instance).clearPlayData();
            return this;
        }

        public Builder clearScore() {
            copyOnWrite();
            ((OgvIntroduction) this.instance).clearScore();
            return this;
        }

        public String getFollowers() {
            return ((OgvIntroduction) this.instance).getFollowers();
        }

        public ByteString getFollowersBytes() {
            return ((OgvIntroduction) this.instance).getFollowersBytes();
        }

        public StatInfo getPlayData() {
            return ((OgvIntroduction) this.instance).getPlayData();
        }

        public String getScore() {
            return ((OgvIntroduction) this.instance).getScore();
        }

        public ByteString getScoreBytes() {
            return ((OgvIntroduction) this.instance).getScoreBytes();
        }

        public boolean hasPlayData() {
            return ((OgvIntroduction) this.instance).hasPlayData();
        }

        public Builder mergePlayData(StatInfo statInfo) {
            copyOnWrite();
            ((OgvIntroduction) this.instance).mergePlayData(statInfo);
            return this;
        }

        public Builder setFollowers(String str) {
            copyOnWrite();
            ((OgvIntroduction) this.instance).setFollowers(str);
            return this;
        }

        public Builder setFollowersBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvIntroduction) this.instance).setFollowersBytes(byteString);
            return this;
        }

        public Builder setPlayData(StatInfo statInfo) {
            copyOnWrite();
            ((OgvIntroduction) this.instance).setPlayData(statInfo);
            return this;
        }

        public Builder setScore(String str) {
            copyOnWrite();
            ((OgvIntroduction) this.instance).setScore(str);
            return this;
        }

        public Builder setScoreBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvIntroduction) this.instance).setScoreBytes(byteString);
            return this;
        }

        private Builder() {
            super(OgvIntroduction.DEFAULT_INSTANCE);
        }

        public Builder setPlayData(StatInfo.Builder builder) {
            copyOnWrite();
            ((OgvIntroduction) this.instance).setPlayData(builder.build());
            return this;
        }
    }

    static {
        OgvIntroduction ogvIntroduction = new OgvIntroduction();
        DEFAULT_INSTANCE = ogvIntroduction;
        GeneratedMessageLite.registerDefaultInstance(OgvIntroduction.class, ogvIntroduction);
    }

    public OgvIntroduction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowers() {
        this.followers_ = getDefaultInstance().getFollowers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayData() {
        this.playData_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = getDefaultInstance().getScore();
    }

    public static OgvIntroduction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayData(StatInfo statInfo) {
        statInfo.getClass();
        StatInfo statInfo2 = this.playData_;
        if (statInfo2 != null && statInfo2 != StatInfo.getDefaultInstance()) {
            this.playData_ = StatInfo.newBuilder(this.playData_).mergeFrom((StatInfo) statInfo).buildPartial();
        } else {
            this.playData_ = statInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OgvIntroduction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OgvIntroduction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvIntroduction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OgvIntroduction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowers(String str) {
        str.getClass();
        this.followers_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowersBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.followers_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayData(StatInfo statInfo) {
        statInfo.getClass();
        this.playData_ = statInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(String str) {
        str.getClass();
        this.score_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScoreBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.score_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70211.f17002xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OgvIntroduction();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\t", new Object[]{"followers_", "score_", "playData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OgvIntroduction> parser = PARSER;
                if (parser == null) {
                    synchronized (OgvIntroduction.class) {
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

    public String getFollowers() {
        return this.followers_;
    }

    public ByteString getFollowersBytes() {
        return ByteString.copyFromUtf8(this.followers_);
    }

    public StatInfo getPlayData() {
        StatInfo statInfo = this.playData_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public String getScore() {
        return this.score_;
    }

    public ByteString getScoreBytes() {
        return ByteString.copyFromUtf8(this.score_);
    }

    public boolean hasPlayData() {
        return this.playData_ != null;
    }

    public static Builder newBuilder(OgvIntroduction ogvIntroduction) {
        return DEFAULT_INSTANCE.createBuilder(ogvIntroduction);
    }

    public static OgvIntroduction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvIntroduction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvIntroduction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OgvIntroduction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OgvIntroduction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OgvIntroduction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OgvIntroduction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OgvIntroduction parseFrom(InputStream inputStream) throws IOException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvIntroduction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvIntroduction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OgvIntroduction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
