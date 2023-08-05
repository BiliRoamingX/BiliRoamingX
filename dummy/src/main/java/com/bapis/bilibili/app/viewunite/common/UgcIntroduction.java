package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class UgcIntroduction extends GeneratedMessageLite<UgcIntroduction, UgcIntroduction.Builder> implements MessageLiteOrBuilder {
    public static final int BGM_FIELD_NUMBER = 4;
    private static final UgcIntroduction DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 8;
    private static volatile Parser<UgcIntroduction> PARSER = null;
    public static final int PUBDATE_FIELD_NUMBER = 7;
    public static final int RANK_FIELD_NUMBER = 3;
    public static final int RATING_FIELD_NUMBER = 2;
    public static final int STICKER_FIELD_NUMBER = 5;
    public static final int TAGS_FIELD_NUMBER = 1;
    public static final int VIDEO_SOURCE_FIELD_NUMBER = 6;
    private long pubdate_;
    private Rank rank_;
    private Rating rating_;
    private Internal.ProtobufList<Tag> tags_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ViewMaterial> bgm_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ViewMaterial> sticker_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ViewMaterial> videoSource_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DescV2> desc_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UgcIntroduction$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70731 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17050xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17050xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17050xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcIntroduction, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70731 c70731) {
            this();
        }

        public Builder addAllBgm(Iterable<? extends ViewMaterial> iterable) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addAllBgm(iterable);
            return this;
        }

        public Builder addAllDesc(Iterable<? extends DescV2> iterable) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addAllDesc(iterable);
            return this;
        }

        public Builder addAllSticker(Iterable<? extends ViewMaterial> iterable) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addAllSticker(iterable);
            return this;
        }

        public Builder addAllTags(Iterable<? extends Tag> iterable) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addAllTags(iterable);
            return this;
        }

        public Builder addAllVideoSource(Iterable<? extends ViewMaterial> iterable) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addAllVideoSource(iterable);
            return this;
        }

        public Builder addBgm(ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addBgm(viewMaterial);
            return this;
        }

        public Builder addDesc(DescV2 descV2) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addDesc(descV2);
            return this;
        }

        public Builder addSticker(ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addSticker(viewMaterial);
            return this;
        }

        public Builder addTags(Tag tag) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addTags(tag);
            return this;
        }

        public Builder addVideoSource(ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addVideoSource(viewMaterial);
            return this;
        }

        public Builder clearBgm() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearBgm();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearDesc();
            return this;
        }

        public Builder clearPubdate() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearPubdate();
            return this;
        }

        public Builder clearRank() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearRank();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearRating();
            return this;
        }

        public Builder clearSticker() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearSticker();
            return this;
        }

        public Builder clearTags() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearTags();
            return this;
        }

        public Builder clearVideoSource() {
            copyOnWrite();
            ((UgcIntroduction) this.instance).clearVideoSource();
            return this;
        }

        public ViewMaterial getBgm(int i) {
            return ((UgcIntroduction) this.instance).getBgm(i);
        }

        public int getBgmCount() {
            return ((UgcIntroduction) this.instance).getBgmCount();
        }

        public List<ViewMaterial> getBgmList() {
            return Collections.unmodifiableList(((UgcIntroduction) this.instance).getBgmList());
        }

        public DescV2 getDesc(int i) {
            return ((UgcIntroduction) this.instance).getDesc(i);
        }

        public int getDescCount() {
            return ((UgcIntroduction) this.instance).getDescCount();
        }

        public List<DescV2> getDescList() {
            return Collections.unmodifiableList(((UgcIntroduction) this.instance).getDescList());
        }

        public long getPubdate() {
            return ((UgcIntroduction) this.instance).getPubdate();
        }

        public Rank getRank() {
            return ((UgcIntroduction) this.instance).getRank();
        }

        public Rating getRating() {
            return ((UgcIntroduction) this.instance).getRating();
        }

        public ViewMaterial getSticker(int i) {
            return ((UgcIntroduction) this.instance).getSticker(i);
        }

        public int getStickerCount() {
            return ((UgcIntroduction) this.instance).getStickerCount();
        }

        public List<ViewMaterial> getStickerList() {
            return Collections.unmodifiableList(((UgcIntroduction) this.instance).getStickerList());
        }

        public Tag getTags(int i) {
            return ((UgcIntroduction) this.instance).getTags(i);
        }

        public int getTagsCount() {
            return ((UgcIntroduction) this.instance).getTagsCount();
        }

        public List<Tag> getTagsList() {
            return Collections.unmodifiableList(((UgcIntroduction) this.instance).getTagsList());
        }

        public ViewMaterial getVideoSource(int i) {
            return ((UgcIntroduction) this.instance).getVideoSource(i);
        }

        public int getVideoSourceCount() {
            return ((UgcIntroduction) this.instance).getVideoSourceCount();
        }

        public List<ViewMaterial> getVideoSourceList() {
            return Collections.unmodifiableList(((UgcIntroduction) this.instance).getVideoSourceList());
        }

        public boolean hasRank() {
            return ((UgcIntroduction) this.instance).hasRank();
        }

        public boolean hasRating() {
            return ((UgcIntroduction) this.instance).hasRating();
        }

        public Builder mergeRank(Rank rank) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).mergeRank(rank);
            return this;
        }

        public Builder mergeRating(Rating rating) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).mergeRating(rating);
            return this;
        }

        public Builder removeBgm(int i) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).removeBgm(i);
            return this;
        }

        public Builder removeDesc(int i) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).removeDesc(i);
            return this;
        }

        public Builder removeSticker(int i) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).removeSticker(i);
            return this;
        }

        public Builder removeTags(int i) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).removeTags(i);
            return this;
        }

        public Builder removeVideoSource(int i) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).removeVideoSource(i);
            return this;
        }

        public Builder setBgm(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setBgm(i, viewMaterial);
            return this;
        }

        public Builder setDesc(int i, DescV2 descV2) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setDesc(i, descV2);
            return this;
        }

        public Builder setPubdate(long j) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setPubdate(j);
            return this;
        }

        public Builder setRank(Rank rank) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setRank(rank);
            return this;
        }

        public Builder setRating(Rating rating) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setRating(rating);
            return this;
        }

        public Builder setSticker(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setSticker(i, viewMaterial);
            return this;
        }

        public Builder setTags(int i, Tag tag) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setTags(i, tag);
            return this;
        }

        public Builder setVideoSource(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setVideoSource(i, viewMaterial);
            return this;
        }

        private Builder() {
            super(UgcIntroduction.DEFAULT_INSTANCE);
        }

        public Builder addBgm(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addBgm(i, viewMaterial);
            return this;
        }

        public Builder addDesc(int i, DescV2 descV2) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addDesc(i, descV2);
            return this;
        }

        public Builder addSticker(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addSticker(i, viewMaterial);
            return this;
        }

        public Builder addTags(int i, Tag tag) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addTags(i, tag);
            return this;
        }

        public Builder addVideoSource(int i, ViewMaterial viewMaterial) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addVideoSource(i, viewMaterial);
            return this;
        }

        public Builder setBgm(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setBgm(i, builder.build());
            return this;
        }

        public Builder setDesc(int i, DescV2.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setDesc(i, builder.build());
            return this;
        }

        public Builder setRank(Rank.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setRank(builder.build());
            return this;
        }

        public Builder setRating(Rating.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setRating(builder.build());
            return this;
        }

        public Builder setSticker(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setSticker(i, builder.build());
            return this;
        }

        public Builder setTags(int i, Tag.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setTags(i, builder.build());
            return this;
        }

        public Builder setVideoSource(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).setVideoSource(i, builder.build());
            return this;
        }

        public Builder addBgm(ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addBgm(builder.build());
            return this;
        }

        public Builder addDesc(DescV2.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addDesc(builder.build());
            return this;
        }

        public Builder addSticker(ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addSticker(builder.build());
            return this;
        }

        public Builder addTags(Tag.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addTags(builder.build());
            return this;
        }

        public Builder addVideoSource(ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addVideoSource(builder.build());
            return this;
        }

        public Builder addBgm(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addBgm(i, builder.build());
            return this;
        }

        public Builder addDesc(int i, DescV2.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addDesc(i, builder.build());
            return this;
        }

        public Builder addSticker(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addSticker(i, builder.build());
            return this;
        }

        public Builder addTags(int i, Tag.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addTags(i, builder.build());
            return this;
        }

        public Builder addVideoSource(int i, ViewMaterial.Builder builder) {
            copyOnWrite();
            ((UgcIntroduction) this.instance).addVideoSource(i, builder.build());
            return this;
        }
    }

    static {
        UgcIntroduction ugcIntroduction = new UgcIntroduction();
        DEFAULT_INSTANCE = ugcIntroduction;
        GeneratedMessageLite.registerDefaultInstance(UgcIntroduction.class, ugcIntroduction);
    }

    private UgcIntroduction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBgm(Iterable<? extends ViewMaterial> iterable) {
        ensureBgmIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.bgm_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDesc(Iterable<? extends DescV2> iterable) {
        ensureDescIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.desc_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSticker(Iterable<? extends ViewMaterial> iterable) {
        ensureStickerIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sticker_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTags(Iterable<? extends Tag> iterable) {
        ensureTagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVideoSource(Iterable<? extends ViewMaterial> iterable) {
        ensureVideoSourceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.videoSource_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBgm(ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureBgmIsMutable();
        this.bgm_.add(viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDesc(DescV2 descV2) {
        descV2.getClass();
        ensureDescIsMutable();
        this.desc_.add(descV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSticker(ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureStickerIsMutable();
        this.sticker_.add(viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTags(Tag tag) {
        tag.getClass();
        ensureTagsIsMutable();
        this.tags_.add(tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoSource(ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureVideoSourceIsMutable();
        this.videoSource_.add(viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBgm() {
        this.bgm_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPubdate() {
        this.pubdate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.rank_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.rating_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSticker() {
        this.sticker_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTags() {
        this.tags_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoSource() {
        this.videoSource_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureBgmIsMutable() {
        Internal.ProtobufList<ViewMaterial> protobufList = this.bgm_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.bgm_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDescIsMutable() {
        Internal.ProtobufList<DescV2> protobufList = this.desc_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.desc_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureStickerIsMutable() {
        Internal.ProtobufList<ViewMaterial> protobufList = this.sticker_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sticker_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTagsIsMutable() {
        Internal.ProtobufList<Tag> protobufList = this.tags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureVideoSourceIsMutable() {
        Internal.ProtobufList<ViewMaterial> protobufList = this.videoSource_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.videoSource_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static UgcIntroduction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRank(Rank rank) {
        rank.getClass();
        Rank rank2 = this.rank_;
        if (rank2 != null && rank2 != Rank.getDefaultInstance()) {
            this.rank_ = Rank.newBuilder(this.rank_).mergeFrom((Rank) rank).buildPartial();
        } else {
            this.rank_ = rank;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRating(Rating rating) {
        rating.getClass();
        Rating rating2 = this.rating_;
        if (rating2 != null && rating2 != Rating.getDefaultInstance()) {
            this.rating_ = Rating.newBuilder(this.rating_).mergeFrom((Rating) rating).buildPartial();
        } else {
            this.rating_ = rating;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcIntroduction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcIntroduction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcIntroduction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcIntroduction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBgm(int i) {
        ensureBgmIsMutable();
        this.bgm_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDesc(int i) {
        ensureDescIsMutable();
        this.desc_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSticker(int i) {
        ensureStickerIsMutable();
        this.sticker_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTags(int i) {
        ensureTagsIsMutable();
        this.tags_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVideoSource(int i) {
        ensureVideoSourceIsMutable();
        this.videoSource_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgm(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureBgmIsMutable();
        this.bgm_.set(i, viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(int i, DescV2 descV2) {
        descV2.getClass();
        ensureDescIsMutable();
        this.desc_.set(i, descV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPubdate(long j) {
        this.pubdate_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(Rank rank) {
        rank.getClass();
        this.rank_ = rank;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(Rating rating) {
        rating.getClass();
        this.rating_ = rating;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSticker(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureStickerIsMutable();
        this.sticker_.set(i, viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTags(int i, Tag tag) {
        tag.getClass();
        ensureTagsIsMutable();
        this.tags_.set(i, tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSource(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureVideoSourceIsMutable();
        this.videoSource_.set(i, viewMaterial);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70731.f17050xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcIntroduction();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0005\u0000\u0001\u001b\u0002\t\u0003\t\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u0002\b\u001b", new Object[]{"tags_", Tag.class, "rating_", "rank_", "bgm_", ViewMaterial.class, "sticker_", ViewMaterial.class, "videoSource_", ViewMaterial.class, "pubdate_", "desc_", DescV2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcIntroduction> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcIntroduction.class) {
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

    public ViewMaterial getBgm(int i) {
        return this.bgm_.get(i);
    }

    public int getBgmCount() {
        return this.bgm_.size();
    }

    public List<ViewMaterial> getBgmList() {
        return this.bgm_;
    }

    public ViewMaterialOrBuilder getBgmOrBuilder(int i) {
        return this.bgm_.get(i);
    }

    public List<? extends ViewMaterialOrBuilder> getBgmOrBuilderList() {
        return this.bgm_;
    }

    public DescV2 getDesc(int i) {
        return this.desc_.get(i);
    }

    public int getDescCount() {
        return this.desc_.size();
    }

    public List<DescV2> getDescList() {
        return this.desc_;
    }

    public DescV2OrBuilder getDescOrBuilder(int i) {
        return this.desc_.get(i);
    }

    public List<? extends DescV2OrBuilder> getDescOrBuilderList() {
        return this.desc_;
    }

    public long getPubdate() {
        return this.pubdate_;
    }

    public Rank getRank() {
        Rank rank = this.rank_;
        return rank == null ? Rank.getDefaultInstance() : rank;
    }

    public Rating getRating() {
        Rating rating = this.rating_;
        return rating == null ? Rating.getDefaultInstance() : rating;
    }

    public ViewMaterial getSticker(int i) {
        return this.sticker_.get(i);
    }

    public int getStickerCount() {
        return this.sticker_.size();
    }

    public List<ViewMaterial> getStickerList() {
        return this.sticker_;
    }

    public ViewMaterialOrBuilder getStickerOrBuilder(int i) {
        return this.sticker_.get(i);
    }

    public List<? extends ViewMaterialOrBuilder> getStickerOrBuilderList() {
        return this.sticker_;
    }

    public Tag getTags(int i) {
        return this.tags_.get(i);
    }

    public int getTagsCount() {
        return this.tags_.size();
    }

    public List<Tag> getTagsList() {
        return this.tags_;
    }

    public TagOrBuilder getTagsOrBuilder(int i) {
        return this.tags_.get(i);
    }

    public List<? extends TagOrBuilder> getTagsOrBuilderList() {
        return this.tags_;
    }

    public ViewMaterial getVideoSource(int i) {
        return this.videoSource_.get(i);
    }

    public int getVideoSourceCount() {
        return this.videoSource_.size();
    }

    public List<ViewMaterial> getVideoSourceList() {
        return this.videoSource_;
    }

    public ViewMaterialOrBuilder getVideoSourceOrBuilder(int i) {
        return this.videoSource_.get(i);
    }

    public List<? extends ViewMaterialOrBuilder> getVideoSourceOrBuilderList() {
        return this.videoSource_;
    }

    public boolean hasRank() {
        return this.rank_ != null;
    }

    public boolean hasRating() {
        return this.rating_ != null;
    }

    public static Builder newBuilder(UgcIntroduction ugcIntroduction) {
        return DEFAULT_INSTANCE.createBuilder(ugcIntroduction);
    }

    public static UgcIntroduction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcIntroduction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcIntroduction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcIntroduction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBgm(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureBgmIsMutable();
        this.bgm_.add(i, viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDesc(int i, DescV2 descV2) {
        descV2.getClass();
        ensureDescIsMutable();
        this.desc_.add(i, descV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSticker(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureStickerIsMutable();
        this.sticker_.add(i, viewMaterial);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTags(int i, Tag tag) {
        tag.getClass();
        ensureTagsIsMutable();
        this.tags_.add(i, tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoSource(int i, ViewMaterial viewMaterial) {
        viewMaterial.getClass();
        ensureVideoSourceIsMutable();
        this.videoSource_.add(i, viewMaterial);
    }

    public static UgcIntroduction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcIntroduction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcIntroduction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcIntroduction parseFrom(InputStream inputStream) throws IOException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcIntroduction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcIntroduction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcIntroduction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcIntroduction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
