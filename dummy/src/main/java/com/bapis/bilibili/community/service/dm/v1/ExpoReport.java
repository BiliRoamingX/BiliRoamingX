package com.bapis.bilibili.community.service.dm.v1;

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
public final class ExpoReport extends GeneratedMessageLite<ExpoReport, ExpoReport.Builder> implements MessageLiteOrBuilder {
    private static final ExpoReport DEFAULT_INSTANCE;
    private static volatile Parser<ExpoReport> PARSER = null;
    public static final int SHOULD_REPORT_AT_END_FIELD_NUMBER = 1;
    private boolean shouldReportAtEnd_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.ExpoReport$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72281 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17069xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17069xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17069xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ExpoReport, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72281 c72281) {
            this();
        }

        public Builder clearShouldReportAtEnd() {
            copyOnWrite();
            ((ExpoReport) this.instance).clearShouldReportAtEnd();
            return this;
        }

        public boolean getShouldReportAtEnd() {
            return ((ExpoReport) this.instance).getShouldReportAtEnd();
        }

        public Builder setShouldReportAtEnd(boolean z) {
            copyOnWrite();
            ((ExpoReport) this.instance).setShouldReportAtEnd(z);
            return this;
        }

        private Builder() {
            super(ExpoReport.DEFAULT_INSTANCE);
        }
    }

    static {
        ExpoReport expoReport = new ExpoReport();
        DEFAULT_INSTANCE = expoReport;
        GeneratedMessageLite.registerDefaultInstance(ExpoReport.class, expoReport);
    }

    private ExpoReport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldReportAtEnd() {
        this.shouldReportAtEnd_ = false;
    }

    public static ExpoReport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExpoReport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExpoReport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExpoReport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExpoReport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldReportAtEnd(boolean z) {
        this.shouldReportAtEnd_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72281.f17069xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExpoReport();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"shouldReportAtEnd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExpoReport> parser = PARSER;
                if (parser == null) {
                    synchronized (ExpoReport.class) {
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

    public boolean getShouldReportAtEnd() {
        return this.shouldReportAtEnd_;
    }

    public static Builder newBuilder(ExpoReport expoReport) {
        return DEFAULT_INSTANCE.createBuilder(expoReport);
    }

    public static ExpoReport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExpoReport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExpoReport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExpoReport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExpoReport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExpoReport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExpoReport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExpoReport parseFrom(InputStream inputStream) throws IOException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExpoReport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExpoReport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExpoReport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExpoReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
