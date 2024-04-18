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
public final class LiveOrder extends GeneratedMessageLite<LiveOrder, LiveOrder.Builder> implements MessageLiteOrBuilder {
    private static final LiveOrder DEFAULT_INSTANCE;
    public static final int FOLLOW_COUNT_FIELD_NUMBER = 5;
    public static final int IS_FOLLOW_FIELD_NUMBER = 4;
    public static final int LIVE_PLAN_START_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<LiveOrder> PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 2;
    private long followCount_;
    private boolean isFollow_;
    private long livePlanStartTime_;
    private long sid_;
    private String text_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.LiveOrder$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70131 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16996xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16996xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16996xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16996xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16996xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16996xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16996xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16996xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<LiveOrder, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70131 c70131) {
            this();
        }

        public Builder clearFollowCount() {
            copyOnWrite();
            ((LiveOrder) this.instance).clearFollowCount();
            return this;
        }

        public Builder clearIsFollow() {
            copyOnWrite();
            ((LiveOrder) this.instance).clearIsFollow();
            return this;
        }

        public Builder clearLivePlanStartTime() {
            copyOnWrite();
            ((LiveOrder) this.instance).clearLivePlanStartTime();
            return this;
        }

        public Builder clearSid() {
            copyOnWrite();
            ((LiveOrder) this.instance).clearSid();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((LiveOrder) this.instance).clearText();
            return this;
        }

        public long getFollowCount() {
            return ((LiveOrder) this.instance).getFollowCount();
        }

        public boolean getIsFollow() {
            return ((LiveOrder) this.instance).getIsFollow();
        }

        public long getLivePlanStartTime() {
            return ((LiveOrder) this.instance).getLivePlanStartTime();
        }

        public long getSid() {
            return ((LiveOrder) this.instance).getSid();
        }

        public String getText() {
            return ((LiveOrder) this.instance).getText();
        }

        public ByteString getTextBytes() {
            return ((LiveOrder) this.instance).getTextBytes();
        }

        public Builder setFollowCount(long j) {
            copyOnWrite();
            ((LiveOrder) this.instance).setFollowCount(j);
            return this;
        }

        public Builder setIsFollow(boolean z) {
            copyOnWrite();
            ((LiveOrder) this.instance).setIsFollow(z);
            return this;
        }

        public Builder setLivePlanStartTime(long j) {
            copyOnWrite();
            ((LiveOrder) this.instance).setLivePlanStartTime(j);
            return this;
        }

        public Builder setSid(long j) {
            copyOnWrite();
            ((LiveOrder) this.instance).setSid(j);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((LiveOrder) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((LiveOrder) this.instance).setTextBytes(byteString);
            return this;
        }

        private Builder() {
            super(LiveOrder.DEFAULT_INSTANCE);
        }
    }

    static {
        LiveOrder liveOrder = new LiveOrder();
        DEFAULT_INSTANCE = liveOrder;
        GeneratedMessageLite.registerDefaultInstance(LiveOrder.class, liveOrder);
    }

    private LiveOrder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowCount() {
        this.followCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollow() {
        this.isFollow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLivePlanStartTime() {
        this.livePlanStartTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public static LiveOrder getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LiveOrder parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LiveOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveOrder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LiveOrder> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowCount(long j) {
        this.followCount_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollow(boolean z) {
        this.isFollow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlanStartTime(long j) {
        this.livePlanStartTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(long j) {
        this.sid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70131.f16996xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new LiveOrder();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002\u0004\u0007\u0005\u0002", new Object[]{"sid_", "text_", "livePlanStartTime_", "isFollow_", "followCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LiveOrder> parser = PARSER;
                if (parser == null) {
                    synchronized (LiveOrder.class) {
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

    public String getText() {
        return this.text_;
    }

    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public static Builder newBuilder(LiveOrder liveOrder) {
        return DEFAULT_INSTANCE.createBuilder(liveOrder);
    }

    public static LiveOrder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveOrder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveOrder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LiveOrder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LiveOrder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LiveOrder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LiveOrder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LiveOrder parseFrom(InputStream inputStream) throws IOException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LiveOrder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LiveOrder parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LiveOrder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LiveOrder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
