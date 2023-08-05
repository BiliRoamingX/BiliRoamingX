package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.bapis.bilibili.app.viewunite.common.Staff;
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
public final class ViewPgcAny extends GeneratedMessageLite<ViewPgcAny, ViewPgcAny.Builder> implements MessageLiteOrBuilder {
    public static final int ALL_UP_INFO_FIELD_NUMBER = 2;
    private static final ViewPgcAny DEFAULT_INSTANCE;
    public static final int OGV_DATA_FIELD_NUMBER = 1;
    private static volatile Parser<ViewPgcAny> PARSER;
    private MapFieldLite<Long, Staff> allUpInfo_ = MapFieldLite.emptyMapField();
    private OgvData ogvData_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17076xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17076xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17076xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17076xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17076xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17076xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17076xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17076xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class AllUpInfoDefaultEntryHolder {
        static final MapEntryLite<Long, Staff> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.INT64, 0L, WireFormat.FieldType.MESSAGE, Staff.getDefaultInstance());

        private AllUpInfoDefaultEntryHolder() {
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ViewPgcAny, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70991 c70991) {
            this();
        }

        public Builder clearAllUpInfo() {
            copyOnWrite();
            ((ViewPgcAny) this.instance).getMutableAllUpInfoMap().clear();
            return this;
        }

        public Builder clearOgvData() {
            copyOnWrite();
            ((ViewPgcAny) this.instance).clearOgvData();
            return this;
        }

        public boolean containsAllUpInfo(long j) {
            return ((ViewPgcAny) this.instance).getAllUpInfoMap().containsKey(Long.valueOf(j));
        }

        @Deprecated
        public Map<Long, Staff> getAllUpInfo() {
            return getAllUpInfoMap();
        }

        public int getAllUpInfoCount() {
            return ((ViewPgcAny) this.instance).getAllUpInfoMap().size();
        }

        public Map<Long, Staff> getAllUpInfoMap() {
            return Collections.unmodifiableMap(((ViewPgcAny) this.instance).getAllUpInfoMap());
        }

        public Staff getAllUpInfoOrDefault(long j, Staff staff) {
            Map<Long, Staff> allUpInfoMap = ((ViewPgcAny) this.instance).getAllUpInfoMap();
            return allUpInfoMap.containsKey(Long.valueOf(j)) ? allUpInfoMap.get(Long.valueOf(j)) : staff;
        }

        public Staff getAllUpInfoOrThrow(long j) {
            Map<Long, Staff> allUpInfoMap = ((ViewPgcAny) this.instance).getAllUpInfoMap();
            if (allUpInfoMap.containsKey(Long.valueOf(j))) {
                return allUpInfoMap.get(Long.valueOf(j));
            }
            throw new IllegalArgumentException();
        }

        public OgvData getOgvData() {
            return ((ViewPgcAny) this.instance).getOgvData();
        }

        public boolean hasOgvData() {
            return ((ViewPgcAny) this.instance).hasOgvData();
        }

        public Builder mergeOgvData(OgvData ogvData) {
            copyOnWrite();
            ((ViewPgcAny) this.instance).mergeOgvData(ogvData);
            return this;
        }

        public Builder putAllAllUpInfo(Map<Long, Staff> map) {
            copyOnWrite();
            ((ViewPgcAny) this.instance).getMutableAllUpInfoMap().putAll(map);
            return this;
        }

        public Builder putAllUpInfo(long j, Staff staff) {
            staff.getClass();
            copyOnWrite();
            ((ViewPgcAny) this.instance).getMutableAllUpInfoMap().put(Long.valueOf(j), staff);
            return this;
        }

        public Builder removeAllUpInfo(long j) {
            copyOnWrite();
            ((ViewPgcAny) this.instance).getMutableAllUpInfoMap().remove(Long.valueOf(j));
            return this;
        }

        public Builder setOgvData(OgvData ogvData) {
            copyOnWrite();
            ((ViewPgcAny) this.instance).setOgvData(ogvData);
            return this;
        }

        private Builder() {
            super(ViewPgcAny.DEFAULT_INSTANCE);
        }

        public Builder setOgvData(OgvData.Builder builder) {
            copyOnWrite();
            ((ViewPgcAny) this.instance).setOgvData(builder.build());
            return this;
        }
    }

    static {
        ViewPgcAny viewPgcAny = new ViewPgcAny();
        DEFAULT_INSTANCE = viewPgcAny;
        GeneratedMessageLite.registerDefaultInstance(ViewPgcAny.class, viewPgcAny);
    }

    private ViewPgcAny() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOgvData() {
        this.ogvData_ = null;
    }

    public static ViewPgcAny getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, Staff> getMutableAllUpInfoMap() {
        return internalGetMutableAllUpInfo();
    }

    private MapFieldLite<Long, Staff> internalGetAllUpInfo() {
        return this.allUpInfo_;
    }

    private MapFieldLite<Long, Staff> internalGetMutableAllUpInfo() {
        if (!this.allUpInfo_.isMutable()) {
            this.allUpInfo_ = this.allUpInfo_.mutableCopy();
        }
        return this.allUpInfo_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOgvData(OgvData ogvData) {
        ogvData.getClass();
        OgvData ogvData2 = this.ogvData_;
        if (ogvData2 != null && ogvData2 != OgvData.getDefaultInstance()) {
            this.ogvData_ = OgvData.newBuilder(this.ogvData_).mergeFrom((OgvData) ogvData).buildPartial();
        } else {
            this.ogvData_ = ogvData;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ViewPgcAny parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ViewPgcAny) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewPgcAny parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ViewPgcAny> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOgvData(OgvData ogvData) {
        ogvData.getClass();
        this.ogvData_ = ogvData;
    }

    public boolean containsAllUpInfo(long j) {
        return internalGetAllUpInfo().containsKey(Long.valueOf(j));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70991.f17076xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ViewPgcAny();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", new Object[]{"ogvData_", "allUpInfo_", AllUpInfoDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ViewPgcAny> parser = PARSER;
                if (parser == null) {
                    synchronized (ViewPgcAny.class) {
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
    public Map<Long, Staff> getAllUpInfo() {
        return getAllUpInfoMap();
    }

    public int getAllUpInfoCount() {
        return internalGetAllUpInfo().size();
    }

    public Map<Long, Staff> getAllUpInfoMap() {
        return Collections.unmodifiableMap(internalGetAllUpInfo());
    }

    public Staff getAllUpInfoOrDefault(long j, Staff staff) {
        MapFieldLite<Long, Staff> internalGetAllUpInfo = internalGetAllUpInfo();
        return internalGetAllUpInfo.containsKey(Long.valueOf(j)) ? internalGetAllUpInfo.get(Long.valueOf(j)) : staff;
    }

    public Staff getAllUpInfoOrThrow(long j) {
        MapFieldLite<Long, Staff> internalGetAllUpInfo = internalGetAllUpInfo();
        if (internalGetAllUpInfo.containsKey(Long.valueOf(j))) {
            return internalGetAllUpInfo.get(Long.valueOf(j));
        }
        throw new IllegalArgumentException();
    }

    public OgvData getOgvData() {
        OgvData ogvData = this.ogvData_;
        return ogvData == null ? OgvData.getDefaultInstance() : ogvData;
    }

    public boolean hasOgvData() {
        return this.ogvData_ != null;
    }

    public static Builder newBuilder(ViewPgcAny viewPgcAny) {
        return DEFAULT_INSTANCE.createBuilder(viewPgcAny);
    }

    public static ViewPgcAny parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewPgcAny) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewPgcAny parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ViewPgcAny parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ViewPgcAny parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ViewPgcAny parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ViewPgcAny parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ViewPgcAny parseFrom(InputStream inputStream) throws IOException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ViewPgcAny parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ViewPgcAny parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ViewPgcAny parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ViewPgcAny) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
