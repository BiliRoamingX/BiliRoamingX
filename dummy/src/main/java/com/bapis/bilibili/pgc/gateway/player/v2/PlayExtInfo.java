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
public final class PlayExtInfo extends GeneratedMessageLite<PlayExtInfo, PlayExtInfo.Builder> implements MessageLiteOrBuilder {
    private static final PlayExtInfo DEFAULT_INSTANCE;
    private static volatile Parser<PlayExtInfo> PARSER = null;
    public static final int PLAY_DUBBING_INFO_FIELD_NUMBER = 1;
    private PlayDubbingInfo playDubbingInfo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.PlayExtInfo$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17581xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17581xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17581xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17581xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17581xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17581xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17581xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17581xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayExtInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78631 c78631) {
            this();
        }

        public Builder clearPlayDubbingInfo() {
            copyOnWrite();
            ((PlayExtInfo) this.instance).clearPlayDubbingInfo();
            return this;
        }

        public PlayDubbingInfo getPlayDubbingInfo() {
            return ((PlayExtInfo) this.instance).getPlayDubbingInfo();
        }

        public boolean hasPlayDubbingInfo() {
            return ((PlayExtInfo) this.instance).hasPlayDubbingInfo();
        }

        public Builder mergePlayDubbingInfo(PlayDubbingInfo playDubbingInfo) {
            copyOnWrite();
            ((PlayExtInfo) this.instance).mergePlayDubbingInfo(playDubbingInfo);
            return this;
        }

        public Builder setPlayDubbingInfo(PlayDubbingInfo playDubbingInfo) {
            copyOnWrite();
            ((PlayExtInfo) this.instance).setPlayDubbingInfo(playDubbingInfo);
            return this;
        }

        private Builder() {
            super(PlayExtInfo.DEFAULT_INSTANCE);
        }

        public Builder setPlayDubbingInfo(PlayDubbingInfo.Builder builder) {
            copyOnWrite();
            ((PlayExtInfo) this.instance).setPlayDubbingInfo(builder.build());
            return this;
        }
    }

    static {
        PlayExtInfo playExtInfo = new PlayExtInfo();
        DEFAULT_INSTANCE = playExtInfo;
        GeneratedMessageLite.registerDefaultInstance(PlayExtInfo.class, playExtInfo);
    }

    private PlayExtInfo() {
    }

    public void clearPlayDubbingInfo() {
        this.playDubbingInfo_ = null;
    }

    public static PlayExtInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergePlayDubbingInfo(PlayDubbingInfo playDubbingInfo) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayExtInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayExtInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayExtInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayExtInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setPlayDubbingInfo(PlayDubbingInfo playDubbingInfo) {
        playDubbingInfo.getClass();
        this.playDubbingInfo_ = playDubbingInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78631.f17581xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayExtInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"playDubbingInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayExtInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayExtInfo.class) {
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

    public PlayDubbingInfo getPlayDubbingInfo() {
        PlayDubbingInfo playDubbingInfo = this.playDubbingInfo_;
        return playDubbingInfo == null ? PlayDubbingInfo.getDefaultInstance() : playDubbingInfo;
    }

    public boolean hasPlayDubbingInfo() {
        return this.playDubbingInfo_ != null;
    }

    public static Builder newBuilder(PlayExtInfo playExtInfo) {
        return DEFAULT_INSTANCE.createBuilder(playExtInfo);
    }

    public static PlayExtInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayExtInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayExtInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayExtInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayExtInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayExtInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayExtInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayExtInfo parseFrom(InputStream inputStream) throws IOException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayExtInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayExtInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayExtInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayExtInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
