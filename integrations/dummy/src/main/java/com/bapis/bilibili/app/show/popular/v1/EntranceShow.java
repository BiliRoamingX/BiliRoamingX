package com.bapis.bilibili.app.show.popular.v1;

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
public final class EntranceShow extends GeneratedMessageLite<EntranceShow, EntranceShow.C8216b> implements InterfaceC8224b {
    public static final int BUBBLE_FIELD_NUMBER = 5;
    private static final EntranceShow DEFAULT_INSTANCE;
    public static final int ENTRANCE_ID_FIELD_NUMBER = 6;
    public static final int ENTRANCE_TYPE_FIELD_NUMBER = 8;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int MODULE_ID_FIELD_NUMBER = 3;
    private static volatile Parser<EntranceShow> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TOP_PHOTO_FIELD_NUMBER = 7;
    public static final int URI_FIELD_NUMBER = 4;
    private Bubble bubble_;
    private long entranceId_;
    private int entranceType_;
    private String icon_ = "";
    private String title_ = "";
    private String moduleId_ = "";
    private String uri_ = "";
    private String topPhoto_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.EntranceShow$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8215a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16849xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16849xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16849xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16849xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16849xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16849xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16849xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16849xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.show.popular.v1.EntranceShow$b */
    /* loaded from: classes13.dex */
    public static final class C8216b extends GeneratedMessageLite.Builder<EntranceShow, C8216b> implements InterfaceC8224b {
        /* synthetic */ C8216b(C8215a c8215a) {
            this();
        }

        public C8216b clearBubble() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearBubble();
            return this;
        }

        public C8216b clearEntranceId() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearEntranceId();
            return this;
        }

        public C8216b clearEntranceType() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearEntranceType();
            return this;
        }

        public C8216b clearIcon() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearIcon();
            return this;
        }

        public C8216b clearModuleId() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearModuleId();
            return this;
        }

        public C8216b clearTitle() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearTitle();
            return this;
        }

        public C8216b clearTopPhoto() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearTopPhoto();
            return this;
        }

        public C8216b clearUri() {
            copyOnWrite();
            ((EntranceShow) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public Bubble getBubble() {
            return ((EntranceShow) this.instance).getBubble();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public long getEntranceId() {
            return ((EntranceShow) this.instance).getEntranceId();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public int getEntranceType() {
            return ((EntranceShow) this.instance).getEntranceType();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public String getIcon() {
            return ((EntranceShow) this.instance).getIcon();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public ByteString getIconBytes() {
            return ((EntranceShow) this.instance).getIconBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public String getModuleId() {
            return ((EntranceShow) this.instance).getModuleId();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public ByteString getModuleIdBytes() {
            return ((EntranceShow) this.instance).getModuleIdBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public String getTitle() {
            return ((EntranceShow) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public ByteString getTitleBytes() {
            return ((EntranceShow) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public String getTopPhoto() {
            return ((EntranceShow) this.instance).getTopPhoto();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public ByteString getTopPhotoBytes() {
            return ((EntranceShow) this.instance).getTopPhotoBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public String getUri() {
            return ((EntranceShow) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public ByteString getUriBytes() {
            return ((EntranceShow) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
        public boolean hasBubble() {
            return ((EntranceShow) this.instance).hasBubble();
        }

        public C8216b mergeBubble(Bubble bubble) {
            copyOnWrite();
            ((EntranceShow) this.instance).mergeBubble(bubble);
            return this;
        }

        public C8216b setBubble(Bubble bubble) {
            copyOnWrite();
            ((EntranceShow) this.instance).setBubble(bubble);
            return this;
        }

        public C8216b setEntranceId(long j) {
            copyOnWrite();
            ((EntranceShow) this.instance).setEntranceId(j);
            return this;
        }

        public C8216b setEntranceType(int i) {
            copyOnWrite();
            ((EntranceShow) this.instance).setEntranceType(i);
            return this;
        }

        public C8216b setIcon(String str) {
            copyOnWrite();
            ((EntranceShow) this.instance).setIcon(str);
            return this;
        }

        public C8216b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceShow) this.instance).setIconBytes(byteString);
            return this;
        }

        public C8216b setModuleId(String str) {
            copyOnWrite();
            ((EntranceShow) this.instance).setModuleId(str);
            return this;
        }

        public C8216b setModuleIdBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceShow) this.instance).setModuleIdBytes(byteString);
            return this;
        }

        public C8216b setTitle(String str) {
            copyOnWrite();
            ((EntranceShow) this.instance).setTitle(str);
            return this;
        }

        public C8216b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceShow) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C8216b setTopPhoto(String str) {
            copyOnWrite();
            ((EntranceShow) this.instance).setTopPhoto(str);
            return this;
        }

        public C8216b setTopPhotoBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceShow) this.instance).setTopPhotoBytes(byteString);
            return this;
        }

        public C8216b setUri(String str) {
            copyOnWrite();
            ((EntranceShow) this.instance).setUri(str);
            return this;
        }

        public C8216b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((EntranceShow) this.instance).setUriBytes(byteString);
            return this;
        }

        private C8216b() {
            super(EntranceShow.DEFAULT_INSTANCE);
        }

        public C8216b setBubble(Bubble.C8212b c8212b) {
            copyOnWrite();
            ((EntranceShow) this.instance).setBubble(c8212b.build());
            return this;
        }
    }

    static {
        EntranceShow entranceShow = new EntranceShow();
        DEFAULT_INSTANCE = entranceShow;
        GeneratedMessageLite.registerDefaultInstance(EntranceShow.class, entranceShow);
    }

    private EntranceShow() {
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
    public void clearTopPhoto() {
        this.topPhoto_ = getDefaultInstance().getTopPhoto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static EntranceShow getDefaultInstance() {
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

    public static C8216b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EntranceShow parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EntranceShow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntranceShow parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EntranceShow> parser() {
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
    public void setTopPhoto(String str) {
        str.getClass();
        this.topPhoto_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopPhotoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topPhoto_ = byteString.toStringUtf8();
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
        switch (C8215a.f16849xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EntranceShow();
            case 2:
                return new C8216b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t\u0006\u0002\u0007\u0208\b\u0004", new Object[]{"icon_", "title_", "moduleId_", "uri_", "bubble_", "entranceId_", "topPhoto_", "entranceType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EntranceShow> parser = PARSER;
                if (parser == null) {
                    synchronized (EntranceShow.class) {
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

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public Bubble getBubble() {
        Bubble bubble = this.bubble_;
        return bubble == null ? Bubble.getDefaultInstance() : bubble;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public long getEntranceId() {
        return this.entranceId_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public int getEntranceType() {
        return this.entranceType_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public String getModuleId() {
        return this.moduleId_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public ByteString getModuleIdBytes() {
        return ByteString.copyFromUtf8(this.moduleId_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public String getTopPhoto() {
        return this.topPhoto_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public ByteString getTopPhotoBytes() {
        return ByteString.copyFromUtf8(this.topPhoto_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.show.popular.v1.InterfaceC8224b
    public boolean hasBubble() {
        return this.bubble_ != null;
    }

    public static C8216b newBuilder(EntranceShow entranceShow) {
        return DEFAULT_INSTANCE.createBuilder(entranceShow);
    }

    public static EntranceShow parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceShow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EntranceShow parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EntranceShow parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EntranceShow parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EntranceShow parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EntranceShow parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EntranceShow parseFrom(InputStream inputStream) throws IOException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntranceShow parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EntranceShow parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EntranceShow parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EntranceShow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
