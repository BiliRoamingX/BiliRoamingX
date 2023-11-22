package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ThreeItemAllV2 extends GeneratedMessageLite<ThreeItemAllV2, ThreeItemAllV2.C5880b> implements MessageLiteOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    private static final ThreeItemAllV2 DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 3;
    private static volatile Parser<ThreeItemAllV2> PARSER = null;
    public static final int TOP_RCMD_REASON_STYLE_FIELD_NUMBER = 2;
    private Base base_;
    private Internal.ProtobufList<TwoItemHV1Item> item_ = GeneratedMessageLite.emptyProtobufList();
    private ReasonStyle topRcmdReasonStyle_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreeItemAllV2$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5879a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15988xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15988xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15988xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreeItemAllV2$b */
    /* loaded from: classes13.dex */
    public static final class C5880b extends GeneratedMessageLite.Builder<ThreeItemAllV2, C5880b> implements MessageLiteOrBuilder {
        /* synthetic */ C5880b(C5879a c5879a) {
            this();
        }

        public C5880b addAllItem(Iterable<? extends TwoItemHV1Item> iterable) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).addAllItem(iterable);
            return this;
        }

        public C5880b addItem(TwoItemHV1Item twoItemHV1Item) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).addItem(twoItemHV1Item);
            return this;
        }

        public C5880b clearBase() {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).clearBase();
            return this;
        }

        public C5880b clearItem() {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).clearItem();
            return this;
        }

        public C5880b clearTopRcmdReasonStyle() {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).clearTopRcmdReasonStyle();
            return this;
        }

        public Base getBase() {
            return ((ThreeItemAllV2) this.instance).getBase();
        }

        public TwoItemHV1Item getItem(int i) {
            return ((ThreeItemAllV2) this.instance).getItem(i);
        }

        public int getItemCount() {
            return ((ThreeItemAllV2) this.instance).getItemCount();
        }

        public List<TwoItemHV1Item> getItemList() {
            return Collections.unmodifiableList(((ThreeItemAllV2) this.instance).getItemList());
        }

        public ReasonStyle getTopRcmdReasonStyle() {
            return ((ThreeItemAllV2) this.instance).getTopRcmdReasonStyle();
        }

        public boolean hasBase() {
            return ((ThreeItemAllV2) this.instance).hasBase();
        }

        public boolean hasTopRcmdReasonStyle() {
            return ((ThreeItemAllV2) this.instance).hasTopRcmdReasonStyle();
        }

        public C5880b mergeBase(Base base2) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).mergeBase(base2);
            return this;
        }

        public C5880b mergeTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).mergeTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        public C5880b removeItem(int i) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).removeItem(i);
            return this;
        }

        public C5880b setBase(Base base2) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).setBase(base2);
            return this;
        }

        public C5880b setItem(int i, TwoItemHV1Item twoItemHV1Item) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).setItem(i, twoItemHV1Item);
            return this;
        }

        public C5880b setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).setTopRcmdReasonStyle(reasonStyle);
            return this;
        }

        private C5880b() {
            super(ThreeItemAllV2.DEFAULT_INSTANCE);
        }

        public C5880b addItem(int i, TwoItemHV1Item twoItemHV1Item) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).addItem(i, twoItemHV1Item);
            return this;
        }

        public C5880b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5880b setItem(int i, TwoItemHV1Item.C5908b c5908b) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).setItem(i, c5908b.build());
            return this;
        }

        public C5880b setTopRcmdReasonStyle(ReasonStyle.C5853b c5853b) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).setTopRcmdReasonStyle(c5853b.build());
            return this;
        }

        public C5880b addItem(TwoItemHV1Item.C5908b c5908b) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).addItem(c5908b.build());
            return this;
        }

        public C5880b addItem(int i, TwoItemHV1Item.C5908b c5908b) {
            copyOnWrite();
            ((ThreeItemAllV2) this.instance).addItem(i, c5908b.build());
            return this;
        }
    }

    static {
        ThreeItemAllV2 threeItemAllV2 = new ThreeItemAllV2();
        DEFAULT_INSTANCE = threeItemAllV2;
        GeneratedMessageLite.registerDefaultInstance(ThreeItemAllV2.class, threeItemAllV2);
    }

    private ThreeItemAllV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItem(Iterable<? extends TwoItemHV1Item> iterable) {
        ensureItemIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.item_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItem(TwoItemHV1Item twoItemHV1Item) {
        twoItemHV1Item.getClass();
        ensureItemIsMutable();
        this.item_.add(twoItemHV1Item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItem() {
        this.item_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopRcmdReasonStyle() {
        this.topRcmdReasonStyle_ = null;
    }

    private void ensureItemIsMutable() {
        Internal.ProtobufList<TwoItemHV1Item> protobufList = this.item_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.item_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ThreeItemAllV2 getDefaultInstance() {
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
    public void mergeTopRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ReasonStyle reasonStyle2 = this.topRcmdReasonStyle_;
        if (reasonStyle2 != null && reasonStyle2 != ReasonStyle.getDefaultInstance()) {
            this.topRcmdReasonStyle_ = ReasonStyle.newBuilder(this.topRcmdReasonStyle_).mergeFrom((ReasonStyle) reasonStyle).buildPartial();
        } else {
            this.topRcmdReasonStyle_ = reasonStyle;
        }
    }

    public static C5880b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ThreeItemAllV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreeItemAllV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ThreeItemAllV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItem(int i) {
        ensureItemIsMutable();
        this.item_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItem(int i, TwoItemHV1Item twoItemHV1Item) {
        twoItemHV1Item.getClass();
        ensureItemIsMutable();
        this.item_.set(i, twoItemHV1Item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopRcmdReasonStyle(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        this.topRcmdReasonStyle_ = reasonStyle;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5879a.f15988xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ThreeItemAllV2();
            case 2:
                return new C5880b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b", new Object[]{"base_", "topRcmdReasonStyle_", "item_", TwoItemHV1Item.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ThreeItemAllV2> parser = PARSER;
                if (parser == null) {
                    synchronized (ThreeItemAllV2.class) {
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

    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    public TwoItemHV1Item getItem(int i) {
        return this.item_.get(i);
    }

    public int getItemCount() {
        return this.item_.size();
    }

    public List<TwoItemHV1Item> getItemList() {
        return this.item_;
    }

    public InterfaceC5920a0 getItemOrBuilder(int i) {
        return this.item_.get(i);
    }

    public List<? extends InterfaceC5920a0> getItemOrBuilderList() {
        return this.item_;
    }

    public ReasonStyle getTopRcmdReasonStyle() {
        ReasonStyle reasonStyle = this.topRcmdReasonStyle_;
        return reasonStyle == null ? ReasonStyle.getDefaultInstance() : reasonStyle;
    }

    public boolean hasBase() {
        return this.base_ != null;
    }

    public boolean hasTopRcmdReasonStyle() {
        return this.topRcmdReasonStyle_ != null;
    }

    public static C5880b newBuilder(ThreeItemAllV2 threeItemAllV2) {
        return DEFAULT_INSTANCE.createBuilder(threeItemAllV2);
    }

    public static ThreeItemAllV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreeItemAllV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ThreeItemAllV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItem(int i, TwoItemHV1Item twoItemHV1Item) {
        twoItemHV1Item.getClass();
        ensureItemIsMutable();
        this.item_.add(i, twoItemHV1Item);
    }

    public static ThreeItemAllV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ThreeItemAllV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ThreeItemAllV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ThreeItemAllV2 parseFrom(InputStream inputStream) throws IOException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreeItemAllV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreeItemAllV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ThreeItemAllV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreeItemAllV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
