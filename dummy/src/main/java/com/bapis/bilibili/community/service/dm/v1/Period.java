package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class Period extends GeneratedMessageLite<Period, Period.Builder> implements PeriodOrBuilder {
    private static final Period DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile Parser<Period> PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    private long end_;
    private long start_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Period$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72351 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17075xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17075xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17075xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Period, Builder> implements PeriodOrBuilder {
        /* synthetic */ Builder(C72351 c72351) {
            this();
        }

        public Builder clearEnd() {
            copyOnWrite();
            ((Period) this.instance).clearEnd();
            return this;
        }

        public Builder clearStart() {
            copyOnWrite();
            ((Period) this.instance).clearStart();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PeriodOrBuilder
        public long getEnd() {
            return ((Period) this.instance).getEnd();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.PeriodOrBuilder
        public long getStart() {
            return ((Period) this.instance).getStart();
        }

        public Builder setEnd(long j) {
            copyOnWrite();
            ((Period) this.instance).setEnd(j);
            return this;
        }

        public Builder setStart(long j) {
            copyOnWrite();
            ((Period) this.instance).setStart(j);
            return this;
        }

        private Builder() {
            super(Period.DEFAULT_INSTANCE);
        }
    }

    static {
        Period period = new Period();
        DEFAULT_INSTANCE = period;
        GeneratedMessageLite.registerDefaultInstance(Period.class, period);
    }

    private Period() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = 0L;
    }

    public static Period getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Period parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Period) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Period parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Period> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(long j) {
        this.end_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(long j) {
        this.start_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72351.f17075xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Period();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"start_", "end_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Period> parser = PARSER;
                if (parser == null) {
                    synchronized (Period.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.PeriodOrBuilder
    public long getEnd() {
        return this.end_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.PeriodOrBuilder
    public long getStart() {
        return this.start_;
    }

    public static Builder newBuilder(Period period) {
        return DEFAULT_INSTANCE.createBuilder(period);
    }

    public static Period parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Period) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Period parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Period parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Period parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Period parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Period parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Period parseFrom(InputStream inputStream) throws IOException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Period parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Period parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Period parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
