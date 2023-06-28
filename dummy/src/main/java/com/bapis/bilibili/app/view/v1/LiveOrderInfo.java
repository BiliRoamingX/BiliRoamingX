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
public final class LiveOrderInfo extends GeneratedMessageLite<LiveOrderInfo, LiveOrderInfo.Builder> implements MessageLiteOrBuilder {
    private static final LiveOrderInfo DEFAULT_INSTANCE;
    public static final int FOLLOW_COUNT_FIELD_NUMBER = 5;
    public static final int IS_FOLLOW_FIELD_NUMBER = 4;
    public static final int LIVE_PLAN_START_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<LiveOrderInfo> PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int STYLE_FIELD_NUMBER = 6;
    public static final int TEXT_FIELD_NUMBER = 2;
    private long followCount_;
    private boolean isFollow_;
    private long livePlanStartTime_;
    private long sid_;
    private String text_ = "";
    private String style_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.LiveOrderInfo$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16760xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16760xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16760xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16760xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16760xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16760xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16760xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16760xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LiveOrderInfo, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67931 c67931) {
            this();
        }

        public Builder clearFollowCount() {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).clearFollowCount();
            return this;
        }

        public Builder clearIsFollow() {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).clearIsFollow();
            return this;
        }

        public Builder clearLivePlanStartTime() {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).clearLivePlanStartTime();
            return this;
        }

        public Builder clearSid() {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).clearSid();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).clearStyle();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).clearText();
            return this;
        }

        public long getFollowCount() {
            return ((LiveOrderInfo) this.instance).getFollowCount();
        }

        public boolean getIsFollow() {
            return ((LiveOrderInfo) this.instance).getIsFollow();
        }

        public long getLivePlanStartTime() {
            return ((LiveOrderInfo) this.instance).getLivePlanStartTime();
        }

        public long getSid() {
            return ((LiveOrderInfo) this.instance).getSid();
        }

        public String getStyle() {
            return ((LiveOrderInfo) this.instance).getStyle();
        }

        public ByteString getStyleBytes() {
            return ((LiveOrderInfo) this.instance).getStyleBytes();
        }

        public String getText() {
            return ((LiveOrderInfo) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((LiveOrderInfo) this.instance).getTextBytes();
        }

        public Builder setFollowCount(long j) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setFollowCount(j);
            return this;
        }

        public Builder setIsFollow(boolean z) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setIsFollow(z);
            return this;
        }

        public Builder setLivePlanStartTime(long j) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setLivePlanStartTime(j);
            return this;
        }

        public Builder setSid(long j) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setSid(j);
            return this;
        }

        public Builder setStyle(String str) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setStyle(str);
            return this;
        }

        public Builder setStyleBytes(ByteString byteString) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setStyleBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((LiveOrderInfo) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(LiveOrderInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        LiveOrderInfo liveOrderInfo = new LiveOrderInfo();
        DEFAULT_INSTANCE = liveOrderInfo;
        GeneratedMessageLite.registerDefaultInstance(LiveOrderInfo.class, liveOrderInfo);
    }

    private LiveOrderInfo() {
    }

    public void clearFollowCount() {
        this.followCount_ = 0L;
    }

    public void clearIsFollow() {
        this.isFollow_ = false;
    }

    public void clearLivePlanStartTime() {
        this.livePlanStartTime_ = 0L;
    }

    public void clearSid() {
        this.sid_ = 0L;
    }

    public void clearStyle() {
        this.style_ = getDefaultInstance().getStyle();
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static LiveOrderInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LiveOrderInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LiveOrderInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveOrderInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LiveOrderInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setFollowCount(long j) {
        this.followCount_ = j;
    }

    public void setIsFollow(boolean z) {
        this.isFollow_ = z;
    }

    public void setLivePlanStartTime(long j) {
        this.livePlanStartTime_ = j;
    }

    public void setSid(long j) {
        this.sid_ = j;
    }

    public void setStyle(String str) {
        str.getClass();
        this.style_ = str;
    }

    public void setStyleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.style_ = byteString.toStringUtf8();
    }

    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67931.f16760xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LiveOrderInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0208", new Object[]{"sid_", "text_", "livePlanStartTime_", "isFollow_", "followCount_", "style_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LiveOrderInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (LiveOrderInfo.class) {
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

    public long getFollowCount() {
        return this.followCount_;
    }

    public boolean getIsFollow() {
        return this.isFollow_;
    }

    public long getLivePlanStartTime() {
        return this.livePlanStartTime_;
    }

    public long getSid() {
        return this.sid_;
    }

    public String getStyle() {
        return this.style_;
    }

    public ByteString getStyleBytes() {
        return ByteString.copyFromUtf8(this.style_);
    }

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(LiveOrderInfo liveOrderInfo) {
        return DEFAULT_INSTANCE.createBuilder(liveOrderInfo);
    }

    public static LiveOrderInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveOrderInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveOrderInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LiveOrderInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LiveOrderInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LiveOrderInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LiveOrderInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LiveOrderInfo parseFrom(InputStream inputStream) throws IOException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveOrderInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveOrderInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LiveOrderInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveOrderInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
