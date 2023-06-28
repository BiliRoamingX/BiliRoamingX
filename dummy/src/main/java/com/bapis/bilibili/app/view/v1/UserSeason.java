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
public final class UserSeason extends GeneratedMessageLite<UserSeason, UserSeason.Builder> implements MessageLiteOrBuilder {
    public static final int ATTENTION_FIELD_NUMBER = 1;
    private static final UserSeason DEFAULT_INSTANCE;
    private static volatile Parser<UserSeason> PARSER;
    private String attention_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UserSeason$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68901 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16847xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16847xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16847xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16847xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16847xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16847xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16847xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16847xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UserSeason, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68901 c68901) {
            this();
        }

        public Builder clearAttention() {
            copyOnWrite();
            ((UserSeason) this.instance).clearAttention();
            return this;
        }

        public String getAttention() {
            return ((UserSeason) this.instance).getAttention();
        }

        public ByteString getAttentionBytes() {
            return ((UserSeason) this.instance).getAttentionBytes();
        }

        public Builder setAttention(String str) {
            copyOnWrite();
            ((UserSeason) this.instance).setAttention(str);
            return this;
        }

        public Builder setAttentionBytes(ByteString byteString) {
            copyOnWrite();
            ((UserSeason) this.instance).setAttentionBytes(byteString);
            return this;
        }

        private Builder() {
            super(UserSeason.DEFAULT_INSTANCE);
        }
    }

    static {
        UserSeason userSeason = new UserSeason();
        DEFAULT_INSTANCE = userSeason;
        GeneratedMessageLite.registerDefaultInstance(UserSeason.class, userSeason);
    }

    private UserSeason() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttention() {
        this.attention_ = getDefaultInstance().getAttention();
    }

    public static UserSeason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserSeason parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserSeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserSeason parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserSeason> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttention(String str) {
        str.getClass();
        this.attention_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttentionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.attention_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68901.f16847xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UserSeason();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"attention_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserSeason> parser = PARSER;
                if (parser == null) {
                    synchronized (UserSeason.class) {
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

    public String getAttention() {
        return this.attention_;
    }

    public ByteString getAttentionBytes() {
        return ByteString.copyFromUtf8(this.attention_);
    }

    public static Builder newBuilder(UserSeason userSeason) {
        return DEFAULT_INSTANCE.createBuilder(userSeason);
    }

    public static UserSeason parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserSeason) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserSeason parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserSeason parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserSeason parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserSeason parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserSeason parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserSeason parseFrom(InputStream inputStream) throws IOException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserSeason parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserSeason parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserSeason parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserSeason) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
