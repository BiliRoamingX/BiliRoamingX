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
public final class PullClientAction extends GeneratedMessageLite<PullClientAction, PullClientAction.Builder> implements MessageLiteOrBuilder {
    private static final PullClientAction DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Parser<PullClientAction> PARSER = null;
    public static final int PULL_ACTION_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean pullAction_;
    private String type_ = "";
    private String params_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PullClientAction$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68301 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16791xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16791xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16791xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16791xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16791xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16791xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16791xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16791xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PullClientAction, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68301 c68301) {
            this();
        }

        public Builder clearParams() {
            copyOnWrite();
            ((PullClientAction) this.instance).clearParams();
            return this;
        }

        public Builder clearPullAction() {
            copyOnWrite();
            ((PullClientAction) this.instance).clearPullAction();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((PullClientAction) this.instance).clearType();
            return this;
        }

        public String getParams() {
            return ((PullClientAction) this.instance).getParams();
        }

        public ByteString getParamsBytes() {
            return ((PullClientAction) this.instance).getParamsBytes();
        }

        public boolean getPullAction() {
            return ((PullClientAction) this.instance).getPullAction();
        }

        public String getType() {
            return ((PullClientAction) this.instance).getType();
        }

        public ByteString getTypeBytes() {
            return ((PullClientAction) this.instance).getTypeBytes();
        }

        public Builder setParams(String str) {
            copyOnWrite();
            ((PullClientAction) this.instance).setParams(str);
            return this;
        }

        public Builder setParamsBytes(ByteString byteString) {
            copyOnWrite();
            ((PullClientAction) this.instance).setParamsBytes(byteString);
            return this;
        }

        public Builder setPullAction(boolean z) {
            copyOnWrite();
            ((PullClientAction) this.instance).setPullAction(z);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((PullClientAction) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((PullClientAction) this.instance).setTypeBytes(byteString);
            return this;
        }

        private Builder() {
            super(PullClientAction.DEFAULT_INSTANCE);
        }
    }

    static {
        PullClientAction pullClientAction = new PullClientAction();
        DEFAULT_INSTANCE = pullClientAction;
        GeneratedMessageLite.registerDefaultInstance(PullClientAction.class, pullClientAction);
    }

    private PullClientAction() {
    }

    public void clearParams() {
        this.params_ = getDefaultInstance().getParams();
    }

    public void clearPullAction() {
        this.pullAction_ = false;
    }

    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static PullClientAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PullClientAction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PullClientAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PullClientAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PullClientAction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setParams(String str) {
        str.getClass();
        this.params_ = str;
    }

    public void setParamsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.params_ = byteString.toStringUtf8();
    }

    public void setPullAction(boolean z) {
        this.pullAction_ = z;
    }

    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68301.f16791xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PullClientAction();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0007\u0003\u0208", new Object[]{"type_", "pullAction_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PullClientAction> parser = PARSER;
                if (parser == null) {
                    synchronized (PullClientAction.class) {
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

    public String getParams() {
        return this.params_;
    }

    public ByteString getParamsBytes() {
        return ByteString.copyFromUtf8(this.params_);
    }

    public boolean getPullAction() {
        return this.pullAction_;
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public static Builder newBuilder(PullClientAction pullClientAction) {
        return DEFAULT_INSTANCE.createBuilder(pullClientAction);
    }

    public static PullClientAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PullClientAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PullClientAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PullClientAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PullClientAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PullClientAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PullClientAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PullClientAction parseFrom(InputStream inputStream) throws IOException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PullClientAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PullClientAction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PullClientAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PullClientAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
