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
public final class GetUserReq extends GeneratedMessageLite<GetUserReq, GetUserReq.Builder> implements MessageLiteOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    private static final GetUserReq DEFAULT_INSTANCE;
    public static final int MIDS_FIELD_NUMBER = 1;
    public static final int ONLY_FANS_FIELD_NUMBER = 4;
    private static volatile Parser<GetUserReq> PARSER = null;
    public static final int UP_MID_FIELD_NUMBER = 3;
    private long aid_;
    private int midsMemoizedSerializedSize = -1;
    private Internal.LongList mids_ = GeneratedMessageLite.emptyLongList();
    private boolean onlyFans_;
    private long upMid_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.GetUserReq$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67711 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16742xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16742xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16742xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16742xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16742xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16742xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16742xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16742xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GetUserReq, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67711 c67711) {
            this();
        }

        public Builder addAllMids(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((GetUserReq) this.instance).addAllMids(iterable);
            return this;
        }

        public Builder addMids(long j) {
            copyOnWrite();
            ((GetUserReq) this.instance).addMids(j);
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((GetUserReq) this.instance).clearAid();
            return this;
        }

        public Builder clearMids() {
            copyOnWrite();
            ((GetUserReq) this.instance).clearMids();
            return this;
        }

        public Builder clearOnlyFans() {
            copyOnWrite();
            ((GetUserReq) this.instance).clearOnlyFans();
            return this;
        }

        public Builder clearUpMid() {
            copyOnWrite();
            ((GetUserReq) this.instance).clearUpMid();
            return this;
        }

        public long getAid() {
            return ((GetUserReq) this.instance).getAid();
        }

        public long getMids(int i) {
            return ((GetUserReq) this.instance).getMids(i);
        }

        public int getMidsCount() {
            return ((GetUserReq) this.instance).getMidsCount();
        }

        public List<Long> getMidsList() {
            return Collections.unmodifiableList(((GetUserReq) this.instance).getMidsList());
        }

        public boolean getOnlyFans() {
            return ((GetUserReq) this.instance).getOnlyFans();
        }

        public long getUpMid() {
            return ((GetUserReq) this.instance).getUpMid();
        }

        public Builder setAid(long j) {
            copyOnWrite();
            ((GetUserReq) this.instance).setAid(j);
            return this;
        }

        public Builder setMids(int i, long j) {
            copyOnWrite();
            ((GetUserReq) this.instance).setMids(i, j);
            return this;
        }

        public Builder setOnlyFans(boolean z) {
            copyOnWrite();
            ((GetUserReq) this.instance).setOnlyFans(z);
            return this;
        }

        public Builder setUpMid(long j) {
            copyOnWrite();
            ((GetUserReq) this.instance).setUpMid(j);
            return this;
        }

        private Builder() {
            super(GetUserReq.DEFAULT_INSTANCE);
        }
    }

    static {
        GetUserReq getUserReq = new GetUserReq();
        DEFAULT_INSTANCE = getUserReq;
        GeneratedMessageLite.registerDefaultInstance(GetUserReq.class, getUserReq);
    }

    private GetUserReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMids(Iterable<? extends Long> iterable) {
        ensureMidsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.mids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMids(long j) {
        ensureMidsIsMutable();
        this.mids_.addLong(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMids() {
        this.mids_ = GeneratedMessageLite.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnlyFans() {
        this.onlyFans_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpMid() {
        this.upMid_ = 0L;
    }

    private void ensureMidsIsMutable() {
        Internal.LongList longList = this.mids_;
        if (longList.isModifiable()) {
            return;
        }
        this.mids_ = GeneratedMessageLite.mutableCopy(longList);
    }

    public static GetUserReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GetUserReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetUserReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GetUserReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMids(int i, long j) {
        ensureMidsIsMutable();
        this.mids_.setLong(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnlyFans(boolean z) {
        this.onlyFans_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpMid(long j) {
        this.upMid_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67711.f16742xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new GetUserReq();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001%\u0002\u0002\u0003\u0002\u0004\u0007", new Object[]{"mids_", "aid_", "upMid_", "onlyFans_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GetUserReq> parser = PARSER;
                if (parser == null) {
                    synchronized (GetUserReq.class) {
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

    public long getAid() {
        return this.aid_;
    }

    public long getMids(int i) {
        return this.mids_.getLong(i);
    }

    public int getMidsCount() {
        return this.mids_.size();
    }

    public List<Long> getMidsList() {
        return this.mids_;
    }

    public boolean getOnlyFans() {
        return this.onlyFans_;
    }

    public long getUpMid() {
        return this.upMid_;
    }

    public static Builder newBuilder(GetUserReq getUserReq) {
        return DEFAULT_INSTANCE.createBuilder(getUserReq);
    }

    public static GetUserReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GetUserReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GetUserReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GetUserReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetUserReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GetUserReq parseFrom(InputStream inputStream) throws IOException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetUserReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GetUserReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetUserReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetUserReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
