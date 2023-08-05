package com.bapis.bilibili.app.viewunite.common;

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
public final class SeasonShow extends GeneratedMessageLite<SeasonShow, SeasonShow.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_TEXT_FIELD_NUMBER = 1;
    public static final int CHECKIN_PROMPT_FIELD_NUMBER = 5;
    public static final int CHECKIN_TEXT_FIELD_NUMBER = 4;
    private static final SeasonShow DEFAULT_INSTANCE;
    public static final int JOIN_TEXT_FIELD_NUMBER = 2;
    private static volatile Parser<SeasonShow> PARSER = null;
    public static final int RULE_TEXT_FIELD_NUMBER = 3;
    private String buttonText_ = "";
    private String joinText_ = "";
    private String ruleText_ = "";
    private String checkinText_ = "";
    private String checkinPrompt_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.SeasonShow$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17034xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17034xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17034xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonShow, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70551 c70551) {
            this();
        }

        public Builder clearButtonText() {
            copyOnWrite();
            ((SeasonShow) this.instance).clearButtonText();
            return this;
        }

        public Builder clearCheckinPrompt() {
            copyOnWrite();
            ((SeasonShow) this.instance).clearCheckinPrompt();
            return this;
        }

        public Builder clearCheckinText() {
            copyOnWrite();
            ((SeasonShow) this.instance).clearCheckinText();
            return this;
        }

        public Builder clearJoinText() {
            copyOnWrite();
            ((SeasonShow) this.instance).clearJoinText();
            return this;
        }

        public Builder clearRuleText() {
            copyOnWrite();
            ((SeasonShow) this.instance).clearRuleText();
            return this;
        }

        public String getButtonText() {
            return ((SeasonShow) this.instance).getButtonText();
        }

        public ByteString getButtonTextBytes() {
            return ((SeasonShow) this.instance).getButtonTextBytes();
        }

        public String getCheckinPrompt() {
            return ((SeasonShow) this.instance).getCheckinPrompt();
        }

        public ByteString getCheckinPromptBytes() {
            return ((SeasonShow) this.instance).getCheckinPromptBytes();
        }

        public String getCheckinText() {
            return ((SeasonShow) this.instance).getCheckinText();
        }

        public ByteString getCheckinTextBytes() {
            return ((SeasonShow) this.instance).getCheckinTextBytes();
        }

        public String getJoinText() {
            return ((SeasonShow) this.instance).getJoinText();
        }

        public ByteString getJoinTextBytes() {
            return ((SeasonShow) this.instance).getJoinTextBytes();
        }

        public String getRuleText() {
            return ((SeasonShow) this.instance).getRuleText();
        }

        public ByteString getRuleTextBytes() {
            return ((SeasonShow) this.instance).getRuleTextBytes();
        }

        public Builder setButtonText(String str) {
            copyOnWrite();
            ((SeasonShow) this.instance).setButtonText(str);
            return this;
        }

        public Builder setButtonTextBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonShow) this.instance).setButtonTextBytes(byteString);
            return this;
        }

        public Builder setCheckinPrompt(String str) {
            copyOnWrite();
            ((SeasonShow) this.instance).setCheckinPrompt(str);
            return this;
        }

        public Builder setCheckinPromptBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonShow) this.instance).setCheckinPromptBytes(byteString);
            return this;
        }

        public Builder setCheckinText(String str) {
            copyOnWrite();
            ((SeasonShow) this.instance).setCheckinText(str);
            return this;
        }

        public Builder setCheckinTextBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonShow) this.instance).setCheckinTextBytes(byteString);
            return this;
        }

        public Builder setJoinText(String str) {
            copyOnWrite();
            ((SeasonShow) this.instance).setJoinText(str);
            return this;
        }

        public Builder setJoinTextBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonShow) this.instance).setJoinTextBytes(byteString);
            return this;
        }

        public Builder setRuleText(String str) {
            copyOnWrite();
            ((SeasonShow) this.instance).setRuleText(str);
            return this;
        }

        public Builder setRuleTextBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonShow) this.instance).setRuleTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(SeasonShow.DEFAULT_INSTANCE);
        }
    }

    static {
        SeasonShow seasonShow = new SeasonShow();
        DEFAULT_INSTANCE = seasonShow;
        GeneratedMessageLite.registerDefaultInstance(SeasonShow.class, seasonShow);
    }

    private SeasonShow() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonText() {
        this.buttonText_ = getDefaultInstance().getButtonText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckinPrompt() {
        this.checkinPrompt_ = getDefaultInstance().getCheckinPrompt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCheckinText() {
        this.checkinText_ = getDefaultInstance().getCheckinText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinText() {
        this.joinText_ = getDefaultInstance().getJoinText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRuleText() {
        this.ruleText_ = getDefaultInstance().getRuleText();
    }

    public static SeasonShow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonShow parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonShow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonShow parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonShow> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonText(String str) {
        str.getClass();
        this.buttonText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckinPrompt(String str) {
        str.getClass();
        this.checkinPrompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckinPromptBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.checkinPrompt_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckinText(String str) {
        str.getClass();
        this.checkinText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckinTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.checkinText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinText(String str) {
        str.getClass();
        this.joinText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.joinText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRuleText(String str) {
        str.getClass();
        this.ruleText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRuleTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ruleText_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70551.f17034xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonShow();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208", new Object[]{"buttonText_", "joinText_", "ruleText_", "checkinText_", "checkinPrompt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonShow> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonShow.class) {
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

    public String getButtonText() {
        return this.buttonText_;
    }

    public ByteString getButtonTextBytes() {
        return ByteString.copyFromUtf8(this.buttonText_);
    }

    public String getCheckinPrompt() {
        return this.checkinPrompt_;
    }

    public ByteString getCheckinPromptBytes() {
        return ByteString.copyFromUtf8(this.checkinPrompt_);
    }

    public String getCheckinText() {
        return this.checkinText_;
    }

    public ByteString getCheckinTextBytes() {
        return ByteString.copyFromUtf8(this.checkinText_);
    }

    public String getJoinText() {
        return this.joinText_;
    }

    public ByteString getJoinTextBytes() {
        return ByteString.copyFromUtf8(this.joinText_);
    }

    public String getRuleText() {
        return this.ruleText_;
    }

    public ByteString getRuleTextBytes() {
        return ByteString.copyFromUtf8(this.ruleText_);
    }

    public static Builder newBuilder(SeasonShow seasonShow) {
        return DEFAULT_INSTANCE.createBuilder(seasonShow);
    }

    public static SeasonShow parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonShow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonShow parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonShow parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonShow parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonShow parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonShow parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonShow parseFrom(InputStream inputStream) throws IOException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonShow parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonShow parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonShow parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
