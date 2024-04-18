package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class ReplyControl extends GeneratedMessageLite<ReplyControl, ReplyControl.C14815b> implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int BIZ_SCENE_FIELD_NUMBER = 24;
    public static final int BLOCKED_FIELD_NUMBER = 9;
    public static final int CARD_LABELS_FIELD_NUMBER = 19;
    public static final int CHARGED_DESC_FIELD_NUMBER = 31;
    public static final int CM_RECOMMEND_COMPONENT_FIELD_NUMBER = 29;
    public static final int CONTEXT_FEATURE_FIELD_NUMBER = 35;
    public static final int CONTRACT_DESC_FIELD_NUMBER = 22;
    private static final ReplyControl DEFAULT_INSTANCE;
    public static final int EASTER_EGG_LABEL_FIELD_NUMBER = 34;
    public static final int FOLD_PICTURES_FIELD_NUMBER = 26;
    public static final int FOLLOWED_FIELD_NUMBER = 8;
    public static final int FOLLOWING_FIELD_NUMBER = 7;
    public static final int GRADE_RECORD_FIELD_NUMBER = 32;
    public static final int HAS_FOLDED_REPLY_FIELD_NUMBER = 10;
    public static final int HIDE_NOTE_ICON_FIELD_NUMBER = 28;
    public static final int INVISIBLE_FIELD_NUMBER = 16;
    public static final int IS_ADMIN_TOP_FIELD_NUMBER = 13;
    public static final int IS_ASSIST_FIELD_NUMBER = 5;
    public static final int IS_CONTRACTOR_FIELD_NUMBER = 17;
    public static final int IS_FOLDED_REPLY_FIELD_NUMBER = 11;
    public static final int IS_NOTE_FIELD_NUMBER = 18;
    public static final int IS_NOTE_V2_FIELD_NUMBER = 27;
    public static final int IS_UP_TOP_FIELD_NUMBER = 12;
    public static final int IS_VOTE_TOP_FIELD_NUMBER = 14;
    public static final int LABEL_TEXT_FIELD_NUMBER = 6;
    public static final int LOCATION_FIELD_NUMBER = 25;
    public static final int MAX_LINE_FIELD_NUMBER = 15;
    private static volatile Parser<ReplyControl> PARSER = null;
    public static final int PRESET_REPLY_TEXT_FIELD_NUMBER = 33;
    public static final int SHOW_FOLLOW_BTN_FIELD_NUMBER = 4;
    public static final int SUB_REPLY_ENTRY_TEXT_FIELD_NUMBER = 20;
    public static final int SUB_REPLY_TITLE_TEXT_FIELD_NUMBER = 21;
    public static final int TIME_DESC_FIELD_NUMBER = 23;
    public static final int UP_LIKE_FIELD_NUMBER = 2;
    public static final int UP_REPLY_FIELD_NUMBER = 3;
    public static final int VOTE_OPTION_FIELD_NUMBER = 30;
    private long action_;
    private boolean blocked_;
    private EasterEggLabel easterEggLabel_;
    private boolean foldPictures_;
    private boolean followed_;
    private boolean following_;
    private GradeRecord gradeRecord_;
    private boolean hasFoldedReply_;
    private boolean hideNoteIcon_;
    private boolean invisible_;
    private boolean isAdminTop_;
    private boolean isAssist_;
    private boolean isContractor_;
    private boolean isFoldedReply_;
    private boolean isNoteV2_;
    private boolean isNote_;
    private boolean isUpTop_;
    private boolean isVoteTop_;
    private long maxLine_;
    private boolean showFollowBtn_;
    private boolean upLike_;
    private boolean upReply_;
    private VoteOption voteOption_;
    private String labelText_ = "";
    private Internal.ProtobufList<ReplyCardLabel> cardLabels_ = GeneratedMessageLite.emptyProtobufList();
    private String subReplyEntryText_ = "";
    private String subReplyTitleText_ = "";
    private String contractDesc_ = "";
    private String timeDesc_ = "";
    private String bizScene_ = "";
    private String location_ = "";
    private String cmRecommendComponent_ = "";
    private String chargedDesc_ = "";
    private String presetReplyText_ = "";
    private String contextFeature_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class EasterEggLabel extends GeneratedMessageLite<EasterEggLabel, EasterEggLabel.C14807a> implements MessageLiteOrBuilder {
        private static final EasterEggLabel DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 1;
        public static final int JUMP_URL_FIELD_NUMBER = 2;
        private static volatile Parser<EasterEggLabel> PARSER;
        private String image_ = "";
        private String jumpUrl_ = "";

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$EasterEggLabel$a */
        /* loaded from: classes21.dex */
        public static final class C14807a extends GeneratedMessageLite.Builder<EasterEggLabel, C14807a> implements MessageLiteOrBuilder {
            /* synthetic */ C14807a(C14814a c14814a) {
                this();
            }

            public C14807a clearImage() {
                copyOnWrite();
                ((EasterEggLabel) this.instance).clearImage();
                return this;
            }

            public C14807a clearJumpUrl() {
                copyOnWrite();
                ((EasterEggLabel) this.instance).clearJumpUrl();
                return this;
            }

            public String getImage() {
                return ((EasterEggLabel) this.instance).getImage();
            }

            public ByteString getImageBytes() {
                return ((EasterEggLabel) this.instance).getImageBytes();
            }

            public String getJumpUrl() {
                return ((EasterEggLabel) this.instance).getJumpUrl();
            }

            public ByteString getJumpUrlBytes() {
                return ((EasterEggLabel) this.instance).getJumpUrlBytes();
            }

            public C14807a setImage(String str) {
                copyOnWrite();
                ((EasterEggLabel) this.instance).setImage(str);
                return this;
            }

            public C14807a setImageBytes(ByteString byteString) {
                copyOnWrite();
                ((EasterEggLabel) this.instance).setImageBytes(byteString);
                return this;
            }

            public C14807a setJumpUrl(String str) {
                copyOnWrite();
                ((EasterEggLabel) this.instance).setJumpUrl(str);
                return this;
            }

            public C14807a setJumpUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((EasterEggLabel) this.instance).setJumpUrlBytes(byteString);
                return this;
            }

            private C14807a() {
                super(EasterEggLabel.DEFAULT_INSTANCE);
            }
        }

        static {
            EasterEggLabel easterEggLabel = new EasterEggLabel();
            DEFAULT_INSTANCE = easterEggLabel;
            GeneratedMessageLite.registerDefaultInstance(EasterEggLabel.class, easterEggLabel);
        }

        private EasterEggLabel() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImage() {
            this.image_ = getDefaultInstance().getImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpUrl() {
            this.jumpUrl_ = getDefaultInstance().getJumpUrl();
        }

        public static EasterEggLabel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14807a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EasterEggLabel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EasterEggLabel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EasterEggLabel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EasterEggLabel> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImage(String str) {
            str.getClass();
            this.image_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.image_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpUrl(String str) {
            str.getClass();
            this.jumpUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.jumpUrl_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14814a.f22019xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new EasterEggLabel();
                case 2:
                    return new C14807a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"image_", "jumpUrl_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EasterEggLabel> parser = PARSER;
                    if (parser == null) {
                        synchronized (EasterEggLabel.class) {
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

        public String getImage() {
            return this.image_;
        }

        public ByteString getImageBytes() {
            return ByteString.copyFromUtf8(this.image_);
        }

        public String getJumpUrl() {
            return this.jumpUrl_;
        }

        public ByteString getJumpUrlBytes() {
            return ByteString.copyFromUtf8(this.jumpUrl_);
        }

        public static C14807a newBuilder(EasterEggLabel easterEggLabel) {
            return DEFAULT_INSTANCE.createBuilder(easterEggLabel);
        }

        public static EasterEggLabel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EasterEggLabel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EasterEggLabel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EasterEggLabel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EasterEggLabel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EasterEggLabel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EasterEggLabel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EasterEggLabel parseFrom(InputStream inputStream) throws IOException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EasterEggLabel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EasterEggLabel parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EasterEggLabel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EasterEggLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class GradeRecord extends GeneratedMessageLite<GradeRecord, GradeRecord.C14809a> implements MessageLiteOrBuilder {
        private static final GradeRecord DEFAULT_INSTANCE;
        private static volatile Parser<GradeRecord> PARSER = null;
        public static final int SCORE_FIELD_NUMBER = 1;
        public static final int TEXTS_FIELD_NUMBER = 2;
        private int score_;
        private Internal.ProtobufList<Text> texts_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public static final class Text extends GeneratedMessageLite<Text, Text.C14808a> implements InterfaceC14810b {
            private static final Text DEFAULT_INSTANCE;
            private static volatile Parser<Text> PARSER = null;
            public static final int RAW_FIELD_NUMBER = 1;
            public static final int STYLE_FIELD_NUMBER = 2;
            private String raw_ = "";
            private TextStyle style_;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$GradeRecord$Text$a */
            /* loaded from: classes21.dex */
            public static final class C14808a extends GeneratedMessageLite.Builder<Text, C14808a> implements InterfaceC14810b {
                /* synthetic */ C14808a(C14814a c14814a) {
                    this();
                }

                public C14808a clearRaw() {
                    copyOnWrite();
                    ((Text) this.instance).clearRaw();
                    return this;
                }

                public C14808a clearStyle() {
                    copyOnWrite();
                    ((Text) this.instance).clearStyle();
                    return this;
                }

                @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
                public String getRaw() {
                    return ((Text) this.instance).getRaw();
                }

                @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
                public ByteString getRawBytes() {
                    return ((Text) this.instance).getRawBytes();
                }

                @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
                public TextStyle getStyle() {
                    return ((Text) this.instance).getStyle();
                }

                @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
                public boolean hasStyle() {
                    return ((Text) this.instance).hasStyle();
                }

                public C14808a setRaw(String str) {
                    copyOnWrite();
                    ((Text) this.instance).setRaw(str);
                    return this;
                }

                public C14808a setRawBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Text) this.instance).setRawBytes(byteString);
                    return this;
                }

                public C14808a setStyle(TextStyle textStyle) {
                    copyOnWrite();
                    ((Text) this.instance).setStyle(textStyle);
                    return this;
                }

                private C14808a() {
                    super(Text.DEFAULT_INSTANCE);
                }
            }

            static {
                Text text = new Text();
                DEFAULT_INSTANCE = text;
                GeneratedMessageLite.registerDefaultInstance(Text.class, text);
            }

            private Text() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRaw() {
                this.raw_ = getDefaultInstance().getRaw();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStyle() {
                this.style_ = null;
            }

            public static Text getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C14808a newBuilder() {
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

            /* JADX INFO: Access modifiers changed from: private */
            public void setRaw(String str) {
                str.getClass();
                this.raw_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRawBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.raw_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStyle(TextStyle textStyle) {
                textStyle.getClass();
                this.style_ = textStyle;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C14814a.f22019xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Text();
                    case 2:
                        return new C14808a(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[]{"raw_", "style_"});
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

            @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
            public String getRaw() {
                return this.raw_;
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
            public ByteString getRawBytes() {
                return ByteString.copyFromUtf8(this.raw_);
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
            public TextStyle getStyle() {
                return this.style_;
            }

            @Override // com.bapis.bilibili.main.community.reply.v1.ReplyControl.GradeRecord.InterfaceC14810b
            public boolean hasStyle() {
                return this.style_ != null;
            }

            public static C14808a newBuilder(Text text) {
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
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$GradeRecord$a */
        /* loaded from: classes21.dex */
        public static final class C14809a extends GeneratedMessageLite.Builder<GradeRecord, C14809a> implements MessageLiteOrBuilder {
            /* synthetic */ C14809a(C14814a c14814a) {
                this();
            }

            public C14809a addAllTexts(Iterable<? extends Text> iterable) {
                copyOnWrite();
                ((GradeRecord) this.instance).addAllTexts(iterable);
                return this;
            }

            public C14809a addTexts(Text text) {
                copyOnWrite();
                ((GradeRecord) this.instance).addTexts(text);
                return this;
            }

            public C14809a clearScore() {
                copyOnWrite();
                ((GradeRecord) this.instance).clearScore();
                return this;
            }

            public C14809a clearTexts() {
                copyOnWrite();
                ((GradeRecord) this.instance).clearTexts();
                return this;
            }

            public int getScore() {
                return ((GradeRecord) this.instance).getScore();
            }

            public Text getTexts(int i) {
                return ((GradeRecord) this.instance).getTexts(i);
            }

            public int getTextsCount() {
                return ((GradeRecord) this.instance).getTextsCount();
            }

            public List<Text> getTextsList() {
                return Collections.unmodifiableList(((GradeRecord) this.instance).getTextsList());
            }

            public C14809a removeTexts(int i) {
                copyOnWrite();
                ((GradeRecord) this.instance).removeTexts(i);
                return this;
            }

            public C14809a setScore(int i) {
                copyOnWrite();
                ((GradeRecord) this.instance).setScore(i);
                return this;
            }

            public C14809a setTexts(int i, Text text) {
                copyOnWrite();
                ((GradeRecord) this.instance).setTexts(i, text);
                return this;
            }

            private C14809a() {
                super(GradeRecord.DEFAULT_INSTANCE);
            }

            public C14809a addTexts(int i, Text text) {
                copyOnWrite();
                ((GradeRecord) this.instance).addTexts(i, text);
                return this;
            }

            public C14809a setTexts(int i, Text.C14808a c14808a) {
                copyOnWrite();
                ((GradeRecord) this.instance).setTexts(i, c14808a.build());
                return this;
            }

            public C14809a addTexts(Text.C14808a c14808a) {
                copyOnWrite();
                ((GradeRecord) this.instance).addTexts(c14808a.build());
                return this;
            }

            public C14809a addTexts(int i, Text.C14808a c14808a) {
                copyOnWrite();
                ((GradeRecord) this.instance).addTexts(i, c14808a.build());
                return this;
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$GradeRecord$b */
        /* loaded from: classes21.dex */
        public interface InterfaceC14810b extends MessageLiteOrBuilder {
            String getRaw();

            ByteString getRawBytes();

            TextStyle getStyle();

            boolean hasStyle();
        }

        static {
            GradeRecord gradeRecord = new GradeRecord();
            DEFAULT_INSTANCE = gradeRecord;
            GeneratedMessageLite.registerDefaultInstance(GradeRecord.class, gradeRecord);
        }

        private GradeRecord() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTexts(Iterable<? extends Text> iterable) {
            ensureTextsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.texts_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTexts(Text text) {
            text.getClass();
            ensureTextsIsMutable();
            this.texts_.add(text);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScore() {
            this.score_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
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

        public static GradeRecord getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14809a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GradeRecord parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GradeRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GradeRecord parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GradeRecord> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTexts(int i) {
            ensureTextsIsMutable();
            this.texts_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScore(int i) {
            this.score_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTexts(int i, Text text) {
            text.getClass();
            ensureTextsIsMutable();
            this.texts_.set(i, text);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14814a.f22019xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new GradeRecord();
                case 2:
                    return new C14809a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"score_", "texts_", Text.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GradeRecord> parser = PARSER;
                    if (parser == null) {
                        synchronized (GradeRecord.class) {
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

        public int getScore() {
            return this.score_;
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

        public InterfaceC14810b getTextsOrBuilder(int i) {
            return this.texts_.get(i);
        }

        public List<? extends InterfaceC14810b> getTextsOrBuilderList() {
            return this.texts_;
        }

        public static C14809a newBuilder(GradeRecord gradeRecord) {
            return DEFAULT_INSTANCE.createBuilder(gradeRecord);
        }

        public static GradeRecord parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GradeRecord) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GradeRecord parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GradeRecord parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTexts(int i, Text text) {
            text.getClass();
            ensureTextsIsMutable();
            this.texts_.add(i, text);
        }

        public static GradeRecord parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GradeRecord parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GradeRecord parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GradeRecord parseFrom(InputStream inputStream) throws IOException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GradeRecord parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GradeRecord parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GradeRecord parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GradeRecord) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class VoteOption extends GeneratedMessageLite<VoteOption, VoteOption.C14813a> implements MessageLiteOrBuilder {
        private static final VoteOption DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 2;
        public static final int IDX_FIELD_NUMBER = 3;
        public static final int LABEL_KIND_FIELD_NUMBER = 1;
        private static volatile Parser<VoteOption> PARSER = null;
        public static final int VOTE_ID_FIELD_NUMBER = 4;
        private String desc_ = "";
        private long idx_;
        private int labelKind_;
        private long voteId_;

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public enum LabelKind implements Internal.EnumLite {
            DEFAULT(0),
            RED(1),
            BLUE(2),
            PLAIN(3),
            UNRECOGNIZED(-1);
            
            public static final int BLUE_VALUE = 2;
            public static final int DEFAULT_VALUE = 0;
            public static final int PLAIN_VALUE = 3;
            public static final int RED_VALUE = 1;
            private static final Internal.EnumLiteMap<LabelKind> internalValueMap = new C14811a();
            private final int value;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$VoteOption$LabelKind$a */
            /* loaded from: classes21.dex */
            static class C14811a implements Internal.EnumLiteMap<LabelKind> {
                C14811a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public LabelKind findValueByNumber(int i) {
                    return LabelKind.forNumber(i);
                }
            }

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$VoteOption$LabelKind$b */
            /* loaded from: classes21.dex */
            private static final class C14812b implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new C14812b();

                private C14812b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return LabelKind.forNumber(i) != null;
                }
            }

            LabelKind(int i) {
                this.value = i;
            }

            public static LabelKind forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return PLAIN;
                        }
                        return BLUE;
                    }
                    return RED;
                }
                return DEFAULT;
            }

            public static Internal.EnumLiteMap<LabelKind> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return C14812b.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static LabelKind valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$VoteOption$a */
        /* loaded from: classes21.dex */
        public static final class C14813a extends GeneratedMessageLite.Builder<VoteOption, C14813a> implements MessageLiteOrBuilder {
            /* synthetic */ C14813a(C14814a c14814a) {
                this();
            }

            public C14813a clearDesc() {
                copyOnWrite();
                ((VoteOption) this.instance).clearDesc();
                return this;
            }

            public C14813a clearIdx() {
                copyOnWrite();
                ((VoteOption) this.instance).clearIdx();
                return this;
            }

            public C14813a clearLabelKind() {
                copyOnWrite();
                ((VoteOption) this.instance).clearLabelKind();
                return this;
            }

            public C14813a clearVoteId() {
                copyOnWrite();
                ((VoteOption) this.instance).clearVoteId();
                return this;
            }

            public String getDesc() {
                return ((VoteOption) this.instance).getDesc();
            }

            public ByteString getDescBytes() {
                return ((VoteOption) this.instance).getDescBytes();
            }

            public long getIdx() {
                return ((VoteOption) this.instance).getIdx();
            }

            public LabelKind getLabelKind() {
                return ((VoteOption) this.instance).getLabelKind();
            }

            public int getLabelKindValue() {
                return ((VoteOption) this.instance).getLabelKindValue();
            }

            public long getVoteId() {
                return ((VoteOption) this.instance).getVoteId();
            }

            public C14813a setDesc(String str) {
                copyOnWrite();
                ((VoteOption) this.instance).setDesc(str);
                return this;
            }

            public C14813a setDescBytes(ByteString byteString) {
                copyOnWrite();
                ((VoteOption) this.instance).setDescBytes(byteString);
                return this;
            }

            public C14813a setIdx(long j) {
                copyOnWrite();
                ((VoteOption) this.instance).setIdx(j);
                return this;
            }

            public C14813a setLabelKind(LabelKind labelKind) {
                copyOnWrite();
                ((VoteOption) this.instance).setLabelKind(labelKind);
                return this;
            }

            public C14813a setLabelKindValue(int i) {
                copyOnWrite();
                ((VoteOption) this.instance).setLabelKindValue(i);
                return this;
            }

            public C14813a setVoteId(long j) {
                copyOnWrite();
                ((VoteOption) this.instance).setVoteId(j);
                return this;
            }

            private C14813a() {
                super(VoteOption.DEFAULT_INSTANCE);
            }
        }

        static {
            VoteOption voteOption = new VoteOption();
            DEFAULT_INSTANCE = voteOption;
            GeneratedMessageLite.registerDefaultInstance(VoteOption.class, voteOption);
        }

        private VoteOption() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDesc() {
            this.desc_ = getDefaultInstance().getDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdx() {
            this.idx_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabelKind() {
            this.labelKind_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoteId() {
            this.voteId_ = 0L;
        }

        public static VoteOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14813a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VoteOption parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoteOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoteOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VoteOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDesc(String str) {
            str.getClass();
            this.desc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.desc_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdx(long j) {
            this.idx_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabelKind(LabelKind labelKind) {
            this.labelKind_ = labelKind.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabelKindValue(int i) {
            this.labelKind_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoteId(long j) {
            this.voteId_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14814a.f22019xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoteOption();
                case 2:
                    return new C14813a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0002\u0004\u0002", new Object[]{"labelKind_", "desc_", "idx_", "voteId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VoteOption> parser = PARSER;
                    if (parser == null) {
                        synchronized (VoteOption.class) {
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

        public String getDesc() {
            return this.desc_;
        }

        public ByteString getDescBytes() {
            return ByteString.copyFromUtf8(this.desc_);
        }

        public long getIdx() {
            return this.idx_;
        }

        public LabelKind getLabelKind() {
            LabelKind forNumber = LabelKind.forNumber(this.labelKind_);
            return forNumber == null ? LabelKind.UNRECOGNIZED : forNumber;
        }

        public int getLabelKindValue() {
            return this.labelKind_;
        }

        public long getVoteId() {
            return this.voteId_;
        }

        public static C14813a newBuilder(VoteOption voteOption) {
            return DEFAULT_INSTANCE.createBuilder(voteOption);
        }

        public static VoteOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoteOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoteOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VoteOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VoteOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VoteOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoteOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VoteOption parseFrom(InputStream inputStream) throws IOException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoteOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoteOption parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VoteOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoteOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14814a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22019xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22019xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22019xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22019xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22019xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22019xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22019xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22019xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyControl$b */
    /* loaded from: classes21.dex */
    public static final class C14815b extends GeneratedMessageLite.Builder<ReplyControl, C14815b> implements MessageLiteOrBuilder {
        /* synthetic */ C14815b(C14814a c14814a) {
            this();
        }

        public C14815b addAllCardLabels(Iterable<? extends ReplyCardLabel> iterable) {
            copyOnWrite();
            ((ReplyControl) this.instance).addAllCardLabels(iterable);
            return this;
        }

        public C14815b addCardLabels(ReplyCardLabel replyCardLabel) {
            copyOnWrite();
            ((ReplyControl) this.instance).addCardLabels(replyCardLabel);
            return this;
        }

        public C14815b clearAction() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearAction();
            return this;
        }

        public C14815b clearBizScene() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearBizScene();
            return this;
        }

        public C14815b clearBlocked() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearBlocked();
            return this;
        }

        public C14815b clearCardLabels() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearCardLabels();
            return this;
        }

        public C14815b clearChargedDesc() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearChargedDesc();
            return this;
        }

        public C14815b clearCmRecommendComponent() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearCmRecommendComponent();
            return this;
        }

        public C14815b clearContextFeature() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearContextFeature();
            return this;
        }

        public C14815b clearContractDesc() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearContractDesc();
            return this;
        }

        public C14815b clearEasterEggLabel() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearEasterEggLabel();
            return this;
        }

        public C14815b clearFoldPictures() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearFoldPictures();
            return this;
        }

        public C14815b clearFollowed() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearFollowed();
            return this;
        }

        public C14815b clearFollowing() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearFollowing();
            return this;
        }

        public C14815b clearGradeRecord() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearGradeRecord();
            return this;
        }

        public C14815b clearHasFoldedReply() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearHasFoldedReply();
            return this;
        }

        public C14815b clearHideNoteIcon() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearHideNoteIcon();
            return this;
        }

        public C14815b clearInvisible() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearInvisible();
            return this;
        }

        public C14815b clearIsAdminTop() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsAdminTop();
            return this;
        }

        public C14815b clearIsAssist() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsAssist();
            return this;
        }

        public C14815b clearIsContractor() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsContractor();
            return this;
        }

        public C14815b clearIsFoldedReply() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsFoldedReply();
            return this;
        }

        public C14815b clearIsNote() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsNote();
            return this;
        }

        public C14815b clearIsNoteV2() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsNoteV2();
            return this;
        }

        public C14815b clearIsUpTop() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsUpTop();
            return this;
        }

        public C14815b clearIsVoteTop() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearIsVoteTop();
            return this;
        }

        public C14815b clearLabelText() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearLabelText();
            return this;
        }

        public C14815b clearLocation() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearLocation();
            return this;
        }

        public C14815b clearMaxLine() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearMaxLine();
            return this;
        }

        public C14815b clearPresetReplyText() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearPresetReplyText();
            return this;
        }

        public C14815b clearShowFollowBtn() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearShowFollowBtn();
            return this;
        }

        public C14815b clearSubReplyEntryText() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearSubReplyEntryText();
            return this;
        }

        public C14815b clearSubReplyTitleText() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearSubReplyTitleText();
            return this;
        }

        public C14815b clearTimeDesc() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearTimeDesc();
            return this;
        }

        public C14815b clearUpLike() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearUpLike();
            return this;
        }

        public C14815b clearUpReply() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearUpReply();
            return this;
        }

        public C14815b clearVoteOption() {
            copyOnWrite();
            ((ReplyControl) this.instance).clearVoteOption();
            return this;
        }

        public long getAction() {
            return ((ReplyControl) this.instance).getAction();
        }

        public String getBizScene() {
            return ((ReplyControl) this.instance).getBizScene();
        }

        public ByteString getBizSceneBytes() {
            return ((ReplyControl) this.instance).getBizSceneBytes();
        }

        public boolean getBlocked() {
            return ((ReplyControl) this.instance).getBlocked();
        }

        public ReplyCardLabel getCardLabels(int i) {
            return ((ReplyControl) this.instance).getCardLabels(i);
        }

        public int getCardLabelsCount() {
            return ((ReplyControl) this.instance).getCardLabelsCount();
        }

        public List<ReplyCardLabel> getCardLabelsList() {
            return Collections.unmodifiableList(((ReplyControl) this.instance).getCardLabelsList());
        }

        public String getChargedDesc() {
            return ((ReplyControl) this.instance).getChargedDesc();
        }

        public ByteString getChargedDescBytes() {
            return ((ReplyControl) this.instance).getChargedDescBytes();
        }

        public String getCmRecommendComponent() {
            return ((ReplyControl) this.instance).getCmRecommendComponent();
        }

        public ByteString getCmRecommendComponentBytes() {
            return ((ReplyControl) this.instance).getCmRecommendComponentBytes();
        }

        public String getContextFeature() {
            return ((ReplyControl) this.instance).getContextFeature();
        }

        public ByteString getContextFeatureBytes() {
            return ((ReplyControl) this.instance).getContextFeatureBytes();
        }

        public String getContractDesc() {
            return ((ReplyControl) this.instance).getContractDesc();
        }

        public ByteString getContractDescBytes() {
            return ((ReplyControl) this.instance).getContractDescBytes();
        }

        public EasterEggLabel getEasterEggLabel() {
            return ((ReplyControl) this.instance).getEasterEggLabel();
        }

        public boolean getFoldPictures() {
            return ((ReplyControl) this.instance).getFoldPictures();
        }

        public boolean getFollowed() {
            return ((ReplyControl) this.instance).getFollowed();
        }

        public boolean getFollowing() {
            return ((ReplyControl) this.instance).getFollowing();
        }

        public GradeRecord getGradeRecord() {
            return ((ReplyControl) this.instance).getGradeRecord();
        }

        public boolean getHasFoldedReply() {
            return ((ReplyControl) this.instance).getHasFoldedReply();
        }

        public boolean getHideNoteIcon() {
            return ((ReplyControl) this.instance).getHideNoteIcon();
        }

        public boolean getInvisible() {
            return ((ReplyControl) this.instance).getInvisible();
        }

        public boolean getIsAdminTop() {
            return ((ReplyControl) this.instance).getIsAdminTop();
        }

        public boolean getIsAssist() {
            return ((ReplyControl) this.instance).getIsAssist();
        }

        public boolean getIsContractor() {
            return ((ReplyControl) this.instance).getIsContractor();
        }

        public boolean getIsFoldedReply() {
            return ((ReplyControl) this.instance).getIsFoldedReply();
        }

        public boolean getIsNote() {
            return ((ReplyControl) this.instance).getIsNote();
        }

        public boolean getIsNoteV2() {
            return ((ReplyControl) this.instance).getIsNoteV2();
        }

        public boolean getIsUpTop() {
            return ((ReplyControl) this.instance).getIsUpTop();
        }

        public boolean getIsVoteTop() {
            return ((ReplyControl) this.instance).getIsVoteTop();
        }

        public String getLabelText() {
            return ((ReplyControl) this.instance).getLabelText();
        }

        public ByteString getLabelTextBytes() {
            return ((ReplyControl) this.instance).getLabelTextBytes();
        }

        public String getLocation() {
            return ((ReplyControl) this.instance).getLocation();
        }

        public ByteString getLocationBytes() {
            return ((ReplyControl) this.instance).getLocationBytes();
        }

        public long getMaxLine() {
            return ((ReplyControl) this.instance).getMaxLine();
        }

        public String getPresetReplyText() {
            return ((ReplyControl) this.instance).getPresetReplyText();
        }

        public ByteString getPresetReplyTextBytes() {
            return ((ReplyControl) this.instance).getPresetReplyTextBytes();
        }

        public boolean getShowFollowBtn() {
            return ((ReplyControl) this.instance).getShowFollowBtn();
        }

        public String getSubReplyEntryText() {
            return ((ReplyControl) this.instance).getSubReplyEntryText();
        }

        public ByteString getSubReplyEntryTextBytes() {
            return ((ReplyControl) this.instance).getSubReplyEntryTextBytes();
        }

        public String getSubReplyTitleText() {
            return ((ReplyControl) this.instance).getSubReplyTitleText();
        }

        public ByteString getSubReplyTitleTextBytes() {
            return ((ReplyControl) this.instance).getSubReplyTitleTextBytes();
        }

        public String getTimeDesc() {
            return ((ReplyControl) this.instance).getTimeDesc();
        }

        public ByteString getTimeDescBytes() {
            return ((ReplyControl) this.instance).getTimeDescBytes();
        }

        public boolean getUpLike() {
            return ((ReplyControl) this.instance).getUpLike();
        }

        public boolean getUpReply() {
            return ((ReplyControl) this.instance).getUpReply();
        }

        public VoteOption getVoteOption() {
            return ((ReplyControl) this.instance).getVoteOption();
        }

        public boolean hasEasterEggLabel() {
            return ((ReplyControl) this.instance).hasEasterEggLabel();
        }

        public boolean hasGradeRecord() {
            return ((ReplyControl) this.instance).hasGradeRecord();
        }

        public boolean hasVoteOption() {
            return ((ReplyControl) this.instance).hasVoteOption();
        }

        public C14815b mergeEasterEggLabel(EasterEggLabel easterEggLabel) {
            copyOnWrite();
            ((ReplyControl) this.instance).mergeEasterEggLabel(easterEggLabel);
            return this;
        }

        public C14815b mergeGradeRecord(GradeRecord gradeRecord) {
            copyOnWrite();
            ((ReplyControl) this.instance).mergeGradeRecord(gradeRecord);
            return this;
        }

        public C14815b mergeVoteOption(VoteOption voteOption) {
            copyOnWrite();
            ((ReplyControl) this.instance).mergeVoteOption(voteOption);
            return this;
        }

        public C14815b removeCardLabels(int i) {
            copyOnWrite();
            ((ReplyControl) this.instance).removeCardLabels(i);
            return this;
        }

        public C14815b setAction(long j) {
            copyOnWrite();
            ((ReplyControl) this.instance).setAction(j);
            return this;
        }

        public C14815b setBizScene(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setBizScene(str);
            return this;
        }

        public C14815b setBizSceneBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setBizSceneBytes(byteString);
            return this;
        }

        public C14815b setBlocked(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setBlocked(z);
            return this;
        }

        public C14815b setCardLabels(int i, ReplyCardLabel replyCardLabel) {
            copyOnWrite();
            ((ReplyControl) this.instance).setCardLabels(i, replyCardLabel);
            return this;
        }

        public C14815b setChargedDesc(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setChargedDesc(str);
            return this;
        }

        public C14815b setChargedDescBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setChargedDescBytes(byteString);
            return this;
        }

        public C14815b setCmRecommendComponent(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setCmRecommendComponent(str);
            return this;
        }

        public C14815b setCmRecommendComponentBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setCmRecommendComponentBytes(byteString);
            return this;
        }

        public C14815b setContextFeature(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setContextFeature(str);
            return this;
        }

        public C14815b setContextFeatureBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setContextFeatureBytes(byteString);
            return this;
        }

        public C14815b setContractDesc(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setContractDesc(str);
            return this;
        }

        public C14815b setContractDescBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setContractDescBytes(byteString);
            return this;
        }

        public C14815b setEasterEggLabel(EasterEggLabel easterEggLabel) {
            copyOnWrite();
            ((ReplyControl) this.instance).setEasterEggLabel(easterEggLabel);
            return this;
        }

        public C14815b setFoldPictures(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setFoldPictures(z);
            return this;
        }

        public C14815b setFollowed(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setFollowed(z);
            return this;
        }

        public C14815b setFollowing(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setFollowing(z);
            return this;
        }

        public C14815b setGradeRecord(GradeRecord gradeRecord) {
            copyOnWrite();
            ((ReplyControl) this.instance).setGradeRecord(gradeRecord);
            return this;
        }

        public C14815b setHasFoldedReply(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setHasFoldedReply(z);
            return this;
        }

        public C14815b setHideNoteIcon(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setHideNoteIcon(z);
            return this;
        }

        public C14815b setInvisible(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setInvisible(z);
            return this;
        }

        public C14815b setIsAdminTop(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsAdminTop(z);
            return this;
        }

        public C14815b setIsAssist(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsAssist(z);
            return this;
        }

        public C14815b setIsContractor(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsContractor(z);
            return this;
        }

        public C14815b setIsFoldedReply(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsFoldedReply(z);
            return this;
        }

        public C14815b setIsNote(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsNote(z);
            return this;
        }

        public C14815b setIsNoteV2(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsNoteV2(z);
            return this;
        }

        public C14815b setIsUpTop(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsUpTop(z);
            return this;
        }

        public C14815b setIsVoteTop(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setIsVoteTop(z);
            return this;
        }

        public C14815b setLabelText(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setLabelText(str);
            return this;
        }

        public C14815b setLabelTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setLabelTextBytes(byteString);
            return this;
        }

        public C14815b setLocation(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setLocation(str);
            return this;
        }

        public C14815b setLocationBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setLocationBytes(byteString);
            return this;
        }

        public C14815b setMaxLine(long j) {
            copyOnWrite();
            ((ReplyControl) this.instance).setMaxLine(j);
            return this;
        }

        public C14815b setPresetReplyText(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setPresetReplyText(str);
            return this;
        }

        public C14815b setPresetReplyTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setPresetReplyTextBytes(byteString);
            return this;
        }

        public C14815b setShowFollowBtn(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setShowFollowBtn(z);
            return this;
        }

        public C14815b setSubReplyEntryText(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setSubReplyEntryText(str);
            return this;
        }

        public C14815b setSubReplyEntryTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setSubReplyEntryTextBytes(byteString);
            return this;
        }

        public C14815b setSubReplyTitleText(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setSubReplyTitleText(str);
            return this;
        }

        public C14815b setSubReplyTitleTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setSubReplyTitleTextBytes(byteString);
            return this;
        }

        public C14815b setTimeDesc(String str) {
            copyOnWrite();
            ((ReplyControl) this.instance).setTimeDesc(str);
            return this;
        }

        public C14815b setTimeDescBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyControl) this.instance).setTimeDescBytes(byteString);
            return this;
        }

        public C14815b setUpLike(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setUpLike(z);
            return this;
        }

        public C14815b setUpReply(boolean z) {
            copyOnWrite();
            ((ReplyControl) this.instance).setUpReply(z);
            return this;
        }

        public C14815b setVoteOption(VoteOption voteOption) {
            copyOnWrite();
            ((ReplyControl) this.instance).setVoteOption(voteOption);
            return this;
        }

        private C14815b() {
            super(ReplyControl.DEFAULT_INSTANCE);
        }

        public C14815b addCardLabels(int i, ReplyCardLabel replyCardLabel) {
            copyOnWrite();
            ((ReplyControl) this.instance).addCardLabels(i, replyCardLabel);
            return this;
        }

        public C14815b setCardLabels(int i, ReplyCardLabel.C14806b c14806b) {
            copyOnWrite();
            ((ReplyControl) this.instance).setCardLabels(i, c14806b.build());
            return this;
        }

        public C14815b setEasterEggLabel(EasterEggLabel.C14807a c14807a) {
            copyOnWrite();
            ((ReplyControl) this.instance).setEasterEggLabel(c14807a.build());
            return this;
        }

        public C14815b setGradeRecord(GradeRecord.C14809a c14809a) {
            copyOnWrite();
            ((ReplyControl) this.instance).setGradeRecord(c14809a.build());
            return this;
        }

        public C14815b setVoteOption(VoteOption.C14813a c14813a) {
            copyOnWrite();
            ((ReplyControl) this.instance).setVoteOption(c14813a.build());
            return this;
        }

        public C14815b addCardLabels(ReplyCardLabel.C14806b c14806b) {
            copyOnWrite();
            ((ReplyControl) this.instance).addCardLabels(c14806b.build());
            return this;
        }

        public C14815b addCardLabels(int i, ReplyCardLabel.C14806b c14806b) {
            copyOnWrite();
            ((ReplyControl) this.instance).addCardLabels(i, c14806b.build());
            return this;
        }
    }

    static {
        ReplyControl replyControl = new ReplyControl();
        DEFAULT_INSTANCE = replyControl;
        GeneratedMessageLite.registerDefaultInstance(ReplyControl.class, replyControl);
    }

    private ReplyControl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCardLabels(Iterable<? extends ReplyCardLabel> iterable) {
        ensureCardLabelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cardLabels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCardLabels(ReplyCardLabel replyCardLabel) {
        replyCardLabel.getClass();
        ensureCardLabelsIsMutable();
        this.cardLabels_.add(replyCardLabel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBizScene() {
        this.bizScene_ = getDefaultInstance().getBizScene();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlocked() {
        this.blocked_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardLabels() {
        this.cardLabels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChargedDesc() {
        this.chargedDesc_ = getDefaultInstance().getChargedDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmRecommendComponent() {
        this.cmRecommendComponent_ = getDefaultInstance().getCmRecommendComponent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextFeature() {
        this.contextFeature_ = getDefaultInstance().getContextFeature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContractDesc() {
        this.contractDesc_ = getDefaultInstance().getContractDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEasterEggLabel() {
        this.easterEggLabel_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFoldPictures() {
        this.foldPictures_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowed() {
        this.followed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowing() {
        this.following_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGradeRecord() {
        this.gradeRecord_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasFoldedReply() {
        this.hasFoldedReply_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideNoteIcon() {
        this.hideNoteIcon_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInvisible() {
        this.invisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdminTop() {
        this.isAdminTop_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAssist() {
        this.isAssist_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsContractor() {
        this.isContractor_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFoldedReply() {
        this.isFoldedReply_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNote() {
        this.isNote_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNoteV2() {
        this.isNoteV2_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUpTop() {
        this.isUpTop_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVoteTop() {
        this.isVoteTop_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelText() {
        this.labelText_ = getDefaultInstance().getLabelText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxLine() {
        this.maxLine_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPresetReplyText() {
        this.presetReplyText_ = getDefaultInstance().getPresetReplyText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowFollowBtn() {
        this.showFollowBtn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubReplyEntryText() {
        this.subReplyEntryText_ = getDefaultInstance().getSubReplyEntryText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubReplyTitleText() {
        this.subReplyTitleText_ = getDefaultInstance().getSubReplyTitleText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeDesc() {
        this.timeDesc_ = getDefaultInstance().getTimeDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpLike() {
        this.upLike_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpReply() {
        this.upReply_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoteOption() {
        this.voteOption_ = null;
    }

    private void ensureCardLabelsIsMutable() {
        Internal.ProtobufList<ReplyCardLabel> protobufList = this.cardLabels_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cardLabels_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ReplyControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEasterEggLabel(EasterEggLabel easterEggLabel) {
        easterEggLabel.getClass();
        EasterEggLabel easterEggLabel2 = this.easterEggLabel_;
        if (easterEggLabel2 != null && easterEggLabel2 != EasterEggLabel.getDefaultInstance()) {
            this.easterEggLabel_ = EasterEggLabel.newBuilder(this.easterEggLabel_).mergeFrom((EasterEggLabel) easterEggLabel).buildPartial();
        } else {
            this.easterEggLabel_ = easterEggLabel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGradeRecord(GradeRecord gradeRecord) {
        gradeRecord.getClass();
        GradeRecord gradeRecord2 = this.gradeRecord_;
        if (gradeRecord2 != null && gradeRecord2 != GradeRecord.getDefaultInstance()) {
            this.gradeRecord_ = GradeRecord.newBuilder(this.gradeRecord_).mergeFrom((GradeRecord) gradeRecord).buildPartial();
        } else {
            this.gradeRecord_ = gradeRecord;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoteOption(VoteOption voteOption) {
        voteOption.getClass();
        VoteOption voteOption2 = this.voteOption_;
        if (voteOption2 != null && voteOption2 != VoteOption.getDefaultInstance()) {
            this.voteOption_ = VoteOption.newBuilder(this.voteOption_).mergeFrom((VoteOption) voteOption).buildPartial();
        } else {
            this.voteOption_ = voteOption;
        }
    }

    public static C14815b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReplyControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReplyControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReplyControl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCardLabels(int i) {
        ensureCardLabelsIsMutable();
        this.cardLabels_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(long j) {
        this.action_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizScene(String str) {
        str.getClass();
        this.bizScene_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBizSceneBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bizScene_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlocked(boolean z) {
        this.blocked_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardLabels(int i, ReplyCardLabel replyCardLabel) {
        replyCardLabel.getClass();
        ensureCardLabelsIsMutable();
        this.cardLabels_.set(i, replyCardLabel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargedDesc(String str) {
        str.getClass();
        this.chargedDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChargedDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.chargedDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmRecommendComponent(String str) {
        str.getClass();
        this.cmRecommendComponent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmRecommendComponentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cmRecommendComponent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextFeature(String str) {
        str.getClass();
        this.contextFeature_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextFeatureBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextFeature_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContractDesc(String str) {
        str.getClass();
        this.contractDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContractDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contractDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEasterEggLabel(EasterEggLabel easterEggLabel) {
        easterEggLabel.getClass();
        this.easterEggLabel_ = easterEggLabel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFoldPictures(boolean z) {
        this.foldPictures_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowed(boolean z) {
        this.followed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowing(boolean z) {
        this.following_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGradeRecord(GradeRecord gradeRecord) {
        gradeRecord.getClass();
        this.gradeRecord_ = gradeRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasFoldedReply(boolean z) {
        this.hasFoldedReply_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideNoteIcon(boolean z) {
        this.hideNoteIcon_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvisible(boolean z) {
        this.invisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdminTop(boolean z) {
        this.isAdminTop_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAssist(boolean z) {
        this.isAssist_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsContractor(boolean z) {
        this.isContractor_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFoldedReply(boolean z) {
        this.isFoldedReply_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNote(boolean z) {
        this.isNote_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNoteV2(boolean z) {
        this.isNoteV2_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUpTop(boolean z) {
        this.isUpTop_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVoteTop(boolean z) {
        this.isVoteTop_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelText(String str) {
        str.getClass();
        this.labelText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.location_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxLine(long j) {
        this.maxLine_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetReplyText(String str) {
        str.getClass();
        this.presetReplyText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetReplyTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.presetReplyText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowFollowBtn(boolean z) {
        this.showFollowBtn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubReplyEntryText(String str) {
        str.getClass();
        this.subReplyEntryText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubReplyEntryTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subReplyEntryText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubReplyTitleText(String str) {
        str.getClass();
        this.subReplyTitleText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubReplyTitleTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subReplyTitleText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeDesc(String str) {
        str.getClass();
        this.timeDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timeDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLike(boolean z) {
        this.upLike_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpReply(boolean z) {
        this.upReply_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoteOption(VoteOption voteOption) {
        voteOption.getClass();
        this.voteOption_ = voteOption;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14814a.f22019xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReplyControl();
            case 2:
                return new C14815b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000#\u0000\u0000\u0001##\u0000\u0001\u0000\u0001\u0002\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0208\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0002\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u001b\u0014\u0208\u0015\u0208\u0016\u0208\u0017\u0208\u0018\u0208\u0019\u0208\u001a\u0007\u001b\u0007\u001c\u0007\u001d\u0208\u001e\t\u001f\u0208 \t!\u0208\"\t#\u0208", new Object[]{"action_", "upLike_", "upReply_", "showFollowBtn_", "isAssist_", "labelText_", "following_", "followed_", "blocked_", "hasFoldedReply_", "isFoldedReply_", "isUpTop_", "isAdminTop_", "isVoteTop_", "maxLine_", "invisible_", "isContractor_", "isNote_", "cardLabels_", ReplyCardLabel.class, "subReplyEntryText_", "subReplyTitleText_", "contractDesc_", "timeDesc_", "bizScene_", "location_", "foldPictures_", "isNoteV2_", "hideNoteIcon_", "cmRecommendComponent_", "voteOption_", "chargedDesc_", "gradeRecord_", "presetReplyText_", "easterEggLabel_", "contextFeature_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReplyControl> parser = PARSER;
                if (parser == null) {
                    synchronized (ReplyControl.class) {
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

    public long getAction() {
        return this.action_;
    }

    public String getBizScene() {
        return this.bizScene_;
    }

    public ByteString getBizSceneBytes() {
        return ByteString.copyFromUtf8(this.bizScene_);
    }

    public boolean getBlocked() {
        return this.blocked_;
    }

    public ReplyCardLabel getCardLabels(int i) {
        return this.cardLabels_.get(i);
    }

    public int getCardLabelsCount() {
        return this.cardLabels_.size();
    }

    public List<ReplyCardLabel> getCardLabelsList() {
        return this.cardLabels_;
    }

    public InterfaceC14919g getCardLabelsOrBuilder(int i) {
        return this.cardLabels_.get(i);
    }

    public List<? extends InterfaceC14919g> getCardLabelsOrBuilderList() {
        return this.cardLabels_;
    }

    public String getChargedDesc() {
        return this.chargedDesc_;
    }

    public ByteString getChargedDescBytes() {
        return ByteString.copyFromUtf8(this.chargedDesc_);
    }

    public String getCmRecommendComponent() {
        return this.cmRecommendComponent_;
    }

    public ByteString getCmRecommendComponentBytes() {
        return ByteString.copyFromUtf8(this.cmRecommendComponent_);
    }

    public String getContextFeature() {
        return this.contextFeature_;
    }

    public ByteString getContextFeatureBytes() {
        return ByteString.copyFromUtf8(this.contextFeature_);
    }

    public String getContractDesc() {
        return this.contractDesc_;
    }

    public ByteString getContractDescBytes() {
        return ByteString.copyFromUtf8(this.contractDesc_);
    }

    public EasterEggLabel getEasterEggLabel() {
        EasterEggLabel easterEggLabel = this.easterEggLabel_;
        return easterEggLabel == null ? EasterEggLabel.getDefaultInstance() : easterEggLabel;
    }

    public boolean getFoldPictures() {
        return this.foldPictures_;
    }

    public boolean getFollowed() {
        return this.followed_;
    }

    public boolean getFollowing() {
        return this.following_;
    }

    public GradeRecord getGradeRecord() {
        GradeRecord gradeRecord = this.gradeRecord_;
        return gradeRecord == null ? GradeRecord.getDefaultInstance() : gradeRecord;
    }

    public boolean getHasFoldedReply() {
        return this.hasFoldedReply_;
    }

    public boolean getHideNoteIcon() {
        return this.hideNoteIcon_;
    }

    public boolean getInvisible() {
        return this.invisible_;
    }

    public boolean getIsAdminTop() {
        return this.isAdminTop_;
    }

    public boolean getIsAssist() {
        return this.isAssist_;
    }

    public boolean getIsContractor() {
        return this.isContractor_;
    }

    public boolean getIsFoldedReply() {
        return this.isFoldedReply_;
    }

    public boolean getIsNote() {
        return this.isNote_;
    }

    public boolean getIsNoteV2() {
        return this.isNoteV2_;
    }

    public boolean getIsUpTop() {
        return this.isUpTop_;
    }

    public boolean getIsVoteTop() {
        return this.isVoteTop_;
    }

    public String getLabelText() {
        return this.labelText_;
    }

    public ByteString getLabelTextBytes() {
        return ByteString.copyFromUtf8(this.labelText_);
    }

    public String getLocation() {
        return this.location_;
    }

    public ByteString getLocationBytes() {
        return ByteString.copyFromUtf8(this.location_);
    }

    public long getMaxLine() {
        return this.maxLine_;
    }

    public String getPresetReplyText() {
        return this.presetReplyText_;
    }

    public ByteString getPresetReplyTextBytes() {
        return ByteString.copyFromUtf8(this.presetReplyText_);
    }

    public boolean getShowFollowBtn() {
        return this.showFollowBtn_;
    }

    public String getSubReplyEntryText() {
        return this.subReplyEntryText_;
    }

    public ByteString getSubReplyEntryTextBytes() {
        return ByteString.copyFromUtf8(this.subReplyEntryText_);
    }

    public String getSubReplyTitleText() {
        return this.subReplyTitleText_;
    }

    public ByteString getSubReplyTitleTextBytes() {
        return ByteString.copyFromUtf8(this.subReplyTitleText_);
    }

    public String getTimeDesc() {
        return this.timeDesc_;
    }

    public ByteString getTimeDescBytes() {
        return ByteString.copyFromUtf8(this.timeDesc_);
    }

    public boolean getUpLike() {
        return this.upLike_;
    }

    public boolean getUpReply() {
        return this.upReply_;
    }

    public VoteOption getVoteOption() {
        VoteOption voteOption = this.voteOption_;
        return voteOption == null ? VoteOption.getDefaultInstance() : voteOption;
    }

    public boolean hasEasterEggLabel() {
        return this.easterEggLabel_ != null;
    }

    public boolean hasGradeRecord() {
        return this.gradeRecord_ != null;
    }

    public boolean hasVoteOption() {
        return this.voteOption_ != null;
    }

    public static C14815b newBuilder(ReplyControl replyControl) {
        return DEFAULT_INSTANCE.createBuilder(replyControl);
    }

    public static ReplyControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReplyControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCardLabels(int i, ReplyCardLabel replyCardLabel) {
        replyCardLabel.getClass();
        ensureCardLabelsIsMutable();
        this.cardLabels_.add(i, replyCardLabel);
    }

    public static ReplyControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReplyControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReplyControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReplyControl parseFrom(InputStream inputStream) throws IOException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyControl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReplyControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
