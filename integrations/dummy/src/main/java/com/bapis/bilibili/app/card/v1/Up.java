package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class Up extends GeneratedMessageLite<Up, Up.C5914b> implements c0 {
    public static final int AVATAR_FIELD_NUMBER = 4;
    public static final int COOPERATION_FIELD_NUMBER = 7;
    private static final Up DEFAULT_INSTANCE;
    public static final int DESC_BUTTON_FIELD_NUMBER = 6;
    public static final int DESC_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OFFICIAL_ICON_FIELD_NUMBER = 5;
    private static volatile Parser<Up> PARSER;
    private Avatar avatar_;
    private Button descButton_;
    private long id_;
    private int officialIcon_;
    private String name_ = "";
    private String desc_ = "";
    private String cooperation_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Up$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5913a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16005xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16005xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16005xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16005xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16005xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Up$b */
    /* loaded from: classes13.dex */
    public static final class C5914b extends GeneratedMessageLite.Builder<Up, C5914b> implements c0 {
        /* synthetic */ C5914b(C5913a c5913a) {
            this();
        }

        public C5914b clearAvatar() {
            copyOnWrite();
            ((Up) this.instance).clearAvatar();
            return this;
        }

        public C5914b clearCooperation() {
            copyOnWrite();
            ((Up) this.instance).clearCooperation();
            return this;
        }

        public C5914b clearDesc() {
            copyOnWrite();
            ((Up) this.instance).clearDesc();
            return this;
        }

        public C5914b clearDescButton() {
            copyOnWrite();
            ((Up) this.instance).clearDescButton();
            return this;
        }

        public C5914b clearId() {
            copyOnWrite();
            ((Up) this.instance).clearId();
            return this;
        }

        public C5914b clearName() {
            copyOnWrite();
            ((Up) this.instance).clearName();
            return this;
        }

        public C5914b clearOfficialIcon() {
            copyOnWrite();
            ((Up) this.instance).clearOfficialIcon();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public Avatar getAvatar() {
            return ((Up) this.instance).getAvatar();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public String getCooperation() {
            return ((Up) this.instance).getCooperation();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public ByteString getCooperationBytes() {
            return ((Up) this.instance).getCooperationBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public String getDesc() {
            return ((Up) this.instance).getDesc();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public Button getDescButton() {
            return ((Up) this.instance).getDescButton();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public ByteString getDescBytes() {
            return ((Up) this.instance).getDescBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public long getId() {
            return ((Up) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public String getName() {
            return ((Up) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public ByteString getNameBytes() {
            return ((Up) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public int getOfficialIcon() {
            return ((Up) this.instance).getOfficialIcon();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public boolean hasAvatar() {
            return ((Up) this.instance).hasAvatar();
        }

        @Override // com.bapis.bilibili.app.card.v1.c0
        public boolean hasDescButton() {
            return ((Up) this.instance).hasDescButton();
        }

        public C5914b mergeAvatar(Avatar avatar) {
            copyOnWrite();
            ((Up) this.instance).mergeAvatar(avatar);
            return this;
        }

        public C5914b mergeDescButton(Button button) {
            copyOnWrite();
            ((Up) this.instance).mergeDescButton(button);
            return this;
        }

        public C5914b setAvatar(Avatar avatar) {
            copyOnWrite();
            ((Up) this.instance).setAvatar(avatar);
            return this;
        }

        public C5914b setCooperation(String str) {
            copyOnWrite();
            ((Up) this.instance).setCooperation(str);
            return this;
        }

        public C5914b setCooperationBytes(ByteString byteString) {
            copyOnWrite();
            ((Up) this.instance).setCooperationBytes(byteString);
            return this;
        }

        public C5914b setDesc(String str) {
            copyOnWrite();
            ((Up) this.instance).setDesc(str);
            return this;
        }

        public C5914b setDescButton(Button button) {
            copyOnWrite();
            ((Up) this.instance).setDescButton(button);
            return this;
        }

        public C5914b setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Up) this.instance).setDescBytes(byteString);
            return this;
        }

        public C5914b setId(long j) {
            copyOnWrite();
            ((Up) this.instance).setId(j);
            return this;
        }

        public C5914b setName(String str) {
            copyOnWrite();
            ((Up) this.instance).setName(str);
            return this;
        }

        public C5914b setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Up) this.instance).setNameBytes(byteString);
            return this;
        }

        public C5914b setOfficialIcon(int i) {
            copyOnWrite();
            ((Up) this.instance).setOfficialIcon(i);
            return this;
        }

        private C5914b() {
            super(Up.DEFAULT_INSTANCE);
        }

        public C5914b setAvatar(Avatar.C5791b c5791b) {
            copyOnWrite();
            ((Up) this.instance).setAvatar(c5791b.build());
            return this;
        }

        public C5914b setDescButton(Button.C5797b c5797b) {
            copyOnWrite();
            ((Up) this.instance).setDescButton(c5797b.build());
            return this;
        }
    }

    static {
        Up up = new Up();
        DEFAULT_INSTANCE = up;
        GeneratedMessageLite.registerDefaultInstance(Up.class, up);
    }

    private Up() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCooperation() {
        this.cooperation_ = getDefaultInstance().getCooperation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescButton() {
        this.descButton_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfficialIcon() {
        this.officialIcon_ = 0;
    }

    public static Up getDefaultInstance() {
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
    public void mergeDescButton(Button button) {
        button.getClass();
        Button button2 = this.descButton_;
        if (button2 != null && button2 != Button.getDefaultInstance()) {
            this.descButton_ = Button.newBuilder(this.descButton_).mergeFrom((Button) button).buildPartial();
        } else {
            this.descButton_ = button;
        }
    }

    public static C5914b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Up parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Up) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Up parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Up> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(Avatar avatar) {
        avatar.getClass();
        this.avatar_ = avatar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCooperation(String str) {
        str.getClass();
        this.cooperation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCooperationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cooperation_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescButton(Button button) {
        button.getClass();
        this.descButton_ = button;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfficialIcon(int i) {
        this.officialIcon_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5913a.f16005xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Up();
            case 2:
                return new C5914b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\t\u0005\u0004\u0006\t\u0007\u0208", new Object[]{"id_", "name_", "desc_", "avatar_", "officialIcon_", "descButton_", "cooperation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Up> parser = PARSER;
                if (parser == null) {
                    synchronized (Up.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.c0
    public Avatar getAvatar() {
        Avatar avatar = this.avatar_;
        return avatar == null ? Avatar.getDefaultInstance() : avatar;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public String getCooperation() {
        return this.cooperation_;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public ByteString getCooperationBytes() {
        return ByteString.copyFromUtf8(this.cooperation_);
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public String getDesc() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public Button getDescButton() {
        Button button = this.descButton_;
        return button == null ? Button.getDefaultInstance() : button;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public int getOfficialIcon() {
        return this.officialIcon_;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public boolean hasAvatar() {
        return this.avatar_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.c0
    public boolean hasDescButton() {
        return this.descButton_ != null;
    }

    public static C5914b newBuilder(Up up) {
        return DEFAULT_INSTANCE.createBuilder(up);
    }

    public static Up parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Up) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Up parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Up parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Up parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Up parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Up parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Up parseFrom(InputStream inputStream) throws IOException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Up parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Up parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Up parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Up) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
