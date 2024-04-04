package com.bapis.bilibili.app.viewunite.ugcanymodel;

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
/* loaded from: classes21.dex */
public final class ElecRankItem extends GeneratedMessageLite<ElecRankItem, ElecRankItem.b> implements com.bapis.bilibili.app.viewunite.ugcanymodel.b {
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
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<ElecRankItem, b> implements com.bapis.bilibili.app.viewunite.ugcanymodel.b {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearAvatar() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearAvatar();
            return this;
        }

        public b clearMessage() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearMessage();
            return this;
        }

        public b clearMid() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearMid();
            return this;
        }

        public b clearNickname() {
            copyOnWrite();
            ((ElecRankItem) this.instance).clearNickname();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
        public String getAvatar() {
            return ((ElecRankItem) this.instance).getAvatar();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
        public ByteString getAvatarBytes() {
            return ((ElecRankItem) this.instance).getAvatarBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
        public String getMessage() {
            return ((ElecRankItem) this.instance).getMessage();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
        public ByteString getMessageBytes() {
            return ((ElecRankItem) this.instance).getMessageBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
        public long getMid() {
            return ((ElecRankItem) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
        public String getNickname() {
            return ((ElecRankItem) this.instance).getNickname();
        }

        @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
        public ByteString getNicknameBytes() {
            return ((ElecRankItem) this.instance).getNicknameBytes();
        }

        public b setAvatar(String str) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setAvatar(str);
            return this;
        }

        public b setAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setAvatarBytes(byteString);
            return this;
        }

        public b setMessage(String str) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setMessage(str);
            return this;
        }

        public b setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setMessageBytes(byteString);
            return this;
        }

        public b setMid(long j2) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setMid(j2);
            return this;
        }

        public b setNickname(String str) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setNickname(str);
            return this;
        }

        public b setNicknameBytes(ByteString byteString) {
            copyOnWrite();
            ((ElecRankItem) this.instance).setNicknameBytes(byteString);
            return this;
        }

        private b() {
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

    public static b newBuilder() {
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
    public void setMid(long j2) {
        this.mid_ = j2;
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ElecRankItem();
            case 2:
                return new b(aVar);
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

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
    public String getAvatar() {
        return this.avatar_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.avatar_);
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
    public String getMessage() {
        return this.message_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
    public String getNickname() {
        return this.nickname_;
    }

    @Override // com.bapis.bilibili.app.viewunite.ugcanymodel.b
    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.nickname_);
    }

    public static b newBuilder(ElecRankItem elecRankItem) {
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
