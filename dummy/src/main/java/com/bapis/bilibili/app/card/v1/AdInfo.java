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
public final class AdInfo extends GeneratedMessageLite<AdInfo, AdInfo.C5787b> implements MessageLiteOrBuilder {
    public static final int AD_CB_FIELD_NUMBER = 5;
    public static final int CARD_INDEX_FIELD_NUMBER = 13;
    public static final int CARD_TYPE_FIELD_NUMBER = 3;
    public static final int CLIENT_IP_FIELD_NUMBER = 14;
    public static final int CM_MARK_FIELD_NUMBER = 10;
    public static final int CREATIVE_CONTENT_FIELD_NUMBER = 4;
    public static final int CREATIVE_ID_FIELD_NUMBER = 1;
    public static final int CREATIVE_STYLE_FIELD_NUMBER = 16;
    public static final int CREATIVE_TYPE_FIELD_NUMBER = 2;
    private static final AdInfo DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 15;
    public static final int INDEX_FIELD_NUMBER = 11;
    public static final int IS_AD_FIELD_NUMBER = 9;
    public static final int IS_AD_LOC_FIELD_NUMBER = 12;
    private static volatile Parser<AdInfo> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 8;
    public static final int RESOURCE_FIELD_NUMBER = 6;
    public static final int SOURCE_FIELD_NUMBER = 7;
    private int cardIndex_;
    private int cardType_;
    private long cmMark_;
    private CreativeContent creativeContent_;
    private long creativeId_;
    private int creativeStyle_;
    private int creativeType_;
    private int index_;
    private boolean isAdLoc_;
    private boolean isAd_;
    private long resource_;
    private int source_;
    private String adCb_ = "";
    private String requestId_ = "";
    private String clientIp_ = "";
    private ByteString extra_ = ByteString.EMPTY;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.AdInfo$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5786a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15942xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15942xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15942xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15942xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15942xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15942xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15942xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15942xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.AdInfo$b */
    /* loaded from: classes13.dex */
    public static final class C5787b extends GeneratedMessageLite.Builder<AdInfo, C5787b> implements MessageLiteOrBuilder {
        /* synthetic */ C5787b(C5786a c5786a) {
            this();
        }

        public C5787b clearAdCb() {
            copyOnWrite();
            ((AdInfo) this.instance).clearAdCb();
            return this;
        }

        public C5787b clearCardIndex() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCardIndex();
            return this;
        }

        public C5787b clearCardType() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCardType();
            return this;
        }

        public C5787b clearClientIp() {
            copyOnWrite();
            ((AdInfo) this.instance).clearClientIp();
            return this;
        }

        public C5787b clearCmMark() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCmMark();
            return this;
        }

        public C5787b clearCreativeContent() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCreativeContent();
            return this;
        }

        public C5787b clearCreativeId() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCreativeId();
            return this;
        }

        public C5787b clearCreativeStyle() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCreativeStyle();
            return this;
        }

        public C5787b clearCreativeType() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCreativeType();
            return this;
        }

        public C5787b clearExtra() {
            copyOnWrite();
            ((AdInfo) this.instance).clearExtra();
            return this;
        }

        public C5787b clearIndex() {
            copyOnWrite();
            ((AdInfo) this.instance).clearIndex();
            return this;
        }

        public C5787b clearIsAd() {
            copyOnWrite();
            ((AdInfo) this.instance).clearIsAd();
            return this;
        }

        public C5787b clearIsAdLoc() {
            copyOnWrite();
            ((AdInfo) this.instance).clearIsAdLoc();
            return this;
        }

        public C5787b clearRequestId() {
            copyOnWrite();
            ((AdInfo) this.instance).clearRequestId();
            return this;
        }

        public C5787b clearResource() {
            copyOnWrite();
            ((AdInfo) this.instance).clearResource();
            return this;
        }

        public C5787b clearSource() {
            copyOnWrite();
            ((AdInfo) this.instance).clearSource();
            return this;
        }

        public String getAdCb() {
            return ((AdInfo) this.instance).getAdCb();
        }

        public ByteString getAdCbBytes() {
            return ((AdInfo) this.instance).getAdCbBytes();
        }

        public int getCardIndex() {
            return ((AdInfo) this.instance).getCardIndex();
        }

        public int getCardType() {
            return ((AdInfo) this.instance).getCardType();
        }

        public String getClientIp() {
            return ((AdInfo) this.instance).getClientIp();
        }

        public ByteString getClientIpBytes() {
            return ((AdInfo) this.instance).getClientIpBytes();
        }

        public long getCmMark() {
            return ((AdInfo) this.instance).getCmMark();
        }

        public CreativeContent getCreativeContent() {
            return ((AdInfo) this.instance).getCreativeContent();
        }

        public long getCreativeId() {
            return ((AdInfo) this.instance).getCreativeId();
        }

        public int getCreativeStyle() {
            return ((AdInfo) this.instance).getCreativeStyle();
        }

        public int getCreativeType() {
            return ((AdInfo) this.instance).getCreativeType();
        }

        public ByteString getExtra() {
            return ((AdInfo) this.instance).getExtra();
        }

        public int getIndex() {
            return ((AdInfo) this.instance).getIndex();
        }

        public boolean getIsAd() {
            return ((AdInfo) this.instance).getIsAd();
        }

        public boolean getIsAdLoc() {
            return ((AdInfo) this.instance).getIsAdLoc();
        }

        public String getRequestId() {
            return ((AdInfo) this.instance).getRequestId();
        }

        public ByteString getRequestIdBytes() {
            return ((AdInfo) this.instance).getRequestIdBytes();
        }

        public long getResource() {
            return ((AdInfo) this.instance).getResource();
        }

        public int getSource() {
            return ((AdInfo) this.instance).getSource();
        }

        public boolean hasCreativeContent() {
            return ((AdInfo) this.instance).hasCreativeContent();
        }

        public C5787b mergeCreativeContent(CreativeContent creativeContent) {
            copyOnWrite();
            ((AdInfo) this.instance).mergeCreativeContent(creativeContent);
            return this;
        }

        public C5787b setAdCb(String str) {
            copyOnWrite();
            ((AdInfo) this.instance).setAdCb(str);
            return this;
        }

        public C5787b setAdCbBytes(ByteString byteString) {
            copyOnWrite();
            ((AdInfo) this.instance).setAdCbBytes(byteString);
            return this;
        }

        public C5787b setCardIndex(int i) {
            copyOnWrite();
            ((AdInfo) this.instance).setCardIndex(i);
            return this;
        }

        public C5787b setCardType(int i) {
            copyOnWrite();
            ((AdInfo) this.instance).setCardType(i);
            return this;
        }

        public C5787b setClientIp(String str) {
            copyOnWrite();
            ((AdInfo) this.instance).setClientIp(str);
            return this;
        }

        public C5787b setClientIpBytes(ByteString byteString) {
            copyOnWrite();
            ((AdInfo) this.instance).setClientIpBytes(byteString);
            return this;
        }

        public C5787b setCmMark(long j) {
            copyOnWrite();
            ((AdInfo) this.instance).setCmMark(j);
            return this;
        }

        public C5787b setCreativeContent(CreativeContent creativeContent) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeContent(creativeContent);
            return this;
        }

        public C5787b setCreativeId(long j) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeId(j);
            return this;
        }

        public C5787b setCreativeStyle(int i) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeStyle(i);
            return this;
        }

        public C5787b setCreativeType(int i) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeType(i);
            return this;
        }

        public C5787b setExtra(ByteString byteString) {
            copyOnWrite();
            ((AdInfo) this.instance).setExtra(byteString);
            return this;
        }

        public C5787b setIndex(int i) {
            copyOnWrite();
            ((AdInfo) this.instance).setIndex(i);
            return this;
        }

        public C5787b setIsAd(boolean z) {
            copyOnWrite();
            ((AdInfo) this.instance).setIsAd(z);
            return this;
        }

        public C5787b setIsAdLoc(boolean z) {
            copyOnWrite();
            ((AdInfo) this.instance).setIsAdLoc(z);
            return this;
        }

        public C5787b setRequestId(String str) {
            copyOnWrite();
            ((AdInfo) this.instance).setRequestId(str);
            return this;
        }

        public C5787b setRequestIdBytes(ByteString byteString) {
            copyOnWrite();
            ((AdInfo) this.instance).setRequestIdBytes(byteString);
            return this;
        }

        public C5787b setResource(long j) {
            copyOnWrite();
            ((AdInfo) this.instance).setResource(j);
            return this;
        }

        public C5787b setSource(int i) {
            copyOnWrite();
            ((AdInfo) this.instance).setSource(i);
            return this;
        }

        private C5787b() {
            super(AdInfo.DEFAULT_INSTANCE);
        }

        public C5787b setCreativeContent(CreativeContent.C5801b c5801b) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeContent(c5801b.build());
            return this;
        }
    }

    static {
        AdInfo adInfo = new AdInfo();
        DEFAULT_INSTANCE = adInfo;
        GeneratedMessageLite.registerDefaultInstance(AdInfo.class, adInfo);
    }

    private AdInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdCb() {
        this.adCb_ = getDefaultInstance().getAdCb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardIndex() {
        this.cardIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardType() {
        this.cardType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientIp() {
        this.clientIp_ = getDefaultInstance().getClientIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmMark() {
        this.cmMark_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeContent() {
        this.creativeContent_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.creativeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeStyle() {
        this.creativeStyle_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeType() {
        this.creativeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAd() {
        this.isAd_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAdLoc() {
        this.isAdLoc_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static AdInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreativeContent(CreativeContent creativeContent) {
        creativeContent.getClass();
        CreativeContent creativeContent2 = this.creativeContent_;
        if (creativeContent2 != null && creativeContent2 != CreativeContent.getDefaultInstance()) {
            this.creativeContent_ = CreativeContent.newBuilder(this.creativeContent_).mergeFrom((CreativeContent) creativeContent).buildPartial();
        } else {
            this.creativeContent_ = creativeContent;
        }
    }

    public static C5787b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AdInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AdInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdCb(String str) {
        str.getClass();
        this.adCb_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdCbBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adCb_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardIndex(int i) {
        this.cardIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardType(int i) {
        this.cardType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientIp(String str) {
        str.getClass();
        this.clientIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientIpBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientIp_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmMark(long j) {
        this.cmMark_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeContent(CreativeContent creativeContent) {
        creativeContent.getClass();
        this.creativeContent_ = creativeContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(long j) {
        this.creativeId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeStyle(int i) {
        this.creativeStyle_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeType(int i) {
        this.creativeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(ByteString byteString) {
        byteString.getClass();
        this.extra_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAd(boolean z) {
        this.isAd_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAdLoc(boolean z) {
        this.isAdLoc_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(long j) {
        this.resource_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(int i) {
        this.source_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5786a.f15942xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AdInfo();
            case 2:
                return new C5787b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\t\u0005\u0208\u0006\u0002\u0007\u0004\b\u0208\t\u0007\n\u0002\u000b\u0004\f\u0007\r\u0004\u000e\u0208\u000f\n\u0010\u0004", new Object[]{"creativeId_", "creativeType_", "cardType_", "creativeContent_", "adCb_", "resource_", "source_", "requestId_", "isAd_", "cmMark_", "index_", "isAdLoc_", "cardIndex_", "clientIp_", "extra_", "creativeStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AdInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (AdInfo.class) {
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

    public String getAdCb() {
        return this.adCb_;
    }

    public ByteString getAdCbBytes() {
        return ByteString.copyFromUtf8(this.adCb_);
    }

    public int getCardIndex() {
        return this.cardIndex_;
    }

    public int getCardType() {
        return this.cardType_;
    }

    public String getClientIp() {
        return this.clientIp_;
    }

    public ByteString getClientIpBytes() {
        return ByteString.copyFromUtf8(this.clientIp_);
    }

    public long getCmMark() {
        return this.cmMark_;
    }

    public CreativeContent getCreativeContent() {
        CreativeContent creativeContent = this.creativeContent_;
        return creativeContent == null ? CreativeContent.getDefaultInstance() : creativeContent;
    }

    public long getCreativeId() {
        return this.creativeId_;
    }

    public int getCreativeStyle() {
        return this.creativeStyle_;
    }

    public int getCreativeType() {
        return this.creativeType_;
    }

    public ByteString getExtra() {
        return this.extra_;
    }

    public int getIndex() {
        return this.index_;
    }

    public boolean getIsAd() {
        return this.isAd_;
    }

    public boolean getIsAdLoc() {
        return this.isAdLoc_;
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public long getResource() {
        return this.resource_;
    }

    public int getSource() {
        return this.source_;
    }

    public boolean hasCreativeContent() {
        return this.creativeContent_ != null;
    }

    public static C5787b newBuilder(AdInfo adInfo) {
        return DEFAULT_INSTANCE.createBuilder(adInfo);
    }

    public static AdInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AdInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AdInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AdInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AdInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AdInfo parseFrom(InputStream inputStream) throws IOException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AdInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
