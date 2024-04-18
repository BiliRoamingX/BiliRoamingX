package com.bapis.bilibili.app.view.v1;

import com.bapis.bilibili.app.view.v1.User;
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
public final class GetUserReply extends GeneratedMessageLite<GetUserReply, GetUserReply.Builder> implements MessageLiteOrBuilder {
    private static final GetUserReply DEFAULT_INSTANCE;
    public static final int LIKE_LIST_FIELD_NUMBER = 1;
    private static volatile Parser<GetUserReply> PARSER;
    private Internal.ProtobufList<User> likeList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.GetUserReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67701 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16741xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16741xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16741xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16741xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16741xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16741xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16741xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16741xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GetUserReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67701 c67701) {
            this();
        }

        public Builder addAllLikeList(Iterable<? extends User> iterable) {
            copyOnWrite();
            ((GetUserReply) this.instance).addAllLikeList(iterable);
            return this;
        }

        public Builder addLikeList(User user) {
            copyOnWrite();
            ((GetUserReply) this.instance).addLikeList(user);
            return this;
        }

        public Builder clearLikeList() {
            copyOnWrite();
            ((GetUserReply) this.instance).clearLikeList();
            return this;
        }

        public User getLikeList(int i) {
            return ((GetUserReply) this.instance).getLikeList(i);
        }

        public int getLikeListCount() {
            return ((GetUserReply) this.instance).getLikeListCount();
        }

        public List<User> getLikeListList() {
            return Collections.unmodifiableList(((GetUserReply) this.instance).getLikeListList());
        }

        public Builder removeLikeList(int i) {
            copyOnWrite();
            ((GetUserReply) this.instance).removeLikeList(i);
            return this;
        }

        public Builder setLikeList(int i, User user) {
            copyOnWrite();
            ((GetUserReply) this.instance).setLikeList(i, user);
            return this;
        }

        private Builder() {
            super(GetUserReply.DEFAULT_INSTANCE);
        }

        public Builder addLikeList(int i, User user) {
            copyOnWrite();
            ((GetUserReply) this.instance).addLikeList(i, user);
            return this;
        }

        public Builder setLikeList(int i, User.Builder builder) {
            copyOnWrite();
            ((GetUserReply) this.instance).setLikeList(i, builder.build());
            return this;
        }

        public Builder addLikeList(User.Builder builder) {
            copyOnWrite();
            ((GetUserReply) this.instance).addLikeList(builder.build());
            return this;
        }

        public Builder addLikeList(int i, User.Builder builder) {
            copyOnWrite();
            ((GetUserReply) this.instance).addLikeList(i, builder.build());
            return this;
        }
    }

    static {
        GetUserReply getUserReply = new GetUserReply();
        DEFAULT_INSTANCE = getUserReply;
        GeneratedMessageLite.registerDefaultInstance(GetUserReply.class, getUserReply);
    }

    private GetUserReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLikeList(Iterable<? extends User> iterable) {
        ensureLikeListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.likeList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLikeList(User user) {
        user.getClass();
        ensureLikeListIsMutable();
        this.likeList_.add(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLikeList() {
        this.likeList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLikeListIsMutable() {
        Internal.ProtobufList<User> protobufList = this.likeList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.likeList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GetUserReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GetUserReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetUserReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GetUserReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLikeList(int i) {
        ensureLikeListIsMutable();
        this.likeList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLikeList(int i, User user) {
        user.getClass();
        ensureLikeListIsMutable();
        this.likeList_.set(i, user);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67701.f16741xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GetUserReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"likeList_", User.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GetUserReply> parser = PARSER;
                if (parser == null) {
                    synchronized (GetUserReply.class) {
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

    public User getLikeList(int i) {
        return this.likeList_.get(i);
    }

    public int getLikeListCount() {
        return this.likeList_.size();
    }

    public List<User> getLikeListList() {
        return this.likeList_;
    }

    public UserOrBuilder getLikeListOrBuilder(int i) {
        return this.likeList_.get(i);
    }

    public List<? extends UserOrBuilder> getLikeListOrBuilderList() {
        return this.likeList_;
    }

    public static Builder newBuilder(GetUserReply getUserReply) {
        return DEFAULT_INSTANCE.createBuilder(getUserReply);
    }

    public static GetUserReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetUserReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLikeList(int i, User user) {
        user.getClass();
        ensureLikeListIsMutable();
        this.likeList_.add(i, user);
    }

    public static GetUserReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetUserReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetUserReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GetUserReply parseFrom(InputStream inputStream) throws IOException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetUserReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
