package com.bapis.bilibili.app.view.v1;

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
public final class PremiereResource extends GeneratedMessageLite<PremiereResource, PremiereResource.Builder> implements MessageLiteOrBuilder {
    private static final PremiereResource DEFAULT_INSTANCE;
    private static volatile Parser<PremiereResource> PARSER = null;
    public static final int PREMIERE_FIELD_NUMBER = 1;
    public static final int RESERVE_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 3;
    private Premiere premiere_;
    private PremiereReserve reserve_;
    private PremiereText text_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PremiereResource$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16789xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16789xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16789xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16789xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16789xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16789xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16789xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16789xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PremiereResource, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68271 c68271) {
            this();
        }

        public Builder clearPremiere() {
            copyOnWrite();
            ((PremiereResource) this.instance).clearPremiere();
            return this;
        }

        public Builder clearReserve() {
            copyOnWrite();
            ((PremiereResource) this.instance).clearReserve();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((PremiereResource) this.instance).clearText();
            return this;
        }

        public Premiere getPremiere() {
            return ((PremiereResource) this.instance).getPremiere();
        }

        public PremiereReserve getReserve() {
            return ((PremiereResource) this.instance).getReserve();
        }

        public PremiereText getText() {
            return ((PremiereResource) this.instance).getText();
        }

        public boolean hasPremiere() {
            return ((PremiereResource) this.instance).hasPremiere();
        }

        public boolean hasReserve() {
            return ((PremiereResource) this.instance).hasReserve();
        }

        public boolean hasText() {
            return ((PremiereResource) this.instance).hasText();
        }

        public Builder mergePremiere(Premiere premiere) {
            copyOnWrite();
            ((PremiereResource) this.instance).mergePremiere(premiere);
            return this;
        }

        public Builder mergeReserve(PremiereReserve premiereReserve) {
            copyOnWrite();
            ((PremiereResource) this.instance).mergeReserve(premiereReserve);
            return this;
        }

        public Builder mergeText(PremiereText premiereText) {
            copyOnWrite();
            ((PremiereResource) this.instance).mergeText(premiereText);
            return this;
        }

        public Builder setPremiere(Premiere premiere) {
            copyOnWrite();
            ((PremiereResource) this.instance).setPremiere(premiere);
            return this;
        }

        public Builder setReserve(PremiereReserve premiereReserve) {
            copyOnWrite();
            ((PremiereResource) this.instance).setReserve(premiereReserve);
            return this;
        }

        public Builder setText(PremiereText premiereText) {
            copyOnWrite();
            ((PremiereResource) this.instance).setText(premiereText);
            return this;
        }

        private Builder() {
            super(PremiereResource.DEFAULT_INSTANCE);
        }

        public Builder setPremiere(Premiere.Builder builder) {
            copyOnWrite();
            ((PremiereResource) this.instance).setPremiere(builder.build());
            return this;
        }

        public Builder setReserve(PremiereReserve.Builder builder) {
            copyOnWrite();
            ((PremiereResource) this.instance).setReserve(builder.build());
            return this;
        }

        public Builder setText(PremiereText.Builder builder) {
            copyOnWrite();
            ((PremiereResource) this.instance).setText(builder.build());
            return this;
        }
    }

    static {
        PremiereResource premiereResource = new PremiereResource();
        DEFAULT_INSTANCE = premiereResource;
        GeneratedMessageLite.registerDefaultInstance(PremiereResource.class, premiereResource);
    }

    private PremiereResource() {
    }

    public void clearPremiere() {
        this.premiere_ = null;
    }

    public void clearReserve() {
        this.reserve_ = null;
    }

    public void clearText() {
        this.text_ = null;
    }

    public static PremiereResource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergePremiere(Premiere premiere) {
    }

    public void mergeReserve(PremiereReserve premiereReserve) {
    }

    public void mergeText(PremiereText premiereText) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PremiereResource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PremiereResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereResource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PremiereResource> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setPremiere(Premiere premiere) {
        premiere.getClass();
        this.premiere_ = premiere;
    }

    public void setReserve(PremiereReserve premiereReserve) {
        premiereReserve.getClass();
        this.reserve_ = premiereReserve;
    }

    public void setText(PremiereText premiereText) {
        premiereText.getClass();
        this.text_ = premiereText;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68271.f16789xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PremiereResource();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"premiere_", "reserve_", "text_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PremiereResource> parser = PARSER;
                if (parser == null) {
                    synchronized (PremiereResource.class) {
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

    public Premiere getPremiere() {
        Premiere premiere = this.premiere_;
        return premiere == null ? Premiere.getDefaultInstance() : premiere;
    }

    public PremiereReserve getReserve() {
        PremiereReserve premiereReserve = this.reserve_;
        return premiereReserve == null ? PremiereReserve.getDefaultInstance() : premiereReserve;
    }

    public PremiereText getText() {
        PremiereText premiereText = this.text_;
        return premiereText == null ? PremiereText.getDefaultInstance() : premiereText;
    }

    public boolean hasPremiere() {
        return this.premiere_ != null;
    }

    public boolean hasReserve() {
        return this.reserve_ != null;
    }

    public boolean hasText() {
        return this.text_ != null;
    }

    public static Builder newBuilder(PremiereResource premiereResource) {
        return DEFAULT_INSTANCE.createBuilder(premiereResource);
    }

    public static PremiereResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereResource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereResource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PremiereResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PremiereResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PremiereResource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PremiereResource parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PremiereResource parseFrom(InputStream inputStream) throws IOException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereResource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PremiereResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereResource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
