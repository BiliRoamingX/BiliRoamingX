package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class SimpleReqUser extends GeneratedMessageLite<SimpleReqUser, SimpleReqUser.C8306b> implements MessageLiteOrBuilder {
    public static final int COIN_FIELD_NUMBER = 3;
    private static final SimpleReqUser DEFAULT_INSTANCE;
    public static final int FAVORITE_FIELD_NUMBER = 1;
    public static final int LIKE_FIELD_NUMBER = 2;
    private static volatile Parser<SimpleReqUser> PARSER;
    private int coin_;
    private int favorite_;
    private int like_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.SimpleReqUser$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C8305a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18370xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18370xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18370xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18370xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18370xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18370xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18370xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18370xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.SimpleReqUser$b */
    /* loaded from: classes20.dex */
    public static final class C8306b extends GeneratedMessageLite.Builder<SimpleReqUser, C8306b> implements MessageLiteOrBuilder {
        /* synthetic */ C8306b(C8305a c8305a) {
            this();
        }

        public C8306b clearCoin() {
            copyOnWrite();
            ((SimpleReqUser) this.instance).clearCoin();
            return this;
        }

        public C8306b clearFavorite() {
            copyOnWrite();
            ((SimpleReqUser) this.instance).clearFavorite();
            return this;
        }

        public C8306b clearLike() {
            copyOnWrite();
            ((SimpleReqUser) this.instance).clearLike();
            return this;
        }

        public int getCoin() {
            return ((SimpleReqUser) this.instance).getCoin();
        }

        public int getFavorite() {
            return ((SimpleReqUser) this.instance).getFavorite();
        }

        public int getLike() {
            return ((SimpleReqUser) this.instance).getLike();
        }

        public C8306b setCoin(int i2) {
            copyOnWrite();
            ((SimpleReqUser) this.instance).setCoin(i2);
            return this;
        }

        public C8306b setFavorite(int i2) {
            copyOnWrite();
            ((SimpleReqUser) this.instance).setFavorite(i2);
            return this;
        }

        public C8306b setLike(int i2) {
            copyOnWrite();
            ((SimpleReqUser) this.instance).setLike(i2);
            return this;
        }

        private C8306b() {
            super(SimpleReqUser.DEFAULT_INSTANCE);
        }
    }

    static {
        SimpleReqUser simpleReqUser = new SimpleReqUser();
        DEFAULT_INSTANCE = simpleReqUser;
        GeneratedMessageLite.registerDefaultInstance(SimpleReqUser.class, simpleReqUser);
    }

    private SimpleReqUser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoin() {
        this.coin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavorite() {
        this.favorite_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLike() {
        this.like_ = 0;
    }

    public static SimpleReqUser getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C8306b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SimpleReqUser parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SimpleReqUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleReqUser parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SimpleReqUser> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoin(int i2) {
        this.coin_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavorite(int i2) {
        this.favorite_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLike(int i2) {
        this.like_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C8305a c8305a = null;
        switch (C8305a.f18370xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SimpleReqUser();
            case 2:
                return new C8306b(c8305a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"favorite_", "like_", "coin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SimpleReqUser> parser = PARSER;
                if (parser == null) {
                    synchronized (SimpleReqUser.class) {
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

    public int getCoin() {
        return this.coin_;
    }

    public int getFavorite() {
        return this.favorite_;
    }

    public int getLike() {
        return this.like_;
    }

    public static C8306b newBuilder(SimpleReqUser simpleReqUser) {
        return DEFAULT_INSTANCE.createBuilder(simpleReqUser);
    }

    public static SimpleReqUser parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleReqUser) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleReqUser parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SimpleReqUser parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SimpleReqUser parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SimpleReqUser parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SimpleReqUser parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SimpleReqUser parseFrom(InputStream inputStream) throws IOException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleReqUser parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleReqUser parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SimpleReqUser parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleReqUser) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
