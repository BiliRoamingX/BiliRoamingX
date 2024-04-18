package com.bapis.bilibili.app.viewunite.ugcanymodel;

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
/* loaded from: classes21.dex */
public final class PremiereResource extends GeneratedMessageLite<PremiereResource, PremiereResource.b> implements MessageLiteOrBuilder {
    private static final PremiereResource DEFAULT_INSTANCE;
    private static volatile Parser<PremiereResource> PARSER = null;
    public static final int PREMIERE_FIELD_NUMBER = 1;
    public static final int RESERVE_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 3;
    private Premiere premiere_;
    private PremiereReserve reserve_;
    private PremiereText text_;

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<PremiereResource, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearPremiere() {
            copyOnWrite();
            ((PremiereResource) this.instance).clearPremiere();
            return this;
        }

        public b clearReserve() {
            copyOnWrite();
            ((PremiereResource) this.instance).clearReserve();
            return this;
        }

        public b clearText() {
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

        public b mergePremiere(Premiere premiere) {
            copyOnWrite();
            ((PremiereResource) this.instance).mergePremiere(premiere);
            return this;
        }

        public b mergeReserve(PremiereReserve premiereReserve) {
            copyOnWrite();
            ((PremiereResource) this.instance).mergeReserve(premiereReserve);
            return this;
        }

        public b mergeText(PremiereText premiereText) {
            copyOnWrite();
            ((PremiereResource) this.instance).mergeText(premiereText);
            return this;
        }

        public b setPremiere(Premiere premiere) {
            copyOnWrite();
            ((PremiereResource) this.instance).setPremiere(premiere);
            return this;
        }

        public b setReserve(PremiereReserve premiereReserve) {
            copyOnWrite();
            ((PremiereResource) this.instance).setReserve(premiereReserve);
            return this;
        }

        public b setText(PremiereText premiereText) {
            copyOnWrite();
            ((PremiereResource) this.instance).setText(premiereText);
            return this;
        }

        private b() {
            super(PremiereResource.DEFAULT_INSTANCE);
        }

        public b setPremiere(Premiere.b bVar) {
            copyOnWrite();
            ((PremiereResource) this.instance).setPremiere(bVar.build());
            return this;
        }

        public b setReserve(PremiereReserve.b bVar) {
            copyOnWrite();
            ((PremiereResource) this.instance).setReserve(bVar.build());
            return this;
        }

        public b setText(PremiereText.b bVar) {
            copyOnWrite();
            ((PremiereResource) this.instance).setText(bVar.build());
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
        premiere.getClass();
        Premiere premiere2 = this.premiere_;
        if (premiere2 != null && premiere2 != Premiere.getDefaultInstance()) {
            this.premiere_ = Premiere.newBuilder(this.premiere_).mergeFrom((Premiere) premiere).buildPartial();
        } else {
            this.premiere_ = premiere;
        }
    }

    public void mergeReserve(PremiereReserve premiereReserve) {
        premiereReserve.getClass();
        PremiereReserve premiereReserve2 = this.reserve_;
        if (premiereReserve2 != null && premiereReserve2 != PremiereReserve.getDefaultInstance()) {
            this.reserve_ = PremiereReserve.newBuilder(this.reserve_).mergeFrom((PremiereReserve) premiereReserve).buildPartial();
        } else {
            this.reserve_ = premiereReserve;
        }
    }

    public void mergeText(PremiereText premiereText) {
        premiereText.getClass();
        PremiereText premiereText2 = this.text_;
        if (premiereText2 != null && premiereText2 != PremiereText.getDefaultInstance()) {
            this.text_ = PremiereText.newBuilder(this.text_).mergeFrom((PremiereText) premiereText).buildPartial();
        } else {
            this.text_ = premiereText;
        }
    }

    public static b newBuilder() {
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new PremiereResource();
            case 2:
                return new b(null);
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

    public static b newBuilder(PremiereResource premiereResource) {
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
