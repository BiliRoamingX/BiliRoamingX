package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class Content extends GeneratedMessageLite<Content, Content.C14691c> implements MessageLiteOrBuilder {
    public static final int AT_NAME_TO_MID_FIELD_NUMBER = 7;
    private static final Content DEFAULT_INSTANCE;
    public static final int EMOTES_FIELD_NUMBER = 3;
    public static final int MEMBERS_FIELD_NUMBER = 2;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile Parser<Content> PARSER = null;
    public static final int PICTURES_FIELD_NUMBER = 9;
    public static final int PICTURE_SCALE_FIELD_NUMBER = 10;
    public static final int RICH_TEXT_FIELD_NUMBER = 8;
    public static final int TOPICS_FIELD_NUMBER = 4;
    public static final int URLS_FIELD_NUMBER = 5;
    public static final int VOTE_FIELD_NUMBER = 6;
    private double pictureScale_;
    private RichText richText_;
    private Vote vote_;
    private MapFieldLite<String, Member> members_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Emote> emotes_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Topic> topics_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Url> urls_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Long> atNameToMid_ = MapFieldLite.emptyMapField();
    private String message_ = "";
    private Internal.ProtobufList<Picture> pictures_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Content$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14689a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21985xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21985xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21985xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21985xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21985xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21985xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21985xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21985xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Content$b */
    /* loaded from: classes21.dex */
    private static final class C14690b {
        static final MapEntryLite<String, Long> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT64, 0L);

        private C14690b() {
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Content$c */
    /* loaded from: classes21.dex */
    public static final class C14691c extends GeneratedMessageLite.Builder<Content, C14691c> implements MessageLiteOrBuilder {
        /* synthetic */ C14691c(C14689a c14689a) {
            this();
        }

        public C14691c addAllPictures(Iterable<? extends Picture> iterable) {
            copyOnWrite();
            ((Content) this.instance).addAllPictures(iterable);
            return this;
        }

        public C14691c addPictures(Picture picture) {
            copyOnWrite();
            ((Content) this.instance).addPictures(picture);
            return this;
        }

        public C14691c clearAtNameToMid() {
            copyOnWrite();
            ((Content) this.instance).getMutableAtNameToMidMap().clear();
            return this;
        }

        public C14691c clearEmotes() {
            copyOnWrite();
            ((Content) this.instance).getMutableEmotesMap().clear();
            return this;
        }

        public C14691c clearMembers() {
            copyOnWrite();
            ((Content) this.instance).getMutableMembersMap().clear();
            return this;
        }

        public C14691c clearMessage() {
            copyOnWrite();
            ((Content) this.instance).clearMessage();
            return this;
        }

        public C14691c clearPictureScale() {
            copyOnWrite();
            ((Content) this.instance).clearPictureScale();
            return this;
        }

        public C14691c clearPictures() {
            copyOnWrite();
            ((Content) this.instance).clearPictures();
            return this;
        }

        public C14691c clearRichText() {
            copyOnWrite();
            ((Content) this.instance).clearRichText();
            return this;
        }

        public C14691c clearTopics() {
            copyOnWrite();
            ((Content) this.instance).getMutableTopicsMap().clear();
            return this;
        }

        public C14691c clearUrls() {
            copyOnWrite();
            ((Content) this.instance).getMutableUrlsMap().clear();
            return this;
        }

        public C14691c clearVote() {
            copyOnWrite();
            ((Content) this.instance).clearVote();
            return this;
        }

        public boolean containsAtNameToMid(String str) {
            str.getClass();
            return ((Content) this.instance).getAtNameToMidMap().containsKey(str);
        }

        public boolean containsEmotes(String str) {
            str.getClass();
            return ((Content) this.instance).getEmotesMap().containsKey(str);
        }

        public boolean containsMembers(String str) {
            str.getClass();
            return ((Content) this.instance).getMembersMap().containsKey(str);
        }

        public boolean containsTopics(String str) {
            str.getClass();
            return ((Content) this.instance).getTopicsMap().containsKey(str);
        }

        public boolean containsUrls(String str) {
            str.getClass();
            return ((Content) this.instance).getUrlsMap().containsKey(str);
        }

        @Deprecated
        public Map<String, Long> getAtNameToMid() {
            return getAtNameToMidMap();
        }

        public int getAtNameToMidCount() {
            return ((Content) this.instance).getAtNameToMidMap().size();
        }

        public Map<String, Long> getAtNameToMidMap() {
            return Collections.unmodifiableMap(((Content) this.instance).getAtNameToMidMap());
        }

        public long getAtNameToMidOrDefault(String str, long j) {
            str.getClass();
            Map<String, Long> atNameToMidMap = ((Content) this.instance).getAtNameToMidMap();
            return atNameToMidMap.containsKey(str) ? atNameToMidMap.get(str).longValue() : j;
        }

        public long getAtNameToMidOrThrow(String str) {
            str.getClass();
            Map<String, Long> atNameToMidMap = ((Content) this.instance).getAtNameToMidMap();
            if (atNameToMidMap.containsKey(str)) {
                return atNameToMidMap.get(str).longValue();
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Emote> getEmotes() {
            return getEmotesMap();
        }

        public int getEmotesCount() {
            return ((Content) this.instance).getEmotesMap().size();
        }

        public Map<String, Emote> getEmotesMap() {
            return Collections.unmodifiableMap(((Content) this.instance).getEmotesMap());
        }

        public Emote getEmotesOrDefault(String str, Emote emote) {
            str.getClass();
            Map<String, Emote> emotesMap = ((Content) this.instance).getEmotesMap();
            return emotesMap.containsKey(str) ? emotesMap.get(str) : emote;
        }

        public Emote getEmotesOrThrow(String str) {
            str.getClass();
            Map<String, Emote> emotesMap = ((Content) this.instance).getEmotesMap();
            if (emotesMap.containsKey(str)) {
                return emotesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Member> getMembers() {
            return getMembersMap();
        }

        public int getMembersCount() {
            return ((Content) this.instance).getMembersMap().size();
        }

        public Map<String, Member> getMembersMap() {
            return Collections.unmodifiableMap(((Content) this.instance).getMembersMap());
        }

        public Member getMembersOrDefault(String str, Member member) {
            str.getClass();
            Map<String, Member> membersMap = ((Content) this.instance).getMembersMap();
            return membersMap.containsKey(str) ? membersMap.get(str) : member;
        }

        public Member getMembersOrThrow(String str) {
            str.getClass();
            Map<String, Member> membersMap = ((Content) this.instance).getMembersMap();
            if (membersMap.containsKey(str)) {
                return membersMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getMessage() {
            return ((Content) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((Content) this.instance).getMessageBytes();
        }

        public double getPictureScale() {
            return ((Content) this.instance).getPictureScale();
        }

        public Picture getPictures(int i) {
            return ((Content) this.instance).getPictures(i);
        }

        public int getPicturesCount() {
            return ((Content) this.instance).getPicturesCount();
        }

        public List<Picture> getPicturesList() {
            return Collections.unmodifiableList(((Content) this.instance).getPicturesList());
        }

        public RichText getRichText() {
            return ((Content) this.instance).getRichText();
        }

        @Deprecated
        public Map<String, Topic> getTopics() {
            return getTopicsMap();
        }

        public int getTopicsCount() {
            return ((Content) this.instance).getTopicsMap().size();
        }

        public Map<String, Topic> getTopicsMap() {
            return Collections.unmodifiableMap(((Content) this.instance).getTopicsMap());
        }

        public Topic getTopicsOrDefault(String str, Topic topic) {
            str.getClass();
            Map<String, Topic> topicsMap = ((Content) this.instance).getTopicsMap();
            return topicsMap.containsKey(str) ? topicsMap.get(str) : topic;
        }

        public Topic getTopicsOrThrow(String str) {
            str.getClass();
            Map<String, Topic> topicsMap = ((Content) this.instance).getTopicsMap();
            if (topicsMap.containsKey(str)) {
                return topicsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Url> getUrls() {
            return getUrlsMap();
        }

        public int getUrlsCount() {
            return ((Content) this.instance).getUrlsMap().size();
        }

        public Map<String, Url> getUrlsMap() {
            return Collections.unmodifiableMap(((Content) this.instance).getUrlsMap());
        }

        public Url getUrlsOrDefault(String str, Url url) {
            str.getClass();
            Map<String, Url> urlsMap = ((Content) this.instance).getUrlsMap();
            return urlsMap.containsKey(str) ? urlsMap.get(str) : url;
        }

        public Url getUrlsOrThrow(String str) {
            str.getClass();
            Map<String, Url> urlsMap = ((Content) this.instance).getUrlsMap();
            if (urlsMap.containsKey(str)) {
                return urlsMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Vote getVote() {
            return ((Content) this.instance).getVote();
        }

        public boolean hasRichText() {
            return ((Content) this.instance).hasRichText();
        }

        public boolean hasVote() {
            return ((Content) this.instance).hasVote();
        }

        public C14691c mergeRichText(RichText richText) {
            copyOnWrite();
            ((Content) this.instance).mergeRichText(richText);
            return this;
        }

        public C14691c mergeVote(Vote vote) {
            copyOnWrite();
            ((Content) this.instance).mergeVote(vote);
            return this;
        }

        public C14691c putAllAtNameToMid(Map<String, Long> map) {
            copyOnWrite();
            ((Content) this.instance).getMutableAtNameToMidMap().putAll(map);
            return this;
        }

        public C14691c putAllEmotes(Map<String, Emote> map) {
            copyOnWrite();
            ((Content) this.instance).getMutableEmotesMap().putAll(map);
            return this;
        }

        public C14691c putAllMembers(Map<String, Member> map) {
            copyOnWrite();
            ((Content) this.instance).getMutableMembersMap().putAll(map);
            return this;
        }

        public C14691c putAllTopics(Map<String, Topic> map) {
            copyOnWrite();
            ((Content) this.instance).getMutableTopicsMap().putAll(map);
            return this;
        }

        public C14691c putAllUrls(Map<String, Url> map) {
            copyOnWrite();
            ((Content) this.instance).getMutableUrlsMap().putAll(map);
            return this;
        }

        public C14691c putAtNameToMid(String str, long j) {
            str.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableAtNameToMidMap().put(str, Long.valueOf(j));
            return this;
        }

        public C14691c putEmotes(String str, Emote emote) {
            str.getClass();
            emote.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableEmotesMap().put(str, emote);
            return this;
        }

        public C14691c putMembers(String str, Member member) {
            str.getClass();
            member.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableMembersMap().put(str, member);
            return this;
        }

        public C14691c putTopics(String str, Topic topic) {
            str.getClass();
            topic.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableTopicsMap().put(str, topic);
            return this;
        }

        public C14691c putUrls(String str, Url url) {
            str.getClass();
            url.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableUrlsMap().put(str, url);
            return this;
        }

        public C14691c removeAtNameToMid(String str) {
            str.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableAtNameToMidMap().remove(str);
            return this;
        }

        public C14691c removeEmotes(String str) {
            str.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableEmotesMap().remove(str);
            return this;
        }

        public C14691c removeMembers(String str) {
            str.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableMembersMap().remove(str);
            return this;
        }

        public C14691c removePictures(int i) {
            copyOnWrite();
            ((Content) this.instance).removePictures(i);
            return this;
        }

        public C14691c removeTopics(String str) {
            str.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableTopicsMap().remove(str);
            return this;
        }

        public C14691c removeUrls(String str) {
            str.getClass();
            copyOnWrite();
            ((Content) this.instance).getMutableUrlsMap().remove(str);
            return this;
        }

        public C14691c setMessage(String str) {
            copyOnWrite();
            ((Content) this.instance).setMessage(str);
            return this;
        }

        public C14691c setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((Content) this.instance).setMessageBytes(byteString);
            return this;
        }

        public C14691c setPictureScale(double d) {
            copyOnWrite();
            ((Content) this.instance).setPictureScale(d);
            return this;
        }

        public C14691c setPictures(int i, Picture picture) {
            copyOnWrite();
            ((Content) this.instance).setPictures(i, picture);
            return this;
        }

        public C14691c setRichText(RichText richText) {
            copyOnWrite();
            ((Content) this.instance).setRichText(richText);
            return this;
        }

        public C14691c setVote(Vote vote) {
            copyOnWrite();
            ((Content) this.instance).setVote(vote);
            return this;
        }

        private C14691c() {
            super(Content.DEFAULT_INSTANCE);
        }

        public C14691c addPictures(int i, Picture picture) {
            copyOnWrite();
            ((Content) this.instance).addPictures(i, picture);
            return this;
        }

        public C14691c setPictures(int i, Picture.C14790b c14790b) {
            copyOnWrite();
            ((Content) this.instance).setPictures(i, c14790b.build());
            return this;
        }

        public C14691c setRichText(RichText.C14829b c14829b) {
            copyOnWrite();
            ((Content) this.instance).setRichText(c14829b.build());
            return this;
        }

        public C14691c setVote(Vote.C14908b c14908b) {
            copyOnWrite();
            ((Content) this.instance).setVote(c14908b.build());
            return this;
        }

        public C14691c addPictures(Picture.C14790b c14790b) {
            copyOnWrite();
            ((Content) this.instance).addPictures(c14790b.build());
            return this;
        }

        public C14691c addPictures(int i, Picture.C14790b c14790b) {
            copyOnWrite();
            ((Content) this.instance).addPictures(i, c14790b.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Content$d */
    /* loaded from: classes21.dex */
    private static final class C14692d {
        static final MapEntryLite<String, Emote> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Emote.getDefaultInstance());

        private C14692d() {
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Content$e */
    /* loaded from: classes21.dex */
    private static final class C14693e {
        static final MapEntryLite<String, Member> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Member.getDefaultInstance());

        private C14693e() {
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Content$f */
    /* loaded from: classes21.dex */
    private static final class C14694f {
        static final MapEntryLite<String, Topic> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Topic.getDefaultInstance());

        private C14694f() {
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Content$g */
    /* loaded from: classes21.dex */
    private static final class C14695g {
        static final MapEntryLite<String, Url> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Url.getDefaultInstance());

        private C14695g() {
        }
    }

    static {
        Content content = new Content();
        DEFAULT_INSTANCE = content;
        GeneratedMessageLite.registerDefaultInstance(Content.class, content);
    }

    private Content() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPictures(Iterable<? extends Picture> iterable) {
        ensurePicturesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pictures_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPictures(Picture picture) {
        picture.getClass();
        ensurePicturesIsMutable();
        this.pictures_.add(picture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPictureScale() {
        this.pictureScale_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPictures() {
        this.pictures_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRichText() {
        this.richText_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVote() {
        this.vote_ = null;
    }

    private void ensurePicturesIsMutable() {
        Internal.ProtobufList<Picture> protobufList = this.pictures_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.pictures_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Content getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableAtNameToMidMap() {
        return internalGetMutableAtNameToMid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Emote> getMutableEmotesMap() {
        return internalGetMutableEmotes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Member> getMutableMembersMap() {
        return internalGetMutableMembers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Topic> getMutableTopicsMap() {
        return internalGetMutableTopics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Url> getMutableUrlsMap() {
        return internalGetMutableUrls();
    }

    private MapFieldLite<String, Long> internalGetAtNameToMid() {
        return this.atNameToMid_;
    }

    private MapFieldLite<String, Emote> internalGetEmotes() {
        return this.emotes_;
    }

    private MapFieldLite<String, Member> internalGetMembers() {
        return this.members_;
    }

    private MapFieldLite<String, Long> internalGetMutableAtNameToMid() {
        if (!this.atNameToMid_.isMutable()) {
            this.atNameToMid_ = this.atNameToMid_.mutableCopy();
        }
        return this.atNameToMid_;
    }

    private MapFieldLite<String, Emote> internalGetMutableEmotes() {
        if (!this.emotes_.isMutable()) {
            this.emotes_ = this.emotes_.mutableCopy();
        }
        return this.emotes_;
    }

    private MapFieldLite<String, Member> internalGetMutableMembers() {
        if (!this.members_.isMutable()) {
            this.members_ = this.members_.mutableCopy();
        }
        return this.members_;
    }

    private MapFieldLite<String, Topic> internalGetMutableTopics() {
        if (!this.topics_.isMutable()) {
            this.topics_ = this.topics_.mutableCopy();
        }
        return this.topics_;
    }

    private MapFieldLite<String, Url> internalGetMutableUrls() {
        if (!this.urls_.isMutable()) {
            this.urls_ = this.urls_.mutableCopy();
        }
        return this.urls_;
    }

    private MapFieldLite<String, Topic> internalGetTopics() {
        return this.topics_;
    }

    private MapFieldLite<String, Url> internalGetUrls() {
        return this.urls_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRichText(RichText richText) {
        richText.getClass();
        RichText richText2 = this.richText_;
        if (richText2 != null && richText2 != RichText.getDefaultInstance()) {
            this.richText_ = RichText.newBuilder(this.richText_).mergeFrom((RichText) richText).buildPartial();
        } else {
            this.richText_ = richText;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVote(Vote vote) {
        vote.getClass();
        Vote vote2 = this.vote_;
        if (vote2 != null && vote2 != Vote.getDefaultInstance()) {
            this.vote_ = Vote.newBuilder(this.vote_).mergeFrom((Vote) vote).buildPartial();
        } else {
            this.vote_ = vote;
        }
    }

    public static C14691c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Content> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePictures(int i) {
        ensurePicturesIsMutable();
        this.pictures_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictureScale(double d) {
        this.pictureScale_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPictures(int i, Picture picture) {
        picture.getClass();
        ensurePicturesIsMutable();
        this.pictures_.set(i, picture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRichText(RichText richText) {
        richText.getClass();
        this.richText_ = richText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVote(Vote vote) {
        vote.getClass();
        this.vote_ = vote;
    }

    public boolean containsAtNameToMid(String str) {
        str.getClass();
        return internalGetAtNameToMid().containsKey(str);
    }

    public boolean containsEmotes(String str) {
        str.getClass();
        return internalGetEmotes().containsKey(str);
    }

    public boolean containsMembers(String str) {
        str.getClass();
        return internalGetMembers().containsKey(str);
    }

    public boolean containsTopics(String str) {
        str.getClass();
        return internalGetTopics().containsKey(str);
    }

    public boolean containsUrls(String str) {
        str.getClass();
        return internalGetUrls().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14689a.f21985xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Content();
            case 2:
                return new C14691c(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0005\u0001\u0000\u0001\u0208\u00022\u00032\u00042\u00052\u0006\t\u00072\b\t\t\u001b\n\u0000", new Object[]{"message_", "members_", C14693e.defaultEntry, "emotes_", C14692d.defaultEntry, "topics_", C14694f.defaultEntry, "urls_", C14695g.defaultEntry, "vote_", "atNameToMid_", C14690b.defaultEntry, "richText_", "pictures_", Picture.class, "pictureScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Content> parser = PARSER;
                if (parser == null) {
                    synchronized (Content.class) {
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

    @Deprecated
    public Map<String, Long> getAtNameToMid() {
        return getAtNameToMidMap();
    }

    public int getAtNameToMidCount() {
        return internalGetAtNameToMid().size();
    }

    public Map<String, Long> getAtNameToMidMap() {
        return Collections.unmodifiableMap(internalGetAtNameToMid());
    }

    public long getAtNameToMidOrDefault(String str, long j) {
        str.getClass();
        MapFieldLite<String, Long> internalGetAtNameToMid = internalGetAtNameToMid();
        return internalGetAtNameToMid.containsKey(str) ? internalGetAtNameToMid.get(str).longValue() : j;
    }

    public long getAtNameToMidOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Long> internalGetAtNameToMid = internalGetAtNameToMid();
        if (internalGetAtNameToMid.containsKey(str)) {
            return internalGetAtNameToMid.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, Emote> getEmotes() {
        return getEmotesMap();
    }

    public int getEmotesCount() {
        return internalGetEmotes().size();
    }

    public Map<String, Emote> getEmotesMap() {
        return Collections.unmodifiableMap(internalGetEmotes());
    }

    public Emote getEmotesOrDefault(String str, Emote emote) {
        str.getClass();
        MapFieldLite<String, Emote> internalGetEmotes = internalGetEmotes();
        return internalGetEmotes.containsKey(str) ? internalGetEmotes.get(str) : emote;
    }

    public Emote getEmotesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Emote> internalGetEmotes = internalGetEmotes();
        if (internalGetEmotes.containsKey(str)) {
            return internalGetEmotes.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, Member> getMembers() {
        return getMembersMap();
    }

    public int getMembersCount() {
        return internalGetMembers().size();
    }

    public Map<String, Member> getMembersMap() {
        return Collections.unmodifiableMap(internalGetMembers());
    }

    public Member getMembersOrDefault(String str, Member member) {
        str.getClass();
        MapFieldLite<String, Member> internalGetMembers = internalGetMembers();
        return internalGetMembers.containsKey(str) ? internalGetMembers.get(str) : member;
    }

    public Member getMembersOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Member> internalGetMembers = internalGetMembers();
        if (internalGetMembers.containsKey(str)) {
            return internalGetMembers.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public double getPictureScale() {
        return this.pictureScale_;
    }

    public Picture getPictures(int i) {
        return this.pictures_.get(i);
    }

    public int getPicturesCount() {
        return this.pictures_.size();
    }

    public List<Picture> getPicturesList() {
        return this.pictures_;
    }

    public InterfaceC14916d getPicturesOrBuilder(int i) {
        return this.pictures_.get(i);
    }

    public List<? extends InterfaceC14916d> getPicturesOrBuilderList() {
        return this.pictures_;
    }

    public RichText getRichText() {
        RichText richText = this.richText_;
        return richText == null ? RichText.getDefaultInstance() : richText;
    }

    @Deprecated
    public Map<String, Topic> getTopics() {
        return getTopicsMap();
    }

    public int getTopicsCount() {
        return internalGetTopics().size();
    }

    public Map<String, Topic> getTopicsMap() {
        return Collections.unmodifiableMap(internalGetTopics());
    }

    public Topic getTopicsOrDefault(String str, Topic topic) {
        str.getClass();
        MapFieldLite<String, Topic> internalGetTopics = internalGetTopics();
        return internalGetTopics.containsKey(str) ? internalGetTopics.get(str) : topic;
    }

    public Topic getTopicsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Topic> internalGetTopics = internalGetTopics();
        if (internalGetTopics.containsKey(str)) {
            return internalGetTopics.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, Url> getUrls() {
        return getUrlsMap();
    }

    public int getUrlsCount() {
        return internalGetUrls().size();
    }

    public Map<String, Url> getUrlsMap() {
        return Collections.unmodifiableMap(internalGetUrls());
    }

    public Url getUrlsOrDefault(String str, Url url) {
        str.getClass();
        MapFieldLite<String, Url> internalGetUrls = internalGetUrls();
        return internalGetUrls.containsKey(str) ? internalGetUrls.get(str) : url;
    }

    public Url getUrlsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Url> internalGetUrls = internalGetUrls();
        if (internalGetUrls.containsKey(str)) {
            return internalGetUrls.get(str);
        }
        throw new IllegalArgumentException();
    }

    public Vote getVote() {
        Vote vote = this.vote_;
        return vote == null ? Vote.getDefaultInstance() : vote;
    }

    public boolean hasRichText() {
        return this.richText_ != null;
    }

    public boolean hasVote() {
        return this.vote_ != null;
    }

    public static C14691c newBuilder(Content content) {
        return DEFAULT_INSTANCE.createBuilder(content);
    }

    public static Content parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Content parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPictures(int i, Picture picture) {
        picture.getClass();
        ensurePicturesIsMutable();
        this.pictures_.add(i, picture);
    }

    public static Content parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Content parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Content parseFrom(InputStream inputStream) throws IOException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Content parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Content parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Content parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
