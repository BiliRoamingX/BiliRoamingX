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
public final class Sponsor extends GeneratedMessageLite<Sponsor, Sponsor.Builder> implements MessageLiteOrBuilder {
    private static final Sponsor DEFAULT_INSTANCE;
    public static final int MINE_FIELD_NUMBER = 4;
    private static volatile Parser<Sponsor> PARSER = null;
    public static final int PENDANTS_FIELD_NUMBER = 6;
    public static final int POINT_ACTIVITY_FIELD_NUMBER = 5;
    public static final int RANK_LIST_FIELD_NUMBER = 3;
    public static final int THRESHOLD_FIELD_NUMBER = 7;
    public static final int TOTAL_FIELD_NUMBER = 1;
    public static final int WEEK_FIELD_NUMBER = 2;
    private Mine mine_;
    private PointActivity pointActivity_;
    private long total_;
    private long week_;
    private Internal.ProtobufList<SponsorRank> rankList_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Pendant> pendants_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Threshold> threshold_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Sponsor$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17038xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17038xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17038xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Sponsor, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70611 c70611) {
            this();
        }

        public Builder addAllPendants(Iterable<? extends Pendant> iterable) {
            copyOnWrite();
            ((Sponsor) this.instance).addAllPendants(iterable);
            return this;
        }

        public Builder addAllRankList(Iterable<? extends SponsorRank> iterable) {
            copyOnWrite();
            ((Sponsor) this.instance).addAllRankList(iterable);
            return this;
        }

        public Builder addAllThreshold(Iterable<? extends Threshold> iterable) {
            copyOnWrite();
            ((Sponsor) this.instance).addAllThreshold(iterable);
            return this;
        }

        public Builder addPendants(Pendant pendant) {
            copyOnWrite();
            ((Sponsor) this.instance).addPendants(pendant);
            return this;
        }

        public Builder addRankList(SponsorRank sponsorRank) {
            copyOnWrite();
            ((Sponsor) this.instance).addRankList(sponsorRank);
            return this;
        }

        public Builder addThreshold(Threshold threshold) {
            copyOnWrite();
            ((Sponsor) this.instance).addThreshold(threshold);
            return this;
        }

        public Builder clearMine() {
            copyOnWrite();
            ((Sponsor) this.instance).clearMine();
            return this;
        }

        public Builder clearPendants() {
            copyOnWrite();
            ((Sponsor) this.instance).clearPendants();
            return this;
        }

        public Builder clearPointActivity() {
            copyOnWrite();
            ((Sponsor) this.instance).clearPointActivity();
            return this;
        }

        public Builder clearRankList() {
            copyOnWrite();
            ((Sponsor) this.instance).clearRankList();
            return this;
        }

        public Builder clearThreshold() {
            copyOnWrite();
            ((Sponsor) this.instance).clearThreshold();
            return this;
        }

        public Builder clearTotal() {
            copyOnWrite();
            ((Sponsor) this.instance).clearTotal();
            return this;
        }

        public Builder clearWeek() {
            copyOnWrite();
            ((Sponsor) this.instance).clearWeek();
            return this;
        }

        public Mine getMine() {
            return ((Sponsor) this.instance).getMine();
        }

        public Pendant getPendants(int i) {
            return ((Sponsor) this.instance).getPendants(i);
        }

        public int getPendantsCount() {
            return ((Sponsor) this.instance).getPendantsCount();
        }

        public List<Pendant> getPendantsList() {
            return Collections.unmodifiableList(((Sponsor) this.instance).getPendantsList());
        }

        public PointActivity getPointActivity() {
            return ((Sponsor) this.instance).getPointActivity();
        }

        public SponsorRank getRankList(int i) {
            return ((Sponsor) this.instance).getRankList(i);
        }

        public int getRankListCount() {
            return ((Sponsor) this.instance).getRankListCount();
        }

        public List<SponsorRank> getRankListList() {
            return Collections.unmodifiableList(((Sponsor) this.instance).getRankListList());
        }

        public Threshold getThreshold(int i) {
            return ((Sponsor) this.instance).getThreshold(i);
        }

        public int getThresholdCount() {
            return ((Sponsor) this.instance).getThresholdCount();
        }

        public List<Threshold> getThresholdList() {
            return Collections.unmodifiableList(((Sponsor) this.instance).getThresholdList());
        }

        public long getTotal() {
            return ((Sponsor) this.instance).getTotal();
        }

        public long getWeek() {
            return ((Sponsor) this.instance).getWeek();
        }

        public boolean hasMine() {
            return ((Sponsor) this.instance).hasMine();
        }

        public boolean hasPointActivity() {
            return ((Sponsor) this.instance).hasPointActivity();
        }

        public Builder mergeMine(Mine mine) {
            copyOnWrite();
            ((Sponsor) this.instance).mergeMine(mine);
            return this;
        }

        public Builder mergePointActivity(PointActivity pointActivity) {
            copyOnWrite();
            ((Sponsor) this.instance).mergePointActivity(pointActivity);
            return this;
        }

        public Builder removePendants(int i) {
            copyOnWrite();
            ((Sponsor) this.instance).removePendants(i);
            return this;
        }

        public Builder removeRankList(int i) {
            copyOnWrite();
            ((Sponsor) this.instance).removeRankList(i);
            return this;
        }

        public Builder removeThreshold(int i) {
            copyOnWrite();
            ((Sponsor) this.instance).removeThreshold(i);
            return this;
        }

        public Builder setMine(Mine mine) {
            copyOnWrite();
            ((Sponsor) this.instance).setMine(mine);
            return this;
        }

        public Builder setPendants(int i, Pendant pendant) {
            copyOnWrite();
            ((Sponsor) this.instance).setPendants(i, pendant);
            return this;
        }

        public Builder setPointActivity(PointActivity pointActivity) {
            copyOnWrite();
            ((Sponsor) this.instance).setPointActivity(pointActivity);
            return this;
        }

        public Builder setRankList(int i, SponsorRank sponsorRank) {
            copyOnWrite();
            ((Sponsor) this.instance).setRankList(i, sponsorRank);
            return this;
        }

        public Builder setThreshold(int i, Threshold threshold) {
            copyOnWrite();
            ((Sponsor) this.instance).setThreshold(i, threshold);
            return this;
        }

        public Builder setTotal(long j) {
            copyOnWrite();
            ((Sponsor) this.instance).setTotal(j);
            return this;
        }

        public Builder setWeek(long j) {
            copyOnWrite();
            ((Sponsor) this.instance).setWeek(j);
            return this;
        }

        private Builder() {
            super(Sponsor.DEFAULT_INSTANCE);
        }

        public Builder addPendants(int i, Pendant pendant) {
            copyOnWrite();
            ((Sponsor) this.instance).addPendants(i, pendant);
            return this;
        }

        public Builder addRankList(int i, SponsorRank sponsorRank) {
            copyOnWrite();
            ((Sponsor) this.instance).addRankList(i, sponsorRank);
            return this;
        }

        public Builder addThreshold(int i, Threshold threshold) {
            copyOnWrite();
            ((Sponsor) this.instance).addThreshold(i, threshold);
            return this;
        }

        public Builder setMine(Mine.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).setMine(builder.build());
            return this;
        }

        public Builder setPendants(int i, Pendant.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).setPendants(i, builder.build());
            return this;
        }

        public Builder setPointActivity(PointActivity.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).setPointActivity(builder.build());
            return this;
        }

        public Builder setRankList(int i, SponsorRank.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).setRankList(i, builder.build());
            return this;
        }

        public Builder setThreshold(int i, Threshold.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).setThreshold(i, builder.build());
            return this;
        }

        public Builder addPendants(Pendant.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).addPendants(builder.build());
            return this;
        }

        public Builder addRankList(SponsorRank.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).addRankList(builder.build());
            return this;
        }

        public Builder addThreshold(Threshold.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).addThreshold(builder.build());
            return this;
        }

        public Builder addPendants(int i, Pendant.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).addPendants(i, builder.build());
            return this;
        }

        public Builder addRankList(int i, SponsorRank.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).addRankList(i, builder.build());
            return this;
        }

        public Builder addThreshold(int i, Threshold.Builder builder) {
            copyOnWrite();
            ((Sponsor) this.instance).addThreshold(i, builder.build());
            return this;
        }
    }

    static {
        Sponsor sponsor = new Sponsor();
        DEFAULT_INSTANCE = sponsor;
        GeneratedMessageLite.registerDefaultInstance(Sponsor.class, sponsor);
    }

    private Sponsor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPendants(Iterable<? extends Pendant> iterable) {
        ensurePendantsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pendants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRankList(Iterable<? extends SponsorRank> iterable) {
        ensureRankListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rankList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllThreshold(Iterable<? extends Threshold> iterable) {
        ensureThresholdIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.threshold_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPendants(Pendant pendant) {
        pendant.getClass();
        ensurePendantsIsMutable();
        this.pendants_.add(pendant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRankList(SponsorRank sponsorRank) {
        sponsorRank.getClass();
        ensureRankListIsMutable();
        this.rankList_.add(sponsorRank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addThreshold(Threshold threshold) {
        threshold.getClass();
        ensureThresholdIsMutable();
        this.threshold_.add(threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMine() {
        this.mine_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPendants() {
        this.pendants_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointActivity() {
        this.pointActivity_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRankList() {
        this.rankList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreshold() {
        this.threshold_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotal() {
        this.total_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeek() {
        this.week_ = 0L;
    }

    private void ensurePendantsIsMutable() {
        Internal.ProtobufList<Pendant> protobufList = this.pendants_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.pendants_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRankListIsMutable() {
        Internal.ProtobufList<SponsorRank> protobufList = this.rankList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.rankList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureThresholdIsMutable() {
        Internal.ProtobufList<Threshold> protobufList = this.threshold_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.threshold_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Sponsor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMine(Mine mine) {
        mine.getClass();
        Mine mine2 = this.mine_;
        if (mine2 != null && mine2 != Mine.getDefaultInstance()) {
            this.mine_ = Mine.newBuilder(this.mine_).mergeFrom((Mine) mine).buildPartial();
        } else {
            this.mine_ = mine;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointActivity(PointActivity pointActivity) {
        pointActivity.getClass();
        PointActivity pointActivity2 = this.pointActivity_;
        if (pointActivity2 != null && pointActivity2 != PointActivity.getDefaultInstance()) {
            this.pointActivity_ = PointActivity.newBuilder(this.pointActivity_).mergeFrom((PointActivity) pointActivity).buildPartial();
        } else {
            this.pointActivity_ = pointActivity;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sponsor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sponsor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sponsor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sponsor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePendants(int i) {
        ensurePendantsIsMutable();
        this.pendants_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRankList(int i) {
        ensureRankListIsMutable();
        this.rankList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeThreshold(int i) {
        ensureThresholdIsMutable();
        this.threshold_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMine(Mine mine) {
        mine.getClass();
        this.mine_ = mine;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendants(int i, Pendant pendant) {
        pendant.getClass();
        ensurePendantsIsMutable();
        this.pendants_.set(i, pendant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointActivity(PointActivity pointActivity) {
        pointActivity.getClass();
        this.pointActivity_ = pointActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankList(int i, SponsorRank sponsorRank) {
        sponsorRank.getClass();
        ensureRankListIsMutable();
        this.rankList_.set(i, sponsorRank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreshold(int i, Threshold threshold) {
        threshold.getClass();
        ensureThresholdIsMutable();
        this.threshold_.set(i, threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotal(long j) {
        this.total_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeek(long j) {
        this.week_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70611.f17038xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Sponsor();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003\u001b\u0004\t\u0005\t\u0006\u001b\u0007\u001b", new Object[]{"total_", "week_", "rankList_", SponsorRank.class, "mine_", "pointActivity_", "pendants_", Pendant.class, "threshold_", Threshold.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sponsor> parser = PARSER;
                if (parser == null) {
                    synchronized (Sponsor.class) {
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

    public Mine getMine() {
        Mine mine = this.mine_;
        return mine == null ? Mine.getDefaultInstance() : mine;
    }

    public Pendant getPendants(int i) {
        return this.pendants_.get(i);
    }

    public int getPendantsCount() {
        return this.pendants_.size();
    }

    public List<Pendant> getPendantsList() {
        return this.pendants_;
    }

    public PendantOrBuilder getPendantsOrBuilder(int i) {
        return this.pendants_.get(i);
    }

    public List<? extends PendantOrBuilder> getPendantsOrBuilderList() {
        return this.pendants_;
    }

    public PointActivity getPointActivity() {
        PointActivity pointActivity = this.pointActivity_;
        return pointActivity == null ? PointActivity.getDefaultInstance() : pointActivity;
    }

    public SponsorRank getRankList(int i) {
        return this.rankList_.get(i);
    }

    public int getRankListCount() {
        return this.rankList_.size();
    }

    public List<SponsorRank> getRankListList() {
        return this.rankList_;
    }

    public SponsorRankOrBuilder getRankListOrBuilder(int i) {
        return this.rankList_.get(i);
    }

    public List<? extends SponsorRankOrBuilder> getRankListOrBuilderList() {
        return this.rankList_;
    }

    public Threshold getThreshold(int i) {
        return this.threshold_.get(i);
    }

    public int getThresholdCount() {
        return this.threshold_.size();
    }

    public List<Threshold> getThresholdList() {
        return this.threshold_;
    }

    public ThresholdOrBuilder getThresholdOrBuilder(int i) {
        return this.threshold_.get(i);
    }

    public List<? extends ThresholdOrBuilder> getThresholdOrBuilderList() {
        return this.threshold_;
    }

    public long getTotal() {
        return this.total_;
    }

    public long getWeek() {
        return this.week_;
    }

    public boolean hasMine() {
        return this.mine_ != null;
    }

    public boolean hasPointActivity() {
        return this.pointActivity_ != null;
    }

    public static Builder newBuilder(Sponsor sponsor) {
        return DEFAULT_INSTANCE.createBuilder(sponsor);
    }

    public static Sponsor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sponsor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sponsor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sponsor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPendants(int i, Pendant pendant) {
        pendant.getClass();
        ensurePendantsIsMutable();
        this.pendants_.add(i, pendant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRankList(int i, SponsorRank sponsorRank) {
        sponsorRank.getClass();
        ensureRankListIsMutable();
        this.rankList_.add(i, sponsorRank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addThreshold(int i, Threshold threshold) {
        threshold.getClass();
        ensureThresholdIsMutable();
        this.threshold_.add(i, threshold);
    }

    public static Sponsor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sponsor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sponsor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sponsor parseFrom(InputStream inputStream) throws IOException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sponsor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sponsor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sponsor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sponsor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
