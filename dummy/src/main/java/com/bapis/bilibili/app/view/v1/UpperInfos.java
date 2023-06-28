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
public final class UpperInfos extends GeneratedMessageLite<UpperInfos, UpperInfos.Builder> implements MessageLiteOrBuilder {
    public static final int ARC_COUNT_LAST_HALF_YEAR_FIELD_NUMBER = 2;
    private static final UpperInfos DEFAULT_INSTANCE;
    public static final int FANS_COUNT_FIELD_NUMBER = 1;
    public static final int FIRST_UP_DATES_FIELD_NUMBER = 3;
    private static volatile Parser<UpperInfos> PARSER = null;
    public static final int TOTAL_PLAY_COUNT_FIELD_NUMBER = 4;
    private long arcCountLastHalfYear_;
    private long fansCount_;
    private long firstUpDates_;
    private long totalPlayCount_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.UpperInfos$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68851 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16842xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16842xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16842xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16842xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16842xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16842xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16842xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16842xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<UpperInfos, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68851 c68851) {
            this();
        }

        public Builder clearArcCountLastHalfYear() {
            copyOnWrite();
            ((UpperInfos) this.instance).clearArcCountLastHalfYear();
            return this;
        }

        public Builder clearFansCount() {
            copyOnWrite();
            ((UpperInfos) this.instance).clearFansCount();
            return this;
        }

        public Builder clearFirstUpDates() {
            copyOnWrite();
            ((UpperInfos) this.instance).clearFirstUpDates();
            return this;
        }

        public Builder clearTotalPlayCount() {
            copyOnWrite();
            ((UpperInfos) this.instance).clearTotalPlayCount();
            return this;
        }

        public long getArcCountLastHalfYear() {
            return ((UpperInfos) this.instance).getArcCountLastHalfYear();
        }

        public long getFansCount() {
            return ((UpperInfos) this.instance).getFansCount();
        }

        public long getFirstUpDates() {
            return ((UpperInfos) this.instance).getFirstUpDates();
        }

        public long getTotalPlayCount() {
            return ((UpperInfos) this.instance).getTotalPlayCount();
        }

        public Builder setArcCountLastHalfYear(long j) {
            copyOnWrite();
            ((UpperInfos) this.instance).setArcCountLastHalfYear(j);
            return this;
        }

        public Builder setFansCount(long j) {
            copyOnWrite();
            ((UpperInfos) this.instance).setFansCount(j);
            return this;
        }

        public Builder setFirstUpDates(long j) {
            copyOnWrite();
            ((UpperInfos) this.instance).setFirstUpDates(j);
            return this;
        }

        public Builder setTotalPlayCount(long j) {
            copyOnWrite();
            ((UpperInfos) this.instance).setTotalPlayCount(j);
            return this;
        }

        private Builder() {
            super(UpperInfos.DEFAULT_INSTANCE);
        }
    }

    static {
        UpperInfos upperInfos = new UpperInfos();
        DEFAULT_INSTANCE = upperInfos;
        GeneratedMessageLite.registerDefaultInstance(UpperInfos.class, upperInfos);
    }

    private UpperInfos() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArcCountLastHalfYear() {
        this.arcCountLastHalfYear_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFansCount() {
        this.fansCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstUpDates() {
        this.firstUpDates_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalPlayCount() {
        this.totalPlayCount_ = 0L;
    }

    public static UpperInfos getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UpperInfos parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpperInfos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpperInfos parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UpperInfos> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArcCountLastHalfYear(long j) {
        this.arcCountLastHalfYear_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFansCount(long j) {
        this.fansCount_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstUpDates(long j) {
        this.firstUpDates_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalPlayCount(long j) {
        this.totalPlayCount_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68851.f16842xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new UpperInfos();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"fansCount_", "arcCountLastHalfYear_", "firstUpDates_", "totalPlayCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UpperInfos> parser = PARSER;
                if (parser == null) {
                    synchronized (UpperInfos.class) {
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

    public long getArcCountLastHalfYear() {
        return this.arcCountLastHalfYear_;
    }

    public long getFansCount() {
        return this.fansCount_;
    }

    public long getFirstUpDates() {
        return this.firstUpDates_;
    }

    public long getTotalPlayCount() {
        return this.totalPlayCount_;
    }

    public static Builder newBuilder(UpperInfos upperInfos) {
        return DEFAULT_INSTANCE.createBuilder(upperInfos);
    }

    public static UpperInfos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpperInfos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpperInfos parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UpperInfos parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UpperInfos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UpperInfos parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpperInfos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UpperInfos parseFrom(InputStream inputStream) throws IOException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpperInfos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UpperInfos parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UpperInfos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpperInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
