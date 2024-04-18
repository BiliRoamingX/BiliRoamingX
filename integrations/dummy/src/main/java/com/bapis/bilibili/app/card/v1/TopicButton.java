package com.bapis.bilibili.app.card.v1;

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
public final class TopicButton extends GeneratedMessageLite<TopicButton, TopicButton.C5902b> implements MessageLiteOrBuilder {
    private static final TopicButton DEFAULT_INSTANCE;
    public static final int JUMP_URI_FIELD_NUMBER = 2;
    private static volatile Parser<TopicButton> PARSER = null;
    public static final int RED_DOT_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean redDot_;
    private String title_ = "";
    private String jumpUri_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TopicButton$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5901a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15999xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15999xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15999xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15999xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15999xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15999xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15999xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15999xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.TopicButton$b */
    /* loaded from: classes13.dex */
    public static final class C5902b extends GeneratedMessageLite.Builder<TopicButton, C5902b> implements MessageLiteOrBuilder {
        /* synthetic */ C5902b(C5901a c5901a) {
            this();
        }

        public C5902b clearJumpUri() {
            copyOnWrite();
            ((TopicButton) this.instance).clearJumpUri();
            return this;
        }

        public C5902b clearRedDot() {
            copyOnWrite();
            ((TopicButton) this.instance).clearRedDot();
            return this;
        }

        public C5902b clearTitle() {
            copyOnWrite();
            ((TopicButton) this.instance).clearTitle();
            return this;
        }

        public String getJumpUri() {
            return ((TopicButton) this.instance).getJumpUri();
        }

        public ByteString getJumpUriBytes() {
            return ((TopicButton) this.instance).getJumpUriBytes();
        }

        public boolean getRedDot() {
            return ((TopicButton) this.instance).getRedDot();
        }

        public String getTitle() {
            return ((TopicButton) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((TopicButton) this.instance).getTitleBytes();
        }

        public C5902b setJumpUri(String str) {
            copyOnWrite();
            ((TopicButton) this.instance).setJumpUri(str);
            return this;
        }

        public C5902b setJumpUriBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicButton) this.instance).setJumpUriBytes(byteString);
            return this;
        }

        public C5902b setRedDot(boolean z) {
            copyOnWrite();
            ((TopicButton) this.instance).setRedDot(z);
            return this;
        }

        public C5902b setTitle(String str) {
            copyOnWrite();
            ((TopicButton) this.instance).setTitle(str);
            return this;
        }

        public C5902b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((TopicButton) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C5902b() {
            super(TopicButton.DEFAULT_INSTANCE);
        }
    }

    static {
        TopicButton topicButton = new TopicButton();
        DEFAULT_INSTANCE = topicButton;
        GeneratedMessageLite.registerDefaultInstance(TopicButton.class, topicButton);
    }

    private TopicButton() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpUri() {
        this.jumpUri_ = getDefaultInstance().getJumpUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRedDot() {
        this.redDot_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static TopicButton getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5902b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TopicButton parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TopicButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopicButton parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TopicButton> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUri(String str) {
        str.getClass();
        this.jumpUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUri_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRedDot(boolean z) {
        this.redDot_ = z;
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5901a.f15999xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TopicButton();
            case 2:
                return new C5902b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007", new Object[]{"title_", "jumpUri_", "redDot_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TopicButton> parser = PARSER;
                if (parser == null) {
                    synchronized (TopicButton.class) {
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

    public String getJumpUri() {
        return this.jumpUri_;
    }

    public ByteString getJumpUriBytes() {
        return ByteString.copyFromUtf8(this.jumpUri_);
    }

    public boolean getRedDot() {
        return this.redDot_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static C5902b newBuilder(TopicButton topicButton) {
        return DEFAULT_INSTANCE.createBuilder(topicButton);
    }

    public static TopicButton parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicButton) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopicButton parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TopicButton parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TopicButton parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TopicButton parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TopicButton parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TopicButton parseFrom(InputStream inputStream) throws IOException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TopicButton parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TopicButton parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TopicButton parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TopicButton) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
