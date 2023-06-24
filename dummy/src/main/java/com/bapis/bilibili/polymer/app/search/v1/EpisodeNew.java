package com.bapis.bilibili.polymer.app.search.v1;

import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
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
public final class EpisodeNew extends GeneratedMessageLite<EpisodeNew, EpisodeNew.Builder> implements EpisodeNewOrBuilder {
    public static final int BADGES_FIELD_NUMBER = 5;
    public static final int COVER_FIELD_NUMBER = 8;
    private static final EpisodeNew DEFAULT_INSTANCE;
    public static final int IS_NEW_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 9;
    public static final int PARAM_FIELD_NUMBER = 3;
    private static volatile Parser<EpisodeNew> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 2;
    private int isNew_;
    private int position_;
    private int type_;
    private String title_ = "";
    private String uri_ = "";
    private String param_ = "";
    private Internal.ProtobufList<ReasonStyle> badges_ = GeneratedMessageLite.emptyProtobufList();
    private String cover_ = "";
    private String label_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.polymer.app.search.v1.EpisodeNew$1 */
    /* loaded from: classes15.dex */
    static /* synthetic */ class C79591 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17661xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17661xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17661xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17661xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17661xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17661xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17661xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17661xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes15.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EpisodeNew, Builder> implements EpisodeNewOrBuilder {
        /* synthetic */ Builder(C79591 c79591) {
            this();
        }

        public Builder addAllBadges(Iterable<? extends ReasonStyle> iterable) {
            copyOnWrite();
            ((EpisodeNew) this.instance).addAllBadges(iterable);
            return this;
        }

        public Builder addBadges(ReasonStyle reasonStyle) {
            copyOnWrite();
            ((EpisodeNew) this.instance).addBadges(reasonStyle);
            return this;
        }

        public Builder clearBadges() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearBadges();
            return this;
        }

        public Builder clearCover() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearCover();
            return this;
        }

        public Builder clearIsNew() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearIsNew();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearLabel();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearParam();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearPosition();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearType();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((EpisodeNew) this.instance).clearUri();
            return this;
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public ReasonStyle getBadges(int i) {
            return ((EpisodeNew) this.instance).getBadges(i);
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public int getBadgesCount() {
            return ((EpisodeNew) this.instance).getBadgesCount();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public List<ReasonStyle> getBadgesList() {
            return Collections.unmodifiableList(((EpisodeNew) this.instance).getBadgesList());
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public String getCover() {
            return ((EpisodeNew) this.instance).getCover();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public ByteString getCoverBytes() {
            return ((EpisodeNew) this.instance).getCoverBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public int getIsNew() {
            return ((EpisodeNew) this.instance).getIsNew();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public String getLabel() {
            return ((EpisodeNew) this.instance).getLabel();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public ByteString getLabelBytes() {
            return ((EpisodeNew) this.instance).getLabelBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public String getParam() {
            return ((EpisodeNew) this.instance).getParam();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public ByteString getParamBytes() {
            return ((EpisodeNew) this.instance).getParamBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public int getPosition() {
            return ((EpisodeNew) this.instance).getPosition();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public String getTitle() {
            return ((EpisodeNew) this.instance).getTitle();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public ByteString getTitleBytes() {
            return ((EpisodeNew) this.instance).getTitleBytes();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public int getType() {
            return ((EpisodeNew) this.instance).getType();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public String getUri() {
            return ((EpisodeNew) this.instance).getUri();
        }

        @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
        public ByteString getUriBytes() {
            return ((EpisodeNew) this.instance).getUriBytes();
        }

        public Builder removeBadges(int i) {
            copyOnWrite();
            ((EpisodeNew) this.instance).removeBadges(i);
            return this;
        }

        public Builder setBadges(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setBadges(i, reasonStyle);
            return this;
        }

        public Builder setCover(String str) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setCover(str);
            return this;
        }

        public Builder setCoverBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setCoverBytes(byteString);
            return this;
        }

        public Builder setIsNew(int i) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setIsNew(i);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setLabelBytes(byteString);
            return this;
        }

        public Builder setParam(String str) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setParam(str);
            return this;
        }

        public Builder setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setParamBytes(byteString);
            return this;
        }

        public Builder setPosition(int i) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setPosition(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setType(i);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(EpisodeNew.DEFAULT_INSTANCE);
        }

        public Builder addBadges(int i, ReasonStyle reasonStyle) {
            copyOnWrite();
            ((EpisodeNew) this.instance).addBadges(i, reasonStyle);
            return this;
        }

        public Builder setBadges(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((EpisodeNew) this.instance).setBadges(i, builder.build());
            return this;
        }

        public Builder addBadges(ReasonStyle.Builder builder) {
            copyOnWrite();
            ((EpisodeNew) this.instance).addBadges(builder.build());
            return this;
        }

        public Builder addBadges(int i, ReasonStyle.Builder builder) {
            copyOnWrite();
            ((EpisodeNew) this.instance).addBadges(i, builder.build());
            return this;
        }
    }

    static {
        EpisodeNew episodeNew = new EpisodeNew();
        DEFAULT_INSTANCE = episodeNew;
        GeneratedMessageLite.registerDefaultInstance(EpisodeNew.class, episodeNew);
    }

    private EpisodeNew() {
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
    public void clearCover() {
        this.cover_ = getDefaultInstance().getCover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNew() {
        this.isNew_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
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
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
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

    public static EpisodeNew getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeNew parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EpisodeNew) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeNew parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EpisodeNew> parser() {
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
    public void setCover(String str) {
        str.getClass();
        this.cover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNew(int i) {
        this.isNew_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.toStringUtf8();
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
    public void setType(int i) {
        this.type_ = i;
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
        switch (C79591.f17661xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new EpisodeNew();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u001b\u0006\u0004\u0007\u0004\b\u0208\t\u0208", new Object[]{"title_", "uri_", "param_", "isNew_", "badges_", ReasonStyle.class, "type_", "position_", "cover_", "label_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EpisodeNew> parser = PARSER;
                if (parser == null) {
                    synchronized (EpisodeNew.class) {
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

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public ReasonStyle getBadges(int i) {
        return this.badges_.get(i);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public int getBadgesCount() {
        return this.badges_.size();
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public List<ReasonStyle> getBadgesList() {
        return this.badges_;
    }

    public ReasonStyleOrBuilder getBadgesOrBuilder(int i) {
        return this.badges_.get(i);
    }

    public List<? extends ReasonStyleOrBuilder> getBadgesOrBuilderList() {
        return this.badges_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public String getCover() {
        return this.cover_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public ByteString getCoverBytes() {
        return ByteString.copyFromUtf8(this.cover_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public int getIsNew() {
        return this.isNew_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public String getLabel() {
        return this.label_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.label_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public String getParam() {
        return this.param_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public int getPosition() {
        return this.position_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.bapis.bilibili.polymer.app.search.v1.EpisodeNewOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(EpisodeNew episodeNew) {
        return DEFAULT_INSTANCE.createBuilder(episodeNew);
    }

    public static EpisodeNew parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeNew) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpisodeNew parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EpisodeNew parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadges(int i, ReasonStyle reasonStyle) {
        reasonStyle.getClass();
        ensureBadgesIsMutable();
        this.badges_.add(i, reasonStyle);
    }

    public static EpisodeNew parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EpisodeNew parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeNew parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EpisodeNew parseFrom(InputStream inputStream) throws IOException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeNew parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EpisodeNew parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EpisodeNew parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EpisodeNew) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
