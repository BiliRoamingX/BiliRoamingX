package com.bapis.bilibili.app.dynamic.v2;

import com.bapis.bilibili.app.dynamic.v2.TextNode;
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
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes19.dex */
public final class TextParagraph extends GeneratedMessageLite<TextParagraph, TextParagraph.C6003b> implements MessageLiteOrBuilder {
    private static final TextParagraph DEFAULT_INSTANCE;
    public static final int NODES_FIELD_NUMBER = 1;
    private static volatile Parser<TextParagraph> PARSER;
    private Internal.ProtobufList<TextNode> nodes_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.TextParagraph$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C6002a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17482xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17482xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17482xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17482xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17482xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17482xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17482xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17482xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.TextParagraph$b */
    /* loaded from: classes19.dex */
    public static final class C6003b extends GeneratedMessageLite.Builder<TextParagraph, C6003b> implements MessageLiteOrBuilder {
        /* synthetic */ C6003b(C6002a c6002a) {
            this();
        }

        public C6003b addAllNodes(Iterable<? extends TextNode> iterable) {
            copyOnWrite();
            ((TextParagraph) this.instance).addAllNodes(iterable);
            return this;
        }

        public C6003b addNodes(TextNode textNode) {
            copyOnWrite();
            ((TextParagraph) this.instance).addNodes(textNode);
            return this;
        }

        public C6003b clearNodes() {
            copyOnWrite();
            ((TextParagraph) this.instance).clearNodes();
            return this;
        }

        public TextNode getNodes(int i2) {
            return ((TextParagraph) this.instance).getNodes(i2);
        }

        public int getNodesCount() {
            return ((TextParagraph) this.instance).getNodesCount();
        }

        public List<TextNode> getNodesList() {
            return Collections.unmodifiableList(((TextParagraph) this.instance).getNodesList());
        }

        public C6003b removeNodes(int i2) {
            copyOnWrite();
            ((TextParagraph) this.instance).removeNodes(i2);
            return this;
        }

        public C6003b setNodes(int i2, TextNode textNode) {
            copyOnWrite();
            ((TextParagraph) this.instance).setNodes(i2, textNode);
            return this;
        }

        private C6003b() {
            super(TextParagraph.DEFAULT_INSTANCE);
        }

        public C6003b addNodes(int i2, TextNode textNode) {
            copyOnWrite();
            ((TextParagraph) this.instance).addNodes(i2, textNode);
            return this;
        }

        public C6003b setNodes(int i2, TextNode.C6001b c6001b) {
            copyOnWrite();
            ((TextParagraph) this.instance).setNodes(i2, c6001b.build());
            return this;
        }

        public C6003b addNodes(TextNode.C6001b c6001b) {
            copyOnWrite();
            ((TextParagraph) this.instance).addNodes(c6001b.build());
            return this;
        }

        public C6003b addNodes(int i2, TextNode.C6001b c6001b) {
            copyOnWrite();
            ((TextParagraph) this.instance).addNodes(i2, c6001b.build());
            return this;
        }
    }

    static {
        TextParagraph textParagraph = new TextParagraph();
        DEFAULT_INSTANCE = textParagraph;
        GeneratedMessageLite.registerDefaultInstance(TextParagraph.class, textParagraph);
    }

    private TextParagraph() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNodes(Iterable<? extends TextNode> iterable) {
        ensureNodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.nodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodes(TextNode textNode) {
        textNode.getClass();
        ensureNodesIsMutable();
        this.nodes_.add(textNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodes() {
        this.nodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureNodesIsMutable() {
        Internal.ProtobufList<TextNode> protobufList = this.nodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.nodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TextParagraph getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6003b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TextParagraph parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TextParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextParagraph parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TextParagraph> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNodes(int i2) {
        ensureNodesIsMutable();
        this.nodes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodes(int i2, TextNode textNode) {
        textNode.getClass();
        ensureNodesIsMutable();
        this.nodes_.set(i2, textNode);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6002a c6002a = null;
        switch (C6002a.f17482xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TextParagraph();
            case 2:
                return new C6003b(c6002a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"nodes_", TextNode.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TextParagraph> parser = PARSER;
                if (parser == null) {
                    synchronized (TextParagraph.class) {
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

    public TextNode getNodes(int i2) {
        return this.nodes_.get(i2);
    }

    public int getNodesCount() {
        return this.nodes_.size();
    }

    public List<TextNode> getNodesList() {
        return this.nodes_;
    }

    public ic getNodesOrBuilder(int i2) {
        return this.nodes_.get(i2);
    }

    public List<? extends ic> getNodesOrBuilderList() {
        return this.nodes_;
    }

    public static C6003b newBuilder(TextParagraph textParagraph) {
        return DEFAULT_INSTANCE.createBuilder(textParagraph);
    }

    public static TextParagraph parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextParagraph) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextParagraph parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TextParagraph parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNodes(int i2, TextNode textNode) {
        textNode.getClass();
        ensureNodesIsMutable();
        this.nodes_.add(i2, textNode);
    }

    public static TextParagraph parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TextParagraph parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TextParagraph parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TextParagraph parseFrom(InputStream inputStream) throws IOException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TextParagraph parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TextParagraph parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TextParagraph parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TextParagraph) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
