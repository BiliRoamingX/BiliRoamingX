package com.bapis.bilibili.playershared;

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
/* loaded from: classes14.dex */
public final class ExtraContent extends GeneratedMessageLite<ExtraContent, ExtraContent.Builder> implements MessageLiteOrBuilder {
    private static final ExtraContent DEFAULT_INSTANCE;
    public static final int DISABLED_CODE_FIELD_NUMBER = 2;
    public static final int DISABLED_REASON_FIELD_NUMBER = 1;
    private static volatile Parser<ExtraContent> PARSER;
    private long disabledCode_;
    private String disabledReason_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.ExtraContent$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C79101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17617xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17617xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17617xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17617xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17617xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17617xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17617xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17617xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ExtraContent, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79101 c79101) {
            this();
        }

        public Builder clearDisabledCode() {
            copyOnWrite();
            ((ExtraContent) this.instance).clearDisabledCode();
            return this;
        }

        public Builder clearDisabledReason() {
            copyOnWrite();
            ((ExtraContent) this.instance).clearDisabledReason();
            return this;
        }

        public long getDisabledCode() {
            return ((ExtraContent) this.instance).getDisabledCode();
        }

        public String getDisabledReason() {
            return ((ExtraContent) this.instance).getDisabledReason();
        }

        public ByteString getDisabledReasonBytes() {
            return ((ExtraContent) this.instance).getDisabledReasonBytes();
        }

        public Builder setDisabledCode(long j) {
            copyOnWrite();
            ((ExtraContent) this.instance).setDisabledCode(j);
            return this;
        }

        public Builder setDisabledReason(String str) {
            copyOnWrite();
            ((ExtraContent) this.instance).setDisabledReason(str);
            return this;
        }

        public Builder setDisabledReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtraContent) this.instance).setDisabledReasonBytes(byteString);
            return this;
        }

        private Builder() {
            super(ExtraContent.DEFAULT_INSTANCE);
        }
    }

    static {
        ExtraContent extraContent = new ExtraContent();
        DEFAULT_INSTANCE = extraContent;
        GeneratedMessageLite.registerDefaultInstance(ExtraContent.class, extraContent);
    }

    private ExtraContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabledCode() {
        this.disabledCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabledReason() {
        this.disabledReason_ = getDefaultInstance().getDisabledReason();
    }

    public static ExtraContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtraContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtraContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtraContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtraContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledCode(long j) {
        this.disabledCode_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledReason(String str) {
        str.getClass();
        this.disabledReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.disabledReason_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79101.f17617xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ExtraContent();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0002", new Object[]{"disabledReason_", "disabledCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtraContent> parser = PARSER;
                if (parser == null) {
                    synchronized (ExtraContent.class) {
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

    public long getDisabledCode() {
        return this.disabledCode_;
    }

    public String getDisabledReason() {
        return this.disabledReason_;
    }

    public ByteString getDisabledReasonBytes() {
        return ByteString.copyFromUtf8(this.disabledReason_);
    }

    public static Builder newBuilder(ExtraContent extraContent) {
        return DEFAULT_INSTANCE.createBuilder(extraContent);
    }

    public static ExtraContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtraContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtraContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtraContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtraContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtraContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtraContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtraContent parseFrom(InputStream inputStream) throws IOException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtraContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtraContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtraContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtraContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
