package com.bapis.bilibili.main.community.reply.v2;

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
public final class EmptyPage extends GeneratedMessageLite<EmptyPage, EmptyPage.Builder> implements MessageLiteOrBuilder {
    private static final EmptyPage DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LEFT_BUTTON_FIELD_NUMBER = 3;
    private static volatile Parser<EmptyPage> PARSER = null;
    public static final int RIGHT_BUTTON_FIELD_NUMBER = 4;
    public static final int TEXTS_FIELD_NUMBER = 2;
    private Button leftButton_;
    private Button rightButton_;
    private String imageUrl_ = "";
    private Internal.ProtobufList<Text> texts_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.EmptyPage$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C79961 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17760xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17760xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17760xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17760xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17760xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17760xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17760xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17760xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public enum Action implements Internal.EnumLite {
        UNAVAILABLE(0),
        SHOW_KEYBOARD(1),
        SEND_REPLY_WITH_BOLD_TEXT(2),
        UNRECOGNIZED(-1);

        public static final int SEND_REPLY_WITH_BOLD_TEXT_VALUE = 2;
        public static final int SHOW_KEYBOARD_VALUE = 1;
        public static final int UNAVAILABLE_VALUE = 0;
        private static final Internal.EnumLiteMap<Action> internalValueMap = new Internal.EnumLiteMap<Action>() { // from class: com.bapis.bilibili.main.community.reply.v2.EmptyPage.Action.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Action findValueByNumber(int i) {
                return Action.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        private static final class ActionVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ActionVerifier();

            private ActionVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Action.forNumber(i) != null;
            }
        }

        Action(int i) {
            this.value = i;
        }

        public static Action forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return SEND_REPLY_WITH_BOLD_TEXT;
                }
                return SHOW_KEYBOARD;
            }
            return UNAVAILABLE;
        }

        public static Internal.EnumLiteMap<Action> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ActionVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Action valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EmptyPage, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79961 c79961) {
            this();
        }

        public Builder addAllTexts(Iterable<? extends Text> iterable) {
            copyOnWrite();
            ((EmptyPage) this.instance).addAllTexts(iterable);
            return this;
        }

        public Builder addTexts(Text text) {
            copyOnWrite();
            ((EmptyPage) this.instance).addTexts(text);
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((EmptyPage) this.instance).clearImageUrl();
            return this;
        }

        public Builder clearLeftButton() {
            copyOnWrite();
            ((EmptyPage) this.instance).clearLeftButton();
            return this;
        }

        public Builder clearRightButton() {
            copyOnWrite();
            ((EmptyPage) this.instance).clearRightButton();
            return this;
        }

        public Builder clearTexts() {
            copyOnWrite();
            ((EmptyPage) this.instance).clearTexts();
            return this;
        }

        public String getImageUrl() {
            return ((EmptyPage) this.instance).getImageUrl();
        }

        public ByteString getImageUrlBytes() {
            return ((EmptyPage) this.instance).getImageUrlBytes();
        }

        public Button getLeftButton() {
            return ((EmptyPage) this.instance).getLeftButton();
        }

        public Button getRightButton() {
            return ((EmptyPage) this.instance).getRightButton();
        }

        public Text getTexts(int i) {
            return ((EmptyPage) this.instance).getTexts(i);
        }

        public int getTextsCount() {
            return ((EmptyPage) this.instance).getTextsCount();
        }

        public List<Text> getTextsList() {
            return Collections.unmodifiableList(((EmptyPage) this.instance).getTextsList());
        }

        public boolean hasLeftButton() {
            return ((EmptyPage) this.instance).hasLeftButton();
        }

        public boolean hasRightButton() {
            return ((EmptyPage) this.instance).hasRightButton();
        }

        public Builder mergeLeftButton(Button button) {
            copyOnWrite();
            ((EmptyPage) this.instance).mergeLeftButton(button);
            return this;
        }

        public Builder mergeRightButton(Button button) {
            copyOnWrite();
            ((EmptyPage) this.instance).mergeRightButton(button);
            return this;
        }

        public Builder removeTexts(int i) {
            copyOnWrite();
            ((EmptyPage) this.instance).removeTexts(i);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((EmptyPage) this.instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((EmptyPage) this.instance).setImageUrlBytes(byteString);
            return this;
        }

        public Builder setLeftButton(Button button) {
            copyOnWrite();
            ((EmptyPage) this.instance).setLeftButton(button);
            return this;
        }

        public Builder setRightButton(Button button) {
            copyOnWrite();
            ((EmptyPage) this.instance).setRightButton(button);
            return this;
        }

        public Builder setTexts(int i, Text text) {
            copyOnWrite();
            ((EmptyPage) this.instance).setTexts(i, text);
            return this;
        }

        private Builder() {
            super(EmptyPage.DEFAULT_INSTANCE);
        }

        public Builder addTexts(int i, Text text) {
            copyOnWrite();
            ((EmptyPage) this.instance).addTexts(i, text);
            return this;
        }

        public Builder setLeftButton(Button.Builder builder) {
            copyOnWrite();
            ((EmptyPage) this.instance).setLeftButton(builder.build());
            return this;
        }

        public Builder setRightButton(Button.Builder builder) {
            copyOnWrite();
            ((EmptyPage) this.instance).setRightButton(builder.build());
            return this;
        }

        public Builder setTexts(int i, Text.Builder builder) {
            copyOnWrite();
            ((EmptyPage) this.instance).setTexts(i, builder.build());
            return this;
        }

        public Builder addTexts(Text.Builder builder) {
            copyOnWrite();
            ((EmptyPage) this.instance).addTexts(builder.build());
            return this;
        }

        public Builder addTexts(int i, Text.Builder builder) {
            copyOnWrite();
            ((EmptyPage) this.instance).addTexts(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Button extends GeneratedMessageLite<Button, Button.Builder> implements MessageLiteOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        private static final Button DEFAULT_INSTANCE;
        private static volatile Parser<Button> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int action_;
        private String title_ = "";

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Button, Builder> implements MessageLiteOrBuilder {
            /* synthetic */ Builder(C79961 c79961) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((Button) this.instance).clearAction();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((Button) this.instance).clearTitle();
                return this;
            }

            public Action getAction() {
                return ((Button) this.instance).getAction();
            }

            public int getActionValue() {
                return ((Button) this.instance).getActionValue();
            }

            public String getTitle() {
                return ((Button) this.instance).getTitle();
            }

            public ByteString getTitleBytes() {
                return ((Button) this.instance).getTitleBytes();
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((Button) this.instance).setAction(action);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((Button) this.instance).setActionValue(i);
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

            private Builder() {
                super(Button.DEFAULT_INSTANCE);
            }
        }

        static {
            Button button = new Button();
            DEFAULT_INSTANCE = button;
            GeneratedMessageLite.registerDefaultInstance(Button.class, button);
        }

        private Button() {
        }

        public void clearAction() {
            this.action_ = 0;
        }

        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static Button getDefaultInstance() {
            return DEFAULT_INSTANCE;
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

        public void setAction(Action action) {
            this.action_ = action.getNumber();
        }

        public void setActionValue(int i) {
            this.action_ = i;
        }

        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        public void setTitleBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.title_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C79961.f17760xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Button();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f", new Object[]{"title_", "action_"});
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

        public Action getAction() {
            Action forNumber = Action.forNumber(this.action_);
            return forNumber == null ? Action.UNRECOGNIZED : forNumber;
        }

        public int getActionValue() {
            return this.action_;
        }

        public String getTitle() {
            return this.title_;
        }

        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
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

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Text extends GeneratedMessageLite<Text, Text.Builder> implements TextOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 3;
        private static final Text DEFAULT_INSTANCE;
        private static volatile Parser<Text> PARSER = null;
        public static final int RAW_FIELD_NUMBER = 1;
        public static final int STYLE_FIELD_NUMBER = 2;
        private int action_;
        private String raw_ = "";
        private TextStyle style_;

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Text, Builder> implements TextOrBuilder {
            /* synthetic */ Builder(C79961 c79961) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((Text) this.instance).clearAction();
                return this;
            }

            public Builder clearRaw() {
                copyOnWrite();
                ((Text) this.instance).clearRaw();
                return this;
            }

            public Builder clearStyle() {
                copyOnWrite();
                ((Text) this.instance).clearStyle();
                return this;
            }

            @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
            public Action getAction() {
                return ((Text) this.instance).getAction();
            }

            @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
            public int getActionValue() {
                return ((Text) this.instance).getActionValue();
            }

            @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
            public String getRaw() {
                return ((Text) this.instance).getRaw();
            }

            @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
            public ByteString getRawBytes() {
                return ((Text) this.instance).getRawBytes();
            }

            @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
            public TextStyle getStyle() {
                return ((Text) this.instance).getStyle();
            }

            @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
            public boolean hasStyle() {
                return ((Text) this.instance).hasStyle();
            }

            public Builder mergeStyle(TextStyle textStyle) {
                copyOnWrite();
                ((Text) this.instance).mergeStyle(textStyle);
                return this;
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((Text) this.instance).setAction(action);
                return this;
            }

            public Builder setActionValue(int i) {
                copyOnWrite();
                ((Text) this.instance).setActionValue(i);
                return this;
            }

            public Builder setRaw(String str) {
                copyOnWrite();
                ((Text) this.instance).setRaw(str);
                return this;
            }

            public Builder setRawBytes(ByteString byteString) {
                copyOnWrite();
                ((Text) this.instance).setRawBytes(byteString);
                return this;
            }

            public Builder setStyle(TextStyle textStyle) {
                copyOnWrite();
                ((Text) this.instance).setStyle(textStyle);
                return this;
            }

            private Builder() {
                super(Text.DEFAULT_INSTANCE);
            }

            public Builder setStyle(TextStyle.Builder builder) {
                copyOnWrite();
                ((Text) this.instance).setStyle(builder.build());
                return this;
            }
        }

        static {
            Text text = new Text();
            DEFAULT_INSTANCE = text;
            GeneratedMessageLite.registerDefaultInstance(Text.class, text);
        }

        public Text() {
        }

        public void clearAction() {
            this.action_ = 0;
        }

        public void clearRaw() {
            this.raw_ = getDefaultInstance().getRaw();
        }

        public void clearStyle() {
            this.style_ = null;
        }

        public static Text getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public void mergeStyle(TextStyle textStyle) {
            textStyle.getClass();
            TextStyle textStyle2 = this.style_;
            if (textStyle2 != null && textStyle2 != TextStyle.getDefaultInstance()) {
                this.style_ = TextStyle.newBuilder(this.style_).mergeFrom((TextStyle) textStyle).buildPartial();
            } else {
                this.style_ = textStyle;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Text parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Text) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Text parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Text> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setAction(Action action) {
            this.action_ = action.getNumber();
        }

        public void setActionValue(int i) {
            this.action_ = i;
        }

        public void setRaw(String str) {
            str.getClass();
            this.raw_ = str;
        }

        public void setRawBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.raw_ = byteString.toStringUtf8();
        }

        public void setStyle(TextStyle textStyle) {
            textStyle.getClass();
            this.style_ = textStyle;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C79961.f17760xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Text();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\f", new Object[]{"raw_", "style_", "action_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Text> parser = PARSER;
                    if (parser == null) {
                        synchronized (Text.class) {
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

        @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
        public Action getAction() {
            Action forNumber = Action.forNumber(this.action_);
            return forNumber == null ? Action.UNRECOGNIZED : forNumber;
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
        public int getActionValue() {
            return this.action_;
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
        public String getRaw() {
            return this.raw_;
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
        public ByteString getRawBytes() {
            return ByteString.copyFromUtf8(this.raw_);
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
        public TextStyle getStyle() {
            TextStyle textStyle = this.style_;
            return textStyle == null ? TextStyle.getDefaultInstance() : textStyle;
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.EmptyPage.TextOrBuilder
        public boolean hasStyle() {
            return this.style_ != null;
        }

        public static Builder newBuilder(Text text) {
            return DEFAULT_INSTANCE.createBuilder(text);
        }

        public static Text parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Text) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Text parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Text parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Text parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Text parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Text parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Text parseFrom(InputStream inputStream) throws IOException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Text parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Text parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Text parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Text) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public interface TextOrBuilder extends MessageLiteOrBuilder {
        Action getAction();

        int getActionValue();

        String getRaw();

        ByteString getRawBytes();

        TextStyle getStyle();

        boolean hasStyle();
    }

    static {
        EmptyPage emptyPage = new EmptyPage();
        DEFAULT_INSTANCE = emptyPage;
        GeneratedMessageLite.registerDefaultInstance(EmptyPage.class, emptyPage);
    }

    private EmptyPage() {
    }

    public void addAllTexts(Iterable<? extends Text> iterable) {
        ensureTextsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.texts_);
    }

    public void addTexts(Text text) {
        text.getClass();
        ensureTextsIsMutable();
        this.texts_.add(text);
    }

    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    public void clearLeftButton() {
        this.leftButton_ = null;
    }

    public void clearRightButton() {
        this.rightButton_ = null;
    }

    public void clearTexts() {
        this.texts_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTextsIsMutable() {
        Internal.ProtobufList<Text> protobufList = this.texts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.texts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static EmptyPage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeLeftButton(Button button) {
        button.getClass();
        Button button2 = this.leftButton_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.leftButton_ = Button.newBuilder(this.leftButton_).mergeFrom((Button) button).buildPartial();
        } else {
            this.leftButton_ = button;
        }
    }

    public void mergeRightButton(Button button) {
        button.getClass();
        Button button2 = this.rightButton_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.rightButton_ = Button.newBuilder(this.rightButton_).mergeFrom((Button) button).buildPartial();
        } else {
            this.rightButton_ = button;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EmptyPage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EmptyPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmptyPage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EmptyPage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeTexts(int i) {
        ensureTextsIsMutable();
        this.texts_.remove(i);
    }

    public void setImageUrl(String str) {
        str.getClass();
        this.imageUrl_ = str;
    }

    public void setImageUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageUrl_ = byteString.toStringUtf8();
    }

    public void setLeftButton(Button button) {
        button.getClass();
        this.leftButton_ = button;
    }

    public void setRightButton(Button button) {
        button.getClass();
        this.rightButton_ = button;
    }

    public void setTexts(int i, Text text) {
        text.getClass();
        ensureTextsIsMutable();
        this.texts_.set(i, text);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79961.f17760xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EmptyPage();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\t\u0004\t", new Object[]{"imageUrl_", "texts_", Text.class, "leftButton_", "rightButton_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EmptyPage> parser = PARSER;
                if (parser == null) {
                    synchronized (EmptyPage.class) {
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

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public ByteString getImageUrlBytes() {
        return ByteString.copyFromUtf8(this.imageUrl_);
    }

    public Button getLeftButton() {
        Button button = this.leftButton_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public Button getRightButton() {
        Button button = this.rightButton_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    public Text getTexts(int i) {
        return this.texts_.get(i);
    }

    public int getTextsCount() {
        return this.texts_.size();
    }

    public List<Text> getTextsList() {
        return this.texts_;
    }

    public TextOrBuilder getTextsOrBuilder(int i) {
        return this.texts_.get(i);
    }

    public List<? extends TextOrBuilder> getTextsOrBuilderList() {
        return this.texts_;
    }

    public boolean hasLeftButton() {
        return this.leftButton_ != null;
    }

    public boolean hasRightButton() {
        return this.rightButton_ != null;
    }

    public static Builder newBuilder(EmptyPage emptyPage) {
        return DEFAULT_INSTANCE.createBuilder(emptyPage);
    }

    public static EmptyPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmptyPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmptyPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EmptyPage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addTexts(int i, Text text) {
        text.getClass();
        ensureTextsIsMutable();
        this.texts_.add(i, text);
    }

    public static EmptyPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EmptyPage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmptyPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EmptyPage parseFrom(InputStream inputStream) throws IOException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmptyPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmptyPage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EmptyPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmptyPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * clearLeftButton
     */
    static void access$3100(EmptyPage emptyPage) {
    }

    /**
     * clearRightButton
     */
    static void access$3400(EmptyPage emptyPage) {
    }

    /**
     * clearTexts
     */
    static void access$2700(EmptyPage emptyPage) {
    }

    /**
     * addTexts
     */
    static void access$2400(EmptyPage emptyPage, Text text) {
    }
}
