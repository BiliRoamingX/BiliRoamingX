package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class ReplyCardLabel extends GeneratedMessageLite<ReplyCardLabel, ReplyCardLabel.C14806b> implements InterfaceC14919g {
    public static final int BACKGROUND_FIELD_NUMBER = 8;
    public static final int BACKGROUND_HEIGHT_FIELD_NUMBER = 10;
    public static final int BACKGROUND_WIDTH_FIELD_NUMBER = 9;
    private static final ReplyCardLabel DEFAULT_INSTANCE;
    public static final int EFFECT_FIELD_NUMBER = 12;
    public static final int EFFECT_START_TIME_FIELD_NUMBER = 13;
    public static final int IMAGE_FIELD_NUMBER = 6;
    public static final int JUMP_URL_FIELD_NUMBER = 11;
    public static final int LABEL_COLOR_DAY_FIELD_NUMBER = 4;
    public static final int LABEL_COLOR_NIGHT_FIELD_NUMBER = 5;
    private static volatile Parser<ReplyCardLabel> PARSER = null;
    public static final int TEXT_COLOR_DAY_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 3;
    public static final int TEXT_CONTENT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 7;
    private double backgroundHeight_;
    private double backgroundWidth_;
    private long effectStartTime_;
    private long effect_;
    private int type_;
    private String textContent_ = "";
    private String textColorDay_ = "";
    private String textColorNight_ = "";
    private String labelColorDay_ = "";
    private String labelColorNight_ = "";
    private String image_ = "";
    private String background_ = "";
    private String jumpUrl_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public enum Type implements Internal.EnumLite {
        UNDERLINE(0),
        BACKGROUND(1),
        UNRECOGNIZED(-1);
        
        public static final int BACKGROUND_VALUE = 1;
        public static final int UNDERLINE_VALUE = 0;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new C14803a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyCardLabel$Type$a */
        /* loaded from: classes21.dex */
        static class C14803a implements Internal.EnumLiteMap<Type> {
            C14803a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyCardLabel$Type$b */
        /* loaded from: classes21.dex */
        private static final class C14804b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C14804b();

            private C14804b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Type.forNumber(i) != null;
            }
        }

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return BACKGROUND;
            }
            return UNDERLINE;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C14804b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyCardLabel$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14805a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22018xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22018xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22018xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22018xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22018xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22018xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22018xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22018xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.ReplyCardLabel$b */
    /* loaded from: classes21.dex */
    public static final class C14806b extends GeneratedMessageLite.Builder<ReplyCardLabel, C14806b> implements InterfaceC14919g {
        /* synthetic */ C14806b(C14805a c14805a) {
            this();
        }

        public C14806b clearBackground() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearBackground();
            return this;
        }

        public C14806b clearBackgroundHeight() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearBackgroundHeight();
            return this;
        }

        public C14806b clearBackgroundWidth() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearBackgroundWidth();
            return this;
        }

        public C14806b clearEffect() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearEffect();
            return this;
        }

        public C14806b clearEffectStartTime() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearEffectStartTime();
            return this;
        }

        public C14806b clearImage() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearImage();
            return this;
        }

        public C14806b clearJumpUrl() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearJumpUrl();
            return this;
        }

        public C14806b clearLabelColorDay() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearLabelColorDay();
            return this;
        }

        public C14806b clearLabelColorNight() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearLabelColorNight();
            return this;
        }

        public C14806b clearTextColorDay() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearTextColorDay();
            return this;
        }

        public C14806b clearTextColorNight() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearTextColorNight();
            return this;
        }

        public C14806b clearTextContent() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearTextContent();
            return this;
        }

        public C14806b clearType() {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getBackground() {
            return ((ReplyCardLabel) this.instance).getBackground();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getBackgroundBytes() {
            return ((ReplyCardLabel) this.instance).getBackgroundBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public double getBackgroundHeight() {
            return ((ReplyCardLabel) this.instance).getBackgroundHeight();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public double getBackgroundWidth() {
            return ((ReplyCardLabel) this.instance).getBackgroundWidth();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public long getEffect() {
            return ((ReplyCardLabel) this.instance).getEffect();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public long getEffectStartTime() {
            return ((ReplyCardLabel) this.instance).getEffectStartTime();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getImage() {
            return ((ReplyCardLabel) this.instance).getImage();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getImageBytes() {
            return ((ReplyCardLabel) this.instance).getImageBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getJumpUrl() {
            return ((ReplyCardLabel) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getJumpUrlBytes() {
            return ((ReplyCardLabel) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getLabelColorDay() {
            return ((ReplyCardLabel) this.instance).getLabelColorDay();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getLabelColorDayBytes() {
            return ((ReplyCardLabel) this.instance).getLabelColorDayBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getLabelColorNight() {
            return ((ReplyCardLabel) this.instance).getLabelColorNight();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getLabelColorNightBytes() {
            return ((ReplyCardLabel) this.instance).getLabelColorNightBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getTextColorDay() {
            return ((ReplyCardLabel) this.instance).getTextColorDay();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getTextColorDayBytes() {
            return ((ReplyCardLabel) this.instance).getTextColorDayBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getTextColorNight() {
            return ((ReplyCardLabel) this.instance).getTextColorNight();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getTextColorNightBytes() {
            return ((ReplyCardLabel) this.instance).getTextColorNightBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public String getTextContent() {
            return ((ReplyCardLabel) this.instance).getTextContent();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public ByteString getTextContentBytes() {
            return ((ReplyCardLabel) this.instance).getTextContentBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public Type getType() {
            return ((ReplyCardLabel) this.instance).getType();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
        public int getTypeValue() {
            return ((ReplyCardLabel) this.instance).getTypeValue();
        }

        public C14806b setBackground(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setBackground(str);
            return this;
        }

        public C14806b setBackgroundBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setBackgroundBytes(byteString);
            return this;
        }

        public C14806b setBackgroundHeight(double d) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setBackgroundHeight(d);
            return this;
        }

        public C14806b setBackgroundWidth(double d) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setBackgroundWidth(d);
            return this;
        }

        public C14806b setEffect(long j) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setEffect(j);
            return this;
        }

        public C14806b setEffectStartTime(long j) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setEffectStartTime(j);
            return this;
        }

        public C14806b setImage(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setImage(str);
            return this;
        }

        public C14806b setImageBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setImageBytes(byteString);
            return this;
        }

        public C14806b setJumpUrl(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setJumpUrl(str);
            return this;
        }

        public C14806b setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public C14806b setLabelColorDay(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setLabelColorDay(str);
            return this;
        }

        public C14806b setLabelColorDayBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setLabelColorDayBytes(byteString);
            return this;
        }

        public C14806b setLabelColorNight(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setLabelColorNight(str);
            return this;
        }

        public C14806b setLabelColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setLabelColorNightBytes(byteString);
            return this;
        }

        public C14806b setTextColorDay(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setTextColorDay(str);
            return this;
        }

        public C14806b setTextColorDayBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setTextColorDayBytes(byteString);
            return this;
        }

        public C14806b setTextColorNight(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setTextColorNight(str);
            return this;
        }

        public C14806b setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        public C14806b setTextContent(String str) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setTextContent(str);
            return this;
        }

        public C14806b setTextContentBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setTextContentBytes(byteString);
            return this;
        }

        public C14806b setType(Type type) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setType(type);
            return this;
        }

        public C14806b setTypeValue(int i) {
            copyOnWrite();
            ((ReplyCardLabel) this.instance).setTypeValue(i);
            return this;
        }

        private C14806b() {
            super(ReplyCardLabel.DEFAULT_INSTANCE);
        }
    }

    static {
        ReplyCardLabel replyCardLabel = new ReplyCardLabel();
        DEFAULT_INSTANCE = replyCardLabel;
        GeneratedMessageLite.registerDefaultInstance(ReplyCardLabel.class, replyCardLabel);
    }

    private ReplyCardLabel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackground() {
        this.background_ = getDefaultInstance().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundHeight() {
        this.backgroundHeight_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundWidth() {
        this.backgroundWidth_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEffect() {
        this.effect_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEffectStartTime() {
        this.effectStartTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = getDefaultInstance().getImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelColorDay() {
        this.labelColorDay_ = getDefaultInstance().getLabelColorDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelColorNight() {
        this.labelColorNight_ = getDefaultInstance().getLabelColorNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColorDay() {
        this.textColorDay_ = getDefaultInstance().getTextColorDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextColorNight() {
        this.textColorNight_ = getDefaultInstance().getTextColorNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextContent() {
        this.textContent_ = getDefaultInstance().getTextContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static ReplyCardLabel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14806b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReplyCardLabel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReplyCardLabel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyCardLabel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReplyCardLabel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackground(String str) {
        str.getClass();
        this.background_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.background_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundHeight(double d) {
        this.backgroundHeight_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundWidth(double d) {
        this.backgroundWidth_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEffect(long j) {
        this.effect_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEffectStartTime(long j) {
        this.effectStartTime_ = j;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelColorDay(String str) {
        str.getClass();
        this.labelColorDay_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelColorDayBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelColorDay_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelColorNight(String str) {
        str.getClass();
        this.labelColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelColorNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorDay(String str) {
        str.getClass();
        this.textColorDay_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorDayBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColorDay_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorNight(String str) {
        str.getClass();
        this.textColorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColorNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextContent(String str) {
        str.getClass();
        this.textContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14805a.f22018xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReplyCardLabel();
            case 2:
                return new C14806b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\f\b\u0208\t\u0000\n\u0000\u000b\u0208\f\u0002\r\u0002", new Object[]{"textContent_", "textColorDay_", "textColorNight_", "labelColorDay_", "labelColorNight_", "image_", "type_", "background_", "backgroundWidth_", "backgroundHeight_", "jumpUrl_", "effect_", "effectStartTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReplyCardLabel> parser = PARSER;
                if (parser == null) {
                    synchronized (ReplyCardLabel.class) {
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

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getBackground() {
        return this.background_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getBackgroundBytes() {
        return ByteString.copyFromUtf8(this.background_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public double getBackgroundHeight() {
        return this.backgroundHeight_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public double getBackgroundWidth() {
        return this.backgroundWidth_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public long getEffect() {
        return this.effect_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public long getEffectStartTime() {
        return this.effectStartTime_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getImage() {
        return this.image_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getImageBytes() {
        return ByteString.copyFromUtf8(this.image_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getLabelColorDay() {
        return this.labelColorDay_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getLabelColorDayBytes() {
        return ByteString.copyFromUtf8(this.labelColorDay_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getLabelColorNight() {
        return this.labelColorNight_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getLabelColorNightBytes() {
        return ByteString.copyFromUtf8(this.labelColorNight_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getTextColorDay() {
        return this.textColorDay_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getTextColorDayBytes() {
        return ByteString.copyFromUtf8(this.textColorDay_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getTextColorNight() {
        return this.textColorNight_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public String getTextContent() {
        return this.textContent_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public ByteString getTextContentBytes() {
        return ByteString.copyFromUtf8(this.textContent_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public Type getType() {
        Type forNumber = Type.forNumber(this.type_);
        return forNumber == null ? Type.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14919g
    public int getTypeValue() {
        return this.type_;
    }

    public static C14806b newBuilder(ReplyCardLabel replyCardLabel) {
        return DEFAULT_INSTANCE.createBuilder(replyCardLabel);
    }

    public static ReplyCardLabel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyCardLabel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyCardLabel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReplyCardLabel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReplyCardLabel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReplyCardLabel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReplyCardLabel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReplyCardLabel parseFrom(InputStream inputStream) throws IOException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyCardLabel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyCardLabel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReplyCardLabel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyCardLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
