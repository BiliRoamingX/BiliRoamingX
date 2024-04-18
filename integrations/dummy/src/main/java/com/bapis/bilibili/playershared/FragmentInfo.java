package com.bapis.bilibili.playershared;

import com.google.protobuf.Any;
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
/* loaded from: classes22.dex */
public final class FragmentInfo extends GeneratedMessageLite<FragmentInfo, FragmentInfo.C16004b> implements InterfaceC16107g {
    public static final int AID_FIELD_NUMBER = 4;
    public static final int CID_FIELD_NUMBER = 5;
    private static final FragmentInfo DEFAULT_INSTANCE;
    public static final int FRAGMENT_POSITION_FIELD_NUMBER = 2;
    public static final int FRAGMENT_TYPE_FIELD_NUMBER = 3;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile Parser<FragmentInfo> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 7;
    public static final int START_TIME_FIELD_NUMBER = 6;
    private long aid_;
    private long cid_;
    private int fragmentPosition_;
    private int fragmentType_;
    private int index_;
    private Any report_;
    private long startTime_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentInfo$a */
    /* loaded from: classes22.dex */
    static /* synthetic */ class C16003a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f22414xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f22414xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22414xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22414xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22414xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22414xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22414xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22414xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.playershared.FragmentInfo$b */
    /* loaded from: classes22.dex */
    public static final class C16004b extends GeneratedMessageLite.Builder<FragmentInfo, C16004b> implements InterfaceC16107g {
        /* synthetic */ C16004b(C16003a c16003a) {
            this();
        }

        public C16004b clearAid() {
            copyOnWrite();
            ((FragmentInfo) this.instance).clearAid();
            return this;
        }

        public C16004b clearCid() {
            copyOnWrite();
            ((FragmentInfo) this.instance).clearCid();
            return this;
        }

        public C16004b clearFragmentPosition() {
            copyOnWrite();
            ((FragmentInfo) this.instance).clearFragmentPosition();
            return this;
        }

        public C16004b clearFragmentType() {
            copyOnWrite();
            ((FragmentInfo) this.instance).clearFragmentType();
            return this;
        }

        public C16004b clearIndex() {
            copyOnWrite();
            ((FragmentInfo) this.instance).clearIndex();
            return this;
        }

        public C16004b clearReport() {
            copyOnWrite();
            ((FragmentInfo) this.instance).clearReport();
            return this;
        }

        public C16004b clearStartTime() {
            copyOnWrite();
            ((FragmentInfo) this.instance).clearStartTime();
            return this;
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public long getAid() {
            return ((FragmentInfo) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public long getCid() {
            return ((FragmentInfo) this.instance).getCid();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public FragmentPosition getFragmentPosition() {
            return ((FragmentInfo) this.instance).getFragmentPosition();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public int getFragmentPositionValue() {
            return ((FragmentInfo) this.instance).getFragmentPositionValue();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public FragmentType getFragmentType() {
            return ((FragmentInfo) this.instance).getFragmentType();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public int getFragmentTypeValue() {
            return ((FragmentInfo) this.instance).getFragmentTypeValue();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public int getIndex() {
            return ((FragmentInfo) this.instance).getIndex();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public Any getReport() {
            return ((FragmentInfo) this.instance).getReport();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public long getStartTime() {
            return ((FragmentInfo) this.instance).getStartTime();
        }

        @Override // com.bapis.bilibili.playershared.InterfaceC16107g
        public boolean hasReport() {
            return ((FragmentInfo) this.instance).hasReport();
        }

        public C16004b mergeReport(Any any) {
            copyOnWrite();
            ((FragmentInfo) this.instance).mergeReport(any);
            return this;
        }

        public C16004b setAid(long j) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setAid(j);
            return this;
        }

        public C16004b setCid(long j) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setCid(j);
            return this;
        }

        public C16004b setFragmentPosition(FragmentPosition fragmentPosition) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setFragmentPosition(fragmentPosition);
            return this;
        }

        public C16004b setFragmentPositionValue(int i) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setFragmentPositionValue(i);
            return this;
        }

        public C16004b setFragmentType(FragmentType fragmentType) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setFragmentType(fragmentType);
            return this;
        }

        public C16004b setFragmentTypeValue(int i) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setFragmentTypeValue(i);
            return this;
        }

        public C16004b setIndex(int i) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setIndex(i);
            return this;
        }

        public C16004b setReport(Any any) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setReport(any);
            return this;
        }

        public C16004b setStartTime(long j) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setStartTime(j);
            return this;
        }

        private C16004b() {
            super(FragmentInfo.DEFAULT_INSTANCE);
        }

        public C16004b setReport(Any.Builder builder) {
            copyOnWrite();
            ((FragmentInfo) this.instance).setReport(builder.build());
            return this;
        }
    }

    static {
        FragmentInfo fragmentInfo = new FragmentInfo();
        DEFAULT_INSTANCE = fragmentInfo;
        GeneratedMessageLite.registerDefaultInstance(FragmentInfo.class, fragmentInfo);
    }

    private FragmentInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCid() {
        this.cid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFragmentPosition() {
        this.fragmentPosition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFragmentType() {
        this.fragmentType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0L;
    }

    public static FragmentInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(Any any) {
        any.getClass();
        Any any2 = this.report_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.report_ = Any.newBuilder(this.report_).mergeFrom((Any) any).buildPartial();
        } else {
            this.report_ = any;
        }
    }

    public static C16004b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FragmentInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FragmentInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FragmentInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCid(long j) {
        this.cid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFragmentPosition(FragmentPosition fragmentPosition) {
        this.fragmentPosition_ = fragmentPosition.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFragmentPositionValue(int i) {
        this.fragmentPosition_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFragmentType(FragmentType fragmentType) {
        this.fragmentType_ = fragmentType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFragmentTypeValue(int i) {
        this.fragmentType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(Any any) {
        any.getClass();
        this.report_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j) {
        this.startTime_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C16003a.f22414xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new FragmentInfo();
            case 2:
                return new C16004b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\f\u0004\u0002\u0005\u0002\u0006\u0002\u0007\t", new Object[]{"index_", "fragmentPosition_", "fragmentType_", "aid_", "cid_", "startTime_", "report_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FragmentInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (FragmentInfo.class) {
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

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public long getCid() {
        return this.cid_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public FragmentPosition getFragmentPosition() {
        FragmentPosition forNumber = FragmentPosition.forNumber(this.fragmentPosition_);
        return forNumber == null ? FragmentPosition.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public int getFragmentPositionValue() {
        return this.fragmentPosition_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public FragmentType getFragmentType() {
        FragmentType forNumber = FragmentType.forNumber(this.fragmentType_);
        return forNumber == null ? FragmentType.UNRECOGNIZED : forNumber;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public int getFragmentTypeValue() {
        return this.fragmentType_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public int getIndex() {
        return this.index_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public Any getReport() {
        Any any = this.report_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public long getStartTime() {
        return this.startTime_;
    }

    @Override // com.bapis.bilibili.playershared.InterfaceC16107g
    public boolean hasReport() {
        return this.report_ != null;
    }

    public static C16004b newBuilder(FragmentInfo fragmentInfo) {
        return DEFAULT_INSTANCE.createBuilder(fragmentInfo);
    }

    public static FragmentInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FragmentInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FragmentInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FragmentInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FragmentInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FragmentInfo parseFrom(InputStream inputStream) throws IOException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FragmentInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FragmentInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FragmentInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FragmentInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
