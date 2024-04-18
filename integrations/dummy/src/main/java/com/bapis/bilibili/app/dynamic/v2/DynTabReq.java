package com.bapis.bilibili.app.dynamic.v2;

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
/* loaded from: classes12.dex */
public final class DynTabReq extends GeneratedMessageLite<DynTabReq, DynTabReq.Builder> implements MessageLiteOrBuilder {
    private static final DynTabReq DEFAULT_INSTANCE;
    public static final int FROM_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<DynTabReq> PARSER = null;
    public static final int TEENAGERS_MODE_FIELD_NUMBER = 1;
    private int fromType_;
    private int teenagersMode_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.dynamic.v2.DynTabReq$1 */
    /* loaded from: classes12.dex */
    static /* synthetic */ class C59021 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16065xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f16065xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16065xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16065xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16065xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16065xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16065xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16065xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes12.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DynTabReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C59021 c59021) {
            this();
        }

        public Builder clearFromType() {
            copyOnWrite();
            ((DynTabReq) this.instance).clearFromType();
            return this;
        }

        public Builder clearTeenagersMode() {
            copyOnWrite();
            ((DynTabReq) this.instance).clearTeenagersMode();
            return this;
        }

        public CampusReqFromType getFromType() {
            return ((DynTabReq) this.instance).getFromType();
        }

        public int getFromTypeValue() {
            return ((DynTabReq) this.instance).getFromTypeValue();
        }

        public int getTeenagersMode() {
            return ((DynTabReq) this.instance).getTeenagersMode();
        }

        public Builder setFromType(CampusReqFromType campusReqFromType) {
            copyOnWrite();
            ((DynTabReq) this.instance).setFromType(campusReqFromType);
            return this;
        }

        public Builder setFromTypeValue(int i) {
            copyOnWrite();
            ((DynTabReq) this.instance).setFromTypeValue(i);
            return this;
        }

        public Builder setTeenagersMode(int i) {
            copyOnWrite();
            ((DynTabReq) this.instance).setTeenagersMode(i);
            return this;
        }

        private Builder() {
            super(DynTabReq.DEFAULT_INSTANCE);
        }
    }

    static {
        DynTabReq dynTabReq = new DynTabReq();
        DEFAULT_INSTANCE = dynTabReq;
        GeneratedMessageLite.registerDefaultInstance(DynTabReq.class, dynTabReq);
    }

    private DynTabReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromType() {
        this.fromType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTeenagersMode() {
        this.teenagersMode_ = 0;
    }

    public static DynTabReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DynTabReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynTabReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynTabReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DynTabReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromType(CampusReqFromType campusReqFromType) {
        this.fromType_ = campusReqFromType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromTypeValue(int i) {
        this.fromType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTeenagersMode(int i) {
        this.teenagersMode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C59021.f16065xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DynTabReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"teenagersMode_", "fromType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynTabReq> parser = PARSER;
                if (parser == null) {
                    synchronized (DynTabReq.class) {
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

    public CampusReqFromType getFromType() {
        CampusReqFromType forNumber = CampusReqFromType.forNumber(this.fromType_);
        return forNumber == null ? CampusReqFromType.UNRECOGNIZED : forNumber;
    }

    public int getFromTypeValue() {
        return this.fromType_;
    }

    public int getTeenagersMode() {
        return this.teenagersMode_;
    }

    public static Builder newBuilder(DynTabReq dynTabReq) {
        return DEFAULT_INSTANCE.createBuilder(dynTabReq);
    }

    public static DynTabReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTabReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynTabReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynTabReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynTabReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynTabReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynTabReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DynTabReq parseFrom(InputStream inputStream) throws IOException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynTabReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynTabReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynTabReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynTabReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
