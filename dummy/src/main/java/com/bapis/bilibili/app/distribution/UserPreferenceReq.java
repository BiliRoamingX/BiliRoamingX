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
public final class UserPreferenceReq extends GeneratedMessageLite<UserPreferenceReq, UserPreferenceReq.C4803b> implements MessageLiteOrBuilder {
    private static final UserPreferenceReq DEFAULT_INSTANCE;
    private static volatile Parser<UserPreferenceReq> PARSER;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.UserPreferenceReq$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C4802a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17001xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17001xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17001xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17001xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17001xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17001xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.UserPreferenceReq$b */
    /* loaded from: classes13.dex */
    public static final class C4803b extends GeneratedMessageLite.Builder<UserPreferenceReq, C4803b> implements MessageLiteOrBuilder {
        /* synthetic */ C4803b(C4802a c4802a) {
            this();
        }

        private C4803b() {
            super(UserPreferenceReq.DEFAULT_INSTANCE);
        }
    }

    static {
        UserPreferenceReq userPreferenceReq = new UserPreferenceReq();
        DEFAULT_INSTANCE = userPreferenceReq;
        GeneratedMessageLite.registerDefaultInstance(UserPreferenceReq.class, userPreferenceReq);
    }

    private UserPreferenceReq() {
    }

    public static UserPreferenceReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4803b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserPreferenceReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserPreferenceReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserPreferenceReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserPreferenceReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4802a c4802a = null;
        switch (C4802a.f17001xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserPreferenceReq();
            case 2:
                return new C4803b(c4802a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserPreferenceReq> parser = PARSER;
                if (parser == null) {
                    synchronized (UserPreferenceReq.class) {
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

    public static C4803b newBuilder(UserPreferenceReq userPreferenceReq) {
        return DEFAULT_INSTANCE.createBuilder(userPreferenceReq);
    }

    public static UserPreferenceReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserPreferenceReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserPreferenceReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserPreferenceReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserPreferenceReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserPreferenceReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserPreferenceReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserPreferenceReq parseFrom(InputStream inputStream) throws IOException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserPreferenceReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserPreferenceReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserPreferenceReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
