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
public final class TIcon extends GeneratedMessageLite<TIcon, TIcon.Builder> implements MessageLiteOrBuilder {
    private static final TIcon DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    private static volatile Parser<TIcon> PARSER;
    private String icon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.TIcon$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68721 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16831xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16831xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16831xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16831xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16831xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16831xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16831xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16831xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<TIcon, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68721 c68721) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((TIcon) this.instance).clearIcon();
            return this;
        }

        public String getIcon() {
            return ((TIcon) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((TIcon) this.instance).getIconBytes();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((TIcon) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((TIcon) this.instance).setIconBytes(byteString);
            return this;
        }

        private Builder() {
            super(TIcon.DEFAULT_INSTANCE);
        }
    }

    static {
        TIcon tIcon = new TIcon();
        DEFAULT_INSTANCE = tIcon;
        GeneratedMessageLite.registerDefaultInstance(TIcon.class, tIcon);
    }

    private TIcon() {
    }

    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    public static TIcon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TIcon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TIcon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TIcon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TIcon> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68721.f16831xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new TIcon();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TIcon> parser = PARSER;
                if (parser == null) {
                    synchronized (TIcon.class) {
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

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public static Builder newBuilder(TIcon tIcon) {
        return DEFAULT_INSTANCE.createBuilder(tIcon);
    }

    public static TIcon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TIcon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TIcon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TIcon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TIcon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TIcon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TIcon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TIcon parseFrom(InputStream inputStream) throws IOException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TIcon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TIcon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TIcon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
