package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class LargeCoverV4 extends GeneratedMessageLite<LargeCoverV4, LargeCoverV4.C5829b> implements MessageLiteOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int BVID_FIELD_NUMBER = 11;
    public static final int CAN_PLAY_FIELD_NUMBER = 6;
    public static final int COVER_BADGE_FIELD_NUMBER = 5;
    public static final int COVER_LEFT_TEXT_1_FIELD_NUMBER = 2;
    public static final int COVER_LEFT_TEXT_2_FIELD_NUMBER = 3;
    public static final int COVER_LEFT_TEXT_3_FIELD_NUMBER = 4;
    private static final LargeCoverV4 DEFAULT_INSTANCE;
    private static volatile Parser<LargeCoverV4> PARSER = null;
    public static final int PLAY_NUMBER_FIELD_NUMBER = 10;
    public static final int SHARE_SUBTITLE_FIELD_NUMBER = 9;
    public static final int SHORT_LINK_FIELD_NUMBER = 8;
    public static final int SUB_PARAM_FIELD_NUMBER = 12;
    public static final int UP_FIELD_NUMBER = 7;
    private Base base_;
    private int canPlay_;
    private Up up_;
    private String coverLeftText1_ = "";
    private String coverLeftText2_ = "";
    private String coverLeftText3_ = "";
    private String coverBadge_ = "";
    private String shortLink_ = "";
    private String shareSubtitle_ = "";
    private String playNumber_ = "";
    private String bvid_ = "";
    private String subParam_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.LargeCoverV4$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5828a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15963xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15963xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15963xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.LargeCoverV4$b */
    /* loaded from: classes13.dex */
    public static final class C5829b extends GeneratedMessageLite.Builder<LargeCoverV4, C5829b> implements MessageLiteOrBuilder {
        /* synthetic */ C5829b(C5828a c5828a) {
            this();
        }

        public C5829b clearBase() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearBase();
            return this;
        }

        public C5829b clearBvid() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearBvid();
            return this;
        }

        public C5829b clearCanPlay() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearCanPlay();
            return this;
        }

        public C5829b clearCoverBadge() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearCoverBadge();
            return this;
        }

        public C5829b clearCoverLeftText1() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearCoverLeftText1();
            return this;
        }

        public C5829b clearCoverLeftText2() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearCoverLeftText2();
            return this;
        }

        public C5829b clearCoverLeftText3() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearCoverLeftText3();
            return this;
        }

        public C5829b clearPlayNumber() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearPlayNumber();
            return this;
        }

        public C5829b clearShareSubtitle() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearShareSubtitle();
            return this;
        }

        public C5829b clearShortLink() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearShortLink();
            return this;
        }

        public C5829b clearSubParam() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearSubParam();
            return this;
        }

        public C5829b clearUp() {
            copyOnWrite();
            ((LargeCoverV4) this.instance).clearUp();
            return this;
        }

        public Base getBase() {
            return ((LargeCoverV4) this.instance).getBase();
        }

        public String getBvid() {
            return ((LargeCoverV4) this.instance).getBvid();
        }

        public ByteString getBvidBytes() {
            return ((LargeCoverV4) this.instance).getBvidBytes();
        }

        public int getCanPlay() {
            return ((LargeCoverV4) this.instance).getCanPlay();
        }

        public String getCoverBadge() {
            return ((LargeCoverV4) this.instance).getCoverBadge();
        }

        public ByteString getCoverBadgeBytes() {
            return ((LargeCoverV4) this.instance).getCoverBadgeBytes();
        }

        public String getCoverLeftText1() {
            return ((LargeCoverV4) this.instance).getCoverLeftText1();
        }

        public ByteString getCoverLeftText1Bytes() {
            return ((LargeCoverV4) this.instance).getCoverLeftText1Bytes();
        }

        public String getCoverLeftText2() {
            return ((LargeCoverV4) this.instance).getCoverLeftText2();
        }

        public ByteString getCoverLeftText2Bytes() {
            return ((LargeCoverV4) this.instance).getCoverLeftText2Bytes();
        }

        public String getCoverLeftText3() {
            return ((LargeCoverV4) this.instance).getCoverLeftText3();
        }

        public ByteString getCoverLeftText3Bytes() {
            return ((LargeCoverV4) this.instance).getCoverLeftText3Bytes();
        }

        public String getPlayNumber() {
            return ((LargeCoverV4) this.instance).getPlayNumber();
        }

        public ByteString getPlayNumberBytes() {
            return ((LargeCoverV4) this.instance).getPlayNumberBytes();
        }

        public String getShareSubtitle() {
            return ((LargeCoverV4) this.instance).getShareSubtitle();
        }

        public ByteString getShareSubtitleBytes() {
            return ((LargeCoverV4) this.instance).getShareSubtitleBytes();
        }

        public String getShortLink() {
            return ((LargeCoverV4) this.instance).getShortLink();
        }

        public ByteString getShortLinkBytes() {
            return ((LargeCoverV4) this.instance).getShortLinkBytes();
        }

        public String getSubParam() {
            return ((LargeCoverV4) this.instance).getSubParam();
        }

        public ByteString getSubParamBytes() {
            return ((LargeCoverV4) this.instance).getSubParamBytes();
        }

        public Up getUp() {
            return ((LargeCoverV4) this.instance).getUp();
        }

        public boolean hasBase() {
            return ((LargeCoverV4) this.instance).hasBase();
        }

        public boolean hasUp() {
            return ((LargeCoverV4) this.instance).hasUp();
        }

        public C5829b mergeBase(Base base2) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).mergeBase(base2);
            return this;
        }

        public C5829b mergeUp(Up up) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).mergeUp(up);
            return this;
        }

        public C5829b setBase(Base base2) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setBase(base2);
            return this;
        }

        public C5829b setBvid(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setBvid(str);
            return this;
        }

        public C5829b setBvidBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setBvidBytes(byteString);
            return this;
        }

        public C5829b setCanPlay(int i) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCanPlay(i);
            return this;
        }

        public C5829b setCoverBadge(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverBadge(str);
            return this;
        }

        public C5829b setCoverBadgeBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverBadgeBytes(byteString);
            return this;
        }

        public C5829b setCoverLeftText1(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverLeftText1(str);
            return this;
        }

        public C5829b setCoverLeftText1Bytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverLeftText1Bytes(byteString);
            return this;
        }

        public C5829b setCoverLeftText2(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverLeftText2(str);
            return this;
        }

        public C5829b setCoverLeftText2Bytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverLeftText2Bytes(byteString);
            return this;
        }

        public C5829b setCoverLeftText3(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverLeftText3(str);
            return this;
        }

        public C5829b setCoverLeftText3Bytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setCoverLeftText3Bytes(byteString);
            return this;
        }

        public C5829b setPlayNumber(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setPlayNumber(str);
            return this;
        }

        public C5829b setPlayNumberBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setPlayNumberBytes(byteString);
            return this;
        }

        public C5829b setShareSubtitle(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setShareSubtitle(str);
            return this;
        }

        public C5829b setShareSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setShareSubtitleBytes(byteString);
            return this;
        }

        public C5829b setShortLink(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setShortLink(str);
            return this;
        }

        public C5829b setShortLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setShortLinkBytes(byteString);
            return this;
        }

        public C5829b setSubParam(String str) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setSubParam(str);
            return this;
        }

        public C5829b setSubParamBytes(ByteString byteString) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setSubParamBytes(byteString);
            return this;
        }

        public C5829b setUp(Up up) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setUp(up);
            return this;
        }

        private C5829b() {
            super(LargeCoverV4.DEFAULT_INSTANCE);
        }

        public C5829b setBase(Base.C5793b c5793b) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setBase(c5793b.build());
            return this;
        }

        public C5829b setUp(Up.C5914b c5914b) {
            copyOnWrite();
            ((LargeCoverV4) this.instance).setUp(c5914b.build());
            return this;
        }
    }

    static {
        LargeCoverV4 largeCoverV4 = new LargeCoverV4();
        DEFAULT_INSTANCE = largeCoverV4;
        GeneratedMessageLite.registerDefaultInstance(LargeCoverV4.class, largeCoverV4);
    }

    private LargeCoverV4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBase() {
        this.base_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBvid() {
        this.bvid_ = getDefaultInstance().getBvid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPlay() {
        this.canPlay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverBadge() {
        this.coverBadge_ = getDefaultInstance().getCoverBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText1() {
        this.coverLeftText1_ = getDefaultInstance().getCoverLeftText1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText2() {
        this.coverLeftText2_ = getDefaultInstance().getCoverLeftText2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoverLeftText3() {
        this.coverLeftText3_ = getDefaultInstance().getCoverLeftText3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayNumber() {
        this.playNumber_ = getDefaultInstance().getPlayNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareSubtitle() {
        this.shareSubtitle_ = getDefaultInstance().getShareSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShortLink() {
        this.shortLink_ = getDefaultInstance().getShortLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubParam() {
        this.subParam_ = getDefaultInstance().getSubParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUp() {
        this.up_ = null;
    }

    public static LargeCoverV4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBase(Base base2) {
        base2.getClass();
        Base base3 = this.base_;
        if (base3 != null && base3 != Base.getDefaultInstance()) {
            this.base_ = Base.newBuilder(this.base_).mergeFrom((Base) base2).buildPartial();
        } else {
            this.base_ = base2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUp(Up up) {
        up.getClass();
        Up up2 = this.up_;
        if (up2 != null && up2 != Up.getDefaultInstance()) {
            this.up_ = Up.newBuilder(this.up_).mergeFrom((Up) up).buildPartial();
        } else {
            this.up_ = up;
        }
    }

    public static C5829b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LargeCoverV4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LargeCoverV4) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LargeCoverV4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LargeCoverV4> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBase(Base base2) {
        base2.getClass();
        this.base_ = base2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvid(String str) {
        str.getClass();
        this.bvid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBvidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bvid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPlay(int i) {
        this.canPlay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBadge(String str) {
        str.getClass();
        this.coverBadge_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverBadgeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverBadge_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText1(String str) {
        str.getClass();
        this.coverLeftText1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText1Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText1_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText2(String str) {
        str.getClass();
        this.coverLeftText2_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText2Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText2_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText3(String str) {
        str.getClass();
        this.coverLeftText3_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoverLeftText3Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.coverLeftText3_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayNumber(String str) {
        str.getClass();
        this.playNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.playNumber_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitle(String str) {
        str.getClass();
        this.shareSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shareSubtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLink(String str) {
        str.getClass();
        this.shortLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShortLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shortLink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubParam(String str) {
        str.getClass();
        this.subParam_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subParam_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUp(Up up) {
        up.getClass();
        this.up_ = up;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5828a.f15963xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LargeCoverV4();
            case 2:
                return new C5829b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\t\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004\u0007\t\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208", new Object[]{"base_", "coverLeftText1_", "coverLeftText2_", "coverLeftText3_", "coverBadge_", "canPlay_", "up_", "shortLink_", "shareSubtitle_", "playNumber_", "bvid_", "subParam_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LargeCoverV4> parser = PARSER;
                if (parser == null) {
                    synchronized (LargeCoverV4.class) {
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

    public Base getBase() {
        Base base2 = this.base_;
        return base2 == null ? Base.getDefaultInstance() : base2;
    }

    public String getBvid() {
        return this.bvid_;
    }

    public ByteString getBvidBytes() {
        return ByteString.copyFromUtf8(this.bvid_);
    }

    public int getCanPlay() {
        return this.canPlay_;
    }

    public String getCoverBadge() {
        return this.coverBadge_;
    }

    public ByteString getCoverBadgeBytes() {
        return ByteString.copyFromUtf8(this.coverBadge_);
    }

    public String getCoverLeftText1() {
        return this.coverLeftText1_;
    }

    public ByteString getCoverLeftText1Bytes() {
        return ByteString.copyFromUtf8(this.coverLeftText1_);
    }

    public String getCoverLeftText2() {
        return this.coverLeftText2_;
    }

    public ByteString getCoverLeftText2Bytes() {
        return ByteString.copyFromUtf8(this.coverLeftText2_);
    }

    public String getCoverLeftText3() {
        return this.coverLeftText3_;
    }

    public ByteString getCoverLeftText3Bytes() {
        return ByteString.copyFromUtf8(this.coverLeftText3_);
    }

    public String getPlayNumber() {
        return this.playNumber_;
    }

    public ByteString getPlayNumberBytes() {
        return ByteString.copyFromUtf8(this.playNumber_);
    }

    public String getShareSubtitle() {
        return this.shareSubtitle_;
    }

    public ByteString getShareSubtitleBytes() {
        return ByteString.copyFromUtf8(this.shareSubtitle_);
    }

    public String getShortLink() {
        return this.shortLink_;
    }

    public ByteString getShortLinkBytes() {
        return ByteString.copyFromUtf8(this.shortLink_);
    }

    public String getSubParam() {
        return this.subParam_;
    }

    public ByteString getSubParamBytes() {
        return ByteString.copyFromUtf8(this.subParam_);
    }

    public Up getUp() {
        Up up = this.up_;
        return up == null ? Up.getDefaultInstance() : up;
    }

    public boolean hasBase() {
        return this.base_ != null;
    }

    public boolean hasUp() {
        return this.up_ != null;
    }

    public static C5829b newBuilder(LargeCoverV4 largeCoverV4) {
        return DEFAULT_INSTANCE.createBuilder(largeCoverV4);
    }

    public static LargeCoverV4 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LargeCoverV4) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LargeCoverV4 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LargeCoverV4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LargeCoverV4 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LargeCoverV4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LargeCoverV4 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LargeCoverV4 parseFrom(InputStream inputStream) throws IOException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LargeCoverV4 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LargeCoverV4 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LargeCoverV4 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LargeCoverV4) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
