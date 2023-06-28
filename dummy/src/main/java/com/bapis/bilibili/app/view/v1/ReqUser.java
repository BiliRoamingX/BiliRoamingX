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
public final class ReqUser extends GeneratedMessageLite<ReqUser, ReqUser.Builder> implements MessageLiteOrBuilder {
    public static final int ATTENTION_FIELD_NUMBER = 1;
    public static final int ATTENTION_LEVEL_FIELD_NUMBER = 7;
    public static final int COIN_FIELD_NUMBER = 6;
    private static final ReqUser DEFAULT_INSTANCE;
    public static final int DISLIKE_FIELD_NUMBER = 5;
    public static final int ELEC_PLUS_BTN_FIELD_NUMBER = 9;
    public static final int FAVORITE_FIELD_NUMBER = 3;
    public static final int FAV_SEASON_FIELD_NUMBER = 8;
    public static final int GUEST_ATTENTION_FIELD_NUMBER = 2;
    public static final int LIKE_FIELD_NUMBER = 4;
    private static volatile Parser<ReqUser> PARSER;
    private int attentionLevel_;
    private int attention_;
    private int coin_;
    private int dislike_;
    private Button elecPlusBtn_;
    private int favSeason_;
    private int favorite_;
    private int guestAttention_;
    private int like_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ReqUser$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68461 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16806xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16806xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16806xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16806xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16806xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16806xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16806xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16806xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ReqUser, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68461 c68461) {
            this();
        }

        public Builder clearAttention() {
            copyOnWrite();
            ((ReqUser) this.instance).clearAttention();
            return this;
        }

        public Builder clearAttentionLevel() {
            copyOnWrite();
            ((ReqUser) this.instance).clearAttentionLevel();
            return this;
        }

        public Builder clearCoin() {
            copyOnWrite();
            ((ReqUser) this.instance).clearCoin();
            return this;
        }

        public Builder clearDislike() {
            copyOnWrite();
            ((ReqUser) this.instance).clearDislike();
            return this;
        }

        public Builder clearElecPlusBtn() {
            copyOnWrite();
            ((ReqUser) this.instance).clearElecPlusBtn();
            return this;
        }

        public Builder clearFavSeason() {
            copyOnWrite();
            ((ReqUser) this.instance).clearFavSeason();
            return this;
        }

        public Builder clearFavorite() {
            copyOnWrite();
            ((ReqUser) this.instance).clearFavorite();
            return this;
        }

        public Builder clearGuestAttention() {
            copyOnWrite();
            ((ReqUser) this.instance).clearGuestAttention();
            return this;
        }

        public Builder clearLike() {
            copyOnWrite();
            ((ReqUser) this.instance).clearLike();
            return this;
        }

        public int getAttention() {
            return ((ReqUser) this.instance).getAttention();
        }

        public int getAttentionLevel() {
            return ((ReqUser) this.instance).getAttentionLevel();
        }

        public int getCoin() {
            return ((ReqUser) this.instance).getCoin();
        }

        public int getDislike() {
            return ((ReqUser) this.instance).getDislike();
        }

        public Button getElecPlusBtn() {
            return ((ReqUser) this.instance).getElecPlusBtn();
        }

        public int getFavSeason() {
            return ((ReqUser) this.instance).getFavSeason();
        }

        public int getFavorite() {
            return ((ReqUser) this.instance).getFavorite();
        }

        public int getGuestAttention() {
            return ((ReqUser) this.instance).getGuestAttention();
        }

        public int getLike() {
            return ((ReqUser) this.instance).getLike();
        }

        public boolean hasElecPlusBtn() {
            return ((ReqUser) this.instance).hasElecPlusBtn();
        }

        public Builder mergeElecPlusBtn(Button button) {
            copyOnWrite();
            ((ReqUser) this.instance).mergeElecPlusBtn(button);
            return this;
        }

        public Builder setAttention(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setAttention(i);
            return this;
        }

        public Builder setAttentionLevel(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setAttentionLevel(i);
            return this;
        }

        public Builder setCoin(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setCoin(i);
            return this;
        }

        public Builder setDislike(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setDislike(i);
            return this;
        }

        public Builder setElecPlusBtn(Button button) {
            copyOnWrite();
            ((ReqUser) this.instance).setElecPlusBtn(button);
            return this;
        }

        public Builder setFavSeason(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setFavSeason(i);
            return this;
        }

        public Builder setFavorite(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setFavorite(i);
            return this;
        }

        public Builder setGuestAttention(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setGuestAttention(i);
            return this;
        }

        public Builder setLike(int i) {
            copyOnWrite();
            ((ReqUser) this.instance).setLike(i);
            return this;
        }

        private Builder() {
            super(ReqUser.DEFAULT_INSTANCE);
        }

        public Builder setElecPlusBtn(Button.Builder builder) {
            copyOnWrite();
            ((ReqUser) this.instance).setElecPlusBtn(builder.build());
            return this;
        }
    }

    static {
        ReqUser reqUser = new ReqUser();
        DEFAULT_INSTANCE = reqUser;
        GeneratedMessageLite.registerDefaultInstance(ReqUser.class, reqUser);
    }

    private ReqUser() {
    }

    public void clearAttention() {
        this.attention_ = 0;
    }

    public void clearAttentionLevel() {
        this.attentionLevel_ = 0;
    }

    public void clearCoin() {
        this.coin_ = 0;
    }

    public void clearDislike() {
        this.dislike_ = 0;
    }

    public void clearElecPlusBtn() {
        this.elecPlusBtn_ = null;
    }

    public void clearFavSeason() {
        this.favSeason_ = 0;
    }

    public void clearFavorite() {
        this.favorite_ = 0;
    }

    public void clearGuestAttention() {
        this.guestAttention_ = 0;
    }

    public void clearLike() {
        this.like_ = 0;
    }

    public static ReqUser getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeElecPlusBtn(Button button) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReqUser parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReqUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReqUser parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReqUser> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAttention(int i) {
        this.attention_ = i;
    }

    public void setAttentionLevel(int i) {
        this.attentionLevel_ = i;
    }

    public void setCoin(int i) {
        this.coin_ = i;
    }

    public void setDislike(int i) {
        this.dislike_ = i;
    }

    public void setElecPlusBtn(Button button) {
        button.getClass();
        this.elecPlusBtn_ = button;
    }

    public void setFavSeason(int i) {
        this.favSeason_ = i;
    }

    public void setFavorite(int i) {
        this.favorite_ = i;
    }

    public void setGuestAttention(int i) {
        this.guestAttention_ = i;
    }

    public void setLike(int i) {
        this.like_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68461.f16806xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReqUser();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\t", new Object[]{"attention_", "guestAttention_", "favorite_", "like_", "dislike_", "coin_", "attentionLevel_", "favSeason_", "elecPlusBtn_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReqUser> parser = PARSER;
                if (parser == null) {
                    synchronized (ReqUser.class) {
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

    public int getAttention() {
        return this.attention_;
    }

    public int getAttentionLevel() {
        return this.attentionLevel_;
    }

    public int getCoin() {
        return this.coin_;
    }

    public int getDislike() {
        return this.dislike_;
    }

    public Button getElecPlusBtn() {
        Button button = this.elecPlusBtn_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public int getFavSeason() {
        return this.favSeason_;
    }

    public int getFavorite() {
        return this.favorite_;
    }

    public int getGuestAttention() {
        return this.guestAttention_;
    }

    public int getLike() {
        return this.like_;
    }

    public boolean hasElecPlusBtn() {
        return this.elecPlusBtn_ != null;
    }

    public static Builder newBuilder(ReqUser reqUser) {
        return DEFAULT_INSTANCE.createBuilder(reqUser);
    }

    public static ReqUser parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReqUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReqUser parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReqUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReqUser parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReqUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReqUser parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReqUser parseFrom(InputStream inputStream) throws IOException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReqUser parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReqUser parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReqUser parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
