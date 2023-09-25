package com.bapis.bilibili.app.viewunite.pgcanymodel;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes17.dex */
public final class PlayStrategy extends GeneratedMessageLite<PlayStrategy, PlayStrategy.Builder> implements MessageLiteOrBuilder {
    public static final int AUTO_PLAY_TOAST_FIELD_NUMBER = 3;
    private static final PlayStrategy DEFAULT_INSTANCE;
    private static volatile Parser<PlayStrategy> PARSER = null;
    public static final int RECOMMEND_SHOW_STRATEGY_FIELD_NUMBER = 2;
    public static final int STRATEGIES_FIELD_NUMBER = 1;
    private int recommendShowStrategy_;
    private Internal.ProtobufList<String> strategies_ = GeneratedMessageLite.emptyProtobufList();
    private String autoPlayToast_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.pgcanymodel.PlayStrategy$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C70931 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17070xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17070xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17070xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17070xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17070xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17070xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17070xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17070xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PlayStrategy, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C70931 c70931) {
            this();
        }

        public Builder addAllStrategies(Iterable<String> iterable) {
            copyOnWrite();
            ((PlayStrategy) this.instance).addAllStrategies(iterable);
            return this;
        }

        public Builder addStrategies(String str) {
            copyOnWrite();
            ((PlayStrategy) this.instance).addStrategies(str);
            return this;
        }

        public Builder addStrategiesBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayStrategy) this.instance).addStrategiesBytes(byteString);
            return this;
        }

        public Builder clearAutoPlayToast() {
            copyOnWrite();
            ((PlayStrategy) this.instance).clearAutoPlayToast();
            return this;
        }

        public Builder clearRecommendShowStrategy() {
            copyOnWrite();
            ((PlayStrategy) this.instance).clearRecommendShowStrategy();
            return this;
        }

        public Builder clearStrategies() {
            copyOnWrite();
            ((PlayStrategy) this.instance).clearStrategies();
            return this;
        }

        public String getAutoPlayToast() {
            return ((PlayStrategy) this.instance).getAutoPlayToast();
        }

        public ByteString getAutoPlayToastBytes() {
            return ((PlayStrategy) this.instance).getAutoPlayToastBytes();
        }

        public int getRecommendShowStrategy() {
            return ((PlayStrategy) this.instance).getRecommendShowStrategy();
        }

        public String getStrategies(int i) {
            return ((PlayStrategy) this.instance).getStrategies(i);
        }

        public ByteString getStrategiesBytes(int i) {
            return ((PlayStrategy) this.instance).getStrategiesBytes(i);
        }

        public int getStrategiesCount() {
            return ((PlayStrategy) this.instance).getStrategiesCount();
        }

        public List<String> getStrategiesList() {
            return Collections.unmodifiableList(((PlayStrategy) this.instance).getStrategiesList());
        }

        public Builder setAutoPlayToast(String str) {
            copyOnWrite();
            ((PlayStrategy) this.instance).setAutoPlayToast(str);
            return this;
        }

        public Builder setAutoPlayToastBytes(ByteString byteString) {
            copyOnWrite();
            ((PlayStrategy) this.instance).setAutoPlayToastBytes(byteString);
            return this;
        }

        public Builder setRecommendShowStrategy(int i) {
            copyOnWrite();
            ((PlayStrategy) this.instance).setRecommendShowStrategy(i);
            return this;
        }

        public Builder setStrategies(int i, String str) {
            copyOnWrite();
            ((PlayStrategy) this.instance).setStrategies(i, str);
            return this;
        }

        private Builder() {
            super(PlayStrategy.DEFAULT_INSTANCE);
        }
    }

    static {
        PlayStrategy playStrategy = new PlayStrategy();
        DEFAULT_INSTANCE = playStrategy;
        GeneratedMessageLite.registerDefaultInstance(PlayStrategy.class, playStrategy);
    }

    public PlayStrategy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStrategies(Iterable<String> iterable) {
        ensureStrategiesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.strategies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStrategies(String str) {
        str.getClass();
        ensureStrategiesIsMutable();
        this.strategies_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStrategiesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureStrategiesIsMutable();
        this.strategies_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoPlayToast() {
        this.autoPlayToast_ = getDefaultInstance().getAutoPlayToast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecommendShowStrategy() {
        this.recommendShowStrategy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrategies() {
        this.strategies_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureStrategiesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.strategies_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.strategies_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PlayStrategy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PlayStrategy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlayStrategy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayStrategy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PlayStrategy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoPlayToast(String str) {
        str.getClass();
        this.autoPlayToast_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoPlayToastBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.autoPlayToast_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecommendShowStrategy(int i) {
        this.recommendShowStrategy_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrategies(int i, String str) {
        str.getClass();
        ensureStrategiesIsMutable();
        this.strategies_.set(i, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C70931.f17070xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PlayStrategy();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u021a\u0002\u0004\u0003\u0208", new Object[]{"strategies_", "recommendShowStrategy_", "autoPlayToast_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PlayStrategy> parser = PARSER;
                if (parser == null) {
                    synchronized (PlayStrategy.class) {
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

    public String getAutoPlayToast() {
        return this.autoPlayToast_;
    }

    public ByteString getAutoPlayToastBytes() {
        return ByteString.copyFromUtf8(this.autoPlayToast_);
    }

    public int getRecommendShowStrategy() {
        return this.recommendShowStrategy_;
    }

    public String getStrategies(int i) {
        return this.strategies_.get(i);
    }

    public ByteString getStrategiesBytes(int i) {
        return ByteString.copyFromUtf8(this.strategies_.get(i));
    }

    public int getStrategiesCount() {
        return this.strategies_.size();
    }

    public List<String> getStrategiesList() {
        return this.strategies_;
    }

    public static Builder newBuilder(PlayStrategy playStrategy) {
        return DEFAULT_INSTANCE.createBuilder(playStrategy);
    }

    public static PlayStrategy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayStrategy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayStrategy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PlayStrategy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PlayStrategy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PlayStrategy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlayStrategy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PlayStrategy parseFrom(InputStream inputStream) throws IOException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlayStrategy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PlayStrategy parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PlayStrategy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PlayStrategy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
