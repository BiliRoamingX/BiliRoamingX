package com.bapis.bilibili.main.community.reply.v2;

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
/* loaded from: classes18.dex */
public final class SubjectDescriptionReply extends GeneratedMessageLite<SubjectDescriptionReply, SubjectDescriptionReply.Builder> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final SubjectDescriptionReply DEFAULT_INSTANCE;
    public static final int EMOTE_FIELD_NUMBER = 3;
    public static final int EMPTY_PAGE_FIELD_NUMBER = 4;
    public static final int INPUT_FIELD_NUMBER = 2;
    private static volatile Parser<SubjectDescriptionReply> PARSER = null;
    public static final int PRELOAD_RES_URLS_FIELD_NUMBER = 6;
    public static final int SUPPORT_FILTER_TAGS_FIELD_NUMBER = 5;
    public static final int UP_MID_FIELD_NUMBER = 8;
    public static final int USER_CALLBACKS_FIELD_NUMBER = 7;
    private long count_;
    private EmoteConfig emote_;
    private EmptyPage emptyPage_;
    private InputConfig input_;
    private long upMid_;
    private Internal.ProtobufList<FilterTag> supportFilterTags_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> preloadResUrls_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<UserCallback> userCallbacks_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C80021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17762xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17762xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17762xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17762xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17762xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17762xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17762xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17762xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SubjectDescriptionReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C80021 c80021) {
            this();
        }

        public Builder addAllPreloadResUrls(Iterable<String> iterable) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addAllPreloadResUrls(iterable);
            return this;
        }

        public Builder addAllSupportFilterTags(Iterable<? extends FilterTag> iterable) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addAllSupportFilterTags(iterable);
            return this;
        }

        public Builder addAllUserCallbacks(Iterable<? extends UserCallback> iterable) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addAllUserCallbacks(iterable);
            return this;
        }

        public Builder addPreloadResUrls(String str) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addPreloadResUrls(str);
            return this;
        }

        public Builder addPreloadResUrlsBytes(ByteString byteString) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addPreloadResUrlsBytes(byteString);
            return this;
        }

        public Builder addSupportFilterTags(FilterTag filterTag) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addSupportFilterTags(filterTag);
            return this;
        }

        public Builder addUserCallbacks(UserCallback userCallback) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addUserCallbacks(userCallback);
            return this;
        }

        public Builder clearCount() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearCount();
            return this;
        }

        public Builder clearEmote() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearEmote();
            return this;
        }

        public Builder clearEmptyPage() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearEmptyPage();
            return this;
        }

        public Builder clearInput() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearInput();
            return this;
        }

        public Builder clearPreloadResUrls() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearPreloadResUrls();
            return this;
        }

        public Builder clearSupportFilterTags() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearSupportFilterTags();
            return this;
        }

        public Builder clearUpMid() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearUpMid();
            return this;
        }

        public Builder clearUserCallbacks() {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).clearUserCallbacks();
            return this;
        }

        public long getCount() {
            return ((SubjectDescriptionReply) this.instance).getCount();
        }

        public EmoteConfig getEmote() {
            return ((SubjectDescriptionReply) this.instance).getEmote();
        }

        public EmptyPage getEmptyPage() {
            return ((SubjectDescriptionReply) this.instance).getEmptyPage();
        }

        public InputConfig getInput() {
            return ((SubjectDescriptionReply) this.instance).getInput();
        }

        public String getPreloadResUrls(int i) {
            return ((SubjectDescriptionReply) this.instance).getPreloadResUrls(i);
        }

        public ByteString getPreloadResUrlsBytes(int i) {
            return ((SubjectDescriptionReply) this.instance).getPreloadResUrlsBytes(i);
        }

        public int getPreloadResUrlsCount() {
            return ((SubjectDescriptionReply) this.instance).getPreloadResUrlsCount();
        }

        public List<String> getPreloadResUrlsList() {
            return Collections.unmodifiableList(((SubjectDescriptionReply) this.instance).getPreloadResUrlsList());
        }

        public FilterTag getSupportFilterTags(int i) {
            return ((SubjectDescriptionReply) this.instance).getSupportFilterTags(i);
        }

        public int getSupportFilterTagsCount() {
            return ((SubjectDescriptionReply) this.instance).getSupportFilterTagsCount();
        }

        public List<FilterTag> getSupportFilterTagsList() {
            return Collections.unmodifiableList(((SubjectDescriptionReply) this.instance).getSupportFilterTagsList());
        }

        public long getUpMid() {
            return ((SubjectDescriptionReply) this.instance).getUpMid();
        }

        public UserCallback getUserCallbacks(int i) {
            return ((SubjectDescriptionReply) this.instance).getUserCallbacks(i);
        }

        public int getUserCallbacksCount() {
            return ((SubjectDescriptionReply) this.instance).getUserCallbacksCount();
        }

        public List<UserCallback> getUserCallbacksList() {
            return Collections.unmodifiableList(((SubjectDescriptionReply) this.instance).getUserCallbacksList());
        }

        public boolean hasEmote() {
            return ((SubjectDescriptionReply) this.instance).hasEmote();
        }

        public boolean hasEmptyPage() {
            return ((SubjectDescriptionReply) this.instance).hasEmptyPage();
        }

        public boolean hasInput() {
            return ((SubjectDescriptionReply) this.instance).hasInput();
        }

        public Builder mergeEmote(EmoteConfig emoteConfig) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).mergeEmote(emoteConfig);
            return this;
        }

        public Builder mergeEmptyPage(EmptyPage emptyPage) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).mergeEmptyPage(emptyPage);
            return this;
        }

        public Builder mergeInput(InputConfig inputConfig) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).mergeInput(inputConfig);
            return this;
        }

        public Builder removeSupportFilterTags(int i) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).removeSupportFilterTags(i);
            return this;
        }

        public Builder removeUserCallbacks(int i) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).removeUserCallbacks(i);
            return this;
        }

        public Builder setCount(long j) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setCount(j);
            return this;
        }

        public Builder setEmote(EmoteConfig emoteConfig) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setEmote(emoteConfig);
            return this;
        }

        public Builder setEmptyPage(EmptyPage emptyPage) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setEmptyPage(emptyPage);
            return this;
        }

        public Builder setInput(InputConfig inputConfig) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setInput(inputConfig);
            return this;
        }

        public Builder setPreloadResUrls(int i, String str) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setPreloadResUrls(i, str);
            return this;
        }

        public Builder setSupportFilterTags(int i, FilterTag filterTag) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setSupportFilterTags(i, filterTag);
            return this;
        }

        public Builder setUpMid(long j) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setUpMid(j);
            return this;
        }

        public Builder setUserCallbacks(int i, UserCallback userCallback) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setUserCallbacks(i, userCallback);
            return this;
        }

        private Builder() {
            super(SubjectDescriptionReply.DEFAULT_INSTANCE);
        }

        public Builder addSupportFilterTags(int i, FilterTag filterTag) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addSupportFilterTags(i, filterTag);
            return this;
        }

        public Builder addUserCallbacks(int i, UserCallback userCallback) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addUserCallbacks(i, userCallback);
            return this;
        }

        public Builder setEmote(EmoteConfig.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setEmote(builder.build());
            return this;
        }

        public Builder setEmptyPage(EmptyPage.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setEmptyPage(builder.build());
            return this;
        }

        public Builder setInput(InputConfig.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setInput(builder.build());
            return this;
        }

        public Builder setSupportFilterTags(int i, FilterTag.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setSupportFilterTags(i, builder.build());
            return this;
        }

        public Builder setUserCallbacks(int i, UserCallback.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).setUserCallbacks(i, builder.build());
            return this;
        }

        public Builder addSupportFilterTags(FilterTag.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addSupportFilterTags(builder.build());
            return this;
        }

        public Builder addUserCallbacks(UserCallback.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addUserCallbacks(builder.build());
            return this;
        }

        public Builder addSupportFilterTags(int i, FilterTag.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addSupportFilterTags(i, builder.build());
            return this;
        }

        public Builder addUserCallbacks(int i, UserCallback.Builder builder) {
            copyOnWrite();
            ((SubjectDescriptionReply) this.instance).addUserCallbacks(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class EmoteConfig extends GeneratedMessageLite<EmoteConfig, EmoteConfig.Builder> implements MessageLiteOrBuilder {
        private static final EmoteConfig DEFAULT_INSTANCE;
        public static final int JUMP_EMOTE_DISABLED_FIELD_NUMBER = 1;
        private static volatile Parser<EmoteConfig> PARSER = null;
        public static final int SUGGEST_EMOTES_FIELD_NUMBER = 2;
        private boolean jumpEmoteDisabled_;
        private Internal.ProtobufList<Emote> suggestEmotes_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<EmoteConfig, Builder> implements MessageLiteOrBuilder {
            /* synthetic */ Builder(C80021 c80021) {
                this();
            }

            public Builder addAllSuggestEmotes(Iterable<? extends Emote> iterable) {
                copyOnWrite();
                ((EmoteConfig) this.instance).addAllSuggestEmotes(iterable);
                return this;
            }

            public Builder addSuggestEmotes(Emote emote) {
                copyOnWrite();
                ((EmoteConfig) this.instance).addSuggestEmotes(emote);
                return this;
            }

            public Builder clearJumpEmoteDisabled() {
                copyOnWrite();
                ((EmoteConfig) this.instance).clearJumpEmoteDisabled();
                return this;
            }

            public Builder clearSuggestEmotes() {
                copyOnWrite();
                ((EmoteConfig) this.instance).clearSuggestEmotes();
                return this;
            }

            public boolean getJumpEmoteDisabled() {
                return ((EmoteConfig) this.instance).getJumpEmoteDisabled();
            }

            public Emote getSuggestEmotes(int i) {
                return ((EmoteConfig) this.instance).getSuggestEmotes(i);
            }

            public int getSuggestEmotesCount() {
                return ((EmoteConfig) this.instance).getSuggestEmotesCount();
            }

            public List<Emote> getSuggestEmotesList() {
                return Collections.unmodifiableList(((EmoteConfig) this.instance).getSuggestEmotesList());
            }

            public Builder removeSuggestEmotes(int i) {
                copyOnWrite();
                ((EmoteConfig) this.instance).removeSuggestEmotes(i);
                return this;
            }

            public Builder setJumpEmoteDisabled(boolean z) {
                copyOnWrite();
                ((EmoteConfig) this.instance).setJumpEmoteDisabled(z);
                return this;
            }

            public Builder setSuggestEmotes(int i, Emote emote) {
                copyOnWrite();
                ((EmoteConfig) this.instance).setSuggestEmotes(i, emote);
                return this;
            }

            private Builder() {
                super(EmoteConfig.DEFAULT_INSTANCE);
            }

            public Builder addSuggestEmotes(int i, Emote emote) {
                copyOnWrite();
                ((EmoteConfig) this.instance).addSuggestEmotes(i, emote);
                return this;
            }

            public Builder setSuggestEmotes(int i, Emote.Builder builder) {
                copyOnWrite();
                ((EmoteConfig) this.instance).setSuggestEmotes(i, builder.build());
                return this;
            }

            public Builder addSuggestEmotes(Emote.Builder builder) {
                copyOnWrite();
                ((EmoteConfig) this.instance).addSuggestEmotes(builder.build());
                return this;
            }

            public Builder addSuggestEmotes(int i, Emote.Builder builder) {
                copyOnWrite();
                ((EmoteConfig) this.instance).addSuggestEmotes(i, builder.build());
                return this;
            }
        }

        static {
            EmoteConfig emoteConfig = new EmoteConfig();
            DEFAULT_INSTANCE = emoteConfig;
            GeneratedMessageLite.registerDefaultInstance(EmoteConfig.class, emoteConfig);
        }

        private EmoteConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSuggestEmotes(Iterable<? extends Emote> iterable) {
            ensureSuggestEmotesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.suggestEmotes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSuggestEmotes(Emote emote) {
            emote.getClass();
            ensureSuggestEmotesIsMutable();
            this.suggestEmotes_.add(emote);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJumpEmoteDisabled() {
            this.jumpEmoteDisabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSuggestEmotes() {
            this.suggestEmotes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSuggestEmotesIsMutable() {
            Internal.ProtobufList<Emote> protobufList = this.suggestEmotes_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.suggestEmotes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static EmoteConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EmoteConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EmoteConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmoteConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EmoteConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSuggestEmotes(int i) {
            ensureSuggestEmotesIsMutable();
            this.suggestEmotes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJumpEmoteDisabled(boolean z) {
            this.jumpEmoteDisabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSuggestEmotes(int i, Emote emote) {
            emote.getClass();
            ensureSuggestEmotesIsMutable();
            this.suggestEmotes_.set(i, emote);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C80021.f17762xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmoteConfig();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002\u001b", new Object[]{"jumpEmoteDisabled_", "suggestEmotes_", Emote.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EmoteConfig> parser = PARSER;
                    if (parser == null) {
                        synchronized (EmoteConfig.class) {
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

        public boolean getJumpEmoteDisabled() {
            return this.jumpEmoteDisabled_;
        }

        public Emote getSuggestEmotes(int i) {
            return this.suggestEmotes_.get(i);
        }

        public int getSuggestEmotesCount() {
            return this.suggestEmotes_.size();
        }

        public List<Emote> getSuggestEmotesList() {
            return this.suggestEmotes_;
        }

        public EmoteOrBuilder getSuggestEmotesOrBuilder(int i) {
            return this.suggestEmotes_.get(i);
        }

        public List<? extends EmoteOrBuilder> getSuggestEmotesOrBuilderList() {
            return this.suggestEmotes_;
        }

        public static Builder newBuilder(EmoteConfig emoteConfig) {
            return DEFAULT_INSTANCE.createBuilder(emoteConfig);
        }

        public static EmoteConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EmoteConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmoteConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EmoteConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSuggestEmotes(int i, Emote emote) {
            emote.getClass();
            ensureSuggestEmotesIsMutable();
            this.suggestEmotes_.add(i, emote);
        }

        public static EmoteConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EmoteConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EmoteConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EmoteConfig parseFrom(InputStream inputStream) throws IOException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmoteConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmoteConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EmoteConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EmoteConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class FilterTag extends GeneratedMessageLite<FilterTag, FilterTag.Builder> implements FilterTagOrBuilder {
        private static final FilterTag DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile Parser<FilterTag> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 2;
        private long id_;
        private String title_ = "";
        private String eventId_ = "";

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<FilterTag, Builder> implements FilterTagOrBuilder {
            /* synthetic */ Builder(C80021 c80021) {
                this();
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((FilterTag) this.instance).clearEventId();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((FilterTag) this.instance).clearId();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((FilterTag) this.instance).clearTitle();
                return this;
            }

            @Override
            // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
            public String getEventId() {
                return ((FilterTag) this.instance).getEventId();
            }

            @Override
            // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
            public ByteString getEventIdBytes() {
                return ((FilterTag) this.instance).getEventIdBytes();
            }

            @Override
            // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
            public long getId() {
                return ((FilterTag) this.instance).getId();
            }

            @Override
            // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
            public String getTitle() {
                return ((FilterTag) this.instance).getTitle();
            }

            @Override
            // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
            public ByteString getTitleBytes() {
                return ((FilterTag) this.instance).getTitleBytes();
            }

            public Builder setEventId(String str) {
                copyOnWrite();
                ((FilterTag) this.instance).setEventId(str);
                return this;
            }

            public Builder setEventIdBytes(ByteString byteString) {
                copyOnWrite();
                ((FilterTag) this.instance).setEventIdBytes(byteString);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((FilterTag) this.instance).setId(j);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((FilterTag) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                copyOnWrite();
                ((FilterTag) this.instance).setTitleBytes(byteString);
                return this;
            }

            private Builder() {
                super(FilterTag.DEFAULT_INSTANCE);
            }
        }

        static {
            FilterTag filterTag = new FilterTag();
            DEFAULT_INSTANCE = filterTag;
            GeneratedMessageLite.registerDefaultInstance(FilterTag.class, filterTag);
        }

        private FilterTag() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static FilterTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FilterTag parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FilterTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FilterTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FilterTag> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(String str) {
            str.getClass();
            this.eventId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long j) {
            this.id_ = j;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C80021.f17762xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new FilterTag();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208", new Object[]{"id_", "title_", "eventId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FilterTag> parser = PARSER;
                    if (parser == null) {
                        synchronized (FilterTag.class) {
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

        @Override
        // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
        public String getEventId() {
            return this.eventId_;
        }

        @Override
        // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
        public ByteString getEventIdBytes() {
            return ByteString.copyFromUtf8(this.eventId_);
        }

        @Override
        // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override
        // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override
        // com.bapis.bilibili.main.community.reply.v2.SubjectDescriptionReply.FilterTagOrBuilder
        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.title_);
        }

        public static Builder newBuilder(FilterTag filterTag) {
            return DEFAULT_INSTANCE.createBuilder(filterTag);
        }

        public static FilterTag parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FilterTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FilterTag parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FilterTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FilterTag parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FilterTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FilterTag parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FilterTag parseFrom(InputStream inputStream) throws IOException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FilterTag parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FilterTag parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FilterTag parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FilterTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public interface FilterTagOrBuilder extends MessageLiteOrBuilder {
        String getEventId();

        ByteString getEventIdBytes();

        long getId();

        String getTitle();

        ByteString getTitleBytes();
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class InputConfig extends GeneratedMessageLite<InputConfig, InputConfig.Builder> implements MessageLiteOrBuilder {
        public static final int CHILD_TEXT_FIELD_NUMBER = 3;
        private static final InputConfig DEFAULT_INSTANCE;
        public static final int DISABLED_FIELD_NUMBER = 1;
        public static final int EDITOR_ICON_CONFIG_FIELD_NUMBER = 5;
        public static final int GIVE_UP_TEXT_FIELD_NUMBER = 4;
        private static volatile Parser<InputConfig> PARSER = null;
        public static final int ROOT_TEXT_FIELD_NUMBER = 2;
        private boolean disabled_;
        private EditorIconConfig editorIconConfig_;
        private String rootText_ = "";
        private String childText_ = "";
        private String giveUpText_ = "";

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<InputConfig, Builder> implements MessageLiteOrBuilder {
            /* synthetic */ Builder(C80021 c80021) {
                this();
            }

            public Builder clearChildText() {
                copyOnWrite();
                ((InputConfig) this.instance).clearChildText();
                return this;
            }

            public Builder clearDisabled() {
                copyOnWrite();
                ((InputConfig) this.instance).clearDisabled();
                return this;
            }

            public Builder clearEditorIconConfig() {
                copyOnWrite();
                ((InputConfig) this.instance).clearEditorIconConfig();
                return this;
            }

            public Builder clearGiveUpText() {
                copyOnWrite();
                ((InputConfig) this.instance).clearGiveUpText();
                return this;
            }

            public Builder clearRootText() {
                copyOnWrite();
                ((InputConfig) this.instance).clearRootText();
                return this;
            }

            public String getChildText() {
                return ((InputConfig) this.instance).getChildText();
            }

            public ByteString getChildTextBytes() {
                return ((InputConfig) this.instance).getChildTextBytes();
            }

            public boolean getDisabled() {
                return ((InputConfig) this.instance).getDisabled();
            }

            public EditorIconConfig getEditorIconConfig() {
                return ((InputConfig) this.instance).getEditorIconConfig();
            }

            public String getGiveUpText() {
                return ((InputConfig) this.instance).getGiveUpText();
            }

            public ByteString getGiveUpTextBytes() {
                return ((InputConfig) this.instance).getGiveUpTextBytes();
            }

            public String getRootText() {
                return ((InputConfig) this.instance).getRootText();
            }

            public ByteString getRootTextBytes() {
                return ((InputConfig) this.instance).getRootTextBytes();
            }

            public boolean hasEditorIconConfig() {
                return ((InputConfig) this.instance).hasEditorIconConfig();
            }

            public Builder mergeEditorIconConfig(EditorIconConfig editorIconConfig) {
                copyOnWrite();
                ((InputConfig) this.instance).mergeEditorIconConfig(editorIconConfig);
                return this;
            }

            public Builder setChildText(String str) {
                copyOnWrite();
                ((InputConfig) this.instance).setChildText(str);
                return this;
            }

            public Builder setChildTextBytes(ByteString byteString) {
                copyOnWrite();
                ((InputConfig) this.instance).setChildTextBytes(byteString);
                return this;
            }

            public Builder setDisabled(boolean z) {
                copyOnWrite();
                ((InputConfig) this.instance).setDisabled(z);
                return this;
            }

            public Builder setEditorIconConfig(EditorIconConfig editorIconConfig) {
                copyOnWrite();
                ((InputConfig) this.instance).setEditorIconConfig(editorIconConfig);
                return this;
            }

            public Builder setGiveUpText(String str) {
                copyOnWrite();
                ((InputConfig) this.instance).setGiveUpText(str);
                return this;
            }

            public Builder setGiveUpTextBytes(ByteString byteString) {
                copyOnWrite();
                ((InputConfig) this.instance).setGiveUpTextBytes(byteString);
                return this;
            }

            public Builder setRootText(String str) {
                copyOnWrite();
                ((InputConfig) this.instance).setRootText(str);
                return this;
            }

            public Builder setRootTextBytes(ByteString byteString) {
                copyOnWrite();
                ((InputConfig) this.instance).setRootTextBytes(byteString);
                return this;
            }

            private Builder() {
                super(InputConfig.DEFAULT_INSTANCE);
            }

            public Builder setEditorIconConfig(EditorIconConfig.Builder builder) {
                copyOnWrite();
                ((InputConfig) this.instance).setEditorIconConfig(builder.build());
                return this;
            }
        }

        /* compiled from: BL */
        /* loaded from: classes18.dex */
        public static final class EditorIconConfig extends GeneratedMessageLite<EditorIconConfig, EditorIconConfig.Builder> implements MessageLiteOrBuilder {
            public static final int CM_BIZ_HELPER_ICON_STATE_FIELD_NUMBER = 8;
            private static final EditorIconConfig DEFAULT_INSTANCE;
            public static final int ELEC_ICON_STATE_FIELD_NUMBER = 7;
            public static final int GOODS_ICON_STATE_FIELD_NUMBER = 5;
            public static final int INSERT_CONTENT_ICON_STATE_FIELD_NUMBER = 6;
            public static final int NOTE_ICON_STATE_FIELD_NUMBER = 4;
            private static volatile Parser<EditorIconConfig> PARSER = null;
            public static final int SCREENSHOT_ICON_STATE_FIELD_NUMBER = 1;
            public static final int UPLOAD_PICTURE_ICON_STATE_FIELD_NUMBER = 2;
            public static final int VOTE_ICON_STATE_FIELD_NUMBER = 3;
            private int cmBizHelperIconState_;
            private int elecIconState_;
            private int goodsIconState_;
            private int insertContentIconState_;
            private int noteIconState_;
            private int screenshotIconState_;
            private int uploadPictureIconState_;
            private int voteIconState_;

            /* compiled from: BL */
            /* loaded from: classes18.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<EditorIconConfig, Builder> implements MessageLiteOrBuilder {
                /* synthetic */ Builder(C80021 c80021) {
                    this();
                }

                public Builder clearCmBizHelperIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearCmBizHelperIconState();
                    return this;
                }

                public Builder clearElecIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearElecIconState();
                    return this;
                }

                public Builder clearGoodsIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearGoodsIconState();
                    return this;
                }

                public Builder clearInsertContentIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearInsertContentIconState();
                    return this;
                }

                public Builder clearNoteIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearNoteIconState();
                    return this;
                }

                public Builder clearScreenshotIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearScreenshotIconState();
                    return this;
                }

                public Builder clearUploadPictureIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearUploadPictureIconState();
                    return this;
                }

                public Builder clearVoteIconState() {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).clearVoteIconState();
                    return this;
                }

                public EditorIconState getCmBizHelperIconState() {
                    return ((EditorIconConfig) this.instance).getCmBizHelperIconState();
                }

                public int getCmBizHelperIconStateValue() {
                    return ((EditorIconConfig) this.instance).getCmBizHelperIconStateValue();
                }

                public EditorIconState getElecIconState() {
                    return ((EditorIconConfig) this.instance).getElecIconState();
                }

                public int getElecIconStateValue() {
                    return ((EditorIconConfig) this.instance).getElecIconStateValue();
                }

                public EditorIconState getGoodsIconState() {
                    return ((EditorIconConfig) this.instance).getGoodsIconState();
                }

                public int getGoodsIconStateValue() {
                    return ((EditorIconConfig) this.instance).getGoodsIconStateValue();
                }

                public EditorIconState getInsertContentIconState() {
                    return ((EditorIconConfig) this.instance).getInsertContentIconState();
                }

                public int getInsertContentIconStateValue() {
                    return ((EditorIconConfig) this.instance).getInsertContentIconStateValue();
                }

                public EditorIconState getNoteIconState() {
                    return ((EditorIconConfig) this.instance).getNoteIconState();
                }

                public int getNoteIconStateValue() {
                    return ((EditorIconConfig) this.instance).getNoteIconStateValue();
                }

                public EditorIconState getScreenshotIconState() {
                    return ((EditorIconConfig) this.instance).getScreenshotIconState();
                }

                public int getScreenshotIconStateValue() {
                    return ((EditorIconConfig) this.instance).getScreenshotIconStateValue();
                }

                public EditorIconState getUploadPictureIconState() {
                    return ((EditorIconConfig) this.instance).getUploadPictureIconState();
                }

                public int getUploadPictureIconStateValue() {
                    return ((EditorIconConfig) this.instance).getUploadPictureIconStateValue();
                }

                public EditorIconState getVoteIconState() {
                    return ((EditorIconConfig) this.instance).getVoteIconState();
                }

                public int getVoteIconStateValue() {
                    return ((EditorIconConfig) this.instance).getVoteIconStateValue();
                }

                public Builder setCmBizHelperIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setCmBizHelperIconState(editorIconState);
                    return this;
                }

                public Builder setCmBizHelperIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setCmBizHelperIconStateValue(i);
                    return this;
                }

                public Builder setElecIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setElecIconState(editorIconState);
                    return this;
                }

                public Builder setElecIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setElecIconStateValue(i);
                    return this;
                }

                public Builder setGoodsIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setGoodsIconState(editorIconState);
                    return this;
                }

                public Builder setGoodsIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setGoodsIconStateValue(i);
                    return this;
                }

                public Builder setInsertContentIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setInsertContentIconState(editorIconState);
                    return this;
                }

                public Builder setInsertContentIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setInsertContentIconStateValue(i);
                    return this;
                }

                public Builder setNoteIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setNoteIconState(editorIconState);
                    return this;
                }

                public Builder setNoteIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setNoteIconStateValue(i);
                    return this;
                }

                public Builder setScreenshotIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setScreenshotIconState(editorIconState);
                    return this;
                }

                public Builder setScreenshotIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setScreenshotIconStateValue(i);
                    return this;
                }

                public Builder setUploadPictureIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setUploadPictureIconState(editorIconState);
                    return this;
                }

                public Builder setUploadPictureIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setUploadPictureIconStateValue(i);
                    return this;
                }

                public Builder setVoteIconState(EditorIconState editorIconState) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setVoteIconState(editorIconState);
                    return this;
                }

                public Builder setVoteIconStateValue(int i) {
                    copyOnWrite();
                    ((EditorIconConfig) this.instance).setVoteIconStateValue(i);
                    return this;
                }

                private Builder() {
                    super(EditorIconConfig.DEFAULT_INSTANCE);
                }
            }

            static {
                EditorIconConfig editorIconConfig = new EditorIconConfig();
                DEFAULT_INSTANCE = editorIconConfig;
                GeneratedMessageLite.registerDefaultInstance(EditorIconConfig.class, editorIconConfig);
            }

            private EditorIconConfig() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCmBizHelperIconState() {
                this.cmBizHelperIconState_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearElecIconState() {
                this.elecIconState_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGoodsIconState() {
                this.goodsIconState_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInsertContentIconState() {
                this.insertContentIconState_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNoteIconState() {
                this.noteIconState_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScreenshotIconState() {
                this.screenshotIconState_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUploadPictureIconState() {
                this.uploadPictureIconState_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVoteIconState() {
                this.voteIconState_ = 0;
            }

            public static EditorIconConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static EditorIconConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EditorIconConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditorIconConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EditorIconConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCmBizHelperIconState(EditorIconState editorIconState) {
                this.cmBizHelperIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCmBizHelperIconStateValue(int i) {
                this.cmBizHelperIconState_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setElecIconState(EditorIconState editorIconState) {
                this.elecIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setElecIconStateValue(int i) {
                this.elecIconState_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGoodsIconState(EditorIconState editorIconState) {
                this.goodsIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGoodsIconStateValue(int i) {
                this.goodsIconState_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInsertContentIconState(EditorIconState editorIconState) {
                this.insertContentIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInsertContentIconStateValue(int i) {
                this.insertContentIconState_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNoteIconState(EditorIconState editorIconState) {
                this.noteIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNoteIconStateValue(int i) {
                this.noteIconState_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScreenshotIconState(EditorIconState editorIconState) {
                this.screenshotIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScreenshotIconStateValue(int i) {
                this.screenshotIconState_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUploadPictureIconState(EditorIconState editorIconState) {
                this.uploadPictureIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUploadPictureIconStateValue(int i) {
                this.uploadPictureIconState_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVoteIconState(EditorIconState editorIconState) {
                this.voteIconState_ = editorIconState.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVoteIconStateValue(int i) {
                this.voteIconState_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C80021.f17762xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new EditorIconConfig();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\f\b\f", new Object[]{"screenshotIconState_", "uploadPictureIconState_", "voteIconState_", "noteIconState_", "goodsIconState_", "insertContentIconState_", "elecIconState_", "cmBizHelperIconState_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EditorIconConfig> parser = PARSER;
                        if (parser == null) {
                            synchronized (EditorIconConfig.class) {
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

            public EditorIconState getCmBizHelperIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.cmBizHelperIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getCmBizHelperIconStateValue() {
                return this.cmBizHelperIconState_;
            }

            public EditorIconState getElecIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.elecIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getElecIconStateValue() {
                return this.elecIconState_;
            }

            public EditorIconState getGoodsIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.goodsIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getGoodsIconStateValue() {
                return this.goodsIconState_;
            }

            public EditorIconState getInsertContentIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.insertContentIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getInsertContentIconStateValue() {
                return this.insertContentIconState_;
            }

            public EditorIconState getNoteIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.noteIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getNoteIconStateValue() {
                return this.noteIconState_;
            }

            public EditorIconState getScreenshotIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.screenshotIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getScreenshotIconStateValue() {
                return this.screenshotIconState_;
            }

            public EditorIconState getUploadPictureIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.uploadPictureIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getUploadPictureIconStateValue() {
                return this.uploadPictureIconState_;
            }

            public EditorIconState getVoteIconState() {
                EditorIconState forNumber = EditorIconState.forNumber(this.voteIconState_);
                return forNumber == null ? EditorIconState.UNRECOGNIZED : forNumber;
            }

            public int getVoteIconStateValue() {
                return this.voteIconState_;
            }

            public static Builder newBuilder(EditorIconConfig editorIconConfig) {
                return DEFAULT_INSTANCE.createBuilder(editorIconConfig);
            }

            public static EditorIconConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EditorIconConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditorIconConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EditorIconConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EditorIconConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EditorIconConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EditorIconConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EditorIconConfig parseFrom(InputStream inputStream) throws IOException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditorIconConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditorIconConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EditorIconConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EditorIconConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            InputConfig inputConfig = new InputConfig();
            DEFAULT_INSTANCE = inputConfig;
            GeneratedMessageLite.registerDefaultInstance(InputConfig.class, inputConfig);
        }

        private InputConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChildText() {
            this.childText_ = getDefaultInstance().getChildText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisabled() {
            this.disabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditorIconConfig() {
            this.editorIconConfig_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGiveUpText() {
            this.giveUpText_ = getDefaultInstance().getGiveUpText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRootText() {
            this.rootText_ = getDefaultInstance().getRootText();
        }

        public static InputConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEditorIconConfig(EditorIconConfig editorIconConfig) {
            editorIconConfig.getClass();
            EditorIconConfig editorIconConfig2 = this.editorIconConfig_;
            if (editorIconConfig2 != null && editorIconConfig2 != EditorIconConfig.getDefaultInstance()) {
                this.editorIconConfig_ = EditorIconConfig.newBuilder(this.editorIconConfig_).mergeFrom((EditorIconConfig) editorIconConfig).buildPartial();
            } else {
                this.editorIconConfig_ = editorIconConfig;
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InputConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InputConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InputConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InputConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChildText(String str) {
            str.getClass();
            this.childText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChildTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.childText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisabled(boolean z) {
            this.disabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditorIconConfig(EditorIconConfig editorIconConfig) {
            editorIconConfig.getClass();
            this.editorIconConfig_ = editorIconConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiveUpText(String str) {
            str.getClass();
            this.giveUpText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGiveUpTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.giveUpText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRootText(String str) {
            str.getClass();
            this.rootText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRootTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rootText_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C80021.f17762xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new InputConfig();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0208\u0003\u0208\u0004\u0208\u0005\t", new Object[]{"disabled_", "rootText_", "childText_", "giveUpText_", "editorIconConfig_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InputConfig> parser = PARSER;
                    if (parser == null) {
                        synchronized (InputConfig.class) {
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

        public String getChildText() {
            return this.childText_;
        }

        public ByteString getChildTextBytes() {
            return ByteString.copyFromUtf8(this.childText_);
        }

        public boolean getDisabled() {
            return this.disabled_;
        }

        public EditorIconConfig getEditorIconConfig() {
            EditorIconConfig editorIconConfig = this.editorIconConfig_;
            return editorIconConfig == null ? EditorIconConfig.getDefaultInstance() : editorIconConfig;
        }

        public String getGiveUpText() {
            return this.giveUpText_;
        }

        public ByteString getGiveUpTextBytes() {
            return ByteString.copyFromUtf8(this.giveUpText_);
        }

        public String getRootText() {
            return this.rootText_;
        }

        public ByteString getRootTextBytes() {
            return ByteString.copyFromUtf8(this.rootText_);
        }

        public boolean hasEditorIconConfig() {
            return this.editorIconConfig_ != null;
        }

        public static Builder newBuilder(InputConfig inputConfig) {
            return DEFAULT_INSTANCE.createBuilder(inputConfig);
        }

        public static InputConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InputConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InputConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InputConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InputConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InputConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InputConfig parseFrom(InputStream inputStream) throws IOException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InputConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InputConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InputConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InputConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        SubjectDescriptionReply subjectDescriptionReply = new SubjectDescriptionReply();
        DEFAULT_INSTANCE = subjectDescriptionReply;
        GeneratedMessageLite.registerDefaultInstance(SubjectDescriptionReply.class, subjectDescriptionReply);
    }

    private SubjectDescriptionReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreloadResUrls(Iterable<String> iterable) {
        ensurePreloadResUrlsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.preloadResUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSupportFilterTags(Iterable<? extends FilterTag> iterable) {
        ensureSupportFilterTagsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.supportFilterTags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUserCallbacks(Iterable<? extends UserCallback> iterable) {
        ensureUserCallbacksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.userCallbacks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreloadResUrls(String str) {
        str.getClass();
        ensurePreloadResUrlsIsMutable();
        this.preloadResUrls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreloadResUrlsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePreloadResUrlsIsMutable();
        this.preloadResUrls_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSupportFilterTags(FilterTag filterTag) {
        filterTag.getClass();
        ensureSupportFilterTagsIsMutable();
        this.supportFilterTags_.add(filterTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserCallbacks(UserCallback userCallback) {
        userCallback.getClass();
        ensureUserCallbacksIsMutable();
        this.userCallbacks_.add(userCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmote() {
        this.emote_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmptyPage() {
        this.emptyPage_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInput() {
        this.input_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreloadResUrls() {
        this.preloadResUrls_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportFilterTags() {
        this.supportFilterTags_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpMid() {
        this.upMid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCallbacks() {
        this.userCallbacks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePreloadResUrlsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.preloadResUrls_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.preloadResUrls_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSupportFilterTagsIsMutable() {
        Internal.ProtobufList<FilterTag> protobufList = this.supportFilterTags_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.supportFilterTags_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureUserCallbacksIsMutable() {
        Internal.ProtobufList<UserCallback> protobufList = this.userCallbacks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.userCallbacks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SubjectDescriptionReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmote(EmoteConfig emoteConfig) {
        emoteConfig.getClass();
        EmoteConfig emoteConfig2 = this.emote_;
        if (emoteConfig2 != null && emoteConfig2 != EmoteConfig.getDefaultInstance()) {
            this.emote_ = EmoteConfig.newBuilder(this.emote_).mergeFrom((EmoteConfig) emoteConfig).buildPartial();
        } else {
            this.emote_ = emoteConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmptyPage(EmptyPage emptyPage) {
        emptyPage.getClass();
        EmptyPage emptyPage2 = this.emptyPage_;
        if (emptyPage2 != null && emptyPage2 != EmptyPage.getDefaultInstance()) {
            this.emptyPage_ = EmptyPage.newBuilder(this.emptyPage_).mergeFrom((EmptyPage) emptyPage).buildPartial();
        } else {
            this.emptyPage_ = emptyPage;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInput(InputConfig inputConfig) {
        inputConfig.getClass();
        InputConfig inputConfig2 = this.input_;
        if (inputConfig2 != null && inputConfig2 != InputConfig.getDefaultInstance()) {
            this.input_ = InputConfig.newBuilder(this.input_).mergeFrom((InputConfig) inputConfig).buildPartial();
        } else {
            this.input_ = inputConfig;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SubjectDescriptionReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubjectDescriptionReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SubjectDescriptionReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSupportFilterTags(int i) {
        ensureSupportFilterTagsIsMutable();
        this.supportFilterTags_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUserCallbacks(int i) {
        ensureUserCallbacksIsMutable();
        this.userCallbacks_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmote(EmoteConfig emoteConfig) {
        emoteConfig.getClass();
        this.emote_ = emoteConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmptyPage(EmptyPage emptyPage) {
        emptyPage.getClass();
        this.emptyPage_ = emptyPage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInput(InputConfig inputConfig) {
        inputConfig.getClass();
        this.input_ = inputConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreloadResUrls(int i, String str) {
        str.getClass();
        ensurePreloadResUrlsIsMutable();
        this.preloadResUrls_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportFilterTags(int i, FilterTag filterTag) {
        filterTag.getClass();
        ensureSupportFilterTagsIsMutable();
        this.supportFilterTags_.set(i, filterTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpMid(long j) {
        this.upMid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCallbacks(int i, UserCallback userCallback) {
        userCallback.getClass();
        ensureUserCallbacksIsMutable();
        this.userCallbacks_.set(i, userCallback);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C80021.f17762xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SubjectDescriptionReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0002\t\u0003\t\u0004\t\u0005\u001b\u0006\u021a\u0007\u001b\b\u0002", new Object[]{"count_", "input_", "emote_", "emptyPage_", "supportFilterTags_", FilterTag.class, "preloadResUrls_", "userCallbacks_", UserCallback.class, "upMid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SubjectDescriptionReply> parser = PARSER;
                if (parser == null) {
                    synchronized (SubjectDescriptionReply.class) {
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

    public long getCount() {
        return this.count_;
    }

    public EmoteConfig getEmote() {
        EmoteConfig emoteConfig = this.emote_;
        return emoteConfig == null ? EmoteConfig.getDefaultInstance() : emoteConfig;
    }

    public EmptyPage getEmptyPage() {
        EmptyPage emptyPage = this.emptyPage_;
        return emptyPage == null ? EmptyPage.getDefaultInstance() : emptyPage;
    }

    public InputConfig getInput() {
        InputConfig inputConfig = this.input_;
        return inputConfig == null ? InputConfig.getDefaultInstance() : inputConfig;
    }

    public String getPreloadResUrls(int i) {
        return this.preloadResUrls_.get(i);
    }

    public ByteString getPreloadResUrlsBytes(int i) {
        return ByteString.copyFromUtf8(this.preloadResUrls_.get(i));
    }

    public int getPreloadResUrlsCount() {
        return this.preloadResUrls_.size();
    }

    public List<String> getPreloadResUrlsList() {
        return this.preloadResUrls_;
    }

    public FilterTag getSupportFilterTags(int i) {
        return this.supportFilterTags_.get(i);
    }

    public int getSupportFilterTagsCount() {
        return this.supportFilterTags_.size();
    }

    public List<FilterTag> getSupportFilterTagsList() {
        return this.supportFilterTags_;
    }

    public FilterTagOrBuilder getSupportFilterTagsOrBuilder(int i) {
        return this.supportFilterTags_.get(i);
    }

    public List<? extends FilterTagOrBuilder> getSupportFilterTagsOrBuilderList() {
        return this.supportFilterTags_;
    }

    public long getUpMid() {
        return this.upMid_;
    }

    public UserCallback getUserCallbacks(int i) {
        return this.userCallbacks_.get(i);
    }

    public int getUserCallbacksCount() {
        return this.userCallbacks_.size();
    }

    public List<UserCallback> getUserCallbacksList() {
        return this.userCallbacks_;
    }

    public UserCallbackOrBuilder getUserCallbacksOrBuilder(int i) {
        return this.userCallbacks_.get(i);
    }

    public List<? extends UserCallbackOrBuilder> getUserCallbacksOrBuilderList() {
        return this.userCallbacks_;
    }

    public boolean hasEmote() {
        return this.emote_ != null;
    }

    public boolean hasEmptyPage() {
        return this.emptyPage_ != null;
    }

    public boolean hasInput() {
        return this.input_ != null;
    }

    public static Builder newBuilder(SubjectDescriptionReply subjectDescriptionReply) {
        return DEFAULT_INSTANCE.createBuilder(subjectDescriptionReply);
    }

    public static SubjectDescriptionReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubjectDescriptionReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SubjectDescriptionReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSupportFilterTags(int i, FilterTag filterTag) {
        filterTag.getClass();
        ensureSupportFilterTagsIsMutable();
        this.supportFilterTags_.add(i, filterTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUserCallbacks(int i, UserCallback userCallback) {
        userCallback.getClass();
        ensureUserCallbacksIsMutable();
        this.userCallbacks_.add(i, userCallback);
    }

    public static SubjectDescriptionReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SubjectDescriptionReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubjectDescriptionReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SubjectDescriptionReply parseFrom(InputStream inputStream) throws IOException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubjectDescriptionReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SubjectDescriptionReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SubjectDescriptionReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SubjectDescriptionReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * setEmptyPage
     */
    static void access$7100(SubjectDescriptionReply reply, EmptyPage emptyPage) {
    }

    /**
     * clearCount
     */
    static void access$6400(SubjectDescriptionReply reply) {
    }
}
