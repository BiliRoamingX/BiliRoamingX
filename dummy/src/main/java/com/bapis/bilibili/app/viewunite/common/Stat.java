package com.bapis.bilibili.app.viewunite.common;

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
    public static final int COIN_FIELD_NUMBER = 5;
    public static final int DANMAKU_FIELD_NUMBER = 2;
    private static final Stat DEFAULT_INSTANCE;
    public static final int FAV_FIELD_NUMBER = 4;
    public static final int FOLLOW_FIELD_NUMBER = 8;
    public static final int LIKE_FIELD_NUMBER = 7;
    private static volatile Parser<Stat> PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 3;
    public static final int SHARE_FIELD_NUMBER = 6;
    public static final int VT_FIELD_NUMBER = 1;
    private long coin_;
    private StatInfo danmaku_;
    private long fav_;
    private long follow_;
    private long like_;
    private long reply_;
    private long share_;
    private StatInfo vt_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Stat$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70651 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17042xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17042xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17042xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17042xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17042xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17042xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17042xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17042xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Stat, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70651 c70651) {
            this();
        }

        public Builder clearCoin() {
            copyOnWrite();
            ((Stat) this.instance).clearCoin();
            return this;
        }

        public Builder clearDanmaku() {
            copyOnWrite();
            ((Stat) this.instance).clearDanmaku();
            return this;
        }

        public Builder clearFav() {
            copyOnWrite();
            ((Stat) this.instance).clearFav();
            return this;
        }

        public Builder clearFollow() {
            copyOnWrite();
            ((Stat) this.instance).clearFollow();
            return this;
        }

        public Builder clearLike() {
            copyOnWrite();
            ((Stat) this.instance).clearLike();
            return this;
        }

        public Builder clearReply() {
            copyOnWrite();
            ((Stat) this.instance).clearReply();
            return this;
        }

        public Builder clearShare() {
            copyOnWrite();
            ((Stat) this.instance).clearShare();
            return this;
        }

        public Builder clearVt() {
            copyOnWrite();
            ((Stat) this.instance).clearVt();
            return this;
        }

        public long getCoin() {
            return ((Stat) this.instance).getCoin();
        }

        public StatInfo getDanmaku() {
            return ((Stat) this.instance).getDanmaku();
        }

        public long getFav() {
            return ((Stat) this.instance).getFav();
        }

        public long getFollow() {
            return ((Stat) this.instance).getFollow();
        }

        public long getLike() {
            return ((Stat) this.instance).getLike();
        }

        public long getReply() {
            return ((Stat) this.instance).getReply();
        }

        public long getShare() {
            return ((Stat) this.instance).getShare();
        }

        public StatInfo getVt() {
            return ((Stat) this.instance).getVt();
        }

        public boolean hasDanmaku() {
            return ((Stat) this.instance).hasDanmaku();
        }

        public boolean hasVt() {
            return ((Stat) this.instance).hasVt();
        }

        public Builder mergeDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((Stat) this.instance).mergeDanmaku(statInfo);
            return this;
        }

        public Builder mergeVt(StatInfo statInfo) {
            copyOnWrite();
            ((Stat) this.instance).mergeVt(statInfo);
            return this;
        }

        public Builder setCoin(long j) {
            copyOnWrite();
            ((Stat) this.instance).setCoin(j);
            return this;
        }

        public Builder setDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((Stat) this.instance).setDanmaku(statInfo);
            return this;
        }

        public Builder setFav(long j) {
            copyOnWrite();
            ((Stat) this.instance).setFav(j);
            return this;
        }

        public Builder setFollow(long j) {
            copyOnWrite();
            ((Stat) this.instance).setFollow(j);
            return this;
        }

        public Builder setLike(long j) {
            copyOnWrite();
            ((Stat) this.instance).setLike(j);
            return this;
        }

        public Builder setReply(long j) {
            copyOnWrite();
            ((Stat) this.instance).setReply(j);
            return this;
        }

        public Builder setShare(long j) {
            copyOnWrite();
            ((Stat) this.instance).setShare(j);
            return this;
        }

        public Builder setVt(StatInfo statInfo) {
            copyOnWrite();
            ((Stat) this.instance).setVt(statInfo);
            return this;
        }

        private Builder() {
            super(Stat.DEFAULT_INSTANCE);
        }

        public Builder setDanmaku(StatInfo.Builder builder) {
            copyOnWrite();
            ((Stat) this.instance).setDanmaku(builder.build());
            return this;
        }

        public Builder setVt(StatInfo.Builder builder) {
            copyOnWrite();
            ((Stat) this.instance).setVt(builder.build());
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

    public void clearCoin() {
        this.coin_ = 0L;
    }

    public void clearDanmaku() {
        this.danmaku_ = null;
    }

    public void clearFav() {
        this.fav_ = 0L;
    }

    public void clearFollow() {
        this.follow_ = 0L;
    }

    public void clearLike() {
        this.like_ = 0L;
    }

    public void clearReply() {
        this.reply_ = 0L;
    }

    public void clearShare() {
        this.share_ = 0L;
    }

    public void clearVt() {
        this.vt_ = null;
    }

    public static Stat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeDanmaku(StatInfo statInfo) {
        statInfo.getClass();
        StatInfo statInfo2 = this.danmaku_;
        if (statInfo2 != null && statInfo2 != StatInfo.getDefaultInstance()) {
            this.danmaku_ = StatInfo.newBuilder(this.danmaku_).mergeFrom((StatInfo) statInfo).buildPartial();
        } else {
            this.danmaku_ = statInfo;
        }
    }

    public void mergeVt(StatInfo statInfo) {
        statInfo.getClass();
        StatInfo statInfo2 = this.vt_;
        if (statInfo2 != null && statInfo2 != StatInfo.getDefaultInstance()) {
            this.vt_ = StatInfo.newBuilder(this.vt_).mergeFrom((StatInfo) statInfo).buildPartial();
        } else {
            this.vt_ = statInfo;
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

    public void setCoin(long j) {
        this.coin_ = j;
    }

    public void setDanmaku(StatInfo statInfo) {
        statInfo.getClass();
        this.danmaku_ = statInfo;
    }

    public void setFav(long j) {
        this.fav_ = j;
    }

    public void setFollow(long j) {
        this.follow_ = j;
    }

    public void setLike(long j) {
        this.like_ = j;
    }

    public void setReply(long j) {
        this.reply_ = j;
    }

    public void setShare(long j) {
        this.share_ = j;
    }

    public void setVt(StatInfo statInfo) {
        statInfo.getClass();
        this.vt_ = statInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70651.f17042xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Stat();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002", new Object[]{"vt_", "danmaku_", "reply_", "fav_", "coin_", "share_", "like_", "follow_"});
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

    public long getCoin() {
        return this.coin_;
    }

    public StatInfo getDanmaku() {
        StatInfo statInfo = this.danmaku_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public long getFav() {
        return this.fav_;
    }

    public long getFollow() {
        return this.follow_;
    }

    public long getLike() {
        return this.like_;
    }

    public long getReply() {
        return this.reply_;
    }

    public long getShare() {
        return this.share_;
    }

    public StatInfo getVt() {
        StatInfo statInfo = this.vt_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public boolean hasDanmaku() {
        return this.danmaku_ != null;
    }

    public boolean hasVt() {
        return this.vt_ != null;
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
