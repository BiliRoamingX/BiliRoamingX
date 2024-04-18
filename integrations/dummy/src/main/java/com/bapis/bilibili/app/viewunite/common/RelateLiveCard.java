package com.bapis.bilibili.app.viewunite.common;

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
/* loaded from: classes17.dex */
public final class RelateLiveCard extends GeneratedMessageLite<RelateLiveCard, RelateLiveCard.Builder> implements MessageLiteOrBuilder {
    public static final int AREA_NAME_FIELD_NUMBER = 2;
    private static final RelateLiveCard DEFAULT_INSTANCE;
    public static final int ICON_TYPE_FIELD_NUMBER = 1;
    public static final int LIVE_STATUS_FIELD_NUMBER = 4;
    private static volatile Parser<RelateLiveCard> PARSER = null;
    public static final int WATCHED_SHOW_FIELD_NUMBER = 3;
    private String areaName_ = "";
    private long iconType_;
    private long liveStatus_;
    private long watchedShow_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateLiveCard$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70461 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17026xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17026xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17026xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17026xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17026xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17026xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17026xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17026xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateLiveCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70461 c70461) {
            this();
        }

        public Builder clearAreaName() {
            copyOnWrite();
            ((RelateLiveCard) this.instance).clearAreaName();
            return this;
        }

        public Builder clearIconType() {
            copyOnWrite();
            ((RelateLiveCard) this.instance).clearIconType();
            return this;
        }

        public Builder clearLiveStatus() {
            copyOnWrite();
            ((RelateLiveCard) this.instance).clearLiveStatus();
            return this;
        }

        public Builder clearWatchedShow() {
            copyOnWrite();
            ((RelateLiveCard) this.instance).clearWatchedShow();
            return this;
        }

        public String getAreaName() {
            return ((RelateLiveCard) this.instance).getAreaName();
        }

        public ByteString getAreaNameBytes() {
            return ((RelateLiveCard) this.instance).getAreaNameBytes();
        }

        public long getIconType() {
            return ((RelateLiveCard) this.instance).getIconType();
        }

        public long getLiveStatus() {
            return ((RelateLiveCard) this.instance).getLiveStatus();
        }

        public long getWatchedShow() {
            return ((RelateLiveCard) this.instance).getWatchedShow();
        }

        public Builder setAreaName(String str) {
            copyOnWrite();
            ((RelateLiveCard) this.instance).setAreaName(str);
            return this;
        }

        public Builder setAreaNameBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateLiveCard) this.instance).setAreaNameBytes(byteString);
            return this;
        }

        public Builder setIconType(long j) {
            copyOnWrite();
            ((RelateLiveCard) this.instance).setIconType(j);
            return this;
        }

        public Builder setLiveStatus(long j) {
            copyOnWrite();
            ((RelateLiveCard) this.instance).setLiveStatus(j);
            return this;
        }

        public Builder setWatchedShow(long j) {
            copyOnWrite();
            ((RelateLiveCard) this.instance).setWatchedShow(j);
            return this;
        }

        private Builder() {
            super(RelateLiveCard.DEFAULT_INSTANCE);
        }
    }

    static {
        RelateLiveCard relateLiveCard = new RelateLiveCard();
        DEFAULT_INSTANCE = relateLiveCard;
        GeneratedMessageLite.registerDefaultInstance(RelateLiveCard.class, relateLiveCard);
    }

    private RelateLiveCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreaName() {
        this.areaName_ = getDefaultInstance().getAreaName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconType() {
        this.iconType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiveStatus() {
        this.liveStatus_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchedShow() {
        this.watchedShow_ = 0L;
    }

    public static RelateLiveCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateLiveCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateLiveCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateLiveCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateLiveCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaName(String str) {
        str.getClass();
        this.areaName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.areaName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconType(long j) {
        this.iconType_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiveStatus(long j) {
        this.liveStatus_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchedShow(long j) {
        this.watchedShow_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70461.f17026xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateLiveCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u0002", new Object[]{"iconType_", "areaName_", "watchedShow_", "liveStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateLiveCard> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateLiveCard.class) {
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

    public String getAreaName() {
        return this.areaName_;
    }

    public ByteString getAreaNameBytes() {
        return ByteString.copyFromUtf8(this.areaName_);
    }

    public long getIconType() {
        return this.iconType_;
    }

    public long getLiveStatus() {
        return this.liveStatus_;
    }

    public long getWatchedShow() {
        return this.watchedShow_;
    }

    public static Builder newBuilder(RelateLiveCard relateLiveCard) {
        return DEFAULT_INSTANCE.createBuilder(relateLiveCard);
    }

    public static RelateLiveCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateLiveCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateLiveCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateLiveCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateLiveCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateLiveCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateLiveCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateLiveCard parseFrom(InputStream inputStream) throws IOException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateLiveCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateLiveCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateLiveCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateLiveCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
