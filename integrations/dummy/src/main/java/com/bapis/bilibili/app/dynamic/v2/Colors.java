package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class Colors extends GeneratedMessageLite<Colors, Colors.C5307b> implements u0 {
    public static final int COLOR_DAY_FIELD_NUMBER = 1;
    public static final int COLOR_NIGHT_FIELD_NUMBER = 2;
    private static final Colors DEFAULT_INSTANCE;
    private static volatile Parser<Colors> PARSER;
    private String colorDay_ = "";
    private String colorNight_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Colors$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5306a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17229xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17229xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17229xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17229xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17229xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17229xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17229xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17229xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.Colors$b */
    /* loaded from: classes19.dex */
    public static final class C5307b extends GeneratedMessageLite.Builder<Colors, C5307b> implements u0 {
        /* synthetic */ C5307b(C5306a c5306a) {
            this();
        }

        public C5307b clearColorDay() {
            copyOnWrite();
            ((Colors) this.instance).clearColorDay();
            return this;
        }

        public C5307b clearColorNight() {
            copyOnWrite();
            ((Colors) this.instance).clearColorNight();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u0
        public String getColorDay() {
            return ((Colors) this.instance).getColorDay();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u0
        public ByteString getColorDayBytes() {
            return ((Colors) this.instance).getColorDayBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u0
        public String getColorNight() {
            return ((Colors) this.instance).getColorNight();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.u0
        public ByteString getColorNightBytes() {
            return ((Colors) this.instance).getColorNightBytes();
        }

        public C5307b setColorDay(String str) {
            copyOnWrite();
            ((Colors) this.instance).setColorDay(str);
            return this;
        }

        public C5307b setColorDayBytes(ByteString byteString) {
            copyOnWrite();
            ((Colors) this.instance).setColorDayBytes(byteString);
            return this;
        }

        public C5307b setColorNight(String str) {
            copyOnWrite();
            ((Colors) this.instance).setColorNight(str);
            return this;
        }

        public C5307b setColorNightBytes(ByteString byteString) {
            copyOnWrite();
            ((Colors) this.instance).setColorNightBytes(byteString);
            return this;
        }

        private C5307b() {
            super(Colors.DEFAULT_INSTANCE);
        }
    }

    static {
        Colors colors = new Colors();
        DEFAULT_INSTANCE = colors;
        GeneratedMessageLite.registerDefaultInstance(Colors.class, colors);
    }

    private Colors() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorDay() {
        this.colorDay_ = getDefaultInstance().getColorDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorNight() {
        this.colorNight_ = getDefaultInstance().getColorNight();
    }

    public static Colors getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5307b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Colors parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Colors) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Colors parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Colors> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorDay(String str) {
        str.getClass();
        this.colorDay_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorDayBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.colorDay_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorNight(String str) {
        str.getClass();
        this.colorNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.colorNight_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5306a c5306a = null;
        switch (C5306a.f17229xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Colors();
            case 2:
                return new C5307b(c5306a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"colorDay_", "colorNight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Colors> parser = PARSER;
                if (parser == null) {
                    synchronized (Colors.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.u0
    public String getColorDay() {
        return this.colorDay_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u0
    public ByteString getColorDayBytes() {
        return ByteString.copyFromUtf8(this.colorDay_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u0
    public String getColorNight() {
        return this.colorNight_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.u0
    public ByteString getColorNightBytes() {
        return ByteString.copyFromUtf8(this.colorNight_);
    }

    public static C5307b newBuilder(Colors colors) {
        return DEFAULT_INSTANCE.createBuilder(colors);
    }

    public static Colors parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Colors) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Colors parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Colors parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Colors parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Colors parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Colors parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Colors parseFrom(InputStream inputStream) throws IOException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Colors parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Colors parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Colors parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Colors) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
