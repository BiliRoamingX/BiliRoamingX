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
public final class Pagination extends GeneratedMessageLite<Pagination, Pagination.Builder> implements MessageLiteOrBuilder {
    private static final Pagination DEFAULT_INSTANCE;
    public static final int NEXT_FIELD_NUMBER = 2;
    public static final int PAGE_SIZE_FIELD_NUMBER = 1;
    private static volatile Parser<Pagination> PARSER;
    private String next_ = "";
    private int pageSize_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pagination.Pagination$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C77681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17503xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17503xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17503xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17503xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17503xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17503xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17503xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17503xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Pagination, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C77681 c77681) {
            this();
        }

        public Builder clearNext() {
            copyOnWrite();
            ((Pagination) this.instance).clearNext();
            return this;
        }

        public Builder clearPageSize() {
            copyOnWrite();
            ((Pagination) this.instance).clearPageSize();
            return this;
        }

        public String getNext() {
            return ((Pagination) this.instance).getNext();
        }

        public ByteString getNextBytes() {
            return ((Pagination) this.instance).getNextBytes();
        }

        public int getPageSize() {
            return ((Pagination) this.instance).getPageSize();
        }

        public Builder setNext(String str) {
            copyOnWrite();
            ((Pagination) this.instance).setNext(str);
            return this;
        }

        public Builder setNextBytes(ByteString byteString) {
            copyOnWrite();
            ((Pagination) this.instance).setNextBytes(byteString);
            return this;
        }

        public Builder setPageSize(int i) {
            copyOnWrite();
            ((Pagination) this.instance).setPageSize(i);
            return this;
        }

        private Builder() {
            super(Pagination.DEFAULT_INSTANCE);
        }
    }

    static {
        Pagination pagination = new Pagination();
        DEFAULT_INSTANCE = pagination;
        GeneratedMessageLite.registerDefaultInstance(Pagination.class, pagination);
    }

    private Pagination() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNext() {
        this.next_ = getDefaultInstance().getNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    public static Pagination getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pagination parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Pagination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pagination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pagination> parser() {
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
    public void setPageSize(int i) {
        this.pageSize_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C77681.f17503xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Pagination();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0208", new Object[]{"pageSize_", "next_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pagination> parser = PARSER;
                if (parser == null) {
                    synchronized (Pagination.class) {
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

    public int getPageSize() {
        return this.pageSize_;
    }

    public static Builder newBuilder(Pagination pagination) {
        return DEFAULT_INSTANCE.createBuilder(pagination);
    }

    public static Pagination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Pagination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pagination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pagination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pagination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pagination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pagination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pagination parseFrom(InputStream inputStream) throws IOException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pagination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pagination parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pagination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Pagination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
