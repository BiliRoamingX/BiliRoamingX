package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class ContinuousPlayReply extends GeneratedMessageLite<ContinuousPlayReply, ContinuousPlayReply.Builder> implements MessageLiteOrBuilder {
    private static final ContinuousPlayReply DEFAULT_INSTANCE;
    private static volatile Parser<ContinuousPlayReply> PARSER = null;
    public static final int RELATES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Relate> relates_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ContinuousPlayReply$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67441 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16718xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16718xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16718xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16718xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16718xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16718xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16718xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16718xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ContinuousPlayReply, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67441 c67441) {
            this();
        }

        public Builder addAllRelates(Iterable<? extends Relate> iterable) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).addAllRelates(iterable);
            return this;
        }

        public Builder addRelates(Relate relate) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).addRelates(relate);
            return this;
        }

        public Builder clearRelates() {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).clearRelates();
            return this;
        }

        public Relate getRelates(int i) {
            return ((ContinuousPlayReply) this.instance).getRelates(i);
        }

        public int getRelatesCount() {
            return ((ContinuousPlayReply) this.instance).getRelatesCount();
        }

        public List<Relate> getRelatesList() {
            return Collections.unmodifiableList(((ContinuousPlayReply) this.instance).getRelatesList());
        }

        public Builder removeRelates(int i) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).removeRelates(i);
            return this;
        }

        public Builder setRelates(int i, Relate relate) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).setRelates(i, relate);
            return this;
        }

        private Builder() {
            super(ContinuousPlayReply.DEFAULT_INSTANCE);
        }

        public Builder addRelates(int i, Relate relate) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).addRelates(i, relate);
            return this;
        }

        public Builder setRelates(int i, Relate.Builder builder) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).setRelates(i, builder.build());
            return this;
        }

        public Builder addRelates(Relate.Builder builder) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).addRelates(builder.build());
            return this;
        }

        public Builder addRelates(int i, Relate.Builder builder) {
            copyOnWrite();
            ((ContinuousPlayReply) this.instance).addRelates(i, builder.build());
            return this;
        }
    }

    static {
        ContinuousPlayReply continuousPlayReply = new ContinuousPlayReply();
        DEFAULT_INSTANCE = continuousPlayReply;
        GeneratedMessageLite.registerDefaultInstance(ContinuousPlayReply.class, continuousPlayReply);
    }

    private ContinuousPlayReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelates(Iterable<? extends Relate> iterable) {
        ensureRelatesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.relates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelates(Relate relate) {
        relate.getClass();
        ensureRelatesIsMutable();
        this.relates_.add(relate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelates() {
        this.relates_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureRelatesIsMutable() {
        Internal.ProtobufList<Relate> protobufList = this.relates_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.relates_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ContinuousPlayReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContinuousPlayReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContinuousPlayReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ContinuousPlayReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelates(int i) {
        ensureRelatesIsMutable();
        this.relates_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelates(int i, Relate relate) {
        relate.getClass();
        ensureRelatesIsMutable();
        this.relates_.set(i, relate);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67441.f16718xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ContinuousPlayReply();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"relates_", Relate.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContinuousPlayReply> parser = PARSER;
                if (parser == null) {
                    synchronized (ContinuousPlayReply.class) {
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

    public Relate getRelates(int i) {
        return this.relates_.get(i);
    }

    public int getRelatesCount() {
        return this.relates_.size();
    }

    public List<Relate> getRelatesList() {
        return this.relates_;
    }

    public RelateOrBuilder getRelatesOrBuilder(int i) {
        return this.relates_.get(i);
    }

    public List<? extends RelateOrBuilder> getRelatesOrBuilderList() {
        return this.relates_;
    }

    public static Builder newBuilder(ContinuousPlayReply continuousPlayReply) {
        return DEFAULT_INSTANCE.createBuilder(continuousPlayReply);
    }

    public static ContinuousPlayReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContinuousPlayReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContinuousPlayReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelates(int i, Relate relate) {
        relate.getClass();
        ensureRelatesIsMutable();
        this.relates_.add(i, relate);
    }

    public static ContinuousPlayReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContinuousPlayReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContinuousPlayReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContinuousPlayReply parseFrom(InputStream inputStream) throws IOException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContinuousPlayReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContinuousPlayReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContinuousPlayReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContinuousPlayReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
