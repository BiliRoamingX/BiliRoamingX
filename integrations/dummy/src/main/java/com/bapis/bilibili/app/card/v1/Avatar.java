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
public final class Avatar extends GeneratedMessageLite<Avatar, Avatar.C5791b> implements InterfaceC5921b {
    public static final int COVER_FIELD_NUMBER = 1;
    public static final int DEFALUT_COVER_FIELD_NUMBER = 7;
    private static final Avatar DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 5;
    public static final int EVENT_V2_FIELD_NUMBER = 6;
    private static volatile Parser<Avatar> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 3;
    private int defalutCover_;
    private int type_;
    private String cover_ = "";
    private String text_ = "";
    private String uri_ = "";
    private String event_ = "";
    private String eventV2_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Avatar$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5790a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15944xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15944xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15944xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Avatar$b */
    /* loaded from: classes13.dex */
    public static final class C5791b extends GeneratedMessageLite.Builder<Avatar, C5791b> implements InterfaceC5921b {
        /* synthetic */ C5791b(C5790a c5790a) {
            this();
        }

        public C5791b clearCover() {
            copyOnWrite();
            ((Avatar) this.instance).clearCover();
            return this;
        }

        public C5791b clearDefalutCover() {
            copyOnWrite();
            ((Avatar) this.instance).clearDefalutCover();
            return this;
        }

        public C5791b clearEvent() {
            copyOnWrite();
            ((Avatar) this.instance).clearEvent();
            return this;
        }

        public C5791b clearEventV2() {
            copyOnWrite();
            ((Avatar) this.instance).clearEventV2();
            return this;
        }

        public C5791b clearText() {
            copyOnWrite();
            ((Avatar) this.instance).clearText();
            return this;
        }

        public C5791b clearType() {
            copyOnWrite();
            ((Avatar) this.instance).clearType();
            return this;
        }

        public C5791b clearUri() {
            copyOnWrite();
            ((Avatar) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public String getCover() {
            return ((Avatar) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public ByteString getCoverBytes() {
            return ((Avatar) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public int getDefalutCover() {
            return ((Avatar) this.instance).getDefalutCover();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public String getEvent() {
            return ((Avatar) this.instance).getEvent();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public ByteString getEventBytes() {
            return ((Avatar) this.instance).getEventBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public String getEventV2() {
            return ((Avatar) this.instance).getEventV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public ByteString getEventV2Bytes() {
            return ((Avatar) this.instance).getEventV2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public String getText() {
            return ((Avatar) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public ByteString getTextBytes() {
            return ((Avatar) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public int getType() {
            return ((Avatar) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public String getUri() {
            return ((Avatar) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
        public ByteString getUriBytes() {
            return ((Avatar) this.instance).getUriBytes();
        }

        public C5791b setCover(String str) {
            copyOnWrite();
            ((Avatar) this.instance).setCover(str);
            return this;
        }

        public C5791b setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((Avatar) this.instance).setCoverBytes(byteString);
            return this;
        }

        public C5791b setDefalutCover(int i) {
            copyOnWrite();
            ((Avatar) this.instance).setDefalutCover(i);
            return this;
        }

        public C5791b setEvent(String str) {
            copyOnWrite();
            ((Avatar) this.instance).setEvent(str);
            return this;
        }

        public C5791b setEventBytes(ByteString byteString) {
            copyOnWrite();
            ((Avatar) this.instance).setEventBytes(byteString);
            return this;
        }

        public C5791b setEventV2(String str) {
            copyOnWrite();
            ((Avatar) this.instance).setEventV2(str);
            return this;
        }

        public C5791b setEventV2Bytes(ByteString byteString) {
            copyOnWrite();
            ((Avatar) this.instance).setEventV2Bytes(byteString);
            return this;
        }

        public C5791b setText(String str) {
            copyOnWrite();
            ((Avatar) this.instance).setText(str);
            return this;
        }

        public C5791b setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Avatar) this.instance).setTextBytes(byteString);
            return this;
        }

        public C5791b setType(int i) {
            copyOnWrite();
            ((Avatar) this.instance).setType(i);
            return this;
        }

        public C5791b setUri(String str) {
            copyOnWrite();
            ((Avatar) this.instance).setUri(str);
            return this;
        }

        public C5791b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Avatar) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5791b() {
            super(Avatar.DEFAULT_INSTANCE);
        }
    }

    static {
        Avatar avatar = new Avatar();
        DEFAULT_INSTANCE = avatar;
        GeneratedMessageLite.registerDefaultInstance(Avatar.class, avatar);
    }

    private Avatar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefalutCover() {
        this.defalutCover_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = getDefaultInstance().getEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventV2() {
        this.eventV2_ = getDefaultInstance().getEventV2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static Avatar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5791b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Avatar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Avatar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Avatar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Avatar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefalutCover(int i) {
        this.defalutCover_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(String str) {
        str.getClass();
        this.event_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.event_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventV2(String str) {
        str.getClass();
        this.eventV2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventV2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventV2_ = byteString.toStringUtf8();
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
    public void setType(int i) {
        this.type_ = i;
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
        switch (C5790a.f15944xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Avatar();
            case 2:
                return new C5791b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0208\u0007\u0004", new Object[]{"cover_", "text_", "uri_", "type_", "event_", "eventV2_", "defalutCover_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Avatar> parser = PARSER;
                if (parser == null) {
                    synchronized (Avatar.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public int getDefalutCover() {
        return this.defalutCover_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public String getEvent() {
        return this.event_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public ByteString getEventBytes() {
        return ByteString.copyFromUtf8(this.event_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public String getEventV2() {
        return this.eventV2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public ByteString getEventV2Bytes() {
        return ByteString.copyFromUtf8(this.eventV2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public int getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5921b
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static C5791b newBuilder(Avatar avatar) {
        return DEFAULT_INSTANCE.createBuilder(avatar);
    }

    public static Avatar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Avatar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Avatar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Avatar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Avatar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Avatar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Avatar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Avatar parseFrom(InputStream inputStream) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Avatar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Avatar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Avatar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
