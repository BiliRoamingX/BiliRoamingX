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
public final class DescV2 extends GeneratedMessageLite<DescV2, DescV2.Builder> implements DescV2OrBuilder {
    private static final DescV2 DEFAULT_INSTANCE;
    private static volatile Parser<DescV2> PARSER = null;
    public static final int RID_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 3;
    private long rid_;
    private int type_;
    private String text_ = "";
    private String uri_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.DescV2$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16980xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16980xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16980xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16980xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16980xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16980xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16980xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16980xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DescV2, Builder> implements DescV2OrBuilder {
        /* synthetic */ Builder(C69941 c69941) {
            this();
        }

        public Builder clearRid() {
            copyOnWrite();
            ((DescV2) this.instance).clearRid();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((DescV2) this.instance).clearText();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((DescV2) this.instance).clearType();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((DescV2) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
        public long getRid() {
            return ((DescV2) this.instance).getRid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
        public String getText() {
            return ((DescV2) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
        public ByteString getTextBytes() {
            return ((DescV2) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
        public DescType getType() {
            return ((DescV2) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
        public int getTypeValue() {
            return ((DescV2) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
        public String getUri() {
            return ((DescV2) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
        public ByteString getUriBytes() {
            return ((DescV2) this.instance).getUriBytes();
        }

        public Builder setRid(long j) {
            copyOnWrite();
            ((DescV2) this.instance).setRid(j);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((DescV2) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((DescV2) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setType(DescType descType) {
            copyOnWrite();
            ((DescV2) this.instance).setType(descType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((DescV2) this.instance).setTypeValue(i);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((DescV2) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((DescV2) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(DescV2.DEFAULT_INSTANCE);
        }
    }

    static {
        DescV2 descV2 = new DescV2();
        DEFAULT_INSTANCE = descV2;
        GeneratedMessageLite.registerDefaultInstance(DescV2.class, descV2);
    }

    private DescV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRid() {
        this.rid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static DescV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DescV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DescV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRid(long j) {
        this.rid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(DescType descType) {
        this.type_ = descType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
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
        switch (C69941.f16980xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DescV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0208\u0004\u0002", new Object[]{"text_", "type_", "uri_", "rid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DescV2> parser = PARSER;
                if (parser == null) {
                    synchronized (DescV2.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
    public long getRid() {
        return this.rid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
    public DescType getType() {
        DescType forNumber = DescType.forNumber(this.type_);
        return forNumber == null ? DescType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.DescV2OrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(DescV2 descV2) {
        return DEFAULT_INSTANCE.createBuilder(descV2);
    }

    public static DescV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DescV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DescV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DescV2 parseFrom(InputStream inputStream) throws IOException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DescV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
