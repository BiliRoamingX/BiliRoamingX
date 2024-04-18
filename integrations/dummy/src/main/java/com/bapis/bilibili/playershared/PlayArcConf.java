package com.bapis.bilibili.playershared;

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
/* loaded from: classes14.dex */
public final class PlayArcConf extends GeneratedMessageLite<PlayArcConf, PlayArcConf.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_CONFS_FIELD_NUMBER = 1;
    private static final PlayArcConf DEFAULT_INSTANCE;
    private static volatile Parser<PlayArcConf> PARSER;
    private MapFieldLite<Integer, ArcConf> arcConfs_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.PlayArcConf$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C79171 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17624xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17624xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17624xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17624xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17624xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17624xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17624xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17624xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class ArcConfsDefaultEntryHolder {
        static final MapEntryLite<Integer, ArcConf> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT32, 0, WireFormat.FieldType.MESSAGE, ArcConf.getDefaultInstance());

        private ArcConfsDefaultEntryHolder() {
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayArcConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C79171 c79171) {
            this();
        }

        public Builder clearArcConfs() {
            copyOnWrite();
            ((PlayArcConf) this.instance).getMutableArcConfsMap().clear();
            return this;
        }

        public boolean containsArcConfs(int i) {
            return ((PlayArcConf) this.instance).getArcConfsMap().containsKey(Integer.valueOf(i));
        }

        @Deprecated
        public Map<Integer, ArcConf> getArcConfs() {
            return getArcConfsMap();
        }

        public int getArcConfsCount() {
            return ((PlayArcConf) this.instance).getArcConfsMap().size();
        }

        public Map<Integer, ArcConf> getArcConfsMap() {
            return Collections.unmodifiableMap(((PlayArcConf) this.instance).getArcConfsMap());
        }

        public ArcConf getArcConfsOrDefault(int i, ArcConf arcConf) {
            Map<Integer, ArcConf> arcConfsMap = ((PlayArcConf) this.instance).getArcConfsMap();
            return arcConfsMap.containsKey(Integer.valueOf(i)) ? arcConfsMap.get(Integer.valueOf(i)) : arcConf;
        }

        public ArcConf getArcConfsOrThrow(int i) {
            Map<Integer, ArcConf> arcConfsMap = ((PlayArcConf) this.instance).getArcConfsMap();
            if (arcConfsMap.containsKey(Integer.valueOf(i))) {
                return arcConfsMap.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllArcConfs(Map<Integer, ArcConf> map) {
            copyOnWrite();
            ((PlayArcConf) this.instance).getMutableArcConfsMap().putAll(map);
            return this;
        }

        public Builder putArcConfs(int i, ArcConf arcConf) {
            arcConf.getClass();
            copyOnWrite();
            ((PlayArcConf) this.instance).getMutableArcConfsMap().put(Integer.valueOf(i), arcConf);
            return this;
        }

        public Builder removeArcConfs(int i) {
            copyOnWrite();
            ((PlayArcConf) this.instance).getMutableArcConfsMap().remove(Integer.valueOf(i));
            return this;
        }

        private Builder() {
            super(PlayArcConf.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayArcConf playArcConf = new PlayArcConf();
        DEFAULT_INSTANCE = playArcConf;
        GeneratedMessageLite.registerDefaultInstance(PlayArcConf.class, playArcConf);
    }

    public PlayArcConf() {
    }

    public static PlayArcConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<Integer, ArcConf> getMutableArcConfsMap() {
        return internalGetMutableArcConfs();
    }

    private MapFieldLite<Integer, ArcConf> internalGetArcConfs() {
        return this.arcConfs_;
    }

    private MapFieldLite<Integer, ArcConf> internalGetMutableArcConfs() {
        if (!this.arcConfs_.isMutable()) {
            this.arcConfs_ = this.arcConfs_.mutableCopy();
        }
        return this.arcConfs_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayArcConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArcConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayArcConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsArcConfs(int i) {
        return internalGetArcConfs().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C79171.f17624xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayArcConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"arcConfs_", ArcConfsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayArcConf> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayArcConf.class) {
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
    public Map<Integer, ArcConf> getArcConfs() {
        return getArcConfsMap();
    }

    public int getArcConfsCount() {
        return internalGetArcConfs().size();
    }

    public Map<Integer, ArcConf> getArcConfsMap() {
        return Collections.unmodifiableMap(internalGetArcConfs());
    }

    public ArcConf getArcConfsOrDefault(int i, ArcConf arcConf) {
        MapFieldLite<Integer, ArcConf> internalGetArcConfs = internalGetArcConfs();
        return internalGetArcConfs.containsKey(Integer.valueOf(i)) ? internalGetArcConfs.get(Integer.valueOf(i)) : arcConf;
    }

    public ArcConf getArcConfsOrThrow(int i) {
        MapFieldLite<Integer, ArcConf> internalGetArcConfs = internalGetArcConfs();
        if (internalGetArcConfs.containsKey(Integer.valueOf(i))) {
            return internalGetArcConfs.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(PlayArcConf playArcConf) {
        return DEFAULT_INSTANCE.createBuilder(playArcConf);
    }

    public static PlayArcConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayArcConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayArcConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(InputStream inputStream) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayArcConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayArcConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayArcConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayArcConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    /**
     * getMutableArcConfsMap
     */
    static Map<Integer, ArcConf> access$100(PlayArcConf conf) {
        throw new UnsupportedOperationException("Stub");
    }
}
