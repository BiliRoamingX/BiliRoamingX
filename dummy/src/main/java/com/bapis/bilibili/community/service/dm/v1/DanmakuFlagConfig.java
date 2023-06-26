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
public final class DanmakuFlagConfig extends GeneratedMessageLite<DanmakuFlagConfig, DanmakuFlagConfig.Builder> implements MessageLiteOrBuilder {
    private static final DanmakuFlagConfig DEFAULT_INSTANCE;
    private static volatile Parser<DanmakuFlagConfig> PARSER = null;
    public static final int REC_FLAG_FIELD_NUMBER = 1;
    public static final int REC_SWITCH_FIELD_NUMBER = 3;
    public static final int REC_TEXT_FIELD_NUMBER = 2;
    private int recFlag_;
    private int recSwitch_;
    private String recText_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DanmakuFlagConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17046xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17046xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17046xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DanmakuFlagConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72031 c72031) {
            this();
        }

        public Builder clearRecFlag() {
            copyOnWrite();
            ((DanmakuFlagConfig) this.instance).clearRecFlag();
            return this;
        }

        public Builder clearRecSwitch() {
            copyOnWrite();
            ((DanmakuFlagConfig) this.instance).clearRecSwitch();
            return this;
        }

        public Builder clearRecText() {
            copyOnWrite();
            ((DanmakuFlagConfig) this.instance).clearRecText();
            return this;
        }

        public int getRecFlag() {
            return ((DanmakuFlagConfig) this.instance).getRecFlag();
        }

        public int getRecSwitch() {
            return ((DanmakuFlagConfig) this.instance).getRecSwitch();
        }

        public String getRecText() {
            return ((DanmakuFlagConfig) this.instance).getRecText();
        }

        public ByteString getRecTextBytes() {
            return ((DanmakuFlagConfig) this.instance).getRecTextBytes();
        }

        public Builder setRecFlag(int i) {
            copyOnWrite();
            ((DanmakuFlagConfig) this.instance).setRecFlag(i);
            return this;
        }

        public Builder setRecSwitch(int i) {
            copyOnWrite();
            ((DanmakuFlagConfig) this.instance).setRecSwitch(i);
            return this;
        }

        public Builder setRecText(String str) {
            copyOnWrite();
            ((DanmakuFlagConfig) this.instance).setRecText(str);
            return this;
        }

        public Builder setRecTextBytes(ByteString byteString) {
            copyOnWrite();
            ((DanmakuFlagConfig) this.instance).setRecTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(DanmakuFlagConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        DanmakuFlagConfig danmakuFlagConfig = new DanmakuFlagConfig();
        DEFAULT_INSTANCE = danmakuFlagConfig;
        GeneratedMessageLite.registerDefaultInstance(DanmakuFlagConfig.class, danmakuFlagConfig);
    }

    private DanmakuFlagConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecFlag() {
        this.recFlag_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecSwitch() {
        this.recSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecText() {
        this.recText_ = getDefaultInstance().getRecText();
    }

    public static DanmakuFlagConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DanmakuFlagConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuFlagConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DanmakuFlagConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecFlag(int i) {
        this.recFlag_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecSwitch(int i) {
        this.recSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecText(String str) {
        str.getClass();
        this.recText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.recText_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72031.f17046xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DanmakuFlagConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0004", new Object[]{"recFlag_", "recText_", "recSwitch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DanmakuFlagConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (DanmakuFlagConfig.class) {
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

    public int getRecFlag() {
        return this.recFlag_;
    }

    public int getRecSwitch() {
        return this.recSwitch_;
    }

    public String getRecText() {
        return this.recText_;
    }

    public ByteString getRecTextBytes() {
        return ByteString.copyFromUtf8(this.recText_);
    }

    public static Builder newBuilder(DanmakuFlagConfig danmakuFlagConfig) {
        return DEFAULT_INSTANCE.createBuilder(danmakuFlagConfig);
    }

    public static DanmakuFlagConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuFlagConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DanmakuFlagConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DanmakuFlagConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DanmakuFlagConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DanmakuFlagConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DanmakuFlagConfig parseFrom(InputStream inputStream) throws IOException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DanmakuFlagConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DanmakuFlagConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DanmakuFlagConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DanmakuFlagConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
