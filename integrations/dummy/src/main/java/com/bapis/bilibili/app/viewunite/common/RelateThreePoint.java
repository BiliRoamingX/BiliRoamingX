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
public final class RelateThreePoint extends GeneratedMessageLite<RelateThreePoint, RelateThreePoint.Builder> implements MessageLiteOrBuilder {
    private static final RelateThreePoint DEFAULT_INSTANCE;
    public static final int DISLIKE_FIELD_NUMBER = 1;
    public static final int DISLIKE_REPORT_DATA_FIELD_NUMBER = 4;
    public static final int FEEDBACK_FIELD_NUMBER = 2;
    private static volatile Parser<RelateThreePoint> PARSER = null;
    public static final int WATCH_LATER_FIELD_NUMBER = 3;
    private String dislikeReportData_ = "";
    private RelateDislike dislike_;
    private RelateDislike feedback_;
    private boolean watchLater_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.RelateThreePoint$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17028xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17028xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17028xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17028xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17028xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17028xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17028xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17028xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RelateThreePoint, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70481 c70481) {
            this();
        }

        public Builder clearDislike() {
            copyOnWrite();
            ((RelateThreePoint) this.instance).clearDislike();
            return this;
        }

        public Builder clearDislikeReportData() {
            copyOnWrite();
            ((RelateThreePoint) this.instance).clearDislikeReportData();
            return this;
        }

        public Builder clearFeedback() {
            copyOnWrite();
            ((RelateThreePoint) this.instance).clearFeedback();
            return this;
        }

        public Builder clearWatchLater() {
            copyOnWrite();
            ((RelateThreePoint) this.instance).clearWatchLater();
            return this;
        }

        public RelateDislike getDislike() {
            return ((RelateThreePoint) this.instance).getDislike();
        }

        public String getDislikeReportData() {
            return ((RelateThreePoint) this.instance).getDislikeReportData();
        }

        public ByteString getDislikeReportDataBytes() {
            return ((RelateThreePoint) this.instance).getDislikeReportDataBytes();
        }

        public RelateDislike getFeedback() {
            return ((RelateThreePoint) this.instance).getFeedback();
        }

        public boolean getWatchLater() {
            return ((RelateThreePoint) this.instance).getWatchLater();
        }

        public boolean hasDislike() {
            return ((RelateThreePoint) this.instance).hasDislike();
        }

        public boolean hasFeedback() {
            return ((RelateThreePoint) this.instance).hasFeedback();
        }

        public Builder mergeDislike(RelateDislike relateDislike) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).mergeDislike(relateDislike);
            return this;
        }

        public Builder mergeFeedback(RelateDislike relateDislike) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).mergeFeedback(relateDislike);
            return this;
        }

        public Builder setDislike(RelateDislike relateDislike) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).setDislike(relateDislike);
            return this;
        }

        public Builder setDislikeReportData(String str) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).setDislikeReportData(str);
            return this;
        }

        public Builder setDislikeReportDataBytes(ByteString byteString) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).setDislikeReportDataBytes(byteString);
            return this;
        }

        public Builder setFeedback(RelateDislike relateDislike) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).setFeedback(relateDislike);
            return this;
        }

        public Builder setWatchLater(boolean z) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).setWatchLater(z);
            return this;
        }

        private Builder() {
            super(RelateThreePoint.DEFAULT_INSTANCE);
        }

        public Builder setDislike(RelateDislike.Builder builder) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).setDislike(builder.build());
            return this;
        }

        public Builder setFeedback(RelateDislike.Builder builder) {
            copyOnWrite();
            ((RelateThreePoint) this.instance).setFeedback(builder.build());
            return this;
        }
    }

    static {
        RelateThreePoint relateThreePoint = new RelateThreePoint();
        DEFAULT_INSTANCE = relateThreePoint;
        GeneratedMessageLite.registerDefaultInstance(RelateThreePoint.class, relateThreePoint);
    }

    private RelateThreePoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislike() {
        this.dislike_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDislikeReportData() {
        this.dislikeReportData_ = getDefaultInstance().getDislikeReportData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedback() {
        this.feedback_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchLater() {
        this.watchLater_ = false;
    }

    public static RelateThreePoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDislike(RelateDislike relateDislike) {
        relateDislike.getClass();
        RelateDislike relateDislike2 = this.dislike_;
        if (relateDislike2 != null && relateDislike2 != RelateDislike.getDefaultInstance()) {
            this.dislike_ = RelateDislike.newBuilder(this.dislike_).mergeFrom((RelateDislike) relateDislike).buildPartial();
        } else {
            this.dislike_ = relateDislike;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedback(RelateDislike relateDislike) {
        relateDislike.getClass();
        RelateDislike relateDislike2 = this.feedback_;
        if (relateDislike2 != null && relateDislike2 != RelateDislike.getDefaultInstance()) {
            this.feedback_ = RelateDislike.newBuilder(this.feedback_).mergeFrom((RelateDislike) relateDislike).buildPartial();
        } else {
            this.feedback_ = relateDislike;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RelateThreePoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RelateThreePoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateThreePoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RelateThreePoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislike(RelateDislike relateDislike) {
        relateDislike.getClass();
        this.dislike_ = relateDislike;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislikeReportData(String str) {
        str.getClass();
        this.dislikeReportData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDislikeReportDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.dislikeReportData_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedback(RelateDislike relateDislike) {
        relateDislike.getClass();
        this.feedback_ = relateDislike;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchLater(boolean z) {
        this.watchLater_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70481.f17028xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new RelateThreePoint();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007\u0004\u0208", new Object[]{"dislike_", "feedback_", "watchLater_", "dislikeReportData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RelateThreePoint> parser = PARSER;
                if (parser == null) {
                    synchronized (RelateThreePoint.class) {
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

    public RelateDislike getDislike() {
        RelateDislike relateDislike = this.dislike_;
        return relateDislike == null ? RelateDislike.getDefaultInstance() : relateDislike;
    }

    public String getDislikeReportData() {
        return this.dislikeReportData_;
    }

    public ByteString getDislikeReportDataBytes() {
        return ByteString.copyFromUtf8(this.dislikeReportData_);
    }

    public RelateDislike getFeedback() {
        RelateDislike relateDislike = this.feedback_;
        return relateDislike == null ? RelateDislike.getDefaultInstance() : relateDislike;
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

    public static Builder newBuilder(RelateThreePoint relateThreePoint) {
        return DEFAULT_INSTANCE.createBuilder(relateThreePoint);
    }

    public static RelateThreePoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateThreePoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateThreePoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RelateThreePoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RelateThreePoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RelateThreePoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelateThreePoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RelateThreePoint parseFrom(InputStream inputStream) throws IOException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelateThreePoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RelateThreePoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RelateThreePoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RelateThreePoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
