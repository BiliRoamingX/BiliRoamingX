package com.bapis.bilibili.app.interfaces.v1;

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
/* loaded from: classes19.dex */
public final class ModeStatusReply extends GeneratedMessageLite<ModeStatusReply, ModeStatusReply.C6286b> implements MessageLiteOrBuilder {
    private static final ModeStatusReply DEFAULT_INSTANCE;
    private static volatile Parser<ModeStatusReply> PARSER = null;
    public static final int USER_MODELS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<UserModel> userModels_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.ModeStatusReply$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C6285a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17570xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17570xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.interfaces.v1.ModeStatusReply$b */
    /* loaded from: classes19.dex */
    public static final class C6286b extends GeneratedMessageLite.Builder<ModeStatusReply, C6286b> implements MessageLiteOrBuilder {
        /* synthetic */ C6286b(C6285a c6285a) {
            this();
        }

        public C6286b addAllUserModels(Iterable<? extends UserModel> iterable) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).addAllUserModels(iterable);
            return this;
        }

        public C6286b addUserModels(UserModel userModel) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).addUserModels(userModel);
            return this;
        }

        public C6286b clearUserModels() {
            copyOnWrite();
            ((ModeStatusReply) this.instance).clearUserModels();
            return this;
        }

        public UserModel getUserModels(int i2) {
            return ((ModeStatusReply) this.instance).getUserModels(i2);
        }

        public int getUserModelsCount() {
            return ((ModeStatusReply) this.instance).getUserModelsCount();
        }

        public List<UserModel> getUserModelsList() {
            return Collections.unmodifiableList(((ModeStatusReply) this.instance).getUserModelsList());
        }

        public C6286b removeUserModels(int i2) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).removeUserModels(i2);
            return this;
        }

        public C6286b setUserModels(int i2, UserModel userModel) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).setUserModels(i2, userModel);
            return this;
        }

        private C6286b() {
            super(ModeStatusReply.DEFAULT_INSTANCE);
        }

        public C6286b addUserModels(int i2, UserModel userModel) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).addUserModels(i2, userModel);
            return this;
        }

        public C6286b setUserModels(int i2, UserModel.C6358b c6358b) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).setUserModels(i2, c6358b.build());
            return this;
        }

        public C6286b addUserModels(UserModel.C6358b c6358b) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).addUserModels(c6358b.build());
            return this;
        }

        public C6286b addUserModels(int i2, UserModel.C6358b c6358b) {
            copyOnWrite();
            ((ModeStatusReply) this.instance).addUserModels(i2, c6358b.build());
            return this;
        }
    }

    static {
        ModeStatusReply modeStatusReply = new ModeStatusReply();
        DEFAULT_INSTANCE = modeStatusReply;
        GeneratedMessageLite.registerDefaultInstance(ModeStatusReply.class, modeStatusReply);
    }

    private ModeStatusReply() {
    }

    public void addAllUserModels(Iterable<? extends UserModel> iterable) {
        ensureUserModelsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.userModels_);
    }

    public void addUserModels(UserModel userModel) {
        userModel.getClass();
        ensureUserModelsIsMutable();
        this.userModels_.add(userModel);
    }

    public void clearUserModels() {
        this.userModels_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUserModelsIsMutable() {
        Internal.ProtobufList<UserModel> protobufList = this.userModels_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.userModels_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ModeStatusReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6286b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ModeStatusReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ModeStatusReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModeStatusReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ModeStatusReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeUserModels(int i2) {
        ensureUserModelsIsMutable();
        this.userModels_.remove(i2);
    }

    public void setUserModels(int i2, UserModel userModel) {
        userModel.getClass();
        ensureUserModelsIsMutable();
        this.userModels_.set(i2, userModel);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C6285a c6285a = null;
        switch (C6285a.f17570xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ModeStatusReply();
            case 2:
                return new C6286b(c6285a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"userModels_", UserModel.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ModeStatusReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ModeStatusReply.class) {
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

    public UserModel getUserModels(int i2) {
        return this.userModels_.get(i2);
    }

    public int getUserModelsCount() {
        return this.userModels_.size();
    }

    public List<UserModel> getUserModelsList() {
        return this.userModels_;
    }

    public InterfaceC6386x getUserModelsOrBuilder(int i2) {
        return this.userModels_.get(i2);
    }

    public List<? extends InterfaceC6386x> getUserModelsOrBuilderList() {
        return this.userModels_;
    }

    public static C6286b newBuilder(ModeStatusReply modeStatusReply) {
        return DEFAULT_INSTANCE.createBuilder(modeStatusReply);
    }

    public static ModeStatusReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModeStatusReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModeStatusReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ModeStatusReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public void addUserModels(int i2, UserModel userModel) {
        userModel.getClass();
        ensureUserModelsIsMutable();
        this.userModels_.add(i2, userModel);
    }

    public static ModeStatusReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ModeStatusReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModeStatusReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ModeStatusReply parseFrom(InputStream inputStream) throws IOException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModeStatusReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModeStatusReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ModeStatusReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModeStatusReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
