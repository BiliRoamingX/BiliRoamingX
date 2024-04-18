package com.bapis.bilibili.main.community.reply.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes21.dex */
public final class Member extends GeneratedMessageLite<Member, Member.C14751b> implements MessageLiteOrBuilder {
    private static final Member DEFAULT_INSTANCE;
    public static final int FACE_FIELD_NUMBER = 4;
    public static final int FACE_NFT_FIELD_NUMBER = 30;
    public static final int FACE_NFT_NEW_FIELD_NUMBER = 31;
    public static final int FANS_GUARD_ICON_FIELD_NUMBER = 34;
    public static final int FANS_GUARD_LEVEL_FIELD_NUMBER = 29;
    public static final int FANS_HONOR_ICON_FIELD_NUMBER = 35;
    public static final int FANS_MEDAL_COLOR_BORDER_FIELD_NUMBER = 26;
    public static final int FANS_MEDAL_COLOR_END_FIELD_NUMBER = 25;
    public static final int FANS_MEDAL_COLOR_FIELD_NUMBER = 20;
    public static final int FANS_MEDAL_COLOR_LEVEL_FIELD_NUMBER = 28;
    public static final int FANS_MEDAL_COLOR_NAME_FIELD_NUMBER = 27;
    public static final int FANS_MEDAL_LEVEL_FIELD_NUMBER = 19;
    public static final int FANS_MEDAL_NAME_FIELD_NUMBER = 18;
    public static final int GARB_CARD_FAN_COLOR_FIELD_NUMBER = 16;
    public static final int GARB_CARD_IMAGE_FIELD_NUMBER = 12;
    public static final int GARB_CARD_IMAGE_WITH_FOCUS_FIELD_NUMBER = 13;
    public static final int GARB_CARD_IS_FAN_FIELD_NUMBER = 17;
    public static final int GARB_CARD_JUMP_URL_FIELD_NUMBER = 14;
    public static final int GARB_CARD_NUMBER_FIELD_NUMBER = 15;
    public static final int GARB_PENDANT_IMAGE_FIELD_NUMBER = 11;
    public static final int IS_SENIOR_MEMBER_FIELD_NUMBER = 32;
    public static final int LEVEL_FIELD_NUMBER = 5;
    public static final int MID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NFT_INTERACTION_FIELD_NUMBER = 33;
    public static final int OFFICIAL_VERIFY_TYPE_FIELD_NUMBER = 6;
    private static volatile Parser<Member> PARSER = null;
    public static final int SEX_FIELD_NUMBER = 3;
    public static final int VIP_AVATAR_SUBSCRIPT_FIELD_NUMBER = 22;
    public static final int VIP_LABEL_PATH_FIELD_NUMBER = 10;
    public static final int VIP_LABEL_TEXT_FIELD_NUMBER = 23;
    public static final int VIP_LABEL_THEME_FIELD_NUMBER = 24;
    public static final int VIP_NICKNAME_COLOR_FIELD_NUMBER = 21;
    public static final int VIP_STATUS_FIELD_NUMBER = 8;
    public static final int VIP_THEME_TYPE_FIELD_NUMBER = 9;
    public static final int VIP_TYPE_FIELD_NUMBER = 7;
    private int faceNftNew_;
    private int faceNft_;
    private long fansGuardLevel_;
    private long fansMedalColorBorder_;
    private long fansMedalColorEnd_;
    private long fansMedalColorLevel_;
    private long fansMedalColorName_;
    private long fansMedalColor_;
    private long fansMedalLevel_;
    private boolean garbCardIsFan_;
    private int isSeniorMember_;
    private long level_;
    private long mid_;
    private NftInteraction nftInteraction_;
    private long officialVerifyType_;
    private int vipAvatarSubscript_;
    private long vipStatus_;
    private long vipThemeType_;
    private long vipType_;
    private String name_ = "";
    private String sex_ = "";
    private String face_ = "";
    private String vipLabelPath_ = "";
    private String garbPendantImage_ = "";
    private String garbCardImage_ = "";
    private String garbCardImageWithFocus_ = "";
    private String garbCardJumpUrl_ = "";
    private String garbCardNumber_ = "";
    private String garbCardFanColor_ = "";
    private String fansMedalName_ = "";
    private String vipNicknameColor_ = "";
    private String vipLabelText_ = "";
    private String vipLabelTheme_ = "";
    private String fansGuardIcon_ = "";
    private String fansHonorIcon_ = "";

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class NftInteraction extends GeneratedMessageLite<NftInteraction, NftInteraction.C14749a> implements MessageLiteOrBuilder {
        private static final NftInteraction DEFAULT_INSTANCE;
        public static final int ITYPE_FIELD_NUMBER = 1;
        public static final int METADATA_URL_FIELD_NUMBER = 2;
        public static final int NFT_ID_FIELD_NUMBER = 3;
        private static volatile Parser<NftInteraction> PARSER = null;
        public static final int REGION_FIELD_NUMBER = 4;
        private String itype_ = "";
        private String metadataUrl_ = "";
        private String nftId_ = "";
        private Region region_;

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public static final class Region extends GeneratedMessageLite<Region, Region.C14744a> implements MessageLiteOrBuilder {
            private static final Region DEFAULT_INSTANCE;
            public static final int ICON_FIELD_NUMBER = 2;
            private static volatile Parser<Region> PARSER = null;
            public static final int SHOW_STATUS_FIELD_NUMBER = 3;
            public static final int TYPE_FIELD_NUMBER = 1;
            private String icon_ = "";
            private int showStatus_;
            private int type_;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$NftInteraction$Region$a */
            /* loaded from: classes21.dex */
            public static final class C14744a extends GeneratedMessageLite.Builder<Region, C14744a> implements MessageLiteOrBuilder {
                /* synthetic */ C14744a(C14750a c14750a) {
                    this();
                }

                public C14744a clearIcon() {
                    copyOnWrite();
                    ((Region) this.instance).clearIcon();
                    return this;
                }

                public C14744a clearShowStatus() {
                    copyOnWrite();
                    ((Region) this.instance).clearShowStatus();
                    return this;
                }

                public C14744a clearType() {
                    copyOnWrite();
                    ((Region) this.instance).clearType();
                    return this;
                }

                public String getIcon() {
                    return ((Region) this.instance).getIcon();
                }

                public ByteString getIconBytes() {
                    return ((Region) this.instance).getIconBytes();
                }

                public ShowStatus getShowStatus() {
                    return ((Region) this.instance).getShowStatus();
                }

                public int getShowStatusValue() {
                    return ((Region) this.instance).getShowStatusValue();
                }

                public RegionType getType() {
                    return ((Region) this.instance).getType();
                }

                public int getTypeValue() {
                    return ((Region) this.instance).getTypeValue();
                }

                public C14744a setIcon(String str) {
                    copyOnWrite();
                    ((Region) this.instance).setIcon(str);
                    return this;
                }

                public C14744a setIconBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Region) this.instance).setIconBytes(byteString);
                    return this;
                }

                public C14744a setShowStatus(ShowStatus showStatus) {
                    copyOnWrite();
                    ((Region) this.instance).setShowStatus(showStatus);
                    return this;
                }

                public C14744a setShowStatusValue(int i) {
                    copyOnWrite();
                    ((Region) this.instance).setShowStatusValue(i);
                    return this;
                }

                public C14744a setType(RegionType regionType) {
                    copyOnWrite();
                    ((Region) this.instance).setType(regionType);
                    return this;
                }

                public C14744a setTypeValue(int i) {
                    copyOnWrite();
                    ((Region) this.instance).setTypeValue(i);
                    return this;
                }

                private C14744a() {
                    super(Region.DEFAULT_INSTANCE);
                }
            }

            static {
                Region region = new Region();
                DEFAULT_INSTANCE = region;
                GeneratedMessageLite.registerDefaultInstance(Region.class, region);
            }

            private Region() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIcon() {
                this.icon_ = getDefaultInstance().getIcon();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearShowStatus() {
                this.showStatus_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.type_ = 0;
            }

            public static Region getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C14744a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Region parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Region) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Region parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Region> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIcon(String str) {
                str.getClass();
                this.icon_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIconBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.icon_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowStatus(ShowStatus showStatus) {
                this.showStatus_ = showStatus.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setShowStatusValue(int i) {
                this.showStatus_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(RegionType regionType) {
                this.type_ = regionType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeValue(int i) {
                this.type_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (C14750a.f22004xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Region();
                    case 2:
                        return new C14744a(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\f", new Object[]{"type_", "icon_", "showStatus_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Region> parser = PARSER;
                        if (parser == null) {
                            synchronized (Region.class) {
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

            public String getIcon() {
                return this.icon_;
            }

            public ByteString getIconBytes() {
                return ByteString.copyFromUtf8(this.icon_);
            }

            public ShowStatus getShowStatus() {
                ShowStatus forNumber = ShowStatus.forNumber(this.showStatus_);
                return forNumber == null ? ShowStatus.UNRECOGNIZED : forNumber;
            }

            public int getShowStatusValue() {
                return this.showStatus_;
            }

            public RegionType getType() {
                RegionType forNumber = RegionType.forNumber(this.type_);
                return forNumber == null ? RegionType.UNRECOGNIZED : forNumber;
            }

            public int getTypeValue() {
                return this.type_;
            }

            public static C14744a newBuilder(Region region) {
                return DEFAULT_INSTANCE.createBuilder(region);
            }

            public static Region parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Region) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Region parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Region parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Region parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Region parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Region parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Region parseFrom(InputStream inputStream) throws IOException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Region parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Region parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Region parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Region) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public enum RegionType implements Internal.EnumLite {
            DEFAULT(0),
            MAINLAND(1),
            GAT(2),
            UNRECOGNIZED(-1);
            
            public static final int DEFAULT_VALUE = 0;
            public static final int GAT_VALUE = 2;
            public static final int MAINLAND_VALUE = 1;
            private static final Internal.EnumLiteMap<RegionType> internalValueMap = new C14745a();
            private final int value;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$NftInteraction$RegionType$a */
            /* loaded from: classes21.dex */
            static class C14745a implements Internal.EnumLiteMap<RegionType> {
                C14745a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RegionType findValueByNumber(int i) {
                    return RegionType.forNumber(i);
                }
            }

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$NftInteraction$RegionType$b */
            /* loaded from: classes21.dex */
            private static final class C14746b implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new C14746b();

                private C14746b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return RegionType.forNumber(i) != null;
                }
            }

            RegionType(int i) {
                this.value = i;
            }

            public static RegionType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return GAT;
                    }
                    return MAINLAND;
                }
                return DEFAULT;
            }

            public static Internal.EnumLiteMap<RegionType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return C14746b.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static RegionType valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public enum ShowStatus implements Internal.EnumLite {
            SHOWDEFAULT(0),
            ZOOMINMAINLAND(1),
            RAW(2),
            UNRECOGNIZED(-1);
            
            public static final int RAW_VALUE = 2;
            public static final int SHOWDEFAULT_VALUE = 0;
            public static final int ZOOMINMAINLAND_VALUE = 1;
            private static final Internal.EnumLiteMap<ShowStatus> internalValueMap = new C14747a();
            private final int value;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$NftInteraction$ShowStatus$a */
            /* loaded from: classes21.dex */
            static class C14747a implements Internal.EnumLiteMap<ShowStatus> {
                C14747a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ShowStatus findValueByNumber(int i) {
                    return ShowStatus.forNumber(i);
                }
            }

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$NftInteraction$ShowStatus$b */
            /* loaded from: classes21.dex */
            private static final class C14748b implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new C14748b();

                private C14748b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return ShowStatus.forNumber(i) != null;
                }
            }

            ShowStatus(int i) {
                this.value = i;
            }

            public static ShowStatus forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return RAW;
                    }
                    return ZOOMINMAINLAND;
                }
                return SHOWDEFAULT;
            }

            public static Internal.EnumLiteMap<ShowStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return C14748b.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static ShowStatus valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$NftInteraction$a */
        /* loaded from: classes21.dex */
        public static final class C14749a extends GeneratedMessageLite.Builder<NftInteraction, C14749a> implements MessageLiteOrBuilder {
            /* synthetic */ C14749a(C14750a c14750a) {
                this();
            }

            public C14749a clearItype() {
                copyOnWrite();
                ((NftInteraction) this.instance).clearItype();
                return this;
            }

            public C14749a clearMetadataUrl() {
                copyOnWrite();
                ((NftInteraction) this.instance).clearMetadataUrl();
                return this;
            }

            public C14749a clearNftId() {
                copyOnWrite();
                ((NftInteraction) this.instance).clearNftId();
                return this;
            }

            public C14749a clearRegion() {
                copyOnWrite();
                ((NftInteraction) this.instance).clearRegion();
                return this;
            }

            public String getItype() {
                return ((NftInteraction) this.instance).getItype();
            }

            public ByteString getItypeBytes() {
                return ((NftInteraction) this.instance).getItypeBytes();
            }

            public String getMetadataUrl() {
                return ((NftInteraction) this.instance).getMetadataUrl();
            }

            public ByteString getMetadataUrlBytes() {
                return ((NftInteraction) this.instance).getMetadataUrlBytes();
            }

            public String getNftId() {
                return ((NftInteraction) this.instance).getNftId();
            }

            public ByteString getNftIdBytes() {
                return ((NftInteraction) this.instance).getNftIdBytes();
            }

            public Region getRegion() {
                return ((NftInteraction) this.instance).getRegion();
            }

            public boolean hasRegion() {
                return ((NftInteraction) this.instance).hasRegion();
            }

            public C14749a mergeRegion(Region region) {
                copyOnWrite();
                ((NftInteraction) this.instance).mergeRegion(region);
                return this;
            }

            public C14749a setItype(String str) {
                copyOnWrite();
                ((NftInteraction) this.instance).setItype(str);
                return this;
            }

            public C14749a setItypeBytes(ByteString byteString) {
                copyOnWrite();
                ((NftInteraction) this.instance).setItypeBytes(byteString);
                return this;
            }

            public C14749a setMetadataUrl(String str) {
                copyOnWrite();
                ((NftInteraction) this.instance).setMetadataUrl(str);
                return this;
            }

            public C14749a setMetadataUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((NftInteraction) this.instance).setMetadataUrlBytes(byteString);
                return this;
            }

            public C14749a setNftId(String str) {
                copyOnWrite();
                ((NftInteraction) this.instance).setNftId(str);
                return this;
            }

            public C14749a setNftIdBytes(ByteString byteString) {
                copyOnWrite();
                ((NftInteraction) this.instance).setNftIdBytes(byteString);
                return this;
            }

            public C14749a setRegion(Region region) {
                copyOnWrite();
                ((NftInteraction) this.instance).setRegion(region);
                return this;
            }

            private C14749a() {
                super(NftInteraction.DEFAULT_INSTANCE);
            }

            public C14749a setRegion(Region.C14744a c14744a) {
                copyOnWrite();
                ((NftInteraction) this.instance).setRegion(c14744a.build());
                return this;
            }
        }

        static {
            NftInteraction nftInteraction = new NftInteraction();
            DEFAULT_INSTANCE = nftInteraction;
            GeneratedMessageLite.registerDefaultInstance(NftInteraction.class, nftInteraction);
        }

        private NftInteraction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItype() {
            this.itype_ = getDefaultInstance().getItype();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetadataUrl() {
            this.metadataUrl_ = getDefaultInstance().getMetadataUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNftId() {
            this.nftId_ = getDefaultInstance().getNftId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegion() {
            this.region_ = null;
        }

        public static NftInteraction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRegion(Region region) {
            region.getClass();
            Region region2 = this.region_;
            if (region2 != null && region2 != Region.getDefaultInstance()) {
                this.region_ = Region.newBuilder(this.region_).mergeFrom((Region) region).buildPartial();
            } else {
                this.region_ = region;
            }
        }

        public static C14749a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NftInteraction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NftInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NftInteraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NftInteraction> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItype(String str) {
            str.getClass();
            this.itype_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.itype_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataUrl(String str) {
            str.getClass();
            this.metadataUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetadataUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNftId(String str) {
            str.getClass();
            this.nftId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNftIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.nftId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegion(Region region) {
            region.getClass();
            this.region_ = region;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14750a.f22004xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NftInteraction();
                case 2:
                    return new C14749a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\t", new Object[]{"itype_", "metadataUrl_", "nftId_", "region_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NftInteraction> parser = PARSER;
                    if (parser == null) {
                        synchronized (NftInteraction.class) {
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

        public String getItype() {
            return this.itype_;
        }

        public ByteString getItypeBytes() {
            return ByteString.copyFromUtf8(this.itype_);
        }

        public String getMetadataUrl() {
            return this.metadataUrl_;
        }

        public ByteString getMetadataUrlBytes() {
            return ByteString.copyFromUtf8(this.metadataUrl_);
        }

        public String getNftId() {
            return this.nftId_;
        }

        public ByteString getNftIdBytes() {
            return ByteString.copyFromUtf8(this.nftId_);
        }

        public Region getRegion() {
            Region region = this.region_;
            return region == null ? Region.getDefaultInstance() : region;
        }

        public boolean hasRegion() {
            return this.region_ != null;
        }

        public static C14749a newBuilder(NftInteraction nftInteraction) {
            return DEFAULT_INSTANCE.createBuilder(nftInteraction);
        }

        public static NftInteraction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NftInteraction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NftInteraction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NftInteraction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NftInteraction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NftInteraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NftInteraction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NftInteraction parseFrom(InputStream inputStream) throws IOException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NftInteraction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NftInteraction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NftInteraction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NftInteraction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14750a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22004xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22004xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22004xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22004xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22004xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22004xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.Member$b */
    /* loaded from: classes21.dex */
    public static final class C14751b extends GeneratedMessageLite.Builder<Member, C14751b> implements MessageLiteOrBuilder {
        /* synthetic */ C14751b(C14750a c14750a) {
            this();
        }

        public C14751b clearFace() {
            copyOnWrite();
            ((Member) this.instance).clearFace();
            return this;
        }

        public C14751b clearFaceNft() {
            copyOnWrite();
            ((Member) this.instance).clearFaceNft();
            return this;
        }

        public C14751b clearFaceNftNew() {
            copyOnWrite();
            ((Member) this.instance).clearFaceNftNew();
            return this;
        }

        public C14751b clearFansGuardIcon() {
            copyOnWrite();
            ((Member) this.instance).clearFansGuardIcon();
            return this;
        }

        public C14751b clearFansGuardLevel() {
            copyOnWrite();
            ((Member) this.instance).clearFansGuardLevel();
            return this;
        }

        public C14751b clearFansHonorIcon() {
            copyOnWrite();
            ((Member) this.instance).clearFansHonorIcon();
            return this;
        }

        public C14751b clearFansMedalColor() {
            copyOnWrite();
            ((Member) this.instance).clearFansMedalColor();
            return this;
        }

        public C14751b clearFansMedalColorBorder() {
            copyOnWrite();
            ((Member) this.instance).clearFansMedalColorBorder();
            return this;
        }

        public C14751b clearFansMedalColorEnd() {
            copyOnWrite();
            ((Member) this.instance).clearFansMedalColorEnd();
            return this;
        }

        public C14751b clearFansMedalColorLevel() {
            copyOnWrite();
            ((Member) this.instance).clearFansMedalColorLevel();
            return this;
        }

        public C14751b clearFansMedalColorName() {
            copyOnWrite();
            ((Member) this.instance).clearFansMedalColorName();
            return this;
        }

        public C14751b clearFansMedalLevel() {
            copyOnWrite();
            ((Member) this.instance).clearFansMedalLevel();
            return this;
        }

        public C14751b clearFansMedalName() {
            copyOnWrite();
            ((Member) this.instance).clearFansMedalName();
            return this;
        }

        public C14751b clearGarbCardFanColor() {
            copyOnWrite();
            ((Member) this.instance).clearGarbCardFanColor();
            return this;
        }

        public C14751b clearGarbCardImage() {
            copyOnWrite();
            ((Member) this.instance).clearGarbCardImage();
            return this;
        }

        public C14751b clearGarbCardImageWithFocus() {
            copyOnWrite();
            ((Member) this.instance).clearGarbCardImageWithFocus();
            return this;
        }

        public C14751b clearGarbCardIsFan() {
            copyOnWrite();
            ((Member) this.instance).clearGarbCardIsFan();
            return this;
        }

        public C14751b clearGarbCardJumpUrl() {
            copyOnWrite();
            ((Member) this.instance).clearGarbCardJumpUrl();
            return this;
        }

        public C14751b clearGarbCardNumber() {
            copyOnWrite();
            ((Member) this.instance).clearGarbCardNumber();
            return this;
        }

        public C14751b clearGarbPendantImage() {
            copyOnWrite();
            ((Member) this.instance).clearGarbPendantImage();
            return this;
        }

        public C14751b clearIsSeniorMember() {
            copyOnWrite();
            ((Member) this.instance).clearIsSeniorMember();
            return this;
        }

        public C14751b clearLevel() {
            copyOnWrite();
            ((Member) this.instance).clearLevel();
            return this;
        }

        public C14751b clearMid() {
            copyOnWrite();
            ((Member) this.instance).clearMid();
            return this;
        }

        public C14751b clearName() {
            copyOnWrite();
            ((Member) this.instance).clearName();
            return this;
        }

        public C14751b clearNftInteraction() {
            copyOnWrite();
            ((Member) this.instance).clearNftInteraction();
            return this;
        }

        public C14751b clearOfficialVerifyType() {
            copyOnWrite();
            ((Member) this.instance).clearOfficialVerifyType();
            return this;
        }

        public C14751b clearSex() {
            copyOnWrite();
            ((Member) this.instance).clearSex();
            return this;
        }

        public C14751b clearVipAvatarSubscript() {
            copyOnWrite();
            ((Member) this.instance).clearVipAvatarSubscript();
            return this;
        }

        public C14751b clearVipLabelPath() {
            copyOnWrite();
            ((Member) this.instance).clearVipLabelPath();
            return this;
        }

        public C14751b clearVipLabelText() {
            copyOnWrite();
            ((Member) this.instance).clearVipLabelText();
            return this;
        }

        public C14751b clearVipLabelTheme() {
            copyOnWrite();
            ((Member) this.instance).clearVipLabelTheme();
            return this;
        }

        public C14751b clearVipNicknameColor() {
            copyOnWrite();
            ((Member) this.instance).clearVipNicknameColor();
            return this;
        }

        public C14751b clearVipStatus() {
            copyOnWrite();
            ((Member) this.instance).clearVipStatus();
            return this;
        }

        public C14751b clearVipThemeType() {
            copyOnWrite();
            ((Member) this.instance).clearVipThemeType();
            return this;
        }

        public C14751b clearVipType() {
            copyOnWrite();
            ((Member) this.instance).clearVipType();
            return this;
        }

        public String getFace() {
            return ((Member) this.instance).getFace();
        }

        public ByteString getFaceBytes() {
            return ((Member) this.instance).getFaceBytes();
        }

        public int getFaceNft() {
            return ((Member) this.instance).getFaceNft();
        }

        public int getFaceNftNew() {
            return ((Member) this.instance).getFaceNftNew();
        }

        public String getFansGuardIcon() {
            return ((Member) this.instance).getFansGuardIcon();
        }

        public ByteString getFansGuardIconBytes() {
            return ((Member) this.instance).getFansGuardIconBytes();
        }

        public long getFansGuardLevel() {
            return ((Member) this.instance).getFansGuardLevel();
        }

        public String getFansHonorIcon() {
            return ((Member) this.instance).getFansHonorIcon();
        }

        public ByteString getFansHonorIconBytes() {
            return ((Member) this.instance).getFansHonorIconBytes();
        }

        public long getFansMedalColor() {
            return ((Member) this.instance).getFansMedalColor();
        }

        public long getFansMedalColorBorder() {
            return ((Member) this.instance).getFansMedalColorBorder();
        }

        public long getFansMedalColorEnd() {
            return ((Member) this.instance).getFansMedalColorEnd();
        }

        public long getFansMedalColorLevel() {
            return ((Member) this.instance).getFansMedalColorLevel();
        }

        public long getFansMedalColorName() {
            return ((Member) this.instance).getFansMedalColorName();
        }

        public long getFansMedalLevel() {
            return ((Member) this.instance).getFansMedalLevel();
        }

        public String getFansMedalName() {
            return ((Member) this.instance).getFansMedalName();
        }

        public ByteString getFansMedalNameBytes() {
            return ((Member) this.instance).getFansMedalNameBytes();
        }

        public String getGarbCardFanColor() {
            return ((Member) this.instance).getGarbCardFanColor();
        }

        public ByteString getGarbCardFanColorBytes() {
            return ((Member) this.instance).getGarbCardFanColorBytes();
        }

        public String getGarbCardImage() {
            return ((Member) this.instance).getGarbCardImage();
        }

        public ByteString getGarbCardImageBytes() {
            return ((Member) this.instance).getGarbCardImageBytes();
        }

        public String getGarbCardImageWithFocus() {
            return ((Member) this.instance).getGarbCardImageWithFocus();
        }

        public ByteString getGarbCardImageWithFocusBytes() {
            return ((Member) this.instance).getGarbCardImageWithFocusBytes();
        }

        public boolean getGarbCardIsFan() {
            return ((Member) this.instance).getGarbCardIsFan();
        }

        public String getGarbCardJumpUrl() {
            return ((Member) this.instance).getGarbCardJumpUrl();
        }

        public ByteString getGarbCardJumpUrlBytes() {
            return ((Member) this.instance).getGarbCardJumpUrlBytes();
        }

        public String getGarbCardNumber() {
            return ((Member) this.instance).getGarbCardNumber();
        }

        public ByteString getGarbCardNumberBytes() {
            return ((Member) this.instance).getGarbCardNumberBytes();
        }

        public String getGarbPendantImage() {
            return ((Member) this.instance).getGarbPendantImage();
        }

        public ByteString getGarbPendantImageBytes() {
            return ((Member) this.instance).getGarbPendantImageBytes();
        }

        public int getIsSeniorMember() {
            return ((Member) this.instance).getIsSeniorMember();
        }

        public long getLevel() {
            return ((Member) this.instance).getLevel();
        }

        public long getMid() {
            return ((Member) this.instance).getMid();
        }

        public String getName() {
            return ((Member) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Member) this.instance).getNameBytes();
        }

        public NftInteraction getNftInteraction() {
            return ((Member) this.instance).getNftInteraction();
        }

        public long getOfficialVerifyType() {
            return ((Member) this.instance).getOfficialVerifyType();
        }

        public String getSex() {
            return ((Member) this.instance).getSex();
        }

        public ByteString getSexBytes() {
            return ((Member) this.instance).getSexBytes();
        }

        public int getVipAvatarSubscript() {
            return ((Member) this.instance).getVipAvatarSubscript();
        }

        public String getVipLabelPath() {
            return ((Member) this.instance).getVipLabelPath();
        }

        public ByteString getVipLabelPathBytes() {
            return ((Member) this.instance).getVipLabelPathBytes();
        }

        public String getVipLabelText() {
            return ((Member) this.instance).getVipLabelText();
        }

        public ByteString getVipLabelTextBytes() {
            return ((Member) this.instance).getVipLabelTextBytes();
        }

        public String getVipLabelTheme() {
            return ((Member) this.instance).getVipLabelTheme();
        }

        public ByteString getVipLabelThemeBytes() {
            return ((Member) this.instance).getVipLabelThemeBytes();
        }

        public String getVipNicknameColor() {
            return ((Member) this.instance).getVipNicknameColor();
        }

        public ByteString getVipNicknameColorBytes() {
            return ((Member) this.instance).getVipNicknameColorBytes();
        }

        public long getVipStatus() {
            return ((Member) this.instance).getVipStatus();
        }

        public long getVipThemeType() {
            return ((Member) this.instance).getVipThemeType();
        }

        public long getVipType() {
            return ((Member) this.instance).getVipType();
        }

        public boolean hasNftInteraction() {
            return ((Member) this.instance).hasNftInteraction();
        }

        public C14751b mergeNftInteraction(NftInteraction nftInteraction) {
            copyOnWrite();
            ((Member) this.instance).mergeNftInteraction(nftInteraction);
            return this;
        }

        public C14751b setFace(String str) {
            copyOnWrite();
            ((Member) this.instance).setFace(str);
            return this;
        }

        public C14751b setFaceBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setFaceBytes(byteString);
            return this;
        }

        public C14751b setFaceNft(int i) {
            copyOnWrite();
            ((Member) this.instance).setFaceNft(i);
            return this;
        }

        public C14751b setFaceNftNew(int i) {
            copyOnWrite();
            ((Member) this.instance).setFaceNftNew(i);
            return this;
        }

        public C14751b setFansGuardIcon(String str) {
            copyOnWrite();
            ((Member) this.instance).setFansGuardIcon(str);
            return this;
        }

        public C14751b setFansGuardIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setFansGuardIconBytes(byteString);
            return this;
        }

        public C14751b setFansGuardLevel(long j) {
            copyOnWrite();
            ((Member) this.instance).setFansGuardLevel(j);
            return this;
        }

        public C14751b setFansHonorIcon(String str) {
            copyOnWrite();
            ((Member) this.instance).setFansHonorIcon(str);
            return this;
        }

        public C14751b setFansHonorIconBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setFansHonorIconBytes(byteString);
            return this;
        }

        public C14751b setFansMedalColor(long j) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalColor(j);
            return this;
        }

        public C14751b setFansMedalColorBorder(long j) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalColorBorder(j);
            return this;
        }

        public C14751b setFansMedalColorEnd(long j) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalColorEnd(j);
            return this;
        }

        public C14751b setFansMedalColorLevel(long j) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalColorLevel(j);
            return this;
        }

        public C14751b setFansMedalColorName(long j) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalColorName(j);
            return this;
        }

        public C14751b setFansMedalLevel(long j) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalLevel(j);
            return this;
        }

        public C14751b setFansMedalName(String str) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalName(str);
            return this;
        }

        public C14751b setFansMedalNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setFansMedalNameBytes(byteString);
            return this;
        }

        public C14751b setGarbCardFanColor(String str) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardFanColor(str);
            return this;
        }

        public C14751b setGarbCardFanColorBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardFanColorBytes(byteString);
            return this;
        }

        public C14751b setGarbCardImage(String str) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardImage(str);
            return this;
        }

        public C14751b setGarbCardImageBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardImageBytes(byteString);
            return this;
        }

        public C14751b setGarbCardImageWithFocus(String str) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardImageWithFocus(str);
            return this;
        }

        public C14751b setGarbCardImageWithFocusBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardImageWithFocusBytes(byteString);
            return this;
        }

        public C14751b setGarbCardIsFan(boolean z) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardIsFan(z);
            return this;
        }

        public C14751b setGarbCardJumpUrl(String str) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardJumpUrl(str);
            return this;
        }

        public C14751b setGarbCardJumpUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardJumpUrlBytes(byteString);
            return this;
        }

        public C14751b setGarbCardNumber(String str) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardNumber(str);
            return this;
        }

        public C14751b setGarbCardNumberBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setGarbCardNumberBytes(byteString);
            return this;
        }

        public C14751b setGarbPendantImage(String str) {
            copyOnWrite();
            ((Member) this.instance).setGarbPendantImage(str);
            return this;
        }

        public C14751b setGarbPendantImageBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setGarbPendantImageBytes(byteString);
            return this;
        }

        public C14751b setIsSeniorMember(int i) {
            copyOnWrite();
            ((Member) this.instance).setIsSeniorMember(i);
            return this;
        }

        public C14751b setLevel(long j) {
            copyOnWrite();
            ((Member) this.instance).setLevel(j);
            return this;
        }

        public C14751b setMid(long j) {
            copyOnWrite();
            ((Member) this.instance).setMid(j);
            return this;
        }

        public C14751b setName(String str) {
            copyOnWrite();
            ((Member) this.instance).setName(str);
            return this;
        }

        public C14751b setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setNameBytes(byteString);
            return this;
        }

        public C14751b setNftInteraction(NftInteraction nftInteraction) {
            copyOnWrite();
            ((Member) this.instance).setNftInteraction(nftInteraction);
            return this;
        }

        public C14751b setOfficialVerifyType(long j) {
            copyOnWrite();
            ((Member) this.instance).setOfficialVerifyType(j);
            return this;
        }

        public C14751b setSex(String str) {
            copyOnWrite();
            ((Member) this.instance).setSex(str);
            return this;
        }

        public C14751b setSexBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setSexBytes(byteString);
            return this;
        }

        public C14751b setVipAvatarSubscript(int i) {
            copyOnWrite();
            ((Member) this.instance).setVipAvatarSubscript(i);
            return this;
        }

        public C14751b setVipLabelPath(String str) {
            copyOnWrite();
            ((Member) this.instance).setVipLabelPath(str);
            return this;
        }

        public C14751b setVipLabelPathBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setVipLabelPathBytes(byteString);
            return this;
        }

        public C14751b setVipLabelText(String str) {
            copyOnWrite();
            ((Member) this.instance).setVipLabelText(str);
            return this;
        }

        public C14751b setVipLabelTextBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setVipLabelTextBytes(byteString);
            return this;
        }

        public C14751b setVipLabelTheme(String str) {
            copyOnWrite();
            ((Member) this.instance).setVipLabelTheme(str);
            return this;
        }

        public C14751b setVipLabelThemeBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setVipLabelThemeBytes(byteString);
            return this;
        }

        public C14751b setVipNicknameColor(String str) {
            copyOnWrite();
            ((Member) this.instance).setVipNicknameColor(str);
            return this;
        }

        public C14751b setVipNicknameColorBytes(ByteString byteString) {
            copyOnWrite();
            ((Member) this.instance).setVipNicknameColorBytes(byteString);
            return this;
        }

        public C14751b setVipStatus(long j) {
            copyOnWrite();
            ((Member) this.instance).setVipStatus(j);
            return this;
        }

        public C14751b setVipThemeType(long j) {
            copyOnWrite();
            ((Member) this.instance).setVipThemeType(j);
            return this;
        }

        public C14751b setVipType(long j) {
            copyOnWrite();
            ((Member) this.instance).setVipType(j);
            return this;
        }

        private C14751b() {
            super(Member.DEFAULT_INSTANCE);
        }

        public C14751b setNftInteraction(NftInteraction.C14749a c14749a) {
            copyOnWrite();
            ((Member) this.instance).setNftInteraction(c14749a.build());
            return this;
        }
    }

    static {
        Member member = new Member();
        DEFAULT_INSTANCE = member;
        GeneratedMessageLite.registerDefaultInstance(Member.class, member);
    }

    private Member() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFace() {
        this.face_ = getDefaultInstance().getFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaceNft() {
        this.faceNft_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaceNftNew() {
        this.faceNftNew_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansGuardIcon() {
        this.fansGuardIcon_ = getDefaultInstance().getFansGuardIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansGuardLevel() {
        this.fansGuardLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansHonorIcon() {
        this.fansHonorIcon_ = getDefaultInstance().getFansHonorIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansMedalColor() {
        this.fansMedalColor_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansMedalColorBorder() {
        this.fansMedalColorBorder_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansMedalColorEnd() {
        this.fansMedalColorEnd_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansMedalColorLevel() {
        this.fansMedalColorLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansMedalColorName() {
        this.fansMedalColorName_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansMedalLevel() {
        this.fansMedalLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansMedalName() {
        this.fansMedalName_ = getDefaultInstance().getFansMedalName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarbCardFanColor() {
        this.garbCardFanColor_ = getDefaultInstance().getGarbCardFanColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarbCardImage() {
        this.garbCardImage_ = getDefaultInstance().getGarbCardImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarbCardImageWithFocus() {
        this.garbCardImageWithFocus_ = getDefaultInstance().getGarbCardImageWithFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarbCardIsFan() {
        this.garbCardIsFan_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarbCardJumpUrl() {
        this.garbCardJumpUrl_ = getDefaultInstance().getGarbCardJumpUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarbCardNumber() {
        this.garbCardNumber_ = getDefaultInstance().getGarbCardNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarbPendantImage() {
        this.garbPendantImage_ = getDefaultInstance().getGarbPendantImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSeniorMember() {
        this.isSeniorMember_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0L;
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
    public void clearNftInteraction() {
        this.nftInteraction_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfficialVerifyType() {
        this.officialVerifyType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSex() {
        this.sex_ = getDefaultInstance().getSex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipAvatarSubscript() {
        this.vipAvatarSubscript_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipLabelPath() {
        this.vipLabelPath_ = getDefaultInstance().getVipLabelPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipLabelText() {
        this.vipLabelText_ = getDefaultInstance().getVipLabelText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipLabelTheme() {
        this.vipLabelTheme_ = getDefaultInstance().getVipLabelTheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipNicknameColor() {
        this.vipNicknameColor_ = getDefaultInstance().getVipNicknameColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipStatus() {
        this.vipStatus_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipThemeType() {
        this.vipThemeType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVipType() {
        this.vipType_ = 0L;
    }

    public static Member getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNftInteraction(NftInteraction nftInteraction) {
        nftInteraction.getClass();
        NftInteraction nftInteraction2 = this.nftInteraction_;
        if (nftInteraction2 != null && nftInteraction2 != NftInteraction.getDefaultInstance()) {
            this.nftInteraction_ = NftInteraction.newBuilder(this.nftInteraction_).mergeFrom((NftInteraction) nftInteraction).buildPartial();
        } else {
            this.nftInteraction_ = nftInteraction;
        }
    }

    public static C14751b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Member parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Member) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Member parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Member> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFace(String str) {
        str.getClass();
        this.face_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.face_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaceNft(int i) {
        this.faceNft_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaceNftNew(int i) {
        this.faceNftNew_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansGuardIcon(String str) {
        str.getClass();
        this.fansGuardIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansGuardIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fansGuardIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansGuardLevel(long j) {
        this.fansGuardLevel_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansHonorIcon(String str) {
        str.getClass();
        this.fansHonorIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansHonorIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fansHonorIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalColor(long j) {
        this.fansMedalColor_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalColorBorder(long j) {
        this.fansMedalColorBorder_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalColorEnd(long j) {
        this.fansMedalColorEnd_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalColorLevel(long j) {
        this.fansMedalColorLevel_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalColorName(long j) {
        this.fansMedalColorName_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalLevel(long j) {
        this.fansMedalLevel_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalName(String str) {
        str.getClass();
        this.fansMedalName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansMedalNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fansMedalName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardFanColor(String str) {
        str.getClass();
        this.garbCardFanColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardFanColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.garbCardFanColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardImage(String str) {
        str.getClass();
        this.garbCardImage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.garbCardImage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardImageWithFocus(String str) {
        str.getClass();
        this.garbCardImageWithFocus_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardImageWithFocusBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.garbCardImageWithFocus_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardIsFan(boolean z) {
        this.garbCardIsFan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardJumpUrl(String str) {
        str.getClass();
        this.garbCardJumpUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardJumpUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.garbCardJumpUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardNumber(String str) {
        str.getClass();
        this.garbCardNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbCardNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.garbCardNumber_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbPendantImage(String str) {
        str.getClass();
        this.garbPendantImage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarbPendantImageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.garbPendantImage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSeniorMember(int i) {
        this.isSeniorMember_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(long j) {
        this.level_ = j;
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
    public void setNftInteraction(NftInteraction nftInteraction) {
        nftInteraction.getClass();
        this.nftInteraction_ = nftInteraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfficialVerifyType(long j) {
        this.officialVerifyType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSex(String str) {
        str.getClass();
        this.sex_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSexBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sex_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipAvatarSubscript(int i) {
        this.vipAvatarSubscript_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipLabelPath(String str) {
        str.getClass();
        this.vipLabelPath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipLabelPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vipLabelPath_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipLabelText(String str) {
        str.getClass();
        this.vipLabelText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipLabelTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vipLabelText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipLabelTheme(String str) {
        str.getClass();
        this.vipLabelTheme_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipLabelThemeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vipLabelTheme_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipNicknameColor(String str) {
        str.getClass();
        this.vipNicknameColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipNicknameColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.vipNicknameColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipStatus(long j) {
        this.vipStatus_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipThemeType(long j) {
        this.vipThemeType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVipType(long j) {
        this.vipType_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14750a.f22004xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Member();
            case 2:
                return new C14751b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000#\u0000\u0000\u0001##\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u0002\n\u0208\u000b\u0208\f\u0208\r\u0208\u000e\u0208\u000f\u0208\u0010\u0208\u0011\u0007\u0012\u0208\u0013\u0002\u0014\u0002\u0015\u0208\u0016\u0004\u0017\u0208\u0018\u0208\u0019\u0002\u001a\u0002\u001b\u0002\u001c\u0002\u001d\u0002\u001e\u0004\u001f\u0004 \u0004!\t\"\u0208#\u0208", new Object[]{"mid_", "name_", "sex_", "face_", "level_", "officialVerifyType_", "vipType_", "vipStatus_", "vipThemeType_", "vipLabelPath_", "garbPendantImage_", "garbCardImage_", "garbCardImageWithFocus_", "garbCardJumpUrl_", "garbCardNumber_", "garbCardFanColor_", "garbCardIsFan_", "fansMedalName_", "fansMedalLevel_", "fansMedalColor_", "vipNicknameColor_", "vipAvatarSubscript_", "vipLabelText_", "vipLabelTheme_", "fansMedalColorEnd_", "fansMedalColorBorder_", "fansMedalColorName_", "fansMedalColorLevel_", "fansGuardLevel_", "faceNft_", "faceNftNew_", "isSeniorMember_", "nftInteraction_", "fansGuardIcon_", "fansHonorIcon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Member> parser = PARSER;
                if (parser == null) {
                    synchronized (Member.class) {
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

    public String getFace() {
        return this.face_;
    }

    public ByteString getFaceBytes() {
        return ByteString.copyFromUtf8(this.face_);
    }

    public int getFaceNft() {
        return this.faceNft_;
    }

    public int getFaceNftNew() {
        return this.faceNftNew_;
    }

    public String getFansGuardIcon() {
        return this.fansGuardIcon_;
    }

    public ByteString getFansGuardIconBytes() {
        return ByteString.copyFromUtf8(this.fansGuardIcon_);
    }

    public long getFansGuardLevel() {
        return this.fansGuardLevel_;
    }

    public String getFansHonorIcon() {
        return this.fansHonorIcon_;
    }

    public ByteString getFansHonorIconBytes() {
        return ByteString.copyFromUtf8(this.fansHonorIcon_);
    }

    public long getFansMedalColor() {
        return this.fansMedalColor_;
    }

    public long getFansMedalColorBorder() {
        return this.fansMedalColorBorder_;
    }

    public long getFansMedalColorEnd() {
        return this.fansMedalColorEnd_;
    }

    public long getFansMedalColorLevel() {
        return this.fansMedalColorLevel_;
    }

    public long getFansMedalColorName() {
        return this.fansMedalColorName_;
    }

    public long getFansMedalLevel() {
        return this.fansMedalLevel_;
    }

    public String getFansMedalName() {
        return this.fansMedalName_;
    }

    public ByteString getFansMedalNameBytes() {
        return ByteString.copyFromUtf8(this.fansMedalName_);
    }

    public String getGarbCardFanColor() {
        return this.garbCardFanColor_;
    }

    public ByteString getGarbCardFanColorBytes() {
        return ByteString.copyFromUtf8(this.garbCardFanColor_);
    }

    public String getGarbCardImage() {
        return this.garbCardImage_;
    }

    public ByteString getGarbCardImageBytes() {
        return ByteString.copyFromUtf8(this.garbCardImage_);
    }

    public String getGarbCardImageWithFocus() {
        return this.garbCardImageWithFocus_;
    }

    public ByteString getGarbCardImageWithFocusBytes() {
        return ByteString.copyFromUtf8(this.garbCardImageWithFocus_);
    }

    public boolean getGarbCardIsFan() {
        return this.garbCardIsFan_;
    }

    public String getGarbCardJumpUrl() {
        return this.garbCardJumpUrl_;
    }

    public ByteString getGarbCardJumpUrlBytes() {
        return ByteString.copyFromUtf8(this.garbCardJumpUrl_);
    }

    public String getGarbCardNumber() {
        return this.garbCardNumber_;
    }

    public ByteString getGarbCardNumberBytes() {
        return ByteString.copyFromUtf8(this.garbCardNumber_);
    }

    public String getGarbPendantImage() {
        return this.garbPendantImage_;
    }

    public ByteString getGarbPendantImageBytes() {
        return ByteString.copyFromUtf8(this.garbPendantImage_);
    }

    public int getIsSeniorMember() {
        return this.isSeniorMember_;
    }

    public long getLevel() {
        return this.level_;
    }

    public long getMid() {
        return this.mid_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public NftInteraction getNftInteraction() {
        NftInteraction nftInteraction = this.nftInteraction_;
        return nftInteraction == null ? NftInteraction.getDefaultInstance() : nftInteraction;
    }

    public long getOfficialVerifyType() {
        return this.officialVerifyType_;
    }

    public String getSex() {
        return this.sex_;
    }

    public ByteString getSexBytes() {
        return ByteString.copyFromUtf8(this.sex_);
    }

    public int getVipAvatarSubscript() {
        return this.vipAvatarSubscript_;
    }

    public String getVipLabelPath() {
        return this.vipLabelPath_;
    }

    public ByteString getVipLabelPathBytes() {
        return ByteString.copyFromUtf8(this.vipLabelPath_);
    }

    public String getVipLabelText() {
        return this.vipLabelText_;
    }

    public ByteString getVipLabelTextBytes() {
        return ByteString.copyFromUtf8(this.vipLabelText_);
    }

    public String getVipLabelTheme() {
        return this.vipLabelTheme_;
    }

    public ByteString getVipLabelThemeBytes() {
        return ByteString.copyFromUtf8(this.vipLabelTheme_);
    }

    public String getVipNicknameColor() {
        return this.vipNicknameColor_;
    }

    public ByteString getVipNicknameColorBytes() {
        return ByteString.copyFromUtf8(this.vipNicknameColor_);
    }

    public long getVipStatus() {
        return this.vipStatus_;
    }

    public long getVipThemeType() {
        return this.vipThemeType_;
    }

    public long getVipType() {
        return this.vipType_;
    }

    public boolean hasNftInteraction() {
        return this.nftInteraction_ != null;
    }

    public static C14751b newBuilder(Member member) {
        return DEFAULT_INSTANCE.createBuilder(member);
    }

    public static Member parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Member) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Member parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Member parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Member parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Member parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Member parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Member parseFrom(InputStream inputStream) throws IOException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Member parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Member parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Member parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
