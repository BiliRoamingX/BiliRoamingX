package com.bapis.bilibili.app.distribution;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
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
public final class SetUserPreferenceReq extends GeneratedMessageLite<SetUserPreferenceReq, SetUserPreferenceReq.C8326b> implements MessageLiteOrBuilder {
    private static final SetUserPreferenceReq DEFAULT_INSTANCE;
    public static final int EXTRA_CONTEXT_FIELD_NUMBER = 2;
    private static volatile Parser<SetUserPreferenceReq> PARSER = null;
    public static final int PREFERENCE_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> extraContext_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<Any> preference_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.SetUserPreferenceReq$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C8325a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f19923xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f19923xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19923xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19923xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19923xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19923xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19923xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19923xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.SetUserPreferenceReq$b */
    /* loaded from: classes13.dex */
    public static final class C8326b extends GeneratedMessageLite.Builder<SetUserPreferenceReq, C8326b> implements MessageLiteOrBuilder {
        /* synthetic */ C8326b(C8325a c8325a) {
            this();
        }

        public C8326b addAllPreference(Iterable<? extends Any> iterable) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).addAllPreference(iterable);
            return this;
        }

        public C8326b addPreference(Any any) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).addPreference(any);
            return this;
        }

        public C8326b clearExtraContext() {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).getMutableExtraContextMap().clear();
            return this;
        }

        public C8326b clearPreference() {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).clearPreference();
            return this;
        }

        public boolean containsExtraContext(String str) {
            str.getClass();
            return ((SetUserPreferenceReq) this.instance).getExtraContextMap().containsKey(str);
        }

        @Deprecated
        public Map<String, String> getExtraContext() {
            return getExtraContextMap();
        }

        public int getExtraContextCount() {
            return ((SetUserPreferenceReq) this.instance).getExtraContextMap().size();
        }

        public Map<String, String> getExtraContextMap() {
            return Collections.unmodifiableMap(((SetUserPreferenceReq) this.instance).getExtraContextMap());
        }

        public String getExtraContextOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> extraContextMap = ((SetUserPreferenceReq) this.instance).getExtraContextMap();
            return extraContextMap.containsKey(str) ? extraContextMap.get(str) : str2;
        }

        public String getExtraContextOrThrow(String str) {
            str.getClass();
            Map<String, String> extraContextMap = ((SetUserPreferenceReq) this.instance).getExtraContextMap();
            if (extraContextMap.containsKey(str)) {
                return extraContextMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Any getPreference(int i) {
            return ((SetUserPreferenceReq) this.instance).getPreference(i);
        }

        public int getPreferenceCount() {
            return ((SetUserPreferenceReq) this.instance).getPreferenceCount();
        }

        public List<Any> getPreferenceList() {
            return Collections.unmodifiableList(((SetUserPreferenceReq) this.instance).getPreferenceList());
        }

        public C8326b putAllExtraContext(Map<String, String> map) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).getMutableExtraContextMap().putAll(map);
            return this;
        }

        public C8326b putExtraContext(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).getMutableExtraContextMap().put(str, str2);
            return this;
        }

        public C8326b removeExtraContext(String str) {
            str.getClass();
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).getMutableExtraContextMap().remove(str);
            return this;
        }

        public C8326b removePreference(int i) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).removePreference(i);
            return this;
        }

        public C8326b setPreference(int i, Any any) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).setPreference(i, any);
            return this;
        }

        private C8326b() {
            super(SetUserPreferenceReq.DEFAULT_INSTANCE);
        }

        public C8326b addPreference(int i, Any any) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).addPreference(i, any);
            return this;
        }

        public C8326b setPreference(int i, Any.Builder builder) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).setPreference(i, builder.build());
            return this;
        }

        public C8326b addPreference(Any.Builder builder) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).addPreference(builder.build());
            return this;
        }

        public C8326b addPreference(int i, Any.Builder builder) {
            copyOnWrite();
            ((SetUserPreferenceReq) this.instance).addPreference(i, builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.distribution.SetUserPreferenceReq$c */
    /* loaded from: classes13.dex */
    private static final class C8327c {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private C8327c() {
        }
    }

    static {
        SetUserPreferenceReq setUserPreferenceReq = new SetUserPreferenceReq();
        DEFAULT_INSTANCE = setUserPreferenceReq;
        GeneratedMessageLite.registerDefaultInstance(SetUserPreferenceReq.class, setUserPreferenceReq);
    }

    private SetUserPreferenceReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreference(Iterable<? extends Any> iterable) {
        ensurePreferenceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.preference_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreference(Any any) {
        any.getClass();
        ensurePreferenceIsMutable();
        this.preference_.add(any);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreference() {
        this.preference_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePreferenceIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.preference_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.preference_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SetUserPreferenceReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public static C8326b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SetUserPreferenceReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetUserPreferenceReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SetUserPreferenceReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePreference(int i) {
        ensurePreferenceIsMutable();
        this.preference_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreference(int i, Any any) {
        any.getClass();
        ensurePreferenceIsMutable();
        this.preference_.set(i, any);
    }

    public boolean containsExtraContext(String str) {
        str.getClass();
        return internalGetExtraContext().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8325a.f19923xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SetUserPreferenceReq();
            case 2:
                return new C8326b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001b\u00022", new Object[]{"preference_", Any.class, "extraContext_", C8327c.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SetUserPreferenceReq> parser = PARSER;
                if (parser == null) {
                    synchronized (SetUserPreferenceReq.class) {
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

    public Any getPreference(int i) {
        return this.preference_.get(i);
    }

    public int getPreferenceCount() {
        return this.preference_.size();
    }

    public List<Any> getPreferenceList() {
        return this.preference_;
    }

    public AnyOrBuilder getPreferenceOrBuilder(int i) {
        return this.preference_.get(i);
    }

    public List<? extends AnyOrBuilder> getPreferenceOrBuilderList() {
        return this.preference_;
    }

    public static C8326b newBuilder(SetUserPreferenceReq setUserPreferenceReq) {
        return DEFAULT_INSTANCE.createBuilder(setUserPreferenceReq);
    }

    public static SetUserPreferenceReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SetUserPreferenceReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SetUserPreferenceReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreference(int i, Any any) {
        any.getClass();
        ensurePreferenceIsMutable();
        this.preference_.add(i, any);
    }

    public static SetUserPreferenceReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SetUserPreferenceReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SetUserPreferenceReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SetUserPreferenceReq parseFrom(InputStream inputStream) throws IOException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SetUserPreferenceReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SetUserPreferenceReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SetUserPreferenceReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SetUserPreferenceReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
