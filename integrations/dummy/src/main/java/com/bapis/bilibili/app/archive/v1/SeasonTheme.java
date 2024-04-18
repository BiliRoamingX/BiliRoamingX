package com.bapis.bilibili.app.archive.v1;

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
/* loaded from: classes12.dex */
public final class SeasonTheme extends GeneratedMessageLite<SeasonTheme, SeasonTheme.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 1;
    private static final SeasonTheme DEFAULT_INSTANCE;
    private static volatile Parser<SeasonTheme> PARSER = null;
    public static final int SELECTED_BG_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_FIELD_NUMBER = 3;
    private String bgColor_ = "";
    private String selectedBgColor_ = "";
    private String textColor_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.v1.SeasonTheme$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55201 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15730xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15730xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15730xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15730xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15730xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15730xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15730xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15730xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonTheme, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C55201 c55201) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((SeasonTheme) this.instance).clearBgColor();
            return this;
        }

        public Builder clearSelectedBgColor() {
            copyOnWrite();
            ((SeasonTheme) this.instance).clearSelectedBgColor();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((SeasonTheme) this.instance).clearTextColor();
            return this;
        }

        public String getBgColor() {
            return ((SeasonTheme) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((SeasonTheme) this.instance).getBgColorBytes();
        }

        public String getSelectedBgColor() {
            return ((SeasonTheme) this.instance).getSelectedBgColor();
        }

        public ByteString getSelectedBgColorBytes() {
            return ((SeasonTheme) this.instance).getSelectedBgColorBytes();
        }

        public String getTextColor() {
            return ((SeasonTheme) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((SeasonTheme) this.instance).getTextColorBytes();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((SeasonTheme) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonTheme) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setSelectedBgColor(String str) {
            copyOnWrite();
            ((SeasonTheme) this.instance).setSelectedBgColor(str);
            return this;
        }

        public Builder setSelectedBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonTheme) this.instance).setSelectedBgColorBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((SeasonTheme) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonTheme) this.instance).setTextColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(SeasonTheme.DEFAULT_INSTANCE);
        }
    }

    static {
        SeasonTheme seasonTheme = new SeasonTheme();
        DEFAULT_INSTANCE = seasonTheme;
        GeneratedMessageLite.registerDefaultInstance(SeasonTheme.class, seasonTheme);
    }

    private SeasonTheme() {
    }

    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    public void clearSelectedBgColor() {
        this.selectedBgColor_ = getDefaultInstance().getSelectedBgColor();
    }

    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    public static SeasonTheme getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonTheme parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonTheme) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonTheme parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonTheme> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setBgColor(String str) {
        str.getClass();
        this.bgColor_ = str;
    }

    public void setBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColor_ = byteString.toStringUtf8();
    }

    public void setSelectedBgColor(String str) {
        str.getClass();
        this.selectedBgColor_ = str;
    }

    public void setSelectedBgColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selectedBgColor_ = byteString.toStringUtf8();
    }

    public void setTextColor(String str) {
        str.getClass();
        this.textColor_ = str;
    }

    public void setTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55201.f15730xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonTheme();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"bgColor_", "selectedBgColor_", "textColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonTheme> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonTheme.class) {
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

    public String getBgColor() {
        return this.bgColor_;
    }

    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    public String getSelectedBgColor() {
        return this.selectedBgColor_;
    }

    public ByteString getSelectedBgColorBytes() {
        return ByteString.copyFromUtf8(this.selectedBgColor_);
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public static Builder newBuilder(SeasonTheme seasonTheme) {
        return DEFAULT_INSTANCE.createBuilder(seasonTheme);
    }

    public static SeasonTheme parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonTheme) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonTheme parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonTheme parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonTheme parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonTheme parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonTheme parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonTheme parseFrom(InputStream inputStream) throws IOException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonTheme parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonTheme parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonTheme parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonTheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
