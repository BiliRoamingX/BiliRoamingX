package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class RepostExtraInfo extends GeneratedMessageLite<RepostExtraInfo, RepostExtraInfo.C5937b> implements MessageLiteOrBuilder {
    public static final int ADCM_ID_FIELD_NUMBER = 1;
    private static final RepostExtraInfo DEFAULT_INSTANCE;
    private static volatile Parser<RepostExtraInfo> PARSER;
    private String adcmId_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.RepostExtraInfo$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5936a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17457xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17457xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17457xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17457xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17457xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17457xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17457xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17457xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.RepostExtraInfo$b */
    /* loaded from: classes19.dex */
    public static final class C5937b extends GeneratedMessageLite.Builder<RepostExtraInfo, C5937b> implements MessageLiteOrBuilder {
        /* synthetic */ C5937b(C5936a c5936a) {
            this();
        }

        public C5937b clearAdcmId() {
            copyOnWrite();
            ((RepostExtraInfo) this.instance).clearAdcmId();
            return this;
        }

        public String getAdcmId() {
            return ((RepostExtraInfo) this.instance).getAdcmId();
        }

        public ByteString getAdcmIdBytes() {
            return ((RepostExtraInfo) this.instance).getAdcmIdBytes();
        }

        public C5937b setAdcmId(String str) {
            copyOnWrite();
            ((RepostExtraInfo) this.instance).setAdcmId(str);
            return this;
        }

        public C5937b setAdcmIdBytes(ByteString byteString) {
            copyOnWrite();
            ((RepostExtraInfo) this.instance).setAdcmIdBytes(byteString);
            return this;
        }

        private C5937b() {
            super(RepostExtraInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        RepostExtraInfo repostExtraInfo = new RepostExtraInfo();
        DEFAULT_INSTANCE = repostExtraInfo;
        GeneratedMessageLite.registerDefaultInstance(RepostExtraInfo.class, repostExtraInfo);
    }

    private RepostExtraInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdcmId() {
        this.adcmId_ = getDefaultInstance().getAdcmId();
    }

    public static RepostExtraInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5937b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RepostExtraInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RepostExtraInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RepostExtraInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RepostExtraInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdcmId(String str) {
        str.getClass();
        this.adcmId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdcmIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adcmId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5936a c5936a = null;
        switch (C5936a.f17457xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RepostExtraInfo();
            case 2:
                return new C5937b(c5936a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"adcmId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RepostExtraInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (RepostExtraInfo.class) {
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

    public String getAdcmId() {
        return this.adcmId_;
    }

    public ByteString getAdcmIdBytes() {
        return ByteString.copyFromUtf8(this.adcmId_);
    }

    public static C5937b newBuilder(RepostExtraInfo repostExtraInfo) {
        return DEFAULT_INSTANCE.createBuilder(repostExtraInfo);
    }

    public static RepostExtraInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RepostExtraInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RepostExtraInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RepostExtraInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RepostExtraInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RepostExtraInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RepostExtraInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RepostExtraInfo parseFrom(InputStream inputStream) throws IOException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RepostExtraInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RepostExtraInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RepostExtraInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RepostExtraInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
