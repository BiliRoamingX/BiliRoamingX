package com.bapis.bilibili.app.viewunite.v1;

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
/* loaded from: classes20.dex */
public final class FragmentRes extends GeneratedMessageLite<FragmentRes, FragmentRes.C12314b> implements MessageLiteOrBuilder {
    private static final FragmentRes DEFAULT_INSTANCE;
    private static volatile Parser<FragmentRes> PARSER = null;
    public static final int VIDEO_SHOT_FIELD_NUMBER = 1;
    private MapFieldLite<Long, VideoShot> videoShot_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.FragmentRes$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12313a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21274xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21274xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21274xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21274xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21274xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21274xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21274xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21274xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.FragmentRes$b */
    /* loaded from: classes20.dex */
    public static final class C12314b extends GeneratedMessageLite.Builder<FragmentRes, C12314b> implements MessageLiteOrBuilder {
        /* synthetic */ C12314b(C12313a c12313a) {
            this();
        }

        public C12314b clearVideoShot() {
            copyOnWrite();
            ((FragmentRes) this.instance).getMutableVideoShotMap().clear();
            return this;
        }

        public boolean containsVideoShot(long j) {
            return ((FragmentRes) this.instance).getVideoShotMap().containsKey(Long.valueOf(j));
        }

        @Deprecated
        public Map<Long, VideoShot> getVideoShot() {
            return getVideoShotMap();
        }

        public int getVideoShotCount() {
            return ((FragmentRes) this.instance).getVideoShotMap().size();
        }

        public Map<Long, VideoShot> getVideoShotMap() {
            return Collections.unmodifiableMap(((FragmentRes) this.instance).getVideoShotMap());
        }

        public VideoShot getVideoShotOrDefault(long j, VideoShot videoShot) {
            Map<Long, VideoShot> videoShotMap = ((FragmentRes) this.instance).getVideoShotMap();
            return videoShotMap.containsKey(Long.valueOf(j)) ? videoShotMap.get(Long.valueOf(j)) : videoShot;
        }

        public VideoShot getVideoShotOrThrow(long j) {
            Map<Long, VideoShot> videoShotMap = ((FragmentRes) this.instance).getVideoShotMap();
            if (videoShotMap.containsKey(Long.valueOf(j))) {
                return videoShotMap.get(Long.valueOf(j));
            }
            throw new IllegalArgumentException();
        }

        public C12314b putAllVideoShot(Map<Long, VideoShot> map) {
            copyOnWrite();
            ((FragmentRes) this.instance).getMutableVideoShotMap().putAll(map);
            return this;
        }

        public C12314b putVideoShot(long j, VideoShot videoShot) {
            videoShot.getClass();
            copyOnWrite();
            ((FragmentRes) this.instance).getMutableVideoShotMap().put(Long.valueOf(j), videoShot);
            return this;
        }

        public C12314b removeVideoShot(long j) {
            copyOnWrite();
            ((FragmentRes) this.instance).getMutableVideoShotMap().remove(Long.valueOf(j));
            return this;
        }

        private C12314b() {
            super(FragmentRes.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.FragmentRes$c */
    /* loaded from: classes20.dex */
    private static final class C12315c {
        static final MapEntryLite<Long, VideoShot> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT64, 0L, WireFormat.FieldType.MESSAGE, VideoShot.getDefaultInstance());

        private C12315c() {
        }
    }

    static {
        FragmentRes fragmentRes = new FragmentRes();
        DEFAULT_INSTANCE = fragmentRes;
        GeneratedMessageLite.registerDefaultInstance(FragmentRes.class, fragmentRes);
    }

    private FragmentRes() {
    }

    public static FragmentRes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, VideoShot> getMutableVideoShotMap() {
        return internalGetMutableVideoShot();
    }

    private MapFieldLite<Long, VideoShot> internalGetMutableVideoShot() {
        if (!this.videoShot_.isMutable()) {
            this.videoShot_ = this.videoShot_.mutableCopy();
        }
        return this.videoShot_;
    }

    private MapFieldLite<Long, VideoShot> internalGetVideoShot() {
        return this.videoShot_;
    }

    public static C12314b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FragmentRes parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FragmentRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentRes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FragmentRes> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsVideoShot(long j) {
        return internalGetVideoShot().containsKey(Long.valueOf(j));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12313a.f21274xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FragmentRes();
            case 2:
                return new C12314b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"videoShot_", C12315c.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FragmentRes> parser = PARSER;
                if (parser == null) {
                    synchronized (FragmentRes.class) {
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
    public Map<Long, VideoShot> getVideoShot() {
        return getVideoShotMap();
    }

    public int getVideoShotCount() {
        return internalGetVideoShot().size();
    }

    public Map<Long, VideoShot> getVideoShotMap() {
        return Collections.unmodifiableMap(internalGetVideoShot());
    }

    public VideoShot getVideoShotOrDefault(long j, VideoShot videoShot) {
        MapFieldLite<Long, VideoShot> internalGetVideoShot = internalGetVideoShot();
        return internalGetVideoShot.containsKey(Long.valueOf(j)) ? internalGetVideoShot.get(Long.valueOf(j)) : videoShot;
    }

    public VideoShot getVideoShotOrThrow(long j) {
        MapFieldLite<Long, VideoShot> internalGetVideoShot = internalGetVideoShot();
        if (internalGetVideoShot.containsKey(Long.valueOf(j))) {
            return internalGetVideoShot.get(Long.valueOf(j));
        }
        throw new IllegalArgumentException();
    }

    public static C12314b newBuilder(FragmentRes fragmentRes) {
        return DEFAULT_INSTANCE.createBuilder(fragmentRes);
    }

    public static FragmentRes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentRes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FragmentRes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FragmentRes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FragmentRes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FragmentRes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FragmentRes parseFrom(InputStream inputStream) throws IOException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentRes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentRes parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FragmentRes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
