package com.bapis.bilibili.community.service.dm.v1;

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
public final class ToastV2 extends GeneratedMessageLite<ToastV2, ToastV2.Builder> implements MessageLiteOrBuilder {
    private static final ToastV2 DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    private static volatile Parser<ToastV2> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TOAST_BUTTON_V2_FIELD_NUMBER = 3;
    private int duration_;
    private String text_ = "";
    private ToastButtonV2 toastButtonV2_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.ToastV2$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17103xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17103xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17103xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17103xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17103xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17103xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17103xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17103xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ToastV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72701 c72701) {
            this();
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((ToastV2) this.instance).clearDuration();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ToastV2) this.instance).clearText();
            return this;
        }

        public Builder clearToastButtonV2() {
            copyOnWrite();
            ((ToastV2) this.instance).clearToastButtonV2();
            return this;
        }

        public int getDuration() {
            return ((ToastV2) this.instance).getDuration();
        }

        public String getText() {
            return ((ToastV2) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((ToastV2) this.instance).getTextBytes();
        }

        public ToastButtonV2 getToastButtonV2() {
            return ((ToastV2) this.instance).getToastButtonV2();
        }

        public boolean hasToastButtonV2() {
            return ((ToastV2) this.instance).hasToastButtonV2();
        }

        public Builder mergeToastButtonV2(ToastButtonV2 toastButtonV2) {
            copyOnWrite();
            ((ToastV2) this.instance).mergeToastButtonV2(toastButtonV2);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((ToastV2) this.instance).setDuration(i);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ToastV2) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ToastV2) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setToastButtonV2(ToastButtonV2 toastButtonV2) {
            copyOnWrite();
            ((ToastV2) this.instance).setToastButtonV2(toastButtonV2);
            return this;
        }

        private Builder() {
            super(ToastV2.DEFAULT_INSTANCE);
        }

        public Builder setToastButtonV2(ToastButtonV2.Builder builder) {
            copyOnWrite();
            ((ToastV2) this.instance).setToastButtonV2(builder.build());
            return this;
        }
    }

    static {
        ToastV2 toastV2 = new ToastV2();
        DEFAULT_INSTANCE = toastV2;
        GeneratedMessageLite.registerDefaultInstance(ToastV2.class, toastV2);
    }

    private ToastV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToastButtonV2() {
        this.toastButtonV2_ = null;
    }

    public static ToastV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeToastButtonV2(ToastButtonV2 toastButtonV2) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ToastV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ToastV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ToastV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ToastV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToastButtonV2(ToastButtonV2 toastButtonV2) {
        toastButtonV2.getClass();
        this.toastButtonV2_ = toastButtonV2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72701.f17103xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ToastV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\t", new Object[]{"text_", "duration_", "toastButtonV2_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ToastV2> parser = PARSER;
                if (parser == null) {
                    synchronized (ToastV2.class) {
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

    public int getDuration() {
        return this.duration_;
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public ToastButtonV2 getToastButtonV2() {
        ToastButtonV2 toastButtonV2 = this.toastButtonV2_;
        return toastButtonV2 == null ? ToastButtonV2.getDefaultInstance() : toastButtonV2;
    }

    public boolean hasToastButtonV2() {
        return this.toastButtonV2_ != null;
    }

    public static Builder newBuilder(ToastV2 toastV2) {
        return DEFAULT_INSTANCE.createBuilder(toastV2);
    }

    public static ToastV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ToastV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ToastV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ToastV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ToastV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ToastV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ToastV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ToastV2 parseFrom(InputStream inputStream) throws IOException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ToastV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ToastV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ToastV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ToastV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
