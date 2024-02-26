package com.bapis.bilibili.app.dynamic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class LineParagraph extends GeneratedMessageLite<LineParagraph, LineParagraph.C5640b> implements MessageLiteOrBuilder {
    private static final LineParagraph DEFAULT_INSTANCE;
    private static volatile Parser<LineParagraph> PARSER = null;
    public static final int PIC_FIELD_NUMBER = 1;
    private MdlDynDrawItem pic_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.LineParagraph$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5639a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17334xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17334xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17334xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17334xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17334xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17334xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17334xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17334xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.LineParagraph$b */
    /* loaded from: classes19.dex */
    public static final class C5640b extends GeneratedMessageLite.Builder<LineParagraph, C5640b> implements MessageLiteOrBuilder {
        /* synthetic */ C5640b(C5639a c5639a) {
            this();
        }

        public C5640b clearPic() {
            copyOnWrite();
            ((LineParagraph) this.instance).clearPic();
            return this;
        }

        public MdlDynDrawItem getPic() {
            return ((LineParagraph) this.instance).getPic();
        }

        public boolean hasPic() {
            return ((LineParagraph) this.instance).hasPic();
        }

        public C5640b mergePic(MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((LineParagraph) this.instance).mergePic(mdlDynDrawItem);
            return this;
        }

        public C5640b setPic(MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((LineParagraph) this.instance).setPic(mdlDynDrawItem);
            return this;
        }

        private C5640b() {
            super(LineParagraph.DEFAULT_INSTANCE);
        }

        public C5640b setPic(MdlDynDrawItem.C5684b c5684b) {
            copyOnWrite();
            ((LineParagraph) this.instance).setPic(c5684b.build());
            return this;
        }
    }

    static {
        LineParagraph lineParagraph = new LineParagraph();
        DEFAULT_INSTANCE = lineParagraph;
        GeneratedMessageLite.registerDefaultInstance(LineParagraph.class, lineParagraph);
    }

    private LineParagraph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPic() {
        this.pic_ = null;
    }

    public static LineParagraph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePic(MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        MdlDynDrawItem mdlDynDrawItem2 = this.pic_;
        if (mdlDynDrawItem2 != null && mdlDynDrawItem2 != MdlDynDrawItem.getDefaultInstance()) {
            this.pic_ = MdlDynDrawItem.newBuilder(this.pic_).mergeFrom((MdlDynDrawItem) mdlDynDrawItem).buildPartial();
        } else {
            this.pic_ = mdlDynDrawItem;
        }
    }

    public static C5640b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LineParagraph parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LineParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LineParagraph parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LineParagraph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPic(MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        this.pic_ = mdlDynDrawItem;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5639a c5639a = null;
        switch (C5639a.f17334xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LineParagraph();
            case 2:
                return new C5640b(c5639a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"pic_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LineParagraph> parser = PARSER;
                if (parser == null) {
                    synchronized (LineParagraph.class) {
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

    public MdlDynDrawItem getPic() {
        MdlDynDrawItem mdlDynDrawItem = this.pic_;
        return mdlDynDrawItem == null ? MdlDynDrawItem.getDefaultInstance() : mdlDynDrawItem;
    }

    public boolean hasPic() {
        return this.pic_ != null;
    }

    public static C5640b newBuilder(LineParagraph lineParagraph) {
        return DEFAULT_INSTANCE.createBuilder(lineParagraph);
    }

    public static LineParagraph parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LineParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LineParagraph parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LineParagraph parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LineParagraph parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LineParagraph parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LineParagraph parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LineParagraph parseFrom(InputStream inputStream) throws IOException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LineParagraph parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LineParagraph parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LineParagraph parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LineParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
