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
public final class BizReserveActivityParam extends GeneratedMessageLite<BizReserveActivityParam, BizReserveActivityParam.Builder> implements MessageLiteOrBuilder {
    public static final int ACTIVITY_ID_FIELD_NUMBER = 1;
    private static final BizReserveActivityParam DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int OID_FIELD_NUMBER = 4;
    private static volatile Parser<BizReserveActivityParam> PARSER = null;
    public static final int RESERVE_ID_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    private long activityId_;
    private long oid_;
    private long reserveId_;
    private String from_ = "";
    private String type_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.common.BizReserveActivityParam$1 */
    /* loaded from: classes17.dex */
    static /* synthetic */ class C69811 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16968xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16968xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16968xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16968xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16968xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16968xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16968xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16968xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes17.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<BizReserveActivityParam, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C69811 c69811) {
            this();
        }

        public Builder clearActivityId() {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).clearActivityId();
            return this;
        }

        public Builder clearFrom() {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).clearFrom();
            return this;
        }

        public Builder clearOid() {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).clearOid();
            return this;
        }

        public Builder clearReserveId() {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).clearReserveId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).clearType();
            return this;
        }

        public long getActivityId() {
            return ((BizReserveActivityParam) this.instance).getActivityId();
        }

        public String getFrom() {
            return ((BizReserveActivityParam) this.instance).getFrom();
        }

        public ByteString getFromBytes() {
            return ((BizReserveActivityParam) this.instance).getFromBytes();
        }

        public long getOid() {
            return ((BizReserveActivityParam) this.instance).getOid();
        }

        public long getReserveId() {
            return ((BizReserveActivityParam) this.instance).getReserveId();
        }

        public String getType() {
            return ((BizReserveActivityParam) this.instance).getType();
        }

        public ByteString getTypeBytes() {
            return ((BizReserveActivityParam) this.instance).getTypeBytes();
        }

        public Builder setActivityId(long j) {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).setActivityId(j);
            return this;
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setOid(long j) {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).setOid(j);
            return this;
        }

        public Builder setReserveId(long j) {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).setReserveId(j);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((BizReserveActivityParam) this.instance).setTypeBytes(byteString);
            return this;
        }

        private Builder() {
            super(BizReserveActivityParam.DEFAULT_INSTANCE);
        }
    }

    static {
        BizReserveActivityParam bizReserveActivityParam = new BizReserveActivityParam();
        DEFAULT_INSTANCE = bizReserveActivityParam;
        GeneratedMessageLite.registerDefaultInstance(BizReserveActivityParam.class, bizReserveActivityParam);
    }

    private BizReserveActivityParam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityId() {
        this.activityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserveId() {
        this.reserveId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static BizReserveActivityParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BizReserveActivityParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizReserveActivityParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BizReserveActivityParam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityId(long j) {
        this.activityId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserveId(long j) {
        this.reserveId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C69811.f16968xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new BizReserveActivityParam();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0002", new Object[]{"activityId_", "from_", "type_", "oid_", "reserveId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BizReserveActivityParam> parser = PARSER;
                if (parser == null) {
                    synchronized (BizReserveActivityParam.class) {
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

    public long getActivityId() {
        return this.activityId_;
    }

    public String getFrom() {
        return this.from_;
    }

    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    public long getOid() {
        return this.oid_;
    }

    public long getReserveId() {
        return this.reserveId_;
    }

    public String getType() {
        return this.type_;
    }

    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public static Builder newBuilder(BizReserveActivityParam bizReserveActivityParam) {
        return DEFAULT_INSTANCE.createBuilder(bizReserveActivityParam);
    }

    public static BizReserveActivityParam parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizReserveActivityParam parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BizReserveActivityParam parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BizReserveActivityParam parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BizReserveActivityParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BizReserveActivityParam parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BizReserveActivityParam parseFrom(InputStream inputStream) throws IOException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BizReserveActivityParam parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BizReserveActivityParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BizReserveActivityParam parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BizReserveActivityParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
