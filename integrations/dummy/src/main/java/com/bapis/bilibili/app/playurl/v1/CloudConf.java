package com.bapis.bilibili.app.playurl.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class CloudConf extends GeneratedMessageLite<CloudConf, CloudConf.Builder> implements CloudConfOrBuilder {
    public static final int CONF_TYPE_FIELD_NUMBER = 2;
    public static final int CONF_VALUE_FIELD_NUMBER = 4;
    private static final CloudConf DEFAULT_INSTANCE;
    public static final int FIELD_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<CloudConf> PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 1;
    private int confType_;
    private ConfValue confValue_;
    private FieldValue fieldValue_;
    private boolean show_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.playurl.v1.CloudConf$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C64781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16515xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16515xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16515xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16515xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16515xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16515xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16515xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16515xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CloudConf, Builder> implements CloudConfOrBuilder {
        /* synthetic */ Builder(C64781 c64781) {
            this();
        }

        public Builder clearConfType() {
            copyOnWrite();
            ((CloudConf) this.instance).clearConfType();
            return this;
        }

        public Builder clearConfValue() {
            copyOnWrite();
            ((CloudConf) this.instance).clearConfValue();
            return this;
        }

        public Builder clearFieldValue() {
            copyOnWrite();
            ((CloudConf) this.instance).clearFieldValue();
            return this;
        }

        public Builder clearShow() {
            copyOnWrite();
            ((CloudConf) this.instance).clearShow();
            return this;
        }

        @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
        public ConfType getConfType() {
            return ((CloudConf) this.instance).getConfType();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
        public int getConfTypeValue() {
            return ((CloudConf) this.instance).getConfTypeValue();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
        public ConfValue getConfValue() {
            return ((CloudConf) this.instance).getConfValue();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
        public FieldValue getFieldValue() {
            return ((CloudConf) this.instance).getFieldValue();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
        public boolean getShow() {
            return ((CloudConf) this.instance).getShow();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
        public boolean hasConfValue() {
            return ((CloudConf) this.instance).hasConfValue();
        }

        @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
        public boolean hasFieldValue() {
            return ((CloudConf) this.instance).hasFieldValue();
        }

        public Builder mergeConfValue(ConfValue confValue) {
            copyOnWrite();
            ((CloudConf) this.instance).mergeConfValue(confValue);
            return this;
        }

        public Builder mergeFieldValue(FieldValue fieldValue) {
            copyOnWrite();
            ((CloudConf) this.instance).mergeFieldValue(fieldValue);
            return this;
        }

        public Builder setConfType(ConfType confType) {
            copyOnWrite();
            ((CloudConf) this.instance).setConfType(confType);
            return this;
        }

        public Builder setConfTypeValue(int i) {
            copyOnWrite();
            ((CloudConf) this.instance).setConfTypeValue(i);
            return this;
        }

        public Builder setConfValue(ConfValue confValue) {
            copyOnWrite();
            ((CloudConf) this.instance).setConfValue(confValue);
            return this;
        }

        public Builder setFieldValue(FieldValue fieldValue) {
            copyOnWrite();
            ((CloudConf) this.instance).setFieldValue(fieldValue);
            return this;
        }

        public Builder setShow(boolean z) {
            copyOnWrite();
            ((CloudConf) this.instance).setShow(z);
            return this;
        }

        private Builder() {
            super(CloudConf.DEFAULT_INSTANCE);
        }

        public Builder setConfValue(ConfValue.Builder builder) {
            copyOnWrite();
            ((CloudConf) this.instance).setConfValue(builder.build());
            return this;
        }

        public Builder setFieldValue(FieldValue.Builder builder) {
            copyOnWrite();
            ((CloudConf) this.instance).setFieldValue(builder.build());
            return this;
        }
    }

    static {
        CloudConf cloudConf = new CloudConf();
        DEFAULT_INSTANCE = cloudConf;
        GeneratedMessageLite.registerDefaultInstance(CloudConf.class, cloudConf);
    }

    private CloudConf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfType() {
        this.confType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfValue() {
        this.confValue_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldValue() {
        this.fieldValue_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShow() {
        this.show_ = false;
    }

    public static CloudConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfValue(ConfValue confValue) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFieldValue(FieldValue fieldValue) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CloudConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CloudConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CloudConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfType(ConfType confType) {
        this.confType_ = confType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfTypeValue(int i) {
        this.confType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfValue(ConfValue confValue) {
        confValue.getClass();
        this.confValue_ = confValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldValue(FieldValue fieldValue) {
        fieldValue.getClass();
        this.fieldValue_ = fieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShow(boolean z) {
        this.show_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C64781.f16515xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CloudConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\t\u0004\t", new Object[]{"show_", "confType_", "fieldValue_", "confValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CloudConf> parser = PARSER;
                if (parser == null) {
                    synchronized (CloudConf.class) {
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

    @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
    public ConfType getConfType() {
        ConfType forNumber = ConfType.forNumber(this.confType_);
        return forNumber == null ? ConfType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
    public int getConfTypeValue() {
        return this.confType_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
    public ConfValue getConfValue() {
        ConfValue confValue = this.confValue_;
        return confValue == null ? ConfValue.getDefaultInstance() : confValue;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
    public FieldValue getFieldValue() {
        FieldValue fieldValue = this.fieldValue_;
        return fieldValue == null ? FieldValue.getDefaultInstance() : fieldValue;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
    public boolean getShow() {
        return this.show_;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
    public boolean hasConfValue() {
        return this.confValue_ != null;
    }

    @Override // com.bapis.bilibili.app.playurl.v1.CloudConfOrBuilder
    public boolean hasFieldValue() {
        return this.fieldValue_ != null;
    }

    public static Builder newBuilder(CloudConf cloudConf) {
        return DEFAULT_INSTANCE.createBuilder(cloudConf);
    }

    public static CloudConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CloudConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CloudConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CloudConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CloudConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CloudConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CloudConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CloudConf parseFrom(InputStream inputStream) throws IOException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CloudConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CloudConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CloudConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CloudConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
