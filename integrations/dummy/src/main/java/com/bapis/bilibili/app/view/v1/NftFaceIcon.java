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
public final class NftFaceIcon extends GeneratedMessageLite<NftFaceIcon, NftFaceIcon.Builder> implements MessageLiteOrBuilder {
    private static final NftFaceIcon DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile Parser<NftFaceIcon> PARSER = null;
    public static final int REGIONTYPE_FIELD_NUMBER = 1;
    public static final int SHOWSTATUS_FIELD_NUMBER = 3;
    private String icon_ = "";
    private int regionType_;
    private int showStatus_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.NftFaceIcon$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16763xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16763xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16763xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16763xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16763xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16763xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16763xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16763xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<NftFaceIcon, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67971 c67971) {
            this();
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((NftFaceIcon) this.instance).clearIcon();
            return this;
        }

        public Builder clearRegionType() {
            copyOnWrite();
            ((NftFaceIcon) this.instance).clearRegionType();
            return this;
        }

        public Builder clearShowStatus() {
            copyOnWrite();
            ((NftFaceIcon) this.instance).clearShowStatus();
            return this;
        }

        public String getIcon() {
            return ((NftFaceIcon) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((NftFaceIcon) this.instance).getIconBytes();
        }

        public int getRegionType() {
            return ((NftFaceIcon) this.instance).getRegionType();
        }

        public int getShowStatus() {
            return ((NftFaceIcon) this.instance).getShowStatus();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((NftFaceIcon) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((NftFaceIcon) this.instance).setIconBytes(byteString);
            return this;
        }

        public Builder setRegionType(int i) {
            copyOnWrite();
            ((NftFaceIcon) this.instance).setRegionType(i);
            return this;
        }

        public Builder setShowStatus(int i) {
            copyOnWrite();
            ((NftFaceIcon) this.instance).setShowStatus(i);
            return this;
        }

        private Builder() {
            super(NftFaceIcon.DEFAULT_INSTANCE);
        }
    }

    static {
        NftFaceIcon nftFaceIcon = new NftFaceIcon();
        DEFAULT_INSTANCE = nftFaceIcon;
        GeneratedMessageLite.registerDefaultInstance(NftFaceIcon.class, nftFaceIcon);
    }

    private NftFaceIcon() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionType() {
        this.regionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowStatus() {
        this.showStatus_ = 0;
    }

    public static NftFaceIcon getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NftFaceIcon parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NftFaceIcon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NftFaceIcon parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NftFaceIcon> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        str.getClass();
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.icon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionType(int i) {
        this.regionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowStatus(int i) {
        this.showStatus_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67971.f16763xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new NftFaceIcon();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0004", new Object[]{"regionType_", "icon_", "showStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NftFaceIcon> parser = PARSER;
                if (parser == null) {
                    synchronized (NftFaceIcon.class) {
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

    public int getRegionType() {
        return this.regionType_;
    }

    public int getShowStatus() {
        return this.showStatus_;
    }

    public static Builder newBuilder(NftFaceIcon nftFaceIcon) {
        return DEFAULT_INSTANCE.createBuilder(nftFaceIcon);
    }

    public static NftFaceIcon parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NftFaceIcon) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NftFaceIcon parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NftFaceIcon parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NftFaceIcon parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NftFaceIcon parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NftFaceIcon parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NftFaceIcon parseFrom(InputStream inputStream) throws IOException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NftFaceIcon parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NftFaceIcon parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NftFaceIcon parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NftFaceIcon) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
