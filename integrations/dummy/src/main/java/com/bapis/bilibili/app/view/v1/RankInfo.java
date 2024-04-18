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
public final class RankInfo extends GeneratedMessageLite<RankInfo, RankInfo.Builder> implements MessageLiteOrBuilder {
    public static final int BKG_DAY_COLOR_FIELD_NUMBER = 4;
    public static final int BKG_NIGHT_COLOR_FIELD_NUMBER = 3;
    private static final RankInfo DEFAULT_INSTANCE;
    public static final int FONT_DAY_COLOR_FIELD_NUMBER = 6;
    public static final int FONT_NIGHT_COLOR_FIELD_NUMBER = 5;
    public static final int ICON_URL_DAY_FIELD_NUMBER = 2;
    public static final int ICON_URL_NIGHT_FIELD_NUMBER = 1;
    private static volatile Parser<RankInfo> PARSER = null;
    public static final int RANK_CONTENT_FIELD_NUMBER = 7;
    public static final int RANK_LINK_FIELD_NUMBER = 8;
    private String iconUrlNight_ = "";
    private String iconUrlDay_ = "";
    private String bkgNightColor_ = "";
    private String bkgDayColor_ = "";
    private String fontNightColor_ = "";
    private String fontDayColor_ = "";
    private String rankContent_ = "";
    private String rankLink_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RankInfo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16794xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16794xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16794xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16794xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16794xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16794xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16794xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16794xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RankInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68331 c68331) {
            this();
        }

        public Builder clearBkgDayColor() {
            copyOnWrite();
            ((RankInfo) this.instance).clearBkgDayColor();
            return this;
        }

        public Builder clearBkgNightColor() {
            copyOnWrite();
            ((RankInfo) this.instance).clearBkgNightColor();
            return this;
        }

        public Builder clearFontDayColor() {
            copyOnWrite();
            ((RankInfo) this.instance).clearFontDayColor();
            return this;
        }

        public Builder clearFontNightColor() {
            copyOnWrite();
            ((RankInfo) this.instance).clearFontNightColor();
            return this;
        }

        public Builder clearIconUrlDay() {
            copyOnWrite();
            ((RankInfo) this.instance).clearIconUrlDay();
            return this;
        }

        public Builder clearIconUrlNight() {
            copyOnWrite();
            ((RankInfo) this.instance).clearIconUrlNight();
            return this;
        }

        public Builder clearRankContent() {
            copyOnWrite();
            ((RankInfo) this.instance).clearRankContent();
            return this;
        }

        public Builder clearRankLink() {
            copyOnWrite();
            ((RankInfo) this.instance).clearRankLink();
            return this;
        }

        public String getBkgDayColor() {
            return ((RankInfo) this.instance).getBkgDayColor();
        }

        public ByteString getBkgDayColorBytes() {
            return ((RankInfo) this.instance).getBkgDayColorBytes();
        }

        public String getBkgNightColor() {
            return ((RankInfo) this.instance).getBkgNightColor();
        }

        public ByteString getBkgNightColorBytes() {
            return ((RankInfo) this.instance).getBkgNightColorBytes();
        }

        public String getFontDayColor() {
            return ((RankInfo) this.instance).getFontDayColor();
        }

        public ByteString getFontDayColorBytes() {
            return ((RankInfo) this.instance).getFontDayColorBytes();
        }

        public String getFontNightColor() {
            return ((RankInfo) this.instance).getFontNightColor();
        }

        public ByteString getFontNightColorBytes() {
            return ((RankInfo) this.instance).getFontNightColorBytes();
        }

        public String getIconUrlDay() {
            return ((RankInfo) this.instance).getIconUrlDay();
        }

        public ByteString getIconUrlDayBytes() {
            return ((RankInfo) this.instance).getIconUrlDayBytes();
        }

        public String getIconUrlNight() {
            return ((RankInfo) this.instance).getIconUrlNight();
        }

        public ByteString getIconUrlNightBytes() {
            return ((RankInfo) this.instance).getIconUrlNightBytes();
        }

        public String getRankContent() {
            return ((RankInfo) this.instance).getRankContent();
        }

        public ByteString getRankContentBytes() {
            return ((RankInfo) this.instance).getRankContentBytes();
        }

        public String getRankLink() {
            return ((RankInfo) this.instance).getRankLink();
        }

        public ByteString getRankLinkBytes() {
            return ((RankInfo) this.instance).getRankLinkBytes();
        }

        public Builder setBkgDayColor(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setBkgDayColor(str);
            return this;
        }

        public Builder setBkgDayColorBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setBkgDayColorBytes(byteString);
            return this;
        }

        public Builder setBkgNightColor(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setBkgNightColor(str);
            return this;
        }

        public Builder setBkgNightColorBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setBkgNightColorBytes(byteString);
            return this;
        }

        public Builder setFontDayColor(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setFontDayColor(str);
            return this;
        }

        public Builder setFontDayColorBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setFontDayColorBytes(byteString);
            return this;
        }

        public Builder setFontNightColor(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setFontNightColor(str);
            return this;
        }

        public Builder setFontNightColorBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setFontNightColorBytes(byteString);
            return this;
        }

        public Builder setIconUrlDay(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setIconUrlDay(str);
            return this;
        }

        public Builder setIconUrlDayBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setIconUrlDayBytes(byteString);
            return this;
        }

        public Builder setIconUrlNight(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setIconUrlNight(str);
            return this;
        }

        public Builder setIconUrlNightBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setIconUrlNightBytes(byteString);
            return this;
        }

        public Builder setRankContent(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setRankContent(str);
            return this;
        }

        public Builder setRankContentBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setRankContentBytes(byteString);
            return this;
        }

        public Builder setRankLink(String str) {
            copyOnWrite();
            ((RankInfo) this.instance).setRankLink(str);
            return this;
        }

        public Builder setRankLinkBytes(ByteString byteString) {
            copyOnWrite();
            ((RankInfo) this.instance).setRankLinkBytes(byteString);
            return this;
        }

        private Builder() {
            super(RankInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        RankInfo rankInfo = new RankInfo();
        DEFAULT_INSTANCE = rankInfo;
        GeneratedMessageLite.registerDefaultInstance(RankInfo.class, rankInfo);
    }

    private RankInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBkgDayColor() {
        this.bkgDayColor_ = getDefaultInstance().getBkgDayColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBkgNightColor() {
        this.bkgNightColor_ = getDefaultInstance().getBkgNightColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFontDayColor() {
        this.fontDayColor_ = getDefaultInstance().getFontDayColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFontNightColor() {
        this.fontNightColor_ = getDefaultInstance().getFontNightColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconUrlDay() {
        this.iconUrlDay_ = getDefaultInstance().getIconUrlDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIconUrlNight() {
        this.iconUrlNight_ = getDefaultInstance().getIconUrlNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRankContent() {
        this.rankContent_ = getDefaultInstance().getRankContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRankLink() {
        this.rankLink_ = getDefaultInstance().getRankLink();
    }

    public static RankInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RankInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RankInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RankInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RankInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBkgDayColor(String str) {
        str.getClass();
        this.bkgDayColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBkgDayColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bkgDayColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBkgNightColor(String str) {
        str.getClass();
        this.bkgNightColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBkgNightColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bkgNightColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontDayColor(String str) {
        str.getClass();
        this.fontDayColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontDayColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fontDayColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontNightColor(String str) {
        str.getClass();
        this.fontNightColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFontNightColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fontNightColor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlDay(String str) {
        str.getClass();
        this.iconUrlDay_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlDayBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconUrlDay_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlNight(String str) {
        str.getClass();
        this.iconUrlNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconUrlNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconUrlNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankContent(String str) {
        str.getClass();
        this.rankContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rankContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankLink(String str) {
        str.getClass();
        this.rankLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankLinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rankLink_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68331.f16794xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RankInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208", new Object[]{"iconUrlNight_", "iconUrlDay_", "bkgNightColor_", "bkgDayColor_", "fontNightColor_", "fontDayColor_", "rankContent_", "rankLink_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RankInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (RankInfo.class) {
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

    public String getBkgDayColor() {
        return this.bkgDayColor_;
    }

    public ByteString getBkgDayColorBytes() {
        return ByteString.copyFromUtf8(this.bkgDayColor_);
    }

    public String getBkgNightColor() {
        return this.bkgNightColor_;
    }

    public ByteString getBkgNightColorBytes() {
        return ByteString.copyFromUtf8(this.bkgNightColor_);
    }

    public String getFontDayColor() {
        return this.fontDayColor_;
    }

    public ByteString getFontDayColorBytes() {
        return ByteString.copyFromUtf8(this.fontDayColor_);
    }

    public String getFontNightColor() {
        return this.fontNightColor_;
    }

    public ByteString getFontNightColorBytes() {
        return ByteString.copyFromUtf8(this.fontNightColor_);
    }

    public String getIconUrlDay() {
        return this.iconUrlDay_;
    }

    public ByteString getIconUrlDayBytes() {
        return ByteString.copyFromUtf8(this.iconUrlDay_);
    }

    public String getIconUrlNight() {
        return this.iconUrlNight_;
    }

    public ByteString getIconUrlNightBytes() {
        return ByteString.copyFromUtf8(this.iconUrlNight_);
    }

    public String getRankContent() {
        return this.rankContent_;
    }

    public ByteString getRankContentBytes() {
        return ByteString.copyFromUtf8(this.rankContent_);
    }

    public String getRankLink() {
        return this.rankLink_;
    }

    public ByteString getRankLinkBytes() {
        return ByteString.copyFromUtf8(this.rankLink_);
    }

    public static Builder newBuilder(RankInfo rankInfo) {
        return DEFAULT_INSTANCE.createBuilder(rankInfo);
    }

    public static RankInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RankInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RankInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RankInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RankInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RankInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RankInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RankInfo parseFrom(InputStream inputStream) throws IOException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RankInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RankInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RankInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RankInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
