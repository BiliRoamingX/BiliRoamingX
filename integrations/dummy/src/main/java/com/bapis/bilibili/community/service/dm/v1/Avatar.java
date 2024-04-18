package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class Avatar extends GeneratedMessageLite<Avatar, Avatar.Builder> implements AvatarOrBuilder {
    public static final int AVATAR_TYPE_FIELD_NUMBER = 3;
    private static final Avatar DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Avatar> PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private int avatarType_;
    private String id_ = "";
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Avatar$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17031xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17031xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17031xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Avatar, Builder> implements AvatarOrBuilder {
        /* synthetic */ Builder(C71821 c71821) {
            this();
        }

        public Builder clearAvatarType() {
            copyOnWrite();
            ((Avatar) this.instance).clearAvatarType();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Avatar) this.instance).clearId();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((Avatar) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
        public AvatarType getAvatarType() {
            return ((Avatar) this.instance).getAvatarType();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
        public int getAvatarTypeValue() {
            return ((Avatar) this.instance).getAvatarTypeValue();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
        public String getId() {
            return ((Avatar) this.instance).getId();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
        public ByteString getIdBytes() {
            return ((Avatar) this.instance).getIdBytes();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
        public String getUrl() {
            return ((Avatar) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
        public ByteString getUrlBytes() {
            return ((Avatar) this.instance).getUrlBytes();
        }

        public Builder setAvatarType(AvatarType avatarType) {
            copyOnWrite();
            ((Avatar) this.instance).setAvatarType(avatarType);
            return this;
        }

        public Builder setAvatarTypeValue(int i) {
            copyOnWrite();
            ((Avatar) this.instance).setAvatarTypeValue(i);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((Avatar) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Avatar) this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((Avatar) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Avatar) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(Avatar.DEFAULT_INSTANCE);
        }
    }

    static {
        Avatar avatar = new Avatar();
        DEFAULT_INSTANCE = avatar;
        GeneratedMessageLite.registerDefaultInstance(Avatar.class, avatar);
    }

    private Avatar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatarType() {
        this.avatarType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static Avatar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Avatar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Avatar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Avatar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Avatar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarType(AvatarType avatarType) {
        this.avatarType_ = avatarType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarTypeValue(int i) {
        this.avatarType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71821.f17031xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Avatar();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\f", new Object[]{"id_", "url_", "avatarType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Avatar> parser = PARSER;
                if (parser == null) {
                    synchronized (Avatar.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
    public AvatarType getAvatarType() {
        AvatarType forNumber = AvatarType.forNumber(this.avatarType_);
        return forNumber == null ? AvatarType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
    public int getAvatarTypeValue() {
        return this.avatarType_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.AvatarOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(Avatar avatar) {
        return DEFAULT_INSTANCE.createBuilder(avatar);
    }

    public static Avatar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Avatar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Avatar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Avatar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Avatar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Avatar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Avatar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Avatar parseFrom(InputStream inputStream) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Avatar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Avatar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Avatar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
