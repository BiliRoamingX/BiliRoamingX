package com.bapis.bilibili.app.view.v1;

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
public final class Section extends GeneratedMessageLite<Section, Section.Builder> implements SectionOrBuilder {
    private static final Section DEFAULT_INSTANCE;
    public static final int EPISODES_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Section> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 3;
    private long id_;
    private long type_;
    private String title_ = "";
    private Internal.ProtobufList<Episode> episodes_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Section$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68601 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16819xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16819xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16819xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16819xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16819xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16819xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16819xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16819xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Section, Builder> implements SectionOrBuilder {
        /* synthetic */ Builder(C68601 c68601) {
            this();
        }

        public Builder addAllEpisodes(Iterable<? extends Episode> iterable) {
            copyOnWrite();
            ((Section) this.instance).addAllEpisodes(iterable);
            return this;
        }

        public Builder addEpisodes(Episode episode) {
            copyOnWrite();
            ((Section) this.instance).addEpisodes(episode);
            return this;
        }

        public Builder clearEpisodes() {
            copyOnWrite();
            ((Section) this.instance).clearEpisodes();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Section) this.instance).clearId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Section) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Section) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
        public Episode getEpisodes(int i) {
            return ((Section) this.instance).getEpisodes(i);
        }

        @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
        public int getEpisodesCount() {
            return ((Section) this.instance).getEpisodesCount();
        }

        @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
        public List<Episode> getEpisodesList() {
            return Collections.unmodifiableList(((Section) this.instance).getEpisodesList());
        }

        @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
        public long getId() {
            return ((Section) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
        public String getTitle() {
            return ((Section) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
        public ByteString getTitleBytes() {
            return ((Section) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
        public long getType() {
            return ((Section) this.instance).getType();
        }

        public Builder removeEpisodes(int i) {
            copyOnWrite();
            ((Section) this.instance).removeEpisodes(i);
            return this;
        }

        public Builder setEpisodes(int i, Episode episode) {
            copyOnWrite();
            ((Section) this.instance).setEpisodes(i, episode);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((Section) this.instance).setId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Section) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Section) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(long j) {
            copyOnWrite();
            ((Section) this.instance).setType(j);
            return this;
        }

        private Builder() {
            super(Section.DEFAULT_INSTANCE);
        }

        public Builder addEpisodes(int i, Episode episode) {
            copyOnWrite();
            ((Section) this.instance).addEpisodes(i, episode);
            return this;
        }

        public Builder setEpisodes(int i, Episode.Builder builder) {
            copyOnWrite();
            ((Section) this.instance).setEpisodes(i, builder.build());
            return this;
        }

        public Builder addEpisodes(Episode.Builder builder) {
            copyOnWrite();
            ((Section) this.instance).addEpisodes(builder.build());
            return this;
        }

        public Builder addEpisodes(int i, Episode.Builder builder) {
            copyOnWrite();
            ((Section) this.instance).addEpisodes(i, builder.build());
            return this;
        }
    }

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        GeneratedMessageLite.registerDefaultInstance(Section.class, section);
    }

    private Section() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEpisodes(Iterable<? extends Episode> iterable) {
        ensureEpisodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.episodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(Episode episode) {
        episode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(episode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodes() {
        this.episodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0L;
    }

    private void ensureEpisodesIsMutable() {
        Internal.ProtobufList<Episode> protobufList = this.episodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.episodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Section getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Section parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Section) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Section parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Section> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEpisodes(int i) {
        ensureEpisodesIsMutable();
        this.episodes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodes(int i, Episode episode) {
        episode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.set(i, episode);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j) {
        this.type_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68601.f16819xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Section();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u001b", new Object[]{"id_", "title_", "type_", "episodes_", Episode.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Section> parser = PARSER;
                if (parser == null) {
                    synchronized (Section.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
    public Episode getEpisodes(int i) {
        return this.episodes_.get(i);
    }

    @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
    public int getEpisodesCount() {
        return this.episodes_.size();
    }

    @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
    public List<Episode> getEpisodesList() {
        return this.episodes_;
    }

    public EpisodeOrBuilder getEpisodesOrBuilder(int i) {
        return this.episodes_.get(i);
    }

    public List<? extends EpisodeOrBuilder> getEpisodesOrBuilderList() {
        return this.episodes_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.view.v1.SectionOrBuilder
    public long getType() {
        return this.type_;
    }

    public static Builder newBuilder(Section section) {
        return DEFAULT_INSTANCE.createBuilder(section);
    }

    public static Section parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Section) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Section parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Section parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(int i, Episode episode) {
        episode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(i, episode);
    }

    public static Section parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Section parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Section parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Section parseFrom(InputStream inputStream) throws IOException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Section parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Section parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Section parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Section) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
