package com.bapis.bilibili.app.viewunite.ugcanymodel;

import com.bapis.bilibili.app.view.v1.PremiereState;
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
/* loaded from: classes21.dex */
public final class Premiere extends GeneratedMessageLite<Premiere, Premiere.b> implements MessageLiteOrBuilder {
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
    /* loaded from: classes21.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes21.dex */
    public static final class b extends GeneratedMessageLite.Builder<Premiere, b> implements MessageLiteOrBuilder {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b clearPremiereState() {
            copyOnWrite();
            ((Premiere) this.instance).clearPremiereState();
            return this;
        }

        public b clearRoomId() {
            copyOnWrite();
            ((Premiere) this.instance).clearRoomId();
            return this;
        }

        public b clearServiceTime() {
            copyOnWrite();
            ((Premiere) this.instance).clearServiceTime();
            return this;
        }

        public b clearStartTime() {
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

        public b setPremiereState(PremiereState premiereState) {
            copyOnWrite();
            ((Premiere) this.instance).setPremiereState(premiereState);
            return this;
        }

        public b setPremiereStateValue(int i2) {
            copyOnWrite();
            ((Premiere) this.instance).setPremiereStateValue(i2);
            return this;
        }

        public b setRoomId(long j2) {
            copyOnWrite();
            ((Premiere) this.instance).setRoomId(j2);
            return this;
        }

        public b setServiceTime(long j2) {
            copyOnWrite();
            ((Premiere) this.instance).setServiceTime(j2);
            return this;
        }

        public b setStartTime(long j2) {
            copyOnWrite();
            ((Premiere) this.instance).setStartTime(j2);
            return this;
        }

        private b() {
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

    public static b newBuilder() {
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
    public void setPremiereStateValue(int i2) {
        this.premiereState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomId(long j2) {
        this.roomId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceTime(long j2) {
        this.serviceTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j2) {
        this.startTime_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Premiere();
            case 2:
                return new b(aVar);
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

    public static b newBuilder(Premiere premiere) {
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
