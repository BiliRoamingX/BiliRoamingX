package com.bapis.bilibili.app.card.v1;

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
public final class HotwordEntrance extends GeneratedMessageLite<HotwordEntrance, HotwordEntrance.C5819b> implements MessageLiteOrBuilder {
    private static final HotwordEntrance DEFAULT_INSTANCE;
    public static final int H5_URL_FIELD_NUMBER = 3;
    public static final int HOTWORD_ID_FIELD_NUMBER = 1;
    public static final int HOT_TEXT_FIELD_NUMBER = 2;
    public static final int ICON_FIELD_NUMBER = 4;
    private static volatile Parser<HotwordEntrance> PARSER;
    private long hotwordId_;
    private String hotText_ = "";
    private String h5Url_ = "";
    private String icon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.HotwordEntrance$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5818a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15958xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15958xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15958xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15958xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15958xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15958xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15958xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15958xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.HotwordEntrance$b */
    /* loaded from: classes13.dex */
    public static final class C5819b extends GeneratedMessageLite.Builder<HotwordEntrance, C5819b> implements MessageLiteOrBuilder {
        /* synthetic */ C5819b(C5818a c5818a) {
            this();
        }

        public C5819b clearH5Url() {
            copyOnWrite();
            ((HotwordEntrance) this.instance).clearH5Url();
            return this;
        }

        public C5819b clearHotText() {
            copyOnWrite();
            ((HotwordEntrance) this.instance).clearHotText();
            return this;
        }

        public C5819b clearHotwordId() {
            copyOnWrite();
            ((HotwordEntrance) this.instance).clearHotwordId();
            return this;
        }

        public C5819b clearIcon() {
            copyOnWrite();
            ((HotwordEntrance) this.instance).clearIcon();
            return this;
        }

        public String getH5Url() {
            return ((HotwordEntrance) this.instance).getH5Url();
        }

        public ByteString getH5UrlBytes() {
            return ((HotwordEntrance) this.instance).getH5UrlBytes();
        }

        public String getHotText() {
            return ((HotwordEntrance) this.instance).getHotText();
        }

        public ByteString getHotTextBytes() {
            return ((HotwordEntrance) this.instance).getHotTextBytes();
        }

        public long getHotwordId() {
            return ((HotwordEntrance) this.instance).getHotwordId();
        }

        public String getIcon() {
            return ((HotwordEntrance) this.instance).getIcon();
        }

        public ByteString getIconBytes() {
            return ((HotwordEntrance) this.instance).getIconBytes();
        }

        public C5819b setH5Url(String str) {
            copyOnWrite();
            ((HotwordEntrance) this.instance).setH5Url(str);
            return this;
        }

        public C5819b setH5UrlBytes(ByteString byteString) {
            copyOnWrite();
            ((HotwordEntrance) this.instance).setH5UrlBytes(byteString);
            return this;
        }

        public C5819b setHotText(String str) {
            copyOnWrite();
            ((HotwordEntrance) this.instance).setHotText(str);
            return this;
        }

        public C5819b setHotTextBytes(ByteString byteString) {
            copyOnWrite();
            ((HotwordEntrance) this.instance).setHotTextBytes(byteString);
            return this;
        }

        public C5819b setHotwordId(long j) {
            copyOnWrite();
            ((HotwordEntrance) this.instance).setHotwordId(j);
            return this;
        }

        public C5819b setIcon(String str) {
            copyOnWrite();
            ((HotwordEntrance) this.instance).setIcon(str);
            return this;
        }

        public C5819b setIconBytes(ByteString byteString) {
            copyOnWrite();
            ((HotwordEntrance) this.instance).setIconBytes(byteString);
            return this;
        }

        private C5819b() {
            super(HotwordEntrance.DEFAULT_INSTANCE);
        }
    }

    static {
        HotwordEntrance hotwordEntrance = new HotwordEntrance();
        DEFAULT_INSTANCE = hotwordEntrance;
        GeneratedMessageLite.registerDefaultInstance(HotwordEntrance.class, hotwordEntrance);
    }

    private HotwordEntrance() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearH5Url() {
        this.h5Url_ = getDefaultInstance().getH5Url();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHotText() {
        this.hotText_ = getDefaultInstance().getHotText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHotwordId() {
        this.hotwordId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.icon_ = getDefaultInstance().getIcon();
    }

    public static HotwordEntrance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5819b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HotwordEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HotwordEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotwordEntrance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HotwordEntrance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setH5Url(String str) {
        str.getClass();
        this.h5Url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setH5UrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.h5Url_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotText(String str) {
        str.getClass();
        this.hotText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.hotText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHotwordId(long j) {
        this.hotwordId_ = j;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5818a.f15958xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new HotwordEntrance();
            case 2:
                return new C5819b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"hotwordId_", "hotText_", "h5Url_", "icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HotwordEntrance> parser = PARSER;
                if (parser == null) {
                    synchronized (HotwordEntrance.class) {
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

    public String getH5Url() {
        return this.h5Url_;
    }

    public ByteString getH5UrlBytes() {
        return ByteString.copyFromUtf8(this.h5Url_);
    }

    public String getHotText() {
        return this.hotText_;
    }

    public ByteString getHotTextBytes() {
        return ByteString.copyFromUtf8(this.hotText_);
    }

    public long getHotwordId() {
        return this.hotwordId_;
    }

    public String getIcon() {
        return this.icon_;
    }

    public ByteString getIconBytes() {
        return ByteString.copyFromUtf8(this.icon_);
    }

    public static C5819b newBuilder(HotwordEntrance hotwordEntrance) {
        return DEFAULT_INSTANCE.createBuilder(hotwordEntrance);
    }

    public static HotwordEntrance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotwordEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HotwordEntrance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HotwordEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HotwordEntrance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HotwordEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HotwordEntrance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HotwordEntrance parseFrom(InputStream inputStream) throws IOException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotwordEntrance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HotwordEntrance parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HotwordEntrance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HotwordEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
