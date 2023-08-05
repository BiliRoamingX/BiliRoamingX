package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

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
/* loaded from: classes17.dex */
public final class Interaction extends GeneratedMessageLite<Interaction, Interaction.Builder> implements MessageLiteOrBuilder {
    private static final Interaction DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ITYPE_FIELD_NUMBER = 3;
    public static final int METADATA_URL_FIELD_NUMBER = 4;
    public static final int NFT_ID_FIELD_NUMBER = 1;
    private static volatile Parser<Interaction> PARSER;
    private boolean enabled_;
    private String nftId_ = "";
    private String itype_ = "";
    private String metadataUrl_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.Interaction$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75441 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17386xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17386xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17386xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17386xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17386xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17386xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17386xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17386xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Interaction, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75441 c75441) {
            this();
        }

        public Builder clearEnabled() {
            copyOnWrite();
            ((Interaction) this.instance).clearEnabled();
            return this;
        }

        public Builder clearItype() {
            copyOnWrite();
            ((Interaction) this.instance).clearItype();
            return this;
        }

        public Builder clearMetadataUrl() {
            copyOnWrite();
            ((Interaction) this.instance).clearMetadataUrl();
            return this;
        }

        public Builder clearNftId() {
            copyOnWrite();
            ((Interaction) this.instance).clearNftId();
            return this;
        }

        public boolean getEnabled() {
            return ((Interaction) this.instance).getEnabled();
        }

        public String getItype() {
            return ((Interaction) this.instance).getItype();
        }

        public ByteString getItypeBytes() {
            return ((Interaction) this.instance).getItypeBytes();
        }

        public String getMetadataUrl() {
            return ((Interaction) this.instance).getMetadataUrl();
        }

        public ByteString getMetadataUrlBytes() {
            return ((Interaction) this.instance).getMetadataUrlBytes();
        }

        public String getNftId() {
            return ((Interaction) this.instance).getNftId();
        }

        public ByteString getNftIdBytes() {
            return ((Interaction) this.instance).getNftIdBytes();
        }

        public Builder setEnabled(boolean z) {
            copyOnWrite();
            ((Interaction) this.instance).setEnabled(z);
            return this;
        }

        public Builder setItype(String str) {
            copyOnWrite();
            ((Interaction) this.instance).setItype(str);
            return this;
        }

        public Builder setItypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Interaction) this.instance).setItypeBytes(byteString);
            return this;
        }

        public Builder setMetadataUrl(String str) {
            copyOnWrite();
            ((Interaction) this.instance).setMetadataUrl(str);
            return this;
        }

        public Builder setMetadataUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Interaction) this.instance).setMetadataUrlBytes(byteString);
            return this;
        }

        public Builder setNftId(String str) {
            copyOnWrite();
            ((Interaction) this.instance).setNftId(str);
            return this;
        }

        public Builder setNftIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Interaction) this.instance).setNftIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(Interaction.DEFAULT_INSTANCE);
        }
    }

    static {
        Interaction interaction = new Interaction();
        DEFAULT_INSTANCE = interaction;
        GeneratedMessageLite.registerDefaultInstance(Interaction.class, interaction);
    }

    private Interaction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabled() {
        this.enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItype() {
        this.itype_ = getDefaultInstance().getItype();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadataUrl() {
        this.metadataUrl_ = getDefaultInstance().getMetadataUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNftId() {
        this.nftId_ = getDefaultInstance().getNftId();
    }

    public static Interaction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Interaction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Interaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Interaction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Interaction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(boolean z) {
        this.enabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItype(String str) {
        str.getClass();
        this.itype_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.itype_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataUrl(String str) {
        str.getClass();
        this.metadataUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.metadataUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNftId(String str) {
        str.getClass();
        this.nftId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNftIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nftId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75441.f17386xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Interaction();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0007\u0003\u0208\u0004\u0208", new Object[]{"nftId_", "enabled_", "itype_", "metadataUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Interaction> parser = PARSER;
                if (parser == null) {
                    synchronized (Interaction.class) {
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

    public boolean getEnabled() {
        return this.enabled_;
    }

    public String getItype() {
        return this.itype_;
    }

    public ByteString getItypeBytes() {
        return ByteString.copyFromUtf8(this.itype_);
    }

    public String getMetadataUrl() {
        return this.metadataUrl_;
    }

    public ByteString getMetadataUrlBytes() {
        return ByteString.copyFromUtf8(this.metadataUrl_);
    }

    public String getNftId() {
        return this.nftId_;
    }

    public ByteString getNftIdBytes() {
        return ByteString.copyFromUtf8(this.nftId_);
    }

    public static Builder newBuilder(Interaction interaction) {
        return DEFAULT_INSTANCE.createBuilder(interaction);
    }

    public static Interaction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Interaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Interaction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Interaction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Interaction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Interaction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Interaction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Interaction parseFrom(InputStream inputStream) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Interaction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Interaction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Interaction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
