package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes17.dex */
public final class Threshold extends GeneratedMessageLite<Threshold, Threshold.Builder> implements ThresholdOrBuilder {
    public static final int BP_FIELD_NUMBER = 1;
    public static final int DAYS_FIELD_NUMBER = 2;
    public static final int DAYS_TEXT_FIELD_NUMBER = 3;
    private static final Threshold DEFAULT_INSTANCE;
    private static volatile Parser<Threshold> PARSER;
    private int bp_;
    private String daysText_ = "";
    private int days_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Threshold$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17047xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17047xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17047xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Threshold, Builder> implements ThresholdOrBuilder {
        /* synthetic */ Builder(C70701 c70701) {
            this();
        }

        public Builder clearBp() {
            copyOnWrite();
            ((Threshold) this.instance).clearBp();
            return this;
        }

        public Builder clearDays() {
            copyOnWrite();
            ((Threshold) this.instance).clearDays();
            return this;
        }

        public Builder clearDaysText() {
            copyOnWrite();
            ((Threshold) this.instance).clearDaysText();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
        public int getBp() {
            return ((Threshold) this.instance).getBp();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
        public int getDays() {
            return ((Threshold) this.instance).getDays();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
        public String getDaysText() {
            return ((Threshold) this.instance).getDaysText();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
        public ByteString getDaysTextBytes() {
            return ((Threshold) this.instance).getDaysTextBytes();
        }

        public Builder setBp(int i) {
            copyOnWrite();
            ((Threshold) this.instance).setBp(i);
            return this;
        }

        public Builder setDays(int i) {
            copyOnWrite();
            ((Threshold) this.instance).setDays(i);
            return this;
        }

        public Builder setDaysText(String str) {
            copyOnWrite();
            ((Threshold) this.instance).setDaysText(str);
            return this;
        }

        public Builder setDaysTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Threshold) this.instance).setDaysTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(Threshold.DEFAULT_INSTANCE);
        }
    }

    static {
        Threshold threshold = new Threshold();
        DEFAULT_INSTANCE = threshold;
        GeneratedMessageLite.registerDefaultInstance(Threshold.class, threshold);
    }

    private Threshold() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBp() {
        this.bp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDays() {
        this.days_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDaysText() {
        this.daysText_ = getDefaultInstance().getDaysText();
    }

    public static Threshold getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Threshold parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Threshold) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Threshold parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Threshold> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBp(int i) {
        this.bp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDays(int i) {
        this.days_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDaysText(String str) {
        str.getClass();
        this.daysText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDaysTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.daysText_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70701.f17047xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Threshold();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0208", new Object[]{"bp_", "days_", "daysText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Threshold> parser = PARSER;
                if (parser == null) {
                    synchronized (Threshold.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
    public int getBp() {
        return this.bp_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
    public int getDays() {
        return this.days_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
    public String getDaysText() {
        return this.daysText_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.ThresholdOrBuilder
    public ByteString getDaysTextBytes() {
        return ByteString.copyFromUtf8(this.daysText_);
    }

    public static Builder newBuilder(Threshold threshold) {
        return DEFAULT_INSTANCE.createBuilder(threshold);
    }

    public static Threshold parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Threshold) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Threshold parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Threshold parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Threshold parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Threshold parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Threshold parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Threshold parseFrom(InputStream inputStream) throws IOException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Threshold parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Threshold parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Threshold parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Threshold) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
