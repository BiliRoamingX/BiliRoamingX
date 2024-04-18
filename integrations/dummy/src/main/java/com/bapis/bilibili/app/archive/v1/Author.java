package com.bapis.bilibili.app.archive.v1;

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
/* loaded from: classes12.dex */
public final class Author extends GeneratedMessageLite<Author, Author.Builder> implements MessageLiteOrBuilder {
    private static final Author DEFAULT_INSTANCE;
    public static final int FACE_FIELD_NUMBER = 3;
    public static final int MID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<Author> PARSER;
    private long mid_;
    private String name_ = "";
    private String face_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.archive.v1.Author$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C55161 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15726xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15726xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15726xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15726xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15726xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15726xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15726xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15726xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Author, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C55161 c55161) {
            this();
        }

        public Builder clearFace() {
            copyOnWrite();
            ((Author) this.instance).clearFace();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((Author) this.instance).clearMid();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Author) this.instance).clearName();
            return this;
        }

        public String getFace() {
            return ((Author) this.instance).getFace();
        }

        public ByteString getFaceBytes() {
            return ((Author) this.instance).getFaceBytes();
        }

        public long getMid() {
            return ((Author) this.instance).getMid();
        }

        public String getName() {
            return ((Author) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Author) this.instance).getNameBytes();
        }

        public Builder setFace(String str) {
            copyOnWrite();
            ((Author) this.instance).setFace(str);
            return this;
        }

        public Builder setFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((Author) this.instance).setFaceBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((Author) this.instance).setMid(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Author) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Author) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(Author.DEFAULT_INSTANCE);
        }
    }

    static {
        Author author = new Author();
        DEFAULT_INSTANCE = author;
        GeneratedMessageLite.registerDefaultInstance(Author.class, author);
    }

    private Author() {
    }

    public void clearFace() {
        this.face_ = getDefaultInstance().getFace();
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static Author getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Author parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Author) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Author parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Author> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setFace(String str) {
        str.getClass();
        this.face_ = str;
    }

    public void setFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.face_ = byteString.toStringUtf8();
    }

    public void setMid(long j) {
        this.mid_ = j;
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C55161.f15726xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Author();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208", new Object[]{"mid_", "name_", "face_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Author> parser = PARSER;
                if (parser == null) {
                    synchronized (Author.class) {
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

    public String getFace() {
        return this.face_;
    }

    public ByteString getFaceBytes() {
        return ByteString.copyFromUtf8(this.face_);
    }

    public long getMid() {
        return this.mid_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(Author author) {
        return DEFAULT_INSTANCE.createBuilder(author);
    }

    public static Author parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Author) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Author parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Author parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Author parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Author parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Author parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Author parseFrom(InputStream inputStream) throws IOException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Author parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Author parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Author parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Author) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
