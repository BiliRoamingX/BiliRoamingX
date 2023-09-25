package com.bapis.bilibili.polymer.app.search.v1;

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
/* loaded from: classes15.dex */
public final class Episode extends GeneratedMessageLite<Episode, Episode.Builder> implements EpisodeOrBuilder {
    public static final int BADGES_FIELD_NUMBER = 4;
    private static final Episode DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 3;
    public static final int PARAM_FIELD_NUMBER = 2;
    private static volatile Parser<Episode> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private int position_;
    private String uri_ = "";
    private String param_ = "";
    private String index_ = "";
    private Internal.ProtobufList<ReasonStyle> badges_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.Episode$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79581 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17660xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17660xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17660xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17660xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17660xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17660xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17660xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17660xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Episode, Builder> implements EpisodeOrBuilder {
        /* synthetic */ Builder(C79581 c79581) {
            this();
        }

        public Builder addAllBadges(Iterable<? extends ReasonStyle> iterable) {
            copyOnWrite();
            ((Episode) this.instance).addAllBadges(iterable);
            return this;
        }

        public Builder addBadges(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((Episode) this.instance).addBadges(reasonStyle);
            return this;
        }

        public Builder clearBadges() {
            copyOnWrite();
            ((Episode) this.instance).clearBadges();
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((Episode) this.instance).clearIndex();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((Episode) this.instance).clearParam();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((Episode) this.instance).clearPosition();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((Episode) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public ReasonStyle getBadges(int i) {
            return ((Episode) this.instance).getBadges(i);
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public int getBadgesCount() {
            return ((Episode) this.instance).getBadgesCount();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public List<ReasonStyle> getBadgesList() {
            return Collections.unmodifiableList(((Episode) this.instance).getBadgesList());
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public String getIndex() {
            return ((Episode) this.instance).getIndex();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public ByteString getIndexBytes() {
            return ((Episode) this.instance).getIndexBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public String getParam() {
            return ((Episode) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public ByteString getParamBytes() {
            return ((Episode) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public int getPosition() {
            return ((Episode) this.instance).getPosition();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public String getUri() {
            return ((Episode) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
        public ByteString getUriBytes() {
            return ((Episode) this.instance).getUriBytes();
        }

        public Builder removeBadges(int i) {
            copyOnWrite();
            ((Episode) this.instance).removeBadges(i);
            return this;
        }

        public Builder setBadges(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((Episode) this.instance).setBadges(i, reasonStyle);
            return this;
        }

        public Builder setIndex(String str) {
            copyOnWrite();
            ((Episode) this.instance).setIndex(str);
            return this;
        }

        public Builder setIndexBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setIndexBytes(byteString);
            return this;
        }

        public Builder setParam(String str) {
            copyOnWrite();
            ((Episode) this.instance).setParam(str);
            return this;
        }

        public Builder setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setParamBytes(byteString);
            return this;
        }

        public Builder setPosition(int i) {
            copyOnWrite();
            ((Episode) this.instance).setPosition(i);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((Episode) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((Episode) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(Episode.DEFAULT_INSTANCE);
        }

        public Builder addBadges(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((Episode) this.instance).addBadges(i, reasonStyle);
            return this;
        }

        public Builder setBadges(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).setBadges(i, builder.build());
            return this;
        }

        public Builder addBadges(ReasonStyle.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).addBadges(builder.build());
            return this;
        }

        public Builder addBadges(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((Episode) this.instance).addBadges(i, builder.build());
            return this;
        }
    }

    static {
        Episode episode = new Episode();
        DEFAULT_INSTANCE = episode;
        GeneratedMessageLite.registerDefaultInstance(Episode.class, episode);
    }

    public Episode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBadges(Iterable<? extends ReasonStyle> iterable) {
        ensureBadgesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.badges_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadges(ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesIsMutable();
        this.badges_.add(reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadges() {
        this.badges_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = getDefaultInstance().getIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    private void ensureBadgesIsMutable() {
        Internal.ProtobufList<ReasonStyle> protobufList = this.badges_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.badges_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Episode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Episode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Episode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Episode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Episode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBadges(int i) {
        ensureBadgesIsMutable();
        this.badges_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadges(int i, ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesIsMutable();
        this.badges_.set(i, reasonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(String str) {
        str.getClass();
        this.index_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndexBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.index_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(int i) {
        this.position_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79581.f17660xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Episode();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u001b\u0005\u0004", new Object[]{"uri_", "param_", "index_", "badges_", ReasonStyle.class, "position_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Episode> parser = PARSER;
                if (parser == null) {
                    synchronized (Episode.class) {
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

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public ReasonStyle getBadges(int i) {
        return this.badges_.get(i);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public int getBadgesCount() {
        return this.badges_.size();
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public List<ReasonStyle> getBadgesList() {
        return this.badges_;
    }

    public ReasonStyleOrBuilder getBadgesOrBuilder(int i) {
        return this.badges_.get(i);
    }

    public List<? extends ReasonStyleOrBuilder> getBadgesOrBuilderList() {
        return this.badges_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public String getIndex() {
        return this.index_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public ByteString getIndexBytes() {
        return ByteString.copyFromUtf8(this.index_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public int getPosition() {
        return this.position_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(Episode episode) {
        return DEFAULT_INSTANCE.createBuilder(episode);
    }

    public static Episode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Episode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Episode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Episode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadges(int i, ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesIsMutable();
        this.badges_.add(i, reasonStyle);
    }

    public static Episode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Episode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Episode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Episode parseFrom(InputStream inputStream) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Episode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Episode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Episode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Episode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
