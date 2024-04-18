package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class PostPanel extends GeneratedMessageLite<PostPanel, PostPanel.Builder> implements PostPanelOrBuilder {
    public static final int BIZ_ID_FIELD_NUMBER = 4;
    public static final int BIZ_TYPE_FIELD_NUMBER = 5;
    public static final int CHECK_BOX_FIELD_NUMBER = 8;
    public static final int CLICK_BUTTON_FIELD_NUMBER = 6;
    private static final PostPanel DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile Parser<PostPanel> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 3;
    public static final int START_FIELD_NUMBER = 1;
    public static final int TEXT_INPUT_FIELD_NUMBER = 7;
    public static final int TOAST_FIELD_NUMBER = 9;
    private long bizId_;
    private int bizType_;
    private CheckBox checkBox_;
    private ClickButton clickButton_;
    private long end_;
    private long priority_;
    private long start_;
    private TextInput textInput_;
    private Toast toast_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.PostPanel$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17095xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17095xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17095xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17095xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17095xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17095xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17095xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17095xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PostPanel, Builder> implements PostPanelOrBuilder {
        /* synthetic */ Builder(C72551 c72551) {
            this();
        }

        public Builder clearBizId() {
            copyOnWrite();
            ((PostPanel) this.instance).clearBizId();
            return this;
        }

        public Builder clearBizType() {
            copyOnWrite();
            ((PostPanel) this.instance).clearBizType();
            return this;
        }

        public Builder clearCheckBox() {
            copyOnWrite();
            ((PostPanel) this.instance).clearCheckBox();
            return this;
        }

        public Builder clearClickButton() {
            copyOnWrite();
            ((PostPanel) this.instance).clearClickButton();
            return this;
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((PostPanel) this.instance).clearEnd();
            return this;
        }

        public Builder clearPriority() {
            copyOnWrite();
            ((PostPanel) this.instance).clearPriority();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((PostPanel) this.instance).clearStart();
            return this;
        }

        public Builder clearTextInput() {
            copyOnWrite();
            ((PostPanel) this.instance).clearTextInput();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((PostPanel) this.instance).clearToast();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public long getBizId() {
            return ((PostPanel) this.instance).getBizId();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public PostPanelBizType getBizType() {
            return ((PostPanel) this.instance).getBizType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public int getBizTypeValue() {
            return ((PostPanel) this.instance).getBizTypeValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public CheckBox getCheckBox() {
            return ((PostPanel) this.instance).getCheckBox();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public ClickButton getClickButton() {
            return ((PostPanel) this.instance).getClickButton();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public long getEnd() {
            return ((PostPanel) this.instance).getEnd();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public long getPriority() {
            return ((PostPanel) this.instance).getPriority();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public long getStart() {
            return ((PostPanel) this.instance).getStart();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public TextInput getTextInput() {
            return ((PostPanel) this.instance).getTextInput();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public Toast getToast() {
            return ((PostPanel) this.instance).getToast();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public boolean hasCheckBox() {
            return ((PostPanel) this.instance).hasCheckBox();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public boolean hasClickButton() {
            return ((PostPanel) this.instance).hasClickButton();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public boolean hasTextInput() {
            return ((PostPanel) this.instance).hasTextInput();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
        public boolean hasToast() {
            return ((PostPanel) this.instance).hasToast();
        }

        public Builder mergeCheckBox(CheckBox checkBox) {
            copyOnWrite();
            ((PostPanel) this.instance).mergeCheckBox(checkBox);
            return this;
        }

        public Builder mergeClickButton(ClickButton clickButton) {
            copyOnWrite();
            ((PostPanel) this.instance).mergeClickButton(clickButton);
            return this;
        }

        public Builder mergeTextInput(TextInput textInput) {
            copyOnWrite();
            ((PostPanel) this.instance).mergeTextInput(textInput);
            return this;
        }

        public Builder mergeToast(Toast toast) {
            copyOnWrite();
            ((PostPanel) this.instance).mergeToast(toast);
            return this;
        }

        public Builder setBizId(long j) {
            copyOnWrite();
            ((PostPanel) this.instance).setBizId(j);
            return this;
        }

        public Builder setBizType(PostPanelBizType postPanelBizType) {
            copyOnWrite();
            ((PostPanel) this.instance).setBizType(postPanelBizType);
            return this;
        }

        public Builder setBizTypeValue(int i) {
            copyOnWrite();
            ((PostPanel) this.instance).setBizTypeValue(i);
            return this;
        }

        public Builder setCheckBox(CheckBox checkBox) {
            copyOnWrite();
            ((PostPanel) this.instance).setCheckBox(checkBox);
            return this;
        }

        public Builder setClickButton(ClickButton clickButton) {
            copyOnWrite();
            ((PostPanel) this.instance).setClickButton(clickButton);
            return this;
        }

        public Builder setEnd(long j) {
            copyOnWrite();
            ((PostPanel) this.instance).setEnd(j);
            return this;
        }

        public Builder setPriority(long j) {
            copyOnWrite();
            ((PostPanel) this.instance).setPriority(j);
            return this;
        }

        public Builder setStart(long j) {
            copyOnWrite();
            ((PostPanel) this.instance).setStart(j);
            return this;
        }

        public Builder setTextInput(TextInput textInput) {
            copyOnWrite();
            ((PostPanel) this.instance).setTextInput(textInput);
            return this;
        }

        public Builder setToast(Toast toast) {
            copyOnWrite();
            ((PostPanel) this.instance).setToast(toast);
            return this;
        }

        private Builder() {
            super(PostPanel.DEFAULT_INSTANCE);
        }

        public Builder setCheckBox(CheckBox.Builder builder) {
            copyOnWrite();
            ((PostPanel) this.instance).setCheckBox(builder.build());
            return this;
        }

        public Builder setClickButton(ClickButton.Builder builder) {
            copyOnWrite();
            ((PostPanel) this.instance).setClickButton(builder.build());
            return this;
        }

        public Builder setTextInput(TextInput.Builder builder) {
            copyOnWrite();
            ((PostPanel) this.instance).setTextInput(builder.build());
            return this;
        }

        public Builder setToast(Toast.Builder builder) {
            copyOnWrite();
            ((PostPanel) this.instance).setToast(builder.build());
            return this;
        }
    }

    static {
        PostPanel postPanel = new PostPanel();
        DEFAULT_INSTANCE = postPanel;
        GeneratedMessageLite.registerDefaultInstance(PostPanel.class, postPanel);
    }

    private PostPanel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizId() {
        this.bizId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizType() {
        this.bizType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckBox() {
        this.checkBox_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickButton() {
        this.clickButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextInput() {
        this.textInput_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToast() {
        this.toast_ = null;
    }

    public static PostPanel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCheckBox(CheckBox checkBox) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClickButton(ClickButton clickButton) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTextInput(TextInput textInput) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToast(Toast toast) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PostPanel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostPanel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostPanel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PostPanel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizId(long j) {
        this.bizId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizType(PostPanelBizType postPanelBizType) {
        this.bizType_ = postPanelBizType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizTypeValue(int i) {
        this.bizType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckBox(CheckBox checkBox) {
        checkBox.getClass();
        this.checkBox_ = checkBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickButton(ClickButton clickButton) {
        clickButton.getClass();
        this.clickButton_ = clickButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(long j) {
        this.end_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(long j) {
        this.priority_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j) {
        this.start_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextInput(TextInput textInput) {
        textInput.getClass();
        this.textInput_ = textInput;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(Toast toast) {
        toast.getClass();
        this.toast_ = toast;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72551.f17095xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PostPanel();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\f\u0006\t\u0007\t\b\t\t\t", new Object[]{"start_", "end_", "priority_", "bizId_", "bizType_", "clickButton_", "textInput_", "checkBox_", "toast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PostPanel> parser = PARSER;
                if (parser == null) {
                    synchronized (PostPanel.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public long getBizId() {
        return this.bizId_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public PostPanelBizType getBizType() {
        PostPanelBizType forNumber = PostPanelBizType.forNumber(this.bizType_);
        return forNumber == null ? PostPanelBizType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public int getBizTypeValue() {
        return this.bizType_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public CheckBox getCheckBox() {
        CheckBox checkBox = this.checkBox_;
        return checkBox == null ? CheckBox.getDefaultInstance() : checkBox;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public ClickButton getClickButton() {
        ClickButton clickButton = this.clickButton_;
        return clickButton == null ? ClickButton.getDefaultInstance() : clickButton;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public long getEnd() {
        return this.end_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public long getPriority() {
        return this.priority_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public long getStart() {
        return this.start_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public TextInput getTextInput() {
        TextInput textInput = this.textInput_;
        return textInput == null ? TextInput.getDefaultInstance() : textInput;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public Toast getToast() {
        Toast toast = this.toast_;
        return toast == null ? Toast.getDefaultInstance() : toast;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public boolean hasCheckBox() {
        return this.checkBox_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public boolean hasClickButton() {
        return this.clickButton_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public boolean hasTextInput() {
        return this.textInput_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelOrBuilder
    public boolean hasToast() {
        return this.toast_ != null;
    }

    public static Builder newBuilder(PostPanel postPanel) {
        return DEFAULT_INSTANCE.createBuilder(postPanel);
    }

    public static PostPanel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostPanel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostPanel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PostPanel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PostPanel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PostPanel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PostPanel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PostPanel parseFrom(InputStream inputStream) throws IOException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostPanel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostPanel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PostPanel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostPanel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
