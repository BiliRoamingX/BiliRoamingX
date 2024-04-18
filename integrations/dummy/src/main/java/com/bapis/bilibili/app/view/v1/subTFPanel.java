package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class subTFPanel extends GeneratedMessageLite<subTFPanel, subTFPanel.Builder> implements MessageLiteOrBuilder {
    private static final subTFPanel DEFAULT_INSTANCE;
    public static final int MAIN_LABEL_FIELD_NUMBER = 5;
    public static final int OPERATOR_FIELD_NUMBER = 6;
    private static volatile Parser<subTFPanel> PARSER = null;
    public static final int RIGHT_BTN_IMG_FIELD_NUMBER = 1;
    public static final int RIGHT_BTN_LINK_FIELD_NUMBER = 4;
    public static final int RIGHT_BTN_TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int RIGHT_BTN_TEXT_FIELD_NUMBER = 2;
    private String rightBtnImg_ = "";
    private String rightBtnText_ = "";
    private String rightBtnTextColor_ = "";
    private String rightBtnLink_ = "";
    private String mainLabel_ = "";
    private String operator_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.subTFPanel$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69121 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16864xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16864xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16864xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16864xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16864xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16864xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16864xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16864xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<subTFPanel, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69121 c69121) {
            this();
        }

        public Builder clearMainLabel() {
            copyOnWrite();
            ((subTFPanel) this.instance).clearMainLabel();
            return this;
        }

        public Builder clearOperator() {
            copyOnWrite();
            ((subTFPanel) this.instance).clearOperator();
            return this;
        }

        public Builder clearRightBtnImg() {
            copyOnWrite();
            ((subTFPanel) this.instance).clearRightBtnImg();
            return this;
        }

        public Builder clearRightBtnLink() {
            copyOnWrite();
            ((subTFPanel) this.instance).clearRightBtnLink();
            return this;
        }

        public Builder clearRightBtnText() {
            copyOnWrite();
            ((subTFPanel) this.instance).clearRightBtnText();
            return this;
        }

        public Builder clearRightBtnTextColor() {
            copyOnWrite();
            ((subTFPanel) this.instance).clearRightBtnTextColor();
            return this;
        }

        public String getMainLabel() {
            return ((subTFPanel) this.instance).getMainLabel();
        }

        public ByteString getMainLabelBytes() {
            return ((subTFPanel) this.instance).getMainLabelBytes();
        }

        public String getOperator() {
            return ((subTFPanel) this.instance).getOperator();
        }

        public ByteString getOperatorBytes() {
            return ((subTFPanel) this.instance).getOperatorBytes();
        }

        public String getRightBtnImg() {
            return ((subTFPanel) this.instance).getRightBtnImg();
        }

        public ByteString getRightBtnImgBytes() {
            return ((subTFPanel) this.instance).getRightBtnImgBytes();
        }

        public String getRightBtnLink() {
            return ((subTFPanel) this.instance).getRightBtnLink();
        }

        public ByteString getRightBtnLinkBytes() {
            return ((subTFPanel) this.instance).getRightBtnLinkBytes();
        }

        public String getRightBtnText() {
            return ((subTFPanel) this.instance).getRightBtnText();
        }

        public ByteString getRightBtnTextBytes() {
            return ((subTFPanel) this.instance).getRightBtnTextBytes();
        }

        public String getRightBtnTextColor() {
            return ((subTFPanel) this.instance).getRightBtnTextColor();
        }

        public ByteString getRightBtnTextColorBytes() {
            return ((subTFPanel) this.instance).getRightBtnTextColorBytes();
        }

        public Builder setMainLabel(String str) {
            copyOnWrite();
            ((subTFPanel) this.instance).setMainLabel(str);
            return this;
        }

        public Builder setMainLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((subTFPanel) this.instance).setMainLabelBytes(byteString);
            return this;
        }

        public Builder setOperator(String str) {
            copyOnWrite();
            ((subTFPanel) this.instance).setOperator(str);
            return this;
        }

        public Builder setOperatorBytes(ByteString byteString) {
            copyOnWrite();
            ((subTFPanel) this.instance).setOperatorBytes(byteString);
            return this;
        }

        public Builder setRightBtnImg(String str) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnImg(str);
            return this;
        }

        public Builder setRightBtnImgBytes(ByteString byteString) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnImgBytes(byteString);
            return this;
        }

        public Builder setRightBtnLink(String str) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnLink(str);
            return this;
        }

        public Builder setRightBtnLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnLinkBytes(byteString);
            return this;
        }

        public Builder setRightBtnText(String str) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnText(str);
            return this;
        }

        public Builder setRightBtnTextBytes(ByteString byteString) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnTextBytes(byteString);
            return this;
        }

        public Builder setRightBtnTextColor(String str) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnTextColor(str);
            return this;
        }

        public Builder setRightBtnTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((subTFPanel) this.instance).setRightBtnTextColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(subTFPanel.DEFAULT_INSTANCE);
        }
    }

    static {
        subTFPanel subtfpanel = new subTFPanel();
        DEFAULT_INSTANCE = subtfpanel;
        GeneratedMessageLite.registerDefaultInstance(subTFPanel.class, subtfpanel);
    }

    private subTFPanel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainLabel() {
        this.mainLabel_ = getDefaultInstance().getMainLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperator() {
        this.operator_ = getDefaultInstance().getOperator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightBtnImg() {
        this.rightBtnImg_ = getDefaultInstance().getRightBtnImg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightBtnLink() {
        this.rightBtnLink_ = getDefaultInstance().getRightBtnLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightBtnText() {
        this.rightBtnText_ = getDefaultInstance().getRightBtnText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightBtnTextColor() {
        this.rightBtnTextColor_ = getDefaultInstance().getRightBtnTextColor();
    }

    public static subTFPanel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static subTFPanel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (subTFPanel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static subTFPanel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<subTFPanel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainLabel(String str) {
        str.getClass();
        this.mainLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mainLabel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperator(String str) {
        str.getClass();
        this.operator_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperatorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.operator_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnImg(String str) {
        str.getClass();
        this.rightBtnImg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnImg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnLink(String str) {
        str.getClass();
        this.rightBtnLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnText(String str) {
        str.getClass();
        this.rightBtnText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnTextColor(String str) {
        str.getClass();
        this.rightBtnTextColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBtnTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rightBtnTextColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69121.f16864xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new subTFPanel();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"rightBtnImg_", "rightBtnText_", "rightBtnTextColor_", "rightBtnLink_", "mainLabel_", "operator_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<subTFPanel> parser = PARSER;
                if (parser == null) {
                    synchronized (subTFPanel.class) {
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

    public String getMainLabel() {
        return this.mainLabel_;
    }

    public ByteString getMainLabelBytes() {
        return ByteString.copyFromUtf8(this.mainLabel_);
    }

    public String getOperator() {
        return this.operator_;
    }

    public ByteString getOperatorBytes() {
        return ByteString.copyFromUtf8(this.operator_);
    }

    public String getRightBtnImg() {
        return this.rightBtnImg_;
    }

    public ByteString getRightBtnImgBytes() {
        return ByteString.copyFromUtf8(this.rightBtnImg_);
    }

    public String getRightBtnLink() {
        return this.rightBtnLink_;
    }

    public ByteString getRightBtnLinkBytes() {
        return ByteString.copyFromUtf8(this.rightBtnLink_);
    }

    public String getRightBtnText() {
        return this.rightBtnText_;
    }

    public ByteString getRightBtnTextBytes() {
        return ByteString.copyFromUtf8(this.rightBtnText_);
    }

    public String getRightBtnTextColor() {
        return this.rightBtnTextColor_;
    }

    public ByteString getRightBtnTextColorBytes() {
        return ByteString.copyFromUtf8(this.rightBtnTextColor_);
    }

    public static Builder newBuilder(subTFPanel subtfpanel) {
        return DEFAULT_INSTANCE.createBuilder(subtfpanel);
    }

    public static subTFPanel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (subTFPanel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static subTFPanel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static subTFPanel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static subTFPanel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static subTFPanel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static subTFPanel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static subTFPanel parseFrom(InputStream inputStream) throws IOException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static subTFPanel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static subTFPanel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static subTFPanel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (subTFPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
