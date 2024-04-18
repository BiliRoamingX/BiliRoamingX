package com.bapis.bilibili.app.view.v1;

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
public final class UserRelation extends GeneratedMessageLite<UserRelation, UserRelation.Builder> implements MessageLiteOrBuilder {
    private static final UserRelation DEFAULT_INSTANCE;
    public static final int LIKE_INFO_FIELD_NUMBER = 1;
    private static volatile Parser<UserRelation> PARSER;
    private InteractArea likeInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UserRelation$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68891 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16846xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16846xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16846xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16846xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16846xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16846xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16846xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16846xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserRelation, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68891 c68891) {
            this();
        }

        public Builder clearLikeInfo() {
            copyOnWrite();
            ((UserRelation) this.instance).clearLikeInfo();
            return this;
        }

        public InteractArea getLikeInfo() {
            return ((UserRelation) this.instance).getLikeInfo();
        }

        public boolean hasLikeInfo() {
            return ((UserRelation) this.instance).hasLikeInfo();
        }

        public Builder mergeLikeInfo(InteractArea interactArea) {
            copyOnWrite();
            ((UserRelation) this.instance).mergeLikeInfo(interactArea);
            return this;
        }

        public Builder setLikeInfo(InteractArea interactArea) {
            copyOnWrite();
            ((UserRelation) this.instance).setLikeInfo(interactArea);
            return this;
        }

        private Builder() {
            super(UserRelation.DEFAULT_INSTANCE);
        }

        public Builder setLikeInfo(InteractArea.Builder builder) {
            copyOnWrite();
            ((UserRelation) this.instance).setLikeInfo(builder.build());
            return this;
        }
    }

    static {
        UserRelation userRelation = new UserRelation();
        DEFAULT_INSTANCE = userRelation;
        GeneratedMessageLite.registerDefaultInstance(UserRelation.class, userRelation);
    }

    private UserRelation() {
    }

    public void clearLikeInfo() {
        this.likeInfo_ = null;
    }

    public static UserRelation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeLikeInfo(InteractArea interactArea) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserRelation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserRelation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserRelation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserRelation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setLikeInfo(InteractArea interactArea) {
        interactArea.getClass();
        this.likeInfo_ = interactArea;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68891.f16846xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserRelation();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"likeInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserRelation> parser = PARSER;
                if (parser == null) {
                    synchronized (UserRelation.class) {
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

    public InteractArea getLikeInfo() {
        InteractArea interactArea = this.likeInfo_;
        return interactArea == null ? InteractArea.getDefaultInstance() : interactArea;
    }

    public boolean hasLikeInfo() {
        return this.likeInfo_ != null;
    }

    public static Builder newBuilder(UserRelation userRelation) {
        return DEFAULT_INSTANCE.createBuilder(userRelation);
    }

    public static UserRelation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserRelation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserRelation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserRelation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserRelation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserRelation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserRelation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserRelation parseFrom(InputStream inputStream) throws IOException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserRelation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserRelation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserRelation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserRelation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
