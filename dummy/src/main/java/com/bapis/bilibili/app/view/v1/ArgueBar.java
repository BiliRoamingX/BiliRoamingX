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
public final class ArgueBar extends GeneratedMessageLite<ArgueBar, ArgueBar.Builder> implements MessageLiteOrBuilder {
    public static final int BG_COLOR_FIELD_NUMBER = 1;
    public static final int BG_COLOR_NIGHT_FIELD_NUMBER = 5;
    private static final ArgueBar DEFAULT_INSTANCE;
    public static final int ICON_COLOR_FIELD_NUMBER = 3;
    public static final int ICON_COLOR_NIGHT_FIELD_NUMBER = 7;
    public static final int MSG_FIELD_NUMBER = 4;
    private static volatile Parser<ArgueBar> PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_NIGHT_FIELD_NUMBER = 6;
    private String bgColor_ = "";
    private String textColor_ = "";
    private String iconColor_ = "";
    private String msg_ = "";
    private String bgColorNight_ = "";
    private String textColorNight_ = "";
    private String iconColorNight_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ArgueBar$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67111 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16687xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16687xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16687xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16687xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16687xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16687xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16687xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16687xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ArgueBar, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67111 c67111) {
            this();
        }

        public Builder clearBgColor() {
            copyOnWrite();
            ((ArgueBar) this.instance).clearBgColor();
            return this;
        }

        public Builder clearBgColorNight() {
            copyOnWrite();
            ((ArgueBar) this.instance).clearBgColorNight();
            return this;
        }

        public Builder clearIconColor() {
            copyOnWrite();
            ((ArgueBar) this.instance).clearIconColor();
            return this;
        }

        public Builder clearIconColorNight() {
            copyOnWrite();
            ((ArgueBar) this.instance).clearIconColorNight();
            return this;
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((ArgueBar) this.instance).clearMsg();
            return this;
        }

        public Builder clearTextColor() {
            copyOnWrite();
            ((ArgueBar) this.instance).clearTextColor();
            return this;
        }

        public Builder clearTextColorNight() {
            copyOnWrite();
            ((ArgueBar) this.instance).clearTextColorNight();
            return this;
        }

        public String getBgColor() {
            return ((ArgueBar) this.instance).getBgColor();
        }

        public ByteString getBgColorBytes() {
            return ((ArgueBar) this.instance).getBgColorBytes();
        }

        public String getBgColorNight() {
            return ((ArgueBar) this.instance).getBgColorNight();
        }

        public ByteString getBgColorNightBytes() {
            return ((ArgueBar) this.instance).getBgColorNightBytes();
        }

        public String getIconColor() {
            return ((ArgueBar) this.instance).getIconColor();
        }

        public ByteString getIconColorBytes() {
            return ((ArgueBar) this.instance).getIconColorBytes();
        }

        public String getIconColorNight() {
            return ((ArgueBar) this.instance).getIconColorNight();
        }

        public ByteString getIconColorNightBytes() {
            return ((ArgueBar) this.instance).getIconColorNightBytes();
        }

        public String getMsg() {
            return ((ArgueBar) this.instance).getMsg();
        }

        public ByteString getMsgBytes() {
            return ((ArgueBar) this.instance).getMsgBytes();
        }

        public String getTextColor() {
            return ((ArgueBar) this.instance).getTextColor();
        }

        public ByteString getTextColorBytes() {
            return ((ArgueBar) this.instance).getTextColorBytes();
        }

        public String getTextColorNight() {
            return ((ArgueBar) this.instance).getTextColorNight();
        }

        public ByteString getTextColorNightBytes() {
            return ((ArgueBar) this.instance).getTextColorNightBytes();
        }

        public Builder setBgColor(String str) {
            copyOnWrite();
            ((ArgueBar) this.instance).setBgColor(str);
            return this;
        }

        public Builder setBgColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ArgueBar) this.instance).setBgColorBytes(byteString);
            return this;
        }

        public Builder setBgColorNight(String str) {
            copyOnWrite();
            ((ArgueBar) this.instance).setBgColorNight(str);
            return this;
        }

        public Builder setBgColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ArgueBar) this.instance).setBgColorNightBytes(byteString);
            return this;
        }

        public Builder setIconColor(String str) {
            copyOnWrite();
            ((ArgueBar) this.instance).setIconColor(str);
            return this;
        }

        public Builder setIconColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ArgueBar) this.instance).setIconColorBytes(byteString);
            return this;
        }

        public Builder setIconColorNight(String str) {
            copyOnWrite();
            ((ArgueBar) this.instance).setIconColorNight(str);
            return this;
        }

        public Builder setIconColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ArgueBar) this.instance).setIconColorNightBytes(byteString);
            return this;
        }

        public Builder setMsg(String str) {
            copyOnWrite();
            ((ArgueBar) this.instance).setMsg(str);
            return this;
        }

        public Builder setMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((ArgueBar) this.instance).setMsgBytes(byteString);
            return this;
        }

        public Builder setTextColor(String str) {
            copyOnWrite();
            ((ArgueBar) this.instance).setTextColor(str);
            return this;
        }

        public Builder setTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((ArgueBar) this.instance).setTextColorBytes(byteString);
            return this;
        }

        public Builder setTextColorNight(String str) {
            copyOnWrite();
            ((ArgueBar) this.instance).setTextColorNight(str);
            return this;
        }

        public Builder setTextColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((ArgueBar) this.instance).setTextColorNightBytes(byteString);
            return this;
        }

        private Builder() {
            super(ArgueBar.DEFAULT_INSTANCE);
        }
    }

    static {
        ArgueBar argueBar = new ArgueBar();
        DEFAULT_INSTANCE = argueBar;
        GeneratedMessageLite.registerDefaultInstance(ArgueBar.class, argueBar);
    }

    private ArgueBar() {
    }

    public void clearBgColor() {
        this.bgColor_ = getDefaultInstance().getBgColor();
    }

    public void clearBgColorNight() {
        this.bgColorNight_ = getDefaultInstance().getBgColorNight();
    }

    public void clearIconColor() {
        this.iconColor_ = getDefaultInstance().getIconColor();
    }

    public void clearIconColorNight() {
        this.iconColorNight_ = getDefaultInstance().getIconColorNight();
    }

    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    public void clearTextColor() {
        this.textColor_ = getDefaultInstance().getTextColor();
    }

    public void clearTextColorNight() {
        this.textColorNight_ = getDefaultInstance().getTextColorNight();
    }

    public static ArgueBar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArgueBar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArgueBar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArgueBar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArgueBar> parser() {
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

    public void setBgColorNight(String str) {
        str.getClass();
        this.bgColorNight_ = str;
    }

    public void setBgColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bgColorNight_ = byteString.toStringUtf8();
    }

    public void setIconColor(String str) {
        str.getClass();
        this.iconColor_ = str;
    }

    public void setIconColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconColor_ = byteString.toStringUtf8();
    }

    public void setIconColorNight(String str) {
        str.getClass();
        this.iconColorNight_ = str;
    }

    public void setIconColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconColorNight_ = byteString.toStringUtf8();
    }

    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    public void setTextColor(String str) {
        str.getClass();
        this.textColor_ = str;
    }

    public void setTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColor_ = byteString.toStringUtf8();
    }

    public void setTextColorNight(String str) {
        str.getClass();
        this.textColorNight_ = str;
    }

    public void setTextColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.textColorNight_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67111.f16687xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArgueBar();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"bgColor_", "textColor_", "iconColor_", "msg_", "bgColorNight_", "textColorNight_", "iconColorNight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArgueBar> parser = PARSER;
                if (parser == null) {
                    synchronized (ArgueBar.class) {
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

    public String getBgColor() {
        return this.bgColor_;
    }

    public ByteString getBgColorBytes() {
        return ByteString.copyFromUtf8(this.bgColor_);
    }

    public String getBgColorNight() {
        return this.bgColorNight_;
    }

    public ByteString getBgColorNightBytes() {
        return ByteString.copyFromUtf8(this.bgColorNight_);
    }

    public String getIconColor() {
        return this.iconColor_;
    }

    public ByteString getIconColorBytes() {
        return ByteString.copyFromUtf8(this.iconColor_);
    }

    public String getIconColorNight() {
        return this.iconColorNight_;
    }

    public ByteString getIconColorNightBytes() {
        return ByteString.copyFromUtf8(this.iconColorNight_);
    }

    public String getMsg() {
        return this.msg_;
    }

    public ByteString getMsgBytes() {
        return ByteString.copyFromUtf8(this.msg_);
    }

    public String getTextColor() {
        return this.textColor_;
    }

    public ByteString getTextColorBytes() {
        return ByteString.copyFromUtf8(this.textColor_);
    }

    public String getTextColorNight() {
        return this.textColorNight_;
    }

    public ByteString getTextColorNightBytes() {
        return ByteString.copyFromUtf8(this.textColorNight_);
    }

    public static Builder newBuilder(ArgueBar argueBar) {
        return DEFAULT_INSTANCE.createBuilder(argueBar);
    }

    public static ArgueBar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArgueBar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArgueBar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArgueBar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArgueBar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArgueBar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArgueBar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArgueBar parseFrom(InputStream inputStream) throws IOException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArgueBar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArgueBar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArgueBar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArgueBar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
