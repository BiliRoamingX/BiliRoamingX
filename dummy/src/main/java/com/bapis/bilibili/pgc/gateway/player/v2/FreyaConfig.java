package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class FreyaConfig extends GeneratedMessageLite<FreyaConfig, FreyaConfig.Builder> implements MessageLiteOrBuilder {
    private static final FreyaConfig DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 1;
    public static final int FULL_SCREEN_NUMBER_FIELD_NUMBER = 6;
    public static final int ISSUED_CNT_FIELD_NUMBER = 3;
    public static final int IS_ALWAYS_SHOW_FIELD_NUMBER = 4;
    private static volatile Parser<FreyaConfig> PARSER = null;
    public static final int SCREEN_NUMBER_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String desc_ = "";
    private int fullScreenNumber_;
    private boolean isAlwaysShow_;
    private int issuedCnt_;
    private int screenNumber_;
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.FreyaConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17570xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17570xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17570xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FreyaConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78481 c78481) {
            this();
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((FreyaConfig) this.instance).clearDesc();
            return this;
        }

        public Builder clearFullScreenNumber() {
            copyOnWrite();
            ((FreyaConfig) this.instance).clearFullScreenNumber();
            return this;
        }

        @Deprecated
        public Builder clearIsAlwaysShow() {
            copyOnWrite();
            ((FreyaConfig) this.instance).clearIsAlwaysShow();
            return this;
        }

        @Deprecated
        public Builder clearIssuedCnt() {
            copyOnWrite();
            ((FreyaConfig) this.instance).clearIssuedCnt();
            return this;
        }

        public Builder clearScreenNumber() {
            copyOnWrite();
            ((FreyaConfig) this.instance).clearScreenNumber();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FreyaConfig) this.instance).clearType();
            return this;
        }

        public String getDesc() {
            return ((FreyaConfig) this.instance).getDesc();
        }

        public ByteString getDescBytes() {
            return ((FreyaConfig) this.instance).getDescBytes();
        }

        public int getFullScreenNumber() {
            return ((FreyaConfig) this.instance).getFullScreenNumber();
        }

        @Deprecated
        public boolean getIsAlwaysShow() {
            return ((FreyaConfig) this.instance).getIsAlwaysShow();
        }

        @Deprecated
        public int getIssuedCnt() {
            return ((FreyaConfig) this.instance).getIssuedCnt();
        }

        public int getScreenNumber() {
            return ((FreyaConfig) this.instance).getScreenNumber();
        }

        public int getType() {
            return ((FreyaConfig) this.instance).getType();
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((FreyaConfig) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((FreyaConfig) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setFullScreenNumber(int i) {
            copyOnWrite();
            ((FreyaConfig) this.instance).setFullScreenNumber(i);
            return this;
        }

        @Deprecated
        public Builder setIsAlwaysShow(boolean z) {
            copyOnWrite();
            ((FreyaConfig) this.instance).setIsAlwaysShow(z);
            return this;
        }

        @Deprecated
        public Builder setIssuedCnt(int i) {
            copyOnWrite();
            ((FreyaConfig) this.instance).setIssuedCnt(i);
            return this;
        }

        public Builder setScreenNumber(int i) {
            copyOnWrite();
            ((FreyaConfig) this.instance).setScreenNumber(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FreyaConfig) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FreyaConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        FreyaConfig freyaConfig = new FreyaConfig();
        DEFAULT_INSTANCE = freyaConfig;
        GeneratedMessageLite.registerDefaultInstance(FreyaConfig.class, freyaConfig);
    }

    private FreyaConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullScreenNumber() {
        this.fullScreenNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAlwaysShow() {
        this.isAlwaysShow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIssuedCnt() {
        this.issuedCnt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenNumber() {
        this.screenNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FreyaConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FreyaConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FreyaConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FreyaConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FreyaConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullScreenNumber(int i) {
        this.fullScreenNumber_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAlwaysShow(boolean z) {
        this.isAlwaysShow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIssuedCnt(int i) {
        this.issuedCnt_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenNumber(int i) {
        this.screenNumber_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78481.f17570xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FreyaConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0004\u0004\u0007\u0005\u0004\u0006\u0004", new Object[]{"desc_", "type_", "issuedCnt_", "isAlwaysShow_", "screenNumber_", "fullScreenNumber_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FreyaConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (FreyaConfig.class) {
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

    public String getDesc() {
        return this.desc_;
    }

    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    public int getFullScreenNumber() {
        return this.fullScreenNumber_;
    }

    @Deprecated
    public boolean getIsAlwaysShow() {
        return this.isAlwaysShow_;
    }

    @Deprecated
    public int getIssuedCnt() {
        return this.issuedCnt_;
    }

    public int getScreenNumber() {
        return this.screenNumber_;
    }

    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FreyaConfig freyaConfig) {
        return DEFAULT_INSTANCE.createBuilder(freyaConfig);
    }

    public static FreyaConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FreyaConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FreyaConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FreyaConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FreyaConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FreyaConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FreyaConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FreyaConfig parseFrom(InputStream inputStream) throws IOException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FreyaConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FreyaConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FreyaConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FreyaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
