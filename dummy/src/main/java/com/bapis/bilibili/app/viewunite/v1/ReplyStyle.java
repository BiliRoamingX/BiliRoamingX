package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes17.dex */
public final class ReplyStyle extends GeneratedMessageLite<ReplyStyle, ReplyStyle.Builder> implements MessageLiteOrBuilder {
    public static final int BADGE_TEXT_FIELD_NUMBER = 2;
    public static final int BADGE_TYPE_FIELD_NUMBER = 3;
    public static final int BADGE_URL_FIELD_NUMBER = 1;
    private static final ReplyStyle DEFAULT_INSTANCE;
    private static volatile Parser<ReplyStyle> PARSER;
    private long badgeType_;
    private String badgeUrl_ = "";
    private String badgeText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ReplyStyle$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71541 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17122xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17122xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17122xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17122xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17122xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17122xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17122xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17122xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ReplyStyle, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71541 c71541) {
            this();
        }

        public Builder clearBadgeText() {
            copyOnWrite();
            ((ReplyStyle) this.instance).clearBadgeText();
            return this;
        }

        public Builder clearBadgeType() {
            copyOnWrite();
            ((ReplyStyle) this.instance).clearBadgeType();
            return this;
        }

        public Builder clearBadgeUrl() {
            copyOnWrite();
            ((ReplyStyle) this.instance).clearBadgeUrl();
            return this;
        }

        public String getBadgeText() {
            return ((ReplyStyle) this.instance).getBadgeText();
        }

        public ByteString getBadgeTextBytes() {
            return ((ReplyStyle) this.instance).getBadgeTextBytes();
        }

        public long getBadgeType() {
            return ((ReplyStyle) this.instance).getBadgeType();
        }

        public String getBadgeUrl() {
            return ((ReplyStyle) this.instance).getBadgeUrl();
        }

        public ByteString getBadgeUrlBytes() {
            return ((ReplyStyle) this.instance).getBadgeUrlBytes();
        }

        public Builder setBadgeText(String str) {
            copyOnWrite();
            ((ReplyStyle) this.instance).setBadgeText(str);
            return this;
        }

        public Builder setBadgeTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyStyle) this.instance).setBadgeTextBytes(byteString);
            return this;
        }

        public Builder setBadgeType(long j) {
            copyOnWrite();
            ((ReplyStyle) this.instance).setBadgeType(j);
            return this;
        }

        public Builder setBadgeUrl(String str) {
            copyOnWrite();
            ((ReplyStyle) this.instance).setBadgeUrl(str);
            return this;
        }

        public Builder setBadgeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ReplyStyle) this.instance).setBadgeUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(ReplyStyle.DEFAULT_INSTANCE);
        }
    }

    static {
        ReplyStyle replyStyle = new ReplyStyle();
        DEFAULT_INSTANCE = replyStyle;
        GeneratedMessageLite.registerDefaultInstance(ReplyStyle.class, replyStyle);
    }

    private ReplyStyle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeText() {
        this.badgeText_ = getDefaultInstance().getBadgeText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeType() {
        this.badgeType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadgeUrl() {
        this.badgeUrl_ = getDefaultInstance().getBadgeUrl();
    }

    public static ReplyStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ReplyStyle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReplyStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyStyle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ReplyStyle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeText(String str) {
        str.getClass();
        this.badgeText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badgeText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeType(long j) {
        this.badgeType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeUrl(String str) {
        str.getClass();
        this.badgeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badgeUrl_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71541.f17122xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ReplyStyle();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002", new Object[]{"badgeUrl_", "badgeText_", "badgeType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReplyStyle> parser = PARSER;
                if (parser == null) {
                    synchronized (ReplyStyle.class) {
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

    public String getBadgeText() {
        return this.badgeText_;
    }

    public ByteString getBadgeTextBytes() {
        return ByteString.copyFromUtf8(this.badgeText_);
    }

    public long getBadgeType() {
        return this.badgeType_;
    }

    public String getBadgeUrl() {
        return this.badgeUrl_;
    }

    public ByteString getBadgeUrlBytes() {
        return ByteString.copyFromUtf8(this.badgeUrl_);
    }

    public static Builder newBuilder(ReplyStyle replyStyle) {
        return DEFAULT_INSTANCE.createBuilder(replyStyle);
    }

    public static ReplyStyle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyStyle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyStyle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ReplyStyle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ReplyStyle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ReplyStyle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReplyStyle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ReplyStyle parseFrom(InputStream inputStream) throws IOException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReplyStyle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ReplyStyle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ReplyStyle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ReplyStyle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * clearBadgeType
     */
    static void access$800(ReplyStyle replyStyle) {
    }

    /**
     * clearBadgeText
     */
    static void access$500(ReplyStyle replyStyle) {
    }
}
