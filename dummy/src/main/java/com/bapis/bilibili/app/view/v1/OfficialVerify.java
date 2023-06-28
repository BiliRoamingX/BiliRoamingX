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
public final class OfficialVerify extends GeneratedMessageLite<OfficialVerify, OfficialVerify.Builder> implements MessageLiteOrBuilder {
    private static final OfficialVerify DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 2;
    private static volatile Parser<OfficialVerify> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String desc_ = "";
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.OfficialVerify$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68011 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16767xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16767xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16767xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16767xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16767xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16767xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16767xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16767xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<OfficialVerify, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68011 c68011) {
            this();
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((OfficialVerify) this.instance).clearDesc();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((OfficialVerify) this.instance).clearType();
            return this;
        }

        public String getDesc() {
            return ((OfficialVerify) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((OfficialVerify) this.instance).getDescBytes();
        }

        public int getType() {
            return ((OfficialVerify) this.instance).getType();
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((OfficialVerify) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((OfficialVerify) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((OfficialVerify) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(OfficialVerify.DEFAULT_INSTANCE);
        }
    }

    static {
        OfficialVerify officialVerify = new OfficialVerify();
        DEFAULT_INSTANCE = officialVerify;
        GeneratedMessageLite.registerDefaultInstance(OfficialVerify.class, officialVerify);
    }

    private OfficialVerify() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static OfficialVerify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OfficialVerify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OfficialVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OfficialVerify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OfficialVerify> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68011.f16767xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OfficialVerify();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0208", new Object[]{"type_", "desc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OfficialVerify> parser = PARSER;
                if (parser == null) {
                    synchronized (OfficialVerify.class) {
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

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(OfficialVerify officialVerify) {
        return DEFAULT_INSTANCE.createBuilder(officialVerify);
    }

    public static OfficialVerify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OfficialVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OfficialVerify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OfficialVerify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OfficialVerify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OfficialVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OfficialVerify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OfficialVerify parseFrom(InputStream inputStream) throws IOException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OfficialVerify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OfficialVerify parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OfficialVerify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OfficialVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
