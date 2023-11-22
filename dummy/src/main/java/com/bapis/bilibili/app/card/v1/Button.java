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
public final class Button extends GeneratedMessageLite<Button, Button.C5797b> implements InterfaceC5924d {
    private static final Button DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 4;
    public static final int EVENT_V2_FIELD_NUMBER = 7;
    public static final int PARAM_FIELD_NUMBER = 2;
    private static volatile Parser<Button> PARSER = null;
    public static final int RELATION_FIELD_NUMBER = 8;
    public static final int SELECTED_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 3;
    private Relation relation_;
    private int selected_;
    private int type_;
    private String text_ = "";
    private String param_ = "";
    private String uri_ = "";
    private String event_ = "";
    private String eventV2_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Button$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5796a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15947xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15947xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15947xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Button$b */
    /* loaded from: classes13.dex */
    public static final class C5797b extends GeneratedMessageLite.Builder<Button, C5797b> implements InterfaceC5924d {
        /* synthetic */ C5797b(C5796a c5796a) {
            this();
        }

        public C5797b clearEvent() {
            copyOnWrite();
            ((Button) this.instance).clearEvent();
            return this;
        }

        public C5797b clearEventV2() {
            copyOnWrite();
            ((Button) this.instance).clearEventV2();
            return this;
        }

        public C5797b clearParam() {
            copyOnWrite();
            ((Button) this.instance).clearParam();
            return this;
        }

        public C5797b clearRelation() {
            copyOnWrite();
            ((Button) this.instance).clearRelation();
            return this;
        }

        public C5797b clearSelected() {
            copyOnWrite();
            ((Button) this.instance).clearSelected();
            return this;
        }

        public C5797b clearText() {
            copyOnWrite();
            ((Button) this.instance).clearText();
            return this;
        }

        public C5797b clearType() {
            copyOnWrite();
            ((Button) this.instance).clearType();
            return this;
        }

        public C5797b clearUri() {
            copyOnWrite();
            ((Button) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public String getEvent() {
            return ((Button) this.instance).getEvent();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public ByteString getEventBytes() {
            return ((Button) this.instance).getEventBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public String getEventV2() {
            return ((Button) this.instance).getEventV2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public ByteString getEventV2Bytes() {
            return ((Button) this.instance).getEventV2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public String getParam() {
            return ((Button) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public ByteString getParamBytes() {
            return ((Button) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public Relation getRelation() {
            return ((Button) this.instance).getRelation();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public int getSelected() {
            return ((Button) this.instance).getSelected();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public String getText() {
            return ((Button) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public ByteString getTextBytes() {
            return ((Button) this.instance).getTextBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public int getType() {
            return ((Button) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public String getUri() {
            return ((Button) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public ByteString getUriBytes() {
            return ((Button) this.instance).getUriBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
        public boolean hasRelation() {
            return ((Button) this.instance).hasRelation();
        }

        public C5797b mergeRelation(Relation relation) {
            copyOnWrite();
            ((Button) this.instance).mergeRelation(relation);
            return this;
        }

        public C5797b setEvent(String str) {
            copyOnWrite();
            ((Button) this.instance).setEvent(str);
            return this;
        }

        public C5797b setEventBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setEventBytes(byteString);
            return this;
        }

        public C5797b setEventV2(String str) {
            copyOnWrite();
            ((Button) this.instance).setEventV2(str);
            return this;
        }

        public C5797b setEventV2Bytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setEventV2Bytes(byteString);
            return this;
        }

        public C5797b setParam(String str) {
            copyOnWrite();
            ((Button) this.instance).setParam(str);
            return this;
        }

        public C5797b setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setParamBytes(byteString);
            return this;
        }

        public C5797b setRelation(Relation relation) {
            copyOnWrite();
            ((Button) this.instance).setRelation(relation);
            return this;
        }

        public C5797b setSelected(int i) {
            copyOnWrite();
            ((Button) this.instance).setSelected(i);
            return this;
        }

        public C5797b setText(String str) {
            copyOnWrite();
            ((Button) this.instance).setText(str);
            return this;
        }

        public C5797b setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setTextBytes(byteString);
            return this;
        }

        public C5797b setType(int i) {
            copyOnWrite();
            ((Button) this.instance).setType(i);
            return this;
        }

        public C5797b setUri(String str) {
            copyOnWrite();
            ((Button) this.instance).setUri(str);
            return this;
        }

        public C5797b setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Button) this.instance).setUriBytes(byteString);
            return this;
        }

        private C5797b() {
            super(Button.DEFAULT_INSTANCE);
        }

        public C5797b setRelation(Relation.C5855b c5855b) {
            copyOnWrite();
            ((Button) this.instance).setRelation(c5855b.build());
            return this;
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
    public void clearEvent() {
        this.event_ = getDefaultInstance().getEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventV2() {
        this.eventV2_ = getDefaultInstance().getEventV2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelation() {
        this.relation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelected() {
        this.selected_ = 0;
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

    public static Button getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRelation(Relation relation) {
        relation.getClass();
        Relation relation2 = this.relation_;
        if (relation2 != null && relation2 != Relation.getDefaultInstance()) {
            this.relation_ = Relation.newBuilder(this.relation_).mergeFrom((Relation) relation).buildPartial();
        } else {
            this.relation_ = relation;
        }
    }

    public static C5797b newBuilder() {
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
    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelation(Relation relation) {
        relation.getClass();
        this.relation_ = relation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelected(int i) {
        this.selected_ = i;
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
        switch (C5796a.f15947xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Button();
            case 2:
                return new C5797b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0004\u0006\u0004\u0007\u0208\b\t", new Object[]{"text_", "param_", "uri_", "event_", "selected_", "type_", "eventV2_", "relation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Button> parser = PARSER;
                if (parser == null) {
                    synchronized (Button.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public String getEvent() {
        return this.event_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public ByteString getEventBytes() {
        return ByteString.copyFromUtf8(this.event_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public String getEventV2() {
        return this.eventV2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public ByteString getEventV2Bytes() {
        return ByteString.copyFromUtf8(this.eventV2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public Relation getRelation() {
        Relation relation = this.relation_;
        return relation == null ? Relation.getDefaultInstance() : relation;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public int getSelected() {
        return this.selected_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public String getText() {
        return this.text_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public int getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5924d
    public boolean hasRelation() {
        return this.relation_ != null;
    }

    public static C5797b newBuilder(Button button) {
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
