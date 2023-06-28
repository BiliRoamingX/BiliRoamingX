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
public final class ElecRankItem extends GeneratedMessageLite<ElecRankItem, ElecRankItem.Builder> implements ElecRankItemOrBuilder {
    public static final int AVATAR_FIELD_NUMBER = 1;
    private static final ElecRankItem DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    public static final int MID_FIELD_NUMBER = 4;
    public static final int NICKNAME_FIELD_NUMBER = 2;
    private static volatile Parser<ElecRankItem> PARSER;
    private long mid_;
    private String avatar_ = "";
    private String nickname_ = "";
    private String message_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ElecRankItem$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67601 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16732xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16732xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16732xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16732xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16732xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16732xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16732xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16732xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ElecRankItem, Builder> implements ElecRankItemOrBuilder {
        /* synthetic */ Builder(C67601 c67601) {
            this();
        }

        public Builder clearAvatar() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearAvatar();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearMessage();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearMid();
            return this;
        }

        public Builder clearNickname() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearNickname();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
        public String getAvatar() {
            return ((ElecRankItem) this.instance).getAvatar();
        }

        @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
        public ByteString getAvatarBytes() {
            return ((ElecRankItem) this.instance).getAvatarBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
        public String getMessage() {
            return ((ElecRankItem) this.instance).getMessage();
        }

        @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
        public ByteString getMessageBytes() {
            return ((ElecRankItem) this.instance).getMessageBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
        public long getMid() {
            return ((ElecRankItem) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
        public String getNickname() {
            return ((ElecRankItem) this.instance).getNickname();
        }

        @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
        public ByteString getNicknameBytes() {
            return ((ElecRankItem) this.instance).getNicknameBytes();
        }

        public Builder setAvatar(String str) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setAvatar(str);
            return this;
        }

        public Builder setAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setAvatarBytes(byteString);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setMessageBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setMid(j);
            return this;
        }

        public Builder setNickname(String str) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setNickname(str);
            return this;
        }

        public Builder setNicknameBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setNicknameBytes(byteString);
            return this;
        }

        private Builder() {
            super(ElecRankItem.DEFAULT_INSTANCE);
        }
    }

    static {
        ElecRankItem elecRankItem = new ElecRankItem();
        DEFAULT_INSTANCE = elecRankItem;
        GeneratedMessageLite.registerDefaultInstance(ElecRankItem.class, elecRankItem);
    }

    private ElecRankItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = getDefaultInstance().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNickname() {
        this.nickname_ = getDefaultInstance().getNickname();
    }

    public static ElecRankItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ElecRankItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ElecRankItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ElecRankItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ElecRankItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        str.getClass();
        this.avatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.avatar_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNickname(String str) {
        str.getClass();
        this.nickname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNicknameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nickname_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67601.f16732xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ElecRankItem();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002", new Object[]{"avatar_", "nickname_", "message_", "mid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ElecRankItem> parser = PARSER;
                if (parser == null) {
                    synchronized (ElecRankItem.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
    public String getAvatar() {
        return this.avatar_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.avatar_);
    }

    @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
    public String getNickname() {
        return this.nickname_;
    }

    @Override // com.bapis.bilibili.app.view.v1.ElecRankItemOrBuilder
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.nickname_);
    }

    public static Builder newBuilder(ElecRankItem elecRankItem) {
        return DEFAULT_INSTANCE.createBuilder(elecRankItem);
    }

    public static ElecRankItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ElecRankItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ElecRankItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ElecRankItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ElecRankItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ElecRankItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ElecRankItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ElecRankItem parseFrom(InputStream inputStream) throws IOException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ElecRankItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ElecRankItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ElecRankItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ElecRankItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
