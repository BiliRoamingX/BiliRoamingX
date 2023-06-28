package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
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
/* loaded from: classes13.dex */
public final class GetArcsPlayerReq extends GeneratedMessageLite<GetArcsPlayerReq, GetArcsPlayerReq.Builder> implements MessageLiteOrBuilder {
    private static final GetArcsPlayerReq DEFAULT_INSTANCE;
    private static volatile Parser<GetArcsPlayerReq> PARSER = null;
    public static final int PLAYER_ARGS_FIELD_NUMBER = 2;
    public static final int PLAY_AVS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<PlayAv> playAvs_ = GeneratedMessageLite.emptyProtobufList();
    private PlayerArgs playerArgs_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.GetArcsPlayerReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16740xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16740xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16740xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16740xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16740xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16740xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16740xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16740xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GetArcsPlayerReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67691 c67691) {
            this();
        }

        public Builder addAllPlayAvs(Iterable<? extends PlayAv> iterable) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).addAllPlayAvs(iterable);
            return this;
        }

        public Builder addPlayAvs(PlayAv playAv) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).addPlayAvs(playAv);
            return this;
        }

        public Builder clearPlayAvs() {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).clearPlayAvs();
            return this;
        }

        public Builder clearPlayerArgs() {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).clearPlayerArgs();
            return this;
        }

        public PlayAv getPlayAvs(int i) {
            return ((GetArcsPlayerReq) this.instance).getPlayAvs(i);
        }

        public int getPlayAvsCount() {
            return ((GetArcsPlayerReq) this.instance).getPlayAvsCount();
        }

        public List<PlayAv> getPlayAvsList() {
            return Collections.unmodifiableList(((GetArcsPlayerReq) this.instance).getPlayAvsList());
        }

        public PlayerArgs getPlayerArgs() {
            return ((GetArcsPlayerReq) this.instance).getPlayerArgs();
        }

        public boolean hasPlayerArgs() {
            return ((GetArcsPlayerReq) this.instance).hasPlayerArgs();
        }

        public Builder mergePlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).mergePlayerArgs(playerArgs);
            return this;
        }

        public Builder removePlayAvs(int i) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).removePlayAvs(i);
            return this;
        }

        public Builder setPlayAvs(int i, PlayAv playAv) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).setPlayAvs(i, playAv);
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs playerArgs) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).setPlayerArgs(playerArgs);
            return this;
        }

        private Builder() {
            super(GetArcsPlayerReq.DEFAULT_INSTANCE);
        }

        public Builder addPlayAvs(int i, PlayAv playAv) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).addPlayAvs(i, playAv);
            return this;
        }

        public Builder setPlayAvs(int i, PlayAv.Builder builder) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).setPlayAvs(i, builder.build());
            return this;
        }

        public Builder setPlayerArgs(PlayerArgs.Builder builder) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).setPlayerArgs(builder.build());
            return this;
        }

        public Builder addPlayAvs(PlayAv.Builder builder) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).addPlayAvs(builder.build());
            return this;
        }

        public Builder addPlayAvs(int i, PlayAv.Builder builder) {
            copyOnWrite();
            ((GetArcsPlayerReq) this.instance).addPlayAvs(i, builder.build());
            return this;
        }
    }

    static {
        GetArcsPlayerReq getArcsPlayerReq = new GetArcsPlayerReq();
        DEFAULT_INSTANCE = getArcsPlayerReq;
        GeneratedMessageLite.registerDefaultInstance(GetArcsPlayerReq.class, getArcsPlayerReq);
    }

    private GetArcsPlayerReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPlayAvs(Iterable<? extends PlayAv> iterable) {
        ensurePlayAvsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.playAvs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayAvs(PlayAv playAv) {
        playAv.getClass();
        ensurePlayAvsIsMutable();
        this.playAvs_.add(playAv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayAvs() {
        this.playAvs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerArgs() {
        this.playerArgs_ = null;
    }

    private void ensurePlayAvsIsMutable() {
        Internal.ProtobufList<PlayAv> protobufList = this.playAvs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.playAvs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GetArcsPlayerReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerArgs(PlayerArgs playerArgs) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GetArcsPlayerReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetArcsPlayerReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GetArcsPlayerReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePlayAvs(int i) {
        ensurePlayAvsIsMutable();
        this.playAvs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayAvs(int i, PlayAv playAv) {
        playAv.getClass();
        ensurePlayAvsIsMutable();
        this.playAvs_.set(i, playAv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerArgs(PlayerArgs playerArgs) {
        playerArgs.getClass();
        this.playerArgs_ = playerArgs;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67691.f16740xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GetArcsPlayerReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"playAvs_", PlayAv.class, "playerArgs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GetArcsPlayerReq> parser = PARSER;
                if (parser == null) {
                    synchronized (GetArcsPlayerReq.class) {
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

    public PlayAv getPlayAvs(int i) {
        return this.playAvs_.get(i);
    }

    public int getPlayAvsCount() {
        return this.playAvs_.size();
    }

    public List<PlayAv> getPlayAvsList() {
        return this.playAvs_;
    }

    public PlayAvOrBuilder getPlayAvsOrBuilder(int i) {
        return this.playAvs_.get(i);
    }

    public List<? extends PlayAvOrBuilder> getPlayAvsOrBuilderList() {
        return this.playAvs_;
    }

    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = this.playerArgs_;
        return playerArgs == null ? PlayerArgs.getDefaultInstance() : playerArgs;
    }

    public boolean hasPlayerArgs() {
        return this.playerArgs_ != null;
    }

    public static Builder newBuilder(GetArcsPlayerReq getArcsPlayerReq) {
        return DEFAULT_INSTANCE.createBuilder(getArcsPlayerReq);
    }

    public static GetArcsPlayerReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetArcsPlayerReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetArcsPlayerReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayAvs(int i, PlayAv playAv) {
        playAv.getClass();
        ensurePlayAvsIsMutable();
        this.playAvs_.add(i, playAv);
    }

    public static GetArcsPlayerReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetArcsPlayerReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetArcsPlayerReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GetArcsPlayerReq parseFrom(InputStream inputStream) throws IOException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetArcsPlayerReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetArcsPlayerReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetArcsPlayerReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetArcsPlayerReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
