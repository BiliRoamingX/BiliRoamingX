package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.bapis.bilibili.app.viewunite.common.ViewEpisode;
import com.bapis.bilibili.app.viewunite.common.ViewEpisodeOrBuilder;
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
public final class Reserve extends GeneratedMessageLite<Reserve, Reserve.Builder> implements MessageLiteOrBuilder {
    private static final Reserve DEFAULT_INSTANCE;
    public static final int EPISODES_FIELD_NUMBER = 1;
    private static volatile Parser<Reserve> PARSER = null;
    public static final int TIP_FIELD_NUMBER = 2;
    private Internal.ProtobufList<ViewEpisode> episodes_ = GeneratedMessageLite.emptyProtobufList();
    private String tip_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.Reserve$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70951 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17072xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17072xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17072xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17072xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17072xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17072xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17072xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17072xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Reserve, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70951 c70951) {
            this();
        }

        public Builder addAllEpisodes(Iterable<? extends ViewEpisode> iterable) {
            copyOnWrite();
            ((Reserve) this.instance).addAllEpisodes(iterable);
            return this;
        }

        public Builder addEpisodes(ViewEpisode viewEpisode) {
            copyOnWrite();
            ((Reserve) this.instance).addEpisodes(viewEpisode);
            return this;
        }

        public Builder clearEpisodes() {
            copyOnWrite();
            ((Reserve) this.instance).clearEpisodes();
            return this;
        }

        public Builder clearTip() {
            copyOnWrite();
            ((Reserve) this.instance).clearTip();
            return this;
        }

        public ViewEpisode getEpisodes(int i) {
            return ((Reserve) this.instance).getEpisodes(i);
        }

        public int getEpisodesCount() {
            return ((Reserve) this.instance).getEpisodesCount();
        }

        public List<ViewEpisode> getEpisodesList() {
            return Collections.unmodifiableList(((Reserve) this.instance).getEpisodesList());
        }

        public String getTip() {
            return ((Reserve) this.instance).getTip();
        }

        public ByteString getTipBytes() {
            return ((Reserve) this.instance).getTipBytes();
        }

        public Builder removeEpisodes(int i) {
            copyOnWrite();
            ((Reserve) this.instance).removeEpisodes(i);
            return this;
        }

        public Builder setEpisodes(int i, ViewEpisode viewEpisode) {
            copyOnWrite();
            ((Reserve) this.instance).setEpisodes(i, viewEpisode);
            return this;
        }

        public Builder setTip(String str) {
            copyOnWrite();
            ((Reserve) this.instance).setTip(str);
            return this;
        }

        public Builder setTipBytes(ByteString byteString) {
            copyOnWrite();
            ((Reserve) this.instance).setTipBytes(byteString);
            return this;
        }

        private Builder() {
            super(Reserve.DEFAULT_INSTANCE);
        }

        public Builder addEpisodes(int i, ViewEpisode viewEpisode) {
            copyOnWrite();
            ((Reserve) this.instance).addEpisodes(i, viewEpisode);
            return this;
        }

        public Builder setEpisodes(int i, ViewEpisode.Builder builder) {
            copyOnWrite();
            ((Reserve) this.instance).setEpisodes(i, builder.build());
            return this;
        }

        public Builder addEpisodes(ViewEpisode.Builder builder) {
            copyOnWrite();
            ((Reserve) this.instance).addEpisodes(builder.build());
            return this;
        }

        public Builder addEpisodes(int i, ViewEpisode.Builder builder) {
            copyOnWrite();
            ((Reserve) this.instance).addEpisodes(i, builder.build());
            return this;
        }
    }

    static {
        Reserve reserve = new Reserve();
        DEFAULT_INSTANCE = reserve;
        GeneratedMessageLite.registerDefaultInstance(Reserve.class, reserve);
    }

    private Reserve() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEpisodes(Iterable<? extends ViewEpisode> iterable) {
        ensureEpisodesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.episodes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(ViewEpisode viewEpisode) {
        viewEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(viewEpisode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodes() {
        this.episodes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTip() {
        this.tip_ = getDefaultInstance().getTip();
    }

    private void ensureEpisodesIsMutable() {
        Internal.ProtobufList<ViewEpisode> protobufList = this.episodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.episodes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Reserve getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Reserve parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Reserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reserve parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Reserve> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEpisodes(int i) {
        ensureEpisodesIsMutable();
        this.episodes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodes(int i, ViewEpisode viewEpisode) {
        viewEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.set(i, viewEpisode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTip(String str) {
        str.getClass();
        this.tip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTipBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tip_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70951.f17072xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Reserve();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", new Object[]{"episodes_", ViewEpisode.class, "tip_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Reserve> parser = PARSER;
                if (parser == null) {
                    synchronized (Reserve.class) {
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

    public ViewEpisode getEpisodes(int i) {
        return this.episodes_.get(i);
    }

    public int getEpisodesCount() {
        return this.episodes_.size();
    }

    public List<ViewEpisode> getEpisodesList() {
        return this.episodes_;
    }

    public ViewEpisodeOrBuilder getEpisodesOrBuilder(int i) {
        return this.episodes_.get(i);
    }

    public List<? extends ViewEpisodeOrBuilder> getEpisodesOrBuilderList() {
        return this.episodes_;
    }

    public String getTip() {
        return this.tip_;
    }

    public ByteString getTipBytes() {
        return ByteString.copyFromUtf8(this.tip_);
    }

    public static Builder newBuilder(Reserve reserve) {
        return DEFAULT_INSTANCE.createBuilder(reserve);
    }

    public static Reserve parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Reserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Reserve parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Reserve parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEpisodes(int i, ViewEpisode viewEpisode) {
        viewEpisode.getClass();
        ensureEpisodesIsMutable();
        this.episodes_.add(i, viewEpisode);
    }

    public static Reserve parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Reserve parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Reserve parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Reserve parseFrom(InputStream inputStream) throws IOException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reserve parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Reserve parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Reserve parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Reserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
