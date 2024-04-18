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
public final class Vote extends GeneratedMessageLite<Vote, Vote.C14908b> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final Vote DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Vote> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private long count_;
    private long id_;
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Vote$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14907a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22052xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22052xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22052xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22052xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22052xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22052xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22052xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22052xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Vote$b */
    /* loaded from: classes21.dex */
    public static final class C14908b extends GeneratedMessageLite.Builder<Vote, C14908b> implements MessageLiteOrBuilder {
        /* synthetic */ C14908b(C14907a c14907a) {
            this();
        }

        public C14908b clearCount() {
            copyOnWrite();
            ((Vote) this.instance).clearCount();
            return this;
        }

        public C14908b clearId() {
            copyOnWrite();
            ((Vote) this.instance).clearId();
            return this;
        }

        public C14908b clearTitle() {
            copyOnWrite();
            ((Vote) this.instance).clearTitle();
            return this;
        }

        public long getCount() {
            return ((Vote) this.instance).getCount();
        }

        public long getId() {
            return ((Vote) this.instance).getId();
        }

        public String getTitle() {
            return ((Vote) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Vote) this.instance).getTitleBytes();
        }

        public C14908b setCount(long j) {
            copyOnWrite();
            ((Vote) this.instance).setCount(j);
            return this;
        }

        public C14908b setId(long j) {
            copyOnWrite();
            ((Vote) this.instance).setId(j);
            return this;
        }

        public C14908b setTitle(String str) {
            copyOnWrite();
            ((Vote) this.instance).setTitle(str);
            return this;
        }

        public C14908b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Vote) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C14908b() {
            super(Vote.DEFAULT_INSTANCE);
        }
    }

    static {
        Vote vote = new Vote();
        DEFAULT_INSTANCE = vote;
        GeneratedMessageLite.registerDefaultInstance(Vote.class, vote);
    }

    private Vote() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Vote getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C14908b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Vote parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Vote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Vote parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Vote> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
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
        switch (C14907a.f22052xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Vote();
            case 2:
                return new C14908b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002", new Object[]{"id_", "title_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Vote> parser = PARSER;
                if (parser == null) {
                    synchronized (Vote.class) {
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

    public long getCount() {
        return this.count_;
    }

    public long getId() {
        return this.id_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static C14908b newBuilder(Vote vote) {
        return DEFAULT_INSTANCE.createBuilder(vote);
    }

    public static Vote parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Vote) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Vote parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Vote parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Vote parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Vote parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Vote parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Vote parseFrom(InputStream inputStream) throws IOException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Vote parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Vote parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Vote parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Vote) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
