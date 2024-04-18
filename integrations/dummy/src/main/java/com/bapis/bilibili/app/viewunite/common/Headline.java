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
public final class Headline extends GeneratedMessageLite<Headline, Headline.Builder> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Headline DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile Parser<Headline> PARSER;
    private String content_ = "";
    private Label label_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Headline$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69981 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16984xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16984xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16984xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16984xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16984xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16984xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Headline, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69981 c69981) {
            this();
        }

        public Builder clearContent() {
            copyOnWrite();
            ((Headline) this.instance).clearContent();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((Headline) this.instance).clearLabel();
            return this;
        }

        public String getContent() {
            return ((Headline) this.instance).getContent();
        }

        public ByteString getContentBytes() {
            return ((Headline) this.instance).getContentBytes();
        }

        public Label getLabel() {
            return ((Headline) this.instance).getLabel();
        }

        public boolean hasLabel() {
            return ((Headline) this.instance).hasLabel();
        }

        public Builder mergeLabel(Label label) {
            copyOnWrite();
            ((Headline) this.instance).mergeLabel(label);
            return this;
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((Headline) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((Headline) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setLabel(Label label) {
            copyOnWrite();
            ((Headline) this.instance).setLabel(label);
            return this;
        }

        private Builder() {
            super(Headline.DEFAULT_INSTANCE);
        }

        public Builder setLabel(Label.Builder builder) {
            copyOnWrite();
            ((Headline) this.instance).setLabel(builder.build());
            return this;
        }
    }

    static {
        Headline headline = new Headline();
        DEFAULT_INSTANCE = headline;
        GeneratedMessageLite.registerDefaultInstance(Headline.class, headline);
    }

    private Headline() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = null;
    }

    public static Headline getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(Label label) {
        label.getClass();
        Label label2 = this.label_;
        if (label2 != null && label2 != Label.getDefaultInstance()) {
            this.label_ = Label.newBuilder(this.label_).mergeFrom((Label) label).buildPartial();
        } else {
            this.label_ = label;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Headline parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Headline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Headline parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Headline> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(Label label) {
        label.getClass();
        this.label_ = label;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69981.f16984xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Headline();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0208", new Object[]{"label_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Headline> parser = PARSER;
                if (parser == null) {
                    synchronized (Headline.class) {
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

    public String getContent() {
        return this.content_;
    }

    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    public Label getLabel() {
        Label label = this.label_;
        return label == null ? Label.getDefaultInstance() : label;
    }

    public boolean hasLabel() {
        return this.label_ != null;
    }

    public static Builder newBuilder(Headline headline) {
        return DEFAULT_INSTANCE.createBuilder(headline);
    }

    public static Headline parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Headline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Headline parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Headline parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Headline parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Headline parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Headline parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Headline parseFrom(InputStream inputStream) throws IOException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Headline parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Headline parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Headline parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Headline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
