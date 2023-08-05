package com.bapis.bilibili.app.viewunite.v1;

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
public final class ActivityResource extends GeneratedMessageLite<ActivityResource, ActivityResource.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 3;
    public static final int DARK_TEXT_COLOR_FIELD_NUMBER = 1;
    private static final ActivityResource DEFAULT_INSTANCE;
    public static final int DIVIDER_COLOR_FIELD_NUMBER = 2;
    public static final int LIGHT_TEXT_COLOR_FIELD_NUMBER = 6;
    private static volatile Parser<ActivityResource> PARSER = null;
    public static final int SELECTED_BG_COLOR_FIELD_NUMBER = 4;
    public static final int TEXT_COLOR_FIELD_NUMBER = 5;
    private String darkTextColor_ = "";
    private String dividerColor_ = "";
    private String bgColor_ = "";
    private String selectedBgColor_ = "";
    private String textColor_ = "";
    private String lightTextColor_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ActivityResource$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71111 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17087xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17087xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17087xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17087xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17087xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17087xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17087xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17087xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ActivityResource, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71111 c71111) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearBgColor();
            return this;
        }

        public Builder clearDarkTextColor() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearDarkTextColor();
            return this;
        }

        public Builder clearDividerColor() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearDividerColor();
            return this;
        }

        public Builder clearLightTextColor() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearLightTextColor();
            return this;
        }

        public Builder clearSelectedBgColor() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearSelectedBgColor();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((ActivityResource) this.instance).clearTextColor();
            return this;
        }

        public String getBgColor() {
            return ((ActivityResource) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((ActivityResource) this.instance).getBgColorBytes();
        }

        public String getDarkTextColor() {
            return ((ActivityResource) this.instance).getDarkTextColor();
        }

        public ByteString getDarkTextColorBytes() {
            return ((ActivityResource) this.instance).getDarkTextColorBytes();
        }

        public String getDividerColor() {
            return ((ActivityResource) this.instance).getDividerColor();
        }

        public ByteString getDividerColorBytes() {
            return ((ActivityResource) this.instance).getDividerColorBytes();
        }

        public String getLightTextColor() {
            return ((ActivityResource) this.instance).getLightTextColor();
        }

        public ByteString getLightTextColorBytes() {
            return ((ActivityResource) this.instance).getLightTextColorBytes();
        }

        public String getSelectedBgColor() {
            return ((ActivityResource) this.instance).getSelectedBgColor();
        }

        public ByteString getSelectedBgColorBytes() {
            return ((ActivityResource) this.instance).getSelectedBgColorBytes();
        }

        public String getTextColor() {
            return ((ActivityResource) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((ActivityResource) this.instance).getTextColorBytes();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setDarkTextColor(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setDarkTextColor(str);
            return this;
        }

        public Builder setDarkTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setDarkTextColorBytes(byteString);
            return this;
        }

        public Builder setDividerColor(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setDividerColor(str);
            return this;
        }

        public Builder setDividerColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setDividerColorBytes(byteString);
            return this;
        }

        public Builder setLightTextColor(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setLightTextColor(str);
            return this;
        }

        public Builder setLightTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setLightTextColorBytes(byteString);
            return this;
        }

        public Builder setSelectedBgColor(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setSelectedBgColor(str);
            return this;
        }

        public Builder setSelectedBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setSelectedBgColorBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((ActivityResource) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityResource) this.instance).setTextColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(ActivityResource.DEFAULT_INSTANCE);
        }
    }

    static {
        ActivityResource activityResource = new ActivityResource();
        DEFAULT_INSTANCE = activityResource;
        GeneratedMessageLite.registerDefaultInstance(ActivityResource.class, activityResource);
    }

    private ActivityResource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDarkTextColor() {
        this.darkTextColor_ = getDefaultInstance().getDarkTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDividerColor() {
        this.dividerColor_ = getDefaultInstance().getDividerColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLightTextColor() {
        this.lightTextColor_ = getDefaultInstance().getLightTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedBgColor() {
        this.selectedBgColor_ = getDefaultInstance().getSelectedBgColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    public static ActivityResource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivityResource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityResource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ActivityResource> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColor(String str) {
        str.getClass();
        this.bgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkTextColor(String str) {
        str.getClass();
        this.darkTextColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.darkTextColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDividerColor(String str) {
        str.getClass();
        this.dividerColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDividerColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dividerColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLightTextColor(String str) {
        str.getClass();
        this.lightTextColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLightTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lightTextColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedBgColor(String str) {
        str.getClass();
        this.selectedBgColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectedBgColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColor(String str) {
        str.getClass();
        this.textColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71111.f17087xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ActivityResource();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"darkTextColor_", "dividerColor_", "bgColor_", "selectedBgColor_", "textColor_", "lightTextColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ActivityResource> parser = PARSER;
                if (parser == null) {
                    synchronized (ActivityResource.class) {
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

    public String getBgColor() {
        return this.bgColor_;
    }

    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    public String getDarkTextColor() {
        return this.darkTextColor_;
    }

    public ByteString getDarkTextColorBytes() {
        return ByteString.copyFromUtf8(this.darkTextColor_);
    }

    public String getDividerColor() {
        return this.dividerColor_;
    }

    public ByteString getDividerColorBytes() {
        return ByteString.copyFromUtf8(this.dividerColor_);
    }

    public String getLightTextColor() {
        return this.lightTextColor_;
    }

    public ByteString getLightTextColorBytes() {
        return ByteString.copyFromUtf8(this.lightTextColor_);
    }

    public String getSelectedBgColor() {
        return this.selectedBgColor_;
    }

    public ByteString getSelectedBgColorBytes() {
        return ByteString.copyFromUtf8(this.selectedBgColor_);
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public static Builder newBuilder(ActivityResource activityResource) {
        return DEFAULT_INSTANCE.createBuilder(activityResource);
    }

    public static ActivityResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ActivityResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityResource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(InputStream inputStream) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityResource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ActivityResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
