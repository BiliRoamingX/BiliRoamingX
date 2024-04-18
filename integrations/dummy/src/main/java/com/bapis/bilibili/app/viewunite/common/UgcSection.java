package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class UgcSection extends GeneratedMessageLite<UgcSection, UgcSection.Builder> implements UgcSectionOrBuilder {
    private static final UgcSection DEFAULT_INSTANCE;
    public static final int EPISODES_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<UgcSection> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 3;
    private long id_;
    private long type_;
    private String title_ = "";
    private Internal.ProtobufList<UgcEpisode> episodes_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.UgcSection$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70761 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17053xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17053xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17053xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17053xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17053xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17053xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17053xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17053xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UgcSection, Builder> implements UgcSectionOrBuilder {
        /* synthetic */ Builder(C70761 c70761) {
            this();
        }

        public Builder addAllEpisodes(Iterable<? extends UgcEpisode> iterable) {
            copyOnWrite();
            ((UgcSection) this.instance).addAllEpisodes(iterable);
            return this;
        }

        public Builder addEpisodes(UgcEpisode ugcEpisode) {
            copyOnWrite();
            ((UgcSection) this.instance).addEpisodes(ugcEpisode);
            return this;
        }

        public Builder clearEpisodes() {
            copyOnWrite();
            ((UgcSection) this.instance).clearEpisodes();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((UgcSection) this.instance).clearId();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((UgcSection) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((UgcSection) this.instance).clearType();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
        public UgcEpisode getEpisodes(int i) {
            return ((UgcSection) this.instance).getEpisodes(i);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
        public int getEpisodesCount() {
            return ((UgcSection) this.instance).getEpisodesCount();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
        public List<UgcEpisode> getEpisodesList() {
            return Collections.unmodifiableList(((UgcSection) this.instance).getEpisodesList());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
        public long getId() {
            return ((UgcSection) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
        public String getTitle() {
            return ((UgcSection) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
        public ByteString getTitleBytes() {
            return ((UgcSection) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
        public long getType() {
            return ((UgcSection) this.instance).getType();
        }

        public Builder removeEpisodes(int i) {
            copyOnWrite();
            ((UgcSection) this.instance).removeEpisodes(i);
            return this;
        }

        public Builder setEpisodes(int i, UgcEpisode ugcEpisode) {
            copyOnWrite();
            ((UgcSection) this.instance).setEpisodes(i, ugcEpisode);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((UgcSection) this.instance).setId(j);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((UgcSection) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((UgcSection) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(long j) {
            copyOnWrite();
            ((UgcSection) this.instance).setType(j);
            return this;
        }

        private Builder() {
            super(UgcSection.DEFAULT_INSTANCE);
        }

        public Builder addEpisodes(int i, UgcEpisode ugcEpisode) {
            copyOnWrite();
            ((UgcSection) this.instance).addEpisodes(i, ugcEpisode);
            return this;
        }

        public Builder setEpisodes(int i, UgcEpisode.Builder builder) {
            copyOnWrite();
            ((UgcSection) this.instance).setEpisodes(i, builder.build());
            return this;
        }

        public Builder addEpisodes(UgcEpisode.Builder builder) {
            copyOnWrite();
            ((UgcSection) this.instance).addEpisodes(builder.build());
            return this;
        }

        public Builder addEpisodes(int i, UgcEpisode.Builder builder) {
            copyOnWrite();
            ((UgcSection) this.instance).addEpisodes(i, builder.build());
            return this;
        }
    }

    static {
        UgcSection ugcSection = new UgcSection();
        DEFAULT_INSTANCE = ugcSection;
        GeneratedMessageLite.registerDefaultInstance(UgcSection.class, ugcSection);
    }

    private UgcSection() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEpisodes(Iterable<? extends UgcEpisode> iterable) {
        ensureEpisodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.episodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(UgcEpisode ugcEpisode) {
        ugcEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(ugcEpisode);
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
        Internal.ProtobufList<UgcEpisode> protobufList = this.episodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.episodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static UgcSection getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UgcSection parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UgcSection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UgcSection> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEpisodes(int i) {
        ensureEpisodesIsMutable();
        this.episodes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodes(int i, UgcEpisode ugcEpisode) {
        ugcEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.set(i, ugcEpisode);
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
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70761.f17053xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UgcSection();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u001b", new Object[]{"id_", "title_", "type_", "episodes_", UgcEpisode.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UgcSection> parser = PARSER;
                if (parser == null) {
                    synchronized (UgcSection.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
    public UgcEpisode getEpisodes(int i) {
        return this.episodes_.get(i);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
    public int getEpisodesCount() {
        return this.episodes_.size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
    public List<UgcEpisode> getEpisodesList() {
        return this.episodes_;
    }

    public UgcEpisodeOrBuilder getEpisodesOrBuilder(int i) {
        return this.episodes_.get(i);
    }

    public List<? extends UgcEpisodeOrBuilder> getEpisodesOrBuilderList() {
        return this.episodes_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.UgcSectionOrBuilder
    public long getType() {
        return this.type_;
    }

    public static Builder newBuilder(UgcSection ugcSection) {
        return DEFAULT_INSTANCE.createBuilder(ugcSection);
    }

    public static UgcSection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UgcSection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(int i, UgcEpisode ugcEpisode) {
        ugcEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(i, ugcEpisode);
    }

    public static UgcSection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UgcSection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UgcSection parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UgcSection parseFrom(InputStream inputStream) throws IOException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UgcSection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UgcSection parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UgcSection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UgcSection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
