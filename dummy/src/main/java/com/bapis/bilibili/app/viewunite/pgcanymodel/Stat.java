package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.bapis.bilibili.app.viewunite.common.StatInfo;
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
public final class Stat extends GeneratedMessageLite<Stat, Stat.Builder> implements MessageLiteOrBuilder {
    private static final Stat DEFAULT_INSTANCE;
    public static final int FOLLOWERS_FIELD_NUMBER = 1;
    private static volatile Parser<Stat> PARSER = null;
    public static final int PLAY_DATA_FIELD_NUMBER = 2;
    private String followers_ = "";
    private StatInfo playData_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.Stat$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17074xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17074xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17074xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Stat, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70971 c70971) {
            this();
        }

        public Builder clearFollowers() {
            copyOnWrite();
            ((Stat) this.instance).clearFollowers();
            return this;
        }

        public Builder clearPlayData() {
            copyOnWrite();
            ((Stat) this.instance).clearPlayData();
            return this;
        }

        public String getFollowers() {
            return ((Stat) this.instance).getFollowers();
        }

        public ByteString getFollowersBytes() {
            return ((Stat) this.instance).getFollowersBytes();
        }

        public StatInfo getPlayData() {
            return ((Stat) this.instance).getPlayData();
        }

        public boolean hasPlayData() {
            return ((Stat) this.instance).hasPlayData();
        }

        public Builder mergePlayData(StatInfo statInfo) {
            copyOnWrite();
            ((Stat) this.instance).mergePlayData(statInfo);
            return this;
        }

        public Builder setFollowers(String str) {
            copyOnWrite();
            ((Stat) this.instance).setFollowers(str);
            return this;
        }

        public Builder setFollowersBytes(ByteString byteString) {
            copyOnWrite();
            ((Stat) this.instance).setFollowersBytes(byteString);
            return this;
        }

        public Builder setPlayData(StatInfo statInfo) {
            copyOnWrite();
            ((Stat) this.instance).setPlayData(statInfo);
            return this;
        }

        private Builder() {
            super(Stat.DEFAULT_INSTANCE);
        }

        public Builder setPlayData(StatInfo.Builder builder) {
            copyOnWrite();
            ((Stat) this.instance).setPlayData(builder.build());
            return this;
        }
    }

    static {
        Stat stat = new Stat();
        DEFAULT_INSTANCE = stat;
        GeneratedMessageLite.registerDefaultInstance(Stat.class, stat);
    }

    private Stat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowers() {
        this.followers_ = getDefaultInstance().getFollowers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayData() {
        this.playData_ = null;
    }

    public static Stat getDefaultInstance() {
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

    public static Stat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Stat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Stat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Stat> parser() {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70971.f17074xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Stat();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[]{"followers_", "playData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Stat> parser = PARSER;
                if (parser == null) {
                    synchronized (Stat.class) {
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

    public boolean hasPlayData() {
        return this.playData_ != null;
    }

    public static Builder newBuilder(Stat stat) {
        return DEFAULT_INSTANCE.createBuilder(stat);
    }

    public static Stat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Stat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Stat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Stat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Stat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Stat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Stat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Stat parseFrom(InputStream inputStream) throws IOException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Stat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Stat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Stat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Stat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
