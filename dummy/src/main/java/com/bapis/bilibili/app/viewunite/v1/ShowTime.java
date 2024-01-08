package com.bapis.bilibili.app.viewunite.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes20.dex */
public final class ShowTime extends GeneratedMessageLite<ShowTime, ShowTime.C12368b> implements InterfaceC12414f {
    private static final ShowTime DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private static volatile Parser<ShowTime> PARSER = null;
    public static final int POS_X_FIELD_NUMBER = 3;
    public static final int POS_Y_FIELD_NUMBER = 4;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int endTime_;
    private double posX_;
    private double posY_;
    private int startTime_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ShowTime$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C12367a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21294xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21294xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21294xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21294xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21294xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21294xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21294xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21294xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.viewunite.v1.ShowTime$b */
    /* loaded from: classes20.dex */
    public static final class C12368b extends GeneratedMessageLite.Builder<ShowTime, C12368b> implements InterfaceC12414f {
        /* synthetic */ C12368b(C12367a c12367a) {
            this();
        }

        public C12368b clearEndTime() {
            copyOnWrite();
            ((ShowTime) this.instance).clearEndTime();
            return this;
        }

        public C12368b clearPosX() {
            copyOnWrite();
            ((ShowTime) this.instance).clearPosX();
            return this;
        }

        public C12368b clearPosY() {
            copyOnWrite();
            ((ShowTime) this.instance).clearPosY();
            return this;
        }

        public C12368b clearStartTime() {
            copyOnWrite();
            ((ShowTime) this.instance).clearStartTime();
            return this;
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
        public int getEndTime() {
            return ((ShowTime) this.instance).getEndTime();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
        public double getPosX() {
            return ((ShowTime) this.instance).getPosX();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
        public double getPosY() {
            return ((ShowTime) this.instance).getPosY();
        }

        @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
        public int getStartTime() {
            return ((ShowTime) this.instance).getStartTime();
        }

        public C12368b setEndTime(int i) {
            copyOnWrite();
            ((ShowTime) this.instance).setEndTime(i);
            return this;
        }

        public C12368b setPosX(double d) {
            copyOnWrite();
            ((ShowTime) this.instance).setPosX(d);
            return this;
        }

        public C12368b setPosY(double d) {
            copyOnWrite();
            ((ShowTime) this.instance).setPosY(d);
            return this;
        }

        public C12368b setStartTime(int i) {
            copyOnWrite();
            ((ShowTime) this.instance).setStartTime(i);
            return this;
        }

        private C12368b() {
            super(ShowTime.DEFAULT_INSTANCE);
        }
    }

    static {
        ShowTime showTime = new ShowTime();
        DEFAULT_INSTANCE = showTime;
        GeneratedMessageLite.registerDefaultInstance(ShowTime.class, showTime);
    }

    private ShowTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosX() {
        this.posX_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosY() {
        this.posY_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static ShowTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C12368b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ShowTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ShowTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosX(double d) {
        this.posX_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosY(double d) {
        this.posY_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C12367a.f21294xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ShowTime();
            case 2:
                return new C12368b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0000\u0004\u0000", new Object[]{"startTime_", "endTime_", "posX_", "posY_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ShowTime> parser = PARSER;
                if (parser == null) {
                    synchronized (ShowTime.class) {
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

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
    public double getPosX() {
        return this.posX_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
    public double getPosY() {
        return this.posY_;
    }

    @Override // com.bapis.bilibili.app.viewunite.v1.InterfaceC12414f
    public int getStartTime() {
        return this.startTime_;
    }

    public static C12368b newBuilder(ShowTime showTime) {
        return DEFAULT_INSTANCE.createBuilder(showTime);
    }

    public static ShowTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShowTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ShowTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ShowTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ShowTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ShowTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ShowTime parseFrom(InputStream inputStream) throws IOException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ShowTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ShowTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ShowTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
