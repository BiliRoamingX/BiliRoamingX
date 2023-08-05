package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class UserList extends GeneratedMessageLite<UserList, UserList.Builder> implements MessageLiteOrBuilder {
    private static final UserList DEFAULT_INSTANCE;
    public static final int LIST_FIELD_NUMBER = 1;
    private static volatile Parser<UserList> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Internal.ProtobufList<User> list_ = GeneratedMessageLite.emptyProtobufList();
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UserList$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70801 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17057xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17057xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17057xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserList, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70801 c70801) {
            this();
        }

        public Builder addAllList(Iterable<? extends User> iterable) {
            copyOnWrite();
            ((UserList) this.instance).addAllList(iterable);
            return this;
        }

        public Builder addList(User user) {
            copyOnWrite();
            ((UserList) this.instance).addList(user);
            return this;
        }

        public Builder clearList() {
            copyOnWrite();
            ((UserList) this.instance).clearList();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((UserList) this.instance).clearTitle();
            return this;
        }

        public User getList(int i) {
            return ((UserList) this.instance).getList(i);
        }

        public int getListCount() {
            return ((UserList) this.instance).getListCount();
        }

        public List<User> getListList() {
            return Collections.unmodifiableList(((UserList) this.instance).getListList());
        }

        public String getTitle() {
            return ((UserList) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((UserList) this.instance).getTitleBytes();
        }

        public Builder removeList(int i) {
            copyOnWrite();
            ((UserList) this.instance).removeList(i);
            return this;
        }

        public Builder setList(int i, User user) {
            copyOnWrite();
            ((UserList) this.instance).setList(i, user);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((UserList) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UserList) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(UserList.DEFAULT_INSTANCE);
        }

        public Builder addList(int i, User user) {
            copyOnWrite();
            ((UserList) this.instance).addList(i, user);
            return this;
        }

        public Builder setList(int i, User.Builder builder) {
            copyOnWrite();
            ((UserList) this.instance).setList(i, builder.build());
            return this;
        }

        public Builder addList(User.Builder builder) {
            copyOnWrite();
            ((UserList) this.instance).addList(builder.build());
            return this;
        }

        public Builder addList(int i, User.Builder builder) {
            copyOnWrite();
            ((UserList) this.instance).addList(i, builder.build());
            return this;
        }
    }

    static {
        UserList userList = new UserList();
        DEFAULT_INSTANCE = userList;
        GeneratedMessageLite.registerDefaultInstance(UserList.class, userList);
    }

    private UserList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllList(Iterable<? extends User> iterable) {
        ensureListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.list_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(User user) {
        user.getClass();
        ensureListIsMutable();
        this.list_.add(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearList() {
        this.list_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureListIsMutable() {
        Internal.ProtobufList<User> protobufList = this.list_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static UserList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeList(int i) {
        ensureListIsMutable();
        this.list_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setList(int i, User user) {
        user.getClass();
        ensureListIsMutable();
        this.list_.set(i, user);
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
        switch (C70801.f17057xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserList();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", new Object[]{"list_", User.class, "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserList> parser = PARSER;
                if (parser == null) {
                    synchronized (UserList.class) {
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

    public User getList(int i) {
        return this.list_.get(i);
    }

    public int getListCount() {
        return this.list_.size();
    }

    public List<User> getListList() {
        return this.list_;
    }

    public UserOrBuilder getListOrBuilder(int i) {
        return this.list_.get(i);
    }

    public List<? extends UserOrBuilder> getListOrBuilderList() {
        return this.list_;
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(UserList userList) {
        return DEFAULT_INSTANCE.createBuilder(userList);
    }

    public static UserList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(int i, User user) {
        user.getClass();
        ensureListIsMutable();
        this.list_.add(i, user);
    }

    public static UserList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserList parseFrom(InputStream inputStream) throws IOException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
