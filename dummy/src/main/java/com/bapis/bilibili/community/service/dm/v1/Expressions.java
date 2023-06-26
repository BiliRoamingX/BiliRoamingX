package com.bapis.bilibili.community.service.dm.v1;

import com.bapis.bilibili.community.service.dm.v1.Expression;
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
public final class Expressions extends GeneratedMessageLite<Expressions, Expressions.Builder> implements ExpressionsOrBuilder {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final Expressions DEFAULT_INSTANCE;
    private static volatile Parser<Expressions> PARSER;
    private Internal.ProtobufList<Expression> data_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.Expressions$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72311 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17071xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17071xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17071xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Expressions, Builder> implements ExpressionsOrBuilder {
        /* synthetic */ Builder(C72311 c72311) {
            this();
        }

        public Builder addAllData(Iterable<? extends Expression> iterable) {
            copyOnWrite();
            ((Expressions) this.instance).addAllData(iterable);
            return this;
        }

        public Builder addData(Expression expression) {
            copyOnWrite();
            ((Expressions) this.instance).addData(expression);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((Expressions) this.instance).clearData();
            return this;
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionsOrBuilder
        public Expression getData(int i) {
            return ((Expressions) this.instance).getData(i);
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionsOrBuilder
        public int getDataCount() {
            return ((Expressions) this.instance).getDataCount();
        }

        @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionsOrBuilder
        public List<Expression> getDataList() {
            return Collections.unmodifiableList(((Expressions) this.instance).getDataList());
        }

        public Builder removeData(int i) {
            copyOnWrite();
            ((Expressions) this.instance).removeData(i);
            return this;
        }

        public Builder setData(int i, Expression expression) {
            copyOnWrite();
            ((Expressions) this.instance).setData(i, expression);
            return this;
        }

        private Builder() {
            super(Expressions.DEFAULT_INSTANCE);
        }

        public Builder addData(int i, Expression expression) {
            copyOnWrite();
            ((Expressions) this.instance).addData(i, expression);
            return this;
        }

        public Builder setData(int i, Expression.Builder builder) {
            copyOnWrite();
            ((Expressions) this.instance).setData(i, builder.build());
            return this;
        }

        public Builder addData(Expression.Builder builder) {
            copyOnWrite();
            ((Expressions) this.instance).addData(builder.build());
            return this;
        }

        public Builder addData(int i, Expression.Builder builder) {
            copyOnWrite();
            ((Expressions) this.instance).addData(i, builder.build());
            return this;
        }
    }

    static {
        Expressions expressions = new Expressions();
        DEFAULT_INSTANCE = expressions;
        GeneratedMessageLite.registerDefaultInstance(Expressions.class, expressions);
    }

    private Expressions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends Expression> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(Expression expression) {
        expression.getClass();
        ensureDataIsMutable();
        this.data_.add(expression);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDataIsMutable() {
        Internal.ProtobufList<Expression> protobufList = this.data_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Expressions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Expressions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Expressions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expressions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Expressions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        ensureDataIsMutable();
        this.data_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, Expression expression) {
        expression.getClass();
        ensureDataIsMutable();
        this.data_.set(i, expression);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72311.f17071xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Expressions();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"data_", Expression.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Expressions> parser = PARSER;
                if (parser == null) {
                    synchronized (Expressions.class) {
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

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionsOrBuilder
    public Expression getData(int i) {
        return this.data_.get(i);
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionsOrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.bapis.bilibili.community.service.dm.v1.ExpressionsOrBuilder
    public List<Expression> getDataList() {
        return this.data_;
    }

    public ExpressionOrBuilder getDataOrBuilder(int i) {
        return this.data_.get(i);
    }

    public List<? extends ExpressionOrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    public static Builder newBuilder(Expressions expressions) {
        return DEFAULT_INSTANCE.createBuilder(expressions);
    }

    public static Expressions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expressions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expressions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Expressions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i, Expression expression) {
        expression.getClass();
        ensureDataIsMutable();
        this.data_.add(i, expression);
    }

    public static Expressions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Expressions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Expressions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Expressions parseFrom(InputStream inputStream) throws IOException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expressions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Expressions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Expressions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Expressions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
