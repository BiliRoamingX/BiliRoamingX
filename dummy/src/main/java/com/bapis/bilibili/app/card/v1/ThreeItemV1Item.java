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
public final class ThreeItemV1Item extends GeneratedMessageLite<ThreeItemV1Item, ThreeItemV1Item.C5884b> implements InterfaceC5941u {
    public static final int BADGE_FIELD_NUMBER = 6;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int COVER_LEFT_ICON_FIELD_NUMBER = 3;
    public static final int COVER_LEFT_TEXT_FIELD_NUMBER = 2;
    private static final ThreeItemV1Item DEFAULT_INSTANCE;
    public static final int DESC_1_FIELD_NUMBER = 4;
    public static final int DESC_2_FIELD_NUMBER = 5;
    private static volatile Parser<ThreeItemV1Item> PARSER;
    private Base base_;
    private int coverLeftIcon_;
    private String coverLeftText_ = "";
    private String desc1_ = "";
    private String desc2_ = "";
    private String badge_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreeItemV1Item$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5883a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15990xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15990xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15990xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreeItemV1Item$b */
    /* loaded from: classes13.dex */
    public static final class C5884b extends GeneratedMessageLite.Builder<ThreeItemV1Item, C5884b> implements InterfaceC5941u {
        /* synthetic */ C5884b(C5883a c5883a) {
            this();
        }

        public C5884b clearBadge() {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).clearBadge();
            return this;
        }

        public C5884b clearBase() {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).clearBase();
            return this;
        }

        public C5884b clearCoverLeftIcon() {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).clearCoverLeftIcon();
            return this;
        }

        public C5884b clearCoverLeftText() {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).clearCoverLeftText();
            return this;
        }

        public C5884b clearDesc1() {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).clearDesc1();
            return this;
        }

        public C5884b clearDesc2() {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).clearDesc2();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public String getBadge() {
            return ((ThreeItemV1Item) this.instance).getBadge();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public ByteString getBadgeBytes() {
            return ((ThreeItemV1Item) this.instance).getBadgeBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public Base getBase() {
            return ((ThreeItemV1Item) this.instance).getBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public int getCoverLeftIcon() {
            return ((ThreeItemV1Item) this.instance).getCoverLeftIcon();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public String getCoverLeftText() {
            return ((ThreeItemV1Item) this.instance).getCoverLeftText();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public ByteString getCoverLeftTextBytes() {
            return ((ThreeItemV1Item) this.instance).getCoverLeftTextBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public String getDesc1() {
            return ((ThreeItemV1Item) this.instance).getDesc1();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public ByteString getDesc1Bytes() {
            return ((ThreeItemV1Item) this.instance).getDesc1Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public String getDesc2() {
            return ((ThreeItemV1Item) this.instance).getDesc2();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public ByteString getDesc2Bytes() {
            return ((ThreeItemV1Item) this.instance).getDesc2Bytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
        public boolean hasBase() {
            return ((ThreeItemV1Item) this.instance).hasBase();
        }

        public C5884b mergeBase(Base base2) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).mergeBase(base2);
            return this;
        }

        public C5884b setBadge(String str) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setBadge(str);
            return this;
        }

        public C5884b setBadgeBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setBadgeBytes(byteString);
            return this;
        }

        public C5884b setBase(Base base2) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setBase(base2);
            return this;
        }

        public C5884b setCoverLeftIcon(int i) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setCoverLeftIcon(i);
            return this;
        }

        public C5884b setCoverLeftText(String str) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setCoverLeftText(str);
            return this;
        }

        public C5884b setCoverLeftTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setCoverLeftTextBytes(byteString);
            return this;
        }

        public C5884b setDesc1(String str) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setDesc1(str);
            return this;
        }

        public C5884b setDesc1Bytes(ByteString byteString) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setDesc1Bytes(byteString);
            return this;
        }

        public C5884b setDesc2(String str) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setDesc2(str);
            return this;
        }

        public C5884b setDesc2Bytes(ByteString byteString) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setDesc2Bytes(byteString);
            return this;
        }

        private C5884b() {
            super(ThreeItemV1Item.DEFAULT_INSTANCE);
        }

        public C5884b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((ThreeItemV1Item) this.instance).setBase(c5793b.build());
            return this;
        }
    }

    static {
        ThreeItemV1Item threeItemV1Item = new ThreeItemV1Item();
        DEFAULT_INSTANCE = threeItemV1Item;
        GeneratedMessageLite.registerDefaultInstance(ThreeItemV1Item.class, threeItemV1Item);
    }

    private ThreeItemV1Item() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.badge_ = getDefaultInstance().getBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftIcon() {
        this.coverLeftIcon_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText() {
        this.coverLeftText_ = getDefaultInstance().getCoverLeftText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc1() {
        this.desc1_ = getDefaultInstance().getDesc1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc2() {
        this.desc2_ = getDefaultInstance().getDesc2();
    }

    public static ThreeItemV1Item getDefaultInstance() {
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

    public static C5884b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ThreeItemV1Item parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreeItemV1Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ThreeItemV1Item> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(String str) {
        str.getClass();
        this.badge_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.badge_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftIcon(int i) {
        this.coverLeftIcon_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText(String str) {
        str.getClass();
        this.coverLeftText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText_ = byteString.toStringUtf8();
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
        switch (C5883a.f15990xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ThreeItemV1Item();
            case 2:
                return new C5884b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"base_", "coverLeftText_", "coverLeftIcon_", "desc1_", "desc2_", "badge_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ThreeItemV1Item> parser = PARSER;
                if (parser == null) {
                    synchronized (ThreeItemV1Item.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public String getBadge() {
        return this.badge_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public ByteString getBadgeBytes() {
        return ByteString.copyFromUtf8(this.badge_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public int getCoverLeftIcon() {
        return this.coverLeftIcon_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public String getCoverLeftText() {
        return this.coverLeftText_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public ByteString getCoverLeftTextBytes() {
        return ByteString.copyFromUtf8(this.coverLeftText_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public String getDesc1() {
        return this.desc1_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public ByteString getDesc1Bytes() {
        return ByteString.copyFromUtf8(this.desc1_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public String getDesc2() {
        return this.desc2_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public ByteString getDesc2Bytes() {
        return ByteString.copyFromUtf8(this.desc2_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5941u
    public boolean hasBase() {
        return this.base_ != null;
    }

    public static C5884b newBuilder(ThreeItemV1Item threeItemV1Item) {
        return DEFAULT_INSTANCE.createBuilder(threeItemV1Item);
    }

    public static ThreeItemV1Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreeItemV1Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ThreeItemV1Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ThreeItemV1Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ThreeItemV1Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ThreeItemV1Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ThreeItemV1Item parseFrom(InputStream inputStream) throws IOException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreeItemV1Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreeItemV1Item parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ThreeItemV1Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemV1Item) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
