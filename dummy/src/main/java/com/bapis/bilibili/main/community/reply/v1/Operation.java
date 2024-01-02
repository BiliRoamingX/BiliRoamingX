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
public final class Operation extends GeneratedMessageLite<Operation, Operation.C14777b> implements MessageLiteOrBuilder {
    private static final Operation DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile Parser<Operation> PARSER = null;
    public static final int REPORT_EXTRA_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private long id_;
    private OperationTitle subtitle_;
    private OperationTitle title_;
    private int type_;
    private String link_ = "";
    private String reportExtra_ = "";
    private String icon_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public enum Type implements Internal.EnumLite {
        UNKNOWN(0),
        NOTE(1),
        TOPIC(2),
        NOTICE(3),
        UNRECOGNIZED(-1);
        
        public static final int NOTE_VALUE = 1;
        @Deprecated
        public static final int NOTICE_VALUE = 3;
        public static final int TOPIC_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new C14774a();
        private final int value;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.Operation$Type$a */
        /* loaded from: classes21.dex */
        static class C14774a implements Internal.EnumLiteMap<Type> {
            C14774a() {
            }

            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.Operation$Type$b */
        /* loaded from: classes21.dex */
        private static final class C14775b implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new C14775b();

            private C14775b() {
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
                        if (i != 3) {
                            return null;
                        }
                        return NOTICE;
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
            return C14775b.INSTANCE;
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
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Operation$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14776a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22007xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22007xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22007xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22007xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22007xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22007xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Operation$b */
    /* loaded from: classes21.dex */
    public static final class C14777b extends GeneratedMessageLite.Builder<Operation, C14777b> implements MessageLiteOrBuilder {
        /* synthetic */ C14777b(C14776a c14776a) {
            this();
        }

        public C14777b clearIcon() {
            copyOnWrite();
            ((Operation) this.instance).clearIcon();
            return this;
        }

        @Deprecated
        public C14777b clearId() {
            copyOnWrite();
            ((Operation) this.instance).clearId();
            return this;
        }

        public C14777b clearLink() {
            copyOnWrite();
            ((Operation) this.instance).clearLink();
            return this;
        }

        public C14777b clearReportExtra() {
            copyOnWrite();
            ((Operation) this.instance).clearReportExtra();
            return this;
        }

        public C14777b clearSubtitle() {
            copyOnWrite();
            ((Operation) this.instance).clearSubtitle();
            return this;
        }

        public C14777b clearTitle() {
            copyOnWrite();
            ((Operation) this.instance).clearTitle();
            return this;
        }

        public C14777b clearType() {
            copyOnWrite();
            ((Operation) this.instance).clearType();
            return this;
        }

        public String getIcon() {
            return ((Operation) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((Operation) this.instance).getIconBytes();
        }

        @Deprecated
        public long getId() {
            return ((Operation) this.instance).getId();
        }

        public String getLink() {
            return ((Operation) this.instance).getLink();
        }

        public ByteString getLinkBytes() {
            return ((Operation) this.instance).getLinkBytes();
        }

        public String getReportExtra() {
            return ((Operation) this.instance).getReportExtra();
        }

        public ByteString getReportExtraBytes() {
            return ((Operation) this.instance).getReportExtraBytes();
        }

        public OperationTitle getSubtitle() {
            return ((Operation) this.instance).getSubtitle();
        }

        public OperationTitle getTitle() {
            return ((Operation) this.instance).getTitle();
        }

        public Type getType() {
            return ((Operation) this.instance).getType();
        }

        public int getTypeValue() {
            return ((Operation) this.instance).getTypeValue();
        }

        public boolean hasSubtitle() {
            return ((Operation) this.instance).hasSubtitle();
        }

        public boolean hasTitle() {
            return ((Operation) this.instance).hasTitle();
        }

        public C14777b mergeSubtitle(OperationTitle operationTitle) {
            copyOnWrite();
            ((Operation) this.instance).mergeSubtitle(operationTitle);
            return this;
        }

        public C14777b mergeTitle(OperationTitle operationTitle) {
            copyOnWrite();
            ((Operation) this.instance).mergeTitle(operationTitle);
            return this;
        }

        public C14777b setIcon(String str) {
            copyOnWrite();
            ((Operation) this.instance).setIcon(str);
            return this;
        }

        public C14777b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Operation) this.instance).setIconBytes(byteString);
            return this;
        }

        @Deprecated
        public C14777b setId(long j) {
            copyOnWrite();
            ((Operation) this.instance).setId(j);
            return this;
        }

        public C14777b setLink(String str) {
            copyOnWrite();
            ((Operation) this.instance).setLink(str);
            return this;
        }

        public C14777b setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Operation) this.instance).setLinkBytes(byteString);
            return this;
        }

        public C14777b setReportExtra(String str) {
            copyOnWrite();
            ((Operation) this.instance).setReportExtra(str);
            return this;
        }

        public C14777b setReportExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((Operation) this.instance).setReportExtraBytes(byteString);
            return this;
        }

        public C14777b setSubtitle(OperationTitle operationTitle) {
            copyOnWrite();
            ((Operation) this.instance).setSubtitle(operationTitle);
            return this;
        }

        public C14777b setTitle(OperationTitle operationTitle) {
            copyOnWrite();
            ((Operation) this.instance).setTitle(operationTitle);
            return this;
        }

        public C14777b setType(Type type) {
            copyOnWrite();
            ((Operation) this.instance).setType(type);
            return this;
        }

        public C14777b setTypeValue(int i) {
            copyOnWrite();
            ((Operation) this.instance).setTypeValue(i);
            return this;
        }

        private C14777b() {
            super(Operation.DEFAULT_INSTANCE);
        }

        public C14777b setSubtitle(OperationTitle.C14779b c14779b) {
            copyOnWrite();
            ((Operation) this.instance).setSubtitle(c14779b.build());
            return this;
        }

        public C14777b setTitle(OperationTitle.C14779b c14779b) {
            copyOnWrite();
            ((Operation) this.instance).setTitle(c14779b.build());
            return this;
        }
    }

    static {
        Operation operation = new Operation();
        DEFAULT_INSTANCE = operation;
        GeneratedMessageLite.registerDefaultInstance(Operation.class, operation);
    }

    private Operation() {
    }

    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    public void clearId() {
        this.id_ = 0L;
    }

    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    public void clearReportExtra() {
        this.reportExtra_ = getDefaultInstance().getReportExtra();
    }

    public void clearSubtitle() {
        this.subtitle_ = null;
    }

    public void clearTitle() {
        this.title_ = null;
    }

    public void clearType() {
        this.type_ = 0;
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeSubtitle(OperationTitle operationTitle) {
        operationTitle.getClass();
        OperationTitle operationTitle2 = this.subtitle_;
        if (operationTitle2 != null && operationTitle2 != OperationTitle.getDefaultInstance()) {
            this.subtitle_ = OperationTitle.newBuilder(this.subtitle_).mergeFrom((OperationTitle) operationTitle).buildPartial();
        } else {
            this.subtitle_ = operationTitle;
        }
    }

    public void mergeTitle(OperationTitle operationTitle) {
        operationTitle.getClass();
        OperationTitle operationTitle2 = this.title_;
        if (operationTitle2 != null && operationTitle2 != OperationTitle.getDefaultInstance()) {
            this.title_ = OperationTitle.newBuilder(this.title_).mergeFrom((OperationTitle) operationTitle).buildPartial();
        } else {
            this.title_ = operationTitle;
        }
    }

    public static C14777b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Operation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    public void setId(long j) {
        this.id_ = j;
    }

    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    public void setReportExtra(String str) {
        str.getClass();
        this.reportExtra_ = str;
    }

    public void setReportExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reportExtra_ = byteString.toStringUtf8();
    }

    public void setSubtitle(OperationTitle operationTitle) {
        operationTitle.getClass();
        this.subtitle_ = operationTitle;
    }

    public void setTitle(OperationTitle operationTitle) {
        operationTitle.getClass();
        this.title_ = operationTitle;
    }

    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14776a.f22007xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Operation();
            case 2:
                return new C14777b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\t\u0004\t\u0005\u0208\u0006\u0208\u0007\u0208", new Object[]{"type_", "id_", "title_", "subtitle_", "link_", "reportExtra_", "icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Operation> parser = PARSER;
                if (parser == null) {
                    synchronized (Operation.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    @Deprecated
    public long getId() {
        return this.id_;
    }

    public String getLink() {
        return this.link_;
    }

    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    public String getReportExtra() {
        return this.reportExtra_;
    }

    public ByteString getReportExtraBytes() {
        return ByteString.copyFromUtf8(this.reportExtra_);
    }

    public OperationTitle getSubtitle() {
        OperationTitle operationTitle = this.subtitle_;
        return operationTitle == null ? OperationTitle.getDefaultInstance() : operationTitle;
    }

    public OperationTitle getTitle() {
        OperationTitle operationTitle = this.title_;
        return operationTitle == null ? OperationTitle.getDefaultInstance() : operationTitle;
    }

    public Type getType() {
        Type forNumber = Type.forNumber(this.type_);
        return forNumber == null ? Type.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasSubtitle() {
        return this.subtitle_ != null;
    }

    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static C14777b newBuilder(Operation operation) {
        return DEFAULT_INSTANCE.createBuilder(operation);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Operation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Operation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Operation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Operation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
