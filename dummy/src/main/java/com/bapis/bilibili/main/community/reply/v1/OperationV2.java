package com.bapis.bilibili.main.community.reply.v1;

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
/* loaded from: classes21.dex */
public final class OperationV2 extends GeneratedMessageLite<OperationV2, OperationV2.C14786b> implements MessageLiteOrBuilder {
    private static final OperationV2 DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile Parser<OperationV2> PARSER = null;
    public static final int PREFIX_TEXT_FIELD_NUMBER = 2;
    public static final int REPORT_EXTRA_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    private Icon icon_;
    private int type_;
    private String prefixText_ = "";
    private String title_ = "";
    private String link_ = "";
    private String reportExtra_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Icon extends GeneratedMessageLite<Icon, Icon.C14782a> implements MessageLiteOrBuilder {
        private static final Icon DEFAULT_INSTANCE;
        private static volatile Parser<Icon> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 2;
        private int position_;
        private String url_ = "";

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public enum Position implements Internal.EnumLite {
            PREFIX(0),
            SUFFIX(1),
            UNRECOGNIZED(-1);
            
            public static final int PREFIX_VALUE = 0;
            public static final int SUFFIX_VALUE = 1;
            private static final Internal.EnumLiteMap<Position> internalValueMap = new C14780a();
            private final int value;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationV2$Icon$Position$a */
            /* loaded from: classes21.dex */
            static class C14780a implements Internal.EnumLiteMap<Position> {
                C14780a() {
                }

                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Position findValueByNumber(int i) {
                    return Position.forNumber(i);
                }
            }

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationV2$Icon$Position$b */
            /* loaded from: classes21.dex */
            private static final class C14781b implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new C14781b();

                private C14781b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Position.forNumber(i) != null;
                }
            }

            Position(int i) {
                this.value = i;
            }

            public static Position forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return SUFFIX;
                }
                return PREFIX;
            }

            public static Internal.EnumLiteMap<Position> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return C14781b.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static Position valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationV2$Icon$a */
        /* loaded from: classes21.dex */
        public static final class C14782a extends GeneratedMessageLite.Builder<Icon, C14782a> implements MessageLiteOrBuilder {
            /* synthetic */ C14782a(C14785a c14785a) {
                this();
            }

            public C14782a clearPosition() {
                copyOnWrite();
                ((Icon) this.instance).clearPosition();
                return this;
            }

            public C14782a clearUrl() {
                copyOnWrite();
                ((Icon) this.instance).clearUrl();
                return this;
            }

            public Position getPosition() {
                return ((Icon) this.instance).getPosition();
            }

            public int getPositionValue() {
                return ((Icon) this.instance).getPositionValue();
            }

            public String getUrl() {
                return ((Icon) this.instance).getUrl();
            }

            public ByteString getUrlBytes() {
                return ((Icon) this.instance).getUrlBytes();
            }

            public C14782a setPosition(Position position) {
                copyOnWrite();
                ((Icon) this.instance).setPosition(position);
                return this;
            }

            public C14782a setPositionValue(int i) {
                copyOnWrite();
                ((Icon) this.instance).setPositionValue(i);
                return this;
            }

            public C14782a setUrl(String str) {
                copyOnWrite();
                ((Icon) this.instance).setUrl(str);
                return this;
            }

            public C14782a setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Icon) this.instance).setUrlBytes(byteString);
                return this;
            }

            private C14782a() {
                super(Icon.DEFAULT_INSTANCE);
            }
        }

        static {
            Icon icon = new Icon();
            DEFAULT_INSTANCE = icon;
            GeneratedMessageLite.registerDefaultInstance(Icon.class, icon);
        }

        private Icon() {
        }

        public void clearPosition() {
            this.position_ = 0;
        }

        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static Icon getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14782a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Icon parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Icon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Icon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Icon> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public void setPosition(Position position) {
            this.position_ = position.getNumber();
        }

        public void setPositionValue(int i) {
            this.position_ = i;
        }

        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        public void setUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14785a.f22009xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Icon();
                case 2:
                    return new C14782a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0208", new Object[]{"position_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Icon> parser = PARSER;
                    if (parser == null) {
                        synchronized (Icon.class) {
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

        public Position getPosition() {
            Position forNumber = Position.forNumber(this.position_);
            return forNumber == null ? Position.UNRECOGNIZED : forNumber;
        }

        public int getPositionValue() {
            return this.position_;
        }

        public String getUrl() {
            return this.url_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static C14782a newBuilder(Icon icon) {
            return DEFAULT_INSTANCE.createBuilder(icon);
        }

        public static Icon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Icon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Icon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Icon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Icon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Icon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Icon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Icon parseFrom(InputStream inputStream) throws IOException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Icon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Icon parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Icon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Icon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public enum Type implements Internal.EnumLite {
        UNKNOWN(0),
        NOTE(1),
        TOPIC(2),
        SEARCH(4),
        UNRECOGNIZED(-1);
        
        public static final int NOTE_VALUE = 1;
        public static final int SEARCH_VALUE = 4;
        public static final int TOPIC_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new C14783a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationV2$Type$a */
        /* loaded from: classes21.dex */
        static class C14783a implements Internal.EnumLiteMap<Type> {
            C14783a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationV2$Type$b */
        /* loaded from: classes21.dex */
        private static final class C14784b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C14784b();

            private C14784b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return Type.forNumber(i) != null;
            }
        }

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return null;
                        }
                        return SEARCH;
                    }
                    return TOPIC;
                }
                return NOTE;
            }
            return UNKNOWN;
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C14784b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationV2$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14785a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22009xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22009xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22009xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22009xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22009xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22009xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.OperationV2$b */
    /* loaded from: classes21.dex */
    public static final class C14786b extends GeneratedMessageLite.Builder<OperationV2, C14786b> implements MessageLiteOrBuilder {
        /* synthetic */ C14786b(C14785a c14785a) {
            this();
        }

        public C14786b clearIcon() {
            copyOnWrite();
            ((OperationV2) this.instance).clearIcon();
            return this;
        }

        public C14786b clearLink() {
            copyOnWrite();
            ((OperationV2) this.instance).clearLink();
            return this;
        }

        public C14786b clearPrefixText() {
            copyOnWrite();
            ((OperationV2) this.instance).clearPrefixText();
            return this;
        }

        public C14786b clearReportExtra() {
            copyOnWrite();
            ((OperationV2) this.instance).clearReportExtra();
            return this;
        }

        public C14786b clearTitle() {
            copyOnWrite();
            ((OperationV2) this.instance).clearTitle();
            return this;
        }

        public C14786b clearType() {
            copyOnWrite();
            ((OperationV2) this.instance).clearType();
            return this;
        }

        public Icon getIcon() {
            return ((OperationV2) this.instance).getIcon();
        }

        public String getLink() {
            return ((OperationV2) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((OperationV2) this.instance).getLinkBytes();
        }

        public String getPrefixText() {
            return ((OperationV2) this.instance).getPrefixText();
        }

        public ByteString getPrefixTextBytes() {
            return ((OperationV2) this.instance).getPrefixTextBytes();
        }

        public String getReportExtra() {
            return ((OperationV2) this.instance).getReportExtra();
        }

        public ByteString getReportExtraBytes() {
            return ((OperationV2) this.instance).getReportExtraBytes();
        }

        public String getTitle() {
            return ((OperationV2) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((OperationV2) this.instance).getTitleBytes();
        }

        public Type getType() {
            return ((OperationV2) this.instance).getType();
        }

        public int getTypeValue() {
            return ((OperationV2) this.instance).getTypeValue();
        }

        public boolean hasIcon() {
            return ((OperationV2) this.instance).hasIcon();
        }

        public C14786b mergeIcon(Icon icon) {
            copyOnWrite();
            ((OperationV2) this.instance).mergeIcon(icon);
            return this;
        }

        public C14786b setIcon(Icon icon) {
            copyOnWrite();
            ((OperationV2) this.instance).setIcon(icon);
            return this;
        }

        public C14786b setLink(String str) {
            copyOnWrite();
            ((OperationV2) this.instance).setLink(str);
            return this;
        }

        public C14786b setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationV2) this.instance).setLinkBytes(byteString);
            return this;
        }

        public C14786b setPrefixText(String str) {
            copyOnWrite();
            ((OperationV2) this.instance).setPrefixText(str);
            return this;
        }

        public C14786b setPrefixTextBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationV2) this.instance).setPrefixTextBytes(byteString);
            return this;
        }

        public C14786b setReportExtra(String str) {
            copyOnWrite();
            ((OperationV2) this.instance).setReportExtra(str);
            return this;
        }

        public C14786b setReportExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationV2) this.instance).setReportExtraBytes(byteString);
            return this;
        }

        public C14786b setTitle(String str) {
            copyOnWrite();
            ((OperationV2) this.instance).setTitle(str);
            return this;
        }

        public C14786b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((OperationV2) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C14786b setType(Type type) {
            copyOnWrite();
            ((OperationV2) this.instance).setType(type);
            return this;
        }

        public C14786b setTypeValue(int i) {
            copyOnWrite();
            ((OperationV2) this.instance).setTypeValue(i);
            return this;
        }

        private C14786b() {
            super(OperationV2.DEFAULT_INSTANCE);
        }

        public C14786b setIcon(Icon.C14782a c14782a) {
            copyOnWrite();
            ((OperationV2) this.instance).setIcon(c14782a.build());
            return this;
        }
    }

    static {
        OperationV2 operationV2 = new OperationV2();
        DEFAULT_INSTANCE = operationV2;
        GeneratedMessageLite.registerDefaultInstance(OperationV2.class, operationV2);
    }

    private OperationV2() {
    }

    public void clearIcon() {
        this.icon_ = null;
    }

    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    public void clearPrefixText() {
        this.prefixText_ = getDefaultInstance().getPrefixText();
    }

    public void clearReportExtra() {
        this.reportExtra_ = getDefaultInstance().getReportExtra();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearType() {
        this.type_ = 0;
    }

    public static OperationV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeIcon(Icon icon) {
        icon.getClass();
        Icon icon2 = this.icon_;
        if (icon2 != null && icon2 != Icon.getDefaultInstance()) {
            this.icon_ = Icon.newBuilder(this.icon_).mergeFrom((Icon) icon).buildPartial();
        } else {
            this.icon_ = icon;
        }
    }

    public static C14786b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OperationV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OperationV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIcon(Icon icon) {
        icon.getClass();
        this.icon_ = icon;
    }

    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    public void setPrefixText(String str) {
        str.getClass();
        this.prefixText_ = str;
    }

    public void setPrefixTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.prefixText_ = byteString.toStringUtf8();
    }

    public void setReportExtra(String str) {
        str.getClass();
        this.reportExtra_ = str;
    }

    public void setReportExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reportExtra_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14785a.f22009xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new OperationV2();
            case 2:
                return new C14786b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\t\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"type_", "prefixText_", "icon_", "title_", "link_", "reportExtra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OperationV2> parser = PARSER;
                if (parser == null) {
                    synchronized (OperationV2.class) {
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

    public Icon getIcon() {
        Icon icon = this.icon_;
        return icon == null ? Icon.getDefaultInstance() : icon;
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getPrefixText() {
        return this.prefixText_;
    }

    public ByteString getPrefixTextBytes() {
        return ByteString.copyFromUtf8(this.prefixText_);
    }

    public String getReportExtra() {
        return this.reportExtra_;
    }

    public ByteString getReportExtraBytes() {
        return ByteString.copyFromUtf8(this.reportExtra_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public Type getType() {
        Type forNumber = Type.forNumber(this.type_);
        return forNumber == null ? Type.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasIcon() {
        return this.icon_ != null;
    }

    public static C14786b newBuilder(OperationV2 operationV2) {
        return DEFAULT_INSTANCE.createBuilder(operationV2);
    }

    public static OperationV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OperationV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OperationV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OperationV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OperationV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OperationV2 parseFrom(InputStream inputStream) throws IOException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OperationV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OperationV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OperationV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
