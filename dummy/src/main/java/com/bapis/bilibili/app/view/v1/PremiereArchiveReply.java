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
public final class PremiereArchiveReply extends GeneratedMessageLite<PremiereArchiveReply, PremiereArchiveReply.Builder> implements MessageLiteOrBuilder {
    private static final PremiereArchiveReply DEFAULT_INSTANCE;
    private static volatile Parser<PremiereArchiveReply> PARSER = null;
    public static final int PREMIERE_FIELD_NUMBER = 1;
    public static final int RISK_REASON_FIELD_NUMBER = 3;
    public static final int RISK_STATUS_FIELD_NUMBER = 2;
    private Premiere premiere_;
    private String riskReason_ = "";
    private boolean riskStatus_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PremiereArchiveReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68241 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16786xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16786xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16786xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16786xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16786xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16786xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16786xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16786xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PremiereArchiveReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68241 c68241) {
            this();
        }

        public Builder clearPremiere() {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).clearPremiere();
            return this;
        }

        public Builder clearRiskReason() {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).clearRiskReason();
            return this;
        }

        public Builder clearRiskStatus() {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).clearRiskStatus();
            return this;
        }

        public Premiere getPremiere() {
            return ((PremiereArchiveReply) this.instance).getPremiere();
        }

        public String getRiskReason() {
            return ((PremiereArchiveReply) this.instance).getRiskReason();
        }

        public ByteString getRiskReasonBytes() {
            return ((PremiereArchiveReply) this.instance).getRiskReasonBytes();
        }

        public boolean getRiskStatus() {
            return ((PremiereArchiveReply) this.instance).getRiskStatus();
        }

        public boolean hasPremiere() {
            return ((PremiereArchiveReply) this.instance).hasPremiere();
        }

        public Builder mergePremiere(Premiere premiere) {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).mergePremiere(premiere);
            return this;
        }

        public Builder setPremiere(Premiere premiere) {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).setPremiere(premiere);
            return this;
        }

        public Builder setRiskReason(String str) {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).setRiskReason(str);
            return this;
        }

        public Builder setRiskReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).setRiskReasonBytes(byteString);
            return this;
        }

        public Builder setRiskStatus(boolean z) {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).setRiskStatus(z);
            return this;
        }

        private Builder() {
            super(PremiereArchiveReply.DEFAULT_INSTANCE);
        }

        public Builder setPremiere(Premiere.Builder builder) {
            copyOnWrite();
            ((PremiereArchiveReply) this.instance).setPremiere(builder.build());
            return this;
        }
    }

    static {
        PremiereArchiveReply premiereArchiveReply = new PremiereArchiveReply();
        DEFAULT_INSTANCE = premiereArchiveReply;
        GeneratedMessageLite.registerDefaultInstance(PremiereArchiveReply.class, premiereArchiveReply);
    }

    private PremiereArchiveReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPremiere() {
        this.premiere_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRiskReason() {
        this.riskReason_ = getDefaultInstance().getRiskReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRiskStatus() {
        this.riskStatus_ = false;
    }

    public static PremiereArchiveReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePremiere(Premiere premiere) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PremiereArchiveReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereArchiveReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PremiereArchiveReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiere(Premiere premiere) {
        premiere.getClass();
        this.premiere_ = premiere;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRiskReason(String str) {
        str.getClass();
        this.riskReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRiskReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.riskReason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRiskStatus(boolean z) {
        this.riskStatus_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68241.f16786xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PremiereArchiveReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003\u0208", new Object[]{"premiere_", "riskStatus_", "riskReason_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PremiereArchiveReply> parser = PARSER;
                if (parser == null) {
                    synchronized (PremiereArchiveReply.class) {
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

    public Premiere getPremiere() {
        Premiere premiere = this.premiere_;
        return premiere == null ? Premiere.getDefaultInstance() : premiere;
    }

    public String getRiskReason() {
        return this.riskReason_;
    }

    public ByteString getRiskReasonBytes() {
        return ByteString.copyFromUtf8(this.riskReason_);
    }

    public boolean getRiskStatus() {
        return this.riskStatus_;
    }

    public boolean hasPremiere() {
        return this.premiere_ != null;
    }

    public static Builder newBuilder(PremiereArchiveReply premiereArchiveReply) {
        return DEFAULT_INSTANCE.createBuilder(premiereArchiveReply);
    }

    public static PremiereArchiveReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereArchiveReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PremiereArchiveReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PremiereArchiveReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PremiereArchiveReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PremiereArchiveReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PremiereArchiveReply parseFrom(InputStream inputStream) throws IOException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereArchiveReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereArchiveReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PremiereArchiveReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereArchiveReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
