package com.bapis.bilibili.app.view.v1;

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
public final class RecThreePoint extends GeneratedMessageLite<RecThreePoint, RecThreePoint.Builder> implements MessageLiteOrBuilder {
    private static final RecThreePoint DEFAULT_INSTANCE;
    public static final int DISLIKE_FIELD_NUMBER = 1;
    public static final int FEEDBACK_FIELD_NUMBER = 2;
    private static volatile Parser<RecThreePoint> PARSER = null;
    public static final int WATCH_LATER_FIELD_NUMBER = 3;
    private RecDislike dislike_;
    private RecDislike feedback_;
    private boolean watchLater_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.RecThreePoint$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68361 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16797xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16797xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16797xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16797xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16797xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16797xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16797xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16797xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RecThreePoint, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68361 c68361) {
            this();
        }

        public Builder clearDislike() {
            copyOnWrite();
            ((RecThreePoint) this.instance).clearDislike();
            return this;
        }

        public Builder clearFeedback() {
            copyOnWrite();
            ((RecThreePoint) this.instance).clearFeedback();
            return this;
        }

        public Builder clearWatchLater() {
            copyOnWrite();
            ((RecThreePoint) this.instance).clearWatchLater();
            return this;
        }

        public RecDislike getDislike() {
            return ((RecThreePoint) this.instance).getDislike();
        }

        public RecDislike getFeedback() {
            return ((RecThreePoint) this.instance).getFeedback();
        }

        public boolean getWatchLater() {
            return ((RecThreePoint) this.instance).getWatchLater();
        }

        public boolean hasDislike() {
            return ((RecThreePoint) this.instance).hasDislike();
        }

        public boolean hasFeedback() {
            return ((RecThreePoint) this.instance).hasFeedback();
        }

        public Builder mergeDislike(RecDislike recDislike) {
            copyOnWrite();
            ((RecThreePoint) this.instance).mergeDislike(recDislike);
            return this;
        }

        public Builder mergeFeedback(RecDislike recDislike) {
            copyOnWrite();
            ((RecThreePoint) this.instance).mergeFeedback(recDislike);
            return this;
        }

        public Builder setDislike(RecDislike recDislike) {
            copyOnWrite();
            ((RecThreePoint) this.instance).setDislike(recDislike);
            return this;
        }

        public Builder setFeedback(RecDislike recDislike) {
            copyOnWrite();
            ((RecThreePoint) this.instance).setFeedback(recDislike);
            return this;
        }

        public Builder setWatchLater(boolean z) {
            copyOnWrite();
            ((RecThreePoint) this.instance).setWatchLater(z);
            return this;
        }

        private Builder() {
            super(RecThreePoint.DEFAULT_INSTANCE);
        }

        public Builder setDislike(RecDislike.Builder builder) {
            copyOnWrite();
            ((RecThreePoint) this.instance).setDislike(builder.build());
            return this;
        }

        public Builder setFeedback(RecDislike.Builder builder) {
            copyOnWrite();
            ((RecThreePoint) this.instance).setFeedback(builder.build());
            return this;
        }
    }

    static {
        RecThreePoint recThreePoint = new RecThreePoint();
        DEFAULT_INSTANCE = recThreePoint;
        GeneratedMessageLite.registerDefaultInstance(RecThreePoint.class, recThreePoint);
    }

    private RecThreePoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislike() {
        this.dislike_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedback() {
        this.feedback_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchLater() {
        this.watchLater_ = false;
    }

    public static RecThreePoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDislike(RecDislike recDislike) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedback(RecDislike recDislike) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecThreePoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecThreePoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecThreePoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecThreePoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislike(RecDislike recDislike) {
        recDislike.getClass();
        this.dislike_ = recDislike;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedback(RecDislike recDislike) {
        recDislike.getClass();
        this.feedback_ = recDislike;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchLater(boolean z) {
        this.watchLater_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68361.f16797xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RecThreePoint();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007", new Object[]{"dislike_", "feedback_", "watchLater_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecThreePoint> parser = PARSER;
                if (parser == null) {
                    synchronized (RecThreePoint.class) {
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

    public RecDislike getDislike() {
        RecDislike recDislike = this.dislike_;
        return recDislike == null ? RecDislike.getDefaultInstance() : recDislike;
    }

    public RecDislike getFeedback() {
        RecDislike recDislike = this.feedback_;
        return recDislike == null ? RecDislike.getDefaultInstance() : recDislike;
    }

    public boolean getWatchLater() {
        return this.watchLater_;
    }

    public boolean hasDislike() {
        return this.dislike_ != null;
    }

    public boolean hasFeedback() {
        return this.feedback_ != null;
    }

    public static Builder newBuilder(RecThreePoint recThreePoint) {
        return DEFAULT_INSTANCE.createBuilder(recThreePoint);
    }

    public static RecThreePoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecThreePoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecThreePoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecThreePoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecThreePoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecThreePoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecThreePoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecThreePoint parseFrom(InputStream inputStream) throws IOException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecThreePoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecThreePoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecThreePoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
