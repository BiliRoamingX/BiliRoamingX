package com.bapis.bilibili.playershared;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes18.dex */
public final class Dialog extends GeneratedMessageLite<Dialog, Dialog.Builder> implements MessageLiteOrBuilder {
    public static final int BACKGROUND_INFO_FIELD_NUMBER = 2;
    public static final int BOTTOM_DESC_FIELD_NUMBER = 7;
    public static final int BOTTOM_DISPLAY_FIELD_NUMBER = 11;
    public static final int BUTTON_FIELD_NUMBER = 6;
    public static final int COUNT_DOWN_SEC_FIELD_NUMBER = 9;
    private static final Dialog DEFAULT_INSTANCE;
    public static final int EXT_DATA_FIELD_NUMBER = 12;
    public static final int IMAGE_FIELD_NUMBER = 5;
    public static final int LIMIT_ACTION_TYPE_FIELD_NUMBER = 13;
    private static volatile Parser<Dialog> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 8;
    public static final int RIGHT_BOTTOM_DESC_FIELD_NUMBER = 10;
    public static final int STYLE_TYPE_FIELD_NUMBER = 1;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    private BackgroundInfo backgroundInfo_;
    private ButtonInfo bottomDesc_;
    private int countDownSec_;
    private ExtData extData_;
    private ImageInfo image_;
    private int limitActionType_;
    private Report report_;
    private TextInfo rightBottomDesc_;
    private int styleType_;
    private TextInfo subtitle_;
    private TextInfo title_;
    private Internal.ProtobufList<ButtonInfo> button_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<BottomDisplay> bottomDisplay_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.Dialog$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17896xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17896xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17896xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17896xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17896xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17896xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17896xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17896xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Dialog, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81701 c81701) {
            this();
        }

        public Builder addAllBottomDisplay(Iterable<? extends BottomDisplay> iterable) {
            copyOnWrite();
            ((Dialog) this.instance).addAllBottomDisplay(iterable);
            return this;
        }

        public Builder addAllButton(Iterable<? extends ButtonInfo> iterable) {
            copyOnWrite();
            ((Dialog) this.instance).addAllButton(iterable);
            return this;
        }

        public Builder addBottomDisplay(BottomDisplay bottomDisplay) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(bottomDisplay);
            return this;
        }

        public Builder addButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(buttonInfo);
            return this;
        }

        public Builder clearBackgroundInfo() {
            copyOnWrite();
            ((Dialog) this.instance).clearBackgroundInfo();
            return this;
        }

        public Builder clearBottomDesc() {
            copyOnWrite();
            ((Dialog) this.instance).clearBottomDesc();
            return this;
        }

        public Builder clearBottomDisplay() {
            copyOnWrite();
            ((Dialog) this.instance).clearBottomDisplay();
            return this;
        }

        public Builder clearButton() {
            copyOnWrite();
            ((Dialog) this.instance).clearButton();
            return this;
        }

        public Builder clearCountDownSec() {
            copyOnWrite();
            ((Dialog) this.instance).clearCountDownSec();
            return this;
        }

        public Builder clearExtData() {
            copyOnWrite();
            ((Dialog) this.instance).clearExtData();
            return this;
        }

        public Builder clearImage() {
            copyOnWrite();
            ((Dialog) this.instance).clearImage();
            return this;
        }

        public Builder clearLimitActionType() {
            copyOnWrite();
            ((Dialog) this.instance).clearLimitActionType();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((Dialog) this.instance).clearReport();
            return this;
        }

        public Builder clearRightBottomDesc() {
            copyOnWrite();
            ((Dialog) this.instance).clearRightBottomDesc();
            return this;
        }

        public Builder clearStyleType() {
            copyOnWrite();
            ((Dialog) this.instance).clearStyleType();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((Dialog) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Dialog) this.instance).clearTitle();
            return this;
        }

        public BackgroundInfo getBackgroundInfo() {
            return ((Dialog) this.instance).getBackgroundInfo();
        }

        public ButtonInfo getBottomDesc() {
            return ((Dialog) this.instance).getBottomDesc();
        }

        public BottomDisplay getBottomDisplay(int i) {
            return ((Dialog) this.instance).getBottomDisplay(i);
        }

        public int getBottomDisplayCount() {
            return ((Dialog) this.instance).getBottomDisplayCount();
        }

        public List<BottomDisplay> getBottomDisplayList() {
            return Collections.unmodifiableList(((Dialog) this.instance).getBottomDisplayList());
        }

        public ButtonInfo getButton(int i) {
            return ((Dialog) this.instance).getButton(i);
        }

        public int getButtonCount() {
            return ((Dialog) this.instance).getButtonCount();
        }

        public List<ButtonInfo> getButtonList() {
            return Collections.unmodifiableList(((Dialog) this.instance).getButtonList());
        }

        public int getCountDownSec() {
            return ((Dialog) this.instance).getCountDownSec();
        }

        public ExtData getExtData() {
            return ((Dialog) this.instance).getExtData();
        }

        public ImageInfo getImage() {
            return ((Dialog) this.instance).getImage();
        }

        public LimitActionType getLimitActionType() {
            return ((Dialog) this.instance).getLimitActionType();
        }

        public int getLimitActionTypeValue() {
            return ((Dialog) this.instance).getLimitActionTypeValue();
        }

        public Report getReport() {
            return ((Dialog) this.instance).getReport();
        }

        public TextInfo getRightBottomDesc() {
            return ((Dialog) this.instance).getRightBottomDesc();
        }

        public GuideStyle getStyleType() {
            return ((Dialog) this.instance).getStyleType();
        }

        public int getStyleTypeValue() {
            return ((Dialog) this.instance).getStyleTypeValue();
        }

        public TextInfo getSubtitle() {
            return ((Dialog) this.instance).getSubtitle();
        }

        public TextInfo getTitle() {
            return ((Dialog) this.instance).getTitle();
        }

        public boolean hasBackgroundInfo() {
            return ((Dialog) this.instance).hasBackgroundInfo();
        }

        public boolean hasBottomDesc() {
            return ((Dialog) this.instance).hasBottomDesc();
        }

        public boolean hasExtData() {
            return ((Dialog) this.instance).hasExtData();
        }

        public boolean hasImage() {
            return ((Dialog) this.instance).hasImage();
        }

        public boolean hasReport() {
            return ((Dialog) this.instance).hasReport();
        }

        public boolean hasRightBottomDesc() {
            return ((Dialog) this.instance).hasRightBottomDesc();
        }

        public boolean hasSubtitle() {
            return ((Dialog) this.instance).hasSubtitle();
        }

        public boolean hasTitle() {
            return ((Dialog) this.instance).hasTitle();
        }

        public Builder mergeBackgroundInfo(BackgroundInfo backgroundInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeBackgroundInfo(backgroundInfo);
            return this;
        }

        public Builder mergeBottomDesc(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeBottomDesc(buttonInfo);
            return this;
        }

        public Builder mergeExtData(ExtData extData) {
            copyOnWrite();
            ((Dialog) this.instance).mergeExtData(extData);
            return this;
        }

        public Builder mergeImage(ImageInfo imageInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeImage(imageInfo);
            return this;
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((Dialog) this.instance).mergeReport(report);
            return this;
        }

        public Builder mergeRightBottomDesc(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeRightBottomDesc(textInfo);
            return this;
        }

        public Builder mergeSubtitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeSubtitle(textInfo);
            return this;
        }

        public Builder mergeTitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).mergeTitle(textInfo);
            return this;
        }

        public Builder removeBottomDisplay(int i) {
            copyOnWrite();
            ((Dialog) this.instance).removeBottomDisplay(i);
            return this;
        }

        public Builder removeButton(int i) {
            copyOnWrite();
            ((Dialog) this.instance).removeButton(i);
            return this;
        }

        public Builder setBackgroundInfo(BackgroundInfo backgroundInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setBackgroundInfo(backgroundInfo);
            return this;
        }

        public Builder setBottomDesc(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDesc(buttonInfo);
            return this;
        }

        public Builder setBottomDisplay(int i, BottomDisplay bottomDisplay) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDisplay(i, bottomDisplay);
            return this;
        }

        public Builder setButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setButton(i, buttonInfo);
            return this;
        }

        public Builder setCountDownSec(int i) {
            copyOnWrite();
            ((Dialog) this.instance).setCountDownSec(i);
            return this;
        }

        public Builder setExtData(ExtData extData) {
            copyOnWrite();
            ((Dialog) this.instance).setExtData(extData);
            return this;
        }

        public Builder setImage(ImageInfo imageInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setImage(imageInfo);
            return this;
        }

        public Builder setLimitActionType(LimitActionType limitActionType) {
            copyOnWrite();
            ((Dialog) this.instance).setLimitActionType(limitActionType);
            return this;
        }

        public Builder setLimitActionTypeValue(int i) {
            copyOnWrite();
            ((Dialog) this.instance).setLimitActionTypeValue(i);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((Dialog) this.instance).setReport(report);
            return this;
        }

        public Builder setRightBottomDesc(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setRightBottomDesc(textInfo);
            return this;
        }

        public Builder setStyleType(GuideStyle guideStyle) {
            copyOnWrite();
            ((Dialog) this.instance).setStyleType(guideStyle);
            return this;
        }

        public Builder setStyleTypeValue(int i) {
            copyOnWrite();
            ((Dialog) this.instance).setStyleTypeValue(i);
            return this;
        }

        public Builder setSubtitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setSubtitle(textInfo);
            return this;
        }

        public Builder setTitle(TextInfo textInfo) {
            copyOnWrite();
            ((Dialog) this.instance).setTitle(textInfo);
            return this;
        }

        private Builder() {
            super(Dialog.DEFAULT_INSTANCE);
        }

        public Builder addBottomDisplay(int i, BottomDisplay bottomDisplay) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(i, bottomDisplay);
            return this;
        }

        public Builder addButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(i, buttonInfo);
            return this;
        }

        public Builder setBackgroundInfo(BackgroundInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setBackgroundInfo(builder.build());
            return this;
        }

        public Builder setBottomDesc(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDesc(builder.build());
            return this;
        }

        public Builder setBottomDisplay(int i, BottomDisplay.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setBottomDisplay(i, builder.build());
            return this;
        }

        public Builder setButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setButton(i, builder.build());
            return this;
        }

        public Builder setExtData(ExtData.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setExtData(builder.build());
            return this;
        }

        public Builder setImage(ImageInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setImage(builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setReport(builder.build());
            return this;
        }

        public Builder setRightBottomDesc(TextInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setRightBottomDesc(builder.build());
            return this;
        }

        public Builder setSubtitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setSubtitle(builder.build());
            return this;
        }

        public Builder setTitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).setTitle(builder.build());
            return this;
        }

        public Builder addBottomDisplay(BottomDisplay.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(builder.build());
            return this;
        }

        public Builder addButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(builder.build());
            return this;
        }

        public Builder addBottomDisplay(int i, BottomDisplay.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addBottomDisplay(i, builder.build());
            return this;
        }

        public Builder addButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((Dialog) this.instance).addButton(i, builder.build());
            return this;
        }
    }

    static {
        Dialog dialog = new Dialog();
        DEFAULT_INSTANCE = dialog;
        GeneratedMessageLite.registerDefaultInstance(Dialog.class, dialog);
    }

    private Dialog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBottomDisplay(Iterable<? extends BottomDisplay> iterable) {
        ensureBottomDisplayIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bottomDisplay_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllButton(Iterable<? extends ButtonInfo> iterable) {
        ensureButtonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.button_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBottomDisplay(BottomDisplay bottomDisplay) {
        bottomDisplay.getClass();
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.add(bottomDisplay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundInfo() {
        this.backgroundInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomDesc() {
        this.bottomDesc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomDisplay() {
        this.bottomDisplay_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountDownSec() {
        this.countDownSec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtData() {
        this.extData_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimitActionType() {
        this.limitActionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightBottomDesc() {
        this.rightBottomDesc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleType() {
        this.styleType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    private void ensureBottomDisplayIsMutable() {
        Internal.ProtobufList<BottomDisplay> protobufList = this.bottomDisplay_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bottomDisplay_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureButtonIsMutable() {
        Internal.ProtobufList<ButtonInfo> protobufList = this.button_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.button_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Dialog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackgroundInfo(BackgroundInfo backgroundInfo) {
        backgroundInfo.getClass();
        BackgroundInfo backgroundInfo2 = this.backgroundInfo_;
        if (backgroundInfo2 != null && backgroundInfo2 != BackgroundInfo.getDefaultInstance()) {
            this.backgroundInfo_ = BackgroundInfo.newBuilder(this.backgroundInfo_).mergeFrom((BackgroundInfo) backgroundInfo).buildPartial();
        } else {
            this.backgroundInfo_ = backgroundInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBottomDesc(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ButtonInfo buttonInfo2 = this.bottomDesc_;
        if (buttonInfo2 != null && buttonInfo2 != ButtonInfo.getDefaultInstance()) {
            this.bottomDesc_ = ButtonInfo.newBuilder(this.bottomDesc_).mergeFrom((ButtonInfo) buttonInfo).buildPartial();
        } else {
            this.bottomDesc_ = buttonInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtData(ExtData extData) {
        extData.getClass();
        ExtData extData2 = this.extData_;
        if (extData2 != null && extData2 != ExtData.getDefaultInstance()) {
            this.extData_ = ExtData.newBuilder(this.extData_).mergeFrom((ExtData) extData).buildPartial();
        } else {
            this.extData_ = extData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImage(ImageInfo imageInfo) {
        imageInfo.getClass();
        ImageInfo imageInfo2 = this.image_;
        if (imageInfo2 != null && imageInfo2 != ImageInfo.getDefaultInstance()) {
            this.image_ = ImageInfo.newBuilder(this.image_).mergeFrom((ImageInfo) imageInfo).buildPartial();
        } else {
            this.image_ = imageInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(Report report) {
        report.getClass();
        Report report2 = this.report_;
        if (report2 != null && report2 != Report.getDefaultInstance()) {
            this.report_ = Report.newBuilder(this.report_).mergeFrom((Report) report).buildPartial();
        } else {
            this.report_ = report;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRightBottomDesc(TextInfo textInfo) {
        textInfo.getClass();
        TextInfo textInfo2 = this.rightBottomDesc_;
        if (textInfo2 != null && textInfo2 != TextInfo.getDefaultInstance()) {
            this.rightBottomDesc_ = TextInfo.newBuilder(this.rightBottomDesc_).mergeFrom((TextInfo) textInfo).buildPartial();
        } else {
            this.rightBottomDesc_ = textInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubtitle(TextInfo textInfo) {
        textInfo.getClass();
        TextInfo textInfo2 = this.subtitle_;
        if (textInfo2 != null && textInfo2 != TextInfo.getDefaultInstance()) {
            this.subtitle_ = TextInfo.newBuilder(this.subtitle_).mergeFrom((TextInfo) textInfo).buildPartial();
        } else {
            this.subtitle_ = textInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitle(TextInfo textInfo) {
        textInfo.getClass();
        TextInfo textInfo2 = this.title_;
        if (textInfo2 != null && textInfo2 != TextInfo.getDefaultInstance()) {
            this.title_ = TextInfo.newBuilder(this.title_).mergeFrom((TextInfo) textInfo).buildPartial();
        } else {
            this.title_ = textInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Dialog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dialog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Dialog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBottomDisplay(int i) {
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeButton(int i) {
        ensureButtonIsMutable();
        this.button_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundInfo(BackgroundInfo backgroundInfo) {
        backgroundInfo.getClass();
        this.backgroundInfo_ = backgroundInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomDesc(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        this.bottomDesc_ = buttonInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomDisplay(int i, BottomDisplay bottomDisplay) {
        bottomDisplay.getClass();
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.set(i, bottomDisplay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.set(i, buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownSec(int i) {
        this.countDownSec_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtData(ExtData extData) {
        extData.getClass();
        this.extData_ = extData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(ImageInfo imageInfo) {
        imageInfo.getClass();
        this.image_ = imageInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitActionType(LimitActionType limitActionType) {
        this.limitActionType_ = limitActionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitActionTypeValue(int i) {
        this.limitActionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(Report report) {
        report.getClass();
        this.report_ = report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightBottomDesc(TextInfo textInfo) {
        textInfo.getClass();
        this.rightBottomDesc_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleType(GuideStyle guideStyle) {
        this.styleType_ = guideStyle.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleTypeValue(int i) {
        this.styleType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(TextInfo textInfo) {
        textInfo.getClass();
        this.subtitle_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(TextInfo textInfo) {
        textInfo.getClass();
        this.title_ = textInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81701.f17896xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Dialog();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0002\u0000\u0001\f\u0002\t\u0003\t\u0004\t\u0005\t\u0006\u001b\u0007\t\b\t\t\u0004\n\t\u000b\u001b\f\t\r\f", new Object[]{"styleType_", "backgroundInfo_", "title_", "subtitle_", "image_", "button_", ButtonInfo.class, "bottomDesc_", "report_", "countDownSec_", "rightBottomDesc_", "bottomDisplay_", BottomDisplay.class, "extData_", "limitActionType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Dialog> parser = PARSER;
                if (parser == null) {
                    synchronized (Dialog.class) {
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

    public BackgroundInfo getBackgroundInfo() {
        BackgroundInfo backgroundInfo = this.backgroundInfo_;
        return backgroundInfo == null ? BackgroundInfo.getDefaultInstance() : backgroundInfo;
    }

    public ButtonInfo getBottomDesc() {
        ButtonInfo buttonInfo = this.bottomDesc_;
        return buttonInfo == null ? ButtonInfo.getDefaultInstance() : buttonInfo;
    }

    public BottomDisplay getBottomDisplay(int i) {
        return this.bottomDisplay_.get(i);
    }

    public int getBottomDisplayCount() {
        return this.bottomDisplay_.size();
    }

    public List<BottomDisplay> getBottomDisplayList() {
        return this.bottomDisplay_;
    }

    public BottomDisplayOrBuilder getBottomDisplayOrBuilder(int i) {
        return this.bottomDisplay_.get(i);
    }

    public List<? extends BottomDisplayOrBuilder> getBottomDisplayOrBuilderList() {
        return this.bottomDisplay_;
    }

    public ButtonInfo getButton(int i) {
        return this.button_.get(i);
    }

    public int getButtonCount() {
        return this.button_.size();
    }

    public List<ButtonInfo> getButtonList() {
        return this.button_;
    }

    public ButtonInfoOrBuilder getButtonOrBuilder(int i) {
        return this.button_.get(i);
    }

    public List<? extends ButtonInfoOrBuilder> getButtonOrBuilderList() {
        return this.button_;
    }

    public int getCountDownSec() {
        return this.countDownSec_;
    }

    public ExtData getExtData() {
        ExtData extData = this.extData_;
        return extData == null ? ExtData.getDefaultInstance() : extData;
    }

    public ImageInfo getImage() {
        ImageInfo imageInfo = this.image_;
        return imageInfo == null ? ImageInfo.getDefaultInstance() : imageInfo;
    }

    public LimitActionType getLimitActionType() {
        LimitActionType forNumber = LimitActionType.forNumber(this.limitActionType_);
        return forNumber == null ? LimitActionType.UNRECOGNIZED : forNumber;
    }

    public int getLimitActionTypeValue() {
        return this.limitActionType_;
    }

    public Report getReport() {
        Report report = this.report_;
        return report == null ? Report.getDefaultInstance() : report;
    }

    public TextInfo getRightBottomDesc() {
        TextInfo textInfo = this.rightBottomDesc_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public GuideStyle getStyleType() {
        GuideStyle forNumber = GuideStyle.forNumber(this.styleType_);
        return forNumber == null ? GuideStyle.UNRECOGNIZED : forNumber;
    }

    public int getStyleTypeValue() {
        return this.styleType_;
    }

    public TextInfo getSubtitle() {
        TextInfo textInfo = this.subtitle_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public TextInfo getTitle() {
        TextInfo textInfo = this.title_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public boolean hasBackgroundInfo() {
        return this.backgroundInfo_ != null;
    }

    public boolean hasBottomDesc() {
        return this.bottomDesc_ != null;
    }

    public boolean hasExtData() {
        return this.extData_ != null;
    }

    public boolean hasImage() {
        return this.image_ != null;
    }

    public boolean hasReport() {
        return this.report_ != null;
    }

    public boolean hasRightBottomDesc() {
        return this.rightBottomDesc_ != null;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static Builder newBuilder(Dialog dialog) {
        return DEFAULT_INSTANCE.createBuilder(dialog);
    }

    public static Dialog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dialog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Dialog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBottomDisplay(int i, BottomDisplay bottomDisplay) {
        bottomDisplay.getClass();
        ensureBottomDisplayIsMutable();
        this.bottomDisplay_.add(i, bottomDisplay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(i, buttonInfo);
    }

    public static Dialog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Dialog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Dialog parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Dialog parseFrom(InputStream inputStream) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Dialog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Dialog parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Dialog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
