package com.bapis.bilibili.app.card.v1;

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
public final class Mask extends GeneratedMessageLite<Mask, Mask.C5833b> implements InterfaceC5934n {
    public static final int AVATAR_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 2;
    private static final Mask DEFAULT_INSTANCE;
    private static volatile Parser<Mask> PARSER;
    private Avatar avatar_;
    private Button button_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Mask$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5832a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15965xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15965xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15965xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15965xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15965xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15965xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15965xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15965xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Mask$b */
    /* loaded from: classes13.dex */
    public static final class C5833b extends GeneratedMessageLite.Builder<Mask, C5833b> implements InterfaceC5934n {
        /* synthetic */ C5833b(C5832a c5832a) {
            this();
        }

        public C5833b clearAvatar() {
            copyOnWrite();
            ((Mask) this.instance).clearAvatar();
            return this;
        }

        public C5833b clearButton() {
            copyOnWrite();
            ((Mask) this.instance).clearButton();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
        public Avatar getAvatar() {
            return ((Mask) this.instance).getAvatar();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
        public Button getButton() {
            return ((Mask) this.instance).getButton();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
        public boolean hasAvatar() {
            return ((Mask) this.instance).hasAvatar();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
        public boolean hasButton() {
            return ((Mask) this.instance).hasButton();
        }

        public C5833b mergeAvatar(Avatar avatar) {
            copyOnWrite();
            ((Mask) this.instance).mergeAvatar(avatar);
            return this;
        }

        public C5833b mergeButton(Button button) {
            copyOnWrite();
            ((Mask) this.instance).mergeButton(button);
            return this;
        }

        public C5833b setAvatar(Avatar avatar) {
            copyOnWrite();
            ((Mask) this.instance).setAvatar(avatar);
            return this;
        }

        public C5833b setButton(Button button) {
            copyOnWrite();
            ((Mask) this.instance).setButton(button);
            return this;
        }

        private C5833b() {
            super(Mask.DEFAULT_INSTANCE);
        }

        public C5833b setAvatar(Avatar.C5791b c5791b) {
            copyOnWrite();
            ((Mask) this.instance).setAvatar(c5791b.build());
            return this;
        }

        public C5833b setButton(Button.C5797b c5797b) {
            copyOnWrite();
            ((Mask) this.instance).setButton(c5797b.build());
            return this;
        }
    }

    static {
        Mask mask = new Mask();
        DEFAULT_INSTANCE = mask;
        GeneratedMessageLite.registerDefaultInstance(Mask.class, mask);
    }

    private Mask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = null;
    }

    public static Mask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvatar(Avatar avatar) {
        avatar.getClass();
        Avatar avatar2 = this.avatar_;
        if (avatar2 != null && avatar2 != Avatar.getDefaultInstance()) {
            this.avatar_ = Avatar.newBuilder(this.avatar_).mergeFrom((Avatar) avatar).buildPartial();
        } else {
            this.avatar_ = avatar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(Button button) {
        button.getClass();
        Button button2 = this.button_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.button_ = Button.newBuilder(this.button_).mergeFrom((Button) button).buildPartial();
        } else {
            this.button_ = button;
        }
    }

    public static C5833b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Mask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Mask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(Avatar avatar) {
        avatar.getClass();
        this.avatar_ = avatar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(Button button) {
        button.getClass();
        this.button_ = button;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5832a.f15965xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Mask();
            case 2:
                return new C5833b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"avatar_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Mask> parser = PARSER;
                if (parser == null) {
                    synchronized (Mask.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
    public Avatar getAvatar() {
        Avatar avatar = this.avatar_;
        return avatar == null ? Avatar.getDefaultInstance() : avatar;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
    public Button getButton() {
        Button button = this.button_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
    public boolean hasAvatar() {
        return this.avatar_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5934n
    public boolean hasButton() {
        return this.button_ != null;
    }

    public static C5833b newBuilder(Mask mask) {
        return DEFAULT_INSTANCE.createBuilder(mask);
    }

    public static Mask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Mask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Mask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Mask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Mask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mask parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Mask parseFrom(InputStream inputStream) throws IOException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Mask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Mask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Mask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
