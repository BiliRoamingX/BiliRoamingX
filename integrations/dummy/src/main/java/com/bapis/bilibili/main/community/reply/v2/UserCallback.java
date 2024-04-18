package com.bapis.bilibili.main.community.reply.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes18.dex */
public final class UserCallback extends GeneratedMessageLite<UserCallback, UserCallback.Builder> implements UserCallbackOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final UserCallback DEFAULT_INSTANCE;
    private static volatile Parser<UserCallback> PARSER = null;
    public static final int SCENE_FIELD_NUMBER = 1;
    private int action_;
    private int scene_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.UserCallback$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C80071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17766xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17766xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17766xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17766xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17766xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17766xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17766xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17766xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserCallback, Builder> implements UserCallbackOrBuilder {
        /* synthetic */ Builder(C80071 c80071) {
            this();
        }

        public Builder clearAction() {
            copyOnWrite();
            ((UserCallback) this.instance).clearAction();
            return this;
        }

        public Builder clearScene() {
            copyOnWrite();
            ((UserCallback) this.instance).clearScene();
            return this;
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
        public UserCallbackAction getAction() {
            return ((UserCallback) this.instance).getAction();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
        public int getActionValue() {
            return ((UserCallback) this.instance).getActionValue();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
        public UserCallbackScene getScene() {
            return ((UserCallback) this.instance).getScene();
        }

        @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
        public int getSceneValue() {
            return ((UserCallback) this.instance).getSceneValue();
        }

        public Builder setAction(UserCallbackAction userCallbackAction) {
            copyOnWrite();
            ((UserCallback) this.instance).setAction(userCallbackAction);
            return this;
        }

        public Builder setActionValue(int i) {
            copyOnWrite();
            ((UserCallback) this.instance).setActionValue(i);
            return this;
        }

        public Builder setScene(UserCallbackScene userCallbackScene) {
            copyOnWrite();
            ((UserCallback) this.instance).setScene(userCallbackScene);
            return this;
        }

        public Builder setSceneValue(int i) {
            copyOnWrite();
            ((UserCallback) this.instance).setSceneValue(i);
            return this;
        }

        private Builder() {
            super(UserCallback.DEFAULT_INSTANCE);
        }
    }

    static {
        UserCallback userCallback = new UserCallback();
        DEFAULT_INSTANCE = userCallback;
        GeneratedMessageLite.registerDefaultInstance(UserCallback.class, userCallback);
    }

    private UserCallback() {
    }

    public void clearAction() {
        this.action_ = 0;
    }

    public void clearScene() {
        this.scene_ = 0;
    }

    public static UserCallback getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserCallback parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserCallback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserCallback parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserCallback> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAction(UserCallbackAction userCallbackAction) {
        this.action_ = userCallbackAction.getNumber();
    }

    public void setActionValue(int i) {
        this.action_ = i;
    }

    public void setScene(UserCallbackScene userCallbackScene) {
        this.scene_ = userCallbackScene.getNumber();
    }

    public void setSceneValue(int i) {
        this.scene_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C80071.f17766xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserCallback();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"scene_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserCallback> parser = PARSER;
                if (parser == null) {
                    synchronized (UserCallback.class) {
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

    @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
    public UserCallbackAction getAction() {
        UserCallbackAction forNumber = UserCallbackAction.forNumber(this.action_);
        return forNumber == null ? UserCallbackAction.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
    public int getActionValue() {
        return this.action_;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
    public UserCallbackScene getScene() {
        UserCallbackScene forNumber = UserCallbackScene.forNumber(this.scene_);
        return forNumber == null ? UserCallbackScene.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.main.community.reply.v2.UserCallbackOrBuilder
    public int getSceneValue() {
        return this.scene_;
    }

    public static Builder newBuilder(UserCallback userCallback) {
        return DEFAULT_INSTANCE.createBuilder(userCallback);
    }

    public static UserCallback parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserCallback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserCallback parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserCallback parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserCallback parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserCallback parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserCallback parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserCallback parseFrom(InputStream inputStream) throws IOException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserCallback parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserCallback parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserCallback parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserCallback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
