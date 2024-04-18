package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.view.v1.Node;
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
/* loaded from: classes13.dex */
public final class Interaction extends GeneratedMessageLite<Interaction, Interaction.Builder> implements MessageLiteOrBuilder {
    private static final Interaction DEFAULT_INSTANCE;
    public static final int EVALUATION_FIELD_NUMBER = 4;
    public static final int GRAPH_VERSION_FIELD_NUMBER = 2;
    public static final int HISTORY_NODE_FIELD_NUMBER = 1;
    public static final int MARK_FIELD_NUMBER = 5;
    public static final int MSG_FIELD_NUMBER = 3;
    private static volatile Parser<Interaction> PARSER;
    private long graphVersion_;
    private Node historyNode_;
    private long mark_;
    private String msg_ = "";
    private String evaluation_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Interaction$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16749xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16749xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16749xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16749xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16749xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16749xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16749xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16749xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Interaction, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67781 c67781) {
            this();
        }

        public Builder clearEvaluation() {
            copyOnWrite();
            ((Interaction) this.instance).clearEvaluation();
            return this;
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

        public Builder clearMark() {
            copyOnWrite();
            ((Interaction) this.instance).clearMark();
            return this;
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((Interaction) this.instance).clearMsg();
            return this;
        }

        public String getEvaluation() {
            return ((Interaction) this.instance).getEvaluation();
        }

        public ByteString getEvaluationBytes() {
            return ((Interaction) this.instance).getEvaluationBytes();
        }

        public long getGraphVersion() {
            return ((Interaction) this.instance).getGraphVersion();
        }

        public Node getHistoryNode() {
            return ((Interaction) this.instance).getHistoryNode();
        }

        public long getMark() {
            return ((Interaction) this.instance).getMark();
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

        public Builder mergeHistoryNode(Node node) {
            copyOnWrite();
            ((Interaction) this.instance).mergeHistoryNode(node);
            return this;
        }

        public Builder setEvaluation(String str) {
            copyOnWrite();
            ((Interaction) this.instance).setEvaluation(str);
            return this;
        }

        public Builder setEvaluationBytes(ByteString byteString) {
            copyOnWrite();
            ((Interaction) this.instance).setEvaluationBytes(byteString);
            return this;
        }

        public Builder setGraphVersion(long j) {
            copyOnWrite();
            ((Interaction) this.instance).setGraphVersion(j);
            return this;
        }

        public Builder setHistoryNode(Node node) {
            copyOnWrite();
            ((Interaction) this.instance).setHistoryNode(node);
            return this;
        }

        public Builder setMark(long j) {
            copyOnWrite();
            ((Interaction) this.instance).setMark(j);
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

        public Builder setHistoryNode(Node.Builder builder) {
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

    public void clearEvaluation() {
        this.evaluation_ = getDefaultInstance().getEvaluation();
    }

    public void clearGraphVersion() {
        this.graphVersion_ = 0L;
    }

    public void clearHistoryNode() {
        this.historyNode_ = null;
    }

    public void clearMark() {
        this.mark_ = 0L;
    }

    public void clearMsg() {
        this.msg_ = getDefaultInstance().getMsg();
    }

    public static Interaction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeHistoryNode(Node node) {
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

    public void setEvaluation(String str) {
        str.getClass();
        this.evaluation_ = str;
    }

    public void setEvaluationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.evaluation_ = byteString.toStringUtf8();
    }

    public void setGraphVersion(long j) {
        this.graphVersion_ = j;
    }

    public void setHistoryNode(Node node) {
        node.getClass();
        this.historyNode_ = node;
    }

    public void setMark(long j) {
        this.mark_ = j;
    }

    public void setMsg(String str) {
        str.getClass();
        this.msg_ = str;
    }

    public void setMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.msg_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67781.f16749xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Interaction();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\u0002\u0003\u0208\u0004\u0208\u0005\u0002", new Object[]{"historyNode_", "graphVersion_", "msg_", "evaluation_", "mark_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Interaction> parser = PARSER;
                if (parser == null) {
                    synchronized (Interaction.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public String getEvaluation() {
        return this.evaluation_;
    }

    public ByteString getEvaluationBytes() {
        return ByteString.copyFromUtf8(this.evaluation_);
    }

    public long getGraphVersion() {
        return this.graphVersion_;
    }

    public Node getHistoryNode() {
        Node node = this.historyNode_;
        return node == null ? Node.getDefaultInstance() : node;
    }

    public long getMark() {
        return this.mark_;
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
