package com.bapis.bilibili.app.archive.v1;

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
/* loaded from: classes12.dex */
public final class Stat extends GeneratedMessageLite<Stat, Stat.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    public static final int COIN_FIELD_NUMBER = 6;
    public static final int DANMAKU_FIELD_NUMBER = 3;
    private static final Stat DEFAULT_INSTANCE;
    public static final int DISLIKE_FIELD_NUMBER = 11;
    public static final int FAV_FIELD_NUMBER = 5;
    public static final int HIS_RANK_FIELD_NUMBER = 9;
    public static final int LIKE_FIELD_NUMBER = 10;
    public static final int NOW_RANK_FIELD_NUMBER = 8;
    private static volatile Parser<Stat> PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 4;
    public static final int SHARE_FIELD_NUMBER = 7;
    public static final int VIEW_FIELD_NUMBER = 2;
    private long aid_;
    private int coin_;
    private int danmaku_;
    private int dislike_;
    private int fav_;
    private int hisRank_;
    private int like_;
    private int nowRank_;
    private int reply_;
    private int share_;
    private int view_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.v1.Stat$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15732xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15732xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15732xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15732xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15732xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15732xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15732xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15732xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Stat, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C55221 c55221) {
            this();
        }

        public Builder clearAid() {
            copyOnWrite();
            ((Stat) this.instance).clearAid();
            return this;
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

        public Builder clearDislike() {
            copyOnWrite();
            ((Stat) this.instance).clearDislike();
            return this;
        }

        public Builder clearFav() {
            copyOnWrite();
            ((Stat) this.instance).clearFav();
            return this;
        }

        public Builder clearHisRank() {
            copyOnWrite();
            ((Stat) this.instance).clearHisRank();
            return this;
        }

        public Builder clearLike() {
            copyOnWrite();
            ((Stat) this.instance).clearLike();
            return this;
        }

        public Builder clearNowRank() {
            copyOnWrite();
            ((Stat) this.instance).clearNowRank();
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

        public Builder clearView() {
            copyOnWrite();
            ((Stat) this.instance).clearView();
            return this;
        }

        public long getAid() {
            return ((Stat) this.instance).getAid();
        }

        public int getCoin() {
            return ((Stat) this.instance).getCoin();
        }

        public int getDanmaku() {
            return ((Stat) this.instance).getDanmaku();
        }

        public int getDislike() {
            return ((Stat) this.instance).getDislike();
        }

        public int getFav() {
            return ((Stat) this.instance).getFav();
        }

        public int getHisRank() {
            return ((Stat) this.instance).getHisRank();
        }

        public int getLike() {
            return ((Stat) this.instance).getLike();
        }

        public int getNowRank() {
            return ((Stat) this.instance).getNowRank();
        }

        public int getReply() {
            return ((Stat) this.instance).getReply();
        }

        public int getShare() {
            return ((Stat) this.instance).getShare();
        }

        public int getView() {
            return ((Stat) this.instance).getView();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((Stat) this.instance).setAid(j);
            return this;
        }

        public Builder setCoin(int i) {
            copyOnWrite();
            ((Stat) this.instance).setCoin(i);
            return this;
        }

        public Builder setDanmaku(int i) {
            copyOnWrite();
            ((Stat) this.instance).setDanmaku(i);
            return this;
        }

        public Builder setDislike(int i) {
            copyOnWrite();
            ((Stat) this.instance).setDislike(i);
            return this;
        }

        public Builder setFav(int i) {
            copyOnWrite();
            ((Stat) this.instance).setFav(i);
            return this;
        }

        public Builder setHisRank(int i) {
            copyOnWrite();
            ((Stat) this.instance).setHisRank(i);
            return this;
        }

        public Builder setLike(int i) {
            copyOnWrite();
            ((Stat) this.instance).setLike(i);
            return this;
        }

        public Builder setNowRank(int i) {
            copyOnWrite();
            ((Stat) this.instance).setNowRank(i);
            return this;
        }

        public Builder setReply(int i) {
            copyOnWrite();
            ((Stat) this.instance).setReply(i);
            return this;
        }

        public Builder setShare(int i) {
            copyOnWrite();
            ((Stat) this.instance).setShare(i);
            return this;
        }

        public Builder setView(int i) {
            copyOnWrite();
            ((Stat) this.instance).setView(i);
            return this;
        }

        private Builder() {
            super(Stat.DEFAULT_INSTANCE);
        }
    }

    static {
        Stat stat = new Stat();
        DEFAULT_INSTANCE = stat;
        GeneratedMessageLite.registerDefaultInstance(Stat.class, stat);
    }

    private Stat() {
    }

    public void clearAid() {
        this.aid_ = 0L;
    }

    public void clearCoin() {
        this.coin_ = 0;
    }

    public void clearDanmaku() {
        this.danmaku_ = 0;
    }

    public void clearDislike() {
        this.dislike_ = 0;
    }

    public void clearFav() {
        this.fav_ = 0;
    }

    public void clearHisRank() {
        this.hisRank_ = 0;
    }

    public void clearLike() {
        this.like_ = 0;
    }

    public void clearNowRank() {
        this.nowRank_ = 0;
    }

    public void clearReply() {
        this.reply_ = 0;
    }

    public void clearShare() {
        this.share_ = 0;
    }

    public void clearView() {
        this.view_ = 0;
    }

    public static Stat getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public void setAid(long j) {
        this.aid_ = j;
    }

    public void setCoin(int i) {
        this.coin_ = i;
    }

    public void setDanmaku(int i) {
        this.danmaku_ = i;
    }

    public void setDislike(int i) {
        this.dislike_ = i;
    }

    public void setFav(int i) {
        this.fav_ = i;
    }

    public void setHisRank(int i) {
        this.hisRank_ = i;
    }

    public void setLike(int i) {
        this.like_ = i;
    }

    public void setNowRank(int i) {
        this.nowRank_ = i;
    }

    public void setReply(int i) {
        this.reply_ = i;
    }

    public void setShare(int i) {
        this.share_ = i;
    }

    public void setView(int i) {
        this.view_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55221.f15732xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Stat();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0004", new Object[]{"aid_", "view_", "danmaku_", "reply_", "fav_", "coin_", "share_", "nowRank_", "hisRank_", "like_", "dislike_"});
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

    public long getAid() {
        return this.aid_;
    }

    public int getCoin() {
        return this.coin_;
    }

    public int getDanmaku() {
        return this.danmaku_;
    }

    public int getDislike() {
        return this.dislike_;
    }

    public int getFav() {
        return this.fav_;
    }

    public int getHisRank() {
        return this.hisRank_;
    }

    public int getLike() {
        return this.like_;
    }

    public int getNowRank() {
        return this.nowRank_;
    }

    public int getReply() {
        return this.reply_;
    }

    public int getShare() {
        return this.share_;
    }

    public int getView() {
        return this.view_;
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
