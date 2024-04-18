package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class QoeOption extends GeneratedMessageLite<QoeOption, QoeOption.C14798b> implements InterfaceC14917e {
    private static final QoeOption DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 4;
    public static final int IMG_URL_FIELD_NUMBER = 3;
    private static volatile Parser<QoeOption> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private float score_;
    private String title_ = "";
    private String imgUrl_ = "";
    private Internal.ProtobufList<String> desc_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.QoeOption$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14797a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22015xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22015xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22015xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22015xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22015xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22015xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22015xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22015xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.QoeOption$b */
    /* loaded from: classes21.dex */
    public static final class C14798b extends GeneratedMessageLite.Builder<QoeOption, C14798b> implements InterfaceC14917e {
        /* synthetic */ C14798b(C14797a c14797a) {
            this();
        }

        public C14798b addAllDesc(Iterable<String> iterable) {
            copyOnWrite();
            ((QoeOption) this.instance).addAllDesc(iterable);
            return this;
        }

        public C14798b addDesc(String str) {
            copyOnWrite();
            ((QoeOption) this.instance).addDesc(str);
            return this;
        }

        public C14798b addDescBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeOption) this.instance).addDescBytes(byteString);
            return this;
        }

        public C14798b clearDesc() {
            copyOnWrite();
            ((QoeOption) this.instance).clearDesc();
            return this;
        }

        public C14798b clearImgUrl() {
            copyOnWrite();
            ((QoeOption) this.instance).clearImgUrl();
            return this;
        }

        public C14798b clearScore() {
            copyOnWrite();
            ((QoeOption) this.instance).clearScore();
            return this;
        }

        public C14798b clearTitle() {
            copyOnWrite();
            ((QoeOption) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public String getDesc(int i) {
            return ((QoeOption) this.instance).getDesc(i);
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public ByteString getDescBytes(int i) {
            return ((QoeOption) this.instance).getDescBytes(i);
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public int getDescCount() {
            return ((QoeOption) this.instance).getDescCount();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public List<String> getDescList() {
            return Collections.unmodifiableList(((QoeOption) this.instance).getDescList());
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public String getImgUrl() {
            return ((QoeOption) this.instance).getImgUrl();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public ByteString getImgUrlBytes() {
            return ((QoeOption) this.instance).getImgUrlBytes();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public float getScore() {
            return ((QoeOption) this.instance).getScore();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public String getTitle() {
            return ((QoeOption) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
        public ByteString getTitleBytes() {
            return ((QoeOption) this.instance).getTitleBytes();
        }

        public C14798b setDesc(int i, String str) {
            copyOnWrite();
            ((QoeOption) this.instance).setDesc(i, str);
            return this;
        }

        public C14798b setImgUrl(String str) {
            copyOnWrite();
            ((QoeOption) this.instance).setImgUrl(str);
            return this;
        }

        public C14798b setImgUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeOption) this.instance).setImgUrlBytes(byteString);
            return this;
        }

        public C14798b setScore(float f) {
            copyOnWrite();
            ((QoeOption) this.instance).setScore(f);
            return this;
        }

        public C14798b setTitle(String str) {
            copyOnWrite();
            ((QoeOption) this.instance).setTitle(str);
            return this;
        }

        public C14798b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeOption) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C14798b() {
            super(QoeOption.DEFAULT_INSTANCE);
        }
    }

    static {
        QoeOption qoeOption = new QoeOption();
        DEFAULT_INSTANCE = qoeOption;
        GeneratedMessageLite.registerDefaultInstance(QoeOption.class, qoeOption);
    }

    private QoeOption() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDesc(Iterable<String> iterable) {
        ensureDescIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.desc_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDesc(String str) {
        str.getClass();
        ensureDescIsMutable();
        this.desc_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureDescIsMutable();
        this.desc_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImgUrl() {
        this.imgUrl_ = getDefaultInstance().getImgUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureDescIsMutable() {
        Internal.ProtobufList<String> protobufList = this.desc_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.desc_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static QoeOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14798b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QoeOption parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QoeOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeOption parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<QoeOption> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(int i, String str) {
        str.getClass();
        ensureDescIsMutable();
        this.desc_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgUrl(String str) {
        str.getClass();
        this.imgUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImgUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imgUrl_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14797a.f22015xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new QoeOption();
            case 2:
                return new C14798b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u0001\u0003\u0208\u0004\u021a", new Object[]{"title_", "score_", "imgUrl_", "desc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QoeOption> parser = PARSER;
                if (parser == null) {
                    synchronized (QoeOption.class) {
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

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public String getDesc(int i) {
        return this.desc_.get(i);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public ByteString getDescBytes(int i) {
        return ByteString.copyFromUtf8(this.desc_.get(i));
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public int getDescCount() {
        return this.desc_.size();
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public List<String> getDescList() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public String getImgUrl() {
        return this.imgUrl_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public ByteString getImgUrlBytes() {
        return ByteString.copyFromUtf8(this.imgUrl_);
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public float getScore() {
        return this.score_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v1.InterfaceC14917e
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static C14798b newBuilder(QoeOption qoeOption) {
        return DEFAULT_INSTANCE.createBuilder(qoeOption);
    }

    public static QoeOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QoeOption parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QoeOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QoeOption parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QoeOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QoeOption parseFrom(InputStream inputStream) throws IOException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeOption parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QoeOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
