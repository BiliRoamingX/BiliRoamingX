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
public final class SeasonHead extends GeneratedMessageLite<SeasonHead, SeasonHead.Builder> implements MessageLiteOrBuilder {
    public static final int DANMAKU_FIELD_NUMBER = 4;
    private static final SeasonHead DEFAULT_INSTANCE;
    public static final int INTRO_FIELD_NUMBER = 2;
    private static volatile Parser<SeasonHead> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VT_FIELD_NUMBER = 3;
    private StatInfo danmaku_;
    private StatInfo vt_;
    private String title_ = "";
    private String intro_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.SeasonHead$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70541 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17033xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17033xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17033xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<SeasonHead, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70541 c70541) {
            this();
        }

        public Builder clearDanmaku() {
            copyOnWrite();
            ((SeasonHead) this.instance).clearDanmaku();
            return this;
        }

        public Builder clearIntro() {
            copyOnWrite();
            ((SeasonHead) this.instance).clearIntro();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((SeasonHead) this.instance).clearTitle();
            return this;
        }

        public Builder clearVt() {
            copyOnWrite();
            ((SeasonHead) this.instance).clearVt();
            return this;
        }

        public StatInfo getDanmaku() {
            return ((SeasonHead) this.instance).getDanmaku();
        }

        public String getIntro() {
            return ((SeasonHead) this.instance).getIntro();
        }

        public ByteString getIntroBytes() {
            return ((SeasonHead) this.instance).getIntroBytes();
        }

        public String getTitle() {
            return ((SeasonHead) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((SeasonHead) this.instance).getTitleBytes();
        }

        public StatInfo getVt() {
            return ((SeasonHead) this.instance).getVt();
        }

        public boolean hasDanmaku() {
            return ((SeasonHead) this.instance).hasDanmaku();
        }

        public boolean hasVt() {
            return ((SeasonHead) this.instance).hasVt();
        }

        public Builder mergeDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((SeasonHead) this.instance).mergeDanmaku(statInfo);
            return this;
        }

        public Builder mergeVt(StatInfo statInfo) {
            copyOnWrite();
            ((SeasonHead) this.instance).mergeVt(statInfo);
            return this;
        }

        public Builder setDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((SeasonHead) this.instance).setDanmaku(statInfo);
            return this;
        }

        public Builder setIntro(String str) {
            copyOnWrite();
            ((SeasonHead) this.instance).setIntro(str);
            return this;
        }

        public Builder setIntroBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonHead) this.instance).setIntroBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((SeasonHead) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((SeasonHead) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setVt(StatInfo statInfo) {
            copyOnWrite();
            ((SeasonHead) this.instance).setVt(statInfo);
            return this;
        }

        private Builder() {
            super(SeasonHead.DEFAULT_INSTANCE);
        }

        public Builder setDanmaku(StatInfo.Builder builder) {
            copyOnWrite();
            ((SeasonHead) this.instance).setDanmaku(builder.build());
            return this;
        }

        public Builder setVt(StatInfo.Builder builder) {
            copyOnWrite();
            ((SeasonHead) this.instance).setVt(builder.build());
            return this;
        }
    }

    static {
        SeasonHead seasonHead = new SeasonHead();
        DEFAULT_INSTANCE = seasonHead;
        GeneratedMessageLite.registerDefaultInstance(SeasonHead.class, seasonHead);
    }

    private SeasonHead() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmaku() {
        this.danmaku_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntro() {
        this.intro_ = getDefaultInstance().getIntro();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVt() {
        this.vt_ = null;
    }

    public static SeasonHead getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDanmaku(StatInfo statInfo) {
        statInfo.getClass();
        StatInfo statInfo2 = this.danmaku_;
        if (statInfo2 != null && statInfo2 != StatInfo.getDefaultInstance()) {
            this.danmaku_ = StatInfo.newBuilder(this.danmaku_).mergeFrom((StatInfo) statInfo).buildPartial();
        } else {
            this.danmaku_ = statInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVt(StatInfo statInfo) {
        statInfo.getClass();
        StatInfo statInfo2 = this.vt_;
        if (statInfo2 != null && statInfo2 != StatInfo.getDefaultInstance()) {
            this.vt_ = StatInfo.newBuilder(this.vt_).mergeFrom((StatInfo) statInfo).buildPartial();
        } else {
            this.vt_ = statInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SeasonHead parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SeasonHead) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonHead parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SeasonHead> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmaku(StatInfo statInfo) {
        statInfo.getClass();
        this.danmaku_ = statInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntro(String str) {
        str.getClass();
        this.intro_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.intro_ = byteString.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setVt(StatInfo statInfo) {
        statInfo.getClass();
        this.vt_ = statInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70541.f17033xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new SeasonHead();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\t\u0004\t", new Object[]{"title_", "intro_", "vt_", "danmaku_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SeasonHead> parser = PARSER;
                if (parser == null) {
                    synchronized (SeasonHead.class) {
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

    public StatInfo getDanmaku() {
        StatInfo statInfo = this.danmaku_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public String getIntro() {
        return this.intro_;
    }

    public ByteString getIntroBytes() {
        return ByteString.copyFromUtf8(this.intro_);
    }

    public String getTitle() {
        return this.title_;
    }

    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    public StatInfo getVt() {
        StatInfo statInfo = this.vt_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
    }

    public boolean hasDanmaku() {
        return this.danmaku_ != null;
    }

    public boolean hasVt() {
        return this.vt_ != null;
    }

    public static Builder newBuilder(SeasonHead seasonHead) {
        return DEFAULT_INSTANCE.createBuilder(seasonHead);
    }

    public static SeasonHead parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonHead) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonHead parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SeasonHead parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SeasonHead parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SeasonHead parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SeasonHead parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SeasonHead parseFrom(InputStream inputStream) throws IOException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SeasonHead parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SeasonHead parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SeasonHead parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SeasonHead) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
