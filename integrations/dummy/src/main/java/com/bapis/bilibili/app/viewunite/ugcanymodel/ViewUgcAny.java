package com.bapis.bilibili.app.viewunite.ugcanymodel;

import com.bapis.bilibili.app.viewunite.common.Page;
import com.bapis.bilibili.app.viewunite.common.PageOrBuilder;
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
/* loaded from: classes21.dex */
public final class ViewUgcAny extends GeneratedMessageLite<ViewUgcAny, ViewUgcAny.b> implements MessageLiteOrBuilder {
    public static final int AI_EXTRA_FIELD_NUMBER = 8;
    private static final ViewUgcAny DEFAULT_INSTANCE;
    public static final int DISLIKE_FIELD_NUMBER = 2;
    public static final int ELEC_RANK_FIELD_NUMBER = 6;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile Parser<ViewUgcAny> PARSER = null;
    public static final int PREMIERE_FIELD_NUMBER = 1;
    public static final int SHARE_SUBTITLE_FIELD_NUMBER = 4;
    public static final int SHORT_LINK_FIELD_NUMBER = 3;
    public static final int UGC_SEASON_CONF_FIELD_NUMBER = 7;
    private AiExtra aiExtra_;
    private Dislike dislike_;
    private ElecRank elecRank_;
    private PremiereResource premiere_;
    private UgcSeasonConf ugcSeasonConf_;
    private String shortLink_ = "";
    private String shareSubtitle_ = "";
    private Internal.ProtobufList<Page> pages_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<ViewUgcAny, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b addAllPages(Iterable<? extends Page> iterable) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).addAllPages(iterable);
            return this;
        }

        public b addPages(Page page) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).addPages(page);
            return this;
        }

        public b clearAiExtra() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearAiExtra();
            return this;
        }

        public b clearDislike() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearDislike();
            return this;
        }

        public b clearElecRank() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearElecRank();
            return this;
        }

        public b clearPages() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearPages();
            return this;
        }

        public b clearPremiere() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearPremiere();
            return this;
        }

        public b clearShareSubtitle() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearShareSubtitle();
            return this;
        }

        public b clearShortLink() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearShortLink();
            return this;
        }

        public b clearUgcSeasonConf() {
            copyOnWrite();
            ((ViewUgcAny) this.instance).clearUgcSeasonConf();
            return this;
        }

        public AiExtra getAiExtra() {
            return ((ViewUgcAny) this.instance).getAiExtra();
        }

        public Dislike getDislike() {
            return ((ViewUgcAny) this.instance).getDislike();
        }

        public ElecRank getElecRank() {
            return ((ViewUgcAny) this.instance).getElecRank();
        }

        public Page getPages(int i2) {
            return ((ViewUgcAny) this.instance).getPages(i2);
        }

        public int getPagesCount() {
            return ((ViewUgcAny) this.instance).getPagesCount();
        }

        public List<Page> getPagesList() {
            return Collections.unmodifiableList(((ViewUgcAny) this.instance).getPagesList());
        }

        public PremiereResource getPremiere() {
            return ((ViewUgcAny) this.instance).getPremiere();
        }

        public String getShareSubtitle() {
            return ((ViewUgcAny) this.instance).getShareSubtitle();
        }

        public ByteString getShareSubtitleBytes() {
            return ((ViewUgcAny) this.instance).getShareSubtitleBytes();
        }

        public String getShortLink() {
            return ((ViewUgcAny) this.instance).getShortLink();
        }

        public ByteString getShortLinkBytes() {
            return ((ViewUgcAny) this.instance).getShortLinkBytes();
        }

        public UgcSeasonConf getUgcSeasonConf() {
            return ((ViewUgcAny) this.instance).getUgcSeasonConf();
        }

        public boolean hasAiExtra() {
            return ((ViewUgcAny) this.instance).hasAiExtra();
        }

        public boolean hasDislike() {
            return ((ViewUgcAny) this.instance).hasDislike();
        }

        public boolean hasElecRank() {
            return ((ViewUgcAny) this.instance).hasElecRank();
        }

        public boolean hasPremiere() {
            return ((ViewUgcAny) this.instance).hasPremiere();
        }

        public boolean hasUgcSeasonConf() {
            return ((ViewUgcAny) this.instance).hasUgcSeasonConf();
        }

        public b mergeAiExtra(AiExtra aiExtra) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).mergeAiExtra(aiExtra);
            return this;
        }

        public b mergeDislike(Dislike dislike) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).mergeDislike(dislike);
            return this;
        }

        public b mergeElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).mergeElecRank(elecRank);
            return this;
        }

        public b mergePremiere(PremiereResource premiereResource) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).mergePremiere(premiereResource);
            return this;
        }

        public b mergeUgcSeasonConf(UgcSeasonConf ugcSeasonConf) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).mergeUgcSeasonConf(ugcSeasonConf);
            return this;
        }

        public b removePages(int i2) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).removePages(i2);
            return this;
        }

        public b setAiExtra(AiExtra aiExtra) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setAiExtra(aiExtra);
            return this;
        }

        public b setDislike(Dislike dislike) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setDislike(dislike);
            return this;
        }

        public b setElecRank(ElecRank elecRank) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setElecRank(elecRank);
            return this;
        }

        public b setPages(int i2, Page page) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setPages(i2, page);
            return this;
        }

        public b setPremiere(PremiereResource premiereResource) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setPremiere(premiereResource);
            return this;
        }

        public b setShareSubtitle(String str) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setShareSubtitle(str);
            return this;
        }

        public b setShareSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setShareSubtitleBytes(byteString);
            return this;
        }

        public b setShortLink(String str) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setShortLink(str);
            return this;
        }

        public b setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public b setUgcSeasonConf(UgcSeasonConf ugcSeasonConf) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setUgcSeasonConf(ugcSeasonConf);
            return this;
        }

        private b() {
            super(ViewUgcAny.DEFAULT_INSTANCE);
        }

        public b addPages(int i2, Page page) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).addPages(i2, page);
            return this;
        }

        public b setAiExtra(AiExtra.b bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setAiExtra(bVar.build());
            return this;
        }

        public b setDislike(Dislike.b bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setDislike(bVar.build());
            return this;
        }

        public b setElecRank(ElecRank.b bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setElecRank(bVar.build());
            return this;
        }

        public b setPages(int i2, Page.Builder bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setPages(i2, bVar.build());
            return this;
        }

        public b setPremiere(PremiereResource.b bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setPremiere(bVar.build());
            return this;
        }

        public b setUgcSeasonConf(UgcSeasonConf.b bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).setUgcSeasonConf(bVar.build());
            return this;
        }

        public b addPages(Page.Builder bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).addPages(bVar.build());
            return this;
        }

        public b addPages(int i2, Page.Builder bVar) {
            copyOnWrite();
            ((ViewUgcAny) this.instance).addPages(i2, bVar.build());
            return this;
        }
    }

    static {
        ViewUgcAny viewUgcAny = new ViewUgcAny();
        DEFAULT_INSTANCE = viewUgcAny;
        GeneratedMessageLite.registerDefaultInstance(ViewUgcAny.class, viewUgcAny);
    }

    private ViewUgcAny() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPages(Iterable<? extends Page> iterable) {
        ensurePagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiExtra() {
        this.aiExtra_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislike() {
        this.dislike_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElecRank() {
        this.elecRank_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPages() {
        this.pages_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPremiere() {
        this.premiere_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareSubtitle() {
        this.shareSubtitle_ = getDefaultInstance().getShareSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortLink() {
        this.shortLink_ = getDefaultInstance().getShortLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcSeasonConf() {
        this.ugcSeasonConf_ = null;
    }

    private void ensurePagesIsMutable() {
        Internal.ProtobufList<Page> protobufList = this.pages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.pages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ViewUgcAny getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAiExtra(AiExtra aiExtra) {
        aiExtra.getClass();
        AiExtra aiExtra2 = this.aiExtra_;
        if (aiExtra2 != null && aiExtra2 != AiExtra.getDefaultInstance()) {
            this.aiExtra_ = AiExtra.newBuilder(this.aiExtra_).mergeFrom((AiExtra) aiExtra).buildPartial();
        } else {
            this.aiExtra_ = aiExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDislike(Dislike dislike) {
        dislike.getClass();
        Dislike dislike2 = this.dislike_;
        if (dislike2 != null && dislike2 != Dislike.getDefaultInstance()) {
            this.dislike_ = Dislike.newBuilder(this.dislike_).mergeFrom((Dislike) dislike).buildPartial();
        } else {
            this.dislike_ = dislike;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElecRank(ElecRank elecRank) {
        elecRank.getClass();
        ElecRank elecRank2 = this.elecRank_;
        if (elecRank2 != null && elecRank2 != ElecRank.getDefaultInstance()) {
            this.elecRank_ = ElecRank.newBuilder(this.elecRank_).mergeFrom((ElecRank) elecRank).buildPartial();
        } else {
            this.elecRank_ = elecRank;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePremiere(PremiereResource premiereResource) {
        premiereResource.getClass();
        PremiereResource premiereResource2 = this.premiere_;
        if (premiereResource2 != null && premiereResource2 != PremiereResource.getDefaultInstance()) {
            this.premiere_ = PremiereResource.newBuilder(this.premiere_).mergeFrom((PremiereResource) premiereResource).buildPartial();
        } else {
            this.premiere_ = premiereResource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUgcSeasonConf(UgcSeasonConf ugcSeasonConf) {
        ugcSeasonConf.getClass();
        UgcSeasonConf ugcSeasonConf2 = this.ugcSeasonConf_;
        if (ugcSeasonConf2 != null && ugcSeasonConf2 != UgcSeasonConf.getDefaultInstance()) {
            this.ugcSeasonConf_ = UgcSeasonConf.newBuilder(this.ugcSeasonConf_).mergeFrom((UgcSeasonConf) ugcSeasonConf).buildPartial();
        } else {
            this.ugcSeasonConf_ = ugcSeasonConf;
        }
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewUgcAny parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewUgcAny) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewUgcAny parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewUgcAny> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePages(int i2) {
        ensurePagesIsMutable();
        this.pages_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiExtra(AiExtra aiExtra) {
        aiExtra.getClass();
        this.aiExtra_ = aiExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislike(Dislike dislike) {
        dislike.getClass();
        this.dislike_ = dislike;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElecRank(ElecRank elecRank) {
        elecRank.getClass();
        this.elecRank_ = elecRank;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPages(int i2, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.set(i2, page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiere(PremiereResource premiereResource) {
        premiereResource.getClass();
        this.premiere_ = premiereResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitle(String str) {
        str.getClass();
        this.shareSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareSubtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLink(String str) {
        str.getClass();
        this.shortLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcSeasonConf(UgcSeasonConf ugcSeasonConf) {
        ugcSeasonConf.getClass();
        this.ugcSeasonConf_ = ugcSeasonConf;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewUgcAny();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u0208\u0004\u0208\u0005\u001b\u0006\t\u0007\t\b\t", new Object[]{"premiere_", "dislike_", "shortLink_", "shareSubtitle_", "pages_", Page.class, "elecRank_", "ugcSeasonConf_", "aiExtra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewUgcAny> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewUgcAny.class) {
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

    public AiExtra getAiExtra() {
        AiExtra aiExtra = this.aiExtra_;
        return aiExtra == null ? AiExtra.getDefaultInstance() : aiExtra;
    }

    public Dislike getDislike() {
        Dislike dislike = this.dislike_;
        return dislike == null ? Dislike.getDefaultInstance() : dislike;
    }

    public ElecRank getElecRank() {
        ElecRank elecRank = this.elecRank_;
        return elecRank == null ? ElecRank.getDefaultInstance() : elecRank;
    }

    public Page getPages(int i2) {
        return this.pages_.get(i2);
    }

    public int getPagesCount() {
        return this.pages_.size();
    }

    public List<Page> getPagesList() {
        return this.pages_;
    }

    public PageOrBuilder getPagesOrBuilder(int i2) {
        return this.pages_.get(i2);
    }

    public List<? extends PageOrBuilder> getPagesOrBuilderList() {
        return this.pages_;
    }

    public PremiereResource getPremiere() {
        PremiereResource premiereResource = this.premiere_;
        return premiereResource == null ? PremiereResource.getDefaultInstance() : premiereResource;
    }

    public String getShareSubtitle() {
        return this.shareSubtitle_;
    }

    public ByteString getShareSubtitleBytes() {
        return ByteString.copyFromUtf8(this.shareSubtitle_);
    }

    public String getShortLink() {
        return this.shortLink_;
    }

    public ByteString getShortLinkBytes() {
        return ByteString.copyFromUtf8(this.shortLink_);
    }

    public UgcSeasonConf getUgcSeasonConf() {
        UgcSeasonConf ugcSeasonConf = this.ugcSeasonConf_;
        return ugcSeasonConf == null ? UgcSeasonConf.getDefaultInstance() : ugcSeasonConf;
    }

    public boolean hasAiExtra() {
        return this.aiExtra_ != null;
    }

    public boolean hasDislike() {
        return this.dislike_ != null;
    }

    public boolean hasElecRank() {
        return this.elecRank_ != null;
    }

    public boolean hasPremiere() {
        return this.premiere_ != null;
    }

    public boolean hasUgcSeasonConf() {
        return this.ugcSeasonConf_ != null;
    }

    public static b newBuilder(ViewUgcAny viewUgcAny) {
        return DEFAULT_INSTANCE.createBuilder(viewUgcAny);
    }

    public static ViewUgcAny parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewUgcAny) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewUgcAny parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewUgcAny parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPages(int i2, Page page) {
        page.getClass();
        ensurePagesIsMutable();
        this.pages_.add(i2, page);
    }

    public static ViewUgcAny parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewUgcAny parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewUgcAny parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewUgcAny parseFrom(InputStream inputStream) throws IOException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewUgcAny parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewUgcAny parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewUgcAny parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewUgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
