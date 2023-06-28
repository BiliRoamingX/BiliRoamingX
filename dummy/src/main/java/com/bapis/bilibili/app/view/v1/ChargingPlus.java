package com.bapis.bilibili.app.view.v1;

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
public final class ChargingPlus extends GeneratedMessageLite<ChargingPlus, ChargingPlus.Builder> implements MessageLiteOrBuilder {
    private static final ChargingPlus DEFAULT_INSTANCE;
    private static volatile Parser<ChargingPlus> PARSER = null;
    public static final int PASS_FIELD_NUMBER = 1;
    private boolean pass_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ChargingPlus$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16707xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16707xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16707xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16707xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16707xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16707xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16707xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16707xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ChargingPlus, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67331 c67331) {
            this();
        }

        public Builder clearPass() {
            copyOnWrite();
            ((ChargingPlus) this.instance).clearPass();
            return this;
        }

        public boolean getPass() {
            return ((ChargingPlus) this.instance).getPass();
        }

        public Builder setPass(boolean z) {
            copyOnWrite();
            ((ChargingPlus) this.instance).setPass(z);
            return this;
        }

        private Builder() {
            super(ChargingPlus.DEFAULT_INSTANCE);
        }
    }

    static {
        ChargingPlus chargingPlus = new ChargingPlus();
        DEFAULT_INSTANCE = chargingPlus;
        GeneratedMessageLite.registerDefaultInstance(ChargingPlus.class, chargingPlus);
    }

    private ChargingPlus() {
    }

    public void clearPass() {
        this.pass_ = false;
    }

    public static ChargingPlus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChargingPlus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChargingPlus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ChargingPlus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setPass(boolean z) {
        this.pass_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67331.f16707xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ChargingPlus();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"pass_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChargingPlus> parser = PARSER;
                if (parser == null) {
                    synchronized (ChargingPlus.class) {
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

    public boolean getPass() {
        return this.pass_;
    }

    public static Builder newBuilder(ChargingPlus chargingPlus) {
        return DEFAULT_INSTANCE.createBuilder(chargingPlus);
    }

    public static ChargingPlus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ChargingPlus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChargingPlus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(InputStream inputStream) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChargingPlus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChargingPlus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChargingPlus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChargingPlus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
