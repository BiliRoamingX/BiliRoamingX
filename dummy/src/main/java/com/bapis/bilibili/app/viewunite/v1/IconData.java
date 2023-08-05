package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes17.dex */
public final class IconData extends GeneratedMessageLite<IconData, IconData.Builder> implements MessageLiteOrBuilder {
    private static final IconData DEFAULT_INSTANCE;
    public static final int META_JSON_FIELD_NUMBER = 1;
    private static volatile Parser<IconData> PARSER = null;
    public static final int SPRITS_IMG_FIELD_NUMBER = 2;
    private String metaJson_ = "";
    private String spritsImg_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.IconData$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71341 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17108xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17108xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17108xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17108xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17108xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17108xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17108xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17108xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<IconData, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71341 c71341) {
            this();
        }

        public Builder clearMetaJson() {
            copyOnWrite();
            ((IconData) this.instance).clearMetaJson();
            return this;
        }

        public Builder clearSpritsImg() {
            copyOnWrite();
            ((IconData) this.instance).clearSpritsImg();
            return this;
        }

        public String getMetaJson() {
            return ((IconData) this.instance).getMetaJson();
        }

        public ByteString getMetaJsonBytes() {
            return ((IconData) this.instance).getMetaJsonBytes();
        }

        public String getSpritsImg() {
            return ((IconData) this.instance).getSpritsImg();
        }

        public ByteString getSpritsImgBytes() {
            return ((IconData) this.instance).getSpritsImgBytes();
        }

        public Builder setMetaJson(String str) {
            copyOnWrite();
            ((IconData) this.instance).setMetaJson(str);
            return this;
        }

        public Builder setMetaJsonBytes(ByteString byteString) {
            copyOnWrite();
            ((IconData) this.instance).setMetaJsonBytes(byteString);
            return this;
        }

        public Builder setSpritsImg(String str) {
            copyOnWrite();
            ((IconData) this.instance).setSpritsImg(str);
            return this;
        }

        public Builder setSpritsImgBytes(ByteString byteString) {
            copyOnWrite();
            ((IconData) this.instance).setSpritsImgBytes(byteString);
            return this;
        }

        private Builder() {
            super(IconData.DEFAULT_INSTANCE);
        }
    }

    static {
        IconData iconData = new IconData();
        DEFAULT_INSTANCE = iconData;
        GeneratedMessageLite.registerDefaultInstance(IconData.class, iconData);
    }

    private IconData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetaJson() {
        this.metaJson_ = getDefaultInstance().getMetaJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpritsImg() {
        this.spritsImg_ = getDefaultInstance().getSpritsImg();
    }

    public static IconData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IconData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IconData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IconData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IconData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaJson(String str) {
        str.getClass();
        this.metaJson_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaJsonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.metaJson_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpritsImg(String str) {
        str.getClass();
        this.spritsImg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpritsImgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spritsImg_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71341.f17108xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new IconData();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"metaJson_", "spritsImg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IconData> parser = PARSER;
                if (parser == null) {
                    synchronized (IconData.class) {
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

    public String getMetaJson() {
        return this.metaJson_;
    }

    public ByteString getMetaJsonBytes() {
        return ByteString.copyFromUtf8(this.metaJson_);
    }

    public String getSpritsImg() {
        return this.spritsImg_;
    }

    public ByteString getSpritsImgBytes() {
        return ByteString.copyFromUtf8(this.spritsImg_);
    }

    public static Builder newBuilder(IconData iconData) {
        return DEFAULT_INSTANCE.createBuilder(iconData);
    }

    public static IconData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IconData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IconData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IconData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IconData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IconData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IconData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IconData parseFrom(InputStream inputStream) throws IOException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IconData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IconData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IconData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IconData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
