package com.bapis.bilibili.app.viewunite.v1;

import com.bapis.bilibili.pagination.Pagination;
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
public final class Relate extends GeneratedMessageLite<Relate, Relate.Builder> implements MessageLiteOrBuilder {
    private static final Relate DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
    public static final int PAGINATION_FIELD_NUMBER = 2;
    private static volatile Parser<Relate> PARSER;
    private long deviceType_;
    private Pagination pagination_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.Relate$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C71511 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17119xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17119xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17119xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17119xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17119xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17119xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17119xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17119xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Relate, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C71511 c71511) {
            this();
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((Relate) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearPagination() {
            copyOnWrite();
            ((Relate) this.instance).clearPagination();
            return this;
        }

        public long getDeviceType() {
            return ((Relate) this.instance).getDeviceType();
        }

        public Pagination getPagination() {
            return ((Relate) this.instance).getPagination();
        }

        public boolean hasPagination() {
            return ((Relate) this.instance).hasPagination();
        }

        public Builder mergePagination(Pagination pagination) {
            copyOnWrite();
            ((Relate) this.instance).mergePagination(pagination);
            return this;
        }

        public Builder setDeviceType(long j) {
            copyOnWrite();
            ((Relate) this.instance).setDeviceType(j);
            return this;
        }

        public Builder setPagination(Pagination pagination) {
            copyOnWrite();
            ((Relate) this.instance).setPagination(pagination);
            return this;
        }

        private Builder() {
            super(Relate.DEFAULT_INSTANCE);
        }

        public Builder setPagination(Pagination.Builder builder) {
            copyOnWrite();
            ((Relate) this.instance).setPagination(builder.build());
            return this;
        }
    }

    static {
        Relate relate = new Relate();
        DEFAULT_INSTANCE = relate;
        GeneratedMessageLite.registerDefaultInstance(Relate.class, relate);
    }

    private Relate() {
    }

    public void clearDeviceType() {
        this.deviceType_ = 0L;
    }

    public void clearPagination() {
        this.pagination_ = null;
    }

    public static Relate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergePagination(Pagination pagination) {
        pagination.getClass();
        Pagination pagination2 = this.pagination_;
        if (pagination2 != null && pagination2 != Pagination.getDefaultInstance()) {
            this.pagination_ = Pagination.newBuilder(this.pagination_).mergeFrom((Pagination) pagination).buildPartial();
        } else {
            this.pagination_ = pagination;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Relate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Relate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Relate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setDeviceType(long j) {
        this.deviceType_ = j;
    }

    public void setPagination(Pagination pagination) {
        pagination.getClass();
        this.pagination_ = pagination;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C71511.f17119xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Relate();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\t", new Object[]{"deviceType_", "pagination_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Relate> parser = PARSER;
                if (parser == null) {
                    synchronized (Relate.class) {
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

    public long getDeviceType() {
        return this.deviceType_;
    }

    public Pagination getPagination() {
        Pagination pagination = this.pagination_;
        return pagination == null ? Pagination.getDefaultInstance() : pagination;
    }

    public boolean hasPagination() {
        return this.pagination_ != null;
    }

    public static Builder newBuilder(Relate relate) {
        return DEFAULT_INSTANCE.createBuilder(relate);
    }

    public static Relate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Relate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Relate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Relate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Relate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Relate parseFrom(InputStream inputStream) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Relate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Relate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Relate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Relate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
