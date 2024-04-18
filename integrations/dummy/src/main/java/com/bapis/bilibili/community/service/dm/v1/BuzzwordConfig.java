package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class BuzzwordConfig extends GeneratedMessageLite<BuzzwordConfig, BuzzwordConfig.Builder> implements MessageLiteOrBuilder {
    private static final BuzzwordConfig DEFAULT_INSTANCE;
    public static final int KEYWORDS_FIELD_NUMBER = 1;
    private static volatile Parser<BuzzwordConfig> PARSER;
    private Internal.ProtobufList<BuzzwordShowConfig> keywords_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.BuzzwordConfig$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C71881 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17035xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17035xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17035xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BuzzwordConfig, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71881 c71881) {
            this();
        }

        public Builder addAllKeywords(Iterable<? extends BuzzwordShowConfig> iterable) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).addAllKeywords(iterable);
            return this;
        }

        public Builder addKeywords(BuzzwordShowConfig buzzwordShowConfig) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).addKeywords(buzzwordShowConfig);
            return this;
        }

        public Builder clearKeywords() {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).clearKeywords();
            return this;
        }

        public BuzzwordShowConfig getKeywords(int i) {
            return ((BuzzwordConfig) this.instance).getKeywords(i);
        }

        public int getKeywordsCount() {
            return ((BuzzwordConfig) this.instance).getKeywordsCount();
        }

        public List<BuzzwordShowConfig> getKeywordsList() {
            return Collections.unmodifiableList(((BuzzwordConfig) this.instance).getKeywordsList());
        }

        public Builder removeKeywords(int i) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).removeKeywords(i);
            return this;
        }

        public Builder setKeywords(int i, BuzzwordShowConfig buzzwordShowConfig) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setKeywords(i, buzzwordShowConfig);
            return this;
        }

        private Builder() {
            super(BuzzwordConfig.DEFAULT_INSTANCE);
        }

        public Builder addKeywords(int i, BuzzwordShowConfig buzzwordShowConfig) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).addKeywords(i, buzzwordShowConfig);
            return this;
        }

        public Builder setKeywords(int i, BuzzwordShowConfig.Builder builder) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).setKeywords(i, builder.build());
            return this;
        }

        public Builder addKeywords(BuzzwordShowConfig.Builder builder) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).addKeywords(builder.build());
            return this;
        }

        public Builder addKeywords(int i, BuzzwordShowConfig.Builder builder) {
            copyOnWrite();
            ((BuzzwordConfig) this.instance).addKeywords(i, builder.build());
            return this;
        }
    }

    static {
        BuzzwordConfig buzzwordConfig = new BuzzwordConfig();
        DEFAULT_INSTANCE = buzzwordConfig;
        GeneratedMessageLite.registerDefaultInstance(BuzzwordConfig.class, buzzwordConfig);
    }

    private BuzzwordConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeywords(Iterable<? extends BuzzwordShowConfig> iterable) {
        ensureKeywordsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.keywords_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeywords(BuzzwordShowConfig buzzwordShowConfig) {
        buzzwordShowConfig.getClass();
        ensureKeywordsIsMutable();
        this.keywords_.add(buzzwordShowConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeywords() {
        this.keywords_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureKeywordsIsMutable() {
        Internal.ProtobufList<BuzzwordShowConfig> protobufList = this.keywords_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.keywords_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static BuzzwordConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BuzzwordConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BuzzwordConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BuzzwordConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKeywords(int i) {
        ensureKeywordsIsMutable();
        this.keywords_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeywords(int i, BuzzwordShowConfig buzzwordShowConfig) {
        buzzwordShowConfig.getClass();
        ensureKeywordsIsMutable();
        this.keywords_.set(i, buzzwordShowConfig);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71881.f17035xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BuzzwordConfig();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"keywords_", BuzzwordShowConfig.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BuzzwordConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (BuzzwordConfig.class) {
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

    public BuzzwordShowConfig getKeywords(int i) {
        return this.keywords_.get(i);
    }

    public int getKeywordsCount() {
        return this.keywords_.size();
    }

    public List<BuzzwordShowConfig> getKeywordsList() {
        return this.keywords_;
    }

    public BuzzwordShowConfigOrBuilder getKeywordsOrBuilder(int i) {
        return this.keywords_.get(i);
    }

    public List<? extends BuzzwordShowConfigOrBuilder> getKeywordsOrBuilderList() {
        return this.keywords_;
    }

    public static Builder newBuilder(BuzzwordConfig buzzwordConfig) {
        return DEFAULT_INSTANCE.createBuilder(buzzwordConfig);
    }

    public static BuzzwordConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeywords(int i, BuzzwordShowConfig buzzwordShowConfig) {
        buzzwordShowConfig.getClass();
        ensureKeywordsIsMutable();
        this.keywords_.add(i, buzzwordShowConfig);
    }

    public static BuzzwordConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BuzzwordConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(InputStream inputStream) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BuzzwordConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BuzzwordConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BuzzwordConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BuzzwordConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
