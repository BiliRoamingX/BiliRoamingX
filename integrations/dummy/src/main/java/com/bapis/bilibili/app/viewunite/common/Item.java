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
public final class Item extends GeneratedMessageLite<Item, Item.Builder> implements ItemOrBuilder {
    public static final int COVER_FIELD_NUMBER = 2;
    private static final Item DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile Parser<Item> PARSER;
    private String link_ = "";
    private String cover_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Item$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70051 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16989xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16989xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16989xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16989xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16989xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16989xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Item, Builder> implements ItemOrBuilder {
        /* synthetic */ Builder(C70051 c70051) {
            this();
        }

        public Builder clearCover() {
            copyOnWrite();
            ((Item) this.instance).clearCover();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((Item) this.instance).clearLink();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
        public String getCover() {
            return ((Item) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
        public ByteString getCoverBytes() {
            return ((Item) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
        public String getLink() {
            return ((Item) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
        public ByteString getLinkBytes() {
            return ((Item) this.instance).getLinkBytes();
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((Item) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Item) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((Item) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Item) this.instance).setLinkBytes(byteString);
            return this;
        }

        private Builder() {
            super(Item.DEFAULT_INSTANCE);
        }
    }

    static {
        Item item = new Item();
        DEFAULT_INSTANCE = item;
        GeneratedMessageLite.registerDefaultInstance(Item.class, item);
    }

    private Item() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    public static Item getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Item parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Item> parser() {
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
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70051.f16989xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Item();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"link_", "cover_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Item> parser = PARSER;
                if (parser == null) {
                    synchronized (Item.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ItemOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public static Builder newBuilder(Item item) {
        return DEFAULT_INSTANCE.createBuilder(item);
    }

    public static Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Item parseFrom(InputStream inputStream) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Item parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
