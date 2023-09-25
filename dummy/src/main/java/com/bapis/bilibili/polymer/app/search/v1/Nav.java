package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class Nav extends GeneratedMessageLite<Nav, Nav.Builder> implements NavOrBuilder {
    private static final Nav DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PAGES_FIELD_NUMBER = 3;
    private static volatile Parser<Nav> PARSER = null;
    public static final int SHOW_MORE_FIELD_NUMBER = 5;
    public static final int TOTAL_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    private String name_ = "";
    private int pages_;
    private int showMore_;
    private int total_;
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.Nav$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17682xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17682xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17682xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17682xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17682xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17682xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17682xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17682xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Nav, Builder> implements NavOrBuilder {
        /* synthetic */ Builder(C79801 c79801) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((Nav) this.instance).clearName();
            return this;
        }

        public Builder clearPages() {
            copyOnWrite();
            ((Nav) this.instance).clearPages();
            return this;
        }

        public Builder clearShowMore() {
            copyOnWrite();
            ((Nav) this.instance).clearShowMore();
            return this;
        }

        public Builder clearTotal() {
            copyOnWrite();
            ((Nav) this.instance).clearTotal();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Nav) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
        public String getName() {
            return ((Nav) this.instance).getName();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
        public ByteString getNameBytes() {
            return ((Nav) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
        public int getPages() {
            return ((Nav) this.instance).getPages();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
        public int getShowMore() {
            return ((Nav) this.instance).getShowMore();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
        public int getTotal() {
            return ((Nav) this.instance).getTotal();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
        public int getType() {
            return ((Nav) this.instance).getType();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Nav) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Nav) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPages(int i) {
            copyOnWrite();
            ((Nav) this.instance).setPages(i);
            return this;
        }

        public Builder setShowMore(int i) {
            copyOnWrite();
            ((Nav) this.instance).setShowMore(i);
            return this;
        }

        public Builder setTotal(int i) {
            copyOnWrite();
            ((Nav) this.instance).setTotal(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((Nav) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(Nav.DEFAULT_INSTANCE);
        }
    }

    static {
        Nav nav = new Nav();
        DEFAULT_INSTANCE = nav;
        GeneratedMessageLite.registerDefaultInstance(Nav.class, nav);
    }

    public Nav() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowMore() {
        this.showMore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotal() {
        this.total_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static Nav getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Nav parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Nav) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Nav parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Nav> parser() {
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
    public void setPages(int i) {
        this.pages_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowMore(int i) {
        this.showMore_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotal(int i) {
        this.total_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79801.f17682xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Nav();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"name_", "total_", "pages_", "type_", "showMore_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Nav> parser = PARSER;
                if (parser == null) {
                    synchronized (Nav.class) {
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

    @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
    public int getPages() {
        return this.pages_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
    public int getShowMore() {
        return this.showMore_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
    public int getTotal() {
        return this.total_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.NavOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(Nav nav) {
        return DEFAULT_INSTANCE.createBuilder(nav);
    }

    public static Nav parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Nav) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Nav parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Nav parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Nav parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Nav parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Nav parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Nav parseFrom(InputStream inputStream) throws IOException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Nav parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Nav parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Nav parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Nav) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
