package com.bapis.bilibili.app.view.v1;

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
/* loaded from: classes13.dex */
public final class DM extends GeneratedMessageLite<DM, DM.Builder> implements MessageLiteOrBuilder {
    public static final int CLOSED_FIELD_NUMBER = 1;
    public static final int COUNT_FIELD_NUMBER = 3;
    private static final DM DEFAULT_INSTANCE;
    private static volatile Parser<DM> PARSER = null;
    public static final int REAL_NAME_FIELD_NUMBER = 2;
    private boolean closed_;
    private long count_;
    private boolean realName_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.DM$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67521 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16726xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16726xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16726xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16726xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16726xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16726xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16726xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16726xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<DM, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67521 c67521) {
            this();
        }

        public Builder clearClosed() {
            copyOnWrite();
            ((DM) this.instance).clearClosed();
            return this;
        }

        public Builder clearCount() {
            copyOnWrite();
            ((DM) this.instance).clearCount();
            return this;
        }

        public Builder clearRealName() {
            copyOnWrite();
            ((DM) this.instance).clearRealName();
            return this;
        }

        public boolean getClosed() {
            return ((DM) this.instance).getClosed();
        }

        public long getCount() {
            return ((DM) this.instance).getCount();
        }

        public boolean getRealName() {
            return ((DM) this.instance).getRealName();
        }

        public Builder setClosed(boolean z) {
            copyOnWrite();
            ((DM) this.instance).setClosed(z);
            return this;
        }

        public Builder setCount(long j) {
            copyOnWrite();
            ((DM) this.instance).setCount(j);
            return this;
        }

        public Builder setRealName(boolean z) {
            copyOnWrite();
            ((DM) this.instance).setRealName(z);
            return this;
        }

        private Builder() {
            super(DM.DEFAULT_INSTANCE);
        }
    }

    static {
        DM dm = new DM();
        DEFAULT_INSTANCE = dm;
        GeneratedMessageLite.registerDefaultInstance(DM.class, dm);
    }

    private DM() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosed() {
        this.closed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRealName() {
        this.realName_ = false;
    }

    public static DM getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DM parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DM parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DM> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosed(boolean z) {
        this.closed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j) {
        this.count_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealName(boolean z) {
        this.realName_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67521.f16726xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DM();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0002", new Object[]{"closed_", "realName_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DM> parser = PARSER;
                if (parser == null) {
                    synchronized (DM.class) {
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

    public boolean getClosed() {
        return this.closed_;
    }

    public long getCount() {
        return this.count_;
    }

    public boolean getRealName() {
        return this.realName_;
    }

    public static Builder newBuilder(DM dm) {
        return DEFAULT_INSTANCE.createBuilder(dm);
    }

    public static DM parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DM) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DM parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DM parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DM parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DM parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DM parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DM parseFrom(InputStream inputStream) throws IOException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DM parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DM parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DM parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DM) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
