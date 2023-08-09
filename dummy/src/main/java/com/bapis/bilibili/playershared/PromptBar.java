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
public final class PromptBar extends GeneratedMessageLite<PromptBar, PromptBar.Builder> implements MessageLiteOrBuilder {
    public static final int BG_GRADIENT_COLOR_FIELD_NUMBER = 5;
    public static final int BG_IMAGE_FIELD_NUMBER = 4;
    public static final int BUTTON_FIELD_NUMBER = 6;
    private static final PromptBar DEFAULT_INSTANCE;
    public static final int FULL_SCREEN_BG_GRADIENT_COLOR_FIELD_NUMBER = 9;
    public static final int FULL_SCREEN_IP_ICON_FIELD_NUMBER = 8;
    private static volatile Parser<PromptBar> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int SUB_TITLE_ICON_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private GradientColor bgGradientColor_;
    private GradientColor fullScreenBgGradientColor_;
    private Report report_;
    private TextInfo subTitle_;
    private TextInfo title_;
    private String subTitleIcon_ = "";
    private String bgImage_ = "";
    private Internal.ProtobufList<ButtonInfo> button_ = GeneratedMessageLite.emptyProtobufList();
    private String fullScreenIpIcon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.PromptBar$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17914xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17914xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17914xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17914xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17914xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17914xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17914xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17914xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PromptBar, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81951 c81951) {
            this();
        }

        public Builder addAllButton(Iterable<? extends ButtonInfo> iterable) {
            copyOnWrite();
            ((PromptBar) this.instance).addAllButton(iterable);
            return this;
        }

        public Builder addButton(ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PromptBar) this.instance).addButton(buttonInfo);
            return this;
        }

        public Builder clearBgGradientColor() {
            copyOnWrite();
            ((PromptBar) this.instance).clearBgGradientColor();
            return this;
        }

        public Builder clearBgImage() {
            copyOnWrite();
            ((PromptBar) this.instance).clearBgImage();
            return this;
        }

        public Builder clearButton() {
            copyOnWrite();
            ((PromptBar) this.instance).clearButton();
            return this;
        }

        public Builder clearFullScreenBgGradientColor() {
            copyOnWrite();
            ((PromptBar) this.instance).clearFullScreenBgGradientColor();
            return this;
        }

        public Builder clearFullScreenIpIcon() {
            copyOnWrite();
            ((PromptBar) this.instance).clearFullScreenIpIcon();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((PromptBar) this.instance).clearReport();
            return this;
        }

        public Builder clearSubTitle() {
            copyOnWrite();
            ((PromptBar) this.instance).clearSubTitle();
            return this;
        }

        public Builder clearSubTitleIcon() {
            copyOnWrite();
            ((PromptBar) this.instance).clearSubTitleIcon();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((PromptBar) this.instance).clearTitle();
            return this;
        }

        public GradientColor getBgGradientColor() {
            return ((PromptBar) this.instance).getBgGradientColor();
        }

        public String getBgImage() {
            return ((PromptBar) this.instance).getBgImage();
        }

        public ByteString getBgImageBytes() {
            return ((PromptBar) this.instance).getBgImageBytes();
        }

        public ButtonInfo getButton(int i) {
            return ((PromptBar) this.instance).getButton(i);
        }

        public int getButtonCount() {
            return ((PromptBar) this.instance).getButtonCount();
        }

        public List<ButtonInfo> getButtonList() {
            return Collections.unmodifiableList(((PromptBar) this.instance).getButtonList());
        }

        public GradientColor getFullScreenBgGradientColor() {
            return ((PromptBar) this.instance).getFullScreenBgGradientColor();
        }

        public String getFullScreenIpIcon() {
            return ((PromptBar) this.instance).getFullScreenIpIcon();
        }

        public ByteString getFullScreenIpIconBytes() {
            return ((PromptBar) this.instance).getFullScreenIpIconBytes();
        }

        public Report getReport() {
            return ((PromptBar) this.instance).getReport();
        }

        public TextInfo getSubTitle() {
            return ((PromptBar) this.instance).getSubTitle();
        }

        public String getSubTitleIcon() {
            return ((PromptBar) this.instance).getSubTitleIcon();
        }

        public ByteString getSubTitleIconBytes() {
            return ((PromptBar) this.instance).getSubTitleIconBytes();
        }

        public TextInfo getTitle() {
            return ((PromptBar) this.instance).getTitle();
        }

        public boolean hasBgGradientColor() {
            return ((PromptBar) this.instance).hasBgGradientColor();
        }

        public boolean hasFullScreenBgGradientColor() {
            return ((PromptBar) this.instance).hasFullScreenBgGradientColor();
        }

        public boolean hasReport() {
            return ((PromptBar) this.instance).hasReport();
        }

        public boolean hasSubTitle() {
            return ((PromptBar) this.instance).hasSubTitle();
        }

        public boolean hasTitle() {
            return ((PromptBar) this.instance).hasTitle();
        }

        public Builder mergeBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((PromptBar) this.instance).mergeBgGradientColor(gradientColor);
            return this;
        }

        public Builder mergeFullScreenBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((PromptBar) this.instance).mergeFullScreenBgGradientColor(gradientColor);
            return this;
        }

        public Builder mergeReport(Report report) {
            copyOnWrite();
            ((PromptBar) this.instance).mergeReport(report);
            return this;
        }

        public Builder mergeSubTitle(TextInfo textInfo) {
            copyOnWrite();
            ((PromptBar) this.instance).mergeSubTitle(textInfo);
            return this;
        }

        public Builder mergeTitle(TextInfo textInfo) {
            copyOnWrite();
            ((PromptBar) this.instance).mergeTitle(textInfo);
            return this;
        }

        public Builder removeButton(int i) {
            copyOnWrite();
            ((PromptBar) this.instance).removeButton(i);
            return this;
        }

        public Builder setBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((PromptBar) this.instance).setBgGradientColor(gradientColor);
            return this;
        }

        public Builder setBgImage(String str) {
            copyOnWrite();
            ((PromptBar) this.instance).setBgImage(str);
            return this;
        }

        public Builder setBgImageBytes(ByteString byteString) {
            copyOnWrite();
            ((PromptBar) this.instance).setBgImageBytes(byteString);
            return this;
        }

        public Builder setButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PromptBar) this.instance).setButton(i, buttonInfo);
            return this;
        }

        public Builder setFullScreenBgGradientColor(GradientColor gradientColor) {
            copyOnWrite();
            ((PromptBar) this.instance).setFullScreenBgGradientColor(gradientColor);
            return this;
        }

        public Builder setFullScreenIpIcon(String str) {
            copyOnWrite();
            ((PromptBar) this.instance).setFullScreenIpIcon(str);
            return this;
        }

        public Builder setFullScreenIpIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PromptBar) this.instance).setFullScreenIpIconBytes(byteString);
            return this;
        }

        public Builder setReport(Report report) {
            copyOnWrite();
            ((PromptBar) this.instance).setReport(report);
            return this;
        }

        public Builder setSubTitle(TextInfo textInfo) {
            copyOnWrite();
            ((PromptBar) this.instance).setSubTitle(textInfo);
            return this;
        }

        public Builder setSubTitleIcon(String str) {
            copyOnWrite();
            ((PromptBar) this.instance).setSubTitleIcon(str);
            return this;
        }

        public Builder setSubTitleIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PromptBar) this.instance).setSubTitleIconBytes(byteString);
            return this;
        }

        public Builder setTitle(TextInfo textInfo) {
            copyOnWrite();
            ((PromptBar) this.instance).setTitle(textInfo);
            return this;
        }

        private Builder() {
            super(PromptBar.DEFAULT_INSTANCE);
        }

        public Builder addButton(int i, ButtonInfo buttonInfo) {
            copyOnWrite();
            ((PromptBar) this.instance).addButton(i, buttonInfo);
            return this;
        }

        public Builder setBgGradientColor(GradientColor.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).setBgGradientColor(builder.build());
            return this;
        }

        public Builder setButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).setButton(i, builder.build());
            return this;
        }

        public Builder setFullScreenBgGradientColor(GradientColor.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).setFullScreenBgGradientColor(builder.build());
            return this;
        }

        public Builder setReport(Report.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).setReport(builder.build());
            return this;
        }

        public Builder setSubTitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).setSubTitle(builder.build());
            return this;
        }

        public Builder setTitle(TextInfo.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).setTitle(builder.build());
            return this;
        }

        public Builder addButton(ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).addButton(builder.build());
            return this;
        }

        public Builder addButton(int i, ButtonInfo.Builder builder) {
            copyOnWrite();
            ((PromptBar) this.instance).addButton(i, builder.build());
            return this;
        }
    }

    static {
        PromptBar promptBar = new PromptBar();
        DEFAULT_INSTANCE = promptBar;
        GeneratedMessageLite.registerDefaultInstance(PromptBar.class, promptBar);
    }

    private PromptBar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllButton(Iterable<? extends ButtonInfo> iterable) {
        ensureButtonIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.button_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgGradientColor() {
        this.bgGradientColor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgImage() {
        this.bgImage_ = getDefaultInstance().getBgImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullScreenBgGradientColor() {
        this.fullScreenBgGradientColor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullScreenIpIcon() {
        this.fullScreenIpIcon_ = getDefaultInstance().getFullScreenIpIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitle() {
        this.subTitle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubTitleIcon() {
        this.subTitleIcon_ = getDefaultInstance().getSubTitleIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    private void ensureButtonIsMutable() {
        Internal.ProtobufList<ButtonInfo> protobufList = this.button_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.button_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PromptBar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBgGradientColor(GradientColor gradientColor) {
        gradientColor.getClass();
        GradientColor gradientColor2 = this.bgGradientColor_;
        if (gradientColor2 != null && gradientColor2 != GradientColor.getDefaultInstance()) {
            this.bgGradientColor_ = GradientColor.newBuilder(this.bgGradientColor_).mergeFrom((GradientColor) gradientColor).buildPartial();
        } else {
            this.bgGradientColor_ = gradientColor;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFullScreenBgGradientColor(GradientColor gradientColor) {
        gradientColor.getClass();
        GradientColor gradientColor2 = this.fullScreenBgGradientColor_;
        if (gradientColor2 != null && gradientColor2 != GradientColor.getDefaultInstance()) {
            this.fullScreenBgGradientColor_ = GradientColor.newBuilder(this.fullScreenBgGradientColor_).mergeFrom((GradientColor) gradientColor).buildPartial();
        } else {
            this.fullScreenBgGradientColor_ = gradientColor;
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
    public void mergeSubTitle(TextInfo textInfo) {
        textInfo.getClass();
        TextInfo textInfo2 = this.subTitle_;
        if (textInfo2 != null && textInfo2 != TextInfo.getDefaultInstance()) {
            this.subTitle_ = TextInfo.newBuilder(this.subTitle_).mergeFrom((TextInfo) textInfo).buildPartial();
        } else {
            this.subTitle_ = textInfo;
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

    public static PromptBar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PromptBar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PromptBar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PromptBar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeButton(int i) {
        ensureButtonIsMutable();
        this.button_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgGradientColor(GradientColor gradientColor) {
        gradientColor.getClass();
        this.bgGradientColor_ = gradientColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgImage(String str) {
        str.getClass();
        this.bgImage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgImage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.set(i, buttonInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullScreenBgGradientColor(GradientColor gradientColor) {
        gradientColor.getClass();
        this.fullScreenBgGradientColor_ = gradientColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullScreenIpIcon(String str) {
        str.getClass();
        this.fullScreenIpIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullScreenIpIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fullScreenIpIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(Report report) {
        report.getClass();
        this.report_ = report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitle(TextInfo textInfo) {
        textInfo.getClass();
        this.subTitle_ = textInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleIcon(String str) {
        str.getClass();
        this.subTitleIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTitleIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subTitleIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(TextInfo textInfo) {
        textInfo.getClass();
        this.title_ = textInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81951.f17914xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PromptBar();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u0208\u0004\u0208\u0005\t\u0006\u001b\u0007\t\b\u0208\t\t", new Object[]{"title_", "subTitle_", "subTitleIcon_", "bgImage_", "bgGradientColor_", "button_", ButtonInfo.class, "report_", "fullScreenIpIcon_", "fullScreenBgGradientColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PromptBar> parser = PARSER;
                if (parser == null) {
                    synchronized (PromptBar.class) {
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

    public GradientColor getBgGradientColor() {
        GradientColor gradientColor = this.bgGradientColor_;
        return gradientColor == null ? GradientColor.getDefaultInstance() : gradientColor;
    }

    public String getBgImage() {
        return this.bgImage_;
    }

    public ByteString getBgImageBytes() {
        return ByteString.copyFromUtf8(this.bgImage_);
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

    public GradientColor getFullScreenBgGradientColor() {
        GradientColor gradientColor = this.fullScreenBgGradientColor_;
        return gradientColor == null ? GradientColor.getDefaultInstance() : gradientColor;
    }

    public String getFullScreenIpIcon() {
        return this.fullScreenIpIcon_;
    }

    public ByteString getFullScreenIpIconBytes() {
        return ByteString.copyFromUtf8(this.fullScreenIpIcon_);
    }

    public Report getReport() {
        Report report = this.report_;
        return report == null ? Report.getDefaultInstance() : report;
    }

    public TextInfo getSubTitle() {
        TextInfo textInfo = this.subTitle_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public String getSubTitleIcon() {
        return this.subTitleIcon_;
    }

    public ByteString getSubTitleIconBytes() {
        return ByteString.copyFromUtf8(this.subTitleIcon_);
    }

    public TextInfo getTitle() {
        TextInfo textInfo = this.title_;
        return textInfo == null ? TextInfo.getDefaultInstance() : textInfo;
    }

    public boolean hasBgGradientColor() {
        return this.bgGradientColor_ != null;
    }

    public boolean hasFullScreenBgGradientColor() {
        return this.fullScreenBgGradientColor_ != null;
    }

    public boolean hasReport() {
        return this.report_ != null;
    }

    public boolean hasSubTitle() {
        return this.subTitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static Builder newBuilder(PromptBar promptBar) {
        return DEFAULT_INSTANCE.createBuilder(promptBar);
    }

    public static PromptBar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PromptBar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PromptBar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PromptBar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addButton(int i, ButtonInfo buttonInfo) {
        buttonInfo.getClass();
        ensureButtonIsMutable();
        this.button_.add(i, buttonInfo);
    }

    public static PromptBar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PromptBar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PromptBar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PromptBar parseFrom(InputStream inputStream) throws IOException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PromptBar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PromptBar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PromptBar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PromptBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
