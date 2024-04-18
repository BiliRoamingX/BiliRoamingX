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
public final class UpViewMaterial extends GeneratedMessageLite<UpViewMaterial, UpViewMaterial.Builder> implements MessageLiteOrBuilder {
    public static final int DATA_CENTER_INFO_FIELD_NUMBER = 2;
    private static final UpViewMaterial DEFAULT_INSTANCE;
    public static final int LIKE_INFO_FIELD_NUMBER = 1;
    private static volatile Parser<UpViewMaterial> PARSER = null;
    public static final int TAB_MODULE_FIELD_NUMBER = 3;
    private String dataCenterInfo_ = "";
    private InteractArea likeInfo_;
    private TabModule tabModule_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UpViewMaterial$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68841 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16841xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16841xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16841xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16841xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16841xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16841xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16841xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16841xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UpViewMaterial, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68841 c68841) {
            this();
        }

        public Builder clearDataCenterInfo() {
            copyOnWrite();
            ((UpViewMaterial) this.instance).clearDataCenterInfo();
            return this;
        }

        public Builder clearLikeInfo() {
            copyOnWrite();
            ((UpViewMaterial) this.instance).clearLikeInfo();
            return this;
        }

        public Builder clearTabModule() {
            copyOnWrite();
            ((UpViewMaterial) this.instance).clearTabModule();
            return this;
        }

        public String getDataCenterInfo() {
            return ((UpViewMaterial) this.instance).getDataCenterInfo();
        }

        public ByteString getDataCenterInfoBytes() {
            return ((UpViewMaterial) this.instance).getDataCenterInfoBytes();
        }

        public InteractArea getLikeInfo() {
            return ((UpViewMaterial) this.instance).getLikeInfo();
        }

        public TabModule getTabModule() {
            return ((UpViewMaterial) this.instance).getTabModule();
        }

        public boolean hasLikeInfo() {
            return ((UpViewMaterial) this.instance).hasLikeInfo();
        }

        public boolean hasTabModule() {
            return ((UpViewMaterial) this.instance).hasTabModule();
        }

        public Builder mergeLikeInfo(InteractArea interactArea) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).mergeLikeInfo(interactArea);
            return this;
        }

        public Builder mergeTabModule(TabModule tabModule) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).mergeTabModule(tabModule);
            return this;
        }

        public Builder setDataCenterInfo(String str) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).setDataCenterInfo(str);
            return this;
        }

        public Builder setDataCenterInfoBytes(ByteString byteString) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).setDataCenterInfoBytes(byteString);
            return this;
        }

        public Builder setLikeInfo(InteractArea interactArea) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).setLikeInfo(interactArea);
            return this;
        }

        public Builder setTabModule(TabModule tabModule) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).setTabModule(tabModule);
            return this;
        }

        private Builder() {
            super(UpViewMaterial.DEFAULT_INSTANCE);
        }

        public Builder setLikeInfo(InteractArea.Builder builder) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).setLikeInfo(builder.build());
            return this;
        }

        public Builder setTabModule(TabModule.Builder builder) {
            copyOnWrite();
            ((UpViewMaterial) this.instance).setTabModule(builder.build());
            return this;
        }
    }

    static {
        UpViewMaterial upViewMaterial = new UpViewMaterial();
        DEFAULT_INSTANCE = upViewMaterial;
        GeneratedMessageLite.registerDefaultInstance(UpViewMaterial.class, upViewMaterial);
    }

    private UpViewMaterial() {
    }

    public void clearDataCenterInfo() {
        this.dataCenterInfo_ = getDefaultInstance().getDataCenterInfo();
    }

    public void clearLikeInfo() {
        this.likeInfo_ = null;
    }

    public void clearTabModule() {
        this.tabModule_ = null;
    }

    public static UpViewMaterial getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeLikeInfo(InteractArea interactArea) {
    }

    public void mergeTabModule(TabModule tabModule) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UpViewMaterial parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpViewMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpViewMaterial parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UpViewMaterial> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDataCenterInfo(String str) {
        str.getClass();
        this.dataCenterInfo_ = str;
    }

    public void setDataCenterInfoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dataCenterInfo_ = byteString.toStringUtf8();
    }

    public void setLikeInfo(InteractArea interactArea) {
        interactArea.getClass();
        this.likeInfo_ = interactArea;
    }

    public void setTabModule(TabModule tabModule) {
        tabModule.getClass();
        this.tabModule_ = tabModule;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68841.f16841xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UpViewMaterial();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\t", new Object[]{"likeInfo_", "dataCenterInfo_", "tabModule_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UpViewMaterial> parser = PARSER;
                if (parser == null) {
                    synchronized (UpViewMaterial.class) {
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

    public String getDataCenterInfo() {
        return this.dataCenterInfo_;
    }

    public ByteString getDataCenterInfoBytes() {
        return ByteString.copyFromUtf8(this.dataCenterInfo_);
    }

    public InteractArea getLikeInfo() {
        InteractArea interactArea = this.likeInfo_;
        return interactArea == null ? InteractArea.getDefaultInstance() : interactArea;
    }

    public TabModule getTabModule() {
        TabModule tabModule = this.tabModule_;
        return tabModule == null ? TabModule.getDefaultInstance() : tabModule;
    }

    public boolean hasLikeInfo() {
        return this.likeInfo_ != null;
    }

    public boolean hasTabModule() {
        return this.tabModule_ != null;
    }

    public static Builder newBuilder(UpViewMaterial upViewMaterial) {
        return DEFAULT_INSTANCE.createBuilder(upViewMaterial);
    }

    public static UpViewMaterial parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpViewMaterial) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpViewMaterial parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UpViewMaterial parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UpViewMaterial parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UpViewMaterial parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpViewMaterial parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UpViewMaterial parseFrom(InputStream inputStream) throws IOException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpViewMaterial parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpViewMaterial parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UpViewMaterial parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpViewMaterial) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
