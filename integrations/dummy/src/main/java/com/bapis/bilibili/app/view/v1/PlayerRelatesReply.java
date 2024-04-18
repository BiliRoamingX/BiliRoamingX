package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.view.v1.Relate;
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
public final class PlayerRelatesReply extends GeneratedMessageLite<PlayerRelatesReply, PlayerRelatesReply.Builder> implements MessageLiteOrBuilder {
    private static final PlayerRelatesReply DEFAULT_INSTANCE;
    public static final int LIST_FIELD_NUMBER = 1;
    private static volatile Parser<PlayerRelatesReply> PARSER;
    private Internal.ProtobufList<Relate> list_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PlayerRelatesReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68191 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16781xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16781xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16781xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16781xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16781xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16781xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16781xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16781xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayerRelatesReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68191 c68191) {
            this();
        }

        public Builder addAllList(Iterable<? extends Relate> iterable) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).addAllList(iterable);
            return this;
        }

        public Builder addList(Relate relate) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).addList(relate);
            return this;
        }

        public Builder clearList() {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).clearList();
            return this;
        }

        public Relate getList(int i) {
            return ((PlayerRelatesReply) this.instance).getList(i);
        }

        public int getListCount() {
            return ((PlayerRelatesReply) this.instance).getListCount();
        }

        public List<Relate> getListList() {
            return Collections.unmodifiableList(((PlayerRelatesReply) this.instance).getListList());
        }

        public Builder removeList(int i) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).removeList(i);
            return this;
        }

        public Builder setList(int i, Relate relate) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).setList(i, relate);
            return this;
        }

        private Builder() {
            super(PlayerRelatesReply.DEFAULT_INSTANCE);
        }

        public Builder addList(int i, Relate relate) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).addList(i, relate);
            return this;
        }

        public Builder setList(int i, Relate.Builder builder) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).setList(i, builder.build());
            return this;
        }

        public Builder addList(Relate.Builder builder) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).addList(builder.build());
            return this;
        }

        public Builder addList(int i, Relate.Builder builder) {
            copyOnWrite();
            ((PlayerRelatesReply) this.instance).addList(i, builder.build());
            return this;
        }
    }

    static {
        PlayerRelatesReply playerRelatesReply = new PlayerRelatesReply();
        DEFAULT_INSTANCE = playerRelatesReply;
        GeneratedMessageLite.registerDefaultInstance(PlayerRelatesReply.class, playerRelatesReply);
    }

    private PlayerRelatesReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllList(Iterable<? extends Relate> iterable) {
        ensureListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.list_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(Relate relate) {
        relate.getClass();
        ensureListIsMutable();
        this.list_.add(relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearList() {
        this.list_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureListIsMutable() {
        Internal.ProtobufList<Relate> protobufList = this.list_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlayerRelatesReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerRelatesReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerRelatesReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerRelatesReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeList(int i) {
        ensureListIsMutable();
        this.list_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setList(int i, Relate relate) {
        relate.getClass();
        ensureListIsMutable();
        this.list_.set(i, relate);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68191.f16781xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerRelatesReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"list_", Relate.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerRelatesReply> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerRelatesReply.class) {
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

    public Relate getList(int i) {
        return this.list_.get(i);
    }

    public int getListCount() {
        return this.list_.size();
    }

    public List<Relate> getListList() {
        return this.list_;
    }

    public RelateOrBuilder getListOrBuilder(int i) {
        return this.list_.get(i);
    }

    public List<? extends RelateOrBuilder> getListOrBuilderList() {
        return this.list_;
    }

    public static Builder newBuilder(PlayerRelatesReply playerRelatesReply) {
        return DEFAULT_INSTANCE.createBuilder(playerRelatesReply);
    }

    public static PlayerRelatesReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerRelatesReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerRelatesReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(int i, Relate relate) {
        relate.getClass();
        ensureListIsMutable();
        this.list_.add(i, relate);
    }

    public static PlayerRelatesReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerRelatesReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerRelatesReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerRelatesReply parseFrom(InputStream inputStream) throws IOException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerRelatesReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerRelatesReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerRelatesReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerRelatesReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
