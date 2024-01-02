package com.bapis.bilibili.pagination;

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
/* loaded from: classes22.dex */
public final class FeedPaginationReply extends GeneratedMessageLite<FeedPaginationReply, FeedPaginationReply.C15554b> implements InterfaceC15561a {
    private static final FeedPaginationReply DEFAULT_INSTANCE;
    public static final int LAST_READ_OFFSET_FIELD_NUMBER = 3;
    public static final int NEXT_OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FeedPaginationReply> PARSER = null;
    public static final int PREV_OFFSET_FIELD_NUMBER = 2;
    private String nextOffset_ = "";
    private String prevOffset_ = "";
    private String lastReadOffset_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pagination.FeedPaginationReply$a */
    /* loaded from: classes22.dex */
    static /* synthetic */ class C15553a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22278xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22278xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22278xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22278xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22278xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22278xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22278xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22278xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pagination.FeedPaginationReply$b */
    /* loaded from: classes22.dex */
    public static final class C15554b extends GeneratedMessageLite.Builder<FeedPaginationReply, C15554b> implements InterfaceC15561a {
        /* synthetic */ C15554b(C15553a c15553a) {
            this();
        }

        public C15554b clearLastReadOffset() {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).clearLastReadOffset();
            return this;
        }

        public C15554b clearNextOffset() {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).clearNextOffset();
            return this;
        }

        public C15554b clearPrevOffset() {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).clearPrevOffset();
            return this;
        }

        @Override // com.bapis.bilibili.pagination.InterfaceC15561a
        public String getLastReadOffset() {
            return ((FeedPaginationReply) this.instance).getLastReadOffset();
        }

        @Override // com.bapis.bilibili.pagination.InterfaceC15561a
        public ByteString getLastReadOffsetBytes() {
            return ((FeedPaginationReply) this.instance).getLastReadOffsetBytes();
        }

        @Override // com.bapis.bilibili.pagination.InterfaceC15561a
        public String getNextOffset() {
            return ((FeedPaginationReply) this.instance).getNextOffset();
        }

        @Override // com.bapis.bilibili.pagination.InterfaceC15561a
        public ByteString getNextOffsetBytes() {
            return ((FeedPaginationReply) this.instance).getNextOffsetBytes();
        }

        @Override // com.bapis.bilibili.pagination.InterfaceC15561a
        public String getPrevOffset() {
            return ((FeedPaginationReply) this.instance).getPrevOffset();
        }

        @Override // com.bapis.bilibili.pagination.InterfaceC15561a
        public ByteString getPrevOffsetBytes() {
            return ((FeedPaginationReply) this.instance).getPrevOffsetBytes();
        }

        public C15554b setLastReadOffset(String str) {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).setLastReadOffset(str);
            return this;
        }

        public C15554b setLastReadOffsetBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).setLastReadOffsetBytes(byteString);
            return this;
        }

        public C15554b setNextOffset(String str) {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).setNextOffset(str);
            return this;
        }

        public C15554b setNextOffsetBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).setNextOffsetBytes(byteString);
            return this;
        }

        public C15554b setPrevOffset(String str) {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).setPrevOffset(str);
            return this;
        }

        public C15554b setPrevOffsetBytes(ByteString byteString) {
            copyOnWrite();
            ((FeedPaginationReply) this.instance).setPrevOffsetBytes(byteString);
            return this;
        }

        private C15554b() {
            super(FeedPaginationReply.DEFAULT_INSTANCE);
        }
    }

    static {
        FeedPaginationReply feedPaginationReply = new FeedPaginationReply();
        DEFAULT_INSTANCE = feedPaginationReply;
        GeneratedMessageLite.registerDefaultInstance(FeedPaginationReply.class, feedPaginationReply);
    }

    private FeedPaginationReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastReadOffset() {
        this.lastReadOffset_ = getDefaultInstance().getLastReadOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextOffset() {
        this.nextOffset_ = getDefaultInstance().getNextOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrevOffset() {
        this.prevOffset_ = getDefaultInstance().getPrevOffset();
    }

    public static FeedPaginationReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C15554b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FeedPaginationReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FeedPaginationReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedPaginationReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FeedPaginationReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastReadOffset(String str) {
        str.getClass();
        this.lastReadOffset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastReadOffsetBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastReadOffset_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextOffset(String str) {
        str.getClass();
        this.nextOffset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextOffsetBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nextOffset_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevOffset(String str) {
        str.getClass();
        this.prevOffset_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevOffsetBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.prevOffset_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C15553a.f22278xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FeedPaginationReply();
            case 2:
                return new C15554b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"nextOffset_", "prevOffset_", "lastReadOffset_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FeedPaginationReply> parser = PARSER;
                if (parser == null) {
                    synchronized (FeedPaginationReply.class) {
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

    @Override // com.bapis.bilibili.pagination.InterfaceC15561a
    public String getLastReadOffset() {
        return this.lastReadOffset_;
    }

    @Override // com.bapis.bilibili.pagination.InterfaceC15561a
    public ByteString getLastReadOffsetBytes() {
        return ByteString.copyFromUtf8(this.lastReadOffset_);
    }

    @Override // com.bapis.bilibili.pagination.InterfaceC15561a
    public String getNextOffset() {
        return this.nextOffset_;
    }

    @Override // com.bapis.bilibili.pagination.InterfaceC15561a
    public ByteString getNextOffsetBytes() {
        return ByteString.copyFromUtf8(this.nextOffset_);
    }

    @Override // com.bapis.bilibili.pagination.InterfaceC15561a
    public String getPrevOffset() {
        return this.prevOffset_;
    }

    @Override // com.bapis.bilibili.pagination.InterfaceC15561a
    public ByteString getPrevOffsetBytes() {
        return ByteString.copyFromUtf8(this.prevOffset_);
    }

    public static C15554b newBuilder(FeedPaginationReply feedPaginationReply) {
        return DEFAULT_INSTANCE.createBuilder(feedPaginationReply);
    }

    public static FeedPaginationReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedPaginationReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedPaginationReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FeedPaginationReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FeedPaginationReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FeedPaginationReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeedPaginationReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FeedPaginationReply parseFrom(InputStream inputStream) throws IOException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedPaginationReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeedPaginationReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FeedPaginationReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeedPaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
