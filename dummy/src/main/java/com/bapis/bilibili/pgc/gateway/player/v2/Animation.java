package com.bapis.bilibili.pgc.gateway.player.v2;

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
public final class Animation extends GeneratedMessageLite<Animation, Animation.Builder> implements MessageLiteOrBuilder {
    private static final Animation DEFAULT_INSTANCE;
    private static volatile Parser<Animation> PARSER = null;
    public static final int QN_SVGA_ANIMATION_MAP_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> qnSvgaAnimationMap_ = MapFieldLite.emptyMapField();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.pgc.gateway.player.v2.Animation$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C78171 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17544xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17544xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17544xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17544xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17544xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17544xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17544xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17544xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Animation, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C78171 c78171) {
            this();
        }

        public Builder clearQnSvgaAnimationMap() {
            copyOnWrite();
            ((Animation) this.instance).getMutableQnSvgaAnimationMapMap().clear();
            return this;
        }

        public boolean containsQnSvgaAnimationMap(String str) {
            str.getClass();
            return ((Animation) this.instance).getQnSvgaAnimationMapMap().containsKey(str);
        }

        @Deprecated
        public Map<String, String> getQnSvgaAnimationMap() {
            return getQnSvgaAnimationMapMap();
        }

        public int getQnSvgaAnimationMapCount() {
            return ((Animation) this.instance).getQnSvgaAnimationMapMap().size();
        }

        public Map<String, String> getQnSvgaAnimationMapMap() {
            return Collections.unmodifiableMap(((Animation) this.instance).getQnSvgaAnimationMapMap());
        }

        public String getQnSvgaAnimationMapOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> qnSvgaAnimationMapMap = ((Animation) this.instance).getQnSvgaAnimationMapMap();
            return qnSvgaAnimationMapMap.containsKey(str) ? qnSvgaAnimationMapMap.get(str) : str2;
        }

        public String getQnSvgaAnimationMapOrThrow(String str) {
            str.getClass();
            Map<String, String> qnSvgaAnimationMapMap = ((Animation) this.instance).getQnSvgaAnimationMapMap();
            if (qnSvgaAnimationMapMap.containsKey(str)) {
                return qnSvgaAnimationMapMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllQnSvgaAnimationMap(Map<String, String> map) {
            copyOnWrite();
            ((Animation) this.instance).getMutableQnSvgaAnimationMapMap().putAll(map);
            return this;
        }

        public Builder putQnSvgaAnimationMap(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((Animation) this.instance).getMutableQnSvgaAnimationMapMap().put(str, str2);
            return this;
        }

        public Builder removeQnSvgaAnimationMap(String str) {
            str.getClass();
            copyOnWrite();
            ((Animation) this.instance).getMutableQnSvgaAnimationMapMap().remove(str);
            return this;
        }

        private Builder() {
            super(Animation.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    private static final class QnSvgaAnimationMapDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private QnSvgaAnimationMapDefaultEntryHolder() {
        }
    }

    static {
        Animation animation = new Animation();
        DEFAULT_INSTANCE = animation;
        GeneratedMessageLite.registerDefaultInstance(Animation.class, animation);
    }

    private Animation() {
    }

    public static Animation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableQnSvgaAnimationMapMap() {
        return internalGetMutableQnSvgaAnimationMap();
    }

    private MapFieldLite<String, String> internalGetMutableQnSvgaAnimationMap() {
        if (!this.qnSvgaAnimationMap_.isMutable()) {
            this.qnSvgaAnimationMap_ = this.qnSvgaAnimationMap_.mutableCopy();
        }
        return this.qnSvgaAnimationMap_;
    }

    private MapFieldLite<String, String> internalGetQnSvgaAnimationMap() {
        return this.qnSvgaAnimationMap_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Animation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Animation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Animation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Animation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsQnSvgaAnimationMap(String str) {
        str.getClass();
        return internalGetQnSvgaAnimationMap().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C78171.f17544xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Animation();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"qnSvgaAnimationMap_", QnSvgaAnimationMapDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Animation> parser = PARSER;
                if (parser == null) {
                    synchronized (Animation.class) {
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
    public Map<String, String> getQnSvgaAnimationMap() {
        return getQnSvgaAnimationMapMap();
    }

    public int getQnSvgaAnimationMapCount() {
        return internalGetQnSvgaAnimationMap().size();
    }

    public Map<String, String> getQnSvgaAnimationMapMap() {
        return Collections.unmodifiableMap(internalGetQnSvgaAnimationMap());
    }

    public String getQnSvgaAnimationMapOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetQnSvgaAnimationMap = internalGetQnSvgaAnimationMap();
        return internalGetQnSvgaAnimationMap.containsKey(str) ? internalGetQnSvgaAnimationMap.get(str) : str2;
    }

    public String getQnSvgaAnimationMapOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetQnSvgaAnimationMap = internalGetQnSvgaAnimationMap();
        if (internalGetQnSvgaAnimationMap.containsKey(str)) {
            return internalGetQnSvgaAnimationMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(Animation animation) {
        return DEFAULT_INSTANCE.createBuilder(animation);
    }

    public static Animation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Animation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Animation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Animation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Animation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Animation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Animation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Animation parseFrom(InputStream inputStream) throws IOException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Animation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Animation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Animation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Animation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
