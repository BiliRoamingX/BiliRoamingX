package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
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
public final class RelateBangumiResourceCard extends GeneratedMessageLite<RelateBangumiResourceCard, RelateBangumiResourceCard.Builder> implements MessageLiteOrBuilder {
    public static final int CARD_FIELD_NUMBER = 6;
    public static final int CORNER_FIELD_NUMBER = 5;
    private static final RelateBangumiResourceCard DEFAULT_INSTANCE;
    public static final int GOTO_TYPE_FIELD_NUMBER = 12;
    public static final int LABEL_FIELD_NUMBER = 10;
    private static volatile Parser<RelateBangumiResourceCard> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 8;
    public static final int RCMD_REASON_FIELD_NUMBER = 9;
    public static final int REPORT_FIELD_NUMBER = 11;
    public static final int RE_TYPE_FIELD_NUMBER = 3;
    public static final int RE_VALUE_FIELD_NUMBER = 4;
    public static final int SCOVER_FIELD_NUMBER = 2;
    public static final int SIZ_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int card_;
    private int position_;
    private int reType_;
    private int type_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String scover_ = "";
    private String reValue_ = "";
    private String corner_ = "";
    private String siz_ = "";
    private String rcmdReason_ = "";
    private String label_ = "";
    private String gotoType_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateBangumiResourceCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70371 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17018xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17018xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17018xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17018xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17018xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17018xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17018xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17018xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateBangumiResourceCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70371 c70371) {
            this();
        }

        public Builder clearCard() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearCard();
            return this;
        }

        public Builder clearCorner() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearCorner();
            return this;
        }

        public Builder clearGotoType() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearGotoType();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearLabel();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearPosition();
            return this;
        }

        public Builder clearRcmdReason() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearRcmdReason();
            return this;
        }

        public Builder clearReType() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearReType();
            return this;
        }

        public Builder clearReValue() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearReValue();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearScover() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearScover();
            return this;
        }

        public Builder clearSiz() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearSiz();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).clearType();
            return this;
        }

        public boolean containsReport(String str) {
            str.getClass();
            return ((RelateBangumiResourceCard) this.instance).getReportMap().containsKey(str);
        }

        public int getCard() {
            return ((RelateBangumiResourceCard) this.instance).getCard();
        }

        public String getCorner() {
            return ((RelateBangumiResourceCard) this.instance).getCorner();
        }

        public ByteString getCornerBytes() {
            return ((RelateBangumiResourceCard) this.instance).getCornerBytes();
        }

        public String getGotoType() {
            return ((RelateBangumiResourceCard) this.instance).getGotoType();
        }

        public ByteString getGotoTypeBytes() {
            return ((RelateBangumiResourceCard) this.instance).getGotoTypeBytes();
        }

        public String getLabel() {
            return ((RelateBangumiResourceCard) this.instance).getLabel();
        }

        public ByteString getLabelBytes() {
            return ((RelateBangumiResourceCard) this.instance).getLabelBytes();
        }

        public int getPosition() {
            return ((RelateBangumiResourceCard) this.instance).getPosition();
        }

        public String getRcmdReason() {
            return ((RelateBangumiResourceCard) this.instance).getRcmdReason();
        }

        public ByteString getRcmdReasonBytes() {
            return ((RelateBangumiResourceCard) this.instance).getRcmdReasonBytes();
        }

        public int getReType() {
            return ((RelateBangumiResourceCard) this.instance).getReType();
        }

        public String getReValue() {
            return ((RelateBangumiResourceCard) this.instance).getReValue();
        }

        public ByteString getReValueBytes() {
            return ((RelateBangumiResourceCard) this.instance).getReValueBytes();
        }

        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        public int getReportCount() {
            return ((RelateBangumiResourceCard) this.instance).getReportMap().size();
        }

        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((RelateBangumiResourceCard) this.instance).getReportMap());
        }

        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((RelateBangumiResourceCard) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((RelateBangumiResourceCard) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getScover() {
            return ((RelateBangumiResourceCard) this.instance).getScover();
        }

        public ByteString getScoverBytes() {
            return ((RelateBangumiResourceCard) this.instance).getScoverBytes();
        }

        public String getSiz() {
            return ((RelateBangumiResourceCard) this.instance).getSiz();
        }

        public ByteString getSizBytes() {
            return ((RelateBangumiResourceCard) this.instance).getSizBytes();
        }

        public int getType() {
            return ((RelateBangumiResourceCard) this.instance).getType();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setCard(int i) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setCard(i);
            return this;
        }

        public Builder setCorner(String str) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setCorner(str);
            return this;
        }

        public Builder setCornerBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setCornerBytes(byteString);
            return this;
        }

        public Builder setGotoType(String str) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setGotoType(str);
            return this;
        }

        public Builder setGotoTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setGotoTypeBytes(byteString);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setLabelBytes(byteString);
            return this;
        }

        public Builder setPosition(int i) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setPosition(i);
            return this;
        }

        public Builder setRcmdReason(String str) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setRcmdReason(str);
            return this;
        }

        public Builder setRcmdReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setRcmdReasonBytes(byteString);
            return this;
        }

        public Builder setReType(int i) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setReType(i);
            return this;
        }

        public Builder setReValue(String str) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setReValue(str);
            return this;
        }

        public Builder setReValueBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setReValueBytes(byteString);
            return this;
        }

        public Builder setScover(String str) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setScover(str);
            return this;
        }

        public Builder setScoverBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setScoverBytes(byteString);
            return this;
        }

        public Builder setSiz(String str) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setSiz(str);
            return this;
        }

        public Builder setSizBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setSizBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((RelateBangumiResourceCard) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(RelateBangumiResourceCard.DEFAULT_INSTANCE);
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
        RelateBangumiResourceCard relateBangumiResourceCard = new RelateBangumiResourceCard();
        DEFAULT_INSTANCE = relateBangumiResourceCard;
        GeneratedMessageLite.registerDefaultInstance(RelateBangumiResourceCard.class, relateBangumiResourceCard);
    }

    private RelateBangumiResourceCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCard() {
        this.card_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCorner() {
        this.corner_ = getDefaultInstance().getCorner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGotoType() {
        this.gotoType_ = getDefaultInstance().getGotoType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRcmdReason() {
        this.rcmdReason_ = getDefaultInstance().getRcmdReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReType() {
        this.reType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReValue() {
        this.reValue_ = getDefaultInstance().getReValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScover() {
        this.scover_ = getDefaultInstance().getScover();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSiz() {
        this.siz_ = getDefaultInstance().getSiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static RelateBangumiResourceCard getDefaultInstance() {
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

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateBangumiResourceCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateBangumiResourceCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateBangumiResourceCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCard(int i) {
        this.card_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCorner(String str) {
        str.getClass();
        this.corner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCornerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.corner_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoType(String str) {
        str.getClass();
        this.gotoType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGotoTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gotoType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.label_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(int i) {
        this.position_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReason(String str) {
        str.getClass();
        this.rcmdReason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRcmdReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rcmdReason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReType(int i) {
        this.reType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReValue(String str) {
        str.getClass();
        this.reValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reValue_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScover(String str) {
        str.getClass();
        this.scover_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScoverBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.scover_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSiz(String str) {
        str.getClass();
        this.siz_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSizBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.siz_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70371.f17018xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateBangumiResourceCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0001\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0208\b\u0004\t\u0208\n\u0208\u000b2\f\u0208", new Object[]{"type_", "scover_", "reType_", "reValue_", "corner_", "card_", "siz_", "position_", "rcmdReason_", "label_", "report_", ReportDefaultEntryHolder.defaultEntry, "gotoType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateBangumiResourceCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateBangumiResourceCard.class) {
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

    public int getCard() {
        return this.card_;
    }

    public String getCorner() {
        return this.corner_;
    }

    public ByteString getCornerBytes() {
        return ByteString.copyFromUtf8(this.corner_);
    }

    public String getGotoType() {
        return this.gotoType_;
    }

    public ByteString getGotoTypeBytes() {
        return ByteString.copyFromUtf8(this.gotoType_);
    }

    public String getLabel() {
        return this.label_;
    }

    public ByteString getLabelBytes() {
        return ByteString.copyFromUtf8(this.label_);
    }

    public int getPosition() {
        return this.position_;
    }

    public String getRcmdReason() {
        return this.rcmdReason_;
    }

    public ByteString getRcmdReasonBytes() {
        return ByteString.copyFromUtf8(this.rcmdReason_);
    }

    public int getReType() {
        return this.reType_;
    }

    public String getReValue() {
        return this.reValue_;
    }

    public ByteString getReValueBytes() {
        return ByteString.copyFromUtf8(this.reValue_);
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

    public String getScover() {
        return this.scover_;
    }

    public ByteString getScoverBytes() {
        return ByteString.copyFromUtf8(this.scover_);
    }

    public String getSiz() {
        return this.siz_;
    }

    public ByteString getSizBytes() {
        return ByteString.copyFromUtf8(this.siz_);
    }

    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(RelateBangumiResourceCard relateBangumiResourceCard) {
        return DEFAULT_INSTANCE.createBuilder(relateBangumiResourceCard);
    }

    public static RelateBangumiResourceCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateBangumiResourceCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateBangumiResourceCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateBangumiResourceCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateBangumiResourceCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateBangumiResourceCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateBangumiResourceCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateBangumiResourceCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateBangumiResourceCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateBangumiResourceCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateBangumiResourceCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
