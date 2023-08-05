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
public final class Button extends GeneratedMessageLite<Button, Button.Builder> implements MessageLiteOrBuilder {
    public static final int BADGE_INFO_FIELD_NUMBER = 5;
    private static final Button DEFAULT_INSTANCE;
    public static final int LEFT_STRIKETHROUGH_TEXT_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 4;
    private static volatile Parser<Button> PARSER = null;
    public static final int SUB_TITLE_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    private BadgeInfo badgeInfo_;
    private String title_ = "";
    private String leftStrikethroughText_ = "";
    private String type_ = "";
    private String link_ = "";
    private String subTitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Button$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16969xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16969xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16969xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16969xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16969xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16969xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16969xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16969xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Button, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69821 c69821) {
            this();
        }

        public Builder clearBadgeInfo() {
            copyOnWrite();
            ((Button) this.instance).clearBadgeInfo();
            return this;
        }

        public Builder clearLeftStrikethroughText() {
            copyOnWrite();
            ((Button) this.instance).clearLeftStrikethroughText();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((Button) this.instance).clearLink();
            return this;
        }

        public Builder clearSubTitle() {
            copyOnWrite();
            ((Button) this.instance).clearSubTitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Button) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Button) this.instance).clearType();
            return this;
        }

        public BadgeInfo getBadgeInfo() {
            return ((Button) this.instance).getBadgeInfo();
        }

        public String getLeftStrikethroughText() {
            return ((Button) this.instance).getLeftStrikethroughText();
        }

        public ByteString getLeftStrikethroughTextBytes() {
            return ((Button) this.instance).getLeftStrikethroughTextBytes();
        }

        public String getLink() {
            return ((Button) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((Button) this.instance).getLinkBytes();
        }

        public String getSubTitle() {
            return ((Button) this.instance).getSubTitle();
        }

        public ByteString getSubTitleBytes() {
            return ((Button) this.instance).getSubTitleBytes();
        }

        public String getTitle() {
            return ((Button) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Button) this.instance).getTitleBytes();
        }

        public String getType() {
            return ((Button) this.instance).getType();
        }

        public ByteString getTypeBytes() {
            return ((Button) this.instance).getTypeBytes();
        }

        public boolean hasBadgeInfo() {
            return ((Button) this.instance).hasBadgeInfo();
        }

        public Builder mergeBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((Button) this.instance).mergeBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setBadgeInfo(BadgeInfo badgeInfo) {
            copyOnWrite();
            ((Button) this.instance).setBadgeInfo(badgeInfo);
            return this;
        }

        public Builder setLeftStrikethroughText(String str) {
            copyOnWrite();
            ((Button) this.instance).setLeftStrikethroughText(str);
            return this;
        }

        public Builder setLeftStrikethroughTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setLeftStrikethroughTextBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((Button) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setSubTitle(String str) {
            copyOnWrite();
            ((Button) this.instance).setSubTitle(str);
            return this;
        }

        public Builder setSubTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setSubTitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Button) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((Button) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setTypeBytes(byteString);
            return this;
        }

        private Builder() {
            super(Button.DEFAULT_INSTANCE);
        }

        public Builder setBadgeInfo(BadgeInfo.Builder builder) {
            copyOnWrite();
            ((Button) this.instance).setBadgeInfo(builder.build());
            return this;
        }
    }

    static {
        Button button = new Button();
        DEFAULT_INSTANCE = button;
        GeneratedMessageLite.registerDefaultInstance(Button.class, button);
    }

    private Button() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeInfo() {
        this.badgeInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftStrikethroughText() {
        this.leftStrikethroughText_ = getDefaultInstance().getLeftStrikethroughText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitle() {
        this.subTitle_ = getDefaultInstance().getSubTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static Button getDefaultInstance() {
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

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Button parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Button> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeInfo(BadgeInfo badgeInfo) {
        badgeInfo.getClass();
        this.badgeInfo_ = badgeInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftStrikethroughText(String str) {
        str.getClass();
        this.leftStrikethroughText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftStrikethroughTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.leftStrikethroughText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitle(String str) {
        str.getClass();
        this.subTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subTitle_ = byteString.toStringUtf8();
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
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69821.f16969xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Button();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t\u0006\u0208", new Object[]{"title_", "leftStrikethroughText_", "type_", "link_", "badgeInfo_", "subTitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Button> parser = PARSER;
                if (parser == null) {
                    synchronized (Button.class) {
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

    public String getLeftStrikethroughText() {
        return this.leftStrikethroughText_;
    }

    public ByteString getLeftStrikethroughTextBytes() {
        return ByteString.copyFromUtf8(this.leftStrikethroughText_);
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getSubTitle() {
        return this.subTitle_;
    }

    public ByteString getSubTitleBytes() {
        return ByteString.copyFromUtf8(this.subTitle_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public boolean hasBadgeInfo() {
        return this.badgeInfo_ != null;
    }

    public static Builder newBuilder(Button button) {
        return DEFAULT_INSTANCE.createBuilder(button);
    }

    public static Button parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Button parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Button parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Button parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Button parseFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Button parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
