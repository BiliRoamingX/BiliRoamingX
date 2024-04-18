package com.bapis.bilibili.dagw.component.avatar.v1.plugin;

import com.bapis.bilibili.dagw.component.avatar.v1.plugin.GyroscopeEntityV2;
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
public final class NFTImageV2 extends GeneratedMessageLite<NFTImageV2, NFTImageV2.Builder> implements MessageLiteOrBuilder {
    private static final NFTImageV2 DEFAULT_INSTANCE;
    public static final int GYROSCOPE_FIELD_NUMBER = 1;
    private static volatile Parser<NFTImageV2> PARSER;
    private Internal.ProtobufList<GyroscopeEntityV2> gyroscope_ = GeneratedMessageLite.emptyProtobufList();

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.dagw.component.avatar.v1.plugin.NFTImageV2$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C75481 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17390xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17390xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17390xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17390xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17390xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17390xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17390xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17390xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<NFTImageV2, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C75481 c75481) {
            this();
        }

        public Builder addAllGyroscope(Iterable<? extends GyroscopeEntityV2> iterable) {
            copyOnWrite();
            ((NFTImageV2) this.instance).addAllGyroscope(iterable);
            return this;
        }

        public Builder addGyroscope(GyroscopeEntityV2 gyroscopeEntityV2) {
            copyOnWrite();
            ((NFTImageV2) this.instance).addGyroscope(gyroscopeEntityV2);
            return this;
        }

        public Builder clearGyroscope() {
            copyOnWrite();
            ((NFTImageV2) this.instance).clearGyroscope();
            return this;
        }

        public GyroscopeEntityV2 getGyroscope(int i) {
            return ((NFTImageV2) this.instance).getGyroscope(i);
        }

        public int getGyroscopeCount() {
            return ((NFTImageV2) this.instance).getGyroscopeCount();
        }

        public List<GyroscopeEntityV2> getGyroscopeList() {
            return Collections.unmodifiableList(((NFTImageV2) this.instance).getGyroscopeList());
        }

        public Builder removeGyroscope(int i) {
            copyOnWrite();
            ((NFTImageV2) this.instance).removeGyroscope(i);
            return this;
        }

        public Builder setGyroscope(int i, GyroscopeEntityV2 gyroscopeEntityV2) {
            copyOnWrite();
            ((NFTImageV2) this.instance).setGyroscope(i, gyroscopeEntityV2);
            return this;
        }

        private Builder() {
            super(NFTImageV2.DEFAULT_INSTANCE);
        }

        public Builder addGyroscope(int i, GyroscopeEntityV2 gyroscopeEntityV2) {
            copyOnWrite();
            ((NFTImageV2) this.instance).addGyroscope(i, gyroscopeEntityV2);
            return this;
        }

        public Builder setGyroscope(int i, GyroscopeEntityV2.Builder builder) {
            copyOnWrite();
            ((NFTImageV2) this.instance).setGyroscope(i, builder.build());
            return this;
        }

        public Builder addGyroscope(GyroscopeEntityV2.Builder builder) {
            copyOnWrite();
            ((NFTImageV2) this.instance).addGyroscope(builder.build());
            return this;
        }

        public Builder addGyroscope(int i, GyroscopeEntityV2.Builder builder) {
            copyOnWrite();
            ((NFTImageV2) this.instance).addGyroscope(i, builder.build());
            return this;
        }
    }

    static {
        NFTImageV2 nFTImageV2 = new NFTImageV2();
        DEFAULT_INSTANCE = nFTImageV2;
        GeneratedMessageLite.registerDefaultInstance(NFTImageV2.class, nFTImageV2);
    }

    private NFTImageV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGyroscope(Iterable<? extends GyroscopeEntityV2> iterable) {
        ensureGyroscopeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.gyroscope_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGyroscope(GyroscopeEntityV2 gyroscopeEntityV2) {
        gyroscopeEntityV2.getClass();
        ensureGyroscopeIsMutable();
        this.gyroscope_.add(gyroscopeEntityV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGyroscope() {
        this.gyroscope_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureGyroscopeIsMutable() {
        Internal.ProtobufList<GyroscopeEntityV2> protobufList = this.gyroscope_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.gyroscope_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static NFTImageV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NFTImageV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NFTImageV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NFTImageV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NFTImageV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGyroscope(int i) {
        ensureGyroscopeIsMutable();
        this.gyroscope_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGyroscope(int i, GyroscopeEntityV2 gyroscopeEntityV2) {
        gyroscopeEntityV2.getClass();
        ensureGyroscopeIsMutable();
        this.gyroscope_.set(i, gyroscopeEntityV2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C75481.f17390xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new NFTImageV2();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"gyroscope_", GyroscopeEntityV2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NFTImageV2> parser = PARSER;
                if (parser == null) {
                    synchronized (NFTImageV2.class) {
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

    public GyroscopeEntityV2 getGyroscope(int i) {
        return this.gyroscope_.get(i);
    }

    public int getGyroscopeCount() {
        return this.gyroscope_.size();
    }

    public List<GyroscopeEntityV2> getGyroscopeList() {
        return this.gyroscope_;
    }

    public GyroscopeEntityV2OrBuilder getGyroscopeOrBuilder(int i) {
        return this.gyroscope_.get(i);
    }

    public List<? extends GyroscopeEntityV2OrBuilder> getGyroscopeOrBuilderList() {
        return this.gyroscope_;
    }

    public static Builder newBuilder(NFTImageV2 nFTImageV2) {
        return DEFAULT_INSTANCE.createBuilder(nFTImageV2);
    }

    public static NFTImageV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NFTImageV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NFTImageV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NFTImageV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGyroscope(int i, GyroscopeEntityV2 gyroscopeEntityV2) {
        gyroscopeEntityV2.getClass();
        ensureGyroscopeIsMutable();
        this.gyroscope_.add(i, gyroscopeEntityV2);
    }

    public static NFTImageV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NFTImageV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NFTImageV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NFTImageV2 parseFrom(InputStream inputStream) throws IOException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NFTImageV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NFTImageV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NFTImageV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NFTImageV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
