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
public final class InteractArea extends GeneratedMessageLite<InteractArea, InteractArea.Builder> implements MessageLiteOrBuilder {
    private static final InteractArea DEFAULT_INSTANCE;
    public static final int LIST_FIELD_NUMBER = 1;
    private static volatile Parser<InteractArea> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private Internal.ProtobufList<User> list_ = GeneratedMessageLite.emptyProtobufList();
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.InteractArea$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67771 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16748xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16748xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16748xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16748xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16748xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16748xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16748xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16748xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<InteractArea, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67771 c67771) {
            this();
        }

        public Builder addAllList(Iterable<? extends User> iterable) {
            copyOnWrite();
            ((InteractArea) this.instance).addAllList(iterable);
            return this;
        }

        public Builder addList(User user) {
            copyOnWrite();
            ((InteractArea) this.instance).addList(user);
            return this;
        }

        public Builder clearList() {
            copyOnWrite();
            ((InteractArea) this.instance).clearList();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((InteractArea) this.instance).clearText();
            return this;
        }

        public User getList(int i) {
            return ((InteractArea) this.instance).getList(i);
        }

        public int getListCount() {
            return ((InteractArea) this.instance).getListCount();
        }

        public List<User> getListList() {
            return Collections.unmodifiableList(((InteractArea) this.instance).getListList());
        }

        public String getText() {
            return ((InteractArea) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((InteractArea) this.instance).getTextBytes();
        }

        public Builder removeList(int i) {
            copyOnWrite();
            ((InteractArea) this.instance).removeList(i);
            return this;
        }

        public Builder setList(int i, User user) {
            copyOnWrite();
            ((InteractArea) this.instance).setList(i, user);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((InteractArea) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((InteractArea) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(InteractArea.DEFAULT_INSTANCE);
        }

        public Builder addList(int i, User user) {
            copyOnWrite();
            ((InteractArea) this.instance).addList(i, user);
            return this;
        }

        public Builder setList(int i, User.Builder builder) {
            copyOnWrite();
            ((InteractArea) this.instance).setList(i, builder.build());
            return this;
        }

        public Builder addList(User.Builder builder) {
            copyOnWrite();
            ((InteractArea) this.instance).addList(builder.build());
            return this;
        }

        public Builder addList(int i, User.Builder builder) {
            copyOnWrite();
            ((InteractArea) this.instance).addList(i, builder.build());
            return this;
        }
    }

    static {
        InteractArea interactArea = new InteractArea();
        DEFAULT_INSTANCE = interactArea;
        GeneratedMessageLite.registerDefaultInstance(InteractArea.class, interactArea);
    }

    private InteractArea() {
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
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    private void ensureListIsMutable() {
        Internal.ProtobufList<User> protobufList = this.list_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static InteractArea getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static InteractArea parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InteractArea) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InteractArea parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<InteractArea> parser() {
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
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67771.f16748xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new InteractArea();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", new Object[]{"list_", User.class, "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<InteractArea> parser = PARSER;
                if (parser == null) {
                    synchronized (InteractArea.class) {
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

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(InteractArea interactArea) {
        return DEFAULT_INSTANCE.createBuilder(interactArea);
    }

    public static InteractArea parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InteractArea) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InteractArea parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static InteractArea parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addList(int i, User user) {
        user.getClass();
        ensureListIsMutable();
        this.list_.add(i, user);
    }

    public static InteractArea parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static InteractArea parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InteractArea parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static InteractArea parseFrom(InputStream inputStream) throws IOException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InteractArea parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static InteractArea parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static InteractArea parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InteractArea) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
