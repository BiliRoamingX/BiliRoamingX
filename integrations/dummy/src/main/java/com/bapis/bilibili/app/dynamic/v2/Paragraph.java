package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class Paragraph extends GeneratedMessageLite<Paragraph, Paragraph.C5893b> implements ub {
    public static final int CODE_FIELD_NUMBER = 7;
    private static final Paragraph DEFAULT_INSTANCE;
    public static final int LINE_FIELD_NUMBER = 5;
    public static final int LINK_CARD_FIELD_NUMBER = 6;
    public static final int PARA_FORMAT_FIELD_NUMBER = 2;
    public static final int PARA_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<Paragraph> PARSER = null;
    public static final int PIC_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 3;
    private int contentCase_ = 0;
    private Object content_;
    private ParagraphFormat paraFormat_;
    private int paraType_;

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public enum ContentCase {
        TEXT(3),
        PIC(4),
        LINE(5),
        LINK_CARD(6),
        CODE(7),
        CONTENT_NOT_SET(0);

        private final int value;

        ContentCase(int i2) {
            this.value = i2;
        }

        public static ContentCase forNumber(int i2) {
            if (i2 == 0) {
                return CONTENT_NOT_SET;
            }
            if (i2 == 3) {
                return TEXT;
            }
            if (i2 == 4) {
                return PIC;
            }
            if (i2 == 5) {
                return LINE;
            }
            if (i2 == 6) {
                return LINK_CARD;
            }
            if (i2 != 7) {
                return null;
            }
            return CODE;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ContentCase valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public static final class ListFormat extends GeneratedMessageLite<ListFormat, ListFormat.C5886a> implements InterfaceC5894c {
        private static final ListFormat DEFAULT_INSTANCE;
        public static final int LEVEL_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile Parser<ListFormat> PARSER = null;
        public static final int THEME_FIELD_NUMBER = 3;
        private int level_;
        private int order_;
        private String theme_ = "";

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$ListFormat$a */
        /* loaded from: classes19.dex */
        public static final class C5886a extends GeneratedMessageLite.Builder<ListFormat, C5886a> implements InterfaceC5894c {
            /* synthetic */ C5886a(C5892a c5892a) {
                this();
            }

            public C5886a clearLevel() {
                copyOnWrite();
                ((ListFormat) this.instance).clearLevel();
                return this;
            }

            public C5886a clearOrder() {
                copyOnWrite();
                ((ListFormat) this.instance).clearOrder();
                return this;
            }

            public C5886a clearTheme() {
                copyOnWrite();
                ((ListFormat) this.instance).clearTheme();
                return this;
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
            public int getLevel() {
                return ((ListFormat) this.instance).getLevel();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
            public int getOrder() {
                return ((ListFormat) this.instance).getOrder();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
            public String getTheme() {
                return ((ListFormat) this.instance).getTheme();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
            public ByteString getThemeBytes() {
                return ((ListFormat) this.instance).getThemeBytes();
            }

            public C5886a setLevel(int i2) {
                copyOnWrite();
                ((ListFormat) this.instance).setLevel(i2);
                return this;
            }

            public C5886a setOrder(int i2) {
                copyOnWrite();
                ((ListFormat) this.instance).setOrder(i2);
                return this;
            }

            public C5886a setTheme(String str) {
                copyOnWrite();
                ((ListFormat) this.instance).setTheme(str);
                return this;
            }

            public C5886a setThemeBytes(ByteString byteString) {
                copyOnWrite();
                ((ListFormat) this.instance).setThemeBytes(byteString);
                return this;
            }

            private C5886a() {
                super(ListFormat.DEFAULT_INSTANCE);
            }
        }

        static {
            ListFormat listFormat = new ListFormat();
            DEFAULT_INSTANCE = listFormat;
            GeneratedMessageLite.registerDefaultInstance(ListFormat.class, listFormat);
        }

        private ListFormat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrder() {
            this.order_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTheme() {
            this.theme_ = getDefaultInstance().getTheme();
        }

        public static ListFormat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C5886a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ListFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ListFormat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(int i2) {
            this.level_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrder(int i2) {
            this.order_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTheme(String str) {
            str.getClass();
            this.theme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThemeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.theme_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C5892a c5892a = null;
            switch (C5892a.f17441xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ListFormat();
                case 2:
                    return new C5886a(c5892a);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0208", new Object[]{"level_", "order_", "theme_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ListFormat> parser = PARSER;
                    if (parser == null) {
                        synchronized (ListFormat.class) {
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

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
        public int getLevel() {
            return this.level_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
        public int getOrder() {
            return this.order_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
        public String getTheme() {
            return this.theme_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5894c
        public ByteString getThemeBytes() {
            return ByteString.copyFromUtf8(this.theme_);
        }

        public static C5886a newBuilder(ListFormat listFormat) {
            return DEFAULT_INSTANCE.createBuilder(listFormat);
        }

        public static ListFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ListFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ListFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ListFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ListFormat parseFrom(InputStream inputStream) throws IOException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ListFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ListFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public enum ParagraphAlign implements Internal.EnumLite {
        LEFT(0),
        MIDDLE(1),
        RIGHT(2),
        UNRECOGNIZED(-1);

        public static final int LEFT_VALUE = 0;
        public static final int MIDDLE_VALUE = 1;
        public static final int RIGHT_VALUE = 2;
        private static final Internal.EnumLiteMap<ParagraphAlign> internalValueMap = new C5887a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$ParagraphAlign$a */
        /* loaded from: classes19.dex */
        static class C5887a implements Internal.EnumLiteMap<ParagraphAlign> {
            C5887a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ParagraphAlign findValueByNumber(int i2) {
                return ParagraphAlign.forNumber(i2);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$ParagraphAlign$b */
        /* loaded from: classes19.dex */
        private static final class C5888b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C5888b();

            private C5888b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i2) {
                return ParagraphAlign.forNumber(i2) != null;
            }
        }

        ParagraphAlign(int i2) {
            this.value = i2;
        }

        public static ParagraphAlign forNumber(int i2) {
            if (i2 == 0) {
                return LEFT;
            }
            if (i2 == 1) {
                return MIDDLE;
            }
            if (i2 != 2) {
                return null;
            }
            return RIGHT;
        }

        public static Internal.EnumLiteMap<ParagraphAlign> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C5888b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ParagraphAlign valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public static final class ParagraphFormat extends GeneratedMessageLite<ParagraphFormat, ParagraphFormat.C5889a> implements InterfaceC5895d {
        public static final int ALIGN_FIELD_NUMBER = 1;
        private static final ParagraphFormat DEFAULT_INSTANCE;
        public static final int LIST_FORMAT_FIELD_NUMBER = 2;
        private static volatile Parser<ParagraphFormat> PARSER;
        private int align_;
        private ListFormat listFormat_;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$ParagraphFormat$a */
        /* loaded from: classes19.dex */
        public static final class C5889a extends GeneratedMessageLite.Builder<ParagraphFormat, C5889a> implements InterfaceC5895d {
            /* synthetic */ C5889a(C5892a c5892a) {
                this();
            }

            public C5889a clearAlign() {
                copyOnWrite();
                ((ParagraphFormat) this.instance).clearAlign();
                return this;
            }

            public C5889a clearListFormat() {
                copyOnWrite();
                ((ParagraphFormat) this.instance).clearListFormat();
                return this;
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
            public ParagraphAlign getAlign() {
                return ((ParagraphFormat) this.instance).getAlign();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
            public int getAlignValue() {
                return ((ParagraphFormat) this.instance).getAlignValue();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
            public ListFormat getListFormat() {
                return ((ParagraphFormat) this.instance).getListFormat();
            }

            @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
            public boolean hasListFormat() {
                return ((ParagraphFormat) this.instance).hasListFormat();
            }

            public C5889a mergeListFormat(ListFormat listFormat) {
                copyOnWrite();
                ((ParagraphFormat) this.instance).mergeListFormat(listFormat);
                return this;
            }

            public C5889a setAlign(ParagraphAlign paragraphAlign) {
                copyOnWrite();
                ((ParagraphFormat) this.instance).setAlign(paragraphAlign);
                return this;
            }

            public C5889a setAlignValue(int i2) {
                copyOnWrite();
                ((ParagraphFormat) this.instance).setAlignValue(i2);
                return this;
            }

            public C5889a setListFormat(ListFormat listFormat) {
                copyOnWrite();
                ((ParagraphFormat) this.instance).setListFormat(listFormat);
                return this;
            }

            private C5889a() {
                super(ParagraphFormat.DEFAULT_INSTANCE);
            }

            public C5889a setListFormat(ListFormat.C5886a c5886a) {
                copyOnWrite();
                ((ParagraphFormat) this.instance).setListFormat(c5886a.build());
                return this;
            }
        }

        static {
            ParagraphFormat paragraphFormat = new ParagraphFormat();
            DEFAULT_INSTANCE = paragraphFormat;
            GeneratedMessageLite.registerDefaultInstance(ParagraphFormat.class, paragraphFormat);
        }

        private ParagraphFormat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlign() {
            this.align_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearListFormat() {
            this.listFormat_ = null;
        }

        public static ParagraphFormat getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListFormat(ListFormat listFormat) {
            listFormat.getClass();
            ListFormat listFormat2 = this.listFormat_;
            if (listFormat2 != null && listFormat2 != ListFormat.getDefaultInstance()) {
                this.listFormat_ = ListFormat.newBuilder(this.listFormat_).mergeFrom((ListFormat) listFormat).buildPartial();
            } else {
                this.listFormat_ = listFormat;
            }
        }

        public static C5889a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ParagraphFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ParagraphFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParagraphFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ParagraphFormat> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlign(ParagraphAlign paragraphAlign) {
            this.align_ = paragraphAlign.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlignValue(int i2) {
            this.align_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setListFormat(ListFormat listFormat) {
            listFormat.getClass();
            this.listFormat_ = listFormat;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            C5892a c5892a = null;
            switch (C5892a.f17441xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ParagraphFormat();
                case 2:
                    return new C5889a(c5892a);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"align_", "listFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ParagraphFormat> parser = PARSER;
                    if (parser == null) {
                        synchronized (ParagraphFormat.class) {
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

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
        public ParagraphAlign getAlign() {
            ParagraphAlign forNumber = ParagraphAlign.forNumber(this.align_);
            return forNumber == null ? ParagraphAlign.UNRECOGNIZED : forNumber;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
        public int getAlignValue() {
            return this.align_;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
        public ListFormat getListFormat() {
            ListFormat listFormat = this.listFormat_;
            return listFormat == null ? ListFormat.getDefaultInstance() : listFormat;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.Paragraph.InterfaceC5895d
        public boolean hasListFormat() {
            return this.listFormat_ != null;
        }

        public static C5889a newBuilder(ParagraphFormat paragraphFormat) {
            return DEFAULT_INSTANCE.createBuilder(paragraphFormat);
        }

        public static ParagraphFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParagraphFormat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParagraphFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ParagraphFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ParagraphFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ParagraphFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ParagraphFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ParagraphFormat parseFrom(InputStream inputStream) throws IOException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ParagraphFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ParagraphFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ParagraphFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ParagraphFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes19.dex */
    public enum ParagraphType implements Internal.EnumLite {
        INVALID(0),
        TEXT(1),
        PICTURES(2),
        LINE(3),
        REFERENCE(4),
        SORTED_LIST(5),
        UNSORTED_LIST(6),
        LINK_CARD(7),
        CODE(8),
        UNRECOGNIZED(-1);

        public static final int CODE_VALUE = 8;
        public static final int INVALID_VALUE = 0;
        public static final int LINE_VALUE = 3;
        public static final int LINK_CARD_VALUE = 7;
        public static final int PICTURES_VALUE = 2;
        public static final int REFERENCE_VALUE = 4;
        public static final int SORTED_LIST_VALUE = 5;
        public static final int TEXT_VALUE = 1;
        public static final int UNSORTED_LIST_VALUE = 6;
        private static final Internal.EnumLiteMap<ParagraphType> internalValueMap = new C5890a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$ParagraphType$a */
        /* loaded from: classes19.dex */
        static class C5890a implements Internal.EnumLiteMap<ParagraphType> {
            C5890a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ParagraphType findValueByNumber(int i2) {
                return ParagraphType.forNumber(i2);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$ParagraphType$b */
        /* loaded from: classes19.dex */
        private static final class C5891b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C5891b();

            private C5891b() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i2) {
                return ParagraphType.forNumber(i2) != null;
            }
        }

        ParagraphType(int i2) {
            this.value = i2;
        }

        public static ParagraphType forNumber(int i2) {
            switch (i2) {
                case 0:
                    return INVALID;
                case 1:
                    return TEXT;
                case 2:
                    return PICTURES;
                case 3:
                    return LINE;
                case 4:
                    return REFERENCE;
                case 5:
                    return SORTED_LIST;
                case 6:
                    return UNSORTED_LIST;
                case 7:
                    return LINK_CARD;
                case 8:
                    return CODE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ParagraphType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C5891b.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ParagraphType valueOf(int i2) {
            return forNumber(i2);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5892a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17441xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17441xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17441xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17441xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17441xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17441xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17441xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17441xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$b */
    /* loaded from: classes19.dex */
    public static final class C5893b extends GeneratedMessageLite.Builder<Paragraph, C5893b> implements ub {
        /* synthetic */ C5893b(C5892a c5892a) {
            this();
        }

        public C5893b clearCode() {
            copyOnWrite();
            ((Paragraph) this.instance).clearCode();
            return this;
        }

        public C5893b clearContent() {
            copyOnWrite();
            ((Paragraph) this.instance).clearContent();
            return this;
        }

        public C5893b clearLine() {
            copyOnWrite();
            ((Paragraph) this.instance).clearLine();
            return this;
        }

        public C5893b clearLinkCard() {
            copyOnWrite();
            ((Paragraph) this.instance).clearLinkCard();
            return this;
        }

        public C5893b clearParaFormat() {
            copyOnWrite();
            ((Paragraph) this.instance).clearParaFormat();
            return this;
        }

        public C5893b clearParaType() {
            copyOnWrite();
            ((Paragraph) this.instance).clearParaType();
            return this;
        }

        public C5893b clearPic() {
            copyOnWrite();
            ((Paragraph) this.instance).clearPic();
            return this;
        }

        public C5893b clearText() {
            copyOnWrite();
            ((Paragraph) this.instance).clearText();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public CodeParagraph getCode() {
            return ((Paragraph) this.instance).getCode();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public ContentCase getContentCase() {
            return ((Paragraph) this.instance).getContentCase();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public LineParagraph getLine() {
            return ((Paragraph) this.instance).getLine();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public CardParagraph getLinkCard() {
            return ((Paragraph) this.instance).getLinkCard();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public ParagraphFormat getParaFormat() {
            return ((Paragraph) this.instance).getParaFormat();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public ParagraphType getParaType() {
            return ((Paragraph) this.instance).getParaType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public int getParaTypeValue() {
            return ((Paragraph) this.instance).getParaTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public PicParagraph getPic() {
            return ((Paragraph) this.instance).getPic();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public TextParagraph getText() {
            return ((Paragraph) this.instance).getText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public boolean hasCode() {
            return ((Paragraph) this.instance).hasCode();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public boolean hasLine() {
            return ((Paragraph) this.instance).hasLine();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public boolean hasLinkCard() {
            return ((Paragraph) this.instance).hasLinkCard();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public boolean hasParaFormat() {
            return ((Paragraph) this.instance).hasParaFormat();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public boolean hasPic() {
            return ((Paragraph) this.instance).hasPic();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.ub
        public boolean hasText() {
            return ((Paragraph) this.instance).hasText();
        }

        public C5893b mergeCode(CodeParagraph codeParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).mergeCode(codeParagraph);
            return this;
        }

        public C5893b mergeLine(LineParagraph lineParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).mergeLine(lineParagraph);
            return this;
        }

        public C5893b mergeLinkCard(CardParagraph cardParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).mergeLinkCard(cardParagraph);
            return this;
        }

        public C5893b mergeParaFormat(ParagraphFormat paragraphFormat) {
            copyOnWrite();
            ((Paragraph) this.instance).mergeParaFormat(paragraphFormat);
            return this;
        }

        public C5893b mergePic(PicParagraph picParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).mergePic(picParagraph);
            return this;
        }

        public C5893b mergeText(TextParagraph textParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).mergeText(textParagraph);
            return this;
        }

        public C5893b setCode(CodeParagraph codeParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).setCode(codeParagraph);
            return this;
        }

        public C5893b setLine(LineParagraph lineParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).setLine(lineParagraph);
            return this;
        }

        public C5893b setLinkCard(CardParagraph cardParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).setLinkCard(cardParagraph);
            return this;
        }

        public C5893b setParaFormat(ParagraphFormat paragraphFormat) {
            copyOnWrite();
            ((Paragraph) this.instance).setParaFormat(paragraphFormat);
            return this;
        }

        public C5893b setParaType(ParagraphType paragraphType) {
            copyOnWrite();
            ((Paragraph) this.instance).setParaType(paragraphType);
            return this;
        }

        public C5893b setParaTypeValue(int i2) {
            copyOnWrite();
            ((Paragraph) this.instance).setParaTypeValue(i2);
            return this;
        }

        public C5893b setPic(PicParagraph picParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).setPic(picParagraph);
            return this;
        }

        public C5893b setText(TextParagraph textParagraph) {
            copyOnWrite();
            ((Paragraph) this.instance).setText(textParagraph);
            return this;
        }

        private C5893b() {
            super(Paragraph.DEFAULT_INSTANCE);
        }

        public C5893b setCode(CodeParagraph.C5303b c5303b) {
            copyOnWrite();
            ((Paragraph) this.instance).setCode(c5303b.build());
            return this;
        }

        public C5893b setLine(LineParagraph.C5640b c5640b) {
            copyOnWrite();
            ((Paragraph) this.instance).setLine(c5640b.build());
            return this;
        }

        public C5893b setLinkCard(CardParagraph.C5291b c5291b) {
            copyOnWrite();
            ((Paragraph) this.instance).setLinkCard(c5291b.build());
            return this;
        }

        public C5893b setParaFormat(ParagraphFormat.C5889a c5889a) {
            copyOnWrite();
            ((Paragraph) this.instance).setParaFormat(c5889a.build());
            return this;
        }

        public C5893b setPic(PicParagraph.C5899b c5899b) {
            copyOnWrite();
            ((Paragraph) this.instance).setPic(c5899b.build());
            return this;
        }

        public C5893b setText(TextParagraph.C6003b c6003b) {
            copyOnWrite();
            ((Paragraph) this.instance).setText(c6003b.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$c */
    /* loaded from: classes19.dex */
    public interface InterfaceC5894c extends MessageLiteOrBuilder {
        int getLevel();

        int getOrder();

        String getTheme();

        ByteString getThemeBytes();
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Paragraph$d */
    /* loaded from: classes19.dex */
    public interface InterfaceC5895d extends MessageLiteOrBuilder {
        ParagraphAlign getAlign();

        int getAlignValue();

        ListFormat getListFormat();

        boolean hasListFormat();
    }

    static {
        Paragraph paragraph = new Paragraph();
        DEFAULT_INSTANCE = paragraph;
        GeneratedMessageLite.registerDefaultInstance(Paragraph.class, paragraph);
    }

    private Paragraph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        if (this.contentCase_ == 7) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.contentCase_ = 0;
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLine() {
        if (this.contentCase_ == 5) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkCard() {
        if (this.contentCase_ == 6) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParaFormat() {
        this.paraFormat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParaType() {
        this.paraType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPic() {
        if (this.contentCase_ == 4) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        if (this.contentCase_ == 3) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    public static Paragraph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCode(CodeParagraph codeParagraph) {
        codeParagraph.getClass();
        if (this.contentCase_ == 7 && this.content_ != CodeParagraph.getDefaultInstance()) {
            this.content_ = CodeParagraph.newBuilder((CodeParagraph) this.content_).mergeFrom((CodeParagraph) codeParagraph).buildPartial();
        } else {
            this.content_ = codeParagraph;
        }
        this.contentCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLine(LineParagraph lineParagraph) {
        lineParagraph.getClass();
        if (this.contentCase_ == 5 && this.content_ != LineParagraph.getDefaultInstance()) {
            this.content_ = LineParagraph.newBuilder((LineParagraph) this.content_).mergeFrom((LineParagraph) lineParagraph).buildPartial();
        } else {
            this.content_ = lineParagraph;
        }
        this.contentCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkCard(CardParagraph cardParagraph) {
        cardParagraph.getClass();
        if (this.contentCase_ == 6 && this.content_ != CardParagraph.getDefaultInstance()) {
            this.content_ = CardParagraph.newBuilder((CardParagraph) this.content_).mergeFrom((CardParagraph) cardParagraph).buildPartial();
        } else {
            this.content_ = cardParagraph;
        }
        this.contentCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParaFormat(ParagraphFormat paragraphFormat) {
        paragraphFormat.getClass();
        ParagraphFormat paragraphFormat2 = this.paraFormat_;
        if (paragraphFormat2 != null && paragraphFormat2 != ParagraphFormat.getDefaultInstance()) {
            this.paraFormat_ = ParagraphFormat.newBuilder(this.paraFormat_).mergeFrom((ParagraphFormat) paragraphFormat).buildPartial();
        } else {
            this.paraFormat_ = paragraphFormat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePic(PicParagraph picParagraph) {
        picParagraph.getClass();
        if (this.contentCase_ == 4 && this.content_ != PicParagraph.getDefaultInstance()) {
            this.content_ = PicParagraph.newBuilder((PicParagraph) this.content_).mergeFrom((PicParagraph) picParagraph).buildPartial();
        } else {
            this.content_ = picParagraph;
        }
        this.contentCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeText(TextParagraph textParagraph) {
        textParagraph.getClass();
        if (this.contentCase_ == 3 && this.content_ != TextParagraph.getDefaultInstance()) {
            this.content_ = TextParagraph.newBuilder((TextParagraph) this.content_).mergeFrom((TextParagraph) textParagraph).buildPartial();
        } else {
            this.content_ = textParagraph;
        }
        this.contentCase_ = 3;
    }

    public static C5893b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Paragraph parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Paragraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Paragraph parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Paragraph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(CodeParagraph codeParagraph) {
        codeParagraph.getClass();
        this.content_ = codeParagraph;
        this.contentCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLine(LineParagraph lineParagraph) {
        lineParagraph.getClass();
        this.content_ = lineParagraph;
        this.contentCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkCard(CardParagraph cardParagraph) {
        cardParagraph.getClass();
        this.content_ = cardParagraph;
        this.contentCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParaFormat(ParagraphFormat paragraphFormat) {
        paragraphFormat.getClass();
        this.paraFormat_ = paragraphFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParaType(ParagraphType paragraphType) {
        this.paraType_ = paragraphType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParaTypeValue(int i2) {
        this.paraType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPic(PicParagraph picParagraph) {
        picParagraph.getClass();
        this.content_ = picParagraph;
        this.contentCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(TextParagraph textParagraph) {
        textParagraph.getClass();
        this.content_ = textParagraph;
        this.contentCase_ = 3;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5892a c5892a = null;
        switch (C5892a.f17441xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Paragraph();
            case 2:
                return new C5893b(c5892a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\t\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"content_", "contentCase_", "paraType_", "paraFormat_", TextParagraph.class, PicParagraph.class, LineParagraph.class, CardParagraph.class, CodeParagraph.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Paragraph> parser = PARSER;
                if (parser == null) {
                    synchronized (Paragraph.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public CodeParagraph getCode() {
        if (this.contentCase_ == 7) {
            return (CodeParagraph) this.content_;
        }
        return CodeParagraph.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public ContentCase getContentCase() {
        return ContentCase.forNumber(this.contentCase_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public LineParagraph getLine() {
        if (this.contentCase_ == 5) {
            return (LineParagraph) this.content_;
        }
        return LineParagraph.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public CardParagraph getLinkCard() {
        if (this.contentCase_ == 6) {
            return (CardParagraph) this.content_;
        }
        return CardParagraph.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public ParagraphFormat getParaFormat() {
        ParagraphFormat paragraphFormat = this.paraFormat_;
        return paragraphFormat == null ? ParagraphFormat.getDefaultInstance() : paragraphFormat;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public ParagraphType getParaType() {
        ParagraphType forNumber = ParagraphType.forNumber(this.paraType_);
        return forNumber == null ? ParagraphType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public int getParaTypeValue() {
        return this.paraType_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public PicParagraph getPic() {
        if (this.contentCase_ == 4) {
            return (PicParagraph) this.content_;
        }
        return PicParagraph.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public TextParagraph getText() {
        if (this.contentCase_ == 3) {
            return (TextParagraph) this.content_;
        }
        return TextParagraph.getDefaultInstance();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public boolean hasCode() {
        return this.contentCase_ == 7;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public boolean hasLine() {
        return this.contentCase_ == 5;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public boolean hasLinkCard() {
        return this.contentCase_ == 6;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public boolean hasParaFormat() {
        return this.paraFormat_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public boolean hasPic() {
        return this.contentCase_ == 4;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.ub
    public boolean hasText() {
        return this.contentCase_ == 3;
    }

    public static C5893b newBuilder(Paragraph paragraph) {
        return DEFAULT_INSTANCE.createBuilder(paragraph);
    }

    public static Paragraph parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Paragraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Paragraph parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Paragraph parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Paragraph parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Paragraph parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Paragraph parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Paragraph parseFrom(InputStream inputStream) throws IOException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Paragraph parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Paragraph parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Paragraph parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Paragraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
