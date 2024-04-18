package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class Tag extends GeneratedMessageLite<Tag, Tag.Builder> implements TagOrBuilder {
    private static final Tag DEFAULT_INSTANCE;
    public static final int HATED_FIELD_NUMBER = 6;
    public static final int HATES_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LIKED_FIELD_NUMBER = 5;
    public static final int LIKES_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<Tag> PARSER = null;
    public static final int TAG_TYPE_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 7;
    private int hated_;
    private long hates_;
    private long id_;
    private int liked_;
    private long likes_;
    private String name_ = "";
    private String uri_ = "";
    private String tagType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Tag$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16834xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16834xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16834xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16834xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16834xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16834xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16834xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16834xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Tag, Builder> implements TagOrBuilder {
        /* synthetic */ Builder(C68771 c68771) {
            this();
        }

        public Builder clearHated() {
            copyOnWrite();
            ((Tag) this.instance).clearHated();
            return this;
        }

        public Builder clearHates() {
            copyOnWrite();
            ((Tag) this.instance).clearHates();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Tag) this.instance).clearId();
            return this;
        }

        public Builder clearLiked() {
            copyOnWrite();
            ((Tag) this.instance).clearLiked();
            return this;
        }

        public Builder clearLikes() {
            copyOnWrite();
            ((Tag) this.instance).clearLikes();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Tag) this.instance).clearName();
            return this;
        }

        public Builder clearTagType() {
            copyOnWrite();
            ((Tag) this.instance).clearTagType();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((Tag) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public int getHated() {
            return ((Tag) this.instance).getHated();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public long getHates() {
            return ((Tag) this.instance).getHates();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public long getId() {
            return ((Tag) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public int getLiked() {
            return ((Tag) this.instance).getLiked();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public long getLikes() {
            return ((Tag) this.instance).getLikes();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public String getName() {
            return ((Tag) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public ByteString getNameBytes() {
            return ((Tag) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public String getTagType() {
            return ((Tag) this.instance).getTagType();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public ByteString getTagTypeBytes() {
            return ((Tag) this.instance).getTagTypeBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public String getUri() {
            return ((Tag) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
        public ByteString getUriBytes() {
            return ((Tag) this.instance).getUriBytes();
        }

        public Builder setHated(int i) {
            copyOnWrite();
            ((Tag) this.instance).setHated(i);
            return this;
        }

        public Builder setHates(long j) {
            copyOnWrite();
            ((Tag) this.instance).setHates(j);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((Tag) this.instance).setId(j);
            return this;
        }

        public Builder setLiked(int i) {
            copyOnWrite();
            ((Tag) this.instance).setLiked(i);
            return this;
        }

        public Builder setLikes(long j) {
            copyOnWrite();
            ((Tag) this.instance).setLikes(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Tag) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Tag) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setTagType(String str) {
            copyOnWrite();
            ((Tag) this.instance).setTagType(str);
            return this;
        }

        public Builder setTagTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Tag) this.instance).setTagTypeBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Tag) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Tag) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(Tag.DEFAULT_INSTANCE);
        }
    }

    static {
        Tag tag = new Tag();
        DEFAULT_INSTANCE = tag;
        GeneratedMessageLite.registerDefaultInstance(Tag.class, tag);
    }

    private Tag() {
    }

    public void clearHated() {
        this.hated_ = 0;
    }

    public void clearHates() {
        this.hates_ = 0L;
    }

    public void clearId() {
        this.id_ = 0L;
    }

    public void clearLiked() {
        this.liked_ = 0;
    }

    public void clearLikes() {
        this.likes_ = 0L;
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearTagType() {
        this.tagType_ = getDefaultInstance().getTagType();
    }

    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Tag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Tag parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Tag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Tag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Tag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setHated(int i) {
        this.hated_ = i;
    }

    public void setHates(long j) {
        this.hates_ = j;
    }

    public void setId(long j) {
        this.id_ = j;
    }

    public void setLiked(int i) {
        this.liked_ = i;
    }

    public void setLikes(long j) {
        this.likes_ = j;
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    public void setTagType(String str) {
        str.getClass();
        this.tagType_ = str;
    }

    public void setTagTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tagType_ = byteString.toStringUtf8();
    }

    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68771.f16834xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Tag();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0004\u0006\u0004\u0007\u0208\b\u0208", new Object[]{"id_", "name_", "likes_", "hates_", "liked_", "hated_", "uri_", "tagType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Tag> parser = PARSER;
                if (parser == null) {
                    synchronized (Tag.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public int getHated() {
        return this.hated_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public long getHates() {
        return this.hates_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public int getLiked() {
        return this.liked_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public long getLikes() {
        return this.likes_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public String getTagType() {
        return this.tagType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public ByteString getTagTypeBytes() {
        return ByteString.copyFromUtf8(this.tagType_);
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.view.v1.TagOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(Tag tag) {
        return DEFAULT_INSTANCE.createBuilder(tag);
    }

    public static Tag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Tag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Tag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Tag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Tag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Tag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Tag parseFrom(InputStream inputStream) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Tag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Tag parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Tag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
