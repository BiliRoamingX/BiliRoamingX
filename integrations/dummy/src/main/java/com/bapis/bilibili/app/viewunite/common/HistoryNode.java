package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class HistoryNode extends GeneratedMessageLite<HistoryNode, HistoryNode.Builder> implements MessageLiteOrBuilder {
    public static final int CID_FIELD_NUMBER = 3;
    private static final HistoryNode DEFAULT_INSTANCE;
    public static final int NODE_ID_FIELD_NUMBER = 1;
    private static volatile Parser<HistoryNode> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private long cid_;
    private long nodeId_;
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.HistoryNode$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16985xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16985xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16985xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16985xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16985xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16985xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16985xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16985xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HistoryNode, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69991 c69991) {
            this();
        }

        public Builder clearCid() {
            copyOnWrite();
            ((HistoryNode) this.instance).clearCid();
            return this;
        }

        public Builder clearNodeId() {
            copyOnWrite();
            ((HistoryNode) this.instance).clearNodeId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((HistoryNode) this.instance).clearTitle();
            return this;
        }

        public long getCid() {
            return ((HistoryNode) this.instance).getCid();
        }

        public long getNodeId() {
            return ((HistoryNode) this.instance).getNodeId();
        }

        public String getTitle() {
            return ((HistoryNode) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((HistoryNode) this.instance).getTitleBytes();
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((HistoryNode) this.instance).setCid(j);
            return this;
        }

        public Builder setNodeId(long j) {
            copyOnWrite();
            ((HistoryNode) this.instance).setNodeId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((HistoryNode) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((HistoryNode) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(HistoryNode.DEFAULT_INSTANCE);
        }
    }

    static {
        HistoryNode historyNode = new HistoryNode();
        DEFAULT_INSTANCE = historyNode;
        GeneratedMessageLite.registerDefaultInstance(HistoryNode.class, historyNode);
    }

    private HistoryNode() {
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

    public static HistoryNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HistoryNode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HistoryNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HistoryNode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HistoryNode> parser() {
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
        switch (C69991.f16985xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HistoryNode();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002", new Object[]{"nodeId_", "title_", "cid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HistoryNode> parser = PARSER;
                if (parser == null) {
                    synchronized (HistoryNode.class) {
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

    public static Builder newBuilder(HistoryNode historyNode) {
        return DEFAULT_INSTANCE.createBuilder(historyNode);
    }

    public static HistoryNode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistoryNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HistoryNode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HistoryNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HistoryNode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HistoryNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HistoryNode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HistoryNode parseFrom(InputStream inputStream) throws IOException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HistoryNode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HistoryNode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HistoryNode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HistoryNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
