package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes14.dex */
public final class UserInfo extends GeneratedMessageLite<UserInfo, UserInfo.Builder> implements MessageLiteOrBuilder {
    private static final UserInfo DEFAULT_INSTANCE;
    public static final int FACE_FIELD_NUMBER = 4;
    public static final int MID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<UserInfo> PARSER = null;
    public static final int RANK_FIELD_NUMBER = 6;
    public static final int SEX_FIELD_NUMBER = 3;
    public static final int SIGN_FIELD_NUMBER = 5;
    private long mid_;
    private int rank_;
    private String name_ = "";
    private String sex_ = "";
    private String face_ = "";
    private String sign_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.UserInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17104xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17104xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17104xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17104xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17104xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17104xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17104xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17104xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72711 c72711) {
            this();
        }

        public Builder clearFace() {
            copyOnWrite();
            ((UserInfo) this.instance).clearFace();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((UserInfo) this.instance).clearMid();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((UserInfo) this.instance).clearName();
            return this;
        }

        public Builder clearRank() {
            copyOnWrite();
            ((UserInfo) this.instance).clearRank();
            return this;
        }

        public Builder clearSex() {
            copyOnWrite();
            ((UserInfo) this.instance).clearSex();
            return this;
        }

        public Builder clearSign() {
            copyOnWrite();
            ((UserInfo) this.instance).clearSign();
            return this;
        }

        public String getFace() {
            return ((UserInfo) this.instance).getFace();
        }

        public ByteString getFaceBytes() {
            return ((UserInfo) this.instance).getFaceBytes();
        }

        public long getMid() {
            return ((UserInfo) this.instance).getMid();
        }

        public String getName() {
            return ((UserInfo) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((UserInfo) this.instance).getNameBytes();
        }

        public int getRank() {
            return ((UserInfo) this.instance).getRank();
        }

        public String getSex() {
            return ((UserInfo) this.instance).getSex();
        }

        public ByteString getSexBytes() {
            return ((UserInfo) this.instance).getSexBytes();
        }

        public String getSign() {
            return ((UserInfo) this.instance).getSign();
        }

        public ByteString getSignBytes() {
            return ((UserInfo) this.instance).getSignBytes();
        }

        public Builder setFace(String str) {
            copyOnWrite();
            ((UserInfo) this.instance).setFace(str);
            return this;
        }

        public Builder setFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((UserInfo) this.instance).setFaceBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((UserInfo) this.instance).setMid(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((UserInfo) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((UserInfo) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setRank(int i) {
            copyOnWrite();
            ((UserInfo) this.instance).setRank(i);
            return this;
        }

        public Builder setSex(String str) {
            copyOnWrite();
            ((UserInfo) this.instance).setSex(str);
            return this;
        }

        public Builder setSexBytes(ByteString byteString) {
            copyOnWrite();
            ((UserInfo) this.instance).setSexBytes(byteString);
            return this;
        }

        public Builder setSign(String str) {
            copyOnWrite();
            ((UserInfo) this.instance).setSign(str);
            return this;
        }

        public Builder setSignBytes(ByteString byteString) {
            copyOnWrite();
            ((UserInfo) this.instance).setSignBytes(byteString);
            return this;
        }

        private Builder() {
            super(UserInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        UserInfo userInfo = new UserInfo();
        DEFAULT_INSTANCE = userInfo;
        GeneratedMessageLite.registerDefaultInstance(UserInfo.class, userInfo);
    }

    private UserInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFace() {
        this.face_ = getDefaultInstance().getFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.rank_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSex() {
        this.sex_ = getDefaultInstance().getSex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSign() {
        this.sign_ = getDefaultInstance().getSign();
    }

    public static UserInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserInfo> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(int i) {
        this.rank_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSex(String str) {
        str.getClass();
        this.sex_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSexBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sex_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSign(String str) {
        str.getClass();
        this.sign_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sign_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72711.f17104xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004", new Object[]{"mid_", "name_", "sex_", "face_", "sign_", "rank_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (UserInfo.class) {
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

    public String getFace() {
        return this.face_;
    }

    public ByteString getFaceBytes() {
        return ByteString.copyFromUtf8(this.face_);
    }

    public long getMid() {
        return this.mid_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public int getRank() {
        return this.rank_;
    }

    public String getSex() {
        return this.sex_;
    }

    public ByteString getSexBytes() {
        return ByteString.copyFromUtf8(this.sex_);
    }

    public String getSign() {
        return this.sign_;
    }

    public ByteString getSignBytes() {
        return ByteString.copyFromUtf8(this.sign_);
    }

    public static Builder newBuilder(UserInfo userInfo) {
        return DEFAULT_INSTANCE.createBuilder(userInfo);
    }

    public static UserInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserInfo parseFrom(InputStream inputStream) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
