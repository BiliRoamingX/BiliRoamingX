package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class Interaction extends GeneratedMessageLite<Interaction, Interaction.Builder> implements MessageLiteOrBuilder {
    private static final Interaction DEFAULT_INSTANCE;
    public static final int GRAPH_VERSION_FIELD_NUMBER = 2;
    public static final int HISTORY_NODE_FIELD_NUMBER = 1;
    public static final int IS_INTERACTION_FIELD_NUMBER = 4;
    public static final int MSG_FIELD_NUMBER = 3;
    private static volatile Parser<Interaction> PARSER;
    private long graphVersion_;
    private HistoryNode historyNode_;
    private boolean isInteraction_;
    private String msg_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.Interaction$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78551 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17575xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17575xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17575xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17575xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17575xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17575xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17575xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17575xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Interaction, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78551 c78551) {
            this();
        }

        public Builder clearGraphVersion() {
            copyOnWrite();
            ((Interaction) this.instance).clearGraphVersion();
            return this;
        }

        public Builder clearHistoryNode() {
            copyOnWrite();
            ((Interaction) this.instance).clearHistoryNode();
            return this;
        }

        public Builder clearIsInteraction() {
            copyOnWrite();
            ((Interaction) this.instance).clearIsInteraction();
            return this;
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((Interaction) this.instance).clearMsg();
            return this;
        }

        public long getGraphVersion() {
            return ((Interaction) this.instance).getGraphVersion();
        }

        public HistoryNode getHistoryNode() {
            return ((Interaction) this.instance).getHistoryNode();
        }

        public boolean getIsInteraction() {
            return ((Interaction) this.instance).getIsInteraction();
        }

        public String getMsg() {
            return ((Interaction) this.instance).getMsg();
        }

        public ByteString getMsgBytes() {
            return ((Interaction) this.instance).getMsgBytes();
        }

        public boolean hasHistoryNode() {
            return ((Interaction) this.instance).hasHistoryNode();
        }

        public Builder mergeHistoryNode(HistoryNode historyNode) {
            copyOnWrite();
            ((Interaction) this.instance).mergeHistoryNode(historyNode);
            return this;
        }

        public Builder setGraphVersion(long j) {
            copyOnWrite();
            ((Interaction) this.instance).setGraphVersion(j);
            return this;
        }

        public Builder setHistoryNode(HistoryNode historyNode) {
            copyOnWrite();
            ((Interaction) this.instance).setHistoryNode(historyNode);
            return this;
        }

        public Builder setIsInteraction(boolean z) {
            copyOnWrite();
            ((Interaction) this.instance).setIsInteraction(z);
            return this;
        }

        public Builder setMsg(String str) {
            copyOnWrite();
            ((Interaction) this.instance).setMsg(str);
            return this;
        }

        public Builder setMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((Interaction) this.instance).setMsgBytes(byteString);
            return this;
        }

        private Builder() {
            super(Interaction.DEFAULT_INSTANCE);
        }

        public Builder setHistoryNode(HistoryNode.Builder builder) {
            copyOnWrite();
            ((Interaction) this.instance).setHistoryNode(builder.build());
            return this;
        }
    }

    static {
        Interaction interaction = new Interaction();
        DEFAULT_INSTANCE = interaction;
        GeneratedMessageLite.registerDefaultInstance(Interaction.class, interaction);
    }

    private Interaction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGraphVersion() {
        this.graphVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistoryNode() {
        this.historyNode_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInteraction() {
        this.isInteraction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    public static Interaction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHistoryNode(HistoryNode historyNode) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Interaction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Interaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Interaction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Interaction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGraphVersion(long j) {
        this.graphVersion_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoryNode(HistoryNode historyNode) {
        historyNode.getClass();
        this.historyNode_ = historyNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInteraction(boolean z) {
        this.isInteraction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78551.f17575xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Interaction();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u0002\u0003\u0208\u0004\u0007", new Object[]{"historyNode_", "graphVersion_", "msg_", "isInteraction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Interaction> parser = PARSER;
                if (parser == null) {
                    synchronized (Interaction.class) {
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

    public long getGraphVersion() {
        return this.graphVersion_;
    }

    public HistoryNode getHistoryNode() {
        HistoryNode historyNode = this.historyNode_;
        return historyNode == null ? HistoryNode.getDefaultInstance() : historyNode;
    }

    public boolean getIsInteraction() {
        return this.isInteraction_;
    }

    public String getMsg() {
        return this.msg_;
    }

    public ByteString getMsgBytes() {
        return ByteString.copyFromUtf8(this.msg_);
    }

    public boolean hasHistoryNode() {
        return this.historyNode_ != null;
    }

    public static Builder newBuilder(Interaction interaction) {
        return DEFAULT_INSTANCE.createBuilder(interaction);
    }

    public static Interaction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Interaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Interaction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Interaction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Interaction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Interaction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Interaction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Interaction parseFrom(InputStream inputStream) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Interaction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Interaction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Interaction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
