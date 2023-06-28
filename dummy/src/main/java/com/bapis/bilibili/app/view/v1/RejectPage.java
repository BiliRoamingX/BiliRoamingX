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
public final class RejectPage extends GeneratedMessageLite<RejectPage, RejectPage.Builder> implements MessageLiteOrBuilder {
    public static final int BUSINESS_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 5;
    private static final RejectPage DEFAULT_INSTANCE;
    private static volatile Parser<RejectPage> PARSER = null;
    public static final int PIC_FIELD_NUMBER = 2;
    public static final int PRIMARY_TEXT_FIELD_NUMBER = 3;
    public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
    private int business_;
    private Button button_;
    private String pic_ = "";
    private String primaryText_ = "";
    private String secondaryText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RejectPage$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68381 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16799xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16799xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16799xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16799xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16799xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16799xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16799xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16799xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RejectPage, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68381 c68381) {
            this();
        }

        public Builder clearBusiness() {
            copyOnWrite();
            ((RejectPage) this.instance).clearBusiness();
            return this;
        }

        public Builder clearButton() {
            copyOnWrite();
            ((RejectPage) this.instance).clearButton();
            return this;
        }

        public Builder clearPic() {
            copyOnWrite();
            ((RejectPage) this.instance).clearPic();
            return this;
        }

        public Builder clearPrimaryText() {
            copyOnWrite();
            ((RejectPage) this.instance).clearPrimaryText();
            return this;
        }

        public Builder clearSecondaryText() {
            copyOnWrite();
            ((RejectPage) this.instance).clearSecondaryText();
            return this;
        }

        public RejectPageEnum getBusiness() {
            return ((RejectPage) this.instance).getBusiness();
        }

        public int getBusinessValue() {
            return ((RejectPage) this.instance).getBusinessValue();
        }

        public Button getButton() {
            return ((RejectPage) this.instance).getButton();
        }

        public String getPic() {
            return ((RejectPage) this.instance).getPic();
        }

        public ByteString getPicBytes() {
            return ((RejectPage) this.instance).getPicBytes();
        }

        public String getPrimaryText() {
            return ((RejectPage) this.instance).getPrimaryText();
        }

        public ByteString getPrimaryTextBytes() {
            return ((RejectPage) this.instance).getPrimaryTextBytes();
        }

        public String getSecondaryText() {
            return ((RejectPage) this.instance).getSecondaryText();
        }

        public ByteString getSecondaryTextBytes() {
            return ((RejectPage) this.instance).getSecondaryTextBytes();
        }

        public boolean hasButton() {
            return ((RejectPage) this.instance).hasButton();
        }

        public Builder mergeButton(Button button) {
            copyOnWrite();
            ((RejectPage) this.instance).mergeButton(button);
            return this;
        }

        public Builder setBusiness(RejectPageEnum rejectPageEnum) {
            copyOnWrite();
            ((RejectPage) this.instance).setBusiness(rejectPageEnum);
            return this;
        }

        public Builder setBusinessValue(int i) {
            copyOnWrite();
            ((RejectPage) this.instance).setBusinessValue(i);
            return this;
        }

        public Builder setButton(Button button) {
            copyOnWrite();
            ((RejectPage) this.instance).setButton(button);
            return this;
        }

        public Builder setPic(String str) {
            copyOnWrite();
            ((RejectPage) this.instance).setPic(str);
            return this;
        }

        public Builder setPicBytes(ByteString byteString) {
            copyOnWrite();
            ((RejectPage) this.instance).setPicBytes(byteString);
            return this;
        }

        public Builder setPrimaryText(String str) {
            copyOnWrite();
            ((RejectPage) this.instance).setPrimaryText(str);
            return this;
        }

        public Builder setPrimaryTextBytes(ByteString byteString) {
            copyOnWrite();
            ((RejectPage) this.instance).setPrimaryTextBytes(byteString);
            return this;
        }

        public Builder setSecondaryText(String str) {
            copyOnWrite();
            ((RejectPage) this.instance).setSecondaryText(str);
            return this;
        }

        public Builder setSecondaryTextBytes(ByteString byteString) {
            copyOnWrite();
            ((RejectPage) this.instance).setSecondaryTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(RejectPage.DEFAULT_INSTANCE);
        }

        public Builder setButton(Button.Builder builder) {
            copyOnWrite();
            ((RejectPage) this.instance).setButton(builder.build());
            return this;
        }
    }

    static {
        RejectPage rejectPage = new RejectPage();
        DEFAULT_INSTANCE = rejectPage;
        GeneratedMessageLite.registerDefaultInstance(RejectPage.class, rejectPage);
    }

    private RejectPage() {
    }

    public void clearBusiness() {
        this.business_ = 0;
    }

    public void clearButton() {
        this.button_ = null;
    }

    public void clearPic() {
        this.pic_ = getDefaultInstance().getPic();
    }

    public void clearPrimaryText() {
        this.primaryText_ = getDefaultInstance().getPrimaryText();
    }

    public void clearSecondaryText() {
        this.secondaryText_ = getDefaultInstance().getSecondaryText();
    }

    public static RejectPage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeButton(Button button) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RejectPage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RejectPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RejectPage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RejectPage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setBusiness(RejectPageEnum rejectPageEnum) {
        this.business_ = rejectPageEnum.getNumber();
    }

    public void setBusinessValue(int i) {
        this.business_ = i;
    }

    public void setButton(Button button) {
        button.getClass();
        this.button_ = button;
    }

    public void setPic(String str) {
        str.getClass();
        this.pic_ = str;
    }

    public void setPicBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pic_ = byteString.toStringUtf8();
    }

    public void setPrimaryText(String str) {
        str.getClass();
        this.primaryText_ = str;
    }

    public void setPrimaryTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.primaryText_ = byteString.toStringUtf8();
    }

    public void setSecondaryText(String str) {
        str.getClass();
        this.secondaryText_ = str;
    }

    public void setSecondaryTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.secondaryText_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68381.f16799xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RejectPage();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t", new Object[]{"business_", "pic_", "primaryText_", "secondaryText_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RejectPage> parser = PARSER;
                if (parser == null) {
                    synchronized (RejectPage.class) {
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

    public RejectPageEnum getBusiness() {
        RejectPageEnum forNumber = RejectPageEnum.forNumber(this.business_);
        return forNumber == null ? RejectPageEnum.UNRECOGNIZED : forNumber;
    }

    public int getBusinessValue() {
        return this.business_;
    }

    public Button getButton() {
        Button button = this.button_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public String getPic() {
        return this.pic_;
    }

    public ByteString getPicBytes() {
        return ByteString.copyFromUtf8(this.pic_);
    }

    public String getPrimaryText() {
        return this.primaryText_;
    }

    public ByteString getPrimaryTextBytes() {
        return ByteString.copyFromUtf8(this.primaryText_);
    }

    public String getSecondaryText() {
        return this.secondaryText_;
    }

    public ByteString getSecondaryTextBytes() {
        return ByteString.copyFromUtf8(this.secondaryText_);
    }

    public boolean hasButton() {
        return this.button_ != null;
    }

    public static Builder newBuilder(RejectPage rejectPage) {
        return DEFAULT_INSTANCE.createBuilder(rejectPage);
    }

    public static RejectPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RejectPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RejectPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RejectPage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RejectPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RejectPage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RejectPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RejectPage parseFrom(InputStream inputStream) throws IOException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RejectPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RejectPage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RejectPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RejectPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
