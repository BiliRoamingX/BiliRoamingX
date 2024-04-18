package com.bapis.bilibili.app.viewunite.ugcanymodel;

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
/* loaded from: classes21.dex */
public final class AiExtra extends GeneratedMessageLite<AiExtra, AiExtra.b> implements MessageLiteOrBuilder {
    private static final AiExtra DEFAULT_INSTANCE;
    private static volatile Parser<AiExtra> PARSER = null;
    public static final int TRACK_ID_FIELD_NUMBER = 1;
    private String trackId_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<AiExtra, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearTrackId() {
            copyOnWrite();
            ((AiExtra) this.instance).clearTrackId();
            return this;
        }

        public String getTrackId() {
            return ((AiExtra) this.instance).getTrackId();
        }

        public ByteString getTrackIdBytes() {
            return ((AiExtra) this.instance).getTrackIdBytes();
        }

        public b setTrackId(String str) {
            copyOnWrite();
            ((AiExtra) this.instance).setTrackId(str);
            return this;
        }

        public b setTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((AiExtra) this.instance).setTrackIdBytes(byteString);
            return this;
        }

        private b() {
            super(AiExtra.DEFAULT_INSTANCE);
        }
    }

    static {
        AiExtra aiExtra = new AiExtra();
        DEFAULT_INSTANCE = aiExtra;
        GeneratedMessageLite.registerDefaultInstance(AiExtra.class, aiExtra);
    }

    private AiExtra() {
    }

    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    public static AiExtra getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AiExtra parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AiExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AiExtra parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AiExtra> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    public void setTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AiExtra();
            case 2:
                return new b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"trackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AiExtra> parser = PARSER;
                if (parser == null) {
                    synchronized (AiExtra.class) {
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

    public String getTrackId() {
        return this.trackId_;
    }

    public ByteString getTrackIdBytes() {
        return ByteString.copyFromUtf8(this.trackId_);
    }

    public static b newBuilder(AiExtra aiExtra) {
        return DEFAULT_INSTANCE.createBuilder(aiExtra);
    }

    public static AiExtra parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AiExtra) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AiExtra parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AiExtra parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AiExtra parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AiExtra parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AiExtra parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AiExtra parseFrom(InputStream inputStream) throws IOException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AiExtra parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AiExtra parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AiExtra parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AiExtra) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
