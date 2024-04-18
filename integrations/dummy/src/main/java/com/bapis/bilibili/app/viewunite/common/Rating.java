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
public final class Rating extends GeneratedMessageLite<Rating, Rating.Builder> implements MessageLiteOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final Rating DEFAULT_INSTANCE;
    private static volatile Parser<Rating> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 1;
    private int count_;
    private String score_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.Rating$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70331 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17014xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17014xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17014xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17014xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17014xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17014xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17014xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17014xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Rating, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70331 c70331) {
            this();
        }

        public Builder clearCount() {
            copyOnWrite();
            ((Rating) this.instance).clearCount();
            return this;
        }

        public Builder clearScore() {
            copyOnWrite();
            ((Rating) this.instance).clearScore();
            return this;
        }

        public int getCount() {
            return ((Rating) this.instance).getCount();
        }

        public String getScore() {
            return ((Rating) this.instance).getScore();
        }

        public ByteString getScoreBytes() {
            return ((Rating) this.instance).getScoreBytes();
        }

        public Builder setCount(int i) {
            copyOnWrite();
            ((Rating) this.instance).setCount(i);
            return this;
        }

        public Builder setScore(String str) {
            copyOnWrite();
            ((Rating) this.instance).setScore(str);
            return this;
        }

        public Builder setScoreBytes(ByteString byteString) {
            copyOnWrite();
            ((Rating) this.instance).setScoreBytes(byteString);
            return this;
        }

        private Builder() {
            super(Rating.DEFAULT_INSTANCE);
        }
    }

    static {
        Rating rating = new Rating();
        DEFAULT_INSTANCE = rating;
        GeneratedMessageLite.registerDefaultInstance(Rating.class, rating);
    }

    private Rating() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = getDefaultInstance().getScore();
    }

    public static Rating getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Rating parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Rating) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rating parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Rating> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i) {
        this.count_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(String str) {
        str.getClass();
        this.score_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScoreBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.score_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70331.f17014xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Rating();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0004", new Object[]{"score_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Rating> parser = PARSER;
                if (parser == null) {
                    synchronized (Rating.class) {
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

    public int getCount() {
        return this.count_;
    }

    public String getScore() {
        return this.score_;
    }

    public ByteString getScoreBytes() {
        return ByteString.copyFromUtf8(this.score_);
    }

    public static Builder newBuilder(Rating rating) {
        return DEFAULT_INSTANCE.createBuilder(rating);
    }

    public static Rating parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rating) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rating parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Rating parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Rating parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Rating parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Rating parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Rating parseFrom(InputStream inputStream) throws IOException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Rating parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Rating parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Rating parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Rating) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
