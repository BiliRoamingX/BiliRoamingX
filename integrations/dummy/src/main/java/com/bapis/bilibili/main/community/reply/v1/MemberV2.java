package com.bapis.bilibili.main.community.reply.v1;

import com.bapis.bilibili.dagw.component.avatar.v1.AvatarItem;
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
public final class MemberV2 extends GeneratedMessageLite<MemberV2, MemberV2.C14769b> implements MessageLiteOrBuilder {
    public static final int BASIC_FIELD_NUMBER = 1;
    public static final int CONTRACTOR_FIELD_NUMBER = 8;
    private static final MemberV2 DEFAULT_INSTANCE;
    public static final int GARB_FIELD_NUMBER = 4;
    public static final int MEDAL_FIELD_NUMBER = 5;
    public static final int NFT_FIELD_NUMBER = 6;
    public static final int OFFICIAL_FIELD_NUMBER = 2;
    private static volatile Parser<MemberV2> PARSER = null;
    public static final int SENIOR_FIELD_NUMBER = 7;
    public static final int VIP_FIELD_NUMBER = 3;
    private Basic basic_;
    private Contractor contractor_;
    private Garb garb_;
    private Medal medal_;
    private Nft nft_;
    private Official official_;
    private Senior senior_;
    private Vip vip_;

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Basic extends GeneratedMessageLite<Basic, Basic.C14752a> implements MessageLiteOrBuilder {
        public static final int AVATAR_ITEM_FIELD_NUMBER = 6;
        private static final Basic DEFAULT_INSTANCE;
        public static final int FACE_FIELD_NUMBER = 4;
        public static final int LEVEL_FIELD_NUMBER = 5;
        public static final int MID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Basic> PARSER = null;
        public static final int SEX_FIELD_NUMBER = 3;
        private AvatarItem avatarItem_;
        private long level_;
        private long mid_;
        private String name_ = "";
        private String sex_ = "";
        private String face_ = "";

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Basic$a */
        /* loaded from: classes21.dex */
        public static final class C14752a extends GeneratedMessageLite.Builder<Basic, C14752a> implements MessageLiteOrBuilder {
            /* synthetic */ C14752a(C14768a c14768a) {
                this();
            }

            public C14752a clearAvatarItem() {
                copyOnWrite();
                ((Basic) this.instance).clearAvatarItem();
                return this;
            }

            public C14752a clearFace() {
                copyOnWrite();
                ((Basic) this.instance).clearFace();
                return this;
            }

            public C14752a clearLevel() {
                copyOnWrite();
                ((Basic) this.instance).clearLevel();
                return this;
            }

            public C14752a clearMid() {
                copyOnWrite();
                ((Basic) this.instance).clearMid();
                return this;
            }

            public C14752a clearName() {
                copyOnWrite();
                ((Basic) this.instance).clearName();
                return this;
            }

            public C14752a clearSex() {
                copyOnWrite();
                ((Basic) this.instance).clearSex();
                return this;
            }

            public AvatarItem getAvatarItem() {
                return ((Basic) this.instance).getAvatarItem();
            }

            public String getFace() {
                return ((Basic) this.instance).getFace();
            }

            public ByteString getFaceBytes() {
                return ((Basic) this.instance).getFaceBytes();
            }

            public long getLevel() {
                return ((Basic) this.instance).getLevel();
            }

            public long getMid() {
                return ((Basic) this.instance).getMid();
            }

            public String getName() {
                return ((Basic) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((Basic) this.instance).getNameBytes();
            }

            public String getSex() {
                return ((Basic) this.instance).getSex();
            }

            public ByteString getSexBytes() {
                return ((Basic) this.instance).getSexBytes();
            }

            public boolean hasAvatarItem() {
                return ((Basic) this.instance).hasAvatarItem();
            }

            public C14752a mergeAvatarItem(AvatarItem avatarItem) {
                copyOnWrite();
                ((Basic) this.instance).mergeAvatarItem(avatarItem);
                return this;
            }

            public C14752a setAvatarItem(AvatarItem avatarItem) {
                copyOnWrite();
                ((Basic) this.instance).setAvatarItem(avatarItem);
                return this;
            }

            public C14752a setFace(String str) {
                copyOnWrite();
                ((Basic) this.instance).setFace(str);
                return this;
            }

            public C14752a setFaceBytes(ByteString byteString) {
                copyOnWrite();
                ((Basic) this.instance).setFaceBytes(byteString);
                return this;
            }

            public C14752a setLevel(long j) {
                copyOnWrite();
                ((Basic) this.instance).setLevel(j);
                return this;
            }

            public C14752a setMid(long j) {
                copyOnWrite();
                ((Basic) this.instance).setMid(j);
                return this;
            }

            public C14752a setName(String str) {
                copyOnWrite();
                ((Basic) this.instance).setName(str);
                return this;
            }

            public C14752a setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Basic) this.instance).setNameBytes(byteString);
                return this;
            }

            public C14752a setSex(String str) {
                copyOnWrite();
                ((Basic) this.instance).setSex(str);
                return this;
            }

            public C14752a setSexBytes(ByteString byteString) {
                copyOnWrite();
                ((Basic) this.instance).setSexBytes(byteString);
                return this;
            }

            private C14752a() {
                super(Basic.DEFAULT_INSTANCE);
            }

            public C14752a setAvatarItem(AvatarItem.Builder c13376b) {
                copyOnWrite();
                ((Basic) this.instance).setAvatarItem(c13376b.build());
                return this;
            }
        }

        static {
            Basic basic = new Basic();
            DEFAULT_INSTANCE = basic;
            GeneratedMessageLite.registerDefaultInstance(Basic.class, basic);
        }

        private Basic() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarItem() {
            this.avatarItem_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFace() {
            this.face_ = getDefaultInstance().getFace();
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
        public void clearSex() {
            this.sex_ = getDefaultInstance().getSex();
        }

        public static Basic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAvatarItem(AvatarItem avatarItem) {
            avatarItem.getClass();
            AvatarItem avatarItem2 = this.avatarItem_;
            if (avatarItem2 != null && avatarItem2 != AvatarItem.getDefaultInstance()) {
                this.avatarItem_ = AvatarItem.newBuilder(this.avatarItem_).mergeFrom((AvatarItem) avatarItem).buildPartial();
            } else {
                this.avatarItem_ = avatarItem;
            }
        }

        public static C14752a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Basic parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Basic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Basic parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Basic> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarItem(AvatarItem avatarItem) {
            avatarItem.getClass();
            this.avatarItem_ = avatarItem;
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
        public void setSex(String str) {
            str.getClass();
            this.sex_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSexBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sex_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Basic();
                case 2:
                    return new C14752a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0002\u0006\t", new Object[]{"mid_", "name_", "sex_", "face_", "level_", "avatarItem_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Basic> parser = PARSER;
                    if (parser == null) {
                        synchronized (Basic.class) {
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

        public AvatarItem getAvatarItem() {
            AvatarItem avatarItem = this.avatarItem_;
            return avatarItem == null ? AvatarItem.getDefaultInstance() : avatarItem;
        }

        public String getFace() {
            return this.face_;
        }

        public ByteString getFaceBytes() {
            return ByteString.copyFromUtf8(this.face_);
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

        public String getSex() {
            return this.sex_;
        }

        public ByteString getSexBytes() {
            return ByteString.copyFromUtf8(this.sex_);
        }

        public boolean hasAvatarItem() {
            return this.avatarItem_ != null;
        }

        public static C14752a newBuilder(Basic basic) {
            return DEFAULT_INSTANCE.createBuilder(basic);
        }

        public static Basic parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Basic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Basic parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Basic parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Basic parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Basic parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Basic parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Basic parseFrom(InputStream inputStream) throws IOException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Basic parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Basic parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Basic parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Basic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Contractor extends GeneratedMessageLite<Contractor, Contractor.C14753a> implements MessageLiteOrBuilder {
        public static final int CONTRACT_DESC_FIELD_NUMBER = 2;
        private static final Contractor DEFAULT_INSTANCE;
        public static final int IS_CONTRACTOR_FIELD_NUMBER = 1;
        private static volatile Parser<Contractor> PARSER;
        private String contractDesc_ = "";
        private boolean isContractor_;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Contractor$a */
        /* loaded from: classes21.dex */
        public static final class C14753a extends GeneratedMessageLite.Builder<Contractor, C14753a> implements MessageLiteOrBuilder {
            /* synthetic */ C14753a(C14768a c14768a) {
                this();
            }

            public C14753a clearContractDesc() {
                copyOnWrite();
                ((Contractor) this.instance).clearContractDesc();
                return this;
            }

            public C14753a clearIsContractor() {
                copyOnWrite();
                ((Contractor) this.instance).clearIsContractor();
                return this;
            }

            public String getContractDesc() {
                return ((Contractor) this.instance).getContractDesc();
            }

            public ByteString getContractDescBytes() {
                return ((Contractor) this.instance).getContractDescBytes();
            }

            public boolean getIsContractor() {
                return ((Contractor) this.instance).getIsContractor();
            }

            public C14753a setContractDesc(String str) {
                copyOnWrite();
                ((Contractor) this.instance).setContractDesc(str);
                return this;
            }

            public C14753a setContractDescBytes(ByteString byteString) {
                copyOnWrite();
                ((Contractor) this.instance).setContractDescBytes(byteString);
                return this;
            }

            public C14753a setIsContractor(boolean z) {
                copyOnWrite();
                ((Contractor) this.instance).setIsContractor(z);
                return this;
            }

            private C14753a() {
                super(Contractor.DEFAULT_INSTANCE);
            }
        }

        static {
            Contractor contractor = new Contractor();
            DEFAULT_INSTANCE = contractor;
            GeneratedMessageLite.registerDefaultInstance(Contractor.class, contractor);
        }

        private Contractor() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContractDesc() {
            this.contractDesc_ = getDefaultInstance().getContractDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsContractor() {
            this.isContractor_ = false;
        }

        public static Contractor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14753a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Contractor parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Contractor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Contractor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Contractor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContractDesc(String str) {
            str.getClass();
            this.contractDesc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContractDescBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.contractDesc_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsContractor(boolean z) {
            this.isContractor_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Contractor();
                case 2:
                    return new C14753a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0208", new Object[]{"isContractor_", "contractDesc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Contractor> parser = PARSER;
                    if (parser == null) {
                        synchronized (Contractor.class) {
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

        public String getContractDesc() {
            return this.contractDesc_;
        }

        public ByteString getContractDescBytes() {
            return ByteString.copyFromUtf8(this.contractDesc_);
        }

        public boolean getIsContractor() {
            return this.isContractor_;
        }

        public static C14753a newBuilder(Contractor contractor) {
            return DEFAULT_INSTANCE.createBuilder(contractor);
        }

        public static Contractor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Contractor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Contractor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Contractor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Contractor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Contractor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Contractor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Contractor parseFrom(InputStream inputStream) throws IOException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Contractor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Contractor parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Contractor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Contractor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Garb extends GeneratedMessageLite<Garb, Garb.C14754a> implements MessageLiteOrBuilder {
        public static final int CARD_FAN_COLOR_FIELD_NUMBER = 6;
        public static final int CARD_IMAGE_FIELD_NUMBER = 2;
        public static final int CARD_IMAGE_WITH_FOCUS_FIELD_NUMBER = 3;
        public static final int CARD_IS_FAN_FIELD_NUMBER = 7;
        public static final int CARD_JUMP_URL_FIELD_NUMBER = 4;
        public static final int CARD_NUMBER_FIELD_NUMBER = 5;
        private static final Garb DEFAULT_INSTANCE;
        private static volatile Parser<Garb> PARSER = null;
        public static final int PENDANT_IMAGE_FIELD_NUMBER = 1;
        private boolean cardIsFan_;
        private String pendantImage_ = "";
        private String cardImage_ = "";
        private String cardImageWithFocus_ = "";
        private String cardJumpUrl_ = "";
        private String cardNumber_ = "";
        private String cardFanColor_ = "";

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Garb$a */
        /* loaded from: classes21.dex */
        public static final class C14754a extends GeneratedMessageLite.Builder<Garb, C14754a> implements MessageLiteOrBuilder {
            /* synthetic */ C14754a(C14768a c14768a) {
                this();
            }

            public C14754a clearCardFanColor() {
                copyOnWrite();
                ((Garb) this.instance).clearCardFanColor();
                return this;
            }

            public C14754a clearCardImage() {
                copyOnWrite();
                ((Garb) this.instance).clearCardImage();
                return this;
            }

            public C14754a clearCardImageWithFocus() {
                copyOnWrite();
                ((Garb) this.instance).clearCardImageWithFocus();
                return this;
            }

            public C14754a clearCardIsFan() {
                copyOnWrite();
                ((Garb) this.instance).clearCardIsFan();
                return this;
            }

            public C14754a clearCardJumpUrl() {
                copyOnWrite();
                ((Garb) this.instance).clearCardJumpUrl();
                return this;
            }

            public C14754a clearCardNumber() {
                copyOnWrite();
                ((Garb) this.instance).clearCardNumber();
                return this;
            }

            public C14754a clearPendantImage() {
                copyOnWrite();
                ((Garb) this.instance).clearPendantImage();
                return this;
            }

            public String getCardFanColor() {
                return ((Garb) this.instance).getCardFanColor();
            }

            public ByteString getCardFanColorBytes() {
                return ((Garb) this.instance).getCardFanColorBytes();
            }

            public String getCardImage() {
                return ((Garb) this.instance).getCardImage();
            }

            public ByteString getCardImageBytes() {
                return ((Garb) this.instance).getCardImageBytes();
            }

            public String getCardImageWithFocus() {
                return ((Garb) this.instance).getCardImageWithFocus();
            }

            public ByteString getCardImageWithFocusBytes() {
                return ((Garb) this.instance).getCardImageWithFocusBytes();
            }

            public boolean getCardIsFan() {
                return ((Garb) this.instance).getCardIsFan();
            }

            public String getCardJumpUrl() {
                return ((Garb) this.instance).getCardJumpUrl();
            }

            public ByteString getCardJumpUrlBytes() {
                return ((Garb) this.instance).getCardJumpUrlBytes();
            }

            public String getCardNumber() {
                return ((Garb) this.instance).getCardNumber();
            }

            public ByteString getCardNumberBytes() {
                return ((Garb) this.instance).getCardNumberBytes();
            }

            public String getPendantImage() {
                return ((Garb) this.instance).getPendantImage();
            }

            public ByteString getPendantImageBytes() {
                return ((Garb) this.instance).getPendantImageBytes();
            }

            public C14754a setCardFanColor(String str) {
                copyOnWrite();
                ((Garb) this.instance).setCardFanColor(str);
                return this;
            }

            public C14754a setCardFanColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Garb) this.instance).setCardFanColorBytes(byteString);
                return this;
            }

            public C14754a setCardImage(String str) {
                copyOnWrite();
                ((Garb) this.instance).setCardImage(str);
                return this;
            }

            public C14754a setCardImageBytes(ByteString byteString) {
                copyOnWrite();
                ((Garb) this.instance).setCardImageBytes(byteString);
                return this;
            }

            public C14754a setCardImageWithFocus(String str) {
                copyOnWrite();
                ((Garb) this.instance).setCardImageWithFocus(str);
                return this;
            }

            public C14754a setCardImageWithFocusBytes(ByteString byteString) {
                copyOnWrite();
                ((Garb) this.instance).setCardImageWithFocusBytes(byteString);
                return this;
            }

            public C14754a setCardIsFan(boolean z) {
                copyOnWrite();
                ((Garb) this.instance).setCardIsFan(z);
                return this;
            }

            public C14754a setCardJumpUrl(String str) {
                copyOnWrite();
                ((Garb) this.instance).setCardJumpUrl(str);
                return this;
            }

            public C14754a setCardJumpUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Garb) this.instance).setCardJumpUrlBytes(byteString);
                return this;
            }

            public C14754a setCardNumber(String str) {
                copyOnWrite();
                ((Garb) this.instance).setCardNumber(str);
                return this;
            }

            public C14754a setCardNumberBytes(ByteString byteString) {
                copyOnWrite();
                ((Garb) this.instance).setCardNumberBytes(byteString);
                return this;
            }

            public C14754a setPendantImage(String str) {
                copyOnWrite();
                ((Garb) this.instance).setPendantImage(str);
                return this;
            }

            public C14754a setPendantImageBytes(ByteString byteString) {
                copyOnWrite();
                ((Garb) this.instance).setPendantImageBytes(byteString);
                return this;
            }

            private C14754a() {
                super(Garb.DEFAULT_INSTANCE);
            }
        }

        static {
            Garb garb = new Garb();
            DEFAULT_INSTANCE = garb;
            GeneratedMessageLite.registerDefaultInstance(Garb.class, garb);
        }

        private Garb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardFanColor() {
            this.cardFanColor_ = getDefaultInstance().getCardFanColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardImage() {
            this.cardImage_ = getDefaultInstance().getCardImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardImageWithFocus() {
            this.cardImageWithFocus_ = getDefaultInstance().getCardImageWithFocus();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardIsFan() {
            this.cardIsFan_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardJumpUrl() {
            this.cardJumpUrl_ = getDefaultInstance().getCardJumpUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardNumber() {
            this.cardNumber_ = getDefaultInstance().getCardNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPendantImage() {
            this.pendantImage_ = getDefaultInstance().getPendantImage();
        }

        public static Garb getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14754a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Garb parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Garb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Garb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Garb> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardFanColor(String str) {
            str.getClass();
            this.cardFanColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardFanColorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cardFanColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardImage(String str) {
            str.getClass();
            this.cardImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardImageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cardImage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardImageWithFocus(String str) {
            str.getClass();
            this.cardImageWithFocus_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardImageWithFocusBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cardImageWithFocus_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardIsFan(boolean z) {
            this.cardIsFan_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardJumpUrl(String str) {
            str.getClass();
            this.cardJumpUrl_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardJumpUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cardJumpUrl_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardNumber(String str) {
            str.getClass();
            this.cardNumber_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardNumberBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cardNumber_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPendantImage(String str) {
            str.getClass();
            this.pendantImage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPendantImageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.pendantImage_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Garb();
                case 2:
                    return new C14754a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0007", new Object[]{"pendantImage_", "cardImage_", "cardImageWithFocus_", "cardJumpUrl_", "cardNumber_", "cardFanColor_", "cardIsFan_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Garb> parser = PARSER;
                    if (parser == null) {
                        synchronized (Garb.class) {
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

        public String getCardFanColor() {
            return this.cardFanColor_;
        }

        public ByteString getCardFanColorBytes() {
            return ByteString.copyFromUtf8(this.cardFanColor_);
        }

        public String getCardImage() {
            return this.cardImage_;
        }

        public ByteString getCardImageBytes() {
            return ByteString.copyFromUtf8(this.cardImage_);
        }

        public String getCardImageWithFocus() {
            return this.cardImageWithFocus_;
        }

        public ByteString getCardImageWithFocusBytes() {
            return ByteString.copyFromUtf8(this.cardImageWithFocus_);
        }

        public boolean getCardIsFan() {
            return this.cardIsFan_;
        }

        public String getCardJumpUrl() {
            return this.cardJumpUrl_;
        }

        public ByteString getCardJumpUrlBytes() {
            return ByteString.copyFromUtf8(this.cardJumpUrl_);
        }

        public String getCardNumber() {
            return this.cardNumber_;
        }

        public ByteString getCardNumberBytes() {
            return ByteString.copyFromUtf8(this.cardNumber_);
        }

        public String getPendantImage() {
            return this.pendantImage_;
        }

        public ByteString getPendantImageBytes() {
            return ByteString.copyFromUtf8(this.pendantImage_);
        }

        public static C14754a newBuilder(Garb garb) {
            return DEFAULT_INSTANCE.createBuilder(garb);
        }

        public static Garb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Garb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Garb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Garb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Garb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Garb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Garb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Garb parseFrom(InputStream inputStream) throws IOException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Garb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Garb parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Garb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Garb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Medal extends GeneratedMessageLite<Medal, Medal.C14755a> implements MessageLiteOrBuilder {
        public static final int COLOR_BORDER_FIELD_NUMBER = 5;
        public static final int COLOR_END_FIELD_NUMBER = 4;
        public static final int COLOR_LEVEL_FIELD_NUMBER = 7;
        public static final int COLOR_NAME_FIELD_NUMBER = 6;
        public static final int COLOR_START_FIELD_NUMBER = 3;
        private static final Medal DEFAULT_INSTANCE;
        public static final int FIRST_ICON_FIELD_NUMBER = 9;
        public static final int GUARD_LEVEL_FIELD_NUMBER = 8;
        public static final int LEVEL_BG_COLOR_FIELD_NUMBER = 11;
        public static final int LEVEL_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<Medal> PARSER = null;
        public static final int SECOND_ICON_FIELD_NUMBER = 10;
        private long colorBorder_;
        private long colorEnd_;
        private long colorLevel_;
        private long colorName_;
        private long colorStart_;
        private long guardLevel_;
        private long levelBgColor_;
        private long level_;
        private String name_ = "";
        private String firstIcon_ = "";
        private String secondIcon_ = "";

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Medal$a */
        /* loaded from: classes21.dex */
        public static final class C14755a extends GeneratedMessageLite.Builder<Medal, C14755a> implements MessageLiteOrBuilder {
            /* synthetic */ C14755a(C14768a c14768a) {
                this();
            }

            public C14755a clearColorBorder() {
                copyOnWrite();
                ((Medal) this.instance).clearColorBorder();
                return this;
            }

            public C14755a clearColorEnd() {
                copyOnWrite();
                ((Medal) this.instance).clearColorEnd();
                return this;
            }

            public C14755a clearColorLevel() {
                copyOnWrite();
                ((Medal) this.instance).clearColorLevel();
                return this;
            }

            public C14755a clearColorName() {
                copyOnWrite();
                ((Medal) this.instance).clearColorName();
                return this;
            }

            public C14755a clearColorStart() {
                copyOnWrite();
                ((Medal) this.instance).clearColorStart();
                return this;
            }

            public C14755a clearFirstIcon() {
                copyOnWrite();
                ((Medal) this.instance).clearFirstIcon();
                return this;
            }

            public C14755a clearGuardLevel() {
                copyOnWrite();
                ((Medal) this.instance).clearGuardLevel();
                return this;
            }

            public C14755a clearLevel() {
                copyOnWrite();
                ((Medal) this.instance).clearLevel();
                return this;
            }

            public C14755a clearLevelBgColor() {
                copyOnWrite();
                ((Medal) this.instance).clearLevelBgColor();
                return this;
            }

            public C14755a clearName() {
                copyOnWrite();
                ((Medal) this.instance).clearName();
                return this;
            }

            public C14755a clearSecondIcon() {
                copyOnWrite();
                ((Medal) this.instance).clearSecondIcon();
                return this;
            }

            public long getColorBorder() {
                return ((Medal) this.instance).getColorBorder();
            }

            public long getColorEnd() {
                return ((Medal) this.instance).getColorEnd();
            }

            public long getColorLevel() {
                return ((Medal) this.instance).getColorLevel();
            }

            public long getColorName() {
                return ((Medal) this.instance).getColorName();
            }

            public long getColorStart() {
                return ((Medal) this.instance).getColorStart();
            }

            public String getFirstIcon() {
                return ((Medal) this.instance).getFirstIcon();
            }

            public ByteString getFirstIconBytes() {
                return ((Medal) this.instance).getFirstIconBytes();
            }

            public long getGuardLevel() {
                return ((Medal) this.instance).getGuardLevel();
            }

            public long getLevel() {
                return ((Medal) this.instance).getLevel();
            }

            public long getLevelBgColor() {
                return ((Medal) this.instance).getLevelBgColor();
            }

            public String getName() {
                return ((Medal) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((Medal) this.instance).getNameBytes();
            }

            public String getSecondIcon() {
                return ((Medal) this.instance).getSecondIcon();
            }

            public ByteString getSecondIconBytes() {
                return ((Medal) this.instance).getSecondIconBytes();
            }

            public C14755a setColorBorder(long j) {
                copyOnWrite();
                ((Medal) this.instance).setColorBorder(j);
                return this;
            }

            public C14755a setColorEnd(long j) {
                copyOnWrite();
                ((Medal) this.instance).setColorEnd(j);
                return this;
            }

            public C14755a setColorLevel(long j) {
                copyOnWrite();
                ((Medal) this.instance).setColorLevel(j);
                return this;
            }

            public C14755a setColorName(long j) {
                copyOnWrite();
                ((Medal) this.instance).setColorName(j);
                return this;
            }

            public C14755a setColorStart(long j) {
                copyOnWrite();
                ((Medal) this.instance).setColorStart(j);
                return this;
            }

            public C14755a setFirstIcon(String str) {
                copyOnWrite();
                ((Medal) this.instance).setFirstIcon(str);
                return this;
            }

            public C14755a setFirstIconBytes(ByteString byteString) {
                copyOnWrite();
                ((Medal) this.instance).setFirstIconBytes(byteString);
                return this;
            }

            public C14755a setGuardLevel(long j) {
                copyOnWrite();
                ((Medal) this.instance).setGuardLevel(j);
                return this;
            }

            public C14755a setLevel(long j) {
                copyOnWrite();
                ((Medal) this.instance).setLevel(j);
                return this;
            }

            public C14755a setLevelBgColor(long j) {
                copyOnWrite();
                ((Medal) this.instance).setLevelBgColor(j);
                return this;
            }

            public C14755a setName(String str) {
                copyOnWrite();
                ((Medal) this.instance).setName(str);
                return this;
            }

            public C14755a setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((Medal) this.instance).setNameBytes(byteString);
                return this;
            }

            public C14755a setSecondIcon(String str) {
                copyOnWrite();
                ((Medal) this.instance).setSecondIcon(str);
                return this;
            }

            public C14755a setSecondIconBytes(ByteString byteString) {
                copyOnWrite();
                ((Medal) this.instance).setSecondIconBytes(byteString);
                return this;
            }

            private C14755a() {
                super(Medal.DEFAULT_INSTANCE);
            }
        }

        static {
            Medal medal = new Medal();
            DEFAULT_INSTANCE = medal;
            GeneratedMessageLite.registerDefaultInstance(Medal.class, medal);
        }

        private Medal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColorBorder() {
            this.colorBorder_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColorEnd() {
            this.colorEnd_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColorLevel() {
            this.colorLevel_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColorName() {
            this.colorName_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColorStart() {
            this.colorStart_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirstIcon() {
            this.firstIcon_ = getDefaultInstance().getFirstIcon();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGuardLevel() {
            this.guardLevel_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevel() {
            this.level_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLevelBgColor() {
            this.levelBgColor_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondIcon() {
            this.secondIcon_ = getDefaultInstance().getSecondIcon();
        }

        public static Medal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14755a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Medal parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Medal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Medal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Medal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorBorder(long j) {
            this.colorBorder_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorEnd(long j) {
            this.colorEnd_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorLevel(long j) {
            this.colorLevel_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorName(long j) {
            this.colorName_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorStart(long j) {
            this.colorStart_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirstIcon(String str) {
            str.getClass();
            this.firstIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirstIconBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.firstIcon_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGuardLevel(long j) {
            this.guardLevel_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevel(long j) {
            this.level_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLevelBgColor(long j) {
            this.levelBgColor_ = j;
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
        public void setSecondIcon(String str) {
            str.getClass();
            this.secondIcon_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondIconBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.secondIcon_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Medal();
                case 2:
                    return new C14755a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u0208\n\u0208\u000b\u0002", new Object[]{"name_", "level_", "colorStart_", "colorEnd_", "colorBorder_", "colorName_", "colorLevel_", "guardLevel_", "firstIcon_", "secondIcon_", "levelBgColor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Medal> parser = PARSER;
                    if (parser == null) {
                        synchronized (Medal.class) {
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

        public long getColorBorder() {
            return this.colorBorder_;
        }

        public long getColorEnd() {
            return this.colorEnd_;
        }

        public long getColorLevel() {
            return this.colorLevel_;
        }

        public long getColorName() {
            return this.colorName_;
        }

        public long getColorStart() {
            return this.colorStart_;
        }

        public String getFirstIcon() {
            return this.firstIcon_;
        }

        public ByteString getFirstIconBytes() {
            return ByteString.copyFromUtf8(this.firstIcon_);
        }

        public long getGuardLevel() {
            return this.guardLevel_;
        }

        public long getLevel() {
            return this.level_;
        }

        public long getLevelBgColor() {
            return this.levelBgColor_;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public String getSecondIcon() {
            return this.secondIcon_;
        }

        public ByteString getSecondIconBytes() {
            return ByteString.copyFromUtf8(this.secondIcon_);
        }

        public static C14755a newBuilder(Medal medal) {
            return DEFAULT_INSTANCE.createBuilder(medal);
        }

        public static Medal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Medal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Medal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Medal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Medal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Medal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Medal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Medal parseFrom(InputStream inputStream) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Medal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Medal parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Medal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Nft extends GeneratedMessageLite<Nft, Nft.C14762a> implements MessageLiteOrBuilder {
        private static final Nft DEFAULT_INSTANCE;
        public static final int FACE_FIELD_NUMBER = 1;
        public static final int INTERACTION_FIELD_NUMBER = 2;
        private static volatile Parser<Nft> PARSER;
        private int face_;
        private Interaction interaction_;

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public static final class Interaction extends GeneratedMessageLite<Interaction, Interaction.C14761a> implements MessageLiteOrBuilder {
            private static final Interaction DEFAULT_INSTANCE;
            public static final int ITYPE_FIELD_NUMBER = 1;
            public static final int METADATA_URL_FIELD_NUMBER = 2;
            public static final int NFT_ID_FIELD_NUMBER = 3;
            private static volatile Parser<Interaction> PARSER = null;
            public static final int REGION_FIELD_NUMBER = 4;
            private String itype_ = "";
            private String metadataUrl_ = "";
            private String nftId_ = "";
            private Region region_;

            /* compiled from: BL */
            /* loaded from: classes21.dex */
            public static final class Region extends GeneratedMessageLite<Region, Region.C14756a> implements MessageLiteOrBuilder {
                private static final Region DEFAULT_INSTANCE;
                public static final int ICON_FIELD_NUMBER = 2;
                private static volatile Parser<Region> PARSER = null;
                public static final int SHOW_STATUS_FIELD_NUMBER = 3;
                public static final int TYPE_FIELD_NUMBER = 1;
                private String icon_ = "";
                private int showStatus_;
                private int type_;

                /* compiled from: BL */
                /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Nft$Interaction$Region$a */
                /* loaded from: classes21.dex */
                public static final class C14756a extends GeneratedMessageLite.Builder<Region, C14756a> implements MessageLiteOrBuilder {
                    /* synthetic */ C14756a(C14768a c14768a) {
                        this();
                    }

                    public C14756a clearIcon() {
                        copyOnWrite();
                        ((Region) this.instance).clearIcon();
                        return this;
                    }

                    public C14756a clearShowStatus() {
                        copyOnWrite();
                        ((Region) this.instance).clearShowStatus();
                        return this;
                    }

                    public C14756a clearType() {
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

                    public C14756a setIcon(String str) {
                        copyOnWrite();
                        ((Region) this.instance).setIcon(str);
                        return this;
                    }

                    public C14756a setIconBytes(ByteString byteString) {
                        copyOnWrite();
                        ((Region) this.instance).setIconBytes(byteString);
                        return this;
                    }

                    public C14756a setShowStatus(ShowStatus showStatus) {
                        copyOnWrite();
                        ((Region) this.instance).setShowStatus(showStatus);
                        return this;
                    }

                    public C14756a setShowStatusValue(int i) {
                        copyOnWrite();
                        ((Region) this.instance).setShowStatusValue(i);
                        return this;
                    }

                    public C14756a setType(RegionType regionType) {
                        copyOnWrite();
                        ((Region) this.instance).setType(regionType);
                        return this;
                    }

                    public C14756a setTypeValue(int i) {
                        copyOnWrite();
                        ((Region) this.instance).setTypeValue(i);
                        return this;
                    }

                    private C14756a() {
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

                public static C14756a newBuilder() {
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
                    switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Region();
                        case 2:
                            return new C14756a(null);
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

                public static C14756a newBuilder(Region region) {
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
                private static final Internal.EnumLiteMap<RegionType> internalValueMap = new C14757a();
                private final int value;

                /* compiled from: BL */
                /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Nft$Interaction$RegionType$a */
                /* loaded from: classes21.dex */
                static class C14757a implements Internal.EnumLiteMap<RegionType> {
                    C14757a() {
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public RegionType findValueByNumber(int i) {
                        return RegionType.forNumber(i);
                    }
                }

                /* compiled from: BL */
                /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Nft$Interaction$RegionType$b */
                /* loaded from: classes21.dex */
                private static final class C14758b implements Internal.EnumVerifier {
                    static final Internal.EnumVerifier INSTANCE = new C14758b();

                    private C14758b() {
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
                    return C14758b.INSTANCE;
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
                private static final Internal.EnumLiteMap<ShowStatus> internalValueMap = new C14759a();
                private final int value;

                /* compiled from: BL */
                /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Nft$Interaction$ShowStatus$a */
                /* loaded from: classes21.dex */
                static class C14759a implements Internal.EnumLiteMap<ShowStatus> {
                    C14759a() {
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public ShowStatus findValueByNumber(int i) {
                        return ShowStatus.forNumber(i);
                    }
                }

                /* compiled from: BL */
                /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Nft$Interaction$ShowStatus$b */
                /* loaded from: classes21.dex */
                private static final class C14760b implements Internal.EnumVerifier {
                    static final Internal.EnumVerifier INSTANCE = new C14760b();

                    private C14760b() {
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
                    return C14760b.INSTANCE;
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
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Nft$Interaction$a */
            /* loaded from: classes21.dex */
            public static final class C14761a extends GeneratedMessageLite.Builder<Interaction, C14761a> implements MessageLiteOrBuilder {
                /* synthetic */ C14761a(C14768a c14768a) {
                    this();
                }

                public C14761a clearItype() {
                    copyOnWrite();
                    ((Interaction) this.instance).clearItype();
                    return this;
                }

                public C14761a clearMetadataUrl() {
                    copyOnWrite();
                    ((Interaction) this.instance).clearMetadataUrl();
                    return this;
                }

                public C14761a clearNftId() {
                    copyOnWrite();
                    ((Interaction) this.instance).clearNftId();
                    return this;
                }

                public C14761a clearRegion() {
                    copyOnWrite();
                    ((Interaction) this.instance).clearRegion();
                    return this;
                }

                public String getItype() {
                    return ((Interaction) this.instance).getItype();
                }

                public ByteString getItypeBytes() {
                    return ((Interaction) this.instance).getItypeBytes();
                }

                public String getMetadataUrl() {
                    return ((Interaction) this.instance).getMetadataUrl();
                }

                public ByteString getMetadataUrlBytes() {
                    return ((Interaction) this.instance).getMetadataUrlBytes();
                }

                public String getNftId() {
                    return ((Interaction) this.instance).getNftId();
                }

                public ByteString getNftIdBytes() {
                    return ((Interaction) this.instance).getNftIdBytes();
                }

                public Region getRegion() {
                    return ((Interaction) this.instance).getRegion();
                }

                public boolean hasRegion() {
                    return ((Interaction) this.instance).hasRegion();
                }

                public C14761a mergeRegion(Region region) {
                    copyOnWrite();
                    ((Interaction) this.instance).mergeRegion(region);
                    return this;
                }

                public C14761a setItype(String str) {
                    copyOnWrite();
                    ((Interaction) this.instance).setItype(str);
                    return this;
                }

                public C14761a setItypeBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Interaction) this.instance).setItypeBytes(byteString);
                    return this;
                }

                public C14761a setMetadataUrl(String str) {
                    copyOnWrite();
                    ((Interaction) this.instance).setMetadataUrl(str);
                    return this;
                }

                public C14761a setMetadataUrlBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Interaction) this.instance).setMetadataUrlBytes(byteString);
                    return this;
                }

                public C14761a setNftId(String str) {
                    copyOnWrite();
                    ((Interaction) this.instance).setNftId(str);
                    return this;
                }

                public C14761a setNftIdBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Interaction) this.instance).setNftIdBytes(byteString);
                    return this;
                }

                public C14761a setRegion(Region region) {
                    copyOnWrite();
                    ((Interaction) this.instance).setRegion(region);
                    return this;
                }

                private C14761a() {
                    super(Interaction.DEFAULT_INSTANCE);
                }

                public C14761a setRegion(Region.C14756a c14756a) {
                    copyOnWrite();
                    ((Interaction) this.instance).setRegion(c14756a.build());
                    return this;
                }
            }

            static {
                Interaction interaction = new Interaction();
                DEFAULT_INSTANCE = interaction;
                GeneratedMessageLite.registerDefaultInstance(Interaction.class, interaction);
            }

            private Interaction() {
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

            public static Interaction getDefaultInstance() {
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

            public static C14761a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Interaction parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Interaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Interaction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Interaction> parser() {
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
                switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Interaction();
                    case 2:
                        return new C14761a(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\t", new Object[]{"itype_", "metadataUrl_", "nftId_", "region_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Interaction> parser = PARSER;
                        if (parser == null) {
                            synchronized (Interaction.class) {
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

            public static C14761a newBuilder(Interaction interaction) {
                return DEFAULT_INSTANCE.createBuilder(interaction);
            }

            public static Interaction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Interaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Interaction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Interaction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Interaction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Interaction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Interaction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Interaction parseFrom(InputStream inputStream) throws IOException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Interaction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Interaction parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Interaction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Interaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Nft$a */
        /* loaded from: classes21.dex */
        public static final class C14762a extends GeneratedMessageLite.Builder<Nft, C14762a> implements MessageLiteOrBuilder {
            /* synthetic */ C14762a(C14768a c14768a) {
                this();
            }

            public C14762a clearFace() {
                copyOnWrite();
                ((Nft) this.instance).clearFace();
                return this;
            }

            public C14762a clearInteraction() {
                copyOnWrite();
                ((Nft) this.instance).clearInteraction();
                return this;
            }

            public int getFace() {
                return ((Nft) this.instance).getFace();
            }

            public Interaction getInteraction() {
                return ((Nft) this.instance).getInteraction();
            }

            public boolean hasInteraction() {
                return ((Nft) this.instance).hasInteraction();
            }

            public C14762a mergeInteraction(Interaction interaction) {
                copyOnWrite();
                ((Nft) this.instance).mergeInteraction(interaction);
                return this;
            }

            public C14762a setFace(int i) {
                copyOnWrite();
                ((Nft) this.instance).setFace(i);
                return this;
            }

            public C14762a setInteraction(Interaction interaction) {
                copyOnWrite();
                ((Nft) this.instance).setInteraction(interaction);
                return this;
            }

            private C14762a() {
                super(Nft.DEFAULT_INSTANCE);
            }

            public C14762a setInteraction(Interaction.C14761a c14761a) {
                copyOnWrite();
                ((Nft) this.instance).setInteraction(c14761a.build());
                return this;
            }
        }

        static {
            Nft nft = new Nft();
            DEFAULT_INSTANCE = nft;
            GeneratedMessageLite.registerDefaultInstance(Nft.class, nft);
        }

        private Nft() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFace() {
            this.face_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInteraction() {
            this.interaction_ = null;
        }

        public static Nft getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInteraction(Interaction interaction) {
            interaction.getClass();
            Interaction interaction2 = this.interaction_;
            if (interaction2 != null && interaction2 != Interaction.getDefaultInstance()) {
                this.interaction_ = Interaction.newBuilder(this.interaction_).mergeFrom((Interaction) interaction).buildPartial();
            } else {
                this.interaction_ = interaction;
            }
        }

        public static C14762a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Nft parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Nft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Nft parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Nft> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFace(int i) {
            this.face_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInteraction(Interaction interaction) {
            interaction.getClass();
            this.interaction_ = interaction;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Nft();
                case 2:
                    return new C14762a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"face_", "interaction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Nft> parser = PARSER;
                    if (parser == null) {
                        synchronized (Nft.class) {
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

        public int getFace() {
            return this.face_;
        }

        public Interaction getInteraction() {
            Interaction interaction = this.interaction_;
            return interaction == null ? Interaction.getDefaultInstance() : interaction;
        }

        public boolean hasInteraction() {
            return this.interaction_ != null;
        }

        public static C14762a newBuilder(Nft nft) {
            return DEFAULT_INSTANCE.createBuilder(nft);
        }

        public static Nft parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Nft) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Nft parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Nft parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Nft parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Nft parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Nft parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Nft parseFrom(InputStream inputStream) throws IOException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Nft parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Nft parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Nft parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Nft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Official extends GeneratedMessageLite<Official, Official.C14763a> implements MessageLiteOrBuilder {
        private static final Official DEFAULT_INSTANCE;
        private static volatile Parser<Official> PARSER = null;
        public static final int VERIFY_TYPE_FIELD_NUMBER = 1;
        private long verifyType_;

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Official$a */
        /* loaded from: classes21.dex */
        public static final class C14763a extends GeneratedMessageLite.Builder<Official, C14763a> implements MessageLiteOrBuilder {
            /* synthetic */ C14763a(C14768a c14768a) {
                this();
            }

            public C14763a clearVerifyType() {
                copyOnWrite();
                ((Official) this.instance).clearVerifyType();
                return this;
            }

            public long getVerifyType() {
                return ((Official) this.instance).getVerifyType();
            }

            public C14763a setVerifyType(long j) {
                copyOnWrite();
                ((Official) this.instance).setVerifyType(j);
                return this;
            }

            private C14763a() {
                super(Official.DEFAULT_INSTANCE);
            }
        }

        static {
            Official official = new Official();
            DEFAULT_INSTANCE = official;
            GeneratedMessageLite.registerDefaultInstance(Official.class, official);
        }

        private Official() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerifyType() {
            this.verifyType_ = 0L;
        }

        public static Official getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14763a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Official parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Official) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Official parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Official> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerifyType(long j) {
            this.verifyType_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Official();
                case 2:
                    return new C14763a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"verifyType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Official> parser = PARSER;
                    if (parser == null) {
                        synchronized (Official.class) {
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

        public long getVerifyType() {
            return this.verifyType_;
        }

        public static C14763a newBuilder(Official official) {
            return DEFAULT_INSTANCE.createBuilder(official);
        }

        public static Official parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Official) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Official parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Official parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Official parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Official parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Official parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Official parseFrom(InputStream inputStream) throws IOException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Official parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Official parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Official parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Official) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Senior extends GeneratedMessageLite<Senior, Senior.C14766a> implements MessageLiteOrBuilder {
        private static final Senior DEFAULT_INSTANCE;
        public static final int IS_SENIOR_MEMBER_FIELD_NUMBER = 1;
        private static volatile Parser<Senior> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int isSeniorMember_;
        private int status_;

        /* compiled from: BL */
        /* loaded from: classes21.dex */
        public enum Status implements Internal.EnumLite {
            Normal(0),
            Pending(1),
            Senior(2),
            WillExpire(3),
            Expired(4),
            UNRECOGNIZED(-1);
            
            public static final int Expired_VALUE = 4;
            public static final int Normal_VALUE = 0;
            public static final int Pending_VALUE = 1;
            public static final int Senior_VALUE = 2;
            public static final int WillExpire_VALUE = 3;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new C14764a();
            private final int value;

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Senior$Status$a */
            /* loaded from: classes21.dex */
            static class C14764a implements Internal.EnumLiteMap<Status> {
                C14764a() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Status findValueByNumber(int i) {
                    return Status.forNumber(i);
                }
            }

            /* compiled from: BL */
            /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Senior$Status$b */
            /* loaded from: classes21.dex */
            private static final class C14765b implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new C14765b();

                private C14765b() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    return Status.forNumber(i) != null;
                }
            }

            Status(int i) {
                this.value = i;
            }

            public static Status forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return Expired;
                            }
                            return WillExpire;
                        }
                        return Senior;
                    }
                    return Pending;
                }
                return Normal;
            }

            public static Internal.EnumLiteMap<Status> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return C14765b.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static Status valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Senior$a */
        /* loaded from: classes21.dex */
        public static final class C14766a extends GeneratedMessageLite.Builder<Senior, C14766a> implements MessageLiteOrBuilder {
            /* synthetic */ C14766a(C14768a c14768a) {
                this();
            }

            public C14766a clearIsSeniorMember() {
                copyOnWrite();
                ((Senior) this.instance).clearIsSeniorMember();
                return this;
            }

            public C14766a clearStatus() {
                copyOnWrite();
                ((Senior) this.instance).clearStatus();
                return this;
            }

            public int getIsSeniorMember() {
                return ((Senior) this.instance).getIsSeniorMember();
            }

            public Status getStatus() {
                return ((Senior) this.instance).getStatus();
            }

            public int getStatusValue() {
                return ((Senior) this.instance).getStatusValue();
            }

            public C14766a setIsSeniorMember(int i) {
                copyOnWrite();
                ((Senior) this.instance).setIsSeniorMember(i);
                return this;
            }

            public C14766a setStatus(Status status) {
                copyOnWrite();
                ((Senior) this.instance).setStatus(status);
                return this;
            }

            public C14766a setStatusValue(int i) {
                copyOnWrite();
                ((Senior) this.instance).setStatusValue(i);
                return this;
            }

            private C14766a() {
                super(Senior.DEFAULT_INSTANCE);
            }
        }

        static {
            Senior senior = new Senior();
            DEFAULT_INSTANCE = senior;
            GeneratedMessageLite.registerDefaultInstance(Senior.class, senior);
        }

        private Senior() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsSeniorMember() {
            this.isSeniorMember_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static Senior getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14766a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Senior parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Senior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Senior parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Senior> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsSeniorMember(int i) {
            this.isSeniorMember_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status status) {
            this.status_ = status.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int i) {
            this.status_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Senior();
                case 2:
                    return new C14766a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"isSeniorMember_", "status_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Senior> parser = PARSER;
                    if (parser == null) {
                        synchronized (Senior.class) {
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

        public int getIsSeniorMember() {
            return this.isSeniorMember_;
        }

        public Status getStatus() {
            Status forNumber = Status.forNumber(this.status_);
            return forNumber == null ? Status.UNRECOGNIZED : forNumber;
        }

        public int getStatusValue() {
            return this.status_;
        }

        public static C14766a newBuilder(Senior senior) {
            return DEFAULT_INSTANCE.createBuilder(senior);
        }

        public static Senior parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Senior) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Senior parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Senior parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Senior parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Senior parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Senior parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Senior parseFrom(InputStream inputStream) throws IOException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Senior parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Senior parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Senior parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Senior) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class Vip extends GeneratedMessageLite<Vip, Vip.C14767a> implements MessageLiteOrBuilder {
        public static final int AVATAR_SUBSCRIPT_FIELD_NUMBER = 6;
        private static final Vip DEFAULT_INSTANCE;
        public static final int LABEL_PATH_FIELD_NUMBER = 4;
        public static final int LABEL_TEXT_FIELD_NUMBER = 7;
        public static final int NICKNAME_COLOR_FIELD_NUMBER = 5;
        private static volatile Parser<Vip> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int THEME_TYPE_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VIP_LABEL_THEME_FIELD_NUMBER = 8;
        private int avatarSubscript_;
        private long status_;
        private long themeType_;
        private long type_;
        private String labelPath_ = "";
        private String nicknameColor_ = "";
        private String labelText_ = "";
        private String vipLabelTheme_ = "";

        /* compiled from: BL */
        /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$Vip$a */
        /* loaded from: classes21.dex */
        public static final class C14767a extends GeneratedMessageLite.Builder<Vip, C14767a> implements MessageLiteOrBuilder {
            /* synthetic */ C14767a(C14768a c14768a) {
                this();
            }

            public C14767a clearAvatarSubscript() {
                copyOnWrite();
                ((Vip) this.instance).clearAvatarSubscript();
                return this;
            }

            public C14767a clearLabelPath() {
                copyOnWrite();
                ((Vip) this.instance).clearLabelPath();
                return this;
            }

            public C14767a clearLabelText() {
                copyOnWrite();
                ((Vip) this.instance).clearLabelText();
                return this;
            }

            public C14767a clearNicknameColor() {
                copyOnWrite();
                ((Vip) this.instance).clearNicknameColor();
                return this;
            }

            public C14767a clearStatus() {
                copyOnWrite();
                ((Vip) this.instance).clearStatus();
                return this;
            }

            public C14767a clearThemeType() {
                copyOnWrite();
                ((Vip) this.instance).clearThemeType();
                return this;
            }

            public C14767a clearType() {
                copyOnWrite();
                ((Vip) this.instance).clearType();
                return this;
            }

            public C14767a clearVipLabelTheme() {
                copyOnWrite();
                ((Vip) this.instance).clearVipLabelTheme();
                return this;
            }

            public int getAvatarSubscript() {
                return ((Vip) this.instance).getAvatarSubscript();
            }

            public String getLabelPath() {
                return ((Vip) this.instance).getLabelPath();
            }

            public ByteString getLabelPathBytes() {
                return ((Vip) this.instance).getLabelPathBytes();
            }

            public String getLabelText() {
                return ((Vip) this.instance).getLabelText();
            }

            public ByteString getLabelTextBytes() {
                return ((Vip) this.instance).getLabelTextBytes();
            }

            public String getNicknameColor() {
                return ((Vip) this.instance).getNicknameColor();
            }

            public ByteString getNicknameColorBytes() {
                return ((Vip) this.instance).getNicknameColorBytes();
            }

            public long getStatus() {
                return ((Vip) this.instance).getStatus();
            }

            public long getThemeType() {
                return ((Vip) this.instance).getThemeType();
            }

            public long getType() {
                return ((Vip) this.instance).getType();
            }

            public String getVipLabelTheme() {
                return ((Vip) this.instance).getVipLabelTheme();
            }

            public ByteString getVipLabelThemeBytes() {
                return ((Vip) this.instance).getVipLabelThemeBytes();
            }

            public C14767a setAvatarSubscript(int i) {
                copyOnWrite();
                ((Vip) this.instance).setAvatarSubscript(i);
                return this;
            }

            public C14767a setLabelPath(String str) {
                copyOnWrite();
                ((Vip) this.instance).setLabelPath(str);
                return this;
            }

            public C14767a setLabelPathBytes(ByteString byteString) {
                copyOnWrite();
                ((Vip) this.instance).setLabelPathBytes(byteString);
                return this;
            }

            public C14767a setLabelText(String str) {
                copyOnWrite();
                ((Vip) this.instance).setLabelText(str);
                return this;
            }

            public C14767a setLabelTextBytes(ByteString byteString) {
                copyOnWrite();
                ((Vip) this.instance).setLabelTextBytes(byteString);
                return this;
            }

            public C14767a setNicknameColor(String str) {
                copyOnWrite();
                ((Vip) this.instance).setNicknameColor(str);
                return this;
            }

            public C14767a setNicknameColorBytes(ByteString byteString) {
                copyOnWrite();
                ((Vip) this.instance).setNicknameColorBytes(byteString);
                return this;
            }

            public C14767a setStatus(long j) {
                copyOnWrite();
                ((Vip) this.instance).setStatus(j);
                return this;
            }

            public C14767a setThemeType(long j) {
                copyOnWrite();
                ((Vip) this.instance).setThemeType(j);
                return this;
            }

            public C14767a setType(long j) {
                copyOnWrite();
                ((Vip) this.instance).setType(j);
                return this;
            }

            public C14767a setVipLabelTheme(String str) {
                copyOnWrite();
                ((Vip) this.instance).setVipLabelTheme(str);
                return this;
            }

            public C14767a setVipLabelThemeBytes(ByteString byteString) {
                copyOnWrite();
                ((Vip) this.instance).setVipLabelThemeBytes(byteString);
                return this;
            }

            private C14767a() {
                super(Vip.DEFAULT_INSTANCE);
            }
        }

        static {
            Vip vip = new Vip();
            DEFAULT_INSTANCE = vip;
            GeneratedMessageLite.registerDefaultInstance(Vip.class, vip);
        }

        private Vip() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvatarSubscript() {
            this.avatarSubscript_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabelPath() {
            this.labelPath_ = getDefaultInstance().getLabelPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabelText() {
            this.labelText_ = getDefaultInstance().getLabelText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNicknameColor() {
            this.nicknameColor_ = getDefaultInstance().getNicknameColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThemeType() {
            this.themeType_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVipLabelTheme() {
            this.vipLabelTheme_ = getDefaultInstance().getVipLabelTheme();
        }

        public static Vip getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C14767a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Vip parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Vip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Vip parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Vip> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvatarSubscript(int i) {
            this.avatarSubscript_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabelPath(String str) {
            str.getClass();
            this.labelPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabelPathBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.labelPath_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabelText(String str) {
            str.getClass();
            this.labelText_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabelTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.labelText_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNicknameColor(String str) {
            str.getClass();
            this.nicknameColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNicknameColorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.nicknameColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(long j) {
            this.status_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThemeType(long j) {
            this.themeType_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(long j) {
            this.type_ = j;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Vip();
                case 2:
                    return new C14767a(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0208\b\u0208", new Object[]{"type_", "status_", "themeType_", "labelPath_", "nicknameColor_", "avatarSubscript_", "labelText_", "vipLabelTheme_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Vip> parser = PARSER;
                    if (parser == null) {
                        synchronized (Vip.class) {
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

        public int getAvatarSubscript() {
            return this.avatarSubscript_;
        }

        public String getLabelPath() {
            return this.labelPath_;
        }

        public ByteString getLabelPathBytes() {
            return ByteString.copyFromUtf8(this.labelPath_);
        }

        public String getLabelText() {
            return this.labelText_;
        }

        public ByteString getLabelTextBytes() {
            return ByteString.copyFromUtf8(this.labelText_);
        }

        public String getNicknameColor() {
            return this.nicknameColor_;
        }

        public ByteString getNicknameColorBytes() {
            return ByteString.copyFromUtf8(this.nicknameColor_);
        }

        public long getStatus() {
            return this.status_;
        }

        public long getThemeType() {
            return this.themeType_;
        }

        public long getType() {
            return this.type_;
        }

        public String getVipLabelTheme() {
            return this.vipLabelTheme_;
        }

        public ByteString getVipLabelThemeBytes() {
            return ByteString.copyFromUtf8(this.vipLabelTheme_);
        }

        public static C14767a newBuilder(Vip vip) {
            return DEFAULT_INSTANCE.createBuilder(vip);
        }

        public static Vip parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Vip) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Vip parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Vip parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Vip parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Vip parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Vip parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Vip parseFrom(InputStream inputStream) throws IOException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Vip parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Vip parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Vip parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Vip) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$a */
    /* loaded from: classes21.dex */
    static /* synthetic */ class C14768a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22005xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22005xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22005xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22005xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22005xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22005xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.main.community.reply.v1.MemberV2$b */
    /* loaded from: classes21.dex */
    public static final class C14769b extends GeneratedMessageLite.Builder<MemberV2, C14769b> implements MessageLiteOrBuilder {
        /* synthetic */ C14769b(C14768a c14768a) {
            this();
        }

        public C14769b clearBasic() {
            copyOnWrite();
            ((MemberV2) this.instance).clearBasic();
            return this;
        }

        public C14769b clearContractor() {
            copyOnWrite();
            ((MemberV2) this.instance).clearContractor();
            return this;
        }

        public C14769b clearGarb() {
            copyOnWrite();
            ((MemberV2) this.instance).clearGarb();
            return this;
        }

        public C14769b clearMedal() {
            copyOnWrite();
            ((MemberV2) this.instance).clearMedal();
            return this;
        }

        public C14769b clearNft() {
            copyOnWrite();
            ((MemberV2) this.instance).clearNft();
            return this;
        }

        public C14769b clearOfficial() {
            copyOnWrite();
            ((MemberV2) this.instance).clearOfficial();
            return this;
        }

        public C14769b clearSenior() {
            copyOnWrite();
            ((MemberV2) this.instance).clearSenior();
            return this;
        }

        public C14769b clearVip() {
            copyOnWrite();
            ((MemberV2) this.instance).clearVip();
            return this;
        }

        public Basic getBasic() {
            return ((MemberV2) this.instance).getBasic();
        }

        public Contractor getContractor() {
            return ((MemberV2) this.instance).getContractor();
        }

        public Garb getGarb() {
            return ((MemberV2) this.instance).getGarb();
        }

        public Medal getMedal() {
            return ((MemberV2) this.instance).getMedal();
        }

        public Nft getNft() {
            return ((MemberV2) this.instance).getNft();
        }

        public Official getOfficial() {
            return ((MemberV2) this.instance).getOfficial();
        }

        public Senior getSenior() {
            return ((MemberV2) this.instance).getSenior();
        }

        public Vip getVip() {
            return ((MemberV2) this.instance).getVip();
        }

        public boolean hasBasic() {
            return ((MemberV2) this.instance).hasBasic();
        }

        public boolean hasContractor() {
            return ((MemberV2) this.instance).hasContractor();
        }

        public boolean hasGarb() {
            return ((MemberV2) this.instance).hasGarb();
        }

        public boolean hasMedal() {
            return ((MemberV2) this.instance).hasMedal();
        }

        public boolean hasNft() {
            return ((MemberV2) this.instance).hasNft();
        }

        public boolean hasOfficial() {
            return ((MemberV2) this.instance).hasOfficial();
        }

        public boolean hasSenior() {
            return ((MemberV2) this.instance).hasSenior();
        }

        public boolean hasVip() {
            return ((MemberV2) this.instance).hasVip();
        }

        public C14769b mergeBasic(Basic basic) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeBasic(basic);
            return this;
        }

        public C14769b mergeContractor(Contractor contractor) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeContractor(contractor);
            return this;
        }

        public C14769b mergeGarb(Garb garb) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeGarb(garb);
            return this;
        }

        public C14769b mergeMedal(Medal medal) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeMedal(medal);
            return this;
        }

        public C14769b mergeNft(Nft nft) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeNft(nft);
            return this;
        }

        public C14769b mergeOfficial(Official official) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeOfficial(official);
            return this;
        }

        public C14769b mergeSenior(Senior senior) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeSenior(senior);
            return this;
        }

        public C14769b mergeVip(Vip vip) {
            copyOnWrite();
            ((MemberV2) this.instance).mergeVip(vip);
            return this;
        }

        public C14769b setBasic(Basic basic) {
            copyOnWrite();
            ((MemberV2) this.instance).setBasic(basic);
            return this;
        }

        public C14769b setContractor(Contractor contractor) {
            copyOnWrite();
            ((MemberV2) this.instance).setContractor(contractor);
            return this;
        }

        public C14769b setGarb(Garb garb) {
            copyOnWrite();
            ((MemberV2) this.instance).setGarb(garb);
            return this;
        }

        public C14769b setMedal(Medal medal) {
            copyOnWrite();
            ((MemberV2) this.instance).setMedal(medal);
            return this;
        }

        public C14769b setNft(Nft nft) {
            copyOnWrite();
            ((MemberV2) this.instance).setNft(nft);
            return this;
        }

        public C14769b setOfficial(Official official) {
            copyOnWrite();
            ((MemberV2) this.instance).setOfficial(official);
            return this;
        }

        public C14769b setSenior(Senior senior) {
            copyOnWrite();
            ((MemberV2) this.instance).setSenior(senior);
            return this;
        }

        public C14769b setVip(Vip vip) {
            copyOnWrite();
            ((MemberV2) this.instance).setVip(vip);
            return this;
        }

        private C14769b() {
            super(MemberV2.DEFAULT_INSTANCE);
        }

        public C14769b setBasic(Basic.C14752a c14752a) {
            copyOnWrite();
            ((MemberV2) this.instance).setBasic(c14752a.build());
            return this;
        }

        public C14769b setContractor(Contractor.C14753a c14753a) {
            copyOnWrite();
            ((MemberV2) this.instance).setContractor(c14753a.build());
            return this;
        }

        public C14769b setGarb(Garb.C14754a c14754a) {
            copyOnWrite();
            ((MemberV2) this.instance).setGarb(c14754a.build());
            return this;
        }

        public C14769b setMedal(Medal.C14755a c14755a) {
            copyOnWrite();
            ((MemberV2) this.instance).setMedal(c14755a.build());
            return this;
        }

        public C14769b setNft(Nft.C14762a c14762a) {
            copyOnWrite();
            ((MemberV2) this.instance).setNft(c14762a.build());
            return this;
        }

        public C14769b setOfficial(Official.C14763a c14763a) {
            copyOnWrite();
            ((MemberV2) this.instance).setOfficial(c14763a.build());
            return this;
        }

        public C14769b setSenior(Senior.C14766a c14766a) {
            copyOnWrite();
            ((MemberV2) this.instance).setSenior(c14766a.build());
            return this;
        }

        public C14769b setVip(Vip.C14767a c14767a) {
            copyOnWrite();
            ((MemberV2) this.instance).setVip(c14767a.build());
            return this;
        }
    }

    static {
        MemberV2 memberV2 = new MemberV2();
        DEFAULT_INSTANCE = memberV2;
        GeneratedMessageLite.registerDefaultInstance(MemberV2.class, memberV2);
    }

    private MemberV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBasic() {
        this.basic_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContractor() {
        this.contractor_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGarb() {
        this.garb_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedal() {
        this.medal_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNft() {
        this.nft_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfficial() {
        this.official_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenior() {
        this.senior_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVip() {
        this.vip_ = null;
    }

    public static MemberV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBasic(Basic basic) {
        basic.getClass();
        Basic basic2 = this.basic_;
        if (basic2 != null && basic2 != Basic.getDefaultInstance()) {
            this.basic_ = Basic.newBuilder(this.basic_).mergeFrom((Basic) basic).buildPartial();
        } else {
            this.basic_ = basic;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContractor(Contractor contractor) {
        contractor.getClass();
        Contractor contractor2 = this.contractor_;
        if (contractor2 != null && contractor2 != Contractor.getDefaultInstance()) {
            this.contractor_ = Contractor.newBuilder(this.contractor_).mergeFrom((Contractor) contractor).buildPartial();
        } else {
            this.contractor_ = contractor;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGarb(Garb garb) {
        garb.getClass();
        Garb garb2 = this.garb_;
        if (garb2 != null && garb2 != Garb.getDefaultInstance()) {
            this.garb_ = Garb.newBuilder(this.garb_).mergeFrom((Garb) garb).buildPartial();
        } else {
            this.garb_ = garb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMedal(Medal medal) {
        medal.getClass();
        Medal medal2 = this.medal_;
        if (medal2 != null && medal2 != Medal.getDefaultInstance()) {
            this.medal_ = Medal.newBuilder(this.medal_).mergeFrom((Medal) medal).buildPartial();
        } else {
            this.medal_ = medal;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNft(Nft nft) {
        nft.getClass();
        Nft nft2 = this.nft_;
        if (nft2 != null && nft2 != Nft.getDefaultInstance()) {
            this.nft_ = Nft.newBuilder(this.nft_).mergeFrom((Nft) nft).buildPartial();
        } else {
            this.nft_ = nft;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOfficial(Official official) {
        official.getClass();
        Official official2 = this.official_;
        if (official2 != null && official2 != Official.getDefaultInstance()) {
            this.official_ = Official.newBuilder(this.official_).mergeFrom((Official) official).buildPartial();
        } else {
            this.official_ = official;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSenior(Senior senior) {
        senior.getClass();
        Senior senior2 = this.senior_;
        if (senior2 != null && senior2 != Senior.getDefaultInstance()) {
            this.senior_ = Senior.newBuilder(this.senior_).mergeFrom((Senior) senior).buildPartial();
        } else {
            this.senior_ = senior;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVip(Vip vip) {
        vip.getClass();
        Vip vip2 = this.vip_;
        if (vip2 != null && vip2 != Vip.getDefaultInstance()) {
            this.vip_ = Vip.newBuilder(this.vip_).mergeFrom((Vip) vip).buildPartial();
        } else {
            this.vip_ = vip;
        }
    }

    public static C14769b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MemberV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MemberV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MemberV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MemberV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBasic(Basic basic) {
        basic.getClass();
        this.basic_ = basic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContractor(Contractor contractor) {
        contractor.getClass();
        this.contractor_ = contractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGarb(Garb garb) {
        garb.getClass();
        this.garb_ = garb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedal(Medal medal) {
        medal.getClass();
        this.medal_ = medal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNft(Nft nft) {
        nft.getClass();
        this.nft_ = nft;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfficial(Official official) {
        official.getClass();
        this.official_ = official;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenior(Senior senior) {
        senior.getClass();
        this.senior_ = senior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVip(Vip vip) {
        vip.getClass();
        this.vip_ = vip;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C14768a.f22005xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new MemberV2();
            case 2:
                return new C14769b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t", new Object[]{"basic_", "official_", "vip_", "garb_", "medal_", "nft_", "senior_", "contractor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MemberV2> parser = PARSER;
                if (parser == null) {
                    synchronized (MemberV2.class) {
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

    public Basic getBasic() {
        Basic basic = this.basic_;
        return basic == null ? Basic.getDefaultInstance() : basic;
    }

    public Contractor getContractor() {
        Contractor contractor = this.contractor_;
        return contractor == null ? Contractor.getDefaultInstance() : contractor;
    }

    public Garb getGarb() {
        Garb garb = this.garb_;
        return garb == null ? Garb.getDefaultInstance() : garb;
    }

    public Medal getMedal() {
        Medal medal = this.medal_;
        return medal == null ? Medal.getDefaultInstance() : medal;
    }

    public Nft getNft() {
        Nft nft = this.nft_;
        return nft == null ? Nft.getDefaultInstance() : nft;
    }

    public Official getOfficial() {
        Official official = this.official_;
        return official == null ? Official.getDefaultInstance() : official;
    }

    public Senior getSenior() {
        Senior senior = this.senior_;
        return senior == null ? Senior.getDefaultInstance() : senior;
    }

    public Vip getVip() {
        Vip vip = this.vip_;
        return vip == null ? Vip.getDefaultInstance() : vip;
    }

    public boolean hasBasic() {
        return this.basic_ != null;
    }

    public boolean hasContractor() {
        return this.contractor_ != null;
    }

    public boolean hasGarb() {
        return this.garb_ != null;
    }

    public boolean hasMedal() {
        return this.medal_ != null;
    }

    public boolean hasNft() {
        return this.nft_ != null;
    }

    public boolean hasOfficial() {
        return this.official_ != null;
    }

    public boolean hasSenior() {
        return this.senior_ != null;
    }

    public boolean hasVip() {
        return this.vip_ != null;
    }

    public static C14769b newBuilder(MemberV2 memberV2) {
        return DEFAULT_INSTANCE.createBuilder(memberV2);
    }

    public static MemberV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MemberV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MemberV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MemberV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MemberV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MemberV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MemberV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MemberV2 parseFrom(InputStream inputStream) throws IOException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MemberV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MemberV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MemberV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MemberV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
