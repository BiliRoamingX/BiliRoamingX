package com.bapis.bilibili.playershared;

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
/* loaded from: classes18.dex */
public final class History extends GeneratedMessageLite<History, History.Builder> implements MessageLiteOrBuilder {
    public static final int CURRENT_VIDEO_FIELD_NUMBER = 1;
    private static final History DEFAULT_INSTANCE;
    private static volatile Parser<History> PARSER = null;
    public static final int RELATED_VIDEO_FIELD_NUMBER = 2;
    private HistoryInfo currentVideo_;
    private HistoryInfo relatedVideo_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.History$1 */
    /* loaded from: classes18.dex */
    static /* synthetic */ class C81821 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17903xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17903xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17903xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17903xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17903xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17903xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17903xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17903xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes18.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<History, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C81821 c81821) {
            this();
        }

        public Builder clearCurrentVideo() {
            copyOnWrite();
            ((History) this.instance).clearCurrentVideo();
            return this;
        }

        public Builder clearRelatedVideo() {
            copyOnWrite();
            ((History) this.instance).clearRelatedVideo();
            return this;
        }

        public HistoryInfo getCurrentVideo() {
            return ((History) this.instance).getCurrentVideo();
        }

        public HistoryInfo getRelatedVideo() {
            return ((History) this.instance).getRelatedVideo();
        }

        public boolean hasCurrentVideo() {
            return ((History) this.instance).hasCurrentVideo();
        }

        public boolean hasRelatedVideo() {
            return ((History) this.instance).hasRelatedVideo();
        }

        public Builder mergeCurrentVideo(HistoryInfo historyInfo) {
            copyOnWrite();
            ((History) this.instance).mergeCurrentVideo(historyInfo);
            return this;
        }

        public Builder mergeRelatedVideo(HistoryInfo historyInfo) {
            copyOnWrite();
            ((History) this.instance).mergeRelatedVideo(historyInfo);
            return this;
        }

        public Builder setCurrentVideo(HistoryInfo historyInfo) {
            copyOnWrite();
            ((History) this.instance).setCurrentVideo(historyInfo);
            return this;
        }

        public Builder setRelatedVideo(HistoryInfo historyInfo) {
            copyOnWrite();
            ((History) this.instance).setRelatedVideo(historyInfo);
            return this;
        }

        private Builder() {
            super(History.DEFAULT_INSTANCE);
        }

        public Builder setCurrentVideo(HistoryInfo.Builder builder) {
            copyOnWrite();
            ((History) this.instance).setCurrentVideo(builder.build());
            return this;
        }

        public Builder setRelatedVideo(HistoryInfo.Builder builder) {
            copyOnWrite();
            ((History) this.instance).setRelatedVideo(builder.build());
            return this;
        }
    }

    static {
        History history = new History();
        DEFAULT_INSTANCE = history;
        GeneratedMessageLite.registerDefaultInstance(History.class, history);
    }

    public History() {
    }

    public void clearCurrentVideo() {
        this.currentVideo_ = null;
    }

    public void clearRelatedVideo() {
        this.relatedVideo_ = null;
    }

    public static History getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeCurrentVideo(HistoryInfo historyInfo) {
        historyInfo.getClass();
        HistoryInfo historyInfo2 = this.currentVideo_;
        if (historyInfo2 != null && historyInfo2 != HistoryInfo.getDefaultInstance()) {
            this.currentVideo_ = HistoryInfo.newBuilder(this.currentVideo_).mergeFrom((HistoryInfo) historyInfo).buildPartial();
        } else {
            this.currentVideo_ = historyInfo;
        }
    }

    public void mergeRelatedVideo(HistoryInfo historyInfo) {
        historyInfo.getClass();
        HistoryInfo historyInfo2 = this.relatedVideo_;
        if (historyInfo2 != null && historyInfo2 != HistoryInfo.getDefaultInstance()) {
            this.relatedVideo_ = HistoryInfo.newBuilder(this.relatedVideo_).mergeFrom((HistoryInfo) historyInfo).buildPartial();
        } else {
            this.relatedVideo_ = historyInfo;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static History parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (History) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static History parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<History> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCurrentVideo(HistoryInfo historyInfo) {
        historyInfo.getClass();
        this.currentVideo_ = historyInfo;
    }

    public void setRelatedVideo(HistoryInfo historyInfo) {
        historyInfo.getClass();
        this.relatedVideo_ = historyInfo;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C81821.f17903xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new History();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"currentVideo_", "relatedVideo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<History> parser = PARSER;
                if (parser == null) {
                    synchronized (History.class) {
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

    public HistoryInfo getCurrentVideo() {
        HistoryInfo historyInfo = this.currentVideo_;
        return historyInfo == null ? HistoryInfo.getDefaultInstance() : historyInfo;
    }

    public HistoryInfo getRelatedVideo() {
        HistoryInfo historyInfo = this.relatedVideo_;
        return historyInfo == null ? HistoryInfo.getDefaultInstance() : historyInfo;
    }

    public boolean hasCurrentVideo() {
        return this.currentVideo_ != null;
    }

    public boolean hasRelatedVideo() {
        return this.relatedVideo_ != null;
    }

    public static Builder newBuilder(History history) {
        return DEFAULT_INSTANCE.createBuilder(history);
    }

    public static History parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (History) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static History parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static History parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static History parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static History parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static History parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static History parseFrom(InputStream inputStream) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static History parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static History parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static History parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (History) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
