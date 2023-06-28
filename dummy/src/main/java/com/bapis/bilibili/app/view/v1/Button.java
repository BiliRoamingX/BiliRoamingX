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
public final class Button extends GeneratedMessageLite<Button, Button.Builder> implements MessageLiteOrBuilder {
    private static final Button DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int JUMP_SHOW_TYPE_FIELD_NUMBER = 4;
    private static volatile Parser<Button> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int jumpShowType_;
    private String title_ = "";
    private String uri_ = "";
    private String icon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Button$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67241 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16699xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16699xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16699xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16699xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16699xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16699xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16699xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16699xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Button, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67241 c67241) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((Button) this.instance).clearIcon();
            return this;
        }

        public Builder clearJumpShowType() {
            copyOnWrite();
            ((Button) this.instance).clearJumpShowType();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Button) this.instance).clearTitle();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((Button) this.instance).clearUri();
            return this;
        }

        public String getIcon() {
            return ((Button) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((Button) this.instance).getIconBytes();
        }

        public JumpShowType getJumpShowType() {
            return ((Button) this.instance).getJumpShowType();
        }

        public int getJumpShowTypeValue() {
            return ((Button) this.instance).getJumpShowTypeValue();
        }

        public String getTitle() {
            return ((Button) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Button) this.instance).getTitleBytes();
        }

        public String getUri() {
            return ((Button) this.instance).getUri();
        }

        public ByteString getUriBytes() {
            return ((Button) this.instance).getUriBytes();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((Button) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setJumpShowType(JumpShowType jumpShowType) {
            copyOnWrite();
            ((Button) this.instance).setJumpShowType(jumpShowType);
            return this;
        }

        public Builder setJumpShowTypeValue(int i) {
            copyOnWrite();
            ((Button) this.instance).setJumpShowTypeValue(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Button) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Button) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(Button.DEFAULT_INSTANCE);
        }
    }

    static {
        Button button = new Button();
        DEFAULT_INSTANCE = button;
        GeneratedMessageLite.registerDefaultInstance(Button.class, button);
    }

    private Button() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJumpShowType() {
        this.jumpShowType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Button getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Button parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Button> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpShowType(JumpShowType jumpShowType) {
        this.jumpShowType_ = jumpShowType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJumpShowTypeValue(int i) {
        this.jumpShowType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67241.f16699xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Button();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\f", new Object[]{"title_", "uri_", "icon_", "jumpShowType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Button> parser = PARSER;
                if (parser == null) {
                    synchronized (Button.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public JumpShowType getJumpShowType() {
        JumpShowType forNumber = JumpShowType.forNumber(this.jumpShowType_);
        return forNumber == null ? JumpShowType.UNRECOGNIZED : forNumber;
    }

    public int getJumpShowTypeValue() {
        return this.jumpShowType_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getUri() {
        return this.uri_;
    }

    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(Button button) {
        return DEFAULT_INSTANCE.createBuilder(button);
    }

    public static Button parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Button parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Button parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Button parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Button parseFrom(InputStream inputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Button parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Button parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Button parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
