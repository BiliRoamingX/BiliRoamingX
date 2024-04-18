package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes19.dex */
public final class MdlDynDrawItem extends GeneratedMessageLite<MdlDynDrawItem, MdlDynDrawItem.C5684b> implements f9 {
    private static final MdlDynDrawItem DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile Parser<MdlDynDrawItem> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int SRC_DARK_FIELD_NUMBER = 6;
    public static final int SRC_FIELD_NUMBER = 1;
    public static final int TAGS_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private long height_;
    private float size_;
    private long width_;
    private String src_ = "";
    private Internal.ProtobufList<MdlDynDrawTag> tags_ = GeneratedMessageLite.emptyProtobufList();
    private String srcDark_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawItem$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5683a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17351xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17351xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17351xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17351xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17351xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17351xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17351xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17351xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.MdlDynDrawItem$b */
    /* loaded from: classes19.dex */
    public static final class C5684b extends GeneratedMessageLite.Builder<MdlDynDrawItem, C5684b> implements f9 {
        /* synthetic */ C5684b(C5683a c5683a) {
            this();
        }

        public C5684b addAllTags(Iterable<? extends MdlDynDrawTag> iterable) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).addAllTags(iterable);
            return this;
        }

        public C5684b addTags(MdlDynDrawTag mdlDynDrawTag) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).addTags(mdlDynDrawTag);
            return this;
        }

        public C5684b clearHeight() {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).clearHeight();
            return this;
        }

        public C5684b clearSize() {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).clearSize();
            return this;
        }

        public C5684b clearSrc() {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).clearSrc();
            return this;
        }

        public C5684b clearSrcDark() {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).clearSrcDark();
            return this;
        }

        public C5684b clearTags() {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).clearTags();
            return this;
        }

        public C5684b clearWidth() {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).clearWidth();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public long getHeight() {
            return ((MdlDynDrawItem) this.instance).getHeight();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public float getSize() {
            return ((MdlDynDrawItem) this.instance).getSize();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public String getSrc() {
            return ((MdlDynDrawItem) this.instance).getSrc();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public ByteString getSrcBytes() {
            return ((MdlDynDrawItem) this.instance).getSrcBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public String getSrcDark() {
            return ((MdlDynDrawItem) this.instance).getSrcDark();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public ByteString getSrcDarkBytes() {
            return ((MdlDynDrawItem) this.instance).getSrcDarkBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public MdlDynDrawTag getTags(int i2) {
            return ((MdlDynDrawItem) this.instance).getTags(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public int getTagsCount() {
            return ((MdlDynDrawItem) this.instance).getTagsCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public List<MdlDynDrawTag> getTagsList() {
            return Collections.unmodifiableList(((MdlDynDrawItem) this.instance).getTagsList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.f9
        public long getWidth() {
            return ((MdlDynDrawItem) this.instance).getWidth();
        }

        public C5684b removeTags(int i2) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).removeTags(i2);
            return this;
        }

        public C5684b setHeight(long j2) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setHeight(j2);
            return this;
        }

        public C5684b setSize(float f2) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setSize(f2);
            return this;
        }

        public C5684b setSrc(String str) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setSrc(str);
            return this;
        }

        public C5684b setSrcBytes(ByteString byteString) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setSrcBytes(byteString);
            return this;
        }

        public C5684b setSrcDark(String str) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setSrcDark(str);
            return this;
        }

        public C5684b setSrcDarkBytes(ByteString byteString) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setSrcDarkBytes(byteString);
            return this;
        }

        public C5684b setTags(int i2, MdlDynDrawTag mdlDynDrawTag) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setTags(i2, mdlDynDrawTag);
            return this;
        }

        public C5684b setWidth(long j2) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setWidth(j2);
            return this;
        }

        private C5684b() {
            super(MdlDynDrawItem.DEFAULT_INSTANCE);
        }

        public C5684b addTags(int i2, MdlDynDrawTag mdlDynDrawTag) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).addTags(i2, mdlDynDrawTag);
            return this;
        }

        public C5684b setTags(int i2, MdlDynDrawTag.C5686b c5686b) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).setTags(i2, c5686b.build());
            return this;
        }

        public C5684b addTags(MdlDynDrawTag.C5686b c5686b) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).addTags(c5686b.build());
            return this;
        }

        public C5684b addTags(int i2, MdlDynDrawTag.C5686b c5686b) {
            copyOnWrite();
            ((MdlDynDrawItem) this.instance).addTags(i2, c5686b.build());
            return this;
        }
    }

    static {
        MdlDynDrawItem mdlDynDrawItem = new MdlDynDrawItem();
        DEFAULT_INSTANCE = mdlDynDrawItem;
        GeneratedMessageLite.registerDefaultInstance(MdlDynDrawItem.class, mdlDynDrawItem);
    }

    private MdlDynDrawItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTags(Iterable<? extends MdlDynDrawTag> iterable) {
        ensureTagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTags(MdlDynDrawTag mdlDynDrawTag) {
        mdlDynDrawTag.getClass();
        ensureTagsIsMutable();
        this.tags_.add(mdlDynDrawTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSrc() {
        this.src_ = getDefaultInstance().getSrc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSrcDark() {
        this.srcDark_ = getDefaultInstance().getSrcDark();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTags() {
        this.tags_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0L;
    }

    private void ensureTagsIsMutable() {
        Internal.ProtobufList<MdlDynDrawTag> protobufList = this.tags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MdlDynDrawItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5684b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MdlDynDrawItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDrawItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MdlDynDrawItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTags(int i2) {
        ensureTagsIsMutable();
        this.tags_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(long j2) {
        this.height_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(float f2) {
        this.size_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrc(String str) {
        str.getClass();
        this.src_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrcBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.src_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrcDark(String str) {
        str.getClass();
        this.srcDark_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSrcDarkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.srcDark_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTags(int i2, MdlDynDrawTag mdlDynDrawTag) {
        mdlDynDrawTag.getClass();
        ensureTagsIsMutable();
        this.tags_.set(i2, mdlDynDrawTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(long j2) {
        this.width_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5683a c5683a = null;
        switch (C5683a.f17351xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MdlDynDrawItem();
            case 2:
                return new C5684b(c5683a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u0002\u0003\u0002\u0004\u0001\u0005\u001b\u0006\u0208", new Object[]{"src_", "width_", "height_", "size_", "tags_", MdlDynDrawTag.class, "srcDark_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MdlDynDrawItem> parser = PARSER;
                if (parser == null) {
                    synchronized (MdlDynDrawItem.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public long getHeight() {
        return this.height_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public float getSize() {
        return this.size_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public String getSrc() {
        return this.src_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public ByteString getSrcBytes() {
        return ByteString.copyFromUtf8(this.src_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public String getSrcDark() {
        return this.srcDark_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public ByteString getSrcDarkBytes() {
        return ByteString.copyFromUtf8(this.srcDark_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public MdlDynDrawTag getTags(int i2) {
        return this.tags_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public int getTagsCount() {
        return this.tags_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public List<MdlDynDrawTag> getTagsList() {
        return this.tags_;
    }

    public h9 getTagsOrBuilder(int i2) {
        return this.tags_.get(i2);
    }

    public List<? extends h9> getTagsOrBuilderList() {
        return this.tags_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.f9
    public long getWidth() {
        return this.width_;
    }

    public static C5684b newBuilder(MdlDynDrawItem mdlDynDrawItem) {
        return DEFAULT_INSTANCE.createBuilder(mdlDynDrawItem);
    }

    public static MdlDynDrawItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDrawItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MdlDynDrawItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTags(int i2, MdlDynDrawTag mdlDynDrawTag) {
        mdlDynDrawTag.getClass();
        ensureTagsIsMutable();
        this.tags_.add(i2, mdlDynDrawTag);
    }

    public static MdlDynDrawItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MdlDynDrawItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MdlDynDrawItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MdlDynDrawItem parseFrom(InputStream inputStream) throws IOException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MdlDynDrawItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MdlDynDrawItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MdlDynDrawItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MdlDynDrawItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
