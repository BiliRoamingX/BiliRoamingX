package com.bapis.bilibili.playershared;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes18.dex */
public final class Node extends GeneratedMessageLite<Node, Node.Builder> implements MessageLiteOrBuilder {
    public static final int CID_FIELD_NUMBER = 3;
    private static final Node DEFAULT_INSTANCE;
    public static final int NODE_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Node> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private long cid_;
    private long nodeId_;
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.Node$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C82091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17939xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17939xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17939xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17939xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17939xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17939xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17939xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17939xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Node, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C82091 c82091) {
            this();
        }

        public Builder clearCid() {
            copyOnWrite();
            ((Node) this.instance).clearCid();
            return this;
        }

        public Builder clearNodeId() {
            copyOnWrite();
            ((Node) this.instance).clearNodeId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Node) this.instance).clearTitle();
            return this;
        }

        public long getCid() {
            return ((Node) this.instance).getCid();
        }

        public long getNodeId() {
            return ((Node) this.instance).getNodeId();
        }

        public String getTitle() {
            return ((Node) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Node) this.instance).getTitleBytes();
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((Node) this.instance).setCid(j);
            return this;
        }

        public Builder setNodeId(long j) {
            copyOnWrite();
            ((Node) this.instance).setNodeId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Node) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Node) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Node.DEFAULT_INSTANCE);
        }
    }

    static {
        Node node = new Node();
        DEFAULT_INSTANCE = node;
        GeneratedMessageLite.registerDefaultInstance(Node.class, node);
    }

    private Node() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeId() {
        this.nodeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Node getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Node parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Node) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Node parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Node> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeId(long j) {
        this.nodeId_ = j;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C82091.f17939xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Node();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002", new Object[]{"nodeId_", "title_", "cid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Node> parser = PARSER;
                if (parser == null) {
                    synchronized (Node.class) {
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

    public long getCid() {
        return this.cid_;
    }

    public long getNodeId() {
        return this.nodeId_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(Node node) {
        return DEFAULT_INSTANCE.createBuilder(node);
    }

    public static Node parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Node) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Node parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Node parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Node parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Node parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Node parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Node parseFrom(InputStream inputStream) throws IOException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Node parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Node parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Node parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Node) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
