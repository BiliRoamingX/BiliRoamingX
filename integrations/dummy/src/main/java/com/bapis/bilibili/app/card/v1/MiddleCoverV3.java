package com.bapis.bilibili.app.card.v1;

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
/* loaded from: classes13.dex */
public final class MiddleCoverV3 extends GeneratedMessageLite<MiddleCoverV3, MiddleCoverV3.C5837b> implements InterfaceC5935o {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int COVER_BADGE_STYLE_FIELD_NUMBER = 4;
    private static final MiddleCoverV3 DEFAULT_INSTANCE;
    public static final int DESC1_FIELD_NUMBER = 2;
    public static final int DESC2_FIELD_NUMBER = 3;
    private static volatile Parser<MiddleCoverV3> PARSER;
    private Base base_;
    private ReasonStyle coverBadgeStyle_;
    private String desc1_ = "";
    private String desc2_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.MiddleCoverV3$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5836a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15967xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15967xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15967xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15967xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15967xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15967xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15967xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15967xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.MiddleCoverV3$b */
    /* loaded from: classes13.dex */
    public static final class C5837b extends GeneratedMessageLite.Builder<MiddleCoverV3, C5837b> implements InterfaceC5935o {
        /* synthetic */ C5837b(C5836a c5836a) {
            this();
        }

        public C5837b clearBase() {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).clearBase();
            return this;
        }

        public C5837b clearCoverBadgeStyle() {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).clearCoverBadgeStyle();
            return this;
        }

        public C5837b clearDesc1() {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).clearDesc1();
            return this;
        }

        public C5837b clearDesc2() {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).clearDesc2();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public Base getBase() {
            return ((MiddleCoverV3) this.instance).getBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public ReasonStyle getCoverBadgeStyle() {
            return ((MiddleCoverV3) this.instance).getCoverBadgeStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public String getDesc1() {
            return ((MiddleCoverV3) this.instance).getDesc1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public ByteString getDesc1Bytes() {
            return ((MiddleCoverV3) this.instance).getDesc1Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public String getDesc2() {
            return ((MiddleCoverV3) this.instance).getDesc2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public ByteString getDesc2Bytes() {
            return ((MiddleCoverV3) this.instance).getDesc2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public boolean hasBase() {
            return ((MiddleCoverV3) this.instance).hasBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
        public boolean hasCoverBadgeStyle() {
            return ((MiddleCoverV3) this.instance).hasCoverBadgeStyle();
        }

        public C5837b mergeBase(Base base2) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).mergeBase(base2);
            return this;
        }

        public C5837b mergeCoverBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).mergeCoverBadgeStyle(reasonStyle);
            return this;
        }

        public C5837b setBase(Base base2) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setBase(base2);
            return this;
        }

        public C5837b setCoverBadgeStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setCoverBadgeStyle(reasonStyle);
            return this;
        }

        public C5837b setDesc1(String str) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setDesc1(str);
            return this;
        }

        public C5837b setDesc1Bytes(ByteString byteString) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setDesc1Bytes(byteString);
            return this;
        }

        public C5837b setDesc2(String str) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setDesc2(str);
            return this;
        }

        public C5837b setDesc2Bytes(ByteString byteString) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setDesc2Bytes(byteString);
            return this;
        }

        private C5837b() {
            super(MiddleCoverV3.DEFAULT_INSTANCE);
        }

        public C5837b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5837b setCoverBadgeStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((MiddleCoverV3) this.instance).setCoverBadgeStyle(c5853b.build());
            return this;
        }
    }

    static {
        MiddleCoverV3 middleCoverV3 = new MiddleCoverV3();
        DEFAULT_INSTANCE = middleCoverV3;
        GeneratedMessageLite.registerDefaultInstance(MiddleCoverV3.class, middleCoverV3);
    }

    private MiddleCoverV3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverBadgeStyle() {
        this.coverBadgeStyle_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc1() {
        this.desc1_ = getDefaultInstance().getDesc1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc2() {
        this.desc2_ = getDefaultInstance().getDesc2();
    }

    public static MiddleCoverV3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBase(Base base2) {
        base2.getClass();
        Base base3 = this.base_;
        if (base3 != null && base3 != Base.getDefaultInstance()) {
            this.base_ = Base.newBuilder(this.base_).mergeFrom((Base) base2).buildPartial();
        } else {
            this.base_ = base2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoverBadgeStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.coverBadgeStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.coverBadgeStyle_ = ReasonStyle.newBuilder(this.coverBadgeStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.coverBadgeStyle_ = reasonStyle;
        }
    }

    public static C5837b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MiddleCoverV3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MiddleCoverV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MiddleCoverV3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MiddleCoverV3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBadgeStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.coverBadgeStyle_ = reasonStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc1(String str) {
        str.getClass();
        this.desc1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc2(String str) {
        str.getClass();
        this.desc2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc2_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5836a.f15967xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MiddleCoverV3();
            case 2:
                return new C5837b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\t", new Object[]{"base_", "desc1_", "desc2_", "coverBadgeStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MiddleCoverV3> parser = PARSER;
                if (parser == null) {
                    synchronized (MiddleCoverV3.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public ReasonStyle getCoverBadgeStyle() {
        ReasonStyle reasonStyle = this.coverBadgeStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public String getDesc1() {
        return this.desc1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public ByteString getDesc1Bytes() {
        return ByteString.copyFromUtf8(this.desc1_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public String getDesc2() {
        return this.desc2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public ByteString getDesc2Bytes() {
        return ByteString.copyFromUtf8(this.desc2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public boolean hasBase() {
        return this.base_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5935o
    public boolean hasCoverBadgeStyle() {
        return this.coverBadgeStyle_ != null;
    }

    public static C5837b newBuilder(MiddleCoverV3 middleCoverV3) {
        return DEFAULT_INSTANCE.createBuilder(middleCoverV3);
    }

    public static MiddleCoverV3 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MiddleCoverV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MiddleCoverV3 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MiddleCoverV3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MiddleCoverV3 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MiddleCoverV3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MiddleCoverV3 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MiddleCoverV3 parseFrom(InputStream inputStream) throws IOException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MiddleCoverV3 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MiddleCoverV3 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MiddleCoverV3 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MiddleCoverV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
