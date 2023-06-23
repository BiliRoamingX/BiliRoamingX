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
public final class MultiView extends GeneratedMessageLite<MultiView, MultiView.Builder> implements MessageLiteOrBuilder {
    public static final int AVID_FIELD_NUMBER = 4;
    public static final int BUTTON_MATERIAL_FIELD_NUMBER = 1;
    public static final int CID_FIELD_NUMBER = 3;
    private static final MultiView DEFAULT_INSTANCE;
    public static final int EP_ID_FIELD_NUMBER = 2;
    private static volatile Parser<MultiView> PARSER;
    private long avid_;
    private String buttonMaterial_ = "";
    private long cid_;
    private long epId_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.MultiView$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78571 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17576xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17576xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17576xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17576xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17576xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17576xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17576xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17576xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<MultiView, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78571 c78571) {
            this();
        }

        public Builder clearAvid() {
            copyOnWrite();
            ((MultiView) this.instance).clearAvid();
            return this;
        }

        public Builder clearButtonMaterial() {
            copyOnWrite();
            ((MultiView) this.instance).clearButtonMaterial();
            return this;
        }

        public Builder clearCid() {
            copyOnWrite();
            ((MultiView) this.instance).clearCid();
            return this;
        }

        public Builder clearEpId() {
            copyOnWrite();
            ((MultiView) this.instance).clearEpId();
            return this;
        }

        public long getAvid() {
            return ((MultiView) this.instance).getAvid();
        }

        public String getButtonMaterial() {
            return ((MultiView) this.instance).getButtonMaterial();
        }

        public ByteString getButtonMaterialBytes() {
            return ((MultiView) this.instance).getButtonMaterialBytes();
        }

        public long getCid() {
            return ((MultiView) this.instance).getCid();
        }

        public long getEpId() {
            return ((MultiView) this.instance).getEpId();
        }

        public Builder setAvid(long j) {
            copyOnWrite();
            ((MultiView) this.instance).setAvid(j);
            return this;
        }

        public Builder setButtonMaterial(String str) {
            copyOnWrite();
            ((MultiView) this.instance).setButtonMaterial(str);
            return this;
        }

        public Builder setButtonMaterialBytes(ByteString byteString) {
            copyOnWrite();
            ((MultiView) this.instance).setButtonMaterialBytes(byteString);
            return this;
        }

        public Builder setCid(long j) {
            copyOnWrite();
            ((MultiView) this.instance).setCid(j);
            return this;
        }

        public Builder setEpId(long j) {
            copyOnWrite();
            ((MultiView) this.instance).setEpId(j);
            return this;
        }

        private Builder() {
            super(MultiView.DEFAULT_INSTANCE);
        }
    }

    static {
        MultiView multiView = new MultiView();
        DEFAULT_INSTANCE = multiView;
        GeneratedMessageLite.registerDefaultInstance(MultiView.class, multiView);
    }

    private MultiView() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvid() {
        this.avid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonMaterial() {
        this.buttonMaterial_ = getDefaultInstance().getButtonMaterial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpId() {
        this.epId_ = 0L;
    }

    public static MultiView getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MultiView parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MultiView) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiView parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MultiView> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvid(long j) {
        this.avid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonMaterial(String str) {
        str.getClass();
        this.buttonMaterial_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonMaterialBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buttonMaterial_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpId(long j) {
        this.epId_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78571.f17576xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MultiView();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"buttonMaterial_", "epId_", "cid_", "avid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MultiView> parser = PARSER;
                if (parser == null) {
                    synchronized (MultiView.class) {
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

    public long getAvid() {
        return this.avid_;
    }

    public String getButtonMaterial() {
        return this.buttonMaterial_;
    }

    public ByteString getButtonMaterialBytes() {
        return ByteString.copyFromUtf8(this.buttonMaterial_);
    }

    public long getCid() {
        return this.cid_;
    }

    public long getEpId() {
        return this.epId_;
    }

    public static Builder newBuilder(MultiView multiView) {
        return DEFAULT_INSTANCE.createBuilder(multiView);
    }

    public static MultiView parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiView) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultiView parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MultiView parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MultiView parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MultiView parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MultiView parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MultiView parseFrom(InputStream inputStream) throws IOException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MultiView parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MultiView parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MultiView parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MultiView) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
