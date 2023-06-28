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
public final class PremiereText extends GeneratedMessageLite<PremiereText, PremiereText.Builder> implements MessageLiteOrBuilder {
    private static final PremiereText DEFAULT_INSTANCE;
    public static final int GUIDANCE_ENTRY_FIELD_NUMBER = 9;
    public static final int GUIDANCE_PULLDOWN_FIELD_NUMBER = 8;
    public static final int INTRO_ICON_FIELD_NUMBER = 7;
    public static final int INTRO_ICON_NIGHT_FIELD_NUMBER = 10;
    public static final int INTRO_TITLE_FIELD_NUMBER = 6;
    public static final int ONLINE_ICON_DARK_FIELD_NUMBER = 5;
    public static final int ONLINE_ICON_FIELD_NUMBER = 4;
    public static final int ONLINE_TEXT_FIELD_NUMBER = 3;
    private static volatile Parser<PremiereText> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String subtitle_ = "";
    private String onlineText_ = "";
    private String onlineIcon_ = "";
    private String onlineIconDark_ = "";
    private String introTitle_ = "";
    private String introIcon_ = "";
    private String guidancePulldown_ = "";
    private String guidanceEntry_ = "";
    private String introIconNight_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.PremiereText$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68291 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16790xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16790xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16790xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16790xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16790xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16790xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16790xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16790xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PremiereText, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68291 c68291) {
            this();
        }

        public Builder clearGuidanceEntry() {
            copyOnWrite();
            ((PremiereText) this.instance).clearGuidanceEntry();
            return this;
        }

        public Builder clearGuidancePulldown() {
            copyOnWrite();
            ((PremiereText) this.instance).clearGuidancePulldown();
            return this;
        }

        public Builder clearIntroIcon() {
            copyOnWrite();
            ((PremiereText) this.instance).clearIntroIcon();
            return this;
        }

        public Builder clearIntroIconNight() {
            copyOnWrite();
            ((PremiereText) this.instance).clearIntroIconNight();
            return this;
        }

        public Builder clearIntroTitle() {
            copyOnWrite();
            ((PremiereText) this.instance).clearIntroTitle();
            return this;
        }

        public Builder clearOnlineIcon() {
            copyOnWrite();
            ((PremiereText) this.instance).clearOnlineIcon();
            return this;
        }

        public Builder clearOnlineIconDark() {
            copyOnWrite();
            ((PremiereText) this.instance).clearOnlineIconDark();
            return this;
        }

        public Builder clearOnlineText() {
            copyOnWrite();
            ((PremiereText) this.instance).clearOnlineText();
            return this;
        }

        public Builder clearSubtitle() {
            copyOnWrite();
            ((PremiereText) this.instance).clearSubtitle();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((PremiereText) this.instance).clearTitle();
            return this;
        }

        public String getGuidanceEntry() {
            return ((PremiereText) this.instance).getGuidanceEntry();
        }

        public ByteString getGuidanceEntryBytes() {
            return ((PremiereText) this.instance).getGuidanceEntryBytes();
        }

        public String getGuidancePulldown() {
            return ((PremiereText) this.instance).getGuidancePulldown();
        }

        public ByteString getGuidancePulldownBytes() {
            return ((PremiereText) this.instance).getGuidancePulldownBytes();
        }

        public String getIntroIcon() {
            return ((PremiereText) this.instance).getIntroIcon();
        }

        public ByteString getIntroIconBytes() {
            return ((PremiereText) this.instance).getIntroIconBytes();
        }

        public String getIntroIconNight() {
            return ((PremiereText) this.instance).getIntroIconNight();
        }

        public ByteString getIntroIconNightBytes() {
            return ((PremiereText) this.instance).getIntroIconNightBytes();
        }

        public String getIntroTitle() {
            return ((PremiereText) this.instance).getIntroTitle();
        }

        public ByteString getIntroTitleBytes() {
            return ((PremiereText) this.instance).getIntroTitleBytes();
        }

        public String getOnlineIcon() {
            return ((PremiereText) this.instance).getOnlineIcon();
        }

        public ByteString getOnlineIconBytes() {
            return ((PremiereText) this.instance).getOnlineIconBytes();
        }

        public String getOnlineIconDark() {
            return ((PremiereText) this.instance).getOnlineIconDark();
        }

        public ByteString getOnlineIconDarkBytes() {
            return ((PremiereText) this.instance).getOnlineIconDarkBytes();
        }

        public String getOnlineText() {
            return ((PremiereText) this.instance).getOnlineText();
        }

        public ByteString getOnlineTextBytes() {
            return ((PremiereText) this.instance).getOnlineTextBytes();
        }

        public String getSubtitle() {
            return ((PremiereText) this.instance).getSubtitle();
        }

        public ByteString getSubtitleBytes() {
            return ((PremiereText) this.instance).getSubtitleBytes();
        }

        public String getTitle() {
            return ((PremiereText) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((PremiereText) this.instance).getTitleBytes();
        }

        public Builder setGuidanceEntry(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setGuidanceEntry(str);
            return this;
        }

        public Builder setGuidanceEntryBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setGuidanceEntryBytes(byteString);
            return this;
        }

        public Builder setGuidancePulldown(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setGuidancePulldown(str);
            return this;
        }

        public Builder setGuidancePulldownBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setGuidancePulldownBytes(byteString);
            return this;
        }

        public Builder setIntroIcon(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setIntroIcon(str);
            return this;
        }

        public Builder setIntroIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setIntroIconBytes(byteString);
            return this;
        }

        public Builder setIntroIconNight(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setIntroIconNight(str);
            return this;
        }

        public Builder setIntroIconNightBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setIntroIconNightBytes(byteString);
            return this;
        }

        public Builder setIntroTitle(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setIntroTitle(str);
            return this;
        }

        public Builder setIntroTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setIntroTitleBytes(byteString);
            return this;
        }

        public Builder setOnlineIcon(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setOnlineIcon(str);
            return this;
        }

        public Builder setOnlineIconBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setOnlineIconBytes(byteString);
            return this;
        }

        public Builder setOnlineIconDark(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setOnlineIconDark(str);
            return this;
        }

        public Builder setOnlineIconDarkBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setOnlineIconDarkBytes(byteString);
            return this;
        }

        public Builder setOnlineText(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setOnlineText(str);
            return this;
        }

        public Builder setOnlineTextBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setOnlineTextBytes(byteString);
            return this;
        }

        public Builder setSubtitle(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setSubtitle(str);
            return this;
        }

        public Builder setSubtitleBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setSubtitleBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((PremiereText) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((PremiereText) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(PremiereText.DEFAULT_INSTANCE);
        }
    }

    static {
        PremiereText premiereText = new PremiereText();
        DEFAULT_INSTANCE = premiereText;
        GeneratedMessageLite.registerDefaultInstance(PremiereText.class, premiereText);
    }

    private PremiereText() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidanceEntry() {
        this.guidanceEntry_ = getDefaultInstance().getGuidanceEntry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidancePulldown() {
        this.guidancePulldown_ = getDefaultInstance().getGuidancePulldown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroIcon() {
        this.introIcon_ = getDefaultInstance().getIntroIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroIconNight() {
        this.introIconNight_ = getDefaultInstance().getIntroIconNight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroTitle() {
        this.introTitle_ = getDefaultInstance().getIntroTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlineIcon() {
        this.onlineIcon_ = getDefaultInstance().getOnlineIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlineIconDark() {
        this.onlineIconDark_ = getDefaultInstance().getOnlineIconDark();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlineText() {
        this.onlineText_ = getDefaultInstance().getOnlineText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static PremiereText getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PremiereText parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PremiereText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereText parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PremiereText> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceEntry(String str) {
        str.getClass();
        this.guidanceEntry_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceEntryBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.guidanceEntry_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidancePulldown(String str) {
        str.getClass();
        this.guidancePulldown_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidancePulldownBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.guidancePulldown_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroIcon(String str) {
        str.getClass();
        this.introIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.introIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroIconNight(String str) {
        str.getClass();
        this.introIconNight_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroIconNightBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.introIconNight_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroTitle(String str) {
        str.getClass();
        this.introTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.introTitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlineIcon(String str) {
        str.getClass();
        this.onlineIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlineIconBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.onlineIcon_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlineIconDark(String str) {
        str.getClass();
        this.onlineIconDark_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlineIconDarkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.onlineIconDark_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlineText(String str) {
        str.getClass();
        this.onlineText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlineTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.onlineText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        str.getClass();
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subtitle_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68291.f16790xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PremiereText();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208", new Object[]{"title_", "subtitle_", "onlineText_", "onlineIcon_", "onlineIconDark_", "introTitle_", "introIcon_", "guidancePulldown_", "guidanceEntry_", "introIconNight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PremiereText> parser = PARSER;
                if (parser == null) {
                    synchronized (PremiereText.class) {
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

    public String getGuidanceEntry() {
        return this.guidanceEntry_;
    }

    public ByteString getGuidanceEntryBytes() {
        return ByteString.copyFromUtf8(this.guidanceEntry_);
    }

    public String getGuidancePulldown() {
        return this.guidancePulldown_;
    }

    public ByteString getGuidancePulldownBytes() {
        return ByteString.copyFromUtf8(this.guidancePulldown_);
    }

    public String getIntroIcon() {
        return this.introIcon_;
    }

    public ByteString getIntroIconBytes() {
        return ByteString.copyFromUtf8(this.introIcon_);
    }

    public String getIntroIconNight() {
        return this.introIconNight_;
    }

    public ByteString getIntroIconNightBytes() {
        return ByteString.copyFromUtf8(this.introIconNight_);
    }

    public String getIntroTitle() {
        return this.introTitle_;
    }

    public ByteString getIntroTitleBytes() {
        return ByteString.copyFromUtf8(this.introTitle_);
    }

    public String getOnlineIcon() {
        return this.onlineIcon_;
    }

    public ByteString getOnlineIconBytes() {
        return ByteString.copyFromUtf8(this.onlineIcon_);
    }

    public String getOnlineIconDark() {
        return this.onlineIconDark_;
    }

    public ByteString getOnlineIconDarkBytes() {
        return ByteString.copyFromUtf8(this.onlineIconDark_);
    }

    public String getOnlineText() {
        return this.onlineText_;
    }

    public ByteString getOnlineTextBytes() {
        return ByteString.copyFromUtf8(this.onlineText_);
    }

    public String getSubtitle() {
        return this.subtitle_;
    }

    public ByteString getSubtitleBytes() {
        return ByteString.copyFromUtf8(this.subtitle_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public static Builder newBuilder(PremiereText premiereText) {
        return DEFAULT_INSTANCE.createBuilder(premiereText);
    }

    public static PremiereText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PremiereText parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PremiereText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PremiereText parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PremiereText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PremiereText parseFrom(InputStream inputStream) throws IOException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiereText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PremiereText parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PremiereText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PremiereText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
