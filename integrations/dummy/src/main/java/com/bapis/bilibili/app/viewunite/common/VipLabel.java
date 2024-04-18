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
public final class VipLabel extends GeneratedMessageLite<VipLabel, VipLabel.Builder> implements MessageLiteOrBuilder {
    private static final VipLabel DEFAULT_INSTANCE;
    public static final int LABEL_THEME_FIELD_NUMBER = 3;
    private static volatile Parser<VipLabel> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 2;
    private String path_ = "";
    private String text_ = "";
    private String labelTheme_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.VipLabel$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70851 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17062xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17062xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17062xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17062xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17062xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17062xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17062xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17062xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<VipLabel, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70851 c70851) {
            this();
        }

        public Builder clearLabelTheme() {
            copyOnWrite();
            ((VipLabel) this.instance).clearLabelTheme();
            return this;
        }

        public Builder clearPath() {
            copyOnWrite();
            ((VipLabel) this.instance).clearPath();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((VipLabel) this.instance).clearText();
            return this;
        }

        public String getLabelTheme() {
            return ((VipLabel) this.instance).getLabelTheme();
        }

        public ByteString getLabelThemeBytes() {
            return ((VipLabel) this.instance).getLabelThemeBytes();
        }

        public String getPath() {
            return ((VipLabel) this.instance).getPath();
        }

        public ByteString getPathBytes() {
            return ((VipLabel) this.instance).getPathBytes();
        }

        public String getText() {
            return ((VipLabel) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((VipLabel) this.instance).getTextBytes();
        }

        public Builder setLabelTheme(String str) {
            copyOnWrite();
            ((VipLabel) this.instance).setLabelTheme(str);
            return this;
        }

        public Builder setLabelThemeBytes(ByteString byteString) {
            copyOnWrite();
            ((VipLabel) this.instance).setLabelThemeBytes(byteString);
            return this;
        }

        public Builder setPath(String str) {
            copyOnWrite();
            ((VipLabel) this.instance).setPath(str);
            return this;
        }

        public Builder setPathBytes(ByteString byteString) {
            copyOnWrite();
            ((VipLabel) this.instance).setPathBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((VipLabel) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((VipLabel) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(VipLabel.DEFAULT_INSTANCE);
        }
    }

    static {
        VipLabel vipLabel = new VipLabel();
        DEFAULT_INSTANCE = vipLabel;
        GeneratedMessageLite.registerDefaultInstance(VipLabel.class, vipLabel);
    }

    private VipLabel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabelTheme() {
        this.labelTheme_ = getDefaultInstance().getLabelTheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static VipLabel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static VipLabel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VipLabel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VipLabel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<VipLabel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelTheme(String str) {
        str.getClass();
        this.labelTheme_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelThemeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.labelTheme_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.path_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70851.f17062xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new VipLabel();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"path_", "text_", "labelTheme_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<VipLabel> parser = PARSER;
                if (parser == null) {
                    synchronized (VipLabel.class) {
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

    public String getLabelTheme() {
        return this.labelTheme_;
    }

    public ByteString getLabelThemeBytes() {
        return ByteString.copyFromUtf8(this.labelTheme_);
    }

    public String getPath() {
        return this.path_;
    }

    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(VipLabel vipLabel) {
        return DEFAULT_INSTANCE.createBuilder(vipLabel);
    }

    public static VipLabel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VipLabel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VipLabel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static VipLabel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VipLabel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static VipLabel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VipLabel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static VipLabel parseFrom(InputStream inputStream) throws IOException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VipLabel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static VipLabel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static VipLabel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (VipLabel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
