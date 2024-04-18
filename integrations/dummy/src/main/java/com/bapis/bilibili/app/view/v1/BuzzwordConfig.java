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
public final class BuzzwordConfig extends GeneratedMessageLite<BuzzwordConfig, BuzzwordConfig.Builder> implements BuzzwordConfigOrBuilder {
    public static final int BUZZWORD_ID_FIELD_NUMBER = 8;
    private static final BuzzwordConfig DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 5;
    public static final int FOLLOW_CONTROL_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<BuzzwordConfig> PARSER = null;
    public static final int PICTURE_FIELD_NUMBER = 10;
    public static final int SCHEMA_FIELD_NUMBER = 2;
    public static final int SCHEMA_TYPE_FIELD_NUMBER = 9;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int START_FIELD_NUMBER = 4;
    private long buzzwordId_;
    private long end_;
    private boolean followControl_;
    private long id_;
    private int schemaType_;
    private int source_;
    private long start_;
    private String name_ = "";
    private String schema_ = "";
    private String picture_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.BuzzwordConfig$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16701xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16701xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16701xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16701xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16701xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16701xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16701xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16701xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BuzzwordConfig, Builder> implements BuzzwordConfigOrBuilder {
        /* synthetic */ Builder(C67261 c67261) {
            this();
        }

        public Builder clearBuzzwordId() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearBuzzwordId();
            return this;
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearEnd();
            return this;
        }

        public Builder clearFollowControl() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearFollowControl();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearName();
            return this;
        }

        public Builder clearPicture() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearPicture();
            return this;
        }

        public Builder clearSchema() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearSchema();
            return this;
        }

        public Builder clearSchemaType() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearSchemaType();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearSource();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearStart();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public long getBuzzwordId() {
            return ((BuzzwordConfig) this.instance).getBuzzwordId();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public long getEnd() {
            return ((BuzzwordConfig) this.instance).getEnd();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public boolean getFollowControl() {
            return ((BuzzwordConfig) this.instance).getFollowControl();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public long getId() {
            return ((BuzzwordConfig) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public String getName() {
            return ((BuzzwordConfig) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public ByteString getNameBytes() {
            return ((BuzzwordConfig) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public String getPicture() {
            return ((BuzzwordConfig) this.instance).getPicture();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public ByteString getPictureBytes() {
            return ((BuzzwordConfig) this.instance).getPictureBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public String getSchema() {
            return ((BuzzwordConfig) this.instance).getSchema();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public ByteString getSchemaBytes() {
            return ((BuzzwordConfig) this.instance).getSchemaBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public int getSchemaType() {
            return ((BuzzwordConfig) this.instance).getSchemaType();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public int getSource() {
            return ((BuzzwordConfig) this.instance).getSource();
        }

        @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
        public long getStart() {
            return ((BuzzwordConfig) this.instance).getStart();
        }

        public Builder setBuzzwordId(long j) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setBuzzwordId(j);
            return this;
        }

        public Builder setEnd(long j) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setEnd(j);
            return this;
        }

        public Builder setFollowControl(boolean z) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setFollowControl(z);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setId(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPicture(String str) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setPicture(str);
            return this;
        }

        public Builder setPictureBytes(ByteString byteString) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setPictureBytes(byteString);
            return this;
        }

        public Builder setSchema(String str) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setSchema(str);
            return this;
        }

        public Builder setSchemaBytes(ByteString byteString) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setSchemaBytes(byteString);
            return this;
        }

        public Builder setSchemaType(int i) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setSchemaType(i);
            return this;
        }

        public Builder setSource(int i) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setSource(i);
            return this;
        }

        public Builder setStart(long j) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setStart(j);
            return this;
        }

        private Builder() {
            super(BuzzwordConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        BuzzwordConfig buzzwordConfig = new BuzzwordConfig();
        DEFAULT_INSTANCE = buzzwordConfig;
        GeneratedMessageLite.registerDefaultInstance(BuzzwordConfig.class, buzzwordConfig);
    }

    private BuzzwordConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuzzwordId() {
        this.buzzwordId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowControl() {
        this.followControl_ = false;
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
    public void clearPicture() {
        this.picture_ = getDefaultInstance().getPicture();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0L;
    }

    public static BuzzwordConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BuzzwordConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BuzzwordConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BuzzwordConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuzzwordId(long j) {
        this.buzzwordId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(long j) {
        this.end_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowControl(boolean z) {
        this.followControl_ = z;
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
    public void setPicture(String str) {
        str.getClass();
        this.picture_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picture_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j) {
        this.start_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67261.f16701xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BuzzwordConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0002\u0005\u0002\u0006\u0007\u0007\u0002\b\u0002\t\u0004\n\u0208", new Object[]{"name_", "schema_", "source_", "start_", "end_", "followControl_", "id_", "buzzwordId_", "schemaType_", "picture_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BuzzwordConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (BuzzwordConfig.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public long getBuzzwordId() {
        return this.buzzwordId_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public long getEnd() {
        return this.end_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public boolean getFollowControl() {
        return this.followControl_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public String getPicture() {
        return this.picture_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public ByteString getPictureBytes() {
        return ByteString.copyFromUtf8(this.picture_);
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public String getSchema() {
        return this.schema_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public ByteString getSchemaBytes() {
        return ByteString.copyFromUtf8(this.schema_);
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public int getSchemaType() {
        return this.schemaType_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public int getSource() {
        return this.source_;
    }

    @Override // com.bapis.bilibili.app.view.v1.BuzzwordConfigOrBuilder
    public long getStart() {
        return this.start_;
    }

    public static Builder newBuilder(BuzzwordConfig buzzwordConfig) {
        return DEFAULT_INSTANCE.createBuilder(buzzwordConfig);
    }

    public static BuzzwordConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BuzzwordConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BuzzwordConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(InputStream inputStream) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BuzzwordConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BuzzwordConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
