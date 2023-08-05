package com.bapis.bilibili.app.viewunite.pgcanymodel;

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
public final class WatchProgress extends GeneratedMessageLite<WatchProgress, WatchProgress.Builder> implements MessageLiteOrBuilder {
    private static final WatchProgress DEFAULT_INSTANCE;
    public static final int LAST_EP_ID_FIELD_NUMBER = 1;
    public static final int LAST_EP_INDEX_FIELD_NUMBER = 2;
    public static final int LAST_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<WatchProgress> PARSER;
    private long lastEpId_;
    private String lastEpIndex_ = "";
    private long lastTime_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.WatchProgress$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71001 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17077xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17077xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17077xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17077xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17077xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17077xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17077xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17077xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<WatchProgress, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71001 c71001) {
            this();
        }

        public Builder clearLastEpId() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearLastEpId();
            return this;
        }

        public Builder clearLastEpIndex() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearLastEpIndex();
            return this;
        }

        public Builder clearLastTime() {
            copyOnWrite();
            ((WatchProgress) this.instance).clearLastTime();
            return this;
        }

        public long getLastEpId() {
            return ((WatchProgress) this.instance).getLastEpId();
        }

        public String getLastEpIndex() {
            return ((WatchProgress) this.instance).getLastEpIndex();
        }

        public ByteString getLastEpIndexBytes() {
            return ((WatchProgress) this.instance).getLastEpIndexBytes();
        }

        public long getLastTime() {
            return ((WatchProgress) this.instance).getLastTime();
        }

        public Builder setLastEpId(long j) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastEpId(j);
            return this;
        }

        public Builder setLastEpIndex(String str) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastEpIndex(str);
            return this;
        }

        public Builder setLastEpIndexBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastEpIndexBytes(byteString);
            return this;
        }

        public Builder setLastTime(long j) {
            copyOnWrite();
            ((WatchProgress) this.instance).setLastTime(j);
            return this;
        }

        private Builder() {
            super(WatchProgress.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchProgress watchProgress = new WatchProgress();
        DEFAULT_INSTANCE = watchProgress;
        GeneratedMessageLite.registerDefaultInstance(WatchProgress.class, watchProgress);
    }

    private WatchProgress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastEpId() {
        this.lastEpId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastEpIndex() {
        this.lastEpIndex_ = getDefaultInstance().getLastEpIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastTime() {
        this.lastTime_ = 0L;
    }

    public static WatchProgress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchProgress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchProgress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchProgress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastEpId(long j) {
        this.lastEpId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastEpIndex(String str) {
        str.getClass();
        this.lastEpIndex_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastEpIndexBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastEpIndex_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastTime(long j) {
        this.lastTime_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71001.f17077xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new WatchProgress();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0002", new Object[]{"lastEpId_", "lastEpIndex_", "lastTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchProgress> parser = PARSER;
                if (parser == null) {
                    synchronized (WatchProgress.class) {
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

    public long getLastEpId() {
        return this.lastEpId_;
    }

    public String getLastEpIndex() {
        return this.lastEpIndex_;
    }

    public ByteString getLastEpIndexBytes() {
        return ByteString.copyFromUtf8(this.lastEpIndex_);
    }

    public long getLastTime() {
        return this.lastTime_;
    }

    public static Builder newBuilder(WatchProgress watchProgress) {
        return DEFAULT_INSTANCE.createBuilder(watchProgress);
    }

    public static WatchProgress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchProgress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchProgress parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(InputStream inputStream) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchProgress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchProgress parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchProgress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchProgress) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
