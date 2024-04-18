package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes17.dex */
public final class Pendant extends GeneratedMessageLite<Pendant, Pendant.Builder> implements PendantOrBuilder {
    private static final Pendant DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<Pendant> PARSER = null;
    public static final int PID_FIELD_NUMBER = 1;
    private int pid_;
    private String name_ = "";
    private String image_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Pendant$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17008xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17008xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17008xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17008xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17008xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17008xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17008xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17008xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Pendant, Builder> implements PendantOrBuilder {
        /* synthetic */ Builder(C70271 c70271) {
            this();
        }

        public Builder clearImage() {
            copyOnWrite();
            ((Pendant) this.instance).clearImage();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Pendant) this.instance).clearName();
            return this;
        }

        public Builder clearPid() {
            copyOnWrite();
            ((Pendant) this.instance).clearPid();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
        public String getImage() {
            return ((Pendant) this.instance).getImage();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
        public ByteString getImageBytes() {
            return ((Pendant) this.instance).getImageBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
        public String getName() {
            return ((Pendant) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
        public ByteString getNameBytes() {
            return ((Pendant) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
        public int getPid() {
            return ((Pendant) this.instance).getPid();
        }

        public Builder setImage(String str) {
            copyOnWrite();
            ((Pendant) this.instance).setImage(str);
            return this;
        }

        public Builder setImageBytes(ByteString byteString) {
            copyOnWrite();
            ((Pendant) this.instance).setImageBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Pendant) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Pendant) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPid(int i) {
            copyOnWrite();
            ((Pendant) this.instance).setPid(i);
            return this;
        }

        private Builder() {
            super(Pendant.DEFAULT_INSTANCE);
        }
    }

    static {
        Pendant pendant = new Pendant();
        DEFAULT_INSTANCE = pendant;
        GeneratedMessageLite.registerDefaultInstance(Pendant.class, pendant);
    }

    private Pendant() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = getDefaultInstance().getImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0;
    }

    public static Pendant getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pendant parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Pendant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pendant parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pendant> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(String str) {
        str.getClass();
        this.image_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.image_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(int i) {
        this.pid_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70271.f17008xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Pendant();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208", new Object[]{"pid_", "name_", "image_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pendant> parser = PARSER;
                if (parser == null) {
                    synchronized (Pendant.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
    public String getImage() {
        return this.image_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
    public ByteString getImageBytes() {
        return ByteString.copyFromUtf8(this.image_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.PendantOrBuilder
    public int getPid() {
        return this.pid_;
    }

    public static Builder newBuilder(Pendant pendant) {
        return DEFAULT_INSTANCE.createBuilder(pendant);
    }

    public static Pendant parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Pendant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pendant parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pendant parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pendant parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pendant parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pendant parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pendant parseFrom(InputStream inputStream) throws IOException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pendant parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pendant parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pendant parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Pendant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
