package com.bapis.bilibili.app.viewunite.common;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class Celebrity extends GeneratedMessageLite<Celebrity, Celebrity.Builder> implements CelebrityOrBuilder {
    public static final int AVATAR_FIELD_NUMBER = 4;
    public static final int CHARACTER_AVATAR_FIELD_NUMBER = 7;
    private static final Celebrity DEFAULT_INSTANCE;
    public static final int DESC_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_FOLLOW_FIELD_NUMBER = 10;
    public static final int LINK_FIELD_NUMBER = 8;
    public static final int MID_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OCCUPATION_NAME_FIELD_NUMBER = 11;
    public static final int OCCUPATION_TYPE_FIELD_NUMBER = 12;
    private static volatile Parser<Celebrity> PARSER = null;
    public static final int RELATE_ATTR_FIELD_NUMBER = 13;
    public static final int REPORT_FIELD_NUMBER = 15;
    public static final int ROLE_FIELD_NUMBER = 3;
    public static final int SHORT_DESC_FIELD_NUMBER = 5;
    public static final int SMALL_AVATAR_FIELD_NUMBER = 14;
    private int id_;
    private int isFollow_;
    private long mid_;
    private int occupationType_;
    private int relateAttr_;
    private MapFieldLite<String, String> report_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private String role_ = "";
    private String avatar_ = "";
    private String shortDesc_ = "";
    private String desc_ = "";
    private String characterAvatar_ = "";
    private String link_ = "";
    private String occupationName_ = "";
    private String smallAvatar_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Celebrity$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69851 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16972xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16972xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16972xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16972xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16972xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16972xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16972xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16972xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Celebrity, Builder> implements CelebrityOrBuilder {
        /* synthetic */ Builder(C69851 c69851) {
            this();
        }

        public Builder clearAvatar() {
            copyOnWrite();
            ((Celebrity) this.instance).clearAvatar();
            return this;
        }

        public Builder clearCharacterAvatar() {
            copyOnWrite();
            ((Celebrity) this.instance).clearCharacterAvatar();
            return this;
        }

        public Builder clearDesc() {
            copyOnWrite();
            ((Celebrity) this.instance).clearDesc();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Celebrity) this.instance).clearId();
            return this;
        }

        public Builder clearIsFollow() {
            copyOnWrite();
            ((Celebrity) this.instance).clearIsFollow();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((Celebrity) this.instance).clearLink();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((Celebrity) this.instance).clearMid();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Celebrity) this.instance).clearName();
            return this;
        }

        public Builder clearOccupationName() {
            copyOnWrite();
            ((Celebrity) this.instance).clearOccupationName();
            return this;
        }

        public Builder clearOccupationType() {
            copyOnWrite();
            ((Celebrity) this.instance).clearOccupationType();
            return this;
        }

        public Builder clearRelateAttr() {
            copyOnWrite();
            ((Celebrity) this.instance).clearRelateAttr();
            return this;
        }

        public Builder clearReport() {
            copyOnWrite();
            ((Celebrity) this.instance).getMutableReportMap().clear();
            return this;
        }

        public Builder clearRole() {
            copyOnWrite();
            ((Celebrity) this.instance).clearRole();
            return this;
        }

        public Builder clearShortDesc() {
            copyOnWrite();
            ((Celebrity) this.instance).clearShortDesc();
            return this;
        }

        public Builder clearSmallAvatar() {
            copyOnWrite();
            ((Celebrity) this.instance).clearSmallAvatar();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public boolean containsReport(String str) {
            str.getClass();
            return ((Celebrity) this.instance).getReportMap().containsKey(str);
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getAvatar() {
            return ((Celebrity) this.instance).getAvatar();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getAvatarBytes() {
            return ((Celebrity) this.instance).getAvatarBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getCharacterAvatar() {
            return ((Celebrity) this.instance).getCharacterAvatar();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getCharacterAvatarBytes() {
            return ((Celebrity) this.instance).getCharacterAvatarBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getDesc() {
            return ((Celebrity) this.instance).getDesc();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getDescBytes() {
            return ((Celebrity) this.instance).getDescBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public int getId() {
            return ((Celebrity) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public int getIsFollow() {
            return ((Celebrity) this.instance).getIsFollow();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getLink() {
            return ((Celebrity) this.instance).getLink();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getLinkBytes() {
            return ((Celebrity) this.instance).getLinkBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public long getMid() {
            return ((Celebrity) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getName() {
            return ((Celebrity) this.instance).getName();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getNameBytes() {
            return ((Celebrity) this.instance).getNameBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getOccupationName() {
            return ((Celebrity) this.instance).getOccupationName();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getOccupationNameBytes() {
            return ((Celebrity) this.instance).getOccupationNameBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public OccupationType getOccupationType() {
            return ((Celebrity) this.instance).getOccupationType();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public int getOccupationTypeValue() {
            return ((Celebrity) this.instance).getOccupationTypeValue();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public int getRelateAttr() {
            return ((Celebrity) this.instance).getRelateAttr();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        @Deprecated
        public Map<String, String> getReport() {
            return getReportMap();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public int getReportCount() {
            return ((Celebrity) this.instance).getReportMap().size();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public Map<String, String> getReportMap() {
            return Collections.unmodifiableMap(((Celebrity) this.instance).getReportMap());
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getReportOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> reportMap = ((Celebrity) this.instance).getReportMap();
            return reportMap.containsKey(str) ? reportMap.get(str) : str2;
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getReportOrThrow(String str) {
            str.getClass();
            Map<String, String> reportMap = ((Celebrity) this.instance).getReportMap();
            if (reportMap.containsKey(str)) {
                return reportMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getRole() {
            return ((Celebrity) this.instance).getRole();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getRoleBytes() {
            return ((Celebrity) this.instance).getRoleBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getShortDesc() {
            return ((Celebrity) this.instance).getShortDesc();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getShortDescBytes() {
            return ((Celebrity) this.instance).getShortDescBytes();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public String getSmallAvatar() {
            return ((Celebrity) this.instance).getSmallAvatar();
        }

        @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
        public ByteString getSmallAvatarBytes() {
            return ((Celebrity) this.instance).getSmallAvatarBytes();
        }

        public Builder putAllReport(Map<String, String> map) {
            copyOnWrite();
            ((Celebrity) this.instance).getMutableReportMap().putAll(map);
            return this;
        }

        public Builder putReport(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((Celebrity) this.instance).getMutableReportMap().put(str, str2);
            return this;
        }

        public Builder removeReport(String str) {
            str.getClass();
            copyOnWrite();
            ((Celebrity) this.instance).getMutableReportMap().remove(str);
            return this;
        }

        public Builder setAvatar(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setAvatar(str);
            return this;
        }

        public Builder setAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setAvatarBytes(byteString);
            return this;
        }

        public Builder setCharacterAvatar(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setCharacterAvatar(str);
            return this;
        }

        public Builder setCharacterAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setCharacterAvatarBytes(byteString);
            return this;
        }

        public Builder setDesc(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setDesc(str);
            return this;
        }

        public Builder setDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setDescBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((Celebrity) this.instance).setId(i);
            return this;
        }

        public Builder setIsFollow(int i) {
            copyOnWrite();
            ((Celebrity) this.instance).setIsFollow(i);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setLinkBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((Celebrity) this.instance).setMid(j);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOccupationName(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setOccupationName(str);
            return this;
        }

        public Builder setOccupationNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setOccupationNameBytes(byteString);
            return this;
        }

        public Builder setOccupationType(OccupationType occupationType) {
            copyOnWrite();
            ((Celebrity) this.instance).setOccupationType(occupationType);
            return this;
        }

        public Builder setOccupationTypeValue(int i) {
            copyOnWrite();
            ((Celebrity) this.instance).setOccupationTypeValue(i);
            return this;
        }

        public Builder setRelateAttr(int i) {
            copyOnWrite();
            ((Celebrity) this.instance).setRelateAttr(i);
            return this;
        }

        public Builder setRole(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setRole(str);
            return this;
        }

        public Builder setRoleBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setRoleBytes(byteString);
            return this;
        }

        public Builder setShortDesc(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setShortDesc(str);
            return this;
        }

        public Builder setShortDescBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setShortDescBytes(byteString);
            return this;
        }

        public Builder setSmallAvatar(String str) {
            copyOnWrite();
            ((Celebrity) this.instance).setSmallAvatar(str);
            return this;
        }

        public Builder setSmallAvatarBytes(ByteString byteString) {
            copyOnWrite();
            ((Celebrity) this.instance).setSmallAvatarBytes(byteString);
            return this;
        }

        private Builder() {
            super(Celebrity.DEFAULT_INSTANCE);
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
        Celebrity celebrity = new Celebrity();
        DEFAULT_INSTANCE = celebrity;
        GeneratedMessageLite.registerDefaultInstance(Celebrity.class, celebrity);
    }

    private Celebrity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatar() {
        this.avatar_ = getDefaultInstance().getAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCharacterAvatar() {
        this.characterAvatar_ = getDefaultInstance().getCharacterAvatar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesc() {
        this.desc_ = getDefaultInstance().getDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollow() {
        this.isFollow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccupationName() {
        this.occupationName_ = getDefaultInstance().getOccupationName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccupationType() {
        this.occupationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelateAttr() {
        this.relateAttr_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRole() {
        this.role_ = getDefaultInstance().getRole();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortDesc() {
        this.shortDesc_ = getDefaultInstance().getShortDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallAvatar() {
        this.smallAvatar_ = getDefaultInstance().getSmallAvatar();
    }

    public static Celebrity getDefaultInstance() {
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

    public static Celebrity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Celebrity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Celebrity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Celebrity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatar(String str) {
        str.getClass();
        this.avatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.avatar_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCharacterAvatar(String str) {
        str.getClass();
        this.characterAvatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCharacterAvatarBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.characterAvatar_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesc(String str) {
        str.getClass();
        this.desc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.desc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollow(int i) {
        this.isFollow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.link_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccupationName(String str) {
        str.getClass();
        this.occupationName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccupationNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.occupationName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccupationType(OccupationType occupationType) {
        this.occupationType_ = occupationType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccupationTypeValue(int i) {
        this.occupationType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelateAttr(int i) {
        this.relateAttr_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRole(String str) {
        str.getClass();
        this.role_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.role_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortDesc(String str) {
        str.getClass();
        this.shortDesc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortDescBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortDesc_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallAvatar(String str) {
        str.getClass();
        this.smallAvatar_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallAvatarBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.smallAvatar_ = byteString.toStringUtf8();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public boolean containsReport(String str) {
        str.getClass();
        return internalGetReport().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69851.f16972xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Celebrity();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0002\n\u0004\u000b\u0208\f\f\r\u0004\u000e\u0208\u000f2", new Object[]{"id_", "name_", "role_", "avatar_", "shortDesc_", "desc_", "characterAvatar_", "link_", "mid_", "isFollow_", "occupationName_", "occupationType_", "relateAttr_", "smallAvatar_", "report_", ReportDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Celebrity> parser = PARSER;
                if (parser == null) {
                    synchronized (Celebrity.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getAvatar() {
        return this.avatar_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getAvatarBytes() {
        return ByteString.copyFromUtf8(this.avatar_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getCharacterAvatar() {
        return this.characterAvatar_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getCharacterAvatarBytes() {
        return ByteString.copyFromUtf8(this.characterAvatar_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getDesc() {
        return this.desc_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getDescBytes() {
        return ByteString.copyFromUtf8(this.desc_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public int getIsFollow() {
        return this.isFollow_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getLinkBytes() {
        return ByteString.copyFromUtf8(this.link_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getOccupationName() {
        return this.occupationName_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getOccupationNameBytes() {
        return ByteString.copyFromUtf8(this.occupationName_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public OccupationType getOccupationType() {
        OccupationType forNumber = OccupationType.forNumber(this.occupationType_);
        return forNumber == null ? OccupationType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public int getOccupationTypeValue() {
        return this.occupationType_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public int getRelateAttr() {
        return this.relateAttr_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    @Deprecated
    public Map<String, String> getReport() {
        return getReportMap();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public int getReportCount() {
        return internalGetReport().size();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public Map<String, String> getReportMap() {
        return Collections.unmodifiableMap(internalGetReport());
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getReportOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        return internalGetReport.containsKey(str) ? internalGetReport.get(str) : str2;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getReportOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> internalGetReport = internalGetReport();
        if (internalGetReport.containsKey(str)) {
            return internalGetReport.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getRole() {
        return this.role_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getRoleBytes() {
        return ByteString.copyFromUtf8(this.role_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getShortDesc() {
        return this.shortDesc_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getShortDescBytes() {
        return ByteString.copyFromUtf8(this.shortDesc_);
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public String getSmallAvatar() {
        return this.smallAvatar_;
    }

    @Override // com.bapis.bilibili.app.viewunite.common.CelebrityOrBuilder
    public ByteString getSmallAvatarBytes() {
        return ByteString.copyFromUtf8(this.smallAvatar_);
    }

    public static Builder newBuilder(Celebrity celebrity) {
        return DEFAULT_INSTANCE.createBuilder(celebrity);
    }

    public static Celebrity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Celebrity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Celebrity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Celebrity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Celebrity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Celebrity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Celebrity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Celebrity parseFrom(InputStream inputStream) throws IOException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Celebrity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Celebrity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Celebrity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Celebrity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
