package com.bapis.bilibili.app.view.v1;

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
public final class GetArcsPlayerReply extends GeneratedMessageLite<GetArcsPlayerReply, GetArcsPlayerReply.Builder> implements MessageLiteOrBuilder {
    public static final int ARCS_PLAYER_FIELD_NUMBER = 1;
    private static final GetArcsPlayerReply DEFAULT_INSTANCE;
    private static volatile Parser<GetArcsPlayerReply> PARSER;
    private Internal.ProtobufList<ArcsPlayer> arcsPlayer_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.GetArcsPlayerReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16739xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16739xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16739xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16739xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16739xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16739xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16739xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16739xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GetArcsPlayerReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67681 c67681) {
            this();
        }

        public Builder addAllArcsPlayer(Iterable<? extends ArcsPlayer> iterable) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).addAllArcsPlayer(iterable);
            return this;
        }

        public Builder addArcsPlayer(ArcsPlayer arcsPlayer) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).addArcsPlayer(arcsPlayer);
            return this;
        }

        public Builder clearArcsPlayer() {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).clearArcsPlayer();
            return this;
        }

        public ArcsPlayer getArcsPlayer(int i) {
            return ((GetArcsPlayerReply) this.instance).getArcsPlayer(i);
        }

        public int getArcsPlayerCount() {
            return ((GetArcsPlayerReply) this.instance).getArcsPlayerCount();
        }

        public List<ArcsPlayer> getArcsPlayerList() {
            return Collections.unmodifiableList(((GetArcsPlayerReply) this.instance).getArcsPlayerList());
        }

        public Builder removeArcsPlayer(int i) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).removeArcsPlayer(i);
            return this;
        }

        public Builder setArcsPlayer(int i, ArcsPlayer arcsPlayer) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).setArcsPlayer(i, arcsPlayer);
            return this;
        }

        private Builder() {
            super(GetArcsPlayerReply.DEFAULT_INSTANCE);
        }

        public Builder addArcsPlayer(int i, ArcsPlayer arcsPlayer) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).addArcsPlayer(i, arcsPlayer);
            return this;
        }

        public Builder setArcsPlayer(int i, ArcsPlayer.Builder builder) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).setArcsPlayer(i, builder.build());
            return this;
        }

        public Builder addArcsPlayer(ArcsPlayer.Builder builder) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).addArcsPlayer(builder.build());
            return this;
        }

        public Builder addArcsPlayer(int i, ArcsPlayer.Builder builder) {
            copyOnWrite();
            ((GetArcsPlayerReply) this.instance).addArcsPlayer(i, builder.build());
            return this;
        }
    }

    static {
        GetArcsPlayerReply getArcsPlayerReply = new GetArcsPlayerReply();
        DEFAULT_INSTANCE = getArcsPlayerReply;
        GeneratedMessageLite.registerDefaultInstance(GetArcsPlayerReply.class, getArcsPlayerReply);
    }

    private GetArcsPlayerReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllArcsPlayer(Iterable<? extends ArcsPlayer> iterable) {
        ensureArcsPlayerIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.arcsPlayer_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArcsPlayer(ArcsPlayer arcsPlayer) {
        arcsPlayer.getClass();
        ensureArcsPlayerIsMutable();
        this.arcsPlayer_.add(arcsPlayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcsPlayer() {
        this.arcsPlayer_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureArcsPlayerIsMutable() {
        Internal.ProtobufList<ArcsPlayer> protobufList = this.arcsPlayer_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.arcsPlayer_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GetArcsPlayerReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GetArcsPlayerReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetArcsPlayerReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GetArcsPlayerReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeArcsPlayer(int i) {
        ensureArcsPlayerIsMutable();
        this.arcsPlayer_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcsPlayer(int i, ArcsPlayer arcsPlayer) {
        arcsPlayer.getClass();
        ensureArcsPlayerIsMutable();
        this.arcsPlayer_.set(i, arcsPlayer);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67681.f16739xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GetArcsPlayerReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"arcsPlayer_", ArcsPlayer.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GetArcsPlayerReply> parser = PARSER;
                if (parser == null) {
                    synchronized (GetArcsPlayerReply.class) {
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

    public ArcsPlayer getArcsPlayer(int i) {
        return this.arcsPlayer_.get(i);
    }

    public int getArcsPlayerCount() {
        return this.arcsPlayer_.size();
    }

    public List<ArcsPlayer> getArcsPlayerList() {
        return this.arcsPlayer_;
    }

    public ArcsPlayerOrBuilder getArcsPlayerOrBuilder(int i) {
        return this.arcsPlayer_.get(i);
    }

    public List<? extends ArcsPlayerOrBuilder> getArcsPlayerOrBuilderList() {
        return this.arcsPlayer_;
    }

    public static Builder newBuilder(GetArcsPlayerReply getArcsPlayerReply) {
        return DEFAULT_INSTANCE.createBuilder(getArcsPlayerReply);
    }

    public static GetArcsPlayerReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetArcsPlayerReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetArcsPlayerReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArcsPlayer(int i, ArcsPlayer arcsPlayer) {
        arcsPlayer.getClass();
        ensureArcsPlayerIsMutable();
        this.arcsPlayer_.add(i, arcsPlayer);
    }

    public static GetArcsPlayerReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetArcsPlayerReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetArcsPlayerReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GetArcsPlayerReply parseFrom(InputStream inputStream) throws IOException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetArcsPlayerReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetArcsPlayerReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetArcsPlayerReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetArcsPlayerReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
