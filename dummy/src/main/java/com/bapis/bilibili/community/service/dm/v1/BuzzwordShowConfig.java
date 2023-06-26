package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class BuzzwordShowConfig extends GeneratedMessageLite<BuzzwordShowConfig, BuzzwordShowConfig.Builder> implements BuzzwordShowConfigOrBuilder {
    public static final int BUZZWORD_ID_FIELD_NUMBER = 5;
    private static final BuzzwordShowConfig DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<BuzzwordShowConfig> PARSER = null;
    public static final int SCHEMA_FIELD_NUMBER = 2;
    public static final int SCHEMA_TYPE_FIELD_NUMBER = 6;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private long buzzwordId_;
    private long id_;
    private int schemaType_;
    private int source_;
    private String name_ = "";
    private String schema_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17036xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17036xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17036xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BuzzwordShowConfig, Builder> implements BuzzwordShowConfigOrBuilder {
        /* synthetic */ Builder(C71891 c71891) {
            this();
        }

        public Builder clearBuzzwordId() {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).clearBuzzwordId();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).clearId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).clearName();
            return this;
        }

        public Builder clearSchema() {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).clearSchema();
            return this;
        }

        public Builder clearSchemaType() {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).clearSchemaType();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).clearSource();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public long getBuzzwordId() {
            return ((BuzzwordShowConfig) this.instance).getBuzzwordId();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public long getId() {
            return ((BuzzwordShowConfig) this.instance).getId();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public String getName() {
            return ((BuzzwordShowConfig) this.instance).getName();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public ByteString getNameBytes() {
            return ((BuzzwordShowConfig) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public String getSchema() {
            return ((BuzzwordShowConfig) this.instance).getSchema();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public ByteString getSchemaBytes() {
            return ((BuzzwordShowConfig) this.instance).getSchemaBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public int getSchemaType() {
            return ((BuzzwordShowConfig) this.instance).getSchemaType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
        public int getSource() {
            return ((BuzzwordShowConfig) this.instance).getSource();
        }

        public Builder setBuzzwordId(long j) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setBuzzwordId(j);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setId(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setSchema(String str) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setSchema(str);
            return this;
        }

        public Builder setSchemaBytes(ByteString byteString) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setSchemaBytes(byteString);
            return this;
        }

        public Builder setSchemaType(int i) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setSchemaType(i);
            return this;
        }

        public Builder setSource(int i) {
            copyOnWrite();
            ((BuzzwordShowConfig) this.instance).setSource(i);
            return this;
        }

        private Builder() {
            super(BuzzwordShowConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        BuzzwordShowConfig buzzwordShowConfig = new BuzzwordShowConfig();
        DEFAULT_INSTANCE = buzzwordShowConfig;
        GeneratedMessageLite.registerDefaultInstance(BuzzwordShowConfig.class, buzzwordShowConfig);
    }

    private BuzzwordShowConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuzzwordId() {
        this.buzzwordId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchema() {
        this.schema_ = getDefaultInstance().getSchema();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaType() {
        this.schemaType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static BuzzwordShowConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BuzzwordShowConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BuzzwordShowConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BuzzwordShowConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuzzwordId(long j) {
        this.buzzwordId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
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
    public void setSchema(String str) {
        str.getClass();
        this.schema_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.schema_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaType(int i) {
        this.schemaType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(int i) {
        this.source_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71891.f17036xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BuzzwordShowConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0002\u0005\u0002\u0006\u0004", new Object[]{"name_", "schema_", "source_", "id_", "buzzwordId_", "schemaType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BuzzwordShowConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (BuzzwordShowConfig.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public long getBuzzwordId() {
        return this.buzzwordId_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public String getSchema() {
        return this.schema_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public ByteString getSchemaBytes() {
        return ByteString.copyFromUtf8(this.schema_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public int getSchemaType() {
        return this.schemaType_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.BuzzwordShowConfigOrBuilder
    public int getSource() {
        return this.source_;
    }

    public static Builder newBuilder(BuzzwordShowConfig buzzwordShowConfig) {
        return DEFAULT_INSTANCE.createBuilder(buzzwordShowConfig);
    }

    public static BuzzwordShowConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BuzzwordShowConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BuzzwordShowConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BuzzwordShowConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BuzzwordShowConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BuzzwordShowConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BuzzwordShowConfig parseFrom(InputStream inputStream) throws IOException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BuzzwordShowConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BuzzwordShowConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BuzzwordShowConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordShowConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
