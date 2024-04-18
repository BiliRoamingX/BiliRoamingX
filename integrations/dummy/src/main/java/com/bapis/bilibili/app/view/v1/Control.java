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
public final class Control extends GeneratedMessageLite<Control, Control.Builder> implements MessageLiteOrBuilder {
    private static final Control DEFAULT_INSTANCE;
    public static final int DISABLE_CLICK_TIP_FIELD_NUMBER = 3;
    public static final int DISABLE_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 1;
    private static volatile Parser<Control> PARSER;
    private String disableClickTip_ = "";
    private boolean disable_;
    private boolean limit_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Control$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16722xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16722xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16722xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16722xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16722xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16722xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16722xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16722xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Control, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67481 c67481) {
            this();
        }

        public Builder clearDisable() {
            copyOnWrite();
            ((Control) this.instance).clearDisable();
            return this;
        }

        public Builder clearDisableClickTip() {
            copyOnWrite();
            ((Control) this.instance).clearDisableClickTip();
            return this;
        }

        public Builder clearLimit() {
            copyOnWrite();
            ((Control) this.instance).clearLimit();
            return this;
        }

        public boolean getDisable() {
            return ((Control) this.instance).getDisable();
        }

        public String getDisableClickTip() {
            return ((Control) this.instance).getDisableClickTip();
        }

        public ByteString getDisableClickTipBytes() {
            return ((Control) this.instance).getDisableClickTipBytes();
        }

        public boolean getLimit() {
            return ((Control) this.instance).getLimit();
        }

        public Builder setDisable(boolean z) {
            copyOnWrite();
            ((Control) this.instance).setDisable(z);
            return this;
        }

        public Builder setDisableClickTip(String str) {
            copyOnWrite();
            ((Control) this.instance).setDisableClickTip(str);
            return this;
        }

        public Builder setDisableClickTipBytes(ByteString byteString) {
            copyOnWrite();
            ((Control) this.instance).setDisableClickTipBytes(byteString);
            return this;
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
    public void clearDisable() {
        this.disable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableClickTip() {
        this.disableClickTip_ = getDefaultInstance().getDisableClickTip();
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
    public void setDisable(boolean z) {
        this.disable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableClickTip(String str) {
        str.getClass();
        this.disableClickTip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableClickTipBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.disableClickTip_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(boolean z) {
        this.limit_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67481.f16722xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Control();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0208", new Object[]{"limit_", "disable_", "disableClickTip_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Control> parser = PARSER;
                if (parser == null) {
                    synchronized (Control.class) {
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

    public boolean getDisable() {
        return this.disable_;
    }

    public String getDisableClickTip() {
        return this.disableClickTip_;
    }

    public ByteString getDisableClickTipBytes() {
        return ByteString.copyFromUtf8(this.disableClickTip_);
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
