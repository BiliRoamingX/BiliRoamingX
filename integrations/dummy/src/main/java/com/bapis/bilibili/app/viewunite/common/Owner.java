package com.bapis.bilibili.app.viewunite.common;

import com.bapis.bilibili.dagw.component.avatar.v1.AvatarItem;
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
public final class Owner extends GeneratedMessageLite<Owner, Owner.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_COUNT_FIELD_NUMBER = 5;
    public static final int ASSISTS_FIELD_NUMBER = 16;
    public static final int ATTENTION_FIELD_NUMBER = 6;
    public static final int ATTENTION_RELATION_FIELD_NUMBER = 7;
    public static final int AVATAR_FIELD_NUMBER = 1;
    private static final Owner DEFAULT_INSTANCE;
    public static final int FACE_FIELD_NUMBER = 11;
    public static final int FANS_FIELD_NUMBER = 4;
    public static final int FANS_NUM_FIELD_NUMBER = 15;
    public static final int LIVE_FIELD_NUMBER = 14;
    public static final int MID_FIELD_NUMBER = 12;
    public static final int OFFICIAL_VERIFY_FIELD_NUMBER = 13;
    private static volatile Parser<Owner> PARSER = null;
    public static final int PUB_LOCATION_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TITLE_URL_FIELD_NUMBER = 10;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int VIP_FIELD_NUMBER = 9;
    private int attentionRelation_;
    private int attention_;
    private AvatarItem avatar_;
    private long fansNum_;
    private Live live_;
    private long mid_;
    private OfficialVerify officialVerify_;
    private Vip vip_;
    private int assistsMemoizedSerializedSize = -1;
    private String url_ = "";
    private String title_ = "";
    private String fans_ = "";
    private String arcCount_ = "";
    private String pubLocation_ = "";
    private String titleUrl_ = "";
    private String face_ = "";
    private Internal.LongList assists_ = GeneratedMessageLite.emptyLongList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Owner$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70251 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17006xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17006xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17006xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17006xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17006xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17006xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Owner, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70251 c70251) {
            this();
        }

        public Builder addAllAssists(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((Owner) this.instance).addAllAssists(iterable);
            return this;
        }

        public Builder addAssists(long j) {
            copyOnWrite();
            ((Owner) this.instance).addAssists(j);
            return this;
        }

        public Builder clearArcCount() {
            copyOnWrite();
            ((Owner) this.instance).clearArcCount();
            return this;
        }

        public Builder clearAssists() {
            copyOnWrite();
            ((Owner) this.instance).clearAssists();
            return this;
        }

        public Builder clearAttention() {
            copyOnWrite();
            ((Owner) this.instance).clearAttention();
            return this;
        }

        public Builder clearAttentionRelation() {
            copyOnWrite();
            ((Owner) this.instance).clearAttentionRelation();
            return this;
        }

        public Builder clearAvatar() {
            copyOnWrite();
            ((Owner) this.instance).clearAvatar();
            return this;
        }

        public Builder clearFace() {
            copyOnWrite();
            ((Owner) this.instance).clearFace();
            return this;
        }

        public Builder clearFans() {
            copyOnWrite();
            ((Owner) this.instance).clearFans();
            return this;
        }

        public Builder clearFansNum() {
            copyOnWrite();
            ((Owner) this.instance).clearFansNum();
            return this;
        }

        public Builder clearLive() {
            copyOnWrite();
            ((Owner) this.instance).clearLive();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((Owner) this.instance).clearMid();
            return this;
        }

        public Builder clearOfficialVerify() {
            copyOnWrite();
            ((Owner) this.instance).clearOfficialVerify();
            return this;
        }

        public Builder clearPubLocation() {
            copyOnWrite();
            ((Owner) this.instance).clearPubLocation();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Owner) this.instance).clearTitle();
            return this;
        }

        public Builder clearTitleUrl() {
            copyOnWrite();
            ((Owner) this.instance).clearTitleUrl();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((Owner) this.instance).clearUrl();
            return this;
        }

        public Builder clearVip() {
            copyOnWrite();
            ((Owner) this.instance).clearVip();
            return this;
        }

        public String getArcCount() {
            return ((Owner) this.instance).getArcCount();
        }

        public ByteString getArcCountBytes() {
            return ((Owner) this.instance).getArcCountBytes();
        }

        public long getAssists(int i) {
            return ((Owner) this.instance).getAssists(i);
        }

        public int getAssistsCount() {
            return ((Owner) this.instance).getAssistsCount();
        }

        public List<Long> getAssistsList() {
            return Collections.unmodifiableList(((Owner) this.instance).getAssistsList());
        }

        public int getAttention() {
            return ((Owner) this.instance).getAttention();
        }

        public AttentionRelationStatus getAttentionRelation() {
            return ((Owner) this.instance).getAttentionRelation();
        }

        public int getAttentionRelationValue() {
            return ((Owner) this.instance).getAttentionRelationValue();
        }

        public AvatarItem getAvatar() {
            return ((Owner) this.instance).getAvatar();
        }

        public String getFace() {
            return ((Owner) this.instance).getFace();
        }

        public ByteString getFaceBytes() {
            return ((Owner) this.instance).getFaceBytes();
        }

        public String getFans() {
            return ((Owner) this.instance).getFans();
        }

        public ByteString getFansBytes() {
            return ((Owner) this.instance).getFansBytes();
        }

        public long getFansNum() {
            return ((Owner) this.instance).getFansNum();
        }

        public Live getLive() {
            return ((Owner) this.instance).getLive();
        }

        public long getMid() {
            return ((Owner) this.instance).getMid();
        }

        public OfficialVerify getOfficialVerify() {
            return ((Owner) this.instance).getOfficialVerify();
        }

        public String getPubLocation() {
            return ((Owner) this.instance).getPubLocation();
        }

        public ByteString getPubLocationBytes() {
            return ((Owner) this.instance).getPubLocationBytes();
        }

        public String getTitle() {
            return ((Owner) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((Owner) this.instance).getTitleBytes();
        }

        public String getTitleUrl() {
            return ((Owner) this.instance).getTitleUrl();
        }

        public ByteString getTitleUrlBytes() {
            return ((Owner) this.instance).getTitleUrlBytes();
        }

        public String getUrl() {
            return ((Owner) this.instance).getUrl();
        }

        public ByteString getUrlBytes() {
            return ((Owner) this.instance).getUrlBytes();
        }

        public Vip getVip() {
            return ((Owner) this.instance).getVip();
        }

        public boolean hasAvatar() {
            return ((Owner) this.instance).hasAvatar();
        }

        public boolean hasLive() {
            return ((Owner) this.instance).hasLive();
        }

        public boolean hasOfficialVerify() {
            return ((Owner) this.instance).hasOfficialVerify();
        }

        public boolean hasVip() {
            return ((Owner) this.instance).hasVip();
        }

        public Builder mergeAvatar(AvatarItem avatarItem) {
            copyOnWrite();
            ((Owner) this.instance).mergeAvatar(avatarItem);
            return this;
        }

        public Builder mergeLive(Live live) {
            copyOnWrite();
            ((Owner) this.instance).mergeLive(live);
            return this;
        }

        public Builder mergeOfficialVerify(OfficialVerify officialVerify) {
            copyOnWrite();
            ((Owner) this.instance).mergeOfficialVerify(officialVerify);
            return this;
        }

        public Builder mergeVip(Vip vip) {
            copyOnWrite();
            ((Owner) this.instance).mergeVip(vip);
            return this;
        }

        public Builder setArcCount(String str) {
            copyOnWrite();
            ((Owner) this.instance).setArcCount(str);
            return this;
        }

        public Builder setArcCountBytes(ByteString byteString) {
            copyOnWrite();
            ((Owner) this.instance).setArcCountBytes(byteString);
            return this;
        }

        public Builder setAssists(int i, long j) {
            copyOnWrite();
            ((Owner) this.instance).setAssists(i, j);
            return this;
        }

        public Builder setAttention(int i) {
            copyOnWrite();
            ((Owner) this.instance).setAttention(i);
            return this;
        }

        public Builder setAttentionRelation(AttentionRelationStatus attentionRelationStatus) {
            copyOnWrite();
            ((Owner) this.instance).setAttentionRelation(attentionRelationStatus);
            return this;
        }

        public Builder setAttentionRelationValue(int i) {
            copyOnWrite();
            ((Owner) this.instance).setAttentionRelationValue(i);
            return this;
        }

        public Builder setAvatar(AvatarItem avatarItem) {
            copyOnWrite();
            ((Owner) this.instance).setAvatar(avatarItem);
            return this;
        }

        public Builder setFace(String str) {
            copyOnWrite();
            ((Owner) this.instance).setFace(str);
            return this;
        }

        public Builder setFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((Owner) this.instance).setFaceBytes(byteString);
            return this;
        }

        public Builder setFans(String str) {
            copyOnWrite();
            ((Owner) this.instance).setFans(str);
            return this;
        }

        public Builder setFansBytes(ByteString byteString) {
            copyOnWrite();
            ((Owner) this.instance).setFansBytes(byteString);
            return this;
        }

        public Builder setFansNum(long j) {
            copyOnWrite();
            ((Owner) this.instance).setFansNum(j);
            return this;
        }

        public Builder setLive(Live live) {
            copyOnWrite();
            ((Owner) this.instance).setLive(live);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((Owner) this.instance).setMid(j);
            return this;
        }

        public Builder setOfficialVerify(OfficialVerify officialVerify) {
            copyOnWrite();
            ((Owner) this.instance).setOfficialVerify(officialVerify);
            return this;
        }

        public Builder setPubLocation(String str) {
            copyOnWrite();
            ((Owner) this.instance).setPubLocation(str);
            return this;
        }

        public Builder setPubLocationBytes(ByteString byteString) {
            copyOnWrite();
            ((Owner) this.instance).setPubLocationBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Owner) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Owner) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTitleUrl(String str) {
            copyOnWrite();
            ((Owner) this.instance).setTitleUrl(str);
            return this;
        }

        public Builder setTitleUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Owner) this.instance).setTitleUrlBytes(byteString);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((Owner) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Owner) this.instance).setUrlBytes(byteString);
            return this;
        }

        public Builder setVip(Vip vip) {
            copyOnWrite();
            ((Owner) this.instance).setVip(vip);
            return this;
        }

        private Builder() {
            super(Owner.DEFAULT_INSTANCE);
        }

        public Builder setAvatar(AvatarItem.Builder builder) {
            copyOnWrite();
            ((Owner) this.instance).setAvatar(builder.build());
            return this;
        }

        public Builder setLive(Live.Builder builder) {
            copyOnWrite();
            ((Owner) this.instance).setLive(builder.build());
            return this;
        }

        public Builder setOfficialVerify(OfficialVerify.Builder builder) {
            copyOnWrite();
            ((Owner) this.instance).setOfficialVerify(builder.build());
            return this;
        }

        public Builder setVip(Vip.Builder builder) {
            copyOnWrite();
            ((Owner) this.instance).setVip(builder.build());
            return this;
        }
    }

    static {
        Owner owner = new Owner();
        DEFAULT_INSTANCE = owner;
        GeneratedMessageLite.registerDefaultInstance(Owner.class, owner);
    }

    private Owner() {
    }

    public void addAllAssists(Iterable<? extends Long> iterable) {
        ensureAssistsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.assists_);
    }

    public void addAssists(long j) {
        ensureAssistsIsMutable();
        this.assists_.addLong(j);
    }

    public void clearArcCount() {
        this.arcCount_ = getDefaultInstance().getArcCount();
    }

    public void clearAssists() {
        this.assists_ = GeneratedMessageLite.emptyLongList();
    }

    public void clearAttention() {
        this.attention_ = 0;
    }

    public void clearAttentionRelation() {
        this.attentionRelation_ = 0;
    }

    public void clearAvatar() {
        this.avatar_ = null;
    }

    public void clearFace() {
        this.face_ = getDefaultInstance().getFace();
    }

    public void clearFans() {
        this.fans_ = getDefaultInstance().getFans();
    }

    public void clearFansNum() {
        this.fansNum_ = 0L;
    }

    public void clearLive() {
        this.live_ = null;
    }

    public void clearMid() {
        this.mid_ = 0L;
    }

    public void clearOfficialVerify() {
        this.officialVerify_ = null;
    }

    public void clearPubLocation() {
        this.pubLocation_ = getDefaultInstance().getPubLocation();
    }

    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public void clearTitleUrl() {
        this.titleUrl_ = getDefaultInstance().getTitleUrl();
    }

    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public void clearVip() {
        this.vip_ = null;
    }

    private void ensureAssistsIsMutable() {
        Internal.LongList longList = this.assists_;
        if (longList.isModifiable()) {
            return;
        }
        this.assists_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static Owner getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAvatar(AvatarItem avatarItem) {
        avatarItem.getClass();
        AvatarItem avatarItem2 = this.avatar_;
        if (avatarItem2 != null && avatarItem2 != AvatarItem.getDefaultInstance()) {
            this.avatar_ = AvatarItem.newBuilder(this.avatar_).mergeFrom((AvatarItem) avatarItem).buildPartial();
        } else {
            this.avatar_ = avatarItem;
        }
    }

    public void mergeLive(Live live) {
        live.getClass();
        Live live2 = this.live_;
        if (live2 != null && live2 != Live.getDefaultInstance()) {
            this.live_ = Live.newBuilder(this.live_).mergeFrom((Live) live).buildPartial();
        } else {
            this.live_ = live;
        }
    }

    public void mergeOfficialVerify(OfficialVerify officialVerify) {
        officialVerify.getClass();
        OfficialVerify officialVerify2 = this.officialVerify_;
        if (officialVerify2 != null && officialVerify2 != OfficialVerify.getDefaultInstance()) {
            this.officialVerify_ = OfficialVerify.newBuilder(this.officialVerify_).mergeFrom((OfficialVerify) officialVerify).buildPartial();
        } else {
            this.officialVerify_ = officialVerify;
        }
    }

    public void mergeVip(Vip vip) {
        vip.getClass();
        Vip vip2 = this.vip_;
        if (vip2 != null && vip2 != Vip.getDefaultInstance()) {
            this.vip_ = Vip.newBuilder(this.vip_).mergeFrom((Vip) vip).buildPartial();
        } else {
            this.vip_ = vip;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Owner parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Owner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Owner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Owner> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setArcCount(String str) {
        str.getClass();
        this.arcCount_ = str;
    }

    public void setArcCountBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.arcCount_ = byteString.toStringUtf8();
    }

    public void setAssists(int i, long j) {
        ensureAssistsIsMutable();
        this.assists_.setLong(i, j);
    }

    public void setAttention(int i) {
        this.attention_ = i;
    }

    public void setAttentionRelation(AttentionRelationStatus attentionRelationStatus) {
        this.attentionRelation_ = attentionRelationStatus.getNumber();
    }

    public void setAttentionRelationValue(int i) {
        this.attentionRelation_ = i;
    }

    public void setAvatar(AvatarItem avatarItem) {
        avatarItem.getClass();
        this.avatar_ = avatarItem;
    }

    public void setFace(String str) {
        str.getClass();
        this.face_ = str;
    }

    public void setFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.face_ = byteString.toStringUtf8();
    }

    public void setFans(String str) {
        str.getClass();
        this.fans_ = str;
    }

    public void setFansBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fans_ = byteString.toStringUtf8();
    }

    public void setFansNum(long j) {
        this.fansNum_ = j;
    }

    public void setLive(Live live) {
        live.getClass();
        this.live_ = live;
    }

    public void setMid(long j) {
        this.mid_ = j;
    }

    public void setOfficialVerify(OfficialVerify officialVerify) {
        officialVerify.getClass();
        this.officialVerify_ = officialVerify;
    }

    public void setPubLocation(String str) {
        str.getClass();
        this.pubLocation_ = str;
    }

    public void setPubLocationBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pubLocation_ = byteString.toStringUtf8();
    }

    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    public void setTitleUrl(String str) {
        str.getClass();
        this.titleUrl_ = str;
    }

    public void setTitleUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.titleUrl_ = byteString.toStringUtf8();
    }

    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    public void setVip(Vip vip) {
        vip.getClass();
        this.vip_ = vip;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70251.f17006xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Owner();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0001\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004\u0007\f\b\u0208\t\t\n\u0208\u000b\u0208\f\u0002\r\t\u000e\t\u000f\u0002\u0010%", new Object[]{"avatar_", "url_", "title_", "fans_", "arcCount_", "attention_", "attentionRelation_", "pubLocation_", "vip_", "titleUrl_", "face_", "mid_", "officialVerify_", "live_", "fansNum_", "assists_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Owner> parser = PARSER;
                if (parser == null) {
                    synchronized (Owner.class) {
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

    public String getArcCount() {
        return this.arcCount_;
    }

    public ByteString getArcCountBytes() {
        return ByteString.copyFromUtf8(this.arcCount_);
    }

    public long getAssists(int i) {
        return this.assists_.getLong(i);
    }

    public int getAssistsCount() {
        return this.assists_.size();
    }

    public List<Long> getAssistsList() {
        return this.assists_;
    }

    public int getAttention() {
        return this.attention_;
    }

    public AttentionRelationStatus getAttentionRelation() {
        AttentionRelationStatus forNumber = AttentionRelationStatus.forNumber(this.attentionRelation_);
        return forNumber == null ? AttentionRelationStatus.UNRECOGNIZED : forNumber;
    }

    public int getAttentionRelationValue() {
        return this.attentionRelation_;
    }

    public AvatarItem getAvatar() {
        AvatarItem avatarItem = this.avatar_;
        return avatarItem == null ? AvatarItem.getDefaultInstance() : avatarItem;
    }

    public String getFace() {
        return this.face_;
    }

    public ByteString getFaceBytes() {
        return ByteString.copyFromUtf8(this.face_);
    }

    public String getFans() {
        return this.fans_;
    }

    public ByteString getFansBytes() {
        return ByteString.copyFromUtf8(this.fans_);
    }

    public long getFansNum() {
        return this.fansNum_;
    }

    public Live getLive() {
        Live live = this.live_;
        return live == null ? Live.getDefaultInstance() : live;
    }

    public long getMid() {
        return this.mid_;
    }

    public OfficialVerify getOfficialVerify() {
        OfficialVerify officialVerify = this.officialVerify_;
        return officialVerify == null ? OfficialVerify.getDefaultInstance() : officialVerify;
    }

    public String getPubLocation() {
        return this.pubLocation_;
    }

    public ByteString getPubLocationBytes() {
        return ByteString.copyFromUtf8(this.pubLocation_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public String getTitleUrl() {
        return this.titleUrl_;
    }

    public ByteString getTitleUrlBytes() {
        return ByteString.copyFromUtf8(this.titleUrl_);
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public Vip getVip() {
        Vip vip = this.vip_;
        return vip == null ? Vip.getDefaultInstance() : vip;
    }

    public boolean hasAvatar() {
        return this.avatar_ != null;
    }

    public boolean hasLive() {
        return this.live_ != null;
    }

    public boolean hasOfficialVerify() {
        return this.officialVerify_ != null;
    }

    public boolean hasVip() {
        return this.vip_ != null;
    }

    public static Builder newBuilder(Owner owner) {
        return DEFAULT_INSTANCE.createBuilder(owner);
    }

    public static Owner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Owner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Owner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Owner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Owner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Owner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Owner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Owner parseFrom(InputStream inputStream) throws IOException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Owner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Owner parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Owner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Owner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
