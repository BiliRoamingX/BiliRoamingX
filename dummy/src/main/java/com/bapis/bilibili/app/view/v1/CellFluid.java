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
public final class CellFluid extends GeneratedMessageLite<CellFluid, CellFluid.Builder> implements MessageLiteOrBuilder {
    private static final CellFluid DEFAULT_INSTANCE;
    private static volatile Parser<CellFluid> PARSER = null;
    public static final int TOP_BASE_COLOR_FIELD_NUMBER = 1;
    public static final int TOP_SPLIT_COLOR_FIELD_NUMBER = 2;
    public static final int TOP_TEXT_COLOR_FIELD_NUMBER = 3;
    private String topBaseColor_ = "";
    private String topSplitColor_ = "";
    private String topTextColor_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CellFluid$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67321 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16706xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16706xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16706xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16706xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16706xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16706xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16706xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16706xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CellFluid, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67321 c67321) {
            this();
        }

        public Builder clearTopBaseColor() {
            copyOnWrite();
            ((CellFluid) this.instance).clearTopBaseColor();
            return this;
        }

        public Builder clearTopSplitColor() {
            copyOnWrite();
            ((CellFluid) this.instance).clearTopSplitColor();
            return this;
        }

        public Builder clearTopTextColor() {
            copyOnWrite();
            ((CellFluid) this.instance).clearTopTextColor();
            return this;
        }

        public String getTopBaseColor() {
            return ((CellFluid) this.instance).getTopBaseColor();
        }

        public ByteString getTopBaseColorBytes() {
            return ((CellFluid) this.instance).getTopBaseColorBytes();
        }

        public String getTopSplitColor() {
            return ((CellFluid) this.instance).getTopSplitColor();
        }

        public ByteString getTopSplitColorBytes() {
            return ((CellFluid) this.instance).getTopSplitColorBytes();
        }

        public String getTopTextColor() {
            return ((CellFluid) this.instance).getTopTextColor();
        }

        public ByteString getTopTextColorBytes() {
            return ((CellFluid) this.instance).getTopTextColorBytes();
        }

        public Builder setTopBaseColor(String str) {
            copyOnWrite();
            ((CellFluid) this.instance).setTopBaseColor(str);
            return this;
        }

        public Builder setTopBaseColorBytes(ByteString byteString) {
            copyOnWrite();
            ((CellFluid) this.instance).setTopBaseColorBytes(byteString);
            return this;
        }

        public Builder setTopSplitColor(String str) {
            copyOnWrite();
            ((CellFluid) this.instance).setTopSplitColor(str);
            return this;
        }

        public Builder setTopSplitColorBytes(ByteString byteString) {
            copyOnWrite();
            ((CellFluid) this.instance).setTopSplitColorBytes(byteString);
            return this;
        }

        public Builder setTopTextColor(String str) {
            copyOnWrite();
            ((CellFluid) this.instance).setTopTextColor(str);
            return this;
        }

        public Builder setTopTextColorBytes(ByteString byteString) {
            copyOnWrite();
            ((CellFluid) this.instance).setTopTextColorBytes(byteString);
            return this;
        }

        private Builder() {
            super(CellFluid.DEFAULT_INSTANCE);
        }
    }

    static {
        CellFluid cellFluid = new CellFluid();
        DEFAULT_INSTANCE = cellFluid;
        GeneratedMessageLite.registerDefaultInstance(CellFluid.class, cellFluid);
    }

    private CellFluid() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopBaseColor() {
        this.topBaseColor_ = getDefaultInstance().getTopBaseColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopSplitColor() {
        this.topSplitColor_ = getDefaultInstance().getTopSplitColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopTextColor() {
        this.topTextColor_ = getDefaultInstance().getTopTextColor();
    }

    public static CellFluid getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CellFluid parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CellFluid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CellFluid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CellFluid> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBaseColor(String str) {
        str.getClass();
        this.topBaseColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBaseColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topBaseColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopSplitColor(String str) {
        str.getClass();
        this.topSplitColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopSplitColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topSplitColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopTextColor(String str) {
        str.getClass();
        this.topTextColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopTextColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.topTextColor_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67321.f16706xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CellFluid();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"topBaseColor_", "topSplitColor_", "topTextColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CellFluid> parser = PARSER;
                if (parser == null) {
                    synchronized (CellFluid.class) {
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

    public String getTopBaseColor() {
        return this.topBaseColor_;
    }

    public ByteString getTopBaseColorBytes() {
        return ByteString.copyFromUtf8(this.topBaseColor_);
    }

    public String getTopSplitColor() {
        return this.topSplitColor_;
    }

    public ByteString getTopSplitColorBytes() {
        return ByteString.copyFromUtf8(this.topSplitColor_);
    }

    public String getTopTextColor() {
        return this.topTextColor_;
    }

    public ByteString getTopTextColorBytes() {
        return ByteString.copyFromUtf8(this.topTextColor_);
    }

    public static Builder newBuilder(CellFluid cellFluid) {
        return DEFAULT_INSTANCE.createBuilder(cellFluid);
    }

    public static CellFluid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CellFluid) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CellFluid parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CellFluid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CellFluid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CellFluid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CellFluid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CellFluid parseFrom(InputStream inputStream) throws IOException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CellFluid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CellFluid parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CellFluid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CellFluid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
