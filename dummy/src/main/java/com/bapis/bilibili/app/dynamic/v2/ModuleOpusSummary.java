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
public final class ModuleOpusSummary extends GeneratedMessageLite<ModuleOpusSummary, ModuleOpusSummary.C5785b> implements qa {
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final ModuleOpusSummary DEFAULT_INSTANCE;
    private static volatile Parser<ModuleOpusSummary> PARSER = null;
    public static final int SUMMARY_FIELD_NUMBER = 2;
    public static final int SUMMARY_JUMP_BTN_TEXT_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Paragraph summary_;
    private Paragraph title_;
    private String summaryJumpBtnText_ = "";
    private Internal.ProtobufList<MdlDynDrawItem> covers_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ModuleOpusSummary$a */
    /* loaded from: classes19.dex */
    static /* synthetic */ class C5784a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17394xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17394xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17394xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17394xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17394xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17394xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17394xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17394xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.ModuleOpusSummary$b */
    /* loaded from: classes19.dex */
    public static final class C5785b extends GeneratedMessageLite.Builder<ModuleOpusSummary, C5785b> implements qa {
        /* synthetic */ C5785b(C5784a c5784a) {
            this();
        }

        public C5785b addAllCovers(Iterable<? extends MdlDynDrawItem> iterable) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).addAllCovers(iterable);
            return this;
        }

        public C5785b addCovers(MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).addCovers(mdlDynDrawItem);
            return this;
        }

        public C5785b clearCovers() {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).clearCovers();
            return this;
        }

        public C5785b clearSummary() {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).clearSummary();
            return this;
        }

        public C5785b clearSummaryJumpBtnText() {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).clearSummaryJumpBtnText();
            return this;
        }

        public C5785b clearTitle() {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).clearTitle();
            return this;
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public MdlDynDrawItem getCovers(int i2) {
            return ((ModuleOpusSummary) this.instance).getCovers(i2);
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public int getCoversCount() {
            return ((ModuleOpusSummary) this.instance).getCoversCount();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public List<MdlDynDrawItem> getCoversList() {
            return Collections.unmodifiableList(((ModuleOpusSummary) this.instance).getCoversList());
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public Paragraph getSummary() {
            return ((ModuleOpusSummary) this.instance).getSummary();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public String getSummaryJumpBtnText() {
            return ((ModuleOpusSummary) this.instance).getSummaryJumpBtnText();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public ByteString getSummaryJumpBtnTextBytes() {
            return ((ModuleOpusSummary) this.instance).getSummaryJumpBtnTextBytes();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public Paragraph getTitle() {
            return ((ModuleOpusSummary) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public boolean hasSummary() {
            return ((ModuleOpusSummary) this.instance).hasSummary();
        }

        @Override // com.bapis.bilibili.app.dynamic.v2.qa
        public boolean hasTitle() {
            return ((ModuleOpusSummary) this.instance).hasTitle();
        }

        public C5785b mergeSummary(Paragraph paragraph) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).mergeSummary(paragraph);
            return this;
        }

        public C5785b mergeTitle(Paragraph paragraph) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).mergeTitle(paragraph);
            return this;
        }

        public C5785b removeCovers(int i2) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).removeCovers(i2);
            return this;
        }

        public C5785b setCovers(int i2, MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setCovers(i2, mdlDynDrawItem);
            return this;
        }

        public C5785b setSummary(Paragraph paragraph) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setSummary(paragraph);
            return this;
        }

        public C5785b setSummaryJumpBtnText(String str) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setSummaryJumpBtnText(str);
            return this;
        }

        public C5785b setSummaryJumpBtnTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setSummaryJumpBtnTextBytes(byteString);
            return this;
        }

        public C5785b setTitle(Paragraph paragraph) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setTitle(paragraph);
            return this;
        }

        private C5785b() {
            super(ModuleOpusSummary.DEFAULT_INSTANCE);
        }

        public C5785b addCovers(int i2, MdlDynDrawItem mdlDynDrawItem) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).addCovers(i2, mdlDynDrawItem);
            return this;
        }

        public C5785b setCovers(int i2, MdlDynDrawItem.C5684b c5684b) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setCovers(i2, c5684b.build());
            return this;
        }

        public C5785b setSummary(Paragraph.C5893b c5893b) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setSummary(c5893b.build());
            return this;
        }

        public C5785b setTitle(Paragraph.C5893b c5893b) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).setTitle(c5893b.build());
            return this;
        }

        public C5785b addCovers(MdlDynDrawItem.C5684b c5684b) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).addCovers(c5684b.build());
            return this;
        }

        public C5785b addCovers(int i2, MdlDynDrawItem.C5684b c5684b) {
            copyOnWrite();
            ((ModuleOpusSummary) this.instance).addCovers(i2, c5684b.build());
            return this;
        }
    }

    static {
        ModuleOpusSummary moduleOpusSummary = new ModuleOpusSummary();
        DEFAULT_INSTANCE = moduleOpusSummary;
        GeneratedMessageLite.registerDefaultInstance(ModuleOpusSummary.class, moduleOpusSummary);
    }

    private ModuleOpusSummary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCovers(Iterable<? extends MdlDynDrawItem> iterable) {
        ensureCoversIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.covers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCovers(MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        ensureCoversIsMutable();
        this.covers_.add(mdlDynDrawItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSummary() {
        this.summary_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSummaryJumpBtnText() {
        this.summaryJumpBtnText_ = getDefaultInstance().getSummaryJumpBtnText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
    }

    private void ensureCoversIsMutable() {
        Internal.ProtobufList<MdlDynDrawItem> protobufList = this.covers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.covers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ModuleOpusSummary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSummary(Paragraph paragraph) {
        paragraph.getClass();
        Paragraph paragraph2 = this.summary_;
        if (paragraph2 != null && paragraph2 != Paragraph.getDefaultInstance()) {
            this.summary_ = Paragraph.newBuilder(this.summary_).mergeFrom((Paragraph) paragraph).buildPartial();
        } else {
            this.summary_ = paragraph;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitle(Paragraph paragraph) {
        paragraph.getClass();
        Paragraph paragraph2 = this.title_;
        if (paragraph2 != null && paragraph2 != Paragraph.getDefaultInstance()) {
            this.title_ = Paragraph.newBuilder(this.title_).mergeFrom((Paragraph) paragraph).buildPartial();
        } else {
            this.title_ = paragraph;
        }
    }

    public static C5785b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ModuleOpusSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModuleOpusSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ModuleOpusSummary> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCovers(int i2) {
        ensureCoversIsMutable();
        this.covers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(int i2, MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        ensureCoversIsMutable();
        this.covers_.set(i2, mdlDynDrawItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummary(Paragraph paragraph) {
        paragraph.getClass();
        this.summary_ = paragraph;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummaryJumpBtnText(String str) {
        str.getClass();
        this.summaryJumpBtnText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSummaryJumpBtnTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.summaryJumpBtnText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(Paragraph paragraph) {
        paragraph.getClass();
        this.title_ = paragraph;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        C5784a c5784a = null;
        switch (C5784a.f17394xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ModuleOpusSummary();
            case 2:
                return new C5785b(c5784a);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u0208\u0004\u001b", new Object[]{"title_", "summary_", "summaryJumpBtnText_", "covers_", MdlDynDrawItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ModuleOpusSummary> parser = PARSER;
                if (parser == null) {
                    synchronized (ModuleOpusSummary.class) {
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

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public MdlDynDrawItem getCovers(int i2) {
        return this.covers_.get(i2);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public int getCoversCount() {
        return this.covers_.size();
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public List<MdlDynDrawItem> getCoversList() {
        return this.covers_;
    }

    public f9 getCoversOrBuilder(int i2) {
        return this.covers_.get(i2);
    }

    public List<? extends f9> getCoversOrBuilderList() {
        return this.covers_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public Paragraph getSummary() {
        Paragraph paragraph = this.summary_;
        return paragraph == null ? Paragraph.getDefaultInstance() : paragraph;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public String getSummaryJumpBtnText() {
        return this.summaryJumpBtnText_;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public ByteString getSummaryJumpBtnTextBytes() {
        return ByteString.copyFromUtf8(this.summaryJumpBtnText_);
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public Paragraph getTitle() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.getDefaultInstance() : paragraph;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public boolean hasSummary() {
        return this.summary_ != null;
    }

    @Override // com.bapis.bilibili.app.dynamic.v2.qa
    public boolean hasTitle() {
        return this.title_ != null;
    }

    public static C5785b newBuilder(ModuleOpusSummary moduleOpusSummary) {
        return DEFAULT_INSTANCE.createBuilder(moduleOpusSummary);
    }

    public static ModuleOpusSummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModuleOpusSummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ModuleOpusSummary parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCovers(int i2, MdlDynDrawItem mdlDynDrawItem) {
        mdlDynDrawItem.getClass();
        ensureCoversIsMutable();
        this.covers_.add(i2, mdlDynDrawItem);
    }

    public static ModuleOpusSummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ModuleOpusSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ModuleOpusSummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ModuleOpusSummary parseFrom(InputStream inputStream) throws IOException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ModuleOpusSummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ModuleOpusSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ModuleOpusSummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ModuleOpusSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
