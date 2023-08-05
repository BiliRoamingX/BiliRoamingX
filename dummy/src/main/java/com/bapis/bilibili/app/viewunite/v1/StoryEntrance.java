package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class StoryEntrance extends GeneratedMessageLite<StoryEntrance, StoryEntrance.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_LANDSCAPE_STORY_FIELD_NUMBER = 3;
    public static final int ARC_PLAY_STORY_FIELD_NUMBER = 1;
    private static final StoryEntrance DEFAULT_INSTANCE;
    public static final int LANDSCAPE_ICON_FIELD_NUMBER = 4;
    private static volatile Parser<StoryEntrance> PARSER = null;
    public static final int PLAY_STORY_FIELD_NUMBER = 5;
    public static final int STORY_ICON_FIELD_NUMBER = 2;
    private boolean arcLandscapeStory_;
    private boolean arcPlayStory_;
    private boolean playStory_;
    private String storyIcon_ = "";
    private String landscapeIcon_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.StoryEntrance$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71611 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17129xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17129xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17129xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17129xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17129xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17129xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17129xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17129xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<StoryEntrance, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71611 c71611) {
            this();
        }

        public Builder clearArcLandscapeStory() {
            copyOnWrite();
            ((StoryEntrance) this.instance).clearArcLandscapeStory();
            return this;
        }

        public Builder clearArcPlayStory() {
            copyOnWrite();
            ((StoryEntrance) this.instance).clearArcPlayStory();
            return this;
        }

        public Builder clearLandscapeIcon() {
            copyOnWrite();
            ((StoryEntrance) this.instance).clearLandscapeIcon();
            return this;
        }

        public Builder clearPlayStory() {
            copyOnWrite();
            ((StoryEntrance) this.instance).clearPlayStory();
            return this;
        }

        public Builder clearStoryIcon() {
            copyOnWrite();
            ((StoryEntrance) this.instance).clearStoryIcon();
            return this;
        }

        public boolean getArcLandscapeStory() {
            return ((StoryEntrance) this.instance).getArcLandscapeStory();
        }

        public boolean getArcPlayStory() {
            return ((StoryEntrance) this.instance).getArcPlayStory();
        }

        public String getLandscapeIcon() {
            return ((StoryEntrance) this.instance).getLandscapeIcon();
        }

        public ByteString getLandscapeIconBytes() {
            return ((StoryEntrance) this.instance).getLandscapeIconBytes();
        }

        public boolean getPlayStory() {
            return ((StoryEntrance) this.instance).getPlayStory();
        }

        public String getStoryIcon() {
            return ((StoryEntrance) this.instance).getStoryIcon();
        }

        public ByteString getStoryIconBytes() {
            return ((StoryEntrance) this.instance).getStoryIconBytes();
        }

        public Builder setArcLandscapeStory(boolean z) {
            copyOnWrite();
            ((StoryEntrance) this.instance).setArcLandscapeStory(z);
            return this;
        }

        public Builder setArcPlayStory(boolean z) {
            copyOnWrite();
            ((StoryEntrance) this.instance).setArcPlayStory(z);
            return this;
        }

        public Builder setLandscapeIcon(String str) {
            copyOnWrite();
            ((StoryEntrance) this.instance).setLandscapeIcon(str);
            return this;
        }

        public Builder setLandscapeIconBytes(ByteString byteString) {
            copyOnWrite();
            ((StoryEntrance) this.instance).setLandscapeIconBytes(byteString);
            return this;
        }

        public Builder setPlayStory(boolean z) {
            copyOnWrite();
            ((StoryEntrance) this.instance).setPlayStory(z);
            return this;
        }

        public Builder setStoryIcon(String str) {
            copyOnWrite();
            ((StoryEntrance) this.instance).setStoryIcon(str);
            return this;
        }

        public Builder setStoryIconBytes(ByteString byteString) {
            copyOnWrite();
            ((StoryEntrance) this.instance).setStoryIconBytes(byteString);
            return this;
        }

        private Builder() {
            super(StoryEntrance.DEFAULT_INSTANCE);
        }
    }

    static {
        StoryEntrance storyEntrance = new StoryEntrance();
        DEFAULT_INSTANCE = storyEntrance;
        GeneratedMessageLite.registerDefaultInstance(StoryEntrance.class, storyEntrance);
    }

    private StoryEntrance() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcLandscapeStory() {
        this.arcLandscapeStory_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcPlayStory() {
        this.arcPlayStory_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLandscapeIcon() {
        this.landscapeIcon_ = getDefaultInstance().getLandscapeIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayStory() {
        this.playStory_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoryIcon() {
        this.storyIcon_ = getDefaultInstance().getStoryIcon();
    }

    public static StoryEntrance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static StoryEntrance parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StoryEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StoryEntrance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<StoryEntrance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcLandscapeStory(boolean z) {
        this.arcLandscapeStory_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcPlayStory(boolean z) {
        this.arcPlayStory_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandscapeIcon(String str) {
        str.getClass();
        this.landscapeIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandscapeIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.landscapeIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayStory(boolean z) {
        this.playStory_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoryIcon(String str) {
        str.getClass();
        this.storyIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoryIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.storyIcon_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71611.f17129xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new StoryEntrance();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0208\u0003\u0007\u0004\u0208\u0005\u0007", new Object[]{"arcPlayStory_", "storyIcon_", "arcLandscapeStory_", "landscapeIcon_", "playStory_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StoryEntrance> parser = PARSER;
                if (parser == null) {
                    synchronized (StoryEntrance.class) {
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

    public boolean getArcLandscapeStory() {
        return this.arcLandscapeStory_;
    }

    public boolean getArcPlayStory() {
        return this.arcPlayStory_;
    }

    public String getLandscapeIcon() {
        return this.landscapeIcon_;
    }

    public ByteString getLandscapeIconBytes() {
        return ByteString.copyFromUtf8(this.landscapeIcon_);
    }

    public boolean getPlayStory() {
        return this.playStory_;
    }

    public String getStoryIcon() {
        return this.storyIcon_;
    }

    public ByteString getStoryIconBytes() {
        return ByteString.copyFromUtf8(this.storyIcon_);
    }

    public static Builder newBuilder(StoryEntrance storyEntrance) {
        return DEFAULT_INSTANCE.createBuilder(storyEntrance);
    }

    public static StoryEntrance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StoryEntrance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StoryEntrance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StoryEntrance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StoryEntrance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StoryEntrance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StoryEntrance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static StoryEntrance parseFrom(InputStream inputStream) throws IOException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StoryEntrance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StoryEntrance parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StoryEntrance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StoryEntrance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
