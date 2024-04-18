package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes20.dex */
public final class QoeInfo extends GeneratedMessageLite<QoeInfo, QoeInfo.C9093b> implements MessageLiteOrBuilder {
    private static final QoeInfo DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile Parser<QoeInfo> PARSER;
    private String info_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.QoeInfo$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C9092a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f18639xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f18639xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18639xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18639xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18639xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18639xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.QoeInfo$b */
    /* loaded from: classes20.dex */
    public static final class C9093b extends GeneratedMessageLite.Builder<QoeInfo, C9093b> implements MessageLiteOrBuilder {
        /* synthetic */ C9093b(C9092a c9092a) {
            this();
        }

        public C9093b clearInfo() {
            copyOnWrite();
            ((QoeInfo) this.instance).clearInfo();
            return this;
        }

        public String getInfo() {
            return ((QoeInfo) this.instance).getInfo();
        }

        public ByteString getInfoBytes() {
            return ((QoeInfo) this.instance).getInfoBytes();
        }

        public C9093b setInfo(String str) {
            copyOnWrite();
            ((QoeInfo) this.instance).setInfo(str);
            return this;
        }

        public C9093b setInfoBytes(ByteString byteString) {
            copyOnWrite();
            ((QoeInfo) this.instance).setInfoBytes(byteString);
            return this;
        }

        private C9093b() {
            super(QoeInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        QoeInfo qoeInfo = new QoeInfo();
        DEFAULT_INSTANCE = qoeInfo;
        GeneratedMessageLite.registerDefaultInstance(QoeInfo.class, qoeInfo);
    }

    private QoeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = getDefaultInstance().getInfo();
    }

    public static QoeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C9093b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QoeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<QoeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(String str) {
        str.getClass();
        this.info_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.info_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C9092a c9092a = null;
        switch (C9092a.f18639xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new QoeInfo();
            case 2:
                return new C9093b(c9092a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"info_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QoeInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (QoeInfo.class) {
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

    public String getInfo() {
        return this.info_;
    }

    public ByteString getInfoBytes() {
        return ByteString.copyFromUtf8(this.info_);
    }

    public static C9093b newBuilder(QoeInfo qoeInfo) {
        return DEFAULT_INSTANCE.createBuilder(qoeInfo);
    }

    public static QoeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QoeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QoeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(InputStream inputStream) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QoeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QoeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QoeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QoeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
