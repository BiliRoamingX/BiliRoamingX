package com.bapis.bilibili.app.distribution;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
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
public final class UserPreferenceReply extends GeneratedMessageLite<UserPreferenceReply, UserPreferenceReply.C4801b> implements MessageLiteOrBuilder {
    private static final UserPreferenceReply DEFAULT_INSTANCE;
    private static volatile Parser<UserPreferenceReply> PARSER = null;
    public static final int PREFERENCE_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Any> preference_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.UserPreferenceReply$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C4800a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17000xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17000xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17000xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.UserPreferenceReply$b */
    /* loaded from: classes13.dex */
    public static final class C4801b extends GeneratedMessageLite.Builder<UserPreferenceReply, C4801b> implements MessageLiteOrBuilder {
        /* synthetic */ C4801b(C4800a c4800a) {
            this();
        }

        public C4801b addAllPreference(Iterable<? extends Any> iterable) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).addAllPreference(iterable);
            return this;
        }

        public C4801b addPreference(Any any) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).addPreference(any);
            return this;
        }

        public C4801b clearPreference() {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).clearPreference();
            return this;
        }

        public Any getPreference(int i2) {
            return ((UserPreferenceReply) this.instance).getPreference(i2);
        }

        public int getPreferenceCount() {
            return ((UserPreferenceReply) this.instance).getPreferenceCount();
        }

        public List<Any> getPreferenceList() {
            return Collections.unmodifiableList(((UserPreferenceReply) this.instance).getPreferenceList());
        }

        public C4801b removePreference(int i2) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).removePreference(i2);
            return this;
        }

        public C4801b setPreference(int i2, Any any) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).setPreference(i2, any);
            return this;
        }

        private C4801b() {
            super(UserPreferenceReply.DEFAULT_INSTANCE);
        }

        public C4801b addPreference(int i2, Any any) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).addPreference(i2, any);
            return this;
        }

        public C4801b setPreference(int i2, Any.Builder builder) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).setPreference(i2, builder.build());
            return this;
        }

        public C4801b addPreference(Any.Builder builder) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).addPreference(builder.build());
            return this;
        }

        public C4801b addPreference(int i2, Any.Builder builder) {
            copyOnWrite();
            ((UserPreferenceReply) this.instance).addPreference(i2, builder.build());
            return this;
        }
    }

    static {
        UserPreferenceReply userPreferenceReply = new UserPreferenceReply();
        DEFAULT_INSTANCE = userPreferenceReply;
        GeneratedMessageLite.registerDefaultInstance(UserPreferenceReply.class, userPreferenceReply);
    }

    private UserPreferenceReply() {
    }

    public void addAllPreference(Iterable<? extends Any> iterable) {
        ensurePreferenceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.preference_);
    }

    public void addPreference(Any any) {
        any.getClass();
        ensurePreferenceIsMutable();
        this.preference_.add(any);
    }

    public void clearPreference() {
        this.preference_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePreferenceIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.preference_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.preference_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static UserPreferenceReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4801b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserPreferenceReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserPreferenceReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserPreferenceReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserPreferenceReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removePreference(int i2) {
        ensurePreferenceIsMutable();
        this.preference_.remove(i2);
    }

    public void setPreference(int i2, Any any) {
        any.getClass();
        ensurePreferenceIsMutable();
        this.preference_.set(i2, any);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C4800a c4800a = null;
        switch (C4800a.f17000xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserPreferenceReply();
            case 2:
                return new C4801b(c4800a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"preference_", Any.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserPreferenceReply> parser = PARSER;
                if (parser == null) {
                    synchronized (UserPreferenceReply.class) {
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

    public Any getPreference(int i2) {
        return this.preference_.get(i2);
    }

    public int getPreferenceCount() {
        return this.preference_.size();
    }

    public List<Any> getPreferenceList() {
        return this.preference_;
    }

    public AnyOrBuilder getPreferenceOrBuilder(int i2) {
        return this.preference_.get(i2);
    }

    public List<? extends AnyOrBuilder> getPreferenceOrBuilderList() {
        return this.preference_;
    }

    public static C4801b newBuilder(UserPreferenceReply userPreferenceReply) {
        return DEFAULT_INSTANCE.createBuilder(userPreferenceReply);
    }

    public static UserPreferenceReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserPreferenceReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserPreferenceReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserPreferenceReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addPreference(int i2, Any any) {
        any.getClass();
        ensurePreferenceIsMutable();
        this.preference_.add(i2, any);
    }

    public static UserPreferenceReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserPreferenceReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserPreferenceReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserPreferenceReply parseFrom(InputStream inputStream) throws IOException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserPreferenceReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserPreferenceReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserPreferenceReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserPreferenceReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
