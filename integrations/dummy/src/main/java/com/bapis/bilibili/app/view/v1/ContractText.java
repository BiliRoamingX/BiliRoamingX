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
public final class ContractText extends GeneratedMessageLite<ContractText, ContractText.Builder> implements MessageLiteOrBuilder {
    private static final ContractText DEFAULT_INSTANCE;
    public static final int INLINE_TITLE_FIELD_NUMBER = 3;
    private static volatile Parser<ContractText> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String subtitle_ = "";
    private String inlineTitle_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ContractText$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67471 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16721xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16721xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16721xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16721xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16721xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16721xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16721xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16721xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ContractText, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67471 c67471) {
            this();
        }

        public Builder clearInlineTitle() {
            copyOnWrite();
            ((ContractText) this.instance).clearInlineTitle();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((ContractText) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ContractText) this.instance).clearTitle();
            return this;
        }

        public String getInlineTitle() {
            return ((ContractText) this.instance).getInlineTitle();
        }

        public ByteString getInlineTitleBytes() {
            return ((ContractText) this.instance).getInlineTitleBytes();
        }

        public String getSubtitle() {
            return ((ContractText) this.instance).getSubtitle();
        }

        public ByteString getSubtitleBytes() {
            return ((ContractText) this.instance).getSubtitleBytes();
        }

        public String getTitle() {
            return ((ContractText) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((ContractText) this.instance).getTitleBytes();
        }

        public Builder setInlineTitle(String str) {
            copyOnWrite();
            ((ContractText) this.instance).setInlineTitle(str);
            return this;
        }

        public Builder setInlineTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ContractText) this.instance).setInlineTitleBytes(byteString);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((ContractText) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ContractText) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ContractText) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ContractText) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(ContractText.DEFAULT_INSTANCE);
        }
    }

    static {
        ContractText contractText = new ContractText();
        DEFAULT_INSTANCE = contractText;
        GeneratedMessageLite.registerDefaultInstance(ContractText.class, contractText);
    }

    private ContractText() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInlineTitle() {
        this.inlineTitle_ = getDefaultInstance().getInlineTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ContractText getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContractText parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContractText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractText parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ContractText> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInlineTitle(String str) {
        str.getClass();
        this.inlineTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInlineTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.inlineTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67471.f16721xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ContractText();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"title_", "subtitle_", "inlineTitle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContractText> parser = PARSER;
                if (parser == null) {
                    synchronized (ContractText.class) {
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

    public String getInlineTitle() {
        return this.inlineTitle_;
    }

    public ByteString getInlineTitleBytes() {
        return ByteString.copyFromUtf8(this.inlineTitle_);
    }

    public String getSubtitle() {
        return this.subtitle_;
    }

    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(ContractText contractText) {
        return DEFAULT_INSTANCE.createBuilder(contractText);
    }

    public static ContractText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContractText parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ContractText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContractText parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContractText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContractText parseFrom(InputStream inputStream) throws IOException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractText parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContractText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
