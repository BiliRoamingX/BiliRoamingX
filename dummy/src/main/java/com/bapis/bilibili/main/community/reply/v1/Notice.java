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
public final class Notice extends GeneratedMessageLite<Notice, Notice.C14773b> implements MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Notice DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LINK_FIELD_NUMBER = 3;
    private static volatile Parser<Notice> PARSER;
    private long id_;
    private String content_ = "";
    private String link_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Notice$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14772a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22006xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22006xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22006xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22006xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22006xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Notice$b */
    /* loaded from: classes21.dex */
    public static final class C14773b extends GeneratedMessageLite.Builder<Notice, C14773b> implements MessageLiteOrBuilder {
        /* synthetic */ C14773b(C14772a c14772a) {
            this();
        }

        public C14773b clearContent() {
            copyOnWrite();
            ((Notice) this.instance).clearContent();
            return this;
        }

        public C14773b clearId() {
            copyOnWrite();
            ((Notice) this.instance).clearId();
            return this;
        }

        public C14773b clearLink() {
            copyOnWrite();
            ((Notice) this.instance).clearLink();
            return this;
        }

        public String getContent() {
            return ((Notice) this.instance).getContent();
        }

        public ByteString getContentBytes() {
            return ((Notice) this.instance).getContentBytes();
        }

        public long getId() {
            return ((Notice) this.instance).getId();
        }

        public String getLink() {
            return ((Notice) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((Notice) this.instance).getLinkBytes();
        }

        public C14773b setContent(String str) {
            copyOnWrite();
            ((Notice) this.instance).setContent(str);
            return this;
        }

        public C14773b setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((Notice) this.instance).setContentBytes(byteString);
            return this;
        }

        public C14773b setId(long j) {
            copyOnWrite();
            ((Notice) this.instance).setId(j);
            return this;
        }

        public C14773b setLink(String str) {
            copyOnWrite();
            ((Notice) this.instance).setLink(str);
            return this;
        }

        public C14773b setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Notice) this.instance).setLinkBytes(byteString);
            return this;
        }

        private C14773b() {
            super(Notice.DEFAULT_INSTANCE);
        }
    }

    static {
        Notice notice = new Notice();
        DEFAULT_INSTANCE = notice;
        GeneratedMessageLite.registerDefaultInstance(Notice.class, notice);
    }

    private Notice() {
    }

    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    public void clearId() {
        this.id_ = 0L;
    }

    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    public static Notice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14773b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Notice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Notice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Notice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    public void setId(long j) {
        this.id_ = j;
    }

    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14772a.f22006xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Notice();
            case 2:
                return new C14773b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208", new Object[]{"id_", "content_", "link_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Notice> parser = PARSER;
                if (parser == null) {
                    synchronized (Notice.class) {
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

    public long getId() {
        return this.id_;
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public static C14773b newBuilder(Notice notice) {
        return DEFAULT_INSTANCE.createBuilder(notice);
    }

    public static Notice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Notice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Notice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Notice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Notice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Notice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Notice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Notice parseFrom(InputStream inputStream) throws IOException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Notice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Notice parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Notice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
