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
public final class HalfScreen extends GeneratedMessageLite<HalfScreen, HalfScreen.Builder> implements MessageLiteOrBuilder {
    public static final int DAILY_MAX_FIELD_NUMBER = 1;
    private static final HalfScreen DEFAULT_INSTANCE;
    private static volatile Parser<HalfScreen> PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private long dailyMax_;
    private String url_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.HalfScreen$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16744xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16744xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16744xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16744xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16744xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16744xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16744xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16744xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HalfScreen, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67731 c67731) {
            this();
        }

        public Builder clearDailyMax() {
            copyOnWrite();
            ((HalfScreen) this.instance).clearDailyMax();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((HalfScreen) this.instance).clearUrl();
            return this;
        }

        public long getDailyMax() {
            return ((HalfScreen) this.instance).getDailyMax();
        }

        public String getUrl() {
            return ((HalfScreen) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((HalfScreen) this.instance).getUrlBytes();
        }

        public Builder setDailyMax(long j) {
            copyOnWrite();
            ((HalfScreen) this.instance).setDailyMax(j);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((HalfScreen) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((HalfScreen) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(HalfScreen.DEFAULT_INSTANCE);
        }
    }

    static {
        HalfScreen halfScreen = new HalfScreen();
        DEFAULT_INSTANCE = halfScreen;
        GeneratedMessageLite.registerDefaultInstance(HalfScreen.class, halfScreen);
    }

    private HalfScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDailyMax() {
        this.dailyMax_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static HalfScreen getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HalfScreen parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HalfScreen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HalfScreen parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HalfScreen> parser() {
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
        switch (C67731.f16744xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HalfScreen();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0208", new Object[]{"dailyMax_", "url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HalfScreen> parser = PARSER;
                if (parser == null) {
                    synchronized (HalfScreen.class) {
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

    public static Builder newBuilder(HalfScreen halfScreen) {
        return DEFAULT_INSTANCE.createBuilder(halfScreen);
    }

    public static HalfScreen parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HalfScreen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HalfScreen parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HalfScreen parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HalfScreen parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HalfScreen parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HalfScreen parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HalfScreen parseFrom(InputStream inputStream) throws IOException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HalfScreen parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HalfScreen parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HalfScreen parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HalfScreen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
