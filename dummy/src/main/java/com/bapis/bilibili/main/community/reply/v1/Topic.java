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
public final class Topic extends GeneratedMessageLite<Topic, Topic.C14885b> implements MessageLiteOrBuilder {
    private static final Topic DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile Parser<Topic> PARSER;
    private long id_;
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Topic$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14884a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22045xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22045xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22045xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22045xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22045xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22045xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22045xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22045xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Topic$b */
    /* loaded from: classes21.dex */
    public static final class C14885b extends GeneratedMessageLite.Builder<Topic, C14885b> implements MessageLiteOrBuilder {
        /* synthetic */ C14885b(C14884a c14884a) {
            this();
        }

        public C14885b clearId() {
            copyOnWrite();
            ((Topic) this.instance).clearId();
            return this;
        }

        public C14885b clearLink() {
            copyOnWrite();
            ((Topic) this.instance).clearLink();
            return this;
        }

        public long getId() {
            return ((Topic) this.instance).getId();
        }

        public String getLink() {
            return ((Topic) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((Topic) this.instance).getLinkBytes();
        }

        public C14885b setId(long j) {
            copyOnWrite();
            ((Topic) this.instance).setId(j);
            return this;
        }

        public C14885b setLink(String str) {
            copyOnWrite();
            ((Topic) this.instance).setLink(str);
            return this;
        }

        public C14885b setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Topic) this.instance).setLinkBytes(byteString);
            return this;
        }

        private C14885b() {
            super(Topic.DEFAULT_INSTANCE);
        }
    }

    static {
        Topic topic = new Topic();
        DEFAULT_INSTANCE = topic;
        GeneratedMessageLite.registerDefaultInstance(Topic.class, topic);
    }

    private Topic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    public static Topic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14885b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Topic parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Topic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Topic parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Topic> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14884a.f22045xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Topic();
            case 2:
                return new C14885b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0002", new Object[]{"link_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Topic> parser = PARSER;
                if (parser == null) {
                    synchronized (Topic.class) {
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

    public long getId() {
        return this.id_;
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public static C14885b newBuilder(Topic topic) {
        return DEFAULT_INSTANCE.createBuilder(topic);
    }

    public static Topic parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Topic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Topic parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Topic parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Topic parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Topic parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Topic parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Topic parseFrom(InputStream inputStream) throws IOException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Topic parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Topic parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Topic parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Topic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
