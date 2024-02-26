package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class MdlDynDrawTag extends GeneratedMessageLite<MdlDynDrawTag, MdlDynDrawTag.C5686b> implements h9 {
    private static final MdlDynDrawTag DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile Parser<MdlDynDrawTag> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private MdlDynDrawTagItem item_;
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawTag$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5685a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17352xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17352xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17352xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17352xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17352xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17352xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17352xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17352xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawTag$b */
    /* loaded from: classes19.dex */
    public static final class C5686b extends GeneratedMessageLite.Builder<MdlDynDrawTag, C5686b> implements h9 {
        /* synthetic */ C5686b(C5685a c5685a) {
            this();
        }

        public C5686b clearItem() {
            copyOnWrite();
            ((MdlDynDrawTag) this.instance).clearItem();
            return this;
        }

        public C5686b clearType() {
            copyOnWrite();
            ((MdlDynDrawTag) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.h9
        public MdlDynDrawTagItem getItem() {
            return ((MdlDynDrawTag) this.instance).getItem();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.h9
        public MdlDynDrawTagType getType() {
            return ((MdlDynDrawTag) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.h9
        public int getTypeValue() {
            return ((MdlDynDrawTag) this.instance).getTypeValue();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.h9
        public boolean hasItem() {
            return ((MdlDynDrawTag) this.instance).hasItem();
        }

        public C5686b mergeItem(MdlDynDrawTagItem mdlDynDrawTagItem) {
            copyOnWrite();
            ((MdlDynDrawTag) this.instance).mergeItem(mdlDynDrawTagItem);
            return this;
        }

        public C5686b setItem(MdlDynDrawTagItem mdlDynDrawTagItem) {
            copyOnWrite();
            ((MdlDynDrawTag) this.instance).setItem(mdlDynDrawTagItem);
            return this;
        }

        public C5686b setType(MdlDynDrawTagType mdlDynDrawTagType) {
            copyOnWrite();
            ((MdlDynDrawTag) this.instance).setType(mdlDynDrawTagType);
            return this;
        }

        public C5686b setTypeValue(int i2) {
            copyOnWrite();
            ((MdlDynDrawTag) this.instance).setTypeValue(i2);
            return this;
        }

        private C5686b() {
            super(MdlDynDrawTag.DEFAULT_INSTANCE);
        }

        public C5686b setItem(MdlDynDrawTagItem.C5688b c5688b) {
            copyOnWrite();
            ((MdlDynDrawTag) this.instance).setItem(c5688b.build());
            return this;
        }
    }

    static {
        MdlDynDrawTag mdlDynDrawTag = new MdlDynDrawTag();
        DEFAULT_INSTANCE = mdlDynDrawTag;
        GeneratedMessageLite.registerDefaultInstance(MdlDynDrawTag.class, mdlDynDrawTag);
    }

    private MdlDynDrawTag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.item_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static MdlDynDrawTag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeItem(MdlDynDrawTagItem mdlDynDrawTagItem) {
        mdlDynDrawTagItem.getClass();
        MdlDynDrawTagItem mdlDynDrawTagItem2 = this.item_;
        if (mdlDynDrawTagItem2 != null && mdlDynDrawTagItem2 != MdlDynDrawTagItem.getDefaultInstance()) {
            this.item_ = MdlDynDrawTagItem.newBuilder(this.item_).mergeFrom((MdlDynDrawTagItem) mdlDynDrawTagItem).buildPartial();
        } else {
            this.item_ = mdlDynDrawTagItem;
        }
    }

    public static C5686b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MdlDynDrawTag parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDrawTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MdlDynDrawTag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItem(MdlDynDrawTagItem mdlDynDrawTagItem) {
        mdlDynDrawTagItem.getClass();
        this.item_ = mdlDynDrawTagItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(MdlDynDrawTagType mdlDynDrawTagType) {
        this.type_ = mdlDynDrawTagType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5685a c5685a = null;
        switch (C5685a.f17352xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MdlDynDrawTag();
            case 2:
                return new C5686b(c5685a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"type_", "item_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MdlDynDrawTag> parser = PARSER;
                if (parser == null) {
                    synchronized (MdlDynDrawTag.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.h9
    public MdlDynDrawTagItem getItem() {
        MdlDynDrawTagItem mdlDynDrawTagItem = this.item_;
        return mdlDynDrawTagItem == null ? MdlDynDrawTagItem.getDefaultInstance() : mdlDynDrawTagItem;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.h9
    public MdlDynDrawTagType getType() {
        MdlDynDrawTagType forNumber = MdlDynDrawTagType.forNumber(this.type_);
        return forNumber == null ? MdlDynDrawTagType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.h9
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.h9
    public boolean hasItem() {
        return this.item_ != null;
    }

    public static C5686b newBuilder(MdlDynDrawTag mdlDynDrawTag) {
        return DEFAULT_INSTANCE.createBuilder(mdlDynDrawTag);
    }

    public static MdlDynDrawTag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDrawTag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MdlDynDrawTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MdlDynDrawTag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MdlDynDrawTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MdlDynDrawTag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MdlDynDrawTag parseFrom(InputStream inputStream) throws IOException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDrawTag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDrawTag parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MdlDynDrawTag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
