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
public final class EntranceItem extends GeneratedMessageLite<EntranceItem, EntranceItem.C5809b> implements InterfaceC5928h {
    public static final int BUBBLE_FIELD_NUMBER = 7;
    private static final EntranceItem DEFAULT_INSTANCE;
    public static final int ENTRANCE_ID_FIELD_NUMBER = 6;
    public static final int ENTRANCE_TYPE_FIELD_NUMBER = 8;
    public static final int GOTO_FIELD_NUMBER = 1;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int MODULE_ID_FIELD_NUMBER = 4;
    private static volatile Parser<EntranceItem> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 5;
    private Bubble bubble_;
    private long entranceId_;
    private int entranceType_;
    private String goto_ = "";
    private String icon_ = "";
    private String title_ = "";
    private String moduleId_ = "";
    private String uri_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.EntranceItem$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5808a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15953xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15953xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15953xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15953xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15953xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15953xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15953xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15953xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.EntranceItem$b */
    /* loaded from: classes13.dex */
    public static final class C5809b extends GeneratedMessageLite.Builder<EntranceItem, C5809b> implements InterfaceC5928h {
        /* synthetic */ C5809b(C5808a c5808a) {
            this();
        }

        public C5809b clearBubble() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearBubble();
            return this;
        }

        public C5809b clearEntranceId() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearEntranceId();
            return this;
        }

        public C5809b clearEntranceType() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearEntranceType();
            return this;
        }

        public C5809b clearGoto() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearGoto();
            return this;
        }

        public C5809b clearIcon() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearIcon();
            return this;
        }

        public C5809b clearModuleId() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearModuleId();
            return this;
        }

        public C5809b clearTitle() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearTitle();
            return this;
        }

        public C5809b clearUri() {
            copyOnWrite();
            ((EntranceItem) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public Bubble getBubble() {
            return ((EntranceItem) this.instance).getBubble();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public long getEntranceId() {
            return ((EntranceItem) this.instance).getEntranceId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public int getEntranceType() {
            return ((EntranceItem) this.instance).getEntranceType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public String getGoto() {
            return ((EntranceItem) this.instance).getGoto();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public ByteString getGotoBytes() {
            return ((EntranceItem) this.instance).getGotoBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public String getIcon() {
            return ((EntranceItem) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public ByteString getIconBytes() {
            return ((EntranceItem) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public String getModuleId() {
            return ((EntranceItem) this.instance).getModuleId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public ByteString getModuleIdBytes() {
            return ((EntranceItem) this.instance).getModuleIdBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public String getTitle() {
            return ((EntranceItem) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public ByteString getTitleBytes() {
            return ((EntranceItem) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public String getUri() {
            return ((EntranceItem) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public ByteString getUriBytes() {
            return ((EntranceItem) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
        public boolean hasBubble() {
            return ((EntranceItem) this.instance).hasBubble();
        }

        public C5809b mergeBubble(Bubble bubble) {
            copyOnWrite();
            ((EntranceItem) this.instance).mergeBubble(bubble);
            return this;
        }

        public C5809b setBubble(Bubble bubble) {
            copyOnWrite();
            ((EntranceItem) this.instance).setBubble(bubble);
            return this;
        }

        public C5809b setEntranceId(long j) {
            copyOnWrite();
            ((EntranceItem) this.instance).setEntranceId(j);
            return this;
        }

        public C5809b setEntranceType(int i) {
            copyOnWrite();
            ((EntranceItem) this.instance).setEntranceType(i);
            return this;
        }

        public C5809b setGoto(String str) {
            copyOnWrite();
            ((EntranceItem) this.instance).setGoto(str);
            return this;
        }

        public C5809b setGotoBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceItem) this.instance).setGotoBytes(byteString);
            return this;
        }

        public C5809b setIcon(String str) {
            copyOnWrite();
            ((EntranceItem) this.instance).setIcon(str);
            return this;
        }

        public C5809b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceItem) this.instance).setIconBytes(byteString);
            return this;
        }

        public C5809b setModuleId(String str) {
            copyOnWrite();
            ((EntranceItem) this.instance).setModuleId(str);
            return this;
        }

        public C5809b setModuleIdBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceItem) this.instance).setModuleIdBytes(byteString);
            return this;
        }

        public C5809b setTitle(String str) {
            copyOnWrite();
            ((EntranceItem) this.instance).setTitle(str);
            return this;
        }

        public C5809b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceItem) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5809b setUri(String str) {
            copyOnWrite();
            ((EntranceItem) this.instance).setUri(str);
            return this;
        }

        public C5809b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceItem) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5809b() {
            super(EntranceItem.DEFAULT_INSTANCE);
        }

        public C5809b setBubble(Bubble.C5795b c5795b) {
            copyOnWrite();
            ((EntranceItem) this.instance).setBubble(c5795b.build());
            return this;
        }
    }

    static {
        EntranceItem entranceItem = new EntranceItem();
        DEFAULT_INSTANCE = entranceItem;
        GeneratedMessageLite.registerDefaultInstance(EntranceItem.class, entranceItem);
    }

    private EntranceItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBubble() {
        this.bubble_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntranceId() {
        this.entranceId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntranceType() {
        this.entranceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoto() {
        this.goto_ = getDefaultInstance().getGoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModuleId() {
        this.moduleId_ = getDefaultInstance().getModuleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static EntranceItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBubble(Bubble bubble) {
        bubble.getClass();
        Bubble bubble2 = this.bubble_;
        if (bubble2 != null && bubble2 != Bubble.getDefaultInstance()) {
            this.bubble_ = Bubble.newBuilder(this.bubble_).mergeFrom((Bubble) bubble).buildPartial();
        } else {
            this.bubble_ = bubble;
        }
    }

    public static C5809b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EntranceItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EntranceItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntranceItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EntranceItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBubble(Bubble bubble) {
        bubble.getClass();
        this.bubble_ = bubble;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntranceId(long j) {
        this.entranceId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntranceType(int i) {
        this.entranceType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoto(String str) {
        str.getClass();
        this.goto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.goto_ = byteString.toStringUtf8();
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
    public void setModuleId(String str) {
        str.getClass();
        this.moduleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModuleIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.moduleId_ = byteString.toStringUtf8();
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5808a.f15953xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EntranceItem();
            case 2:
                return new C5809b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0002\u0007\t\b\u0004", new Object[]{"goto_", "icon_", "title_", "moduleId_", "uri_", "entranceId_", "bubble_", "entranceType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EntranceItem> parser = PARSER;
                if (parser == null) {
                    synchronized (EntranceItem.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public Bubble getBubble() {
        Bubble bubble = this.bubble_;
        return bubble == null ? Bubble.getDefaultInstance() : bubble;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public long getEntranceId() {
        return this.entranceId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public int getEntranceType() {
        return this.entranceType_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public String getGoto() {
        return this.goto_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public ByteString getGotoBytes() {
        return ByteString.copyFromUtf8(this.goto_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public String getModuleId() {
        return this.moduleId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public ByteString getModuleIdBytes() {
        return ByteString.copyFromUtf8(this.moduleId_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5928h
    public boolean hasBubble() {
        return this.bubble_ != null;
    }

    public static C5809b newBuilder(EntranceItem entranceItem) {
        return DEFAULT_INSTANCE.createBuilder(entranceItem);
    }

    public static EntranceItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EntranceItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EntranceItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EntranceItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EntranceItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EntranceItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EntranceItem parseFrom(InputStream inputStream) throws IOException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntranceItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EntranceItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EntranceItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
