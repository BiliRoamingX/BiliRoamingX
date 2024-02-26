package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class NoteVideoTS extends GeneratedMessageLite<NoteVideoTS, NoteVideoTS.C5831b> implements MessageLiteOrBuilder {
    public static final int CID_COUNT_FIELD_NUMBER = 6;
    public static final int CID_FIELD_NUMBER = 1;
    private static final NoteVideoTS DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 10;
    public static final int EPID_FIELD_NUMBER = 9;
    public static final int INDEX_FIELD_NUMBER = 4;
    public static final int KEY_FIELD_NUMBER = 7;
    public static final int OID_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<NoteVideoTS> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 8;
    private long cidCount_;
    private long cid_;
    private long epid_;
    private long index_;
    private long oidType_;
    private long seconds_;
    private long status_;
    private String key_ = "";
    private String title_ = "";
    private String desc_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.NoteVideoTS$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5830a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17414xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17414xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17414xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17414xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17414xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17414xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17414xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17414xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.NoteVideoTS$b */
    /* loaded from: classes19.dex */
    public static final class C5831b extends GeneratedMessageLite.Builder<NoteVideoTS, C5831b> implements MessageLiteOrBuilder {
        /* synthetic */ C5831b(C5830a c5830a) {
            this();
        }

        public C5831b clearCid() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearCid();
            return this;
        }

        public C5831b clearCidCount() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearCidCount();
            return this;
        }

        public C5831b clearDesc() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearDesc();
            return this;
        }

        public C5831b clearEpid() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearEpid();
            return this;
        }

        public C5831b clearIndex() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearIndex();
            return this;
        }

        public C5831b clearKey() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearKey();
            return this;
        }

        public C5831b clearOidType() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearOidType();
            return this;
        }

        public C5831b clearSeconds() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearSeconds();
            return this;
        }

        public C5831b clearStatus() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearStatus();
            return this;
        }

        public C5831b clearTitle() {
            copyOnWrite();
            ((NoteVideoTS) this.instance).clearTitle();
            return this;
        }

        public long getCid() {
            return ((NoteVideoTS) this.instance).getCid();
        }

        public long getCidCount() {
            return ((NoteVideoTS) this.instance).getCidCount();
        }

        public String getDesc() {
            return ((NoteVideoTS) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((NoteVideoTS) this.instance).getDescBytes();
        }

        public long getEpid() {
            return ((NoteVideoTS) this.instance).getEpid();
        }

        public long getIndex() {
            return ((NoteVideoTS) this.instance).getIndex();
        }

        public String getKey() {
            return ((NoteVideoTS) this.instance).getKey();
        }

        public ByteString getKeyBytes() {
            return ((NoteVideoTS) this.instance).getKeyBytes();
        }

        public long getOidType() {
            return ((NoteVideoTS) this.instance).getOidType();
        }

        public long getSeconds() {
            return ((NoteVideoTS) this.instance).getSeconds();
        }

        public long getStatus() {
            return ((NoteVideoTS) this.instance).getStatus();
        }

        public String getTitle() {
            return ((NoteVideoTS) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((NoteVideoTS) this.instance).getTitleBytes();
        }

        public C5831b setCid(long j2) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setCid(j2);
            return this;
        }

        public C5831b setCidCount(long j2) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setCidCount(j2);
            return this;
        }

        public C5831b setDesc(String str) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setDesc(str);
            return this;
        }

        public C5831b setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setDescBytes(byteString);
            return this;
        }

        public C5831b setEpid(long j2) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setEpid(j2);
            return this;
        }

        public C5831b setIndex(long j2) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setIndex(j2);
            return this;
        }

        public C5831b setKey(String str) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setKey(str);
            return this;
        }

        public C5831b setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setKeyBytes(byteString);
            return this;
        }

        public C5831b setOidType(long j2) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setOidType(j2);
            return this;
        }

        public C5831b setSeconds(long j2) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setSeconds(j2);
            return this;
        }

        public C5831b setStatus(long j2) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setStatus(j2);
            return this;
        }

        public C5831b setTitle(String str) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setTitle(str);
            return this;
        }

        public C5831b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((NoteVideoTS) this.instance).setTitleBytes(byteString);
            return this;
        }

        private C5831b() {
            super(NoteVideoTS.DEFAULT_INSTANCE);
        }
    }

    static {
        NoteVideoTS noteVideoTS = new NoteVideoTS();
        DEFAULT_INSTANCE = noteVideoTS;
        GeneratedMessageLite.registerDefaultInstance(NoteVideoTS.class, noteVideoTS);
    }

    private NoteVideoTS() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCidCount() {
        this.cidCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpid() {
        this.epid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOidType() {
        this.oidType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static NoteVideoTS getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5831b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NoteVideoTS parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NoteVideoTS) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NoteVideoTS parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NoteVideoTS> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j2) {
        this.cid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCidCount(long j2) {
        this.cidCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpid(long j2) {
        this.epid_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOidType(long j2) {
        this.oidType_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long j2) {
        this.seconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(long j2) {
        this.status_ = j2;
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
        C5830a c5830a = null;
        switch (C5830a.f17414xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new NoteVideoTS();
            case 2:
                return new C5831b(c5830a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0208\b\u0208\t\u0002\n\u0208", new Object[]{"cid_", "oidType_", "status_", "index_", "seconds_", "cidCount_", "key_", "title_", "epid_", "desc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NoteVideoTS> parser = PARSER;
                if (parser == null) {
                    synchronized (NoteVideoTS.class) {
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

    public long getCid() {
        return this.cid_;
    }

    public long getCidCount() {
        return this.cidCount_;
    }

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public long getEpid() {
        return this.epid_;
    }

    public long getIndex() {
        return this.index_;
    }

    public String getKey() {
        return this.key_;
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    public long getOidType() {
        return this.oidType_;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    public long getStatus() {
        return this.status_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static C5831b newBuilder(NoteVideoTS noteVideoTS) {
        return DEFAULT_INSTANCE.createBuilder(noteVideoTS);
    }

    public static NoteVideoTS parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NoteVideoTS) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NoteVideoTS parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NoteVideoTS parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NoteVideoTS parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NoteVideoTS parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NoteVideoTS parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NoteVideoTS parseFrom(InputStream inputStream) throws IOException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NoteVideoTS parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NoteVideoTS parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NoteVideoTS parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NoteVideoTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
