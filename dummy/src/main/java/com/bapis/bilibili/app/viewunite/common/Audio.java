package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class Audio extends GeneratedMessageLite<Audio, Audio.Builder> implements MessageLiteOrBuilder {
    public static final int AUDIO_INFO_FIELD_NUMBER = 1;
    private static final Audio DEFAULT_INSTANCE;
    private static volatile Parser<Audio> PARSER;
    private MapFieldLite<Long, AudioInfo> audioInfo_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Audio$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69761 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16963xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16963xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16963xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16963xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16963xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class AudioInfoDefaultEntryHolder {
        static final MapEntryLite<Long, AudioInfo> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT64, 0L, WireFormat.FieldType.MESSAGE, AudioInfo.getDefaultInstance());

        private AudioInfoDefaultEntryHolder() {
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Audio, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69761 c69761) {
            this();
        }

        public Builder clearAudioInfo() {
            copyOnWrite();
            ((Audio) this.instance).getMutableAudioInfoMap().clear();
            return this;
        }

        public boolean containsAudioInfo(long j) {
            return ((Audio) this.instance).getAudioInfoMap().containsKey(Long.valueOf(j));
        }

        @Deprecated
        public Map<Long, AudioInfo> getAudioInfo() {
            return getAudioInfoMap();
        }

        public int getAudioInfoCount() {
            return ((Audio) this.instance).getAudioInfoMap().size();
        }

        public Map<Long, AudioInfo> getAudioInfoMap() {
            return Collections.unmodifiableMap(((Audio) this.instance).getAudioInfoMap());
        }

        public AudioInfo getAudioInfoOrDefault(long j, AudioInfo audioInfo) {
            Map<Long, AudioInfo> audioInfoMap = ((Audio) this.instance).getAudioInfoMap();
            return audioInfoMap.containsKey(Long.valueOf(j)) ? audioInfoMap.get(Long.valueOf(j)) : audioInfo;
        }

        public AudioInfo getAudioInfoOrThrow(long j) {
            Map<Long, AudioInfo> audioInfoMap = ((Audio) this.instance).getAudioInfoMap();
            if (audioInfoMap.containsKey(Long.valueOf(j))) {
                return audioInfoMap.get(Long.valueOf(j));
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllAudioInfo(Map<Long, AudioInfo> map) {
            copyOnWrite();
            ((Audio) this.instance).getMutableAudioInfoMap().putAll(map);
            return this;
        }

        public Builder putAudioInfo(long j, AudioInfo audioInfo) {
            audioInfo.getClass();
            copyOnWrite();
            ((Audio) this.instance).getMutableAudioInfoMap().put(Long.valueOf(j), audioInfo);
            return this;
        }

        public Builder removeAudioInfo(long j) {
            copyOnWrite();
            ((Audio) this.instance).getMutableAudioInfoMap().remove(Long.valueOf(j));
            return this;
        }

        private Builder() {
            super(Audio.DEFAULT_INSTANCE);
        }
    }

    static {
        Audio audio = new Audio();
        DEFAULT_INSTANCE = audio;
        GeneratedMessageLite.registerDefaultInstance(Audio.class, audio);
    }

    private Audio() {
    }

    public static Audio getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, AudioInfo> getMutableAudioInfoMap() {
        return internalGetMutableAudioInfo();
    }

    private MapFieldLite<Long, AudioInfo> internalGetAudioInfo() {
        return this.audioInfo_;
    }

    private MapFieldLite<Long, AudioInfo> internalGetMutableAudioInfo() {
        if (!this.audioInfo_.isMutable()) {
            this.audioInfo_ = this.audioInfo_.mutableCopy();
        }
        return this.audioInfo_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Audio parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Audio parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Audio> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsAudioInfo(long j) {
        return internalGetAudioInfo().containsKey(Long.valueOf(j));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69761.f16963xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Audio();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"audioInfo_", AudioInfoDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Audio> parser = PARSER;
                if (parser == null) {
                    synchronized (Audio.class) {
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

    @Deprecated
    public Map<Long, AudioInfo> getAudioInfo() {
        return getAudioInfoMap();
    }

    public int getAudioInfoCount() {
        return internalGetAudioInfo().size();
    }

    public Map<Long, AudioInfo> getAudioInfoMap() {
        return Collections.unmodifiableMap(internalGetAudioInfo());
    }

    public AudioInfo getAudioInfoOrDefault(long j, AudioInfo audioInfo) {
        MapFieldLite<Long, AudioInfo> internalGetAudioInfo = internalGetAudioInfo();
        return internalGetAudioInfo.containsKey(Long.valueOf(j)) ? internalGetAudioInfo.get(Long.valueOf(j)) : audioInfo;
    }

    public AudioInfo getAudioInfoOrThrow(long j) {
        MapFieldLite<Long, AudioInfo> internalGetAudioInfo = internalGetAudioInfo();
        if (internalGetAudioInfo.containsKey(Long.valueOf(j))) {
            return internalGetAudioInfo.get(Long.valueOf(j));
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(Audio audio) {
        return DEFAULT_INSTANCE.createBuilder(audio);
    }

    public static Audio parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Audio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Audio parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Audio parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Audio parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Audio parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Audio parseFrom(InputStream inputStream) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Audio parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Audio parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Audio parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Audio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
