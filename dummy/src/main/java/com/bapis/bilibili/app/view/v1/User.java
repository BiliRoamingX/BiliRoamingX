package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes13.dex */
public final class User extends GeneratedMessageLite<User, User.Builder> implements UserOrBuilder {
    private static final User DEFAULT_INSTANCE;
    public static final int FACE_FIELD_NUMBER = 3;
    public static final int FOLLOWER_FIELD_NUMBER = 4;
    public static final int INTERACT_DESC_FIELD_NUMBER = 8;
    public static final int IS_ATTENTION_FIELD_NUMBER = 5;
    public static final int IS_FOLLOW_FIELD_NUMBER = 7;
    public static final int IS_INTERRELATION_FIELD_NUMBER = 6;
    public static final int MID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<User> PARSER;
    private long follower_;
    private long isAttention_;
    private long isFollow_;
    private long isInterrelation_;
    private long mid_;
    private String name_ = "";
    private String face_ = "";
    private String interactDesc_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.User$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68861 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16843xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16843xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16843xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16843xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16843xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16843xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16843xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16843xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<User, Builder> implements UserOrBuilder {
        /* synthetic */ Builder(C68861 c68861) {
            this();
        }

        public Builder clearFace() {
            copyOnWrite();
            ((User) this.instance).clearFace();
            return this;
        }

        public Builder clearFollower() {
            copyOnWrite();
            ((User) this.instance).clearFollower();
            return this;
        }

        public Builder clearInteractDesc() {
            copyOnWrite();
            ((User) this.instance).clearInteractDesc();
            return this;
        }

        public Builder clearIsAttention() {
            copyOnWrite();
            ((User) this.instance).clearIsAttention();
            return this;
        }

        public Builder clearIsFollow() {
            copyOnWrite();
            ((User) this.instance).clearIsFollow();
            return this;
        }

        public Builder clearIsInterrelation() {
            copyOnWrite();
            ((User) this.instance).clearIsInterrelation();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((User) this.instance).clearMid();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((User) this.instance).clearName();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public String getFace() {
            return ((User) this.instance).getFace();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public ByteString getFaceBytes() {
            return ((User) this.instance).getFaceBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public long getFollower() {
            return ((User) this.instance).getFollower();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public String getInteractDesc() {
            return ((User) this.instance).getInteractDesc();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public ByteString getInteractDescBytes() {
            return ((User) this.instance).getInteractDescBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public long getIsAttention() {
            return ((User) this.instance).getIsAttention();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public long getIsFollow() {
            return ((User) this.instance).getIsFollow();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public long getIsInterrelation() {
            return ((User) this.instance).getIsInterrelation();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public long getMid() {
            return ((User) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public String getName() {
            return ((User) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
        public ByteString getNameBytes() {
            return ((User) this.instance).getNameBytes();
        }

        public Builder setFace(String str) {
            copyOnWrite();
            ((User) this.instance).setFace(str);
            return this;
        }

        public Builder setFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((User) this.instance).setFaceBytes(byteString);
            return this;
        }

        public Builder setFollower(long j) {
            copyOnWrite();
            ((User) this.instance).setFollower(j);
            return this;
        }

        public Builder setInteractDesc(String str) {
            copyOnWrite();
            ((User) this.instance).setInteractDesc(str);
            return this;
        }

        public Builder setInteractDescBytes(ByteString byteString) {
            copyOnWrite();
            ((User) this.instance).setInteractDescBytes(byteString);
            return this;
        }

        public Builder setIsAttention(long j) {
            copyOnWrite();
            ((User) this.instance).setIsAttention(j);
            return this;
        }

        public Builder setIsFollow(long j) {
            copyOnWrite();
            ((User) this.instance).setIsFollow(j);
            return this;
        }

        public Builder setIsInterrelation(long j) {
            copyOnWrite();
            ((User) this.instance).setIsInterrelation(j);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((User) this.instance).setMid(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((User) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((User) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(User.DEFAULT_INSTANCE);
        }
    }

    static {
        User user = new User();
        DEFAULT_INSTANCE = user;
        GeneratedMessageLite.registerDefaultInstance(User.class, user);
    }

    private User() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFace() {
        this.face_ = getDefaultInstance().getFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollower() {
        this.follower_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteractDesc() {
        this.interactDesc_ = getDefaultInstance().getInteractDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAttention() {
        this.isAttention_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollow() {
        this.isFollow_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInterrelation() {
        this.isInterrelation_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static User getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<User> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFace(String str) {
        str.getClass();
        this.face_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.face_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollower(long j) {
        this.follower_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteractDesc(String str) {
        str.getClass();
        this.interactDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteractDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.interactDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAttention(long j) {
        this.isAttention_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollow(long j) {
        this.isFollow_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInterrelation(long j) {
        this.isInterrelation_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68861.f16843xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new User();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0208", new Object[]{"mid_", "name_", "face_", "follower_", "isAttention_", "isInterrelation_", "isFollow_", "interactDesc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<User> parser = PARSER;
                if (parser == null) {
                    synchronized (User.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public String getFace() {
        return this.face_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public ByteString getFaceBytes() {
        return ByteString.copyFromUtf8(this.face_);
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public long getFollower() {
        return this.follower_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public String getInteractDesc() {
        return this.interactDesc_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public ByteString getInteractDescBytes() {
        return ByteString.copyFromUtf8(this.interactDesc_);
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public long getIsAttention() {
        return this.isAttention_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public long getIsFollow() {
        return this.isFollow_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public long getIsInterrelation() {
        return this.isInterrelation_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.view.v1.UserOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(User user) {
        return DEFAULT_INSTANCE.createBuilder(user);
    }

    public static User parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static User parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static User parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static User parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static User parseFrom(InputStream inputStream) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static User parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static User parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static User parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
