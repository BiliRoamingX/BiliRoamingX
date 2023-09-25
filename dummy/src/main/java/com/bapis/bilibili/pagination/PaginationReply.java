package com.bapis.bilibili.pagination;

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
/* loaded from: classes14.dex */
public final class PaginationReply extends GeneratedMessageLite<PaginationReply, PaginationReply.Builder> implements MessageLiteOrBuilder {
    private static final PaginationReply DEFAULT_INSTANCE;
    public static final int NEXT_FIELD_NUMBER = 1;
    private static volatile Parser<PaginationReply> PARSER = null;
    public static final int PREV_FIELD_NUMBER = 2;
    private String next_ = "";
    private String prev_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pagination.PaginationReply$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C77691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17504xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17504xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17504xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17504xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17504xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17504xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17504xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17504xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PaginationReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C77691 c77691) {
            this();
        }

        public Builder clearNext() {
            copyOnWrite();
            ((PaginationReply) this.instance).clearNext();
            return this;
        }

        public Builder clearPrev() {
            copyOnWrite();
            ((PaginationReply) this.instance).clearPrev();
            return this;
        }

        public String getNext() {
            return ((PaginationReply) this.instance).getNext();
        }

        public ByteString getNextBytes() {
            return ((PaginationReply) this.instance).getNextBytes();
        }

        public String getPrev() {
            return ((PaginationReply) this.instance).getPrev();
        }

        public ByteString getPrevBytes() {
            return ((PaginationReply) this.instance).getPrevBytes();
        }

        public Builder setNext(String str) {
            copyOnWrite();
            ((PaginationReply) this.instance).setNext(str);
            return this;
        }

        public Builder setNextBytes(ByteString byteString) {
            copyOnWrite();
            ((PaginationReply) this.instance).setNextBytes(byteString);
            return this;
        }

        public Builder setPrev(String str) {
            copyOnWrite();
            ((PaginationReply) this.instance).setPrev(str);
            return this;
        }

        public Builder setPrevBytes(ByteString byteString) {
            copyOnWrite();
            ((PaginationReply) this.instance).setPrevBytes(byteString);
            return this;
        }

        private Builder() {
            super(PaginationReply.DEFAULT_INSTANCE);
        }
    }

    static {
        PaginationReply paginationReply = new PaginationReply();
        DEFAULT_INSTANCE = paginationReply;
        GeneratedMessageLite.registerDefaultInstance(PaginationReply.class, paginationReply);
    }

    public PaginationReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNext() {
        this.next_ = getDefaultInstance().getNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrev() {
        this.prev_ = getDefaultInstance().getPrev();
    }

    public static PaginationReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PaginationReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PaginationReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaginationReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PaginationReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNext(String str) {
        str.getClass();
        this.next_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.next_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrev(String str) {
        str.getClass();
        this.prev_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.prev_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C77691.f17504xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PaginationReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"next_", "prev_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PaginationReply> parser = PARSER;
                if (parser == null) {
                    synchronized (PaginationReply.class) {
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

    public String getNext() {
        return this.next_;
    }

    public ByteString getNextBytes() {
        return ByteString.copyFromUtf8(this.next_);
    }

    public String getPrev() {
        return this.prev_;
    }

    public ByteString getPrevBytes() {
        return ByteString.copyFromUtf8(this.prev_);
    }

    public static Builder newBuilder(PaginationReply paginationReply) {
        return DEFAULT_INSTANCE.createBuilder(paginationReply);
    }

    public static PaginationReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaginationReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaginationReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PaginationReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PaginationReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PaginationReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PaginationReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PaginationReply parseFrom(InputStream inputStream) throws IOException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaginationReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaginationReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PaginationReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaginationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
