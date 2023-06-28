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
public final class ControlConfig extends GeneratedMessageLite<ControlConfig, ControlConfig.Builder> implements MessageLiteOrBuilder {
    public static final int COIN_SHOW_FIELD_NUMBER = 3;
    public static final int DANMU_SHOW_FIELD_NUMBER = 8;
    private static final ControlConfig DEFAULT_INSTANCE;
    public static final int DISLIKE_SHOW_FIELD_NUMBER = 2;
    public static final int FAV_SHOW_FIELD_NUMBER = 4;
    public static final int HALF_DANMU_SEND_FIELD_NUMBER = 10;
    public static final int LIKE_SHOW_FIELD_NUMBER = 1;
    public static final int MATERIAL_SHOW_FIELD_NUMBER = 7;
    private static volatile Parser<ControlConfig> PARSER = null;
    public static final int REMARK_SHOW_FIELD_NUMBER = 9;
    public static final int SHARE_SHOW_FIELD_NUMBER = 5;
    public static final int TOAST_SHOW_FIELD_NUMBER = 6;
    private Control coinShow_;
    private Control danmuShow_;
    private Control dislikeShow_;
    private Control favShow_;
    private Control halfDanmuSend_;
    private Control likeShow_;
    private Control materialShow_;
    private Control remarkShow_;
    private Control shareShow_;
    private Control toastShow_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ControlConfig$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67491 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16723xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16723xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16723xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16723xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16723xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16723xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16723xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16723xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ControlConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67491 c67491) {
            this();
        }

        public Builder clearCoinShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearCoinShow();
            return this;
        }

        public Builder clearDanmuShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearDanmuShow();
            return this;
        }

        public Builder clearDislikeShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearDislikeShow();
            return this;
        }

        public Builder clearFavShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearFavShow();
            return this;
        }

        public Builder clearHalfDanmuSend() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearHalfDanmuSend();
            return this;
        }

        public Builder clearLikeShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearLikeShow();
            return this;
        }

        public Builder clearMaterialShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearMaterialShow();
            return this;
        }

        public Builder clearRemarkShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearRemarkShow();
            return this;
        }

        public Builder clearShareShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearShareShow();
            return this;
        }

        public Builder clearToastShow() {
            copyOnWrite();
            ((ControlConfig) this.instance).clearToastShow();
            return this;
        }

        public Control getCoinShow() {
            return ((ControlConfig) this.instance).getCoinShow();
        }

        public Control getDanmuShow() {
            return ((ControlConfig) this.instance).getDanmuShow();
        }

        public Control getDislikeShow() {
            return ((ControlConfig) this.instance).getDislikeShow();
        }

        public Control getFavShow() {
            return ((ControlConfig) this.instance).getFavShow();
        }

        public Control getHalfDanmuSend() {
            return ((ControlConfig) this.instance).getHalfDanmuSend();
        }

        public Control getLikeShow() {
            return ((ControlConfig) this.instance).getLikeShow();
        }

        public Control getMaterialShow() {
            return ((ControlConfig) this.instance).getMaterialShow();
        }

        public Control getRemarkShow() {
            return ((ControlConfig) this.instance).getRemarkShow();
        }

        public Control getShareShow() {
            return ((ControlConfig) this.instance).getShareShow();
        }

        public Control getToastShow() {
            return ((ControlConfig) this.instance).getToastShow();
        }

        public boolean hasCoinShow() {
            return ((ControlConfig) this.instance).hasCoinShow();
        }

        public boolean hasDanmuShow() {
            return ((ControlConfig) this.instance).hasDanmuShow();
        }

        public boolean hasDislikeShow() {
            return ((ControlConfig) this.instance).hasDislikeShow();
        }

        public boolean hasFavShow() {
            return ((ControlConfig) this.instance).hasFavShow();
        }

        public boolean hasHalfDanmuSend() {
            return ((ControlConfig) this.instance).hasHalfDanmuSend();
        }

        public boolean hasLikeShow() {
            return ((ControlConfig) this.instance).hasLikeShow();
        }

        public boolean hasMaterialShow() {
            return ((ControlConfig) this.instance).hasMaterialShow();
        }

        public boolean hasRemarkShow() {
            return ((ControlConfig) this.instance).hasRemarkShow();
        }

        public boolean hasShareShow() {
            return ((ControlConfig) this.instance).hasShareShow();
        }

        public boolean hasToastShow() {
            return ((ControlConfig) this.instance).hasToastShow();
        }

        public Builder mergeCoinShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeCoinShow(control);
            return this;
        }

        public Builder mergeDanmuShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeDanmuShow(control);
            return this;
        }

        public Builder mergeDislikeShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeDislikeShow(control);
            return this;
        }

        public Builder mergeFavShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeFavShow(control);
            return this;
        }

        public Builder mergeHalfDanmuSend(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeHalfDanmuSend(control);
            return this;
        }

        public Builder mergeLikeShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeLikeShow(control);
            return this;
        }

        public Builder mergeMaterialShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeMaterialShow(control);
            return this;
        }

        public Builder mergeRemarkShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeRemarkShow(control);
            return this;
        }

        public Builder mergeShareShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeShareShow(control);
            return this;
        }

        public Builder mergeToastShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).mergeToastShow(control);
            return this;
        }

        public Builder setCoinShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setCoinShow(control);
            return this;
        }

        public Builder setDanmuShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setDanmuShow(control);
            return this;
        }

        public Builder setDislikeShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setDislikeShow(control);
            return this;
        }

        public Builder setFavShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setFavShow(control);
            return this;
        }

        public Builder setHalfDanmuSend(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setHalfDanmuSend(control);
            return this;
        }

        public Builder setLikeShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setLikeShow(control);
            return this;
        }

        public Builder setMaterialShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setMaterialShow(control);
            return this;
        }

        public Builder setRemarkShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setRemarkShow(control);
            return this;
        }

        public Builder setShareShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setShareShow(control);
            return this;
        }

        public Builder setToastShow(Control control) {
            copyOnWrite();
            ((ControlConfig) this.instance).setToastShow(control);
            return this;
        }

        private Builder() {
            super(ControlConfig.DEFAULT_INSTANCE);
        }

        public Builder setCoinShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setCoinShow(builder.build());
            return this;
        }

        public Builder setDanmuShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setDanmuShow(builder.build());
            return this;
        }

        public Builder setDislikeShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setDislikeShow(builder.build());
            return this;
        }

        public Builder setFavShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setFavShow(builder.build());
            return this;
        }

        public Builder setHalfDanmuSend(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setHalfDanmuSend(builder.build());
            return this;
        }

        public Builder setLikeShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setLikeShow(builder.build());
            return this;
        }

        public Builder setMaterialShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setMaterialShow(builder.build());
            return this;
        }

        public Builder setRemarkShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setRemarkShow(builder.build());
            return this;
        }

        public Builder setShareShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setShareShow(builder.build());
            return this;
        }

        public Builder setToastShow(Control.Builder builder) {
            copyOnWrite();
            ((ControlConfig) this.instance).setToastShow(builder.build());
            return this;
        }
    }

    static {
        ControlConfig controlConfig = new ControlConfig();
        DEFAULT_INSTANCE = controlConfig;
        GeneratedMessageLite.registerDefaultInstance(ControlConfig.class, controlConfig);
    }

    private ControlConfig() {
    }

    public void clearCoinShow() {
        this.coinShow_ = null;
    }

    public void clearDanmuShow() {
        this.danmuShow_ = null;
    }

    public void clearDislikeShow() {
        this.dislikeShow_ = null;
    }

    public void clearFavShow() {
        this.favShow_ = null;
    }

    public void clearHalfDanmuSend() {
        this.halfDanmuSend_ = null;
    }

    public void clearLikeShow() {
        this.likeShow_ = null;
    }

    public void clearMaterialShow() {
        this.materialShow_ = null;
    }

    public void clearRemarkShow() {
        this.remarkShow_ = null;
    }

    public void clearShareShow() {
        this.shareShow_ = null;
    }

    public void clearToastShow() {
        this.toastShow_ = null;
    }

    public static ControlConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeCoinShow(Control control) {
    }

    public void mergeDanmuShow(Control control) {
    }

    public void mergeDislikeShow(Control control) {
    }

    public void mergeFavShow(Control control) {
    }

    public void mergeHalfDanmuSend(Control control) {
    }

    public void mergeLikeShow(Control control) {
    }

    public void mergeMaterialShow(Control control) {
    }

    public void mergeRemarkShow(Control control) {
    }

    public void mergeShareShow(Control control) {
    }

    public void mergeToastShow(Control control) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ControlConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ControlConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ControlConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ControlConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCoinShow(Control control) {
        control.getClass();
        this.coinShow_ = control;
    }

    public void setDanmuShow(Control control) {
        control.getClass();
        this.danmuShow_ = control;
    }

    public void setDislikeShow(Control control) {
        control.getClass();
        this.dislikeShow_ = control;
    }

    public void setFavShow(Control control) {
        control.getClass();
        this.favShow_ = control;
    }

    public void setHalfDanmuSend(Control control) {
        control.getClass();
        this.halfDanmuSend_ = control;
    }

    public void setLikeShow(Control control) {
        control.getClass();
        this.likeShow_ = control;
    }

    public void setMaterialShow(Control control) {
        control.getClass();
        this.materialShow_ = control;
    }

    public void setRemarkShow(Control control) {
        control.getClass();
        this.remarkShow_ = control;
    }

    public void setShareShow(Control control) {
        control.getClass();
        this.shareShow_ = control;
    }

    public void setToastShow(Control control) {
        control.getClass();
        this.toastShow_ = control;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67491.f16723xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ControlConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t", new Object[]{"likeShow_", "dislikeShow_", "coinShow_", "favShow_", "shareShow_", "toastShow_", "materialShow_", "danmuShow_", "remarkShow_", "halfDanmuSend_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ControlConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (ControlConfig.class) {
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

    public Control getCoinShow() {
        Control control = this.coinShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getDanmuShow() {
        Control control = this.danmuShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getDislikeShow() {
        Control control = this.dislikeShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getFavShow() {
        Control control = this.favShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getHalfDanmuSend() {
        Control control = this.halfDanmuSend_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getLikeShow() {
        Control control = this.likeShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getMaterialShow() {
        Control control = this.materialShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getRemarkShow() {
        Control control = this.remarkShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getShareShow() {
        Control control = this.shareShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Control getToastShow() {
        Control control = this.toastShow_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public boolean hasCoinShow() {
        return this.coinShow_ != null;
    }

    public boolean hasDanmuShow() {
        return this.danmuShow_ != null;
    }

    public boolean hasDislikeShow() {
        return this.dislikeShow_ != null;
    }

    public boolean hasFavShow() {
        return this.favShow_ != null;
    }

    public boolean hasHalfDanmuSend() {
        return this.halfDanmuSend_ != null;
    }

    public boolean hasLikeShow() {
        return this.likeShow_ != null;
    }

    public boolean hasMaterialShow() {
        return this.materialShow_ != null;
    }

    public boolean hasRemarkShow() {
        return this.remarkShow_ != null;
    }

    public boolean hasShareShow() {
        return this.shareShow_ != null;
    }

    public boolean hasToastShow() {
        return this.toastShow_ != null;
    }

    public static Builder newBuilder(ControlConfig controlConfig) {
        return DEFAULT_INSTANCE.createBuilder(controlConfig);
    }

    public static ControlConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ControlConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ControlConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ControlConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ControlConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ControlConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ControlConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ControlConfig parseFrom(InputStream inputStream) throws IOException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ControlConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ControlConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ControlConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ControlConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
