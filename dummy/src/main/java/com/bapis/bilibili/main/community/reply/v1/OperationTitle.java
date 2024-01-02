package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class OperationTitle extends GeneratedMessageLite<OperationTitle, OperationTitle.C14779b> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final OperationTitle DEFAULT_INSTANCE;
    public static final int IS_HIGHLIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<OperationTitle> PARSER;
    private String content_ = "";
    private boolean isHighlight_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationTitle$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14778a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22008xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22008xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22008xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22008xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22008xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22008xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22008xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22008xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationTitle$b */
    /* loaded from: classes21.dex */
    public static final class C14779b extends GeneratedMessageLite.Builder<OperationTitle, C14779b> implements MessageLiteOrBuilder {
        /* synthetic */ C14779b(C14778a c14778a) {
            this();
        }

        public C14779b clearContent() {
            copyOnWrite();
            ((OperationTitle) this.instance).clearContent();
            return this;
        }

        public C14779b clearIsHighlight() {
            copyOnWrite();
            ((OperationTitle) this.instance).clearIsHighlight();
            return this;
        }

        public String getContent() {
            return ((OperationTitle) this.instance).getContent();
        }

        public ByteString getContentBytes() {
            return ((OperationTitle) this.instance).getContentBytes();
        }

        public boolean getIsHighlight() {
            return ((OperationTitle) this.instance).getIsHighlight();
        }

        public C14779b setContent(String str) {
            copyOnWrite();
            ((OperationTitle) this.instance).setContent(str);
            return this;
        }

        public C14779b setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationTitle) this.instance).setContentBytes(byteString);
            return this;
        }

        public C14779b setIsHighlight(boolean z) {
            copyOnWrite();
            ((OperationTitle) this.instance).setIsHighlight(z);
            return this;
        }

        private C14779b() {
            super(OperationTitle.DEFAULT_INSTANCE);
        }
    }

    static {
        OperationTitle operationTitle = new OperationTitle();
        DEFAULT_INSTANCE = operationTitle;
        GeneratedMessageLite.registerDefaultInstance(OperationTitle.class, operationTitle);
    }

    private OperationTitle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHighlight() {
        this.isHighlight_ = false;
    }

    public static OperationTitle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14779b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationTitle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationTitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationTitle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationTitle> parser() {
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
    public void setIsHighlight(boolean z) {
        this.isHighlight_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14778a.f22008xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationTitle();
            case 2:
                return new C14779b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[]{"content_", "isHighlight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationTitle> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationTitle.class) {
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

    public boolean getIsHighlight() {
        return this.isHighlight_;
    }

    public static C14779b newBuilder(OperationTitle operationTitle) {
        return DEFAULT_INSTANCE.createBuilder(operationTitle);
    }

    public static OperationTitle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationTitle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationTitle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationTitle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationTitle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationTitle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationTitle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationTitle parseFrom(InputStream inputStream) throws IOException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationTitle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationTitle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationTitle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationTitle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
