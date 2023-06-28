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
public final class ViewMaterial extends GeneratedMessageLite<ViewMaterial, ViewMaterial.Builder> implements ViewMaterialOrBuilder {
    public static final int AUTHOR_FIELD_NUMBER = 4;
    private static final ViewMaterial DEFAULT_INSTANCE;
    public static final int JUMPURL_FIELD_NUMBER = 5;
    public static final int MID_FIELD_NUMBER = 2;
    public static final int OID_FIELD_NUMBER = 1;
    private static volatile Parser<ViewMaterial> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    private long mid_;
    private long oid_;
    private String title_ = "";
    private String author_ = "";
    private String jumpUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ViewMaterial$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16851xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16851xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16851xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16851xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16851xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16851xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16851xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16851xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewMaterial, Builder> implements ViewMaterialOrBuilder {
        /* synthetic */ Builder(C68971 c68971) {
            this();
        }

        public Builder clearAuthor() {
            copyOnWrite();
            ((ViewMaterial) this.instance).clearAuthor();
            return this;
        }

        public Builder clearJumpUrl() {
            copyOnWrite();
            ((ViewMaterial) this.instance).clearJumpUrl();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((ViewMaterial) this.instance).clearMid();
            return this;
        }

        public Builder clearOid() {
            copyOnWrite();
            ((ViewMaterial) this.instance).clearOid();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ViewMaterial) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public String getAuthor() {
            return ((ViewMaterial) this.instance).getAuthor();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public ByteString getAuthorBytes() {
            return ((ViewMaterial) this.instance).getAuthorBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public String getJumpUrl() {
            return ((ViewMaterial) this.instance).getJumpUrl();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public ByteString getJumpUrlBytes() {
            return ((ViewMaterial) this.instance).getJumpUrlBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public long getMid() {
            return ((ViewMaterial) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public long getOid() {
            return ((ViewMaterial) this.instance).getOid();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public String getTitle() {
            return ((ViewMaterial) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
        public ByteString getTitleBytes() {
            return ((ViewMaterial) this.instance).getTitleBytes();
        }

        public Builder setAuthor(String str) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setAuthor(str);
            return this;
        }

        public Builder setAuthorBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setAuthorBytes(byteString);
            return this;
        }

        public Builder setJumpUrl(String str) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setJumpUrl(str);
            return this;
        }

        public Builder setJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setJumpUrlBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setMid(j);
            return this;
        }

        public Builder setOid(long j) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setOid(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewMaterial) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(ViewMaterial.DEFAULT_INSTANCE);
        }
    }

    static {
        ViewMaterial viewMaterial = new ViewMaterial();
        DEFAULT_INSTANCE = viewMaterial;
        GeneratedMessageLite.registerDefaultInstance(ViewMaterial.class, viewMaterial);
    }

    private ViewMaterial() {
    }

    public void clearAuthor() {
        this.author_ = getDefaultInstance().getAuthor();
    }

    public void clearJumpUrl() {
        this.jumpUrl_ = getDefaultInstance().getJumpUrl();
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearOid() {
        this.oid_ = 0L;
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ViewMaterial getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewMaterial parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewMaterial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewMaterial> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAuthor(String str) {
        str.getClass();
        this.author_ = str;
    }

    public void setAuthorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.author_ = byteString.toStringUtf8();
    }

    public void setJumpUrl(String str) {
        str.getClass();
        this.jumpUrl_ = str;
    }

    public void setJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.jumpUrl_ = byteString.toStringUtf8();
    }

    public void setMid(long j) {
        this.mid_ = j;
    }

    public void setOid(long j) {
        this.oid_ = j;
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68971.f16851xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewMaterial();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0208", new Object[]{"oid_", "mid_", "title_", "author_", "jumpUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewMaterial> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewMaterial.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public String getAuthor() {
        return this.author_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public ByteString getAuthorBytes() {
        return ByteString.copyFromUtf8(this.author_);
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public String getJumpUrl() {
        return this.jumpUrl_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public ByteString getJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.jumpUrl_);
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public long getOid() {
        return this.oid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ViewMaterialOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(ViewMaterial viewMaterial) {
        return DEFAULT_INSTANCE.createBuilder(viewMaterial);
    }

    public static ViewMaterial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewMaterial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewMaterial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewMaterial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewMaterial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewMaterial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewMaterial parseFrom(InputStream inputStream) throws IOException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewMaterial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewMaterial parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewMaterial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
