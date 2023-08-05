package com.bapis.bilibili.app.viewunite.common;

import com.bapis.bilibili.app.view.v1.RelateItemOrBuilder;
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
public final class RelateItem extends GeneratedMessageLite<RelateItem, RelateItem.Builder> implements RelateItemOrBuilder {
    public static final int COVER_FIELD_NUMBER = 2;
    private static final RelateItem DEFAULT_INSTANCE;
    private static volatile Parser<RelateItem> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int USE_DEFAULT_BROWSER_FIELD_NUMBER = 3;
    private boolean useDefaultBrowser_;
    private String url_ = "";
    private String cover_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateItem$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70451 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17025xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17025xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17025xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17025xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17025xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17025xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17025xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17025xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateItem, Builder> implements RelateItemOrBuilder {
        /* synthetic */ Builder(C70451 c70451) {
            this();
        }

        public Builder clearCover() {
            copyOnWrite();
            ((RelateItem) this.instance).clearCover();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((RelateItem) this.instance).clearUrl();
            return this;
        }

        public Builder clearUseDefaultBrowser() {
            copyOnWrite();
            ((RelateItem) this.instance).clearUseDefaultBrowser();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
        public String getCover() {
            return ((RelateItem) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
        public ByteString getCoverBytes() {
            return ((RelateItem) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
        public String getUrl() {
            return ((RelateItem) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
        public ByteString getUrlBytes() {
            return ((RelateItem) this.instance).getUrlBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
        public boolean getUseDefaultBrowser() {
            return ((RelateItem) this.instance).getUseDefaultBrowser();
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((RelateItem) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateItem) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((RelateItem) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateItem) this.instance).setUrlBytes(byteString);
            return this;
        }

        public Builder setUseDefaultBrowser(boolean z) {
            copyOnWrite();
            ((RelateItem) this.instance).setUseDefaultBrowser(z);
            return this;
        }

        private Builder() {
            super(RelateItem.DEFAULT_INSTANCE);
        }
    }

    static {
        RelateItem relateItem = new RelateItem();
        DEFAULT_INSTANCE = relateItem;
        GeneratedMessageLite.registerDefaultInstance(RelateItem.class, relateItem);
    }

    private RelateItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseDefaultBrowser() {
        this.useDefaultBrowser_ = false;
    }

    public static RelateItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseDefaultBrowser(boolean z) {
        this.useDefaultBrowser_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70451.f17025xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007", new Object[]{"url_", "cover_", "useDefaultBrowser_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateItem> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateItem.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.RelateItemOrBuilder
    public boolean getUseDefaultBrowser() {
        return this.useDefaultBrowser_;
    }

    public static Builder newBuilder(RelateItem relateItem) {
        return DEFAULT_INSTANCE.createBuilder(relateItem);
    }

    public static RelateItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateItem parseFrom(InputStream inputStream) throws IOException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
