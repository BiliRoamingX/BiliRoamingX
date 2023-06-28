package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Any;
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
/* loaded from: classes13.dex */
public final class CM extends GeneratedMessageLite<CM, CM.Builder> implements CMOrBuilder {
    private static final CM DEFAULT_INSTANCE;
    private static volatile Parser<CM> PARSER = null;
    public static final int SOURCE_CONTENT_FIELD_NUMBER = 1;
    private Any sourceContent_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CM$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16702xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16702xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16702xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16702xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16702xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16702xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16702xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16702xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CM, Builder> implements CMOrBuilder {
        /* synthetic */ Builder(C67271 c67271) {
            this();
        }

        public Builder clearSourceContent() {
            copyOnWrite();
            ((CM) this.instance).clearSourceContent();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.CMOrBuilder
        public Any getSourceContent() {
            return ((CM) this.instance).getSourceContent();
        }

        @Override // com.bapis.bilibili.app.view.v1.CMOrBuilder
        public boolean hasSourceContent() {
            return ((CM) this.instance).hasSourceContent();
        }

        public Builder mergeSourceContent(Any any) {
            copyOnWrite();
            ((CM) this.instance).mergeSourceContent(any);
            return this;
        }

        public Builder setSourceContent(Any any) {
            copyOnWrite();
            ((CM) this.instance).setSourceContent(any);
            return this;
        }

        private Builder() {
            super(CM.DEFAULT_INSTANCE);
        }

        public Builder setSourceContent(Any.Builder builder) {
            copyOnWrite();
            ((CM) this.instance).setSourceContent(builder.build());
            return this;
        }
    }

    static {
        CM cm = new CM();
        DEFAULT_INSTANCE = cm;
        GeneratedMessageLite.registerDefaultInstance(CM.class, cm);
    }

    private CM() {
    }

    public void clearSourceContent() {
        this.sourceContent_ = null;
    }

    public static CM getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeSourceContent(Any any) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CM parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CM parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CM> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setSourceContent(Any any) {
        any.getClass();
        this.sourceContent_ = any;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67271.f16702xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CM();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"sourceContent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CM> parser = PARSER;
                if (parser == null) {
                    synchronized (CM.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.CMOrBuilder
    public Any getSourceContent() {
        Any any = this.sourceContent_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.bapis.bilibili.app.view.v1.CMOrBuilder
    public boolean hasSourceContent() {
        return this.sourceContent_ != null;
    }

    public static Builder newBuilder(CM cm) {
        return DEFAULT_INSTANCE.createBuilder(cm);
    }

    public static CM parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CM parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CM parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CM parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CM parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CM parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CM parseFrom(InputStream inputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CM parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CM parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CM parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
