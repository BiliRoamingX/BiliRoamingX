package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class QoeScoreItem extends GeneratedMessageLite<QoeScoreItem, QoeScoreItem.C14802b> implements InterfaceC14918f {
    private static final QoeScoreItem DEFAULT_INSTANCE;
    private static volatile Parser<QoeScoreItem> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private float score_;
    private String title_ = "";
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.QoeScoreItem$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14801a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22017xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22017xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22017xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22017xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22017xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22017xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22017xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22017xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.QoeScoreItem$b */
    /* loaded from: classes21.dex */
    public static final class C14802b extends GeneratedMessageLite.Builder<QoeScoreItem, C14802b> implements InterfaceC14918f {
        /* synthetic */ C14802b(C14801a c14801a) {
            this();
        }

        public C14802b clearScore() {
            copyOnWrite();
            ((QoeScoreItem) this.instance).clearScore();
            return this;
        }

        public C14802b clearTitle() {
            copyOnWrite();
            ((QoeScoreItem) this.instance).clearTitle();
            return this;
        }

        public C14802b clearUrl() {
            copyOnWrite();
            ((QoeScoreItem) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
        public float getScore() {
            return ((QoeScoreItem) this.instance).getScore();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
        public String getTitle() {
            return ((QoeScoreItem) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
        public ByteString getTitleBytes() {
            return ((QoeScoreItem) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
        public String getUrl() {
            return ((QoeScoreItem) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
        public ByteString getUrlBytes() {
            return ((QoeScoreItem) this.instance).getUrlBytes();
        }

        public C14802b setScore(float f) {
            copyOnWrite();
            ((QoeScoreItem) this.instance).setScore(f);
            return this;
        }

        public C14802b setTitle(String str) {
            copyOnWrite();
            ((QoeScoreItem) this.instance).setTitle(str);
            return this;
        }

        public C14802b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeScoreItem) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C14802b setUrl(String str) {
            copyOnWrite();
            ((QoeScoreItem) this.instance).setUrl(str);
            return this;
        }

        public C14802b setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeScoreItem) this.instance).setUrlBytes(byteString);
            return this;
        }

        private C14802b() {
            super(QoeScoreItem.DEFAULT_INSTANCE);
        }
    }

    static {
        QoeScoreItem qoeScoreItem = new QoeScoreItem();
        DEFAULT_INSTANCE = qoeScoreItem;
        GeneratedMessageLite.registerDefaultInstance(QoeScoreItem.class, qoeScoreItem);
    }

    private QoeScoreItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static QoeScoreItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14802b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QoeScoreItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QoeScoreItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeScoreItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<QoeScoreItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(float f) {
        this.score_ = f;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14801a.f22017xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new QoeScoreItem();
            case 2:
                return new C14802b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0001", new Object[]{"title_", "url_", "score_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QoeScoreItem> parser = PARSER;
                if (parser == null) {
                    synchronized (QoeScoreItem.class) {
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

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
    public float getScore() {
        return this.score_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14918f
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static C14802b newBuilder(QoeScoreItem qoeScoreItem) {
        return DEFAULT_INSTANCE.createBuilder(qoeScoreItem);
    }

    public static QoeScoreItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeScoreItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeScoreItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QoeScoreItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QoeScoreItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QoeScoreItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QoeScoreItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QoeScoreItem parseFrom(InputStream inputStream) throws IOException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeScoreItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeScoreItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QoeScoreItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeScoreItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
