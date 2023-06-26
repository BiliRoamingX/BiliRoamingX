package com.bapis.bilibili.community.service.dm.v1;

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
/* loaded from: classes14.dex */
public final class DmViewReq extends GeneratedMessageLite<DmViewReq, DmViewReq.Builder> implements MessageLiteOrBuilder {
    private static final DmViewReq DEFAULT_INSTANCE;
    public static final int IS_HARD_BOOT_FIELD_NUMBER = 5;
    public static final int OID_FIELD_NUMBER = 2;
    private static volatile Parser<DmViewReq> PARSER = null;
    public static final int PID_FIELD_NUMBER = 1;
    public static final int SPMID_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int isHardBoot_;
    private long oid_;
    private long pid_;
    private String spmid_ = "";
    private int type_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmViewReq$1 */
    /* loaded from: classes14.dex */
    static /* synthetic */ class C72261 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f17067xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f17067xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17067xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes14.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DmViewReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C72261 c72261) {
            this();
        }

        public Builder clearIsHardBoot() {
            copyOnWrite();
            ((DmViewReq) this.instance).clearIsHardBoot();
            return this;
        }

        public Builder clearOid() {
            copyOnWrite();
            ((DmViewReq) this.instance).clearOid();
            return this;
        }

        public Builder clearPid() {
            copyOnWrite();
            ((DmViewReq) this.instance).clearPid();
            return this;
        }

        public Builder clearSpmid() {
            copyOnWrite();
            ((DmViewReq) this.instance).clearSpmid();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((DmViewReq) this.instance).clearType();
            return this;
        }

        public int getIsHardBoot() {
            return ((DmViewReq) this.instance).getIsHardBoot();
        }

        public long getOid() {
            return ((DmViewReq) this.instance).getOid();
        }

        public long getPid() {
            return ((DmViewReq) this.instance).getPid();
        }

        public String getSpmid() {
            return ((DmViewReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((DmViewReq) this.instance).getSpmidBytes();
        }

        public int getType() {
            return ((DmViewReq) this.instance).getType();
        }

        public Builder setIsHardBoot(int i) {
            copyOnWrite();
            ((DmViewReq) this.instance).setIsHardBoot(i);
            return this;
        }

        public Builder setOid(long j) {
            copyOnWrite();
            ((DmViewReq) this.instance).setOid(j);
            return this;
        }

        public Builder setPid(long j) {
            copyOnWrite();
            ((DmViewReq) this.instance).setPid(j);
            return this;
        }

        public Builder setSpmid(String str) {
            copyOnWrite();
            ((DmViewReq) this.instance).setSpmid(str);
            return this;
        }

        public Builder setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((DmViewReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((DmViewReq) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(DmViewReq.DEFAULT_INSTANCE);
        }
    }

    static {
        DmViewReq dmViewReq = new DmViewReq();
        DEFAULT_INSTANCE = dmViewReq;
        GeneratedMessageLite.registerDefaultInstance(DmViewReq.class, dmViewReq);
    }

    private DmViewReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHardBoot() {
        this.isHardBoot_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static DmViewReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmViewReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmViewReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmViewReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHardBoot(int i) {
        this.isHardBoot_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(long j) {
        this.pid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmid(String str) {
        str.getClass();
        this.spmid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpmidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.spmid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C72261.f17067xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmViewReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0004\u0004\u0208\u0005\u0004", new Object[]{"pid_", "oid_", "type_", "spmid_", "isHardBoot_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmViewReq> parser = PARSER;
                if (parser == null) {
                    synchronized (DmViewReq.class) {
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

    public int getIsHardBoot() {
        return this.isHardBoot_;
    }

    public long getOid() {
        return this.oid_;
    }

    public long getPid() {
        return this.pid_;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(DmViewReq dmViewReq) {
        return DEFAULT_INSTANCE.createBuilder(dmViewReq);
    }

    public static DmViewReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmViewReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmViewReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmViewReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DmViewReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmViewReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmViewReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmViewReq parseFrom(InputStream inputStream) throws IOException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmViewReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmViewReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmViewReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmViewReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
