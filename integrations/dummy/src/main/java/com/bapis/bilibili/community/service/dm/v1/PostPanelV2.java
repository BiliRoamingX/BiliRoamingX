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
public final class PostPanelV2 extends GeneratedMessageLite<PostPanelV2, PostPanelV2.Builder> implements PostPanelV2OrBuilder {
    public static final int BIZ_TYPE_FIELD_NUMBER = 3;
    public static final int BUBBLE_FIELD_NUMBER = 8;
    public static final int CHECK_BOX_FIELD_NUMBER = 6;
    public static final int CLICK_BUTTON_FIELD_NUMBER = 4;
    private static final PostPanelV2 DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 9;
    private static volatile Parser<PostPanelV2> PARSER = null;
    public static final int POST_STATUS_FIELD_NUMBER = 10;
    public static final int START_FIELD_NUMBER = 1;
    public static final int TEXT_INPUT_FIELD_NUMBER = 5;
    public static final int TOAST_FIELD_NUMBER = 7;
    private int bizType_;
    private BubbleV2 bubble_;
    private CheckBoxV2 checkBox_;
    private ClickButtonV2 clickButton_;
    private long end_;
    private LabelV2 label_;
    private int postStatus_;
    private long start_;
    private TextInputV2 textInput_;
    private ToastV2 toast_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.PostPanelV2$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17096xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17096xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17096xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17096xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17096xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17096xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17096xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17096xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PostPanelV2, Builder> implements PostPanelV2OrBuilder {
        /* synthetic */ Builder(C72571 c72571) {
            this();
        }

        public Builder clearBizType() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearBizType();
            return this;
        }

        public Builder clearBubble() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearBubble();
            return this;
        }

        public Builder clearCheckBox() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearCheckBox();
            return this;
        }

        public Builder clearClickButton() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearClickButton();
            return this;
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearEnd();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearLabel();
            return this;
        }

        public Builder clearPostStatus() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearPostStatus();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearStart();
            return this;
        }

        public Builder clearTextInput() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearTextInput();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((PostPanelV2) this.instance).clearToast();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public PostPanelBizType getBizType() {
            return ((PostPanelV2) this.instance).getBizType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public int getBizTypeValue() {
            return ((PostPanelV2) this.instance).getBizTypeValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public BubbleV2 getBubble() {
            return ((PostPanelV2) this.instance).getBubble();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public CheckBoxV2 getCheckBox() {
            return ((PostPanelV2) this.instance).getCheckBox();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public ClickButtonV2 getClickButton() {
            return ((PostPanelV2) this.instance).getClickButton();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public long getEnd() {
            return ((PostPanelV2) this.instance).getEnd();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public LabelV2 getLabel() {
            return ((PostPanelV2) this.instance).getLabel();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public PostStatus getPostStatus() {
            return ((PostPanelV2) this.instance).getPostStatus();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public int getPostStatusValue() {
            return ((PostPanelV2) this.instance).getPostStatusValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public long getStart() {
            return ((PostPanelV2) this.instance).getStart();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public TextInputV2 getTextInput() {
            return ((PostPanelV2) this.instance).getTextInput();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public ToastV2 getToast() {
            return ((PostPanelV2) this.instance).getToast();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public boolean hasBubble() {
            return ((PostPanelV2) this.instance).hasBubble();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public boolean hasCheckBox() {
            return ((PostPanelV2) this.instance).hasCheckBox();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public boolean hasClickButton() {
            return ((PostPanelV2) this.instance).hasClickButton();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public boolean hasLabel() {
            return ((PostPanelV2) this.instance).hasLabel();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public boolean hasTextInput() {
            return ((PostPanelV2) this.instance).hasTextInput();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
        public boolean hasToast() {
            return ((PostPanelV2) this.instance).hasToast();
        }

        public Builder mergeBubble(BubbleV2 bubbleV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).mergeBubble(bubbleV2);
            return this;
        }

        public Builder mergeCheckBox(CheckBoxV2 checkBoxV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).mergeCheckBox(checkBoxV2);
            return this;
        }

        public Builder mergeClickButton(ClickButtonV2 clickButtonV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).mergeClickButton(clickButtonV2);
            return this;
        }

        public Builder mergeLabel(LabelV2 labelV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).mergeLabel(labelV2);
            return this;
        }

        public Builder mergeTextInput(TextInputV2 textInputV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).mergeTextInput(textInputV2);
            return this;
        }

        public Builder mergeToast(ToastV2 toastV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).mergeToast(toastV2);
            return this;
        }

        public Builder setBizType(PostPanelBizType postPanelBizType) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setBizType(postPanelBizType);
            return this;
        }

        public Builder setBizTypeValue(int i) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setBizTypeValue(i);
            return this;
        }

        public Builder setBubble(BubbleV2 bubbleV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setBubble(bubbleV2);
            return this;
        }

        public Builder setCheckBox(CheckBoxV2 checkBoxV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setCheckBox(checkBoxV2);
            return this;
        }

        public Builder setClickButton(ClickButtonV2 clickButtonV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setClickButton(clickButtonV2);
            return this;
        }

        public Builder setEnd(long j) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setEnd(j);
            return this;
        }

        public Builder setLabel(LabelV2 labelV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setLabel(labelV2);
            return this;
        }

        public Builder setPostStatus(PostStatus postStatus) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setPostStatus(postStatus);
            return this;
        }

        public Builder setPostStatusValue(int i) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setPostStatusValue(i);
            return this;
        }

        public Builder setStart(long j) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setStart(j);
            return this;
        }

        public Builder setTextInput(TextInputV2 textInputV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setTextInput(textInputV2);
            return this;
        }

        public Builder setToast(ToastV2 toastV2) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setToast(toastV2);
            return this;
        }

        private Builder() {
            super(PostPanelV2.DEFAULT_INSTANCE);
        }

        public Builder setBubble(BubbleV2.Builder builder) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setBubble(builder.build());
            return this;
        }

        public Builder setCheckBox(CheckBoxV2.Builder builder) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setCheckBox(builder.build());
            return this;
        }

        public Builder setClickButton(ClickButtonV2.Builder builder) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setClickButton(builder.build());
            return this;
        }

        public Builder setLabel(LabelV2.Builder builder) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setLabel(builder.build());
            return this;
        }

        public Builder setTextInput(TextInputV2.Builder builder) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setTextInput(builder.build());
            return this;
        }

        public Builder setToast(ToastV2.Builder builder) {
            copyOnWrite();
            ((PostPanelV2) this.instance).setToast(builder.build());
            return this;
        }
    }

    static {
        PostPanelV2 postPanelV2 = new PostPanelV2();
        DEFAULT_INSTANCE = postPanelV2;
        GeneratedMessageLite.registerDefaultInstance(PostPanelV2.class, postPanelV2);
    }

    private PostPanelV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizType() {
        this.bizType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBubble() {
        this.bubble_ = null;
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
    public void clearLabel() {
        this.label_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostStatus() {
        this.postStatus_ = 0;
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

    public static PostPanelV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBubble(BubbleV2 bubbleV2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCheckBox(CheckBoxV2 checkBoxV2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClickButton(ClickButtonV2 clickButtonV2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(LabelV2 labelV2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTextInput(TextInputV2 textInputV2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToast(ToastV2 toastV2) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PostPanelV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostPanelV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostPanelV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PostPanelV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setBubble(BubbleV2 bubbleV2) {
        bubbleV2.getClass();
        this.bubble_ = bubbleV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckBox(CheckBoxV2 checkBoxV2) {
        checkBoxV2.getClass();
        this.checkBox_ = checkBoxV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickButton(ClickButtonV2 clickButtonV2) {
        clickButtonV2.getClass();
        this.clickButton_ = clickButtonV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(long j) {
        this.end_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(LabelV2 labelV2) {
        labelV2.getClass();
        this.label_ = labelV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostStatus(PostStatus postStatus) {
        this.postStatus_ = postStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostStatusValue(int i) {
        this.postStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j) {
        this.start_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextInput(TextInputV2 textInputV2) {
        textInputV2.getClass();
        this.textInput_ = textInputV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(ToastV2 toastV2) {
        toastV2.getClass();
        this.toast_ = toastV2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72571.f17096xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PostPanelV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\f\u0004\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\f", new Object[]{"start_", "end_", "bizType_", "clickButton_", "textInput_", "checkBox_", "toast_", "bubble_", "label_", "postStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PostPanelV2> parser = PARSER;
                if (parser == null) {
                    synchronized (PostPanelV2.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public PostPanelBizType getBizType() {
        PostPanelBizType forNumber = PostPanelBizType.forNumber(this.bizType_);
        return forNumber == null ? PostPanelBizType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public int getBizTypeValue() {
        return this.bizType_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public BubbleV2 getBubble() {
        BubbleV2 bubbleV2 = this.bubble_;
        return bubbleV2 == null ? BubbleV2.getDefaultInstance() : bubbleV2;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public CheckBoxV2 getCheckBox() {
        CheckBoxV2 checkBoxV2 = this.checkBox_;
        return checkBoxV2 == null ? CheckBoxV2.getDefaultInstance() : checkBoxV2;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public ClickButtonV2 getClickButton() {
        ClickButtonV2 clickButtonV2 = this.clickButton_;
        return clickButtonV2 == null ? ClickButtonV2.getDefaultInstance() : clickButtonV2;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public long getEnd() {
        return this.end_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public LabelV2 getLabel() {
        LabelV2 labelV2 = this.label_;
        return labelV2 == null ? LabelV2.getDefaultInstance() : labelV2;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public PostStatus getPostStatus() {
        PostStatus forNumber = PostStatus.forNumber(this.postStatus_);
        return forNumber == null ? PostStatus.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public int getPostStatusValue() {
        return this.postStatus_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public long getStart() {
        return this.start_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public TextInputV2 getTextInput() {
        TextInputV2 textInputV2 = this.textInput_;
        return textInputV2 == null ? TextInputV2.getDefaultInstance() : textInputV2;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public ToastV2 getToast() {
        ToastV2 toastV2 = this.toast_;
        return toastV2 == null ? ToastV2.getDefaultInstance() : toastV2;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public boolean hasBubble() {
        return this.bubble_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public boolean hasCheckBox() {
        return this.checkBox_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public boolean hasClickButton() {
        return this.clickButton_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public boolean hasLabel() {
        return this.label_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public boolean hasTextInput() {
        return this.textInput_ != null;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PostPanelV2OrBuilder
    public boolean hasToast() {
        return this.toast_ != null;
    }

    public static Builder newBuilder(PostPanelV2 postPanelV2) {
        return DEFAULT_INSTANCE.createBuilder(postPanelV2);
    }

    public static PostPanelV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostPanelV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostPanelV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PostPanelV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PostPanelV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PostPanelV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PostPanelV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PostPanelV2 parseFrom(InputStream inputStream) throws IOException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostPanelV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PostPanelV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PostPanelV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostPanelV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
