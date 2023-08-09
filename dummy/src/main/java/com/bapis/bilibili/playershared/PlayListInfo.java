package com.bapis.bilibili.playershared;

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
public final class PlayListInfo extends GeneratedMessageLite<PlayListInfo, PlayListInfo.Builder> implements MessageLiteOrBuilder {
    private static final PlayListInfo DEFAULT_INSTANCE;
    private static volatile Parser<PlayListInfo> PARSER = null;
    public static final int PLAY_LIST_FIELD_NUMBER = 2;
    private Internal.ProtobufList<PlayList> playList_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.PlayListInfo$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81941 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17913xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17913xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17913xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17913xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17913xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17913xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17913xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17913xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayListInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81941 c81941) {
            this();
        }

        public Builder addAllPlayList(Iterable<? extends PlayList> iterable) {
            copyOnWrite();
            ((PlayListInfo) this.instance).addAllPlayList(iterable);
            return this;
        }

        public Builder addPlayList(PlayList playList) {
            copyOnWrite();
            ((PlayListInfo) this.instance).addPlayList(playList);
            return this;
        }

        public Builder clearPlayList() {
            copyOnWrite();
            ((PlayListInfo) this.instance).clearPlayList();
            return this;
        }

        public PlayList getPlayList(int i) {
            return ((PlayListInfo) this.instance).getPlayList(i);
        }

        public int getPlayListCount() {
            return ((PlayListInfo) this.instance).getPlayListCount();
        }

        public List<PlayList> getPlayListList() {
            return Collections.unmodifiableList(((PlayListInfo) this.instance).getPlayListList());
        }

        public Builder removePlayList(int i) {
            copyOnWrite();
            ((PlayListInfo) this.instance).removePlayList(i);
            return this;
        }

        public Builder setPlayList(int i, PlayList playList) {
            copyOnWrite();
            ((PlayListInfo) this.instance).setPlayList(i, playList);
            return this;
        }

        private Builder() {
            super(PlayListInfo.DEFAULT_INSTANCE);
        }

        public Builder addPlayList(int i, PlayList playList) {
            copyOnWrite();
            ((PlayListInfo) this.instance).addPlayList(i, playList);
            return this;
        }

        public Builder setPlayList(int i, PlayList.Builder builder) {
            copyOnWrite();
            ((PlayListInfo) this.instance).setPlayList(i, builder.build());
            return this;
        }

        public Builder addPlayList(PlayList.Builder builder) {
            copyOnWrite();
            ((PlayListInfo) this.instance).addPlayList(builder.build());
            return this;
        }

        public Builder addPlayList(int i, PlayList.Builder builder) {
            copyOnWrite();
            ((PlayListInfo) this.instance).addPlayList(i, builder.build());
            return this;
        }
    }

    static {
        PlayListInfo playListInfo = new PlayListInfo();
        DEFAULT_INSTANCE = playListInfo;
        GeneratedMessageLite.registerDefaultInstance(PlayListInfo.class, playListInfo);
    }

    private PlayListInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPlayList(Iterable<? extends PlayList> iterable) {
        ensurePlayListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.playList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayList(PlayList playList) {
        playList.getClass();
        ensurePlayListIsMutable();
        this.playList_.add(playList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayList() {
        this.playList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePlayListIsMutable() {
        Internal.ProtobufList<PlayList> protobufList = this.playList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.playList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlayListInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayListInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayListInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayListInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayListInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePlayList(int i) {
        ensurePlayListIsMutable();
        this.playList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayList(int i, PlayList playList) {
        playList.getClass();
        ensurePlayListIsMutable();
        this.playList_.set(i, playList);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81941.f17913xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayListInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"playList_", PlayList.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayListInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayListInfo.class) {
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

    public PlayList getPlayList(int i) {
        return this.playList_.get(i);
    }

    public int getPlayListCount() {
        return this.playList_.size();
    }

    public List<PlayList> getPlayListList() {
        return this.playList_;
    }

    public PlayListOrBuilder getPlayListOrBuilder(int i) {
        return this.playList_.get(i);
    }

    public List<? extends PlayListOrBuilder> getPlayListOrBuilderList() {
        return this.playList_;
    }

    public static Builder newBuilder(PlayListInfo playListInfo) {
        return DEFAULT_INSTANCE.createBuilder(playListInfo);
    }

    public static PlayListInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayListInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayListInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayListInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPlayList(int i, PlayList playList) {
        playList.getClass();
        ensurePlayListIsMutable();
        this.playList_.add(i, playList);
    }

    public static PlayListInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayListInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayListInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayListInfo parseFrom(InputStream inputStream) throws IOException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayListInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayListInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayListInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayListInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
