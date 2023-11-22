package com.bapis.bilibili.app.card.v1;

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
public final class RcmdOneItem extends GeneratedMessageLite<RcmdOneItem, RcmdOneItem.C5851b> implements InterfaceC5937q {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final RcmdOneItem DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 3;
    private static volatile Parser<RcmdOneItem> PARSER = null;
    public static final int TOP_RCMD_REASON_STYLE_FIELD_NUMBER = 2;
    private Base base_;
    private SmallCoverRcmdItem item_;
    private ReasonStyle topRcmdReasonStyle_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.RcmdOneItem$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5850a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15974xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15974xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15974xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15974xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15974xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15974xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15974xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15974xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.RcmdOneItem$b */
    /* loaded from: classes13.dex */
    public static final class C5851b extends GeneratedMessageLite.Builder<RcmdOneItem, C5851b> implements InterfaceC5937q {
        /* synthetic */ C5851b(C5850a c5850a) {
            this();
        }

        public C5851b clearBase() {
            copyOnWrite();
            ((RcmdOneItem) this.instance).clearBase();
            return this;
        }

        public C5851b clearItem() {
            copyOnWrite();
            ((RcmdOneItem) this.instance).clearItem();
            return this;
        }

        public C5851b clearTopRcmdReasonStyle() {
            copyOnWrite();
            ((RcmdOneItem) this.instance).clearTopRcmdReasonStyle();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
        public Base getBase() {
            return ((RcmdOneItem) this.instance).getBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
        public SmallCoverRcmdItem getItem() {
            return ((RcmdOneItem) this.instance).getItem();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
        public ReasonStyle getTopRcmdReasonStyle() {
            return ((RcmdOneItem) this.instance).getTopRcmdReasonStyle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
        public boolean hasBase() {
            return ((RcmdOneItem) this.instance).hasBase();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
        public boolean hasItem() {
            return ((RcmdOneItem) this.instance).hasItem();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
        public boolean hasTopRcmdReasonStyle() {
            return ((RcmdOneItem) this.instance).hasTopRcmdReasonStyle();
        }

        public C5851b mergeBase(Base base2) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).mergeBase(base2);
            return this;
        }

        public C5851b mergeItem(SmallCoverRcmdItem smallCoverRcmdItem) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).mergeItem(smallCoverRcmdItem);
            return this;
        }

        public C5851b mergeTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).mergeTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5851b setBase(Base base2) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).setBase(base2);
            return this;
        }

        public C5851b setItem(SmallCoverRcmdItem smallCoverRcmdItem) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).setItem(smallCoverRcmdItem);
            return this;
        }

        public C5851b setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).setTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        private C5851b() {
            super(RcmdOneItem.DEFAULT_INSTANCE);
        }

        public C5851b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5851b setItem(SmallCoverRcmdItem.C5864b c5864b) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).setItem(c5864b.build());
            return this;
        }

        public C5851b setTopRcmdReasonStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((RcmdOneItem) this.instance).setTopRcmdReasonStyle(c5853b.build());
            return this;
        }
    }

    static {
        RcmdOneItem rcmdOneItem = new RcmdOneItem();
        DEFAULT_INSTANCE = rcmdOneItem;
        GeneratedMessageLite.registerDefaultInstance(RcmdOneItem.class, rcmdOneItem);
    }

    private RcmdOneItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.item_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopRcmdReasonStyle() {
        this.topRcmdReasonStyle_ = null;
    }

    public static RcmdOneItem getDefaultInstance() {
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
    public void mergeItem(SmallCoverRcmdItem smallCoverRcmdItem) {
        smallCoverRcmdItem.getClass();
        SmallCoverRcmdItem smallCoverRcmdItem2 = this.item_;
        if (smallCoverRcmdItem2 != null && smallCoverRcmdItem2 != SmallCoverRcmdItem.getDefaultInstance()) {
            this.item_ = SmallCoverRcmdItem.newBuilder(this.item_).mergeFrom((SmallCoverRcmdItem) smallCoverRcmdItem).buildPartial();
        } else {
            this.item_ = smallCoverRcmdItem;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.topRcmdReasonStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.topRcmdReasonStyle_ = ReasonStyle.newBuilder(this.topRcmdReasonStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.topRcmdReasonStyle_ = reasonStyle;
        }
    }

    public static C5851b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RcmdOneItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RcmdOneItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RcmdOneItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RcmdOneItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItem(SmallCoverRcmdItem smallCoverRcmdItem) {
        smallCoverRcmdItem.getClass();
        this.item_ = smallCoverRcmdItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.topRcmdReasonStyle_ = reasonStyle;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5850a.f15974xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RcmdOneItem();
            case 2:
                return new C5851b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"base_", "topRcmdReasonStyle_", "item_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RcmdOneItem> parser = PARSER;
                if (parser == null) {
                    synchronized (RcmdOneItem.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
    public SmallCoverRcmdItem getItem() {
        SmallCoverRcmdItem smallCoverRcmdItem = this.item_;
        return smallCoverRcmdItem == null ? SmallCoverRcmdItem.getDefaultInstance() : smallCoverRcmdItem;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
    public ReasonStyle getTopRcmdReasonStyle() {
        ReasonStyle reasonStyle = this.topRcmdReasonStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
    public boolean hasBase() {
        return this.base_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
    public boolean hasItem() {
        return this.item_ != null;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5937q
    public boolean hasTopRcmdReasonStyle() {
        return this.topRcmdReasonStyle_ != null;
    }

    public static C5851b newBuilder(RcmdOneItem rcmdOneItem) {
        return DEFAULT_INSTANCE.createBuilder(rcmdOneItem);
    }

    public static RcmdOneItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RcmdOneItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RcmdOneItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RcmdOneItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RcmdOneItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RcmdOneItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RcmdOneItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RcmdOneItem parseFrom(InputStream inputStream) throws IOException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RcmdOneItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RcmdOneItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RcmdOneItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RcmdOneItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
