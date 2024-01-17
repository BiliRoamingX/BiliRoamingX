package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class KingPos extends GeneratedMessageLite<KingPos, KingPos.Builder> implements KingPosOrBuilder {
    public static final int CHECKED_TOAST_FIELD_NUMBER = 5;
    public static final int COIN_FIELD_NUMBER = 7;
    private static final KingPos DEFAULT_INSTANCE;
    public static final int DISABLE_FIELD_NUMBER = 1;
    public static final int DISABLE_TOAST_FIELD_NUMBER = 4;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int LIKE_FIELD_NUMBER = 6;
    private static volatile Parser<KingPos> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private boolean disable_;
    private Object extend_;
    private int type_;
    private int extendCase_ = 0;
    private String icon_ = "";
    private String disableToast_ = "";
    private String checkedToast_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.KingPos$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16990xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16990xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16990xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16990xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16990xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KingPos, Builder> implements KingPosOrBuilder {
        /* synthetic */ Builder(C70061 c70061) {
            this();
        }

        public Builder clearCheckedToast() {
            copyOnWrite();
            ((KingPos) this.instance).clearCheckedToast();
            return this;
        }

        public Builder clearCoin() {
            copyOnWrite();
            ((KingPos) this.instance).clearCoin();
            return this;
        }

        public Builder clearDisable() {
            copyOnWrite();
            ((KingPos) this.instance).clearDisable();
            return this;
        }

        public Builder clearDisableToast() {
            copyOnWrite();
            ((KingPos) this.instance).clearDisableToast();
            return this;
        }

        public Builder clearExtend() {
            copyOnWrite();
            ((KingPos) this.instance).clearExtend();
            return this;
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((KingPos) this.instance).clearIcon();
            return this;
        }

        public Builder clearLike() {
            copyOnWrite();
            ((KingPos) this.instance).clearLike();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((KingPos) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public String getCheckedToast() {
            return ((KingPos) this.instance).getCheckedToast();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public ByteString getCheckedToastBytes() {
            return ((KingPos) this.instance).getCheckedToastBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public CoinExtend getCoin() {
            return ((KingPos) this.instance).getCoin();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public boolean getDisable() {
            return ((KingPos) this.instance).getDisable();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public String getDisableToast() {
            return ((KingPos) this.instance).getDisableToast();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public ByteString getDisableToastBytes() {
            return ((KingPos) this.instance).getDisableToastBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public ExtendCase getExtendCase() {
            return ((KingPos) this.instance).getExtendCase();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public String getIcon() {
            return ((KingPos) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public ByteString getIconBytes() {
            return ((KingPos) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public LikeExtend getLike() {
            return ((KingPos) this.instance).getLike();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public KingPositionType getType() {
            return ((KingPos) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public int getTypeValue() {
            return ((KingPos) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public boolean hasCoin() {
            return ((KingPos) this.instance).hasCoin();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
        public boolean hasLike() {
            return ((KingPos) this.instance).hasLike();
        }

        public Builder mergeCoin(CoinExtend coinExtend) {
            copyOnWrite();
            ((KingPos) this.instance).mergeCoin(coinExtend);
            return this;
        }

        public Builder mergeLike(LikeExtend likeExtend) {
            copyOnWrite();
            ((KingPos) this.instance).mergeLike(likeExtend);
            return this;
        }

        public Builder setCheckedToast(String str) {
            copyOnWrite();
            ((KingPos) this.instance).setCheckedToast(str);
            return this;
        }

        public Builder setCheckedToastBytes(ByteString byteString) {
            copyOnWrite();
            ((KingPos) this.instance).setCheckedToastBytes(byteString);
            return this;
        }

        public Builder setCoin(CoinExtend coinExtend) {
            copyOnWrite();
            ((KingPos) this.instance).setCoin(coinExtend);
            return this;
        }

        public Builder setDisable(boolean z) {
            copyOnWrite();
            ((KingPos) this.instance).setDisable(z);
            return this;
        }

        public Builder setDisableToast(String str) {
            copyOnWrite();
            ((KingPos) this.instance).setDisableToast(str);
            return this;
        }

        public Builder setDisableToastBytes(ByteString byteString) {
            copyOnWrite();
            ((KingPos) this.instance).setDisableToastBytes(byteString);
            return this;
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((KingPos) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((KingPos) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setLike(LikeExtend likeExtend) {
            copyOnWrite();
            ((KingPos) this.instance).setLike(likeExtend);
            return this;
        }

        public Builder setType(KingPositionType kingPositionType) {
            copyOnWrite();
            ((KingPos) this.instance).setType(kingPositionType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((KingPos) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(KingPos.DEFAULT_INSTANCE);
        }

        public Builder setCoin(CoinExtend.Builder builder) {
            copyOnWrite();
            ((KingPos) this.instance).setCoin(builder.build());
            return this;
        }

        public Builder setLike(LikeExtend.Builder builder) {
            copyOnWrite();
            ((KingPos) this.instance).setLike(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public enum ExtendCase {
        LIKE(6),
        COIN(7),
        EXTEND_NOT_SET(0);
        
        private final int value;

        ExtendCase(int i) {
            this.value = i;
        }

        public static ExtendCase forNumber(int i) {
            if (i != 0) {
                if (i != 6) {
                    if (i != 7) {
                        return null;
                    }
                    return COIN;
                }
                return LIKE;
            }
            return EXTEND_NOT_SET;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ExtendCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        KingPos kingPos = new KingPos();
        DEFAULT_INSTANCE = kingPos;
        GeneratedMessageLite.registerDefaultInstance(KingPos.class, kingPos);
    }

    public KingPos() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckedToast() {
        this.checkedToast_ = getDefaultInstance().getCheckedToast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoin() {
        if (this.extendCase_ == 7) {
            this.extendCase_ = 0;
            this.extend_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisable() {
        this.disable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableToast() {
        this.disableToast_ = getDefaultInstance().getDisableToast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtend() {
        this.extendCase_ = 0;
        this.extend_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLike() {
        if (this.extendCase_ == 6) {
            this.extendCase_ = 0;
            this.extend_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static KingPos getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoin(CoinExtend coinExtend) {
        coinExtend.getClass();
        if (this.extendCase_ == 7 && this.extend_ != CoinExtend.getDefaultInstance()) {
            this.extend_ = CoinExtend.newBuilder((CoinExtend) this.extend_).mergeFrom((CoinExtend) coinExtend).buildPartial();
        } else {
            this.extend_ = coinExtend;
        }
        this.extendCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLike(LikeExtend likeExtend) {
        likeExtend.getClass();
        if (this.extendCase_ == 6 && this.extend_ != LikeExtend.getDefaultInstance()) {
            this.extend_ = LikeExtend.newBuilder((LikeExtend) this.extend_).mergeFrom((LikeExtend) likeExtend).buildPartial();
        } else {
            this.extend_ = likeExtend;
        }
        this.extendCase_ = 6;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KingPos parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KingPos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KingPos parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KingPos> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedToast(String str) {
        str.getClass();
        this.checkedToast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.checkedToast_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoin(CoinExtend coinExtend) {
        coinExtend.getClass();
        this.extend_ = coinExtend;
        this.extendCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisable(boolean z) {
        this.disable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableToast(String str) {
        str.getClass();
        this.disableToast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.disableToast_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLike(LikeExtend likeExtend) {
        likeExtend.getClass();
        this.extend_ = likeExtend;
        this.extendCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(KingPositionType kingPositionType) {
        this.type_ = kingPositionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70061.f16990xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new KingPos();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0208\u0003\f\u0004\u0208\u0005\u0208\u0006<\u0000\u0007<\u0000", new Object[]{"extend_", "extendCase_", "disable_", "icon_", "type_", "disableToast_", "checkedToast_", LikeExtend.class, CoinExtend.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KingPos> parser = PARSER;
                if (parser == null) {
                    synchronized (KingPos.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public String getCheckedToast() {
        return this.checkedToast_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public ByteString getCheckedToastBytes() {
        return ByteString.copyFromUtf8(this.checkedToast_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public CoinExtend getCoin() {
        if (this.extendCase_ == 7) {
            return (CoinExtend) this.extend_;
        }
        return CoinExtend.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public boolean getDisable() {
        return this.disable_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public String getDisableToast() {
        return this.disableToast_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public ByteString getDisableToastBytes() {
        return ByteString.copyFromUtf8(this.disableToast_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public ExtendCase getExtendCase() {
        return ExtendCase.forNumber(this.extendCase_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public LikeExtend getLike() {
        if (this.extendCase_ == 6) {
            return (LikeExtend) this.extend_;
        }
        return LikeExtend.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public KingPositionType getType() {
        KingPositionType forNumber = KingPositionType.forNumber(this.type_);
        return forNumber == null ? KingPositionType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public boolean hasCoin() {
        return this.extendCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.KingPosOrBuilder
    public boolean hasLike() {
        return this.extendCase_ == 6;
    }

    public static Builder newBuilder(KingPos kingPos) {
        return DEFAULT_INSTANCE.createBuilder(kingPos);
    }

    public static KingPos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KingPos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KingPos parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KingPos parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KingPos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KingPos parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KingPos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KingPos parseFrom(InputStream inputStream) throws IOException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KingPos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KingPos parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KingPos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KingPos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
