package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class Tag extends GeneratedMessageLite<Tag, Tag.Builder> implements TagOrBuilder {
    private static final Tag DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<Tag> PARSER = null;
    public static final int TAG_ID_FIELD_NUMBER = 1;
    public static final int TAG_TYPE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 3;
    private long tagId_;
    private String name_ = "";
    private String uri_ = "";
    private String tagType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Tag$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17045xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17045xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17045xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17045xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17045xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17045xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17045xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17045xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Tag, Builder> implements TagOrBuilder {
        /* synthetic */ Builder(C70681 c70681) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((Tag) this.instance).clearName();
            return this;
        }

        public Builder clearTagId() {
            copyOnWrite();
            ((Tag) this.instance).clearTagId();
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

        @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
        public String getName() {
            return ((Tag) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
        public ByteString getNameBytes() {
            return ((Tag) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
        public long getTagId() {
            return ((Tag) this.instance).getTagId();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
        public String getTagType() {
            return ((Tag) this.instance).getTagType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
        public ByteString getTagTypeBytes() {
            return ((Tag) this.instance).getTagTypeBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
        public String getUri() {
            return ((Tag) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
        public ByteString getUriBytes() {
            return ((Tag) this.instance).getUriBytes();
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

        public Builder setTagId(long j) {
            copyOnWrite();
            ((Tag) this.instance).setTagId(j);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagId() {
        this.tagId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagType() {
        this.tagType_ = getDefaultInstance().getTagType();
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagId(long j) {
        this.tagId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagType(String str) {
        str.getClass();
        this.tagType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tagType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70681.f17045xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Tag();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"tagId_", "name_", "uri_", "tagType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Tag> parser = PARSER;
                if (parser == null) {
                    synchronized (Tag.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
    public long getTagId() {
        return this.tagId_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
    public String getTagType() {
        return this.tagType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
    public ByteString getTagTypeBytes() {
        return ByteString.copyFromUtf8(this.tagType_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.TagOrBuilder
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
