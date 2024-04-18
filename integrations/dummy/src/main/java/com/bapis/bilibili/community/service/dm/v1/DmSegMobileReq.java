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
/* loaded from: classes20.dex */
public final class DmSegMobileReq extends GeneratedMessageLite<DmSegMobileReq, DmSegMobileReq.C13175b> implements MessageLiteOrBuilder {
    public static final int CONTEXT_EXT_FIELD_NUMBER = 11;
    private static final DmSegMobileReq DEFAULT_INSTANCE;
    public static final int FROM_SCENE_FIELD_NUMBER = 9;
    public static final int OID_FIELD_NUMBER = 2;
    private static volatile Parser<DmSegMobileReq> PARSER = null;
    public static final int PE_FIELD_NUMBER = 7;
    public static final int PID_FIELD_NUMBER = 1;
    public static final int PS_FIELD_NUMBER = 6;
    public static final int PULL_MODE_FIELD_NUMBER = 8;
    public static final int SEGMENT_INDEX_FIELD_NUMBER = 4;
    public static final int SPMID_FIELD_NUMBER = 10;
    public static final int TEENAGERS_MODE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int fromScene_;
    private long oid_;
    private long pe_;
    private long pid_;
    private long ps_;
    private int pullMode_;
    private long segmentIndex_;
    private int teenagersMode_;
    private int type_;
    private String spmid_ = "";
    private String contextExt_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmSegMobileReq$a */
    /* loaded from: classes20.dex */
    static /* synthetic */ class C13174a {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f21518xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21518xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21518xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21518xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21518xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21518xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21518xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21518xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.community.service.dm.v1.DmSegMobileReq$b */
    /* loaded from: classes20.dex */
    public static final class C13175b extends GeneratedMessageLite.Builder<DmSegMobileReq, C13175b> implements MessageLiteOrBuilder {
        /* synthetic */ C13175b(C13174a c13174a) {
            this();
        }

        public C13175b clearContextExt() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearContextExt();
            return this;
        }

        public C13175b clearFromScene() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearFromScene();
            return this;
        }

        public C13175b clearOid() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearOid();
            return this;
        }

        public C13175b clearPe() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearPe();
            return this;
        }

        public C13175b clearPid() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearPid();
            return this;
        }

        public C13175b clearPs() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearPs();
            return this;
        }

        public C13175b clearPullMode() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearPullMode();
            return this;
        }

        public C13175b clearSegmentIndex() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearSegmentIndex();
            return this;
        }

        public C13175b clearSpmid() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearSpmid();
            return this;
        }

        public C13175b clearTeenagersMode() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearTeenagersMode();
            return this;
        }

        public C13175b clearType() {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).clearType();
            return this;
        }

        public String getContextExt() {
            return ((DmSegMobileReq) this.instance).getContextExt();
        }

        public ByteString getContextExtBytes() {
            return ((DmSegMobileReq) this.instance).getContextExtBytes();
        }

        public int getFromScene() {
            return ((DmSegMobileReq) this.instance).getFromScene();
        }

        public long getOid() {
            return ((DmSegMobileReq) this.instance).getOid();
        }

        public long getPe() {
            return ((DmSegMobileReq) this.instance).getPe();
        }

        public long getPid() {
            return ((DmSegMobileReq) this.instance).getPid();
        }

        public long getPs() {
            return ((DmSegMobileReq) this.instance).getPs();
        }

        public int getPullMode() {
            return ((DmSegMobileReq) this.instance).getPullMode();
        }

        public long getSegmentIndex() {
            return ((DmSegMobileReq) this.instance).getSegmentIndex();
        }

        public String getSpmid() {
            return ((DmSegMobileReq) this.instance).getSpmid();
        }

        public ByteString getSpmidBytes() {
            return ((DmSegMobileReq) this.instance).getSpmidBytes();
        }

        public int getTeenagersMode() {
            return ((DmSegMobileReq) this.instance).getTeenagersMode();
        }

        public int getType() {
            return ((DmSegMobileReq) this.instance).getType();
        }

        public C13175b setContextExt(String str) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setContextExt(str);
            return this;
        }

        public C13175b setContextExtBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setContextExtBytes(byteString);
            return this;
        }

        public C13175b setFromScene(int i) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setFromScene(i);
            return this;
        }

        public C13175b setOid(long j) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setOid(j);
            return this;
        }

        public C13175b setPe(long j) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setPe(j);
            return this;
        }

        public C13175b setPid(long j) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setPid(j);
            return this;
        }

        public C13175b setPs(long j) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setPs(j);
            return this;
        }

        public C13175b setPullMode(int i) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setPullMode(i);
            return this;
        }

        public C13175b setSegmentIndex(long j) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setSegmentIndex(j);
            return this;
        }

        public C13175b setSpmid(String str) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setSpmid(str);
            return this;
        }

        public C13175b setSpmidBytes(ByteString byteString) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setSpmidBytes(byteString);
            return this;
        }

        public C13175b setTeenagersMode(int i) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setTeenagersMode(i);
            return this;
        }

        public C13175b setType(int i) {
            copyOnWrite();
            ((DmSegMobileReq) this.instance).setType(i);
            return this;
        }

        private C13175b() {
            super(DmSegMobileReq.DEFAULT_INSTANCE);
        }
    }

    static {
        DmSegMobileReq dmSegMobileReq = new DmSegMobileReq();
        DEFAULT_INSTANCE = dmSegMobileReq;
        GeneratedMessageLite.registerDefaultInstance(DmSegMobileReq.class, dmSegMobileReq);
    }

    private DmSegMobileReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContextExt() {
        this.contextExt_ = getDefaultInstance().getContextExt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromScene() {
        this.fromScene_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPe() {
        this.pe_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPs() {
        this.ps_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPullMode() {
        this.pullMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentIndex() {
        this.segmentIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpmid() {
        this.spmid_ = getDefaultInstance().getSpmid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTeenagersMode() {
        this.teenagersMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static DmSegMobileReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13175b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DmSegMobileReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DmSegMobileReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSegMobileReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DmSegMobileReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextExt(String str) {
        str.getClass();
        this.contextExt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextExtBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contextExt_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromScene(int i) {
        this.fromScene_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPe(long j) {
        this.pe_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(long j) {
        this.pid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPs(long j) {
        this.ps_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPullMode(int i) {
        this.pullMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentIndex(long j) {
        this.segmentIndex_ = j;
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
    public void setTeenagersMode(int i) {
        this.teenagersMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13174a.f21518xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new DmSegMobileReq();
            case 2:
                return new C13175b(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0004\u0004\u0002\u0005\u0004\u0006\u0002\u0007\u0002\b\u0004\t\u0004\n\u0208\u000b\u0208", new Object[]{"pid_", "oid_", "type_", "segmentIndex_", "teenagersMode_", "ps_", "pe_", "pullMode_", "fromScene_", "spmid_", "contextExt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DmSegMobileReq> parser = PARSER;
                if (parser == null) {
                    synchronized (DmSegMobileReq.class) {
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

    public String getContextExt() {
        return this.contextExt_;
    }

    public ByteString getContextExtBytes() {
        return ByteString.copyFromUtf8(this.contextExt_);
    }

    public int getFromScene() {
        return this.fromScene_;
    }

    public long getOid() {
        return this.oid_;
    }

    public long getPe() {
        return this.pe_;
    }

    public long getPid() {
        return this.pid_;
    }

    public long getPs() {
        return this.ps_;
    }

    public int getPullMode() {
        return this.pullMode_;
    }

    public long getSegmentIndex() {
        return this.segmentIndex_;
    }

    public String getSpmid() {
        return this.spmid_;
    }

    public ByteString getSpmidBytes() {
        return ByteString.copyFromUtf8(this.spmid_);
    }

    public int getTeenagersMode() {
        return this.teenagersMode_;
    }

    public int getType() {
        return this.type_;
    }

    public static C13175b newBuilder(DmSegMobileReq dmSegMobileReq) {
        return DEFAULT_INSTANCE.createBuilder(dmSegMobileReq);
    }

    public static DmSegMobileReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSegMobileReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSegMobileReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DmSegMobileReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DmSegMobileReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DmSegMobileReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DmSegMobileReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DmSegMobileReq parseFrom(InputStream inputStream) throws IOException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DmSegMobileReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DmSegMobileReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DmSegMobileReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DmSegMobileReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
