package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class ImgInlineCfg extends GeneratedMessageLite<ImgInlineCfg, ImgInlineCfg.C5531b> implements b2 {
    public static final int COLOR_FIELD_NUMBER = 3;
    private static final ImgInlineCfg DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<ImgInlineCfg> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private Colors color_;
    private double height_;
    private double width_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ImgInlineCfg$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5530a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17319xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17319xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17319xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17319xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17319xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17319xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17319xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17319xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ImgInlineCfg$b */
    /* loaded from: classes19.dex */
    public static final class C5531b extends GeneratedMessageLite.Builder<ImgInlineCfg, C5531b> implements b2 {
        /* synthetic */ C5531b(C5530a c5530a) {
            this();
        }

        public C5531b clearColor() {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).clearColor();
            return this;
        }

        public C5531b clearHeight() {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).clearHeight();
            return this;
        }

        public C5531b clearWidth() {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).clearWidth();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b2
        public Colors getColor() {
            return ((ImgInlineCfg) this.instance).getColor();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b2
        public double getHeight() {
            return ((ImgInlineCfg) this.instance).getHeight();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b2
        public double getWidth() {
            return ((ImgInlineCfg) this.instance).getWidth();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.b2
        public boolean hasColor() {
            return ((ImgInlineCfg) this.instance).hasColor();
        }

        public C5531b mergeColor(Colors colors) {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).mergeColor(colors);
            return this;
        }

        public C5531b setColor(Colors colors) {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).setColor(colors);
            return this;
        }

        public C5531b setHeight(double d2) {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).setHeight(d2);
            return this;
        }

        public C5531b setWidth(double d2) {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).setWidth(d2);
            return this;
        }

        private C5531b() {
            super(ImgInlineCfg.DEFAULT_INSTANCE);
        }

        public C5531b setColor(Colors.C5307b c5307b) {
            copyOnWrite();
            ((ImgInlineCfg) this.instance).setColor(c5307b.build());
            return this;
        }
    }

    static {
        ImgInlineCfg imgInlineCfg = new ImgInlineCfg();
        DEFAULT_INSTANCE = imgInlineCfg;
        GeneratedMessageLite.registerDefaultInstance(ImgInlineCfg.class, imgInlineCfg);
    }

    private ImgInlineCfg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0.0d;
    }

    public static ImgInlineCfg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeColor(Colors colors) {
        colors.getClass();
        Colors colors2 = this.color_;
        if (colors2 != null && colors2 != Colors.getDefaultInstance()) {
            this.color_ = Colors.newBuilder(this.color_).mergeFrom((Colors) colors).buildPartial();
        } else {
            this.color_ = colors;
        }
    }

    public static C5531b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ImgInlineCfg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImgInlineCfg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImgInlineCfg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ImgInlineCfg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(Colors colors) {
        colors.getClass();
        this.color_ = colors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(double d2) {
        this.height_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(double d2) {
        this.width_ = d2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5530a c5530a = null;
        switch (C5530a.f17319xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ImgInlineCfg();
            case 2:
                return new C5531b(c5530a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\t", new Object[]{"width_", "height_", "color_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ImgInlineCfg> parser = PARSER;
                if (parser == null) {
                    synchronized (ImgInlineCfg.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.b2
    public Colors getColor() {
        Colors colors = this.color_;
        return colors == null ? Colors.getDefaultInstance() : colors;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b2
    public double getHeight() {
        return this.height_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b2
    public double getWidth() {
        return this.width_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.b2
    public boolean hasColor() {
        return this.color_ != null;
    }

    public static C5531b newBuilder(ImgInlineCfg imgInlineCfg) {
        return DEFAULT_INSTANCE.createBuilder(imgInlineCfg);
    }

    public static ImgInlineCfg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImgInlineCfg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImgInlineCfg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ImgInlineCfg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ImgInlineCfg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ImgInlineCfg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImgInlineCfg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ImgInlineCfg parseFrom(InputStream inputStream) throws IOException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImgInlineCfg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImgInlineCfg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ImgInlineCfg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImgInlineCfg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
