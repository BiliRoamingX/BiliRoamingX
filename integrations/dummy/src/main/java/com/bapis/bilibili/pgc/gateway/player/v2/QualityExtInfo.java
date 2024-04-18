package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class QualityExtInfo extends GeneratedMessageLite<QualityExtInfo, QualityExtInfo.Builder> implements MessageLiteOrBuilder {
    private static final QualityExtInfo DEFAULT_INSTANCE;
    private static volatile Parser<QualityExtInfo> PARSER = null;
    public static final int TRIAL_SUPPORT_FIELD_NUMBER = 1;
    private boolean trialSupport_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.QualityExtInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17588xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17588xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17588xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17588xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17588xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17588xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17588xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17588xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<QualityExtInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78731 c78731) {
            this();
        }

        public Builder clearTrialSupport() {
            copyOnWrite();
            ((QualityExtInfo) this.instance).clearTrialSupport();
            return this;
        }

        public boolean getTrialSupport() {
            return ((QualityExtInfo) this.instance).getTrialSupport();
        }

        public Builder setTrialSupport(boolean z) {
            copyOnWrite();
            ((QualityExtInfo) this.instance).setTrialSupport(z);
            return this;
        }

        private Builder() {
            super(QualityExtInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        QualityExtInfo qualityExtInfo = new QualityExtInfo();
        DEFAULT_INSTANCE = qualityExtInfo;
        GeneratedMessageLite.registerDefaultInstance(QualityExtInfo.class, qualityExtInfo);
    }

    private QualityExtInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrialSupport() {
        this.trialSupport_ = false;
    }

    public static QualityExtInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static QualityExtInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QualityExtInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QualityExtInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<QualityExtInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrialSupport(boolean z) {
        this.trialSupport_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78731.f17588xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new QualityExtInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"trialSupport_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<QualityExtInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (QualityExtInfo.class) {
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

    public boolean getTrialSupport() {
        return this.trialSupport_;
    }

    public static Builder newBuilder(QualityExtInfo qualityExtInfo) {
        return DEFAULT_INSTANCE.createBuilder(qualityExtInfo);
    }

    public static QualityExtInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QualityExtInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QualityExtInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static QualityExtInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static QualityExtInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static QualityExtInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QualityExtInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static QualityExtInfo parseFrom(InputStream inputStream) throws IOException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QualityExtInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static QualityExtInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static QualityExtInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QualityExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
