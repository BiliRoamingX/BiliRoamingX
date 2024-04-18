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
public final class PlayerAutomate extends GeneratedMessageLite<PlayerAutomate, PlayerAutomate.Builder> implements MessageLiteOrBuilder {
    public static final int DAILY_MAX_FIELD_NUMBER = 1;
    private static final PlayerAutomate DEFAULT_INSTANCE;
    private static volatile Parser<PlayerAutomate> PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private long dailyMax_;
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PlayerAutomate$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68161 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16779xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16779xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16779xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16779xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16779xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16779xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16779xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16779xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayerAutomate, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68161 c68161) {
            this();
        }

        public Builder clearDailyMax() {
            copyOnWrite();
            ((PlayerAutomate) this.instance).clearDailyMax();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((PlayerAutomate) this.instance).clearUrl();
            return this;
        }

        public long getDailyMax() {
            return ((PlayerAutomate) this.instance).getDailyMax();
        }

        public String getUrl() {
            return ((PlayerAutomate) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((PlayerAutomate) this.instance).getUrlBytes();
        }

        public Builder setDailyMax(long j) {
            copyOnWrite();
            ((PlayerAutomate) this.instance).setDailyMax(j);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((PlayerAutomate) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayerAutomate) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(PlayerAutomate.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayerAutomate playerAutomate = new PlayerAutomate();
        DEFAULT_INSTANCE = playerAutomate;
        GeneratedMessageLite.registerDefaultInstance(PlayerAutomate.class, playerAutomate);
    }

    private PlayerAutomate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDailyMax() {
        this.dailyMax_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static PlayerAutomate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayerAutomate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayerAutomate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerAutomate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayerAutomate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDailyMax(long j) {
        this.dailyMax_ = j;
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
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68161.f16779xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayerAutomate();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0208", new Object[]{"dailyMax_", "url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayerAutomate> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayerAutomate.class) {
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

    public long getDailyMax() {
        return this.dailyMax_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(PlayerAutomate playerAutomate) {
        return DEFAULT_INSTANCE.createBuilder(playerAutomate);
    }

    public static PlayerAutomate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerAutomate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerAutomate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayerAutomate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayerAutomate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayerAutomate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayerAutomate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayerAutomate parseFrom(InputStream inputStream) throws IOException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayerAutomate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayerAutomate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayerAutomate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayerAutomate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
