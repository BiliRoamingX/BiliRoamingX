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
public final class UgcSeasonStat extends GeneratedMessageLite<UgcSeasonStat, UgcSeasonStat.Builder> implements MessageLiteOrBuilder {
    public static final int COIN_FIELD_NUMBER = 6;
    public static final int DANMAKU_FIELD_NUMBER = 3;
    private static final UgcSeasonStat DEFAULT_INSTANCE;
    public static final int FAV_FIELD_NUMBER = 5;
    public static final int HIS_RANK_FIELD_NUMBER = 9;
    public static final int LIKE_FIELD_NUMBER = 10;
    public static final int NOW_RANK_FIELD_NUMBER = 8;
    private static volatile Parser<UgcSeasonStat> PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 4;
    public static final int SEASON_ID_FIELD_NUMBER = 1;
    public static final int SHARE_FIELD_NUMBER = 7;
    public static final int VIEW_FIELD_NUMBER = 2;
    private int coin_;
    private int danmaku_;
    private int fav_;
    private int hisRank_;
    private int like_;
    private int nowRank_;
    private int reply_;
    private long seasonId_;
    private int share_;
    private int view_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UgcSeasonStat$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16837xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16837xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16837xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16837xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16837xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16837xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16837xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16837xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcSeasonStat, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68801 c68801) {
            this();
        }

        public Builder clearCoin() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearCoin();
            return this;
        }

        public Builder clearDanmaku() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearDanmaku();
            return this;
        }

        public Builder clearFav() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearFav();
            return this;
        }

        public Builder clearHisRank() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearHisRank();
            return this;
        }

        public Builder clearLike() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearLike();
            return this;
        }

        public Builder clearNowRank() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearNowRank();
            return this;
        }

        public Builder clearReply() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearReply();
            return this;
        }

        public Builder clearSeasonId() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearSeasonId();
            return this;
        }

        public Builder clearShare() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearShare();
            return this;
        }

        public Builder clearView() {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).clearView();
            return this;
        }

        public int getCoin() {
            return ((UgcSeasonStat) this.instance).getCoin();
        }

        public int getDanmaku() {
            return ((UgcSeasonStat) this.instance).getDanmaku();
        }

        public int getFav() {
            return ((UgcSeasonStat) this.instance).getFav();
        }

        public int getHisRank() {
            return ((UgcSeasonStat) this.instance).getHisRank();
        }

        public int getLike() {
            return ((UgcSeasonStat) this.instance).getLike();
        }

        public int getNowRank() {
            return ((UgcSeasonStat) this.instance).getNowRank();
        }

        public int getReply() {
            return ((UgcSeasonStat) this.instance).getReply();
        }

        public long getSeasonId() {
            return ((UgcSeasonStat) this.instance).getSeasonId();
        }

        public int getShare() {
            return ((UgcSeasonStat) this.instance).getShare();
        }

        public int getView() {
            return ((UgcSeasonStat) this.instance).getView();
        }

        public Builder setCoin(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setCoin(i);
            return this;
        }

        public Builder setDanmaku(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setDanmaku(i);
            return this;
        }

        public Builder setFav(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setFav(i);
            return this;
        }

        public Builder setHisRank(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setHisRank(i);
            return this;
        }

        public Builder setLike(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setLike(i);
            return this;
        }

        public Builder setNowRank(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setNowRank(i);
            return this;
        }

        public Builder setReply(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setReply(i);
            return this;
        }

        public Builder setSeasonId(long j) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setSeasonId(j);
            return this;
        }

        public Builder setShare(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setShare(i);
            return this;
        }

        public Builder setView(int i) {
            copyOnWrite();
            ((UgcSeasonStat) this.instance).setView(i);
            return this;
        }

        private Builder() {
            super(UgcSeasonStat.DEFAULT_INSTANCE);
        }
    }

    static {
        UgcSeasonStat ugcSeasonStat = new UgcSeasonStat();
        DEFAULT_INSTANCE = ugcSeasonStat;
        GeneratedMessageLite.registerDefaultInstance(UgcSeasonStat.class, ugcSeasonStat);
    }

    private UgcSeasonStat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoin() {
        this.coin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmaku() {
        this.danmaku_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFav() {
        this.fav_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHisRank() {
        this.hisRank_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLike() {
        this.like_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNowRank() {
        this.nowRank_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReply() {
        this.reply_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeasonId() {
        this.seasonId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShare() {
        this.share_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearView() {
        this.view_ = 0;
    }

    public static UgcSeasonStat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcSeasonStat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonStat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcSeasonStat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoin(int i) {
        this.coin_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmaku(int i) {
        this.danmaku_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFav(int i) {
        this.fav_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHisRank(int i) {
        this.hisRank_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLike(int i) {
        this.like_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNowRank(int i) {
        this.nowRank_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReply(int i) {
        this.reply_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeasonId(long j) {
        this.seasonId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShare(int i) {
        this.share_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setView(int i) {
        this.view_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68801.f16837xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcSeasonStat();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004", new Object[]{"seasonId_", "view_", "danmaku_", "reply_", "fav_", "coin_", "share_", "nowRank_", "hisRank_", "like_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcSeasonStat> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcSeasonStat.class) {
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

    public int getCoin() {
        return this.coin_;
    }

    public int getDanmaku() {
        return this.danmaku_;
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

    public long getSeasonId() {
        return this.seasonId_;
    }

    public int getShare() {
        return this.share_;
    }

    public int getView() {
        return this.view_;
    }

    public static Builder newBuilder(UgcSeasonStat ugcSeasonStat) {
        return DEFAULT_INSTANCE.createBuilder(ugcSeasonStat);
    }

    public static UgcSeasonStat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonStat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcSeasonStat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UgcSeasonStat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcSeasonStat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcSeasonStat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcSeasonStat parseFrom(InputStream inputStream) throws IOException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSeasonStat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSeasonStat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcSeasonStat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSeasonStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
