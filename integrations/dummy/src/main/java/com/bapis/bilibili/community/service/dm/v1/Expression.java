package com.bapis.bilibili.community.service.dm.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: BL */
/* loaded from: classes14.dex */
public final class Expression extends GeneratedMessageLite<Expression, Expression.Builder> implements ExpressionOrBuilder {
    private static final Expression DEFAULT_INSTANCE;
    public static final int KEYWORD_FIELD_NUMBER = 1;
    private static volatile Parser<Expression> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 2;
    private Internal.ProtobufList<String> keyword_ = GeneratedMessageLite.emptyProtobufList();
    private String url_ = "";
    private Internal.ProtobufList<Period> period_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Expression$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72301 {

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
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
        /* synthetic */ Builder(C72301 c72301) {
            this();
        }

        public Builder addAllKeyword(Iterable<String> iterable) {
            copyOnWrite();
            ((Expression) this.instance).addAllKeyword(iterable);
            return this;
        }

        public Builder addAllPeriod(Iterable<? extends Period> iterable) {
            copyOnWrite();
            ((Expression) this.instance).addAllPeriod(iterable);
            return this;
        }

        public Builder addKeyword(String str) {
            copyOnWrite();
            ((Expression) this.instance).addKeyword(str);
            return this;
        }

        public Builder addKeywordBytes(ByteString byteString) {
            copyOnWrite();
            ((Expression) this.instance).addKeywordBytes(byteString);
            return this;
        }

        public Builder addPeriod(Period period) {
            copyOnWrite();
            ((Expression) this.instance).addPeriod(period);
            return this;
        }

        public Builder clearKeyword() {
            copyOnWrite();
            ((Expression) this.instance).clearKeyword();
            return this;
        }

        public Builder clearPeriod() {
            copyOnWrite();
            ((Expression) this.instance).clearPeriod();
            return this;
        }

        public Builder clearUrl() {
            copyOnWrite();
            ((Expression) this.instance).clearUrl();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public String getKeyword(int i) {
            return ((Expression) this.instance).getKeyword(i);
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public ByteString getKeywordBytes(int i) {
            return ((Expression) this.instance).getKeywordBytes(i);
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public int getKeywordCount() {
            return ((Expression) this.instance).getKeywordCount();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public List<String> getKeywordList() {
            return Collections.unmodifiableList(((Expression) this.instance).getKeywordList());
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public Period getPeriod(int i) {
            return ((Expression) this.instance).getPeriod(i);
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public int getPeriodCount() {
            return ((Expression) this.instance).getPeriodCount();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public List<Period> getPeriodList() {
            return Collections.unmodifiableList(((Expression) this.instance).getPeriodList());
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public String getUrl() {
            return ((Expression) this.instance).getUrl();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
        public ByteString getUrlBytes() {
            return ((Expression) this.instance).getUrlBytes();
        }

        public Builder removePeriod(int i) {
            copyOnWrite();
            ((Expression) this.instance).removePeriod(i);
            return this;
        }

        public Builder setKeyword(int i, String str) {
            copyOnWrite();
            ((Expression) this.instance).setKeyword(i, str);
            return this;
        }

        public Builder setPeriod(int i, Period period) {
            copyOnWrite();
            ((Expression) this.instance).setPeriod(i, period);
            return this;
        }

        public Builder setUrl(String str) {
            copyOnWrite();
            ((Expression) this.instance).setUrl(str);
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((Expression) this.instance).setUrlBytes(byteString);
            return this;
        }

        private Builder() {
            super(Expression.DEFAULT_INSTANCE);
        }

        public Builder addPeriod(int i, Period period) {
            copyOnWrite();
            ((Expression) this.instance).addPeriod(i, period);
            return this;
        }

        public Builder setPeriod(int i, Period.Builder builder) {
            copyOnWrite();
            ((Expression) this.instance).setPeriod(i, builder.build());
            return this;
        }

        public Builder addPeriod(Period.Builder builder) {
            copyOnWrite();
            ((Expression) this.instance).addPeriod(builder.build());
            return this;
        }

        public Builder addPeriod(int i, Period.Builder builder) {
            copyOnWrite();
            ((Expression) this.instance).addPeriod(i, builder.build());
            return this;
        }
    }

    static {
        Expression expression = new Expression();
        DEFAULT_INSTANCE = expression;
        GeneratedMessageLite.registerDefaultInstance(Expression.class, expression);
    }

    private Expression() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeyword(Iterable<String> iterable) {
        ensureKeywordIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.keyword_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPeriod(Iterable<? extends Period> iterable) {
        ensurePeriodIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.period_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyword(String str) {
        str.getClass();
        ensureKeywordIsMutable();
        this.keyword_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeywordBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureKeywordIsMutable();
        this.keyword_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPeriod(Period period) {
        period.getClass();
        ensurePeriodIsMutable();
        this.period_.add(period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyword() {
        this.keyword_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensureKeywordIsMutable() {
        Internal.ProtobufList<String> protobufList = this.keyword_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.keyword_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePeriodIsMutable() {
        Internal.ProtobufList<Period> protobufList = this.period_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.period_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Expression getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Expression parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Expression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expression parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Expression> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePeriod(int i) {
        ensurePeriodIsMutable();
        this.period_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyword(int i, String str) {
        str.getClass();
        ensureKeywordIsMutable();
        this.keyword_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriod(int i, Period period) {
        period.getClass();
        ensurePeriodIsMutable();
        this.period_.set(i, period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72301.f17070xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Expression();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u021a\u0002\u0208\u0003\u001b", new Object[]{"keyword_", "url_", "period_", Period.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Expression> parser = PARSER;
                if (parser == null) {
                    synchronized (Expression.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public String getKeyword(int i) {
        return this.keyword_.get(i);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public ByteString getKeywordBytes(int i) {
        return ByteString.copyFromUtf8(this.keyword_.get(i));
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public int getKeywordCount() {
        return this.keyword_.size();
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public List<String> getKeywordList() {
        return this.keyword_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public Period getPeriod(int i) {
        return this.period_.get(i);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public int getPeriodCount() {
        return this.period_.size();
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public List<Period> getPeriodList() {
        return this.period_;
    }

    public PeriodOrBuilder getPeriodOrBuilder(int i) {
        return this.period_.get(i);
    }

    public List<? extends PeriodOrBuilder> getPeriodOrBuilderList() {
        return this.period_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public String getUrl() {
        return this.url_;
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionOrBuilder
    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public static Builder newBuilder(Expression expression) {
        return DEFAULT_INSTANCE.createBuilder(expression);
    }

    public static Expression parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expression) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expression parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Expression parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPeriod(int i, Period period) {
        period.getClass();
        ensurePeriodIsMutable();
        this.period_.add(i, period);
    }

    public static Expression parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Expression parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Expression parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Expression parseFrom(InputStream inputStream) throws IOException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expression parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expression parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Expression parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
