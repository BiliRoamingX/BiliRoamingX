package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class WikiInfo extends GeneratedMessageLite<WikiInfo, WikiInfo.Builder> implements MessageLiteOrBuilder {
    private static final WikiInfo DEFAULT_INSTANCE;
    private static volatile Parser<WikiInfo> PARSER = null;
    public static final int WIKI_LABEL_FIELD_NUMBER = 1;
    public static final int WIKI_URL_FIELD_NUMBER = 2;
    private String wikiLabel_ = "";
    private String wikiUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.WikiInfo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C69111 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16863xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16863xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16863xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16863xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16863xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16863xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16863xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16863xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<WikiInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69111 c69111) {
            this();
        }

        public Builder clearWikiLabel() {
            copyOnWrite();
            ((WikiInfo) this.instance).clearWikiLabel();
            return this;
        }

        public Builder clearWikiUrl() {
            copyOnWrite();
            ((WikiInfo) this.instance).clearWikiUrl();
            return this;
        }

        public String getWikiLabel() {
            return ((WikiInfo) this.instance).getWikiLabel();
        }

        public ByteString getWikiLabelBytes() {
            return ((WikiInfo) this.instance).getWikiLabelBytes();
        }

        public String getWikiUrl() {
            return ((WikiInfo) this.instance).getWikiUrl();
        }

        public ByteString getWikiUrlBytes() {
            return ((WikiInfo) this.instance).getWikiUrlBytes();
        }

        public Builder setWikiLabel(String str) {
            copyOnWrite();
            ((WikiInfo) this.instance).setWikiLabel(str);
            return this;
        }

        public Builder setWikiLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((WikiInfo) this.instance).setWikiLabelBytes(byteString);
            return this;
        }

        public Builder setWikiUrl(String str) {
            copyOnWrite();
            ((WikiInfo) this.instance).setWikiUrl(str);
            return this;
        }

        public Builder setWikiUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((WikiInfo) this.instance).setWikiUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(WikiInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        WikiInfo wikiInfo = new WikiInfo();
        DEFAULT_INSTANCE = wikiInfo;
        GeneratedMessageLite.registerDefaultInstance(WikiInfo.class, wikiInfo);
    }

    private WikiInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWikiLabel() {
        this.wikiLabel_ = getDefaultInstance().getWikiLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWikiUrl() {
        this.wikiUrl_ = getDefaultInstance().getWikiUrl();
    }

    public static WikiInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WikiInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WikiInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WikiInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WikiInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWikiLabel(String str) {
        str.getClass();
        this.wikiLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWikiLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wikiLabel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWikiUrl(String str) {
        str.getClass();
        this.wikiUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWikiUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.wikiUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69111.f16863xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new WikiInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"wikiLabel_", "wikiUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WikiInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (WikiInfo.class) {
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

    public String getWikiLabel() {
        return this.wikiLabel_;
    }

    public ByteString getWikiLabelBytes() {
        return ByteString.copyFromUtf8(this.wikiLabel_);
    }

    public String getWikiUrl() {
        return this.wikiUrl_;
    }

    public ByteString getWikiUrlBytes() {
        return ByteString.copyFromUtf8(this.wikiUrl_);
    }

    public static Builder newBuilder(WikiInfo wikiInfo) {
        return DEFAULT_INSTANCE.createBuilder(wikiInfo);
    }

    public static WikiInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WikiInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WikiInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WikiInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WikiInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WikiInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WikiInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WikiInfo parseFrom(InputStream inputStream) throws IOException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WikiInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WikiInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WikiInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WikiInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
