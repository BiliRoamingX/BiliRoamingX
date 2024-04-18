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
public final class FollowLayer extends GeneratedMessageLite<FollowLayer, FollowLayer.Builder> implements MessageLiteOrBuilder {
    private static final FollowLayer DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 2;
    private static volatile Parser<FollowLayer> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 3;
    public static final int STAFF_FIELD_NUMBER = 1;
    private Desc desc_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private Staff staff_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.FollowLayer$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69971 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16983xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16983xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16983xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16983xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16983xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16983xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16983xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16983xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<FollowLayer, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69971 c69971) {
            this();
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((FollowLayer) this.instance).clearDesc();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((FollowLayer) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearStaff() {
            copyOnWrite();
            ((FollowLayer) this.instance).clearStaff();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((FollowLayer) this.instance).getReportMap().containsKey(str);
        }

        public Desc getDesc() {
            return ((FollowLayer) this.instance).getDesc();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((FollowLayer) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((FollowLayer) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((FollowLayer) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((FollowLayer) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Staff getStaff() {
            return ((FollowLayer) this.instance).getStaff();
        }

        public boolean hasDesc() {
            return ((FollowLayer) this.instance).hasDesc();
        }

        public boolean hasStaff() {
            return ((FollowLayer) this.instance).hasStaff();
        }

        public Builder mergeDesc(Desc desc) {
            copyOnWrite();
            ((FollowLayer) this.instance).mergeDesc(desc);
            return this;
        }

        public Builder mergeStaff(Staff staff) {
            copyOnWrite();
            ((FollowLayer) this.instance).mergeStaff(staff);
            return this;
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((FollowLayer) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((FollowLayer) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((FollowLayer) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setDesc(Desc desc) {
            copyOnWrite();
            ((FollowLayer) this.instance).setDesc(desc);
            return this;
        }

        public Builder setStaff(Staff staff) {
            copyOnWrite();
            ((FollowLayer) this.instance).setStaff(staff);
            return this;
        }

        private Builder() {
            super(FollowLayer.DEFAULT_INSTANCE);
        }

        public Builder setDesc(Desc.Builder builder) {
            copyOnWrite();
            ((FollowLayer) this.instance).setDesc(builder.build());
            return this;
        }

        public Builder setStaff(Staff.Builder builder) {
            copyOnWrite();
            ((FollowLayer) this.instance).setStaff(builder.build());
            return this;
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    private static final class ReportDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }

        private ReportDefaultEntryHolder() {
        }
    }

    static {
        FollowLayer followLayer = new FollowLayer();
        DEFAULT_INSTANCE = followLayer;
        GeneratedMessageLite.registerDefaultInstance(FollowLayer.class, followLayer);
    }

    private FollowLayer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaff() {
        this.staff_ = null;
    }

    public static FollowLayer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableReportMap() {
        return internalGetMutableReport();
    }

    private MapFieldLite<String, String> internalGetMutableReport() {
        if (!this.report_.isMutable()) {
            this.report_ = this.report_.mutableCopy();
        }
        return this.report_;
    }

    private MapFieldLite<String, String> internalGetReport() {
        return this.report_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDesc(Desc desc) {
        desc.getClass();
        Desc desc2 = this.desc_;
        if (desc2 != null && desc2 != Desc.getDefaultInstance()) {
            this.desc_ = Desc.newBuilder(this.desc_).mergeFrom((Desc) desc).buildPartial();
        } else {
            this.desc_ = desc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStaff(Staff staff) {
        staff.getClass();
        Staff staff2 = this.staff_;
        if (staff2 != null && staff2 != Staff.getDefaultInstance()) {
            this.staff_ = Staff.newBuilder(this.staff_).mergeFrom((Staff) staff).buildPartial();
        } else {
            this.staff_ = staff;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FollowLayer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FollowLayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FollowLayer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FollowLayer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(Desc desc) {
        desc.getClass();
        this.desc_ = desc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaff(Staff staff) {
        staff.getClass();
        this.staff_ = staff;
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69971.f16983xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FollowLayer();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\t\u0002\t\u00032", new Object[]{"staff_", "desc_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FollowLayer> parser = PARSER;
                if (parser == null) {
                    synchronized (FollowLayer.class) {
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

    public Desc getDesc() {
        Desc desc = this.desc_;
        return desc == null ? Desc.getDefaultInstance() : desc;
    }

    @Deprecated
    public Map<String, String> getReport() {
        return getReportMap();
    }

    public int getReportCount() {
        return internalGetReport().size();
    }

    public Map<String, String> getReportMap() {
        return Collections.unmodifiableMap(internalGetReport());
    }

    public String getReportOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        return internalGetReport.containsKey(str) ? internalGetReport.get(str) : str2;
    }

    public String getReportOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        if (internalGetReport.containsKey(str)) {
            return internalGetReport.get(str);
        }
        throw new IllegalArgumentException();
    }

    public Staff getStaff() {
        Staff staff = this.staff_;
        return staff == null ? Staff.getDefaultInstance() : staff;
    }

    public boolean hasDesc() {
        return this.desc_ != null;
    }

    public boolean hasStaff() {
        return this.staff_ != null;
    }

    public static Builder newBuilder(FollowLayer followLayer) {
        return DEFAULT_INSTANCE.createBuilder(followLayer);
    }

    public static FollowLayer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FollowLayer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FollowLayer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FollowLayer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FollowLayer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FollowLayer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FollowLayer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FollowLayer parseFrom(InputStream inputStream) throws IOException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FollowLayer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FollowLayer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FollowLayer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FollowLayer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
