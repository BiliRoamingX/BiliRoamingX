package com.bapis.bilibili.app.card.v1;

import com.google.protobuf.AbstractMessageLite;
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
/* loaded from: classes13.dex */
public final class Args extends GeneratedMessageLite<Args, Args.C5789b> implements InterfaceC5919a {
    public static final int AID_FIELD_NUMBER = 11;
    public static final int CONVERGE_TYPE_FIELD_NUMBER = 10;
    private static final Args DEFAULT_INSTANCE;
    private static volatile Parser<Args> PARSER = null;
    public static final int RID_FIELD_NUMBER = 4;
    public static final int RNAME_FIELD_NUMBER = 5;
    public static final int STATE_FIELD_NUMBER = 9;
    public static final int TID_FIELD_NUMBER = 6;
    public static final int TNAME_FIELD_NUMBER = 7;
    public static final int TRACK_ID_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int UP_ID_FIELD_NUMBER = 2;
    public static final int UP_NAME_FIELD_NUMBER = 3;
    private long aid_;
    private int convergeType_;
    private int rid_;
    private long tid_;
    private int type_;
    private long upId_;
    private String upName_ = "";
    private String rname_ = "";
    private String tname_ = "";
    private String trackId_ = "";
    private String state_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Args$a */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C5788a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f15943xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f15943xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15943xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15943xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15943xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15943xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15943xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15943xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.card.v1.Args$b */
    /* loaded from: classes13.dex */
    public static final class C5789b extends GeneratedMessageLite.Builder<Args, C5789b> implements InterfaceC5919a {
        /* synthetic */ C5789b(C5788a c5788a) {
            this();
        }

        public C5789b clearAid() {
            copyOnWrite();
            ((Args) this.instance).clearAid();
            return this;
        }

        public C5789b clearConvergeType() {
            copyOnWrite();
            ((Args) this.instance).clearConvergeType();
            return this;
        }

        public C5789b clearRid() {
            copyOnWrite();
            ((Args) this.instance).clearRid();
            return this;
        }

        public C5789b clearRname() {
            copyOnWrite();
            ((Args) this.instance).clearRname();
            return this;
        }

        public C5789b clearState() {
            copyOnWrite();
            ((Args) this.instance).clearState();
            return this;
        }

        public C5789b clearTid() {
            copyOnWrite();
            ((Args) this.instance).clearTid();
            return this;
        }

        public C5789b clearTname() {
            copyOnWrite();
            ((Args) this.instance).clearTname();
            return this;
        }

        public C5789b clearTrackId() {
            copyOnWrite();
            ((Args) this.instance).clearTrackId();
            return this;
        }

        public C5789b clearType() {
            copyOnWrite();
            ((Args) this.instance).clearType();
            return this;
        }

        public C5789b clearUpId() {
            copyOnWrite();
            ((Args) this.instance).clearUpId();
            return this;
        }

        public C5789b clearUpName() {
            copyOnWrite();
            ((Args) this.instance).clearUpName();
            return this;
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public long getAid() {
            return ((Args) this.instance).getAid();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public int getConvergeType() {
            return ((Args) this.instance).getConvergeType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public int getRid() {
            return ((Args) this.instance).getRid();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public String getRname() {
            return ((Args) this.instance).getRname();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public ByteString getRnameBytes() {
            return ((Args) this.instance).getRnameBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public String getState() {
            return ((Args) this.instance).getState();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public ByteString getStateBytes() {
            return ((Args) this.instance).getStateBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public long getTid() {
            return ((Args) this.instance).getTid();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public String getTname() {
            return ((Args) this.instance).getTname();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public ByteString getTnameBytes() {
            return ((Args) this.instance).getTnameBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public String getTrackId() {
            return ((Args) this.instance).getTrackId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public ByteString getTrackIdBytes() {
            return ((Args) this.instance).getTrackIdBytes();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public int getType() {
            return ((Args) this.instance).getType();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public long getUpId() {
            return ((Args) this.instance).getUpId();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public String getUpName() {
            return ((Args) this.instance).getUpName();
        }

        @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
        public ByteString getUpNameBytes() {
            return ((Args) this.instance).getUpNameBytes();
        }

        public C5789b setAid(long j) {
            copyOnWrite();
            ((Args) this.instance).setAid(j);
            return this;
        }

        public C5789b setConvergeType(int i) {
            copyOnWrite();
            ((Args) this.instance).setConvergeType(i);
            return this;
        }

        public C5789b setRid(int i) {
            copyOnWrite();
            ((Args) this.instance).setRid(i);
            return this;
        }

        public C5789b setRname(String str) {
            copyOnWrite();
            ((Args) this.instance).setRname(str);
            return this;
        }

        public C5789b setRnameBytes(ByteString byteString) {
            copyOnWrite();
            ((Args) this.instance).setRnameBytes(byteString);
            return this;
        }

        public C5789b setState(String str) {
            copyOnWrite();
            ((Args) this.instance).setState(str);
            return this;
        }

        public C5789b setStateBytes(ByteString byteString) {
            copyOnWrite();
            ((Args) this.instance).setStateBytes(byteString);
            return this;
        }

        public C5789b setTid(long j) {
            copyOnWrite();
            ((Args) this.instance).setTid(j);
            return this;
        }

        public C5789b setTname(String str) {
            copyOnWrite();
            ((Args) this.instance).setTname(str);
            return this;
        }

        public C5789b setTnameBytes(ByteString byteString) {
            copyOnWrite();
            ((Args) this.instance).setTnameBytes(byteString);
            return this;
        }

        public C5789b setTrackId(String str) {
            copyOnWrite();
            ((Args) this.instance).setTrackId(str);
            return this;
        }

        public C5789b setTrackIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Args) this.instance).setTrackIdBytes(byteString);
            return this;
        }

        public C5789b setType(int i) {
            copyOnWrite();
            ((Args) this.instance).setType(i);
            return this;
        }

        public C5789b setUpId(long j) {
            copyOnWrite();
            ((Args) this.instance).setUpId(j);
            return this;
        }

        public C5789b setUpName(String str) {
            copyOnWrite();
            ((Args) this.instance).setUpName(str);
            return this;
        }

        public C5789b setUpNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Args) this.instance).setUpNameBytes(byteString);
            return this;
        }

        private C5789b() {
            super(Args.DEFAULT_INSTANCE);
        }
    }

    static {
        Args args = new Args();
        DEFAULT_INSTANCE = args;
        GeneratedMessageLite.registerDefaultInstance(Args.class, args);
    }

    private Args() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConvergeType() {
        this.convergeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRid() {
        this.rid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRname() {
        this.rname_ = getDefaultInstance().getRname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = getDefaultInstance().getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTname() {
        this.tname_ = getDefaultInstance().getTname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpId() {
        this.upId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpName() {
        this.upName_ = getDefaultInstance().getUpName();
    }

    public static Args getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5789b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Args parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Args) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Args parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Args> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(long j) {
        this.aid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConvergeType(int i) {
        this.convergeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRid(int i) {
        this.rid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRname(String str) {
        str.getClass();
        this.rname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRnameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.rname_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(String str) {
        str.getClass();
        this.state_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.state_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(long j) {
        this.tid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTname(String str) {
        str.getClass();
        this.tname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTnameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tname_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.trackId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpId(long j) {
        this.upId_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpName(String str) {
        str.getClass();
        this.upName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.upName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5788a.f15943xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new Args();
            case 2:
                return new C5789b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0208\u0004\u0004\u0005\u0208\u0006\u0002\u0007\u0208\b\u0208\t\u0208\n\u0004\u000b\u0002", new Object[]{"type_", "upId_", "upName_", "rid_", "rname_", "tid_", "tname_", "trackId_", "state_", "convergeType_", "aid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Args> parser = PARSER;
                if (parser == null) {
                    synchronized (Args.class) {
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

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public long getAid() {
        return this.aid_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public int getConvergeType() {
        return this.convergeType_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public int getRid() {
        return this.rid_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public String getRname() {
        return this.rname_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public ByteString getRnameBytes() {
        return ByteString.copyFromUtf8(this.rname_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public String getState() {
        return this.state_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public ByteString getStateBytes() {
        return ByteString.copyFromUtf8(this.state_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public long getTid() {
        return this.tid_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public String getTname() {
        return this.tname_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public ByteString getTnameBytes() {
        return ByteString.copyFromUtf8(this.tname_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public String getTrackId() {
        return this.trackId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public ByteString getTrackIdBytes() {
        return ByteString.copyFromUtf8(this.trackId_);
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public int getType() {
        return this.type_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public long getUpId() {
        return this.upId_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public String getUpName() {
        return this.upName_;
    }

    @Override // com.bapis.bilibili.app.card.v1.InterfaceC5919a
    public ByteString getUpNameBytes() {
        return ByteString.copyFromUtf8(this.upName_);
    }

    public static C5789b newBuilder(Args args) {
        return DEFAULT_INSTANCE.createBuilder(args);
    }

    public static Args parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Args) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Args parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Args parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Args parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Args parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Args parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Args parseFrom(InputStream inputStream) throws IOException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Args parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Args parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Args parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Args) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
