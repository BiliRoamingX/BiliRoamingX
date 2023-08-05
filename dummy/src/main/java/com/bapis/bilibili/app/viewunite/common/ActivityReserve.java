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
public final class ActivityReserve extends GeneratedMessageLite<ActivityReserve, ActivityReserve.Builder> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 4;
    public static final int DANMAKU_FIELD_NUMBER = 3;
    private static final ActivityReserve DEFAULT_INSTANCE;
    private static volatile Parser<ActivityReserve> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VT_FIELD_NUMBER = 2;
    private ReserveButton button_;
    private StatInfo danmaku_;
    private String title_ = "";
    private StatInfo vt_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.ActivityReserve$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69691 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16957xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16957xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16957xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16957xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16957xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16957xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ActivityReserve, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69691 c69691) {
            this();
        }

        public Builder clearButton() {
            copyOnWrite();
            ((ActivityReserve) this.instance).clearButton();
            return this;
        }

        public Builder clearDanmaku() {
            copyOnWrite();
            ((ActivityReserve) this.instance).clearDanmaku();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ActivityReserve) this.instance).clearTitle();
            return this;
        }

        public Builder clearVt() {
            copyOnWrite();
            ((ActivityReserve) this.instance).clearVt();
            return this;
        }

        public ReserveButton getButton() {
            return ((ActivityReserve) this.instance).getButton();
        }

        public StatInfo getDanmaku() {
            return ((ActivityReserve) this.instance).getDanmaku();
        }

        public String getTitle() {
            return ((ActivityReserve) this.instance).getTitle();
        }

        public ByteString getTitleBytes() {
            return ((ActivityReserve) this.instance).getTitleBytes();
        }

        public StatInfo getVt() {
            return ((ActivityReserve) this.instance).getVt();
        }

        public boolean hasButton() {
            return ((ActivityReserve) this.instance).hasButton();
        }

        public boolean hasDanmaku() {
            return ((ActivityReserve) this.instance).hasDanmaku();
        }

        public boolean hasVt() {
            return ((ActivityReserve) this.instance).hasVt();
        }

        public Builder mergeButton(ReserveButton reserveButton) {
            copyOnWrite();
            ((ActivityReserve) this.instance).mergeButton(reserveButton);
            return this;
        }

        public Builder mergeDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((ActivityReserve) this.instance).mergeDanmaku(statInfo);
            return this;
        }

        public Builder mergeVt(StatInfo statInfo) {
            copyOnWrite();
            ((ActivityReserve) this.instance).mergeVt(statInfo);
            return this;
        }

        public Builder setButton(ReserveButton reserveButton) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setButton(reserveButton);
            return this;
        }

        public Builder setDanmaku(StatInfo statInfo) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setDanmaku(statInfo);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setVt(StatInfo statInfo) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setVt(statInfo);
            return this;
        }

        private Builder() {
            super(ActivityReserve.DEFAULT_INSTANCE);
        }

        public Builder setButton(ReserveButton.Builder builder) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setButton(builder.build());
            return this;
        }

        public Builder setDanmaku(StatInfo.Builder builder) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setDanmaku(builder.build());
            return this;
        }

        public Builder setVt(StatInfo.Builder builder) {
            copyOnWrite();
            ((ActivityReserve) this.instance).setVt(builder.build());
            return this;
        }
    }

    static {
        ActivityReserve activityReserve = new ActivityReserve();
        DEFAULT_INSTANCE = activityReserve;
        GeneratedMessageLite.registerDefaultInstance(ActivityReserve.class, activityReserve);
    }

    private ActivityReserve() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.button_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDanmaku() {
        this.danmaku_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVt() {
        this.vt_ = null;
    }

    public static ActivityReserve getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeButton(ReserveButton reserveButton) {
        reserveButton.getClass();
        ReserveButton reserveButton2 = this.button_;
        if (reserveButton2 != null && reserveButton2 != ReserveButton.getDefaultInstance()) {
            this.button_ = ReserveButton.newBuilder(this.button_).mergeFrom((ReserveButton) reserveButton).buildPartial();
        } else {
            this.button_ = reserveButton;
        }
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

    public static ActivityReserve parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ActivityReserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityReserve parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ActivityReserve> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(ReserveButton reserveButton) {
        reserveButton.getClass();
        this.button_ = reserveButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDanmaku(StatInfo statInfo) {
        statInfo.getClass();
        this.danmaku_ = statInfo;
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
        switch (C69691.f16957xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ActivityReserve();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\t\u0004\t", new Object[]{"title_", "vt_", "danmaku_", "button_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ActivityReserve> parser = PARSER;
                if (parser == null) {
                    synchronized (ActivityReserve.class) {
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

    public ReserveButton getButton() {
        ReserveButton reserveButton = this.button_;
        return reserveButton == null ? ReserveButton.getDefaultInstance() : reserveButton;
    }

    public StatInfo getDanmaku() {
        StatInfo statInfo = this.danmaku_;
        return statInfo == null ? StatInfo.getDefaultInstance() : statInfo;
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

    public boolean hasButton() {
        return this.button_ != null;
    }

    public boolean hasDanmaku() {
        return this.danmaku_ != null;
    }

    public boolean hasVt() {
        return this.vt_ != null;
    }

    public static Builder newBuilder(ActivityReserve activityReserve) {
        return DEFAULT_INSTANCE.createBuilder(activityReserve);
    }

    public static ActivityReserve parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityReserve) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityReserve parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ActivityReserve parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ActivityReserve parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ActivityReserve parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityReserve parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ActivityReserve parseFrom(InputStream inputStream) throws IOException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityReserve parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ActivityReserve parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ActivityReserve parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ActivityReserve) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
