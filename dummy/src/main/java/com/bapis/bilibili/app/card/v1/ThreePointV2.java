package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ThreePointV2 extends GeneratedMessageLite<ThreePointV2, ThreePointV2.C5896b> implements InterfaceC5943w {
    private static final ThreePointV2 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 5;
    private static volatile Parser<ThreePointV2> PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 3;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 4;
    private long id_;
    private String title_ = "";
    private String subtitle_ = "";
    private Internal.ProtobufList<DislikeReason> reasons_ = GeneratedMessageLite.emptyProtobufList();
    private String type_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePointV2$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5895a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15996xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15996xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15996xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15996xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15996xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15996xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15996xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15996xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.ThreePointV2$b */
    /* loaded from: classes13.dex */
    public static final class C5896b extends GeneratedMessageLite.Builder<ThreePointV2, C5896b> implements InterfaceC5943w {
        /* synthetic */ C5896b(C5895a c5895a) {
            this();
        }

        public C5896b addAllReasons(Iterable<? extends DislikeReason> iterable) {
            copyOnWrite();
            ((ThreePointV2) this.instance).addAllReasons(iterable);
            return this;
        }

        public C5896b addReasons(DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePointV2) this.instance).addReasons(dislikeReason);
            return this;
        }

        public C5896b clearId() {
            copyOnWrite();
            ((ThreePointV2) this.instance).clearId();
            return this;
        }

        public C5896b clearReasons() {
            copyOnWrite();
            ((ThreePointV2) this.instance).clearReasons();
            return this;
        }

        public C5896b clearSubtitle() {
            copyOnWrite();
            ((ThreePointV2) this.instance).clearSubtitle();
            return this;
        }

        public C5896b clearTitle() {
            copyOnWrite();
            ((ThreePointV2) this.instance).clearTitle();
            return this;
        }

        public C5896b clearType() {
            copyOnWrite();
            ((ThreePointV2) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public long getId() {
            return ((ThreePointV2) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public DislikeReason getReasons(int i) {
            return ((ThreePointV2) this.instance).getReasons(i);
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public int getReasonsCount() {
            return ((ThreePointV2) this.instance).getReasonsCount();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public List<DislikeReason> getReasonsList() {
            return Collections.unmodifiableList(((ThreePointV2) this.instance).getReasonsList());
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public String getSubtitle() {
            return ((ThreePointV2) this.instance).getSubtitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public ByteString getSubtitleBytes() {
            return ((ThreePointV2) this.instance).getSubtitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public String getTitle() {
            return ((ThreePointV2) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public ByteString getTitleBytes() {
            return ((ThreePointV2) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public String getType() {
            return ((ThreePointV2) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
        public ByteString getTypeBytes() {
            return ((ThreePointV2) this.instance).getTypeBytes();
        }

        public C5896b removeReasons(int i) {
            copyOnWrite();
            ((ThreePointV2) this.instance).removeReasons(i);
            return this;
        }

        public C5896b setId(long j) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setId(j);
            return this;
        }

        public C5896b setReasons(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setReasons(i, dislikeReason);
            return this;
        }

        public C5896b setSubtitle(String str) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setSubtitle(str);
            return this;
        }

        public C5896b setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public C5896b setTitle(String str) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setTitle(str);
            return this;
        }

        public C5896b setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setTitleBytes(byteString);
            return this;
        }

        public C5896b setType(String str) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setType(str);
            return this;
        }

        public C5896b setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setTypeBytes(byteString);
            return this;
        }

        private C5896b() {
            super(ThreePointV2.DEFAULT_INSTANCE);
        }

        public C5896b addReasons(int i, DislikeReason dislikeReason) {
            copyOnWrite();
            ((ThreePointV2) this.instance).addReasons(i, dislikeReason);
            return this;
        }

        public C5896b setReasons(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePointV2) this.instance).setReasons(i, c5803b.build());
            return this;
        }

        public C5896b addReasons(DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePointV2) this.instance).addReasons(c5803b.build());
            return this;
        }

        public C5896b addReasons(int i, DislikeReason.C5803b c5803b) {
            copyOnWrite();
            ((ThreePointV2) this.instance).addReasons(i, c5803b.build());
            return this;
        }
    }

    static {
        ThreePointV2 threePointV2 = new ThreePointV2();
        DEFAULT_INSTANCE = threePointV2;
        GeneratedMessageLite.registerDefaultInstance(ThreePointV2.class, threePointV2);
    }

    private ThreePointV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReasons(Iterable<? extends DislikeReason> iterable) {
        ensureReasonsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.reasons_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasons(DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReasons() {
        this.reasons_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureReasonsIsMutable() {
        Internal.ProtobufList<DislikeReason> protobufList = this.reasons_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.reasons_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ThreePointV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5896b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ThreePointV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ThreePointV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePointV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ThreePointV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReasons(int i) {
        ensureReasonsIsMutable();
        this.reasons_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasons(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.set(i, dislikeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5895a.f15996xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ThreePointV2();
            case 2:
                return new C5896b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\u0208\u0005\u0002", new Object[]{"title_", "subtitle_", "reasons_", DislikeReason.class, "type_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ThreePointV2> parser = PARSER;
                if (parser == null) {
                    synchronized (ThreePointV2.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public DislikeReason getReasons(int i) {
        return this.reasons_.get(i);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public int getReasonsCount() {
        return this.reasons_.size();
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public List<DislikeReason> getReasonsList() {
        return this.reasons_;
    }

    public InterfaceC5926f getReasonsOrBuilder(int i) {
        return this.reasons_.get(i);
    }

    public List<? extends InterfaceC5926f> getReasonsOrBuilderList() {
        return this.reasons_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public String getSubtitle() {
        return this.subtitle_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public String getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5943w
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public static C5896b newBuilder(ThreePointV2 threePointV2) {
        return DEFAULT_INSTANCE.createBuilder(threePointV2);
    }

    public static ThreePointV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePointV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ThreePointV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasons(int i, DislikeReason dislikeReason) {
        dislikeReason.getClass();
        ensureReasonsIsMutable();
        this.reasons_.add(i, dislikeReason);
    }

    public static ThreePointV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ThreePointV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ThreePointV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ThreePointV2 parseFrom(InputStream inputStream) throws IOException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ThreePointV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ThreePointV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ThreePointV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ThreePointV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
