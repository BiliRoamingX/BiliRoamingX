package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class UserGarb extends GeneratedMessageLite<UserGarb, UserGarb.Builder> implements MessageLiteOrBuilder {
    private static final UserGarb DEFAULT_INSTANCE;
    public static final int LIKETOAST_FIELD_NUMBER = 2;
    private static volatile Parser<UserGarb> PARSER = null;
    public static final int URLIMAGEANICUT_FIELD_NUMBER = 1;
    private String urlImageAniCut_ = "";
    private String likeToast_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UserGarb$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16845xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16845xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16845xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16845xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16845xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16845xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16845xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16845xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserGarb, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68881 c68881) {
            this();
        }

        public Builder clearLikeToast() {
            copyOnWrite();
            ((UserGarb) this.instance).clearLikeToast();
            return this;
        }

        public Builder clearUrlImageAniCut() {
            copyOnWrite();
            ((UserGarb) this.instance).clearUrlImageAniCut();
            return this;
        }

        public String getLikeToast() {
            return ((UserGarb) this.instance).getLikeToast();
        }

        public ByteString getLikeToastBytes() {
            return ((UserGarb) this.instance).getLikeToastBytes();
        }

        public String getUrlImageAniCut() {
            return ((UserGarb) this.instance).getUrlImageAniCut();
        }

        public ByteString getUrlImageAniCutBytes() {
            return ((UserGarb) this.instance).getUrlImageAniCutBytes();
        }

        public Builder setLikeToast(String str) {
            copyOnWrite();
            ((UserGarb) this.instance).setLikeToast(str);
            return this;
        }

        public Builder setLikeToastBytes(ByteString byteString) {
            copyOnWrite();
            ((UserGarb) this.instance).setLikeToastBytes(byteString);
            return this;
        }

        public Builder setUrlImageAniCut(String str) {
            copyOnWrite();
            ((UserGarb) this.instance).setUrlImageAniCut(str);
            return this;
        }

        public Builder setUrlImageAniCutBytes(ByteString byteString) {
            copyOnWrite();
            ((UserGarb) this.instance).setUrlImageAniCutBytes(byteString);
            return this;
        }

        private Builder() {
            super(UserGarb.DEFAULT_INSTANCE);
        }
    }

    static {
        UserGarb userGarb = new UserGarb();
        DEFAULT_INSTANCE = userGarb;
        GeneratedMessageLite.registerDefaultInstance(UserGarb.class, userGarb);
    }

    private UserGarb() {
    }

    public void clearLikeToast() {
        this.likeToast_ = getDefaultInstance().getLikeToast();
    }

    public void clearUrlImageAniCut() {
        this.urlImageAniCut_ = getDefaultInstance().getUrlImageAniCut();
    }

    public static UserGarb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserGarb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserGarb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserGarb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserGarb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setLikeToast(String str) {
        str.getClass();
        this.likeToast_ = str;
    }

    public void setLikeToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.likeToast_ = byteString.toStringUtf8();
    }

    public void setUrlImageAniCut(String str) {
        str.getClass();
        this.urlImageAniCut_ = str;
    }

    public void setUrlImageAniCutBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.urlImageAniCut_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68881.f16845xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserGarb();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"urlImageAniCut_", "likeToast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserGarb> parser = PARSER;
                if (parser == null) {
                    synchronized (UserGarb.class) {
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

    public String getLikeToast() {
        return this.likeToast_;
    }

    public ByteString getLikeToastBytes() {
        return ByteString.copyFromUtf8(this.likeToast_);
    }

    public String getUrlImageAniCut() {
        return this.urlImageAniCut_;
    }

    public ByteString getUrlImageAniCutBytes() {
        return ByteString.copyFromUtf8(this.urlImageAniCut_);
    }

    public static Builder newBuilder(UserGarb userGarb) {
        return DEFAULT_INSTANCE.createBuilder(userGarb);
    }

    public static UserGarb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserGarb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserGarb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserGarb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserGarb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserGarb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserGarb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserGarb parseFrom(InputStream inputStream) throws IOException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserGarb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserGarb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserGarb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserGarb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
