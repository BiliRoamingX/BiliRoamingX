package com.bapis.bilibili.playershared;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class Scheme extends GeneratedMessageLite<Scheme, Scheme.Builder> implements MessageLiteOrBuilder {
    public static final int ACTION_TYPE_FIELD_NUMBER = 1;
    private static final Scheme DEFAULT_INSTANCE;
    private static volatile Parser<Scheme> PARSER = null;
    public static final int TOAST_FIELD_NUMBER = 2;
    private int actionType_;
    private String toast_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.Scheme$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C79231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17629xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17629xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17629xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17629xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17629xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17629xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17629xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17629xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public enum ActionType implements Internal.EnumLite {
        UNKNOWN(0),
        SHOW_TOAST(1),
        UNRECOGNIZED(-1);
        
        public static final int SHOW_TOAST_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<ActionType> internalValueMap = new Internal.EnumLiteMap<ActionType>() { // from class: com.bapis.bilibili.playershared.Scheme.ActionType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ActionType findValueByNumber(int i) {
                return ActionType.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: BL */
        /* loaded from: classes14.dex */
        private static final class ActionTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ActionTypeVerifier();

            private ActionTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return ActionType.forNumber(i) != null;
            }
        }

        ActionType(int i) {
            this.value = i;
        }

        public static ActionType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return SHOW_TOAST;
            }
            return UNKNOWN;
        }

        public static Internal.EnumLiteMap<ActionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ActionTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ActionType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Scheme, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79231 c79231) {
            this();
        }

        public Builder clearActionType() {
            copyOnWrite();
            ((Scheme) this.instance).clearActionType();
            return this;
        }

        public Builder clearToast() {
            copyOnWrite();
            ((Scheme) this.instance).clearToast();
            return this;
        }

        public ActionType getActionType() {
            return ((Scheme) this.instance).getActionType();
        }

        public int getActionTypeValue() {
            return ((Scheme) this.instance).getActionTypeValue();
        }

        public String getToast() {
            return ((Scheme) this.instance).getToast();
        }

        public ByteString getToastBytes() {
            return ((Scheme) this.instance).getToastBytes();
        }

        public Builder setActionType(ActionType actionType) {
            copyOnWrite();
            ((Scheme) this.instance).setActionType(actionType);
            return this;
        }

        public Builder setActionTypeValue(int i) {
            copyOnWrite();
            ((Scheme) this.instance).setActionTypeValue(i);
            return this;
        }

        public Builder setToast(String str) {
            copyOnWrite();
            ((Scheme) this.instance).setToast(str);
            return this;
        }

        public Builder setToastBytes(ByteString byteString) {
            copyOnWrite();
            ((Scheme) this.instance).setToastBytes(byteString);
            return this;
        }

        private Builder() {
            super(Scheme.DEFAULT_INSTANCE);
        }
    }

    static {
        Scheme scheme = new Scheme();
        DEFAULT_INSTANCE = scheme;
        GeneratedMessageLite.registerDefaultInstance(Scheme.class, scheme);
    }

    private Scheme() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionType() {
        this.actionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToast() {
        this.toast_ = getDefaultInstance().getToast();
    }

    public static Scheme getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Scheme parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Scheme) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Scheme parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Scheme> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionType(ActionType actionType) {
        this.actionType_ = actionType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionTypeValue(int i) {
        this.actionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToast(String str) {
        str.getClass();
        this.toast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toast_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79231.f17629xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Scheme();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[]{"actionType_", "toast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Scheme> parser = PARSER;
                if (parser == null) {
                    synchronized (Scheme.class) {
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

    public ActionType getActionType() {
        ActionType forNumber = ActionType.forNumber(this.actionType_);
        return forNumber == null ? ActionType.UNRECOGNIZED : forNumber;
    }

    public int getActionTypeValue() {
        return this.actionType_;
    }

    public String getToast() {
        return this.toast_;
    }

    public ByteString getToastBytes() {
        return ByteString.copyFromUtf8(this.toast_);
    }

    public static Builder newBuilder(Scheme scheme) {
        return DEFAULT_INSTANCE.createBuilder(scheme);
    }

    public static Scheme parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Scheme) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Scheme parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Scheme parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Scheme parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Scheme parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Scheme parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Scheme parseFrom(InputStream inputStream) throws IOException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Scheme parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Scheme parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Scheme parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Scheme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
