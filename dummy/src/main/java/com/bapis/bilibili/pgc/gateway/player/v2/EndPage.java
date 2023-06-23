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
public final class EndPage extends GeneratedMessageLite<EndPage, EndPage.Builder> implements MessageLiteOrBuilder {
    private static final EndPage DEFAULT_INSTANCE;
    public static final int DIALOG_FIELD_NUMBER = 1;
    public static final int HIDE_FIELD_NUMBER = 2;
    private static volatile Parser<EndPage> PARSER;
    private Dialog dialog_;
    private boolean hide_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.EndPage$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78401 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17563xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17563xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17563xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17563xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17563xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17563xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17563xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17563xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EndPage, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78401 c78401) {
            this();
        }

        public Builder clearDialog() {
            copyOnWrite();
            ((EndPage) this.instance).clearDialog();
            return this;
        }

        public Builder clearHide() {
            copyOnWrite();
            ((EndPage) this.instance).clearHide();
            return this;
        }

        public Dialog getDialog() {
            return ((EndPage) this.instance).getDialog();
        }

        public boolean getHide() {
            return ((EndPage) this.instance).getHide();
        }

        public boolean hasDialog() {
            return ((EndPage) this.instance).hasDialog();
        }

        public Builder mergeDialog(Dialog dialog) {
            copyOnWrite();
            ((EndPage) this.instance).mergeDialog(dialog);
            return this;
        }

        public Builder setDialog(Dialog dialog) {
            copyOnWrite();
            ((EndPage) this.instance).setDialog(dialog);
            return this;
        }

        public Builder setHide(boolean z) {
            copyOnWrite();
            ((EndPage) this.instance).setHide(z);
            return this;
        }

        private Builder() {
            super(EndPage.DEFAULT_INSTANCE);
        }

        public Builder setDialog(Dialog.Builder builder) {
            copyOnWrite();
            ((EndPage) this.instance).setDialog(builder.build());
            return this;
        }
    }

    static {
        EndPage endPage = new EndPage();
        DEFAULT_INSTANCE = endPage;
        GeneratedMessageLite.registerDefaultInstance(EndPage.class, endPage);
    }

    private EndPage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDialog() {
        this.dialog_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHide() {
        this.hide_ = false;
    }

    public static EndPage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDialog(Dialog dialog) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EndPage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EndPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EndPage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EndPage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDialog(Dialog dialog) {
        dialog.getClass();
        this.dialog_ = dialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHide(boolean z) {
        this.hide_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78401.f17563xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EndPage();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"dialog_", "hide_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EndPage> parser = PARSER;
                if (parser == null) {
                    synchronized (EndPage.class) {
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

    public Dialog getDialog() {
        Dialog dialog = this.dialog_;
        return dialog == null ? Dialog.getDefaultInstance() : dialog;
    }

    public boolean getHide() {
        return this.hide_;
    }

    public boolean hasDialog() {
        return this.dialog_ != null;
    }

    public static Builder newBuilder(EndPage endPage) {
        return DEFAULT_INSTANCE.createBuilder(endPage);
    }

    public static EndPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EndPage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EndPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EndPage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EndPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EndPage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EndPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EndPage parseFrom(InputStream inputStream) throws IOException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EndPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EndPage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EndPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EndPage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
