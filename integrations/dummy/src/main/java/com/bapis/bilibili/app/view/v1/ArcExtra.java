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
public final class ArcExtra extends GeneratedMessageLite<ArcExtra, ArcExtra.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_PUB_LOCATION_FIELD_NUMBER = 1;
    private static final ArcExtra DEFAULT_INSTANCE;
    private static volatile Parser<ArcExtra> PARSER;
    private String arcPubLocation_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ArcExtra$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67081 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16684xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16684xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16684xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16684xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16684xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16684xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16684xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16684xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ArcExtra, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67081 c67081) {
            this();
        }

        public Builder clearArcPubLocation() {
            copyOnWrite();
            ((ArcExtra) this.instance).clearArcPubLocation();
            return this;
        }

        public String getArcPubLocation() {
            return ((ArcExtra) this.instance).getArcPubLocation();
        }

        public ByteString getArcPubLocationBytes() {
            return ((ArcExtra) this.instance).getArcPubLocationBytes();
        }

        public Builder setArcPubLocation(String str) {
            copyOnWrite();
            ((ArcExtra) this.instance).setArcPubLocation(str);
            return this;
        }

        public Builder setArcPubLocationBytes(ByteString byteString) {
            copyOnWrite();
            ((ArcExtra) this.instance).setArcPubLocationBytes(byteString);
            return this;
        }

        private Builder() {
            super(ArcExtra.DEFAULT_INSTANCE);
        }
    }

    static {
        ArcExtra arcExtra = new ArcExtra();
        DEFAULT_INSTANCE = arcExtra;
        GeneratedMessageLite.registerDefaultInstance(ArcExtra.class, arcExtra);
    }

    private ArcExtra() {
    }

    public void clearArcPubLocation() {
        this.arcPubLocation_ = getDefaultInstance().getArcPubLocation();
    }

    public static ArcExtra getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArcExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArcExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcExtra parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ArcExtra> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setArcPubLocation(String str) {
        str.getClass();
        this.arcPubLocation_ = str;
    }

    public void setArcPubLocationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.arcPubLocation_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67081.f16684xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ArcExtra();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"arcPubLocation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ArcExtra> parser = PARSER;
                if (parser == null) {
                    synchronized (ArcExtra.class) {
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

    public String getArcPubLocation() {
        return this.arcPubLocation_;
    }

    public ByteString getArcPubLocationBytes() {
        return ByteString.copyFromUtf8(this.arcPubLocation_);
    }

    public static Builder newBuilder(ArcExtra arcExtra) {
        return DEFAULT_INSTANCE.createBuilder(arcExtra);
    }

    public static ArcExtra parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcExtra parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ArcExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArcExtra parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ArcExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArcExtra parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ArcExtra parseFrom(InputStream inputStream) throws IOException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArcExtra parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ArcExtra parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ArcExtra parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArcExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
