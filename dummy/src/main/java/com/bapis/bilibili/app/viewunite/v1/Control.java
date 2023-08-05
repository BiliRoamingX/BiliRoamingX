package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes17.dex */
public final class Control extends GeneratedMessageLite<Control, Control.Builder> implements MessageLiteOrBuilder {
    private static final Control DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 1;
    private static volatile Parser<Control> PARSER;
    private boolean limit_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Control$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17105xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17105xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17105xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Control, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71301 c71301) {
            this();
        }

        public Builder clearLimit() {
            copyOnWrite();
            ((Control) this.instance).clearLimit();
            return this;
        }

        public boolean getLimit() {
            return ((Control) this.instance).getLimit();
        }

        public Builder setLimit(boolean z) {
            copyOnWrite();
            ((Control) this.instance).setLimit(z);
            return this;
        }

        private Builder() {
            super(Control.DEFAULT_INSTANCE);
        }
    }

    static {
        Control control = new Control();
        DEFAULT_INSTANCE = control;
        GeneratedMessageLite.registerDefaultInstance(Control.class, control);
    }

    private Control() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.limit_ = false;
    }

    public static Control getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Control parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Control) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Control> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(boolean z) {
        this.limit_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71301.f17105xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Control();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"limit_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Control> parser = PARSER;
                if (parser == null) {
                    synchronized (Control.class) {
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

    public boolean getLimit() {
        return this.limit_;
    }

    public static Builder newBuilder(Control control) {
        return DEFAULT_INSTANCE.createBuilder(control);
    }

    public static Control parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Control parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Control parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Control parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Control parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Control parseFrom(InputStream inputStream) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Control parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Control parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Control parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
