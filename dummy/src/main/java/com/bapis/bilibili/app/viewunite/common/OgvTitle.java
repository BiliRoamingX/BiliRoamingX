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
public final class OgvTitle extends GeneratedMessageLite<OgvTitle, OgvTitle.Builder> implements MessageLiteOrBuilder {
    public static final int BADGE_INFO_FIELD_NUMBER = 2;
    private static final OgvTitle DEFAULT_INSTANCE;
    public static final int FOLLOW_VIDEO_IS_RESERVE_LIVE_FIELD_NUMBER = 4;
    public static final int IS_SHOW_BTN_ANIMATION_FIELD_NUMBER = 3;
    private static volatile Parser<OgvTitle> PARSER = null;
    public static final int RESERVE_ID_FIELD_NUMBER = 5;
    public static final int TITLE_DELIVERY_BUTTON_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 1;
    private BadgeInfo badgeInfo_;
    private int followVideoIsReserveLive_;
    private int isShowBtnAnimation_;
    private long reserveId_;
    private TitleDeliveryButton titleDeliveryButton_;
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.OgvTitle$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70241 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17005xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17005xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17005xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17005xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17005xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OgvTitle, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70241 c70241) {
            this();
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((OgvTitle) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearFollowVideoIsReserveLive() {
            copyOnWrite();
            ((OgvTitle) this.instance).clearFollowVideoIsReserveLive();
            return this;
        }

        public Builder clearIsShowBtnAnimation() {
            copyOnWrite();
            ((OgvTitle) this.instance).clearIsShowBtnAnimation();
            return this;
        }

        public Builder clearReserveId() {
            copyOnWrite();
            ((OgvTitle) this.instance).clearReserveId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((OgvTitle) this.instance).clearTitle();
            return this;
        }

        public Builder clearTitleDeliveryButton() {
            copyOnWrite();
            ((OgvTitle) this.instance).clearTitleDeliveryButton();
            return this;
        }

        public BadgeInfo getBadgeInfo() {
            return ((OgvTitle) this.instance).getBadgeInfo();
        }

        public int getFollowVideoIsReserveLive() {
            return ((OgvTitle) this.instance).getFollowVideoIsReserveLive();
        }

        public int getIsShowBtnAnimation() {
            return ((OgvTitle) this.instance).getIsShowBtnAnimation();
        }

        public long getReserveId() {
            return ((OgvTitle) this.instance).getReserveId();
        }

        public String getTitle() {
            return ((OgvTitle) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OgvTitle) this.instance).getTitleBytes();
        }

        public TitleDeliveryButton getTitleDeliveryButton() {
            return ((OgvTitle) this.instance).getTitleDeliveryButton();
        }

        public boolean hasBadgeInfo() {
            return ((OgvTitle) this.instance).hasBadgeInfo();
        }

        public boolean hasTitleDeliveryButton() {
            return ((OgvTitle) this.instance).hasTitleDeliveryButton();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((OgvTitle) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder mergeTitleDeliveryButton(TitleDeliveryButton titleDeliveryButton) {
            copyOnWrite();
            ((OgvTitle) this.instance).mergeTitleDeliveryButton(titleDeliveryButton);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((OgvTitle) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setFollowVideoIsReserveLive(int i) {
            copyOnWrite();
            ((OgvTitle) this.instance).setFollowVideoIsReserveLive(i);
            return this;
        }

        public Builder setIsShowBtnAnimation(int i) {
            copyOnWrite();
            ((OgvTitle) this.instance).setIsShowBtnAnimation(i);
            return this;
        }

        public Builder setReserveId(long j) {
            copyOnWrite();
            ((OgvTitle) this.instance).setReserveId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((OgvTitle) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OgvTitle) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTitleDeliveryButton(TitleDeliveryButton titleDeliveryButton) {
            copyOnWrite();
            ((OgvTitle) this.instance).setTitleDeliveryButton(titleDeliveryButton);
            return this;
        }

        private Builder() {
            super(OgvTitle.DEFAULT_INSTANCE);
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((OgvTitle) this.instance).setBadgeInfo(builder.build());
            return this;
        }

        public Builder setTitleDeliveryButton(TitleDeliveryButton.Builder builder) {
            copyOnWrite();
            ((OgvTitle) this.instance).setTitleDeliveryButton(builder.build());
            return this;
        }
    }

    static {
        OgvTitle ogvTitle = new OgvTitle();
        DEFAULT_INSTANCE = ogvTitle;
        GeneratedMessageLite.registerDefaultInstance(OgvTitle.class, ogvTitle);
    }

    private OgvTitle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeInfo() {
        this.badgeInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowVideoIsReserveLive() {
        this.followVideoIsReserveLive_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsShowBtnAnimation() {
        this.isShowBtnAnimation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveId() {
        this.reserveId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitleDeliveryButton() {
        this.titleDeliveryButton_ = null;
    }

    public static OgvTitle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        BadgeInfo badgeInfo2 = this.badgeInfo_;
        if (badgeInfo2 != null && badgeInfo2 != BadgeInfo.getDefaultInstance()) {
            this.badgeInfo_ = BadgeInfo.newBuilder(this.badgeInfo_).mergeFrom((BadgeInfo) badgeInfo).buildPartial();
        } else {
            this.badgeInfo_ = badgeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitleDeliveryButton(TitleDeliveryButton titleDeliveryButton) {
        titleDeliveryButton.getClass();
        TitleDeliveryButton titleDeliveryButton2 = this.titleDeliveryButton_;
        if (titleDeliveryButton2 != null && titleDeliveryButton2 != TitleDeliveryButton.getDefaultInstance()) {
            this.titleDeliveryButton_ = TitleDeliveryButton.newBuilder(this.titleDeliveryButton_).mergeFrom((TitleDeliveryButton) titleDeliveryButton).buildPartial();
        } else {
            this.titleDeliveryButton_ = titleDeliveryButton;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OgvTitle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OgvTitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvTitle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OgvTitle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badgeInfo_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowVideoIsReserveLive(int i) {
        this.followVideoIsReserveLive_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsShowBtnAnimation(int i) {
        this.isShowBtnAnimation_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(long j) {
        this.reserveId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleDeliveryButton(TitleDeliveryButton titleDeliveryButton) {
        titleDeliveryButton.getClass();
        this.titleDeliveryButton_ = titleDeliveryButton;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70241.f17005xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OgvTitle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\u0004\u0004\u0004\u0005\u0002\u0006\t", new Object[]{"title_", "badgeInfo_", "isShowBtnAnimation_", "followVideoIsReserveLive_", "reserveId_", "titleDeliveryButton_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OgvTitle> parser = PARSER;
                if (parser == null) {
                    synchronized (OgvTitle.class) {
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

    public BadgeInfo getBadgeInfo() {
        BadgeInfo badgeInfo = this.badgeInfo_;
        return badgeInfo == null ? BadgeInfo.getDefaultInstance() : badgeInfo;
    }

    public int getFollowVideoIsReserveLive() {
        return this.followVideoIsReserveLive_;
    }

    public int getIsShowBtnAnimation() {
        return this.isShowBtnAnimation_;
    }

    public long getReserveId() {
        return this.reserveId_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public TitleDeliveryButton getTitleDeliveryButton() {
        TitleDeliveryButton titleDeliveryButton = this.titleDeliveryButton_;
        return titleDeliveryButton == null ? TitleDeliveryButton.getDefaultInstance() : titleDeliveryButton;
    }

    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    public boolean hasTitleDeliveryButton() {
        return this.titleDeliveryButton_ != null;
    }

    public static Builder newBuilder(OgvTitle ogvTitle) {
        return DEFAULT_INSTANCE.createBuilder(ogvTitle);
    }

    public static OgvTitle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvTitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvTitle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OgvTitle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OgvTitle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OgvTitle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OgvTitle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OgvTitle parseFrom(InputStream inputStream) throws IOException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OgvTitle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OgvTitle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OgvTitle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OgvTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
