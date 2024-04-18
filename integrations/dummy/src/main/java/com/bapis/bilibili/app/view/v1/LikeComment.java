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
public final class LikeComment extends GeneratedMessageLite<LikeComment, LikeComment.Builder> implements MessageLiteOrBuilder {
    private static final LikeComment DEFAULT_INSTANCE;
    private static volatile Parser<LikeComment> PARSER = null;
    public static final int REPLY_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String reply_ = "";
    private String title_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.LikeComment$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67851 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16752xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16752xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16752xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16752xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16752xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16752xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16752xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16752xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LikeComment, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67851 c67851) {
            this();
        }

        public Builder clearReply() {
            copyOnWrite();
            ((LikeComment) this.instance).clearReply();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((LikeComment) this.instance).clearTitle();
            return this;
        }

        public String getReply() {
            return ((LikeComment) this.instance).getReply();
        }

        public ByteString getReplyBytes() {
            return ((LikeComment) this.instance).getReplyBytes();
        }

        public String getTitle() {
            return ((LikeComment) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((LikeComment) this.instance).getTitleBytes();
        }

        public Builder setReply(String str) {
            copyOnWrite();
            ((LikeComment) this.instance).setReply(str);
            return this;
        }

        public Builder setReplyBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeComment) this.instance).setReplyBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((LikeComment) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((LikeComment) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(LikeComment.DEFAULT_INSTANCE);
        }
    }

    static {
        LikeComment likeComment = new LikeComment();
        DEFAULT_INSTANCE = likeComment;
        GeneratedMessageLite.registerDefaultInstance(LikeComment.class, likeComment);
    }

    private LikeComment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReply() {
        this.reply_ = getDefaultInstance().getReply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static LikeComment getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LikeComment parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LikeComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeComment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LikeComment> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReply(String str) {
        str.getClass();
        this.reply_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reply_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67851.f16752xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LikeComment();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"reply_", "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LikeComment> parser = PARSER;
                if (parser == null) {
                    synchronized (LikeComment.class) {
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

    public String getReply() {
        return this.reply_;
    }

    public ByteString getReplyBytes() {
        return ByteString.copyFromUtf8(this.reply_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(LikeComment likeComment) {
        return DEFAULT_INSTANCE.createBuilder(likeComment);
    }

    public static LikeComment parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeComment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeComment parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LikeComment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LikeComment parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LikeComment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LikeComment parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LikeComment parseFrom(InputStream inputStream) throws IOException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LikeComment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LikeComment parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LikeComment parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LikeComment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
