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
/* loaded from: classes18.dex */
public final class PlayDeviceConf extends GeneratedMessageLite<PlayDeviceConf, PlayDeviceConf.Builder> implements MessageLiteOrBuilder {
    private static final PlayDeviceConf DEFAULT_INSTANCE;
    public static final int DEVICE_CONFS_FIELD_NUMBER = 1;
    private static volatile Parser<PlayDeviceConf> PARSER;
    private MapFieldLite<Integer, DeviceConf> deviceConfs_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.PlayDeviceConf$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81911 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17911xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17911xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17911xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17911xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17911xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17911xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17911xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17911xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayDeviceConf, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81911 c81911) {
            this();
        }

        public Builder clearDeviceConfs() {
            copyOnWrite();
            ((PlayDeviceConf) this.instance).getMutableDeviceConfsMap().clear();
            return this;
        }

        public boolean containsDeviceConfs(int i) {
            return ((PlayDeviceConf) this.instance).getDeviceConfsMap().containsKey(Integer.valueOf(i));
        }

        @Deprecated
        public Map<Integer, DeviceConf> getDeviceConfs() {
            return getDeviceConfsMap();
        }

        public int getDeviceConfsCount() {
            return ((PlayDeviceConf) this.instance).getDeviceConfsMap().size();
        }

        public Map<Integer, DeviceConf> getDeviceConfsMap() {
            return Collections.unmodifiableMap(((PlayDeviceConf) this.instance).getDeviceConfsMap());
        }

        public DeviceConf getDeviceConfsOrDefault(int i, DeviceConf deviceConf) {
            Map<Integer, DeviceConf> deviceConfsMap = ((PlayDeviceConf) this.instance).getDeviceConfsMap();
            return deviceConfsMap.containsKey(Integer.valueOf(i)) ? deviceConfsMap.get(Integer.valueOf(i)) : deviceConf;
        }

        public DeviceConf getDeviceConfsOrThrow(int i) {
            Map<Integer, DeviceConf> deviceConfsMap = ((PlayDeviceConf) this.instance).getDeviceConfsMap();
            if (deviceConfsMap.containsKey(Integer.valueOf(i))) {
                return deviceConfsMap.get(Integer.valueOf(i));
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllDeviceConfs(Map<Integer, DeviceConf> map) {
            copyOnWrite();
            ((PlayDeviceConf) this.instance).getMutableDeviceConfsMap().putAll(map);
            return this;
        }

        public Builder putDeviceConfs(int i, DeviceConf deviceConf) {
            deviceConf.getClass();
            copyOnWrite();
            ((PlayDeviceConf) this.instance).getMutableDeviceConfsMap().put(Integer.valueOf(i), deviceConf);
            return this;
        }

        public Builder removeDeviceConfs(int i) {
            copyOnWrite();
            ((PlayDeviceConf) this.instance).getMutableDeviceConfsMap().remove(Integer.valueOf(i));
            return this;
        }

        private Builder() {
            super(PlayDeviceConf.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    private static final class DeviceConfsDefaultEntryHolder {
        static final MapEntryLite<Integer, DeviceConf> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT32, 0, WireFormat.FieldType.MESSAGE, DeviceConf.getDefaultInstance());

        private DeviceConfsDefaultEntryHolder() {
        }
    }

    static {
        PlayDeviceConf playDeviceConf = new PlayDeviceConf();
        DEFAULT_INSTANCE = playDeviceConf;
        GeneratedMessageLite.registerDefaultInstance(PlayDeviceConf.class, playDeviceConf);
    }

    private PlayDeviceConf() {
    }

    public static PlayDeviceConf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<Integer, DeviceConf> getMutableDeviceConfsMap() {
        return internalGetMutableDeviceConfs();
    }

    private MapFieldLite<Integer, DeviceConf> internalGetDeviceConfs() {
        return this.deviceConfs_;
    }

    private MapFieldLite<Integer, DeviceConf> internalGetMutableDeviceConfs() {
        if (!this.deviceConfs_.isMutable()) {
            this.deviceConfs_ = this.deviceConfs_.mutableCopy();
        }
        return this.deviceConfs_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayDeviceConf parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayDeviceConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayDeviceConf parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayDeviceConf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsDeviceConfs(int i) {
        return internalGetDeviceConfs().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81911.f17911xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayDeviceConf();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"deviceConfs_", DeviceConfsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayDeviceConf> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayDeviceConf.class) {
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
    public Map<Integer, DeviceConf> getDeviceConfs() {
        return getDeviceConfsMap();
    }

    public int getDeviceConfsCount() {
        return internalGetDeviceConfs().size();
    }

    public Map<Integer, DeviceConf> getDeviceConfsMap() {
        return Collections.unmodifiableMap(internalGetDeviceConfs());
    }

    public DeviceConf getDeviceConfsOrDefault(int i, DeviceConf deviceConf) {
        MapFieldLite<Integer, DeviceConf> internalGetDeviceConfs = internalGetDeviceConfs();
        return internalGetDeviceConfs.containsKey(Integer.valueOf(i)) ? internalGetDeviceConfs.get(Integer.valueOf(i)) : deviceConf;
    }

    public DeviceConf getDeviceConfsOrThrow(int i) {
        MapFieldLite<Integer, DeviceConf> internalGetDeviceConfs = internalGetDeviceConfs();
        if (internalGetDeviceConfs.containsKey(Integer.valueOf(i))) {
            return internalGetDeviceConfs.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(PlayDeviceConf playDeviceConf) {
        return DEFAULT_INSTANCE.createBuilder(playDeviceConf);
    }

    public static PlayDeviceConf parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayDeviceConf) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayDeviceConf parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayDeviceConf parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayDeviceConf parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayDeviceConf parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayDeviceConf parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayDeviceConf parseFrom(InputStream inputStream) throws IOException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayDeviceConf parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayDeviceConf parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayDeviceConf parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayDeviceConf) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
