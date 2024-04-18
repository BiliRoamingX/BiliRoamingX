package com.bapis.bilibili.app.distribution;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
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
import java.util.List;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class GetUserPreferenceReq extends GeneratedMessageLite<GetUserPreferenceReq, GetUserPreferenceReq.C8317b> implements MessageLiteOrBuilder {
    private static final GetUserPreferenceReq DEFAULT_INSTANCE;
    public static final int EXTRA_CONTEXT_FIELD_NUMBER = 2;
    private static volatile Parser<GetUserPreferenceReq> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> extraContext_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<String> typeUrl_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.GetUserPreferenceReq$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8316a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19919xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19919xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19919xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19919xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19919xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19919xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19919xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19919xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.GetUserPreferenceReq$b */
    /* loaded from: classes13.dex */
    public static final class C8317b extends GeneratedMessageLite.Builder<GetUserPreferenceReq, C8317b> implements MessageLiteOrBuilder {
        /* synthetic */ C8317b(C8316a c8316a) {
            this();
        }

        public C8317b addAllTypeUrl(Iterable<String> iterable) {
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).addAllTypeUrl(iterable);
            return this;
        }

        public C8317b addTypeUrl(String str) {
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).addTypeUrl(str);
            return this;
        }

        public C8317b addTypeUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).addTypeUrlBytes(byteString);
            return this;
        }

        public C8317b clearExtraContext() {
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).getMutableExtraContextMap().clear();
            return this;
        }

        public C8317b clearTypeUrl() {
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).clearTypeUrl();
            return this;
        }

        public boolean containsExtraContext(String str) {
            str.getClass();
            return ((GetUserPreferenceReq) this.instance).getExtraContextMap().containsKey(str);
        }

        @Deprecated
        public Map<String, String> getExtraContext() {
            return getExtraContextMap();
        }

        public int getExtraContextCount() {
            return ((GetUserPreferenceReq) this.instance).getExtraContextMap().size();
        }

        public Map<String, String> getExtraContextMap() {
            return Collections.unmodifiableMap(((GetUserPreferenceReq) this.instance).getExtraContextMap());
        }

        public String getExtraContextOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> extraContextMap = ((GetUserPreferenceReq) this.instance).getExtraContextMap();
            return extraContextMap.containsKey(str) ? extraContextMap.get(str) : str2;
        }

        public String getExtraContextOrThrow(String str) {
            str.getClass();
            Map<String, String> extraContextMap = ((GetUserPreferenceReq) this.instance).getExtraContextMap();
            if (extraContextMap.containsKey(str)) {
                return extraContextMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getTypeUrl(int i) {
            return ((GetUserPreferenceReq) this.instance).getTypeUrl(i);
        }

        public ByteString getTypeUrlBytes(int i) {
            return ((GetUserPreferenceReq) this.instance).getTypeUrlBytes(i);
        }

        public int getTypeUrlCount() {
            return ((GetUserPreferenceReq) this.instance).getTypeUrlCount();
        }

        public List<String> getTypeUrlList() {
            return Collections.unmodifiableList(((GetUserPreferenceReq) this.instance).getTypeUrlList());
        }

        public C8317b putAllExtraContext(Map<String, String> map) {
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).getMutableExtraContextMap().putAll(map);
            return this;
        }

        public C8317b putExtraContext(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).getMutableExtraContextMap().put(str, str2);
            return this;
        }

        public C8317b removeExtraContext(String str) {
            str.getClass();
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).getMutableExtraContextMap().remove(str);
            return this;
        }

        public C8317b setTypeUrl(int i, String str) {
            copyOnWrite();
            ((GetUserPreferenceReq) this.instance).setTypeUrl(i, str);
            return this;
        }

        private C8317b() {
            super(GetUserPreferenceReq.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.GetUserPreferenceReq$c */
    /* loaded from: classes13.dex */
    private static final class C8318c {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private C8318c() {
        }
    }

    static {
        GetUserPreferenceReq getUserPreferenceReq = new GetUserPreferenceReq();
        DEFAULT_INSTANCE = getUserPreferenceReq;
        GeneratedMessageLite.registerDefaultInstance(GetUserPreferenceReq.class, getUserPreferenceReq);
    }

    private GetUserPreferenceReq() {
    }

    public void addAllTypeUrl(Iterable<String> iterable) {
        ensureTypeUrlIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.typeUrl_);
    }

    public void addTypeUrl(String str) {
        str.getClass();
        ensureTypeUrlIsMutable();
        this.typeUrl_.add(str);
    }

    public void addTypeUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureTypeUrlIsMutable();
        this.typeUrl_.add(byteString.toStringUtf8());
    }

    public void clearTypeUrl() {
        this.typeUrl_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTypeUrlIsMutable() {
        Internal.ProtobufList<String> protobufList = this.typeUrl_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.typeUrl_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GetUserPreferenceReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Map<String, String> getMutableExtraContextMap() {
        return internalGetMutableExtraContext();
    }

    private MapFieldLite<String, String> internalGetExtraContext() {
        return this.extraContext_;
    }

    private MapFieldLite<String, String> internalGetMutableExtraContext() {
        if (!this.extraContext_.isMutable()) {
            this.extraContext_ = this.extraContext_.mutableCopy();
        }
        return this.extraContext_;
    }

    public static C8317b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GetUserPreferenceReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserPreferenceReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GetUserPreferenceReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setTypeUrl(int i, String str) {
        str.getClass();
        ensureTypeUrlIsMutable();
        this.typeUrl_.set(i, str);
    }

    public boolean containsExtraContext(String str) {
        str.getClass();
        return internalGetExtraContext().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8316a.f19919xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GetUserPreferenceReq();
            case 2:
                return new C8317b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u021a\u00022", new Object[]{"typeUrl_", "extraContext_", C8318c.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GetUserPreferenceReq> parser = PARSER;
                if (parser == null) {
                    synchronized (GetUserPreferenceReq.class) {
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
    public Map<String, String> getExtraContext() {
        return getExtraContextMap();
    }

    public int getExtraContextCount() {
        return internalGetExtraContext().size();
    }

    public Map<String, String> getExtraContextMap() {
        return Collections.unmodifiableMap(internalGetExtraContext());
    }

    public String getExtraContextOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetExtraContext = internalGetExtraContext();
        return internalGetExtraContext.containsKey(str) ? internalGetExtraContext.get(str) : str2;
    }

    public String getExtraContextOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetExtraContext = internalGetExtraContext();
        if (internalGetExtraContext.containsKey(str)) {
            return internalGetExtraContext.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getTypeUrl(int i) {
        return this.typeUrl_.get(i);
    }

    public ByteString getTypeUrlBytes(int i) {
        return ByteString.copyFromUtf8(this.typeUrl_.get(i));
    }

    public int getTypeUrlCount() {
        return this.typeUrl_.size();
    }

    public List<String> getTypeUrlList() {
        return this.typeUrl_;
    }

    public static C8317b newBuilder(GetUserPreferenceReq getUserPreferenceReq) {
        return DEFAULT_INSTANCE.createBuilder(getUserPreferenceReq);
    }

    public static GetUserPreferenceReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserPreferenceReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetUserPreferenceReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GetUserPreferenceReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetUserPreferenceReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetUserPreferenceReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GetUserPreferenceReq parseFrom(InputStream inputStream) throws IOException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserPreferenceReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserPreferenceReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetUserPreferenceReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
