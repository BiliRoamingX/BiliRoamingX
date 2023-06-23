package com.bapis.bilibili.pgc.gateway.player.v2;

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
/* loaded from: classes14.dex */
public final class SceneControl extends GeneratedMessageLite<SceneControl, SceneControl.Builder> implements MessageLiteOrBuilder {
    private static final SceneControl DEFAULT_INSTANCE;
    public static final int FAV_PLAYLIST_FIELD_NUMBER = 1;
    public static final int IS_NEED_TRIAL_FIELD_NUMBER = 5;
    private static volatile Parser<SceneControl> PARSER = null;
    public static final int PIP_FIELD_NUMBER = 3;
    public static final int SMALL_WINDOW_FIELD_NUMBER = 2;
    public static final int WAS_HE_INLINE_FIELD_NUMBER = 4;
    private boolean favPlaylist_;
    private boolean isNeedTrial_;
    private boolean pip_;
    private boolean smallWindow_;
    private boolean wasHeInline_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.SceneControl$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17594xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17594xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17594xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17594xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17594xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17594xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17594xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17594xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SceneControl, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78791 c78791) {
            this();
        }

        public Builder clearFavPlaylist() {
            copyOnWrite();
            ((SceneControl) this.instance).clearFavPlaylist();
            return this;
        }

        public Builder clearIsNeedTrial() {
            copyOnWrite();
            ((SceneControl) this.instance).clearIsNeedTrial();
            return this;
        }

        public Builder clearPip() {
            copyOnWrite();
            ((SceneControl) this.instance).clearPip();
            return this;
        }

        public Builder clearSmallWindow() {
            copyOnWrite();
            ((SceneControl) this.instance).clearSmallWindow();
            return this;
        }

        public Builder clearWasHeInline() {
            copyOnWrite();
            ((SceneControl) this.instance).clearWasHeInline();
            return this;
        }

        public boolean getFavPlaylist() {
            return ((SceneControl) this.instance).getFavPlaylist();
        }

        public boolean getIsNeedTrial() {
            return ((SceneControl) this.instance).getIsNeedTrial();
        }

        public boolean getPip() {
            return ((SceneControl) this.instance).getPip();
        }

        public boolean getSmallWindow() {
            return ((SceneControl) this.instance).getSmallWindow();
        }

        public boolean getWasHeInline() {
            return ((SceneControl) this.instance).getWasHeInline();
        }

        public Builder setFavPlaylist(boolean z) {
            copyOnWrite();
            ((SceneControl) this.instance).setFavPlaylist(z);
            return this;
        }

        public Builder setIsNeedTrial(boolean z) {
            copyOnWrite();
            ((SceneControl) this.instance).setIsNeedTrial(z);
            return this;
        }

        public Builder setPip(boolean z) {
            copyOnWrite();
            ((SceneControl) this.instance).setPip(z);
            return this;
        }

        public Builder setSmallWindow(boolean z) {
            copyOnWrite();
            ((SceneControl) this.instance).setSmallWindow(z);
            return this;
        }

        public Builder setWasHeInline(boolean z) {
            copyOnWrite();
            ((SceneControl) this.instance).setWasHeInline(z);
            return this;
        }

        private Builder() {
            super(SceneControl.DEFAULT_INSTANCE);
        }
    }

    static {
        SceneControl sceneControl = new SceneControl();
        DEFAULT_INSTANCE = sceneControl;
        GeneratedMessageLite.registerDefaultInstance(SceneControl.class, sceneControl);
    }

    private SceneControl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavPlaylist() {
        this.favPlaylist_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNeedTrial() {
        this.isNeedTrial_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPip() {
        this.pip_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallWindow() {
        this.smallWindow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWasHeInline() {
        this.wasHeInline_ = false;
    }

    public static SceneControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SceneControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SceneControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SceneControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SceneControl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavPlaylist(boolean z) {
        this.favPlaylist_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNeedTrial(boolean z) {
        this.isNeedTrial_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPip(boolean z) {
        this.pip_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallWindow(boolean z) {
        this.smallWindow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWasHeInline(boolean z) {
        this.wasHeInline_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78791.f17594xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SceneControl();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"favPlaylist_", "smallWindow_", "pip_", "wasHeInline_", "isNeedTrial_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SceneControl> parser = PARSER;
                if (parser == null) {
                    synchronized (SceneControl.class) {
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

    public boolean getFavPlaylist() {
        return this.favPlaylist_;
    }

    public boolean getIsNeedTrial() {
        return this.isNeedTrial_;
    }

    public boolean getPip() {
        return this.pip_;
    }

    public boolean getSmallWindow() {
        return this.smallWindow_;
    }

    public boolean getWasHeInline() {
        return this.wasHeInline_;
    }

    public static Builder newBuilder(SceneControl sceneControl) {
        return DEFAULT_INSTANCE.createBuilder(sceneControl);
    }

    public static SceneControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SceneControl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SceneControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SceneControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SceneControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SceneControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SceneControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SceneControl parseFrom(InputStream inputStream) throws IOException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SceneControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SceneControl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SceneControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SceneControl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
