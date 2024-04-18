package com.bapis.bilibili.app.distribution;

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
public final class SetUserPreferenceReply extends GeneratedMessageLite<SetUserPreferenceReply, SetUserPreferenceReply.C8324b> implements MessageLiteOrBuilder {
    private static final SetUserPreferenceReply DEFAULT_INSTANCE;
    private static volatile Parser<SetUserPreferenceReply> PARSER;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.SetUserPreferenceReply$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8323a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19922xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19922xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19922xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19922xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19922xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19922xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19922xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19922xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.SetUserPreferenceReply$b */
    /* loaded from: classes13.dex */
    public static final class C8324b extends GeneratedMessageLite.Builder<SetUserPreferenceReply, C8324b> implements MessageLiteOrBuilder {
        /* synthetic */ C8324b(C8323a c8323a) {
            this();
        }

        private C8324b() {
            super(SetUserPreferenceReply.DEFAULT_INSTANCE);
        }
    }

    static {
        SetUserPreferenceReply setUserPreferenceReply = new SetUserPreferenceReply();
        DEFAULT_INSTANCE = setUserPreferenceReply;
        GeneratedMessageLite.registerDefaultInstance(SetUserPreferenceReply.class, setUserPreferenceReply);
    }

    private SetUserPreferenceReply() {
    }

    public static SetUserPreferenceReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8324b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SetUserPreferenceReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetUserPreferenceReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SetUserPreferenceReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8323a.f19922xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SetUserPreferenceReply();
            case 2:
                return new C8324b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SetUserPreferenceReply> parser = PARSER;
                if (parser == null) {
                    synchronized (SetUserPreferenceReply.class) {
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

    public static C8324b newBuilder(SetUserPreferenceReply setUserPreferenceReply) {
        return DEFAULT_INSTANCE.createBuilder(setUserPreferenceReply);
    }

    public static SetUserPreferenceReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SetUserPreferenceReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SetUserPreferenceReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SetUserPreferenceReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SetUserPreferenceReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SetUserPreferenceReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SetUserPreferenceReply parseFrom(InputStream inputStream) throws IOException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetUserPreferenceReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SetUserPreferenceReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SetUserPreferenceReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SetUserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
