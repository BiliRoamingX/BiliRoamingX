package com.bapis.bilibili.polymer.list;

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
/* loaded from: classes23.dex */
public final class FavoriteTabReq extends GeneratedMessageLite<FavoriteTabReq, FavoriteTabReq.C13206b> implements MessageLiteOrBuilder {
    private static final FavoriteTabReq DEFAULT_INSTANCE;
    private static volatile Parser<FavoriteTabReq> PARSER;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.list.FavoriteTabReq$a */
    /* loaded from: classes23.dex */
    static /* synthetic */ class C13205a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22235xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22235xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22235xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22235xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22235xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22235xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22235xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22235xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.list.FavoriteTabReq$b */
    /* loaded from: classes23.dex */
    public static final class C13206b extends GeneratedMessageLite.Builder<FavoriteTabReq, C13206b> implements MessageLiteOrBuilder {
        /* synthetic */ C13206b(C13205a c13205a) {
            this();
        }

        private C13206b() {
            super(FavoriteTabReq.DEFAULT_INSTANCE);
        }
    }

    static {
        FavoriteTabReq favoriteTabReq = new FavoriteTabReq();
        DEFAULT_INSTANCE = favoriteTabReq;
        GeneratedMessageLite.registerDefaultInstance(FavoriteTabReq.class, favoriteTabReq);
    }

    private FavoriteTabReq() {
    }

    public static FavoriteTabReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13206b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FavoriteTabReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FavoriteTabReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteTabReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FavoriteTabReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C13205a c13205a = null;
        switch (C13205a.f22235xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FavoriteTabReq();
            case 2:
                return new C13206b(c13205a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FavoriteTabReq> parser = PARSER;
                if (parser == null) {
                    synchronized (FavoriteTabReq.class) {
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

    public static C13206b newBuilder(FavoriteTabReq favoriteTabReq) {
        return DEFAULT_INSTANCE.createBuilder(favoriteTabReq);
    }

    public static FavoriteTabReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteTabReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FavoriteTabReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FavoriteTabReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FavoriteTabReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FavoriteTabReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FavoriteTabReq parseFrom(InputStream inputStream) throws IOException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FavoriteTabReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FavoriteTabReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FavoriteTabReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FavoriteTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
