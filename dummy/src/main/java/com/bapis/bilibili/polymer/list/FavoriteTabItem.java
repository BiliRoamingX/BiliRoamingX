package com.bapis.bilibili.polymer.list;

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
/* loaded from: classes23.dex */
public final class FavoriteTabItem extends GeneratedMessageLite<FavoriteTabItem, FavoriteTabItem.C13202b> implements InterfaceC13207a {
    private static final FavoriteTabItem DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<FavoriteTabItem> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 2;
    private String name_ = "";
    private String uri_ = "";
    private String type_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.list.FavoriteTabItem$a */
    /* loaded from: classes23.dex */
    static /* synthetic */ class C13201a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22233xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22233xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22233xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22233xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22233xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22233xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22233xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22233xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.list.FavoriteTabItem$b */
    /* loaded from: classes23.dex */
    public static final class C13202b extends GeneratedMessageLite.Builder<FavoriteTabItem, C13202b> implements InterfaceC13207a {
        /* synthetic */ C13202b(C13201a c13201a) {
            this();
        }

        public C13202b clearName() {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).clearName();
            return this;
        }

        public C13202b clearType() {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).clearType();
            return this;
        }

        public C13202b clearUri() {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
        public String getName() {
            return ((FavoriteTabItem) this.instance).getName();
        }

        @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
        public ByteString getNameBytes() {
            return ((FavoriteTabItem) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
        public String getType() {
            return ((FavoriteTabItem) this.instance).getType();
        }

        @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
        public ByteString getTypeBytes() {
            return ((FavoriteTabItem) this.instance).getTypeBytes();
        }

        @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
        public String getUri() {
            return ((FavoriteTabItem) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
        public ByteString getUriBytes() {
            return ((FavoriteTabItem) this.instance).getUriBytes();
        }

        public C13202b setName(String str) {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).setName(str);
            return this;
        }

        public C13202b setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).setNameBytes(byteString);
            return this;
        }

        public C13202b setType(String str) {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).setType(str);
            return this;
        }

        public C13202b setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).setTypeBytes(byteString);
            return this;
        }

        public C13202b setUri(String str) {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).setUri(str);
            return this;
        }

        public C13202b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((FavoriteTabItem) this.instance).setUriBytes(byteString);
            return this;
        }

        private C13202b() {
            super(FavoriteTabItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FavoriteTabItem favoriteTabItem = new FavoriteTabItem();
        DEFAULT_INSTANCE = favoriteTabItem;
        GeneratedMessageLite.registerDefaultInstance(FavoriteTabItem.class, favoriteTabItem);
    }

    public FavoriteTabItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static FavoriteTabItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13202b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FavoriteTabItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FavoriteTabItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteTabItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FavoriteTabItem> parser() {
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
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
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
        C13201a c13201a = null;
        switch (C13201a.f22233xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FavoriteTabItem();
            case 2:
                return new C13202b(c13201a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"name_", "uri_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FavoriteTabItem> parser = PARSER;
                if (parser == null) {
                    synchronized (FavoriteTabItem.class) {
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

    @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
    public String getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.polymer.list.InterfaceC13207a
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static C13202b newBuilder(FavoriteTabItem favoriteTabItem) {
        return DEFAULT_INSTANCE.createBuilder(favoriteTabItem);
    }

    public static FavoriteTabItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteTabItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FavoriteTabItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FavoriteTabItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FavoriteTabItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FavoriteTabItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FavoriteTabItem parseFrom(InputStream inputStream) throws IOException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteTabItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteTabItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FavoriteTabItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
