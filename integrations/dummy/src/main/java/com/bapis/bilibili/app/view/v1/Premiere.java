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
public final class Premiere extends GeneratedMessageLite<Premiere, Premiere.Builder> implements MessageLiteOrBuilder {
    private static final Premiere DEFAULT_INSTANCE;
    private static volatile Parser<Premiere> PARSER = null;
    public static final int PREMIERE_STATE_FIELD_NUMBER = 1;
    public static final int ROOM_ID_FIELD_NUMBER = 4;
    public static final int SERVICE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private int premiereState_;
    private long roomId_;
    private long serviceTime_;
    private long startTime_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.Premiere$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C68231 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16785xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16785xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16785xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16785xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16785xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16785xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16785xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16785xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Premiere, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C68231 c68231) {
            this();
        }

        public Builder clearPremiereState() {
            copyOnWrite();
            ((Premiere) this.instance).clearPremiereState();
            return this;
        }

        public Builder clearRoomId() {
            copyOnWrite();
            ((Premiere) this.instance).clearRoomId();
            return this;
        }

        public Builder clearServiceTime() {
            copyOnWrite();
            ((Premiere) this.instance).clearServiceTime();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((Premiere) this.instance).clearStartTime();
            return this;
        }

        public PremiereState getPremiereState() {
            return ((Premiere) this.instance).getPremiereState();
        }

        public int getPremiereStateValue() {
            return ((Premiere) this.instance).getPremiereStateValue();
        }

        public long getRoomId() {
            return ((Premiere) this.instance).getRoomId();
        }

        public long getServiceTime() {
            return ((Premiere) this.instance).getServiceTime();
        }

        public long getStartTime() {
            return ((Premiere) this.instance).getStartTime();
        }

        public Builder setPremiereState(PremiereState premiereState) {
            copyOnWrite();
            ((Premiere) this.instance).setPremiereState(premiereState);
            return this;
        }

        public Builder setPremiereStateValue(int i) {
            copyOnWrite();
            ((Premiere) this.instance).setPremiereStateValue(i);
            return this;
        }

        public Builder setRoomId(long j) {
            copyOnWrite();
            ((Premiere) this.instance).setRoomId(j);
            return this;
        }

        public Builder setServiceTime(long j) {
            copyOnWrite();
            ((Premiere) this.instance).setServiceTime(j);
            return this;
        }

        public Builder setStartTime(long j) {
            copyOnWrite();
            ((Premiere) this.instance).setStartTime(j);
            return this;
        }

        private Builder() {
            super(Premiere.DEFAULT_INSTANCE);
        }
    }

    static {
        Premiere premiere = new Premiere();
        DEFAULT_INSTANCE = premiere;
        GeneratedMessageLite.registerDefaultInstance(Premiere.class, premiere);
    }

    private Premiere() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPremiereState() {
        this.premiereState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceTime() {
        this.serviceTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0L;
    }

    public static Premiere getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Premiere parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Premiere) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Premiere parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Premiere> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiereState(PremiereState premiereState) {
        this.premiereState_ = premiereState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPremiereStateValue(int i) {
        this.premiereState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomId(long j) {
        this.roomId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceTime(long j) {
        this.serviceTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j) {
        this.startTime_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C68231.f16785xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Premiere();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"premiereState_", "startTime_", "serviceTime_", "roomId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Premiere> parser = PARSER;
                if (parser == null) {
                    synchronized (Premiere.class) {
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

    public PremiereState getPremiereState() {
        PremiereState forNumber = PremiereState.forNumber(this.premiereState_);
        return forNumber == null ? PremiereState.UNRECOGNIZED : forNumber;
    }

    public int getPremiereStateValue() {
        return this.premiereState_;
    }

    public long getRoomId() {
        return this.roomId_;
    }

    public long getServiceTime() {
        return this.serviceTime_;
    }

    public long getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(Premiere premiere) {
        return DEFAULT_INSTANCE.createBuilder(premiere);
    }

    public static Premiere parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Premiere) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Premiere parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Premiere parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Premiere parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Premiere parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Premiere parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Premiere parseFrom(InputStream inputStream) throws IOException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Premiere parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Premiere parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Premiere parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Premiere) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
