package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class Config extends GeneratedMessageLite<Config, Config.Builder> implements MessageLiteOrBuilder {
    private static final Config DEFAULT_INSTANCE;
    public static final int ONLINE_FIELD_NUMBER = 1;
    private static volatile Parser<Config> PARSER = null;
    public static final int PLAYER_ICON_FIELD_NUMBER = 2;
    public static final int STORY_ENTRANCE_FIELD_NUMBER = 3;
    private Online online_;
    private PlayerIcon playerIcon_;
    private StoryEntrance storyEntrance_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Config$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71271 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17102xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17102xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17102xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17102xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17102xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17102xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17102xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17102xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Config, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71271 c71271) {
            this();
        }

        public Builder clearOnline() {
            copyOnWrite();
            ((Config) this.instance).clearOnline();
            return this;
        }

        public Builder clearPlayerIcon() {
            copyOnWrite();
            ((Config) this.instance).clearPlayerIcon();
            return this;
        }

        public Builder clearStoryEntrance() {
            copyOnWrite();
            ((Config) this.instance).clearStoryEntrance();
            return this;
        }

        public Online getOnline() {
            return ((Config) this.instance).getOnline();
        }

        public PlayerIcon getPlayerIcon() {
            return ((Config) this.instance).getPlayerIcon();
        }

        public StoryEntrance getStoryEntrance() {
            return ((Config) this.instance).getStoryEntrance();
        }

        public boolean hasOnline() {
            return ((Config) this.instance).hasOnline();
        }

        public boolean hasPlayerIcon() {
            return ((Config) this.instance).hasPlayerIcon();
        }

        public boolean hasStoryEntrance() {
            return ((Config) this.instance).hasStoryEntrance();
        }

        public Builder mergeOnline(Online online) {
            copyOnWrite();
            ((Config) this.instance).mergeOnline(online);
            return this;
        }

        public Builder mergePlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((Config) this.instance).mergePlayerIcon(playerIcon);
            return this;
        }

        public Builder mergeStoryEntrance(StoryEntrance storyEntrance) {
            copyOnWrite();
            ((Config) this.instance).mergeStoryEntrance(storyEntrance);
            return this;
        }

        public Builder setOnline(Online online) {
            copyOnWrite();
            ((Config) this.instance).setOnline(online);
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon playerIcon) {
            copyOnWrite();
            ((Config) this.instance).setPlayerIcon(playerIcon);
            return this;
        }

        public Builder setStoryEntrance(StoryEntrance storyEntrance) {
            copyOnWrite();
            ((Config) this.instance).setStoryEntrance(storyEntrance);
            return this;
        }

        private Builder() {
            super(Config.DEFAULT_INSTANCE);
        }

        public Builder setOnline(Online.Builder builder) {
            copyOnWrite();
            ((Config) this.instance).setOnline(builder.build());
            return this;
        }

        public Builder setPlayerIcon(PlayerIcon.Builder builder) {
            copyOnWrite();
            ((Config) this.instance).setPlayerIcon(builder.build());
            return this;
        }

        public Builder setStoryEntrance(StoryEntrance.Builder builder) {
            copyOnWrite();
            ((Config) this.instance).setStoryEntrance(builder.build());
            return this;
        }
    }

    static {
        Config config = new Config();
        DEFAULT_INSTANCE = config;
        GeneratedMessageLite.registerDefaultInstance(Config.class, config);
    }

    private Config() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnline() {
        this.online_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayerIcon() {
        this.playerIcon_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoryEntrance() {
        this.storyEntrance_ = null;
    }

    public static Config getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnline(Online online) {
        online.getClass();
        Online online2 = this.online_;
        if (online2 != null && online2 != Online.getDefaultInstance()) {
            this.online_ = Online.newBuilder(this.online_).mergeFrom((Online) online).buildPartial();
        } else {
            this.online_ = online;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayerIcon(PlayerIcon playerIcon) {
        playerIcon.getClass();
        PlayerIcon playerIcon2 = this.playerIcon_;
        if (playerIcon2 != null && playerIcon2 != PlayerIcon.getDefaultInstance()) {
            this.playerIcon_ = PlayerIcon.newBuilder(this.playerIcon_).mergeFrom((PlayerIcon) playerIcon).buildPartial();
        } else {
            this.playerIcon_ = playerIcon;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStoryEntrance(StoryEntrance storyEntrance) {
        storyEntrance.getClass();
        StoryEntrance storyEntrance2 = this.storyEntrance_;
        if (storyEntrance2 != null && storyEntrance2 != StoryEntrance.getDefaultInstance()) {
            this.storyEntrance_ = StoryEntrance.newBuilder(this.storyEntrance_).mergeFrom((StoryEntrance) storyEntrance).buildPartial();
        } else {
            this.storyEntrance_ = storyEntrance;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Config parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Config parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Config> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnline(Online online) {
        online.getClass();
        this.online_ = online;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerIcon(PlayerIcon playerIcon) {
        playerIcon.getClass();
        this.playerIcon_ = playerIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoryEntrance(StoryEntrance storyEntrance) {
        storyEntrance.getClass();
        this.storyEntrance_ = storyEntrance;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71271.f17102xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Config();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"online_", "playerIcon_", "storyEntrance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Config> parser = PARSER;
                if (parser == null) {
                    synchronized (Config.class) {
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

    public Online getOnline() {
        Online online = this.online_;
        return online == null ? Online.getDefaultInstance() : online;
    }

    public PlayerIcon getPlayerIcon() {
        PlayerIcon playerIcon = this.playerIcon_;
        return playerIcon == null ? PlayerIcon.getDefaultInstance() : playerIcon;
    }

    public StoryEntrance getStoryEntrance() {
        StoryEntrance storyEntrance = this.storyEntrance_;
        return storyEntrance == null ? StoryEntrance.getDefaultInstance() : storyEntrance;
    }

    public boolean hasOnline() {
        return this.online_ != null;
    }

    public boolean hasPlayerIcon() {
        return this.playerIcon_ != null;
    }

    public boolean hasStoryEntrance() {
        return this.storyEntrance_ != null;
    }

    public static Builder newBuilder(Config config) {
        return DEFAULT_INSTANCE.createBuilder(config);
    }

    public static Config parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Config parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Config parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Config parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Config parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Config parseFrom(InputStream inputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Config parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Config parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Config parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Config) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
