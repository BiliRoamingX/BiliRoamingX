package com.bapis.bilibili.app.view.v1;

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
public final class AdInfo extends GeneratedMessageLite<AdInfo, AdInfo.Builder> implements MessageLiteOrBuilder {
    public static final int AD_CB_FIELD_NUMBER = 4;
    public static final int CARD_TYPE_FIELD_NUMBER = 5;
    public static final int CREATIVE_CONTENT_FIELD_NUMBER = 3;
    public static final int CREATIVE_ID_FIELD_NUMBER = 1;
    public static final int CREATIVE_TYPE_FIELD_NUMBER = 2;
    private static final AdInfo DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 6;
    private static volatile Parser<AdInfo> PARSER;
    private int cardType_;
    private CreativeContent creativeContent_;
    private long creativeId_;
    private long creativeType_;
    private String adCb_ = "";
    private ByteString extra_ = ByteString.EMPTY;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.AdInfo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16682xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16682xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16682xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16682xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16682xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16682xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16682xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16682xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AdInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67061 c67061) {
            this();
        }

        public Builder clearAdCb() {
            copyOnWrite();
            ((AdInfo) this.instance).clearAdCb();
            return this;
        }

        public Builder clearCardType() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCardType();
            return this;
        }

        public Builder clearCreativeContent() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCreativeContent();
            return this;
        }

        public Builder clearCreativeId() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCreativeId();
            return this;
        }

        public Builder clearCreativeType() {
            copyOnWrite();
            ((AdInfo) this.instance).clearCreativeType();
            return this;
        }

        public Builder clearExtra() {
            copyOnWrite();
            ((AdInfo) this.instance).clearExtra();
            return this;
        }

        public String getAdCb() {
            return ((AdInfo) this.instance).getAdCb();
        }

        public ByteString getAdCbBytes() {
            return ((AdInfo) this.instance).getAdCbBytes();
        }

        public int getCardType() {
            return ((AdInfo) this.instance).getCardType();
        }

        public CreativeContent getCreativeContent() {
            return ((AdInfo) this.instance).getCreativeContent();
        }

        public long getCreativeId() {
            return ((AdInfo) this.instance).getCreativeId();
        }

        public long getCreativeType() {
            return ((AdInfo) this.instance).getCreativeType();
        }

        public ByteString getExtra() {
            return ((AdInfo) this.instance).getExtra();
        }

        public boolean hasCreativeContent() {
            return ((AdInfo) this.instance).hasCreativeContent();
        }

        public Builder mergeCreativeContent(CreativeContent creativeContent) {
            copyOnWrite();
            ((AdInfo) this.instance).mergeCreativeContent(creativeContent);
            return this;
        }

        public Builder setAdCb(String str) {
            copyOnWrite();
            ((AdInfo) this.instance).setAdCb(str);
            return this;
        }

        public Builder setAdCbBytes(ByteString byteString) {
            copyOnWrite();
            ((AdInfo) this.instance).setAdCbBytes(byteString);
            return this;
        }

        public Builder setCardType(int i) {
            copyOnWrite();
            ((AdInfo) this.instance).setCardType(i);
            return this;
        }

        public Builder setCreativeContent(CreativeContent creativeContent) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeContent(creativeContent);
            return this;
        }

        public Builder setCreativeId(long j) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeId(j);
            return this;
        }

        public Builder setCreativeType(long j) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeType(j);
            return this;
        }

        public Builder setExtra(ByteString byteString) {
            copyOnWrite();
            ((AdInfo) this.instance).setExtra(byteString);
            return this;
        }

        private Builder() {
            super(AdInfo.DEFAULT_INSTANCE);
        }

        public Builder setCreativeContent(CreativeContent.Builder builder) {
            copyOnWrite();
            ((AdInfo) this.instance).setCreativeContent(builder.build());
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
    public void clearCardType() {
        this.cardType_ = 0;
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
    public void clearCreativeType() {
        this.creativeType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    public static AdInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreativeContent(CreativeContent creativeContent) {
    }

    public static Builder newBuilder() {
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
    public void setCardType(int i) {
        this.cardType_ = i;
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
    public void setCreativeType(long j) {
        this.creativeType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(ByteString byteString) {
        byteString.getClass();
        this.extra_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67061.f16682xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new AdInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\t\u0004\u0208\u0005\u0004\u0006\n", new Object[]{"creativeId_", "creativeType_", "creativeContent_", "adCb_", "cardType_", "extra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AdInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (AdInfo.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

    public int getCardType() {
        return this.cardType_;
    }

    public CreativeContent getCreativeContent() {
        CreativeContent creativeContent = this.creativeContent_;
        return creativeContent == null ? CreativeContent.getDefaultInstance() : creativeContent;
    }

    public long getCreativeId() {
        return this.creativeId_;
    }

    public long getCreativeType() {
        return this.creativeType_;
    }

    public ByteString getExtra() {
        return this.extra_;
    }

    public boolean hasCreativeContent() {
        return this.creativeContent_ != null;
    }

    public static Builder newBuilder(AdInfo adInfo) {
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
