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
public final class StatInfo extends GeneratedMessageLite<StatInfo, StatInfo.Builder> implements MessageLiteOrBuilder {
    private static final StatInfo DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    private static volatile Parser<StatInfo> PARSER = null;
    public static final int PURE_TEXT_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;
    private String text_ = "";
    private String pureText_ = "";
    private String icon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.StatInfo$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70661 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17043xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17043xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17043xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17043xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17043xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17043xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17043xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17043xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StatInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70661 c70661) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((StatInfo) this.instance).clearIcon();
            return this;
        }

        public Builder clearPureText() {
            copyOnWrite();
            ((StatInfo) this.instance).clearPureText();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((StatInfo) this.instance).clearText();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((StatInfo) this.instance).clearValue();
            return this;
        }

        public String getIcon() {
            return ((StatInfo) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((StatInfo) this.instance).getIconBytes();
        }

        public String getPureText() {
            return ((StatInfo) this.instance).getPureText();
        }

        public ByteString getPureTextBytes() {
            return ((StatInfo) this.instance).getPureTextBytes();
        }

        public String getText() {
            return ((StatInfo) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((StatInfo) this.instance).getTextBytes();
        }

        public long getValue() {
            return ((StatInfo) this.instance).getValue();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((StatInfo) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((StatInfo) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setPureText(String str) {
            copyOnWrite();
            ((StatInfo) this.instance).setPureText(str);
            return this;
        }

        public Builder setPureTextBytes(ByteString byteString) {
            copyOnWrite();
            ((StatInfo) this.instance).setPureTextBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((StatInfo) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((StatInfo) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setValue(long j) {
            copyOnWrite();
            ((StatInfo) this.instance).setValue(j);
            return this;
        }

        private Builder() {
            super(StatInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        StatInfo statInfo = new StatInfo();
        DEFAULT_INSTANCE = statInfo;
        GeneratedMessageLite.registerDefaultInstance(StatInfo.class, statInfo);
    }

    public StatInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPureText() {
        this.pureText_ = getDefaultInstance().getPureText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static StatInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StatInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StatInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StatInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPureText(String str) {
        str.getClass();
        this.pureText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPureTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pureText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70661.f17043xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new StatInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"value_", "text_", "pureText_", "icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StatInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (StatInfo.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public String getPureText() {
        return this.pureText_;
    }

    public ByteString getPureTextBytes() {
        return ByteString.copyFromUtf8(this.pureText_);
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public long getValue() {
        return this.value_;
    }

    public static Builder newBuilder(StatInfo statInfo) {
        return DEFAULT_INSTANCE.createBuilder(statInfo);
    }

    public static StatInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StatInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StatInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StatInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StatInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StatInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StatInfo parseFrom(InputStream inputStream) throws IOException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StatInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StatInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StatInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StatInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
